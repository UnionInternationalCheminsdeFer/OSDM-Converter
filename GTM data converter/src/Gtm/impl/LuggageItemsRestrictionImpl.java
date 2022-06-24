/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LuggageDimension;
import Gtm.LuggageItemsRestriction;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Luggage Items Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LuggageItemsRestrictionImpl#getNumberOfItems <em>Number Of Items</em>}</li>
 *   <li>{@link Gtm.impl.LuggageItemsRestrictionImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LuggageItemsRestrictionImpl extends MinimalEObjectImpl.Container implements LuggageItemsRestriction {
	/**
	 * The default value of the '{@link #getNumberOfItems() <em>Number Of Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfItems()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ITEMS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNumberOfItems() <em>Number Of Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfItems()
	 * @generated
	 * @ordered
	 */
	protected int numberOfItems = NUMBER_OF_ITEMS_EDEFAULT;
	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected EList<LuggageDimension> dimension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LuggageItemsRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LUGGAGE_ITEMS_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfItems() {
		return numberOfItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfItems(int newNumberOfItems) {
		int oldNumberOfItems = numberOfItems;
		numberOfItems = newNumberOfItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LUGGAGE_ITEMS_RESTRICTION__NUMBER_OF_ITEMS, oldNumberOfItems, numberOfItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LuggageDimension> getDimension() {
		if (dimension == null) {
			dimension = new EObjectContainmentEList<LuggageDimension>(LuggageDimension.class, this, GtmPackage.LUGGAGE_ITEMS_RESTRICTION__DIMENSION);
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LUGGAGE_ITEMS_RESTRICTION__DIMENSION:
				return ((InternalEList<?>)getDimension()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LUGGAGE_ITEMS_RESTRICTION__NUMBER_OF_ITEMS:
				return getNumberOfItems();
			case GtmPackage.LUGGAGE_ITEMS_RESTRICTION__DIMENSION:
				return getDimension();
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
			case GtmPackage.LUGGAGE_ITEMS_RESTRICTION__NUMBER_OF_ITEMS:
				setNumberOfItems((Integer)newValue);
				return;
			case GtmPackage.LUGGAGE_ITEMS_RESTRICTION__DIMENSION:
				getDimension().clear();
				getDimension().addAll((Collection<? extends LuggageDimension>)newValue);
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
			case GtmPackage.LUGGAGE_ITEMS_RESTRICTION__NUMBER_OF_ITEMS:
				setNumberOfItems(NUMBER_OF_ITEMS_EDEFAULT);
				return;
			case GtmPackage.LUGGAGE_ITEMS_RESTRICTION__DIMENSION:
				getDimension().clear();
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
			case GtmPackage.LUGGAGE_ITEMS_RESTRICTION__NUMBER_OF_ITEMS:
				return numberOfItems != NUMBER_OF_ITEMS_EDEFAULT;
			case GtmPackage.LUGGAGE_ITEMS_RESTRICTION__DIMENSION:
				return dimension != null && !dimension.isEmpty();
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
		result.append(" (numberOfItems: ");
		result.append(numberOfItems);
		result.append(')');
		return result.toString();
	}

} //LuggageItemsRestrictionImpl
