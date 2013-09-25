/*******************************************************************************
 * Copyright (c) 2013 protos software gmbh (http://www.protos.de).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * CONTRIBUTORS:
 * 		Eyrak Paen (initial contribution)
 * 
 *******************************************************************************/
package de.protos.FlowOfWork.core.fow.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;

/**
 * Use this class to register components to be used within the IDE.
 */
public class FoWUiModule extends de.protos.FlowOfWork.core.fow.ui.AbstractFoWUiModule {
	public FoWUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	/**
	 * Bind XtextBuilderParticipant that runs the Ant buildfile for creating images from the DOT files
	 */
	@Override
	public Class<? extends IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
		return de.protos.FlowOfWork.core.fow.ui.builder.FoWAntBuilderParticipant.class;
	}
}
