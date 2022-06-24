/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LuggageConstraint;
import Gtm.LuggageItemsRestriction;
import Gtm.LuggageRule;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Luggage Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LuggageConstraintImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.LuggageConstraintImpl#getMaxHandLuggage <em>Max Hand Luggage</em>}</li>
 *   <li>{@link Gtm.impl.LuggageConstraintImpl#getMaxLargeLuggage <em>Max Large Luggage</em>}</li>
 *   <li>{@link Gtm.impl.LuggageConstraintImpl#getRestrictedItems <em>Restricted Items</em>}</li>
 *   <li>{@link Gtm.impl.LuggageConstraintImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link Gtm.impl.LuggageConstraintImpl#getDataDescription <em>Data Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LuggageConstraintImpl extends MinimalEObjectImpl.Container implements LuggageConstraint {
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
	 * The default value of the '{@link #getMaxHandLuggage() <em>Max Hand Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHandLuggage()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_HAND_LUGGAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxHandLuggage() <em>Max Hand Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHandLuggage()
	 * @generated
	 * @ordered
	 */
	protected int maxHandLuggage = MAX_HAND_LUGGAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLargeLuggage() <em>Max Large Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLargeLuggage()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LARGE_LUGGAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxLargeLuggage() <em>Max Large Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLargeLuggage()
	 * @generated
	 * @ordered
	 */
	protected int maxLargeLuggage = MAX_LARGE_LUGGAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRestrictedItems() <em>Restricted Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<LuggageItemsRestriction> restrictedItems;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<LuggageRule> rules;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LuggageConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LUGGAGE_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LUGGAGE_CONSTRAINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxHandLuggage() {
		return maxHandLuggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxHandLuggage(int newMaxHandLuggage) {
		int oldMaxHandLuggage = maxHandLuggage;
		maxHandLuggage = newMaxHandLuggage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LUGGAGE_CONSTRAINT__MAX_HAND_LUGGAGE, oldMaxHandLuggage, maxHandLuggage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLargeLuggage() {
		return maxLargeLuggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLargeLuggage(int newMaxLargeLuggage) {
		int oldMaxLargeLuggage = maxLargeLuggage;
		maxLargeLuggage = newMaxLargeLuggage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LUGGAGE_CONSTRAINT__MAX_LARGE_LUGGAGE, oldMaxLargeLuggage, maxLargeLuggage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LuggageItemsRestriction> getRestrictedItems() {
		if (restrictedItems == null) {
			restrictedItems = new EObjectContainmentEList<LuggageItemsRestriction>(LuggageItemsRestriction.class, this, GtmPackage.LUGGAGE_CONSTRAINT__RESTRICTED_ITEMS);
		}
		return restrictedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LuggageRule> getRules() {
		if (rules == null) {
			rules = new EDataTypeUniqueEList<LuggageRule>(LuggageRule.class, this, GtmPackage.LUGGAGE_CONSTRAINT__RULES);
		}
		return rules;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LUGGAGE_CONSTRAINT__DATA_DESCRIPTION, oldDataDescription, dataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LUGGAGE_CONSTRAINT__RESTRICTED_ITEMS:
				return ((InternalEList<?>)getRestrictedItems()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LUGGAGE_CONSTRAINT__ID:
				return getId();
			case GtmPackage.LUGGAGE_CONSTRAINT__MAX_HAND_LUGGAGE:
				return getMaxHandLuggage();
			case GtmPackage.LUGGAGE_CONSTRAINT__MAX_LARGE_LUGGAGE:
				return getMaxLargeLuggage();
			case GtmPackage.LUGGAGE_CONSTRAINT__RESTRICTED_ITEMS:
				return getRestrictedItems();
			case GtmPackage.LUGGAGE_CONSTRAINT__RULES:
				return getRules();
			case GtmPackage.LUGGAGE_CONSTRAINT__DATA_DESCRIPTION:
				return getDataDescription();
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
			case GtmPackage.LUGGAGE_CONSTRAINT__ID:
				setId((String)newValue);
				return;
			case GtmPackage.LUGGAGE_CONSTRAINT__MAX_HAND_LUGGAGE:
				setMaxHandLuggage((Integer)newValue);
				return;
			case GtmPackage.LUGGAGE_CONSTRAINT__MAX_LARGE_LUGGAGE:
				setMaxLargeLuggage((Integer)newValue);
				return;
			case GtmPackage.LUGGAGE_CONSTRAINT__RESTRICTED_ITEMS:
				getRestrictedItems().clear();
				getRestrictedItems().addAll((Collection<? extends LuggageItemsRestriction>)newValue);
				return;
			case GtmPackage.LUGGAGE_CONSTRAINT__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends LuggageRule>)newValue);
				return;
			case GtmPackage.LUGGAGE_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription((String)newValue);
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
			case GtmPackage.LUGGAGE_CONSTRAINT__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.LUGGAGE_CONSTRAINT__MAX_HAND_LUGGAGE:
				setMaxHandLuggage(MAX_HAND_LUGGAGE_EDEFAULT);
				return;
			case GtmPackage.LUGGAGE_CONSTRAINT__MAX_LARGE_LUGGAGE:
				setMaxLargeLuggage(MAX_LARGE_LUGGAGE_EDEFAULT);
				return;
			case GtmPackage.LUGGAGE_CONSTRAINT__RESTRICTED_ITEMS:
				getRestrictedItems().clear();
				return;
			case GtmPackage.LUGGAGE_CONSTRAINT__RULES:
				getRules().clear();
				return;
			case GtmPackage.LUGGAGE_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription(DATA_DESCRIPTION_EDEFAULT);
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
			case GtmPackage.LUGGAGE_CONSTRAINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.LUGGAGE_CONSTRAINT__MAX_HAND_LUGGAGE:
				return maxHandLuggage != MAX_HAND_LUGGAGE_EDEFAULT;
			case GtmPackage.LUGGAGE_CONSTRAINT__MAX_LARGE_LUGGAGE:
				return maxLargeLuggage != MAX_LARGE_LUGGAGE_EDEFAULT;
			case GtmPackage.LUGGAGE_CONSTRAINT__RESTRICTED_ITEMS:
				return restrictedItems != null && !restrictedItems.isEmpty();
			case GtmPackage.LUGGAGE_CONSTRAINT__RULES:
				return rules != null && !rules.isEmpty();
			case GtmPackage.LUGGAGE_CONSTRAINT__DATA_DESCRIPTION:
				return DATA_DESCRIPTION_EDEFAULT == null ? dataDescription != null : !DATA_DESCRIPTION_EDEFAULT.equals(dataDescription);
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
		result.append(", maxHandLuggage: ");
		result.append(maxHandLuggage);
		result.append(", maxLargeLuggage: ");
		result.append(maxLargeLuggage);
		result.append(", rules: ");
		result.append(rules);
		result.append(", dataDescription: ");
		result.append(dataDescription);
		result.append(')');
		return result.toString();
	}

} //LuggageConstraintImpl
