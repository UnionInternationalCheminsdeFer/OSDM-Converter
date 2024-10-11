/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.NamedCarrierList;
import Gtm.NamedCarrierLists;

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
 * An implementation of the model object '<em><b>Named Carrier Lists</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.NamedCarrierListsImpl#getNamedCarrierList <em>Named Carrier List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedCarrierListsImpl extends MinimalEObjectImpl.Container implements NamedCarrierLists {
	/**
	 * The cached value of the '{@link #getNamedCarrierList() <em>Named Carrier List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedCarrierList()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedCarrierList> namedCarrierList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedCarrierListsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.NAMED_CARRIER_LISTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedCarrierList> getNamedCarrierList() {
		if (namedCarrierList == null) {
			namedCarrierList = new EObjectContainmentEList<NamedCarrierList>(NamedCarrierList.class, this, GtmPackage.NAMED_CARRIER_LISTS__NAMED_CARRIER_LIST);
		}
		return namedCarrierList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.NAMED_CARRIER_LISTS__NAMED_CARRIER_LIST:
				return ((InternalEList<?>)getNamedCarrierList()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.NAMED_CARRIER_LISTS__NAMED_CARRIER_LIST:
				return getNamedCarrierList();
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
			case GtmPackage.NAMED_CARRIER_LISTS__NAMED_CARRIER_LIST:
				getNamedCarrierList().clear();
				getNamedCarrierList().addAll((Collection<? extends NamedCarrierList>)newValue);
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
			case GtmPackage.NAMED_CARRIER_LISTS__NAMED_CARRIER_LIST:
				getNamedCarrierList().clear();
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
			case GtmPackage.NAMED_CARRIER_LISTS__NAMED_CARRIER_LIST:
				return namedCarrierList != null && !namedCarrierList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NamedCarrierListsImpl
