/**
 */
package Gtm.impl;

import Gtm.CarrierConstraint;
import Gtm.CombinationConstraint;
import Gtm.DataSource;
import Gtm.FareConstraintBundle;
import Gtm.FareType;
import Gtm.FulfillmentConstraint;
import Gtm.GtmPackage;
import Gtm.PersonalDataConstraint;
import Gtm.RegulatoryCondition;
import Gtm.SalesAvailabilityConstraint;
import Gtm.TotalPassengerCombinationConstraint;
import Gtm.TravelValidityConstraint;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fare Constraint Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.FareConstraintBundleImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.FareConstraintBundleImpl#getDefaultFareType <em>Default Fare Type</em>}</li>
 *   <li>{@link Gtm.impl.FareConstraintBundleImpl#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.impl.FareConstraintBundleImpl#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareConstraintBundleImpl#getSalesAvailability <em>Sales Availability</em>}</li>
 *   <li>{@link Gtm.impl.FareConstraintBundleImpl#getTravelValidity <em>Travel Validity</em>}</li>
 *   <li>{@link Gtm.impl.FareConstraintBundleImpl#getCombinationConstraint <em>Combination Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareConstraintBundleImpl#getPersonalDataConstraint <em>Personal Data Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareConstraintBundleImpl#getFulfillmentConstraint <em>Fulfillment Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareConstraintBundleImpl#getTotalPassengerConstraint <em>Total Passenger Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareConstraintBundleImpl#getDefaultRegulatoryConditions <em>Default Regulatory Conditions</em>}</li>
 *   <li>{@link Gtm.impl.FareConstraintBundleImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Gtm.impl.FareConstraintBundleImpl#getConvertedBundles <em>Converted Bundles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FareConstraintBundleImpl extends MinimalEObjectImpl.Container implements FareConstraintBundle {
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
	 * The default value of the '{@link #getDefaultFareType() <em>Default Fare Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFareType()
	 * @generated
	 * @ordered
	 */
	protected static final FareType DEFAULT_FARE_TYPE_EDEFAULT = FareType.NRT;

	/**
	 * The cached value of the '{@link #getDefaultFareType() <em>Default Fare Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFareType()
	 * @generated
	 * @ordered
	 */
	protected FareType defaultFareType = DEFAULT_FARE_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getCarrierConstraint() <em>Carrier Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierConstraint()
	 * @generated
	 * @ordered
	 */
	protected CarrierConstraint carrierConstraint;

	/**
	 * The cached value of the '{@link #getSalesAvailability() <em>Sales Availability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesAvailability()
	 * @generated
	 * @ordered
	 */
	protected SalesAvailabilityConstraint salesAvailability;

	/**
	 * The cached value of the '{@link #getTravelValidity() <em>Travel Validity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelValidity()
	 * @generated
	 * @ordered
	 */
	protected TravelValidityConstraint travelValidity;

	/**
	 * The cached value of the '{@link #getCombinationConstraint() <em>Combination Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinationConstraint()
	 * @generated
	 * @ordered
	 */
	protected CombinationConstraint combinationConstraint;

	/**
	 * The cached value of the '{@link #getPersonalDataConstraint() <em>Personal Data Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalDataConstraint()
	 * @generated
	 * @ordered
	 */
	protected PersonalDataConstraint personalDataConstraint;

	/**
	 * The cached value of the '{@link #getFulfillmentConstraint() <em>Fulfillment Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentConstraint()
	 * @generated
	 * @ordered
	 */
	protected FulfillmentConstraint fulfillmentConstraint;

	/**
	 * The cached value of the '{@link #getTotalPassengerConstraint() <em>Total Passenger Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPassengerConstraint()
	 * @generated
	 * @ordered
	 */
	protected TotalPassengerCombinationConstraint totalPassengerConstraint;

	/**
	 * The cached value of the '{@link #getDefaultRegulatoryConditions() <em>Default Regulatory Conditions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRegulatoryConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<RegulatoryCondition> defaultRegulatoryConditions;

	/**
	 * The default value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected static final DataSource DATA_SOURCE_EDEFAULT = DataSource.MANUAL;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected DataSource dataSource = DATA_SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConvertedBundles() <em>Converted Bundles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertedBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<FareConstraintBundle> convertedBundles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FareConstraintBundleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_CONSTRAINT_BUNDLE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareType getDefaultFareType() {
		return defaultFareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultFareType(FareType newDefaultFareType) {
		FareType oldDefaultFareType = defaultFareType;
		defaultFareType = newDefaultFareType == null ? DEFAULT_FARE_TYPE_EDEFAULT : newDefaultFareType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_CONSTRAINT_BUNDLE__DEFAULT_FARE_TYPE, oldDefaultFareType, defaultFareType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_CONSTRAINT_BUNDLE__DATA_DESCRIPTION, oldDataDescription, dataDescription));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_CONSTRAINT_BUNDLE__CARRIER_CONSTRAINT, oldCarrierConstraint, carrierConstraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_CONSTRAINT_BUNDLE__CARRIER_CONSTRAINT, oldCarrierConstraint, carrierConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesAvailabilityConstraint getSalesAvailability() {
		if (salesAvailability != null && salesAvailability.eIsProxy()) {
			InternalEObject oldSalesAvailability = (InternalEObject)salesAvailability;
			salesAvailability = (SalesAvailabilityConstraint)eResolveProxy(oldSalesAvailability);
			if (salesAvailability != oldSalesAvailability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_CONSTRAINT_BUNDLE__SALES_AVAILABILITY, oldSalesAvailability, salesAvailability));
			}
		}
		return salesAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesAvailabilityConstraint basicGetSalesAvailability() {
		return salesAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalesAvailability(SalesAvailabilityConstraint newSalesAvailability) {
		SalesAvailabilityConstraint oldSalesAvailability = salesAvailability;
		salesAvailability = newSalesAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_CONSTRAINT_BUNDLE__SALES_AVAILABILITY, oldSalesAvailability, salesAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelValidityConstraint getTravelValidity() {
		if (travelValidity != null && travelValidity.eIsProxy()) {
			InternalEObject oldTravelValidity = (InternalEObject)travelValidity;
			travelValidity = (TravelValidityConstraint)eResolveProxy(oldTravelValidity);
			if (travelValidity != oldTravelValidity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_CONSTRAINT_BUNDLE__TRAVEL_VALIDITY, oldTravelValidity, travelValidity));
			}
		}
		return travelValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelValidityConstraint basicGetTravelValidity() {
		return travelValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelValidity(TravelValidityConstraint newTravelValidity) {
		TravelValidityConstraint oldTravelValidity = travelValidity;
		travelValidity = newTravelValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_CONSTRAINT_BUNDLE__TRAVEL_VALIDITY, oldTravelValidity, travelValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationConstraint getCombinationConstraint() {
		if (combinationConstraint != null && combinationConstraint.eIsProxy()) {
			InternalEObject oldCombinationConstraint = (InternalEObject)combinationConstraint;
			combinationConstraint = (CombinationConstraint)eResolveProxy(oldCombinationConstraint);
			if (combinationConstraint != oldCombinationConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_CONSTRAINT_BUNDLE__COMBINATION_CONSTRAINT, oldCombinationConstraint, combinationConstraint));
			}
		}
		return combinationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationConstraint basicGetCombinationConstraint() {
		return combinationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombinationConstraint(CombinationConstraint newCombinationConstraint) {
		CombinationConstraint oldCombinationConstraint = combinationConstraint;
		combinationConstraint = newCombinationConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_CONSTRAINT_BUNDLE__COMBINATION_CONSTRAINT, oldCombinationConstraint, combinationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataConstraint getPersonalDataConstraint() {
		if (personalDataConstraint != null && personalDataConstraint.eIsProxy()) {
			InternalEObject oldPersonalDataConstraint = (InternalEObject)personalDataConstraint;
			personalDataConstraint = (PersonalDataConstraint)eResolveProxy(oldPersonalDataConstraint);
			if (personalDataConstraint != oldPersonalDataConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_CONSTRAINT_BUNDLE__PERSONAL_DATA_CONSTRAINT, oldPersonalDataConstraint, personalDataConstraint));
			}
		}
		return personalDataConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataConstraint basicGetPersonalDataConstraint() {
		return personalDataConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonalDataConstraint(PersonalDataConstraint newPersonalDataConstraint) {
		PersonalDataConstraint oldPersonalDataConstraint = personalDataConstraint;
		personalDataConstraint = newPersonalDataConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_CONSTRAINT_BUNDLE__PERSONAL_DATA_CONSTRAINT, oldPersonalDataConstraint, personalDataConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FulfillmentConstraint getFulfillmentConstraint() {
		if (fulfillmentConstraint != null && fulfillmentConstraint.eIsProxy()) {
			InternalEObject oldFulfillmentConstraint = (InternalEObject)fulfillmentConstraint;
			fulfillmentConstraint = (FulfillmentConstraint)eResolveProxy(oldFulfillmentConstraint);
			if (fulfillmentConstraint != oldFulfillmentConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_CONSTRAINT_BUNDLE__FULFILLMENT_CONSTRAINT, oldFulfillmentConstraint, fulfillmentConstraint));
			}
		}
		return fulfillmentConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FulfillmentConstraint basicGetFulfillmentConstraint() {
		return fulfillmentConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFulfillmentConstraint(FulfillmentConstraint newFulfillmentConstraint) {
		FulfillmentConstraint oldFulfillmentConstraint = fulfillmentConstraint;
		fulfillmentConstraint = newFulfillmentConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_CONSTRAINT_BUNDLE__FULFILLMENT_CONSTRAINT, oldFulfillmentConstraint, fulfillmentConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalPassengerCombinationConstraint getTotalPassengerConstraint() {
		if (totalPassengerConstraint != null && totalPassengerConstraint.eIsProxy()) {
			InternalEObject oldTotalPassengerConstraint = (InternalEObject)totalPassengerConstraint;
			totalPassengerConstraint = (TotalPassengerCombinationConstraint)eResolveProxy(oldTotalPassengerConstraint);
			if (totalPassengerConstraint != oldTotalPassengerConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_CONSTRAINT_BUNDLE__TOTAL_PASSENGER_CONSTRAINT, oldTotalPassengerConstraint, totalPassengerConstraint));
			}
		}
		return totalPassengerConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalPassengerCombinationConstraint basicGetTotalPassengerConstraint() {
		return totalPassengerConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalPassengerConstraint(TotalPassengerCombinationConstraint newTotalPassengerConstraint) {
		TotalPassengerCombinationConstraint oldTotalPassengerConstraint = totalPassengerConstraint;
		totalPassengerConstraint = newTotalPassengerConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_CONSTRAINT_BUNDLE__TOTAL_PASSENGER_CONSTRAINT, oldTotalPassengerConstraint, totalPassengerConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegulatoryCondition> getDefaultRegulatoryConditions() {
		if (defaultRegulatoryConditions == null) {
			defaultRegulatoryConditions = new EDataTypeUniqueEList<RegulatoryCondition>(RegulatoryCondition.class, this, GtmPackage.FARE_CONSTRAINT_BUNDLE__DEFAULT_REGULATORY_CONDITIONS);
		}
		return defaultRegulatoryConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(DataSource newDataSource) {
		DataSource oldDataSource = dataSource;
		dataSource = newDataSource == null ? DATA_SOURCE_EDEFAULT : newDataSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_CONSTRAINT_BUNDLE__DATA_SOURCE, oldDataSource, dataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FareConstraintBundle> getConvertedBundles() {
		if (convertedBundles == null) {
			convertedBundles = new EObjectResolvingEList<FareConstraintBundle>(FareConstraintBundle.class, this, GtmPackage.FARE_CONSTRAINT_BUNDLE__CONVERTED_BUNDLES);
		}
		return convertedBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__ID:
				return getId();
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DEFAULT_FARE_TYPE:
				return getDefaultFareType();
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DATA_DESCRIPTION:
				return getDataDescription();
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__CARRIER_CONSTRAINT:
				if (resolve) return getCarrierConstraint();
				return basicGetCarrierConstraint();
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__SALES_AVAILABILITY:
				if (resolve) return getSalesAvailability();
				return basicGetSalesAvailability();
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__TRAVEL_VALIDITY:
				if (resolve) return getTravelValidity();
				return basicGetTravelValidity();
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__COMBINATION_CONSTRAINT:
				if (resolve) return getCombinationConstraint();
				return basicGetCombinationConstraint();
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__PERSONAL_DATA_CONSTRAINT:
				if (resolve) return getPersonalDataConstraint();
				return basicGetPersonalDataConstraint();
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__FULFILLMENT_CONSTRAINT:
				if (resolve) return getFulfillmentConstraint();
				return basicGetFulfillmentConstraint();
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__TOTAL_PASSENGER_CONSTRAINT:
				if (resolve) return getTotalPassengerConstraint();
				return basicGetTotalPassengerConstraint();
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DEFAULT_REGULATORY_CONDITIONS:
				return getDefaultRegulatoryConditions();
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DATA_SOURCE:
				return getDataSource();
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__CONVERTED_BUNDLES:
				return getConvertedBundles();
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
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__ID:
				setId((String)newValue);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DEFAULT_FARE_TYPE:
				setDefaultFareType((FareType)newValue);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DATA_DESCRIPTION:
				setDataDescription((String)newValue);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__CARRIER_CONSTRAINT:
				setCarrierConstraint((CarrierConstraint)newValue);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__SALES_AVAILABILITY:
				setSalesAvailability((SalesAvailabilityConstraint)newValue);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__TRAVEL_VALIDITY:
				setTravelValidity((TravelValidityConstraint)newValue);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__COMBINATION_CONSTRAINT:
				setCombinationConstraint((CombinationConstraint)newValue);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__PERSONAL_DATA_CONSTRAINT:
				setPersonalDataConstraint((PersonalDataConstraint)newValue);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__FULFILLMENT_CONSTRAINT:
				setFulfillmentConstraint((FulfillmentConstraint)newValue);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__TOTAL_PASSENGER_CONSTRAINT:
				setTotalPassengerConstraint((TotalPassengerCombinationConstraint)newValue);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DEFAULT_REGULATORY_CONDITIONS:
				getDefaultRegulatoryConditions().clear();
				getDefaultRegulatoryConditions().addAll((Collection<? extends RegulatoryCondition>)newValue);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DATA_SOURCE:
				setDataSource((DataSource)newValue);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__CONVERTED_BUNDLES:
				getConvertedBundles().clear();
				getConvertedBundles().addAll((Collection<? extends FareConstraintBundle>)newValue);
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
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DEFAULT_FARE_TYPE:
				setDefaultFareType(DEFAULT_FARE_TYPE_EDEFAULT);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DATA_DESCRIPTION:
				setDataDescription(DATA_DESCRIPTION_EDEFAULT);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__CARRIER_CONSTRAINT:
				setCarrierConstraint((CarrierConstraint)null);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__SALES_AVAILABILITY:
				setSalesAvailability((SalesAvailabilityConstraint)null);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__TRAVEL_VALIDITY:
				setTravelValidity((TravelValidityConstraint)null);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__COMBINATION_CONSTRAINT:
				setCombinationConstraint((CombinationConstraint)null);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__PERSONAL_DATA_CONSTRAINT:
				setPersonalDataConstraint((PersonalDataConstraint)null);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__FULFILLMENT_CONSTRAINT:
				setFulfillmentConstraint((FulfillmentConstraint)null);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__TOTAL_PASSENGER_CONSTRAINT:
				setTotalPassengerConstraint((TotalPassengerCombinationConstraint)null);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DEFAULT_REGULATORY_CONDITIONS:
				getDefaultRegulatoryConditions().clear();
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DATA_SOURCE:
				setDataSource(DATA_SOURCE_EDEFAULT);
				return;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__CONVERTED_BUNDLES:
				getConvertedBundles().clear();
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
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DEFAULT_FARE_TYPE:
				return defaultFareType != DEFAULT_FARE_TYPE_EDEFAULT;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DATA_DESCRIPTION:
				return DATA_DESCRIPTION_EDEFAULT == null ? dataDescription != null : !DATA_DESCRIPTION_EDEFAULT.equals(dataDescription);
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__CARRIER_CONSTRAINT:
				return carrierConstraint != null;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__SALES_AVAILABILITY:
				return salesAvailability != null;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__TRAVEL_VALIDITY:
				return travelValidity != null;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__COMBINATION_CONSTRAINT:
				return combinationConstraint != null;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__PERSONAL_DATA_CONSTRAINT:
				return personalDataConstraint != null;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__FULFILLMENT_CONSTRAINT:
				return fulfillmentConstraint != null;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__TOTAL_PASSENGER_CONSTRAINT:
				return totalPassengerConstraint != null;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DEFAULT_REGULATORY_CONDITIONS:
				return defaultRegulatoryConditions != null && !defaultRegulatoryConditions.isEmpty();
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DATA_SOURCE:
				return dataSource != DATA_SOURCE_EDEFAULT;
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__CONVERTED_BUNDLES:
				return convertedBundles != null && !convertedBundles.isEmpty();
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
		result.append(", defaultFareType: ");
		result.append(defaultFareType);
		result.append(", dataDescription: ");
		result.append(dataDescription);
		result.append(", defaultRegulatoryConditions: ");
		result.append(defaultRegulatoryConditions);
		result.append(", dataSource: ");
		result.append(dataSource);
		result.append(')');
		return result.toString();
	}

} //FareConstraintBundleImpl
