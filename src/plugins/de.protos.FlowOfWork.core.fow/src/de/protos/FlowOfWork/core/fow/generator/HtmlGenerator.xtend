/*******************************************************************************
 * Copyright (c) 2013 protos software gmbh (http://www.protos.de).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * CONTRIBUTORS:
 * 		Thomas Schuetz (initial contribution)
 * 
 *******************************************************************************/
package de.protos.FlowOfWork.core.fow.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import de.protos.FlowOfWork.core.fow.foW.Model
import de.protos.FlowOfWork.core.fow.foW.Activity
import com.google.inject.Singleton
import com.google.inject.Inject
import de.protos.FlowOfWork.core.fow.foW.Role
import de.protos.FlowOfWork.core.fow.foW.WorkProduct
import de.protos.FlowOfWork.core.fow.foW.Guidance
import de.protos.FlowOfWork.core.fow.foW.NamedElement
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList

import static extension de.protos.FlowOfWork.core.fow.generator.MetamodelHelpers.*

@Singleton
class HtmlGenerator {
	
	@Inject PathInfo pathInfo
	@Inject TextInfo textInfo
	
	
	def generateHTML(Model model, IFileSystemAccess fsa) {
		// generate index pages
		generateHTMLIndexPageFile(model, fsa)
		generateHTMLTypeIndexFiles(model, fsa)

		// generate element pages
		generateHTMLForAllActivities(model, fsa) 
		generateHTMLForAllRoles(model, fsa)
		generateHTMLForAllWorkProducts(model, fsa)		
		generateHTMLForAllGuidances(model, fsa)

	}

	def generateHTMLIndexPageFile(Model model, IFileSystemAccess fsa){
		fsa.generateFile(pathInfo.getHtmlGenPath()+"Index.html", generateHTMLIndexPageContent(model))
	}

	def generateHTMLIndexPageContent(Model model)'''
		<html>
			<h1>Index Pages<h1>
			<h2><a href="IndexActivities.html">All Activities</a><h2>
			<h2><a href="IndexRoles.html">All Roles</a><h2>
			<h2><a href="IndexWorkProducts.html">All WorkProducts</a><h2>
			<h2><a href="IndexWorkProductTypes.html">All WorkProductTypes</a><h2>
			<h2><a href="IndexGuidances.html">All Guidances</a><h2>
			<h2><a href="IndexGuidanceTypes.html">All GuidanceTypes</a><h2>
		</html>
	'''

	def generateHTMLTypeIndexFiles(Model model, IFileSystemAccess fsa){
		// Elements
		fsa.generateFile(pathInfo.getHtmlGenPath()+"IndexActivities.html", generateHTMLElementIndexContent(new BasicEList<NamedElement>(model.activities), "Activities"))
		fsa.generateFile(pathInfo.getHtmlGenPath()+"IndexRoles.html", generateHTMLElementIndexContent(new BasicEList<NamedElement>(model.roles), "Roles"))
		fsa.generateFile(pathInfo.getHtmlGenPath()+"IndexWorkProducts.html", generateHTMLElementIndexContent(new BasicEList<NamedElement>(model.workProducts), "WorkProducts"))
		fsa.generateFile(pathInfo.getHtmlGenPath()+"IndexGuidances.html", generateHTMLElementIndexContent(new BasicEList<NamedElement>(model.guidances), "Guidances"))

		// Element Types
		fsa.generateFile(pathInfo.getHtmlGenPath()+"IndexWorkProductTypes.html", generateHTMLElementTypeList(new BasicEList<NamedElement>(model.workProductTypes), "WorkProductTypes"))
		fsa.generateFile(pathInfo.getHtmlGenPath()+"IndexGuidanceTypes.html", generateHTMLElementTypeList(new BasicEList<NamedElement>(model.guidanceTypes), "GuidanceTypes"))
	}

	def generateHTMLElementIndexContent(EList<NamedElement> elements, String elementType){
		var sortedElements = elements.sortBy(e | e.name)
	'''
		<html>
		<h1>Index «elementType»<h1>
		<ul>
			«FOR element : sortedElements»
			<li>«generateHTML_HRef(element)»</li>
			«ENDFOR»
		<ul>
		<html>
	'''
	}

	def generateHTMLElementTypeList(EList<NamedElement> elements, String elementType){
		var sortedElements = elements.sortBy(e | e.name)
	'''
		<html>
		<h1>Index «elementType»<h1>
		<table border="1">
			<thead>
				<tr>
					<th>Name</th>
					<th>Summary</th>
					<th>Description</th>
				</tr>
			</thead>
			«FOR element : sortedElements»
				<tbody>
					<tr>
						<td>«textInfo.getLabel(element)»</td>
						<td>«element.textfield.summary»</td>
						<td>«element.textfield.description» </td>
					</tr>
				</tbody>
			«ENDFOR»
		</table>
		<html>
	'''
	}


