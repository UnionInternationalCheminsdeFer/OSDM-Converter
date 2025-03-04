package Gtm.converter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.AfterSalesCondition;
import Gtm.AfterSalesRule;
import Gtm.AfterSalesTemplate;
import Gtm.AlternativeRoute;
import Gtm.BasePriceClassType;
import Gtm.Calendar;
import Gtm.Carrier;
import Gtm.CarrierConstraint;
import Gtm.CarrierConstraints;
import Gtm.ClassicClassType;
import Gtm.ConnectionPoint;
import Gtm.Country;
import Gtm.Currency;
import Gtm.CurrencyPrice;
import Gtm.DataSource;
import Gtm.FareConstraintBundle;
import Gtm.FareElement;
import Gtm.FareStationSetDefinition;
import Gtm.FareStationSetDefinitions;
import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Language;
import Gtm.Legacy108;
import Gtm.Legacy108Memo;
import Gtm.Legacy108Station;
import Gtm.LegacyAccountingIdentifier;
import Gtm.LegacyBorderPoint;
import Gtm.LegacyBorderSide;
import Gtm.LegacyCalculationType;
import Gtm.LegacyConversionType;
import Gtm.LegacyDistanceFare;
import Gtm.LegacyFareDetailMap;
import Gtm.LegacyFareTemplates;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeparateContractSeries;
import Gtm.LegacySeries;
import Gtm.LegacyStationMap;
import Gtm.LegacyStationToServiceConstraintMapping;
import Gtm.LegacyViastation;
import Gtm.NamedCarrierList;
import Gtm.Price;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.RoundingType;
import Gtm.SalesAvailabilityConstraint;
import Gtm.SalesRestriction;
import Gtm.ServiceConstraint;
import Gtm.Station;
import Gtm.StationFareDetailType;
import Gtm.StationNames;
import Gtm.StationSet;
import Gtm.Text;
import Gtm.TimeReferenceType;
import Gtm.TimeUnit;
import Gtm.Translation;
import Gtm.VATDetail;
import Gtm.VatTemplate;
import Gtm.ViaStation;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;
import Gtm.util.StringFormatValidator;
import Gtm.utils.ConversionCleaner;
import Gtm.utils.GtmUtils;
import Gtm.utils.InvolvedTcoFinder;
import Gtm.utils.StationSelector;


/**
 * The Class ConverterFromLegacy.
 */
public class ConverterFromLegacy {
	
