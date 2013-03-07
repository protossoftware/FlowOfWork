/*
 * generated by Xtext
 */
package de.protos.FlowOfWork.core.fow.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import de.protos.FlowOfWork.core.fow.foW.Model
import de.protos.FlowOfWork.core.fow.foW.Activity

class FoWGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		generateHTMLDoc(resource.contents.head as Model, fsa)
	}


	def generateHTMLDoc(Model model, IFileSystemAccess fsa) {
		generateHTMLDocAllActivities(model, fsa) 
	}

	def generateHTMLDocAllActivities(Model model, IFileSystemAccess fsa) {
		for (activity : model.activities){
			fsa.generateFile("../doc-gen/html/"+activity.name+".html", generateHTMLDocOneActivity(activity))
		}
	}
	
	 
	def generateHTMLDocOneActivity(Activity activity) '''
		<html>
			<h1>Activity: �activity.name�</h1>
			
			<table border="1" width="100%">
				<colgroup>
					<col width="1*">
					<col width="2*">
					<col width="1*">
					<col width="2*">
				</colgroup>
			  	<tr>
					<td >
						<b>Purpose:</b>
					</td>
					<td colspan="5">
						<em>Where does the purpose come from?</em>
					</td>
				</tr>
			  	<tr>
					<td>
						<b>Scope:</b>
					</td>
					<td colspan="5">
						<em>Where does the scope come from?</em>
					</td>
				</tr>
			  	<tr>
					<td>
						<b>Inputs:</b>
					</td>
					<td>
						<ul>
						�FOR inPort : activity.inPorts�
							<li>�inPort.name� : �inPort.type.name� </li>
						�ENDFOR�
						</ul>
					</td>
					<td>
						<b>Outputs:</b>
					</td>
					<td>
						<ul>
						�FOR outPort : activity.outPorts�
							<li>�outPort.name� : �outPort.type.name� </li>
						�ENDFOR�
						</ul>
					</td>
				</tr>
			</table>
		</html>
	'''
	


}