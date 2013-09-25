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
package de.protos.FlowOfWork.core.fow.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import de.protos.FlowOfWork.core.fow.foW.FoWPackage;
import de.protos.FlowOfWork.core.fow.foW.Port;
import de.protos.FlowOfWork.core.fow.foW.State;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class FoWScopeProvider extends AbstractDeclarativeScopeProvider {
	/**
	 * A given Port p should reference a State defined in WorkProduct p.type.states
	 * @param context
	 * @param reference
	 * @return
	 */
	public IScope scope_Port_state(Port context, EReference reference) {
		final List<IEObjectDescription> odList = new ArrayList<IEObjectDescription>();
		if(context.eIsSet(FoWPackage.eINSTANCE.getPort_Type())) {
			for(State s : context.getType().getStates()) {
				odList.add(EObjectDescription.create(s.getName(), s));
			}
		}
		IScope scope = new SimpleScope(IScope.NULLSCOPE, odList);
		return scope;
	}
}
