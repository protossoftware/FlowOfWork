/**
 */
package de.protos.FlowOfWork.core.fow.foW.impl;

import de.protos.FlowOfWork.core.fow.foW.Activity;
import de.protos.FlowOfWork.core.fow.foW.ActivityRef;
import de.protos.FlowOfWork.core.fow.foW.FoWPackage;
import de.protos.FlowOfWork.core.fow.foW.Port;
import de.protos.FlowOfWork.core.fow.foW.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityImpl#getRole <em>Role</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityImpl#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityImpl#getOutPorts <em>Out Ports</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityImpl#getActivityRefs <em>Activity Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity
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
   * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected Role role;

  /**
   * The cached value of the '{@link #getInPorts() <em>In Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> inPorts;

  /**
   * The cached value of the '{@link #getOutPorts() <em>Out Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> outPorts;

  /**
   * The cached value of the '{@link #getActivityRefs() <em>Activity Refs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityRefs()
   * @generated
   * @ordered
   */
  protected EList<ActivityRef> activityRefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityImpl()
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
    return FoWPackage.Literals.ACTIVITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FoWPackage.ACTIVITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getRole()
  {
    if (role != null && role.eIsProxy())
    {
      InternalEObject oldRole = (InternalEObject)role;
      role = (Role)eResolveProxy(oldRole);
      if (role != oldRole)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FoWPackage.ACTIVITY__ROLE, oldRole, role));
      }
    }
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetRole()
  {
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRole(Role newRole)
  {
    Role oldRole = role;
    role = newRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FoWPackage.ACTIVITY__ROLE, oldRole, role));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Port> getInPorts()
  {
    if (inPorts == null)
    {
      inPorts = new EObjectContainmentEList<Port>(Port.class, this, FoWPackage.ACTIVITY__IN_PORTS);
    }
    return inPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Port> getOutPorts()
  {
    if (outPorts == null)
    {
      outPorts = new EObjectContainmentEList<Port>(Port.class, this, FoWPackage.ACTIVITY__OUT_PORTS);
    }
    return outPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActivityRef> getActivityRefs()
  {
    if (activityRefs == null)
    {
      activityRefs = new EObjectContainmentEList<ActivityRef>(ActivityRef.class, this, FoWPackage.ACTIVITY__ACTIVITY_REFS);
    }
    return activityRefs;
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
      case FoWPackage.ACTIVITY__IN_PORTS:
        return ((InternalEList<?>)getInPorts()).basicRemove(otherEnd, msgs);
      case FoWPackage.ACTIVITY__OUT_PORTS:
        return ((InternalEList<?>)getOutPorts()).basicRemove(otherEnd, msgs);
      case FoWPackage.ACTIVITY__ACTIVITY_REFS:
        return ((InternalEList<?>)getActivityRefs()).basicRemove(otherEnd, msgs);
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
      case FoWPackage.ACTIVITY__NAME:
        return getName();
      case FoWPackage.ACTIVITY__ROLE:
        if (resolve) return getRole();
        return basicGetRole();
      case FoWPackage.ACTIVITY__IN_PORTS:
        return getInPorts();
      case FoWPackage.ACTIVITY__OUT_PORTS:
        return getOutPorts();
      case FoWPackage.ACTIVITY__ACTIVITY_REFS:
        return getActivityRefs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FoWPackage.ACTIVITY__NAME:
        setName((String)newValue);
        return;
      case FoWPackage.ACTIVITY__ROLE:
        setRole((Role)newValue);
        return;
      case FoWPackage.ACTIVITY__IN_PORTS:
        getInPorts().clear();
        getInPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case FoWPackage.ACTIVITY__OUT_PORTS:
        getOutPorts().clear();
        getOutPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case FoWPackage.ACTIVITY__ACTIVITY_REFS:
        getActivityRefs().clear();
        getActivityRefs().addAll((Collection<? extends ActivityRef>)newValue);
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
      case FoWPackage.ACTIVITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FoWPackage.ACTIVITY__ROLE:
        setRole((Role)null);
        return;
      case FoWPackage.ACTIVITY__IN_PORTS:
        getInPorts().clear();
        return;
      case FoWPackage.ACTIVITY__OUT_PORTS:
        getOutPorts().clear();
        return;
      case FoWPackage.ACTIVITY__ACTIVITY_REFS:
        getActivityRefs().clear();
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
      case FoWPackage.ACTIVITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FoWPackage.ACTIVITY__ROLE:
        return role != null;
      case FoWPackage.ACTIVITY__IN_PORTS:
        return inPorts != null && !inPorts.isEmpty();
      case FoWPackage.ACTIVITY__OUT_PORTS:
        return outPorts != null && !outPorts.isEmpty();
      case FoWPackage.ACTIVITY__ACTIVITY_REFS:
        return activityRefs != null && !activityRefs.isEmpty();
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

} //ActivityImpl
