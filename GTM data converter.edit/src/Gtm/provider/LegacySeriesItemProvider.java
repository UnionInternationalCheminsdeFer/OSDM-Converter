/**
 */
package Gtm.provider;


import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.LegacySeries;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link Gtm.LegacySeries} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LegacySeriesItemProvider 
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
	public LegacySeriesItemProvider(AdapterFactory adapterFactory) {
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

			addSupplyingCarrierCodePropertyDescriptor(object);
			addNumberPropertyDescriptor(object);
			addFareTableNumberPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addFromStationPropertyDescriptor(object);
			addFromStationNamePropertyDescriptor(object);
			addToStationPropertyDescriptor(object);
			addToStationNamePropertyDescriptor(object);
			addRouteNumberPropertyDescriptor(object);
			addCarrierCodePropertyDescriptor(object);
			addRouteDescriptionPropertyDescriptor(object);
			addPricetypePropertyDescriptor(object);
			addDistance1PropertyDescriptor(object);
			addDistance2PropertyDescriptor(object);
			addValidFromPropertyDescriptor(object);
			addValidUntilPropertyDescriptor(object);
			addBusCodePropertyDescriptor(object);
			addFerryCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Supplying Carrier Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplyingCarrierCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_supplyingCarrierCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_supplyingCarrierCode_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__SUPPLYING_CARRIER_CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distance1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistance1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_distance1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_distance1_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__DISTANCE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pricetype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPricetypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_pricetype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_pricetype_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__PRICETYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_validFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_validFrom_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__VALID_FROM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid Until feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidUntilPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_validUntil_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_validUntil_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__VALID_UNTIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bus Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_busCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_busCode_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__BUS_CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ferry Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFerryCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_ferryCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_ferryCode_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__FERRY_CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_type_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_number_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_number_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fare Table Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFareTableNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_fareTableNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_fareTableNumber_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__FARE_TABLE_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Station feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromStationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_fromStation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_fromStation_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__FROM_STATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Station Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromStationNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_fromStationName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_fromStationName_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__FROM_STATION_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Station feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToStationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_toStation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_toStation_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__TO_STATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Station Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToStationNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_toStationName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_toStationName_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__TO_STATION_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Route Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRouteNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_routeNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_routeNumber_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__ROUTE_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Carrier Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCarrierCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_carrierCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_carrierCode_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__CARRIER_CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Route Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRouteDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_routeDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_routeDescription_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__ROUTE_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distance2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistance2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacySeries_distance2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacySeries_distance2_feature", "_UI_LegacySeries_type"),
				 GtmPackage.Literals.LEGACY_SERIES__DISTANCE2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GtmPackage.Literals.LEGACY_SERIES__VIASTATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns LegacySeries.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LegacySeries"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		LegacySeries legacySeries = (LegacySeries)object;
		String label = getString("_UI_LegacySeries_type") + " " + legacySeries.getNumber() + " ";
		if (legacySeries.getFromStationName() != null) {
			label = label + legacySeries.getFromStationName() + "-";
		}
		if (legacySeries.getRouteDescription() != null) {
			label = label + legacySeries.getRouteDescription();
		}
		if (legacySeries.getToStationName() != null) {
			label = label + "-" + legacySeries.getToStationName();
		}
		return label;
		
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

		switch (notification.getFeatureID(LegacySeries.class)) {
			case GtmPackage.LEGACY_SERIES__SUPPLYING_CARRIER_CODE:
			case GtmPackage.LEGACY_SERIES__NUMBER:
			case GtmPackage.LEGACY_SERIES__FARE_TABLE_NUMBER:
			case GtmPackage.LEGACY_SERIES__TYPE:
			case GtmPackage.LEGACY_SERIES__FROM_STATION:
			case GtmPackage.LEGACY_SERIES__FROM_STATION_NAME:
			case GtmPackage.LEGACY_SERIES__TO_STATION:
			case GtmPackage.LEGACY_SERIES__TO_STATION_NAME:
			case GtmPackage.LEGACY_SERIES__ROUTE_NUMBER:
			case GtmPackage.LEGACY_SERIES__CARRIER_CODE:
			case GtmPackage.LEGACY_SERIES__ROUTE_DESCRIPTION:
			case GtmPackage.LEGACY_SERIES__PRICETYPE:
			case GtmPackage.LEGACY_SERIES__DISTANCE1:
			case GtmPackage.LEGACY_SERIES__DISTANCE2:
			case GtmPackage.LEGACY_SERIES__VALID_FROM:
			case GtmPackage.LEGACY_SERIES__VALID_UNTIL:
			case GtmPackage.LEGACY_SERIES__BUS_CODE:
			case GtmPackage.LEGACY_SERIES__FERRY_CODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GtmPackage.LEGACY_SERIES__VIASTATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.LEGACY_SERIES__VIASTATIONS,
				 GtmFactory.eINSTANCE.createLegacyViastation()));
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
