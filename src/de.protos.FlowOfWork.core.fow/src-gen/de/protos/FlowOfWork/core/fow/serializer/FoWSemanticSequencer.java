package de.protos.FlowOfWork.core.fow.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.protos.FlowOfWork.core.fow.foW.Activity;
import de.protos.FlowOfWork.core.fow.foW.ActivityRef;
import de.protos.FlowOfWork.core.fow.foW.FoWPackage;
import de.protos.FlowOfWork.core.fow.foW.Guidance;
import de.protos.FlowOfWork.core.fow.foW.GuidanceType;
import de.protos.FlowOfWork.core.fow.foW.Model;
import de.protos.FlowOfWork.core.fow.foW.Port;
import de.protos.FlowOfWork.core.fow.foW.Role;
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
			case FoWPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
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
	 *     (name=ID type=[Activity|ID])
	 */
	protected void sequence_ActivityRef(EObject context, ActivityRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.ACTIVITY_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.ACTIVITY_REF__NAME));
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.ACTIVITY_REF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.ACTIVITY_REF__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActivityRefAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActivityRefAccess().getTypeActivityIDTerminalRuleCall_2_0_1(), semanticObject.getType());
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
	 *     )
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (name=ID type=[WorkProduct|ID])
	 */
	protected void sequence_Port(EObject context, Port semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.PORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.PORT__NAME));
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.PORT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.PORT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPortAccess().getTypeWorkProductIDTerminalRuleCall_2_0_1(), semanticObject.getType());
		feeder.finish();
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
	 *     (name=ID type=[WorkProductType|ID] textfield=Textfield)
	 */
	protected void sequence_WorkProduct(EObject context, WorkProduct semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__TEXTFIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.NAMED_ELEMENT__TEXTFIELD));
			if(transientValues.isValueTransient(semanticObject, FoWPackage.Literals.WORK_PRODUCT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FoWPackage.Literals.WORK_PRODUCT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWorkProductAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getWorkProductAccess().getTypeWorkProductTypeIDTerminalRuleCall_3_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getWorkProductAccess().getTextfieldTextfieldParserRuleCall_4_0(), semanticObject.getTextfield());
		feeder.finish();
	}
}
