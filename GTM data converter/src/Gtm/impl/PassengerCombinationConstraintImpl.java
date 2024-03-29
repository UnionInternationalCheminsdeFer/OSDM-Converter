/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.PassengerCombinationConstraint;
import Gtm.PassengerConstraint;
import Gtm.TravelerType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passenger Combination Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.PassengerCombinationConstraintImpl#getMaxNumber <em>Max Number</em>}</li>
 *   <li>{@link Gtm.impl.PassengerCombinationConstraintImpl#getMinNumber <em>Min Number</em>}</li>
 *   <li>{@link Gtm.impl.PassengerCombinationConstraintImpl#getPassengerType <em>Passenger Type</em>}</li>
 *   <li>{@link Gtm.impl.PassengerCombinationConstraintImpl#getPassengerConstraint <em>Passenger Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassengerCombinationConstraintImpl extends MinimalEObjectImpl.Container implements PassengerCombinationConstraint {
	/**
	 * The default value of the '{@link #getMaxNumber() <em>Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNumber() <em>Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumber()
	 * @generated
	 * @ordered
	 */
	protected int maxNumber = MAX_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinNumber() <em>Min Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinNumber() <em>Min Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNumber()
	 * @generated
	 * @ordered
	 */
	protected int minNumber = MIN_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerType() <em>Passenger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerType()
	 * @generated
	 * @ordered
	 */
	protected static final TravelerType PASSENGER_TYPE_EDEFAULT = TravelerType.ADULT;

	/**
	 * The cached value of the '{@link #getPassengerType() <em>Passenger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerType()
	 * @generated
	 * @ordered
	 */
	protected TravelerType passengerType = PASSENGER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPassengerConstraint() <em>Passenger Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerConstraint()
	 * @generated
	 * @ordered
	 */
	protected PassengerConstraint passengerConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerCombinationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.PASSENGER_COMBINATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNumber() {
		return maxNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumber(int newMaxNumber) {
		int oldMaxNumber = maxNumber;
		maxNumber = newMaxNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER, oldMaxNumber, maxNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinNumber() {
		return minNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinNumber(int newMinNumber) {
		int oldMinNumber = minNumber;
		minNumber = newMinNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MIN_NUMBER, oldMinNumber, minNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelerType getPassengerType() {
		return passengerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerType(TravelerType newPassengerType) {
		TravelerType oldPassengerType = passengerType;
		passengerType = newPassengerType == null ? PASSENGER_TYPE_EDEFAULT : newPassengerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE, oldPassengerType, passengerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerConstraint getPassengerConstraint() {
		if (passengerConstraint != null && passengerConstraint.eIsProxy()) {
			InternalEObject oldPassengerConstraint = (InternalEObject)passengerConstraint;
			passengerConstraint = (PassengerConstraint)eResolveProxy(oldPassengerConstraint);
			if (passengerConstraint != oldPassengerConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_CONSTRAINT, oldPassengerConstraint, passengerConstraint));
			}
		}
		return passengerConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerConstraint basicGetPassengerConstraint() {
		return passengerConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerConstraint(PassengerConstraint newPassengerConstraint) {
		PassengerConstraint oldPassengerConstraint = passengerConstraint;
		passengerConstraint = newPassengerConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_CONSTRAINT, oldPassengerConstraint, passengerConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER:
				return getMaxNumber();
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MIN_NUMBER:
				return getMinNumber();
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE:
				return getPassengerType();
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_CONSTRAINT:
				if (resolve) return getPassengerConstraint();
				return basicGetPassengerConstraint();
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
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER:
				setMaxNumber((Integer)newValue);
				return;
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MIN_NUMBER:
				setMinNumber((Integer)newValue);
				return;
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE:
				setPassengerType((TravelerType)newValue);
				return;
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_CONSTRAINT:
				setPassengerConstraint((PassengerConstraint)newValue);
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
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER:
				setMaxNumber(MAX_NUMBER_EDEFAULT);
				return;
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MIN_NUMBER:
				setMinNumber(MIN_NUMBER_EDEFAULT);
				return;
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE:
				setPassengerType(PASSENGER_TYPE_EDEFAULT);
				return;
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_CONSTRAINT:
				setPassengerConstraint((PassengerConstraint)null);
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
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER:
				return maxNumber != MAX_NUMBER_EDEFAULT;
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MIN_NUMBER:
				return minNumber != MIN_NUMBER_EDEFAULT;
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE:
				return passengerType != PASSENGER_TYPE_EDEFAULT;
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_CONSTRAINT:
				return passengerConstraint != null;
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
		result.append(" (maxNumber: ");
		result.append(maxNumber);
		result.append(", minNumber: ");
		result.append(minNumber);
		result.append(", passengerType: ");
		result.append(passengerType);
		result.append(')');
		return result.toString();
	}

} //PassengerCombinationConstraintImpl
