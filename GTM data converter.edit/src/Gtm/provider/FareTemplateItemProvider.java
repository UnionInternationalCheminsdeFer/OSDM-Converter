/**
 */
package Gtm.provider;


import Gtm.FareTemplate;
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
 * This is the item provider adapter for a {@link Gtm.FareTemplate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FareTemplateItemProvider 
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
	public FareTemplateItemProvider(AdapterFactory adapterFactory) {
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

			addPriceFactorPropertyDescriptor(object);
			addPricePropertyDescriptor(object);
			addRoundingModePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addDataDescriptionPropertyDescriptor(object);
			addTextPropertyDescriptor(object);
			addFareConstraintBundlePropertyDescriptor(object);
			addSeparateContractFareConstraintBundlePropertyDescriptor(object);
			addServiceConstraintPropertyDescriptor(object);
			addCarrierConstraintPropertyDescriptor(object);
			addServiceClassPropertyDescriptor(object);
			addServiceLevelPropertyDescriptor(object);
			addFareDetailDescriptionPropertyDescriptor(object);
			addReservationParameterPropertyDescriptor(object);
			addReductionConstraintPropertyDescriptor(object);
			addPassengerConstraintPropertyDescriptor(object);
			addLegacyConversionPropertyDescriptor(object);
			addIndividualContractsPropertyDescriptor(object);
			addRegulatoryConditionsPropertyDescriptor(object);
			addLegacyAccountingTariffIdPropertyDescriptor(object);
			addSeriesFilterPropertyDescriptor(object);
			addBasePriceClassPropertyDescriptor(object);
			addCarrierFilterPropertyDescriptor(object);
			addLuggageConstraintPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Price Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriceFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_priceFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_priceFactor_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__PRICE_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Price feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPricePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_price_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_price_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__PRICE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rounding Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoundingModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_roundingMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_roundingMode_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__ROUNDING_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_FareTemplate_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_id_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__ID,
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
				 getString("_UI_FareTemplate_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_type_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__TYPE,
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
				 getString("_UI_FareTemplate_dataDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_dataDescription_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__DATA_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_text_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_text_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__TEXT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fare Constraint Bundle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFareConstraintBundlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_fareConstraintBundle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_fareConstraintBundle_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__FARE_CONSTRAINT_BUNDLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Separate Contract Fare Constraint Bundle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeparateContractFareConstraintBundlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_separateContractFareConstraintBundle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_separateContractFareConstraintBundle_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__SEPARATE_CONTRACT_FARE_CONSTRAINT_BUNDLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_serviceConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_serviceConstraint_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__SERVICE_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_FareTemplate_carrierConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_carrierConstraint_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__CARRIER_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_serviceClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_serviceClass_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__SERVICE_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_serviceLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_serviceLevel_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__SERVICE_LEVEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fare Detail Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFareDetailDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_fareDetailDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_fareDetailDescription_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reservation Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReservationParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_reservationParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_reservationParameter_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__RESERVATION_PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reduction Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReductionConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_reductionConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_reductionConstraint_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__REDUCTION_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_passengerConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_passengerConstraint_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__PASSENGER_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Legacy Conversion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegacyConversionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_legacyConversion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_legacyConversion_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__LEGACY_CONVERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}


	/**
	 * This adds a property descriptor for the Individual Contracts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndividualContractsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_individualContracts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_individualContracts_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__INDIVIDUAL_CONTRACTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Regulatory Conditions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegulatoryConditionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_regulatoryConditions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_regulatoryConditions_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__REGULATORY_CONDITIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Legacy Accounting Tariff Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegacyAccountingTariffIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_legacyAccountingTariffId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_legacyAccountingTariffId_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__LEGACY_ACCOUNTING_TARIFF_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Series Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeriesFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_seriesFilter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_seriesFilter_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__SERIES_FILTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Price Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePriceClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_basePriceClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_basePriceClass_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__BASE_PRICE_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Carrier Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCarrierFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_carrierFilter_feature"),
				 getString("_UI_FareTemplate_carrierFilter_description"),
				 GtmPackage.Literals.FARE_TEMPLATE__CARRIER_FILTER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Luggage Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuggageConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareTemplate_luggageConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareTemplate_luggageConstraint_feature", "_UI_FareTemplate_type"),
				 GtmPackage.Literals.FARE_TEMPLATE__LUGGAGE_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(GtmPackage.Literals.FARE_TEMPLATE__AFTER_SALES_TEMPLATE);
			childrenFeatures.add(GtmPackage.Literals.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER);
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
	 * This returns FareTemplate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FareTemplate"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FareTemplate)object).getDataDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_FareTemplate_type") :
			getString("_UI_FareTemplate_type") + " " + label;
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

		switch (notification.getFeatureID(FareTemplate.class)) {
			case GtmPackage.FARE_TEMPLATE__PRICE_FACTOR:
			case GtmPackage.FARE_TEMPLATE__ROUNDING_MODE:
			case GtmPackage.FARE_TEMPLATE__ID:
			case GtmPackage.FARE_TEMPLATE__TYPE:
			case GtmPackage.FARE_TEMPLATE__DATA_DESCRIPTION:
			case GtmPackage.FARE_TEMPLATE__LEGACY_CONVERSION:
			case GtmPackage.FARE_TEMPLATE__INDIVIDUAL_CONTRACTS:
			case GtmPackage.FARE_TEMPLATE__REGULATORY_CONDITIONS:
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_TARIFF_ID:
			case GtmPackage.FARE_TEMPLATE__SERIES_FILTER:
			case GtmPackage.FARE_TEMPLATE__BASE_PRICE_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GtmPackage.FARE_TEMPLATE__AFTER_SALES_TEMPLATE:
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER:
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
				(GtmPackage.Literals.FARE_TEMPLATE__AFTER_SALES_TEMPLATE,
				 GtmFactory.eINSTANCE.createAfterSalesTemplate()));
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
