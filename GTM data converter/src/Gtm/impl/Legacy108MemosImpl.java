/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.Legacy108Memo;
import Gtm.Legacy108Memos;

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
 * An implementation of the model object '<em><b>Legacy108 Memos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.Legacy108MemosImpl#getLegacyMemos <em>Legacy Memos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Legacy108MemosImpl extends MinimalEObjectImpl.Container implements Legacy108Memos {
	/**
	 * The cached value of the '{@link #getLegacyMemos() <em>Legacy Memos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyMemos()
	 * @generated
	 * @ordered
	 */
	protected EList<Legacy108Memo> legacyMemos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Legacy108MemosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY108_MEMOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Legacy108Memo> getLegacyMemos() {
		if (legacyMemos == null) {
			legacyMemos = new EObjectContainmentEList<Legacy108Memo>(Legacy108Memo.class, this, GtmPackage.LEGACY108_MEMOS__LEGACY_MEMOS);
		}
		return legacyMemos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY108_MEMOS__LEGACY_MEMOS:
				return ((InternalEList<?>)getLegacyMemos()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY108_MEMOS__LEGACY_MEMOS:
				return getLegacyMemos();
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
			case GtmPackage.LEGACY108_MEMOS__LEGACY_MEMOS:
				getLegacyMemos().clear();
				getLegacyMemos().addAll((Collection<? extends Legacy108Memo>)newValue);
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
			case GtmPackage.LEGACY108_MEMOS__LEGACY_MEMOS:
				getLegacyMemos().clear();
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
			case GtmPackage.LEGACY108_MEMOS__LEGACY_MEMOS:
				return legacyMemos != null && !legacyMemos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Legacy108MemosImpl
