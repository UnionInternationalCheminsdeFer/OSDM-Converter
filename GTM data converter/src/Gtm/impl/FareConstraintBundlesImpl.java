/**
 */
package Gtm.impl;

import Gtm.FareConstraintBundle;
import Gtm.FareConstraintBundles;
import Gtm.GtmPackage;

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
 * An implementation of the model object '<em><b>Fare Constraint Bundles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.FareConstraintBundlesImpl#getFareConstraintBundles <em>Fare Constraint Bundles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FareConstraintBundlesImpl extends MinimalEObjectImpl.Container implements FareConstraintBundles {
	/**
	 * The cached value of the '{@link #getFareConstraintBundles() <em>Fare Constraint Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareConstraintBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<FareConstraintBundle> fareConstraintBundles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FareConstraintBundlesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.FARE_CONSTRAINT_BUNDLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FareConstraintBundle> getFareConstraintBundles() {
		if (fareConstraintBundles == null) {
			fareConstraintBundles = new EObjectContainmentEList<FareConstraintBundle>(FareConstraintBundle.class, this, GtmPackage.FARE_CONSTRAINT_BUNDLES__FARE_CONSTRAINT_BUNDLES);
		}
		return fareConstraintBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.FARE_CONSTRAINT_BUNDLES__FARE_CONSTRAINT_BUNDLES:
				return ((InternalEList<?>)getFareConstraintBundles()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.FARE_CONSTRAINT_BUNDLES__FARE_CONSTRAINT_BUNDLES:
				return getFareConstraintBundles();
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
			case GtmPackage.FARE_CONSTRAINT_BUNDLES__FARE_CONSTRAINT_BUNDLES:
				getFareConstraintBundles().clear();
				getFareConstraintBundles().addAll((Collection<? extends FareConstraintBundle>)newValue);
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
			case GtmPackage.FARE_CONSTRAINT_BUNDLES__FARE_CONSTRAINT_BUNDLES:
				getFareConstraintBundles().clear();
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
			case GtmPackage.FARE_CONSTRAINT_BUNDLES__FARE_CONSTRAINT_BUNDLES:
				return fareConstraintBundles != null && !fareConstraintBundles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FareConstraintBundlesImpl
