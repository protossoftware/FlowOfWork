package de.protos.FlowOfWork.core.fow.generator

import com.google.inject.Inject
import com.google.inject.Singleton
import de.protos.FlowOfWork.core.fow.foW.Activity
import de.protos.FlowOfWork.core.fow.foW.ActivityRef
import de.protos.FlowOfWork.core.fow.foW.Decision
import de.protos.FlowOfWork.core.fow.foW.DecisionTransition
import de.protos.FlowOfWork.core.fow.foW.FinalTransition
import de.protos.FlowOfWork.core.fow.foW.InitialTransition
import de.protos.FlowOfWork.core.fow.foW.Model
import de.protos.FlowOfWork.core.fow.foW.NonInitialTransition
import de.protos.FlowOfWork.core.fow.foW.Port
import de.protos.FlowOfWork.core.fow.foW.State
import de.protos.FlowOfWork.core.fow.foW.Step
import de.protos.FlowOfWork.core.fow.foW.Transition
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.generator.IFileSystemAccess
import de.protos.FlowOfWork.core.fow.foW.WorkProduct

class WorkProductState {
	public var WorkProduct prod
	public var State state
	
	new(WorkProduct prod, State state) {
		this.prod = prod
		this.state = state
	}
	override equals(Object o) {
		if(!(o instanceof WorkProductState)) {
			return false;
		}
		val wps = o as WorkProductState
		return ( 
			prod.equals(wps.prod) && 
			(state == wps.state || state.equals(wps.state))
		);
	}
	override hashCode() {
		var stateName = '';
		var prodName = '';
		var typeName = '';
		if(state!= null) stateName = state.name
		if(prod!= null) {
			typeName = prod.name
			if(prod.type!=null) typeName = prod.type.name
		}
		return ('wp:'+prodName+':wpt:'+typeName+':s:'+stateName).hashCode
	}
}

@Singleton
class DotGenerator {

	@Inject PathInfo pathInfo

	def generateDot(Model model, IFileSystemAccess fsa) {
		generateActivityDiagramsForAllActivities(model, fsa)
		generateAntBuildfile(fsa)
	}
	
	def private generateActivityDiagramsForAllActivities(Model model, IFileSystemAccess fsa) {
		for (activity : model.activities){
			fsa.generateFile(pathInfo.getDotGenPath(activity), generateActivityDiagramForOneActivity(activity))
			if (activity.hasBehavior)
				fsa.generateFile(pathInfo.getDotActivityBehaviorPath(activity), generateActivityBehavior(activity))
		}
	}
	
	def private generateActivityDiagramForOneActivity(Activity activity) '''
		digraph «activity.name»{
			rankdir=TD;
			«generateActivityDiagram(activity)»
		}
	'''
	def getLabel(ActivityRef ar) {
		return ar.type.name
	}
	
	def getLabel(Port p) {
		val wps = new WorkProductState(p.type, p.state)
		val idString = wps.label
		return idString
	}
	
	def getLabel(WorkProductState wps) {
		var stateString = ''
		if(wps.state != null) {
			stateString = '(' + wps.state.name + ')'
		}
		return '"' + wps.prod.type.name + '::' + wps.prod.name + stateString + '"'
	}
	
	def private generateActivityDiagram(Activity activity) {
		// 0. map by WorkProductType+State (out/insub/outsub)
		val Map<WorkProductState, Port> inPortMappings = new HashMap<WorkProductState, Port>
		val Map<WorkProductState, Port> outPortMappings = new HashMap<WorkProductState, Port>
		val inputSubMappings = new HashMap<WorkProductState, List<ActivityRef>>
		val outputSubMappings = new HashMap<WorkProductState, List<ActivityRef>>
		activity.inPorts.forEach[p|
			inPortMappings.put(new WorkProductState(p.type, p.state), p)
		]
		activity.outPorts.forEach[p|
			outPortMappings.put(new WorkProductState(p.type, p.state), p)
		]
		activity.subActivities.forEach[a|
			a.type.inPorts.forEach[p|
				val id = new WorkProductState(p.type, p.state)
				if(inputSubMappings.containsKey(id)) {
					inputSubMappings.get(id).add(a)
				}
				else {
					inputSubMappings.put(id, new ArrayList() => [add(a)])
				}
			]
			a.type.outPorts.forEach[p|
				val id = new WorkProductState(p.type, p.state)
				if(outputSubMappings.containsKey(id)) {
					outputSubMappings.get(id).add(a)
				}
				else {
					outputSubMappings.put(id, new ArrayList() => [add(a)])
				}
			]
		]
		'''
		««« 1. iterate over all ports and create external nodes
		subgraph cluster_inputs_«activity.name» {
			color=none
			«FOR p : activity.inPorts»
				«p.label» [shape=rectangle,color=skyblue2,style=filled,forcelabels=true]
			«ENDFOR»
		}
		subgraph cluster_outputs_«activity.name» {
			color=none
			«FOR p : activity.outPorts»
				«p.label» [shape=rectangle,color=skyblue2,style=filled,forcelabels=true]
			«ENDFOR»
		}
		
		«««	2. iterate over subactivities and create subgraph/nodes/edges
		«IF activity.subActivities.isEmpty»
			«activity.name» [shape=pentagon,color=sandybrown,style=filled, orientation=-90]
		«ELSE»
			subgraph cluster_subactivities_«activity.name» {
				label = "«activity.name»"
				color=black
				«FOR subactivity : activity.subActivities»
					«subactivity.label» [shape=pentagon,color=sandybrown,style=filled,orientation=-90]
				«ENDFOR»
				«generateSubActivityEdges(inPortMappings, outPortMappings, inputSubMappings, outputSubMappings)»
			}
		«ENDIF»
		
		«««	3. iterate over inPorts and create edges for all ports
		«FOR p : activity.inPorts»
			«val id = new WorkProductState(p.type, p.state)»
			«IF activity.subActivities.isEmpty»
				«id.label» -> «activity.name»
			«ELSE»
				«val subActRefs = inputSubMappings.get(id)?:emptyList»
				«FOR ar : subActRefs»
					«id.label» -> «ar.label»
				«ENDFOR»
			«ENDIF»
		«ENDFOR»
		
		«««	4. iterate over outputMappings and create edges for all ports
		«FOR p : activity.outPorts»
			«val id = new WorkProductState(p.type, p.state)»
			«IF activity.subActivities.isEmpty»
				«activity.name» -> «id.label» 
			«ELSE»
				«val subActRefs = outputSubMappings.get(id)?:emptyList»
				«FOR ar : subActRefs»
					«ar.label» -> «id.label»
				«ENDFOR»
			«ENDIF»
		«ENDFOR»
		'''
	}
	
