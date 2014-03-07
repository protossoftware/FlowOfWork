/**
 */
package de.protos.FlowOfWork.core.fow.foW.util;

import de.protos.FlowOfWork.core.fow.foW.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage
 * @generated
 */
public class FoWAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FoWPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FoWAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FoWPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FoWSwitch<Adapter> modelSwitch =
    new FoWSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseRole(Role object)
      {
        return createRoleAdapter();
      }
      @Override
      public Adapter caseWorkProductType(WorkProductType object)
      {
        return createWorkProductTypeAdapter();
      }
      @Override
      public Adapter caseWorkProduct(WorkProduct object)
      {
        return createWorkProductAdapter();
      }
      @Override
      public Adapter caseGuidanceType(GuidanceType object)
      {
        return createGuidanceTypeAdapter();
      }
      @Override
      public Adapter caseGuidance(Guidance object)
      {
        return createGuidanceAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter casePort(Port object)
      {
        return createPortAdapter();
      }
      @Override
      public Adapter caseActivity(Activity object)
      {
        return createActivityAdapter();
      }
      @Override
      public Adapter caseActivityRef(ActivityRef object)
      {
        return createActivityRefAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseDecision(Decision object)
      {
        return createDecisionAdapter();
      }
      @Override
      public Adapter caseStep(Step object)
      {
        return createStepAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseInitialTransition(InitialTransition object)
      {
        return createInitialTransitionAdapter();
      }
      @Override
      public Adapter caseFinalTransition(FinalTransition object)
      {
        return createFinalTransitionAdapter();
      }
      @Override
      public Adapter caseDecisionTransition(DecisionTransition object)
      {
        return createDecisionTransitionAdapter();
      }
      @Override
      public Adapter caseNonInitialTransition(NonInitialTransition object)
      {
        return createNonInitialTransitionAdapter();
      }
      @Override
      public Adapter caseTextfield(Textfield object)
      {
        return createTextfieldAdapter();
      }
      @Override
      public Adapter caseLink(Link object)
      {
        return createLinkAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.Role
   * @generated
   */
  public Adapter createRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.WorkProductType <em>Work Product Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.WorkProductType
   * @generated
   */
  public Adapter createWorkProductTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.WorkProduct <em>Work Product</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.WorkProduct
   * @generated
   */
  public Adapter createWorkProductAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.GuidanceType <em>Guidance Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.GuidanceType
   * @generated
   */
  public Adapter createGuidanceTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.Guidance <em>Guidance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.Guidance
   * @generated
   */
  public Adapter createGuidanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.Port
   * @generated
   */
  public Adapter createPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.Activity
   * @generated
   */
  public Adapter createActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.ActivityRef <em>Activity Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.ActivityRef
   * @generated
   */
  public Adapter createActivityRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.Decision <em>Decision</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.Decision
   * @generated
   */
  public Adapter createDecisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.Step
   * @generated
   */
  public Adapter createStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.InitialTransition <em>Initial Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.InitialTransition
   * @generated
   */
  public Adapter createInitialTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.FinalTransition <em>Final Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.FinalTransition
   * @generated
   */
  public Adapter createFinalTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.DecisionTransition <em>Decision Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.DecisionTransition
   * @generated
   */
  public Adapter createDecisionTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.NonInitialTransition <em>Non Initial Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.NonInitialTransition
   * @generated
   */
  public Adapter createNonInitialTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.Textfield <em>Textfield</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.Textfield
   * @generated
   */
  public Adapter createTextfieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.protos.FlowOfWork.core.fow.foW.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.protos.FlowOfWork.core.fow.foW.Link
   * @generated
   */
  public Adapter createLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FoWAdapterFactory
