/**
 */
package Gtm.impl;

import Gtm.AfterSalesTemplate;
import Gtm.BasePriceClassType;
import Gtm.Carrier;
import Gtm.CarrierConstraint;
import Gtm.CombinationConstraint;
import Gtm.FareConstraintBundle;
import Gtm.FareTemplate;
import Gtm.FareType;
import Gtm.FulfillmentConstraint;
import Gtm.GtmPackage;
import Gtm.LegacyAccountingIdentifier;
import Gtm.LegacyConversionType;
import Gtm.LegacySeriesType;
import Gtm.PassengerConstraint;
import Gtm.PersonalDataConstraint;
import Gtm.Price;
import Gtm.ReductionConstraint;
import Gtm.RegulatoryCondition;
import Gtm.ReservationParameter;
import Gtm.RoundingType;
import Gtm.SalesAvailabilityConstraint;
import Gtm.ServiceClass;
import Gtm.ServiceConstraint;
import Gtm.ServiceLevel;
import Gtm.Text;
import Gtm.TravelValidityConstraint;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fare Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getPriceFactor <em>Price Factor</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getRoundingMode <em>Rounding Mode</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getType <em>Type</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getAfterSalesTemplate <em>After Sales Template</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getText <em>Text</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getFareConstraintBundle <em>Fare Constraint Bundle</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getSeparateContractFareConstraintBundle <em>Separate Contract Fare Constraint Bundle</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getServiceConstraint <em>Service Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getServiceLevel <em>Service Level</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getSalesAvailability <em>Sales Availability</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getTravelValidity <em>Travel Validity</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getCombinationConstraint <em>Combination Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getSeparateContractCombinationConstraint <em>Separate Contract Combination Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getFareDetailDescription <em>Fare Detail Description</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getPersonalDataConstraint <em>Personal Data Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getReservationParameter <em>Reservation Parameter</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getReductionConstraint <em>Reduction Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getFulfillmentConstraint <em>Fulfillment Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getPassengerConstraint <em>Passenger Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getLegacyConversion <em>Legacy Conversion</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#isIndividualContracts <em>Individual Contracts</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getRegulatoryConditions <em>Regulatory Conditions</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getLegacyAccountingTariffId <em>Legacy Accounting Tariff Id</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getSeriesFilter <em>Series Filter</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getBasePriceClass <em>Base Price Class</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getCarrierFilter <em>Carrier Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FareTemplateImpl extends MinimalEObjectImpl.Container implements FareTemplate {
	/**
	 * The default value of the '{@link #getPriceFactor() <em>Price Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPriceFactor() <em>Price Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceFactor()
	 * @generated
	 * @ordered
	 */
	protected float priceFactor = PRICE_FACTOR_EDEFAULT;

	/**
	 * This is true if the Price Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priceFactorESet;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected Price price;

	/**
	 * The default value of the '{@link #getRoundingMode() <em>Rounding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundingMode()
	 * @generated
	 * @ordered
	 */
	protected static final RoundingType ROUNDING_MODE_EDEFAULT = RoundingType.HALFUP;

	/**
	 * The cached value of the '{@link #getRoundingMode() <em>Rounding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundingMode()
	 * @generated
	 * @ordered
	 */
	protected RoundingType roundingMode = ROUNDING_MODE_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final FareType TYPE_EDEFAULT = FareType.NRT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected FareType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAfterSalesTemplate() <em>After Sales Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterSalesTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<AfterSalesTemplate> afterSalesTemplate;

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
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Text text;

	/**
	 * The cached value of the '{@link #getFareConstraintBundle() <em>Fare Constraint Bundle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareConstraintBundle()
	 * @generated
	 * @ordered
	 */
	protected FareConstraintBundle fareConstraintBundle;

	/**
	 * The cached value of the '{@link #getSeparateContractFareConstraintBundle() <em>Separate Contract Fare Constraint Bundle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparateContractFareConstraintBundle()
	 * @generated
	 * @ordered
	 */
	protected FareConstraintBundle separateContractFareConstraintBundle;

	/**
	 * The cached value of the '{@link #getServiceConstraint() <em>Service Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConstraint()
	 * @generated
	 * @ordered
	 */
	protected ServiceConstraint serviceConstraint;

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
	 * The cached value of the '{@link #getServiceClass() <em>Service Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClass()
	 * @generated
	 * @ordered
	 */
	protected ServiceClass serviceClass;

	/**
	 * The cached value of the '{@link #getServiceLevel() <em>Service Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevel()
	 * @generated
	 * @ordered
	 */
	protected ServiceLevel serviceLevel;

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
	 * The cached value of the '{@link #getSeparateContractCombinationConstraint() <em>Separate Contract Combination Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparateContractCombinationConstraint()
	 * @generated
	 * @ordered
	 */
	protected CombinationConstraint separateContractCombinationConstraint;

	/**
	 * The cached value of the '{@link #getFareDetailDescription() <em>Fare Detail Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareDetailDescription()
	 * @generated
	 * @ordered
	 */
	protected Text fareDetailDescription;

	/**
	 * The cached value of the '{@link #getLegacyAccountingIdentifier() <em>Legacy Accounting Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyAccountingIdentifier()
	 * @generated
	 * @ordered
	 */
	protected LegacyAccountingIdentifier legacyAccountingIdentifier;

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
	 * The cached value of the '{@link #getReservationParameter() <em>Reservation Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationParameter()
	 * @generated
	 * @ordered
	 */
	protected ReservationParameter reservationParameter;

	/**
	 * The cached value of the '{@link #getReductionConstraint() <em>Reduction Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReductionConstraint()
	 * @generated
	 * @ordered
	 */
	protected ReductionConstraint reductionConstraint;

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
	 * The cached value of the '{@link #getPassengerConstraint() <em>Passenger Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerConstraint()
	 * @generated
	 * @ordered
	 */
	protected PassengerConstraint passengerConstraint;

	/**
	 * The default value of the '{@link #getLegacyConversion() <em>Legacy Conversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyConversion()
	 * @generated
	 * @ordered
	 */
	protected static final LegacyConversionType LEGACY_CONVERSION_EDEFAULT = LegacyConversionType.NO;

	/**
	 * The cached value of the '{@link #getLegacyConversion() <em>Legacy Conversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyConversion()
	 * @generated
	 * @ordered
	 */
	protected LegacyConversionType legacyConversion = LEGACY_CONVERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIndividualContracts() <em>Individual Contracts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividualContracts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INDIVIDUAL_CONTRACTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIndividualContracts() <em>Individual Contracts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividualContracts()
	 * @generated
	 * @ordered
	 */
	protected boolean individualContracts = INDIVIDUAL_CONTRACTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegulatoryConditions() <em>Regulatory Conditions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatoryConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<RegulatoryCondition> regulatoryConditions;

	/**
	 * The default value of the '{@link #getLegacyAccountingTariffId() <em>Legacy Accounting Tariff Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyAccountingTariffId()
	 * @generated
	 * @ordered
	 */
	protected static final int LEGACY_ACCOUNTING_TARIFF_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLegacyAccountingTariffId() <em>Legacy Accounting Tariff Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyAccountingTariffId()
	 * @generated
	 * @ordered
	 */
	protected int legacyAccountingTariffId = LEGACY_ACCOUNTING_TARIFF_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeriesFilter() <em>Series Filter</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacySeriesType> seriesFilter;

	/**
	 * The default value of the '{@link #getBasePriceClass() <em>Base Price Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePriceClass()
	 * @generated
	 * @ordered
	 */
	protected static final BasePriceClassType BASE_PRICE_CLASS_EDEFAULT = BasePriceClassType.SERVICE_CLASS;

	/**
	 * The cached value of the '{@link #getBasePriceClass() <em>Base Price Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePriceClass()
	 * @generated
	 * @ordered
	 */
	protected BasePriceClassType basePriceClass = BASE_PRICE_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCarrierFilter() <em>Carrier Filter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<Carrier> carrierFilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FareTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.FARE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPriceFactor() {
		return priceFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriceFactor(float newPriceFactor) {
		float oldPriceFactor = priceFactor;
		priceFactor = newPriceFactor;
		boolean oldPriceFactorESet = priceFactorESet;
		priceFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__PRICE_FACTOR, oldPriceFactor, priceFactor, !oldPriceFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriceFactor() {
		float oldPriceFactor = priceFactor;
		boolean oldPriceFactorESet = priceFactorESet;
		priceFactor = PRICE_FACTOR_EDEFAULT;
		priceFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GtmPackage.FARE_TEMPLATE__PRICE_FACTOR, oldPriceFactor, PRICE_FACTOR_EDEFAULT, oldPriceFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriceFactor() {
		return priceFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Price getPrice() {
		if (price != null && price.eIsProxy()) {
			InternalEObject oldPrice = (InternalEObject)price;
			price = (Price)eResolveProxy(oldPrice);
			if (price != oldPrice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__PRICE, oldPrice, price));
			}
		}
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Price basicGetPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(Price newPrice) {
		Price oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundingType getRoundingMode() {
		return roundingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundingMode(RoundingType newRoundingMode) {
		RoundingType oldRoundingMode = roundingMode;
		roundingMode = newRoundingMode == null ? ROUNDING_MODE_EDEFAULT : newRoundingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__ROUNDING_MODE, oldRoundingMode, roundingMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(FareType newType) {
		FareType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AfterSalesTemplate> getAfterSalesTemplate() {
		if (afterSalesTemplate == null) {
			afterSalesTemplate = new EObjectContainmentEList<AfterSalesTemplate>(AfterSalesTemplate.class, this, GtmPackage.FARE_TEMPLATE__AFTER_SALES_TEMPLATE);
		}
		return afterSalesTemplate;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__DATA_DESCRIPTION, oldDataDescription, dataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (Text)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Text newText) {
		Text oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareConstraintBundle getFareConstraintBundle() {
		if (fareConstraintBundle != null && fareConstraintBundle.eIsProxy()) {
			InternalEObject oldFareConstraintBundle = (InternalEObject)fareConstraintBundle;
			fareConstraintBundle = (FareConstraintBundle)eResolveProxy(oldFareConstraintBundle);
			if (fareConstraintBundle != oldFareConstraintBundle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__FARE_CONSTRAINT_BUNDLE, oldFareConstraintBundle, fareConstraintBundle));
			}
		}
		return fareConstraintBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareConstraintBundle basicGetFareConstraintBundle() {
		return fareConstraintBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFareConstraintBundle(FareConstraintBundle newFareConstraintBundle) {
		FareConstraintBundle oldFareConstraintBundle = fareConstraintBundle;
		fareConstraintBundle = newFareConstraintBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__FARE_CONSTRAINT_BUNDLE, oldFareConstraintBundle, fareConstraintBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareConstraintBundle getSeparateContractFareConstraintBundle() {
		if (separateContractFareConstraintBundle != null && separateContractFareConstraintBundle.eIsProxy()) {
			InternalEObject oldSeparateContractFareConstraintBundle = (InternalEObject)separateContractFareConstraintBundle;
			separateContractFareConstraintBundle = (FareConstraintBundle)eResolveProxy(oldSeparateContractFareConstraintBundle);
			if (separateContractFareConstraintBundle != oldSeparateContractFareConstraintBundle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_FARE_CONSTRAINT_BUNDLE, oldSeparateContractFareConstraintBundle, separateContractFareConstraintBundle));
			}
		}
		return separateContractFareConstraintBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareConstraintBundle basicGetSeparateContractFareConstraintBundle() {
		return separateContractFareConstraintBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparateContractFareConstraintBundle(FareConstraintBundle newSeparateContractFareConstraintBundle) {
		FareConstraintBundle oldSeparateContractFareConstraintBundle = separateContractFareConstraintBundle;
		separateContractFareConstraintBundle = newSeparateContractFareConstraintBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_FARE_CONSTRAINT_BUNDLE, oldSeparateContractFareConstraintBundle, separateContractFareConstraintBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint getServiceConstraint() {
		if (serviceConstraint != null && serviceConstraint.eIsProxy()) {
			InternalEObject oldServiceConstraint = (InternalEObject)serviceConstraint;
			serviceConstraint = (ServiceConstraint)eResolveProxy(oldServiceConstraint);
			if (serviceConstraint != oldServiceConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__SERVICE_CONSTRAINT, oldServiceConstraint, serviceConstraint));
			}
		}
		return serviceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint basicGetServiceConstraint() {
		return serviceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceConstraint(ServiceConstraint newServiceConstraint) {
		ServiceConstraint oldServiceConstraint = serviceConstraint;
		serviceConstraint = newServiceConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__SERVICE_CONSTRAINT, oldServiceConstraint, serviceConstraint));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__CARRIER_CONSTRAINT, oldCarrierConstraint, carrierConstraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__CARRIER_CONSTRAINT, oldCarrierConstraint, carrierConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass getServiceClass() {
		if (serviceClass != null && serviceClass.eIsProxy()) {
			InternalEObject oldServiceClass = (InternalEObject)serviceClass;
			serviceClass = (ServiceClass)eResolveProxy(oldServiceClass);
			if (serviceClass != oldServiceClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__SERVICE_CLASS, oldServiceClass, serviceClass));
			}
		}
		return serviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass basicGetServiceClass() {
		return serviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceClass(ServiceClass newServiceClass) {
		ServiceClass oldServiceClass = serviceClass;
		serviceClass = newServiceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__SERVICE_CLASS, oldServiceClass, serviceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevel getServiceLevel() {
		if (serviceLevel != null && serviceLevel.eIsProxy()) {
			InternalEObject oldServiceLevel = (InternalEObject)serviceLevel;
			serviceLevel = (ServiceLevel)eResolveProxy(oldServiceLevel);
			if (serviceLevel != oldServiceLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__SERVICE_LEVEL, oldServiceLevel, serviceLevel));
			}
		}
		return serviceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevel basicGetServiceLevel() {
		return serviceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLevel(ServiceLevel newServiceLevel) {
		ServiceLevel oldServiceLevel = serviceLevel;
		serviceLevel = newServiceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__SERVICE_LEVEL, oldServiceLevel, serviceLevel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__SALES_AVAILABILITY, oldSalesAvailability, salesAvailability));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__SALES_AVAILABILITY, oldSalesAvailability, salesAvailability));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__TRAVEL_VALIDITY, oldTravelValidity, travelValidity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__TRAVEL_VALIDITY, oldTravelValidity, travelValidity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__COMBINATION_CONSTRAINT, oldCombinationConstraint, combinationConstraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__COMBINATION_CONSTRAINT, oldCombinationConstraint, combinationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationConstraint getSeparateContractCombinationConstraint() {
		if (separateContractCombinationConstraint != null && separateContractCombinationConstraint.eIsProxy()) {
			InternalEObject oldSeparateContractCombinationConstraint = (InternalEObject)separateContractCombinationConstraint;
			separateContractCombinationConstraint = (CombinationConstraint)eResolveProxy(oldSeparateContractCombinationConstraint);
			if (separateContractCombinationConstraint != oldSeparateContractCombinationConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT, oldSeparateContractCombinationConstraint, separateContractCombinationConstraint));
			}
		}
		return separateContractCombinationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationConstraint basicGetSeparateContractCombinationConstraint() {
		return separateContractCombinationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparateContractCombinationConstraint(CombinationConstraint newSeparateContractCombinationConstraint) {
		CombinationConstraint oldSeparateContractCombinationConstraint = separateContractCombinationConstraint;
		separateContractCombinationConstraint = newSeparateContractCombinationConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT, oldSeparateContractCombinationConstraint, separateContractCombinationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getFareDetailDescription() {
		if (fareDetailDescription != null && fareDetailDescription.eIsProxy()) {
			InternalEObject oldFareDetailDescription = (InternalEObject)fareDetailDescription;
			fareDetailDescription = (Text)eResolveProxy(oldFareDetailDescription);
			if (fareDetailDescription != oldFareDetailDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION, oldFareDetailDescription, fareDetailDescription));
			}
		}
		return fareDetailDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetFareDetailDescription() {
		return fareDetailDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFareDetailDescription(Text newFareDetailDescription) {
		Text oldFareDetailDescription = fareDetailDescription;
		fareDetailDescription = newFareDetailDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION, oldFareDetailDescription, fareDetailDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyAccountingIdentifier getLegacyAccountingIdentifier() {
		return legacyAccountingIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyAccountingIdentifier(LegacyAccountingIdentifier newLegacyAccountingIdentifier, NotificationChain msgs) {
		LegacyAccountingIdentifier oldLegacyAccountingIdentifier = legacyAccountingIdentifier;
		legacyAccountingIdentifier = newLegacyAccountingIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER, oldLegacyAccountingIdentifier, newLegacyAccountingIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyAccountingIdentifier(LegacyAccountingIdentifier newLegacyAccountingIdentifier) {
		if (newLegacyAccountingIdentifier != legacyAccountingIdentifier) {
			NotificationChain msgs = null;
			if (legacyAccountingIdentifier != null)
				msgs = ((InternalEObject)legacyAccountingIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER, null, msgs);
			if (newLegacyAccountingIdentifier != null)
				msgs = ((InternalEObject)newLegacyAccountingIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER, null, msgs);
			msgs = basicSetLegacyAccountingIdentifier(newLegacyAccountingIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER, newLegacyAccountingIdentifier, newLegacyAccountingIdentifier));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT, oldPersonalDataConstraint, personalDataConstraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT, oldPersonalDataConstraint, personalDataConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationParameter getReservationParameter() {
		if (reservationParameter != null && reservationParameter.eIsProxy()) {
			InternalEObject oldReservationParameter = (InternalEObject)reservationParameter;
			reservationParameter = (ReservationParameter)eResolveProxy(oldReservationParameter);
			if (reservationParameter != oldReservationParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__RESERVATION_PARAMETER, oldReservationParameter, reservationParameter));
			}
		}
		return reservationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationParameter basicGetReservationParameter() {
		return reservationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationParameter(ReservationParameter newReservationParameter) {
		ReservationParameter oldReservationParameter = reservationParameter;
		reservationParameter = newReservationParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__RESERVATION_PARAMETER, oldReservationParameter, reservationParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionConstraint getReductionConstraint() {
		if (reductionConstraint != null && reductionConstraint.eIsProxy()) {
			InternalEObject oldReductionConstraint = (InternalEObject)reductionConstraint;
			reductionConstraint = (ReductionConstraint)eResolveProxy(oldReductionConstraint);
			if (reductionConstraint != oldReductionConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__REDUCTION_CONSTRAINT, oldReductionConstraint, reductionConstraint));
			}
		}
		return reductionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionConstraint basicGetReductionConstraint() {
		return reductionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReductionConstraint(ReductionConstraint newReductionConstraint) {
		ReductionConstraint oldReductionConstraint = reductionConstraint;
		reductionConstraint = newReductionConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__REDUCTION_CONSTRAINT, oldReductionConstraint, reductionConstraint));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__FULFILLMENT_CONSTRAINT, oldFulfillmentConstraint, fulfillmentConstraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__FULFILLMENT_CONSTRAINT, oldFulfillmentConstraint, fulfillmentConstraint));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__PASSENGER_CONSTRAINT, oldPassengerConstraint, passengerConstraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__PASSENGER_CONSTRAINT, oldPassengerConstraint, passengerConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyConversionType getLegacyConversion() {
		return legacyConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyConversion(LegacyConversionType newLegacyConversion) {
		LegacyConversionType oldLegacyConversion = legacyConversion;
		legacyConversion = newLegacyConversion == null ? LEGACY_CONVERSION_EDEFAULT : newLegacyConversion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__LEGACY_CONVERSION, oldLegacyConversion, legacyConversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndividualContracts() {
		return individualContracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividualContracts(boolean newIndividualContracts) {
		boolean oldIndividualContracts = individualContracts;
		individualContracts = newIndividualContracts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__INDIVIDUAL_CONTRACTS, oldIndividualContracts, individualContracts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegulatoryCondition> getRegulatoryConditions() {
		if (regulatoryConditions == null) {
			regulatoryConditions = new EDataTypeUniqueEList<RegulatoryCondition>(RegulatoryCondition.class, this, GtmPackage.FARE_TEMPLATE__REGULATORY_CONDITIONS);
		}
		return regulatoryConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLegacyAccountingTariffId() {
		return legacyAccountingTariffId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyAccountingTariffId(int newLegacyAccountingTariffId) {
		int oldLegacyAccountingTariffId = legacyAccountingTariffId;
		legacyAccountingTariffId = newLegacyAccountingTariffId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_TARIFF_ID, oldLegacyAccountingTariffId, legacyAccountingTariffId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacySeriesType> getSeriesFilter() {
		if (seriesFilter == null) {
			seriesFilter = new EDataTypeUniqueEList<LegacySeriesType>(LegacySeriesType.class, this, GtmPackage.FARE_TEMPLATE__SERIES_FILTER);
		}
		return seriesFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePriceClassType getBasePriceClass() {
		return basePriceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePriceClass(BasePriceClassType newBasePriceClass) {
		BasePriceClassType oldBasePriceClass = basePriceClass;
		basePriceClass = newBasePriceClass == null ? BASE_PRICE_CLASS_EDEFAULT : newBasePriceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__BASE_PRICE_CLASS, oldBasePriceClass, basePriceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Carrier> getCarrierFilter() {
		if (carrierFilter == null) {
			carrierFilter = new EObjectResolvingEList<Carrier>(Carrier.class, this, GtmPackage.FARE_TEMPLATE__CARRIER_FILTER);
		}
		return carrierFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.FARE_TEMPLATE__AFTER_SALES_TEMPLATE:
				return ((InternalEList<?>)getAfterSalesTemplate()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER:
				return basicSetLegacyAccountingIdentifier(null, msgs);
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
			case GtmPackage.FARE_TEMPLATE__PRICE_FACTOR:
				return getPriceFactor();
			case GtmPackage.FARE_TEMPLATE__PRICE:
				if (resolve) return getPrice();
				return basicGetPrice();
			case GtmPackage.FARE_TEMPLATE__ROUNDING_MODE:
				return getRoundingMode();
			case GtmPackage.FARE_TEMPLATE__ID:
				return getId();
			case GtmPackage.FARE_TEMPLATE__TYPE:
				return getType();
			case GtmPackage.FARE_TEMPLATE__AFTER_SALES_TEMPLATE:
				return getAfterSalesTemplate();
			case GtmPackage.FARE_TEMPLATE__DATA_DESCRIPTION:
				return getDataDescription();
			case GtmPackage.FARE_TEMPLATE__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case GtmPackage.FARE_TEMPLATE__FARE_CONSTRAINT_BUNDLE:
				if (resolve) return getFareConstraintBundle();
				return basicGetFareConstraintBundle();
			case GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_FARE_CONSTRAINT_BUNDLE:
				if (resolve) return getSeparateContractFareConstraintBundle();
				return basicGetSeparateContractFareConstraintBundle();
			case GtmPackage.FARE_TEMPLATE__SERVICE_CONSTRAINT:
				if (resolve) return getServiceConstraint();
				return basicGetServiceConstraint();
			case GtmPackage.FARE_TEMPLATE__CARRIER_CONSTRAINT:
				if (resolve) return getCarrierConstraint();
				return basicGetCarrierConstraint();
			case GtmPackage.FARE_TEMPLATE__SERVICE_CLASS:
				if (resolve) return getServiceClass();
				return basicGetServiceClass();
			case GtmPackage.FARE_TEMPLATE__SERVICE_LEVEL:
				if (resolve) return getServiceLevel();
				return basicGetServiceLevel();
			case GtmPackage.FARE_TEMPLATE__SALES_AVAILABILITY:
				if (resolve) return getSalesAvailability();
				return basicGetSalesAvailability();
			case GtmPackage.FARE_TEMPLATE__TRAVEL_VALIDITY:
				if (resolve) return getTravelValidity();
				return basicGetTravelValidity();
			case GtmPackage.FARE_TEMPLATE__COMBINATION_CONSTRAINT:
				if (resolve) return getCombinationConstraint();
				return basicGetCombinationConstraint();
			case GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT:
				if (resolve) return getSeparateContractCombinationConstraint();
				return basicGetSeparateContractCombinationConstraint();
			case GtmPackage.FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION:
				if (resolve) return getFareDetailDescription();
				return basicGetFareDetailDescription();
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER:
				return getLegacyAccountingIdentifier();
			case GtmPackage.FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT:
				if (resolve) return getPersonalDataConstraint();
				return basicGetPersonalDataConstraint();
			case GtmPackage.FARE_TEMPLATE__RESERVATION_PARAMETER:
				if (resolve) return getReservationParameter();
				return basicGetReservationParameter();
			case GtmPackage.FARE_TEMPLATE__REDUCTION_CONSTRAINT:
				if (resolve) return getReductionConstraint();
				return basicGetReductionConstraint();
			case GtmPackage.FARE_TEMPLATE__FULFILLMENT_CONSTRAINT:
				if (resolve) return getFulfillmentConstraint();
				return basicGetFulfillmentConstraint();
			case GtmPackage.FARE_TEMPLATE__PASSENGER_CONSTRAINT:
				if (resolve) return getPassengerConstraint();
				return basicGetPassengerConstraint();
			case GtmPackage.FARE_TEMPLATE__LEGACY_CONVERSION:
				return getLegacyConversion();
			case GtmPackage.FARE_TEMPLATE__INDIVIDUAL_CONTRACTS:
				return isIndividualContracts();
			case GtmPackage.FARE_TEMPLATE__REGULATORY_CONDITIONS:
				return getRegulatoryConditions();
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_TARIFF_ID:
				return getLegacyAccountingTariffId();
			case GtmPackage.FARE_TEMPLATE__SERIES_FILTER:
				return getSeriesFilter();
			case GtmPackage.FARE_TEMPLATE__BASE_PRICE_CLASS:
				return getBasePriceClass();
			case GtmPackage.FARE_TEMPLATE__CARRIER_FILTER:
				return getCarrierFilter();
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
			case GtmPackage.FARE_TEMPLATE__PRICE_FACTOR:
				setPriceFactor((Float)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__PRICE:
				setPrice((Price)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__ROUNDING_MODE:
				setRoundingMode((RoundingType)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__ID:
				setId((String)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__TYPE:
				setType((FareType)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__AFTER_SALES_TEMPLATE:
				getAfterSalesTemplate().clear();
				getAfterSalesTemplate().addAll((Collection<? extends AfterSalesTemplate>)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__DATA_DESCRIPTION:
				setDataDescription((String)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__TEXT:
				setText((Text)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__FARE_CONSTRAINT_BUNDLE:
				setFareConstraintBundle((FareConstraintBundle)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_FARE_CONSTRAINT_BUNDLE:
				setSeparateContractFareConstraintBundle((FareConstraintBundle)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__SERVICE_CONSTRAINT:
				setServiceConstraint((ServiceConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__CARRIER_CONSTRAINT:
				setCarrierConstraint((CarrierConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__SERVICE_CLASS:
				setServiceClass((ServiceClass)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__SERVICE_LEVEL:
				setServiceLevel((ServiceLevel)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__SALES_AVAILABILITY:
				setSalesAvailability((SalesAvailabilityConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__TRAVEL_VALIDITY:
				setTravelValidity((TravelValidityConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__COMBINATION_CONSTRAINT:
				setCombinationConstraint((CombinationConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT:
				setSeparateContractCombinationConstraint((CombinationConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION:
				setFareDetailDescription((Text)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER:
				setLegacyAccountingIdentifier((LegacyAccountingIdentifier)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT:
				setPersonalDataConstraint((PersonalDataConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__RESERVATION_PARAMETER:
				setReservationParameter((ReservationParameter)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__REDUCTION_CONSTRAINT:
				setReductionConstraint((ReductionConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__FULFILLMENT_CONSTRAINT:
				setFulfillmentConstraint((FulfillmentConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__PASSENGER_CONSTRAINT:
				setPassengerConstraint((PassengerConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__LEGACY_CONVERSION:
				setLegacyConversion((LegacyConversionType)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__INDIVIDUAL_CONTRACTS:
				setIndividualContracts((Boolean)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__REGULATORY_CONDITIONS:
				getRegulatoryConditions().clear();
				getRegulatoryConditions().addAll((Collection<? extends RegulatoryCondition>)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_TARIFF_ID:
				setLegacyAccountingTariffId((Integer)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__SERIES_FILTER:
				getSeriesFilter().clear();
				getSeriesFilter().addAll((Collection<? extends LegacySeriesType>)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__BASE_PRICE_CLASS:
				setBasePriceClass((BasePriceClassType)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__CARRIER_FILTER:
				getCarrierFilter().clear();
				getCarrierFilter().addAll((Collection<? extends Carrier>)newValue);
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
			case GtmPackage.FARE_TEMPLATE__PRICE_FACTOR:
				unsetPriceFactor();
				return;
			case GtmPackage.FARE_TEMPLATE__PRICE:
				setPrice((Price)null);
				return;
			case GtmPackage.FARE_TEMPLATE__ROUNDING_MODE:
				setRoundingMode(ROUNDING_MODE_EDEFAULT);
				return;
			case GtmPackage.FARE_TEMPLATE__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.FARE_TEMPLATE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GtmPackage.FARE_TEMPLATE__AFTER_SALES_TEMPLATE:
				getAfterSalesTemplate().clear();
				return;
			case GtmPackage.FARE_TEMPLATE__DATA_DESCRIPTION:
				setDataDescription(DATA_DESCRIPTION_EDEFAULT);
				return;
			case GtmPackage.FARE_TEMPLATE__TEXT:
				setText((Text)null);
				return;
			case GtmPackage.FARE_TEMPLATE__FARE_CONSTRAINT_BUNDLE:
				setFareConstraintBundle((FareConstraintBundle)null);
				return;
			case GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_FARE_CONSTRAINT_BUNDLE:
				setSeparateContractFareConstraintBundle((FareConstraintBundle)null);
				return;
			case GtmPackage.FARE_TEMPLATE__SERVICE_CONSTRAINT:
				setServiceConstraint((ServiceConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__CARRIER_CONSTRAINT:
				setCarrierConstraint((CarrierConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__SERVICE_CLASS:
				setServiceClass((ServiceClass)null);
				return;
			case GtmPackage.FARE_TEMPLATE__SERVICE_LEVEL:
				setServiceLevel((ServiceLevel)null);
				return;
			case GtmPackage.FARE_TEMPLATE__SALES_AVAILABILITY:
				setSalesAvailability((SalesAvailabilityConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__TRAVEL_VALIDITY:
				setTravelValidity((TravelValidityConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__COMBINATION_CONSTRAINT:
				setCombinationConstraint((CombinationConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT:
				setSeparateContractCombinationConstraint((CombinationConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION:
				setFareDetailDescription((Text)null);
				return;
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER:
				setLegacyAccountingIdentifier((LegacyAccountingIdentifier)null);
				return;
			case GtmPackage.FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT:
				setPersonalDataConstraint((PersonalDataConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__RESERVATION_PARAMETER:
				setReservationParameter((ReservationParameter)null);
				return;
			case GtmPackage.FARE_TEMPLATE__REDUCTION_CONSTRAINT:
				setReductionConstraint((ReductionConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__FULFILLMENT_CONSTRAINT:
				setFulfillmentConstraint((FulfillmentConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__PASSENGER_CONSTRAINT:
				setPassengerConstraint((PassengerConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__LEGACY_CONVERSION:
				setLegacyConversion(LEGACY_CONVERSION_EDEFAULT);
				return;
			case GtmPackage.FARE_TEMPLATE__INDIVIDUAL_CONTRACTS:
				setIndividualContracts(INDIVIDUAL_CONTRACTS_EDEFAULT);
				return;
			case GtmPackage.FARE_TEMPLATE__REGULATORY_CONDITIONS:
				getRegulatoryConditions().clear();
				return;
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_TARIFF_ID:
				setLegacyAccountingTariffId(LEGACY_ACCOUNTING_TARIFF_ID_EDEFAULT);
				return;
			case GtmPackage.FARE_TEMPLATE__SERIES_FILTER:
				getSeriesFilter().clear();
				return;
			case GtmPackage.FARE_TEMPLATE__BASE_PRICE_CLASS:
				setBasePriceClass(BASE_PRICE_CLASS_EDEFAULT);
				return;
			case GtmPackage.FARE_TEMPLATE__CARRIER_FILTER:
				getCarrierFilter().clear();
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
			case GtmPackage.FARE_TEMPLATE__PRICE_FACTOR:
				return isSetPriceFactor();
			case GtmPackage.FARE_TEMPLATE__PRICE:
				return price != null;
			case GtmPackage.FARE_TEMPLATE__ROUNDING_MODE:
				return roundingMode != ROUNDING_MODE_EDEFAULT;
			case GtmPackage.FARE_TEMPLATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.FARE_TEMPLATE__TYPE:
				return type != TYPE_EDEFAULT;
			case GtmPackage.FARE_TEMPLATE__AFTER_SALES_TEMPLATE:
				return afterSalesTemplate != null && !afterSalesTemplate.isEmpty();
			case GtmPackage.FARE_TEMPLATE__DATA_DESCRIPTION:
				return DATA_DESCRIPTION_EDEFAULT == null ? dataDescription != null : !DATA_DESCRIPTION_EDEFAULT.equals(dataDescription);
			case GtmPackage.FARE_TEMPLATE__TEXT:
				return text != null;
			case GtmPackage.FARE_TEMPLATE__FARE_CONSTRAINT_BUNDLE:
				return fareConstraintBundle != null;
			case GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_FARE_CONSTRAINT_BUNDLE:
				return separateContractFareConstraintBundle != null;
			case GtmPackage.FARE_TEMPLATE__SERVICE_CONSTRAINT:
				return serviceConstraint != null;
			case GtmPackage.FARE_TEMPLATE__CARRIER_CONSTRAINT:
				return carrierConstraint != null;
			case GtmPackage.FARE_TEMPLATE__SERVICE_CLASS:
				return serviceClass != null;
			case GtmPackage.FARE_TEMPLATE__SERVICE_LEVEL:
				return serviceLevel != null;
			case GtmPackage.FARE_TEMPLATE__SALES_AVAILABILITY:
				return salesAvailability != null;
			case GtmPackage.FARE_TEMPLATE__TRAVEL_VALIDITY:
				return travelValidity != null;
			case GtmPackage.FARE_TEMPLATE__COMBINATION_CONSTRAINT:
				return combinationConstraint != null;
			case GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT:
				return separateContractCombinationConstraint != null;
			case GtmPackage.FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION:
				return fareDetailDescription != null;
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER:
				return legacyAccountingIdentifier != null;
			case GtmPackage.FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT:
				return personalDataConstraint != null;
			case GtmPackage.FARE_TEMPLATE__RESERVATION_PARAMETER:
				return reservationParameter != null;
			case GtmPackage.FARE_TEMPLATE__REDUCTION_CONSTRAINT:
				return reductionConstraint != null;
			case GtmPackage.FARE_TEMPLATE__FULFILLMENT_CONSTRAINT:
				return fulfillmentConstraint != null;
			case GtmPackage.FARE_TEMPLATE__PASSENGER_CONSTRAINT:
				return passengerConstraint != null;
			case GtmPackage.FARE_TEMPLATE__LEGACY_CONVERSION:
				return legacyConversion != LEGACY_CONVERSION_EDEFAULT;
			case GtmPackage.FARE_TEMPLATE__INDIVIDUAL_CONTRACTS:
				return individualContracts != INDIVIDUAL_CONTRACTS_EDEFAULT;
			case GtmPackage.FARE_TEMPLATE__REGULATORY_CONDITIONS:
				return regulatoryConditions != null && !regulatoryConditions.isEmpty();
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_TARIFF_ID:
				return legacyAccountingTariffId != LEGACY_ACCOUNTING_TARIFF_ID_EDEFAULT;
			case GtmPackage.FARE_TEMPLATE__SERIES_FILTER:
				return seriesFilter != null && !seriesFilter.isEmpty();
			case GtmPackage.FARE_TEMPLATE__BASE_PRICE_CLASS:
				return basePriceClass != BASE_PRICE_CLASS_EDEFAULT;
			case GtmPackage.FARE_TEMPLATE__CARRIER_FILTER:
				return carrierFilter != null && !carrierFilter.isEmpty();
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
		result.append(" (priceFactor: ");
		if (priceFactorESet) result.append(priceFactor); else result.append("<unset>");
		result.append(", roundingMode: ");
		result.append(roundingMode);
		result.append(", id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", dataDescription: ");
		result.append(dataDescription);
		result.append(", legacyConversion: ");
		result.append(legacyConversion);
		result.append(", individualContracts: ");
		result.append(individualContracts);
		result.append(", regulatoryConditions: ");
		result.append(regulatoryConditions);
		result.append(", legacyAccountingTariffId: ");
		result.append(legacyAccountingTariffId);
		result.append(", seriesFilter: ");
		result.append(seriesFilter);
		result.append(", basePriceClass: ");
		result.append(basePriceClass);
		result.append(')');
		return result.toString();
	}

} //FareTemplateImpl
