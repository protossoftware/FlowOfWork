/**
 */
package de.protos.FlowOfWork.core.fow.foW;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Port#getType <em>Type</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Port#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject
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
   * @see #setType(WorkProduct)
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getPort_Type()
   * @model
   * @generated
   */
  WorkProduct getType();

  /**
   * Sets the value of the '{@link de.protos.FlowOfWork.core.fow.foW.Port#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(WorkProduct value);

  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(State)
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getPort_State()
   * @model
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link de.protos.FlowOfWork.core.fow.foW.Port#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

} // Port
