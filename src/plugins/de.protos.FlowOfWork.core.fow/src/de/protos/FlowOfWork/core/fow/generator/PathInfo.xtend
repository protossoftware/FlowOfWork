package de.protos.FlowOfWork.core.fow.generator

import com.google.inject.Singleton
import de.protos.FlowOfWork.core.fow.foW.Activity
import de.protos.FlowOfWork.core.fow.foW.Role
import de.protos.FlowOfWork.core.fow.foW.WorkProduct
import de.protos.FlowOfWork.core.fow.foW.Guidance
import de.protos.FlowOfWork.core.fow.foW.NamedElement

@Singleton
class PathInfo {
	def getDocGenPath() {
		return "../doc-gen/"
	}
	
	
	// HTML Paths
	def getHtmlGenPath() {
		return getDocGenPath + "html/"
	}
	
	def getHtmlGenPath(NamedElement element){
		return getHtmlGenPath + element.name + ".html" 
	}
	
//	def getHtmlGenPath(Activity activity){
//		return getHtmlGenPath + activity.name 
//	}
//	def getHtmlGenPath(Role role){
//		return getHtmlGenPath + role.name 
//	}
//	
//	def getHtmlGenPath(WorkProduct workProduct){
//		return getHtmlGenPath + workProduct.name 
//	}
//
//	def getHtmlGenPath(Guidance guidance){
//		return getHtmlGenPath + guidance.name 
//	}
	
	// Dot Paths
	def getDotGenPath() {
		return getDocGenPath + "dot/"
	}
	
	def getDotGenPath(Activity activity) {
		return getDotGenPath + activity.name + ".dot" 
	}
	
}