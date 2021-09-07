package Gtm.utils;


import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.StringCharacterIterator;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;

import Gtm.AfterSalesRule;
import Gtm.Calendar;
import Gtm.Carrier;
import Gtm.CarrierConstraint;
import Gtm.CharacterSet;
import Gtm.ClassId;
import Gtm.CodeLists;
import Gtm.CombinationConstraint;
import Gtm.ConnectionPoint;
import Gtm.ConversionFromLegacy;
import Gtm.ConversionParams;
import Gtm.Countries;
import Gtm.Country;
import Gtm.Currencies;
import Gtm.Currency;
import Gtm.FareConstraintBundle;
import Gtm.FareElement;
import Gtm.FareStationSetDefinition;
import Gtm.FareStructure;
import Gtm.FulfillmentConstraint;
import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import Gtm.GenericReductionCards;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Language;
import Gtm.Languages;
import Gtm.Legacy108;
import Gtm.PassengerConstraint;
import Gtm.PersonalDataConstraint;
import Gtm.Price;
import Gtm.ReductionCard;
import Gtm.ReductionConstraint;
import Gtm.RegionalConstraint;
import Gtm.ReservationParameter;
import Gtm.SalesAvailabilityConstraint;
import Gtm.ServiceBrands;
import Gtm.ServiceClass;
import Gtm.ServiceConstraint;
import Gtm.ServiceLevel;
import Gtm.Station;
import Gtm.Text;
import Gtm.TotalPassengerCombinationConstraint;
import Gtm.TravelValidityConstraint;
import Gtm.WorkflowHistory;
import Gtm.WorkflowStep;
import Gtm.console.ConsoleUtil;
import Gtm.nls.NationalLanguageSupport;
import Gtm.preferences.PreferenceConstants;
import Gtm.preferences.PreferencesAccess;
import Gtm.presentation.DirtyCommand;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;
import Gtm.provider.GtmItemProviderAdapterFactory;

/**
 * The Class GtmUtils.
 * 
 * utilities to handle commands, messages message boxes
 * 
 */
public class GtmUtils {
	
	/** The one hundred. */
	private static 	BigDecimal oneHundred = new BigDecimal("100.0");
	
