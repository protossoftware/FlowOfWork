/**
 */
package de.protos.FlowOfWork.core.fow.foW;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.WorkProduct#getType <em>Type</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.WorkProduct#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getWorkProduct()
 * @model
 * @generated
 */
public interface WorkProduct extends NamedElement
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
   * @see #setType(WorkProductType)
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getWorkProduct_Type()
   * @model
   * @generated
   */
  WorkProductType getType();

  /**
   * Sets the value of the '{@link de.protos.FlowOfWork.core.fow.foW.WorkProduct#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(WorkProductType value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link de.protos.FlowOfWork.core.fow.foW.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getWorkProduct_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // WorkProduct
