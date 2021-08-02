/**
 */
package Gtm.provider;


import Gtm.ConversionParams;
import Gtm.GtmFactory;
import Gtm.GtmPackage;

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
 * This is the item provider adapter for a {@link Gtm.ConversionParams} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConversionParamsItemProvider 
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
	public ConversionParamsItemProvider(AdapterFactory adapterFactory) {
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

			addCountryPropertyDescriptor(object);
			addStationImportFilterPropertyDescriptor(object);
			addConvertFareDescriptionsPropertyDescriptor(object);
			addConvertServiceConstraintsPropertyDescriptor(object);
			addLegacyBorderIndicationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Country feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConversionParams_country_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConversionParams_country_feature", "_UI_ConversionParams_type"),
				 GtmPackage.Literals.CONVERSION_PARAMS__COUNTRY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Station Import Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStationImportFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConversionParams_stationImportFilter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConversionParams_stationImportFilter_feature", "_UI_ConversionParams_type"),
				 GtmPackage.Literals.CONVERSION_PARAMS__STATION_IMPORT_FILTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Convert Fare Descriptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConvertFareDescriptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConversionParams_convertFareDescriptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConversionParams_convertFareDescriptions_feature", "_UI_ConversionParams_type"),
				 GtmPackage.Literals.CONVERSION_PARAMS__CONVERT_FARE_DESCRIPTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Convert Service Constraints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConvertServiceConstraintsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConversionParams_convertServiceConstraints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConversionParams_convertServiceConstraints_feature", "_UI_ConversionParams_type"),
				 GtmPackage.Literals.CONVERSION_PARAMS__CONVERT_SERVICE_CONSTRAINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Legacy Border Indication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegacyBorderIndicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConversionParams_legacyBorderIndication_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConversionParams_legacyBorderIndication_feature", "_UI_ConversionParams_type"),
				 GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_BORDER_INDICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS);
			childrenFeatures.add(GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES);
			childrenFeatures.add(GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS);
			childrenFeatures.add(GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS);
			childrenFeatures.add(GtmPackage.Literals.CONVERSION_PARAMS__VAT_TEMPLATES);
			childrenFeatures.add(GtmPackage.Literals.CONVERSION_PARAMS__BUS_FERRY_MAPPING);
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
	 * This returns ConversionParams.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConversionParams"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ConversionParams_type");
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

		switch (notification.getFeatureID(ConversionParams.class)) {
			case GtmPackage.CONVERSION_PARAMS__TAX_ID:
			case GtmPackage.CONVERSION_PARAMS__VA_TPERCENTAGE:
			case GtmPackage.CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS:
			case GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS:
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
			case GtmPackage.CONVERSION_PARAMS__STATION_IMPORT_FILTER:
			case GtmPackage.CONVERSION_PARAMS__CONVERT_FARE_DESCRIPTIONS:
			case GtmPackage.CONVERSION_PARAMS__CONVERT_SERVICE_CONSTRAINTS:
			case GtmPackage.CONVERSION_PARAMS__LEGACY_BORDER_INDICATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS:
			case GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES:
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS:
			case GtmPackage.CONVERSION_PARAMS__VAT_TEMPLATES:
			case GtmPackage.CONVERSION_PARAMS__BUS_FERRY_MAPPING:
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
				(GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS,
				 GtmFactory.eINSTANCE.createLegacyStationMappings()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES,
				 GtmFactory.eINSTANCE.createLegacyFareTemplates()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS,
				 GtmFactory.eINSTANCE.createLegacyStationToServiceConstraintMappings()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS,
				 GtmFactory.eINSTANCE.createLegacyFareDetailMaps()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.CONVERSION_PARAMS__VAT_TEMPLATES,
				 GtmFactory.eINSTANCE.createVatTemplates()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.CONVERSION_PARAMS__BUS_FERRY_MAPPING,
				 GtmFactory.eINSTANCE.createLegacyBusFerryMapping()));
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
