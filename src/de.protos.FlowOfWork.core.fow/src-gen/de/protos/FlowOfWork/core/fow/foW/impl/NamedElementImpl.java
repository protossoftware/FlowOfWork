/**
 */
package de.protos.FlowOfWork.core.fow.foW.impl;

import de.protos.FlowOfWork.core.fow.foW.FoWPackage;
import de.protos.FlowOfWork.core.fow.foW.NamedElement;
import de.protos.FlowOfWork.core.fow.foW.Textfield;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.NamedElementImpl#getTextfield <em>Textfield</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedElementImpl extends MinimalEObjectImpl.Container implements NamedElement
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTextfield() <em>Textfield</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextfield()
   * @generated
   * @ordered
   */
  protected Textfield textfield;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamedElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FoWPackage.Literals.NAMED_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FoWPackage.NAMED_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Textfield getTextfield()
  {
    return textfield;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTextfield(Textfield newTextfield, NotificationChain msgs)
  {
    Textfield oldTextfield = textfield;
    textfield = newTextfield;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FoWPackage.NAMED_ELEMENT__TEXTFIELD, oldTextfield, newTextfield);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextfield(Textfield newTextfield)
  {
    if (newTextfield != textfield)
    {
      NotificationChain msgs = null;
      if (textfield != null)
        msgs = ((InternalEObject)textfield).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FoWPackage.NAMED_ELEMENT__TEXTFIELD, null, msgs);
      if (newTextfield != null)
        msgs = ((InternalEObject)newTextfield).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FoWPackage.NAMED_ELEMENT__TEXTFIELD, null, msgs);
      msgs = basicSetTextfield(newTextfield, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FoWPackage.NAMED_ELEMENT__TEXTFIELD, newTextfield, newTextfield));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FoWPackage.NAMED_ELEMENT__TEXTFIELD:
        return basicSetTextfield(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FoWPackage.NAMED_ELEMENT__NAME:
        return getName();
      case FoWPackage.NAMED_ELEMENT__TEXTFIELD:
        return getTextfield();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FoWPackage.NAMED_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case FoWPackage.NAMED_ELEMENT__TEXTFIELD:
        setTextfield((Textfield)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FoWPackage.NAMED_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FoWPackage.NAMED_ELEMENT__TEXTFIELD:
        setTextfield((Textfield)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FoWPackage.NAMED_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FoWPackage.NAMED_ELEMENT__TEXTFIELD:
        return textfield != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //NamedElementImpl
