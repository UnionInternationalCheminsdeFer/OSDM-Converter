/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.Legacy108Memo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy108 Memo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.Legacy108MemoImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108MemoImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108MemoImpl#getEnglish <em>English</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108MemoImpl#getFrench <em>French</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108MemoImpl#getGerman <em>German</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Legacy108MemoImpl extends MinimalEObjectImpl.Container implements Legacy108Memo {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected String local = LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnglish() <em>English</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnglish()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGLISH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnglish() <em>English</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnglish()
	 * @generated
	 * @ordered
	 */
	protected String english = ENGLISH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrench() <em>French</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrench()
	 * @generated
	 * @ordered
	 */
	protected static final String FRENCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrench() <em>French</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrench()
	 * @generated
	 * @ordered
	 */
	protected String french = FRENCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getGerman() <em>German</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGerman()
	 * @generated
	 * @ordered
	 */
	protected static final String GERMAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGerman() <em>German</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGerman()
	 * @generated
	 * @ordered
	 */
	protected String german = GERMAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Legacy108MemoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY108_MEMO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_MEMO__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocal() {
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(String newLocal) {
		String oldLocal = local;
		local = newLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_MEMO__LOCAL, oldLocal, local));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnglish() {
		return english;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnglish(String newEnglish) {
		String oldEnglish = english;
		english = newEnglish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_MEMO__ENGLISH, oldEnglish, english));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrench() {
		return french;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrench(String newFrench) {
		String oldFrench = french;
		french = newFrench;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_MEMO__FRENCH, oldFrench, french));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGerman() {
		return german;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGerman(String newGerman) {
		String oldGerman = german;
		german = newGerman;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_MEMO__GERMAN, oldGerman, german));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.LEGACY108_MEMO__NUMBER:
				return getNumber();
			case GtmPackage.LEGACY108_MEMO__LOCAL:
				return getLocal();
			case GtmPackage.LEGACY108_MEMO__ENGLISH:
				return getEnglish();
			case GtmPackage.LEGACY108_MEMO__FRENCH:
				return getFrench();
			case GtmPackage.LEGACY108_MEMO__GERMAN:
				return getGerman();
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
			case GtmPackage.LEGACY108_MEMO__NUMBER:
				setNumber((Integer)newValue);
				return;
			case GtmPackage.LEGACY108_MEMO__LOCAL:
				setLocal((String)newValue);
				return;
			case GtmPackage.LEGACY108_MEMO__ENGLISH:
				setEnglish((String)newValue);
				return;
			case GtmPackage.LEGACY108_MEMO__FRENCH:
				setFrench((String)newValue);
				return;
			case GtmPackage.LEGACY108_MEMO__GERMAN:
				setGerman((String)newValue);
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
			case GtmPackage.LEGACY108_MEMO__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case GtmPackage.LEGACY108_MEMO__LOCAL:
				setLocal(LOCAL_EDEFAULT);
				return;
			case GtmPackage.LEGACY108_MEMO__ENGLISH:
				setEnglish(ENGLISH_EDEFAULT);
				return;
			case GtmPackage.LEGACY108_MEMO__FRENCH:
				setFrench(FRENCH_EDEFAULT);
				return;
			case GtmPackage.LEGACY108_MEMO__GERMAN:
				setGerman(GERMAN_EDEFAULT);
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
			case GtmPackage.LEGACY108_MEMO__NUMBER:
				return number != NUMBER_EDEFAULT;
			case GtmPackage.LEGACY108_MEMO__LOCAL:
				return LOCAL_EDEFAULT == null ? local != null : !LOCAL_EDEFAULT.equals(local);
			case GtmPackage.LEGACY108_MEMO__ENGLISH:
				return ENGLISH_EDEFAULT == null ? english != null : !ENGLISH_EDEFAULT.equals(english);
			case GtmPackage.LEGACY108_MEMO__FRENCH:
				return FRENCH_EDEFAULT == null ? french != null : !FRENCH_EDEFAULT.equals(french);
			case GtmPackage.LEGACY108_MEMO__GERMAN:
				return GERMAN_EDEFAULT == null ? german != null : !GERMAN_EDEFAULT.equals(german);
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
		result.append(" (number: ");
		result.append(number);
		result.append(", local: ");
		result.append(local);
		result.append(", english: ");
		result.append(english);
		result.append(", french: ");
		result.append(french);
		result.append(", german: ");
		result.append(german);
		result.append(')');
		return result.toString();
	}

} //Legacy108MemoImpl
