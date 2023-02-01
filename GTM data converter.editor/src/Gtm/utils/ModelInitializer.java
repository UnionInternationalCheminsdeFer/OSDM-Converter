package Gtm.utils;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.ClassId;
import Gtm.CodeLists;
import Gtm.ConversionFromLegacy;
import Gtm.ConversionParams;
import Gtm.FareStructure;
import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import Gtm.GenericReductionCards;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Legacy108;
import Gtm.ReductionCard;
import Gtm.ServiceClass;

public class ModelInitializer {

	
	/**
	 * Gets the preparation command to initialize the data structure
	 *
	 * @param tool the tool
	 * @param domain the domain
	 * @return the preparation command
	 */
	public static CompoundCommand getPreparationCommand (GTMTool tool, EditingDomain domain) {
		
		CompoundCommand command = new CompoundCommand();
	
	
		if (tool.getConversionFromLegacy() == null) {
			command.append(new SetCommand(domain, tool, GtmPackage.Literals.GTM_TOOL__CONVERSION_FROM_LEGACY, createInitialConversionFromLegacy()));	
		} else {
			if (tool.getConversionFromLegacy().getLegacy108() == null) {
				command.append(new SetCommand(domain, tool.getConversionFromLegacy(), GtmPackage.Literals.CONVERSION_FROM_LEGACY__LEGACY108, createInitialLegacy108()));	
			} else {
				if (tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__LEGACY_DISTANCE_FARES,GtmFactory.eINSTANCE.createLegacyDistanceFares()));
				}
				if (tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_ROUTE_FARES,GtmFactory.eINSTANCE.createLegacyRouteFares()));									
				}
				if (tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_SERIES_LIST,GtmFactory.eINSTANCE.createLegacySeriesList()));									
				}	
				if (tool.getConversionFromLegacy().getLegacy108().getLegacyStations() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_STATIONS,GtmFactory.eINSTANCE.createLegacy108Stations()));									
				}
			}
			if (tool.getConversionFromLegacy().getParams() == null) {
					
				command.append(new SetCommand(domain, tool.getConversionFromLegacy(), GtmPackage.Literals.CONVERSION_FROM_LEGACY__PARAMS,createInitialConversionParams()));	
			} else {
				if (tool.getConversionFromLegacy().getParams().getLegacyStationMappings() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getParams(),GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS,GtmFactory.eINSTANCE.createLegacyStationMappings()));									
				}
				if (tool.getConversionFromLegacy().getParams().getLegacyFareTemplates() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getParams(),GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES,GtmFactory.eINSTANCE.createLegacyFareTemplates()));									
				}
				if (tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getParams(),GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS,GtmFactory.eINSTANCE.createLegacyStationToServiceConstraintMappings()));									
				}
				if (tool.getConversionFromLegacy().getParams().getBusFerryMapping() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getParams(),GtmPackage.Literals.CONVERSION_PARAMS__BUS_FERRY_MAPPING,GtmFactory.eINSTANCE.createLegacyBusFerryMapping()));									
				}
				if (tool.getConversionFromLegacy().getParams().getAddCarrierRules() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getParams(),GtmPackage.Literals.CONVERSION_PARAMS__ADD_CARRIER_RULES,GtmFactory.eINSTANCE.createAddCarrierRules()));									
				}
			}
		}
		
		if (tool.getCodeLists() == null) {
			command.append(new SetCommand(domain, tool, GtmPackage.Literals.GTM_TOOL__CODE_LISTS, createInitialCodeLists()));	
		} else {
			
			if (tool.getCodeLists().getCarriers() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),GtmPackage.Literals.CODE_LISTS__CARRIERS,GtmFactory.eINSTANCE.createCarriers()));													
			}
			if (tool.getCodeLists().getCountries() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),GtmPackage.Literals.CODE_LISTS__COUNTRIES,GtmFactory.eINSTANCE.createCountries()));					
			}
			if (tool.getCodeLists().getCurrencies() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),GtmPackage.Literals.CODE_LISTS__CURRENCIES,GtmFactory.eINSTANCE.createCurrencies()));	
			}
			if (tool.getCodeLists().getLanguages() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),GtmPackage.Literals.CODE_LISTS__LANGUAGES,GtmFactory.eINSTANCE.createLanguages()));	
			}
			if (tool.getCodeLists().getServiceBrands() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),GtmPackage.Literals.CODE_LISTS__SERVICE_BRANDS,GtmFactory.eINSTANCE.createServiceBrands()));	
			}			
			if (tool.getCodeLists().getStations() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),GtmPackage.Literals.CODE_LISTS__STATIONS,GtmFactory.eINSTANCE.createStations()));	
			}				
			if (tool.getCodeLists().getNutsCodes() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),GtmPackage.Literals.CODE_LISTS__NUTS_CODES,GtmFactory.eINSTANCE.createNUTSCodes()));	
			}				
		}
		
		if (tool.getGeneralTariffModel() == null) {

			command.append(new SetCommand(domain,tool, GtmPackage.Literals.GTM_TOOL__GENERAL_TARIFF_MODEL, createInitialGeneralTariffModel()));

		} else {
			if (tool.getGeneralTariffModel().getDelivery() == null) {
				command.append(new SetCommand(domain, tool.getGeneralTariffModel(), GtmPackage.Literals.GENERAL_TARIFF_MODEL__DELIVERY, GtmFactory.eINSTANCE.createDelivery()));	
			}
			if (tool.getGeneralTariffModel().getFareStructure() == null) {
							
				command.append(new SetCommand(domain, tool.getGeneralTariffModel(), GtmPackage.Literals.GENERAL_TARIFF_MODEL__FARE_STRUCTURE, createInitialFareStructure()));	
			} else {
				
				FareStructure fare = tool.getGeneralTariffModel().getFareStructure();
				
				if (fare.getFareConstraintBundles() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__FARE_CONSTRAINT_BUNDLES, GtmFactory.eINSTANCE.createFareConstraintBundles()));
				}
				
				if (fare.getTotalPassengerCombinationConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__TOTAL_PASSENGER_COMBINATION_CONSTRAINTS, GtmFactory.eINSTANCE.createTotalPassengerCombinationConstraints()));
				}				
				
				if (fare.getAfterSalesRules() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__AFTER_SALES_RULES, GtmFactory.eINSTANCE.createAfterSalesRules()));
				}
				
				if (fare.getCalendars() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__CALENDARS, GtmFactory.eINSTANCE.createCalendars()));
				}
				
				if (fare.getCarrierConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__CARRIER_CONSTRAINTS, GtmFactory.eINSTANCE.createCarrierConstraints()));
				}
				

				if (fare.getCombinationConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__COMBINATION_CONSTRAINTS, GtmFactory.eINSTANCE.createCombinationConstraints()));
				}
				
				
				if (fare.getConnectionPoints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__CONNECTION_POINTS, GtmFactory.eINSTANCE.createConnectionPoints()));
				}
				
				
				if (fare.getFareElements() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__FARE_ELEMENTS, GtmFactory.eINSTANCE.createFareElements()));
				}
				
				
				if (fare.getFareResourceLocations() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS, GtmFactory.eINSTANCE.createFareResourceLocations()));
				}
				
				
				if (fare.getFulfillmentConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS, GtmFactory.eINSTANCE.createFulfillmentConstraints()));
				}
				
				
				if (fare.getPassengerConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__PASSENGER_CONSTRAINTS, GtmFactory.eINSTANCE.createPassengerConstraints()));
				}
				
				if (fare.getPersonalDataConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS, GtmFactory.eINSTANCE.createPersonalDataConstraints()));
				}
				
				if (fare.getPrices() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__PRICES, GtmFactory.eINSTANCE.createPrices()));
				}
				
				if (fare.getReductionCards() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__REDUCTION_CARDS, GtmFactory.eINSTANCE.createReductionCards()));
				}
							
				if (fare.getReductionConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__REDUCTION_CONSTRAINTS, GtmFactory.eINSTANCE.createReductionConstraints()));
				}
				
				if (fare.getRegionalConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__REGIONAL_CONSTRAINTS, GtmFactory.eINSTANCE.createRegionalConstraints()));
				}
				
				if (fare.getReservationParameters() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__RESERVATION_PARAMETERS, GtmFactory.eINSTANCE.createReservationParameters()));
				}
				
				if (fare.getSalesAvailabilityConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS, GtmFactory.eINSTANCE.createSalesAvailabilityConstraints()));
				}
				
				if (fare.getServiceClassDefinitions() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS, GtmFactory.eINSTANCE.createServiceClassDefinitions()));
				}
				
				if (fare.getServiceConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__SERVICE_CONSTRAINTS, GtmFactory.eINSTANCE.createServiceConstraints()));
				}
				
				if (fare.getServiceLevelDefinitions() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS, GtmFactory.eINSTANCE.createServiceLevelDefinitions()));
				}
				
				if (fare.getSupportedOnlineServices() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES, GtmFactory.eINSTANCE.createSupportedOnlineServices()));
				}
				
				if (fare.getTexts() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__TEXTS, GtmFactory.eINSTANCE.createTexts()));
				}				
				
				if (fare.getTravelValidityConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS, GtmFactory.eINSTANCE.createTravelValidityConstraints()));
				}
				
				if (fare.getFareStationSetDefinitions() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS, GtmFactory.eINSTANCE.createFareStationSetDefinitions()));
				}				

				if (fare.getZoneDefinitions() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__ZONE_DEFINITIONS, GtmFactory.eINSTANCE.createZoneDefinitions()));
				}	
				
				if (fare.getLuggageConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__LUGGAGE_CONSTRAINTS, GtmFactory.eINSTANCE.createLuggageConstraints()));
				}
				
				if (fare.getProducts() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__PRODUCTS, GtmFactory.eINSTANCE.createProducts()));
				}
			}
		}
		return command;
	}
	
	
	/**
	 * Creates the initial fare structure.
	 *
	 * @return the fare structure
	 */
	private static FareStructure createInitialFareStructure() {
		FareStructure fareStructure = GtmFactory.eINSTANCE.createFareStructure();
		
		fareStructure.setAfterSalesRules(GtmFactory.eINSTANCE.createAfterSalesRules());
		fareStructure.setCalendars(GtmFactory.eINSTANCE.createCalendars());
		fareStructure.setCarrierConstraints(GtmFactory.eINSTANCE.createCarrierConstraints());
		fareStructure.setCombinationConstraints(GtmFactory.eINSTANCE.createCombinationConstraints());
		fareStructure.setConnectionPoints(GtmFactory.eINSTANCE.createConnectionPoints());
		fareStructure.setFareElements(GtmFactory.eINSTANCE.createFareElements());
		fareStructure.setFareResourceLocations(GtmFactory.eINSTANCE.createFareResourceLocations());
		fareStructure.setFulfillmentConstraints(GtmFactory.eINSTANCE.createFulfillmentConstraints());
		fareStructure.setPassengerConstraints(GtmFactory.eINSTANCE.createPassengerConstraints());
		fareStructure.setPersonalDataConstraints(GtmFactory.eINSTANCE.createPersonalDataConstraints());
		fareStructure.setPrices(GtmFactory.eINSTANCE.createPrices());
		fareStructure.setReductionCards(GtmFactory.eINSTANCE.createReductionCards());
		fareStructure.setReductionConstraints(GtmFactory.eINSTANCE.createReductionConstraints());
		fareStructure.setRegionalConstraints(GtmFactory.eINSTANCE.createRegionalConstraints());
		fareStructure.setReservationParameters(GtmFactory.eINSTANCE.createReservationParameters());
		fareStructure.setSalesAvailabilityConstraints(GtmFactory.eINSTANCE.createSalesAvailabilityConstraints());
		fareStructure.setServiceClassDefinitions(GtmFactory.eINSTANCE.createServiceClassDefinitions());
		fareStructure.setServiceConstraints(GtmFactory.eINSTANCE.createServiceConstraints());
		fareStructure.setServiceLevelDefinitions(GtmFactory.eINSTANCE.createServiceLevelDefinitions());
		fareStructure.setSupportedOnlineServices(GtmFactory.eINSTANCE.createSupportedOnlineServices());
		fareStructure.setTexts(GtmFactory.eINSTANCE.createTexts());
		fareStructure.setTravelValidityConstraints(GtmFactory.eINSTANCE.createTravelValidityConstraints());
		fareStructure.setFareStationSetDefinitions(GtmFactory.eINSTANCE.createFareStationSetDefinitions());	
		fareStructure.setZoneDefinitions(GtmFactory.eINSTANCE.createZoneDefinitions());
		fareStructure.setFareConstraintBundles(GtmFactory.eINSTANCE.createFareConstraintBundles());
		fareStructure.setTotalPassengerCombinationConstraints(GtmFactory.eINSTANCE.createTotalPassengerCombinationConstraints());	
		fareStructure.setLuggageConstraints(GtmFactory.eINSTANCE.createLuggageConstraints());
		fareStructure.setProducts(GtmFactory.eINSTANCE.createProducts());
		return fareStructure;
	}


	/**
	 * Creates the initial code lists.
	 *
	 * @return the code lists
	 */
	private static CodeLists createInitialCodeLists() {
		CodeLists codes = GtmFactory.eINSTANCE.createCodeLists();
		codes.setCarriers(GtmFactory.eINSTANCE.createCarriers());
		codes.setServiceBrands(GtmFactory.eINSTANCE.createServiceBrands());
		codes.setCountries(GtmFactory.eINSTANCE.createCountries());
		codes.setCurrencies(GtmFactory.eINSTANCE.createCurrencies());
		codes.setLanguages(GtmFactory.eINSTANCE.createLanguages());
		codes.setNutsCodes(GtmFactory.eINSTANCE.createNUTSCodes());
		codes.setStations(GtmFactory.eINSTANCE.createStations());
		return codes;
	}


	/**
	 * Creates the initial legacy 108.
	 *
	 * @return the legacy 108
	 */
	private static Legacy108 createInitialLegacy108() {
		Legacy108 legacy108 = GtmFactory.eINSTANCE.createLegacy108();
		
		legacy108.setLegacyDistanceFares(GtmFactory.eINSTANCE.createLegacyDistanceFares());
		legacy108.setLegacyRouteFares(GtmFactory.eINSTANCE.createLegacyRouteFares());
		legacy108.setLegacyDistanceFares(GtmFactory.eINSTANCE.createLegacyDistanceFares());
		legacy108.setLegacySeriesList(GtmFactory.eINSTANCE.createLegacySeriesList());
		legacy108.setLegacyStations(GtmFactory.eINSTANCE.createLegacy108Stations());
		return legacy108;
	}


	/**
	 * Populate initial model.
	 *
	 * @param tool the tool
	 */
	public static void populateInitialModel(GTMTool tool){
		
		tool.setCodeLists(createInitialCodeLists());
		tool.setConversionFromLegacy(createInitialConversionFromLegacy());
		tool.setGeneralTariffModel(createInitialGeneralTariffModel());
		
		
		
		CodeListInitializer.populateServiceBrands(tool.getCodeLists().getServiceBrands());
		CodeListInitializer.populateUICcountries(tool.getCodeLists().getCountries());
		CodeListInitializer.populateCurrencies(tool.getCodeLists().getCurrencies());
		CodeListInitializer.populateUICLaguages(tool.getCodeLists().getLanguages());

		//add generic reduction cards
		CodeListInitializer.createGenericReductionCards(tool.getGeneralTariffModel().getFareStructure(), tool);
		
	}
	
	

	
	public static Command getLinkReductionCardClassesCommand(FareStructure fareStructure, EditingDomain domain) {
		
		CompoundCommand command = new CompoundCommand();
		
		if (fareStructure == null ||
			fareStructure.getServiceClassDefinitions() == null ||
			fareStructure.getServiceClassDefinitions().getServiceClassDefinitions() == null ||
			fareStructure.getReductionCards() == null ||
			fareStructure.getReductionCards().getReductionCards() == null) {
			return null;
		}
		
		ServiceClass classB = null;
		ServiceClass classD = null;
				
		for (ServiceClass s : fareStructure.getServiceClassDefinitions().getServiceClassDefinitions()) {
			if (s.getId().equals(ClassId.B)) classB = s;
			if (s.getId().equals(ClassId.D)) classD = s;
		}

		
		for (ReductionCard r : fareStructure.getReductionCards().getReductionCards()) {
		
			
			if (r.isUicCode() && r.getServiceClasses() == null || r.getServiceClasses().isEmpty()) {
				
				if (classB != null) {
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_EURAIL_1.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classB));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_INTERRAIL_1.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classB));
					}		
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_FIP_DUTY_1.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classB));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_FIP_LEISURE_FREE_1.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classB));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_FIP_LEISURE_REDU_1.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classB));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_RAILPLUS_1.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classB));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_RIT_11.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classB));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_RIT_21.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classB));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_RIT_31.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classB));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_EU_DISABILITY_CARD.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classB));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_INT_DISABILITY_CARD.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classB));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_RIT_1.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classB));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_RIT_2.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classB));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_RIT_3.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classB));
					}
				}	
				if (classD != null) {
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_EURAIL_2.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classD));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_INTERRAIL_2.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classD));
					}		
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_FIP_DUTY_2.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classD));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_FIP_LEISURE_FREE_2.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classD));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_FIP_LEISURE_REDU_2.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classD));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_RAILPLUS_2.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classD));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_RIT_12.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classD));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_RIT_22.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classD));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_RIT_32.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classD));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_EU_DISABILITY_CARD.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classD));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_INT_DISABILITY_CARD.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classD));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_RIT_1.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classD));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_RIT_2.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classD));
					}
					if (r.getId().equalsIgnoreCase(GenericReductionCards.UIC_RIT_3.getName())) {
						command.append(AddCommand.create(domain, r, GtmPackage.Literals.REDUCTION_CARD__SERVICE_CLASSES, classD));
					}
					
				}						
					
			}
			
			
		}
		
		if (!command.isEmpty()) return command;
		return null;
		
	}
	
	/**
	 * Creates the initial conversion from legacy.
	 *
	 * @return the conversion from legacy
	 */
	private static ConversionFromLegacy createInitialConversionFromLegacy() {
		ConversionFromLegacy conversion = GtmFactory.eINSTANCE.createConversionFromLegacy();
		conversion.setParams(createInitialConversionParams());
		conversion.setLegacy108(createInitialLegacy108());
		
		
		return conversion;
	}


	/**
	 * Creates the initial conversion params.
	 *
	 * @return the conversion params
	 */
	private static ConversionParams createInitialConversionParams() {
		ConversionParams params = GtmFactory.eINSTANCE.createConversionParams();
		params.setLegacyStationMappings(GtmFactory.eINSTANCE.createLegacyStationMappings());
		params.setLegacyFareTemplates(GtmFactory.eINSTANCE.createLegacyFareTemplates());
		params.setLegacyStationToServiceBrandMappings(GtmFactory.eINSTANCE.createLegacyStationToServiceConstraintMappings());
		params.setBusFerryMapping(GtmFactory.eINSTANCE.createLegacyBusFerryMapping());									
		params.setAddCarrierRules(GtmFactory.eINSTANCE.createAddCarrierRules());
		return params;
	}

	
	/**
	 * Creates the initial general tariff model.
	 *
	 * @return the general tariff model
	 */
	private static GeneralTariffModel createInitialGeneralTariffModel() {
		GeneralTariffModel model = GtmFactory.eINSTANCE.createGeneralTariffModel();

		model.setDelivery(GtmFactory.eINSTANCE.createDelivery());
		model.setFareStructure(createInitialFareStructure());
		return model;
	}
	
}
