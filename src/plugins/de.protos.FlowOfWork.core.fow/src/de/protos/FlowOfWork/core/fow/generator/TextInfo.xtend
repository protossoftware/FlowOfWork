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

import de.protos.FlowOfWork.core.fow.foW.NamedElement
import com.google.inject.Singleton

@Singleton
class TextInfo{
	def getLabel(NamedElement element){
		if (element.textfield.label==null){
			return element.name
		}
		else {
			return element.textfield.label
		}
	}
	
}