/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.TripInterruptionConstraint;
import Gtm.TripInterruptionProcess;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trip Interruption Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.TripInterruptionConstraintImpl#getMaxInterruptions <em>Max Interruptions</em>}</li>
 *   <li>{@link Gtm.impl.TripInterruptionConstraintImpl#getMaxDuration <em>Max Duration</em>}</li>
 *   <li>{@link Gtm.impl.TripInterruptionConstraintImpl#getTotalMaxDuration <em>Total Max Duration</em>}</li>
 *   <li>{@link Gtm.impl.TripInterruptionConstraintImpl#getRequiredProcesses <em>Required Processes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripInterruptionConstraintImpl extends MinimalEObjectImpl.Container implements TripInterruptionConstraint {
	/**
	 * The default value of the '{@link #getMaxInterruptions() <em>Max Interruptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterruptions()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_INTERRUPTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxInterruptions() <em>Max Interruptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterruptions()
	 * @generated
	 * @ordered
	 */
	protected int maxInterruptions = MAX_INTERRUPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDuration() <em>Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxDuration() <em>Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDuration()
	 * @generated
	 * @ordered
	 */
	protected String maxDuration = MAX_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalMaxDuration() <em>Total Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMaxDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_MAX_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalMaxDuration() <em>Total Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMaxDuration()
	 * @generated
	 * @ordered
	 */
	protected String totalMaxDuration = TOTAL_MAX_DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredProcesses() <em>Required Processes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<TripInterruptionProcess> requiredProcesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripInterruptionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.TRIP_INTERRUPTION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxInterruptions() {
		return maxInterruptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInterruptions(int newMaxInterruptions) {
		int oldMaxInterruptions = maxInterruptions;
		maxInterruptions = newMaxInterruptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__MAX_INTERRUPTIONS, oldMaxInterruptions, maxInterruptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxDuration() {
		return maxDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDuration(String newMaxDuration) {
		String oldMaxDuration = maxDuration;
		maxDuration = newMaxDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__MAX_DURATION, oldMaxDuration, maxDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotalMaxDuration() {
		return totalMaxDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalMaxDuration(String newTotalMaxDuration) {
		String oldTotalMaxDuration = totalMaxDuration;
		totalMaxDuration = newTotalMaxDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__TOTAL_MAX_DURATION, oldTotalMaxDuration, totalMaxDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TripInterruptionProcess> getRequiredProcesses() {
		if (requiredProcesses == null) {
			requiredProcesses = new EDataTypeUniqueEList<TripInterruptionProcess>(TripInterruptionProcess.class, this, GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__REQUIRED_PROCESSES);
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
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__MAX_INTERRUPTIONS:
				return getMaxInterruptions();
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__MAX_DURATION:
				return getMaxDuration();
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__TOTAL_MAX_DURATION:
				return getTotalMaxDuration();
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__REQUIRED_PROCESSES:
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
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__MAX_INTERRUPTIONS:
				setMaxInterruptions((Integer)newValue);
				return;
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__MAX_DURATION:
				setMaxDuration((String)newValue);
				return;
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__TOTAL_MAX_DURATION:
				setTotalMaxDuration((String)newValue);
				return;
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__REQUIRED_PROCESSES:
				getRequiredProcesses().clear();
				getRequiredProcesses().addAll((Collection<? extends TripInterruptionProcess>)newValue);
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
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__MAX_INTERRUPTIONS:
				setMaxInterruptions(MAX_INTERRUPTIONS_EDEFAULT);
				return;
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__MAX_DURATION:
				setMaxDuration(MAX_DURATION_EDEFAULT);
				return;
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__TOTAL_MAX_DURATION:
				setTotalMaxDuration(TOTAL_MAX_DURATION_EDEFAULT);
				return;
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__REQUIRED_PROCESSES:
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
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__MAX_INTERRUPTIONS:
				return maxInterruptions != MAX_INTERRUPTIONS_EDEFAULT;
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__MAX_DURATION:
				return MAX_DURATION_EDEFAULT == null ? maxDuration != null : !MAX_DURATION_EDEFAULT.equals(maxDuration);
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__TOTAL_MAX_DURATION:
				return TOTAL_MAX_DURATION_EDEFAULT == null ? totalMaxDuration != null : !TOTAL_MAX_DURATION_EDEFAULT.equals(totalMaxDuration);
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT__REQUIRED_PROCESSES:
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
		result.append(" (maxInterruptions: ");
		result.append(maxInterruptions);
		result.append(", maxDuration: ");
		result.append(maxDuration);
		result.append(", totalMaxDuration: ");
		result.append(totalMaxDuration);
		result.append(", requiredProcesses: ");
		result.append(requiredProcesses);
		result.append(')');
		return result.toString();
	}

} //TripInterruptionConstraintImpl
