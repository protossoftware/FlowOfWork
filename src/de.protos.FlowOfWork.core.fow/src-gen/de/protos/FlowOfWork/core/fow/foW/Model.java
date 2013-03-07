/**
 */
package de.protos.FlowOfWork.core.fow.foW;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Model#getActivities <em>Activities</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Model#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Model#getWorkProducts <em>Work Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
   * The list contents are of type {@link de.protos.FlowOfWork.core.fow.foW.Activity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activities</em>' containment reference list.
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getModel_Activities()
   * @model containment="true"
   * @generated
   */
  EList<Activity> getActivities();

  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link de.protos.FlowOfWork.core.fow.foW.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getModel_Roles()
   * @model containment="true"
   * @generated
   */
  EList<Role> getRoles();

  /**
   * Returns the value of the '<em><b>Work Products</b></em>' containment reference list.
   * The list contents are of type {@link de.protos.FlowOfWork.core.fow.foW.WorkProduct}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Products</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Products</em>' containment reference list.
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getModel_WorkProducts()
   * @model containment="true"
   * @generated
   */
  EList<WorkProduct> getWorkProducts();

} // Model
