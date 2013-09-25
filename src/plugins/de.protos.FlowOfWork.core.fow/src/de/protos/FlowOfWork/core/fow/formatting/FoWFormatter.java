/*******************************************************************************
 * Copyright (c) 2013 protos software gmbh (http://www.protos.de).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * generated by Xtext
 * 
 *******************************************************************************/
package de.protos.FlowOfWork.core.fow.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class FoWFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		de.protos.FlowOfWork.core.fow.services.FoWGrammarAccess grammarAccess = (de.protos.FlowOfWork.core.fow.services.FoWGrammarAccess) getGrammarAccess();

		// It's usually a good idea to activate the following three statements.
		// They will add and preserve newlines around comments
		c.setLinewrap(0, 1, 2).before(grammarAccess.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(grammarAccess.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(grammarAccess.getML_COMMENTRule());

		c.setAutoLinewrap(120);
		
		for (Keyword k: grammarAccess.findKeywords(";")) {
			c.setIndentationDecrement().before(k);
			c.setLinewrap().before(k);
		}

		for (Pair<Keyword, Keyword> pair : grammarAccess.findKeywordPairs("{", "}")) {
			c.setLinewrap().after(pair.getFirst());
			c.setIndentationIncrement().after(pair.getFirst());
			c.setLinewrap().before(pair.getSecond());
			c.setIndentationDecrement().before(pair.getSecond());
			c.setSpace(" ").between(pair.getFirst(), pair.getSecond());
		}		

		for (Keyword k: grammarAccess.findKeywords("GuidanceType", "Guidance", "WorkProduct", "WorkProductType", "Activity", "Role")) {
			c.setIndentationIncrement().after(k);
		}

		for (Keyword k: grammarAccess.findKeywords("label", "summary", "description", "responsible", "subActivities", "outputs", "inputs", "guidances", "Step", "Transition", "Decision", "Behavior")) {
			c.setLinewrap().before(k);
		}

		c.setLinewrap(2).around(grammarAccess.getGuidanceTypeRule());
		c.setLinewrap(2).around(grammarAccess.getGuidanceRule());
		c.setLinewrap(2).around(grammarAccess.getWorkProductRule());
		c.setLinewrap(2).around(grammarAccess.getWorkProductTypeRule());
		c.setLinewrap(2).around(grammarAccess.getActivityRule());
		c.setLinewrap(2).around(grammarAccess.getRoleRule());
		c.setLinewrap(2).around(grammarAccess.getStateRule());


	}
}
