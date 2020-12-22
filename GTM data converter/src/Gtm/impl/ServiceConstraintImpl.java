/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ServiceBrand;
import Gtm.ServiceConstraint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ServiceConstraintImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.ServiceConstraintImpl#getIncludedServiceBrands <em>Included Service Brands</em>}</li>
 *   <li>{@link Gtm.impl.ServiceConstraintImpl#getExcludedServiceBrands <em>Excluded Service Brands</em>}</li>
 *   <li>{@link Gtm.impl.ServiceConstraintImpl#getDataDescription <em>Data Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceConstraintImpl extends MinimalEObjectImpl.Container implements ServiceConstraint {
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
	 * The cached value of the '{@link #getIncludedServiceBrands() <em>Included Service Brands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedServiceBrands()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceBrand> includedServiceBrands;

	/**
	 * The cached value of the '{@link #getExcludedServiceBrands() <em>Excluded Service Brands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedServiceBrands()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceBrand> excludedServiceBrands;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.SERVICE_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.SERVICE_CONSTRAINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceBrand> getIncludedServiceBrands() {
		if (includedServiceBrands == null) {
			includedServiceBrands = new EObjectResolvingEList<ServiceBrand>(ServiceBrand.class, this, GtmPackage.SERVICE_CONSTRAINT__INCLUDED_SERVICE_BRANDS);
		}
		return includedServiceBrands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceBrand> getExcludedServiceBrands() {
		if (excludedServiceBrands == null) {
			excludedServiceBrands = new EObjectResolvingEList<ServiceBrand>(ServiceBrand.class, this, GtmPackage.SERVICE_CONSTRAINT__EXCLUDED_SERVICE_BRANDS);
		}
		return excludedServiceBrands;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.SERVICE_CONSTRAINT__DATA_DESCRIPTION, oldDataDescription, dataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.SERVICE_CONSTRAINT__ID:
				return getId();
			case GtmPackage.SERVICE_CONSTRAINT__INCLUDED_SERVICE_BRANDS:
				return getIncludedServiceBrands();
			case GtmPackage.SERVICE_CONSTRAINT__EXCLUDED_SERVICE_BRANDS:
				return getExcludedServiceBrands();
			case GtmPackage.SERVICE_CONSTRAINT__DATA_DESCRIPTION:
				return getDataDescription();
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
			case GtmPackage.SERVICE_CONSTRAINT__ID:
				setId((String)newValue);
				return;
			case GtmPackage.SERVICE_CONSTRAINT__INCLUDED_SERVICE_BRANDS:
				getIncludedServiceBrands().clear();
				getIncludedServiceBrands().addAll((Collection<? extends ServiceBrand>)newValue);
				return;
			case GtmPackage.SERVICE_CONSTRAINT__EXCLUDED_SERVICE_BRANDS:
				getExcludedServiceBrands().clear();
				getExcludedServiceBrands().addAll((Collection<? extends ServiceBrand>)newValue);
				return;
			case GtmPackage.SERVICE_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription((String)newValue);
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
			case GtmPackage.SERVICE_CONSTRAINT__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.SERVICE_CONSTRAINT__INCLUDED_SERVICE_BRANDS:
				getIncludedServiceBrands().clear();
				return;
			case GtmPackage.SERVICE_CONSTRAINT__EXCLUDED_SERVICE_BRANDS:
				getExcludedServiceBrands().clear();
				return;
			case GtmPackage.SERVICE_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription(DATA_DESCRIPTION_EDEFAULT);
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
			case GtmPackage.SERVICE_CONSTRAINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.SERVICE_CONSTRAINT__INCLUDED_SERVICE_BRANDS:
				return includedServiceBrands != null && !includedServiceBrands.isEmpty();
			case GtmPackage.SERVICE_CONSTRAINT__EXCLUDED_SERVICE_BRANDS:
				return excludedServiceBrands != null && !excludedServiceBrands.isEmpty();
			case GtmPackage.SERVICE_CONSTRAINT__DATA_DESCRIPTION:
				return DATA_DESCRIPTION_EDEFAULT == null ? dataDescription != null : !DATA_DESCRIPTION_EDEFAULT.equals(dataDescription);
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
		result.append(')');
		return result.toString();
	}

} //ServiceConstraintImpl
