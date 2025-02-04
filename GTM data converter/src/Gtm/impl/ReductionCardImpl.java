/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.GtmPackage;
import Gtm.ReductionCard;
import Gtm.ServiceClass;
import Gtm.Text;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reduction Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ReductionCardImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.ReductionCardImpl#getShortCode <em>Short Code</em>}</li>
 *   <li>{@link Gtm.impl.ReductionCardImpl#getCardIssuer <em>Card Issuer</em>}</li>
 *   <li>{@link Gtm.impl.ReductionCardImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.impl.ReductionCardImpl#getServiceClasses <em>Service Classes</em>}</li>
 *   <li>{@link Gtm.impl.ReductionCardImpl#isIdRequiredForBooking <em>Id Required For Booking</em>}</li>
 *   <li>{@link Gtm.impl.ReductionCardImpl#getIncludedReductionCards <em>Included Reduction Cards</em>}</li>
 *   <li>{@link Gtm.impl.ReductionCardImpl#isUicCode <em>Uic Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReductionCardImpl extends MinimalEObjectImpl.Container implements ReductionCard {
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
	 * The default value of the '{@link #getShortCode() <em>Short Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortCode() <em>Short Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortCode()
	 * @generated
	 * @ordered
	 */
	protected String shortCode = SHORT_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCardIssuer() <em>Card Issuer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardIssuer()
	 * @generated
	 * @ordered
	 */
	protected Carrier cardIssuer;

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
	 * The cached value of the '{@link #getServiceClasses() <em>Service Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceClass> serviceClasses;

	/**
	 * The default value of the '{@link #isIdRequiredForBooking() <em>Id Required For Booking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdRequiredForBooking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ID_REQUIRED_FOR_BOOKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIdRequiredForBooking() <em>Id Required For Booking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdRequiredForBooking()
	 * @generated
	 * @ordered
	 */
	protected boolean idRequiredForBooking = ID_REQUIRED_FOR_BOOKING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncludedReductionCards() <em>Included Reduction Cards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedReductionCards()
	 * @generated
	 * @ordered
	 */
	protected EList<ReductionCard> includedReductionCards;

	/**
	 * The default value of the '{@link #isUicCode() <em>Uic Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUicCode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UIC_CODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUicCode() <em>Uic Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUicCode()
	 * @generated
	 * @ordered
	 */
	protected boolean uicCode = UIC_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReductionCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.REDUCTION_CARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REDUCTION_CARD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortCode() {
		return shortCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortCode(String newShortCode) {
		String oldShortCode = shortCode;
		shortCode = newShortCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REDUCTION_CARD__SHORT_CODE, oldShortCode, shortCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier getCardIssuer() {
		if (cardIssuer != null && cardIssuer.eIsProxy()) {
			InternalEObject oldCardIssuer = (InternalEObject)cardIssuer;
			cardIssuer = (Carrier)eResolveProxy(oldCardIssuer);
			if (cardIssuer != oldCardIssuer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.REDUCTION_CARD__CARD_ISSUER, oldCardIssuer, cardIssuer));
			}
		}
		return cardIssuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier basicGetCardIssuer() {
		return cardIssuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardIssuer(Carrier newCardIssuer) {
		Carrier oldCardIssuer = cardIssuer;
		cardIssuer = newCardIssuer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REDUCTION_CARD__CARD_ISSUER, oldCardIssuer, cardIssuer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.REDUCTION_CARD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REDUCTION_CARD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceClass> getServiceClasses() {
		if (serviceClasses == null) {
			serviceClasses = new EObjectResolvingEList<ServiceClass>(ServiceClass.class, this, GtmPackage.REDUCTION_CARD__SERVICE_CLASSES);
		}
		return serviceClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIdRequiredForBooking() {
		return idRequiredForBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdRequiredForBooking(boolean newIdRequiredForBooking) {
		boolean oldIdRequiredForBooking = idRequiredForBooking;
		idRequiredForBooking = newIdRequiredForBooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REDUCTION_CARD__ID_REQUIRED_FOR_BOOKING, oldIdRequiredForBooking, idRequiredForBooking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReductionCard> getIncludedReductionCards() {
		if (includedReductionCards == null) {
			includedReductionCards = new EObjectResolvingEList<ReductionCard>(ReductionCard.class, this, GtmPackage.REDUCTION_CARD__INCLUDED_REDUCTION_CARDS);
		}
		return includedReductionCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUicCode() {
		return uicCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUicCode(boolean newUicCode) {
		boolean oldUicCode = uicCode;
		uicCode = newUicCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REDUCTION_CARD__UIC_CODE, oldUicCode, uicCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.REDUCTION_CARD__ID:
				return getId();
			case GtmPackage.REDUCTION_CARD__SHORT_CODE:
				return getShortCode();
			case GtmPackage.REDUCTION_CARD__CARD_ISSUER:
				if (resolve) return getCardIssuer();
				return basicGetCardIssuer();
			case GtmPackage.REDUCTION_CARD__NAME:
				if (resolve) return getName();
				return basicGetName();
			case GtmPackage.REDUCTION_CARD__SERVICE_CLASSES:
				return getServiceClasses();
			case GtmPackage.REDUCTION_CARD__ID_REQUIRED_FOR_BOOKING:
				return isIdRequiredForBooking();
			case GtmPackage.REDUCTION_CARD__INCLUDED_REDUCTION_CARDS:
				return getIncludedReductionCards();
			case GtmPackage.REDUCTION_CARD__UIC_CODE:
				return isUicCode();
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
			case GtmPackage.REDUCTION_CARD__ID:
				setId((String)newValue);
				return;
			case GtmPackage.REDUCTION_CARD__SHORT_CODE:
				setShortCode((String)newValue);
				return;
			case GtmPackage.REDUCTION_CARD__CARD_ISSUER:
				setCardIssuer((Carrier)newValue);
				return;
			case GtmPackage.REDUCTION_CARD__NAME:
				setName((Text)newValue);
				return;
			case GtmPackage.REDUCTION_CARD__SERVICE_CLASSES:
				getServiceClasses().clear();
				getServiceClasses().addAll((Collection<? extends ServiceClass>)newValue);
				return;
			case GtmPackage.REDUCTION_CARD__ID_REQUIRED_FOR_BOOKING:
				setIdRequiredForBooking((Boolean)newValue);
				return;
			case GtmPackage.REDUCTION_CARD__INCLUDED_REDUCTION_CARDS:
				getIncludedReductionCards().clear();
				getIncludedReductionCards().addAll((Collection<? extends ReductionCard>)newValue);
				return;
			case GtmPackage.REDUCTION_CARD__UIC_CODE:
				setUicCode((Boolean)newValue);
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
			case GtmPackage.REDUCTION_CARD__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.REDUCTION_CARD__SHORT_CODE:
				setShortCode(SHORT_CODE_EDEFAULT);
				return;
			case GtmPackage.REDUCTION_CARD__CARD_ISSUER:
				setCardIssuer((Carrier)null);
				return;
			case GtmPackage.REDUCTION_CARD__NAME:
				setName((Text)null);
				return;
			case GtmPackage.REDUCTION_CARD__SERVICE_CLASSES:
				getServiceClasses().clear();
				return;
			case GtmPackage.REDUCTION_CARD__ID_REQUIRED_FOR_BOOKING:
				setIdRequiredForBooking(ID_REQUIRED_FOR_BOOKING_EDEFAULT);
				return;
			case GtmPackage.REDUCTION_CARD__INCLUDED_REDUCTION_CARDS:
				getIncludedReductionCards().clear();
				return;
			case GtmPackage.REDUCTION_CARD__UIC_CODE:
				setUicCode(UIC_CODE_EDEFAULT);
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
			case GtmPackage.REDUCTION_CARD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.REDUCTION_CARD__SHORT_CODE:
				return SHORT_CODE_EDEFAULT == null ? shortCode != null : !SHORT_CODE_EDEFAULT.equals(shortCode);
			case GtmPackage.REDUCTION_CARD__CARD_ISSUER:
				return cardIssuer != null;
			case GtmPackage.REDUCTION_CARD__NAME:
				return name != null;
			case GtmPackage.REDUCTION_CARD__SERVICE_CLASSES:
				return serviceClasses != null && !serviceClasses.isEmpty();
			case GtmPackage.REDUCTION_CARD__ID_REQUIRED_FOR_BOOKING:
				return idRequiredForBooking != ID_REQUIRED_FOR_BOOKING_EDEFAULT;
			case GtmPackage.REDUCTION_CARD__INCLUDED_REDUCTION_CARDS:
				return includedReductionCards != null && !includedReductionCards.isEmpty();
			case GtmPackage.REDUCTION_CARD__UIC_CODE:
				return uicCode != UIC_CODE_EDEFAULT;
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
		result.append(", shortCode: ");
		result.append(shortCode);
		result.append(", idRequiredForBooking: ");
		result.append(idRequiredForBooking);
		result.append(", uicCode: ");
		result.append(uicCode);
		result.append(')');
		return result.toString();
	}

} //ReductionCardImpl