	/** The date format. */
	private static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); //$NON-NLS-1$
	
	/** The local stations in the legacy data country. */
	private HashMap<Integer,Station> localStations = new HashMap<Integer,Station>();
	
	/** The legacy stations listed by their legacy code. */
	private HashMap<Integer,Legacy108Station> legacyStations = new HashMap<Integer,Legacy108Station>();
	
	/** The carriers by RCS code. */
	private HashMap<String,Carrier> carriers = new HashMap<String,Carrier>();
	
	/** The carrier constraints. */
	private HashMap<String, CarrierConstraint> carrierConstraints = new HashMap<String,CarrierConstraint>();
	
	/**  The code to fare station set mapping. */
	private HashMap<Integer,FareStationSetDefinition> fareStationSets = new HashMap<Integer,FareStationSetDefinition>();
	
	/**  The border code to connection points mapping. */
	private HashMap<Integer,ConnectionPoint> legacyStationConnectionPoints = new HashMap<Integer,ConnectionPoint>();
	
	/**  The station to connection points mapping for connection points without without border code. */
	private HashMap<Station,ConnectionPoint> singleStationConnectionPoints = new HashMap<Station,ConnectionPoint>();
	
	/**  The connectionPoints with border code. */
	private HashMap<Integer,ConnectionPoint> borderConnectionPoints = new HashMap<Integer,ConnectionPoint>();
	
	
	/**  The connectionPoints with border code. */
	private HashMap<Integer,LegacyBorderPoint> borderPoints = new HashMap<Integer,LegacyBorderPoint>();
	
	/** The local stations in the legacy data country. */
	private HashMap<Integer,Text> memoTexts = new HashMap<Integer,Text>();
	
	/**  The connectionPoints with border code. */
	private HashMap<Date,SalesAvailabilityConstraint> salesAvailabilitiesFromSeries = new HashMap<Date,SalesAvailabilityConstraint>();

	/**  The connectionPoints with border code. */
	private HashMap<FareConstraintBundle,HashSet<FareConstraintBundle>> convertedBundles = new HashMap<FareConstraintBundle,HashSet<FareConstraintBundle>>();

	
	/** The price list. */
	private ArrayList<Price> priceList = new ArrayList<Price>();
	
	/** The after sales rules. */
	private ArrayList<AfterSalesRule> afterSalesRules = new ArrayList<AfterSalesRule>();
	
	/** The regions. */
	private ArrayList<RegionalConstraint> regions = new ArrayList<RegionalConstraint>();
	
	/** The fares. */
	private ArrayList<FareElement> fares = new ArrayList<FareElement>();
	
	/** The price validity ranges. */
	private ArrayList<DateRange> priceValidityRanges = new ArrayList<DateRange>();

	
	/**  The country. */
	private Country myCountry = null;
	
	/** The tool. */
	private GTMTool tool = null;
	
	/** The editing domain. */
	private EditingDomain domain = null;
	
	/** The editor. */
	private GtmEditor editor = null;
	
	
	/**
	 * Instantiates a new converter from legacy.
	 *
	 * @param tool the tool
	 * @param domain the domain
	 * @param editor the editor
	 */
	public ConverterFromLegacy(GTMTool tool, EditingDomain domain, GtmEditor editor) {
		this.tool = tool;
		this.editor = editor;
		this.domain = domain;		
	}
		

	/**
	 * Initialize converter.
	 */
	public void initializeConverter() {
		
		myCountry = tool.getConversionFromLegacy().getParams().getCountry();
		if (myCountry == null) {
			String message = NationalLanguageSupport.ConvertGtm2LegacyAction_CountryMissing;
			GtmUtils.writeConsoleError(message, editor);
			return;
		}
		
		if (tool.getConversionFromLegacy().getParams().getLegacyFareTemplates() == null ||
			tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().isEmpty()){
			String message = NationalLanguageSupport.ConvertLegacy2GtmAction_FareTemplatesMissing;
			GtmUtils.writeConsoleError(message, editor);
			return;
		}
			
		for (Station station : tool.getCodeLists().getStations().getStations()) {
			if (station.getCountry().getCode() == myCountry.getCode()) {
				try {
					if (GtmUtils.isConvertable(station)) {
						//add rail stations only
						localStations.put(Integer.parseInt(station.getCode()), station);
					}
					
				} catch (Exception e){
					String message = "Wrong StationCode: " +station.getCode() + " " + station.getName();
					GtmUtils.writeConsoleError(message, editor);
					return;
				}
			}
		}
		
		for (Carrier carrier : tool.getCodeLists().getCarriers().getCarriers()) {
			carriers.put(carrier.getCode(), carrier);
		}

		for (Legacy108Station legacyStation : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
			legacyStations.put(legacyStation.getStationCode(), legacyStation);
		}
		
		if (tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints() != null) {
			for (LegacyBorderPoint lbp : tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints()) {
				borderPoints.put(lbp.getBorderPointCode(), lbp);
			}
		}	
	}
	
	
	/**
	 * Delete old conversion results.
	 *
	 * @return the number of deleted objects
	 */
	public int deleteOldConversionResults() {
		
		return ConversionCleaner.cleanConversionResult(tool, domain, editor);

	}

	/**
	 * Convert to OSDM model.
	 *
	 * @param monitor the progress monitor
	 * @return the number of fares created
	 */
	public int convertToGtm(IProgressMonitor monitor) {
		
		initializeConverter();
		
		initConversion();
		
		monitor.subTask(NationalLanguageSupport.ConvertLegacy2GtmAction_8);
		FareStationSetDefinitions fareStationSetDefinitions = convertFareStationSets();
		int added = fareStationSetDefinitions.getFareStationSetDefinitions().size();
		
		Command command = SetCommand.create(domain,tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS, fareStationSetDefinitions);
		if (command.canExecute()) {
			GtmUtils.executeAndFlush(command,domain,editor);
		} else {
			added = 0;
		}
		GtmUtils.writeConsoleInfo(NationalLanguageSupport.ConvertLegacy2GtmAction_9 + Integer.toString(added),editor);
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.ConvertLegacy2GtmAction_12);
		StationNames stationNames = convertStationNames();
		command = SetCommand.create(domain, tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__STATION_NAMES, stationNames);
		added = 0;
		if (command != null && command.canExecute()) {
			added = stationNames.getStationName().size();
			GtmUtils.executeAndFlush(command,domain,editor);
		}
		GtmUtils.writeConsoleInfo(NationalLanguageSupport.ConvertLegacy2GtmAction_13 + Integer.toString(added),editor);	
		monitor.worked(1);

		monitor.subTask(NationalLanguageSupport.ConvertLegacy2GtmAction_10);						
		HashSet<ConnectionPoint> connectionPoints = convertBorderPoints();
		added = 0;
		if (!connectionPoints.isEmpty()) {
			Command com = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getConnectionPoints(), GtmPackage.Literals.CONNECTION_POINTS__CONNECTION_POINTS, connectionPoints);
			if  (com != null && com.canExecute()) {
				added = connectionPoints.size();
				GtmUtils.executeAndFlush(com,domain,editor);
			}
		}	
		GtmUtils.writeConsoleInfo(NationalLanguageSupport.ConvertLegacy2GtmAction_11 + Integer.toString(added),editor);	
		monitor.worked(1);
		
		
		monitor.subTask(NationalLanguageSupport.ConvertLegacy2GtmAction_14);
		added = 0;
		HashSet<SalesAvailabilityConstraint> constraints = convertSalesAvailabilities();
		for (SalesAvailabilityConstraint constraint: constraints) {
			command = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getCalendars() , GtmPackage.Literals.CALENDARS__CALENDARS, constraint.getRestrictions().get(0).getSalesDates());
			GtmUtils.executeAndFlush(command,domain,editor);
			command = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints(),GtmPackage.Literals.SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS , constraint);
			GtmUtils.executeAndFlush(command,domain,editor);
		}
		GtmUtils.writeConsoleInfo(NationalLanguageSupport.ConvertLegacy2GtmAction_15 + Integer.toString(added),editor);				
		monitor.worked(1);

		monitor.subTask(NationalLanguageSupport.ConverterFromLegacy_1);
		convertCarrierConstraints(tool);
		if (tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints() == null) {
			CarrierConstraints carrierConstraintList = GtmFactory.eINSTANCE.createCarrierConstraints();
			carrierConstraintList.getCarrierConstraints().addAll(carrierConstraints.values());
			command = SetCommand.create(domain, tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__CARRIER_CONSTRAINTS, carrierConstraintList);
			GtmUtils.executeAndFlush(command,domain,editor);
		} else {
			command = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints(), GtmPackage.Literals.CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS, carrierConstraints.values());
			GtmUtils.executeAndFlush(command,domain,editor);
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.ConverterFromLegacy_3);
		int faresConverted = convertSeries(monitor, priceValidityRanges, regions,priceList, fares, afterSalesRules);
		CompoundCommand com = new CompoundCommand();	
		for (Entry<FareConstraintBundle, HashSet<FareConstraintBundle>> bundleEntry :convertedBundles.entrySet()) {
			FareConstraintBundle bundle = bundleEntry.getKey();
			for (FareConstraintBundle bundle2 : bundleEntry.getValue()) {
				com.append(AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getFareConstraintBundles(), GtmPackage.Literals.FARE_CONSTRAINT_BUNDLES__FARE_CONSTRAINT_BUNDLES, bundle2));
				com.append(AddCommand.create(domain, bundle, GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__CONVERTED_BUNDLES, bundle2));
			}
		}
		GtmUtils.executeAndFlush(com,domain,editor);
		
		if (regions != null && !regions.isEmpty()) {
			command = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints(), GtmPackage.Literals.REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS, regions);
			GtmUtils.executeAndFlush(command,domain,editor);
		}
		monitor.worked(1);
		
		if (priceList != null && !priceList.isEmpty()) {
			command = AddCommand.create(domain,tool.getGeneralTariffModel().getFareStructure().getPrices(), GtmPackage.Literals.PRICES__PRICES, priceList);
			GtmUtils.executeAndFlush(command,domain,editor);
		}
		monitor.worked(1);
		
		if (afterSalesRules != null && !afterSalesRules.isEmpty()) {
			command = AddCommand.create(domain,tool.getGeneralTariffModel().getFareStructure().getAfterSalesRules(), GtmPackage.Literals.AFTER_SALES_RULES__AFTER_SALES_RULES, afterSalesRules);
			GtmUtils.executeAndFlush(command,domain,editor);
		}
		monitor.worked(1);

		if (!memoTexts.isEmpty()) {
			command = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getTexts(), GtmPackage.Literals.TEXTS__TEXTS, memoTexts.values());
			GtmUtils.executeAndFlush(command,domain,editor);
		}
		monitor.worked(1);
		
		if (fares!= null && !fares.isEmpty()) {
			command = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getFareElements(),GtmPackage.Literals.FARE_ELEMENTS__FARE_ELEMENTS , fares);		
			GtmUtils.executeAndFlush(command,domain,editor);
		}
		monitor.worked(1);
		
		cleanConversion();
		
		GtmUtils.deleteOrphanedObjects(domain,tool);
		
		System.gc();
		
		return faresConverted;
	}
	
	


	/**
	 * Inits the conversion.
	 */
	private void initConversion() {
		priceList = new ArrayList<Price>();
		afterSalesRules = new ArrayList<AfterSalesRule>();
		regions = new ArrayList<RegionalConstraint>();
		fares = new ArrayList<FareElement>();
		priceValidityRanges = new ArrayList<DateRange>();	
		carrierConstraints = new HashMap<String,CarrierConstraint>();
		
		checkFareTemplates();
	}
	
	/**
	 * Clean conversion.
	 */
	private void cleanConversion() {
		localStations.clear();
		carriers.clear();
		legacyStations.clear();
		carrierConstraints.clear();
		fareStationSets.clear();
		legacyStationConnectionPoints.clear();
		singleStationConnectionPoints.clear();
		borderConnectionPoints.clear();
		afterSalesRules.clear();
	}


	/**
	 * Convert to OSDM model. Testimplememtation without commands
	 *
	 * @param monitor the progress monitor
	 * @return the number of fares created
	 */
	public int convertToGtmTest(IProgressMonitor monitor) {
		
		initializeConverter();
			
		initConversion();

		FareStationSetDefinitions fareStationSetDefinitions = convertFareStationSets();
		tool.getGeneralTariffModel().getFareStructure().setFareStationSetDefinitions(fareStationSetDefinitions);
				
		StationNames stationNames = convertStationNames();
		tool.getGeneralTariffModel().getFareStructure().setStationNames(stationNames);		
		
		HashSet<ConnectionPoint> connectionPoints = convertBorderPoints();
		tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints().addAll(connectionPoints);

		
		HashSet<SalesAvailabilityConstraint> constraints = convertSalesAvailabilities();
		for (SalesAvailabilityConstraint constraint: constraints) {
			tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars().add(constraint.getRestrictions().get(0).getSalesDates());
			tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints().add(constraint);
		}
		
		convertCarrierConstraints(tool);
		if (tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints() == null) {
			CarrierConstraints carrierConstraintList = GtmFactory.eINSTANCE.createCarrierConstraints();
			carrierConstraintList.getCarrierConstraints().addAll(carrierConstraints.values());
			tool.getGeneralTariffModel().getFareStructure().setCarrierConstraints(carrierConstraintList);
		} else {
			tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints().getCarrierConstraints().addAll(carrierConstraints.values());
		}
		
		int faresConverted = convertSeries(monitor, priceValidityRanges, regions,priceList, fares, afterSalesRules);
		
		for (Entry<FareConstraintBundle, HashSet<FareConstraintBundle>> bundleEntry :convertedBundles.entrySet()) {
			FareConstraintBundle bundle = bundleEntry.getKey();
			for (FareConstraintBundle bundle2 : bundleEntry.getValue()) {
				tool.getGeneralTariffModel().getFareStructure().getFareConstraintBundles().getFareConstraintBundles().add(bundle2);
				bundle.getConvertedBundles().add(bundle2);
			}
		}
		
		if (regions != null && !regions.isEmpty()) {
			tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints().addAll(regions);
		}
		
		if (priceList != null && !priceList.isEmpty()) {
			tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices().addAll(priceList);
		}
		
		if (afterSalesRules != null && !afterSalesRules.isEmpty()) {
			tool.getGeneralTariffModel().getFareStructure().getAfterSalesRules().getAfterSalesRules().addAll(afterSalesRules);
		}

		if (!memoTexts.isEmpty()) {
			tool.getGeneralTariffModel().getFareStructure().getTexts().getTexts().addAll(memoTexts.values());
		}
		
		if (fares!= null && !fares.isEmpty()) {
			tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements().addAll(fares);		
		}	
		
		cleanConversion();
				
		return faresConverted;
	}

	/**
	 * Convert carrier constraints.
	 *
	 * @param tool2 the tool 2
	 */
	private void convertCarrierConstraints(GTMTool tool2) {
		for (LegacySeries series: tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			try {
				if (carrierConstraints.get(series.getCarrierCode()) == null)  {
					
					CarrierConstraint constraint = createCarrierConstraint(tool,series.getCarrierCode());
					
					if (constraint != null) {
						carrierConstraints.put(series.getCarrierCode(),constraint);
					} else {
						GtmUtils.writeConsoleWarning(String.format("Series without known carrier code: %d carrier: %s", series.getNumber(),series.getCarrierCode() ) , editor);
					}
				}
			} catch (Exception e) {
				StringBuilder sb = new StringBuilder();
				sb.append("Unknown error! Series not converted: series number - ").append(series.getNumber()).append('\n');
				sb.append(GtmUtils.getStackTrace(e));
				GtmUtils.writeConsoleError(sb.toString(), editor);
			}
		}
	}
	
	private CarrierConstraint createCarrierConstraint(GTMTool tool, String carrierCode) {
		
		if (carrierCode == null || carrierCode.length() < 1) return null;
		
		CarrierConstraint constraint = null;
	
		if( tool.getConversionFromLegacy().getParams().getNamedCarrierLists() != null &&
			!tool.getConversionFromLegacy().getParams().getNamedCarrierLists().getNamedCarrierList().isEmpty() ){
			//find carrier list
										
			for (NamedCarrierList carrierList : tool.getConversionFromLegacy().getParams().getNamedCarrierLists().getNamedCarrierList()) {
				if (carrierCode.equals(carrierList.getReplacementCode()) ) {
					
					constraint = GtmFactory.eINSTANCE.createCarrierConstraint();
					constraint.setDataSource(DataSource.CONVERTED);
					constraint.setDataDescription(carrierList.getName());
					constraint.getIncludedCarriers().addAll(carrierList.getCarriers());
					if (carrierList.getCarrierGroup() != null) {
						constraint.setIncludedCarrierGroup(carrierList.getCarrierGroup());
						if (constraint.getIncludedCarriers() == null || constraint.getIncludedCarriers().isEmpty()) {
							constraint.getIncludedCarriers().addAll(carrierList.getCarrierGroup().getCompanies());
						}
					}
					
					return constraint;
				}
			}
			
		}
			
		Carrier carrier = tool.getCodeLists().getCarriers().findCarrier(carrierCode);
		if (carrier != null) {
			constraint = GtmFactory.eINSTANCE.createCarrierConstraint();
			constraint.setDataSource(DataSource.CONVERTED);
			constraint.setDataDescription(NationalLanguageSupport.ConverterFromLegacy_2 + carrier.getName());
			constraint.getIncludedCarriers().add(carrier);
			return constraint;
		} 
				
		return constraint;
	}


	private HashSet<Carrier> findCarriers(GTMTool tool, String carrierCode) {
		
		
		
		HashSet<Carrier> carriers = new HashSet<Carrier>();
		if (tool != null 
			&& tool.getConversionFromLegacy() != null 
			&& tool.getConversionFromLegacy().getParams() != null 
			&& tool.getConversionFromLegacy().getParams().getNamedCarrierLists() != null ) {
			for (NamedCarrierList carrierList : tool.getConversionFromLegacy().getParams().getNamedCarrierLists().getNamedCarrierList()) {
				if (carrierCode.equals(carrierList.getReplacementCode()) ) {
					carriers.addAll(carrierList.getCarriers());							
				}
				return carriers;
			}
		}
		
		Carrier carrier = tool.getCodeLists().getCarriers().findCarrier(carrierCode);
		if (carrier != null) {
			carriers.add(carrier);
			return carriers;
		}
		
		return null;
	}


	/**
	 * Convert series.
	 *
	 * @param monitor the monitor
	 * @param priceValidityRanges the price validity ranges
	 * @param regions the regions
	 * @param priceList the price list
	 * @param fares the fares
	 * @param afterSalesRules the after sales rules
	 * @return the int
	 */
	private int convertSeries(IProgressMonitor monitor, ArrayList<DateRange> priceValidityRanges, ArrayList<RegionalConstraint> regions, ArrayList<Price> priceList, ArrayList<FareElement> fares, ArrayList<AfterSalesRule> afterSalesRules) {
		
		priceValidityRanges = findAllPriceValidityRanges(tool.getConversionFromLegacy().getLegacy108());
		
		int nbSeries = 0;
		int worked = 100000 / tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().size();
		if (worked < 1 ) worked = 1;
		int faresConverted = 0;
		
		for (LegacySeries series: tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			nbSeries++;
			
			ArrayList<DateRange> validityRanges = priceValidityRanges;
					// findPriceValidityRanges (series);
			
			RegionalConstraint regionalConstraint = null;
			try {
				regionalConstraint = convertSeriesToRegionalConstraint(series);
			} catch (ConverterException e) {
				//continue
			}
			
			RegionalConstraint regionalConstraintR = null;
			try {
				regionalConstraintR = convertSeriesToReversedRegionalConstraint(series);
			} catch (ConverterException e) {
				//continue
			}
			
			if (regionalConstraint != null && regionalConstraintR != null) {
				regions.add(regionalConstraint);
				regions.add(regionalConstraintR);

				int legacyFareCounter = 0;
				for (FareTemplate fareTemplate: tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates()) {
					
					boolean convert = true;
					//check series type
					if (fareTemplate.getSeriesFilter() != null && fareTemplate.getSeriesFilter().size() > 0) {
						//check the filter on series type
						if (series.getType()!= null && !fareTemplate.getSeriesFilter().contains(series.getType())) {
							convert = false;
						}
					}
					
					//check the carrier filter
					convert = checkCarrierFilter(fareTemplate, series);
					
					//check basic features
					if (fareTemplate.getServiceClass() == null) {					
						GtmUtils.writeConsoleError("Service class missing in template: " + fareTemplate.getDataDescription(), editor);
						convert = false;
					}
					
					SalesAvailabilityConstraint s = fareTemplate.getSalesAvailability();					
					if (s == null && fareTemplate.getFareConstraintBundle() != null ) {
						s = fareTemplate.getFareConstraintBundle().getSalesAvailability();
					} 
					
					if (convert) {
						
						if (isUsableSalesAvailability(s)) {
							try {
								DateRange dateRange = getDateRange(s);
								convertSeriesToFares(series, fareTemplate,dateRange, regionalConstraint,regionalConstraintR ,priceList, legacyFareCounter, fares, afterSalesRules);
								faresConverted++;
							} catch (ConverterException e) {
								//already logged
							}
						} else {
							try {
								for (DateRange dateRange : validityRanges) {
									convertSeriesToFares(series, fareTemplate,dateRange, regionalConstraint,regionalConstraintR ,priceList, legacyFareCounter, fares, afterSalesRules);
									faresConverted++;
								}
							} catch (ConverterException e) {
								// error already logged
							}
						}
					}
				}	
			}
			
						
			if (nbSeries % 1000 == 0 ) {			
				monitor.subTask(NationalLanguageSupport.ConverterFromLegacy_3+ String.valueOf(nbSeries));
				monitor.worked(worked);
			} 
		}
			
		return faresConverted;
	}	

	/**
	 * Check carrier filter. If a carrier filter is defined all involved carriers must be listed in the filter.
	 *
	 * @param regionalConstraint the regional constraint
	 * @param fareTemplate the fare template
	 * @return true, if the carriers listed are ok according to the filter
	 */
	private boolean checkCarrierFilter(RegionalConstraint regionalConstraint, FareTemplate fareTemplate) {
			
		if (fareTemplate.getCarrierFilter() == null || fareTemplate.getCarrierFilter().isEmpty()) return true;

		Set<Carrier> carriers = InvolvedTcoFinder.getInvolvedCarriers(regionalConstraint);
		
		if (fareTemplate.getCarrierFilter().containsAll(carriers)) {
			return true;
		}
		
		return false;
	}

	/**
	 * Check carrier filter.
	 *
	 * @param fareTemplate the fare template
	 * @param series the series
	 * @return true, if successful
	 */
	private boolean checkCarrierFilter(FareTemplate fareTemplate, LegacySeries series) {
		
		boolean convert = true;
		
		if (fareTemplate.getCarrierFilter() == null || fareTemplate.getCarrierFilter().isEmpty()) return true;
			
		if (series.getCarrierCode() == null) {
			convert = false;
		} else {
			boolean included = false;
			for (Carrier c : fareTemplate.getCarrierFilter()) {
				if (series.getCarrierCode().equals(c.getCode())) {
					included = true;	
				}
			}
			if (!included) {
				convert = false;
			}
		}
		return convert;
	}


	/**
	 * Checks if is usable sales availability.
	 *
	 * @param s the s
	 * @return true, if is usable sales availability
	 */
	/*
	 * check whether the sales availability can be used or needs to be created by conversion
	 */
	private boolean isUsableSalesAvailability(SalesAvailabilityConstraint s) {
		
		if (s == null) return false;
		
		if (s.getRestrictions() == null) return false;
		
		if (s.getRestrictions().size() == 0) return false;

		if (s.getRestrictions().get(0).getSalesDates() == null) return false;

		if (s.getRestrictions().get(0).getSalesDates().getFromDateTime() == null) return false;
		
		if (s.getRestrictions().get(0).getSalesDates().getUntilDateTime() == null) return false;
		
		return true;
	}


	/**
	 * Find all price validity ranges.
	 *
	 * @param legacy108 the legacy 108
	 * @return the array list
	 */
	private ArrayList<DateRange> findAllPriceValidityRanges(Legacy108 legacy108) {
		
		HashMap<String,DateRange> dateSet = new HashMap<String,DateRange>();
		
		for (LegacyDistanceFare fare :  tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare()) {
			DateRange r = new DateRange(fare.getValidFrom(), fare.getValidUntil());
			String key = fare.getValidFrom().toString() + fare.getValidUntil().toString();
			dateSet.put(key,r);
		} 

		for (LegacyRouteFare fare :  tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare()) {
			DateRange r = new DateRange(fare.getValidFrom(), fare.getValidUntil());
			String key = fare.getValidFrom().toString() + fare.getValidUntil().toString();
			dateSet.put(key,r);		
		}
		
		ArrayList<DateRange> list = new ArrayList<DateRange>();
		list.addAll(dateSet.values());
		return list;
		//return DateRange.getIntervalls(dateSet);
	}

	/**
	 * Gets the date range.
	 *
	 * @param s the s
	 * @return the date range
	 */
	private DateRange getDateRange(SalesAvailabilityConstraint s) {
		
		Date startDate = null;
		Date endDate = null;
		
		for (SalesRestriction r : s.getRestrictions()) {
			
			if (r.getSalesDates() != null && r.getSalesDates().getFromDateTime() != null) {
				if (startDate == null) {
					startDate = r.getSalesDates().getFromDateTime();
				} else {
					if (startDate.after(r.getSalesDates().getFromDateTime())) {
						startDate = r.getSalesDates().getFromDateTime();
					}
				}
			}
			
			if (r.getSalesDates() != null && r.getSalesDates().getUntilDateTime() != null) {
				if (endDate == null) {
					endDate = r.getSalesDates().getUntilDateTime();
				} else {
					if (endDate.before(r.getSalesDates().getUntilDateTime())) {
						endDate = r.getSalesDates().getUntilDateTime();
					}
				}
			}
			
		}
		return new DateRange(startDate, endDate);
	}

	/**
	 * Check fare templates.
	 */
	private void checkFareTemplates() {
		
		
		if (tool.getConversionFromLegacy().getParams().getLegacyFareTemplates() == null) {
			return;
		}
			
		LegacyFareTemplates legacyFareTemplates = tool.getConversionFromLegacy().getParams().getLegacyFareTemplates();
			
		//check for issues in the fare templates.
		
		
		
		//check for split between first and second class
		FareTemplate wrongFare = null;
		
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
						
						wrongFare = fare;
						
					}
						
				}
				
			}
			
		}
		
		if (wrongFare != null) {
			StringBuilder sb = new StringBuilder();
			sb.append( "Fare template split with different fare names by class not allowed for convertable faretemplate: ");
			sb.append(GtmUtils.getLabelText(wrongFare));
			GtmUtils.writeConsoleError( sb.toString(),editor);
		}
		return;
	}


	/** The direction original. */
	private static int DIRECTION_ORIGINAL = 1;
	
	/** The direction reversed. */
	private static int DIRECTION_REVERSED = 2;
	
	/**
	 * Convert series to fares.
	 *
	 * @param series the series
	 * @param fareTemplate the fare template
	 * @param dateRange the date range of the series sales validity
	 * @param regionalConstraint the regional constraint
	 * @param regionalConstraintR the regional constraint of the return direction
	 * @param priceList the price list of all prices
	 * @param legacyFareCounter the legacy fare counter to add legacy accounting information
	 * @param fares the fares converted
	 * @param afterSalesRules the after sales rules list collecting all after sales rules
	 * @throws ConverterException the converter exception in case something does wrong
	 */
	public void convertSeriesToFares(LegacySeries series, FareTemplate fareTemplate, DateRange dateRange, RegionalConstraint regionalConstraint, RegionalConstraint regionalConstraintR, ArrayList<Price> priceList, int legacyFareCounter, ArrayList<FareElement> fares, ArrayList<AfterSalesRule> afterSalesRules) throws ConverterException{
		
		try {
			
			Price price = convertSeriesToPrice(tool, series, fareTemplate, dateRange, priceList,regionalConstraint);
		
			if (price == null) {
				return;
			}
			
			if (regionalConstraint != null) {
				convertSeriesToFare(tool, series, fareTemplate, DIRECTION_ORIGINAL,legacyFareCounter,price,regionalConstraint,dateRange,afterSalesRules, priceList, fares);
			}
			
			if (regionalConstraintR != null) {
				convertSeriesToFare(tool, series, fareTemplate, DIRECTION_REVERSED, legacyFareCounter, price, regionalConstraintR, dateRange, afterSalesRules, priceList, fares);
			}
			
		} catch (ConverterException e) {
			String message = NationalLanguageSupport.ConverterFromLegacy_4 + Integer.toString(series.getNumber()) + NationalLanguageSupport.ConverterFromLegacy_5;
			GtmUtils.writeConsoleError(message, editor);
		}
		return;
	}	
	


	/**
	 * Convert after sales rules.
	 *
	 * @param price the price
	 * @param template the template
	 * @param afterSalesRules the after sales rules
	 * @param priceList the price list
	 * @return the after sales rule
	 */
	private AfterSalesRule convertAfterSalesRules(Price price, FareTemplate template,ArrayList<AfterSalesRule> afterSalesRules, ArrayList<Price> priceList) {
		
		if (price == null || 
			price.getCurrencies() == null ||
			price.getCurrencies().isEmpty() || 
			price.getCurrencies().get(0).getAmount() == 0 ||
			template == null || 
			template.getAfterSalesTemplate() == null || 
			template.getAfterSalesTemplate().isEmpty()) {
			return null;
		}
		
		AfterSalesRule rule = GtmFactory.eINSTANCE.createAfterSalesRule();
		rule.setDataSource(DataSource.CONVERTED);
		
		for (AfterSalesTemplate feeTemplate : template.getAfterSalesTemplate()) {
			
			AfterSalesCondition condition = GtmFactory.eINSTANCE.createAfterSalesCondition();
			
			Price fee = createFee(price, feeTemplate,  priceList );

			condition.setFee(fee);
			condition.setTransactionType(feeTemplate.getTransactionType());
			if (feeTemplate.getApplicationTime() != null) {
				condition.setApplicationTime(EcoreUtil.copy(feeTemplate.getApplicationTime()));
			}
			
			rule.getConditions().add(condition);
			
		}
		
		rule = findRule(rule, afterSalesRules);

		return rule;
	}


	
	
	/**
	 * Creates the fee.
	 *
	 * @param price the price
	 * @param feeTemplate the fee template
	 * @param priceList the price list
	 * @return the price
	 */
	private Price createFee(Price price, AfterSalesTemplate feeTemplate, ArrayList<Price> priceList) {
		
		if (price == null || price.getCurrencies()== null || price.getCurrencies().isEmpty()) return null;
		
		float amount = price.getCurrencies().get(0).getAmount();
		amount = amount * feeTemplate.getFeeFactor();

		amount = round(amount,feeTemplate.getRoundingMode());
		
		Price fee = GtmFactory.eINSTANCE.createPrice();
		fee.setDataSource(DataSource.CONVERTED);
		
		for (CurrencyPrice cp : price.getCurrencies()) {
			CurrencyPrice curPrice = GtmFactory.eINSTANCE.createCurrencyPrice();
			curPrice.setAmount(amount);
			curPrice.setCurrency(cp.getCurrency());
			fee.getCurrencies().add(curPrice);
		}
	
		fee = findPrice(fee, priceList);
		
		return fee;

	}

	/**
	 * Round.
	 *
	 * @param amountF the amount F
	 * @param roundingMode the rounding mode
	 * @return the float
	 */
	private float round(float amountF, RoundingType roundingMode) {
		String amountS = Float.toString(amountF);
		float amount = 0;
		BigDecimal bd = null;
		if (roundingMode == RoundingType.DOWN) {
			 bd = new BigDecimal(amountS).setScale(2, RoundingMode.DOWN);
			 amount = bd.floatValue();
		} else if (roundingMode == RoundingType.UP) {
			 bd = new BigDecimal(amountS).setScale(2, RoundingMode.UP);
			 amount = bd.floatValue();
		} else if (roundingMode == RoundingType.HALFDOWN) {
			 bd = new BigDecimal(amountS).setScale(2, RoundingMode.HALF_DOWN);
			 amount = bd.floatValue();
		} else if (roundingMode == RoundingType.HALFEVEN) {
			 bd = new BigDecimal(amountS).setScale(2, RoundingMode.HALF_EVEN);
			 amount = bd.floatValue();
		} else if (roundingMode == RoundingType.HALFUP) {
			 bd = new BigDecimal(amountF).setScale(2, RoundingMode.HALF_UP);
			 amount = bd.floatValue();
		} else if (roundingMode == RoundingType.DOWN5CENT) {
			bd = GtmUtils.round(amountF, 2, RoundingMode.HALF_DOWN, 2);
			amount = bd.floatValue();
		} else if (roundingMode == RoundingType.UP5CENT) {
			bd = GtmUtils.round(amountF, 2, RoundingMode.HALF_DOWN, 2);
			amount = bd.floatValue();			
		} else if (roundingMode == RoundingType.DOWN2CENT) {
			bd = GtmUtils.round(amountF, 2, RoundingMode.HALF_DOWN, 5);
			amount = bd.floatValue();
		} else if (roundingMode == RoundingType.UP2CENT) {
			bd = GtmUtils.round(amountF, 2, RoundingMode.HALF_UP, 5);
			amount = bd.floatValue();
		} else if (roundingMode == RoundingType.DOWN10CENT) {
			bd = GtmUtils.round(amountF, 1, RoundingMode.DOWN, 10);
			amount = bd.floatValue();
		} else if (roundingMode == RoundingType.UP10CENT) {
			bd = GtmUtils.round(amountF, 1, RoundingMode.UP, 10);
			amount = bd.floatValue();
		} else if (roundingMode == RoundingType.HALFDOWN10) {
			bd = GtmUtils.round(amountF, 1, RoundingMode.HALF_DOWN, 10);
			amount = bd.floatValue();
		} else if (roundingMode == RoundingType.HALFUP10) {
			bd = GtmUtils.round(amountF, 1, RoundingMode.HALF_UP, 10);
			amount = bd.floatValue();
		} else if (roundingMode == RoundingType.HALFEVEN10) {
			bd = GtmUtils.round(amountF, 1, RoundingMode.HALF_EVEN, 10);
			amount = bd.floatValue();
		} else if (roundingMode == RoundingType.DOWN20CENT) {
			bd =  GtmUtils.round(amountF,1,RoundingMode.DOWN, 5);
			amount = bd.floatValue();
		} else if (roundingMode == RoundingType.UP20CENT) {
			bd =  GtmUtils.round(amountF,1,RoundingMode.UP, 5);
			amount = bd.floatValue();
		} else if (roundingMode == RoundingType.HALFEVEN20CENT) {
			bd =  GtmUtils.round(amountF,1,RoundingMode.HALF_UP, 5);
			amount = bd.floatValue();
		} else if (roundingMode == RoundingType.HALFEVEN5CENT) {
			bd =  GtmUtils.round(amountF,2,RoundingMode.HALF_UP, 2);
			amount = bd.floatValue();
		}
		
		return amount;
	}

	/**
	 * Find the existing after sales rule or add the given one to the list.
	 *
	 * @param rule the rule
	 * @param afterSalesRules the after sales rules list
	 * @return the after sales rule from the list
	 */
	private AfterSalesRule findRule(AfterSalesRule rule, ArrayList<AfterSalesRule> afterSalesRules) {
		
		if (rule == null || rule.getConditions() == null || rule.getConditions().isEmpty()) return null;
		
		if (afterSalesRules.isEmpty()) {
			afterSalesRules.add(rule);
			return rule;
		}
		
		for (AfterSalesRule old : afterSalesRules) {
			
			boolean isEqual = true;
			
			if (old.getConditions().size() == rule.getConditions().size()) {
				
				for (AfterSalesCondition oldCond : old.getConditions()) {
					
					boolean conditionMatched = false;
					
					for (AfterSalesCondition cond : rule.getConditions()) {	
						if (oldCond.getFee() == cond.getFee() 
							&& oldCond.getTransactionType().equals(cond.getTransactionType()) 
							&& oldCond.getApplicationTime().getUnit().equals(cond.getApplicationTime().getUnit())
							&& oldCond.getApplicationTime().getValue() == cond.getApplicationTime().getValue() 
							&& oldCond.getApplicationTime().getReference().equals(cond.getApplicationTime().getReference())
						) {
							conditionMatched = true;
						}
					}					
					
					if (!conditionMatched) {
						isEqual = false;
					}
				}
		
			} else {
				isEqual = false;
			}
			
			if (isEqual) {
				return old;
			}

		}
		
		afterSalesRules.add(rule);
		return rule;
	}




	/**
	 * Map constraints and descriptions.
	 *
	 * @param fareElement the fare element
	 * @param series the series
	 */
	private void mapConstraintsAndDescriptions(FareElement fareElement, LegacySeries series) {
		
		if (fareElement == null || series == null) return;
		
		//get service constraints
		if (tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings() != null &&
			!tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings().getLegacyStationToServiceBrandMappings().isEmpty()) {
			for (LegacyViastation via : series.getViastations()) {
				ServiceConstraint serviceConstraint = tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings().findServiceConstraint(via.getCode());
				if (serviceConstraint != null) {
					fareElement.setServiceConstraint(serviceConstraint);
				}
			}	
		}
		
		//getFareDescriptions on departure and / or arrival (use only one)
		if (tool.getConversionFromLegacy().getParams().getLegacyStationToFareDetailMappings() != null) {
			for (LegacyFareDetailMap map : tool.getConversionFromLegacy().getParams().getLegacyStationToFareDetailMappings().getLegacyFareDetailMaps()) {
				
				if (map.getLegacyCode() == series.getFromStation() &&
					( map.getFareDetailMappingType() == StationFareDetailType.ON_DEPARTURE || 
					  map.getFareDetailMappingType() == StationFareDetailType.ON_ARRIVAL_ON_DEPARTURE)){
						
					fareElement.setFareDetailDescription(map.getFareDetailDescription());
				}
				if (map.getLegacyCode() == series.getToStation() &&
						( map.getFareDetailMappingType() == StationFareDetailType.ON_ARRIVAL || 
						  map.getFareDetailMappingType() == StationFareDetailType.ON_ARRIVAL_ON_DEPARTURE)){
							
					fareElement.setFareDetailDescription(map.getFareDetailDescription());
				}
			}
		}

	}
	
	

	/**
	 * Find price.
	 *
	 * @param newPrice the new price
	 * @param priceList the price list
	 * @return the price
	 */
	private static Price findPrice(Price newPrice, ArrayList<Price> priceList) {
		
		if (newPrice == null) return null;
		
		for (Price price : priceList) {
			
			
			CurrencyPrice cp = price.getCurrencies().get(0);
			CurrencyPrice ncp = newPrice.getCurrencies().get(0);
			
			if (price.getCurrencies().size() == newPrice.getCurrencies().size() &&
				cp.getAmount() == ncp.getAmount()) {
				
				if (cp.getVATdetails() == null && cp.getVATdetails() == null) {
					return price;
				} else {
					//compare VAT details
					if (equalVatDetails(cp.getVATdetails(),ncp.getVATdetails())){
						return price;
					}
				}
			}
			
		}
		
		priceList.add(newPrice);

		return newPrice;
	}


	/**
	 * compare two vat detail objects.
	 *
	 * @param vat1 the vat 1
	 * @param vat2 the vat 2
	 * @return true, if the content is equal
	 */
	private static boolean equalVatDetails(EList<VATDetail> vat1, EList<VATDetail> vat2) {

		if (vat1.size() != vat2.size()) return false;
		
		for (VATDetail v1 : vat1) {
			
			boolean match = false;
			for (VATDetail v2 : vat2) {
				if (v1.getScope().equals(v2.getScope())){
					match = true;
				}
				if (match) {
					if (!v1.getCountry().equals(v2.getCountry())) return false;
					if (!v1.getTaxId().equals(v2.getTaxId())) return false;		
					if (v1.getPercentage() != v2.getPercentage()) return false;
					if (v1.getAmount() != v2.getAmount()) return false;
				}
			}
			if (!match) return false;

		}

		return true;
	}




	/**
	 * Find sales availability.
	 *
	 * @param tool the tool
	 * @param dateRange the date range
	 * @return the sales availability constraint
	 */
	private static SalesAvailabilityConstraint findSalesAvailability(GTMTool tool, DateRange dateRange) {
		
		if (tool.getGeneralTariffModel().getFareStructure() == null ||
			tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints() == null || 
			tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints() == null) {
			return null;
		}
		
		String f = dateFormat.format(dateRange.startDate);
		String u = dateFormat.format(dateRange.endDate);
		
		
		for (SalesAvailabilityConstraint sa : tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()){
			
			
			
			if (DataSource.CONVERTED.equals(sa.getDataSource())) {
				
				if (sa.getRestrictions() != null &&
					!sa.getRestrictions().isEmpty() &&	
					sa.getRestrictions().get(0).getSalesDates() != null &&
					sa.getRestrictions().get(0).getSalesDates().getFromDateTime() != null &&
					sa.getRestrictions().get(0).getSalesDates().getUntilDateTime() != null) {
					
					//compare Dates only
					String saf = dateFormat.format(sa.getRestrictions().get(0).getSalesDates().getFromDateTime());
					String sau = dateFormat.format(sa.getRestrictions().get(0).getSalesDates().getUntilDateTime());
					
					if (f.equals(saf) && u.equals(sau)) {
							return sa;
					}
				}
			}
		}
		
		return null;
	}

	/**
	 * Convert series to reversed regional constraint.
	 *
	 * @param series the series
	 * @return the regional constraint
	 * @throws ConverterException the converter exception
	 */
	private RegionalConstraint convertSeriesToReversedRegionalConstraint(LegacySeries series) throws ConverterException {
		
		
		RegionalConstraint constraint = createRegionalConstraint(series);

		
		int seqNb = 1;
		
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		if (country == null) {
			String message = NationalLanguageSupport.ConvertGtm2LegacyAction_CountryMissing;
			GtmUtils.writeConsoleError(message, editor);
			throw new ConverterException(message);
		}
		
		boolean borderDeparture = false;
		boolean borderArrival = false;
		
		//handle departure
		ViaStation viaDeparture = getViaStation(tool, country, series.getToStation(),series.getNumber());
		Legacy108Station lsd = legacyStations.get(series.getToStation());
		if (viaDeparture == null && lsd == null) {
			String message = "arrival station missing legacy stations: " + series.getToStationName();
			GtmUtils.writeConsoleError(message, editor);
			throw new ConverterException(message);
		}
		if (viaDeparture == null && lsd != null && lsd.getBorderPointCode() > 0) {
			viaDeparture = getBorderSideViaStation(lsd);
			if (viaDeparture == null) {
				borderDeparture = true;
			}
		}
		
		//handle arrival
		ViaStation viaArrival = getViaStation(tool, country, series.getFromStation(),series.getNumber());	
		Legacy108Station lsa = legacyStations.get(series.getFromStation());
		if (viaArrival == null && lsa == null) {
			String message = "departure station missing legacy stations: " + series.getFromStationName();
			GtmUtils.writeConsoleError(message, editor);
			throw new ConverterException(message);
		}
		if (viaArrival == null && lsa != null && lsa.getBorderPointCode() > 0) {
			viaArrival = getBorderSideViaStation(lsa);
		}
		if (viaArrival != null && viaDeparture != null && 
			( (viaArrival.getStation() != null 
				  && viaArrival.getStation() == viaDeparture.getStation()) 
			  ||
			(viaArrival.getFareStationSet() != null 
				  && viaArrival.getFareStationSet() == viaDeparture.getFareStationSet()) 
		   )){				
			if (lsd != null && lsd.getBorderPointCode() > 0) {
				viaDeparture = null;
				borderDeparture =  true;
			} else if (lsa != null && lsa.getBorderPointCode() > 0) {
				viaArrival = null;
				borderArrival = true;
			}
		}
		
		if ((viaDeparture == null && !borderDeparture) 
			||
			( viaArrival == null && !borderArrival)){
			String message = "departure or arrival missing in series: " + Integer.valueOf(series.getNumber()).toString();
			GtmUtils.writeConsoleError(message, editor);
			throw new ConverterException(message);
		}
		
	
		//set connection points 
		setConnectionPoints(series.getNumber(), lsd, viaDeparture, lsa, viaArrival, constraint);
		
		
		//handle route
		RegionalValidity region = GtmFactory.eINSTANCE.createRegionalValidity();
		constraint.getRegionalValidity().add(region);
		region.setSeqNb(seqNb);
		seqNb++;
		
		ViaStation mainViaStation = GtmFactory.eINSTANCE.createViaStation();
		
		CarrierConstraint cc = carrierConstraints.get(series.getCarrierCode());
		mainViaStation.setCarrierConstraint(cc);
	
		
		region.setViaStation(mainViaStation);
		mainViaStation.setRoute(GtmFactory.eINSTANCE.createRoute());

		if (viaDeparture != null) {
			mainViaStation.getRoute().getStations().add(viaDeparture);
		}
		int mainRoutePosition = 1;
		int lastPosition = mainRoutePosition; 
		EList<ViaStation> mainRoute = mainViaStation.getRoute().getStations();
		EList<ViaStation> lastRoute = mainViaStation.getRoute().getStations();
		ViaStation alternativeRoutesVia = null;
		
		for (int i = series.getViastations().size() - 1; i > -1; i--) {
			
			LegacyViastation legacyViaStation = series.getViastations().get(i);
			if (legacyViaStation.getPosition() != lastPosition) {
				if (legacyViaStation.getPosition() == 3 && lastPosition == 2){
					//switch back to main route
					//start alternatives to the main route
					alternativeRoutesVia = GtmFactory.eINSTANCE.createViaStation();
					mainRoute.add(alternativeRoutesVia);
					AlternativeRoute alternativeRoute = GtmFactory.eINSTANCE.createAlternativeRoute();
					alternativeRoutesVia.getAlternativeRoutes().add(alternativeRoute);
					lastRoute = alternativeRoute.getStations();
					lastPosition = legacyViaStation.getPosition();
					try {
						addToRoute(lastRoute, legacyViaStation, country,series.getNumber());
					} catch (ConverterException e) {
						String message = NationalLanguageSupport.ConverterFromLegacy_15 + Integer.toString(series.getNumber()) + ") : " + e.getMessage(); //$NON-NLS-2$
						GtmUtils.writeConsoleError(message, editor);
						throw e;
					}					
				} else if (legacyViaStation.getPosition() == mainRoutePosition){
					//switch back to main route
					lastRoute = mainRoute;
					lastPosition = mainRoutePosition;
					try {
						addToRoute(lastRoute, legacyViaStation, country,series.getNumber());
					} catch (ConverterException e) {
						String message = NationalLanguageSupport.ConverterFromLegacy_13 + Integer.toString(series.getNumber()) + NationalLanguageSupport.ConverterFromLegacy_14 + e.getMessage();
						GtmUtils.writeConsoleError(message, editor);
						throw e;
					}
				} else if (lastPosition == mainRoutePosition) {
					//start alternatives to the main route
					alternativeRoutesVia = GtmFactory.eINSTANCE.createViaStation();
					mainRoute.add(alternativeRoutesVia);
					AlternativeRoute alternativeRoute = GtmFactory.eINSTANCE.createAlternativeRoute();
					alternativeRoutesVia.getAlternativeRoutes().add(alternativeRoute);
					lastRoute = alternativeRoute.getStations();
					lastPosition = legacyViaStation.getPosition();
					try {
						addToRoute(lastRoute, legacyViaStation, country,series.getNumber());
					} catch (ConverterException e) {
						String message = NationalLanguageSupport.ConverterFromLegacy_15 + Integer.toString(series.getNumber()) + ") : " + e.getMessage(); //$NON-NLS-2$
						GtmUtils.writeConsoleError(message, editor);
						throw e;
					}					
				} else {
					// add another alternative
					lastPosition = legacyViaStation.getPosition();
					AlternativeRoute alternativeRoute = GtmFactory.eINSTANCE.createAlternativeRoute();
					try {
						alternativeRoutesVia.getAlternativeRoutes().add(alternativeRoute);
						lastRoute = alternativeRoute.getStations();						
						addToRoute(lastRoute, legacyViaStation, country,series.getNumber());
					} catch (ConverterException e) {
						String message = NationalLanguageSupport.ConverterFromLegacy_17 + Integer.toString(series.getNumber()) + ") :" + e.getMessage(); //$NON-NLS-2$
						GtmUtils.writeConsoleError(message, editor);
						throw e;
					}		
				}
			} else {
				try {
					addToRoute(lastRoute, legacyViaStation, country,series.getNumber());
				} catch (ConverterException e) {
					String message = NationalLanguageSupport.ConverterFromLegacy_19 + Integer.toString(series.getNumber()) + ") : " + e.getMessage(); //$NON-NLS-2$
					GtmUtils.writeConsoleError(message, editor);
					throw new ConverterException(message);
				}		
			}
		}
		
		//handle arrival
		if (viaArrival != null) {
			mainRoute.add(viaArrival);	
		}
		return constraint;
	}
	


	/**
	 * Gets the via station.
	 *
	 * @param tool the tool
	 * @param country the country
	 * @param localCode the code
	 * @param seriesNumber the series number
	 * @return the via station
	 * @throws ConverterException the converter exception
	 */
	private ViaStation getViaStation(GTMTool tool, Country country, int localCode,int seriesNumber) throws ConverterException {

		
		//priority is for Fare Station Set. In case it is not a fare station set use a station
		Station station = null;
		FareStationSetDefinition fareStationSet = null;
		ServiceConstraint serviceConstraint = null;
		fareStationSet = findFareStation(localCode);
		if (fareStationSet == null) {
			serviceConstraint = findServiceConstraintByLegacyCode(localCode);
			if (serviceConstraint == null) {
				station = getStationByLocalCode(tool, country, localCode);
			}
		} 
		
		if (station == null && fareStationSet == null && serviceConstraint == null) {
			if (isMappedStation(localCode)) {
				return null;
			}
			Legacy108Station ls = legacyStations.get(localCode);
			StringBuilder sb = new StringBuilder();
			sb.append(NationalLanguageSupport.ConverterFromLegacy_7);
			sb.append(seriesNumber);
			sb.append(NationalLanguageSupport.ConverterFromLegacy_8);
			sb.append(localCode);
			if (ls != null) {
				sb.append("-").append(ls.getName());
			}
			GtmUtils.writeConsoleWarning(sb.toString(), editor);
			return null;
		}
		
		ViaStation viaStation = GtmFactory.eINSTANCE.createViaStation();
		viaStation.setStation(station);
		viaStation.setFareStationSet(fareStationSet);
		viaStation.setServiceConstraint(serviceConstraint);
		return viaStation;
	}



	/**
	 * Find service constraint by legacy code.
	 *
	 * @param localCode the local code
	 * @return the service constraint
	 */
	private ServiceConstraint findServiceConstraintByLegacyCode(long localCode) {
		
		if (tool.getGeneralTariffModel().getFareStructure().getServiceConstraints() == null) {
			return null;
		}
		
		for (ServiceConstraint sc : tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints()) {
			if (sc.getLegacy108Code() == localCode) {
				return sc;
			}
		}
		return null;
	}

	/**
	 * Creates the regional constraint.
	 *
	 * @param series the series
	 * @return the regional constraint
	 */
	private RegionalConstraint createRegionalConstraint(LegacySeries series) {
		RegionalConstraint constraint = GtmFactory.eINSTANCE.createRegionalConstraint();
		constraint.setDataSource(DataSource.CONVERTED);
		if (series.getDistance1() == 0) {
			constraint.setDistance(series.getDistance2());	
		} else if (series.getDistance2() == 0) {
			constraint.setDistance(series.getDistance1());	
		} else if (series.getDistance1() == series.getDistance2()) {
			constraint.setDistance(series.getDistance2());	
		} else if (series.getDistance1() != series.getDistance2()) {
			constraint.setDistance(series.getDistance2() );
		}
		return constraint;
	}

	/**
	 * Sets the connection points.
	 *
	 * @param series the series
	 * @param lsd the lsd
	 * @param departureStation the departure station
	 * @param lsa the lsa
	 * @param arrivalStation the arrival station
	 * @param constraint the constraint
	 * @throws ConverterException the converter exception
	 */
	private void setConnectionPoints(int series, Legacy108Station lsd, ViaStation departureStation, Legacy108Station lsa, ViaStation arrivalStation, RegionalConstraint constraint ) throws ConverterException {

		if (lsd == null || lsa == null) return;
				
		int borderpointcodeDeparture = lsd.getBorderPointCode();
			
    	ConnectionPoint point1 = findConnectionPoint(tool,borderpointcodeDeparture,departureStation);  
    	
    	if (point1 == null) {
    		GtmUtils.writeConsoleError("Connection point missing for Series: " + Integer.valueOf(series).toString(), editor);
    	}
		
    	int borderpointcodeArrival = lsa.getBorderPointCode();

    	ConnectionPoint point2 = findConnectionPoint(tool,borderpointcodeArrival,arrivalStation);	
    	
    	if (point2 == null) {
    		GtmUtils.writeConsoleError("Connection point missing for Series: " + Integer.valueOf(series).toString(), editor);
    	}
    	
    	constraint.setEntryConnectionPoint(point1);
    	constraint.setExitConnectionPoint(point2);			

	}

	/**
	 * Find fare station.
	 *
	 * @param code the code
	 * @return the fare station set definition
	 */
	private FareStationSetDefinition findFareStation(int code) {
		if (fareStationSets == null || fareStationSets.isEmpty()) return null;
		return fareStationSets.get(code);
	}
	

	/**
	 * Convert series to regional constraint.
	 *
	 * @param series the series
	 * @return the regional constraint
	 * @throws ConverterException the converter exception
	 */
	private RegionalConstraint convertSeriesToRegionalConstraint(LegacySeries series) throws ConverterException{
		
		RegionalConstraint constraint = createRegionalConstraint(series);
			
		int seqNb = 1;
				
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		
		boolean borderDeparture = false;
		boolean borderArrival = false;
		
		//handle departure
		ViaStation viaDeparture = getViaStation(tool, country, series.getFromStation(),series.getNumber());
		Legacy108Station lsd = legacyStations.get(series.getFromStation());
		if (viaDeparture == null && lsd == null) {
			String message = "departure station missing legacy stations: " + series.getFromStationName();
			GtmUtils.writeConsoleError(message, editor);
			throw new ConverterException(message);
		}
		if (viaDeparture == null && lsd != null && lsd.getBorderPointCode() > 0) {
			viaDeparture = getBorderSideViaStation(lsd);
			if (viaDeparture == null) {
				borderDeparture = true;
			}
		}
		
		//handle arrival
		ViaStation viaArrival = getViaStation(tool, country, series.getToStation(),series.getNumber());
		Legacy108Station lsa = legacyStations.get(series.getToStation());
		if (viaArrival == null && lsa == null) {
			String message = "arrival station missing legacy stations: " + series.getToStationName();
			GtmUtils.writeConsoleError(message, editor);
			throw new ConverterException(message);
		}
		if (viaArrival == null && lsa != null && lsa.getBorderPointCode() > 0) {
			viaArrival = getBorderSideViaStation(lsa);
		}
		
		
		if (viaArrival != null && viaDeparture != null &&
			(  (viaArrival.getStation() != null 
			    && viaArrival.getStation() == viaDeparture.getStation()) 
			  ||
			  (viaArrival.getFareStationSet() != null 
			    && viaArrival.getFareStationSet() == viaDeparture.getFareStationSet())
			)){
			if (lsd != null && lsd.getBorderPointCode() > 0) {
				viaDeparture = null;
				borderDeparture =  true;
			} else if (lsa != null && lsa.getBorderPointCode() > 0) {
				viaArrival = null;
				borderArrival = true;
			}
		}
		
		if ((viaDeparture == null &&  !borderDeparture) 
			||
			( viaArrival == null && !borderArrival)){
			String message = "departure or arrival missing in series: " + Integer.valueOf(series.getNumber()).toString();
			GtmUtils.writeConsoleError(message, editor);
			throw new ConverterException(message);
		}
				
		//set connection points 
		setConnectionPoints(series.getNumber(),lsd, viaDeparture, lsa, viaArrival,constraint);
				
		//create route
		ViaStation mainViaStation = GtmFactory.eINSTANCE.createViaStation();
		mainViaStation.setRoute(GtmFactory.eINSTANCE.createRoute());
		
		CarrierConstraint cc = carrierConstraints.get(series.getCarrierCode());
		mainViaStation.setCarrierConstraint(cc);
		
		RegionalValidity region = GtmFactory.eINSTANCE.createRegionalValidity();
		region.setSeqNb(seqNb);
		seqNb++;
		region.setViaStation(mainViaStation);
		constraint.getRegionalValidity().add(region);
		
		if (viaDeparture != null) {
			mainViaStation.getRoute().getStations().add(viaDeparture);
		}
		
		int mainRoutePosition = 1;
		int lastPosition = mainRoutePosition; 
		EList<ViaStation> mainRoute = mainViaStation.getRoute().getStations();
		EList<ViaStation> lastRoute = mainViaStation.getRoute().getStations();
		ViaStation alternativeRoutesVia = null;

		
		for (LegacyViastation legacyViaStation : series.getViastations()) {
			if (legacyViaStation.getPosition() != lastPosition) {
				if (legacyViaStation.getPosition() == 2 && lastPosition == 3){
					//switch back to main route
					lastRoute = mainRoute;
					lastPosition = mainRoutePosition;	
					//start alternatives to the main route
					alternativeRoutesVia = GtmFactory.eINSTANCE.createViaStation();
					mainRoute.add(alternativeRoutesVia);
					AlternativeRoute alternativeRoute = GtmFactory.eINSTANCE.createAlternativeRoute();
					alternativeRoutesVia.getAlternativeRoutes().add(alternativeRoute);
					lastRoute = alternativeRoute.getStations();
					lastPosition = legacyViaStation.getPosition();
					try {
						addToRoute(lastRoute, legacyViaStation, country,series.getNumber());
					} catch (ConverterException e) {
						String message = "error in series: " + Integer.toString(series.getNumber()) + ": " + e.getMessage(); //$NON-NLS-2$
						GtmUtils.writeConsoleError(message, editor);
						throw new ConverterException(message);
					}						
				} else if (legacyViaStation.getPosition() == mainRoutePosition){
					//switch back to main route
					lastRoute = mainRoute;
					lastPosition = mainRoutePosition;
					alternativeRoutesVia = null;
					try {
						addToRoute(lastRoute, legacyViaStation, country,series.getNumber());
					} catch (ConverterException e) {
						String message = NationalLanguageSupport.ConverterFromLegacy_29 + Integer.toString(series.getNumber()) + ") : " + e.getMessage(); //$NON-NLS-2$
						GtmUtils.writeConsoleError(message, editor);
						throw new ConverterException(message);
					}
				} else if (lastPosition == mainRoutePosition) {
					//start alternatives to the main route
					alternativeRoutesVia = GtmFactory.eINSTANCE.createViaStation();
					mainRoute.add(alternativeRoutesVia);
					AlternativeRoute alternativeRoute = GtmFactory.eINSTANCE.createAlternativeRoute();
					alternativeRoutesVia.getAlternativeRoutes().add(alternativeRoute);
					lastRoute = alternativeRoute.getStations();
					lastPosition = legacyViaStation.getPosition();
					try {
						addToRoute(lastRoute, legacyViaStation, country,series.getNumber());
					} catch (ConverterException e) {
						String message = "error in series: " + Integer.toString(series.getNumber()) + ": " + e.getMessage(); //$NON-NLS-2$
						GtmUtils.writeConsoleError(message, editor);
						throw new ConverterException(message);
					}					
				} else {
					// add another alternative				
					lastPosition = legacyViaStation.getPosition();
					AlternativeRoute alternativeRoute = GtmFactory.eINSTANCE.createAlternativeRoute();
					try {
						alternativeRoutesVia.getAlternativeRoutes().add(alternativeRoute);
						lastRoute = alternativeRoute.getStations();
						addToRoute(lastRoute, legacyViaStation, country,series.getNumber());
					} catch (ConverterException e) {
						String message = NationalLanguageSupport.ConverterFromLegacy_33 + Integer.toString(series.getNumber()) + ") :" + e.getMessage(); //$NON-NLS-2$
						GtmUtils.writeConsoleError(message, editor);
						throw e;
					}		
				}
			} else {
				//we stay in the same route
				try {
					addToRoute(lastRoute, legacyViaStation, country,series.getNumber());
				} catch (ConverterException e) {
					String message = NationalLanguageSupport.ConverterFromLegacy_35 + Integer.toString(series.getNumber()) + NationalLanguageSupport.ConverterFromLegacy_36 + e.getMessage();
					GtmUtils.writeConsoleError(message, editor);
				}		
			}
		}
		
		if (viaArrival != null) {
			mainRoute.add(viaArrival);				
		}
		return constraint;
	}
	

	/**
	 * Gets the border side via station.
	 *
	 * @param ls the ls
	 * @return the border side via station
	 */
	private ViaStation getBorderSideViaStation(Legacy108Station ls) {
		
		int borderPointCode = ls.getBorderPointCode();
		
		LegacyBorderPoint lbp = borderPoints.get(borderPointCode);
		if (lbp == null) return null;
		
		Station station = null;
		FareStationSetDefinition fareStationSet = null;
		
		if (lbp.getBorderSides() != null) {
			for (LegacyBorderSide bs : lbp.getBorderSides()) {
				if (bs.getCarrier().equals(tool.getConversionFromLegacy().getLegacy108().getCarrier())) {
						
					if (lbp.getOnBorderStations() != null && lbp.getOnBorderStations().getStations() != null && 
						!lbp.getOnBorderStations().getStations().getStations().isEmpty() ) {
						fareStationSet = this.fareStationSets.get(bs.getLegacyStationCode());
						if (fareStationSet == null) {
							station = lbp.getOnBorderStations().getStations().getStations().get(0);
						}
					} else {
						if (bs.getStations() != null && !bs.getStations().getStations().isEmpty() ) {
							fareStationSet = this.fareStationSets.get(bs.getLegacyStationCode());
							if (fareStationSet == null) {
								if (bs.getStations().getStations().size() == 1) {
									station = bs.getStations().getStations().get(0);
								} else {
									station = StationSelector.selectStation(ls.getShortName(),bs.getStations());
								}
							}
						}
					}
				}
			}
		}
		
		if (station == null && fareStationSet == null) return null;
		
		ViaStation viaStation = GtmFactory.eINSTANCE.createViaStation();
		viaStation.setStation(station);
		viaStation.setFareStationSet(fareStationSet);
		return viaStation;
	}


	/**
	 * Find connection point.
	 *
	 * @param tool the tool
	 * @param borderpoint the border point code
	 * @param station the station
	 * @return the connection point
	 */
	private ConnectionPoint findConnectionPoint(GTMTool tool, int borderpoint, ViaStation station) {
		
		if (borderpoint > 0) {
			return borderConnectionPoints.get(borderpoint);
		} 
	
		if (station == null) return null;
		
		if (station.getFareStationSet() != null) {
			ConnectionPoint point = legacyStationConnectionPoints.get(Integer.parseInt(station.getFareStationSet().getCode()));
			return point;	
		}

		//find or create connection point which contains exactly the station
		if (station.getStation() != null) {
			ConnectionPoint point = singleStationConnectionPoints.get(station.getStation());
			return point;
		}
		
		return null;
	}
	
	/**
	 * Find connection point.
	 * 
	 * fond or create a connection point for the given station 108.1 code and country
	 *
	 * @param tool the tool
	 * @param code the code
	 * @param country the country
	 * @return the connection point
	 */
	private void findOrCreateConnectionPoint(GTMTool tool, int code, Country country) {
		
		Station station = null;
		FareStationSetDefinition fareStationSet = null;
		fareStationSet = findFareStation(code);
		if (fareStationSet == null) {
			try {
				station = getStationByLocalCode(tool, country, code);
			} catch (ConverterException e) {
				//
			}	
		} 
		if (station == null && fareStationSet == null) {
			return;
		}
		
		
		//get the legacy station for the station code --> get the legacy border point code
		int borderpoint = 0;
		if (station != null) {
			borderpoint = station.getLegacyBorderPointCode();		
		} else if (fareStationSet != null) {
			for (Station s : fareStationSet.getStations()) {
				if (s.getLegacyBorderPointCode() > 0) {
					
					if (borderpoint == 0) {
						borderpoint = s.getLegacyBorderPointCode();
					}  				
					
				}
				
			}
			
		}
		
		
		ConnectionPoint p = null;
		if (borderpoint > 0) {
			p = borderConnectionPoints.get(borderpoint);
		} else {
			p = legacyStationConnectionPoints.get(code);
		}
		if (p != null) return;
			
		//border point is missing, create it based on the series
		if (borderpoint > 0) {

			//no data available --> create a border point from the station
			ConnectionPoint point = GtmFactory.eINSTANCE.createConnectionPoint();
			point.setLegacyBorderPointCode(borderpoint);
			point.setDataSource(DataSource.CONVERTED);
			
			//get the real station for the station code
			if (station != null) {
				point.setDescription("created from series data only - might be incomplete");
				StationSet set = GtmFactory.eINSTANCE.createStationSet();
				set.getStations().add(station);
				point.getConnectedStationSets().add(set);
				point.setLegacyBorderPointCode(borderpoint);
				borderConnectionPoints.put(borderpoint, point);
				return;
			} 
		}
		
		
		//no border point code but we need a connection point
		
		FareStationSetDefinition fssd = findFareStation(code);
		if (fssd != null) {
			ConnectionPoint point = GtmFactory.eINSTANCE.createConnectionPoint();
			point.setDataSource(DataSource.CONVERTED);
			StationSet stationSet = GtmFactory.eINSTANCE.createStationSet();
			stationSet.getStations().addAll(fssd.getStations());		
			point.getConnectedStationSets().add(stationSet);
			point.setDescription("created from series endpoint only");
			legacyStationConnectionPoints.put(code, point);
			return;
		}
		
		//no border point code available
		if (station != null) {
			//create connectionPoint with a station
			ConnectionPoint point = GtmFactory.eINSTANCE.createConnectionPoint();
			point.setDataSource(DataSource.CONVERTED);
			StationSet stationSet = GtmFactory.eINSTANCE.createStationSet();
			stationSet.getStations().add(station);		
			point.getConnectedStationSets().add(stationSet);
			point.setDescription("created from series endpoint only");
			legacyStationConnectionPoints.put(code,point);
			singleStationConnectionPoints.put(station,point);
			return;
		} 

	}
	

	/**
	 * Adds the to route.
	 *
	 * @param lastRoute the last route
	 * @param legacyViaStation the legacy via station
	 * @param country the country
	 * @param seriesNumber the series number
	 * @throws ConverterException the converter exception
	 */
	private void addToRoute(EList<ViaStation> lastRoute, LegacyViastation legacyViaStation, Country country, int seriesNumber) throws ConverterException {
		
		ViaStation via = getViaStation(tool, country,legacyViaStation.getCode(), seriesNumber);
		if (via != null) {
			lastRoute.add(via);
		} 
	}

	/**
	 * Checks if is mapped station.
	 *
	 * @param code the code
	 * @return true, if is mapped station
	 */
	private boolean isMappedStation(int code) {	
		
		if (tool.getConversionFromLegacy() != null && 
			tool.getConversionFromLegacy().getParams() != null &&
			tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings() != null &&
			tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings().getLegacyStationToServiceBrandMappings() != null) {
			for (LegacyStationToServiceConstraintMapping map : tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings().getLegacyStationToServiceBrandMappings()) {
				if (map.getCode() == code) return true;
			}
		}
		
		if (tool.getGeneralTariffModel().getFareStructure()!= null &&
			tool.getGeneralTariffModel().getFareStructure().getServiceConstraints() != null &&
			tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints() != null) {
			
			for (ServiceConstraint sc : tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints()) {
				if (sc.getLegacy108Code() == code) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Gets the station.
	 *
	 * @param tool the tool
	 * @param country the country
	 * @param localCode the legacy code of a station
	 * @return the station
	 * @throws ConverterException the converter exception in case the station is not found and not mapped to something else
	 */
	public Station getStationByLocalCode(GTMTool tool, Country country, int localCode) throws ConverterException {
		
		Station station = null;
		
		//mapped station?
		if (tool.getConversionFromLegacy().getParams().getLegacyStationMappings() != null) {
			station = findMappedStation(localCode);
			if (station != null) {
				return station;
			}
		}
		
		//is it a virtual serviceConstraint?
		ServiceConstraint constraint = this.findServiceConstraintByLegacyCode(localCode);
		if (constraint != null){
			return null;
		}
		
		//get the real station 
		station = localStations.get(localCode);
		if (station != null) {
			return station;
		}
					
		//is it a virtual border point?	
		Legacy108Station ls = legacyStations.get(localCode);
		if (ls == null) return null;
		
		//if it is a border point get the station from the right side of the border
		if (ls.getBorderPointCode() > 0) {
			Station s = getBorderStation(ls.getBorderPointCode());
			if (s != null) {
				StringBuilder sb = new StringBuilder();
				sb.append("Station not found: ").append(ls.getName());
				sb.append(" - code: ").append(ls.getStationCode());
				sb.append(" - border code: ").append(ls.getBorderPointCode());
				sb.append(" replaced by: ").append(s.getName());
				GtmUtils.writeConsoleWarning(sb.toString(), editor);
				//seems to be a virtual station not included in MERITS
				return null;
			} 
		}
			
		//is it a virtual fare station set?
		if (ls.getFareReferenceStationCode() == ls.getStationCode() && ls.getStationCode() > 0) {
			StringBuilder sb = new StringBuilder();
			sb.append("Fare Station Set: ").append(ls.getName());
			sb.append(" - ").append(ls.getStationCode());
			sb.append(" not a station code. It is assumed to be a virtual fare station set.");
			GtmUtils.writeConsoleInfo(sb.toString(), editor);
			return null;
		} 
			
		//it is missing!
		StringBuilder sb = new StringBuilder();
		sb.append(NationalLanguageSupport.ConverterFromLegacy_40);
		sb.append(localCode);
		if (ls != null) {
			sb.append("-").append(ls.getName());
		}
		GtmUtils.writeConsoleError(sb.toString(), editor);			

		return null;
	}
	
	/**
	 * Find mapped station.
	 *
	 * @param localCode the local code
	 * @return the station
	 */
	private Station findMappedStation(long localCode) {
		
		if (localCode == 0) return null;
		
		if (tool.getConversionFromLegacy().getParams().getLegacyStationMappings().getStationMappings() == null 
			|| tool.getConversionFromLegacy().getParams().getLegacyStationMappings().getStationMappings().isEmpty()) {
			return null;
		}
		
		for (LegacyStationMap map: tool.getConversionFromLegacy().getParams().getLegacyStationMappings().getStationMappings()){
			if (map.getLegacyCode() == localCode) return map.getStation();
		}

		return null;

	}


	/**
	 * find the station to replace the virtual border point station.
	 *
	 * @param borderPointCode the border point code
	 * @return the station
	 */
	private Station getBorderStation(int borderPointCode) {
		
		LegacyBorderPoint lbp = borderPoints.get(borderPointCode);
		if (lbp == null) return null;
		
		if (lbp.getBorderSides() != null) {
			for (LegacyBorderSide bs : lbp.getBorderSides()) {
				
				if (bs.getCarrier().equals(tool.getConversionFromLegacy().getLegacy108().getCarrier())) {
					if (bs.getStations() != null && !bs.getStations().getStations().isEmpty() ) {
					  return bs.getStations().getStations().get(0);
					}
				}
			}
		}
		
		if (lbp.getOnBorderStations() != null && lbp.getOnBorderStations().getStations() != null && !lbp.getOnBorderStations().getStations().getStations().isEmpty() ) {
			return lbp.getOnBorderStations().getStations().getStations().get(0);
		}
		
		//border point data incomplete!!
				
		return null;
	}




	/**
	 * Convert series to price.
	 *
	 * @param tool the tool
	 * @param series the series
	 * @param fareTemplate the fare template
	 * @param dateRange the date range
	 * @param priceList the price list
	 * @param regionalConstraint the regional constraint
	 * @return the price
	 * @throws ConverterException the converter exception
	 */
	public Price convertSeriesToPrice(GTMTool tool, LegacySeries series, FareTemplate fareTemplate, DateRange dateRange, ArrayList<Price> priceList, RegionalConstraint regionalConstraint) throws ConverterException{
			    
		if (fareTemplate.getPrice() != null) {
			return fareTemplate.getPrice();
		}
	
		Price price = null;
			
		try {
			Float amount = null;		
			
			
			if (fareTemplate.getBasePriceClass() == null || fareTemplate.getBasePriceClass().equals(BasePriceClassType.SERVICE_CLASS)) {
				if (fareTemplate.getServiceClass().getClassicClass() == ClassicClassType.FIRST) {
					amount = getAdultAmount(tool, series,1,dateRange);
				} else {
					amount = getAdultAmount(tool, series,2,dateRange);	
				}	
			} else {
				if (fareTemplate.getBasePriceClass().equals(BasePriceClassType.FIRST)) {
					amount = getAdultAmount(tool, series,1,dateRange);
				} else if (fareTemplate.getBasePriceClass().equals(BasePriceClassType.SECOND)) {
					amount = getAdultAmount(tool, series,2,dateRange);	
				}
			}
			if (amount == null) return null;

			amount = amount * fareTemplate.getPriceFactor();
			
			amount = round(amount,fareTemplate.getRoundingMode());
			
		    price = createPrice(amount,regionalConstraint);
		    
		    
		    Price minimalPrice = fareTemplate.getMinimalPrice();	  
		    
		    if (minimalPrice != null && minimalPrice.getCurrencies() != null && !minimalPrice.getCurrencies().isEmpty()) {
		    	
		    	Float minimalAmount = getEuroAmount(minimalPrice);
		    			
		    	if (minimalAmount != null && amount < minimalAmount) {
		    		price = clonePrice(minimalPrice);
		    	}
		    	
		    }
		    
		    Price maximalPrice = fareTemplate.getMaximalPrice();	  
		    
		    if (maximalPrice != null && maximalPrice.getCurrencies() != null && !maximalPrice.getCurrencies().isEmpty()) {
		    	
		    	Float maximalAmount = getEuroAmount(maximalPrice);
		    			
		    	if (maximalAmount != null && amount > maximalAmount) {
		    		price = clonePrice(maximalPrice);
		    	}
		    	
		    }
		    
			if (price != null) {
				price = findPrice(price, priceList);
			}
			
			return price;
		
		} catch (Exception e) {
			String message = NationalLanguageSupport.ConverterFromLegacy_42 + Integer.toString(series.getNumber()) + ")"; //$NON-NLS-2$
			GtmUtils.writeConsoleError(message, editor);
			GtmUtils.writeConsoleStackTrace(e, editor);
			return null;
		}
	}
	
	private Float getEuroAmount(Price price) {
		
		if (price == null || 
			price.getCurrencies() == null ||
			price.getCurrencies().isEmpty()){
			return null;
		}
				for (CurrencyPrice cp : price.getCurrencies()) {
			if (cp.getCurrency() != null && cp.getCurrency().getIsoCode().equals("EUR")) {
				return cp.getAmount();
			}
		}
		for (CurrencyPrice cp : price.getCurrencies()) {
			if (cp.getCurrency() == null) {
				return cp.getAmount();
			}
		}
		return null;
	}


	private Price clonePrice(Price price) {
		
		if (price == null) return null;
		
		Price clone = GtmFactory.eINSTANCE.createPrice();
		price.setDataSource(DataSource.CONVERTED);
		
		if (price.getCurrencies() == null || price.getCurrencies().isEmpty()) {
			return null;
		}
		
		for (CurrencyPrice cp : price.getCurrencies()) {
			CurrencyPrice curPrice = GtmFactory.eINSTANCE.createCurrencyPrice();
			curPrice.setAmount(cp.getAmount());
			if (cp.getCurrency() != null) {
				curPrice.setCurrency(cp.getCurrency());
			} else {
				curPrice.setCurrency(findCurrency("EUR"));
			}
			
			if (cp.getVATdetails()!= null && !cp.getVATdetails().isEmpty()) {
				
				for (VATDetail vat: cp.getVATdetails()) {
				
					VATDetail vatDetail = GtmFactory.eINSTANCE.createVATDetail();
					vatDetail.setPercentage(vat.getPercentage());
					vatDetail.setCountry(vat.getCountry());
					vatDetail.setTaxId(vat.getTaxId());
					vatDetail.setScope(vat.getScope());
					vatDetail.setAmount(vat.getAmount());
					curPrice.getVATdetails().add(vatDetail);

				}

			}

			clone.getCurrencies().add(curPrice);
		}
		
		return clone;
	}


	private Currency findCurrency(String string) {
		
		if (tool == null || tool.getCodeLists() == null || 
			tool.getCodeLists().getCurrencies() == null ||
			tool.getCodeLists().getCurrencies().getCurrencies() == null||
			tool.getCodeLists().getCurrencies().getCurrencies().isEmpty()) {
			return null;
		}
		for (Currency c : tool.getCodeLists().getCurrencies().getCurrencies()) {
			if (c.getIsoCode().equalsIgnoreCase("EUR")) {
				return c;
			}
		}

		return null;
	}


	/**
	 * Creates the price.
	 *
	 * @param amount the amount
	 * @param regionalConstraint the regional constraint
	 * @return the price
	 */
	private Price createPrice(float amount, RegionalConstraint regionalConstraint) {
		
		Price price = GtmFactory.eINSTANCE.createPrice();
		price.setDataSource(DataSource.CONVERTED);
			
		CurrencyPrice curPrice = GtmFactory.eINSTANCE.createCurrencyPrice();
		curPrice.setAmount(amount);
		curPrice.setCurrency(tool.getCodeLists().getCurrencies().findCurrency("EUR")); //$NON-NLS-1$
	
		try {
			addVat(curPrice,regionalConstraint);
		} catch (Exception e) {
			StringBuilder sb = new StringBuilder();
			sb.append("Vat calculation failed for amount: ");
			sb.append(amount).append(" - ");
			sb.append(e.getMessage());
			GtmUtils.writeConsoleError("Vat calculation failed for ", editor);
		}
		price.getCurrencies().add(curPrice);
		return price;
		
	}

	/**
	 * Adds the vat.
	 *
	 * @param curPrice the cur price
	 * @param regionalConstraint the regional constraint
	 */
	private void addVat(CurrencyPrice curPrice, RegionalConstraint regionalConstraint) {
		
		//no vat data
	    if (tool.getConversionFromLegacy().getParams() == null || 
	    	tool.getConversionFromLegacy().getParams().getVatTemplates() == null || 
	       	tool.getConversionFromLegacy().getParams().getVatTemplates().getVatTemplates() == null || 	    	
	    	tool.getConversionFromLegacy().getParams().getVatTemplates().getVatTemplates().isEmpty()) {
	    	return;
	    }
	    
		for (VatTemplate vat : tool.getConversionFromLegacy().getParams().getVatTemplates().getVatTemplates()) {
			
			VATDetail vatDetail = GtmFactory.eINSTANCE.createVATDetail();
			vatDetail.setPercentage(vat.getPercentage());
			vatDetail.setCountry(vat.getCountry());
			vatDetail.setTaxId(vat.getTaxId());
			vatDetail.setScope(vat.getScope());
			BigDecimal bd = new BigDecimal(curPrice.getAmount()*vat.getPercentage()/100).setScale(2, RoundingMode.UP);
			vatDetail.setAmount(bd.floatValue());
			curPrice.getVATdetails().add(vatDetail);
			
		}

	}

	
	/**
	 * Gets the adult amount.
	 *
	 * @param tool the tool
	 * @param series the series
	 * @param travelClass the travel class
	 * @param dateRange the date range
	 * @return the adult amount
	 */
	private static Float getAdultAmount(GTMTool tool, LegacySeries series, int travelClass, DateRange dateRange) {
		
		if (travelClass == 1) {
			//distance = 0 indicates no price in that class!
			if (series.getDistance1() == 0) return null;
		} else {
			//distance = 0 indicates no price in that class!
			if (series.getDistance2() == 0) return null;
		}
		
		if (series.getPricetype() == LegacyCalculationType.ROUTE_BASED) {
			
			for (LegacyRouteFare fare : tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare()){
			
				if (   fare.getFareTableNumber() == series.getFareTableNumber()
				    && fare.getSeriesNumber() == series.getNumber() 
				    && checkDateEqual(fare.getValidFrom(), dateRange.getStartDate())
				    && checkDateEqual(fare.getValidUntil(), dateRange.getEndDate())
				   )  {
					if (travelClass == 1) {
						return GtmUtils.getEuroFromCent(fare.getFare1st()); 
					} else {
						return GtmUtils.getEuroFromCent(fare.getFare2nd()); 
					}
				}
			}
		}  else if (series.getPricetype() == LegacyCalculationType.DISTANCE_BASED) {
			//calculate distance based fare 
			
			Integer price = null;
					
			int distance = 0;
			int distance1 = 0;
			if (travelClass == 1) {
				distance = series.getDistance1();
				if (series.getDistance1() != series.getDistance2() && series.getDistance1() != 0) {
					distance1 = series.getDistance1();
					distance = series.getDistance2();
				}
			} else {
				distance = series.getDistance2();
			}
			if (distance1 == 0) {
				price = calculateDistancePrice(tool, travelClass, distance, series.getFareTableNumber(), dateRange);
			} else {
				Integer price1section = calculateDistancePrice(tool, 1, distance1, series.getFareTableNumber(), dateRange);
				Integer price2section = calculateDistancePrice(tool, 2, distance1, series.getFareTableNumber(), dateRange);
				Integer price2 = calculateDistancePrice(tool, 2, distance, series.getFareTableNumber(), dateRange);
				Integer priceUpgrade = null;
				if (price2 != null && price1section != null && price1section != null) {
					priceUpgrade = price1section - price2section;
					if (priceUpgrade > 0 ) {
						price = price2 + priceUpgrade;
					} else {
						price = price2;
					}
				} else {
					return null;
				}
			}

			if (price == null) return null;
			
			return GtmUtils.getEuroFromCent(price);
		}
		return null;
	}

	


	/**
	 * Calculate distance price.
	 *
	 * @param tool the tool
	 * @param travelClass the travel class
	 * @param distance the distance
	 * @param fareTableNumber the fare table number
	 * @param dateRange the date range
	 * @return the integer
	 */
	private static Integer calculateDistancePrice(GTMTool tool, int travelClass, int distance, int fareTableNumber, DateRange dateRange) {
		//get the lowest price where the distance is ok
		int price = 0;
		boolean distanceFound = false;
		for (LegacyDistanceFare fare : tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare()) {
			if (   fare.getFareTableNumber() == fareTableNumber	
				 && checkDateEqual(fare.getValidFrom(), dateRange.getStartDate())
				 && checkDateEqual(fare.getValidUntil(), dateRange.getEndDate())
				)  {	
				if (travelClass == 1) {
					if (distance <= fare.getDistance() && (fare.getFare1st() < price || !distanceFound)) {
						price = fare.getFare1st();
						distanceFound = true;
					}
				} else {
					if (distance <= fare.getDistance() && (fare.getFare2nd() < price || !distanceFound)) {
						price = fare.getFare2nd();
						distanceFound = true;
					}				
				}
			}
		}
		if (!distanceFound) {
			return null;
		} else {
			return Integer.valueOf(price);
		}

	}


	/**
	 * Check date equal.
	 *
	 * @param date1 the date 1
	 * @param date2 the date 2
	 * @return true, if successful
	 */
	private static boolean checkDateEqual(Date date1, Date date2) {
		
		String d1 = dateFormat.format(date1);
		String d2 = dateFormat.format(date2);
		
		return d1.equals(d2);

	}


	/**
	 * Convert series to fare.
	 *
	 * @param tool the tool
	 * @param series the series
	 * @param fareTemplate the fare template
	 * @param direction the direction
	 * @param legacyFareCounter the legacy fare counter
	 * @param price the price
	 * @param regionalConstraint the regional constraint
	 * @param dateRange the date range
	 * @param afterSalesRules the after sales rules
	 * @param priceList the price list
	 * @param fares the fares
	 * @return the fare element
	 * @throws ConverterException the converter exception
	 */
	public void convertSeriesToFare(GTMTool tool, LegacySeries series, FareTemplate fareTemplate, int direction, int legacyFareCounter, Price price, RegionalConstraint regionalConstraint, DateRange dateRange, ArrayList<AfterSalesRule> afterSalesRules, ArrayList<Price> priceList, ArrayList<FareElement> fares) throws ConverterException{
		
		if (regionalConstraint == null) return;
		
		FareElement fare = GtmFactory.eINSTANCE.createFareElement();
		template2Fare(fare, fareTemplate);
		if (series.getBusCode() != null && series.getFerryCode() != null && "B".equals(series.getBusCode())  && "S".equals(series.getFerryCode())) {
			if (tool.getConversionFromLegacy().getParams().getBusFerryMapping() != null) {
				if (tool.getConversionFromLegacy().getParams().getBusFerryMapping().getBusFerryConstraint() != null) {
					fare.setServiceConstraint(tool.getConversionFromLegacy().getParams().getBusFerryMapping().getBusFerryConstraint());
				}
			}
		} else if (series.getBusCode() != null && "B".equals(series.getBusCode())) {
			if (tool.getConversionFromLegacy().getParams().getBusFerryMapping().getBusServiceConstraint() != null) {
				fare.setServiceConstraint(tool.getConversionFromLegacy().getParams().getBusFerryMapping().getBusServiceConstraint());
			}
		} else if (series.getFerryCode() != null && "S".equals(series.getFerryCode())) {
			if (tool.getConversionFromLegacy().getParams().getBusFerryMapping().getBusFerryConstraint() != null) {
				fare.setServiceConstraint(tool.getConversionFromLegacy().getParams().getBusFerryMapping().getFerryConstraint());
			}
		}
		
		if (series.getMemoNumber() > 0) {
			setDetailDescription(fare,series.getMemoNumber());
		}
		
		//legacy accounting identifier
		LegacyAccountingIdentifier accountingIdentifier = GtmFactory.eINSTANCE.createLegacyAccountingIdentifier();
		accountingIdentifier.setAddSeriesId(0);
		if (fareTemplate.getLegacyAccountingTariffId() != 0) {
			accountingIdentifier.setTariffId(fareTemplate.getLegacyAccountingTariffId());
		} else {
			accountingIdentifier.setTariffId(fareTemplate.eContainer().eContents().indexOf(fareTemplate) + 1);
		}	
		accountingIdentifier.setSeriesId(series.getNumber());
		fare.setLegacyAccountingIdentifier(accountingIdentifier);
		
		
		
		fare.setDataSource(DataSource.CONVERTED);
	
		FareConstraintBundle bundle = null;
		
		if (isSeparateContract(series)) {
			if (fareTemplate.getSeparateContractFareConstraintBundle() ==  null) {
				StringBuilder sb = new StringBuilder();
				sb.append("A fare constraint bundle for seperate contracts is missing in fare template: ").append(GtmUtils.getLabelText(fareTemplate));
				GtmUtils.writeConsoleError(sb.toString(), editor);
				return;
			}
			bundle = fareTemplate.getSeparateContractFareConstraintBundle();
		} else {
			if (fareTemplate.getFareConstraintBundle() == null) {
				StringBuilder sb = new StringBuilder();
				sb.append("A fare constraint bundle is missing in fare template: ").append(GtmUtils.getLabelText(fareTemplate));
				GtmUtils.writeConsoleError(sb.toString(), editor);		
				return;
			}
			bundle = fareTemplate.getFareConstraintBundle();
		}
		fare.setDataDescription(NationalLanguageSupport.ConverterFromLegacy_44 + Integer.toString(series.getNumber()) +NationalLanguageSupport.ConverterFromLegacy_45 + fareTemplate.getDataDescription());
		
		fare.setPrice(price);
		fare.setRegionalConstraint(regionalConstraint);
		
		//add carrier to viaStation
		CarrierConstraint cc = findCarrierContraint(tool,InvolvedTcoFinder.getInvolvedCarriers(regionalConstraint));
		
		if (fare.getRegionalConstraint() != null 
			&& fare.getRegionalConstraint().getRegionalValidity() != null
			&& fare.getRegionalConstraint().getRegionalValidity().get(0) != null
			&& fare.getRegionalConstraint().getRegionalValidity().get(0).getViaStation() != null){
			   fare.getRegionalConstraint().getRegionalValidity().get(0).getViaStation().setCarrierConstraint(cc);
		}

		if (fareTemplate.getCarrierConstraint() != null &&
			bundle.getCarrierConstraint() != fareTemplate.getCarrierConstraint()) {
			fare.setCarrierConstraint(fareTemplate.getCarrierConstraint());
		}
		
		if (fare.getCarrierConstraint() == null  
				&& cc != null 
				&& bundle.getCarrierConstraint() != cc) {
			fare.setCarrierConstraint(cc);
		}
				
		regionalConstraint.getLinkedFares().add(fare);
		
		fare.setFareConstraintBundle(bundle);
		
		if (bundle.getSalesAvailability() == null) {
			if(tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints() != null
				&& tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints() != null
				&& tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints().size() == 1 
				) {
				
				//use a predefined sales availability in case it is complete
				SalesAvailabilityConstraint s = tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints().get(0);				
				if (isUsableSalesAvailability(s)) {
					bundle.setSalesAvailability(s);
				}
			}
		}
		
		//still not set
		if (bundle.getSalesAvailability() == null || !isUsableSalesAvailability(bundle.getSalesAvailability())) {
		
			FareConstraintBundle validityBundle = findBundle(bundle, dateRange); 
			if (validityBundle != null) {
				fare.setFareConstraintBundle(validityBundle);
			} else {
				
				//multiple sales availabilities to choose
				GtmUtils.writeConsoleWarning("Validity Ranges are not unique! Fare constraint bundles will be copied per validity range.", editor);

				SalesAvailabilityConstraint s = findSalesAvailability(tool, dateRange);
				
				FareConstraintBundle bundle2 = EcoreUtil.copy(bundle);
				if (s == null) {
					GtmUtils.writeConsoleError("No Sales Availability found" , editor);
				} else {
					bundle2.setSalesAvailability(s);
				}
				bundle2.setDataSource(DataSource.CONVERTED);	
					
				HashSet<FareConstraintBundle> validityBundles = convertedBundles.get(bundle);
				if (validityBundles == null) {
					validityBundles = new HashSet<FareConstraintBundle>();
					validityBundles.add(bundle2);
					convertedBundles.put(bundle, validityBundles);
				} else {
					validityBundles.add(bundle2);
				}
				
				fare.setFareConstraintBundle(bundle2);
			}
		} 
		
		mapConstraintsAndDescriptions(fare, series);
		if (price != null && fare != null) {
			fare.setAfterSalesRule(convertAfterSalesRules(price, fareTemplate, afterSalesRules, priceList));	
		}
		
	
		//add TCOs
		fare.getInvolvedTcos().addAll(InvolvedTcoFinder.getInvolvedTcos(tool,regionalConstraint));

		//add carriers
		AddCarrierRuleEngine.addCarriers(tool,fare.getRegionalConstraint());
		
		//check carrier filter to include the additional carriers from the mappings
		if (!checkCarrierFilter(regionalConstraint, fareTemplate)){
			fare = null;
		}
		
		if (fare != null) {
			fares.add(fare);	
		}
	}

	



	/**
	 * Find carrier contraint.
	 *
	 * @param tool the tool
	 * @param involvedCarriers the involved carriers
	 * @return the carrier constraint
	 */
	private CarrierConstraint findCarrierContraint(GTMTool tool, Set<Carrier> carriers) {
		
		if (carriers == null || carriers.isEmpty()) {
			return null;
		}
		

		if (tool.getGeneralTariffModel().getFareStructure() == null
		    || tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints() == null) {
			return null;
		}
		
		for (CarrierConstraint cc : tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints().getCarrierConstraints()) {
			
           if (cc.getIncludedCarriers() != null 
        	   && cc.getIncludedCarriers().size() == carriers.size() 
        	   && cc.getIncludedCarriers().containsAll(carriers)) {
        	   return cc;
           }
			
		}
		

		return null;
	}


	/**
	 * Find bundle.
	 *
	 * @param bundle the bundle
	 * @param dateRange the date range
	 * @return the fare constraint bundle
	 */
	private FareConstraintBundle findBundle(FareConstraintBundle bundle, DateRange dateRange) {
		
		if (dateRange == null || dateRange.getStartDate() == null || dateRange.getEndDate() == null) {
			return null;
		}
		
		if (convertedBundles == null | convertedBundles.get(bundle) == null || convertedBundles.get(bundle).isEmpty()) return null;
		
		for (FareConstraintBundle bu : convertedBundles.get(bundle)){
			
			SalesAvailabilityConstraint sa = bu.getSalesAvailability();
			
			if (sa != null && sa.getDataSource() != null && sa.getDataSource() == DataSource.CONVERTED) {
				
				if (isUsableSalesAvailability(sa)) {
					
					Calendar ca = sa.getRestrictions().get(0).getSalesDates();
					
					if (GtmUtils.checkDateOnlyEqual(ca.getFromDateTime(), dateRange.startDate)
						&&
						GtmUtils.checkDateOnlyEqual(ca.getUntilDateTime(), dateRange.endDate)){
						return bu;
					}
				}
			}
		}
		
		return null;

	}

	/**
	 * Sets the detail description.
	 *
	 * @param fare the fare
	 * @param memoNumber the memo number
	 */
	private void setDetailDescription(FareElement fare, int memoNumber) {
		
		// search memo
		Legacy108Memo  memo = getLegacyMemo(memoNumber);
		if (memo == null) {
			return;
		}
		// search or create text
		Text text = searchText(memo);
		if (text == null){
			return;
		}
		// link text to fare
		fare.setFareDetailDescription(text);
		
	}

	/**
	 * Search text.
	 *
	 * @param memo the memo
	 * @return the text
	 */
	private Text searchText(Legacy108Memo memo) {
		
		Text text = memoTexts.get(Integer.valueOf(memo.getNumber()));
		if (text != null) {
			return text;
		}
		
		text = GtmFactory.eINSTANCE.createText();
		text.setDataSource(DataSource.GENERATED);
		text.setTextUTF8(memo.getLocal());
		text.setTextICAO(GtmUtils.utf2ascii(text.getTextUTF8()));
		if (memo.getEnglish() != null && memo.getEnglish().length() > 0) {
			Translation e = GtmFactory.eINSTANCE.createTranslation();
			e.setLanguage(getEnglish());
			e.setTextUTF8(memo.getEnglish());
			e.setTextICAO(GtmUtils.utf2ascii(e.getTextUTF8()));
			e.setShortTextUTF8(e.getTextUTF8());
			e.setShortTextICAO(e.getTextICAO());
			text.getTranslations().add(e);
		}	
		if (memo.getFrench() != null && memo.getFrench().length() > 0) {
			Translation e = GtmFactory.eINSTANCE.createTranslation();
			e.setLanguage(getFrench());
			e.setTextUTF8(memo.getFrench());
			e.setTextICAO(GtmUtils.utf2ascii(e.getTextUTF8()));
			e.setShortTextUTF8(e.getTextUTF8());
			e.setShortTextICAO(e.getTextICAO());
			text.getTranslations().add(e);
		}
		if (memo.getGerman() != null && memo.getGerman().length() > 0) {
			Translation e = GtmFactory.eINSTANCE.createTranslation();
			e.setLanguage(getGerman());
			e.setTextUTF8(memo.getGerman());
			e.setTextICAO(GtmUtils.utf2ascii(e.getTextUTF8()));
			e.setShortTextUTF8(e.getTextUTF8());
			e.setShortTextICAO(e.getTextICAO());
			text.getTranslations().add(e);
		}	

		memoTexts.put(Integer.valueOf(memo.getNumber()),text);
		return text;
	}

	/**
	 * Gets the german.
	 *
	 * @return the german
	 */
	private Language getGerman() {
		for (Language l : tool.getCodeLists().getLanguages().getLanguages()) {
			if (l.getCode().equals("de")) {
				return l;
			}
		}
		return null;
	}

	/**
	 * Gets the french.
	 *
	 * @return the french
	 */
	private Language getFrench() {
		for (Language l : tool.getCodeLists().getLanguages().getLanguages()) {
			if (l.getCode().equals("fr")) {
				return l;
			}
		}
		return null;
	}

	/**
	 * Gets the english.
	 *
	 * @return the english
	 */
	private Language getEnglish() {
		for (Language l : tool.getCodeLists().getLanguages().getLanguages()) {
			if (l.getCode() != null && l.getCode().equals("en")) {
				return l;
			}
		}
		return null;
	}

	/**
	 * Gets the legacy memo.
	 *
	 * @param memoNumber the memo number
	 * @return the legacy memo
	 */
	private Legacy108Memo getLegacyMemo(int memoNumber) {
		if (tool.getConversionFromLegacy().getLegacy108().getLegacyMemos() == null) {
			return null;
		}
		
		for (Legacy108Memo m : tool.getConversionFromLegacy().getLegacy108().getLegacyMemos().getLegacyMemos()) {
		   if (m.getNumber() == memoNumber) {
			   return m;
		   }
		}
		return null;
	}

	/**
	 * Template 2 fare.
	 *
	 * @param fare the fare
	 * @param fareTemplate the fare template
	 */
	private void template2Fare(FareElement fare,FareTemplate fareTemplate) {
		
		fare.setFareDetailDescription(fareTemplate.getFareDetailDescription());
		fare.setIndividualContracts(fareTemplate.isIndividualContracts());		
		fare.setPassengerConstraint(fareTemplate.getPassengerConstraint());
		fare.setReductionConstraint(fareTemplate.getReductionConstraint());
		fare.setReservationParameter(fareTemplate.getReservationParameter());
		fare.setServiceClass(fareTemplate.getServiceClass());
		fare.setServiceConstraint(fareTemplate.getServiceConstraint());
		fare.setServiceLevel(fareTemplate.getServiceLevel());
		fare.setText(fareTemplate.getText());
		fare.setType(fareTemplate.getType());
		fare.setLegacyConversion(fareTemplate.getLegacyConversion());
		fare.setLuggageConstraint(fareTemplate.getLuggageConstraint());
		
		if (fareTemplate.getRegulatoryConditions() != null && !fareTemplate.getRegulatoryConditions().isEmpty()) {
			fare.getRegulatoryConditions().addAll(fareTemplate.getRegulatoryConditions());
		}
		
	}
	



	/**
	 * Checks if is separate contract.
	 *
	 * @param series the series
	 * @return true, if is separate contract
	 */
	private boolean isSeparateContract(LegacySeries series) {
		if (tool.getConversionFromLegacy().getLegacy108().getLegacySeparateContractSeries() == null || tool.getConversionFromLegacy().getLegacy108().getLegacySeparateContractSeries().getSeparateContractSeries().isEmpty()) {
			return false;
		}
		for (LegacySeparateContractSeries sep : tool.getConversionFromLegacy().getLegacy108().getLegacySeparateContractSeries().getSeparateContractSeries()) {
			if (sep.getSeriesNumber() == series.getNumber()) return true;
		}
		return false;
	}




	/**
	 * Convert border points.
	 *
	 * @return the number of added connection points
	 */
     public HashSet<ConnectionPoint> convertBorderPoints() {
    	 
    	HashSet<Carrier> involvedCarriers = getInvolvedCarriers(tool);   	
		
		//add converted border points related to the carrier
		for (LegacyBorderPoint lp : tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints()) {
			
			try {
			
				ConnectionPoint connectionPoint = convertImportedBorderPoint(lp, involvedCarriers);
				if (connectionPoint != null) {
					borderConnectionPoints.put(lp.getBorderPointCode(), connectionPoint);
				}
				
				
				
			
			} catch (Exception e) {
				StringBuilder sb = new StringBuilder();
				sb.append("Unknown error! Border Point not converted: number - ").append(lp.getBorderPointCode()).append('\n');
				sb.append(GtmUtils.getStackTrace(e));
				GtmUtils.writeConsoleError(sb.toString(), editor);
			}

		}
		
	
		//add additional connection points from series
		Set<Integer> legacyStationCodes = getSeriesEndStations();

		for (Integer stationCode : legacyStationCodes) {
			findOrCreateConnectionPoint(tool, stationCode, myCountry);
		}
		
		
		HashSet<ConnectionPoint> connectionPoints = new HashSet<ConnectionPoint>();
		
		if (!borderConnectionPoints.isEmpty()) {
			connectionPoints.addAll(borderConnectionPoints.values());
		}
		if (!legacyStationConnectionPoints.isEmpty()) {
		  connectionPoints.addAll(legacyStationConnectionPoints.values());
		} 
		
		return connectionPoints;
	}

	/**
	 * Gets the involved carriers.
	 *
	 * @param tool the tool
	 * @return the involved carriers
	 */
	private HashSet<Carrier> getInvolvedCarriers(GTMTool tool) {
		
    	HashSet<Carrier> involvedCarriers = new HashSet<Carrier>();
    	
    	if (tool.getConversionFromLegacy().getLegacy108().getCarrier() != null){
    		involvedCarriers.add(tool.getConversionFromLegacy().getLegacy108().getCarrier());
    	}
    	
    	if (tool.getConversionFromLegacy() != null &&
    		tool.getConversionFromLegacy().getLegacy108() != null &&
    		tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList()!= null &&
    		tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries() != null) {
    	
    		for (LegacySeries s : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {

    			involvedCarriers.addAll(findCarriers(tool,s.getCarrierCode() ));
   			
    		}
    	}
    	
    	if (tool.getGeneralTariffModel()!= null &&
    		tool.getGeneralTariffModel().getFareStructure() != null &&
    		tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints() != null &&	
    		tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints().getCarrierConstraints() != null) {
    		
    		for (CarrierConstraint cc : tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints().getCarrierConstraints()) {
    			
    			if (cc.getIncludedCarriers() != null && !cc.getIncludedCarriers().isEmpty()) {
    				involvedCarriers.addAll(cc.getIncludedCarriers());
    			}
    		}
    		
    		
    	}
 
		return involvedCarriers;
	}

	/**
	 * Convert imported border point.
	 *
	 * @param lBorder the l border
	 * @param involvedCarriers the involved carriers
	 * @return the connection point
	 */
	private ConnectionPoint convertImportedBorderPoint(LegacyBorderPoint lBorder, HashSet<Carrier> involvedCarriers) {
		
		boolean carrierInvolved = false;
		for (LegacyBorderSide side: lBorder.getBorderSides()) {
			if (involvedCarriers.contains(side.getCarrier())) {
				carrierInvolved = true;
			}
		}
		if (!carrierInvolved) return null;
		
		// keep only one connection point per legacy border point code
		if (lBorder.getBorderPointCode() > 0) {
			for (ConnectionPoint p : tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints()) {
				if (p.getLegacyBorderPointCode() == lBorder.getBorderPointCode()) return null;
			}
		}
		
		HashSet<Station> stationNamesNeeded = new HashSet<Station>();
				
		if (lBorder.getOnBorderStations()!= null && lBorder.getOnBorderStations().getStations() != null && !lBorder.getOnBorderStations().getStations().getStations().isEmpty()) {
			
			ConnectionPoint point = GtmFactory.eINSTANCE.createConnectionPoint();
			point.setLegacyBorderPointCode(lBorder.getBorderPointCode());
			point.setDataSource(DataSource.IMPORTED);
			StationSet stations = EcoreUtil.copy(lBorder.getOnBorderStations().getStations());
			stations.getStations().addAll(lBorder.getOnBorderStations().getStations().getStations());
			point.getConnectedStationSets().add(stations);
			stationNamesNeeded.addAll(stations.getStations());
			
			return point;
		}
		if (lBorder.getBorderSides()!= null && lBorder.getBorderSides().size() > 1) {
			ConnectionPoint point = GtmFactory.eINSTANCE.createConnectionPoint();
			point.setLegacyBorderPointCode(lBorder.getBorderPointCode());
			point.setDataSource(DataSource.IMPORTED);
			for (LegacyBorderSide side : lBorder.getBorderSides()) {
				StationSet stations = EcoreUtil.copy(side.getStations());
				if (side.getStations() != null && !side.getStations().getStations().isEmpty()) {
					stations.getStations().addAll(side.getStations().getStations());
				}
				if (involvedCarriers.contains(side.getCarrier())) {
					stationNamesNeeded.addAll(stations.getStations());
				}
				point.getConnectedStationSets().add(stations);
			}
			return point;			
		}
		
		
		return null;
		
		
	}

	/**
	 * Gets the series end stations.
	 *
	 * @return the series end stations
	 */
	private Set<Integer> getSeriesEndStations(){
		
		Set<Integer> stationCodes = new HashSet<Integer>();
		
		for (LegacySeries series : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			 stationCodes.add(series.getToStation());
			 stationCodes.add(series.getFromStation());			 
		}

		return stationCodes;
	}

	
	/**
	 * Check distance.
	 *
	 * @return true, if successful
	 * 
	 * 	private boolean checkDistance(Station station1, Station station2) {
	 * 		
	 * 		
	 * 		Float accuracy = ((float)PreferencesAccess.getIntFromPreferenceStore(PreferenceConstants.P_LINK_STATIONS_BY_GEO_ACCURACY)) / (60 * 60);
	 * 		
	 * 		if (station1 != station2 && 
	 * 			station1.getLatitude() > 0 &&
	 * 			station2.getLatitude() > 0 &&
	 * 			station1.getLongitude() > 0 &&
	 * 			station2.getLongitude() > 0 &&
	 * 			Math.abs(station1.getLatitude() - station2.getLatitude()) < accuracy &&
	 * 			Math.abs(station1.getLongitude() - station2.getLongitude()) < accuracy) {
	 * 				
	 * 			return true;
	 * 				
	 * 		}
	 * 		return false;
	 * 	}
	 */

	/**
	 * Convert sales availabilities.
	 *
	 * @return the int
	 */
	public HashSet<SalesAvailabilityConstraint> convertSalesAvailabilities() {
		
		HashSet<SalesAvailabilityConstraint> constraints = new HashSet<SalesAvailabilityConstraint>();
		
		ArrayList<DateRange> validityRanges = findAllPriceValidityRanges(tool.getConversionFromLegacy().getLegacy108());	
		
		//check whether we need	to convert sales availability or whether it is already set manually
		boolean conversionNeeded = false;
		
		SalesAvailabilityConstraint templateSalesAvailability = null;
		
		for (FareTemplate t : tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates()) {

			templateSalesAvailability = null;
			
			if (t.getFareConstraintBundle() != null && t.getFareConstraintBundle().getSalesAvailability() != null) {
				templateSalesAvailability = t.getFareConstraintBundle().getSalesAvailability();
			} else if (t.getSalesAvailability() != null) {
				templateSalesAvailability = t.getSalesAvailability();
			} 
						
			if (templateSalesAvailability == null 
				|| templateSalesAvailability.getRestrictions() == null
				|| templateSalesAvailability.getRestrictions().size() < 1 
				|| templateSalesAvailability.getRestrictions().get(0).getSalesDates() == null 
				|| templateSalesAvailability.getRestrictions().get(0).getSalesDates().getFromDateTime() == null 
				|| templateSalesAvailability.getRestrictions().get(0).getSalesDates().getUntilDateTime() == null){
				 conversionNeeded = true;
			} 
			
		}
		if (!conversionNeeded) {
			StringBuilder sb = new StringBuilder();
			sb.append("SalesAvailabilities are manually defined and reused. No SalesAvailability is converted from the 108 data.");
			GtmUtils.writeConsoleInfo(sb.toString(), editor);		
			return constraints;
		}		
		
		for ( DateRange r : validityRanges) {
			
			SalesAvailabilityConstraint constraint = GtmFactory.eINSTANCE.createSalesAvailabilityConstraint();
			constraint.setDataSource(DataSource.CONVERTED);
			SalesRestriction rest = GtmFactory.eINSTANCE.createSalesRestriction();
			Calendar cal = GtmFactory.eINSTANCE.createCalendar();
			cal.setDataSource(DataSource.CONVERTED);
			cal.setFromDateTime(GtmUtils.setTo0000UTC(r.getStartDate()));
			cal.setUntilDateTime(GtmUtils.setTo2359UTC(r.getEndDate()));
			TimeZone tz = TimeZone.getTimeZone(tool.getConversionFromLegacy().getLegacy108().getTimeZone().getName());
			if (tz != null) {
				cal.setUtcOffset(tz.getOffset(new Date().getTime()) / 1000 / 60 );
			}
			rest.setSalesDates(cal);
			if (templateSalesAvailability != null 
				&& templateSalesAvailability.getRestrictions() != null 
				&& templateSalesAvailability.getRestrictions().size() == 1
				&& templateSalesAvailability.getRestrictions().get(0).getStartOfSale() != null) {
				rest.setStartOfSale(EcoreUtil.copy(templateSalesAvailability.getRestrictions().get(0).getStartOfSale()));
			} else {
				rest.setStartOfSale(GtmFactory.eINSTANCE.createStartOfSale());
				rest.getStartOfSale().setReference(TimeReferenceType.BEFORE_START_VALIDITY);
				rest.getStartOfSale().setUnit(TimeUnit.DAY);
				rest.getStartOfSale().setValue(182);
			}

			if (templateSalesAvailability != null 
				&& templateSalesAvailability.getRestrictions() != null 
				&& templateSalesAvailability.getRestrictions().size() == 1
				&& templateSalesAvailability.getRestrictions().get(0).getEndOfSale() != null) {
				rest.setEndOfSale(EcoreUtil.copy(templateSalesAvailability.getRestrictions().get(0).getEndOfSale()));
			} else {	
				rest.setEndOfSale(GtmFactory.eINSTANCE.createEndOfSale());
				rest.getEndOfSale().setReference(TimeReferenceType.AFTER_END_VALIDITY);
				rest.getEndOfSale().setUnit(TimeUnit.DAY);
				rest.getEndOfSale().setValue(1);
			}
			
			constraint.getRestrictions().add(rest);
					
			constraints.add(constraint);
		
			salesAvailabilitiesFromSeries.put(cal.getFromDateTime(),constraint);		
			
			StringBuilder sb = new StringBuilder();
			sb.append("SalesAvailabilities are missing or don't contain calendars. New SalesAvailabilituies have been created.");
			GtmUtils.writeConsoleInfo(sb.toString(), editor);

		}
				
		return constraints;
	}



	/**
	 * Convert fare station sets.
	 *
	 * @return the int
	 */
	/*
	 * extracts zone definition from the 108 station data and create zone definitions
	 * 
	 * Zones in 108 are identified by a zone number  in the station data. all stations with this zone number belong to the zone. one 
	 * of the stations is a virtual station which can be references as departure or arrival station
	 * 
	 * for one zone:
	 * 		generate a zone mapping for the virtual station
	 * 		generate a zone definition
	 * 
	 */
	public FareStationSetDefinitions convertFareStationSets() {
		
		fareStationSets.clear();
		
		HashMap<Integer,HashSet<Legacy108Station>> stationList = new HashMap<Integer,HashSet<Legacy108Station>>();

		//create FareStationSets
		FareStationSetDefinitions fareStationSetDefinitions = GtmFactory.eINSTANCE.createFareStationSetDefinitions();

		//create list of fare station sets
		for (Legacy108Station station : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
			try {
				if (station.getFareReferenceStationCode() > 0) {
					Integer code = Integer.valueOf(station.getFareReferenceStationCode());
					
					//do not convert a fareStationSet in case it is already manually defined 
					FareStationSetDefinition set = findManualyDefinedStationSet(code);
					
					if (set != null) {			
						fareStationSetDefinitions.getFareStationSetDefinitions().add(set);
						fareStationSets.put(code, set);
					} else {
						if (stationList.get(code) != null) {
							stationList.get(code).add(station);
						} else {
							stationList.put(code,new HashSet<Legacy108Station>());
							stationList.get(code).add(station);
						}
					}
				}
			} catch (Exception e) {
				StringBuilder sb = new StringBuilder();
				sb.append("Unknown error! Station not converted: station number - ").append(station.getStationCode()).append('\n');
				sb.append(GtmUtils.getStackTrace(e));
				GtmUtils.writeConsoleError(sb.toString(), editor);
			}
		}
		
		//create FareStationSets
		for (Integer code : stationList.keySet()) {
			
			FareStationSetDefinition def = GtmFactory.eINSTANCE.createFareStationSetDefinition();
			fareStationSets.put(code, def);
			fareStationSetDefinitions.getFareStationSetDefinitions().add(def);
			def.setDataSource(DataSource.CONVERTED);
			def.setCode(code.toString());
			def.setCarrier(tool.getConversionFromLegacy().getLegacy108().getCarrier());
			def.setLegacyCode(code.intValue());

			
			for (Legacy108Station legacyStation : stationList.get(code)) {
				
				if (legacyStation.getStationCode() == legacyStation.getFareReferenceStationCode())  {
					//the short name is for fare station sets
					def.setName(legacyStation.getShortName());
					def.setNameUtf8(legacyStation.getShortName());

					try {
						//the fare station set might also be a real station (strange case)
						Station station = getStationByLocalCode(tool, myCountry, legacyStation.getStationCode());
						if (station != null) {
							def.getStations().add(station);
						}
					} catch (ConverterException e) {
						//do nothing, this is a fake station;
					}
					
				} else {
				
					Station station = null;
					try {
						station = getStationByLocalCode(tool, myCountry, legacyStation.getStationCode());
					} catch (ConverterException e) {
						station = null;
					}
			
					if (station != null) {
						def.getStations().add(station);
					} else {
						if (!isMappedStation(legacyStation.getStationCode())) {
							// something strange happened
							String message = NationalLanguageSupport.ConverterFromLegacy_50 + Integer.toString(legacyStation.getStationCode()) + NationalLanguageSupport.ConverterFromLegacy_51;
							GtmUtils.writeConsoleError(message, editor);
						}
					}
				}
			}
			if (def.getStations() == null || def.getStations().isEmpty()) {
				//error in case no station is contained
				String message = NationalLanguageSupport.ConverterFromLegacy_55;
				if (def != null && def.getName() != null) {
					message = message + Integer.toString(def.getLegacyCode()) + " " + def.getName();
				} else {
					message = message + Integer.toString(def.getLegacyCode());
				}
				GtmUtils.writeConsoleError(message, editor);
			} else if (def.getStations() != null && def.getStations().size() == 1) {
				//warning in case only one station is contained
				StringBuilder sb = new StringBuilder();
				sb.append("Fare station set with one station only: ").append(def.getName()).append("-").append(def.getCode());
				GtmUtils.writeConsoleWarning(sb.toString(), editor);
			}
			
			if (def.getName() == null || def.getName().isEmpty()) {
				
				StringBuilder sb = new StringBuilder();
				sb.append("Fare station set has no name: ").append(def.getCode()).append(" please add a name to your data");
				GtmUtils.writeConsoleError(sb.toString(), editor);
				
			}
		}
		
		//add fare station sets from border points
	
		return fareStationSetDefinitions;
		
	}
	
	/**
	 * find manually created fare station sets.
	 *
	 * @param code the code
	 * @return the fare station set
	 */
	private FareStationSetDefinition findManualyDefinedStationSet(Integer code) {
		
		if (code == null || code.intValue() == 0) return null;

		for (FareStationSetDefinition set : tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			
			if (set.getDataSource().equals(DataSource.MANUAL) && 
				set.getCode().equals(code.toString()) &&
				set.getCarrier().equals(tool.getConversionFromLegacy().getLegacy108().getCarrier())) {
				String message = NationalLanguageSupport.ConverterFromLegacy_54 + code.toString();
				GtmUtils.writeConsoleInfo(message, editor);
				
				return set;
			}
			
		}

		return null;
	}	


	/**
	 * Convert station names.
	 * add a stationName list to the gtm data with the content of the TCVG import data
	 *
	 * @return the number of created station name entries
	 */
	public StationNames convertStationNames() {
		
		StationNames stationNames = GtmFactory.eINSTANCE.createStationNames();
				
		for (Legacy108Station lStation : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {

			try {
				//add stations from the exporter country
				boolean found = false;

				//add  names for mapped stations
				for (LegacyStationMap map : tool.getConversionFromLegacy().getParams().getLegacyStationMappings().getStationMappings()) {
					
					if (map.getLegacyCode() == lStation.getStationCode()) {
						Station mappedStation = map.getStation();
						if (mappedStation != null && !stationNames.getStationName().contains(mappedStation)) {
							mergeStationNames(lStation, mappedStation);
							stationNames.getStationName().add(mappedStation);
							found = true;
						}
					}
				}
				
				if (!found) {
					Station station = updateStationNames(tool,lStation);
					if (station != null) {
						stationNames.getStationName().add(station);
						found = true;
					}
				}
				
				//will be mapped to service constraint
				if (!found && 
					tool.getConversionFromLegacy().getParams() != null &&
					tool.getConversionFromLegacy().getParams().getLegacyFareStationMappings() != null &&
					tool.getConversionFromLegacy().getParams().getLegacyFareStationMappings().getLegacyFareStationSetMap() != null ) {
						
					for (LegacyStationToServiceConstraintMapping map:  tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings().getLegacyStationToServiceBrandMappings()) {
						if (map.getCode() == lStation.getStationCode()) {
							found = true;
						}
					}
				}
				
				if (!found) {
					String message = "MERITS station not found: " + lStation.getName();
					GtmUtils.writeConsoleWarning(message, editor);
				}
			} catch (Exception e) {
				StringBuilder sb = new StringBuilder();
				sb.append("Unknown error! Station not converted: fareId - ").append(lStation.getStationCode()).append('\n');
				sb.append(GtmUtils.getStackTrace(e));
				GtmUtils.writeConsoleError(sb.toString(), editor);
			}
		}
		
		HashSet<Carrier> involvedCarriers = getInvolvedCarriers(tool);   	
		
		for (LegacyBorderPoint lBorder : tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints()) {
			   	
			for (LegacyBorderSide side: lBorder.getBorderSides()) {
				if (involvedCarriers.contains(side.getCarrier())) {
					
					if (lBorder.getOnBorderStations() != null 
						&& 	lBorder.getOnBorderStations().getStations() != null
						&&	!lBorder.getOnBorderStations().getStations().getStations().isEmpty()) {
						
						for (Station s : lBorder.getOnBorderStations().getStations().getStations()) {
							if (s != null) {
								if (!stationNames.getStationName().contains(s) ) {
									stationNames.getStationName().add(s);
									if (s.getNameCaseASCII() == null || 
										s.getNameCaseASCII().length() == 0){
										 Legacy108Station ls = legacyStations.get(side.getLegacyStationCode());
										 if (ls != null) {
											 mergeStationNames(ls, s);
										 }
									}
								}
							}
						}
					} else if (side.getStations() != null && !side.getStations().getStations().isEmpty() ) {
						for (Station s : side.getStations().getStations()) {
							if (!stationNames.getStationName().contains(s) ) {
								stationNames.getStationName().add(s);
								if (s.getNameCaseASCII() == null || s.getNameCaseASCII().length() == 0){
									mergeStationNamesOnly(legacyStations.get(side.getLegacyStationCode()), s);
								}
							}
						}
					}
				}
			}
		}
		
		
		return stationNames;

	}
	
	/**
	 * Update station names.
	 *
	 * @param tool the tool
	 * @param lStation the legacy station
	 * @return the station
	 */
	Station updateStationNames(GTMTool tool, Legacy108Station lStation) {
		
		Station station = null;
		try {
			station = getStationByLocalCode(tool,myCountry,lStation.getStationCode());
			if (station != null) {
				
				if (Integer.parseInt(station.getCode()) == lStation.getStationCode() 
					&&
					station.getCountry().equals(myCountry)) {
				
					mergeStationNames(lStation,station);
					
					station.setLegacyBorderPointCode(lStation.getBorderPointCode());
					
				}
				
			}
		} catch (ConverterException e) {
			// only names
		}
		return station;	
	}
	
	
	/**
	 * Merges legacy 108 station into a real station.
	 * character set errors in the legacy station names are corrected
	 *
	 * @param lStation the l station
	 * @param station the station
	 * @return the station
	 */
	public void mergeStationNames(Legacy108Station lStation, Station station) {
		
		if (lStation == null || station == null) {
			return;
		}

		 mergeStationNamesOnly(lStation, station);
		 
		 station.setLegacyBorderPointCode(lStation.getBorderPointCode());	
		
	}
	
	/**
	 * Merges legacy 108 station into a real station.
	 * character set errors in the legacy station names are corrected
	 *
	 * @param lStation the l station
	 * @param station the station
	 * @return the station
	 */
	public void mergeStationNamesOnly(Legacy108Station lStation, Station station) {
		
		if (station == null || lStation == null) return;
			
		if (!StringFormatValidator.isStationASCII(lStation.getName())) {
			String asc = GtmUtils.utf2ascii(lStation.getName());
			GtmUtils.writeConsoleWarning("Station Name not in ASCII Format " + lStation.getName() + " changed to " + asc, editor);
			lStation.setName(asc);
		}
		
		if (lStation.getShortName() == null || lStation.getShortName().length() == 0) {
			GtmUtils.writeConsoleWarning("Station Short Name missing " + lStation.getName(), editor);
			lStation.setShortName(lStation.getName());
		}	
		
		if (!StringFormatValidator.isStationASCII(lStation.getShortName())) {
			String asc = GtmUtils.utf2ascii(lStation.getShortName());
			GtmUtils.writeConsoleWarning("Station Short Name not in ASCII Format " + lStation.getShortName() + " changed to " + asc, editor);
			lStation.setShortName(asc);
		}
				
		if (station.getNameCaseASCII() == null || station.getNameCaseASCII().length() == 0) {
			station.setNameCaseASCII(lStation.getName());
		}
		if (station.getNameCaseUTF8() == null || station.getNameCaseUTF8().length() == 0) {
			station.setNameCaseUTF8(lStation.getNameUTF8());
		}
			
		if (lStation.getFareReferenceStationCode() != lStation.getStationCode()) {
			
		    //this is a real station
			if (lStation.getShortName() == null || lStation.getShortName().length() == 0) {
				station.setShortNameCaseASCII(lStation.getName());
			} else {				
				station.setShortNameCaseASCII(lStation.getShortName());
			}	
			if (lStation.getShortNameUtf8() == null || lStation.getShortNameUtf8().length() == 0) {
				station.setShortNameCaseUTF8(lStation.getNameUTF8());
			} else {
				station.setShortNameCaseUTF8(lStation.getShortNameUtf8());					
			}
			
		} else {
				
		    //this is a real station and a fare reference station set at the same time, so the short name is for the fare reference station set
			String asc = GtmUtils.utf2ascii(lStation.getNameUTF8());
			station.setNameCaseASCII(asc);
			station.setShortNameCaseASCII(asc);	
			station.setShortNameCaseUTF8(lStation.getNameUTF8());
			
		}
		
	}
	
}