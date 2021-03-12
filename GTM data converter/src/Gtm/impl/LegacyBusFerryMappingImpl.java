/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyBusFerryMapping;
import Gtm.ServiceConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Bus Ferry Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyBusFerryMappingImpl#getBusServiceConstraint <em>Bus Service Constraint</em>}</li>
 *   <li>{@link Gtm.impl.LegacyBusFerryMappingImpl#getFerryConstraint <em>Ferry Constraint</em>}</li>
 *   <li>{@link Gtm.impl.LegacyBusFerryMappingImpl#getBusFerryConstraint <em>Bus Ferry Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyBusFerryMappingImpl extends MinimalEObjectImpl.Container implements LegacyBusFerryMapping {
	/**
	 * The cached value of the '{@link #getBusServiceConstraint() <em>Bus Service Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusServiceConstraint()
	 * @generated
	 * @ordered
	 */
	protected ServiceConstraint busServiceConstraint;

	/**
	 * The cached value of the '{@link #getFerryConstraint() <em>Ferry Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFerryConstraint()
	 * @generated
	 * @ordered
	 */
	protected ServiceConstraint ferryConstraint;

	/**
	 * The cached value of the '{@link #getBusFerryConstraint() <em>Bus Ferry Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusFerryConstraint()
	 * @generated
	 * @ordered
	 */
	protected ServiceConstraint busFerryConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyBusFerryMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_BUS_FERRY_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint getBusServiceConstraint() {
		if (busServiceConstraint != null && busServiceConstraint.eIsProxy()) {
			InternalEObject oldBusServiceConstraint = (InternalEObject)busServiceConstraint;
			busServiceConstraint = (ServiceConstraint)eResolveProxy(oldBusServiceConstraint);
			if (busServiceConstraint != oldBusServiceConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.LEGACY_BUS_FERRY_MAPPING__BUS_SERVICE_CONSTRAINT, oldBusServiceConstraint, busServiceConstraint));
			}
		}
		return busServiceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint basicGetBusServiceConstraint() {
		return busServiceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusServiceConstraint(ServiceConstraint newBusServiceConstraint) {
		ServiceConstraint oldBusServiceConstraint = busServiceConstraint;
		busServiceConstraint = newBusServiceConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BUS_FERRY_MAPPING__BUS_SERVICE_CONSTRAINT, oldBusServiceConstraint, busServiceConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint getFerryConstraint() {
		if (ferryConstraint != null && ferryConstraint.eIsProxy()) {
			InternalEObject oldFerryConstraint = (InternalEObject)ferryConstraint;
			ferryConstraint = (ServiceConstraint)eResolveProxy(oldFerryConstraint);
			if (ferryConstraint != oldFerryConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.LEGACY_BUS_FERRY_MAPPING__FERRY_CONSTRAINT, oldFerryConstraint, ferryConstraint));
			}
		}
		return ferryConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint basicGetFerryConstraint() {
		return ferryConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFerryConstraint(ServiceConstraint newFerryConstraint) {
		ServiceConstraint oldFerryConstraint = ferryConstraint;
		ferryConstraint = newFerryConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BUS_FERRY_MAPPING__FERRY_CONSTRAINT, oldFerryConstraint, ferryConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint getBusFerryConstraint() {
		if (busFerryConstraint != null && busFerryConstraint.eIsProxy()) {
			InternalEObject oldBusFerryConstraint = (InternalEObject)busFerryConstraint;
			busFerryConstraint = (ServiceConstraint)eResolveProxy(oldBusFerryConstraint);
			if (busFerryConstraint != oldBusFerryConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.LEGACY_BUS_FERRY_MAPPING__BUS_FERRY_CONSTRAINT, oldBusFerryConstraint, busFerryConstraint));
			}
		}
		return busFerryConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint basicGetBusFerryConstraint() {
		return busFerryConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusFerryConstraint(ServiceConstraint newBusFerryConstraint) {
		ServiceConstraint oldBusFerryConstraint = busFerryConstraint;
		busFerryConstraint = newBusFerryConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BUS_FERRY_MAPPING__BUS_FERRY_CONSTRAINT, oldBusFerryConstraint, busFerryConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.LEGACY_BUS_FERRY_MAPPING__BUS_SERVICE_CONSTRAINT:
				if (resolve) return getBusServiceConstraint();
				return basicGetBusServiceConstraint();
			case GtmPackage.LEGACY_BUS_FERRY_MAPPING__FERRY_CONSTRAINT:
				if (resolve) return getFerryConstraint();
				return basicGetFerryConstraint();
			case GtmPackage.LEGACY_BUS_FERRY_MAPPING__BUS_FERRY_CONSTRAINT:
				if (resolve) return getBusFerryConstraint();
				return basicGetBusFerryConstraint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GtmPackage.LEGACY_BUS_FERRY_MAPPING__BUS_SERVICE_CONSTRAINT:
				setBusServiceConstraint((ServiceConstraint)newValue);
				return;
			case GtmPackage.LEGACY_BUS_FERRY_MAPPING__FERRY_CONSTRAINT:
				setFerryConstraint((ServiceConstraint)newValue);
				return;
			case GtmPackage.LEGACY_BUS_FERRY_MAPPING__BUS_FERRY_CONSTRAINT:
				setBusFerryConstraint((ServiceConstraint)newValue);
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
			case GtmPackage.LEGACY_BUS_FERRY_MAPPING__BUS_SERVICE_CONSTRAINT:
				setBusServiceConstraint((ServiceConstraint)null);
				return;
			case GtmPackage.LEGACY_BUS_FERRY_MAPPING__FERRY_CONSTRAINT:
				setFerryConstraint((ServiceConstraint)null);
				return;
			case GtmPackage.LEGACY_BUS_FERRY_MAPPING__BUS_FERRY_CONSTRAINT:
				setBusFerryConstraint((ServiceConstraint)null);
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
			case GtmPackage.LEGACY_BUS_FERRY_MAPPING__BUS_SERVICE_CONSTRAINT:
				return busServiceConstraint != null;
			case GtmPackage.LEGACY_BUS_FERRY_MAPPING__FERRY_CONSTRAINT:
				return ferryConstraint != null;
			case GtmPackage.LEGACY_BUS_FERRY_MAPPING__BUS_FERRY_CONSTRAINT:
				return busFerryConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //LegacyBusFerryMappingImpl
