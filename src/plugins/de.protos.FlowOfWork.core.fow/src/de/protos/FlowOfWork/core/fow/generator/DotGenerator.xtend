package de.protos.FlowOfWork.core.fow.generator

import de.protos.FlowOfWork.core.fow.foW.Model
import org.eclipse.xtext.generator.IFileSystemAccess
import de.protos.FlowOfWork.core.fow.foW.Activity
import com.google.inject.Singleton
import com.google.inject.Inject
import de.protos.FlowOfWork.core.fow.foW.Transition
import de.protos.FlowOfWork.core.fow.foW.InitialTransition
import de.protos.FlowOfWork.core.fow.foW.FinalTransition
import de.protos.FlowOfWork.core.fow.foW.NonInitialTransition
import de.protos.FlowOfWork.core.fow.foW.Step

import org.eclipse.emf.common.util.EList
import de.protos.FlowOfWork.core.fow.foW.Decision
import de.protos.FlowOfWork.core.fow.foW.DecisionTransition

@Singleton
class DotGenerator {

	@Inject PathInfo pathInfo

	def generateDot(Model model, IFileSystemAccess fsa) {
		generateActivityDiagramsForAllActivities(model, fsa)
		generateDotMakefile(fsa)
	}
	
	def private generateActivityDiagramsForAllActivities(Model model, IFileSystemAccess fsa) {
		for (activity : model.activities){
			fsa.generateFile(pathInfo.getDotGenPath(activity), generateDeepActivityDiagramForOneActivity(activity))
			if (activity.hasBehavior)
				fsa.generateFile(pathInfo.getDotActivityBehaviorPath(activity), generateActivityBehavior(activity))
		}
	}

	def private generateDeepActivityDiagramForOneActivity(Activity activity) '''
		digraph «activity.name»{
			rankdir=TD;
			«generateRecursiveActivityDiagram(activity)»
		}
	'''

	def private generateRecursiveActivityDiagram(Activity activity) {
		if (activity.subActivities.empty){
			return '''
			«activity.name» [shape=pentagon,color=orange,style=filled, orientation=-90]
			'''						
		}
		else {
			return '''
				subgraph cluster_«activity.name» {
					label = "«activity.name»"
					color=black
					«FOR subactivity : activity.subActivities»
						«generateRecursiveActivityDiagram(subactivity.type)»
					«ENDFOR»
				}
			'''			
		}
	}


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
	def emptyList(EList list){
		if (list == null)
			return false
		else if (list.empty)
			return false
		else
			return true
	}
	
	def private generateAllSteps(EList<Step> steps)'''
		«FOR step : steps»
			«step.name» [shape=ellipse]
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

	// makefile generator for dot
	def private generateDotMakefile(IFileSystemAccess fsa) {
		fsa.generateFile("../doc-gen/dot/Makefile", generateDotMakefileContent())
	}	
	def private generateDotMakefileContent() '''
		DOTFILELIST = $(wildcard *.dot)
		JPGFILELIST = $(patsubst %.dot, %.jpg, $(DOTFILELIST))
		
		# make jpg out of dot files
		%.jpg: %.dot 
			dot -Tjpg $*.dot -o $*.jpg
«««			$DOT_HOME/dot $*.dot
		
		dot2jpg: $(JPGFILELIST)
	'''

	
	
}