/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyCarrier;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Carrier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyCarrierImpl#getCarrierCode <em>Carrier Code</em>}</li>
 *   <li>{@link Gtm.impl.LegacyCarrierImpl#getCarrierShortName <em>Carrier Short Name</em>}</li>
 *   <li>{@link Gtm.impl.LegacyCarrierImpl#getCarrierName <em>Carrier Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyCarrierImpl extends MinimalEObjectImpl.Container implements LegacyCarrier {
	/**
	 * The default value of the '{@link #getCarrierCode() <em>Carrier Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierCode() <em>Carrier Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierCode()
	 * @generated
	 * @ordered
	 */
	protected String carrierCode = CARRIER_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierShortName() <em>Carrier Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierShortName() <em>Carrier Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierShortName()
	 * @generated
	 * @ordered
	 */
	protected String carrierShortName = CARRIER_SHORT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierName() <em>Carrier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierName()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierName() <em>Carrier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierName()
	 * @generated
	 * @ordered
	 */
	protected String carrierName = CARRIER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyCarrierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_CARRIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCarrierCode() {
		return carrierCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierCode(String newCarrierCode) {
		String oldCarrierCode = carrierCode;
		carrierCode = newCarrierCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_CARRIER__CARRIER_CODE, oldCarrierCode, carrierCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCarrierShortName() {
		return carrierShortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierShortName(String newCarrierShortName) {
		String oldCarrierShortName = carrierShortName;
		carrierShortName = newCarrierShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_CARRIER__CARRIER_SHORT_NAME, oldCarrierShortName, carrierShortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCarrierName() {
		return carrierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierName(String newCarrierName) {
		String oldCarrierName = carrierName;
		carrierName = newCarrierName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_CARRIER__CARRIER_NAME, oldCarrierName, carrierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.LEGACY_CARRIER__CARRIER_CODE:
				return getCarrierCode();
			case GtmPackage.LEGACY_CARRIER__CARRIER_SHORT_NAME:
				return getCarrierShortName();
			case GtmPackage.LEGACY_CARRIER__CARRIER_NAME:
				return getCarrierName();
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
			case GtmPackage.LEGACY_CARRIER__CARRIER_CODE:
				setCarrierCode((String)newValue);
				return;
			case GtmPackage.LEGACY_CARRIER__CARRIER_SHORT_NAME:
				setCarrierShortName((String)newValue);
				return;
			case GtmPackage.LEGACY_CARRIER__CARRIER_NAME:
				setCarrierName((String)newValue);
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
			case GtmPackage.LEGACY_CARRIER__CARRIER_CODE:
				setCarrierCode(CARRIER_CODE_EDEFAULT);
				return;
			case GtmPackage.LEGACY_CARRIER__CARRIER_SHORT_NAME:
				setCarrierShortName(CARRIER_SHORT_NAME_EDEFAULT);
				return;
			case GtmPackage.LEGACY_CARRIER__CARRIER_NAME:
				setCarrierName(CARRIER_NAME_EDEFAULT);
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
			case GtmPackage.LEGACY_CARRIER__CARRIER_CODE:
				return CARRIER_CODE_EDEFAULT == null ? carrierCode != null : !CARRIER_CODE_EDEFAULT.equals(carrierCode);
			case GtmPackage.LEGACY_CARRIER__CARRIER_SHORT_NAME:
				return CARRIER_SHORT_NAME_EDEFAULT == null ? carrierShortName != null : !CARRIER_SHORT_NAME_EDEFAULT.equals(carrierShortName);
			case GtmPackage.LEGACY_CARRIER__CARRIER_NAME:
				return CARRIER_NAME_EDEFAULT == null ? carrierName != null : !CARRIER_NAME_EDEFAULT.equals(carrierName);
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
		result.append(" (carrierCode: ");
		result.append(carrierCode);
		result.append(", carrierShortName: ");
		result.append(carrierShortName);
		result.append(", carrierName: ");
		result.append(carrierName);
		result.append(')');
		return result.toString();
	}

} //LegacyCarrierImpl