	def private generateSubActivityEdges(
					Map<WorkProductState, Port> inPortMappings,
					Map<WorkProductState, Port> outPortMappings,
					Map<WorkProductState, List<ActivityRef>> inputSubMappings, 
					Map<WorkProductState, List<ActivityRef>> outputSubMappings) '''
		«FOR id : inputSubMappings.keySet»
			«IF !inPortMappings.containsKey(id) && !outputSubMappings.containsKey(id)»
				«val inActRefs = inputSubMappings.get(id)»
				«id.label» [shape=rectangle,color=skyblue2,style=filled,forcelabels=true]
				«FOR tgt : inActRefs»
					«id.label» -> «tgt.label»
				«ENDFOR»
			«ENDIF»
		«ENDFOR»
		«FOR id : outputSubMappings.keySet»
			«val outActRefs = outputSubMappings.get(id)»
			«val inActRefs = inputSubMappings.get(id)?:emptyList»
			«IF !outPortMappings.containsKey(id)»
				«id.label» [shape=rectangle,color=skyblue2,style=filled,forcelabels=true]
				«FOR src : outActRefs»
					«src.label» -> «id.label»
				«ENDFOR»
			«ENDIF»
			«FOR tgt: inActRefs»
				«id.label» -> «tgt.label»
			«ENDFOR»
		«ENDFOR»
	'''


	def private generateActivityBehavior(Activity activity) '''
		digraph «activity.name»_Behavior{
			rankdir=TD;
			«generateAllSteps(activity.steps)»
			«generateAllDecisions(activity.decisions)»
			«generateAllTransitions(activity.transitions)»
		}	
	'''
	def hasBehavior(Activity activity){
		return emptyList(activity.steps)
	}
	
	def emptyList(EList<?> list){
		if (list == null)
			return false
		else if (list.empty)
			return false
		else
			return true
	}
	
	def private generateAllSteps(EList<Step> steps)'''
		«FOR step : steps»
			«step.name» [shape=ellipse«IF !step.label.nullOrEmpty» label="«step.label»"«ENDIF»]
		«ENDFOR»
	'''
	
	def private generateAllDecisions(EList<Decision> decisions)'''
		«FOR decision : decisions»
			«decision.name» [shape=diamond]
		«ENDFOR»
	'''
	
	// Transitions
	def private generateAllTransitions(EList<Transition> transitions)'''
		«FOR transition : transitions»
			«generateTransition(transition)»
		«ENDFOR»
	'''
	
	def private dispatch generateTransition(InitialTransition transition)'''
		i [shape = circle, color=black, style=filled] 
		i -> «transition.to.name»
	'''
	def private dispatch generateTransition(FinalTransition transition)'''
		f [shape = doublecircle, color=black, style=filled] 
		«transition.from.name» -> f
	'''
	def private dispatch generateTransition(NonInitialTransition transition)'''
		«transition.from.name» -> «transition.to.name»
	'''
	def private dispatch generateTransition(DecisionTransition transition)'''
		«transition.from.name» -> «transition.to.name» [label="[«transition.guard»]"]
	'''

	// ant buildfile generator for dot	
	def private generateDotBuildfileContent() '''
		<?xml version="1.0" encoding="UTF-8"?>
		<!-- ====================================================================== 
		     Generates bitmap images from DOT files for process documentation
		     ====================================================================== -->
		<project name="builddotfiles" default="build">
			<description>
		    	Generates bitmap images from DOT files for process documentation
		    </description>
		
			<target name="build" description="description" depends="init-dot.binpath">
				<apply executable="${dot.binpath}" dest="./">
					<arg value="-Tjpg" />
					<srcfile />
					<arg value="-o" />
					<targetfile />
					<fileset dir="./" includes="*.dot" />
					<mapper type="glob" from="*.dot" to="*.jpg" />
				</apply>
			</target>
		
			<target name="init-dot.binpath" unless="dot.binpath">
				<property environment="env" />
				<condition property="dot.binpath" value="${env.DOT_PATH}/dot" else="dot">
					<isset property="env.DOT_PATH" />
				</condition>
			</target>
		
		</project>
	'''

	def private generateAntBuildfile(IFileSystemAccess fsa) {
		fsa.generateFile("../doc-gen/dot/build.xml", generateDotBuildfileContent())
	}
	
}