	private static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); //$NON-NLS-1$
	
	
	/**
	 * Gets the active editor.
	 *
	 * @return the active editor
	 */
	public static GtmEditor getActiveEditor() {

		if (PlatformUI.getWorkbench() != null &&
			PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null &&
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()!= null &&
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor() != null) {
		   	return (GtmEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor() ;
		}

		
		IWorkbench wb = PlatformUI.getWorkbench();
		if (wb == null) return null;
		for (IWorkbenchWindow win : wb.getWorkbenchWindows()) {
				if (win.getPartService().getActivePart() instanceof GtmEditor) {
					return (GtmEditor)  win.getPartService().getActivePart();
				}
		}
		return null;
	}
	
	/**
	 * Gets the gtm tool data node.
	 *
	 * @param editingDomainProvider the editing domain provider
	 * @return the gtm tool
	 */
	public static GTMTool getGtmTool(IEditingDomainProvider editingDomainProvider) {
	   		   	
	   	IEditorPart editor =  getActiveEditor();
	   	if (editor == null) return null;
		EditingDomain domain = ((GtmEditor) editor).getEditingDomain();
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		TreeIterator<EObject> it = resource.getAllContents();
		EObject object = it.next();
		
		if (object == null) return null;

		if (object instanceof GTMTool){
			return (GTMTool) object;
		} else {
			return null;
		}
	}
	
	/**
	 * Gets the gtm tool data node.
	 *
	 * @return the gtm tool
	 */
	public static GTMTool getGtmTool() {
	   	
	   	IEditorPart editor =  getActiveEditor();
	   	if (editor == null) return null;
	   	EditingDomain domain = ((GtmEditor) editor).getEditingDomain();
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		TreeIterator<EObject> it = resource.getAllContents();
		EObject object = it.next();
		
		if (object == null) return null;

		if (object instanceof GTMTool){
			return (GTMTool) object;
		} else {
			return null;
		}
	}
	
	/**
	 * Execute and flush and run the garbage collector.
	 *
	 * @param command the command
	 * @param domain the domain
	 */
	public static void executeAndFlush(Command command, EditingDomain domain, GtmEditor editor) {
		
		if (command == null || domain == null) {
			return;
		}
		
		if (command instanceof CompoundCommand) {
			if (((CompoundCommand)command).isEmpty()) return;
		}
		
		if (command.canExecute()) {
			domain.getCommandStack().execute(command);
			domain.getCommandStack().flush();
			domain.getCommandStack().execute(new DirtyCommand());
		} else {
			String message = NationalLanguageSupport.ConverterFromLegacy_52 + command.getDescription();
			GtmUtils.writeConsoleError(message, editor);
		}
		
		System.gc();
		
	}
	
	/**
	 * Execute and flush a command and ask for the garbage collector.
	 *
	 * @param command the command
	 * @param domain the domain
	 */
	public static void executeAndFlush(CompoundCommand command, EditingDomain domain) {
		
		if (command != null && domain != null && !command.isEmpty() && command.canExecute()) {
			domain.getCommandStack().execute(command);
			domain.getCommandStack().flush();
			domain.getCommandStack().execute(new DirtyCommand());
		} else {
			String message = "could not change data: " + command.getDescription();
			GtmUtils.writeConsoleError(message,null);
		}
		
		System.gc();
		
	}
	
	/**
	 * Gets the active domain.
	 *
	 * @return the active domain
	 */
	public static EditingDomain getActiveDomain() {
	   	IEditorPart editor =  getActiveEditor();
	   	if (editor == null) return null;
	   	return ((GtmEditor) editor).getEditingDomain();
	}
	

	
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
		
		
		
		populateServiceBrands(tool.getCodeLists().getServiceBrands());
		populateUICcountries(tool.getCodeLists().getCountries());
		populateCurrencies(tool.getCodeLists().getCurrencies());
		populateUICLaguages(tool.getCodeLists().getLanguages());

		//add generic reduction cards
		createGenericReductionCards(tool.getGeneralTariffModel().getFareStructure(), tool);
		
	}
	
	
	public static void createGenericReductionCards(FareStructure fareStructure, GTMTool tool) {
		createReductionCard(fareStructure,GenericReductionCards.UIC_EURAIL_1.getName(),"Eurail Pass 1st Class", findCarrier(tool,"9902")); //$NON-NLS-1$ //$NON-NLS-2$
		createReductionCard(fareStructure,GenericReductionCards.UIC_INTERRAIL_1.getName(),"Interrail Pass 1st Class", findCarrier(tool,"9902"));		 //$NON-NLS-1$ //$NON-NLS-2$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_DUTY_1.getName(),"FIP duty 1st Class", null);			 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_LEISURE_FREE_1.getName(),"FIP leasure 1st Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_LEISURE_REDU_1.getName(),"FIP leasure reduction 1st Class", null); //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RAILPLUS_1.getName(),"RailPlus 1st Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_11.getName(),"Rail Inclusive Tours 1 1st Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_21.getName(),"Rail Inclusive Tours 2 1st Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_31.getName(),"Rail Inclusive Tours 3 1st Class", null);	 //$NON-NLS-1$
	
		createReductionCard(fareStructure,GenericReductionCards.UIC_EURAIL_2.getName(),"Eurail Pass 2nd Class", findCarrier(tool,"9902")); //$NON-NLS-1$ //$NON-NLS-2$
		createReductionCard(fareStructure,GenericReductionCards.UIC_INTERRAIL_2.getName(),"Interrail Pass 2nd Class", findCarrier(tool,"9902"));		 //$NON-NLS-1$ //$NON-NLS-2$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_DUTY_2.getName(),"FIP duty 2nd Class", null);			 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_LEISURE_FREE_2.getName(),"FIP leasure 2nd Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_LEISURE_REDU_2.getName(),"FIP leasure reduction 2nd Class", null); //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RAILPLUS_2.getName(),"RailPlus 2nd Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_12.getName(),"Rail Inclusive Tours 1 2nd Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_22.getName(),"Rail Inclusive Tours 2 2nd Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_32.getName(),"Rail Inclusive Tours 3 2nd Class", null);	 //$NON-NLS-1$

		ReductionCard eu = createReductionCard(fareStructure,GenericReductionCards.UIC_EU_DISABILITY_CARD.getName(),"EU Disability Card", null);	 //$NON-NLS-1$
		ReductionCard c = createReductionCard(fareStructure,GenericReductionCards.UIC_INT_DISABILITY_CARD.getName(),"International Disability Card", null);	 //$NON-NLS-1$
		c.getIncludedReductionCards().add(eu);
		
		createReductionCard(fareStructure,GenericReductionCards.UIC_EURAIL.getName(),"Eurail Pass - deprecated-use class specific cards", findCarrier(tool,"9902")); //$NON-NLS-1$ //$NON-NLS-2$
		createReductionCard(fareStructure,GenericReductionCards.UIC_INTERRAIL.getName(),"Interrail Pass - deprecated-use class specific cards", findCarrier(tool,"9902"));		 //$NON-NLS-1$ //$NON-NLS-2$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_DUTY.getName(),"FIP duty - deprecated-use class specific cards", null);			 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_LEISURE_FREE.getName(),"FIP leasure - deprecated-use class specific cards", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_LEISURE_REDU.getName(),"FIP leasure reduction - deprecated-use class specific cards", null); //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RAILPLUS.getName(),"RailPlus - deprecated-use class specific cards", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_1.getName(),"Rail Inclusive Tours 1 - deprecated-use class specific cards", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_2.getName(),"Rail Inclusive Tours 2 - deprecated-use class specific cards", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_3.getName(),"Rail Inclusive Tours 3 - deprecated-use class specific cards", null);	 //$NON-NLS-1$

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
	
	public static boolean isStandardTextId(String id) {
		
		if (id == null || id.length() == 0) return true;
		
		for (GenericReductionCards card : GenericReductionCards.values()) {
			
			if (card.getName().equals(id)) {
				return true;
			}
			
		}
		
		return false;
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
		
		return params;
	}


	/**
	 * Find carrier.
	 *
	 * @param tool the tool
	 * @param code the code
	 * @return the carrier
	 */
	private static Carrier findCarrier(GTMTool tool, String code) {
		
		if (tool == null || tool.getCodeLists() == null || tool.getCodeLists() == null) {
			return null;
		}
		
		for (Carrier carrier : tool.getCodeLists().getCarriers().getCarriers()){
			if (carrier.getCode().equalsIgnoreCase(code)) {
				return carrier;				
			}
		}
		return null;
	}


	/**
	 * Creates the reduction card.
	 *
	 * @param fareStructure the fare structure
	 * @param id the id
	 * @param name the name
	 * @param carrier the carrier
	 */
	private static ReductionCard createReductionCard(FareStructure fareStructure, String id, String name, Carrier carrier) {
		
		Text text =  GtmFactory.eINSTANCE.createText();
		ReductionCard card =  GtmFactory.eINSTANCE.createReductionCard();
		text.setTextUTF8(name);
		text.setShortTextUTF8(name);
		text.setTextICAO(name);
		text.setShortTextICAO(name);
		text.setStandardText(true);
		//no export of the text
		card.setCardIssuer(carrier);
		card.setId(id);
		card.setName(text);
		//no export of the card
		card.setUicCode(true);
		fareStructure.getTexts().getTexts().add(text);
		fareStructure.getReductionCards().getReductionCards().add(card);
		
		return card;
	}



	/**
	 * Creates the populate countries command.
	 *
	 * @param domain the domain
	 * @param codeLists the code lists
	 * @return the command
	 */
	public Command createPopulateCountriesCommand(EditingDomain domain, CodeLists codeLists) {

		
		Countries countries = GtmFactory.eINSTANCE.createCountries();
		populateUICcountries(countries);
		
		SetCommand command = new SetCommand(domain, countries, GtmPackage.Literals.CODE_LISTS__COUNTRIES, countries);
		
		
		return command;
	}
	
	/**
	 * Populate UI ccountries.
	 *
	 * @param countries the countries
	 */
	public static void populateUICcountries(Countries countries){ 
		
		countries.getCountries().add(createCountry(10,"Finland","FI",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(20,"Russian Federation","RU",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(21,"Belarus","BY",CharacterSet.LATIN5_ISO88599)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(22,"Ukraine","UA",CharacterSet.LATIN5_ISO88599)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(23,"Moldova, Republic of","MD",CharacterSet.LATIN5_ISO88599)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(24,"Lithuania","LT",CharacterSet.LATIN4_ISO88594)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(25,"Latvia","LV",CharacterSet.LATIN4_ISO88594)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(26,"Estonia","EE",CharacterSet.LATIN4_ISO88594)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(27,"Kazakhstan"," KZ",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(28,"Georgia","GE",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(29,"Uzbekistan","UZ",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(30,"Korea, Democratic People's Republic of","KP",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(31,"Mongolia","MN",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(32,"Vietnam","VN",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(33,"China","CN",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(40,"Cuba","CU",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(41,"Albania","AL",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(42,"Japan","JP",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(43,"GYSEV temporary irregular code not to be used beyond mid 2022","HU",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(44,"Bosnia and Herzegovina, Serb Republic of ","BA",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(50,"Bosnia and Herzegovina, Muslim-Croat Federation of","BA",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(51,"Poland","PL",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(52,"Bulgaria"," BG",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(53,"Romania","RO",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(54,"Czech Republic","CZ",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(55,"Hungary","HU",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(56,"Slovakia","SK",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(57,"Azerbaijan","AZ",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(58,"Armenia","AM",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(59,"Kyrgyzstan","KG",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(60,"Ireland","IE",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(61,"Korea, Republic of","KR",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(62,"Montenegro","ME",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(65,"Macedonia, The former Yugoslav Republic of","MD",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(66,"Tajikistan","TJ",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(67,"Turkmenistan","TM",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(70,"United Kingdom of Great Britain and Northern Ireland","GB",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(71,"Spain","ES",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(72,"Serbia","RS",CharacterSet.LATIN2_ISO88592));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(73,"Greece","GR",CharacterSet.LATIN7_ISO885913)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(74,"Sweden","SE",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(75,"Turkey","TR",CharacterSet.LATIN5_ISO88599));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(76,"Norway","NO",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(78,"Croatia","HR",CharacterSet.LATIN2_ISO88592));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(79,"Slovenia","SI",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(80,"Germany","DE",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(81,"Austria","AT",CharacterSet.LATIN1_ISO88591));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(82,"Luxemburg","LU",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(83,"Italy","IT",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(84,"Netherlands","NL",CharacterSet.LATIN1_ISO88591));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(85,"Switzerland","CH",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(86,"Denmark","DK",CharacterSet.LATIN1_ISO88591));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(87,"France","FR",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(88,"Belgium","BE",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(90,"Egypt","EG",CharacterSet.LATINARABIC_ISO88596)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(91,"Tunesia","TN",CharacterSet.LATINARABIC_ISO88596)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(92,"Algeria","DZ",CharacterSet.LATINARABIC_ISO88596)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(93,"Morocco","MA",CharacterSet.LATINARABIC_ISO88596)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(94,"Portugal","PT",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(95,"Israel","IL",CharacterSet.LATINHEBREW_ISO88598));			 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(96,"Iran, Islamic Republic of","IR",CharacterSet.LATINARABIC_ISO88596));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(97,"Syrian Arab Republic","SY",CharacterSet.LATINARABIC_ISO88596));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(98,"Lebanon","LB",CharacterSet.LATINARABIC_ISO88596));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(99,"Iraq","IQ",CharacterSet.LATINARABIC_ISO88596));	 //$NON-NLS-1$ //$NON-NLS-2$
		
	}
	
	/**
	 * Populate UIC laguages.
	 *
	 * @param languages the languages
	 */
	public static void populateUICLaguages(Languages languages){
		
		languages.getLanguages().add(createLanguage("de", "German")); //$NON-NLS-1$ //$NON-NLS-2$
		languages.getLanguages().add(createLanguage("ru", "Russian")); //$NON-NLS-1$ //$NON-NLS-2$
		languages.getLanguages().add(createLanguage("fr", "French"));  //$NON-NLS-1$ //$NON-NLS-2$
		languages.getLanguages().add(createLanguage("it", "Italian")); //$NON-NLS-1$ //$NON-NLS-2$
		languages.getLanguages().add(createLanguage("en", "English"));	//$NON-NLS-1$ //$NON-NLS-2$
		
	}
	
	/**
	 * Creates the language.
	 *
	 * @param code the code
	 * @param name the name
	 * @return the language
	 */
	public static Language createLanguage(String code, String name) {
		Language language = GtmFactory.eINSTANCE.createLanguage();
		language.setCode(code);
		language.setName(name);
		return language;
	}


	/**
	 * Creates the country.
	 *
	 * @param code the code
	 * @param name the name
	 * @param ISOcodeA2 the IS ocode A 2
	 * @param latin1Iso88591 
	 * @return the country
	 */
	public static Country createCountry(int code, String name, String ISOcodeA2, CharacterSet charSet) {		
		Country country = GtmFactory.eINSTANCE.createCountry();
		country.setCode(code);
		country.setName(name);
		country.setISOcode(ISOcodeA2);
		country.setDefaultCharacterSet(charSet);
		return country;
	}
	
	/**
	 * Populate currencies.
	 *
	 * @param currencies the currencies
	 */
	public static void populateCurrencies(Currencies currencies) {
		
		Currency currency = GtmFactory.eINSTANCE.createCurrency();
		currency.setIsoCode("EUR"); //$NON-NLS-1$
		currency.setName(NationalLanguageSupport.GtmUtils_149);		
		currencies.getCurrencies().add(currency);
	}
	
	/**
	 * Populate service brands.
	 *
	 * @param brands the brands
	 */
	public static void populateServiceBrands(ServiceBrands brands) {
		
	}
	
	/**
	 * Sets the fare ids.
	 *
	 * @param tool the tool
	 * @param domain the domain
	 * @return the compound command
	 */
	public static CompoundCommand setFareIds(GTMTool tool, EditingDomain domain) {
		
		if (tool == null || domain == null) return null;
		
		CompoundCommand command =  new CompoundCommand();

		FareStructure fareStructure = tool.getGeneralTariffModel().getFareStructure();
		
		for (FareElement object : fareStructure.getFareElements().getFareElements()) {
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.FARE_ELEMENT__ID, command);
			}
		}		
		       
        return command;

	}

	/**
	 * Sets the unique ids of contraints and fares.
	 *
	 * @param tool the tool
	 * @param domain the domain
	 * @return the compound command
	 */
	public static CompoundCommand setIds(GTMTool tool, EditingDomain domain) {
		
		if (tool == null || domain == null) return null;
		
		CompoundCommand command =  new CompoundCommand();
		
		FareStructure fareStructure = tool.getGeneralTariffModel().getFareStructure();
		
		String baseName = tool.getGeneralTariffModel().getDelivery().getProvider().getCode();
		baseName = baseName +"_"+ tool.getGeneralTariffModel().getDelivery().getId()+"_"; //$NON-NLS-1$ //$NON-NLS-2$
		
		String listName = baseName;
				
		listName = baseName + "A_"; //$NON-NLS-1$
		int i = 0;
		for (AfterSalesRule object : fareStructure.getAfterSalesRules().getAfterSalesRules()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.AFTER_SALES_RULE__ID, command, listName,i);
			}
		}
		
		listName = baseName + "B_"; //$NON-NLS-1$
		i = 0;
		for (Calendar object : fareStructure.getCalendars().getCalendars()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.CALENDAR__ID, command, listName,i);
			}
		}

		listName = baseName + "C_"; //$NON-NLS-1$
		i = 0;
		for (CarrierConstraint object : fareStructure.getCarrierConstraints().getCarrierConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.CARRIER_CONSTRAINT__ID, command, listName,i);
			}
		}
		
		listName = baseName + "D_"; //$NON-NLS-1$
		i = 0;		
		for (CombinationConstraint object : fareStructure.getCombinationConstraints().getCombinationConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.COMBINATION_CONSTRAINT__ID, command, listName,i);
			}
		}
		
		listName = baseName + "E_"; //$NON-NLS-1$
		i = 0;
		for (ConnectionPoint object : fareStructure.getConnectionPoints().getConnectionPoints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.CONNECTION_POINT__ID, command, listName,i);
			}
		}
		
		for (FulfillmentConstraint object : fareStructure.getFulfillmentConstraints().getFulfillmentConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.FULFILLMENT_CONSTRAINT__ID, command, listName,i);
			}
		}
		
		listName = baseName + "G_"; //$NON-NLS-1$
		i = 0;
		for (PassengerConstraint object : fareStructure.getPassengerConstraints().getPassengerConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.PASSENGER_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "H_"; //$NON-NLS-1$
		i = 0;
		for (PersonalDataConstraint object : fareStructure.getPersonalDataConstraints().getPersonalDataConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.PERSONAL_DATA_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "I_"; //$NON-NLS-1$
		i = 0;
		for (Price object : fareStructure.getPrices().getPrices()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.PRICE__ID, command, listName,i);
			}
		}		
		
		String issuer = tool.getGeneralTariffModel().getDelivery().getProvider().getCode();
		i = 0;
		for (ReductionCard card : fareStructure.getReductionCards().getReductionCards()) {
			i++;
			String issuerR = issuer;
			if (card.getCardIssuer() != null) {
				issuerR = card.getCardIssuer().getCode();
			}
			String oldId = card.getId();
			if (card.getId() == null || !card.getId().startsWith("UIC_")) {
				//non UIC standard card definition
				if (card.getId() == null || card.getId().isEmpty()) {
					setId(domain, card,GtmPackage.Literals.PERSONAL_DATA_CONSTRAINT__ID, command, issuerR + "_",i);
					GtmUtils.writeConsoleWarning("Reduction Card Id was missing. Set to: " + card.getId(), null);
				} else {
					if (card.getId() != null && !card.getId().startsWith(issuerR)) {
						StringBuilder sb = new StringBuilder();
						sb.append(issuerR).append("_");
						sb.append(card.getId().replace(' ','_'));
						SetCommand cmd = new SetCommand(domain, card,GtmPackage.Literals.REDUCTION_CARD__ID, sb.toString()); 
						if (cmd.canExecute()) {
							command.append(cmd);
						}
					} else {
						StringBuilder sb = new StringBuilder();
						sb.append(card.getId().replace(' ','_'));
						SetCommand cmd = new SetCommand(domain, card,GtmPackage.Literals.REDUCTION_CARD__ID, sb.toString()); 
						if (cmd.canExecute()) {
							command.append(cmd);
						}
					}
					if (!card.getId().equals(oldId)) {
						GtmUtils.writeConsoleWarning("Reduction Card Id was corrected. Set to: " + card.getId(), null);
					}
				}
			}
		}		
		
		listName = baseName + "K_"; //$NON-NLS-1$
		i = 0;
		for (ReductionConstraint object : fareStructure.getReductionConstraints().getReductionConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.REDUCTION_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		for (RegionalConstraint object : fareStructure.getRegionalConstraints().getRegionalConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.REGIONAL_CONSTRAINT__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "L_"; //$NON-NLS-1$
		i = 0;
		for (ReservationParameter object : fareStructure.getReservationParameters().getReservationParameters()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.RESERVATION_PARAMETER__ID, command, listName,i);
			}
		}			
		
		listName = baseName + "M_"; //$NON-NLS-1$
		i = 0;
		for (SalesAvailabilityConstraint object : fareStructure.getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.SALES_AVAILABILITY_CONSTRAINT__ID, command, listName,i);
			}
		}	
		
		
		listName = baseName + "N_"; //$NON-NLS-1$
		i = 0;
		for (ServiceConstraint object : fareStructure.getServiceConstraints().getServiceConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.SERVICE_CONSTRAINT__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "O_"; //$NON-NLS-1$
		i = 0;
		for (ServiceLevel object : fareStructure.getServiceLevelDefinitions().getServiceLevelDefinition()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.SERVICE_LEVEL__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "P_"; //$NON-NLS-1$
		i = 0;
		for (Text object : fareStructure.getTexts().getTexts()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.TEXT__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "Q_"; //$NON-NLS-1$
		i = 0;
		for (TravelValidityConstraint object : fareStructure.getTravelValidityConstraints().getTravelValidityConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "R_"; //$NON-NLS-1$
		i = 0;
		for (FareStationSetDefinition object : fareStructure.getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.FARE_STATION_SET_DEFINITION__ID, command, listName,i);
			}
		}						

		listName = baseName + "S_"; //$NON-NLS-1$
		i = 0;
		for (FareConstraintBundle object : fareStructure.getFareConstraintBundles().getFareConstraintBundles()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__ID, command, listName,i);
			}
		}
		
		listName = baseName + "T_"; //$NON-NLS-1$
		i = 0;
		for (TotalPassengerCombinationConstraint object : fareStructure.getTotalPassengerCombinationConstraints().getTotalPassengerCombinationConstraint()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__ID, command, listName,i);
			}
		}
		
        return command;
		
	}

	
	/**
	 * Sets the id.
	 *
	 * @param domain the domain
	 * @param object the object
	 * @param feature the feature
	 * @param command the command
	 * @param listName the list name
	 * @param index the index
	 */
	private static void setId(EditingDomain domain, EObject object, EStructuralFeature feature, CompoundCommand command, String listName, int index) {
		SetCommand cmd = new SetCommand(domain, object,feature, listName+"_"+Integer.toString(index)); //$NON-NLS-1$
		if (cmd.canExecute()) {
			command.append(cmd);
		}
	}

	/**
	 * Sets the id.
	 *
	 * @param domain the domain
	 * @param object the object
	 * @param feature the feature
	 * @param command the command
	 */
	private static void setId(EditingDomain domain, EObject object, EStructuralFeature feature, CompoundCommand command) {
		SetCommand cmd = new SetCommand(domain, object,feature, EcoreUtil.generateUUID());
		if (cmd.canExecute()) {
			command.append(cmd);
		}
	}
	
	
	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		
		Bundle bundle = Platform.getBundle(GtmEditorPlugin.PLUGIN_ID);
		URL fileURL = bundle.getEntry(path); //$NON-NLS-1$
		return ImageDescriptor.createFromURL(fileURL);
	}
	
	/**
	 * Clear command stack and mark it as dirty.
	 *
	 * @param domain the domain
	 */
	public static void clearCommandStack(EditingDomain domain) {
		//clears the command stack to reduce the memory footprint
		boolean isDirty = false;
		if (domain.getCommandStack().getMostRecentCommand() != null) {
			isDirty = true;
		}
		domain.getCommandStack().flush();
		System.gc();
		if (isDirty) {
			domain.getCommandStack().execute(new DirtyCommand());
		}
	}
	
	/**
	 * Clear command stack and mark it as dirty.
	 */
	public static void clearCommandStack() {
		//clears the command stack to reduce the memory footprint
		boolean isDirty = false;
		if (GtmUtils.getActiveDomain().getCommandStack().getMostRecentCommand() != null) {
			isDirty = true;
		}
		GtmUtils.getActiveDomain().getCommandStack().flush();
		System.gc();
		if (isDirty) {
			GtmUtils.getActiveDomain().getCommandStack().execute(new DirtyCommand());
		}
	}
	
	


	/**
	 * To printable asc II.
	 *
	 * @param text the text
	 * @return the string
	 */
	public static String toPrintableAscII(String text) {
        // strips off all non-ASCII characters
        text = text.replaceAll("[^\\x00-\\x7F]", ""); //$NON-NLS-1$ //$NON-NLS-2$
 
        // erases all the ASCII control characters
        text = text.replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", ""); //$NON-NLS-1$ //$NON-NLS-2$
         
        // removes non-printable characters from Unicode
        return text.replaceAll("\\p{C}", ""); //$NON-NLS-1$ //$NON-NLS-2$

	}
	
	/**
	 * Limit string length.
	 *
	 * @param s the s
	 * @param maxChar the max char
	 * @return the string
	 */
	public static String limitStringLength(String s, int maxChar) {
		if (s == null) return " "; //$NON-NLS-1$
		return s.substring(0, Math.min(maxChar, s.length()));
	}

	/**
	 * Limit string length with console entry.
	 *
	 * @param s the s
	 * @param maxChar the max char
	 * @param editor the editor
	 * @param text the text
	 * @return the string
	 */
	public static String limitStringLengthWithConsoleEntry(String s, int maxChar, GtmEditor editor, String text) {
		if (s == null) return " "; //$NON-NLS-1$
		if (s.length() <= maxChar) return s;
		
		
		String truncated = s.substring(0, Math.min(maxChar, s.length()));
		GtmUtils.writeConsoleError("text" + " truncated:" + s + " -- " + truncated, editor);//$NON-NLS-1$ //$NON-NLS-3$
		return truncated;
	}
	
	/**
	 * Import station.
	 *
	 * @param filter the filter
	 * @param country the country
	 * @return true, if successful
	 */
	public static boolean importStation(String filter, int country) {
		if (country < 1 || country > 99) return false;
		
		if (filter != null && filter.trim().length() > 0) {
			if (!filter.contains(String.valueOf(country))) return false;
		}
		
		String filterP = PreferencesAccess.getStringFromPreferenceStore(PreferenceConstants.P_IMPORT_CONTRY_FILTER);
		
		if (filterP != null && filterP.trim().length() > 0 ) {
			if (!filterP.contains(String.valueOf(country))) return false;
		}		
		
		return true;
		
	}
	
	/**
	 * Gets the station map.
	 *
	 * @param tool the tool
	 * @return the station map
	 */
	public static HashMap<Integer,Station> getStationMap(GTMTool tool)	{
		
	    if (tool == null || tool.getConversionFromLegacy() == null || tool.getConversionFromLegacy().getParams() == null )	{
	    	return null;
	    }
		
		HashMap<Integer,Station> stations = new HashMap<Integer,Station>();
	
		for (Station station : tool.getCodeLists().getStations().getStations()) {
			try {
				stations.put(Integer.valueOf(Integer.parseInt(station.getCode()) + station.getCountry().getCode() * 100000 ), station);
			} catch (Exception e){
				//do nothing 
			}
		}
		return stations;
	}
	
	/**
	 * Gets the station code.
	 *
	 * @param s the s
	 * @return the station code
	 */
	public static String getStationCode(Station s) {
		String code = String.format("%02d%5s", s.getCountry().getCode(),s.getCode());
		code.replace(' ','0');		
		return code;
	}
	
	
	/**
	 * Write console error.
	 *
	 * @param message the message
	 * @param editor the editor
	 */
	public static void writeConsoleError(String message, GtmEditor editor) {
		
		if (message == null || message.length() == 0) {
			return;
		}
		try {
			if (editor == null) {
				Display display = getDisplay();
				if (display == null) return;
				display.asyncExec(() -> {
					ConsoleUtil.printError(NationalLanguageSupport.ConverterFromLegacy_53,"Error: " + message);
				});	
			} else {
				editor.getSite().getShell().getDisplay().asyncExec(() -> {
					ConsoleUtil.printError(NationalLanguageSupport.ConverterFromLegacy_53,"Error: " +  message);
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Display async error message.
	 *
	 * @param e the e
	 * @param text the text
	 */
	public static void displayAsyncErrorMessage(Exception e , String text) {
			
		GtmEditor editor = GtmUtils.getActiveEditor();
		
		GtmUtils.writeConsoleError(text + " - " + e.getMessage(), editor);

		Display display = getDisplay();
		
		final Shell shell =  display.getActiveShell();
		
			
		if (shell != null) {
			display.asyncExec(() -> {
				MessageBox dialog =  new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
				dialog.setText(text);
				if (e != null && e.getMessage() != null) {
					dialog.setMessage(e.getMessage());
				}
				dialog.open(); 
				e.printStackTrace();
				GtmEditorPlugin.INSTANCE.log(e);
				return;
			});	
		}
	}
	
	/**
	 * Display async info message.
	 *
	 * @param text the text
	 * @param details the details
	 */
	public static void displayAsyncInfoMessage(String text, String details) {
		
		GtmEditor editor = GtmUtils.getActiveEditor();

		Display display = getDisplay();
		final Shell shell1 =  editor.getSite().getShell();
			
		if (display != null) {
			display.asyncExec(() -> {
				MessageBox dialog =  new MessageBox(shell1, SWT.ICON_INFORMATION | SWT.OK);
				dialog.setText(text);
				dialog.setMessage(details);
				GtmUtils.writeConsoleInfo(text + " - " + details, editor);
				dialog.open(); 
				return;
			});	
		}
	}

	
	/**
	 * Gets the display.
	 *
	 * @return the display
	 */
	public static Display getDisplay() {
		GtmEditor e = GtmUtils.getActiveEditor();
		Display display = null;
		if (e != null) {
			display = e.getSite().getShell().getDisplay();
		} else {
			display = Display.getDefault();
		}
		return display;
	}
	
	/**
	 * Write console info.
	 *
	 * @param message the message
	 * @param editor the editor
	 */
	public static void writeConsoleInfo(String message, GtmEditor editor) {
		if (message == null || message.length() == 0) {
			return;
		}
		
		try {
			if (editor == null) {
				Display display = getDisplay();
				if (display == null) return;
				display.asyncExec(() -> {
					ConsoleUtil.printInfo(NationalLanguageSupport.ConverterFromLegacy_53,"Info: " + message);
				});	
			} else {
				editor.getSite().getShell().getDisplay().asyncExec(() -> {
					ConsoleUtil.printInfo(NationalLanguageSupport.ConverterFromLegacy_53,"Info: " +  message);
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Write console warning.
	 *
	 * @param message the message
	 * @param editor the editor
	 */
	public static void writeConsoleWarning(String message, GtmEditor editor) {
		if (message == null || message.length() == 0) {
			return;
		}
		
		try {
			if (editor == null) {
				Display display = getDisplay();
				if (display == null) return;
				display.asyncExec(() -> {
					ConsoleUtil.printWarning(NationalLanguageSupport.ConverterFromLegacy_53,"Warning: " +  message);
				});					
			} else {
				editor.getSite().getShell().getDisplay().asyncExec(() -> {
					ConsoleUtil.printWarning(NationalLanguageSupport.ConverterFromLegacy_53,"Warning: " +  message);
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	
	/**
	 * Checks if is referenced.
	 *
	 * @param object the object
	 * @param tree the tree
	 * @return true, if is referenced
	 */
	public static boolean isReferenced(EObject object, EObject tree) {
		
		if (object == null || tree == null) return false;
		
		TreeIterator<EObject> it = tree.eAllContents();
		
		while (it.hasNext()) {
			EObject next = it.next();
			
			EList<EObject> crossReferences = next.eCrossReferences();
			
			if (crossReferences.contains(object)) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Gets the label text for an eObject.
	 *
	 * @param object the object
	 * @return the label text
	 */
	public static String getLabelText(EObject object) {
		
		if (object == null) return "";
		
		GtmItemProviderAdapterFactory factory = new GtmItemProviderAdapterFactory();
		if(factory.isFactoryForType(IItemLabelProvider.class)){
			IItemLabelProvider labelProvider = (IItemLabelProvider)	factory.adapt(object, IItemLabelProvider.class);
			if(labelProvider != null){
				return labelProvider.getText(object);
			}
		}
	
		return null;
	}
	
	/**
	 * Gets the euro cent.
	 *
	 * @param f the f
	 * @return the euro cent
	 */
	public static int getEuroCent(float f) {
		BigDecimal value = new BigDecimal(Float.toString(f));
		BigDecimal amount = value.multiply(oneHundred);
		return amount.intValue();
	}
	
	/**
	 * Gets the euro from cent.
	 *
	 * @param i the i
	 * @return the euro from cent
	 */
	public static float getEuroFromCent(int i) {
		BigDecimal value = new BigDecimal(i);
		value.setScale(2);
		BigDecimal amount = value.divide(oneHundred);
		return amount.floatValue();
	}
	
	 public static String getStackTrace(Throwable aThrowable) {
		    final Writer result = new StringWriter();
		    final PrintWriter printWriter = new PrintWriter(result);
		    aThrowable.printStackTrace(printWriter);
		    return result.toString();
	 }
	
	public static void writeConsoleStackTrace(Exception e, GtmEditor editor){
		if (e == null) return;
		
		String stackTrace = getStackTrace(e);
		GtmUtils.writeConsoleError(stackTrace, editor);
		
	}
	
	public static BigDecimal round(float amount, int scale, RoundingMode mode, int radix) {
		
		String amountS = Float.toString(amount);
		if (radix == 10) {
			return new BigDecimal(amountS).setScale(scale, mode);
		} else {
			float value = amount * radix;
			String valueS = Float.toString(value);
			BigDecimal bd = new BigDecimal(valueS).setScale(scale - 1, mode);
			float v = bd.floatValue() / radix;
			String vS = Float.toString(v);
			BigDecimal bf = new BigDecimal(vS).setScale(scale, mode);
			return bf;
		}
	}
	
	public static Charset getSupportedCharset(CharacterSet set, GtmEditor editor) {
		
		if (set == null) {
			return StandardCharsets.ISO_8859_1;
		} else if (set.equals(CharacterSet.LATIN10_ISO885916)) {
			return getCharSet("ISO8859_16", editor);
		} else if (set.equals(CharacterSet.LATIN1_ISO88591)) {
			return StandardCharsets.ISO_8859_1;
		} else if (set.equals(CharacterSet.LATIN2_ISO88592)) {
			return getCharSet("ISO8859_2", editor);
		} else if (set.equals(CharacterSet.LATIN3_ISO88593)) {
			return getCharSet("ISO8859_3", editor);
		} else if (set.equals(CharacterSet.LATIN4_ISO88594)) {
			return getCharSet("ISO8859_4", editor);
		} else if (set.equals(CharacterSet.LATIN5_ISO88599)) {
			return getCharSet("ISO8859_9", editor);
		} else if (set.equals(CharacterSet.LATIN7_ISO885913)) {
			return getCharSet("ISO8859_13", editor);
		} else if (set.equals(CharacterSet.LATIN9_ISO885915)) {
			return getCharSet("ISO8859_15", editor);
		} else if (set.equals(CharacterSet.LATINARABIC_ISO88596)) {
			return getCharSet("ISO8859_6", editor);
		} else if (set.equals(CharacterSet.LATINGREEK_ISO88597)) {
			return getCharSet("ISO8859_7", editor);
		} else if (set.equals(CharacterSet.LATINHEBREW_ISO88598)) {
			return getCharSet("ISO8859_8", editor);
		} else if (set.equals(CharacterSet.LATINKYRILLIC_ISO88595)) {
			return getCharSet("ISO8859_5", editor);
		} else if (set.equals(CharacterSet.RUSSIAN_KOI8R)) {
			return getCharSet("KOI8_R", editor);
		} else if (set.equals(CharacterSet.UKRAINIAN_KOI8U)) {
			return getCharSet("KOI8_U", editor);
		} else if (set.equals(CharacterSet.USASCII)) {
			return StandardCharsets.US_ASCII;
		} 
		
		return StandardCharsets.ISO_8859_1;
	}

	private static Charset getCharSet(String charset,GtmEditor editor) {
		
		Charset set = null;
		try {
			set = Charset.forName(charset);
		} catch (Exception e) {
			return StandardCharsets.ISO_8859_1;
		}
		if (set == null) {
			String message = "local character set " + charset + " not supported using ISO-8859-1 instead - local station names might be corrupted in the export";
			GtmUtils.writeConsoleInfo(message, editor);
			return StandardCharsets.ISO_8859_1;
		} else {
			return set;
		}
	}
	
	public static String convertUtf8ToCharSet(String s, Charset set) {
		try {
			byte[] original = s.getBytes("UTF-8");
			return  new String(original, set);		
		} catch (UnsupportedEncodingException e) {
			return s;
		}
	}

	/*
	 * find the country that occurs most often in the station list
	 */
	public static Country getRecommendedCountry(GTMTool tool) {
		
		if (tool.getGeneralTariffModel().getFareStructure() == null ||
			tool.getGeneralTariffModel().getFareStructure().getStationNames() == null ||	
			tool.getGeneralTariffModel().getFareStructure().getStationNames().getStationName() == null ||
			tool.getGeneralTariffModel().getFareStructure().getStationNames().getStationName().isEmpty()) {
			return null;
		}
		
		HashMap<Country,Integer> countryCounter = new HashMap<Country,Integer>();
		
		for (Station s : tool.getGeneralTariffModel().getFareStructure().getStationNames().getStationName()) {
			
			if (s.getCountry() != null) {
			
				Integer i = countryCounter.get(s.getCountry());
				if (i == null) {
					countryCounter.put(s.getCountry() , new Integer(1));
				} else {
					i++;
					countryCounter.put(s.getCountry() , new Integer(i));
				}
			}
		}
		Set<Entry<Country,Integer>> set = countryCounter.entrySet();
		Iterator<Entry<Country, Integer>> it = set.iterator();
		Entry<Country,Integer> mainEntry= it.next();
		if (mainEntry == null) return null;
		
		while (it.hasNext()) {
			Entry<Country,Integer> next = it.next();
			if (next.getValue().intValue() > mainEntry.getValue().intValue()) {
				mainEntry = next;
			}
		}
		return mainEntry.getKey();
	}
	
	
	public synchronized static String utf2ascii(String s){
		
		if (s == null || s.length() == 0) return null;
		
		final StringBuffer sb = new StringBuffer( s.length() * 2 );

		final StringCharacterIterator iterator = new StringCharacterIterator( s );

		char ch = iterator.current();

		while( ch != StringCharacterIterator.DONE ){
		   if(Character.getNumericValue(ch)>0){
		    sb.append( ch );
		   } else {
		    if(Character.toString(ch).equals("Ê")){sb.append("E");}
		    else if(Character.toString(ch).equals("È")){sb.append("E");}
		    else if(Character.toString(ch).equals("ë")){sb.append("e");}
		    else if(Character.toString(ch).equals("é")){sb.append("e");}
		    else if(Character.toString(ch).equals("è")){sb.append("e");}
		    else if(Character.toString(ch).equals("è")){sb.append("e");}
		    else if(Character.toString(ch).equals("Â")){sb.append("A");}
		    else if(Character.toString(ch).equals("ä")){sb.append("a");}
		    else if(Character.toString(ch).equals("ß")){sb.append("ss");}
		    else if(Character.toString(ch).equals("Ç")){sb.append("C");}
		    else if(Character.toString(ch).equals("Ö")){sb.append("O");}
		    else if(Character.toString(ch).equals("º")){sb.append("");}
		    else if(Character.toString(ch).equals("Ó")){sb.append("O");}
		    else if(Character.toString(ch).equals("ª")){sb.append("");}
		    else if(Character.toString(ch).equals("º")){sb.append("");}
		    else if(Character.toString(ch).equals("Ñ")){sb.append("N");}
		    else if(Character.toString(ch).equals("É")){sb.append("E");}
		    else if(Character.toString(ch).equals("Ä")){sb.append("A");}
		    else if(Character.toString(ch).equals("Å")){sb.append("A");}
		    else if(Character.toString(ch).equals("ä")){sb.append("a");}
		    else if(Character.toString(ch).equals("Ü")){sb.append("U");}
		    else if(Character.toString(ch).equals("ö")){sb.append("o");}
		    else if(Character.toString(ch).equals("ü")){sb.append("u");}
		    else if(Character.toString(ch).equals("á")){sb.append("a");}
		    else if(Character.toString(ch).equals("Ó")){sb.append("O");}
		    else if(Character.toString(ch).equals("É")){sb.append("E");}
		    else if(Character.toString(ch).equals("Č")){sb.append("C");}
		    else if(Character.toString(ch).equals("ă")){sb.append("a");}
		    else if(Character.toString(ch).equals("ţ")){sb.append("t");}
		    else if(Character.toString(ch).equals("Á")){sb.append("A");}
		    else if(Character.toString(ch).equals("Ž")){sb.append("Z");}
		    else if(Character.toString(ch).equals("ő")){sb.append("o");}
		    else if(Character.toString(ch).equals("ł")){sb.append("l");}
		    else if(Character.toString(ch).equals("ó")){sb.append("o");}
		    else if(Character.toString(ch).equals("ž")){sb.append("z");}
		    else if(Character.toString(ch).equals("š")){sb.append("s");}
		    else if(Character.toString(ch).equals("Ú")){sb.append("U");}
		    else if(Character.toString(ch).equals("ú")){sb.append("u");}
		    else if(Character.toString(ch).equals("ó")){sb.append("o");}
		    else if(Character.toString(ch).equals("ű")){sb.append("u");}		    
		    else {
		     sb.append(ch);
		    }
		   }
		   ch = iterator.next();
		  }
		  
		  byte[] ascii = sb.toString().getBytes(StandardCharsets.US_ASCII); 
		  return new String(ascii);
	}
	
	
	public static void deleteOrphanedObjects(EditingDomain domain, GTMTool tool) {
		
		if (tool == null || domain == null) return;
		
		Map<EObject, Collection<Setting>> ll = EcoreUtil.ExternalCrossReferencer.find(tool);

		for (Entry<EObject,Collection<Setting>> e:  ll.entrySet()) {
			for (Setting s : e.getValue()) {
				EcoreUtil.remove(s,e.getKey());
			}
		}
		return;

	}

	public static void addWorkflowStep(String description, GtmEditor editor) {
		
		WorkflowStep step = GtmFactory.eINSTANCE.createWorkflowStep();
		step.setTime(java.util.Calendar.getInstance().getTime());
		step.setDescription(description);
		
	   	if (editor == null) return;
	   	
	   	EditingDomain domain = ((GtmEditor) editor).getEditingDomain();
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		TreeIterator<EObject> it = resource.getAllContents();
		EObject object = it.next();
		
		if (object == null) return;

		GTMTool tool = null;
		if (object instanceof GTMTool){
			tool = (GTMTool) object;
		} else {
			return;
		}
		
		Command com = null;
		if (tool.getWorkflowHistory() == null) {
			
			WorkflowHistory history = GtmFactory.eINSTANCE.createWorkflowHistory();
			history.getWorkflowSteps().add(step);
			com = SetCommand.create(editor.getEditingDomain(), tool, GtmPackage.Literals.GTM_TOOL__WORKFLOW_HISTORY, history);
			if (com != null && com.canExecute()) {
				editor.getEditingDomain().getCommandStack().execute(com);
			}
		} else {
			
			com = AddCommand.create(editor.getEditingDomain(), tool.getWorkflowHistory(), GtmPackage.Literals.WORKFLOW_HISTORY__WORKFLOW_STEPS, step);
			if (com != null && com.canExecute()) {
				editor.getEditingDomain().getCommandStack().execute(com);
			}
		}
		

				
	}
	
	
	public static Date setTo2359UTC(Date date) {
		
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(date);
		cal.set(java.util.Calendar.HOUR_OF_DAY, 23);
		cal.set(java.util.Calendar.MINUTE, 59);
		cal.set(java.util.Calendar.SECOND, 59);
		Date date2 = cal.getTime();
		
		return date2;
	}
	
	public static Date setTo0000UTC(Date date) {
		
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(date);
		cal.set(java.util.Calendar.HOUR_OF_DAY, 0);
		cal.set(java.util.Calendar.MINUTE, 0);
		cal.set(java.util.Calendar.SECOND, 0);

		return cal.getTime();
	}
	
	public static boolean checkDateOnlyEqual(Date date1, Date date2) {
		
		String d1 = dateFormat.format(date1);
		String d2 = dateFormat.format(date2);
		
		return d1.equals(d2);

	}

}



