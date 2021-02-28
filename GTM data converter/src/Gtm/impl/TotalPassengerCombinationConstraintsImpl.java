/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.TotalPassengerCombinationConstraint;
import Gtm.TotalPassengerCombinationConstraints;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Total Passenger Combination Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.TotalPassengerCombinationConstraintsImpl#getTotalPassengerCombinationConstraint <em>Total Passenger Combination Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TotalPassengerCombinationConstraintsImpl extends MinimalEObjectImpl.Container implements TotalPassengerCombinationConstraints {
	/**
	 * The cached value of the '{@link #getTotalPassengerCombinationConstraint() <em>Total Passenger Combination Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPassengerCombinationConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<TotalPassengerCombinationConstraint> totalPassengerCombinationConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TotalPassengerCombinationConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.TOTAL_PASSENGER_COMBINATION_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TotalPassengerCombinationConstraint> getTotalPassengerCombinationConstraint() {
		if (totalPassengerCombinationConstraint == null) {
			totalPassengerCombinationConstraint = new EObjectContainmentEList<TotalPassengerCombinationConstraint>(TotalPassengerCombinationConstraint.class, this, GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINTS__TOTAL_PASSENGER_COMBINATION_CONSTRAINT);
		}
		return totalPassengerCombinationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINTS__TOTAL_PASSENGER_COMBINATION_CONSTRAINT:
				return ((InternalEList<?>)getTotalPassengerCombinationConstraint()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINTS__TOTAL_PASSENGER_COMBINATION_CONSTRAINT:
				return getTotalPassengerCombinationConstraint();
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
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINTS__TOTAL_PASSENGER_COMBINATION_CONSTRAINT:
				getTotalPassengerCombinationConstraint().clear();
				getTotalPassengerCombinationConstraint().addAll((Collection<? extends TotalPassengerCombinationConstraint>)newValue);
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
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINTS__TOTAL_PASSENGER_COMBINATION_CONSTRAINT:
				getTotalPassengerCombinationConstraint().clear();
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
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINTS__TOTAL_PASSENGER_COMBINATION_CONSTRAINT:
				return totalPassengerCombinationConstraint != null && !totalPassengerCombinationConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TotalPassengerCombinationConstraintsImpl
