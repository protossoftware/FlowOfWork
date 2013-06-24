/**
 */
package de.protos.FlowOfWork.core.fow.foW.impl;

import de.protos.FlowOfWork.core.fow.foW.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FoWFactoryImpl extends EFactoryImpl implements FoWFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FoWFactory init()
  {
    try
    {
      FoWFactory theFoWFactory = (FoWFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.protos.de/FlowOfWork/core/fow/FoW"); 
      if (theFoWFactory != null)
      {
        return theFoWFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FoWFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FoWFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FoWPackage.MODEL: return createModel();
      case FoWPackage.NAMED_ELEMENT: return createNamedElement();
      case FoWPackage.ROLE: return createRole();
      case FoWPackage.WORK_PRODUCT_TYPE: return createWorkProductType();
      case FoWPackage.WORK_PRODUCT: return createWorkProduct();
      case FoWPackage.GUIDANCE_TYPE: return createGuidanceType();
      case FoWPackage.GUIDANCE: return createGuidance();
      case FoWPackage.STATE: return createState();
      case FoWPackage.PORT: return createPort();
      case FoWPackage.ACTIVITY: return createActivity();
      case FoWPackage.ACTIVITY_REF: return createActivityRef();
      case FoWPackage.NODE: return createNode();
      case FoWPackage.DECISION: return createDecision();
      case FoWPackage.STEP: return createStep();
      case FoWPackage.TRANSITION: return createTransition();
      case FoWPackage.INITIAL_TRANSITION: return createInitialTransition();
      case FoWPackage.FINAL_TRANSITION: return createFinalTransition();
      case FoWPackage.DECISION_TRANSITION: return createDecisionTransition();
      case FoWPackage.NON_INITIAL_TRANSITION: return createNonInitialTransition();
      case FoWPackage.TEXTFIELD: return createTextfield();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement createNamedElement()
  {
    NamedElementImpl namedElement = new NamedElementImpl();
    return namedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkProductType createWorkProductType()
  {
    WorkProductTypeImpl workProductType = new WorkProductTypeImpl();
    return workProductType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkProduct createWorkProduct()
  {
    WorkProductImpl workProduct = new WorkProductImpl();
    return workProduct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuidanceType createGuidanceType()
  {
    GuidanceTypeImpl guidanceType = new GuidanceTypeImpl();
    return guidanceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guidance createGuidance()
  {
    GuidanceImpl guidance = new GuidanceImpl();
    return guidance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity createActivity()
  {
    ActivityImpl activity = new ActivityImpl();
    return activity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityRef createActivityRef()
  {
    ActivityRefImpl activityRef = new ActivityRefImpl();
    return activityRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decision createDecision()
  {
    DecisionImpl decision = new DecisionImpl();
    return decision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialTransition createInitialTransition()
  {
    InitialTransitionImpl initialTransition = new InitialTransitionImpl();
    return initialTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinalTransition createFinalTransition()
  {
    FinalTransitionImpl finalTransition = new FinalTransitionImpl();
    return finalTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecisionTransition createDecisionTransition()
  {
    DecisionTransitionImpl decisionTransition = new DecisionTransitionImpl();
    return decisionTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonInitialTransition createNonInitialTransition()
  {
    NonInitialTransitionImpl nonInitialTransition = new NonInitialTransitionImpl();
    return nonInitialTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Textfield createTextfield()
  {
    TextfieldImpl textfield = new TextfieldImpl();
    return textfield;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FoWPackage getFoWPackage()
  {
    return (FoWPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FoWPackage getPackage()
  {
    return FoWPackage.eINSTANCE;
  }

} //FoWFactoryImpl
