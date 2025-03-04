/**
 */
package Gtm.impl;

import Gtm.CarrierGroup;
import Gtm.CarrierGroups;
import Gtm.GtmPackage;

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
 * An implementation of the model object '<em><b>Carrier Groups</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.CarrierGroupsImpl#getCarrierGroups <em>Carrier Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierGroupsImpl extends MinimalEObjectImpl.Container implements CarrierGroups {
	/**
	 * The cached value of the '{@link #getCarrierGroups() <em>Carrier Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CarrierGroup> carrierGroups;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierGroupsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.CARRIER_GROUPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarrierGroup> getCarrierGroups() {
		if (carrierGroups == null) {
			carrierGroups = new EObjectContainmentEList<CarrierGroup>(CarrierGroup.class, this, GtmPackage.CARRIER_GROUPS__CARRIER_GROUPS);
		}
		return carrierGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.CARRIER_GROUPS__CARRIER_GROUPS:
				return ((InternalEList<?>)getCarrierGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.CARRIER_GROUPS__CARRIER_GROUPS:
				return getCarrierGroups();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GtmPackage.CARRIER_GROUPS__CARRIER_GROUPS:
				getCarrierGroups().clear();
				getCarrierGroups().addAll((Collection<? extends CarrierGroup>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GtmPackage.CARRIER_GROUPS__CARRIER_GROUPS:
				getCarrierGroups().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GtmPackage.CARRIER_GROUPS__CARRIER_GROUPS:
				return carrierGroups != null && !carrierGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CarrierGroupsImpl
