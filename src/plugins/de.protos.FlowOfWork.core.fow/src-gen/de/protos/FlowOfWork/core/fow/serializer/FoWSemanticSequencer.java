package de.protos.FlowOfWork.core.fow.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.protos.FlowOfWork.core.fow.foW.Activity;
import de.protos.FlowOfWork.core.fow.foW.ActivityRef;
import de.protos.FlowOfWork.core.fow.foW.Decision;
import de.protos.FlowOfWork.core.fow.foW.DecisionTransition;
import de.protos.FlowOfWork.core.fow.foW.FinalTransition;
import de.protos.FlowOfWork.core.fow.foW.FoWPackage;
import de.protos.FlowOfWork.core.fow.foW.Guidance;
import de.protos.FlowOfWork.core.fow.foW.GuidanceType;
import de.protos.FlowOfWork.core.fow.foW.InitialTransition;
import de.protos.FlowOfWork.core.fow.foW.Model;
import de.protos.FlowOfWork.core.fow.foW.NonInitialTransition;
import de.protos.FlowOfWork.core.fow.foW.Port;
import de.protos.FlowOfWork.core.fow.foW.Role;
import de.protos.FlowOfWork.core.fow.foW.State;
import de.protos.FlowOfWork.core.fow.foW.Step;
import de.protos.FlowOfWork.core.fow.foW.Textfield;
import de.protos.FlowOfWork.core.fow.foW.WorkProduct;
import de.protos.FlowOfWork.core.fow.foW.WorkProductType;
import de.protos.FlowOfWork.core.fow.services.FoWGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class FoWSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FoWGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FoWPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FoWPackage.ACTIVITY:
				if(context == grammarAccess.getActivityRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_Activity(context, (Activity) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.ACTIVITY_REF:
				if(context == grammarAccess.getActivityRefRule()) {
					sequence_ActivityRef(context, (ActivityRef) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.DECISION:
				if(context == grammarAccess.getDecisionRule() ||
				   context == grammarAccess.getNodeRule()) {
					sequence_Decision(context, (Decision) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.DECISION_TRANSITION:
				if(context == grammarAccess.getDecisionTransitionRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_DecisionTransition(context, (DecisionTransition) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.FINAL_TRANSITION:
				if(context == grammarAccess.getFinalTransitionRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_FinalTransition(context, (FinalTransition) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.GUIDANCE:
				if(context == grammarAccess.getGuidanceRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_Guidance(context, (Guidance) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.GUIDANCE_TYPE:
				if(context == grammarAccess.getGuidanceTypeRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_GuidanceType(context, (GuidanceType) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.INITIAL_TRANSITION:
				if(context == grammarAccess.getInitialTransitionRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_InitialTransition(context, (InitialTransition) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.NON_INITIAL_TRANSITION:
				if(context == grammarAccess.getNonInitialTransitionRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_NonInitialTransition(context, (NonInitialTransition) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.PORT:
				if(context == grammarAccess.getPortRule()) {
					sequence_Port(context, (Port) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.ROLE:
				if(context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getRoleRule()) {
					sequence_Role(context, (Role) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.STEP:
				if(context == grammarAccess.getNodeRule() ||
				   context == grammarAccess.getStepRule()) {
					sequence_Step(context, (Step) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.TEXTFIELD:
				if(context == grammarAccess.getTextfieldRule()) {
					sequence_Textfield(context, (Textfield) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.WORK_PRODUCT:
				if(context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getWorkProductRule()) {
					sequence_WorkProduct(context, (WorkProduct) semanticObject); 
					return; 
				}
				else break;
			case FoWPackage.WORK_PRODUCT_TYPE:
				if(context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getWorkProductTypeRule()) {
					sequence_WorkProductType(context, (WorkProductType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     type=[Activity|ID]
	 */
	protected void sequence_ActivityRef(EObject context, ActivityRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.ACTIVITY_REF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.ACTIVITY_REF__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActivityRefAccess().getTypeActivityIDTerminalRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         textfield=Textfield 
	 *         role=[Role|ID] 
	 *         (inPorts+=Port inPorts+=Port*)? 
	 *         (outPorts+=Port outPorts+=Port*)? 
	 *         (subActivities+=ActivityRef subActivities+=ActivityRef*)? 
	 *         (guidances+=[Guidance|ID] guidances+=[Guidance|ID]*)? 
	 *         (steps+=Step | decisions+=Decision | transitions+=Transition)*
	 *     )
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (from=[Decision|ID] to=[Node|ID] guard=STRING)
	 */
	protected void sequence_DecisionTransition(EObject context, DecisionTransition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.DECISION_TRANSITION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.DECISION_TRANSITION__FROM));
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.DECISION_TRANSITION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.DECISION_TRANSITION__TO));
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.DECISION_TRANSITION__GUARD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.DECISION_TRANSITION__GUARD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDecisionTransitionAccess().getFromDecisionIDTerminalRuleCall_1_0_1(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getDecisionTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1(), semanticObject.getTo());
		feeder.accept(grammarAccess.getDecisionTransitionAccess().getGuardSTRINGTerminalRuleCall_4_0(), semanticObject.getGuard());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID label=STRING?)
	 */
	protected void sequence_Decision(EObject context, Decision semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     from=[Node|ID]
	 */
	protected void sequence_FinalTransition(EObject context, FinalTransition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.FINAL_TRANSITION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.FINAL_TRANSITION__FROM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFinalTransitionAccess().getFromNodeIDTerminalRuleCall_1_0_1(), semanticObject.getFrom());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID textfield=Textfield)
	 */
	protected void sequence_GuidanceType(EObject context, GuidanceType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__TEXTFIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__TEXTFIELD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGuidanceTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGuidanceTypeAccess().getTextfieldTextfieldParserRuleCall_2_0(), semanticObject.getTextfield());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[GuidanceType|ID] textfield=Textfield)
	 */
	protected void sequence_Guidance(EObject context, Guidance semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__TEXTFIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__TEXTFIELD));
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.GUIDANCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.GUIDANCE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGuidanceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGuidanceAccess().getTypeGuidanceTypeIDTerminalRuleCall_3_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getGuidanceAccess().getTextfieldTextfieldParserRuleCall_4_0(), semanticObject.getTextfield());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     to=[Node|ID]
	 */
	protected void sequence_InitialTransition(EObject context, InitialTransition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.INITIAL_TRANSITION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.INITIAL_TRANSITION__TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInitialTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         activities+=Activity | 
	 *         roles+=Role | 
	 *         workProducts+=WorkProduct | 
	 *         workProductTypes+=WorkProductType | 
	 *         guidances+=Guidance | 
	 *         guidanceTypes+=GuidanceType
	 *     )*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (from=[Node|ID] to=[Node|ID])
	 */
	protected void sequence_NonInitialTransition(EObject context, NonInitialTransition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.NON_INITIAL_TRANSITION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.NON_INITIAL_TRANSITION__FROM));
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.NON_INITIAL_TRANSITION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.NON_INITIAL_TRANSITION__TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNonInitialTransitionAccess().getFromNodeIDTerminalRuleCall_1_0_1(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getNonInitialTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[WorkProduct|ID] state=[State|ID]?)
	 */
	protected void sequence_Port(EObject context, Port semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID textfield=Textfield)
	 */
	protected void sequence_Role(EObject context, Role semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__TEXTFIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__TEXTFIELD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRoleAccess().getTextfieldTextfieldParserRuleCall_2_0(), semanticObject.getTextfield());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.STATE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID label=STRING?)
	 */
	protected void sequence_Step(EObject context, Step semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=STRING? summary=STRING description=STRING?)
	 */
	protected void sequence_Textfield(EObject context, Textfield semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID textfield=Textfield)
	 */
	protected void sequence_WorkProductType(EObject context, WorkProductType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__TEXTFIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__TEXTFIELD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWorkProductTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getWorkProductTypeAccess().getTextfieldTextfieldParserRuleCall_2_0(), semanticObject.getTextfield());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[WorkProductType|ID] textfield=Textfield (states+=State states+=State*)?)
	 */
	protected void sequence_WorkProduct(EObject context, WorkProduct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
