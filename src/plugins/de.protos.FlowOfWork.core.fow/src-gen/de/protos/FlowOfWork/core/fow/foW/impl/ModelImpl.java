/**
 */
package de.protos.FlowOfWork.core.fow.foW.impl;

import de.protos.FlowOfWork.core.fow.foW.Activity;
import de.protos.FlowOfWork.core.fow.foW.FoWPackage;
import de.protos.FlowOfWork.core.fow.foW.Guidance;
import de.protos.FlowOfWork.core.fow.foW.GuidanceType;
import de.protos.FlowOfWork.core.fow.foW.Model;
import de.protos.FlowOfWork.core.fow.foW.Role;
import de.protos.FlowOfWork.core.fow.foW.WorkProduct;
import de.protos.FlowOfWork.core.fow.foW.WorkProductType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ModelImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ModelImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ModelImpl#getWorkProducts <em>Work Products</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ModelImpl#getWorkProductTypes <em>Work Product Types</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ModelImpl#getGuidances <em>Guidances</em>}</li>
 *   <li>{@link de.protos.FlowOfWork.core.fow.foW.impl.ModelImpl#getGuidanceTypes <em>Guidance Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivities()
   * @generated
   * @ordered
   */
  protected EList<Activity> activities;

  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<Role> roles;

  /**
   * The cached value of the '{@link #getWorkProducts() <em>Work Products</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkProducts()
   * @generated
   * @ordered
   */
  protected EList<WorkProduct> workProducts;

  /**
   * The cached value of the '{@link #getWorkProductTypes() <em>Work Product Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkProductTypes()
   * @generated
   * @ordered
   */
  protected EList<WorkProductType> workProductTypes;

  /**
   * The cached value of the '{@link #getGuidances() <em>Guidances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuidances()
   * @generated
   * @ordered
   */
  protected EList<Guidance> guidances;

  /**
   * The cached value of the '{@link #getGuidanceTypes() <em>Guidance Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuidanceTypes()
   * @generated
   * @ordered
   */
  protected EList<GuidanceType> guidanceTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return FoWPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Activity> getActivities()
  {
    if (activities == null)
    {
      activities = new EObjectContainmentEList<Activity>(Activity.class, this, FoWPackage.MODEL__ACTIVITIES);
    }
    return activities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectContainmentEList<Role>(Role.class, this, FoWPackage.MODEL__ROLES);
    }
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkProduct> getWorkProducts()
  {
    if (workProducts == null)
    {
      workProducts = new EObjectContainmentEList<WorkProduct>(WorkProduct.class, this, FoWPackage.MODEL__WORK_PRODUCTS);
    }
    return workProducts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkProductType> getWorkProductTypes()
  {
    if (workProductTypes == null)
    {
      workProductTypes = new EObjectContainmentEList<WorkProductType>(WorkProductType.class, this, FoWPackage.MODEL__WORK_PRODUCT_TYPES);
    }
    return workProductTypes;
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
      guidances = new EObjectContainmentEList<Guidance>(Guidance.class, this, FoWPackage.MODEL__GUIDANCES);
    }
    return guidances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GuidanceType> getGuidanceTypes()
  {
    if (guidanceTypes == null)
    {
      guidanceTypes = new EObjectContainmentEList<GuidanceType>(GuidanceType.class, this, FoWPackage.MODEL__GUIDANCE_TYPES);
    }
    return guidanceTypes;
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
      case FoWPackage.MODEL__ACTIVITIES:
        return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
      case FoWPackage.MODEL__ROLES:
        return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
      case FoWPackage.MODEL__WORK_PRODUCTS:
        return ((InternalEList<?>)getWorkProducts()).basicRemove(otherEnd, msgs);
      case FoWPackage.MODEL__WORK_PRODUCT_TYPES:
        return ((InternalEList<?>)getWorkProductTypes()).basicRemove(otherEnd, msgs);
      case FoWPackage.MODEL__GUIDANCES:
        return ((InternalEList<?>)getGuidances()).basicRemove(otherEnd, msgs);
      case FoWPackage.MODEL__GUIDANCE_TYPES:
        return ((InternalEList<?>)getGuidanceTypes()).basicRemove(otherEnd, msgs);
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
      case FoWPackage.MODEL__ACTIVITIES:
        return getActivities();
      case FoWPackage.MODEL__ROLES:
        return getRoles();
      case FoWPackage.MODEL__WORK_PRODUCTS:
        return getWorkProducts();
      case FoWPackage.MODEL__WORK_PRODUCT_TYPES:
        return getWorkProductTypes();
      case FoWPackage.MODEL__GUIDANCES:
        return getGuidances();
      case FoWPackage.MODEL__GUIDANCE_TYPES:
        return getGuidanceTypes();
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
      case FoWPackage.MODEL__ACTIVITIES:
        getActivities().clear();
        getActivities().addAll((Collection<? extends Activity>)newValue);
        return;
      case FoWPackage.MODEL__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends Role>)newValue);
        return;
      case FoWPackage.MODEL__WORK_PRODUCTS:
        getWorkProducts().clear();
        getWorkProducts().addAll((Collection<? extends WorkProduct>)newValue);
        return;
      case FoWPackage.MODEL__WORK_PRODUCT_TYPES:
        getWorkProductTypes().clear();
        getWorkProductTypes().addAll((Collection<? extends WorkProductType>)newValue);
        return;
      case FoWPackage.MODEL__GUIDANCES:
        getGuidances().clear();
        getGuidances().addAll((Collection<? extends Guidance>)newValue);
        return;
      case FoWPackage.MODEL__GUIDANCE_TYPES:
        getGuidanceTypes().clear();
        getGuidanceTypes().addAll((Collection<? extends GuidanceType>)newValue);
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
      case FoWPackage.MODEL__ACTIVITIES:
        getActivities().clear();
        return;
      case FoWPackage.MODEL__ROLES:
        getRoles().clear();
        return;
      case FoWPackage.MODEL__WORK_PRODUCTS:
        getWorkProducts().clear();
        return;
      case FoWPackage.MODEL__WORK_PRODUCT_TYPES:
        getWorkProductTypes().clear();
        return;
      case FoWPackage.MODEL__GUIDANCES:
        getGuidances().clear();
        return;
      case FoWPackage.MODEL__GUIDANCE_TYPES:
        getGuidanceTypes().clear();
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
      case FoWPackage.MODEL__ACTIVITIES:
        return activities != null && !activities.isEmpty();
      case FoWPackage.MODEL__ROLES:
        return roles != null && !roles.isEmpty();
      case FoWPackage.MODEL__WORK_PRODUCTS:
        return workProducts != null && !workProducts.isEmpty();
      case FoWPackage.MODEL__WORK_PRODUCT_TYPES:
        return workProductTypes != null && !workProductTypes.isEmpty();
      case FoWPackage.MODEL__GUIDANCES:
        return guidances != null && !guidances.isEmpty();
      case FoWPackage.MODEL__GUIDANCE_TYPES:
        return guidanceTypes != null && !guidanceTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
