/**
 */
package Gtm.impl;

import Gtm.ClassicClassType;
import Gtm.ConditionText;
import Gtm.GtmPackage;
import Gtm.Product;
import Gtm.ProductType;
import Gtm.Text;

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
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ProductImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getCode <em>Code</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getTravelClass <em>Travel Class</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getServiceConstraintText <em>Service Constraint Text</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getCarrierConstraintText <em>Carrier Constraint Text</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getConditionTexts <em>Condition Texts</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getReturnProduct <em>Return Product</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getTrainBound <em>Train Bound</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getRefundableAfterValidity <em>Refundable After Validity</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getRefundableBeforeValidity <em>Refundable Before Validity</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getExchangeableAfterValidity <em>Exchangeable After Validity</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getExchangeableBeforeValidity <em>Exchangeable Before Validity</em>}</li>
 *   <li>{@link Gtm.impl.ProductImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends MinimalEObjectImpl.Container implements Product {
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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Text name;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected Text summary;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Text description;

	/**
	 * The default value of the '{@link #getTravelClass() <em>Travel Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelClass()
	 * @generated
	 * @ordered
	 */
	protected static final ClassicClassType TRAVEL_CLASS_EDEFAULT = ClassicClassType.FIRST;

	/**
	 * The cached value of the '{@link #getTravelClass() <em>Travel Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelClass()
	 * @generated
	 * @ordered
	 */
	protected ClassicClassType travelClass = TRAVEL_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceConstraintText() <em>Service Constraint Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConstraintText()
	 * @generated
	 * @ordered
	 */
	protected Text serviceConstraintText;

	/**
	 * The cached value of the '{@link #getCarrierConstraintText() <em>Carrier Constraint Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierConstraintText()
	 * @generated
	 * @ordered
	 */
	protected Text carrierConstraintText;

	/**
	 * The cached value of the '{@link #getConditionTexts() <em>Condition Texts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionTexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionText> conditionTexts;

	/**
	 * The default value of the '{@link #getReturnProduct() <em>Return Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnProduct()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RETURN_PRODUCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnProduct() <em>Return Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnProduct()
	 * @generated
	 * @ordered
	 */
	protected Boolean returnProduct = RETURN_PRODUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrainBound() <em>Train Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainBound()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TRAIN_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrainBound() <em>Train Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainBound()
	 * @generated
	 * @ordered
	 */
	protected Boolean trainBound = TRAIN_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefundableAfterValidity() <em>Refundable After Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefundableAfterValidity()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REFUNDABLE_AFTER_VALIDITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefundableAfterValidity() <em>Refundable After Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefundableAfterValidity()
	 * @generated
	 * @ordered
	 */
	protected Boolean refundableAfterValidity = REFUNDABLE_AFTER_VALIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefundableBeforeValidity() <em>Refundable Before Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefundableBeforeValidity()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REFUNDABLE_BEFORE_VALIDITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefundableBeforeValidity() <em>Refundable Before Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefundableBeforeValidity()
	 * @generated
	 * @ordered
	 */
	protected Boolean refundableBeforeValidity = REFUNDABLE_BEFORE_VALIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExchangeableAfterValidity() <em>Exchangeable After Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeableAfterValidity()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCHANGEABLE_AFTER_VALIDITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExchangeableAfterValidity() <em>Exchangeable After Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeableAfterValidity()
	 * @generated
	 * @ordered
	 */
	protected Boolean exchangeableAfterValidity = EXCHANGEABLE_AFTER_VALIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExchangeableBeforeValidity() <em>Exchangeable Before Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeableBeforeValidity()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCHANGEABLE_BEFORE_VALIDITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExchangeableBeforeValidity() <em>Exchangeable Before Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeableBeforeValidity()
	 * @generated
	 * @ordered
	 */
	protected Boolean exchangeableBeforeValidity = EXCHANGEABLE_BEFORE_VALIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ProductType TYPE_EDEFAULT = ProductType.ADMISSION_POINT2POINT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ProductType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.PRODUCT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (Text)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.PRODUCT__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Text newName) {
		Text oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getSummary() {
		if (summary != null && summary.eIsProxy()) {
			InternalEObject oldSummary = (InternalEObject)summary;
			summary = (Text)eResolveProxy(oldSummary);
			if (summary != oldSummary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.PRODUCT__SUMMARY, oldSummary, summary));
			}
		}
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(Text newSummary) {
		Text oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (Text)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.PRODUCT__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Text newDescription) {
		Text oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicClassType getTravelClass() {
		return travelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelClass(ClassicClassType newTravelClass) {
		ClassicClassType oldTravelClass = travelClass;
		travelClass = newTravelClass == null ? TRAVEL_CLASS_EDEFAULT : newTravelClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__TRAVEL_CLASS, oldTravelClass, travelClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getServiceConstraintText() {
		if (serviceConstraintText != null && serviceConstraintText.eIsProxy()) {
			InternalEObject oldServiceConstraintText = (InternalEObject)serviceConstraintText;
			serviceConstraintText = (Text)eResolveProxy(oldServiceConstraintText);
			if (serviceConstraintText != oldServiceConstraintText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.PRODUCT__SERVICE_CONSTRAINT_TEXT, oldServiceConstraintText, serviceConstraintText));
			}
		}
		return serviceConstraintText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetServiceConstraintText() {
		return serviceConstraintText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceConstraintText(Text newServiceConstraintText) {
		Text oldServiceConstraintText = serviceConstraintText;
		serviceConstraintText = newServiceConstraintText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__SERVICE_CONSTRAINT_TEXT, oldServiceConstraintText, serviceConstraintText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getCarrierConstraintText() {
		if (carrierConstraintText != null && carrierConstraintText.eIsProxy()) {
			InternalEObject oldCarrierConstraintText = (InternalEObject)carrierConstraintText;
			carrierConstraintText = (Text)eResolveProxy(oldCarrierConstraintText);
			if (carrierConstraintText != oldCarrierConstraintText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.PRODUCT__CARRIER_CONSTRAINT_TEXT, oldCarrierConstraintText, carrierConstraintText));
			}
		}
		return carrierConstraintText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetCarrierConstraintText() {
		return carrierConstraintText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierConstraintText(Text newCarrierConstraintText) {
		Text oldCarrierConstraintText = carrierConstraintText;
		carrierConstraintText = newCarrierConstraintText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__CARRIER_CONSTRAINT_TEXT, oldCarrierConstraintText, carrierConstraintText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionText> getConditionTexts() {
		if (conditionTexts == null) {
			conditionTexts = new EObjectContainmentEList<ConditionText>(ConditionText.class, this, GtmPackage.PRODUCT__CONDITION_TEXTS);
		}
		return conditionTexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getReturnProduct() {
		return returnProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnProduct(Boolean newReturnProduct) {
		Boolean oldReturnProduct = returnProduct;
		returnProduct = newReturnProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__RETURN_PRODUCT, oldReturnProduct, returnProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTrainBound() {
		return trainBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainBound(Boolean newTrainBound) {
		Boolean oldTrainBound = trainBound;
		trainBound = newTrainBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__TRAIN_BOUND, oldTrainBound, trainBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRefundableAfterValidity() {
		return refundableAfterValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefundableAfterValidity(Boolean newRefundableAfterValidity) {
		Boolean oldRefundableAfterValidity = refundableAfterValidity;
		refundableAfterValidity = newRefundableAfterValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__REFUNDABLE_AFTER_VALIDITY, oldRefundableAfterValidity, refundableAfterValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRefundableBeforeValidity() {
		return refundableBeforeValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefundableBeforeValidity(Boolean newRefundableBeforeValidity) {
		Boolean oldRefundableBeforeValidity = refundableBeforeValidity;
		refundableBeforeValidity = newRefundableBeforeValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__REFUNDABLE_BEFORE_VALIDITY, oldRefundableBeforeValidity, refundableBeforeValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getExchangeableAfterValidity() {
		return exchangeableAfterValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeableAfterValidity(Boolean newExchangeableAfterValidity) {
		Boolean oldExchangeableAfterValidity = exchangeableAfterValidity;
		exchangeableAfterValidity = newExchangeableAfterValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__EXCHANGEABLE_AFTER_VALIDITY, oldExchangeableAfterValidity, exchangeableAfterValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getExchangeableBeforeValidity() {
		return exchangeableBeforeValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeableBeforeValidity(Boolean newExchangeableBeforeValidity) {
		Boolean oldExchangeableBeforeValidity = exchangeableBeforeValidity;
		exchangeableBeforeValidity = newExchangeableBeforeValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__EXCHANGEABLE_BEFORE_VALIDITY, oldExchangeableBeforeValidity, exchangeableBeforeValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ProductType newType) {
		ProductType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PRODUCT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.PRODUCT__CONDITION_TEXTS:
				return ((InternalEList<?>)getConditionTexts()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.PRODUCT__ID:
				return getId();
			case GtmPackage.PRODUCT__CODE:
				return getCode();
			case GtmPackage.PRODUCT__NAME:
				if (resolve) return getName();
				return basicGetName();
			case GtmPackage.PRODUCT__SUMMARY:
				if (resolve) return getSummary();
				return basicGetSummary();
			case GtmPackage.PRODUCT__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case GtmPackage.PRODUCT__TRAVEL_CLASS:
				return getTravelClass();
			case GtmPackage.PRODUCT__SERVICE_CONSTRAINT_TEXT:
				if (resolve) return getServiceConstraintText();
				return basicGetServiceConstraintText();
			case GtmPackage.PRODUCT__CARRIER_CONSTRAINT_TEXT:
				if (resolve) return getCarrierConstraintText();
				return basicGetCarrierConstraintText();
			case GtmPackage.PRODUCT__CONDITION_TEXTS:
				return getConditionTexts();
			case GtmPackage.PRODUCT__RETURN_PRODUCT:
				return getReturnProduct();
			case GtmPackage.PRODUCT__TRAIN_BOUND:
				return getTrainBound();
			case GtmPackage.PRODUCT__REFUNDABLE_AFTER_VALIDITY:
				return getRefundableAfterValidity();
			case GtmPackage.PRODUCT__REFUNDABLE_BEFORE_VALIDITY:
				return getRefundableBeforeValidity();
			case GtmPackage.PRODUCT__EXCHANGEABLE_AFTER_VALIDITY:
				return getExchangeableAfterValidity();
			case GtmPackage.PRODUCT__EXCHANGEABLE_BEFORE_VALIDITY:
				return getExchangeableBeforeValidity();
			case GtmPackage.PRODUCT__TYPE:
				return getType();
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
			case GtmPackage.PRODUCT__ID:
				setId((String)newValue);
				return;
			case GtmPackage.PRODUCT__CODE:
				setCode((String)newValue);
				return;
			case GtmPackage.PRODUCT__NAME:
				setName((Text)newValue);
				return;
			case GtmPackage.PRODUCT__SUMMARY:
				setSummary((Text)newValue);
				return;
			case GtmPackage.PRODUCT__DESCRIPTION:
				setDescription((Text)newValue);
				return;
			case GtmPackage.PRODUCT__TRAVEL_CLASS:
				setTravelClass((ClassicClassType)newValue);
				return;
			case GtmPackage.PRODUCT__SERVICE_CONSTRAINT_TEXT:
				setServiceConstraintText((Text)newValue);
				return;
			case GtmPackage.PRODUCT__CARRIER_CONSTRAINT_TEXT:
				setCarrierConstraintText((Text)newValue);
				return;
			case GtmPackage.PRODUCT__CONDITION_TEXTS:
				getConditionTexts().clear();
				getConditionTexts().addAll((Collection<? extends ConditionText>)newValue);
				return;
			case GtmPackage.PRODUCT__RETURN_PRODUCT:
				setReturnProduct((Boolean)newValue);
				return;
			case GtmPackage.PRODUCT__TRAIN_BOUND:
				setTrainBound((Boolean)newValue);
				return;
			case GtmPackage.PRODUCT__REFUNDABLE_AFTER_VALIDITY:
				setRefundableAfterValidity((Boolean)newValue);
				return;
			case GtmPackage.PRODUCT__REFUNDABLE_BEFORE_VALIDITY:
				setRefundableBeforeValidity((Boolean)newValue);
				return;
			case GtmPackage.PRODUCT__EXCHANGEABLE_AFTER_VALIDITY:
				setExchangeableAfterValidity((Boolean)newValue);
				return;
			case GtmPackage.PRODUCT__EXCHANGEABLE_BEFORE_VALIDITY:
				setExchangeableBeforeValidity((Boolean)newValue);
				return;
			case GtmPackage.PRODUCT__TYPE:
				setType((ProductType)newValue);
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
			case GtmPackage.PRODUCT__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.PRODUCT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case GtmPackage.PRODUCT__NAME:
				setName((Text)null);
				return;
			case GtmPackage.PRODUCT__SUMMARY:
				setSummary((Text)null);
				return;
			case GtmPackage.PRODUCT__DESCRIPTION:
				setDescription((Text)null);
				return;
			case GtmPackage.PRODUCT__TRAVEL_CLASS:
				setTravelClass(TRAVEL_CLASS_EDEFAULT);
				return;
			case GtmPackage.PRODUCT__SERVICE_CONSTRAINT_TEXT:
				setServiceConstraintText((Text)null);
				return;
			case GtmPackage.PRODUCT__CARRIER_CONSTRAINT_TEXT:
				setCarrierConstraintText((Text)null);
				return;
			case GtmPackage.PRODUCT__CONDITION_TEXTS:
				getConditionTexts().clear();
				return;
			case GtmPackage.PRODUCT__RETURN_PRODUCT:
				setReturnProduct(RETURN_PRODUCT_EDEFAULT);
				return;
			case GtmPackage.PRODUCT__TRAIN_BOUND:
				setTrainBound(TRAIN_BOUND_EDEFAULT);
				return;
			case GtmPackage.PRODUCT__REFUNDABLE_AFTER_VALIDITY:
				setRefundableAfterValidity(REFUNDABLE_AFTER_VALIDITY_EDEFAULT);
				return;
			case GtmPackage.PRODUCT__REFUNDABLE_BEFORE_VALIDITY:
				setRefundableBeforeValidity(REFUNDABLE_BEFORE_VALIDITY_EDEFAULT);
				return;
			case GtmPackage.PRODUCT__EXCHANGEABLE_AFTER_VALIDITY:
				setExchangeableAfterValidity(EXCHANGEABLE_AFTER_VALIDITY_EDEFAULT);
				return;
			case GtmPackage.PRODUCT__EXCHANGEABLE_BEFORE_VALIDITY:
				setExchangeableBeforeValidity(EXCHANGEABLE_BEFORE_VALIDITY_EDEFAULT);
				return;
			case GtmPackage.PRODUCT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case GtmPackage.PRODUCT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.PRODUCT__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case GtmPackage.PRODUCT__NAME:
				return name != null;
			case GtmPackage.PRODUCT__SUMMARY:
				return summary != null;
			case GtmPackage.PRODUCT__DESCRIPTION:
				return description != null;
			case GtmPackage.PRODUCT__TRAVEL_CLASS:
				return travelClass != TRAVEL_CLASS_EDEFAULT;
			case GtmPackage.PRODUCT__SERVICE_CONSTRAINT_TEXT:
				return serviceConstraintText != null;
			case GtmPackage.PRODUCT__CARRIER_CONSTRAINT_TEXT:
				return carrierConstraintText != null;
			case GtmPackage.PRODUCT__CONDITION_TEXTS:
				return conditionTexts != null && !conditionTexts.isEmpty();
			case GtmPackage.PRODUCT__RETURN_PRODUCT:
				return RETURN_PRODUCT_EDEFAULT == null ? returnProduct != null : !RETURN_PRODUCT_EDEFAULT.equals(returnProduct);
			case GtmPackage.PRODUCT__TRAIN_BOUND:
				return TRAIN_BOUND_EDEFAULT == null ? trainBound != null : !TRAIN_BOUND_EDEFAULT.equals(trainBound);
			case GtmPackage.PRODUCT__REFUNDABLE_AFTER_VALIDITY:
				return REFUNDABLE_AFTER_VALIDITY_EDEFAULT == null ? refundableAfterValidity != null : !REFUNDABLE_AFTER_VALIDITY_EDEFAULT.equals(refundableAfterValidity);
			case GtmPackage.PRODUCT__REFUNDABLE_BEFORE_VALIDITY:
				return REFUNDABLE_BEFORE_VALIDITY_EDEFAULT == null ? refundableBeforeValidity != null : !REFUNDABLE_BEFORE_VALIDITY_EDEFAULT.equals(refundableBeforeValidity);
			case GtmPackage.PRODUCT__EXCHANGEABLE_AFTER_VALIDITY:
				return EXCHANGEABLE_AFTER_VALIDITY_EDEFAULT == null ? exchangeableAfterValidity != null : !EXCHANGEABLE_AFTER_VALIDITY_EDEFAULT.equals(exchangeableAfterValidity);
			case GtmPackage.PRODUCT__EXCHANGEABLE_BEFORE_VALIDITY:
				return EXCHANGEABLE_BEFORE_VALIDITY_EDEFAULT == null ? exchangeableBeforeValidity != null : !EXCHANGEABLE_BEFORE_VALIDITY_EDEFAULT.equals(exchangeableBeforeValidity);
			case GtmPackage.PRODUCT__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(", code: ");
		result.append(code);
		result.append(", travelClass: ");
		result.append(travelClass);
		result.append(", returnProduct: ");
		result.append(returnProduct);
		result.append(", trainBound: ");
		result.append(trainBound);
		result.append(", refundableAfterValidity: ");
		result.append(refundableAfterValidity);
		result.append(", refundableBeforeValidity: ");
		result.append(refundableBeforeValidity);
		result.append(", exchangeableAfterValidity: ");
		result.append(exchangeableAfterValidity);
		result.append(", exchangeableBeforeValidity: ");
		result.append(exchangeableBeforeValidity);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
