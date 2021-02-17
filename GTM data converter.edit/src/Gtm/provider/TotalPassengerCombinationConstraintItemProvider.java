/**
 */
package Gtm.provider;


import Gtm.GtmPackage;
import Gtm.TotalPassengerCombinationConstraint;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Gtm.TotalPassengerCombinationConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TotalPassengerCombinationConstraintItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalPassengerCombinationConstraintItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addDataDescriptionPropertyDescriptor(object);
			addMaxTotalPassengerWeightPropertyDescriptor(object);
			addMinTotalPassengerWeightPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalPassengerCombinationConstraint_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalPassengerCombinationConstraint_id_feature", "_UI_TotalPassengerCombinationConstraint_type"),
				 GtmPackage.Literals.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalPassengerCombinationConstraint_dataDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalPassengerCombinationConstraint_dataDescription_feature", "_UI_TotalPassengerCombinationConstraint_type"),
				 GtmPackage.Literals.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__DATA_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Total Passenger Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxTotalPassengerWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalPassengerCombinationConstraint_maxTotalPassengerWeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalPassengerCombinationConstraint_maxTotalPassengerWeight_feature", "_UI_TotalPassengerCombinationConstraint_type"),
				 GtmPackage.Literals.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Total Passenger Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinTotalPassengerWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalPassengerCombinationConstraint_minTotalPassengerWeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalPassengerCombinationConstraint_minTotalPassengerWeight_feature", "_UI_TotalPassengerCombinationConstraint_type"),
				 GtmPackage.Literals.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TotalPassengerCombinationConstraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TotalPassengerCombinationConstraint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		StringBuilder sb = new StringBuilder();
		if (((TotalPassengerCombinationConstraint)object).getDataDescription() != null) {
			sb.append(((TotalPassengerCombinationConstraint)object).getDataDescription());
		} else {
			sb.append(((TotalPassengerCombinationConstraint)object).getMinTotalPassengerWeight()).append("/").append(((TotalPassengerCombinationConstraint)object).getMaxTotalPassengerWeight());
		}
		String label = sb.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_TotalPassengerCombinationConstraint_type") :
			getString("_UI_TotalPassengerCombinationConstraint_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TotalPassengerCombinationConstraint.class)) {
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__ID:
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__DATA_DESCRIPTION:
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT:
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
