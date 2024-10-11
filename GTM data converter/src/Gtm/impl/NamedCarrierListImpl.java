/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.GtmPackage;
import Gtm.NamedCarrierList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Carrier List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.NamedCarrierListImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.impl.NamedCarrierListImpl#getCarriers <em>Carriers</em>}</li>
 *   <li>{@link Gtm.impl.NamedCarrierListImpl#getReplacementCode <em>Replacement Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedCarrierListImpl extends MinimalEObjectImpl.Container implements NamedCarrierList {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCarriers() <em>Carriers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarriers()
	 * @generated
	 * @ordered
	 */
	protected EList<Carrier> carriers;

	/**
	 * The default value of the '{@link #getReplacementCode() <em>Replacement Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementCode()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACEMENT_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplacementCode() <em>Replacement Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementCode()
	 * @generated
	 * @ordered
	 */
	protected String replacementCode = REPLACEMENT_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedCarrierListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.NAMED_CARRIER_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.NAMED_CARRIER_LIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Carrier> getCarriers() {
		if (carriers == null) {
			carriers = new EObjectResolvingEList<Carrier>(Carrier.class, this, GtmPackage.NAMED_CARRIER_LIST__CARRIERS);
		}
		return carriers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplacementCode() {
		return replacementCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacementCode(String newReplacementCode) {
		String oldReplacementCode = replacementCode;
		replacementCode = newReplacementCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.NAMED_CARRIER_LIST__REPLACEMENT_CODE, oldReplacementCode, replacementCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.NAMED_CARRIER_LIST__NAME:
				return getName();
			case GtmPackage.NAMED_CARRIER_LIST__CARRIERS:
				return getCarriers();
			case GtmPackage.NAMED_CARRIER_LIST__REPLACEMENT_CODE:
				return getReplacementCode();
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
			case GtmPackage.NAMED_CARRIER_LIST__NAME:
				setName((String)newValue);
				return;
			case GtmPackage.NAMED_CARRIER_LIST__CARRIERS:
				getCarriers().clear();
				getCarriers().addAll((Collection<? extends Carrier>)newValue);
				return;
			case GtmPackage.NAMED_CARRIER_LIST__REPLACEMENT_CODE:
				setReplacementCode((String)newValue);
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
			case GtmPackage.NAMED_CARRIER_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GtmPackage.NAMED_CARRIER_LIST__CARRIERS:
				getCarriers().clear();
				return;
			case GtmPackage.NAMED_CARRIER_LIST__REPLACEMENT_CODE:
				setReplacementCode(REPLACEMENT_CODE_EDEFAULT);
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
			case GtmPackage.NAMED_CARRIER_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GtmPackage.NAMED_CARRIER_LIST__CARRIERS:
				return carriers != null && !carriers.isEmpty();
			case GtmPackage.NAMED_CARRIER_LIST__REPLACEMENT_CODE:
				return REPLACEMENT_CODE_EDEFAULT == null ? replacementCode != null : !REPLACEMENT_CODE_EDEFAULT.equals(replacementCode);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", replacementCode: ");
		result.append(replacementCode);
		result.append(')');
		return result.toString();
	}

} //NamedCarrierListImpl
