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

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import de.protos.FlowOfWork.core.fow.foW.Model
import com.google.inject.Inject

class FoWGenerator implements IGenerator {

	@Inject DotGenerator dotGenerator
	@Inject HtmlGenerator htmlGenerator
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		htmlGenerator.generateHTML(resource.contents.head as Model, fsa)
		dotGenerator.generateDot(resource.contents.head as Model, fsa)
	}


}
