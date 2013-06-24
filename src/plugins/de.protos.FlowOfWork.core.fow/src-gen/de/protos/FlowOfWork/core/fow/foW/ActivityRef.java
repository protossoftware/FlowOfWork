/**
 */
package de.protos.FlowOfWork.core.fow.foW;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.ActivityRef#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getActivityRef()
 * @model
 * @generated
 */
public interface ActivityRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Activity)
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getActivityRef_Type()
   * @model
   * @generated
   */
  Activity getType();

  /**
   * Sets the value of the '{@link de.protos.FlowOfWork.core.fow.foW.ActivityRef#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Activity value);

} // ActivityRef
