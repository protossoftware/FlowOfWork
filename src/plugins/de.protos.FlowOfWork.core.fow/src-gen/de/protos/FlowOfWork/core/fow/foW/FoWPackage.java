/**
 */
package de.protos.FlowOfWork.core.fow.foW;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.protos.FlowOfWork.core.fow.foW.FoWFactory
 * @model kind="package"
 * @generated
 */
public interface FoWPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "foW";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.protos.de/FlowOfWork/core/fow/FoW";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "foW";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FoWPackage eINSTANCE = de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl.init();

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.ModelImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Activities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ACTIVITIES = 0;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ROLES = 1;

  /**
   * The feature id for the '<em><b>Work Products</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__WORK_PRODUCTS = 2;

  /**
   * The feature id for the '<em><b>Work Product Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__WORK_PRODUCT_TYPES = 3;

  /**
   * The feature id for the '<em><b>Guidances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GUIDANCES = 4;

  /**
   * The feature id for the '<em><b>Guidance Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GUIDANCE_TYPES = 5;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.NamedElementImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Textfield</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__TEXTFIELD = 1;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.RoleImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getRole()
   * @generated
   */
  int ROLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Textfield</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__TEXTFIELD = NAMED_ELEMENT__TEXTFIELD;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.WorkProductTypeImpl <em>Work Product Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.WorkProductTypeImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getWorkProductType()
   * @generated
   */
  int WORK_PRODUCT_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PRODUCT_TYPE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Textfield</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PRODUCT_TYPE__TEXTFIELD = NAMED_ELEMENT__TEXTFIELD;

  /**
   * The number of structural features of the '<em>Work Product Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PRODUCT_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.WorkProductImpl <em>Work Product</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.WorkProductImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getWorkProduct()
   * @generated
   */
  int WORK_PRODUCT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PRODUCT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Textfield</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PRODUCT__TEXTFIELD = NAMED_ELEMENT__TEXTFIELD;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PRODUCT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PRODUCT__STATES = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Work Product</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PRODUCT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.GuidanceTypeImpl <em>Guidance Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.GuidanceTypeImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getGuidanceType()
   * @generated
   */
  int GUIDANCE_TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE_TYPE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Textfield</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE_TYPE__TEXTFIELD = NAMED_ELEMENT__TEXTFIELD;

  /**
   * The number of structural features of the '<em>Guidance Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.GuidanceImpl <em>Guidance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.GuidanceImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getGuidance()
   * @generated
   */
  int GUIDANCE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Textfield</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE__TEXTFIELD = NAMED_ELEMENT__TEXTFIELD;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE__LINKS = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Guidance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.StateImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getState()
   * @generated
   */
  int STATE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.PortImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getPort()
   * @generated
   */
  int PORT = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__TYPE = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__STATE = 1;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.ActivityImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getActivity()
   * @generated
   */
  int ACTIVITY = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Textfield</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__TEXTFIELD = NAMED_ELEMENT__TEXTFIELD;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__ROLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__IN_PORTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__OUT_PORTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Sub Activities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__SUB_ACTIVITIES = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Guidances</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__GUIDANCES = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__STEPS = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__DECISIONS = NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityRefImpl <em>Activity Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.ActivityRefImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getActivityRef()
   * @generated
   */
  int ACTIVITY_REF = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_REF__TYPE = 0;

  /**
   * The number of structural features of the '<em>Activity Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.NodeImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getNode()
   * @generated
   */
  int NODE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__LABEL = 1;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.DecisionImpl <em>Decision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.DecisionImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getDecision()
   * @generated
   */
  int DECISION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION__LABEL = NODE__LABEL;

  /**
   * The number of structural features of the '<em>Decision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.StepImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getStep()
   * @generated
   */
  int STEP = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__LABEL = NODE__LABEL;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.TransitionImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 14;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.InitialTransitionImpl <em>Initial Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.InitialTransitionImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getInitialTransition()
   * @generated
   */
  int INITIAL_TRANSITION = 15;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_TRANSITION__TO = TRANSITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Initial Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.FinalTransitionImpl <em>Final Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FinalTransitionImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getFinalTransition()
   * @generated
   */
  int FINAL_TRANSITION = 16;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_TRANSITION__FROM = TRANSITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Final Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.DecisionTransitionImpl <em>Decision Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.DecisionTransitionImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getDecisionTransition()
   * @generated
   */
  int DECISION_TRANSITION = 17;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TRANSITION__FROM = TRANSITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TRANSITION__TO = TRANSITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Guard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TRANSITION__GUARD = TRANSITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Decision Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.NonInitialTransitionImpl <em>Non Initial Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.NonInitialTransitionImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getNonInitialTransition()
   * @generated
   */
  int NON_INITIAL_TRANSITION = 18;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_INITIAL_TRANSITION__FROM = TRANSITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_INITIAL_TRANSITION__TO = TRANSITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Non Initial Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_INITIAL_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.TextfieldImpl <em>Textfield</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.TextfieldImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getTextfield()
   * @generated
   */
  int TEXTFIELD = 19;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD__LABEL = 0;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD__SUMMARY = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>Textfield</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.LinkImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getLink()
   * @generated
   */
  int LINK = 20;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__URL = 1;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.Model#getActivities <em>Activities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Activities</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Model#getActivities()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Activities();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.Model#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roles</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Model#getRoles()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Roles();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.Model#getWorkProducts <em>Work Products</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Work Products</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Model#getWorkProducts()
   * @see #getModel()
   * @generated
   */
  EReference getModel_WorkProducts();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.Model#getWorkProductTypes <em>Work Product Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Work Product Types</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Model#getWorkProductTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_WorkProductTypes();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.Model#getGuidances <em>Guidances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Guidances</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Model#getGuidances()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Guidances();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.Model#getGuidanceTypes <em>Guidance Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Guidance Types</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Model#getGuidanceTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_GuidanceTypes();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.protos.FlowOfWork.core.fow.foW.NamedElement#getTextfield <em>Textfield</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Textfield</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.NamedElement#getTextfield()
   * @see #getNamedElement()
   * @generated
   */
  EReference getNamedElement_Textfield();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.WorkProductType <em>Work Product Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Product Type</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.WorkProductType
   * @generated
   */
  EClass getWorkProductType();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.WorkProduct <em>Work Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Product</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.WorkProduct
   * @generated
   */
  EClass getWorkProduct();

  /**
   * Returns the meta object for the reference '{@link de.protos.FlowOfWork.core.fow.foW.WorkProduct#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.WorkProduct#getType()
   * @see #getWorkProduct()
   * @generated
   */
  EReference getWorkProduct_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.WorkProduct#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.WorkProduct#getStates()
   * @see #getWorkProduct()
   * @generated
   */
  EReference getWorkProduct_States();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.GuidanceType <em>Guidance Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guidance Type</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.GuidanceType
   * @generated
   */
  EClass getGuidanceType();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.Guidance <em>Guidance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guidance</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Guidance
   * @generated
   */
  EClass getGuidance();

  /**
   * Returns the meta object for the reference '{@link de.protos.FlowOfWork.core.fow.foW.Guidance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Guidance#getType()
   * @see #getGuidance()
   * @generated
   */
  EReference getGuidance_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.Guidance#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Guidance#getLinks()
   * @see #getGuidance()
   * @generated
   */
  EReference getGuidance_Links();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the reference '{@link de.protos.FlowOfWork.core.fow.foW.Port#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Port#getType()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Type();

  /**
   * Returns the meta object for the reference '{@link de.protos.FlowOfWork.core.fow.foW.Port#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Port#getState()
   * @see #getPort()
   * @generated
   */
  EReference getPort_State();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Activity
   * @generated
   */
  EClass getActivity();

  /**
   * Returns the meta object for the reference '{@link de.protos.FlowOfWork.core.fow.foW.Activity#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Role</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Activity#getRole()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Role();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.Activity#getInPorts <em>In Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>In Ports</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Activity#getInPorts()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_InPorts();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.Activity#getOutPorts <em>Out Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Out Ports</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Activity#getOutPorts()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_OutPorts();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.Activity#getSubActivities <em>Sub Activities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Activities</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Activity#getSubActivities()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_SubActivities();

  /**
   * Returns the meta object for the reference list '{@link de.protos.FlowOfWork.core.fow.foW.Activity#getGuidances <em>Guidances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Guidances</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Activity#getGuidances()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Guidances();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.Activity#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Activity#getSteps()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Steps();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.Activity#getDecisions <em>Decisions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decisions</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Activity#getDecisions()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Decisions();

  /**
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.Activity#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Activity#getTransitions()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Transitions();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.ActivityRef <em>Activity Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Ref</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.ActivityRef
   * @generated
   */
  EClass getActivityRef();

  /**
   * Returns the meta object for the reference '{@link de.protos.FlowOfWork.core.fow.foW.ActivityRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.ActivityRef#getType()
   * @see #getActivityRef()
   * @generated
   */
  EReference getActivityRef_Type();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Name();

  /**
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.Node#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Node#getLabel()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Label();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.Decision <em>Decision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Decision
   * @generated
   */
  EClass getDecision();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.InitialTransition <em>Initial Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initial Transition</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.InitialTransition
   * @generated
   */
  EClass getInitialTransition();

  /**
   * Returns the meta object for the reference '{@link de.protos.FlowOfWork.core.fow.foW.InitialTransition#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.InitialTransition#getTo()
   * @see #getInitialTransition()
   * @generated
   */
  EReference getInitialTransition_To();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.FinalTransition <em>Final Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Final Transition</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.FinalTransition
   * @generated
   */
  EClass getFinalTransition();

  /**
   * Returns the meta object for the reference '{@link de.protos.FlowOfWork.core.fow.foW.FinalTransition#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.FinalTransition#getFrom()
   * @see #getFinalTransition()
   * @generated
   */
  EReference getFinalTransition_From();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.DecisionTransition <em>Decision Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision Transition</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.DecisionTransition
   * @generated
   */
  EClass getDecisionTransition();

  /**
   * Returns the meta object for the reference '{@link de.protos.FlowOfWork.core.fow.foW.DecisionTransition#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.DecisionTransition#getFrom()
   * @see #getDecisionTransition()
   * @generated
   */
  EReference getDecisionTransition_From();

  /**
   * Returns the meta object for the reference '{@link de.protos.FlowOfWork.core.fow.foW.DecisionTransition#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.DecisionTransition#getTo()
   * @see #getDecisionTransition()
   * @generated
   */
  EReference getDecisionTransition_To();

  /**
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.DecisionTransition#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Guard</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.DecisionTransition#getGuard()
   * @see #getDecisionTransition()
   * @generated
   */
  EAttribute getDecisionTransition_Guard();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.NonInitialTransition <em>Non Initial Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Initial Transition</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.NonInitialTransition
   * @generated
   */
  EClass getNonInitialTransition();

  /**
   * Returns the meta object for the reference '{@link de.protos.FlowOfWork.core.fow.foW.NonInitialTransition#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.NonInitialTransition#getFrom()
   * @see #getNonInitialTransition()
   * @generated
   */
  EReference getNonInitialTransition_From();

  /**
   * Returns the meta object for the reference '{@link de.protos.FlowOfWork.core.fow.foW.NonInitialTransition#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.NonInitialTransition#getTo()
   * @see #getNonInitialTransition()
   * @generated
   */
  EReference getNonInitialTransition_To();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.Textfield <em>Textfield</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Textfield</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Textfield
   * @generated
   */
  EClass getTextfield();

  /**
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.Textfield#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Textfield#getLabel()
   * @see #getTextfield()
   * @generated
   */
  EAttribute getTextfield_Label();

  /**
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.Textfield#getSummary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Summary</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Textfield#getSummary()
   * @see #getTextfield()
   * @generated
   */
  EAttribute getTextfield_Summary();

  /**
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.Textfield#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Textfield#getDescription()
   * @see #getTextfield()
   * @generated
   */
  EAttribute getTextfield_Description();

  /**
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.Link#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Link#getDescription()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Description();

  /**
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.Link#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Link#getUrl()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Url();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FoWFactory getFoWFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.ModelImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ACTIVITIES = eINSTANCE.getModel_Activities();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ROLES = eINSTANCE.getModel_Roles();

    /**
     * The meta object literal for the '<em><b>Work Products</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__WORK_PRODUCTS = eINSTANCE.getModel_WorkProducts();

    /**
     * The meta object literal for the '<em><b>Work Product Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__WORK_PRODUCT_TYPES = eINSTANCE.getModel_WorkProductTypes();

    /**
     * The meta object literal for the '<em><b>Guidances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GUIDANCES = eINSTANCE.getModel_Guidances();

    /**
     * The meta object literal for the '<em><b>Guidance Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GUIDANCE_TYPES = eINSTANCE.getModel_GuidanceTypes();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.NamedElementImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '<em><b>Textfield</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_ELEMENT__TEXTFIELD = eINSTANCE.getNamedElement_Textfield();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.RoleImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.WorkProductTypeImpl <em>Work Product Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.WorkProductTypeImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getWorkProductType()
     * @generated
     */
    EClass WORK_PRODUCT_TYPE = eINSTANCE.getWorkProductType();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.WorkProductImpl <em>Work Product</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.WorkProductImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getWorkProduct()
     * @generated
     */
    EClass WORK_PRODUCT = eINSTANCE.getWorkProduct();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_PRODUCT__TYPE = eINSTANCE.getWorkProduct_Type();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_PRODUCT__STATES = eINSTANCE.getWorkProduct_States();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.GuidanceTypeImpl <em>Guidance Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.GuidanceTypeImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getGuidanceType()
     * @generated
     */
    EClass GUIDANCE_TYPE = eINSTANCE.getGuidanceType();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.GuidanceImpl <em>Guidance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.GuidanceImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getGuidance()
     * @generated
     */
    EClass GUIDANCE = eINSTANCE.getGuidance();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUIDANCE__TYPE = eINSTANCE.getGuidance_Type();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUIDANCE__LINKS = eINSTANCE.getGuidance_Links();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.StateImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.PortImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__TYPE = eINSTANCE.getPort_Type();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__STATE = eINSTANCE.getPort_State();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.ActivityImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getActivity()
     * @generated
     */
    EClass ACTIVITY = eINSTANCE.getActivity();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__ROLE = eINSTANCE.getActivity_Role();

    /**
     * The meta object literal for the '<em><b>In Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__IN_PORTS = eINSTANCE.getActivity_InPorts();

    /**
     * The meta object literal for the '<em><b>Out Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__OUT_PORTS = eINSTANCE.getActivity_OutPorts();

    /**
     * The meta object literal for the '<em><b>Sub Activities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__SUB_ACTIVITIES = eINSTANCE.getActivity_SubActivities();

    /**
     * The meta object literal for the '<em><b>Guidances</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__GUIDANCES = eINSTANCE.getActivity_Guidances();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__STEPS = eINSTANCE.getActivity_Steps();

    /**
     * The meta object literal for the '<em><b>Decisions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__DECISIONS = eINSTANCE.getActivity_Decisions();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__TRANSITIONS = eINSTANCE.getActivity_Transitions();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityRefImpl <em>Activity Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.ActivityRefImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getActivityRef()
     * @generated
     */
    EClass ACTIVITY_REF = eINSTANCE.getActivityRef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_REF__TYPE = eINSTANCE.getActivityRef_Type();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.NodeImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NAME = eINSTANCE.getNode_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__LABEL = eINSTANCE.getNode_Label();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.DecisionImpl <em>Decision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.DecisionImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getDecision()
     * @generated
     */
    EClass DECISION = eINSTANCE.getDecision();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.StepImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.TransitionImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.InitialTransitionImpl <em>Initial Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.InitialTransitionImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getInitialTransition()
     * @generated
     */
    EClass INITIAL_TRANSITION = eINSTANCE.getInitialTransition();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIAL_TRANSITION__TO = eINSTANCE.getInitialTransition_To();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.FinalTransitionImpl <em>Final Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FinalTransitionImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getFinalTransition()
     * @generated
     */
    EClass FINAL_TRANSITION = eINSTANCE.getFinalTransition();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FINAL_TRANSITION__FROM = eINSTANCE.getFinalTransition_From();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.DecisionTransitionImpl <em>Decision Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.DecisionTransitionImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getDecisionTransition()
     * @generated
     */
    EClass DECISION_TRANSITION = eINSTANCE.getDecisionTransition();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION_TRANSITION__FROM = eINSTANCE.getDecisionTransition_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION_TRANSITION__TO = eINSTANCE.getDecisionTransition_To();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECISION_TRANSITION__GUARD = eINSTANCE.getDecisionTransition_Guard();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.NonInitialTransitionImpl <em>Non Initial Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.NonInitialTransitionImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getNonInitialTransition()
     * @generated
     */
    EClass NON_INITIAL_TRANSITION = eINSTANCE.getNonInitialTransition();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_INITIAL_TRANSITION__FROM = eINSTANCE.getNonInitialTransition_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_INITIAL_TRANSITION__TO = eINSTANCE.getNonInitialTransition_To();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.TextfieldImpl <em>Textfield</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.TextfieldImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getTextfield()
     * @generated
     */
    EClass TEXTFIELD = eINSTANCE.getTextfield();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTFIELD__LABEL = eINSTANCE.getTextfield_Label();

    /**
     * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTFIELD__SUMMARY = eINSTANCE.getTextfield_Summary();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTFIELD__DESCRIPTION = eINSTANCE.getTextfield_Description();

    /**
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.LinkImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__DESCRIPTION = eINSTANCE.getLink_Description();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__URL = eINSTANCE.getLink_Url();

  }

} //FoWPackage
