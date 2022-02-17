/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.TripAllocationConstraint;
import Gtm.TripAllocationProcess;
import Gtm.TripAllocationUnit;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trip Allocation Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.TripAllocationConstraintImpl#getAllocationUnit <em>Allocation Unit</em>}</li>
 *   <li>{@link Gtm.impl.TripAllocationConstraintImpl#getMaxUnits <em>Max Units</em>}</li>
 *   <li>{@link Gtm.impl.TripAllocationConstraintImpl#getDurationUnit <em>Duration Unit</em>}</li>
 *   <li>{@link Gtm.impl.TripAllocationConstraintImpl#getRequiredProcesses <em>Required Processes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripAllocationConstraintImpl extends MinimalEObjectImpl.Container implements TripAllocationConstraint {
	/**
	 * The default value of the '{@link #getAllocationUnit() <em>Allocation Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TripAllocationUnit ALLOCATION_UNIT_EDEFAULT = TripAllocationUnit.NONE;

	/**
	 * The cached value of the '{@link #getAllocationUnit() <em>Allocation Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationUnit()
	 * @generated
	 * @ordered
	 */
	protected TripAllocationUnit allocationUnit = ALLOCATION_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxUnits() <em>Max Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnits()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_UNITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxUnits() <em>Max Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnits()
	 * @generated
	 * @ordered
	 */
	protected int maxUnits = MAX_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationUnit() <em>Duration Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDurationUnit() <em>Duration Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationUnit()
	 * @generated
	 * @ordered
	 */
	protected String durationUnit = DURATION_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredProcesses() <em>Required Processes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<TripAllocationProcess> requiredProcesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripAllocationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.TRIP_ALLOCATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripAllocationUnit getAllocationUnit() {
		return allocationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationUnit(TripAllocationUnit newAllocationUnit) {
		TripAllocationUnit oldAllocationUnit = allocationUnit;
		allocationUnit = newAllocationUnit == null ? ALLOCATION_UNIT_EDEFAULT : newAllocationUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRIP_ALLOCATION_CONSTRAINT__ALLOCATION_UNIT, oldAllocationUnit, allocationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxUnits() {
		return maxUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxUnits(int newMaxUnits) {
		int oldMaxUnits = maxUnits;
		maxUnits = newMaxUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRIP_ALLOCATION_CONSTRAINT__MAX_UNITS, oldMaxUnits, maxUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDurationUnit() {
		return durationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationUnit(String newDurationUnit) {
		String oldDurationUnit = durationUnit;
		durationUnit = newDurationUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRIP_ALLOCATION_CONSTRAINT__DURATION_UNIT, oldDurationUnit, durationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TripAllocationProcess> getRequiredProcesses() {
		if (requiredProcesses == null) {
			requiredProcesses = new EDataTypeUniqueEList<TripAllocationProcess>(TripAllocationProcess.class, this, GtmPackage.TRIP_ALLOCATION_CONSTRAINT__REQUIRED_PROCESSES);
		}
		return requiredProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__ALLOCATION_UNIT:
				return getAllocationUnit();
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__MAX_UNITS:
				return getMaxUnits();
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__DURATION_UNIT:
				return getDurationUnit();
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__REQUIRED_PROCESSES:
				return getRequiredProcesses();
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
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__ALLOCATION_UNIT:
				setAllocationUnit((TripAllocationUnit)newValue);
				return;
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__MAX_UNITS:
				setMaxUnits((Integer)newValue);
				return;
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__DURATION_UNIT:
				setDurationUnit((String)newValue);
				return;
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__REQUIRED_PROCESSES:
				getRequiredProcesses().clear();
				getRequiredProcesses().addAll((Collection<? extends TripAllocationProcess>)newValue);
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
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__ALLOCATION_UNIT:
				setAllocationUnit(ALLOCATION_UNIT_EDEFAULT);
				return;
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__MAX_UNITS:
				setMaxUnits(MAX_UNITS_EDEFAULT);
				return;
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__DURATION_UNIT:
				setDurationUnit(DURATION_UNIT_EDEFAULT);
				return;
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__REQUIRED_PROCESSES:
				getRequiredProcesses().clear();
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
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__ALLOCATION_UNIT:
				return allocationUnit != ALLOCATION_UNIT_EDEFAULT;
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__MAX_UNITS:
				return maxUnits != MAX_UNITS_EDEFAULT;
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__DURATION_UNIT:
				return DURATION_UNIT_EDEFAULT == null ? durationUnit != null : !DURATION_UNIT_EDEFAULT.equals(durationUnit);
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT__REQUIRED_PROCESSES:
				return requiredProcesses != null && !requiredProcesses.isEmpty();
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
		result.append(" (allocationUnit: ");
		result.append(allocationUnit);
		result.append(", maxUnits: ");
		result.append(maxUnits);
		result.append(", durationUnit: ");
		result.append(durationUnit);
		result.append(", requiredProcesses: ");
		result.append(requiredProcesses);
		result.append(')');
		return result.toString();
	}

} //TripAllocationConstraintImpl
