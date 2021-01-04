/**
 */
package Gtm.impl;

import Gtm.ConnectionPoint;
import Gtm.DataSource;
import Gtm.FareElement;
import Gtm.GtmPackage;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regional Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.RegionalConstraintImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.RegionalConstraintImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link Gtm.impl.RegionalConstraintImpl#getEntryConnectionPoint <em>Entry Connection Point</em>}</li>
 *   <li>{@link Gtm.impl.RegionalConstraintImpl#getExitConnectionPoint <em>Exit Connection Point</em>}</li>
 *   <li>{@link Gtm.impl.RegionalConstraintImpl#getRegionalValidity <em>Regional Validity</em>}</li>
 *   <li>{@link Gtm.impl.RegionalConstraintImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Gtm.impl.RegionalConstraintImpl#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.impl.RegionalConstraintImpl#getLinkedFares <em>Linked Fares</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionalConstraintImpl extends MinimalEObjectImpl.Container implements RegionalConstraint {
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
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected float distance = DISTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntryConnectionPoint() <em>Entry Connection Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryConnectionPoint()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPoint entryConnectionPoint;

	/**
	 * The cached value of the '{@link #getExitConnectionPoint() <em>Exit Connection Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitConnectionPoint()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPoint exitConnectionPoint;

	/**
	 * The cached value of the '{@link #getRegionalValidity() <em>Regional Validity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionalValidity()
	 * @generated
	 * @ordered
	 */
	protected EList<RegionalValidity> regionalValidity;

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
	 * The cached value of the '{@link #getLinkedFares() <em>Linked Fares</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedFares()
	 * @generated
	 * @ordered
	 */
	protected EList<FareElement> linkedFares;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionalConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.REGIONAL_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_CONSTRAINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(float newDistance) {
		float oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_CONSTRAINT__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint getEntryConnectionPoint() {
		if (entryConnectionPoint != null && entryConnectionPoint.eIsProxy()) {
			InternalEObject oldEntryConnectionPoint = (InternalEObject)entryConnectionPoint;
			entryConnectionPoint = (ConnectionPoint)eResolveProxy(oldEntryConnectionPoint);
			if (entryConnectionPoint != oldEntryConnectionPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT, oldEntryConnectionPoint, entryConnectionPoint));
			}
		}
		return entryConnectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint basicGetEntryConnectionPoint() {
		return entryConnectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryConnectionPoint(ConnectionPoint newEntryConnectionPoint) {
		ConnectionPoint oldEntryConnectionPoint = entryConnectionPoint;
		entryConnectionPoint = newEntryConnectionPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT, oldEntryConnectionPoint, entryConnectionPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint getExitConnectionPoint() {
		if (exitConnectionPoint != null && exitConnectionPoint.eIsProxy()) {
			InternalEObject oldExitConnectionPoint = (InternalEObject)exitConnectionPoint;
			exitConnectionPoint = (ConnectionPoint)eResolveProxy(oldExitConnectionPoint);
			if (exitConnectionPoint != oldExitConnectionPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT, oldExitConnectionPoint, exitConnectionPoint));
			}
		}
		return exitConnectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint basicGetExitConnectionPoint() {
		return exitConnectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitConnectionPoint(ConnectionPoint newExitConnectionPoint) {
		ConnectionPoint oldExitConnectionPoint = exitConnectionPoint;
		exitConnectionPoint = newExitConnectionPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT, oldExitConnectionPoint, exitConnectionPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegionalValidity> getRegionalValidity() {
		if (regionalValidity == null) {
			regionalValidity = new EObjectContainmentEList<RegionalValidity>(RegionalValidity.class, this, GtmPackage.REGIONAL_CONSTRAINT__REGIONAL_VALIDITY);
		}
		return regionalValidity;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_CONSTRAINT__DATA_SOURCE, oldDataSource, dataSource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_CONSTRAINT__DATA_DESCRIPTION, oldDataDescription, dataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FareElement> getLinkedFares() {
		if (linkedFares == null) {
			linkedFares = new EObjectResolvingEList<FareElement>(FareElement.class, this, GtmPackage.REGIONAL_CONSTRAINT__LINKED_FARES);
		}
		return linkedFares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.REGIONAL_CONSTRAINT__REGIONAL_VALIDITY:
				return ((InternalEList<?>)getRegionalValidity()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.REGIONAL_CONSTRAINT__ID:
				return getId();
			case GtmPackage.REGIONAL_CONSTRAINT__DISTANCE:
				return getDistance();
			case GtmPackage.REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT:
				if (resolve) return getEntryConnectionPoint();
				return basicGetEntryConnectionPoint();
			case GtmPackage.REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT:
				if (resolve) return getExitConnectionPoint();
				return basicGetExitConnectionPoint();
			case GtmPackage.REGIONAL_CONSTRAINT__REGIONAL_VALIDITY:
				return getRegionalValidity();
			case GtmPackage.REGIONAL_CONSTRAINT__DATA_SOURCE:
				return getDataSource();
			case GtmPackage.REGIONAL_CONSTRAINT__DATA_DESCRIPTION:
				return getDataDescription();
			case GtmPackage.REGIONAL_CONSTRAINT__LINKED_FARES:
				return getLinkedFares();
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
			case GtmPackage.REGIONAL_CONSTRAINT__ID:
				setId((String)newValue);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__DISTANCE:
				setDistance((Float)newValue);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT:
				setEntryConnectionPoint((ConnectionPoint)newValue);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT:
				setExitConnectionPoint((ConnectionPoint)newValue);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__REGIONAL_VALIDITY:
				getRegionalValidity().clear();
				getRegionalValidity().addAll((Collection<? extends RegionalValidity>)newValue);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__DATA_SOURCE:
				setDataSource((DataSource)newValue);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription((String)newValue);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__LINKED_FARES:
				getLinkedFares().clear();
				getLinkedFares().addAll((Collection<? extends FareElement>)newValue);
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
			case GtmPackage.REGIONAL_CONSTRAINT__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT:
				setEntryConnectionPoint((ConnectionPoint)null);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT:
				setExitConnectionPoint((ConnectionPoint)null);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__REGIONAL_VALIDITY:
				getRegionalValidity().clear();
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__DATA_SOURCE:
				setDataSource(DATA_SOURCE_EDEFAULT);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription(DATA_DESCRIPTION_EDEFAULT);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__LINKED_FARES:
				getLinkedFares().clear();
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
			case GtmPackage.REGIONAL_CONSTRAINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.REGIONAL_CONSTRAINT__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case GtmPackage.REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT:
				return entryConnectionPoint != null;
			case GtmPackage.REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT:
				return exitConnectionPoint != null;
			case GtmPackage.REGIONAL_CONSTRAINT__REGIONAL_VALIDITY:
				return regionalValidity != null && !regionalValidity.isEmpty();
			case GtmPackage.REGIONAL_CONSTRAINT__DATA_SOURCE:
				return dataSource != DATA_SOURCE_EDEFAULT;
			case GtmPackage.REGIONAL_CONSTRAINT__DATA_DESCRIPTION:
				return DATA_DESCRIPTION_EDEFAULT == null ? dataDescription != null : !DATA_DESCRIPTION_EDEFAULT.equals(dataDescription);
			case GtmPackage.REGIONAL_CONSTRAINT__LINKED_FARES:
				return linkedFares != null && !linkedFares.isEmpty();
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
		result.append(", distance: ");
		result.append(distance);
		result.append(", dataSource: ");
		result.append(dataSource);
		result.append(", dataDescription: ");
		result.append(dataDescription);
		result.append(')');
		return result.toString();
	}

} //RegionalConstraintImpl
