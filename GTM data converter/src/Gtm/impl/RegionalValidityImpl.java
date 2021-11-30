/**
 */
package Gtm.impl;

import Gtm.CarrierConstraint;
import Gtm.GtmPackage;
import Gtm.Line;
import Gtm.Polygone;
import Gtm.RegionalValidity;
import Gtm.ServiceConstraint;
import Gtm.ViaStation;
import Gtm.Zone;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regional Validity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.RegionalValidityImpl#getSeqNb <em>Seq Nb</em>}</li>
 *   <li>{@link Gtm.impl.RegionalValidityImpl#getViaStation <em>Via Station</em>}</li>
 *   <li>{@link Gtm.impl.RegionalValidityImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link Gtm.impl.RegionalValidityImpl#getLine <em>Line</em>}</li>
 *   <li>{@link Gtm.impl.RegionalValidityImpl#getPolygone <em>Polygone</em>}</li>
 *   <li>{@link Gtm.impl.RegionalValidityImpl#getCarierConstraint <em>Carier Constraint</em>}</li>
 *   <li>{@link Gtm.impl.RegionalValidityImpl#getServiceConstraint <em>Service Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionalValidityImpl extends MinimalEObjectImpl.Container implements RegionalValidity {
	/**
	 * The default value of the '{@link #getSeqNb() <em>Seq Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqNb()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQ_NB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeqNb() <em>Seq Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqNb()
	 * @generated
	 * @ordered
	 */
	protected int seqNb = SEQ_NB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViaStation() <em>Via Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViaStation()
	 * @generated
	 * @ordered
	 */
	protected ViaStation viaStation;

	/**
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected Zone zone;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected Line line;

	/**
	 * The cached value of the '{@link #getPolygone() <em>Polygone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygone()
	 * @generated
	 * @ordered
	 */
	protected Polygone polygone;

	/**
	 * The cached value of the '{@link #getCarierConstraint() <em>Carier Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarierConstraint()
	 * @generated
	 * @ordered
	 */
	protected CarrierConstraint carierConstraint;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionalValidityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.REGIONAL_VALIDITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeqNb() {
		return seqNb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqNb(int newSeqNb) {
		int oldSeqNb = seqNb;
		seqNb = newSeqNb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_VALIDITY__SEQ_NB, oldSeqNb, seqNb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViaStation getViaStation() {
		return viaStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViaStation(ViaStation newViaStation, NotificationChain msgs) {
		ViaStation oldViaStation = viaStation;
		viaStation = newViaStation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_VALIDITY__VIA_STATION, oldViaStation, newViaStation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViaStation(ViaStation newViaStation) {
		if (newViaStation != viaStation) {
			NotificationChain msgs = null;
			if (viaStation != null)
				msgs = ((InternalEObject)viaStation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.REGIONAL_VALIDITY__VIA_STATION, null, msgs);
			if (newViaStation != null)
				msgs = ((InternalEObject)newViaStation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.REGIONAL_VALIDITY__VIA_STATION, null, msgs);
			msgs = basicSetViaStation(newViaStation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_VALIDITY__VIA_STATION, newViaStation, newViaStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone getZone() {
		if (zone != null && zone.eIsProxy()) {
			InternalEObject oldZone = (InternalEObject)zone;
			zone = (Zone)eResolveProxy(oldZone);
			if (zone != oldZone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.REGIONAL_VALIDITY__ZONE, oldZone, zone));
			}
		}
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone basicGetZone() {
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(Zone newZone) {
		Zone oldZone = zone;
		zone = newZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_VALIDITY__ZONE, oldZone, zone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine(Line newLine, NotificationChain msgs) {
		Line oldLine = line;
		line = newLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_VALIDITY__LINE, oldLine, newLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(Line newLine) {
		if (newLine != line) {
			NotificationChain msgs = null;
			if (line != null)
				msgs = ((InternalEObject)line).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.REGIONAL_VALIDITY__LINE, null, msgs);
			if (newLine != null)
				msgs = ((InternalEObject)newLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.REGIONAL_VALIDITY__LINE, null, msgs);
			msgs = basicSetLine(newLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_VALIDITY__LINE, newLine, newLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygone getPolygone() {
		return polygone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygone(Polygone newPolygone, NotificationChain msgs) {
		Polygone oldPolygone = polygone;
		polygone = newPolygone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_VALIDITY__POLYGONE, oldPolygone, newPolygone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygone(Polygone newPolygone) {
		if (newPolygone != polygone) {
			NotificationChain msgs = null;
			if (polygone != null)
				msgs = ((InternalEObject)polygone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.REGIONAL_VALIDITY__POLYGONE, null, msgs);
			if (newPolygone != null)
				msgs = ((InternalEObject)newPolygone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.REGIONAL_VALIDITY__POLYGONE, null, msgs);
			msgs = basicSetPolygone(newPolygone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_VALIDITY__POLYGONE, newPolygone, newPolygone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierConstraint getCarierConstraint() {
		if (carierConstraint != null && carierConstraint.eIsProxy()) {
			InternalEObject oldCarierConstraint = (InternalEObject)carierConstraint;
			carierConstraint = (CarrierConstraint)eResolveProxy(oldCarierConstraint);
			if (carierConstraint != oldCarierConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.REGIONAL_VALIDITY__CARIER_CONSTRAINT, oldCarierConstraint, carierConstraint));
			}
		}
		return carierConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierConstraint basicGetCarierConstraint() {
		return carierConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarierConstraint(CarrierConstraint newCarierConstraint) {
		CarrierConstraint oldCarierConstraint = carierConstraint;
		carierConstraint = newCarierConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_VALIDITY__CARIER_CONSTRAINT, oldCarierConstraint, carierConstraint));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.REGIONAL_VALIDITY__SERVICE_CONSTRAINT, oldServiceConstraint, serviceConstraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_VALIDITY__SERVICE_CONSTRAINT, oldServiceConstraint, serviceConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.REGIONAL_VALIDITY__VIA_STATION:
				return basicSetViaStation(null, msgs);
			case GtmPackage.REGIONAL_VALIDITY__LINE:
				return basicSetLine(null, msgs);
			case GtmPackage.REGIONAL_VALIDITY__POLYGONE:
				return basicSetPolygone(null, msgs);
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
			case GtmPackage.REGIONAL_VALIDITY__SEQ_NB:
				return getSeqNb();
			case GtmPackage.REGIONAL_VALIDITY__VIA_STATION:
				return getViaStation();
			case GtmPackage.REGIONAL_VALIDITY__ZONE:
				if (resolve) return getZone();
				return basicGetZone();
			case GtmPackage.REGIONAL_VALIDITY__LINE:
				return getLine();
			case GtmPackage.REGIONAL_VALIDITY__POLYGONE:
				return getPolygone();
			case GtmPackage.REGIONAL_VALIDITY__CARIER_CONSTRAINT:
				if (resolve) return getCarierConstraint();
				return basicGetCarierConstraint();
			case GtmPackage.REGIONAL_VALIDITY__SERVICE_CONSTRAINT:
				if (resolve) return getServiceConstraint();
				return basicGetServiceConstraint();
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
			case GtmPackage.REGIONAL_VALIDITY__SEQ_NB:
				setSeqNb((Integer)newValue);
				return;
			case GtmPackage.REGIONAL_VALIDITY__VIA_STATION:
				setViaStation((ViaStation)newValue);
				return;
			case GtmPackage.REGIONAL_VALIDITY__ZONE:
				setZone((Zone)newValue);
				return;
			case GtmPackage.REGIONAL_VALIDITY__LINE:
				setLine((Line)newValue);
				return;
			case GtmPackage.REGIONAL_VALIDITY__POLYGONE:
				setPolygone((Polygone)newValue);
				return;
			case GtmPackage.REGIONAL_VALIDITY__CARIER_CONSTRAINT:
				setCarierConstraint((CarrierConstraint)newValue);
				return;
			case GtmPackage.REGIONAL_VALIDITY__SERVICE_CONSTRAINT:
				setServiceConstraint((ServiceConstraint)newValue);
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
			case GtmPackage.REGIONAL_VALIDITY__SEQ_NB:
				setSeqNb(SEQ_NB_EDEFAULT);
				return;
			case GtmPackage.REGIONAL_VALIDITY__VIA_STATION:
				setViaStation((ViaStation)null);
				return;
			case GtmPackage.REGIONAL_VALIDITY__ZONE:
				setZone((Zone)null);
				return;
			case GtmPackage.REGIONAL_VALIDITY__LINE:
				setLine((Line)null);
				return;
			case GtmPackage.REGIONAL_VALIDITY__POLYGONE:
				setPolygone((Polygone)null);
				return;
			case GtmPackage.REGIONAL_VALIDITY__CARIER_CONSTRAINT:
				setCarierConstraint((CarrierConstraint)null);
				return;
			case GtmPackage.REGIONAL_VALIDITY__SERVICE_CONSTRAINT:
				setServiceConstraint((ServiceConstraint)null);
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
			case GtmPackage.REGIONAL_VALIDITY__SEQ_NB:
				return seqNb != SEQ_NB_EDEFAULT;
			case GtmPackage.REGIONAL_VALIDITY__VIA_STATION:
				return viaStation != null;
			case GtmPackage.REGIONAL_VALIDITY__ZONE:
				return zone != null;
			case GtmPackage.REGIONAL_VALIDITY__LINE:
				return line != null;
			case GtmPackage.REGIONAL_VALIDITY__POLYGONE:
				return polygone != null;
			case GtmPackage.REGIONAL_VALIDITY__CARIER_CONSTRAINT:
				return carierConstraint != null;
			case GtmPackage.REGIONAL_VALIDITY__SERVICE_CONSTRAINT:
				return serviceConstraint != null;
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
		result.append(" (seqNb: ");
		result.append(seqNb);
		result.append(')');
		return result.toString();
	}

} //RegionalValidityImpl
