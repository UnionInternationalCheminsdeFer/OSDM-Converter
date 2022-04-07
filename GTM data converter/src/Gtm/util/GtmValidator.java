/**
 */
package Gtm.util;

import Gtm.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import Gtm.nls.NationalLanguageSupport;


/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage
 * @generated
 */
public class GtmValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GtmValidator INSTANCE = new GtmValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Gtm"; //$NON-NLS-1$

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtmValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GtmPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GtmPackage.GTM_TOOL:
				return validateGTMTool((GTMTool)value, diagnostics, context);
			case GtmPackage.CODE_LISTS:
				return validateCodeLists((CodeLists)value, diagnostics, context);
			case GtmPackage.WORKFLOW_HISTORY:
				return validateWorkflowHistory((WorkflowHistory)value, diagnostics, context);
			case GtmPackage.WORKFLOW_STEP:
				return validateWorkflowStep((WorkflowStep)value, diagnostics, context);
			case GtmPackage.NUTS_CODES:
				return validateNUTSCodes((NUTSCodes)value, diagnostics, context);
			case GtmPackage.NUTS_CODE:
				return validateNutsCode((NutsCode)value, diagnostics, context);
			case GtmPackage.SERVICE_BRANDS:
				return validateServiceBrands((ServiceBrands)value, diagnostics, context);
			case GtmPackage.SERVICE_BRAND:
				return validateServiceBrand((ServiceBrand)value, diagnostics, context);
			case GtmPackage.COUNTRIES:
				return validateCountries((Countries)value, diagnostics, context);
			case GtmPackage.COUNTRY:
				return validateCountry((Country)value, diagnostics, context);
			case GtmPackage.LANGUAGES:
				return validateLanguages((Languages)value, diagnostics, context);
			case GtmPackage.LANGUAGE:
				return validateLanguage((Language)value, diagnostics, context);
			case GtmPackage.CURRENCIES:
				return validateCurrencies((Currencies)value, diagnostics, context);
			case GtmPackage.CURRENCY:
				return validateCurrency((Currency)value, diagnostics, context);
			case GtmPackage.STATIONS:
				return validateStations((Stations)value, diagnostics, context);
			case GtmPackage.STATION:
				return validateStation((Station)value, diagnostics, context);
			case GtmPackage.STATION_RELATION:
				return validateStationRelation((StationRelation)value, diagnostics, context);
			case GtmPackage.CARRIER:
				return validateCarrier((Carrier)value, diagnostics, context);
			case GtmPackage.CARRIERS:
				return validateCarriers((Carriers)value, diagnostics, context);
			case GtmPackage.STATION_SET:
				return validateStationSet((StationSet)value, diagnostics, context);
			case GtmPackage.GENERAL_TARIFF_MODEL:
				return validateGeneralTariffModel((GeneralTariffModel)value, diagnostics, context);
			case GtmPackage.DELIVERY:
				return validateDelivery((Delivery)value, diagnostics, context);
			case GtmPackage.AFTER_SALES_RULES:
				return validateAfterSalesRules((AfterSalesRules)value, diagnostics, context);
			case GtmPackage.AFTER_SALES_RULE:
				return validateAfterSalesRule((AfterSalesRule)value, diagnostics, context);
			case GtmPackage.AFTER_SALES_CONDITION:
				return validateAfterSalesCondition((AfterSalesCondition)value, diagnostics, context);
			case GtmPackage.APPLICATION_TIME:
				return validateApplicationTime((ApplicationTime)value, diagnostics, context);
			case GtmPackage.FARE_STRUCTURE:
				return validateFareStructure((FareStructure)value, diagnostics, context);
			case GtmPackage.CONNECTION_POINTS:
				return validateConnectionPoints((ConnectionPoints)value, diagnostics, context);
			case GtmPackage.CONNECTION_POINT:
				return validateConnectionPoint((ConnectionPoint)value, diagnostics, context);
			case GtmPackage.FARE_RESOURCE_LOCATIONS:
				return validateFareResourceLocations((FareResourceLocations)value, diagnostics, context);
			case GtmPackage.TRAIN_RESOURCE_LOCATIONS:
				return validateTrainResourceLocations((TrainResourceLocations)value, diagnostics, context);
			case GtmPackage.STATION_RESOURCE_LOCATIONS:
				return validateStationResourceLocations((StationResourceLocations)value, diagnostics, context);
			case GtmPackage.CARRIER_RESOURCE_LOCATIONS:
				return validateCarrierResourceLocations((CarrierResourceLocations)value, diagnostics, context);
			case GtmPackage.TRAIN_RESOURCE_LOCATION:
				return validateTrainResourceLocation((TrainResourceLocation)value, diagnostics, context);
			case GtmPackage.STATION_RESOURCE_LOCATION:
				return validateStationResourceLocation((StationResourceLocation)value, diagnostics, context);
			case GtmPackage.CARRIER_RESOURCE_LOCATION:
				return validateCarrierResourceLocation((CarrierResourceLocation)value, diagnostics, context);
			case GtmPackage.ONLINE_RESOURCE:
				return validateOnlineResource((OnlineResource)value, diagnostics, context);
			case GtmPackage.FULFILLMENT_CONSTRAINTS:
				return validateFulfillmentConstraints((FulfillmentConstraints)value, diagnostics, context);
			case GtmPackage.FULFILLMENT_CONSTRAINT:
				return validateFulfillmentConstraint((FulfillmentConstraint)value, diagnostics, context);
			case GtmPackage.REQUIRED_BARCODES:
				return validateRequiredBarcodes((RequiredBarcodes)value, diagnostics, context);
			case GtmPackage.ACCEPTED_BARCODES:
				return validateAcceptedBarcodes((AcceptedBarcodes)value, diagnostics, context);
			case GtmPackage.SUPPORTED_ONLINE_SERVICES:
				return validateSupportedOnlineServices((SupportedOnlineServices)value, diagnostics, context);
			case GtmPackage.STATION_NAMES:
				return validateStationNames((StationNames)value, diagnostics, context);
			case GtmPackage.FARE_ELEMENTS:
				return validateFareElements((FareElements)value, diagnostics, context);
			case GtmPackage.FARE_ELEMENT:
				return validateFareElement((FareElement)value, diagnostics, context);
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINTS:
				return validateTotalPassengerCombinationConstraints((TotalPassengerCombinationConstraints)value, diagnostics, context);
			case GtmPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT:
				return validateTotalPassengerCombinationConstraint((TotalPassengerCombinationConstraint)value, diagnostics, context);
			case GtmPackage.FARE_CONSTRAINT_BUNDLES:
				return validateFareConstraintBundles((FareConstraintBundles)value, diagnostics, context);
			case GtmPackage.FARE_CONSTRAINT_BUNDLE:
				return validateFareConstraintBundle((FareConstraintBundle)value, diagnostics, context);
			case GtmPackage.FARE_STATION_SET_DEFINITIONS:
				return validateFareStationSetDefinitions((FareStationSetDefinitions)value, diagnostics, context);
			case GtmPackage.FARE_STATION_SET_DEFINITION:
				return validateFareStationSetDefinition((FareStationSetDefinition)value, diagnostics, context);
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER:
				return validateLegacyAccountingIdentifier((LegacyAccountingIdentifier)value, diagnostics, context);
			case GtmPackage.PERSONAL_DATA_CONSTRAINTS:
				return validatePersonalDataConstraints((PersonalDataConstraints)value, diagnostics, context);
			case GtmPackage.PERSONAL_DATA_CONSTRAINT:
				return validatePersonalDataConstraint((PersonalDataConstraint)value, diagnostics, context);
			case GtmPackage.REQUIRED_PERSONAL_DATA:
				return validateRequiredPersonalData((RequiredPersonalData)value, diagnostics, context);
			case GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES:
				return validateAllowedPersonalDataChanges((AllowedPersonalDataChanges)value, diagnostics, context);
			case GtmPackage.PASSENGER_CONSTRAINTS:
				return validatePassengerConstraints((PassengerConstraints)value, diagnostics, context);
			case GtmPackage.PASSENGER_CONSTRAINT:
				return validatePassengerConstraint((PassengerConstraint)value, diagnostics, context);
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT:
				return validatePassengerCombinationConstraint((PassengerCombinationConstraint)value, diagnostics, context);
			case GtmPackage.INCLUDED_FREE_PASSENGER_LIMIT:
				return validateIncludedFreePassengerLimit((IncludedFreePassengerLimit)value, diagnostics, context);
			case GtmPackage.COMBINATION_CONSTRAINTS:
				return validateCombinationConstraints((CombinationConstraints)value, diagnostics, context);
			case GtmPackage.COMBINATION_CONSTRAINT:
				return validateCombinationConstraint((CombinationConstraint)value, diagnostics, context);
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINTS:
				return validateTravelValidityConstraints((TravelValidityConstraints)value, diagnostics, context);
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT:
				return validateTravelValidityConstraint((TravelValidityConstraint)value, diagnostics, context);
			case GtmPackage.TRAIN_VALIDITY:
				return validateTrainValidity((TrainValidity)value, diagnostics, context);
			case GtmPackage.SALES_AVAILABILITY_CONSTRAINTS:
				return validateSalesAvailabilityConstraints((SalesAvailabilityConstraints)value, diagnostics, context);
			case GtmPackage.SALES_AVAILABILITY_CONSTRAINT:
				return validateSalesAvailabilityConstraint((SalesAvailabilityConstraint)value, diagnostics, context);
			case GtmPackage.SALES_RESTRICTION:
				return validateSalesRestriction((SalesRestriction)value, diagnostics, context);
			case GtmPackage.END_OF_SALE:
				return validateEndOfSale((EndOfSale)value, diagnostics, context);
			case GtmPackage.START_OF_SALE:
				return validateStartOfSale((StartOfSale)value, diagnostics, context);
			case GtmPackage.CARRIER_CONSTRAINTS:
				return validateCarrierConstraints((CarrierConstraints)value, diagnostics, context);
			case GtmPackage.CARRIER_CONSTRAINT:
				return validateCarrierConstraint((CarrierConstraint)value, diagnostics, context);
			case GtmPackage.SERVICE_CONSTRAINTS:
				return validateServiceConstraints((ServiceConstraints)value, diagnostics, context);
			case GtmPackage.SERVICE_CONSTRAINT:
				return validateServiceConstraint((ServiceConstraint)value, diagnostics, context);
			case GtmPackage.REGIONAL_CONSTRAINTS:
				return validateRegionalConstraints((RegionalConstraints)value, diagnostics, context);
			case GtmPackage.REGIONAL_CONSTRAINT:
				return validateRegionalConstraint((RegionalConstraint)value, diagnostics, context);
			case GtmPackage.REGIONAL_VALIDITY:
				return validateRegionalValidity((RegionalValidity)value, diagnostics, context);
			case GtmPackage.SERVICE_LEVEL_DEFINITIONS:
				return validateServiceLevelDefinitions((ServiceLevelDefinitions)value, diagnostics, context);
			case GtmPackage.TEXTS:
				return validateTexts((Texts)value, diagnostics, context);
			case GtmPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case GtmPackage.TRANSLATION:
				return validateTranslation((Translation)value, diagnostics, context);
			case GtmPackage.PRICES:
				return validatePrices((Prices)value, diagnostics, context);
			case GtmPackage.PRICE:
				return validatePrice((Price)value, diagnostics, context);
			case GtmPackage.VAT_DETAIL:
				return validateVATDetail((VATDetail)value, diagnostics, context);
			case GtmPackage.CURRENCY_PRICE:
				return validateCurrencyPrice((CurrencyPrice)value, diagnostics, context);
			case GtmPackage.SERVICE_CLASS_DEFINITIONS:
				return validateServiceClassDefinitions((ServiceClassDefinitions)value, diagnostics, context);
			case GtmPackage.CALENDARS:
				return validateCalendars((Calendars)value, diagnostics, context);
			case GtmPackage.CALENDAR:
				return validateCalendar((Calendar)value, diagnostics, context);
			case GtmPackage.RESERVATION_PARAMETERS:
				return validateReservationParameters((ReservationParameters)value, diagnostics, context);
			case GtmPackage.RESERVATION_PARAMETER:
				return validateReservationParameter((ReservationParameter)value, diagnostics, context);
			case GtmPackage.RESERVATION_PARAMS9181:
				return validateReservationParams9181((ReservationParams9181)value, diagnostics, context);
			case GtmPackage.RESERVATION_OPTIONS:
				return validateReservationOptions((ReservationOptions)value, diagnostics, context);
			case GtmPackage.RESERVATION_PREFERENCE_GROUP:
				return validateReservationPreferenceGroup((ReservationPreferenceGroup)value, diagnostics, context);
			case GtmPackage.SERVICE_CLASS:
				return validateServiceClass((ServiceClass)value, diagnostics, context);
			case GtmPackage.SERVICE_LEVEL:
				return validateServiceLevel((ServiceLevel)value, diagnostics, context);
			case GtmPackage.TIME_RANGE:
				return validateTimeRange((TimeRange)value, diagnostics, context);
			case GtmPackage.EXCLUDED_TIME_RANGE:
				return validateExcludedTimeRange((ExcludedTimeRange)value, diagnostics, context);
			case GtmPackage.VALIDITY_RANGE:
				return validateValidityRange((ValidityRange)value, diagnostics, context);
			case GtmPackage.RELATIVE_TIME:
				return validateRelativeTime((RelativeTime)value, diagnostics, context);
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT:
				return validateReturnValidityConstraint((ReturnValidityConstraint)value, diagnostics, context);
			case GtmPackage.TRIP_ALLOCATION_CONSTRAINT:
				return validateTripAllocationConstraint((TripAllocationConstraint)value, diagnostics, context);
			case GtmPackage.TRIP_INTERRUPTION_CONSTRAINT:
				return validateTripInterruptionConstraint((TripInterruptionConstraint)value, diagnostics, context);
			case GtmPackage.VIA_STATION:
				return validateViaStation((ViaStation)value, diagnostics, context);
			case GtmPackage.ALTERNATIVE_ROUTE:
				return validateAlternativeRoute((AlternativeRoute)value, diagnostics, context);
			case GtmPackage.ROUTE:
				return validateRoute((Route)value, diagnostics, context);
			case GtmPackage.ZONE:
				return validateZone((Zone)value, diagnostics, context);
			case GtmPackage.LINE:
				return validateLine((Line)value, diagnostics, context);
			case GtmPackage.POLYGONE:
				return validatePolygone((Polygone)value, diagnostics, context);
			case GtmPackage.EDGE:
				return validateEdge((Edge)value, diagnostics, context);
			case GtmPackage.ZONE_DEFINITIONS:
				return validateZoneDefinitions((ZoneDefinitions)value, diagnostics, context);
			case GtmPackage.ZONE_DEFINITION:
				return validateZoneDefinition((ZoneDefinition)value, diagnostics, context);
			case GtmPackage.CROSS_BORDER_CONDITION:
				return validateCrossBorderCondition((CrossBorderCondition)value, diagnostics, context);
			case GtmPackage.FARE_COMBINATION_MODEL:
				return validateFareCombinationModel((FareCombinationModel)value, diagnostics, context);
			case GtmPackage.REDUCTION_CONSTRAINTS:
				return validateReductionConstraints((ReductionConstraints)value, diagnostics, context);
			case GtmPackage.REDUCTION_CONSTRAINT:
				return validateReductionConstraint((ReductionConstraint)value, diagnostics, context);
			case GtmPackage.REDUCTION_CARDS:
				return validateReductionCards((ReductionCards)value, diagnostics, context);
			case GtmPackage.REDUCTION_CARD:
				return validateReductionCard((ReductionCard)value, diagnostics, context);
			case GtmPackage.REQUIRED_REDUCTION_CARD:
				return validateRequiredReductionCard((RequiredReductionCard)value, diagnostics, context);
			case GtmPackage.CONVERSION_FROM_LEGACY:
				return validateConversionFromLegacy((ConversionFromLegacy)value, diagnostics, context);
			case GtmPackage.CONVERSION_PARAMS:
				return validateConversionParams((ConversionParams)value, diagnostics, context);
			case GtmPackage.ADD_CARRIER_RULES:
				return validateAddCarrierRules((AddCarrierRules)value, diagnostics, context);
			case GtmPackage.ADD_CARRIER_RULE:
				return validateAddCarrierRule((AddCarrierRule)value, diagnostics, context);
			case GtmPackage.VAT_TEMPLATES:
				return validateVatTemplates((VatTemplates)value, diagnostics, context);
			case GtmPackage.VAT_TEMPLATE:
				return validateVatTemplate((VatTemplate)value, diagnostics, context);
			case GtmPackage.LEGACY_FARE_TEMPLATES:
				return validateLegacyFareTemplates((LegacyFareTemplates)value, diagnostics, context);
			case GtmPackage.FARE_TEMPLATE:
				return validateFareTemplate((FareTemplate)value, diagnostics, context);
			case GtmPackage.AFTER_SALES_TEMPLATE:
				return validateAfterSalesTemplate((AfterSalesTemplate)value, diagnostics, context);
			case GtmPackage.ON_BORDER_STATIONS:
				return validateOnBorderStations((OnBorderStations)value, diagnostics, context);
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS:
				return validateLegacyStationToServiceConstraintMappings((LegacyStationToServiceConstraintMappings)value, diagnostics, context);
			case GtmPackage.LEGACY_BORDER_POINT:
				return validateLegacyBorderPoint((LegacyBorderPoint)value, diagnostics, context);
			case GtmPackage.LEGACY_FAKE_BORDER_STATIONS:
				return validateLegacyFakeBorderStations((LegacyFakeBorderStations)value, diagnostics, context);
			case GtmPackage.LEGACY_BORDER_SIDE:
				return validateLegacyBorderSide((LegacyBorderSide)value, diagnostics, context);
			case GtmPackage.LEGACY_BORDER_POINTS:
				return validateLegacyBorderPoints((LegacyBorderPoints)value, diagnostics, context);
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING:
				return validateLegacyStationToServiceConstraintMapping((LegacyStationToServiceConstraintMapping)value, diagnostics, context);
			case GtmPackage.LEGACY_STATION_MAPPINGS:
				return validateLegacyStationMappings((LegacyStationMappings)value, diagnostics, context);
			case GtmPackage.LEGACY_STATION_MAP:
				return validateLegacyStationMap((LegacyStationMap)value, diagnostics, context);
			case GtmPackage.LEGACY_FARE_DETAIL_MAPS:
				return validateLegacyFareDetailMaps((LegacyFareDetailMaps)value, diagnostics, context);
			case GtmPackage.LEGACY_FARE_DETAIL_MAP:
				return validateLegacyFareDetailMap((LegacyFareDetailMap)value, diagnostics, context);
			case GtmPackage.LEGACY_STATION:
				return validateLegacyStation((LegacyStation)value, diagnostics, context);
			case GtmPackage.LEGACY_BODER_POINT_MAPPINGS:
				return validateLegacyBoderPointMappings((LegacyBoderPointMappings)value, diagnostics, context);
			case GtmPackage.LEGACY_BORDER_POINT_MAPPING:
				return validateLegacyBorderPointMapping((LegacyBorderPointMapping)value, diagnostics, context);
			case GtmPackage.LEGACY_FARE_STATION_SET_MAPPINGS:
				return validateLegacyFareStationSetMappings((LegacyFareStationSetMappings)value, diagnostics, context);
			case GtmPackage.LEGACY_FARE_STATION_SET_MAP:
				return validateLegacyFareStationSetMap((LegacyFareStationSetMap)value, diagnostics, context);
			case GtmPackage.LEGACY_BUS_FERRY_MAPPING:
				return validateLegacyBusFerryMapping((LegacyBusFerryMapping)value, diagnostics, context);
			case GtmPackage.LEGACY108:
				return validateLegacy108((Legacy108)value, diagnostics, context);
			case GtmPackage.LEGACY108_MEMOS:
				return validateLegacy108Memos((Legacy108Memos)value, diagnostics, context);
			case GtmPackage.LEGACY108_MEMO:
				return validateLegacy108Memo((Legacy108Memo)value, diagnostics, context);
			case GtmPackage.LEGACY108_FARE_DESCRIPTION:
				return validateLegacy108FareDescription((Legacy108FareDescription)value, diagnostics, context);
			case GtmPackage.LEGACY108_FARES_DESCRIPTIONS:
				return validateLegacy108FaresDescriptions((Legacy108FaresDescriptions)value, diagnostics, context);
			case GtmPackage.LEGACY108_STATIONS:
				return validateLegacy108Stations((Legacy108Stations)value, diagnostics, context);
			case GtmPackage.LEGACY108_STATION:
				return validateLegacy108Station((Legacy108Station)value, diagnostics, context);
			case GtmPackage.LEGACY_ROUTE_FARES:
				return validateLegacyRouteFares((LegacyRouteFares)value, diagnostics, context);
			case GtmPackage.LEGACY_ROUTE_FARE:
				return validateLegacyRouteFare((LegacyRouteFare)value, diagnostics, context);
			case GtmPackage.LEGACY_SERIES_LIST:
				return validateLegacySeriesList((LegacySeriesList)value, diagnostics, context);
			case GtmPackage.LEGACY_SERIES:
				return validateLegacySeries((LegacySeries)value, diagnostics, context);
			case GtmPackage.LEGACY_CARRIERS:
				return validateLegacyCarriers((LegacyCarriers)value, diagnostics, context);
			case GtmPackage.LEGACY_CARRIER:
				return validateLegacyCarrier((LegacyCarrier)value, diagnostics, context);
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES_LIST:
				return validateLegacySeparateContractSeriesList((LegacySeparateContractSeriesList)value, diagnostics, context);
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES:
				return validateLegacySeparateContractSeries((LegacySeparateContractSeries)value, diagnostics, context);
			case GtmPackage.LEGACY_DISTANCE_FARES:
				return validateLegacyDistanceFares((LegacyDistanceFares)value, diagnostics, context);
			case GtmPackage.LEGACY_DISTANCE_FARE:
				return validateLegacyDistanceFare((LegacyDistanceFare)value, diagnostics, context);
			case GtmPackage.LEGACY_VIASTATION:
				return validateLegacyViastation((LegacyViastation)value, diagnostics, context);
			case GtmPackage.BOARDING_OR_ARRIVAL:
				return validateBoardingOrArrival((BoardingOrArrival)value, diagnostics, context);
			case GtmPackage.ADD_CARRIER_SCOPE:
				return validateAddCarrierScope((AddCarrierScope)value, diagnostics, context);
			case GtmPackage.TRANSPORT_MODE:
				return validateTransportMode((TransportMode)value, diagnostics, context);
			case GtmPackage.STATION_RELATION_TYPE:
				return validateStationRelationType((StationRelationType)value, diagnostics, context);
			case GtmPackage.STATION_FARE_DETAIL_TYPE:
				return validateStationFareDetailType((StationFareDetailType)value, diagnostics, context);
			case GtmPackage.REGULATORY_CONDITION:
				return validateRegulatoryCondition((RegulatoryCondition)value, diagnostics, context);
			case GtmPackage.AFTER_SALES_TRANSACTION_TYPE:
				return validateAfterSalesTransactionType((AfterSalesTransactionType)value, diagnostics, context);
			case GtmPackage.BARCODE_TYPES:
				return validateBarcodeTypes((BarcodeTypes)value, diagnostics, context);
			case GtmPackage.BASE_PRICE_CLASS_TYPE:
				return validateBasePriceClassType((BasePriceClassType)value, diagnostics, context);
			case GtmPackage.CLASSIC_CLASS_TYPE:
				return validateClassicClassType((ClassicClassType)value, diagnostics, context);
			case GtmPackage.CLASS_ID:
				return validateClassId((ClassId)value, diagnostics, context);
			case GtmPackage.CHARACTER_SET:
				return validateCharacterSet((CharacterSet)value, diagnostics, context);
			case GtmPackage.CLUSTERS:
				return validateClusters((Clusters)value, diagnostics, context);
			case GtmPackage.COMBINATION_MODEL:
				return validateCombinationModel((CombinationModel)value, diagnostics, context);
			case GtmPackage.CONTROL_DATA_EXCHANGE_TYPES:
				return validateControlDataExchangeTypes((ControlDataExchangeTypes)value, diagnostics, context);
			case GtmPackage.DATA_SOURCE:
				return validateDataSource((DataSource)value, diagnostics, context);
			case GtmPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case GtmPackage.FARE_TYPE:
				return validateFareType((FareType)value, diagnostics, context);
			case GtmPackage.FULFILLMENT_TYPE:
				return validateFulfillmentType((FulfillmentType)value, diagnostics, context);
			case GtmPackage.GEO_SYSTEM:
				return validateGeoSystem((GeoSystem)value, diagnostics, context);
			case GtmPackage.GEO_UNIT:
				return validateGeoUnit((GeoUnit)value, diagnostics, context);
			case GtmPackage.GRAPHICAL_RESERVATION_TYPE:
				return validateGraphicalReservationType((GraphicalReservationType)value, diagnostics, context);
			case GtmPackage.GENERIC_REDUCTION_CARDS:
				return validateGenericReductionCards((GenericReductionCards)value, diagnostics, context);
			case GtmPackage.HEMISPHERE_EW:
				return validateHemisphereEW((HemisphereEW)value, diagnostics, context);
			case GtmPackage.HEMISPHERE_NS:
				return validateHemisphereNS((HemisphereNS)value, diagnostics, context);
			case GtmPackage.INTERFACE_TYPE:
				return validateInterfaceType((InterfaceType)value, diagnostics, context);
			case GtmPackage.LEGACY_CALCULATION_TYPE:
				return validateLegacyCalculationType((LegacyCalculationType)value, diagnostics, context);
			case GtmPackage.LEGACY_PASSENGER_TYPE:
				return validateLegacyPassengerType((LegacyPassengerType)value, diagnostics, context);
			case GtmPackage.LEGACY_SERIES_TYPE:
				return validateLegacySeriesType((LegacySeriesType)value, diagnostics, context);
			case GtmPackage.LEGACY_CONVERSION_TYPE:
				return validateLegacyConversionType((LegacyConversionType)value, diagnostics, context);
			case GtmPackage.OFFER_REQUEST_TYPE:
				return validateOfferRequestType((OfferRequestType)value, diagnostics, context);
			case GtmPackage.ONLINE_SERVICE_TYPE:
				return validateOnlineServiceType((OnlineServiceType)value, diagnostics, context);
			case GtmPackage.PERSONAL_DATA_ITEMS_TYPE:
				return validatePersonalDataItemsType((PersonalDataItemsType)value, diagnostics, context);
			case GtmPackage.PERSONAL_DATA_TRANSFER_TYPE:
				return validatePersonalDataTransferType((PersonalDataTransferType)value, diagnostics, context);
			case GtmPackage.PERSONAL_DATA_CHANGE_REASON:
				return validatePersonalDataChangeReason((PersonalDataChangeReason)value, diagnostics, context);
			case GtmPackage.RESERVATION_TRAVEL_CLASS:
				return validateReservationTravelClass((ReservationTravelClass)value, diagnostics, context);
			case GtmPackage.RESERVATION_SERVICE_LEVEL:
				return validateReservationServiceLevel((ReservationServiceLevel)value, diagnostics, context);
			case GtmPackage.RESERVATION_SERVICE:
				return validateReservationService((ReservationService)value, diagnostics, context);
			case GtmPackage.RESERVATION_BERTH_TYPE:
				return validateReservationBerthType((ReservationBerthType)value, diagnostics, context);
			case GtmPackage.ROUNDING_TYPE:
				return validateRoundingType((RoundingType)value, diagnostics, context);
			case GtmPackage.SCHEMA_VERSION:
				return validateSchemaVersion((SchemaVersion)value, diagnostics, context);
			case GtmPackage.SERVICE_MODE:
				return validateServiceMode((ServiceMode)value, diagnostics, context);
			case GtmPackage.TIME_ZONE:
				return validateTimeZone((TimeZone)value, diagnostics, context);
			case GtmPackage.TAX_SCOPE:
				return validateTaxScope((TaxScope)value, diagnostics, context);
			case GtmPackage.TIME_REFERENCE_TYPE:
				return validateTimeReferenceType((TimeReferenceType)value, diagnostics, context);
			case GtmPackage.TIME_RANGE_SCOPE:
				return validateTimeRangeScope((TimeRangeScope)value, diagnostics, context);
			case GtmPackage.TIME_UNIT:
				return validateTimeUnit((TimeUnit)value, diagnostics, context);
			case GtmPackage.TRAVELER_TYPE:
				return validateTravelerType((TravelerType)value, diagnostics, context);
			case GtmPackage.TRIP_ALLOCATION_PROCESS:
				return validateTripAllocationProcess((TripAllocationProcess)value, diagnostics, context);
			case GtmPackage.TRIP_ALLOCATION_UNIT:
				return validateTripAllocationUnit((TripAllocationUnit)value, diagnostics, context);
			case GtmPackage.TRIP_INTERRUPTION_PROCESS:
				return validateTripInterruptionProcess((TripInterruptionProcess)value, diagnostics, context);
			case GtmPackage.TRAVEL_VALIDITY_TYPE:
				return validateTravelValidityType((TravelValidityType)value, diagnostics, context);
			case GtmPackage.WEEK_DAY:
				return validateWeekDay((WeekDay)value, diagnostics, context);
			case GtmPackage.DATE_AS_DATE:
				return validateDateAsDate((Date)value, diagnostics, context);
			case GtmPackage.DATE_AS_DATE_TIME:
				return validateDateAsDateTime((Date)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGTMTool(GTMTool gtmTool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gtmTool, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeLists(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(codeLists, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodeLists_CARRIERS_MUST(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodeLists_SERVICE_BRANDS_MUST(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodeLists_STATIONS_MUST(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodeLists_COUNTRIES_MUST(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodeLists_CURRENCIES_MUST(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodeLists_LANGUAGES_MUST(codeLists, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CARRIERS_MUST constraint of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCodeLists_CARRIERS_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (codeLists.getCarriers() == null || codeLists.getCarriers().getCarriers().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_1,
						 new Object[] { NationalLanguageSupport.GtmValidator_2, getObjectLabel(codeLists, context) },
						 new Object[] { codeLists },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SERVICE_BRANDS_MUST constraint of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCodeLists_SERVICE_BRANDS_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (codeLists.getServiceBrands() == null || codeLists.getServiceBrands().getServiceBrands().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_3,
						 new Object[] { "SERVICE_BRANDS_MUST", getObjectLabel(codeLists, context) }, //$NON-NLS-1$
						 new Object[] { codeLists },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the STATIONS_MUST constraint of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCodeLists_STATIONS_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (codeLists.getStations() == null || codeLists.getStations().getStations().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_5,
						 new Object[] { "STATIONS_MUST", getObjectLabel(codeLists, context) }, //$NON-NLS-1$
						 new Object[] { codeLists },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the COUNTRIES_MUST constraint of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCodeLists_COUNTRIES_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (codeLists.getCountries() == null || codeLists.getCountries().getCountries().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_7,
						 new Object[] { NationalLanguageSupport.GtmValidator_8, getObjectLabel(codeLists, context) },
						 new Object[] { codeLists },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CURRENCIES_MUST constraint of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCodeLists_CURRENCIES_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (codeLists.getCurrencies() == null || codeLists.getCurrencies().getCurrencies().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_9,
						 new Object[] { "CURRENCIES_MUST", getObjectLabel(codeLists, context) }, //$NON-NLS-1$
						 new Object[] { codeLists },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LANGUAGES_MUST constraint of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCodeLists_LANGUAGES_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (codeLists.getLanguages() == null || codeLists.getLanguages().getLanguages().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_11,
						 new Object[] { "LANGUAGES_MUST", getObjectLabel(codeLists, context) }, //$NON-NLS-1$
						 new Object[] { codeLists },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflowHistory(WorkflowHistory workflowHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflowHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflowStep(WorkflowStep workflowStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflowStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUTSCodes(NUTSCodes nutsCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutsCodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceBrands(ServiceBrands serviceBrands, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceBrands, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceBrands_AT_LEAST_ONE(serviceBrands, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Service Brands</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateServiceBrands_AT_LEAST_ONE(ServiceBrands serviceBrands, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (serviceBrands.getServiceBrands().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_13,
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(serviceBrands, context) }, //$NON-NLS-1$
						 new Object[] { serviceBrands },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguages(Languages languages, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(languages, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validateLanguages_AT_LEAST_ONE(languages, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Languages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLanguages_AT_LEAST_ONE(Languages languages, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (languages.getLanguages().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_15,
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(languages, context) }, //$NON-NLS-1$
						 new Object[] { languages },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencies(Currencies currencies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(currencies, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validateCurrencies_AT_LEAST_ONE(currencies, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Currencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCurrencies_AT_LEAST_ONE(Currencies currencies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (currencies.getCurrencies().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_17,
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(currencies, context) }, //$NON-NLS-1$
						 new Object[] { currencies },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountries(Countries countries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(countries, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validateCountries_AT_LEAST_ONE(countries, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Countries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCountries_AT_LEAST_ONE(Countries countries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (countries.getCountries().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_19,
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(countries, context) }, //$NON-NLS-1$
						 new Object[] { countries },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStations(Stations stations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stations, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validateStations_AT_LEAST_ONE(stations, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Stations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStations_AT_LEAST_ONE(Stations stations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (stations.getStations().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_21,
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(stations, context) }, //$NON-NLS-1$
						 new Object[] { stations },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarriers(Carriers carriers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(carriers, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validateCarriers_AT_LEAST_ONE(carriers, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Carriers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCarriers_AT_LEAST_ONE(Carriers carriers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (carriers.getCarriers().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_23,
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(carriers, context) }, //$NON-NLS-1$
						 new Object[] { carriers },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralTariffModel(GeneralTariffModel generalTariffModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalTariffModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralTariffModel_DELIVERY_MUST(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralTariffModel_FARE_MUST(generalTariffModel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DELIVERY_MUST constraint of '<em>General Tariff Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGeneralTariffModel_DELIVERY_MUST(GeneralTariffModel generalTariffModel, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (generalTariffModel.getDelivery() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_25,
						 new Object[] { "DELIVERY_MUST", getObjectLabel(generalTariffModel, context) }, //$NON-NLS-1$
						 new Object[] { generalTariffModel },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FARE_MUST constraint of '<em>General Tariff Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGeneralTariffModel_FARE_MUST(GeneralTariffModel generalTariffModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (generalTariffModel.getFareStructure() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_27,
						 new Object[] { "FARE_MUST", getObjectLabel(generalTariffModel, context) }, //$NON-NLS-1$
						 new Object[] { generalTariffModel },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversionFromLegacy(ConversionFromLegacy conversionFromLegacy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conversionFromLegacy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversionParams(ConversionParams conversionParams, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conversionParams, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conversionParams, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conversionParams, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conversionParams, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conversionParams, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conversionParams, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conversionParams, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conversionParams, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conversionParams, diagnostics, context);
		if (result || diagnostics != null) result &= validateConversionParams_COUNTRY_MUST(conversionParams, diagnostics, context);
		if (result || diagnostics != null) result &= validateConversionParams_AT_LEAST_ONE_LEGACY_FARE_TEMPLATE(conversionParams, diagnostics, context);
		return result;
	}

	/**
	 * Validates the COUNTRY_MUST constraint of '<em>Conversion Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConversionParams_COUNTRY_MUST(ConversionParams conversionParams, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (conversionParams.getCountry() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_29,
						 new Object[] { NationalLanguageSupport.GtmValidator_30, getObjectLabel(conversionParams, context) },
						 new Object[] { conversionParams },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AT_LEAST_ONE_LEGACY_FARE_TEMPLATE constraint of '<em>Conversion Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConversionParams_AT_LEAST_ONE_LEGACY_FARE_TEMPLATE(ConversionParams conversionParams, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (conversionParams.getLegacyFareTemplates() == null || conversionParams.getLegacyFareTemplates().getFareTemplates().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_31,
						 new Object[] { "AT_LEAST_ONE_LEGACY_FARE_TEMPLATE", getObjectLabel(conversionParams, context) }, //$NON-NLS-1$
						 new Object[] { conversionParams },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddCarrierRules(AddCarrierRules addCarrierRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addCarrierRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddCarrierRule(AddCarrierRule addCarrierRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addCarrierRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVatTemplates(VatTemplates vatTemplates, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vatTemplates, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVatTemplate(VatTemplate vatTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vatTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareTemplate(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fareTemplate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareTemplate_PRICE_FACTOR_MUST(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareTemplate_TYPE_MUST(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareTemplate_PASSENGER_CONSTRAINT_MUST(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareTemplate_LEGACY_CONVERSION_MUST(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareTemplate_SERVICE_CLASS_MUST(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareTemplate_PRICE_OR_FACTOR(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareTemplate_BUNDLE_MUST(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareTemplate_NON_CONVERTABLE_CLASS(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareTemplate_TARIFF_ID_VALUES(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareTemplate_SERIES_FILTER_CONVERTABLE(fareTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareTemplate_REGULATORY_REGIME(fareTemplate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PRICE_FACTOR_MUST constraint of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareTemplate_PRICE_FACTOR_MUST(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareTemplate.getPriceFactor() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_33,
						 new Object[] { "PRICE_FACTOR_MUST", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		}
		
		if (fareTemplate.getPriceFactor() < 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_35,
						 new Object[] { "PRICE_FACTOR_MUST", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		}

		if (fareTemplate.getPriceFactor() >= 5) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_4,
						 new Object[] { "PRICE_FACTOR_MUST", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		} else if (fareTemplate.getPriceFactor() > 1) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_0,
						 new Object[] { "PRICE_FACTOR_MUST", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		} 
		
		
		
		return true;
	}

	/**
	 * Validates the TYPE_MUST constraint of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareTemplate_TYPE_MUST(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareTemplate.getType() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_41,
						 new Object[] { "TYPE_MUST", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TRAVEL_VALIDITY_MUST constraint of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareTemplate_TRAVEL_VALIDITY_MUST(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareTemplate.getTravelValidity() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_43,
						 new Object[] { "TRAVEL_VALIDITY_MUST", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the COMBINATION_CONSTRAINT_MUST constraint of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareTemplate_COMBINATION_CONSTRAINT_MUST(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareTemplate.getCombinationConstraint() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_45,
						 new Object[] { "COMBINATION_CONSTRAINT_MUST", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the PASSENGER_CONSTRAINT_MUST constraint of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareTemplate_PASSENGER_CONSTRAINT_MUST(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareTemplate.getPassengerConstraint() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_47,
						 new Object[] {"PASSENGER_CONSTRAINT_MUST", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FULFILMENT_CONSTRAINT_MUST constraint of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareTemplate_FULFILMENT_CONSTRAINT_MUST(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareTemplate.getFulfillmentConstraint() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_49,
						 new Object[] { "FULFILMENT_CONSTRAINT_MUST", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LEGACY_CONVERSION_MUST constraint of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareTemplate_LEGACY_CONVERSION_MUST(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareTemplate.getLegacyConversion() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_51,
						 new Object[] { "LEGACY_CONVERSION_MUST", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SERVICE_CLASS_MUST constraint of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareTemplate_SERVICE_CLASS_MUST(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareTemplate.getServiceClass() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_53 + " in " + getObjectLabel(fareTemplate, context),
						 new Object[] {"SERVICE_CLASS_MUST", getObjectLabel(fareTemplate, context) },  //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the PRICE_OR_FACTOR constraint of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareTemplate_PRICE_OR_FACTOR(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareTemplate.getPrice() != null && fareTemplate.getPriceFactor() > 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_55 + " in " + getObjectLabel(fareTemplate, context),
						 new Object[] { "PRICE_OR_FACTOR", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the BUNDLE_MUST constraint of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareTemplate_BUNDLE_MUST(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareTemplate.getFareConstraintBundle() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_TemplateMustContainBundle + " in " + getObjectLabel(fareTemplate, context),
						 new Object[] { "BUNDLE_MUST", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NON_CONVERTABLE_CLASS constraint of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareTemplate_NON_CONVERTABLE_CLASS(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if ( (fareTemplate.getServiceClass().getId() == ClassId.A || fareTemplate.getServiceClass().getId() == ClassId.C)
			  && fareTemplate.getLegacyConversion() == LegacyConversionType.YES ) {
			if (diagnostics != null) {
			diagnostics.add
			(createSimpleDiagnostic
				(Diagnostic.WARNING,
				 DIAGNOSTIC_SOURCE,
				 0,
				 NationalLanguageSupport.GtmValidator_UnconvertableClass + " in " + getObjectLabel(fareTemplate, context),
				 new Object[] { "NON_CONVERTABLE_CLASS", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
				 new Object[] { fareTemplate },
				 context));
			}
			return false;
		};
		
	    if ( (fareTemplate.getServiceClass().getId() == ClassId.A || fareTemplate.getServiceClass().getId() == ClassId.C)
			  && fareTemplate.getLegacyConversion() == LegacyConversionType.ONLY) {
			if (diagnostics != null) {
			 diagnostics.add
			(createSimpleDiagnostic
				(Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0,
				 NationalLanguageSupport.GtmValidator_UnconvertableClass + " in " + getObjectLabel(fareTemplate, context),
				 new Object[] { "NON_CONVERTABLE_CLASS", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
				 new Object[] { fareTemplate },
				 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TARIFF_ID_VALUES constraint of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareTemplate_TARIFF_ID_VALUES(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareTemplate.getLegacyAccountingTariffId() < 1 || fareTemplate.getLegacyAccountingTariffId() > 99999 ) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_223  + " in " +  getObjectLabel(fareTemplate, context), 
						 new Object[] { "TARIFF_ID_VALUE", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SERIES_FILTER_CONVERTABLE constraint of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareTemplate_SERIES_FILTER_CONVERTABLE(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {

		/*
		if (fareTemplate.getSeriesFilter() != null &&
			fareTemplate.getSeriesFilter().size() > 0 &&
			( fareTemplate.getLegacyConversion().equals(LegacyConversionType.ONLY) || 
			  fareTemplate.getLegacyConversion().equals(LegacyConversionType.YES)) ) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Fare Templates restricted to Series Types should not be convertable: "  + " in " +  getObjectLabel(fareTemplate, context), 
						 new Object[] {  "SERIES_FILTER_CONVERTABLE", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;
		}
		*/
		return true;
	}

	/**
	 * Validates the REGULATORY_REGIME constraint of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareTemplate_REGULATORY_REGIME(FareTemplate fareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareTemplate.getRegulatoryConditions() == null || fareTemplate.getRegulatoryConditions().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Regulatory regimes are not defined in " +  getObjectLabel(fareTemplate, context), 
						 new Object[] { "REGULATORY_REGIME", getObjectLabel(fareTemplate, context) }, //$NON-NLS-1$
						 new Object[] { fareTemplate },
						 context));
			}
			return false;

		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesTemplate(AfterSalesTemplate afterSalesTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(afterSalesTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStructure(FareStructure fareStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPoints(ConnectionPoints connectionPoints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPoints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareResourceLocations(FareResourceLocations fareResourceLocations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareResourceLocations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrainResourceLocations(TrainResourceLocations trainResourceLocations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trainResourceLocations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationResourceLocations(StationResourceLocations stationResourceLocations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stationResourceLocations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrierResourceLocations(CarrierResourceLocations carrierResourceLocations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carrierResourceLocations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentConstraints(FulfillmentConstraints fulfillmentConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fulfillmentConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedOnlineServices(SupportedOnlineServices supportedOnlineServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supportedOnlineServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationNames(StationNames stationNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stationNames, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionConstraints(ReductionConstraints reductionConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reductionConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataConstraints(PersonalDataConstraints personalDataConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personalDataConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerConstraints(PassengerConstraints passengerConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passengerConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationConstraints(CombinationConstraints combinationConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(combinationConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelValidityConstraints(TravelValidityConstraints travelValidityConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(travelValidityConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesAvailabilityConstraints(SalesAvailabilityConstraints salesAvailabilityConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(salesAvailabilityConstraints, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateSalesAvailabilityConstraints_AT_LEAST_ONE(salesAvailabilityConstraints, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Sales Availability Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSalesAvailabilityConstraints_AT_LEAST_ONE(SalesAvailabilityConstraints salesAvailabilityConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (salesAvailabilityConstraints.getSalesAvailabilityConstraints().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_57,
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(salesAvailabilityConstraints, context) }, //$NON-NLS-1$
						 new Object[] { salesAvailabilityConstraints },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionCards(ReductionCards reductionCards, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reductionCards, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrierConstraints(CarrierConstraints carrierConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carrierConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConstraints(ServiceConstraints serviceConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationParameters(ReservationParameters reservationParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationParameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalConstraints(RegionalConstraints regionalConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionalConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceLevelDefinitions(ServiceLevelDefinitions serviceLevelDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceLevelDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTexts(Texts texts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(texts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrices(Prices prices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceClassDefinitions(ServiceClassDefinitions serviceClassDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceClassDefinitions, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceClassDefinitions_AT_LEAST_ONE(serviceClassDefinitions, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Service Class Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateServiceClassDefinitions_AT_LEAST_ONE(ServiceClassDefinitions serviceClassDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (serviceClassDefinitions.getServiceClassDefinitions().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_59,
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(serviceClassDefinitions, context) }, //$NON-NLS-1$
						 new Object[] { serviceClassDefinitions },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendars(Calendars calendars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(calendars, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validateCalendars_AT_LEAST_ONE(calendars, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Calendars</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public boolean validateCalendars_AT_LEAST_ONE(Calendars calendars, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (calendars.getCalendars().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_61,
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(calendars, context) }, //$NON-NLS-1$
						 new Object[] { calendars },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesRules(AfterSalesRules afterSalesRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(afterSalesRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareElements(FareElements fareElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelivery(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delivery, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelivery_CARRIER_MUST(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelivery_DELIVERY_ID_CHARACTERS(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelivery_VERSION_MUST(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelivery_ACCEPTED_VERSIONS_MUST(delivery, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CARRIER_MUST constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDelivery_CARRIER_MUST(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (delivery.getProvider() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_63,
						 new Object[] { "CARRIER_MUST", getObjectLabel(delivery, context) }, //$NON-NLS-1$
						 new Object[] { delivery },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the DELIVERY_ID_CHARACTERS constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDelivery_DELIVERY_ID_CHARACTERS(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (delivery.getId() == null || delivery.getId().length() < 1) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_65,
						 new Object[] { NationalLanguageSupport.GtmValidator_66, getObjectLabel(delivery, context) },
						 new Object[] { delivery },
						 context));
			}
			return false;
		}
		
		if (delivery.getId().contains(" ")) { //$NON-NLS-1$
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_68,
						 new Object[] { "DELIVERY_ID_CHARACTERS", getObjectLabel(delivery, context) }, //$NON-NLS-1$
						 new Object[] { delivery },
						 context));
			}
			return false;
		}
		
		
		return true;
	}

	/**
	 * Validates the VERSION_MUST constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDelivery_VERSION_MUST(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (delivery.getSchemaVersion() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_70,
						 new Object[] { "VERSION_MUST", getObjectLabel(delivery, context) }, //$NON-NLS-1$
						 new Object[] { delivery },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ACCEPTED_VERSIONS_MUST constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDelivery_ACCEPTED_VERSIONS_MUST(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (delivery.getAcceptedSchemaVersion() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_72,
						 new Object[] { "ACCEPTED_VERSIONS_MUST", getObjectLabel(delivery, context) }, //$NON-NLS-1$
						 new Object[] { delivery },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendar(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(calendar, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validateCalendar_START_END_DATE_ORDER(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validateCalendar_DATES_WITHIN_RANGE(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validateCalendar_NOT_REFERENCED(calendar, diagnostics, context);
		return result;
	}

	/**
	 * Validates the START_END_DATE_ORDER constraint of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCalendar_START_END_DATE_ORDER(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (calendar.getFromDateTime() == null || calendar.getUntilDateTime() == null || calendar.getFromDateTime().after(calendar.getUntilDateTime()) ) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_74,
						 new Object[] { "START_END_DATE_ORDER", getObjectLabel(calendar, context) }, //$NON-NLS-1$
						 new Object[] { calendar },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the DATES_WITHIN_RANGE constraint of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCalendar_DATES_WITHIN_RANGE(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		
		for (Date date : calendar.getDates()) {
			if (calendar.getFromDateTime().after(date) || 
				calendar.getUntilDateTime().before(date)) {
				result = false;
				break;
			}
		}
		
		if (result == false) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_76,
						 new Object[] { "DATES_WITHIN_RANGE", getObjectLabel(calendar, context) }, //$NON-NLS-1$
						 new Object[] { calendar },
						 context));
			}
		}
		
		if ((calendar.getDates() == null || calendar.getDates().isEmpty()) 
			&&
			 (calendar.getFromDateTime() == null && calendar.getUntilDateTime() == null)) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Calendar does not include dates and no date range: " + getObjectLabel(calendar, context),
						 new Object[] { "DATES_WITHIN_RANGE", getObjectLabel(calendar, context) }, //$NON-NLS-1$
						 new Object[] { calendar },
						 context));
			}
			result = false;		
		}
		
		if ((calendar.getFromDateTime() == null && calendar.getUntilDateTime() != null) 
				||
			 (calendar.getFromDateTime() != null && calendar.getUntilDateTime() == null)) {
				if (diagnostics != null) {
					diagnostics.add
						(createSimpleDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "Calendar includes only from date or until date: " + getObjectLabel(calendar, context),
							 new Object[] { "DATES_WITHIN_RANGE", getObjectLabel(calendar, context) }, //$NON-NLS-1$
							 new Object[] { calendar },
							 context));
				}
				result = false;		
			}
		
		
		
		return result;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCalendar_NOT_REFERENCED(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {

		FareStructure fareData = GtmUtils.getFareStructure(calendar);
		if ( (fareData == null) ||
			 ! (   GtmUtils.isReferenced(calendar,fareData.getSalesAvailabilityConstraints())
			    || GtmUtils.isReferenced(calendar,fareData.getTravelValidityConstraints())  )  ) {
			if (diagnostics != null) {
				diagnostics.add
				(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 getObjectLabel(calendar, context) + " " + NationalLanguageSupport.GtmValidator_Not_REFERENCED,
						 new Object[] { "NOT_REFERENCED", getObjectLabel(calendar, context) }, //$NON-NLS-1$
						 new Object[] { calendar },
						 context));						
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrier(Carrier carrier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carrier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyStationToServiceConstraintMappings(LegacyStationToServiceConstraintMappings legacyStationToServiceConstraintMappings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyStationToServiceConstraintMappings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyBorderPoint(LegacyBorderPoint legacyBorderPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyBorderPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnBorderStations(OnBorderStations onBorderStations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onBorderStations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyFakeBorderStations(LegacyFakeBorderStations legacyFakeBorderStations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyFakeBorderStations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyBorderSide(LegacyBorderSide legacyBorderSide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyBorderSide, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyBorderPoints(LegacyBorderPoints legacyBorderPoints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyBorderPoints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyStationToServiceConstraintMapping(LegacyStationToServiceConstraintMapping legacyStationToServiceConstraintMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(legacyStationToServiceConstraintMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(legacyStationToServiceConstraintMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(legacyStationToServiceConstraintMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(legacyStationToServiceConstraintMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(legacyStationToServiceConstraintMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(legacyStationToServiceConstraintMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(legacyStationToServiceConstraintMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(legacyStationToServiceConstraintMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(legacyStationToServiceConstraintMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyStationToServiceConstraintMapping_SERVICE_CONSTRAINT_MUST(legacyStationToServiceConstraintMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyStationToServiceConstraintMapping_CODE_NOT_NULL(legacyStationToServiceConstraintMapping, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SERVICE_CONSTRAINT_MUST constraint of '<em>Legacy Station To Service Constraint Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacyStationToServiceConstraintMapping_SERVICE_CONSTRAINT_MUST(LegacyStationToServiceConstraintMapping legacyStationToServiceConstraintMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (legacyStationToServiceConstraintMapping.getServiceConstraint() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_78,
						 new Object[] { "SERVICE_CONSTRAINT_MUST", getObjectLabel(legacyStationToServiceConstraintMapping, context) }, //$NON-NLS-1$
						 new Object[] { legacyStationToServiceConstraintMapping },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CODE_NOT_NULL constraint of '<em>Legacy Station To Service Constraint Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacyStationToServiceConstraintMapping_CODE_NOT_NULL(LegacyStationToServiceConstraintMapping legacyStationToServiceConstraintMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (legacyStationToServiceConstraintMapping.getCode() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_80,
						 new Object[] { "CODE_NOT_NULL", getObjectLabel(legacyStationToServiceConstraintMapping, context) }, //$NON-NLS-1$
						 new Object[] { legacyStationToServiceConstraintMapping },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyFareStationSetMappings(LegacyFareStationSetMappings legacyFareStationSetMappings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyFareStationSetMappings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyFareStationSetMap(LegacyFareStationSetMap legacyFareStationSetMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(legacyFareStationSetMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(legacyFareStationSetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(legacyFareStationSetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(legacyFareStationSetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(legacyFareStationSetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(legacyFareStationSetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(legacyFareStationSetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(legacyFareStationSetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(legacyFareStationSetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyFareStationSetMap_CODE_NOT_NULL(legacyFareStationSetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyFareStationSetMap_STATION_SET_MUST(legacyFareStationSetMap, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CODE_NOT_NULL constraint of '<em>Legacy Fare Station Set Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacyFareStationSetMap_CODE_NOT_NULL(LegacyFareStationSetMap legacyFareStationSetMap, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (legacyFareStationSetMap.getLegacyCode() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_82,
						 new Object[] { "CODE_NOT_NULL", getObjectLabel(legacyFareStationSetMap, context) }, //$NON-NLS-1$
						 new Object[] { legacyFareStationSetMap },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the STATION_SET_MUST constraint of '<em>Legacy Fare Station Set Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacyFareStationSetMap_STATION_SET_MUST(LegacyFareStationSetMap legacyFareStationSetMap, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (legacyFareStationSetMap.getStationSet() == null || legacyFareStationSetMap.getStationSet().getStations() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_84,
						 new Object[] { "STATION_SET_MUST", getObjectLabel(legacyFareStationSetMap, context) }, //$NON-NLS-1$
						 new Object[] { legacyFareStationSetMap },
						 context));
			}
			return false;
		}
		
		if (legacyFareStationSetMap.getStationSet().getStations().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_FareStationSet_empty + " - " + getObjectLabel(legacyFareStationSetMap, context), //$NON-NLS-1$
						 new Object[] { "STATION_SET_MUST", getObjectLabel(legacyFareStationSetMap, context) }, //$NON-NLS-1$
						 new Object[] { legacyFareStationSetMap },
						 context));
			}
			return false;
		}
		
		if (legacyFareStationSetMap.getStationSet().getStations().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_FareStationSet_onlyOneStation + " - " + getObjectLabel(legacyFareStationSetMap, context), //$NON-NLS-1$
						 new Object[] { "STATION_SET_MUST", getObjectLabel(legacyFareStationSetMap, context) }, //$NON-NLS-1$
						 new Object[] { legacyFareStationSetMap },
						 context));
			}
			return false;
		}		
		
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyBusFerryMapping(LegacyBusFerryMapping legacyBusFerryMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(legacyBusFerryMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(legacyBusFerryMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(legacyBusFerryMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(legacyBusFerryMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(legacyBusFerryMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(legacyBusFerryMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(legacyBusFerryMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(legacyBusFerryMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(legacyBusFerryMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyBusFerryMapping_MATCHING_TRANSPORT_MODE(legacyBusFerryMapping, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MATCHING_TRANSPORT_MODE constraint of '<em>Legacy Bus Ferry Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacyBusFerryMapping_MATCHING_TRANSPORT_MODE(LegacyBusFerryMapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {


		if (mapping.getBusServiceConstraint() != null && mapping.getBusServiceConstraint().getIncludedServiceBrands() != null) {
			boolean containsBus = false;
			for (ServiceBrand brand : mapping.getBusServiceConstraint().getIncludedServiceBrands()) {
				 if (brand.getTransportMode().equals(TransportMode.BUS)) {
					 containsBus = true;
				 }
			}
			if (!containsBus) {
				if (diagnostics != null) {
					diagnostics.add
						(createSimpleDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "ServiceConstraint for Bus Series does not contain a bus Service Brand: " + " - " + getObjectLabel(mapping, context), //$NON-NLS-1$
							 new Object[] { "MATCHING_TRANSPORT_MODE", getObjectLabel(mapping, context) },
							 new Object[] { mapping },
							 context));
				}
				return false;
			}
		}
		

		if (mapping.getFerryConstraint() != null && mapping.getFerryConstraint().getIncludedServiceBrands() != null) {
			boolean containsFerry = false;
			for (ServiceBrand brand : mapping.getFerryConstraint().getIncludedServiceBrands()) {
				 if (brand.getTransportMode().equals(TransportMode.SHIP)) {
					 containsFerry = true;
				 }
			}
			if (!containsFerry) {
				if (diagnostics != null) {
					diagnostics.add
						(createSimpleDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "ServiceConstraint for Ferry Series does not contain a Ship Service Brand: " + " - " + getObjectLabel(mapping, context), //$NON-NLS-1$
							 new Object[] { "MATCHING_TRANSPORT_MODE", getObjectLabel(mapping, context) },
							 new Object[] { mapping },
							 context));
				}
				return false;
			}
		}
		
		if (mapping.getBusFerryConstraint() != null && mapping.getBusFerryConstraint().getIncludedServiceBrands() != null) {
			boolean containsBus = false;
			boolean containsFerry = false;
			for (ServiceBrand brand : mapping.getBusFerryConstraint().getIncludedServiceBrands()) {
				 if (brand.getTransportMode().equals(TransportMode.BUS)) {
					 containsBus = true;
				 }
				 if (brand.getTransportMode().equals(TransportMode.SHIP)) {
					 containsFerry = true;
				 }
			}
			if (!containsBus || !containsFerry) {
				if (diagnostics != null) {
					diagnostics.add
						(createSimpleDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "ServiceConstraint for combined Bus and Ferry Series does not contain bus and ship Service Brands: " + " - " + getObjectLabel(mapping, context), //$NON-NLS-1$
							 new Object[] { "MATCHING_TRANSPORT_MODE", getObjectLabel(mapping, context) },
							 new Object[] { mapping },
							 context));
				}
				return false;
			}
		}
		
		
		
		
		
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyDistanceFare(LegacyDistanceFare legacyDistanceFare, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyDistanceFare, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacy108(Legacy108 legacy108, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(legacy108, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(legacy108, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(legacy108, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(legacy108, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(legacy108, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(legacy108, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(legacy108, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(legacy108, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(legacy108, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacy108_CHARACTER_SET_MUST(legacy108, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacy108_TIME_ZONE_MUST(legacy108, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacy108_CARRIER_MUST(legacy108, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CHARACTER_SET_MUST constraint of '<em>Legacy108</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacy108_CHARACTER_SET_MUST(Legacy108 legacy108, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (legacy108.getCharacterSet() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_86,
						 new Object[] { "CHARACTER_SET_MUST", getObjectLabel(legacy108, context) }, //$NON-NLS-1$
						 new Object[] { legacy108 },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TIME_ZONE_MUST constraint of '<em>Legacy108</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacy108_TIME_ZONE_MUST(Legacy108 legacy108, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (legacy108.getTimeZone() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_88,
						 new Object[] { "TIME_ZONE_MUST", getObjectLabel(legacy108, context) }, //$NON-NLS-1$
						 new Object[] { legacy108 },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CARRIER_MUST constraint of '<em>Legacy108</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacy108_CARRIER_MUST(Legacy108 legacy108, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (legacy108.getCarrier() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_90,
						 new Object[] { "CARRIER_MUST", getObjectLabel(legacy108, context) }, //$NON-NLS-1$
						 new Object[] { legacy108 },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacy108Memos(Legacy108Memos legacy108Memos, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacy108Memos, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacy108Memo(Legacy108Memo legacy108Memo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacy108Memo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacy108FareDescription(Legacy108FareDescription legacy108FareDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacy108FareDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacy108FaresDescriptions(Legacy108FaresDescriptions legacy108FaresDescriptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacy108FaresDescriptions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacy108Stations(Legacy108Stations legacy108Stations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacy108Stations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacy108Station(Legacy108Station legacy108Station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacy108Station, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyRouteFares(LegacyRouteFares legacyRouteFares, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyRouteFares, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyRouteFare(LegacyRouteFare legacyRouteFare, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyRouteFare, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacySeries(LegacySeries legacySeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacySeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyCarriers(LegacyCarriers legacyCarriers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyCarriers, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyCarrier(LegacyCarrier legacyCarrier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyCarrier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacySeparateContractSeriesList(LegacySeparateContractSeriesList legacySeparateContractSeriesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacySeparateContractSeriesList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacySeparateContractSeries(LegacySeparateContractSeries legacySeparateContractSeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacySeparateContractSeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacySeriesList(LegacySeriesList legacySeriesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacySeriesList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyDistanceFares(LegacyDistanceFares legacyDistanceFares, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyDistanceFares, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyViastation(LegacyViastation legacyViastation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyViastation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoardingOrArrival(BoardingOrArrival boardingOrArrival, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddCarrierScope(AddCarrierScope addCarrierScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportMode(TransportMode transportMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyFareTemplates(LegacyFareTemplates legacyFareTemplates, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(legacyFareTemplates, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(legacyFareTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(legacyFareTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(legacyFareTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(legacyFareTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(legacyFareTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(legacyFareTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(legacyFareTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(legacyFareTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyFareTemplates_NO_CLASS_SEPARATED_CONVERTABLE_FARE_TEMPLATES(legacyFareTemplates, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NO_CLASS_SEPARATED_CONVERTABLE_FARE_TEMPLATES constraint of '<em>Legacy Fare Templates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacyFareTemplates_NO_CLASS_SEPARATED_CONVERTABLE_FARE_TEMPLATES(LegacyFareTemplates legacyFareTemplates, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		ArrayList<FareTemplate> wrongFares = new ArrayList<FareTemplate>();
		
		for (FareTemplate fare : legacyFareTemplates.getFareTemplates()) {
			
			if (fare.getLegacyConversion().equals(LegacyConversionType.YES) || fare.getLegacyConversion().equals(LegacyConversionType.ONLY)  ) {
				
				//check for another fare with a different class and a different text
				
				for (FareTemplate fare2 : legacyFareTemplates.getFareTemplates()) {
					
					if ( (fare2.getLegacyConversion().equals(LegacyConversionType.YES) 
						  || fare2.getLegacyConversion().equals(LegacyConversionType.ONLY)  )
							
						&& fare2 != fare 
						&& fare2.getText() != fare.getText()
						&& fare2.getCarrierConstraint() == fare.getCarrierConstraint()
						&& fare2.getServiceClass() != fare.getServiceClass()) {
						
						wrongFares.add(fare);
						
					}
						
				}
				
			}
			
		}
		
		if (!wrongFares.isEmpty()) {
			
			for (FareTemplate wrongFare: wrongFares) {
			
				if (diagnostics != null) {
					diagnostics.add
					(createSimpleDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "Fare split with different fare names by class not allowed for convertable faretemplate: " + getObjectLabel(wrongFare, context),
							 new Object[] { "NO_CLASS_SEPARATED_CONVERTABLE_FARE", getObjectLabel(legacyFareTemplates, context) }, //$NON-NLS-1$
							 new Object[] { legacyFareTemplates },
							 context));				
				}
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationRelationType(StationRelationType stationRelationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationFareDetailType(StationFareDetailType stationFareDetailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegulatoryCondition(RegulatoryCondition regulatoryCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyStationMappings(LegacyStationMappings legacyStationMappings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyStationMappings, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyStationMap(LegacyStationMap legacyStationMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(legacyStationMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(legacyStationMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(legacyStationMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(legacyStationMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(legacyStationMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(legacyStationMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(legacyStationMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(legacyStationMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(legacyStationMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyStationMap_CODE_NOU_NULL(legacyStationMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyStationMap_STATION_MUST(legacyStationMap, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CODE_NOU_NULL constraint of '<em>Legacy Station Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacyStationMap_CODE_NOU_NULL(LegacyStationMap legacyStationMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (legacyStationMap.getLegacyCode() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_92,
						 new Object[] { "CODE_NOU_NULL", getObjectLabel(legacyStationMap, context) }, //$NON-NLS-1$
						 new Object[] { legacyStationMap },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the STATION_MUST constraint of '<em>Legacy Station Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacyStationMap_STATION_MUST(LegacyStationMap legacyStationMap, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (legacyStationMap.getStation() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_94,
						 new Object[] { "STATION_MUST", getObjectLabel(legacyStationMap, context) }, //$NON-NLS-1$
						 new Object[] { legacyStationMap },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyFareDetailMaps(LegacyFareDetailMaps legacyFareDetailMaps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyFareDetailMaps, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyFareDetailMap(LegacyFareDetailMap legacyFareDetailMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyFareDetailMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyBoderPointMappings(LegacyBoderPointMappings legacyBoderPointMappings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyBoderPointMappings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyBorderPointMapping(LegacyBorderPointMapping legacyBorderPointMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(legacyBorderPointMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(legacyBorderPointMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(legacyBorderPointMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(legacyBorderPointMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(legacyBorderPointMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(legacyBorderPointMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(legacyBorderPointMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(legacyBorderPointMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(legacyBorderPointMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyBorderPointMapping_CODE_NOT_NULL(legacyBorderPointMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyBorderPointMapping_CONNECTION_POINT_MUST(legacyBorderPointMapping, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CODE_NOT_NULL constraint of '<em>Legacy Border Point Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacyBorderPointMapping_CODE_NOT_NULL(LegacyBorderPointMapping legacyBorderPointMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (legacyBorderPointMapping.getCode() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_96,
						 new Object[] { "CODE_NOT_NULL", getObjectLabel(legacyBorderPointMapping, context) }, //$NON-NLS-1$
						 new Object[] { legacyBorderPointMapping },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CONNECTION_POINT_MUST constraint of '<em>Legacy Border Point Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public boolean validateLegacyBorderPointMapping_CONNECTION_POINT_MUST(LegacyBorderPointMapping legacyBorderPointMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (legacyBorderPointMapping.getConnectionPoint() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_98,
						 new Object[] { "CONNECTION_POINT_MUST", getObjectLabel(legacyBorderPointMapping, context) }, //$NON-NLS-1$
						 new Object[] { legacyBorderPointMapping },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaVersion(SchemaVersion schemaVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrierConstraint(CarrierConstraint carrierConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(carrierConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCarrierConstraint_INCLUDE_OR_EXCLUDE(carrierConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the INCLUDE_OR_EXCLUDE constraint of '<em>Carrier Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCarrierConstraint_INCLUDE_OR_EXCLUDE(CarrierConstraint carrierConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (carrierConstraint.getIncludedCarriers() != null 
			&& carrierConstraint.getExcludedCarriers() != null
			&& !carrierConstraint.getExcludedCarriers().isEmpty() 
			&& !carrierConstraint.getIncludedCarriers().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createGtmDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Included and excluded carriers used at the same time in:" + " " + getObjectLabel(carrierConstraint, context),
						 new Object[] { getObjectLabel(carrierConstraint, context) },
						 new Object[] { carrierConstraint },
						 context));
			}
			return false;
		}
		
		if (   (carrierConstraint.getIncludedCarriers() == null || carrierConstraint.getIncludedCarriers().isEmpty())
			&& (carrierConstraint.getExcludedCarriers() == null || carrierConstraint.getExcludedCarriers().isEmpty()) ) {
			
			if (diagnostics != null) {
				diagnostics.add
					(createGtmDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Either included and excluded carriers must be privided in:" + " " + getObjectLabel(carrierConstraint, context),
						 new Object[] { getObjectLabel(carrierConstraint, context) },
						 new Object[] { carrierConstraint },
						 context));
			}
			return false;
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(country, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPoint(ConnectionPoint connectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectionPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectionPoint_NAME_FORMAT(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectionPoint_LEGACY_BORDER_POINT_MISSING(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectionPoint_STATION_SET_AT_LEAST_ONE(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectionPoint_NAME_UTF8_FORMAT(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectionPoint_NOT_REFERENCED(connectionPoint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NAME_FORMAT constraint of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnectionPoint_NAME_FORMAT(ConnectionPoint connectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (connectionPoint.getName() == null || connectionPoint.getName().length() == 0 ) return true;
		
		if (!StringFormatValidator.isStationASCII(connectionPoint.getName())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_100,
						 new Object[] { "NAME_FORMAT", getObjectLabel(connectionPoint, context) }, //$NON-NLS-1$
						 new Object[] { connectionPoint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LEGACY_BORDER_POINT_MISSING constraint of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnectionPoint_LEGACY_BORDER_POINT_MISSING(ConnectionPoint connectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (connectionPoint.getConnectedStationSets().size() > 1 && connectionPoint.getLegacyBorderPointCode() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_102,
						 new Object[] { "LEGACY_BORDER_POINT_MISSING", getObjectLabel(connectionPoint, context) }, //$NON-NLS-1$
						 new Object[] { connectionPoint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the STATION_SET_AT_LEAST_ONE constraint of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnectionPoint_STATION_SET_AT_LEAST_ONE(ConnectionPoint connectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (connectionPoint.getConnectedStationSets() == null || connectionPoint.getConnectedStationSets().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_104,
						 new Object[] { "STATION_SET_AT_LEAST_ONE", getObjectLabel(connectionPoint, context) }, //$NON-NLS-1$
						 new Object[] { connectionPoint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NAME_UTF8_FORMAT constraint of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnectionPoint_NAME_UTF8_FORMAT(ConnectionPoint connectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		
		if (connectionPoint.getNameUtf8() == null || connectionPoint.getNameUtf8().length() == 0) return true;
		
		if (!StringFormatValidator.isStationUTF8(connectionPoint.getNameUtf8())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_106,
						 new Object[] { "NAME_UTF8_FORMAT", getObjectLabel(connectionPoint, context) }, //$NON-NLS-1$
						 new Object[] { connectionPoint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnectionPoint_NOT_REFERENCED(ConnectionPoint connectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		FareStructure fareData = GtmUtils.getFareStructure(connectionPoint);
		if ( (fareData == null) ||
			 ! (   GtmUtils.isReferenced(connectionPoint,fareData.getRegionalConstraints()) )  ) {
			if (diagnostics != null) {
				diagnostics.add
				(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 getObjectLabel(connectionPoint, context) + " " + NationalLanguageSupport.GtmValidator_Not_REFERENCED,
						 new Object[] { "NOT_REFERENCED", getObjectLabel(connectionPoint, context) }, //$NON-NLS-1$
						 new Object[] { connectionPoint },
						 context));				
				
			}
			return false;
		}
		return true;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationSet(StationSet stationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stationSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateStationSet_AT_LEAST_ONE(stationSet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Station Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStationSet_AT_LEAST_ONE(StationSet stationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (stationSet.getStations() != null && stationSet.getStations().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_108,
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(stationSet, context) }, //$NON-NLS-1$
						 new Object[] { stationSet },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrency(Currency currency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyPrice(CurrencyPrice currencyPrice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(currencyPrice, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validateCurrencyPrice_VAT_PLAUSIBILITY_CHECK(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validateCurrencyPrice_CURRENCY_MUST(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validateCurrencyPrice_AMOUNT_MUST(currencyPrice, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VAT_PLAUSIBILITY_CHECK constraint of '<em>Currency Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCurrencyPrice_VAT_PLAUSIBILITY_CHECK(CurrencyPrice currencyPrice, DiagnosticChain diagnostics, Map<Object, Object> context) {

		float sumVat = 0;
		for (VATDetail vat : currencyPrice.getVATdetails()) {
			sumVat = sumVat + vat.getAmount();
		}
		
		
		if (sumVat > currencyPrice.getAmount()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_6,
						 new Object[] { "VAT_PLAUSIBILITY_CHECK", getObjectLabel(currencyPrice, context) }, //$NON-NLS-1$
						 new Object[] { currencyPrice },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CURRENCY_MUST constraint of '<em>Currency Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCurrencyPrice_CURRENCY_MUST(CurrencyPrice currencyPrice, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (currencyPrice.getCurrency() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_112,
						 new Object[] { NationalLanguageSupport.GtmValidator_113, getObjectLabel(currencyPrice, context) },
						 new Object[] { currencyPrice },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AMOUNT_MUST constraint of '<em>Currency Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCurrencyPrice_AMOUNT_MUST(CurrencyPrice currencyPrice, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (currencyPrice.getCurrency().getIsoCode() == "EUR" &&  //$NON-NLS-1$
				currencyPrice.getAmount() > 10000	) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_115,
						 new Object[] { "AMOUNT_MUST", getObjectLabel(currencyPrice, context) }, //$NON-NLS-1$
						 new Object[] { currencyPrice },
						 context));
			}
			return false;
		}
		if (currencyPrice.getAmount() < 0	) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_117,
						 new Object[] { "AMOUNT_MUST", getObjectLabel(currencyPrice, context) }, //$NON-NLS-1$
						 new Object[] { currencyPrice },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguage(Language language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(language, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrice(Price price, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(price, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(price, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(price, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(price, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(price, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(price, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(price, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(price, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(price, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrice_AT_LEAST_ONE_PRICE(price, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_PRICE constraint of '<em>Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePrice_AT_LEAST_ONE_PRICE(Price price, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (price.getCurrencies() == null || price.getCurrencies().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_119,
						 new Object[] { "AT_LEAST_ONE_PRICE", getObjectLabel(price, context) }, //$NON-NLS-1$
						 new Object[] { price },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionCard(ReductionCard reductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reductionCard, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validateReductionCard_ISUER_MUST_FOR_NON_GENERIC(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validateReductionCard_NOT_REFERENCED(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validateReductionCard_CARD_ID_FORMAT(reductionCard, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ISUER_MUST_FOR_NON_GENERIC constraint of '<em>Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateReductionCard_ISUER_MUST_FOR_NON_GENERIC(ReductionCard reductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (reductionCard.getCardIssuer() == null && !reductionCard.isUicCode() && GenericReductionCards.getByName(reductionCard.getId()) == null ) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_121,
						 new Object[] { "ISUER_MUST_FOR_NON_GENERIC", getObjectLabel(reductionCard, context) }, //$NON-NLS-1$
						 new Object[] { reductionCard },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateReductionCard_NOT_REFERENCED(ReductionCard reductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		FareStructure fareData = GtmUtils.getFareStructure(reductionCard);
		if ( (fareData == null && ( reductionCard.isUicCode() || GenericReductionCards.getByName(reductionCard.getId()) == null)) ||
			 ! (   GtmUtils.isReferenced(reductionCard,fareData.getReductionCards())
			    || GtmUtils.isReferenced(reductionCard,fareData.getReductionConstraints())  )  ) {
			if (diagnostics != null) {
				diagnostics.add
				(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 getObjectLabel(reductionCard, context) + " " + NationalLanguageSupport.GtmValidator_Not_REFERENCED,
						 new Object[] { "NOT_REFERENCED", getObjectLabel(reductionCard, context) }, //$NON-NLS-1$
						 new Object[] { reductionCard },
						 context));
			}
			return false;
		}
		return true;

	}

	/**
	 * Validates the CARD_ID_FORMAT constraint of '<em>Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateReductionCard_CARD_ID_FORMAT(ReductionCard reductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (reductionCard.getId() == null) {
			if (diagnostics != null) {
				diagnostics.add
				(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Reduction Card Id is missing in: " + getObjectLabel(reductionCard, context),
						 new Object[] { "NOT_REFERENCED", getObjectLabel(reductionCard, context) }, //$NON-NLS-1$
						 new Object[] { reductionCard },
						 context));
			}
			return false;
		}
		if (GenericReductionCards.getByName(reductionCard.getId()) != null) {
			return true;
		}
		
		if (reductionCard.getCardIssuer() == null) {
				if (diagnostics != null) {
					diagnostics.add
					(createSimpleDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "Issuer is missing in: " + getObjectLabel(reductionCard, context),
							 new Object[] { "NOT_REFERENCED", getObjectLabel(reductionCard, context) }, //$NON-NLS-1$
							 new Object[] { reductionCard },
							 context));
				}
				return false;
			}
		
		
		if (reductionCard.getCardIssuer() != null && 
			!reductionCard.getId().startsWith(reductionCard.getCardIssuer().getCode())) {
			if (diagnostics != null) {
				diagnostics.add
				(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Reduction Card Id does not start with issuer (will be corrected in export): " + getObjectLabel(reductionCard, context),
						 new Object[] { "NOT_REFERENCED", getObjectLabel(reductionCard, context) }, //$NON-NLS-1$
						 new Object[] { reductionCard },
						 context));
			}
			return false;
		}

		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalConstraint(RegionalConstraint regionalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regionalConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalConstraint_AT_LEAST_ONE_REGIONAL_VALIDITY(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalConstraint_WARNING_DISTANCE_TOO_SHORT(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalConstraint_WARNING_DISTANCE_TOO_LONG(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalConstraint_NOT_REFERENCED(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalConstraint_NO_CLASS_SEPARATED_CONVERTABLE_FARES(regionalConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_REGIONAL_VALIDITY constraint of '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRegionalConstraint_AT_LEAST_ONE_REGIONAL_VALIDITY(RegionalConstraint regionalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (regionalConstraint.getRegionalValidity() == null || regionalConstraint.getRegionalValidity().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_123,
						 new Object[] { "AT_LEAST_ONE_REGIONAL_VALIDITY", getObjectLabel(regionalConstraint, context) }, //$NON-NLS-1$
						 new Object[] { regionalConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WARNING_DISTANCE_TOO_SHORT constraint of '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRegionalConstraint_WARNING_DISTANCE_TOO_SHORT(RegionalConstraint regionalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (regionalConstraint.getDistance() < 1) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_125,
						 new Object[] { "WARNING_DISTANCE_TOO_SHORT", getObjectLabel(regionalConstraint, context) }, //$NON-NLS-1$
						 new Object[] { regionalConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WARNING_DISTANCE_TOO_LONG constraint of '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRegionalConstraint_WARNING_DISTANCE_TOO_LONG(RegionalConstraint regionalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (regionalConstraint.getDistance() > 10000) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_127,
						 new Object[] { "WARNING_DISTANCE_TOO_LONG", getObjectLabel(regionalConstraint, context) }, //$NON-NLS-1$
						 new Object[] { regionalConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRegionalConstraint_NOT_REFERENCED(RegionalConstraint regionalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		FareStructure fareData = GtmUtils.getFareStructure(regionalConstraint);
		if ( (fareData == null) ||
			 ! (   GtmUtils.isReferenced(regionalConstraint,fareData.getFareElements())  )  ) {
			
			
			if (diagnostics != null) {
				diagnostics.add
				(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 getObjectLabel(regionalConstraint, context) + " " + NationalLanguageSupport.GtmValidator_Not_REFERENCED,
						 new Object[] { "NOT_REFERENCED", getObjectLabel(regionalConstraint, context) }, //$NON-NLS-1$
						 new Object[] { regionalConstraint },
						 context));				
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NO_CLASS_SEPARATED_CONVERTABLE_FARES constraint of '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRegionalConstraint_NO_CLASS_SEPARATED_CONVERTABLE_FARES(RegionalConstraint regionalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		
		FareElement wrongFare = null;
		
		for (FareElement fare : regionalConstraint.getLinkedFares()) {
			
			if (fare.getLegacyConversion().equals(LegacyConversionType.YES) || fare.getLegacyConversion().equals(LegacyConversionType.ONLY)  ) {
				
				//check for another fare with a different class and a different text
				
				for (FareElement fare2 : regionalConstraint.getLinkedFares()) {
					
					if ( (fare2.getLegacyConversion().equals(LegacyConversionType.YES) 
						  || fare2.getLegacyConversion().equals(LegacyConversionType.ONLY)  )
							
						&& fare2 != fare 
						&& fare2.getText() != fare.getText()
						&& fare2.getCarrierConstraint() == fare.getCarrierConstraint()
						&& fare2.getServiceClass() != fare.getServiceClass()) {
						
						wrongFare = fare;
						
					}
						
				}
				
			}
			
		}
		
		if (wrongFare != null) {
			
			if (diagnostics != null) {
				diagnostics.add
				(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Fare split with different fare names by class not allowed for convertable fares: " + getObjectLabel(regionalConstraint, context),
						 new Object[] { "NO_CLASS_SEPARATED_CONVERTABLE_FARE", getObjectLabel(regionalConstraint, context) }, //$NON-NLS-1$
						 new Object[] { regionalConstraint },
						 context));				
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationParameter(ReservationParameter reservationParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationParams9181(ReservationParams9181 reservationParams9181, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationParams9181, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationOptions(ReservationOptions reservationOptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationOptions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationPreferenceGroup(ReservationPreferenceGroup reservationPreferenceGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reservationPreferenceGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateReservationPreferenceGroup_AT_LEAST_ONE_PREFERENCE(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateReservationPreferenceGroup_GROUP_FORMAT(reservationPreferenceGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_PREFERENCE constraint of '<em>Reservation Preference Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateReservationPreferenceGroup_AT_LEAST_ONE_PREFERENCE(ReservationPreferenceGroup reservationPreferenceGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (reservationPreferenceGroup.getPreference() == null || reservationPreferenceGroup.getPreference().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_129,
						 new Object[] { "AT_LEAST_ONE_PREFERENCE", getObjectLabel(reservationPreferenceGroup, context) }, //$NON-NLS-1$
						 new Object[] { reservationPreferenceGroup },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the GROUP_FORMAT constraint of '<em>Reservation Preference Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateReservationPreferenceGroup_GROUP_FORMAT(ReservationPreferenceGroup reservationPreferenceGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!StringFormatValidator.isASCII(reservationPreferenceGroup.getGroup())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_131,
						 new Object[] { "GROUP_FORMAT", getObjectLabel(reservationPreferenceGroup, context) }, //$NON-NLS-1$
						 new Object[] { reservationPreferenceGroup },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceClass(ServiceClass serviceClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceClass_TEXT_MUST(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceClass_CLASSIC_CLASS_MUST(serviceClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TEXT_MUST constraint of '<em>Service Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateServiceClass_TEXT_MUST(ServiceClass serviceClass, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (serviceClass.getText() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_133,
						 new Object[] { "TEXT_MUST", getObjectLabel(serviceClass, context) }, //$NON-NLS-1$
						 new Object[] { serviceClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CLASSIC_CLASS_MUST constraint of '<em>Service Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateServiceClass_CLASSIC_CLASS_MUST(ServiceClass serviceClass, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (serviceClass.getClassicClass() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_135,
						 new Object[] { "CLASSIC_CLASS_MUST", getObjectLabel(serviceClass, context) },
						 new Object[] { serviceClass },
						 context));
			}
			return false;
		}
		
		if ( (serviceClass.getId() == ClassId.B && !(serviceClass.getClassicClass() == null || serviceClass.getClassicClass() == ClassicClassType.FIRST) )
				||
			 (serviceClass.getId() == ClassId.D && !(serviceClass.getClassicClass() == null || serviceClass.getClassicClass() == ClassicClassType.SECOND) )	
				){
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_ClassicClassNotMatching + " in " + getObjectLabel(serviceClass, context),
						 new Object[] { NationalLanguageSupport.GtmValidator_ClassicClassNotMatching, getObjectLabel(serviceClass, context) },
						 new Object[] { serviceClass },
						 context));
			}
			return false;
		}
		
		
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceLevel(ServiceLevel serviceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceLevel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceLevel_TEXT_MUST(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceLevel_ID_FORMAT(serviceLevel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TEXT_MUST constraint of '<em>Service Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateServiceLevel_TEXT_MUST(ServiceLevel serviceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (serviceLevel.getText() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_137,
						 new Object[] { "TEXT_MUST", getObjectLabel(serviceLevel, context) }, //$NON-NLS-1$
						 new Object[] { serviceLevel },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ID_FORMAT constraint of '<em>Service Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateServiceLevel_ID_FORMAT(ServiceLevel serviceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (serviceLevel.getId() == null || serviceLevel.getId().length() > 2 || !StringFormatValidator.isASCII(serviceLevel.getId())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_139,
						 new Object[] { "ID_FORMAT", getObjectLabel(serviceLevel, context) }, //$NON-NLS-1$
						 new Object[] { serviceLevel },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConstraint(ServiceConstraint serviceConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceConstraint_INCLUDE_OR_EXCLUDE(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceConstraint_LEGACY_CODE_RANGE(serviceConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the INCLUDE_OR_EXCLUDE constraint of '<em>Service Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateServiceConstraint_INCLUDE_OR_EXCLUDE(ServiceConstraint serviceConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (serviceConstraint.getExcludedServiceBrands() != null && 
			serviceConstraint.getIncludedServiceBrands() != null && 
			!serviceConstraint.getExcludedServiceBrands().isEmpty() &&
			!serviceConstraint.getIncludedServiceBrands().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createGtmDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Included and excluded service brands used at the same time in:" + " " + getObjectLabel(serviceConstraint, context),
						 new Object[] { getObjectLabel(serviceConstraint, context) },
						 new Object[] { serviceConstraint },
						 context));
			}
			return false;
		}
		
		if ( (serviceConstraint.getExcludedServiceBrands() == null || serviceConstraint.getExcludedServiceBrands().isEmpty()) &&
			 (serviceConstraint.getIncludedServiceBrands() == null || serviceConstraint.getIncludedServiceBrands().isEmpty()) ) {
			if (diagnostics != null) {
				diagnostics.add
					(createGtmDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Either included and excluded service brands must be provided in:" + " " + getObjectLabel(serviceConstraint, context),
						 new Object[] { getObjectLabel(serviceConstraint, context) },
						 new Object[] { serviceConstraint },
						 context));
			}
			return false;
		}		
		
		
		
		
		return true;
	}

	/**
	 * Validates the LEGACY_CODE_RANGE constraint of '<em>Service Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateServiceConstraint_LEGACY_CODE_RANGE(ServiceConstraint serviceConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (serviceConstraint.getLegacy108Code() > 99999 || serviceConstraint.getLegacy108Code() < 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createGtmDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Legacy Code invalid in:" + " " + getObjectLabel(serviceConstraint, context),
						 new Object[] { "NAME_FORMAT", getObjectLabel(serviceConstraint, context) }, //$NON-NLS-1$
						 new Object[] { serviceConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(station, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_NAME_FORMAT(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_NAME_CASE_UTF8_FORMAT(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_NAME_CASE_ASCII_FORMAT(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_SHORT_NAME_CASE_ASCII_FORMAT(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_SHORT_NAME_CASE_UTF8_FORMAT(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_TT_NAME_FORMAT(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_LATITUDE_VALUE_RANGE(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_LONGITUDE_VALUE_RANGE(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_COUNTRY_MUST(station, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NAME_FORMAT constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStation_NAME_FORMAT(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		//don't check missing data in MERITS for the time being
		if (station.getName() == null || station.getName().length() == 0) return true;

		if (!StringFormatValidator.isStationASCII(station.getName())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_141 + " " + getObjectLabel(station, context),
						 new Object[] { "NAME_FORMAT", getObjectLabel(station, context) }, //$NON-NLS-1$
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NAME_CASE_UTF8_FORMAT constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStation_NAME_CASE_UTF8_FORMAT(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {

		//don't check missing data in MERITS for the time being
		if (station.getNameCaseUTF8() == null || station.getNameCaseUTF8().length() == 0) return true;
		
		if (!StringFormatValidator.isStationUTF8(station.getNameCaseUTF8())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_143 + " " + getObjectLabel(station, context),
						 new Object[] { "NAME_CASE_UTF8_FORMAT", getObjectLabel(station, context) }, //$NON-NLS-1$
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NAME_CASE_ASCII_FORMAT constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStation_NAME_CASE_ASCII_FORMAT(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {

		//don't check missing data in MERITS for the time being
		if (station.getNameCaseASCII() == null || station.getNameCaseASCII().length() == 0) return true;
		
		if (!StringFormatValidator.isStationASCII(station.getNameCaseASCII())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_145 + " " + getObjectLabel(station, context),
						 new Object[] { "NAME_CASE_ASCII_FORMAT", getObjectLabel(station, context) }, //$NON-NLS-1$
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SHORT_NAME_CASE_ASCII_FORMAT constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStation_SHORT_NAME_CASE_ASCII_FORMAT(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		//don't check missing data in MERITS for the time being
		if (station.getShortNameCaseASCII() == null || station.getShortNameCaseASCII().length() == 0) return true;
		
		if (!StringFormatValidator.isStationASCII(station.getShortNameCaseASCII())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_147 + " " + getObjectLabel(station, context),
						 new Object[] { "SHORT_NAME_CASE_ASCII_FORMAT", getObjectLabel(station, context) }, //$NON-NLS-1$
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SHORT_NAME_CASE_UTF8_FORMAT constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */  
	public boolean validateStation_SHORT_NAME_CASE_UTF8_FORMAT(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		//don't check missing data in MERITS for the time being
		if (station.getShortNameCaseUTF8() == null || station.getShortNameCaseUTF8().length() == 0) return true;
		
		if (!StringFormatValidator.isStationUTF8(station.getShortNameCaseUTF8())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_149 + " " + getObjectLabel(station, context),
						 new Object[] { "SHORT_NAME_CASE_UTF8_FORMAT", getObjectLabel(station, context) }, //$NON-NLS-1$
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TT_NAME_FORMAT constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStation_TT_NAME_FORMAT(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {

	
		if (!StringFormatValidator.isStationUTF8(station.getName())) {		
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_151 + " " + getObjectLabel(station, context),
						 new Object[] { "TT_NAME_FORMAT", getObjectLabel(station, context) }, //$NON-NLS-1$
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LATITUDE_VALUE_RANGE constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStation_LATITUDE_VALUE_RANGE(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (station.getLatitude() > 180 || station.getLatitude() < -180) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_153,
						 new Object[] { "LATITUDE_VALUE_RANGE", getObjectLabel(station, context) }, //$NON-NLS-1$
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LONGITUDE_VALUE_RANGE constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStation_LONGITUDE_VALUE_RANGE(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (station.getLongitude() > 180 || station.getLongitude() < -180) {

			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_155,
						 new Object[] { "LONGITUDE_VALUE_RANGE", getObjectLabel(station, context) }, //$NON-NLS-1$
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the COUNTRY_MUST constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStation_COUNTRY_MUST(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (station.getCountry() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_157,
						 new Object[] { "COUNTRY_MUST", getObjectLabel(station, context) }, //$NON-NLS-1$
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationRelation(StationRelation stationRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stationRelation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelValidityConstraint(TravelValidityConstraint travelValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(travelValidityConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelValidityConstraint_TRAVEL_DAYS_NOT_NULL(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelValidityConstraint_WARNING_TRAVEL_DAYS_TOO_LONG(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelValidityConstraint_NOT_REFERENCED(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelValidityConstraint_TRAVEL_VALIDITY_TYPE_CONSTRAINT(travelValidityConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TRAVEL_DAYS_NOT_NULL constraint of '<em>Travel Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTravelValidityConstraint_TRAVEL_DAYS_NOT_NULL(TravelValidityConstraint travelValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		

		/*
		if (travelValidityConstraint.getTravelDays() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_159,
						 new Object[] { "TRAVEL_DAYS_NOT_NULL", getObjectLabel(travelValidityConstraint, context) }, //$NON-NLS-1$
						 new Object[] { travelValidityConstraint },
						 context));
			}
			return false;
		}
		*/
		return true;
	}

	/**
	 * Validates the WARNING_TRAVEL_DAYS_TOO_LONG constraint of '<em>Travel Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTravelValidityConstraint_WARNING_TRAVEL_DAYS_TOO_LONG(TravelValidityConstraint travelValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (travelValidityConstraint.getTravelDays() > 15) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_161,
						 new Object[] { "WARNING_TRAVEL_DAYS_TOO_LONG", getObjectLabel(travelValidityConstraint, context) }, //$NON-NLS-1$
						 new Object[] { travelValidityConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Travel Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTravelValidityConstraint_NOT_REFERENCED(TravelValidityConstraint travelValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		FareStructure fareData = GtmUtils.getFareStructure(travelValidityConstraint);
		if ( (fareData == null) ||
			 ! (   GtmUtils.isReferenced(travelValidityConstraint,fareData.getFareConstraintBundles())  )  ) {
			if (diagnostics != null) {
				diagnostics.add
				(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 getObjectLabel(travelValidityConstraint, context) + " " + NationalLanguageSupport.GtmValidator_Not_REFERENCED,
						 new Object[] { "NOT_REFERENCED", getObjectLabel(travelValidityConstraint, context) }, //$NON-NLS-1$
						 new Object[] {  travelValidityConstraint },
						 context));					

			}
			return false;
		}
		return true;

	}

	/**
	 * Validates the TRAVEL_VALIDITY_TYPE_CONSTRAINT constraint of '<em>Travel Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * allocation constraints are not allowed for single trip fares
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTravelValidityConstraint_TRAVEL_VALIDITY_TYPE_CONSTRAINT(TravelValidityConstraint travelValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (travelValidityConstraint.getValidityType() == TravelValidityType.SINGLE_TRIP &&
				travelValidityConstraint.getTripAllocationConstraint() != null	) {
			if (diagnostics != null) {
				diagnostics.add
				(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Single-Trip Fares must not define a trip allocation constraint: " + getObjectLabel(travelValidityConstraint, context),
						 new Object[] { "TRAVEL_VALIDITY_TYPE_CONSTRAINT", getObjectLabel(travelValidityConstraint, context) }, //$NON-NLS-1$
						 new Object[] {  travelValidityConstraint },
						 context));					
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrainValidity(TrainValidity trainValidity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trainValidity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrainValidity_TRAIN_VALIDITY_REQUIRED_CONTENT(trainValidity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TRAIN_VALIDITY_REQUIRED_CONTENT constraint of '<em>Train Validity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTrainValidity_TRAIN_VALIDITY_REQUIRED_CONTENT(TrainValidity trainValidity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if ( trainValidity.getCarrierConstraint() == null  ) {
				if (diagnostics != null) {
					diagnostics.add
					(createSimpleDiagnostic
							(Diagnostic.WARNING,
							 DIAGNOSTIC_SOURCE,
							 0,
							 getObjectLabel(trainValidity, context) + " Carrier Constraint is missing" ,
							 new Object[] { "TRAIN_VALIDITY_REQUIRED_CONTENT", getObjectLabel(trainValidity, context) }, //$NON-NLS-1$
							 new Object[] {  trainValidity},
							 context));					
				}
				return false;
		}		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(text, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateText_FORMAT_TEXT(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateText_FORMAT_TEXT_SHORT(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateText_FORMAT_TEXT_UTF8(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateText_FORMAT_TEXT_SHORT_UTF8(text, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FORMAT_TEXT constraint of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateText_FORMAT_TEXT(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (!StringFormatValidator.isASCII(text.getTextICAO())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_163,
						 new Object[] { "FORMAT_TEXT", getObjectLabel(text, context) }, //$NON-NLS-1$
						 new Object[] { text },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FORMAT_TEXT_SHORT constraint of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateText_FORMAT_TEXT_SHORT(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		if (text.getShortTextICAO() == null || text.getShortTextICAO().length() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Short text is missing in: " + getObjectLabel(text, context),
						 new Object[] { "FORMAT_TEXT_SHORT", getObjectLabel(text, context) }, //$NON-NLS-1$
						 new Object[] { text },
						 context));
			}
			return false;
		}			
		
		if (!StringFormatValidator.isASCII(text.getShortTextICAO())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_165,
						 new Object[] { "FORMAT_TEXT_SHORT", getObjectLabel(text, context) }, //$NON-NLS-1$
						 new Object[] { text },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FORMAT_TEXT_UTF8 constraint of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateText_FORMAT_TEXT_UTF8(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (text.getTextUTF8() == null || text.getTextUTF8().length() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "UTF-8 text is missing in: " + getObjectLabel(text, context),
						 new Object[] { "FORMAT_TEXT_SHORT", getObjectLabel(text, context) }, //$NON-NLS-1$
						 new Object[] { text },
						 context));
			}
			return false;
		}	
		
		if (!StringFormatValidator.isUTF8(text.getTextUTF8())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_167,
						 new Object[] { "FORMAT_TEXT_UTF8", getObjectLabel(text, context) }, //$NON-NLS-1$
						 new Object[] { text },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FORMAT_TEXT_SHORT_UTF8 constraint of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateText_FORMAT_TEXT_SHORT_UTF8(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (text.getShortTextUTF8() == null || text.getShortTextUTF8().length() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Short UTF-8 text is missing in: " + getObjectLabel(text, context),
						 new Object[] { "FORMAT_TEXT_SHORT", getObjectLabel(text, context) }, //$NON-NLS-1$
						 new Object[] { text },
						 context));
			}
			return false;
		}			
		
		if (!StringFormatValidator.isUTF8(text.getShortTextUTF8())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_169,
						 new Object[] { "FORMAT_TEXT_SHORT_UTF8", getObjectLabel(text, context) }, //$NON-NLS-1$
						 new Object[] { text },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslation(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(translation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTranslation_LANGUAGE_MUST(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTranslation_FORMAT_TEXT(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTranslation_FORMAT_TEXT_SHORT(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTranslation_FORMAT_TEXT_UTF8(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTranslation_FORMAT_TEXT_SHORT_UTF8(translation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the LANGUAGE_MUST constraint of '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTranslation_LANGUAGE_MUST(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (translation.getLanguage() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_171,
						 new Object[] { "LANGUAGE_MUST", getObjectLabel(translation, context) }, //$NON-NLS-1$
						 new Object[] { translation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FORMAT_TEXT constraint of '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTranslation_FORMAT_TEXT(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (translation.getTextICAO() == null || translation.getTextICAO().length() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Text is missing in: " + getObjectLabel(translation, context),
						 new Object[] { "FORMAT_TEXT_SHORT", getObjectLabel(translation, context) }, //$NON-NLS-1$
						 new Object[] { translation },
						 context));
			}
			return false;
		}			
		
		if (!StringFormatValidator.isASCII(translation.getTextICAO())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_173,
						 new Object[] { "FORMAT_TEXT", getObjectLabel(translation, context) }, //$NON-NLS-1$
						 new Object[] { translation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FORMAT_TEXT_SHORT constraint of '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTranslation_FORMAT_TEXT_SHORT(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (translation.getShortTextICAO() == null || translation.getShortTextICAO().length() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Short text is missing in: " + getObjectLabel(translation, context),
						 new Object[] { "FORMAT_TEXT_SHORT", getObjectLabel(translation, context) }, //$NON-NLS-1$
						 new Object[] { translation },
						 context));
			}
			return false;
		}	
		
		if (!StringFormatValidator.isASCII(translation.getShortTextICAO())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_175,
						 new Object[] { "FORMAT_TEXT_SHORT", getObjectLabel(translation, context) }, //$NON-NLS-1$
						 new Object[] { translation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FORMAT_TEXT_UTF8 constraint of '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTranslation_FORMAT_TEXT_UTF8(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (translation.getTextUTF8() == null || translation.getTextUTF8().length() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Text UTF-8 is missing in: " + getObjectLabel(translation, context),
						 new Object[] { "FORMAT_TEXT_SHORT", getObjectLabel(translation, context) }, //$NON-NLS-1$
						 new Object[] { translation },
						 context));
			}
			return false;
		}	
		
		
		if (!StringFormatValidator.isUTF8(translation.getTextUTF8())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_177,
						 new Object[] { "FORMAT_TEXT_UTF8", getObjectLabel(translation, context) }, //$NON-NLS-1$
						 new Object[] { translation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FORMAT_TEXT_SHORT_UTF8 constraint of '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */ 
	public boolean validateTranslation_FORMAT_TEXT_SHORT_UTF8(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (translation.getShortTextUTF8() == null || translation.getShortTextUTF8().length() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Short text UTF-8 is missing in: " + getObjectLabel(translation, context),
						 new Object[] { "FORMAT_TEXT_SHORT", getObjectLabel(translation, context) }, //$NON-NLS-1$
						 new Object[] { translation },
						 context));
			}
			return false;
		}			
		
		if (!StringFormatValidator.isUTF8(translation.getShortTextUTF8())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_179,
						 new Object[] { "FORMAT_TEXT_SHORT_UTF8", getObjectLabel(translation, context) }, //$NON-NLS-1$
						 new Object[] { translation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVATDetail(VATDetail vatDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vatDetail, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validateVATDetail_VALID_AMOUNT(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validateVATDetail_COUNTRY_MUST(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validateVATDetail_PERCENTAGE_VALUES(vatDetail, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VALID_AMOUNT constraint of '<em>VAT Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateVATDetail_VALID_AMOUNT(VATDetail vatDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (vatDetail.getAmount() < 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_181,
						 new Object[] { "VALID_AMOUNT", getObjectLabel(vatDetail, context) }, //$NON-NLS-1$
						 new Object[] { vatDetail },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the COUNTRY_MUST constraint of '<em>VAT Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateVATDetail_COUNTRY_MUST(VATDetail vatDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (vatDetail.getCountry() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_183,
						 new Object[] { "COUNTRY_MUST", getObjectLabel(vatDetail, context) }, //$NON-NLS-1$
						 new Object[] { vatDetail },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the PERCENTAGE_VALUES constraint of '<em>VAT Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateVATDetail_PERCENTAGE_VALUES(VATDetail vatDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (vatDetail.getPercentage() < 0 || vatDetail.getPercentage() > 99) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_185,
						 new Object[] { "PERCENTAGE_VALUES", getObjectLabel(vatDetail, context) }, //$NON-NLS-1$
						 new Object[] { vatDetail },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareElement(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fareElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_TYPE_MUST(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_PRICE_MUST(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_TEXT_MUST(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_SERVICE_CLASS_MUST(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_PASSENGER_CONSTRAINT_MUST(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_LEGACY_ACCOUNTING_MISSING(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_CONVERSION_MISSING(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_BUNDLE_MUST(fareElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TYPE_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareElement_TYPE_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareElement.getType() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_187,
						 new Object[] { "TYPE_MUST", getObjectLabel(fareElement, context) }, //$NON-NLS-1$
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the PRICE_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareElement_PRICE_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareElement.getPrice() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_189,
						 new Object[] { "PRICE_MUST", getObjectLabel(fareElement, context) }, //$NON-NLS-1$
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TEXT_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareElement_TEXT_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareElement.getText() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_191,
						 new Object[] { "TEXT_MUST", getObjectLabel(fareElement, context) }, //$NON-NLS-1$
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SERVICE_CLASS_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareElement_SERVICE_CLASS_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareElement.getServiceClass() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_193,
						 new Object[] { "SERVICE_CLASS_MUST", getObjectLabel(fareElement, context) }, //$NON-NLS-1$
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SALES_AVAILABILITY_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareElement_SALES_AVAILABILITY_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareElement.getSalesAvailability() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_195,
						 new Object[] { "SALES_AVAILABILITY_MUST", getObjectLabel(fareElement, context) }, //$NON-NLS-1$
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TRAVEL_VALIDITY_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareElement_TRAVEL_VALIDITY_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareElement.getTravelValidity() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_197,
						 new Object[] { "TRAVEL_VALIDITY_MUST", getObjectLabel(fareElement, context) }, //$NON-NLS-1$
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the COMBINATION_CONSTRAINT_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareElement_COMBINATION_CONSTRAINT_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareElement.getCombinationConstraint() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_199,
						 new Object[] { "COMBINATION_CONSTRAINT_MUST", getObjectLabel(fareElement, context) }, //$NON-NLS-1$
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FULFILLMENT_CONSTRAINT_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareElement_FULFILLMENT_CONSTRAINT_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareElement.getFulfillmentConstraint() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_201,
						 new Object[] { "FULFILLMENT_CONSTRAINT_MUST", getObjectLabel(fareElement, context) }, //$NON-NLS-1$
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the PASSENGER_CONSTRAINT_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareElement_PASSENGER_CONSTRAINT_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareElement.getPassengerConstraint() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_203,
						 new Object[] { "PASSENGER_CONSTRAINT_MUST", getObjectLabel(fareElement, context) }, //$NON-NLS-1$
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LEGACY_ACCOUNTING_MISSING constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareElement_LEGACY_ACCOUNTING_MISSING(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareElement.getLegacyAccountingIdentifier() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_205,
						 new Object[] { "LEGACY_ACCOUNTING_MISSING", getObjectLabel(fareElement, context) }, //$NON-NLS-1$
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CE�NVERSION_MISSING constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareElement_CONVERSION_MISSING(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareElement.getLegacyConversion() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_207,
						 new Object[] { "CE�NVERSION_MISSING", getObjectLabel(fareElement, context) }, //$NON-NLS-1$
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the BUNDLE_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareElement_BUNDLE_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareElement.getFareConstraintBundle() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_FareMustContainBundle,
						 new Object[] { "BUNDLE_MUST", getObjectLabel(fareElement, context) }, //$NON-NLS-1$
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTotalPassengerCombinationConstraints(TotalPassengerCombinationConstraints totalPassengerCombinationConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(totalPassengerCombinationConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTotalPassengerCombinationConstraint(TotalPassengerCombinationConstraint totalPassengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(totalPassengerCombinationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTotalPassengerCombinationConstraint_MIN_MAX_MUST(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTotalPassengerCombinationConstraint_NOT_REFERENCED(totalPassengerCombinationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MIN_MAX_MUST constraint of '<em>Total Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTotalPassengerCombinationConstraint_MIN_MAX_MUST(TotalPassengerCombinationConstraint totalPassengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (totalPassengerCombinationConstraint.getMaxTotalPassengerWeight() == 0 && totalPassengerCombinationConstraint.getMinTotalPassengerWeight() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_PassengerCombination,
						 new Object[] { "MIN_MAX_MUST", getObjectLabel(totalPassengerCombinationConstraint, context) }, //$NON-NLS-1$
						 new Object[] { totalPassengerCombinationConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Total Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTotalPassengerCombinationConstraint_NOT_REFERENCED(TotalPassengerCombinationConstraint totalPassengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		FareStructure fareData = GtmUtils.getFareStructure(totalPassengerCombinationConstraint);
		if ( (fareData == null) ||
			 ! (   GtmUtils.isReferenced(totalPassengerCombinationConstraint,fareData.getFareConstraintBundles()))  ) {
			if (diagnostics != null) {
				diagnostics.add
				(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 getObjectLabel(totalPassengerCombinationConstraint, context) + " " + NationalLanguageSupport.GtmValidator_Not_REFERENCED,
						 new Object[] { "NOT_REFERENCED", getObjectLabel(totalPassengerCombinationConstraint, context) }, //$NON-NLS-1$
						 new Object[] {  totalPassengerCombinationConstraint },
						 context));	
			}
			return false;
		}
		return true;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareConstraintBundles(FareConstraintBundles fareConstraintBundles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareConstraintBundles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareConstraintBundle(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fareConstraintBundle, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareConstraintBundle_SALES_AVAILABILITY_MUST(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareConstraintBundle_TRAVEL_VALIDITY_MUST(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareConstraintBundle_FULFILLMENT_CONSTRAINT_MUST(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareConstraintBundle_COMBINATION_CONSTRAINT_MUST(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareConstraintBundle_TOTAL_PASSENGER_CONSTRAINT_WARNING(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareConstraintBundle_NOT_REFERENCED(fareConstraintBundle, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SALES_AVAILABILITY_MUST constraint of '<em>Fare Constraint Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareConstraintBundle_SALES_AVAILABILITY_MUST(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareConstraintBundle.getSalesAvailability() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_BundleSalesAvailability,
						 new Object[] { "SALES_AVAILABILITY_MUST", getObjectLabel(fareConstraintBundle, context) }, //$NON-NLS-1$
						 new Object[] { fareConstraintBundle },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TRAVEL_VALIDITY_MUST constraint of '<em>Fare Constraint Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareConstraintBundle_TRAVEL_VALIDITY_MUST(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareConstraintBundle.getTravelValidity() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_BundleTravelValidity,
						 new Object[] { "TRAVEL_VALIDITY_MUST", getObjectLabel(fareConstraintBundle, context) }, //$NON-NLS-1$
						 new Object[] { fareConstraintBundle },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FULFILLMENT_CONSTRAINT_MUST constraint of '<em>Fare Constraint Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareConstraintBundle_FULFILLMENT_CONSTRAINT_MUST(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareConstraintBundle.getFulfillmentConstraint() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_BundleFulfillmentConstraint,
						 new Object[] { "FULFILLMENT_CONSTRAINT_MUST", getObjectLabel(fareConstraintBundle, context) }, //$NON-NLS-1$
						 new Object[] { fareConstraintBundle },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the COMBINATION_CONSTRAINT_MUST constraint of '<em>Fare Constraint Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareConstraintBundle_COMBINATION_CONSTRAINT_MUST(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareConstraintBundle.getCombinationConstraint() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_BundleCombinationConstraint,
						 new Object[] { "COMBINATION_CONSTRAINT_MUST", getObjectLabel(fareConstraintBundle, context) }, //$NON-NLS-1$
						 new Object[] { fareConstraintBundle },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TOTAL_PASSENGER_CONSTRAINT_WARNING constraint of '<em>Fare Constraint Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareConstraintBundle_TOTAL_PASSENGER_CONSTRAINT_WARNING(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareConstraintBundle.getTotalPassengerConstraint() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_BundleTotalPassengersConstraint,
						 new Object[] { "TOTAL_PASSENGER_CONSTRAINT_WARNING", getObjectLabel(fareConstraintBundle, context) }, //$NON-NLS-1$
						 new Object[] { fareConstraintBundle },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Fare Constraint Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareConstraintBundle_NOT_REFERENCED(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		FareStructure fareData = GtmUtils.getFareStructure(fareConstraintBundle);
		if ( (fareData == null) ||
			 ! (   GtmUtils.isReferenced(fareConstraintBundle,fareData.getFareElements()) )  ) {
			if (diagnostics != null) {
				diagnostics.add
			        (createSimpleDiagnostic
				        (Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 getObjectLabel(fareConstraintBundle, context) + " " + NationalLanguageSupport.GtmValidator_Not_REFERENCED,
						 new Object[] { "NOT_REFERENCED", getObjectLabel(fareConstraintBundle, context) }, //$NON-NLS-1$
						 new Object[] {  fareConstraintBundle },
						 context));					
			}
			return false;
		}
		return true;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStationSetDefinitions(FareStationSetDefinitions fareStationSetDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareStationSetDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStationSetDefinition(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fareStationSetDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareStationSetDefinition_AT_LEAST_ONE_STATION(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareStationSetDefinition_LEGACY_CODE_MISSING(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareStationSetDefinition_CARRIER_MUST(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareStationSetDefinition_CODE_MUST(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareStationSetDefinition_NAME_FORMAT(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareStationSetDefinition_NAME_UTF8_FORMAT(fareStationSetDefinition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_STATION constraint of '<em>Fare Station Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareStationSetDefinition_AT_LEAST_ONE_STATION(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareStationSetDefinition.getStations() == null || fareStationSetDefinition.getStations().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_209,
						 new Object[] { "AT_LEAST_ONE_STATION", getObjectLabel(fareStationSetDefinition, context) }, //$NON-NLS-1$
						 new Object[] { fareStationSetDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LEGACY_CODE_MISSING constraint of '<em>Fare Station Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public boolean validateFareStationSetDefinition_LEGACY_CODE_MISSING(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareStationSetDefinition.getLegacyCode() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_211,
						 new Object[] { "LEGACY_CODE_MISSING", getObjectLabel(fareStationSetDefinition, context) }, //$NON-NLS-1$
						 new Object[] { fareStationSetDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CARRIER_MUST constraint of '<em>Fare Station Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareStationSetDefinition_CARRIER_MUST(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareStationSetDefinition.getCarrier() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_213,
						 new Object[] { "CARRIER_MUST", getObjectLabel(fareStationSetDefinition, context) },
						 new Object[] { fareStationSetDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CODE_MUST constraint of '<em>Fare Station Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareStationSetDefinition_CODE_MUST(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (fareStationSetDefinition.getCode() == null || fareStationSetDefinition.getCode().length() < 1) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_215,
						 new Object[] { "CODE_MUST", getObjectLabel(fareStationSetDefinition, context) }, //$NON-NLS-1$
						 new Object[] { fareStationSetDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NAME_FORMAT constraint of '<em>Fare Station Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareStationSetDefinition_NAME_FORMAT(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		boolean result = true;
		
		if (fareStationSetDefinition.getName() == null || fareStationSetDefinition.getName().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Name is missing in " +  getObjectLabel(fareStationSetDefinition, context), 
						 new Object[] { "NAME_FORMAT", getObjectLabel(fareStationSetDefinition, context) }, //$NON-NLS-1$
						 new Object[] { fareStationSetDefinition },
						 context));
			}
			result = false;
		}
		
		
		if (fareStationSetDefinition.getName() != null && !StringFormatValidator.isStationASCII(fareStationSetDefinition.getName())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_217 + " in " +  getObjectLabel(fareStationSetDefinition, context), 
						 new Object[] { "NAME_FORMAT", getObjectLabel(fareStationSetDefinition, context) }, //$NON-NLS-1$
						 new Object[] { fareStationSetDefinition },
						 context));
			}
			result = false;
		}
		
		return result;
	}

	/**
	 * Validates the NAME_UTF8_FORMAT constraint of '<em>Fare Station Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareStationSetDefinition_NAME_UTF8_FORMAT(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!StringFormatValidator.isUTF8(fareStationSetDefinition.getNameUtf8())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_219 + " in " +  getObjectLabel(fareStationSetDefinition, context), 
						 new Object[] { "NAME_UTF8_FORMAT", getObjectLabel(fareStationSetDefinition, context) }, //$NON-NLS-1$
						 new Object[] { fareStationSetDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyAccountingIdentifier(LegacyAccountingIdentifier legacyAccountingIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(legacyAccountingIdentifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyAccountingIdentifier_SERIES_ID_MUST(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyAccountingIdentifier_TARIFF_ID_MUST(legacyAccountingIdentifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SERIES_ID_MUST constraint of '<em>Legacy Accounting Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacyAccountingIdentifier_SERIES_ID_MUST(LegacyAccountingIdentifier legacyAccountingIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (legacyAccountingIdentifier.eContainer() instanceof FareTemplate) {
			//validate fares only
			return true;
		}
		
		
		if (legacyAccountingIdentifier.getSeriesId() < 1 || legacyAccountingIdentifier.getSeriesId() > 99999 ) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_221 + " in " +  getObjectLabel(legacyAccountingIdentifier, context), 
						 new Object[] { "SERIES_ID_MUST", getObjectLabel(legacyAccountingIdentifier, context) }, //$NON-NLS-1$
						 new Object[] { legacyAccountingIdentifier },
						 context));
			}
			return false;
		}
		
		return true;
	}

	/**
	 * Validates the TARIFF_ID_MUST constraint of '<em>Legacy Accounting Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacyAccountingIdentifier_TARIFF_ID_MUST(LegacyAccountingIdentifier legacyAccountingIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (legacyAccountingIdentifier.getTariffId() < 1 || legacyAccountingIdentifier.getTariffId() > 99999 ) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_223  + " in " +  getObjectLabel(legacyAccountingIdentifier, context), 
						 new Object[] { "TARIFF_ID_MUST", getObjectLabel(legacyAccountingIdentifier, context) }, //$NON-NLS-1$
						 new Object[] { legacyAccountingIdentifier },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceBrand(ServiceBrand serviceBrand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceBrand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesAvailabilityConstraint(SalesAvailabilityConstraint salesAvailabilityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(salesAvailabilityConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateSalesAvailabilityConstraint_AT_LEAST_ONE(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateSalesAvailabilityConstraint_NOT_REFERENCED(salesAvailabilityConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Sales Availability Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSalesAvailabilityConstraint_AT_LEAST_ONE(SalesAvailabilityConstraint salesAvailabilityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (salesAvailabilityConstraint.getRestrictions() == null || salesAvailabilityConstraint.getRestrictions().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_225  + " in " +  getObjectLabel(salesAvailabilityConstraint, context), 
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(salesAvailabilityConstraint, context) }, //$NON-NLS-1$
						 new Object[] { salesAvailabilityConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Sales Availability Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSalesAvailabilityConstraint_NOT_REFERENCED(SalesAvailabilityConstraint salesAvailabilityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		FareStructure fareData = GtmUtils.getFareStructure(salesAvailabilityConstraint);
		if ( (fareData == null) ||
			 ! (   GtmUtils.isReferenced(salesAvailabilityConstraint,fareData.getFareConstraintBundles()) )  ) {
			if (diagnostics != null) {
				diagnostics.add
		        (createSimpleDiagnostic
				        (Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 getObjectLabel(salesAvailabilityConstraint, context) + " " + NationalLanguageSupport.GtmValidator_Not_REFERENCED,
						 new Object[] { "NOT_REFERENCED", getObjectLabel(salesAvailabilityConstraint, context) }, //$NON-NLS-1$
						 new Object[] {  salesAvailabilityConstraint },
						 context));					
			}
			return false;
		}
		return true;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesRestriction(SalesRestriction salesRestriction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(salesRestriction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validateSalesRestriction_START_END_DATE_ORDER(salesRestriction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the START_END_DATE_ORDER constraint of '<em>Sales Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSalesRestriction_START_END_DATE_ORDER(SalesRestriction salesRestriction, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (salesRestriction.getStartOfSale() == null || salesRestriction.getEndOfSale() == null ) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_227  + " in " +  getObjectLabel(salesRestriction, context), 
						 new Object[] { "START_END_DATE_ORDER", getObjectLabel(salesRestriction, context) }, //$NON-NLS-1$
						 new Object[] { salesRestriction },
						 context));
			}
			return false;
		}
		
		/*
		 * no ordering of relative dates to be checked
		if (salesRestriction.getStartOfSale().getUnit() == salesRestriction.getEndOfSale().getUnit() &&
			salesRestriction.getStartOfSale().getReference() == salesRestriction.getEndOfSale().getReference() &&	
			(salesRestriction.getStartOfSale().getReference() == TimeReferenceType.AFTER_DEPARTURE ||
			salesRestriction.getStartOfSale().getReference() == TimeReferenceType.AFTER_END_VALIDITY )&&
			salesRestriction.getStartOfSale().getValue() > salesRestriction.getEndOfSale().getValue()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_229  + " in " +  getObjectLabel(salesRestriction, context), 
						 new Object[] { "START_END_DATE_ORDER", getObjectLabel(salesRestriction, context) }, //$NON-NLS-1$
						 new Object[] { salesRestriction },
						 context));
			}
			return false;
		}
		
		if (salesRestriction.getStartOfSale().getUnit() == salesRestriction.getEndOfSale().getUnit() &&
				salesRestriction.getStartOfSale().getReference() == salesRestriction.getEndOfSale().getReference() &&	
				(salesRestriction.getStartOfSale().getReference() == TimeReferenceType.BEFORE_DEPARTURE ||
				salesRestriction.getStartOfSale().getReference() == TimeReferenceType.BEFORE_START_VALIDITY )&&
				salesRestriction.getStartOfSale().getValue() < salesRestriction.getEndOfSale().getValue()) {
				if (diagnostics != null) {
					diagnostics.add
						(createSimpleDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 NationalLanguageSupport.GtmValidator_229  + " in " +  getObjectLabel(salesRestriction, context), 
							 new Object[] { "START_END_DATE_ORDER", getObjectLabel(salesRestriction, context) }, //$NON-NLS-1$
							 new Object[] { salesRestriction },
							 context));
				}
				return false;
			}
		*/
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndOfSale(EndOfSale endOfSale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(endOfSale, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_LONG(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_SHORT(endOfSale, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartOfSale(StartOfSale startOfSale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(startOfSale, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_LONG(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_SHORT(startOfSale, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationConstraint(CombinationConstraint combinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(combinationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinationConstraint_AT_LEAST_ONE(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinationConstraint_NOT_REFERENCED(combinationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCombinationConstraint_AT_LEAST_ONE(CombinationConstraint combinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (combinationConstraint.getCombinationModels() == null || combinationConstraint.getCombinationModels().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_231  + " in " +  getObjectLabel(combinationConstraint, context), 
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(combinationConstraint, context) }, //$NON-NLS-1$
						 new Object[] { combinationConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCombinationConstraint_NOT_REFERENCED(CombinationConstraint combinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		FareStructure fareData = GtmUtils.getFareStructure(combinationConstraint);
		if ( (fareData == null) ||
			 ! (   GtmUtils.isReferenced(combinationConstraint,fareData.getFareConstraintBundles())  )  ) {
			if (diagnostics != null) {
				diagnostics.add
		        (createSimpleDiagnostic
				        (Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 getObjectLabel(combinationConstraint, context) + " " + NationalLanguageSupport.GtmValidator_Not_REFERENCED,
						 new Object[] { "NOT_REFERENCED", getObjectLabel(combinationConstraint, context) }, //$NON-NLS-1$
						 new Object[] {  combinationConstraint },
						 context));					
			}
			return false;
		}
		return true;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidityRange(ValidityRange validityRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(validityRange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateValidityRange_WARNING_TOO_LONG(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateValidityRange_WARNING_TOO_SHORT(validityRange, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WARNING_TOO_LONG constraint of '<em>Validity Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateValidityRange_WARNING_TOO_LONG(ValidityRange validityRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		if (validityRange.getUnit() == null) {

			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_233  + " in " +  getObjectLabel(validityRange, context), 
						 new Object[] { "WARNING_TOO_SHORT", getObjectLabel(validityRange, context) }, //$NON-NLS-1$
						 new Object[] { validityRange },
						 context));
			}
			return false;
	}

	
	if ((validityRange.getValue() < 1) ) {

		if (diagnostics != null) {
			diagnostics.add
				(createSimpleDiagnostic
					(Diagnostic.ERROR,
					 DIAGNOSTIC_SOURCE,
					 0,
					 NationalLanguageSupport.GtmValidator_235  + " in " +  getObjectLabel(validityRange, context), 
					 new Object[] { "WARNING_TOO_SHORT", getObjectLabel(validityRange, context) }, //$NON-NLS-1$
					 new Object[] { validityRange },
					 context));
		}
		return false;
	}
		return true;
	}

	/**
	 * Validates the WARNING_TOO_SHORT constraint of '<em>Validity Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateValidityRange_WARNING_TOO_SHORT(ValidityRange validityRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		if (validityRange.getUnit() == null) {

				if (diagnostics != null) {
					diagnostics.add
						(createSimpleDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 NationalLanguageSupport.GtmValidator_237  + " in " +  getObjectLabel(validityRange, context), 
							 new Object[] { "WARNING_TOO_SHORT", getObjectLabel(validityRange, context) }, //$NON-NLS-1$
							 new Object[] { validityRange },
							 context));
				}
				return false;
		}

		
		if ((validityRange.getUnit() == TimeUnit.DAY && validityRange.getValue() > 700) || 
			(validityRange.getUnit() == TimeUnit.HOUR && validityRange.getValue() > 16800) ||
			(validityRange.getUnit() == TimeUnit.MINUTE && validityRange.getValue() > 1008000)) {

			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_239  + " in " +  getObjectLabel(validityRange, context), 
						 new Object[] { "WARNING_TOO_SHORT", getObjectLabel(validityRange, context) }, //$NON-NLS-1$
						 new Object[] { validityRange },
						 context));
			}
			return false;
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeRange(TimeRange timeRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeRange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeRange_FROM_TO_ORDER(timeRange, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FROM_TO_ORDER constraint of '<em>Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTimeRange_FROM_TO_ORDER(TimeRange timeRange, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (timeRange.getFrom() >= timeRange.getUntil()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_241  + " in " +  getObjectLabel(timeRange, context), 
						 new Object[] { "FROM_TO_ORDER", getObjectLabel(timeRange, context) }, //$NON-NLS-1$
						 new Object[] { timeRange },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExcludedTimeRange(ExcludedTimeRange excludedTimeRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(excludedTimeRange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeRange_FROM_TO_ORDER(excludedTimeRange, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnValidityConstraint(ReturnValidityConstraint returnValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(returnValidityConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateReturnValidityConstraint_EARLIEST_LAST_RETURN_ORDER(returnValidityConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EARLIEST_LAST_RETURN_ORDER constraint of '<em>Return Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateReturnValidityConstraint_EARLIEST_LAST_RETURN_ORDER(ReturnValidityConstraint returnValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (returnValidityConstraint.getEarliestReturn() < 0 || returnValidityConstraint.getEarliestReturn() > returnValidityConstraint.getLatestReturn() || returnValidityConstraint.getLatestReturn() < 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_243  + " in " +  getObjectLabel(returnValidityConstraint, context), 
						 new Object[] { "EARLIEST_LAST_RETURN_ORDER", getObjectLabel(returnValidityConstraint, context) }, //$NON-NLS-1$
						 new Object[] { returnValidityConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTripAllocationConstraint(TripAllocationConstraint tripAllocationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tripAllocationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTripAllocationConstraint_DURATION_FORMAT(tripAllocationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DURATION_FORMAT constraint of '<em>Trip Allocation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTripAllocationConstraint_DURATION_FORMAT(TripAllocationConstraint o, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (o.getDurationUnit() == null || o.getDurationUnit().length() == 0) return true;
		
		boolean ok = false;
		
		Duration d = null;
		
		try {
			d = Duration.parse(o.getDurationUnit());
			if (d != null) ok = true;
		} catch (Exception e ) {
			ok = false;
		}
		
		if (!ok) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Duration format " + o.getDurationUnit() + " not ISO compliant in " +  getObjectLabel(o, context), 
						 new Object[] { "DURATION_FORMAT", getObjectLabel(o, context) }, //$NON-NLS-1$
						 new Object[] { o },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTripInterruptionConstraint(TripInterruptionConstraint tripInterruptionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tripInterruptionConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTripInterruptionConstraint_DURATION_FORMAT(tripInterruptionConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DURATION_FORMAT constraint of '<em>Trip Interruption Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTripInterruptionConstraint_DURATION_FORMAT(TripInterruptionConstraint o, DiagnosticChain diagnostics, Map<Object, Object> context) {

		boolean failed = false;
		
		if (o.getMaxDuration() != null &&
			o.getMaxDuration().length() > 0)  {
		
			boolean ok = false;
		
			Duration d = null;
		
			try {
				d = Duration.parse(o.getMaxDuration());
				if (d != null) ok = true;
			} catch (Exception e ) {
				ok = false;
			}
		
			if (!ok) {
				if (diagnostics != null) {
					diagnostics.add
						(createSimpleDiagnostic
								(Diagnostic.ERROR,
										DIAGNOSTIC_SOURCE,
										0,
										"Duration format " + o.getMaxDuration() + " of maximal duration not ISO compliant in " +  getObjectLabel(o, context), 
										new Object[] { "DURATION_FORMAT", getObjectLabel(o, context) }, //$NON-NLS-1$
										new Object[] { o },
										context));
								}
			        failed = true;
			}
		}
		
		if (o.getTotalMaxDuration() != null &&
			o.getTotalMaxDuration().length() > 0)  {
			
				boolean ok = false;
			
				Duration d = null;
			
				try {
					d = Duration.parse(o.getTotalMaxDuration());
					if (d != null) ok = true;
				} catch (Exception e ) {
					ok = false;
				}
			
				if (!ok) {
					if (diagnostics != null) {
						diagnostics.add
							(createSimpleDiagnostic
									(Diagnostic.ERROR,
											DIAGNOSTIC_SOURCE,
											0,
											"Duration format " + o.getTotalMaxDuration() + " of total duration not ISO compliant in " +  getObjectLabel(o, context), 
											new Object[] { "DURATION_FORMAT", getObjectLabel(o, context) }, //$NON-NLS-1$
											new Object[] { o },
											context));
									}
				        failed = true;
				}
			}
		
		
		
		return !failed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareCombinationModel(FareCombinationModel fareCombinationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fareCombinationModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareCombinationModel_MODEL_MUST(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareCombinationModel_REFERENCE_CLUSTER_MUST(fareCombinationModel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MODEL_MUST constraint of '<em>Fare Combination Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareCombinationModel_MODEL_MUST(FareCombinationModel fareCombinationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareCombinationModel.getModel() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_245 + " in " +  getObjectLabel(fareCombinationModel, context), 
						 new Object[] { "MODEL_MUST", getObjectLabel(fareCombinationModel, context) }, //$NON-NLS-1$
						 new Object[] { fareCombinationModel },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the REFERENCE_CLUSTER_MUST constraint of '<em>Fare Combination Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFareCombinationModel_REFERENCE_CLUSTER_MUST(FareCombinationModel fareCombinationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fareCombinationModel.getModel() == CombinationModel.CLUSTERING && fareCombinationModel.getReferenceCluster() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_247 + " in " +  getObjectLabel(fareCombinationModel, context),
						 new Object[] { "REFERENCE_CLUSTER_MUST", getObjectLabel(fareCombinationModel, context) }, //$NON-NLS-1$
						 new Object[] { fareCombinationModel },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredBarcodes(RequiredBarcodes requiredBarcodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiredBarcodes, diagnostics, context);
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Required Barcodes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRequiredBarcodes_AT_LEAST_ONE(RequiredBarcodes requiredBarcodes, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (requiredBarcodes.getRequiredBarcodes() == null || requiredBarcodes.getRequiredBarcodes().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_249 + " in " +  getObjectLabel(requiredBarcodes, context),
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(requiredBarcodes, context) }, //$NON-NLS-1$
						 new Object[] { requiredBarcodes },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptedBarcodes(AcceptedBarcodes acceptedBarcodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acceptedBarcodes, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalValidity(RegionalValidity regionalValidity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regionalValidity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalValidity_AT_LEAST_ONE_OF_VIA_ZONE_LINE_POLYGON(regionalValidity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_OF_VIA_ZONE_LINE_POLYGON constraint of '<em>Regional Validity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRegionalValidity_AT_LEAST_ONE_OF_VIA_ZONE_LINE_POLYGON(RegionalValidity regionalValidity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (regionalValidity.getLine() == null && regionalValidity.getPolygone() == null && regionalValidity.getViaStation() == null && regionalValidity.getZone() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_253 + " in " +  getObjectLabel(regionalValidity, context),
						 new Object[] { "AT_LEAST_ONE_OF_VIA_ZONE_LINE_POLYGON", getObjectLabel(regionalValidity, context) }, //$NON-NLS-1$
						 new Object[] { regionalValidity },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViaStation(ViaStation viaStation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(viaStation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validateViaStation_AT_LEAST_ONE_OBJECT_SET(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validateViaStation_IF_ALTERNATIVE_ROUTES_AT_LEAST_TWO(viaStation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_OBJECT_SET constraint of '<em>Via Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateViaStation_AT_LEAST_ONE_OBJECT_SET(ViaStation viaStation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (viaStation.getAlternativeRoutes() == null && viaStation.getRoute() == null && viaStation.getStation() == null && viaStation.getFareStationSet() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_255 + " in " +  getObjectLabel(viaStation, context),
						 new Object[] { "AT_LEAST_ONE_OBJECT_SET", getObjectLabel(viaStation, context) }, //$NON-NLS-1$
						 new Object[] { viaStation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the IF_ALTERNATIVE_ROUTES_AT_LEAST_TWO constraint of '<em>Via Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateViaStation_IF_ALTERNATIVE_ROUTES_AT_LEAST_TWO(ViaStation viaStation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (viaStation.getAlternativeRoutes() != null && !viaStation.getAlternativeRoutes().isEmpty() && viaStation.getAlternativeRoutes().size() < 2) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_257 + " in " +  getObjectLabel(viaStation, context),
						 new Object[] { "IF_ALTERNATIVE_ROUTES_AT_LEAST_TWO", getObjectLabel(viaStation, context) }, //$NON-NLS-1$
						 new Object[] { viaStation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternativeRoute(AlternativeRoute alternativeRoute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(alternativeRoute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlternativeRoute_AT_LEAST_ONE_VIA(alternativeRoute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_VIA constraint of '<em>Alternative Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAlternativeRoute_AT_LEAST_ONE_VIA(AlternativeRoute alternativeRoute, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (alternativeRoute.getStations() == null || alternativeRoute.getStations().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_259 + " in " +  getObjectLabel(alternativeRoute, context),
						 new Object[] { "AT_LEAST_ONE_VIA", getObjectLabel(alternativeRoute, context) }, //$NON-NLS-1$
						 new Object[] { alternativeRoute },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoute(Route route, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(route, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(route, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(route, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(route, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(route, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(route, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(route, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(route, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(route, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoute_AT_LEAST_ONE_VIA(route, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_VIA constraint of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRoute_AT_LEAST_ONE_VIA(Route route, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if ( route.getStations() == null ||  route.getStations().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_261 + " in " +  getObjectLabel(route, context),
						 new Object[] { "AT_LEAST_ONE_VIA", getObjectLabel(route, context) }, //$NON-NLS-1$
						 new Object[] { route },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZone(Zone zone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zone, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validateZone_CARRIER_MUST(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validateZone_ONE_OF_ZONE_ID_NUTS_CITY(zone, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CARRIER_MUST constraint of '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateZone_CARRIER_MUST(Zone zone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		if (zone.getCarrier() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_263 + " in " +  getObjectLabel(zone, context),
						 new Object[] { "CARRIER_MUST", getObjectLabel(zone, context) }, //$NON-NLS-1$
						 new Object[] { zone },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ONE_OF_ZONE_ID_NUTS_CITY constraint of '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateZone_ONE_OF_ZONE_ID_NUTS_CITY(Zone zone, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (zone.getNutsCode() == null && zone.getZoneId() == null && zone.getCity() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_265 + " in " +  getObjectLabel(zone, context),
						 new Object[] { "ONE_OF_ZONE_ID_NUTS_CITY", getObjectLabel(zone, context) }, //$NON-NLS-1$
						 new Object[] { zone },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutsCode(NutsCode nutsCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutsCode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLine(Line line, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(line, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(line, diagnostics, context);
		if (result || diagnostics != null) result &= validateLine_CARRIER_MUST(line, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CARRIER_MUST constraint of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLine_CARRIER_MUST(Line line, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (line.getCarrier() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_267 + " in " +  getObjectLabel(line, context),
						 new Object[] { "CARRIER_MUST", getObjectLabel(line, context) }, //$NON-NLS-1$
						 new Object[] { line },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygone(Polygone polygone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(polygone, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolygone_AT_LEAST_THREE_EDGES(polygone, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_THREE_EDGES constraint of '<em>Polygone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePolygone_AT_LEAST_THREE_EDGES(Polygone polygone, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (polygone.getEdge() == null || polygone.getEdge().size() < 3) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_269 + " in " +  getObjectLabel(polygone, context),
						 new Object[] { "AT_LEAST_THREE_EDGES", getObjectLabel(polygone, context) }, //$NON-NLS-1$
						 new Object[] { polygone },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyStation(LegacyStation legacyStation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyStation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(edge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validateEdge_COORDINATE_LIMITS(edge, diagnostics, context);
		return result;
	}

	/**
	 * Validates the COORDINATE_LIMITS constraint of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEdge_COORDINATE_LIMITS(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (edge.getLongitude() > 180 || edge.getLongitude() < -180 || edge.getLatitude() > 180 || edge.getLatitude() < -180) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_271 + " in " +  getObjectLabel(edge, context),
						 new Object[] { "COORDINATE_LIMITS", getObjectLabel(edge, context) }, //$NON-NLS-1$
						 new Object[] { edge },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZoneDefinitions(ZoneDefinitions zoneDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zoneDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZoneDefinition(ZoneDefinition zoneDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zoneDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateZoneDefinition_CARRIER_MUST_BE_SET(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateZoneDefinition_AT_LEAST_ONE_OF_SET_NUTS_POLYGON(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateZoneDefinition_IF_STATION_SET_AT_LEAST_TWO_STATIONS(zoneDefinition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CARRIER_MUST_BE_SET constraint of '<em>Zone Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateZoneDefinition_CARRIER_MUST_BE_SET(ZoneDefinition zoneDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (zoneDefinition.getProvider() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_273 + " in " +  getObjectLabel(zoneDefinition, context),
						 new Object[] { "CARRIER_MUST_BE_SET", getObjectLabel(zoneDefinition, context) }, //$NON-NLS-1$
						 new Object[] { zoneDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AT_LEAST_ONE_OF_SET_NUTS_POLYGON constraint of '<em>Zone Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateZoneDefinition_AT_LEAST_ONE_OF_SET_NUTS_POLYGON(ZoneDefinition zoneDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (zoneDefinition.getNutsCodes() == null && zoneDefinition.getPolygone() == null && zoneDefinition.getStationSet() == null && (zoneDefinition.getZoneId() == null || zoneDefinition.getZoneId().length() < 0)){
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_275 + " in " +  getObjectLabel(zoneDefinition, context),
						 new Object[] { "AT_LEAST_ONE_OF_SET_NUTS_POLYGON", getObjectLabel(zoneDefinition, context) }, //$NON-NLS-1$
						 new Object[] { zoneDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the IF_STATION_SET_AT_LEAST_TWO_STATIONS constraint of '<em>Zone Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateZoneDefinition_IF_STATION_SET_AT_LEAST_TWO_STATIONS(ZoneDefinition zoneDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (zoneDefinition.getStationSet() != null && zoneDefinition.getStationSet().getStations().size() < 3) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_277 + " in " +  getObjectLabel(zoneDefinition, context),
						 new Object[] { "IF_STATION_SET_AT_LEAST_TWO_STATIONS", getObjectLabel(zoneDefinition, context) }, //$NON-NLS-1$
						 new Object[] { zoneDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerConstraint(PassengerConstraint passengerConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(passengerConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePassengerConstraint_TRAVELLER_TYPE_MUST(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePassengerConstraint_NAME_MUST(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePassengerConstraint_NOT_REFERENCED(passengerConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TRAVELLER_TYPE_MUST constraint of '<em>Passenger Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePassengerConstraint_TRAVELLER_TYPE_MUST(PassengerConstraint passengerConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (passengerConstraint.getTravelerType() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_279 + " in " +  getObjectLabel(passengerConstraint, context),
						 new Object[] { "TRAVELLER_TYPE_MUST", getObjectLabel(passengerConstraint, context) }, //$NON-NLS-1$
						 new Object[] { passengerConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NAME_MUST constraint of '<em>Passenger Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePassengerConstraint_NAME_MUST(PassengerConstraint passengerConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (passengerConstraint.getText() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Name missing in passenger constraint: " +  getObjectLabel(passengerConstraint, context),
						 new Object[] { "NAME_MUST", getObjectLabel(passengerConstraint, context) }, //$NON-NLS-1$
						 new Object[] { passengerConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludedFreePassengerLimit(IncludedFreePassengerLimit includedFreePassengerLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(includedFreePassengerLimit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedFreePassengerLimit_NUMBER_AT_LEAST_ONE(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedFreePassengerLimit_TRAVELLER_TYPE_MUST(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedFreePassengerLimit_SIMPLE_PASSENGER_CONSTRAINT_ONLY(includedFreePassengerLimit, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NUMBER_AT_LEAST_ONE constraint of '<em>Included Free Passenger Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateIncludedFreePassengerLimit_NUMBER_AT_LEAST_ONE(IncludedFreePassengerLimit includedFreePassengerLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (includedFreePassengerLimit.getNumber() <= 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_281 + " in " +  getObjectLabel(includedFreePassengerLimit, context),
						 new Object[] { NationalLanguageSupport.GtmValidator_282, getObjectLabel(includedFreePassengerLimit, context) },
						 new Object[] { includedFreePassengerLimit },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TRAVELLER_TYPE_MUST constraint of '<em>Included Free Passenger Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateIncludedFreePassengerLimit_TRAVELLER_TYPE_MUST(IncludedFreePassengerLimit includedFreePassengerLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (includedFreePassengerLimit.getPassengerType() == null && includedFreePassengerLimit.getPassengerConstraint() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_283 + " in " +  getObjectLabel(includedFreePassengerLimit, context),
						 new Object[] { "TRAVELLER_TYPE_MUST", getObjectLabel(includedFreePassengerLimit, context) }, //$NON-NLS-1$
						 new Object[] { includedFreePassengerLimit },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SIMPLE_PASSENGER_CONSTRAINT_ONLY constraint of '<em>Included Free Passenger Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateIncludedFreePassengerLimit_SIMPLE_PASSENGER_CONSTRAINT_ONLY(IncludedFreePassengerLimit includedFreePassengerLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// a referenced passenger constraint must not include free passengers
		/*
		if (includedFreePassengerLimit.getPassengerConstraint() != null && 
			includedFreePassengerLimit.getPassengerConstraint().getIncludedFreePassengers() != null && 
			includedFreePassengerLimit.getPassengerConstraint().getIncludedFreePassengers().size() > 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 getObjectLabel(includedFreePassengerLimit, context) + " must not reference passenger constraints that include free passengers",						 new Object[] { "SIMPLE_PASSENGER_CONSTRAINT_ONLY", getObjectLabel(includedFreePassengerLimit, context) }, //$NON-NLS-1$
						 new Object[] { includedFreePassengerLimit },
						 context));
			}
			return false;
		}
		*/
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerCombinationConstraint(PassengerCombinationConstraint passengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(passengerCombinationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePassengerCombinationConstraint_NUMBER_AT_LEAST_ONE(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePassengerCombinationConstraint_TRAVELLER_TYPE_MUST(passengerCombinationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NUMBER_AT_LEAST_ONE constraint of '<em>Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePassengerCombinationConstraint_NUMBER_AT_LEAST_ONE(PassengerCombinationConstraint passengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (passengerCombinationConstraint.getMaxNumber() < 1) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_285 + " in " +  getObjectLabel(passengerCombinationConstraint, context),
						 new Object[] { "NUMBER_AT_LEAST_ONE", getObjectLabel(passengerCombinationConstraint, context) }, //$NON-NLS-1$
						 new Object[] { passengerCombinationConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TRAVELLER_TYPE_MUST constraint of '<em>Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePassengerCombinationConstraint_TRAVELLER_TYPE_MUST(PassengerCombinationConstraint passengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		
		
		if (passengerCombinationConstraint.getPassengerConstraint() == null || passengerCombinationConstraint.getPassengerConstraint().getTravelerType() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_287 + " in " +  getObjectLabel(passengerCombinationConstraint, context),
						 new Object[] { "TRAVELLER_TYPE_MUST", getObjectLabel(passengerCombinationConstraint, context) }, //$NON-NLS-1$
						 new Object[] { passengerCombinationConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePassengerConstraint_NOT_REFERENCED(PassengerConstraint passengerConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		FareStructure fareData = GtmUtils.getFareStructure(passengerConstraint);
		if ( fareData == null ||
			 ! (    GtmUtils.isReferenced(passengerConstraint,fareData.getFareElements())
				 || GtmUtils.isReferenced(passengerConstraint,fareData.getPassengerConstraints())
			   )
		   ) {
			if (diagnostics != null) {
				diagnostics.add
		        (createSimpleDiagnostic
				        (Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 getObjectLabel(passengerConstraint, context) + " " + NationalLanguageSupport.GtmValidator_Not_REFERENCED,
						 new Object[] { "NOT_REFERENCED", getObjectLabel(passengerConstraint, context) }, //$NON-NLS-1$
						 new Object[] {  passengerConstraint },
						 context));	
			}
			return false;
		}
		return true;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeTime(RelativeTime relativeTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relativeTime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_LONG(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_SHORT(relativeTime, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WARNING_TOO_LONG constraint of '<em>Relative Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRelativeTime_WARNING_TOO_LONG(RelativeTime relativeTime, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (relativeTime.getUnit() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_289 + " in " +  getObjectLabel(relativeTime, context),
						 new Object[] { "WARNING_TOO_LONG", getObjectLabel(relativeTime, context) }, //$NON-NLS-1$
						 new Object[] { relativeTime },
						 context));
			}
			return false;
		}
		
		if (relativeTime.getValue() < 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_291 + " in " +  getObjectLabel(relativeTime, context),
						 new Object[] { "WARNING_TOO_LONG", getObjectLabel(relativeTime, context) }, //$NON-NLS-1$
						 new Object[] { relativeTime },
						 context));
			}
			return false;
		}
		
		
		if ((relativeTime.getUnit() == TimeUnit.DAY && relativeTime.getValue() > 700) || 
			(relativeTime.getUnit() == TimeUnit.HOUR && relativeTime.getValue() > 16800) ||
			(relativeTime.getUnit() == TimeUnit.MINUTE && relativeTime.getValue() > 1008000)) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_293 + " in " +  getObjectLabel(relativeTime, context),
						 new Object[] { "WARNING_TOO_LONG", getObjectLabel(relativeTime, context) }, //$NON-NLS-1$
						 new Object[] { relativeTime },
						 context));
			}
			return false;
		}

		
		return true;
	}

	/**
	 * Validates the WARNING_TOO_SHORT constraint of '<em>Relative Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRelativeTime_WARNING_TOO_SHORT(RelativeTime relativeTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		if (relativeTime.getValue() < 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_295 + " in " +  getObjectLabel(relativeTime, context),
						 new Object[] { "WARNING_TOO_LONG", getObjectLabel(relativeTime, context) }, //$NON-NLS-1$
						 new Object[] { relativeTime },
						 context));
			}
			return false;
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesCondition(AfterSalesCondition afterSalesCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(afterSalesCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateAfterSalesCondition_FEE_MUST(afterSalesCondition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FEE_MUST constraint of '<em>After Sales Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAfterSalesCondition_FEE_MUST(AfterSalesCondition afterSalesCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (afterSalesCondition.getFee() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_297 + " in " +  getObjectLabel(afterSalesCondition, context),
						 new Object[] { "FEE_MUST", getObjectLabel(afterSalesCondition, context) }, //$NON-NLS-1$
						 new Object[] { afterSalesCondition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationTime(ApplicationTime applicationTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(applicationTime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_LONG(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_SHORT(applicationTime, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesRule(AfterSalesRule afterSalesRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(afterSalesRule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validateAfterSalesRule_AT_LEAST_ONE(afterSalesRule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>After Sales Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAfterSalesRule_AT_LEAST_ONE(AfterSalesRule afterSalesRule, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if ( afterSalesRule.getConditions() == null ||  afterSalesRule.getConditions().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_299 + " in " +  getObjectLabel(afterSalesRule, context),
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(afterSalesRule, context) }, //$NON-NLS-1$
						 new Object[] { afterSalesRule },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataConstraint(PersonalDataConstraint personalDataConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(personalDataConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersonalDataConstraint_AT_LEAST_ONE_REQUIRED_ITEM(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersonalDataConstraint_NOT_REFERENCED(personalDataConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_REQUIRED_ITEM constraint of '<em>Personal Data Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePersonalDataConstraint_AT_LEAST_ONE_REQUIRED_ITEM(PersonalDataConstraint personalDataConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (personalDataConstraint.getRequiredPersonalData() == null || personalDataConstraint.getRequiredPersonalData().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_301 + " in " +  getObjectLabel(personalDataConstraint, context),
						 new Object[] { "AT_LEAST_ONE_REQUIRED_ITEM", getObjectLabel(personalDataConstraint, context) }, //$NON-NLS-1$
						 new Object[] { personalDataConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Personal Data Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePersonalDataConstraint_NOT_REFERENCED(PersonalDataConstraint personalDataConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		FareStructure fareData = GtmUtils.getFareStructure(personalDataConstraint);
		if ( (fareData == null) ||
			 ! (   GtmUtils.isReferenced(personalDataConstraint,fareData.getFareConstraintBundles())  )  ) {
			if (diagnostics != null) {
				diagnostics.add
		        (createSimpleDiagnostic
				        (Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 getObjectLabel(personalDataConstraint, context) + " " + NationalLanguageSupport.GtmValidator_Not_REFERENCED,
						 new Object[] { "NOT_REFERENCED", getObjectLabel(personalDataConstraint, context) }, //$NON-NLS-1$
						 new Object[] {  personalDataConstraint },
						 context));					
			}
			return false;
		}
		return true;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredPersonalData(RequiredPersonalData requiredPersonalData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredPersonalData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredPersonalData_AT_LEAST_ONE_ITEM(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredPersonalData_ADD_LEAST_ONE_TRANSFER(requiredPersonalData, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_ITEM constraint of '<em>Required Personal Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRequiredPersonalData_AT_LEAST_ONE_ITEM(RequiredPersonalData requiredPersonalData, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (requiredPersonalData.getDataItem() == null ) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_303 + " in " +  getObjectLabel(requiredPersonalData, context),
						 new Object[] { "AT_LEAST_ONE_ITEM", getObjectLabel(requiredPersonalData, context) }, //$NON-NLS-1$
						 new Object[] { requiredPersonalData },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ADD_LEAST_ONE_TRANSFER constraint of '<em>Required Personal Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRequiredPersonalData_ADD_LEAST_ONE_TRANSFER(RequiredPersonalData requiredPersonalData, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (requiredPersonalData.getTransfer() == null || requiredPersonalData.getTransfer().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_305 + " in " +  getObjectLabel(requiredPersonalData, context),
						 new Object[] { "ADD_LEAST_ONE_TRANSFER", getObjectLabel(requiredPersonalData, context) }, //$NON-NLS-1$
						 new Object[] { requiredPersonalData },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossBorderCondition(CrossBorderCondition crossBorderCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(crossBorderCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCrossBorderCondition_FROM_TO_COUNTRY_MUST(crossBorderCondition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FROM_TO_COUNTRY_MUST constraint of '<em>Cross Border Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCrossBorderCondition_FROM_TO_COUNTRY_MUST(CrossBorderCondition crossBorderCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (crossBorderCondition.getFromCountry() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_307 + " in " +  getObjectLabel(crossBorderCondition, context),
						 new Object[] { "FROM_TO_COUNTRY_MUST", getObjectLabel(crossBorderCondition, context) }, //$NON-NLS-1$
						 new Object[] { crossBorderCondition },
						 context));
			}
			return false;
		}
		
		if (crossBorderCondition.getToCountry() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_309 + " in " +  getObjectLabel(crossBorderCondition, context),
						 new Object[] { "FROM_TO_COUNTRY_MUST", getObjectLabel(crossBorderCondition, context) }, //$NON-NLS-1$
						 new Object[] { crossBorderCondition },
						 context));
			}
			return false;
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllowedPersonalDataChanges(AllowedPersonalDataChanges allowedPersonalDataChanges, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allowedPersonalDataChanges, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllowedPersonalDataChanges_TIME_LIMIT_TOO_SHORT(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllowedPersonalDataChanges_TIME_LIMIT_TOO_LONG(allowedPersonalDataChanges, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TIME_LIMIT_TOO_SHORT constraint of '<em>Allowed Personal Data Changes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAllowedPersonalDataChanges_TIME_LIMIT_TOO_SHORT(AllowedPersonalDataChanges allowedPersonalDataChanges, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (allowedPersonalDataChanges.getTimeLimit() < 10) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_311 + " in " +  getObjectLabel(allowedPersonalDataChanges, context),
						 new Object[] { "TIME_LIMIT_TOO_SHORT", getObjectLabel(allowedPersonalDataChanges, context) }, //$NON-NLS-1$
						 new Object[] { allowedPersonalDataChanges },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TIME_LIMIT_TOO_LONG constraint of '<em>Allowed Personal Data Changes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAllowedPersonalDataChanges_TIME_LIMIT_TOO_LONG(AllowedPersonalDataChanges allowedPersonalDataChanges, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (allowedPersonalDataChanges.getTimeLimit() > 1008000) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_313,
						 new Object[] { "TIME_LIMIT_TOO_LONG", getObjectLabel(allowedPersonalDataChanges, context) }, //$NON-NLS-1$
						 new Object[] { allowedPersonalDataChanges },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionConstraint(ReductionConstraint reductionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reductionConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateReductionConstraint_AT_LEAST_ONE(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateReductionConstraint_NOT_REFERENCED(reductionConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Reduction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateReductionConstraint_AT_LEAST_ONE(ReductionConstraint reductionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (reductionConstraint.getRequiredReductionCards() == null || reductionConstraint.getRequiredReductionCards().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_315 + " in " +  getObjectLabel(reductionConstraint, context),
						 new Object[] { NationalLanguageSupport.GtmValidator_316, getObjectLabel(reductionConstraint, context) },
						 new Object[] { reductionConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Reduction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateReductionConstraint_NOT_REFERENCED(ReductionConstraint reductionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		FareStructure fareData = GtmUtils.getFareStructure(reductionConstraint);
		if ( (fareData == null) ||
			 ! (   GtmUtils.isReferenced(reductionConstraint,fareData.getFareElements())  )  ) {
			if (diagnostics != null) {
				diagnostics.add
		        (createSimpleDiagnostic
				        (Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 getObjectLabel(reductionConstraint, context) + " " + NationalLanguageSupport.GtmValidator_Not_REFERENCED,
						 new Object[] { "NOT_REFERENCED", getObjectLabel(reductionConstraint, context) }, //$NON-NLS-1$
						 new Object[] {  reductionConstraint },
						 context));						
			}
			return false;
		}
		return true;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredReductionCard(RequiredReductionCard requiredReductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredReductionCard, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredReductionCard_NAME_FORMAT(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredReductionCard_CARD_MUST(requiredReductionCard, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NAME_FORMAT constraint of '<em>Required Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRequiredReductionCard_NAME_FORMAT(RequiredReductionCard requiredReductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (requiredReductionCard.getName() == null || requiredReductionCard.getName().length() < 1) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_317 + " in " +  getObjectLabel(requiredReductionCard, context),
						 new Object[] { "NAME_FORMAT", getObjectLabel(requiredReductionCard, context) }, //$NON-NLS-1$
						 new Object[] { requiredReductionCard },
						 context));
			}
			return false;
		}
		
		if (!StringFormatValidator.isASCII(requiredReductionCard.getName())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_319 + " in " +  getObjectLabel(requiredReductionCard, context),
						 new Object[] { "NAME_FORMAT", getObjectLabel(requiredReductionCard, context) }, //$NON-NLS-1$
						 new Object[] { requiredReductionCard },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CARD_MUST constraint of '<em>Required Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRequiredReductionCard_CARD_MUST(RequiredReductionCard requiredReductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (requiredReductionCard.getCard() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_321 + " in " +  getObjectLabel(requiredReductionCard, context),
						 new Object[] { "CARD_MUST", getObjectLabel(requiredReductionCard, context) }, //$NON-NLS-1$
						 new Object[] { requiredReductionCard },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentConstraint(FulfillmentConstraint fulfillmentConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fulfillmentConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateFulfillmentConstraint_AT_LEAST_ONE_ACCEPTED_TYPE(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateFulfillmentConstraint_NOT_REFERENCED(fulfillmentConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_ACCEPTED_TYPE constraint of '<em>Fulfillment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFulfillmentConstraint_AT_LEAST_ONE_ACCEPTED_TYPE(FulfillmentConstraint fulfillmentConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (fulfillmentConstraint.getAcceptedFulfilmentTypes() == null || fulfillmentConstraint.getAcceptedFulfilmentTypes().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_323  + " in " +  getObjectLabel(fulfillmentConstraint, context),
						 new Object[] { "AT_LEAST_ONE_ACCEPTED_TYPE", getObjectLabel(fulfillmentConstraint, context) }, //$NON-NLS-1$
						 new Object[] { fulfillmentConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Fulfillment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFulfillmentConstraint_NOT_REFERENCED(FulfillmentConstraint fulfillmentConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		FareStructure fareData = GtmUtils.getFareStructure(fulfillmentConstraint);
		if ( (fareData == null) ||
			 ! (   GtmUtils.isReferenced(fulfillmentConstraint,fareData.getFareConstraintBundles())  )  ) {
			if (diagnostics != null) {
				diagnostics.add
		        (createSimpleDiagnostic
				        (Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 getObjectLabel(fulfillmentConstraint, context) + " " + NationalLanguageSupport.GtmValidator_Not_REFERENCED,
						 new Object[] { "NOT_REFERENCED", getObjectLabel(fulfillmentConstraint, context) }, //$NON-NLS-1$
						 new Object[] {  fulfillmentConstraint },
						 context));							
			}
			return false;
		}
		return true;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrainResourceLocation(TrainResourceLocation trainResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trainResourceLocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrainResourceLocation_CARRIER_MUST(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrainResourceLocation_AT_LEAST_ONE_ONLINE_RESOURCE(trainResourceLocation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CARRIER_MUST constraint of '<em>Train Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTrainResourceLocation_CARRIER_MUST(TrainResourceLocation trainResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (trainResourceLocation.getCarrier() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_325  + " in " +  getObjectLabel(trainResourceLocation, context),
						 new Object[] { "CARRIER_MUST", getObjectLabel(trainResourceLocation, context) }, //$NON-NLS-1$
						 new Object[] { trainResourceLocation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AT_LEAST_ONE_ONLINE_RESOURCE constraint of '<em>Train Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTrainResourceLocation_AT_LEAST_ONE_ONLINE_RESOURCE(TrainResourceLocation trainResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (trainResourceLocation.getOnlineResources() == null || trainResourceLocation.getOnlineResources().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_327 + " in " +  getObjectLabel(trainResourceLocation, context),
						 new Object[] { "AT_LEAST_ONE_ONLINE_RESOURCE", getObjectLabel(trainResourceLocation, context) }, //$NON-NLS-1$
						 new Object[] { trainResourceLocation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeZone(TimeZone timeZone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterSet(CharacterSet characterSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrierResourceLocation(CarrierResourceLocation carrierResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carrierResourceLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationResourceLocation(StationResourceLocation stationResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stationResourceLocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStationResourceLocation_AT_LEAST_ONE_ONLINE_RESOURCE(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStationResourceLocation_AT_LEAST_ONE_STATION_OR_CONNECTION_POINT(stationResourceLocation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_ONLINE_RESOURCE constraint of '<em>Station Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStationResourceLocation_AT_LEAST_ONE_ONLINE_RESOURCE(StationResourceLocation stationResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (stationResourceLocation.getOnlineResources() == null || stationResourceLocation.getOnlineResources().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_329 + " in " +  getObjectLabel(stationResourceLocation, context),
						 new Object[] { "AT_LEAST_ONE_ONLINE_RESOURCE", getObjectLabel(stationResourceLocation, context) }, //$NON-NLS-1$
						 new Object[] { stationResourceLocation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AT_LEAST_ONE_STATION_OR_CONNECTION_POINT constraint of '<em>Station Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStationResourceLocation_AT_LEAST_ONE_STATION_OR_CONNECTION_POINT(StationResourceLocation stationResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if ((stationResourceLocation.getStations() == null || stationResourceLocation.getStations().isEmpty()) &&
			(stationResourceLocation.getConnectionPoints() == null || stationResourceLocation.getConnectionPoints().isEmpty()) ) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_331 + " in " +  getObjectLabel(stationResourceLocation, context),
						 new Object[] { "AT_LEAST_ONE_STATION_OR_CONNECTION_POINT", getObjectLabel(stationResourceLocation, context) }, //$NON-NLS-1$
						 new Object[] { stationResourceLocation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineResource(OnlineResource onlineResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(onlineResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnlineResource_REQUEST_TYPE_MUST(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnlineResource_INTERFACE_TYPE_MUST(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnlineResource_SYSTEM_MUST(onlineResource, diagnostics, context);
		return result;
	}

	/**
	 * Validates the REQUEST_TYPE_MUST constraint of '<em>Online Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateOnlineResource_REQUEST_TYPE_MUST(OnlineResource onlineResource, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (onlineResource.getOfferRequestType() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_333 + " in " +  getObjectLabel(onlineResource, context),
						 new Object[] { "REQUEST_TYPE_MUST", getObjectLabel(onlineResource, context) }, //$NON-NLS-1$
						 new Object[] { onlineResource },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the INTERFACE_TYPE_MUST constraint of '<em>Online Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateOnlineResource_INTERFACE_TYPE_MUST(OnlineResource onlineResource, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (onlineResource.getInterfaceType() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.GtmValidator_335 + " in " +  getObjectLabel(onlineResource, context),
						 new Object[] { "INTERFACE_TYPE_MUST", getObjectLabel(onlineResource, context) }, //$NON-NLS-1$
						 new Object[] { onlineResource },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SYSTEM_MUST constraint of '<em>Online Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateOnlineResource_SYSTEM_MUST(OnlineResource onlineResource, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (onlineResource.getSystem() == null || onlineResource.getSystem().length()<1) {
			if (diagnostics != null) {
				diagnostics.add
					(createGtmDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0, 
						 NationalLanguageSupport.GtmValidator_337 + " in " +  getObjectLabel(onlineResource, context),
						 new Object[] { "SYSTEM_MUST", getObjectLabel(onlineResource, context) }, //$NON-NLS-1$
						 new Object[] { onlineResource },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesTransactionType(AfterSalesTransactionType afterSalesTransactionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBarcodeTypes(BarcodeTypes barcodeTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassicClassType(ClassicClassType classicClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClusters(Clusters clusters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationModel(CombinationModel combinationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlDataExchangeTypes(ControlDataExchangeTypes controlDataExchangeTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareType(FareType fareType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentType(FulfillmentType fulfillmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeoSystem(GeoSystem geoSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeoUnit(GeoUnit geoUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicalReservationType(GraphicalReservationType graphicalReservationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHemisphereEW(HemisphereEW hemisphereEW, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHemisphereNS(HemisphereNS hemisphereNS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceType(InterfaceType interfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationTravelClass(ReservationTravelClass reservationTravelClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationServiceLevel(ReservationServiceLevel reservationServiceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationService(ReservationService reservationService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationBerthType(ReservationBerthType reservationBerthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyCalculationType(LegacyCalculationType legacyCalculationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyPassengerType(LegacyPassengerType legacyPassengerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacySeriesType(LegacySeriesType legacySeriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyConversionType(LegacyConversionType legacyConversionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOfferRequestType(OfferRequestType offerRequestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineServiceType(OnlineServiceType onlineServiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataItemsType(PersonalDataItemsType personalDataItemsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataTransferType(PersonalDataTransferType personalDataTransferType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataChangeReason(PersonalDataChangeReason personalDataChangeReason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxScope(TaxScope taxScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeReferenceType(TimeReferenceType timeReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeRangeScope(TimeRangeScope timeRangeScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnit(TimeUnit timeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelerType(TravelerType travelerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTripAllocationProcess(TripAllocationProcess tripAllocationProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTripAllocationUnit(TripAllocationUnit tripAllocationUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTripInterruptionProcess(TripInterruptionProcess tripInterruptionProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelValidityType(TravelValidityType travelValidityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeekDay(WeekDay weekDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasePriceClassType(BasePriceClassType basePriceClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateAsDate(Date dateAsDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateAsDateTime(Date dateAsDateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSource(DataSource dataSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassId(ClassId classId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericReductionCards(GenericReductionCards genericReductionCards, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceMode(ServiceMode serviceMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoundingType(RoundingType roundingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BasicDiagnostic createSimpleDiagnostic
    (int severity, String source, int code, String message, Object[] messageSubstitutions, Object[] data, Map<Object, Object> context)
	{
        return new BasicDiagnostic(severity, source, code, message, data);
	}
	
	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BasicDiagnostic createGtmDiagnostic
	    (int severity, String source, int code, String messageKey, Object[] messageSubstitutions, Object[] data, Map<Object, Object> context)
	  {
	    String message = NationalLanguageSupport.bind(messageKey, messageSubstitutions);
	    return new BasicDiagnostic(severity, source, code, message, data);
	  }

} //GtmValidator
