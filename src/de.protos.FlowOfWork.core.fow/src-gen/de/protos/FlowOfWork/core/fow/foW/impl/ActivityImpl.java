/**
 */
package de.protos.FlowOfWork.core.fow.foW.impl;

import de.protos.FlowOfWork.core.fow.foW.Activity;
import de.protos.FlowOfWork.core.fow.foW.ActivityRef;
import de.protos.FlowOfWork.core.fow.foW.FoWPackage;
import de.protos.FlowOfWork.core.fow.foW.Guidance;
import de.protos.FlowOfWork.core.fow.foW.Port;
import de.protos.FlowOfWork.core.fow.foW.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityImpl#getRole <em>Role</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityImpl#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityImpl#getOutPorts <em>Out Ports</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityImpl#getSubActivities <em>Sub Activities</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ActivityImpl#getGuidances <em>Guidances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends NamedElementImpl implements Activity
{
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
   * The cached value of the '{@link #getSubActivities() <em>Sub Activities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubActivities()
   * @generated
   * @ordered
   */
  protected EList<ActivityRef> subActivities;

  /**
   * The cached value of the '{@link #getGuidances() <em>Guidances</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuidances()
   * @generated
   * @ordered
   */
  protected EList<Guidance> guidances;

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
  public EList<ActivityRef> getSubActivities()
  {
    if (subActivities == null)
    {
      subActivities = new EObjectContainmentEList<ActivityRef>(ActivityRef.class, this, FoWPackage.ACTIVITY__SUB_ACTIVITIES);
    }
    return subActivities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Guidance> getGuidances()
  {
    if (guidances == null)
    {
      guidances = new EObjectResolvingEList<Guidance>(Guidance.class, this, FoWPackage.ACTIVITY__GUIDANCES);
    }
    return guidances;
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
      case FoWPackage.ACTIVITY__SUB_ACTIVITIES:
        return ((InternalEList<?>)getSubActivities()).basicRemove(otherEnd, msgs);
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
      case FoWPackage.ACTIVITY__ROLE:
        if (resolve) return getRole();
        return basicGetRole();
      case FoWPackage.ACTIVITY__IN_PORTS:
        return getInPorts();
      case FoWPackage.ACTIVITY__OUT_PORTS:
        return getOutPorts();
      case FoWPackage.ACTIVITY__SUB_ACTIVITIES:
        return getSubActivities();
      case FoWPackage.ACTIVITY__GUIDANCES:
        return getGuidances();
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
      case FoWPackage.ACTIVITY__SUB_ACTIVITIES:
        getSubActivities().clear();
        getSubActivities().addAll((Collection<? extends ActivityRef>)newValue);
        return;
      case FoWPackage.ACTIVITY__GUIDANCES:
        getGuidances().clear();
        getGuidances().addAll((Collection<? extends Guidance>)newValue);
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
      case FoWPackage.ACTIVITY__ROLE:
        setRole((Role)null);
        return;
      case FoWPackage.ACTIVITY__IN_PORTS:
        getInPorts().clear();
        return;
      case FoWPackage.ACTIVITY__OUT_PORTS:
        getOutPorts().clear();
        return;
      case FoWPackage.ACTIVITY__SUB_ACTIVITIES:
        getSubActivities().clear();
        return;
      case FoWPackage.ACTIVITY__GUIDANCES:
        getGuidances().clear();
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
      case FoWPackage.ACTIVITY__ROLE:
        return role != null;
      case FoWPackage.ACTIVITY__IN_PORTS:
        return inPorts != null && !inPorts.isEmpty();
      case FoWPackage.ACTIVITY__OUT_PORTS:
        return outPorts != null && !outPorts.isEmpty();
      case FoWPackage.ACTIVITY__SUB_ACTIVITIES:
        return subActivities != null && !subActivities.isEmpty();
      case FoWPackage.ACTIVITY__GUIDANCES:
        return guidances != null && !guidances.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActivityImpl
