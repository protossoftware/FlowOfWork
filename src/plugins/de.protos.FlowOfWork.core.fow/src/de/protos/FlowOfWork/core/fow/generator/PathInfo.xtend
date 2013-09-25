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

import com.google.inject.Singleton
import de.protos.FlowOfWork.core.fow.foW.Activity
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

	def getJpgGenPath(Activity activity) {
		return getDotGenPath + activity.name + ".jpg" 
	}
	
	def getDotActivityBehaviorPath(Activity activity) {
		return getDotGenPath + activity.name + "_Behavior.dot" 
	}
	def getJpgActivityBehaviorPath(Activity activity) {
		return getDotGenPath + activity.name + "_Behavior.jpg" 
	}
	
}