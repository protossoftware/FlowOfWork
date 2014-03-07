/**
 */
package de.protos.FlowOfWork.core.fow.foW;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guidance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Guidance#getType <em>Type</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.Guidance#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getGuidance()
 * @model
 * @generated
 */
public interface Guidance extends NamedElement
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
   * @see #setType(GuidanceType)
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getGuidance_Type()
   * @model
   * @generated
   */
  GuidanceType getType();

  /**
   * Sets the value of the '{@link de.protos.FlowOfWork.core.fow.foW.Guidance#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(GuidanceType value);

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link de.protos.FlowOfWork.core.fow.foW.Link}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getGuidance_Links()
   * @model containment="true"
   * @generated
   */
  EList<Link> getLinks();

} // Guidance
