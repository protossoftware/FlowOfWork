/**
 */
package de.protos.FlowOfWork.core.fow.foW;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.NamedElement#getTextfield <em>Textfield</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getNamedElement()
 * @model
 * @generated
 */
public interface NamedElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getNamedElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.protos.FlowOfWork.core.fow.foW.NamedElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Textfield</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Textfield</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Textfield</em>' containment reference.
   * @see #setTextfield(Textfield)
   * @see de.protos.FlowOfWork.core.fow.foW.FoWPackage#getNamedElement_Textfield()
   * @model containment="true"
   * @generated
   */
  Textfield getTextfield();

  /**
   * Sets the value of the '{@link de.protos.FlowOfWork.core.fow.foW.NamedElement#getTextfield <em>Textfield</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Textfield</em>' containment reference.
   * @see #getTextfield()
   * @generated
   */
  void setTextfield(Textfield value);

} // NamedElement
