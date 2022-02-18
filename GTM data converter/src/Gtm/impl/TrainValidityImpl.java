/**
 */
package Gtm.impl;

import Gtm.BoardingOrArrival;
import Gtm.CarrierConstraint;
import Gtm.GtmPackage;
import Gtm.ServiceConstraint;
import Gtm.TrainValidity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train Validity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.TrainValidityImpl#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Gtm.impl.TrainValidityImpl#getSerrviceConstraint <em>Serrvice Constraint</em>}</li>
 *   <li>{@link Gtm.impl.TrainValidityImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainValidityImpl extends MinimalEObjectImpl.Container implements TrainValidity {
	/**
	 * The cached value of the '{@link #getCarrierConstraint() <em>Carrier Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierConstraint()
	 * @generated
	 * @ordered
	 */
	protected CarrierConstraint carrierConstraint;

	/**
	 * The cached value of the '{@link #getSerrviceConstraint() <em>Serrvice Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerrviceConstraint()
	 * @generated
	 * @ordered
	 */
	protected ServiceConstraint serrviceConstraint;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final BoardingOrArrival SCOPE_EDEFAULT = BoardingOrArrival.BOARDING;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected BoardingOrArrival scope = SCOPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainValidityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.TRAIN_VALIDITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierConstraint getCarrierConstraint() {
		if (carrierConstraint != null && carrierConstraint.eIsProxy()) {
			InternalEObject oldCarrierConstraint = (InternalEObject)carrierConstraint;
			carrierConstraint = (CarrierConstraint)eResolveProxy(oldCarrierConstraint);
			if (carrierConstraint != oldCarrierConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.TRAIN_VALIDITY__CARRIER_CONSTRAINT, oldCarrierConstraint, carrierConstraint));
			}
		}
		return carrierConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierConstraint basicGetCarrierConstraint() {
		return carrierConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierConstraint(CarrierConstraint newCarrierConstraint) {
		CarrierConstraint oldCarrierConstraint = carrierConstraint;
		carrierConstraint = newCarrierConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAIN_VALIDITY__CARRIER_CONSTRAINT, oldCarrierConstraint, carrierConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint getSerrviceConstraint() {
		if (serrviceConstraint != null && serrviceConstraint.eIsProxy()) {
			InternalEObject oldSerrviceConstraint = (InternalEObject)serrviceConstraint;
			serrviceConstraint = (ServiceConstraint)eResolveProxy(oldSerrviceConstraint);
			if (serrviceConstraint != oldSerrviceConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.TRAIN_VALIDITY__SERRVICE_CONSTRAINT, oldSerrviceConstraint, serrviceConstraint));
			}
		}
		return serrviceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint basicGetSerrviceConstraint() {
		return serrviceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerrviceConstraint(ServiceConstraint newSerrviceConstraint) {
		ServiceConstraint oldSerrviceConstraint = serrviceConstraint;
		serrviceConstraint = newSerrviceConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAIN_VALIDITY__SERRVICE_CONSTRAINT, oldSerrviceConstraint, serrviceConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardingOrArrival getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(BoardingOrArrival newScope) {
		BoardingOrArrival oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAIN_VALIDITY__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.TRAIN_VALIDITY__CARRIER_CONSTRAINT:
				if (resolve) return getCarrierConstraint();
				return basicGetCarrierConstraint();
			case GtmPackage.TRAIN_VALIDITY__SERRVICE_CONSTRAINT:
				if (resolve) return getSerrviceConstraint();
				return basicGetSerrviceConstraint();
			case GtmPackage.TRAIN_VALIDITY__SCOPE:
				return getScope();
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
			case GtmPackage.TRAIN_VALIDITY__CARRIER_CONSTRAINT:
				setCarrierConstraint((CarrierConstraint)newValue);
				return;
			case GtmPackage.TRAIN_VALIDITY__SERRVICE_CONSTRAINT:
				setSerrviceConstraint((ServiceConstraint)newValue);
				return;
			case GtmPackage.TRAIN_VALIDITY__SCOPE:
				setScope((BoardingOrArrival)newValue);
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
			case GtmPackage.TRAIN_VALIDITY__CARRIER_CONSTRAINT:
				setCarrierConstraint((CarrierConstraint)null);
				return;
			case GtmPackage.TRAIN_VALIDITY__SERRVICE_CONSTRAINT:
				setSerrviceConstraint((ServiceConstraint)null);
				return;
			case GtmPackage.TRAIN_VALIDITY__SCOPE:
				setScope(SCOPE_EDEFAULT);
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
			case GtmPackage.TRAIN_VALIDITY__CARRIER_CONSTRAINT:
				return carrierConstraint != null;
			case GtmPackage.TRAIN_VALIDITY__SERRVICE_CONSTRAINT:
				return serrviceConstraint != null;
			case GtmPackage.TRAIN_VALIDITY__SCOPE:
				return scope != SCOPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (scope: ");
		result.append(scope);
		result.append(')');
		return result.toString();
	}

} //TrainValidityImpl
