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
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.RoleImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getRole()
   * @generated
   */
  int ROLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.WorkProductImpl <em>Work Product</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.WorkProductImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getWorkProduct()
   * @generated
   */
  int WORK_PRODUCT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PRODUCT__NAME = 0;

  /**
   * The number of structural features of the '<em>Work Product</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PRODUCT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.PortImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getPort()
   * @generated
   */
  int PORT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__TYPE = 1;

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
  int ACTIVITY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__ROLE = 1;

  /**
   * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__IN_PORTS = 2;

  /**
   * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__OUT_PORTS = 3;

  /**
   * The feature id for the '<em><b>Activity Refs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__ACTIVITY_REFS = 4;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityRefImpl <em>Activity Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.protos.FlowOfWork.core.fow.foW.impl.ActivityRefImpl
   * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getActivityRef()
   * @generated
   */
  int ACTIVITY_REF = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_REF__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_REF__TYPE = 1;

  /**
   * The number of structural features of the '<em>Activity Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_REF_FEATURE_COUNT = 2;


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
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.Role#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Role#getName()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Name();

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
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.WorkProduct#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.WorkProduct#getName()
   * @see #getWorkProduct()
   * @generated
   */
  EAttribute getWorkProduct_Name();

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
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.Port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Port#getName()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Name();

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
   * Returns the meta object for class '{@link de.protos.FlowOfWork.core.fow.foW.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Activity
   * @generated
   */
  EClass getActivity();

  /**
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.Activity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Activity#getName()
   * @see #getActivity()
   * @generated
   */
  EAttribute getActivity_Name();

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
   * Returns the meta object for the containment reference list '{@link de.protos.FlowOfWork.core.fow.foW.Activity#getActivityRefs <em>Activity Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Activity Refs</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.Activity#getActivityRefs()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_ActivityRefs();

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
   * Returns the meta object for the attribute '{@link de.protos.FlowOfWork.core.fow.foW.ActivityRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.protos.FlowOfWork.core.fow.foW.ActivityRef#getName()
   * @see #getActivityRef()
   * @generated
   */
  EAttribute getActivityRef_Name();

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
     * The meta object literal for the '{@link de.protos.FlowOfWork.core.fow.foW.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.protos.FlowOfWork.core.fow.foW.impl.RoleImpl
     * @see de.protos.FlowOfWork.core.fow.foW.impl.FoWPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_PRODUCT__NAME = eINSTANCE.getWorkProduct_Name();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__NAME = eINSTANCE.getPort_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__TYPE = eINSTANCE.getPort_Type();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

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
     * The meta object literal for the '<em><b>Activity Refs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__ACTIVITY_REFS = eINSTANCE.getActivity_ActivityRefs();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY_REF__NAME = eINSTANCE.getActivityRef_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_REF__TYPE = eINSTANCE.getActivityRef_Type();

  }

} //FoWPackage
