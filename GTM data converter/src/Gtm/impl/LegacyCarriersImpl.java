/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyCarrier;
import Gtm.LegacyCarriers;

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
 * An implementation of the model object '<em><b>Legacy Carriers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyCarriersImpl#getLegacyCarrier <em>Legacy Carrier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyCarriersImpl extends MinimalEObjectImpl.Container implements LegacyCarriers {
	/**
	 * The cached value of the '{@link #getLegacyCarrier() <em>Legacy Carrier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyCarrier()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyCarrier> legacyCarrier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyCarriersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_CARRIERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyCarrier> getLegacyCarrier() {
		if (legacyCarrier == null) {
			legacyCarrier = new EObjectContainmentEList<LegacyCarrier>(LegacyCarrier.class, this, GtmPackage.LEGACY_CARRIERS__LEGACY_CARRIER);
		}
		return legacyCarrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY_CARRIERS__LEGACY_CARRIER:
				return ((InternalEList<?>)getLegacyCarrier()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_CARRIERS__LEGACY_CARRIER:
				return getLegacyCarrier();
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
			case GtmPackage.LEGACY_CARRIERS__LEGACY_CARRIER:
				getLegacyCarrier().clear();
				getLegacyCarrier().addAll((Collection<? extends LegacyCarrier>)newValue);
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
			case GtmPackage.LEGACY_CARRIERS__LEGACY_CARRIER:
				getLegacyCarrier().clear();
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
			case GtmPackage.LEGACY_CARRIERS__LEGACY_CARRIER:
				return legacyCarrier != null && !legacyCarrier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LegacyCarriersImpl
