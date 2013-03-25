/**
 */
package de.protos.FlowOfWork.core.fow.foW;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Activity#getRole <em>Role</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Activity#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Activity#getOutPorts <em>Out Ports</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Activity#getSubActivities <em>Sub Activities</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Activity#getGuidances <em>Guidances</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Activity#getSteps <em>Steps</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Activity#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Activity#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' reference.
   * @see #setRole(Role)
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getActivity_Role()
   * @model
   * @generated
   */
  Role getRole();

  /**
   * Sets the value of the '{@link de.protos.FlowOfWork.core.fow.foW.Activity#getRole <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' reference.
   * @see #getRole()
   * @generated
   */
  void setRole(Role value);

  /**
   * Returns the value of the '<em><b>In Ports</b></em>' containment reference list.
   * The list contents are of type {@link de.protos.FlowOfWork.core.fow.foW.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Ports</em>' containment reference list.
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getActivity_InPorts()
   * @model containment="true"
   * @generated
   */
  EList<Port> getInPorts();

  /**
   * Returns the value of the '<em><b>Out Ports</b></em>' containment reference list.
   * The list contents are of type {@link de.protos.FlowOfWork.core.fow.foW.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Ports</em>' containment reference list.
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getActivity_OutPorts()
   * @model containment="true"
   * @generated
   */
  EList<Port> getOutPorts();

  /**
   * Returns the value of the '<em><b>Sub Activities</b></em>' containment reference list.
   * The list contents are of type {@link de.protos.FlowOfWork.core.fow.foW.ActivityRef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Activities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Activities</em>' containment reference list.
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getActivity_SubActivities()
   * @model containment="true"
   * @generated
   */
  EList<ActivityRef> getSubActivities();

  /**
   * Returns the value of the '<em><b>Guidances</b></em>' reference list.
   * The list contents are of type {@link de.protos.FlowOfWork.core.fow.foW.Guidance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guidances</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guidances</em>' reference list.
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getActivity_Guidances()
   * @model
   * @generated
   */
  EList<Guidance> getGuidances();

  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link de.protos.FlowOfWork.core.fow.foW.Step}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getActivity_Steps()
   * @model containment="true"
   * @generated
   */
  EList<Step> getSteps();

  /**
   * Returns the value of the '<em><b>Decisions</b></em>' containment reference list.
   * The list contents are of type {@link de.protos.FlowOfWork.core.fow.foW.Decision}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decisions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decisions</em>' containment reference list.
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getActivity_Decisions()
   * @model containment="true"
   * @generated
   */
  EList<Decision> getDecisions();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link de.protos.FlowOfWork.core.fow.foW.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getActivity_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // Activity
