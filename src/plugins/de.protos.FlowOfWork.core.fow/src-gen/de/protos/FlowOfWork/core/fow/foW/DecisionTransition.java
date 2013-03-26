/**
 */
package de.protos.FlowOfWork.core.fow.foW;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.DecisionTransition#getFrom <em>From</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.DecisionTransition#getTo <em>To</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.DecisionTransition#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getDecisionTransition()
 * @model
 * @generated
 */
public interface DecisionTransition extends Transition
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
   * @see #setFrom(Decision)
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getDecisionTransition_From()
   * @model
   * @generated
   */
  Decision getFrom();

  /**
   * Sets the value of the '{@link de.protos.FlowOfWork.core.fow.foW.DecisionTransition#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Decision value);

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
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getDecisionTransition_To()
   * @model
   * @generated
   */
  Node getTo();

  /**
   * Sets the value of the '{@link de.protos.FlowOfWork.core.fow.foW.DecisionTransition#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Node value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' attribute.
   * @see #setGuard(String)
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getDecisionTransition_Guard()
   * @model
   * @generated
   */
  String getGuard();

  /**
   * Sets the value of the '{@link de.protos.FlowOfWork.core.fow.foW.DecisionTransition#getGuard <em>Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' attribute.
   * @see #getGuard()
   * @generated
   */
  void setGuard(String value);

} // DecisionTransition
