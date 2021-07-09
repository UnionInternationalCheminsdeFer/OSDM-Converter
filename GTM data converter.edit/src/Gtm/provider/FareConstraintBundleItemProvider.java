/**
 */
package Gtm.provider;


import Gtm.FareConstraintBundle;
import Gtm.GtmPackage;

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
 * This is the item provider adapter for a {@link Gtm.FareConstraintBundle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FareConstraintBundleItemProvider 
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
	public FareConstraintBundleItemProvider(AdapterFactory adapterFactory) {
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
			addDefaultFareTypePropertyDescriptor(object);
			addDataDescriptionPropertyDescriptor(object);
			addCarrierConstraintPropertyDescriptor(object);
			addSalesAvailabilityPropertyDescriptor(object);
			addTravelValidityPropertyDescriptor(object);
			addCombinationConstraintPropertyDescriptor(object);
			addPersonalDataConstraintPropertyDescriptor(object);
			addFulfillmentConstraintPropertyDescriptor(object);
			addTotalPassengerConstraintPropertyDescriptor(object);
			addDefaultRegulatoryConditionsPropertyDescriptor(object);
			addDataSourcePropertyDescriptor(object);
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
				 getString("_UI_FareConstraintBundle_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_id_feature", "_UI_FareConstraintBundle_type"),
				 GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Fare Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultFareTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_defaultFareType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_defaultFareType_feature", "_UI_FareConstraintBundle_type"),
				 GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__DEFAULT_FARE_TYPE,
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
				 getString("_UI_FareConstraintBundle_dataDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_dataDescription_feature", "_UI_FareConstraintBundle_type"),
				 GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__DATA_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Carrier Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCarrierConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_carrierConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_carrierConstraint_feature", "_UI_FareConstraintBundle_type"),
				 GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__CARRIER_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sales Availability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSalesAvailabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_salesAvailability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_salesAvailability_feature", "_UI_FareConstraintBundle_type"),
				 GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__SALES_AVAILABILITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Travel Validity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTravelValidityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_travelValidity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_travelValidity_feature", "_UI_FareConstraintBundle_type"),
				 GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__TRAVEL_VALIDITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Combination Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCombinationConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_combinationConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_combinationConstraint_feature", "_UI_FareConstraintBundle_type"),
				 GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__COMBINATION_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Personal Data Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersonalDataConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_personalDataConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_personalDataConstraint_feature", "_UI_FareConstraintBundle_type"),
				 GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__PERSONAL_DATA_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fulfillment Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFulfillmentConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_fulfillmentConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_fulfillmentConstraint_feature", "_UI_FareConstraintBundle_type"),
				 GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__FULFILLMENT_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Passenger Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalPassengerConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_totalPassengerConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_totalPassengerConstraint_feature", "_UI_FareConstraintBundle_type"),
				 GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__TOTAL_PASSENGER_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Regulatory Conditions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultRegulatoryConditionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_defaultRegulatoryConditions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_defaultRegulatoryConditions_feature", "_UI_FareConstraintBundle_type"),
				 GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__DEFAULT_REGULATORY_CONDITIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_dataSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_dataSource_feature", "_UI_FareConstraintBundle_type"),
				 GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__DATA_SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns FareConstraintBundle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FareConstraintBundle"));
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
		FareConstraintBundle bundle = (FareConstraintBundle)object;
		
		if (bundle.getDataDescription() != null) {

			sb.append(getString("_UI_FareConstraintBundle_type"));
			sb.append(" ").append(bundle.getDataDescription());
			if (bundle.getSalesAvailability() != null) {
				if (sb.length() > 0 && !(sb.lastIndexOf(" - ") == (sb.length() - 1))) sb.append("-");
				SalesAvailabilityConstraintItemProvider labelProvider = (SalesAvailabilityConstraintItemProvider) adapterFactory.adapt(bundle.getSalesAvailability(), SalesAvailabilityConstraintItemProvider.class);
				sb.append(labelProvider.getText(bundle.getSalesAvailability()));				
			}						
			return sb.toString();
		} else {
			
			if (bundle.getCombinationConstraint() != null) {
				CombinationConstraintItemProvider labelProvider = (CombinationConstraintItemProvider) adapterFactory.adapt(bundle.getCombinationConstraint(), CombinationConstraintItemProvider.class);
				sb.append(labelProvider.getText(bundle.getCombinationConstraint()));
			}
			if (bundle.getFulfillmentConstraint() != null) {
				if (sb.length() > 0 && !(sb.lastIndexOf(" - ") == (sb.length() - 1))) sb.append("-");
				FulfillmentConstraintItemProvider labelProvider = (FulfillmentConstraintItemProvider) adapterFactory.adapt(bundle.getFulfillmentConstraint(), FulfillmentConstraintItemProvider.class);
				sb.append(labelProvider.getText(bundle.getFulfillmentConstraint()));				
			}
			if (bundle.getSalesAvailability() != null) {
				if (sb.length() > 0 && !(sb.lastIndexOf(" - ") == (sb.length() - 1))) sb.append("-");
				SalesAvailabilityConstraintItemProvider labelProvider = (SalesAvailabilityConstraintItemProvider) adapterFactory.adapt(bundle.getSalesAvailability(), SalesAvailabilityConstraintItemProvider.class);
				sb.append(labelProvider.getText(bundle.getSalesAvailability()));				
			}			
			if (bundle.getTravelValidity() != null) {
				if (sb.length() > 0 && !(sb.lastIndexOf(" - ") == (sb.length() - 1))) sb.append("-");
				TravelValidityConstraintItemProvider labelProvider = (TravelValidityConstraintItemProvider) adapterFactory.adapt(bundle.getTravelValidity(), TravelValidityConstraintItemProvider.class);
				sb.append(labelProvider.getText(bundle.getTravelValidity()));				
			}				
			if (bundle.getTotalPassengerConstraint() != null) {
				if (sb.length() > 0 && !(sb.lastIndexOf(" - ") == (sb.length() - 1))) sb.append("-");
				TotalPassengerCombinationConstraintItemProvider labelProvider = (TotalPassengerCombinationConstraintItemProvider) adapterFactory.adapt(bundle.getTotalPassengerConstraint(), TotalPassengerCombinationConstraintItemProvider.class);
				sb.append(labelProvider.getText(bundle.getTotalPassengerConstraint()));				
			}				
			
			String label = sb.toString();
			return label == null || label.length() == 0 ?
					getString("_UI_FareConstraintBundle_type") :
					getString("_UI_FareConstraintBundle_type") + " " + label;
		}
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

		switch (notification.getFeatureID(FareConstraintBundle.class)) {
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__ID:
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DEFAULT_FARE_TYPE:
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DATA_DESCRIPTION:
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DEFAULT_REGULATORY_CONDITIONS:
			case GtmPackage.FARE_CONSTRAINT_BUNDLE__DATA_SOURCE:
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