	def private generateHTMLForAllActivities(Model model, IFileSystemAccess fsa) {
		for (activity : model.activities){
			fsa.generateFile(pathInfo.getHtmlGenPath(activity), generateHTMLForOneActivity(activity))
		}
	}
	
	 
	def private generateHTMLForOneActivity(Activity activity) '''
		<html>
			<h1>Activity: «textInfo.getLabel(activity)»</h1> 
			
			<table border="1" width="100%">
				<colgroup>
					<col width="17%">
					<col width="33%">
					<col width="17%">
					<col width="33%">
				</colgroup>
			  	<tr>
					<td colspan="1">
						<b>Purpose:</b>
					</td>
					<td colspan="3">
						«activity.textfield.summary»
					</td>
				</tr>
			  	<tr>
					<td colspan="1">
						<b>Inputs:</b>
					</td>
					<td colspan="1">
						«IF activity.inPorts.size() > 0»
							<ul>
							«FOR inPort : activity.inPorts»
								<li>«generateHTML_HRef(inPort.type)»</li>
							«ENDFOR»
							</ul>
						«ELSE»
							<em>no inputs</em>
						«ENDIF»
					</td>
					<td colspan="1">
						<b>Outputs:</b>
					</td>
					<td colspan="1">
						«IF activity.outPorts.size() > 0»
							<ul>
							«FOR outPort : activity.outPorts»
								<li>«generateHTML_HRef(outPort.type)»</a> </li>
							«ENDFOR»
							</ul>
						«ELSE»
							<em>no outputs</em>
						«ENDIF»
					</td>
				</tr>
			  	<tr>
					<td colspan="1">
						<b>Responsible:</b>
					</td>
					<td colspan="3">
						«generateHTML_HRef(activity.role)»
					</td>
				</tr>
			  	<tr>
					<td colspan="1">
						<b>Description:</b>
					</td>
					<td colspan="3">
						«activity.textfield.description»
					</td>
				</tr>
			</table>

		<h2>Activities and Responsibilities (Sub Activities)</h2>
		«IF activity.subActivities.emptyList»
			<p><em>no sub activities</em></p>
		«ELSE»
			<table border="1" width="100%">
			  	<tr>
					<td>
						<b>Activity</b>
					</td>
					<td>
						<b>Role</b>
					</td>
				</tr>
				«FOR subActivity : activity.subActivities»
					<tr>
						<td>
							«generateHTML_HRef(subActivity.type)»
						</td>
						<td>
							«generateHTML_HRef(subActivity.type.role)»
						</td>
					</tr>
				«ENDFOR»
			</table>
		«ENDIF»
		
		<h2>Structure Diagram</h2>
		<img src="../dot/«activity.name».jpg" alt="Activity Diagram: «activity.name»">
		 
		<h2>Behavior Diagram</h2>
		«IF activity.hasBehavior»		
			<img src="../dot/«activity.name»_Behavior.jpg" alt="Behavior Diagram: «activity.name»_Behavior"> 
		«ELSE»
			<p><em>no behavior</em></p>
		«ENDIF»

		<h2>Guidances</h2>
		«IF activity.guidances.emptyList»
			<p><em>no guidances</em></p>
		«ELSE»
			«generateHTMLForGuidanceList(activity.guidances)»
		«ENDIF»

		
		</html>
	'''
	
	def private generateHTMLForAllRoles(Model model, IFileSystemAccess fsa) {
		for (role : model.roles){
			fsa.generateFile(pathInfo.getHtmlGenPath(role), generateHTMLForOneRole(role))
		}
	}
	
	def private generateHTML_HRef(NamedElement element) '''
		<a href="«element.name».html">«textInfo.getLabel(element)»</a>
	'''
	 
	def private generateHTMLForOneRole(Role role) '''
		<html>
			<h1>Role: «textInfo.getLabel(role)»</h1>
			<h2>Summary</h2>
			«role.textfield.summary»
			<h2>Description</h2>
			«role.textfield.description»
		</html>
	'''

	def private generateHTMLForAllWorkProducts(Model model, IFileSystemAccess fsa) {
		for (workProduct : model.workProducts){
			fsa.generateFile(pathInfo.getHtmlGenPath(workProduct), generateHTMLForOneWorkProduct(workProduct))
		}
	}
	 
	def private generateHTMLForOneWorkProduct(WorkProduct workProduct) '''
		<html>
			<h1>WorkProduct: «textInfo.getLabel(workProduct)»</h1>
			<h2>WorkProductType</h2>
			«workProduct.type.name»
			<h2>Summary</h2>
			«workProduct.textfield.summary»
			<h2>Description</h2>
			«workProduct.textfield.description»
		</html>
	'''

	def private generateHTMLForAllGuidances(Model model, IFileSystemAccess fsa) {
		for (guidance : model.guidances){
			fsa.generateFile(pathInfo.getHtmlGenPath(guidance), generateHTMLForOneGuidance(guidance))
		}
	}
	 
	def private generateHTMLForOneGuidance(Guidance guidance) '''
		<html>
			<h1>Guidance: «textInfo.getLabel(guidance)»</h1>
			<h2>GuidanceType</h2>
			«guidance.type.name»
			<h2>Summary</h2>
			«guidance.textfield.summary»
			<h2>Description</h2>
			«guidance.textfield.description»
		</html>
	'''

	def private generateHTMLForGuidanceList(EList<Guidance> guidances) '''
		<table border="1" width="100%">
			<colgroup>
				<col width="50%">
				<col width="50%">
			</colgroup>
		  	<tr>
				<th>
					Guidance
				</th>
				<th>
					Guidance Type
				</th>
			</tr>
			«FOR guidance : guidances»
				<tr>
					<td>
						«generateHTML_HRef(guidance)»
					</td>
					<td>
						«guidance.type.name»
					</td>
				</tr>
			«ENDFOR»
		</table>
	'''
}
