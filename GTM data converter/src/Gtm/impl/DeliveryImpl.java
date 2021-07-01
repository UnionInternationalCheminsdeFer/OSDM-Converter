/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.DataType;
import Gtm.Delivery;
import Gtm.GtmPackage;

import Gtm.SchemaVersion;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delivery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.DeliveryImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.DeliveryImpl#getPreviousDeliveryId <em>Previous Delivery Id</em>}</li>
 *   <li>{@link Gtm.impl.DeliveryImpl#getReplacedDeliveryId <em>Replaced Delivery Id</em>}</li>
 *   <li>{@link Gtm.impl.DeliveryImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link Gtm.impl.DeliveryImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link Gtm.impl.DeliveryImpl#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link Gtm.impl.DeliveryImpl#getAcceptedSchemaVersion <em>Accepted Schema Version</em>}</li>
 *   <li>{@link Gtm.impl.DeliveryImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliveryImpl extends MinimalEObjectImpl.Container implements Delivery {
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
	 * The default value of the '{@link #getPreviousDeliveryId() <em>Previous Delivery Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousDeliveryId()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_DELIVERY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreviousDeliveryId() <em>Previous Delivery Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousDeliveryId()
	 * @generated
	 * @ordered
	 */
	protected String previousDeliveryId = PREVIOUS_DELIVERY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplacedDeliveryId() <em>Replaced Delivery Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacedDeliveryId()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACED_DELIVERY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplacedDeliveryId() <em>Replaced Delivery Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacedDeliveryId()
	 * @generated
	 * @ordered
	 */
	protected String replacedDeliveryId = REPLACED_DELIVERY_ID_EDEFAULT;

	/**
	 * This is true if the Replaced Delivery Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean replacedDeliveryIdESet;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * This is true if the Optional attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optionalESet;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Carrier provider;

	/**
	 * The default value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final SchemaVersion SCHEMA_VERSION_EDEFAULT = SchemaVersion.V12;

	/**
	 * The cached value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected SchemaVersion schemaVersion = SCHEMA_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcceptedSchemaVersion() <em>Accepted Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final SchemaVersion ACCEPTED_SCHEMA_VERSION_EDEFAULT = SchemaVersion.V12;

	/**
	 * The cached value of the '{@link #getAcceptedSchemaVersion() <em>Accepted Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected SchemaVersion acceptedSchemaVersion = ACCEPTED_SCHEMA_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final DataType USAGE_EDEFAULT = DataType.PRODUCTION_DATA;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected DataType usage = USAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.DELIVERY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.DELIVERY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreviousDeliveryId() {
		return previousDeliveryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousDeliveryId(String newPreviousDeliveryId) {
		String oldPreviousDeliveryId = previousDeliveryId;
		previousDeliveryId = newPreviousDeliveryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.DELIVERY__PREVIOUS_DELIVERY_ID, oldPreviousDeliveryId, previousDeliveryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplacedDeliveryId() {
		return replacedDeliveryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacedDeliveryId(String newReplacedDeliveryId) {
		String oldReplacedDeliveryId = replacedDeliveryId;
		replacedDeliveryId = newReplacedDeliveryId;
		boolean oldReplacedDeliveryIdESet = replacedDeliveryIdESet;
		replacedDeliveryIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.DELIVERY__REPLACED_DELIVERY_ID, oldReplacedDeliveryId, replacedDeliveryId, !oldReplacedDeliveryIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReplacedDeliveryId() {
		String oldReplacedDeliveryId = replacedDeliveryId;
		boolean oldReplacedDeliveryIdESet = replacedDeliveryIdESet;
		replacedDeliveryId = REPLACED_DELIVERY_ID_EDEFAULT;
		replacedDeliveryIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GtmPackage.DELIVERY__REPLACED_DELIVERY_ID, oldReplacedDeliveryId, REPLACED_DELIVERY_ID_EDEFAULT, oldReplacedDeliveryIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReplacedDeliveryId() {
		return replacedDeliveryIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		boolean oldOptionalESet = optionalESet;
		optionalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.DELIVERY__OPTIONAL, oldOptional, optional, !oldOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOptional() {
		boolean oldOptional = optional;
		boolean oldOptionalESet = optionalESet;
		optional = OPTIONAL_EDEFAULT;
		optionalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GtmPackage.DELIVERY__OPTIONAL, oldOptional, OPTIONAL_EDEFAULT, oldOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOptional() {
		return optionalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier getProvider() {
		if (provider != null && provider.eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (Carrier)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.DELIVERY__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Carrier newProvider) {
		Carrier oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.DELIVERY__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaVersion getSchemaVersion() {
		return schemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaVersion(SchemaVersion newSchemaVersion) {
		SchemaVersion oldSchemaVersion = schemaVersion;
		schemaVersion = newSchemaVersion == null ? SCHEMA_VERSION_EDEFAULT : newSchemaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.DELIVERY__SCHEMA_VERSION, oldSchemaVersion, schemaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaVersion getAcceptedSchemaVersion() {
		return acceptedSchemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptedSchemaVersion(SchemaVersion newAcceptedSchemaVersion) {
		SchemaVersion oldAcceptedSchemaVersion = acceptedSchemaVersion;
		acceptedSchemaVersion = newAcceptedSchemaVersion == null ? ACCEPTED_SCHEMA_VERSION_EDEFAULT : newAcceptedSchemaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.DELIVERY__ACCEPTED_SCHEMA_VERSION, oldAcceptedSchemaVersion, acceptedSchemaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(DataType newUsage) {
		DataType oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.DELIVERY__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.DELIVERY__ID:
				return getId();
			case GtmPackage.DELIVERY__PREVIOUS_DELIVERY_ID:
				return getPreviousDeliveryId();
			case GtmPackage.DELIVERY__REPLACED_DELIVERY_ID:
				return getReplacedDeliveryId();
			case GtmPackage.DELIVERY__OPTIONAL:
				return isOptional();
			case GtmPackage.DELIVERY__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case GtmPackage.DELIVERY__SCHEMA_VERSION:
				return getSchemaVersion();
			case GtmPackage.DELIVERY__ACCEPTED_SCHEMA_VERSION:
				return getAcceptedSchemaVersion();
			case GtmPackage.DELIVERY__USAGE:
				return getUsage();
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
			case GtmPackage.DELIVERY__ID:
				setId((String)newValue);
				return;
			case GtmPackage.DELIVERY__PREVIOUS_DELIVERY_ID:
				setPreviousDeliveryId((String)newValue);
				return;
			case GtmPackage.DELIVERY__REPLACED_DELIVERY_ID:
				setReplacedDeliveryId((String)newValue);
				return;
			case GtmPackage.DELIVERY__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case GtmPackage.DELIVERY__PROVIDER:
				setProvider((Carrier)newValue);
				return;
			case GtmPackage.DELIVERY__SCHEMA_VERSION:
				setSchemaVersion((SchemaVersion)newValue);
				return;
			case GtmPackage.DELIVERY__ACCEPTED_SCHEMA_VERSION:
				setAcceptedSchemaVersion((SchemaVersion)newValue);
				return;
			case GtmPackage.DELIVERY__USAGE:
				setUsage((DataType)newValue);
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
			case GtmPackage.DELIVERY__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.DELIVERY__PREVIOUS_DELIVERY_ID:
				setPreviousDeliveryId(PREVIOUS_DELIVERY_ID_EDEFAULT);
				return;
			case GtmPackage.DELIVERY__REPLACED_DELIVERY_ID:
				unsetReplacedDeliveryId();
				return;
			case GtmPackage.DELIVERY__OPTIONAL:
				unsetOptional();
				return;
			case GtmPackage.DELIVERY__PROVIDER:
				setProvider((Carrier)null);
				return;
			case GtmPackage.DELIVERY__SCHEMA_VERSION:
				setSchemaVersion(SCHEMA_VERSION_EDEFAULT);
				return;
			case GtmPackage.DELIVERY__ACCEPTED_SCHEMA_VERSION:
				setAcceptedSchemaVersion(ACCEPTED_SCHEMA_VERSION_EDEFAULT);
				return;
			case GtmPackage.DELIVERY__USAGE:
				setUsage(USAGE_EDEFAULT);
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
			case GtmPackage.DELIVERY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.DELIVERY__PREVIOUS_DELIVERY_ID:
				return PREVIOUS_DELIVERY_ID_EDEFAULT == null ? previousDeliveryId != null : !PREVIOUS_DELIVERY_ID_EDEFAULT.equals(previousDeliveryId);
			case GtmPackage.DELIVERY__REPLACED_DELIVERY_ID:
				return isSetReplacedDeliveryId();
			case GtmPackage.DELIVERY__OPTIONAL:
				return isSetOptional();
			case GtmPackage.DELIVERY__PROVIDER:
				return provider != null;
			case GtmPackage.DELIVERY__SCHEMA_VERSION:
				return schemaVersion != SCHEMA_VERSION_EDEFAULT;
			case GtmPackage.DELIVERY__ACCEPTED_SCHEMA_VERSION:
				return acceptedSchemaVersion != ACCEPTED_SCHEMA_VERSION_EDEFAULT;
			case GtmPackage.DELIVERY__USAGE:
				return usage != USAGE_EDEFAULT;
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
		result.append(", previousDeliveryId: ");
		result.append(previousDeliveryId);
		result.append(", replacedDeliveryId: ");
		if (replacedDeliveryIdESet) result.append(replacedDeliveryId); else result.append("<unset>");
		result.append(", optional: ");
		if (optionalESet) result.append(optional); else result.append("<unset>");
		result.append(", schemaVersion: ");
		result.append(schemaVersion);
		result.append(", acceptedSchemaVersion: ");
		result.append(acceptedSchemaVersion);
		result.append(", usage: ");
		result.append(usage);
		result.append(')');
		return result.toString();
	}

} //DeliveryImpl
