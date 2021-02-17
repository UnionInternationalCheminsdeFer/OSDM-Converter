/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.TotalPassengerCombinationConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Total Passenger Combination Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.TotalPassengerCombinationConstraintImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.TotalPassengerCombinationConstraintImpl#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.impl.TotalPassengerCombinationConstraintImpl#getMaxTotalPassengerWeight <em>Max Total Passenger Weight</em>}</li>
 *   <li>{@link Gtm.impl.TotalPassengerCombinationConstraintImpl#getMinTotalPassengerWeight <em>Min Total Passenger Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TotalPassengerCombinationConstraintImpl extends MinimalEObjectImpl.Container implements TotalPassengerCombinationConstraint {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataDescription() <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataDescription() <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDescription()
	 * @generated
	 * @ordered
	 */
	protected String dataDescription = DATA_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTotalPassengerWeight() <em>Max Total Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTotalPassengerWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_TOTAL_PASSENGER_WEIGHT_EDEFAULT = 999.0F;

	/**
	 * The cached value of the '{@link #getMaxTotalPassengerWeight() <em>Max Total Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTotalPassengerWeight()
	 * @generated
	 * @ordered
	 */
	protected float maxTotalPassengerWeight = MAX_TOTAL_PASSENGER_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTotalPassengerWeight() <em>Min Total Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTotalPassengerWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_TOTAL_PASSENGER_WEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinTotalPassengerWeight() <em>Min Total Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTotalPassengerWeight()
	 * @generated
	 * @ordered
	 */
	protected float minTotalPassengerWeight = MIN_TOTAL_PASSENGER_WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TotalPassengerCombinationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.TOTAL_PASSENGER_COMBINATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataDescription() {
		return dataDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDescription(String newDataDescription) {
		String oldDataDescription = dataDescription;
		dataDescription = newDataDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__DATA_DESCRIPTION, oldDataDescription, dataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxTotalPassengerWeight() {
		return maxTotalPassengerWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTotalPassengerWeight(float newMaxTotalPassengerWeight) {
		float oldMaxTotalPassengerWeight = maxTotalPassengerWeight;
		maxTotalPassengerWeight = newMaxTotalPassengerWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT, oldMaxTotalPassengerWeight, maxTotalPassengerWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinTotalPassengerWeight() {
		return minTotalPassengerWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTotalPassengerWeight(float newMinTotalPassengerWeight) {
		float oldMinTotalPassengerWeight = minTotalPassengerWeight;
		minTotalPassengerWeight = newMinTotalPassengerWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT, oldMinTotalPassengerWeight, minTotalPassengerWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__ID:
				return getId();
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__DATA_DESCRIPTION:
				return getDataDescription();
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT:
				return getMaxTotalPassengerWeight();
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT:
				return getMinTotalPassengerWeight();
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
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__ID:
				setId((String)newValue);
				return;
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription((String)newValue);
				return;
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT:
				setMaxTotalPassengerWeight((Float)newValue);
				return;
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT:
				setMinTotalPassengerWeight((Float)newValue);
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
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription(DATA_DESCRIPTION_EDEFAULT);
				return;
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT:
				setMaxTotalPassengerWeight(MAX_TOTAL_PASSENGER_WEIGHT_EDEFAULT);
				return;
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT:
				setMinTotalPassengerWeight(MIN_TOTAL_PASSENGER_WEIGHT_EDEFAULT);
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
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__DATA_DESCRIPTION:
				return DATA_DESCRIPTION_EDEFAULT == null ? dataDescription != null : !DATA_DESCRIPTION_EDEFAULT.equals(dataDescription);
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT:
				return maxTotalPassengerWeight != MAX_TOTAL_PASSENGER_WEIGHT_EDEFAULT;
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT:
				return minTotalPassengerWeight != MIN_TOTAL_PASSENGER_WEIGHT_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", dataDescription: ");
		result.append(dataDescription);
		result.append(", maxTotalPassengerWeight: ");
		result.append(maxTotalPassengerWeight);
		result.append(", minTotalPassengerWeight: ");
		result.append(minTotalPassengerWeight);
		result.append(')');
		return result.toString();
	}

} //TotalPassengerCombinationConstraintImpl
