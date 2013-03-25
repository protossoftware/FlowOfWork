/**
 */
package de.protos.FlowOfWork.core.fow.foW;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Initial Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.NonInitialTransition#getFrom <em>From</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.NonInitialTransition#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getNonInitialTransition()
 * @model
 * @generated
 */
public interface NonInitialTransition extends Transition
{
  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(Node)
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getNonInitialTransition_From()
   * @model
   * @generated
   */
  Node getFrom();

  /**
   * Sets the value of the '{@link de.protos.FlowOfWork.core.fow.foW.NonInitialTransition#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Node value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(Node)
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getNonInitialTransition_To()
   * @model
   * @generated
   */
  Node getTo();

  /**
   * Sets the value of the '{@link de.protos.FlowOfWork.core.fow.foW.NonInitialTransition#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Node value);

} // NonInitialTransition
