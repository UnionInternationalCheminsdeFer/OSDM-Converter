/**
 */
package Gtm.impl;

import Gtm.Calendar;
import Gtm.ExcludedTimeRange;
import Gtm.GtmPackage;
import Gtm.ReturnValidityConstraint;
import Gtm.TrainValidity;
import Gtm.TravelValidityConstraint;
import Gtm.TravelValidityType;
import Gtm.TripAllocationConstraint;
import Gtm.TripInterruptionConstraint;
import Gtm.ValidityRange;

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
 * An implementation of the model object '<em><b>Travel Validity Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getValidDays <em>Valid Days</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getTravelDays <em>Travel Days</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getRange <em>Range</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getReturnConstraint <em>Return Constraint</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getExcludedTimeRange <em>Excluded Time Range</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getTrainValidity <em>Train Validity</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getValidityType <em>Validity Type</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getTripInterruptionConstraint <em>Trip Interruption Constraint</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getTripAllocationConstraint <em>Trip Allocation Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TravelValidityConstraintImpl extends MinimalEObjectImpl.Container implements TravelValidityConstraint {
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
	 * The cached value of the '{@link #getValidDays() <em>Valid Days</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDays()
	 * @generated
	 * @ordered
	 */
	protected Calendar validDays;

	/**
	 * The default value of the '{@link #getTravelDays() <em>Travel Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelDays()
	 * @generated
	 * @ordered
	 */
	protected static final int TRAVEL_DAYS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTravelDays() <em>Travel Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelDays()
	 * @generated
	 * @ordered
	 */
	protected int travelDays = TRAVEL_DAYS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected ValidityRange range;

	/**
	 * The cached value of the '{@link #getReturnConstraint() <em>Return Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnConstraint()
	 * @generated
	 * @ordered
	 */
	protected ReturnValidityConstraint returnConstraint;

	/**
	 * The cached value of the '{@link #getExcludedTimeRange() <em>Excluded Time Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedTimeRange()
	 * @generated
	 * @ordered
	 */
	protected EList<ExcludedTimeRange> excludedTimeRange;

	/**
	 * The cached value of the '{@link #getTrainValidity() <em>Train Validity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainValidity()
	 * @generated
	 * @ordered
	 */
	protected TrainValidity trainValidity;

	/**
	 * The default value of the '{@link #getValidityType() <em>Validity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityType()
	 * @generated
	 * @ordered
	 */
	protected static final TravelValidityType VALIDITY_TYPE_EDEFAULT = TravelValidityType.SINGLE_TRIP;

	/**
	 * The cached value of the '{@link #getValidityType() <em>Validity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityType()
	 * @generated
	 * @ordered
	 */
	protected TravelValidityType validityType = VALIDITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTripInterruptionConstraint() <em>Trip Interruption Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripInterruptionConstraint()
	 * @generated
	 * @ordered
	 */
	protected TripInterruptionConstraint tripInterruptionConstraint;

	/**
	 * The cached value of the '{@link #getTripAllocationConstraint() <em>Trip Allocation Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripAllocationConstraint()
	 * @generated
	 * @ordered
	 */
	protected TripAllocationConstraint tripAllocationConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelValidityConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION, oldDataDescription, dataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getValidDays() {
		if (validDays != null && validDays.eIsProxy()) {
			InternalEObject oldValidDays = (InternalEObject)validDays;
			validDays = (Calendar)eResolveProxy(oldValidDays);
			if (validDays != oldValidDays) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS, oldValidDays, validDays));
			}
		}
		return validDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar basicGetValidDays() {
		return validDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidDays(Calendar newValidDays) {
		Calendar oldValidDays = validDays;
		validDays = newValidDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS, oldValidDays, validDays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExcludedTimeRange> getExcludedTimeRange() {
		if (excludedTimeRange == null) {
			excludedTimeRange = new EObjectContainmentEList<ExcludedTimeRange>(ExcludedTimeRange.class, this, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE);
		}
		return excludedTimeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainValidity getTrainValidity() {
		return trainValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrainValidity(TrainValidity newTrainValidity, NotificationChain msgs) {
		TrainValidity oldTrainValidity = trainValidity;
		trainValidity = newTrainValidity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY, oldTrainValidity, newTrainValidity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainValidity(TrainValidity newTrainValidity) {
		if (newTrainValidity != trainValidity) {
			NotificationChain msgs = null;
			if (trainValidity != null)
				msgs = ((InternalEObject)trainValidity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY, null, msgs);
			if (newTrainValidity != null)
				msgs = ((InternalEObject)newTrainValidity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY, null, msgs);
			msgs = basicSetTrainValidity(newTrainValidity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY, newTrainValidity, newTrainValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelValidityType getValidityType() {
		return validityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityType(TravelValidityType newValidityType) {
		TravelValidityType oldValidityType = validityType;
		validityType = newValidityType == null ? VALIDITY_TYPE_EDEFAULT : newValidityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALIDITY_TYPE, oldValidityType, validityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripInterruptionConstraint getTripInterruptionConstraint() {
		return tripInterruptionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTripInterruptionConstraint(TripInterruptionConstraint newTripInterruptionConstraint, NotificationChain msgs) {
		TripInterruptionConstraint oldTripInterruptionConstraint = tripInterruptionConstraint;
		tripInterruptionConstraint = newTripInterruptionConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT, oldTripInterruptionConstraint, newTripInterruptionConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTripInterruptionConstraint(TripInterruptionConstraint newTripInterruptionConstraint) {
		if (newTripInterruptionConstraint != tripInterruptionConstraint) {
			NotificationChain msgs = null;
			if (tripInterruptionConstraint != null)
				msgs = ((InternalEObject)tripInterruptionConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT, null, msgs);
			if (newTripInterruptionConstraint != null)
				msgs = ((InternalEObject)newTripInterruptionConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT, null, msgs);
			msgs = basicSetTripInterruptionConstraint(newTripInterruptionConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT, newTripInterruptionConstraint, newTripInterruptionConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripAllocationConstraint getTripAllocationConstraint() {
		return tripAllocationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTripAllocationConstraint(TripAllocationConstraint newTripAllocationConstraint, NotificationChain msgs) {
		TripAllocationConstraint oldTripAllocationConstraint = tripAllocationConstraint;
		tripAllocationConstraint = newTripAllocationConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT, oldTripAllocationConstraint, newTripAllocationConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTripAllocationConstraint(TripAllocationConstraint newTripAllocationConstraint) {
		if (newTripAllocationConstraint != tripAllocationConstraint) {
			NotificationChain msgs = null;
			if (tripAllocationConstraint != null)
				msgs = ((InternalEObject)tripAllocationConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT, null, msgs);
			if (newTripAllocationConstraint != null)
				msgs = ((InternalEObject)newTripAllocationConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT, null, msgs);
			msgs = basicSetTripAllocationConstraint(newTripAllocationConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT, newTripAllocationConstraint, newTripAllocationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTravelDays() {
		return travelDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelDays(int newTravelDays) {
		int oldTravelDays = travelDays;
		travelDays = newTravelDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS, oldTravelDays, travelDays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidityRange getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(ValidityRange newRange, NotificationChain msgs) {
		ValidityRange oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(ValidityRange newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnValidityConstraint getReturnConstraint() {
		return returnConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnConstraint(ReturnValidityConstraint newReturnConstraint, NotificationChain msgs) {
		ReturnValidityConstraint oldReturnConstraint = returnConstraint;
		returnConstraint = newReturnConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT, oldReturnConstraint, newReturnConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnConstraint(ReturnValidityConstraint newReturnConstraint) {
		if (newReturnConstraint != returnConstraint) {
			NotificationChain msgs = null;
			if (returnConstraint != null)
				msgs = ((InternalEObject)returnConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT, null, msgs);
			if (newReturnConstraint != null)
				msgs = ((InternalEObject)newReturnConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT, null, msgs);
			msgs = basicSetReturnConstraint(newReturnConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT, newReturnConstraint, newReturnConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE:
				return basicSetRange(null, msgs);
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT:
				return basicSetReturnConstraint(null, msgs);
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE:
				return ((InternalEList<?>)getExcludedTimeRange()).basicRemove(otherEnd, msgs);
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY:
				return basicSetTrainValidity(null, msgs);
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT:
				return basicSetTripInterruptionConstraint(null, msgs);
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT:
				return basicSetTripAllocationConstraint(null, msgs);
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
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__ID:
				return getId();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION:
				return getDataDescription();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS:
				if (resolve) return getValidDays();
				return basicGetValidDays();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS:
				return getTravelDays();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE:
				return getRange();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT:
				return getReturnConstraint();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE:
				return getExcludedTimeRange();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY:
				return getTrainValidity();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALIDITY_TYPE:
				return getValidityType();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT:
				return getTripInterruptionConstraint();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT:
				return getTripAllocationConstraint();
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
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__ID:
				setId((String)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription((String)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS:
				setValidDays((Calendar)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS:
				setTravelDays((Integer)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE:
				setRange((ValidityRange)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT:
				setReturnConstraint((ReturnValidityConstraint)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE:
				getExcludedTimeRange().clear();
				getExcludedTimeRange().addAll((Collection<? extends ExcludedTimeRange>)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY:
				setTrainValidity((TrainValidity)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALIDITY_TYPE:
				setValidityType((TravelValidityType)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT:
				setTripInterruptionConstraint((TripInterruptionConstraint)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT:
				setTripAllocationConstraint((TripAllocationConstraint)newValue);
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
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription(DATA_DESCRIPTION_EDEFAULT);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS:
				setValidDays((Calendar)null);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS:
				setTravelDays(TRAVEL_DAYS_EDEFAULT);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE:
				setRange((ValidityRange)null);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT:
				setReturnConstraint((ReturnValidityConstraint)null);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE:
				getExcludedTimeRange().clear();
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY:
				setTrainValidity((TrainValidity)null);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALIDITY_TYPE:
				setValidityType(VALIDITY_TYPE_EDEFAULT);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT:
				setTripInterruptionConstraint((TripInterruptionConstraint)null);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT:
				setTripAllocationConstraint((TripAllocationConstraint)null);
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
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION:
				return DATA_DESCRIPTION_EDEFAULT == null ? dataDescription != null : !DATA_DESCRIPTION_EDEFAULT.equals(dataDescription);
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS:
				return validDays != null;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS:
				return travelDays != TRAVEL_DAYS_EDEFAULT;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE:
				return range != null;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT:
				return returnConstraint != null;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE:
				return excludedTimeRange != null && !excludedTimeRange.isEmpty();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY:
				return trainValidity != null;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALIDITY_TYPE:
				return validityType != VALIDITY_TYPE_EDEFAULT;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT:
				return tripInterruptionConstraint != null;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT:
				return tripAllocationConstraint != null;
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
		result.append(", travelDays: ");
		result.append(travelDays);
		result.append(", validityType: ");
		result.append(validityType);
		result.append(')');
		return result.toString();
	}

} //TravelValidityConstraintImpl
