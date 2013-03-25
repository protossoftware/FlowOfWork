/*
* generated by Xtext
*/
package de.protos.FlowOfWork.core.fow.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.protos.FlowOfWork.core.fow.services.FoWGrammarAccess;

public class FoWParser extends AbstractContentAssistParser {
	
	@Inject
	private FoWGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.protos.FlowOfWork.core.fow.ui.contentassist.antlr.internal.InternalFoWParser createParser() {
		de.protos.FlowOfWork.core.fow.ui.contentassist.antlr.internal.InternalFoWParser result = new de.protos.FlowOfWork.core.fow.ui.contentassist.antlr.internal.InternalFoWParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
					put(grammarAccess.getNamedElementAccess().getAlternatives(), "rule__NamedElement__Alternatives");
					put(grammarAccess.getActivityAccess().getAlternatives_9_2(), "rule__Activity__Alternatives_9_2");
					put(grammarAccess.getNodeAccess().getAlternatives(), "rule__Node__Alternatives");
					put(grammarAccess.getTransitionAccess().getAlternatives(), "rule__Transition__Alternatives");
					put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
					put(grammarAccess.getWorkProductTypeAccess().getGroup(), "rule__WorkProductType__Group__0");
					put(grammarAccess.getWorkProductAccess().getGroup(), "rule__WorkProduct__Group__0");
					put(grammarAccess.getGuidanceTypeAccess().getGroup(), "rule__GuidanceType__Group__0");
					put(grammarAccess.getGuidanceAccess().getGroup(), "rule__Guidance__Group__0");
					put(grammarAccess.getPortAccess().getGroup(), "rule__Port__Group__0");
					put(grammarAccess.getActivityAccess().getGroup(), "rule__Activity__Group__0");
					put(grammarAccess.getActivityAccess().getGroup_5(), "rule__Activity__Group_5__0");
					put(grammarAccess.getActivityAccess().getGroup_5_2(), "rule__Activity__Group_5_2__0");
					put(grammarAccess.getActivityAccess().getGroup_6(), "rule__Activity__Group_6__0");
					put(grammarAccess.getActivityAccess().getGroup_6_2(), "rule__Activity__Group_6_2__0");
					put(grammarAccess.getActivityAccess().getGroup_7(), "rule__Activity__Group_7__0");
					put(grammarAccess.getActivityAccess().getGroup_7_2(), "rule__Activity__Group_7_2__0");
					put(grammarAccess.getActivityAccess().getGroup_8(), "rule__Activity__Group_8__0");
					put(grammarAccess.getActivityAccess().getGroup_8_2(), "rule__Activity__Group_8_2__0");
					put(grammarAccess.getActivityAccess().getGroup_9(), "rule__Activity__Group_9__0");
					put(grammarAccess.getActivityRefAccess().getGroup(), "rule__ActivityRef__Group__0");
					put(grammarAccess.getDecisionAccess().getGroup(), "rule__Decision__Group__0");
					put(grammarAccess.getStepAccess().getGroup(), "rule__Step__Group__0");
					put(grammarAccess.getInitialTransitionAccess().getGroup(), "rule__InitialTransition__Group__0");
					put(grammarAccess.getFinalTransitionAccess().getGroup(), "rule__FinalTransition__Group__0");
					put(grammarAccess.getNonInitialTransitionAccess().getGroup(), "rule__NonInitialTransition__Group__0");
					put(grammarAccess.getTextfieldAccess().getGroup(), "rule__Textfield__Group__0");
					put(grammarAccess.getTextfieldAccess().getGroup_0(), "rule__Textfield__Group_0__0");
					put(grammarAccess.getTextfieldAccess().getGroup_3(), "rule__Textfield__Group_3__0");
					put(grammarAccess.getModelAccess().getActivitiesAssignment_0(), "rule__Model__ActivitiesAssignment_0");
					put(grammarAccess.getModelAccess().getRolesAssignment_1(), "rule__Model__RolesAssignment_1");
					put(grammarAccess.getModelAccess().getWorkProductsAssignment_2(), "rule__Model__WorkProductsAssignment_2");
					put(grammarAccess.getModelAccess().getWorkProductTypesAssignment_3(), "rule__Model__WorkProductTypesAssignment_3");
					put(grammarAccess.getModelAccess().getGuidancesAssignment_4(), "rule__Model__GuidancesAssignment_4");
					put(grammarAccess.getModelAccess().getGuidanceTypesAssignment_5(), "rule__Model__GuidanceTypesAssignment_5");
					put(grammarAccess.getRoleAccess().getNameAssignment_1(), "rule__Role__NameAssignment_1");
					put(grammarAccess.getRoleAccess().getTextfieldAssignment_2(), "rule__Role__TextfieldAssignment_2");
					put(grammarAccess.getWorkProductTypeAccess().getNameAssignment_1(), "rule__WorkProductType__NameAssignment_1");
					put(grammarAccess.getWorkProductTypeAccess().getTextfieldAssignment_2(), "rule__WorkProductType__TextfieldAssignment_2");
					put(grammarAccess.getWorkProductAccess().getNameAssignment_1(), "rule__WorkProduct__NameAssignment_1");
					put(grammarAccess.getWorkProductAccess().getTypeAssignment_3(), "rule__WorkProduct__TypeAssignment_3");
					put(grammarAccess.getWorkProductAccess().getTextfieldAssignment_4(), "rule__WorkProduct__TextfieldAssignment_4");
					put(grammarAccess.getGuidanceTypeAccess().getNameAssignment_1(), "rule__GuidanceType__NameAssignment_1");
					put(grammarAccess.getGuidanceTypeAccess().getTextfieldAssignment_2(), "rule__GuidanceType__TextfieldAssignment_2");
					put(grammarAccess.getGuidanceAccess().getNameAssignment_1(), "rule__Guidance__NameAssignment_1");
					put(grammarAccess.getGuidanceAccess().getTypeAssignment_3(), "rule__Guidance__TypeAssignment_3");
					put(grammarAccess.getGuidanceAccess().getTextfieldAssignment_4(), "rule__Guidance__TextfieldAssignment_4");
					put(grammarAccess.getPortAccess().getNameAssignment_0(), "rule__Port__NameAssignment_0");
					put(grammarAccess.getPortAccess().getTypeAssignment_2(), "rule__Port__TypeAssignment_2");
					put(grammarAccess.getActivityAccess().getNameAssignment_1(), "rule__Activity__NameAssignment_1");
					put(grammarAccess.getActivityAccess().getTextfieldAssignment_2(), "rule__Activity__TextfieldAssignment_2");
					put(grammarAccess.getActivityAccess().getRoleAssignment_4(), "rule__Activity__RoleAssignment_4");
					put(grammarAccess.getActivityAccess().getInPortsAssignment_5_1(), "rule__Activity__InPortsAssignment_5_1");
					put(grammarAccess.getActivityAccess().getInPortsAssignment_5_2_1(), "rule__Activity__InPortsAssignment_5_2_1");
					put(grammarAccess.getActivityAccess().getOutPortsAssignment_6_1(), "rule__Activity__OutPortsAssignment_6_1");
					put(grammarAccess.getActivityAccess().getOutPortsAssignment_6_2_1(), "rule__Activity__OutPortsAssignment_6_2_1");
					put(grammarAccess.getActivityAccess().getSubActivitiesAssignment_7_1(), "rule__Activity__SubActivitiesAssignment_7_1");
					put(grammarAccess.getActivityAccess().getSubActivitiesAssignment_7_2_1(), "rule__Activity__SubActivitiesAssignment_7_2_1");
					put(grammarAccess.getActivityAccess().getGuidancesAssignment_8_1(), "rule__Activity__GuidancesAssignment_8_1");
					put(grammarAccess.getActivityAccess().getGuidancesAssignment_8_2_1(), "rule__Activity__GuidancesAssignment_8_2_1");
					put(grammarAccess.getActivityAccess().getStepsAssignment_9_2_0(), "rule__Activity__StepsAssignment_9_2_0");
					put(grammarAccess.getActivityAccess().getDecisionsAssignment_9_2_1(), "rule__Activity__DecisionsAssignment_9_2_1");
					put(grammarAccess.getActivityAccess().getTransitionsAssignment_9_2_2(), "rule__Activity__TransitionsAssignment_9_2_2");
					put(grammarAccess.getActivityRefAccess().getNameAssignment_0(), "rule__ActivityRef__NameAssignment_0");
					put(grammarAccess.getActivityRefAccess().getTypeAssignment_2(), "rule__ActivityRef__TypeAssignment_2");
					put(grammarAccess.getDecisionAccess().getNameAssignment_1(), "rule__Decision__NameAssignment_1");
					put(grammarAccess.getStepAccess().getNameAssignment_1(), "rule__Step__NameAssignment_1");
					put(grammarAccess.getInitialTransitionAccess().getNameAssignment_1(), "rule__InitialTransition__NameAssignment_1");
					put(grammarAccess.getInitialTransitionAccess().getToAssignment_4(), "rule__InitialTransition__ToAssignment_4");
					put(grammarAccess.getFinalTransitionAccess().getNameAssignment_1(), "rule__FinalTransition__NameAssignment_1");
					put(grammarAccess.getFinalTransitionAccess().getFromAssignment_2(), "rule__FinalTransition__FromAssignment_2");
					put(grammarAccess.getNonInitialTransitionAccess().getNameAssignment_1(), "rule__NonInitialTransition__NameAssignment_1");
					put(grammarAccess.getNonInitialTransitionAccess().getFromAssignment_2(), "rule__NonInitialTransition__FromAssignment_2");
					put(grammarAccess.getNonInitialTransitionAccess().getToAssignment_4(), "rule__NonInitialTransition__ToAssignment_4");
					put(grammarAccess.getTextfieldAccess().getLabelAssignment_0_1(), "rule__Textfield__LabelAssignment_0_1");
					put(grammarAccess.getTextfieldAccess().getSummaryAssignment_2(), "rule__Textfield__SummaryAssignment_2");
					put(grammarAccess.getTextfieldAccess().getDescriptionAssignment_3_1(), "rule__Textfield__DescriptionAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.protos.FlowOfWork.core.fow.ui.contentassist.antlr.internal.InternalFoWParser typedParser = (de.protos.FlowOfWork.core.fow.ui.contentassist.antlr.internal.InternalFoWParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public FoWGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FoWGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
