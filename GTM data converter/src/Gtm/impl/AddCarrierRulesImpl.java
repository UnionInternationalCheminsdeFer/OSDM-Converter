/**
 */
package Gtm.impl;

import Gtm.AddCarrierRule;
import Gtm.AddCarrierRules;
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
 * An implementation of the model object '<em><b>Add Carrier Rules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.AddCarrierRulesImpl#getAddCarrierRule <em>Add Carrier Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddCarrierRulesImpl extends MinimalEObjectImpl.Container implements AddCarrierRules {
	/**
	 * The cached value of the '{@link #getAddCarrierRule() <em>Add Carrier Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddCarrierRule()
	 * @generated
	 * @ordered
	 */
	protected EList<AddCarrierRule> addCarrierRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddCarrierRulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.ADD_CARRIER_RULES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddCarrierRule> getAddCarrierRule() {
		if (addCarrierRule == null) {
			addCarrierRule = new EObjectContainmentEList<AddCarrierRule>(AddCarrierRule.class, this, GtmPackage.ADD_CARRIER_RULES__ADD_CARRIER_RULE);
		}
		return addCarrierRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.ADD_CARRIER_RULES__ADD_CARRIER_RULE:
				return ((InternalEList<?>)getAddCarrierRule()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.ADD_CARRIER_RULES__ADD_CARRIER_RULE:
				return getAddCarrierRule();
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
			case GtmPackage.ADD_CARRIER_RULES__ADD_CARRIER_RULE:
				getAddCarrierRule().clear();
				getAddCarrierRule().addAll((Collection<? extends AddCarrierRule>)newValue);
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
			case GtmPackage.ADD_CARRIER_RULES__ADD_CARRIER_RULE:
				getAddCarrierRule().clear();
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
			case GtmPackage.ADD_CARRIER_RULES__ADD_CARRIER_RULE:
				return addCarrierRule != null && !addCarrierRule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AddCarrierRulesImpl
