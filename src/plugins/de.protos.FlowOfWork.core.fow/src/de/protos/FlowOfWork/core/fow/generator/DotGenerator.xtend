package de.protos.FlowOfWork.core.fow.generator

import de.protos.FlowOfWork.core.fow.foW.Model
import org.eclipse.xtext.generator.IFileSystemAccess
import de.protos.FlowOfWork.core.fow.foW.Activity
import com.google.inject.Singleton
import com.google.inject.Inject

@Singleton
class DotGenerator {

	@Inject PathInfo pathInfo

	def generateDot(Model model, IFileSystemAccess fsa) {
		generateActivityDiagramForAllActivities(model, fsa)
	}
	
	def private generateActivityDiagramForAllActivities(Model model, IFileSystemAccess fsa) {
		for (activity : model.activities){
			fsa.generateFile(pathInfo.getDotGenPath(activity), generateDeepActivityDiagramForOneActivity(activity))
		}
		
		generateDotMakefile(fsa)
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