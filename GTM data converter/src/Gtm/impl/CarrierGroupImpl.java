/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.CarrierGroup;
import Gtm.DataSource;
import Gtm.GtmPackage;
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
 * An implementation of the model object '<em><b>Carrier Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.CarrierGroupImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Gtm.impl.CarrierGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.CarrierGroupImpl#getCode <em>Code</em>}</li>
 *   <li>{@link Gtm.impl.CarrierGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.impl.CarrierGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Gtm.impl.CarrierGroupImpl#getLegacyCode <em>Legacy Code</em>}</li>
 *   <li>{@link Gtm.impl.CarrierGroupImpl#getCompanies <em>Companies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierGroupImpl extends MinimalEObjectImpl.Container implements CarrierGroup {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Text description;

	/**
	 * The default value of the '{@link #getLegacyCode() <em>Legacy Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyCode()
	 * @generated
	 * @ordered
	 */
	protected static final String LEGACY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLegacyCode() <em>Legacy Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyCode()
	 * @generated
	 * @ordered
	 */
	protected String legacyCode = LEGACY_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompanies() <em>Companies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanies()
	 * @generated
	 * @ordered
	 */
	protected EList<Carrier> companies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.CARRIER_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CARRIER_GROUP__DATA_SOURCE, oldDataSource, dataSource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CARRIER_GROUP__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CARRIER_GROUP__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CARRIER_GROUP__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.CARRIER_GROUP__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CARRIER_GROUP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLegacyCode() {
		return legacyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyCode(String newLegacyCode) {
		String oldLegacyCode = legacyCode;
		legacyCode = newLegacyCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CARRIER_GROUP__LEGACY_CODE, oldLegacyCode, legacyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Carrier> getCompanies() {
		if (companies == null) {
			companies = new EObjectResolvingEList<Carrier>(Carrier.class, this, GtmPackage.CARRIER_GROUP__COMPANIES);
		}
		return companies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.CARRIER_GROUP__DATA_SOURCE:
				return getDataSource();
			case GtmPackage.CARRIER_GROUP__ID:
				return getId();
			case GtmPackage.CARRIER_GROUP__CODE:
				return getCode();
			case GtmPackage.CARRIER_GROUP__NAME:
				return getName();
			case GtmPackage.CARRIER_GROUP__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case GtmPackage.CARRIER_GROUP__LEGACY_CODE:
				return getLegacyCode();
			case GtmPackage.CARRIER_GROUP__COMPANIES:
				return getCompanies();
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
			case GtmPackage.CARRIER_GROUP__DATA_SOURCE:
				setDataSource((DataSource)newValue);
				return;
			case GtmPackage.CARRIER_GROUP__ID:
				setId((String)newValue);
				return;
			case GtmPackage.CARRIER_GROUP__CODE:
				setCode((String)newValue);
				return;
			case GtmPackage.CARRIER_GROUP__NAME:
				setName((String)newValue);
				return;
			case GtmPackage.CARRIER_GROUP__DESCRIPTION:
				setDescription((Text)newValue);
				return;
			case GtmPackage.CARRIER_GROUP__LEGACY_CODE:
				setLegacyCode((String)newValue);
				return;
			case GtmPackage.CARRIER_GROUP__COMPANIES:
				getCompanies().clear();
				getCompanies().addAll((Collection<? extends Carrier>)newValue);
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
			case GtmPackage.CARRIER_GROUP__DATA_SOURCE:
				setDataSource(DATA_SOURCE_EDEFAULT);
				return;
			case GtmPackage.CARRIER_GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.CARRIER_GROUP__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case GtmPackage.CARRIER_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GtmPackage.CARRIER_GROUP__DESCRIPTION:
				setDescription((Text)null);
				return;
			case GtmPackage.CARRIER_GROUP__LEGACY_CODE:
				setLegacyCode(LEGACY_CODE_EDEFAULT);
				return;
			case GtmPackage.CARRIER_GROUP__COMPANIES:
				getCompanies().clear();
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
			case GtmPackage.CARRIER_GROUP__DATA_SOURCE:
				return dataSource != DATA_SOURCE_EDEFAULT;
			case GtmPackage.CARRIER_GROUP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.CARRIER_GROUP__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case GtmPackage.CARRIER_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GtmPackage.CARRIER_GROUP__DESCRIPTION:
				return description != null;
			case GtmPackage.CARRIER_GROUP__LEGACY_CODE:
				return LEGACY_CODE_EDEFAULT == null ? legacyCode != null : !LEGACY_CODE_EDEFAULT.equals(legacyCode);
			case GtmPackage.CARRIER_GROUP__COMPANIES:
				return companies != null && !companies.isEmpty();
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
		result.append(" (dataSource: ");
		result.append(dataSource);
		result.append(", id: ");
		result.append(id);
		result.append(", code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", legacyCode: ");
		result.append(legacyCode);
		result.append(')');
		return result.toString();
	}

} //CarrierGroupImpl
