package de.protos.FlowOfWork.core.fow.serializer;

import com.google.inject.Inject;
import de.protos.FlowOfWork.core.fow.services.FoWGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class FoWSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FoWGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Activity___BehaviorKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FoWGrammarAccess) access;
		match_Activity___BehaviorKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getActivityAccess().getBehaviorKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_9_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Activity___BehaviorKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q.equals(syntax))
				emit_Activity___BehaviorKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('Behavior' '{' '}')?
	 */
	protected void emit_Activity___BehaviorKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
