package Gtm.converter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
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
import Gtm.CurrencyPrice;
import Gtm.DataSource;
import Gtm.EndOfSale;
import Gtm.FareConstraintBundle;
import Gtm.FareElement;
import Gtm.FareElements;
import Gtm.FareStationSetDefinition;
import Gtm.FareStationSetDefinitions;
import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Language;
import Gtm.Legacy108Memo;
import Gtm.Legacy108Station;
import Gtm.LegacyAccountingIdentifier;
import Gtm.LegacyBorderPoint;
import Gtm.LegacyBorderPointMapping;
import Gtm.LegacyBorderSide;
import Gtm.LegacyCalculationType;
import Gtm.LegacyDistanceFare;
import Gtm.LegacyFareDetailMap;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeparateContractSeries;
import Gtm.LegacySeries;
import Gtm.LegacyStationMap;
import Gtm.LegacyStationToServiceConstraintMapping;
import Gtm.LegacyViastation;
import Gtm.Price;
import Gtm.Prices;
import Gtm.RegionalConstraint;
import Gtm.RegionalConstraints;
import Gtm.RegionalValidity;
import Gtm.RoundingType;
import Gtm.SalesAvailabilityConstraint;
import Gtm.SalesRestriction;
import Gtm.ServiceConstraint;
import Gtm.StartOfSale;
import Gtm.Station;
import Gtm.StationFareDetailType;
import Gtm.StationNames;
import Gtm.StationSet;
import Gtm.TaxScope;
import Gtm.Text;
import Gtm.Translation;
import Gtm.VATDetail;
import Gtm.VatTemplate;
import Gtm.ViaStation;
import Gtm.nls.NationalLanguageSupport;
//import Gtm.preferences.PreferenceConstants;
//import Gtm.preferences.PreferencesAccess;
import Gtm.presentation.DirtyCommand;
import Gtm.presentation.GtmEditor;
import Gtm.utils.GtmUtils;


/**
 * The Class ConverterFromLegacy.
 */
public class ConverterFromLegacy {
	
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
	
	/** The country */
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
		
		Country myCountry = tool.getConversionFromLegacy().getParams().getCountry();
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
					localStations.put(Integer.parseInt(station.getCode()), station);
				} catch (Exception e){
					e.printStackTrace();
					//do nothing 
				}
			}
		}
		
		for (Carrier carrier : tool.getCodeLists().getCarriers().getCarriers()) {
			carriers.put(carrier.getCode(), carrier);
		}

		for (Legacy108Station station : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
			legacyStations.put(station.getStationCode(), station);
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
		int deleted = 0;

		CompoundCommand command = new CompoundCommand();
		
		//delete fares
		ArrayList<FareElement> fares = new ArrayList<FareElement>();
		for (FareElement fare : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			if (fare.getDataSource() == DataSource.CONVERTED || fare.getDataSource() == DataSource.IMPORTED) {
				fares.add(fare);
			}
		}
		if (fares.size() == tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements().size()) {
			FareElements fareElements = GtmFactory.eINSTANCE.createFareElements();
			Command com = SetCommand.create(domain,tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__FARE_ELEMENTS, fareElements);
			command.append(com);
			executeAndFlush(command,domain);	
		} else {
			command.append(RemoveCommand.create(domain,tool.getGeneralTariffModel().getFareStructure().getFareElements(),GtmPackage.Literals.FARE_ELEMENTS__FARE_ELEMENTS, fares) );
			executeAndFlush(command,domain);
		}
		fares.clear();	
		
		//delete regional validities
		command = new CompoundCommand();
		ArrayList<RegionalConstraint> regions = new ArrayList<RegionalConstraint>();
		for (RegionalConstraint region : tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints()) {
			if (region.getDataSource() == DataSource.CONVERTED || region.getDataSource() == DataSource.IMPORTED) {
				regions.add(region);	
			}
		}
		if (regions.size() == tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints().size()) {
			RegionalConstraints regionalConstraints = GtmFactory.eINSTANCE.createRegionalConstraints();
			Command com = SetCommand.create(domain,tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__REGIONAL_CONSTRAINTS,  regionalConstraints);
			command.append(com);
			executeAndFlush(command,domain);			
		} else {
			command.append(RemoveCommand.create(domain,tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints(),GtmPackage.Literals.REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS, regions) );
			executeAndFlush(command,domain);
		}
		deleted = regions.size();
		regions.clear();
		
		//delete prices
		command = new CompoundCommand();
		ArrayList<Price> prices = new ArrayList<Price>();
		for (Price price : tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices()) {
			if (price.getDataSource() == DataSource.CONVERTED || price.getDataSource() == DataSource.IMPORTED) {
				prices.add(price);
			}
		}	
		if (prices.size() == tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices().size()) {
			Prices priceList = GtmFactory.eINSTANCE.createPrices();
			command.append(SetCommand.create(domain, tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__PRICES, priceList));
			executeAndFlush(command,domain);
		} else {
			command.append(RemoveCommand.create(domain,tool.getGeneralTariffModel().getFareStructure().getPrices(),GtmPackage.Literals.PRICES__PRICES, prices) );
			executeAndFlush(command,domain);
		}
		prices.clear();
		
		//connection points
		command = new CompoundCommand();		
		for (ConnectionPoint point : tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints()) {
			if (point.getDataSource() == DataSource.CONVERTED || point.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, point) );
			}
		}		
		executeAndFlush(command,domain);
		
		//delete sales availabilities
		command = new CompoundCommand();
		for (SalesAvailabilityConstraint sa : tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			if (sa.getDataSource() == DataSource.CONVERTED || sa.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}		
		executeAndFlush(command,domain);
		
		//delete Carrier Constraints
		command = new CompoundCommand();
		for (CarrierConstraint cc : tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints().getCarrierConstraints()) {
			if (cc.getDataSource() == DataSource.CONVERTED || cc.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, cc) );
			}
		}		
		executeAndFlush(command,domain);		
		
		//delete calendars
		command = new CompoundCommand();		
		for (Calendar sa : tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars()) {
			if (sa.getDataSource() == DataSource.CONVERTED || sa.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}	
		executeAndFlush(command,domain);
		
		//Delete fare station sets
		command = new CompoundCommand();		
		for (FareStationSetDefinition sa : tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			if (sa.getDataSource() == DataSource.CONVERTED || sa.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}
		executeAndFlush(command,domain);

		//delete After sales rules
		command = new CompoundCommand();		
		for (AfterSalesRule sa : tool.getGeneralTariffModel().getFareStructure().getAfterSalesRules().getAfterSalesRules()) {
			if (sa.getDataSource() == DataSource.CONVERTED || sa.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}
		executeAndFlush(command,domain);
		
		//delete fare constraint bundles
		command = new CompoundCommand();		
		for (FareConstraintBundle sa : tool.getGeneralTariffModel().getFareStructure().getFareConstraintBundles().getFareConstraintBundles()) {
			if (sa.getDataSource() == DataSource.CONVERTED || sa.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}
		executeAndFlush(command,domain);
		
		//delete station mappings  (obsolete)
		if ( tool.getConversionFromLegacy().getParams() != null && 
			 tool.getConversionFromLegacy().getParams().getLegacyStationMappings() != null) {
			command = new CompoundCommand();		
			for (LegacyStationMap m : tool.getConversionFromLegacy().getParams().getLegacyStationMappings().getStationMappings()) {
				if (m.getDataSource() == DataSource.CONVERTED || m.getDataSource() == DataSource.IMPORTED) {
					command.append(DeleteCommand.create(domain,m) );
				}
			}
			executeAndFlush(command,domain);
		}
		
		//delete texts
		command = new CompoundCommand();		
		for (Text sa : tool.getGeneralTariffModel().getFareStructure().getTexts().getTexts()) {
			if (sa.getDataSource() == DataSource.CONVERTED || sa.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}
		executeAndFlush(command,domain);

		return deleted;
	}


	/**
	 * Convert to OSDM model.
	 *
	 * @param monitor the progress monitor
	 * @return the number of fares created
	 */
	public int convertToGtm(IProgressMonitor monitor) {
				
		ArrayList<Price> priceList = new ArrayList<Price>();
		ArrayList<AfterSalesRule> afterSalesRules = new ArrayList<AfterSalesRule>();
		ArrayList<RegionalConstraint> regions = new ArrayList<RegionalConstraint>();
		ArrayList<FareElement> fares = new ArrayList<FareElement>();
		
		int nbSeries = 0;
		int worked = 100000 / tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().size();
		if (worked < 1 ) worked = 1;
		int added = 0;

		monitor.subTask(NationalLanguageSupport.ConverterFromLegacy_1);
		for (LegacySeries series: tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			if (carrierConstraints.get(series.getCarrierCode()) == null)  {
				Carrier carrier = tool.getCodeLists().getCarriers().findCarrier(series.getCarrierCode());
				if (carrier != null) {
					CarrierConstraint constraint = GtmFactory.eINSTANCE.createCarrierConstraint();
					constraint.setDataSource(DataSource.CONVERTED);
					constraint.setDataDescription(NationalLanguageSupport.ConverterFromLegacy_2 + carrier.getName());
					constraint.getIncludedCarriers().add(carrier);
					carrierConstraints.put(carrier.getCode(),constraint);
				} else {
					GtmUtils.writeConsoleWarning(String.format("Series witout known carrier code: %d carrier: %s", series.getNumber(),series.getCarrierCode() ) , editor);
				}
			}

		}
		
		CompoundCommand command = new CompoundCommand();
		if (tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints() == null) {
			
			CarrierConstraints carrierConstraintList = GtmFactory.eINSTANCE.createCarrierConstraints();
			carrierConstraintList.getCarrierConstraints().addAll(carrierConstraints.values());
			Command com0 = SetCommand.create(domain, tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__CARRIER_CONSTRAINTS, carrierConstraintList);
			command.append(com0);
			
		} else {

			Command com0 = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints(), GtmPackage.Literals.CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS, carrierConstraints.values());
			command.append(com0);
		}
		
		executeAndFlush(command, domain);
		monitor.worked(1);
		
		
		for (LegacySeries series: tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			nbSeries++;
			
			ArrayList<DateRange> validityRanges = findValidRanges (series);
			
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
			
			if (regionalConstraint != null) {
				regions.add(regionalConstraint);
			}
			if (regionalConstraintR != null) {
				regions.add(regionalConstraintR);
			}
			
			if (regionalConstraint != null || regionalConstraintR != null) {

				int legacyFareCounter = 0;
				for (FareTemplate fareTemplate: tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates()) {
					
					//check series type
					if (fareTemplate.getSeriesFilter() != null && fareTemplate.getSeriesFilter().size() > 0) {
						if (series.getType()!= null && !fareTemplate.getSeriesFilter().contains(series.getType())) {
							break;
						}
					}
					
					//check basic features
					if (fareTemplate.getServiceClass() == null) {					
						GtmUtils.writeConsoleError("Service class missing in template: " + fareTemplate.getDataDescription(), editor);
						break;
					}
				
					try {
						for (DateRange dateRange : validityRanges) {
							convertSeriesToFares(series, fareTemplate,dateRange, regionalConstraint,regionalConstraintR ,priceList, legacyFareCounter, fares, afterSalesRules);
						}
						added++;
					} catch (ConverterException e) {
						// error already logged
					}
				}	
			}
			
						
			if (nbSeries % 1000 == 0 ) {			
				monitor.subTask(NationalLanguageSupport.ConverterFromLegacy_3+ String.valueOf(nbSeries));
				monitor.worked(worked);
			} 
			
		}
		
		command = new CompoundCommand();
		if (regions != null && !regions.isEmpty()) {
			Command com1 = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints(), GtmPackage.Literals.REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS, regions);
			command.append(com1);
			executeAndFlush(command, domain);
		}
		monitor.worked(1);

		command = new CompoundCommand();
		if (priceList != null && !priceList.isEmpty()) {
			Command com2 = AddCommand.create(domain,tool.getGeneralTariffModel().getFareStructure().getPrices(), GtmPackage.Literals.PRICES__PRICES, priceList);
			command.append(com2);
			executeAndFlush(command, domain);
		}
		monitor.worked(1);
		
		
		command = new CompoundCommand();
		if (afterSalesRules != null && !afterSalesRules.isEmpty()) {
			Command com2 = AddCommand.create(domain,tool.getGeneralTariffModel().getFareStructure().getAfterSalesRules(), GtmPackage.Literals.AFTER_SALES_RULES__AFTER_SALES_RULES, afterSalesRules);
			command.append(com2);
			executeAndFlush(command, domain);
		}
		monitor.worked(1);

		if (!memoTexts.isEmpty()) {
			command = new CompoundCommand();
			Command com0 = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getTexts(), GtmPackage.Literals.TEXTS__TEXTS, memoTexts.values());
			command.append(com0);
			executeAndFlush(command, domain);
		}
		monitor.worked(1);
		
		command = new CompoundCommand();
		if (fares!= null && !fares.isEmpty()) {
			Command com3 = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getFareElements(),GtmPackage.Literals.FARE_ELEMENTS__FARE_ELEMENTS , fares);		
			command.append(com3);	
			executeAndFlush(command, domain);
		}
		monitor.worked(1);
		
		
		localStations.clear();
		carriers.clear();
		legacyStations.clear();
		carrierConstraints.clear();
		fareStationSets.clear();
		legacyStationConnectionPoints.clear();
		singleStationConnectionPoints.clear();
		borderConnectionPoints.clear();
		
		System.gc();
		
		return added;
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
		
		if (rule == null || rule.getConditions() == null || rule.getConditions().isEmpty()) return rule;
		
		
		
		for (AfterSalesRule old : afterSalesRules) {
			
			boolean isEqual = true;
			
			if (old.getConditions().size() == rule.getConditions().size()) {
				
				for (AfterSalesCondition oldCond : old.getConditions()) {
					
					boolean conditionMatched = false;
					
					for (AfterSalesCondition cond : rule.getConditions()) {	
						if (oldCond.getFee() == cond.getFee() && 
							oldCond.getTransactionType().equals(cond.getTransactionType())) {
							
							if (oldCond.getApplicationTime().getUnit().equals(cond.getApplicationTime().getUnit()) &&
								oldCond.getApplicationTime().getValue() == cond.getApplicationTime().getValue() && 
								oldCond.getApplicationTime().getReference().equals(cond.getApplicationTime().getReference())
								) {
								conditionMatched = true;
							}
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
		for (LegacyViastation via : series.getViastations()) {
			ServiceConstraint serviceConstraint = tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings().findServiceConstraint(via.getCode());
			if (serviceConstraint != null) {
				fareElement.setServiceConstraint(serviceConstraint);
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
		
		for (SalesAvailabilityConstraint sa : tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()){
			
			if ( sa.getDataSource() == DataSource.CONVERTED) {
				
				if (sa.getRestrictions() != null &&
					!sa.getRestrictions().isEmpty() &&	
					sa.getRestrictions().get(0).getSalesDates() != null &&
					sa.getRestrictions().get(0).getSalesDates().getFromDate() != null &&
					sa.getRestrictions().get(0).getSalesDates().getUntilDate() != null) {
					
					if (sa.getRestrictions().get(0).getSalesDates().getFromDate().equals(dateRange.startDate) 
							&& sa.getRestrictions().get(0).getSalesDates().getUntilDate().equals(dateRange.endDate) ) {
							return sa;
						}
					return null;
				}
			}
		}
		
		return null;
	}


	/**
	 * Find valid ranges.
	 *
	 * @param series the series
	 * @return the array list
	 */
	private ArrayList<DateRange> findValidRanges(LegacySeries series) {
				
		HashSet<Date> dateSet = new HashSet<Date>();
		dateSet.add(series.getValidFrom());
		dateSet.add(series.getValidUntil());
		
		if (series.getPricetype() == LegacyCalculationType.DISTANCE_BASED) {
		
			for (LegacyDistanceFare fare :  tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare()) {
				if (fare.getValidFrom().after(series.getValidFrom()) && fare.getValidFrom().before(series.getValidUntil())) {
					dateSet.add(fare.getValidFrom());
				}
				if (fare.getValidUntil().after(series.getValidFrom()) && fare.getValidUntil().before(series.getValidUntil())) {
					dateSet.add(fare.getValidUntil());
				}
			} 
		} else if (series.getPricetype() == LegacyCalculationType.ROUTE_BASED) {
			
			for (LegacyRouteFare fare :  tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare()) {
				if (fare.getValidFrom().after(series.getValidFrom()) && fare.getValidFrom().before(series.getValidUntil())) {
					dateSet.add(fare.getValidFrom());
				}
				if (fare.getValidUntil().after(series.getValidFrom()) && fare.getValidUntil().before(series.getValidUntil())) {
					dateSet.add(fare.getValidUntil());
				}
			} 
			
		}
		
		return DateRange.getIntervalls(dateSet);

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
		
		
		//handle departure
		ViaStation viaDeparture = getViaStation(tool, country, series.getToStation(),series.getNumber());

		//handle arrival
		ViaStation viaArrival = getViaStation(tool, country, series.getFromStation(),series.getNumber());	
		
		if (viaArrival == null || viaDeparture == null) {
			String message = "departure or arrival missing in series: " + Integer.valueOf(series.getNumber()).toString();
			GtmUtils.writeConsoleError(message, editor);
			throw new ConverterException(message);
		}
		
		//set connection points 
		setConnectionPoints(series.getNumber(), viaDeparture, viaArrival, constraint);
		
		
		//handle route
		RegionalValidity region = GtmFactory.eINSTANCE.createRegionalValidity();
		constraint.getRegionalValidity().add(region);
		region.setSeqNb(seqNb);
		seqNb++;
		
		ViaStation mainViaStation = GtmFactory.eINSTANCE.createViaStation();
		mainViaStation.setCarrier(carriers.get(series.getCarrierCode()));
		region.setViaStation(mainViaStation);
		mainViaStation.setRoute(GtmFactory.eINSTANCE.createRoute());

		
		mainViaStation.getRoute().getStations().add(viaDeparture);

		int mainRoutePosition = 1;
		int lastPosition = mainRoutePosition; 
		EList<ViaStation> mainRoute = mainViaStation.getRoute().getStations();
		EList<ViaStation> lastRoute = mainViaStation.getRoute().getStations();
		ViaStation alternativeRoutesVia = null;
		
		for (int i = series.getViastations().size() - 1; i > -1; i--) {
			
			LegacyViastation legacyViaStation = series.getViastations().get(i);
			if (legacyViaStation.getPosition() != lastPosition) {
				if (legacyViaStation.getPosition() == mainRoutePosition){
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
		mainRoute.add(viaArrival);	
	
		return constraint;
	}
	
	/**
	 * Gets the via station.
	 *
	 * @param tool the tool
	 * @param country the country
	 * @param code the code
	 * @param seriesNumber the series number
	 * @return the via station
	 * @throws ConverterException the converter exception
	 */
	private ViaStation getViaStation(GTMTool tool, Country country, int code,int seriesNumber) throws ConverterException {

		
		//priority is for Fare Station Set. In case it is not a fare station set use a station
		Station station = null;
		FareStationSetDefinition fareStationSet = null;
		ServiceConstraint serviceConstraint = null;
		fareStationSet = findFareStation(code);
		if (fareStationSet == null) {
			serviceConstraint = findServiceConstraintByLegacyCode(code);
			if (serviceConstraint == null) {
				station = getStation(tool, country, code);
			}
		} 
		
		if (station == null && fareStationSet == null && serviceConstraint == null) {
			if (isMappedStation(code)) {
				return null;
			}
			Legacy108Station ls = legacyStations.get(code);
			StringBuilder sb = new StringBuilder();
			sb.append(NationalLanguageSupport.ConverterFromLegacy_7);
			sb.append(seriesNumber);
			sb.append(NationalLanguageSupport.ConverterFromLegacy_8);
			sb.append(code);
			if (ls != null) {
				sb.append("-").append(ls.getName());
			}
			GtmUtils.writeConsoleError(sb.toString(), editor);
			throw new ConverterException(sb.toString());
		}
		
		ViaStation viaStation = GtmFactory.eINSTANCE.createViaStation();
		viaStation.setStation(station);
		viaStation.setFareStationSet(fareStationSet);
		viaStation.setServiceConstraint(serviceConstraint);
		return viaStation;
	}



	private ServiceConstraint findServiceConstraintByLegacyCode(int code) {
		
		if (tool.getGeneralTariffModel().getFareStructure().getServiceConstraints() == null) {
			return null;
		}
		
		for (ServiceConstraint sc : tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints()) {
			if (sc.getLegacy108Code() == code) {
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
		constraint.setDistance( (series.getDistance1() + series.getDistance2())/2 );
		return constraint;
	}

	/**
	 * Sets the connection points.
	 *
	 * @param series the series
	 * @param departureStation the departure station
	 * @param arrivalStation the arrival station
	 * @param constraint the constraint
	 * @throws ConverterException the converter exception
	 */
	private void setConnectionPoints(int series, ViaStation departureStation, ViaStation arrivalStation, RegionalConstraint constraint ) throws ConverterException {

		if (departureStation == null || arrivalStation == null) return;
		
		int borderpointcodeDeparture = 0;
		if (departureStation.getStation()!= null) {
			 borderpointcodeDeparture = departureStation.getStation().getLegacyBorderPointCode();
		}
    	ConnectionPoint point1 = findConnectionPoint(tool,borderpointcodeDeparture,departureStation);  
    	
    	if (point1 == null) {
    		GtmUtils.writeConsoleError("Connection point missing for Series: " + Integer.valueOf(series).toString(), editor);
    	}
		
    	int borderpointcodeArrival = 0;
		if (arrivalStation.getStation()!= null) {
			 borderpointcodeArrival = arrivalStation.getStation().getLegacyBorderPointCode();
		} 
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
	public RegionalConstraint convertSeriesToRegionalConstraint(LegacySeries series) throws ConverterException{
		
		RegionalConstraint constraint = createRegionalConstraint(series);
			
		int seqNb = 1;
				
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		
		//handle departure
		ViaStation viaDeparture = getViaStation(tool, country, series.getFromStation(),series.getNumber());

		//handle arrival
		ViaStation viaArrival = getViaStation(tool, country, series.getToStation(),series.getNumber());
		
		if (viaDeparture == null || viaArrival == null) {
			String message = "departure or arrival missing in series: " + Integer.valueOf(series.getNumber()).toString();
			GtmUtils.writeConsoleError(message, editor);
			throw new ConverterException(message);
		}
				
		//set connection points 
		setConnectionPoints(series.getNumber(), viaDeparture, viaArrival,constraint);
				
		//create route
		ViaStation mainViaStation = GtmFactory.eINSTANCE.createViaStation();
		mainViaStation.setRoute(GtmFactory.eINSTANCE.createRoute());
		mainViaStation.setCarrier(carriers.get(series.getCarrierCode()));
		RegionalValidity region = GtmFactory.eINSTANCE.createRegionalValidity();
		region.setSeqNb(seqNb);
		seqNb++;
		region.setViaStation(mainViaStation);
		constraint.getRegionalValidity().add(region);
		
		mainViaStation.getRoute().getStations().add(viaDeparture);

		int mainRoutePosition = 1;
		int lastPosition = mainRoutePosition; 
		EList<ViaStation> mainRoute = mainViaStation.getRoute().getStations();
		EList<ViaStation> lastRoute = mainViaStation.getRoute().getStations();
		ViaStation alternativeRoutesVia = null;

		
		for (LegacyViastation legacyViaStation : series.getViastations()) {
			if (legacyViaStation.getPosition() != lastPosition) {
				if (legacyViaStation.getPosition() == mainRoutePosition){
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
		
		
		mainRoute.add(viaArrival);				
	
		return constraint;
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
			return legacyStationConnectionPoints.get(Integer.parseInt(station.getFareStationSet().getCode()));
		}

		
		//find connection point which contains exactly the station
		if (station.getStation() != null) {
			return singleStationConnectionPoints.get(station.getStation());
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
				station = getStation(tool, country, code);
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
	public Station getStation(GTMTool tool, Country country, int localCode) throws ConverterException {
		
		//mapped station?
		Station station = tool.getConversionFromLegacy().getParams().getLegacyStationMappings().findMappedStation(localCode);
		if (station != null) {
			return station;
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
					
		//is it a virtual borderpoint?	
		Legacy108Station ls = legacyStations.get(localCode);
		if (ls == null) return null;
		//if it is a border point get the station from the right side of the border
		if (ls.getBorderPointCode() > 0) {
			Station s = getBorderStation(ls.getBorderPointCode());
			if (s != null) {
				return s;
			}
		}
		
		//deprecated manual border mapping
		if (tool.getConversionFromLegacy().getParams().getLegacyBorderPointMappings() != null) {
			LegacyBorderPointMapping map = tool.getConversionFromLegacy().getParams().getLegacyBorderPointMappings().getMappingByBorderPointCode(localCode);
			if (map != null && map.getStation() != null) {
				return map.getStation();
			}
		}
		
		//is it a virtual fare station set?
		if (ls.getFareReferenceStationCode() == ls.getStationCode() && ls.getStationCode() > 0) {
			StringBuilder sb = new StringBuilder();
			sb.append("Fare Station Set: ").append(ls.getName());
			sb.append("-").append(ls.getStationCode());
			sb.append(" not a station code. It is assumed to be a virtual fare station set.");
			GtmUtils.writeConsoleInfo(sb.toString(), editor);
		} else {
			//it is missing!
			StringBuilder sb = new StringBuilder();
			sb.append(NationalLanguageSupport.ConverterFromLegacy_40);
			sb.append(localCode);
			if (ls != null) {
				sb.append("-").append(ls.getName());
			}
			GtmUtils.writeConsoleError(sb.toString(), editor);			
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
		    
			if (price != null) {
				price = findPrice(price, priceList);
			}
			
			return price;
		
		} catch (Exception e) {
			e.printStackTrace();
			String message = NationalLanguageSupport.ConverterFromLegacy_42 + Integer.toString(series.getNumber()) + ")"; //$NON-NLS-2$
			GtmUtils.writeConsoleError(message, editor);
			return null;
		}
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
	
		addVat(curPrice,regionalConstraint);
	
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
	    
	    Country country = tool.getConversionFromLegacy().getParams().getCountry();
		//get the common country at start and end of the regional validity
	    //vat can be calculated for one country only
		//Country country = getCountry(regionalConstraint);
		if (country == null) return;

		ArrayList<VatTemplate> vatTemplates = new ArrayList<VatTemplate>();	
		
		for (VatTemplate vat : tool.getConversionFromLegacy().getParams().getVatTemplates().getVatTemplates()) {
			
			if ((vat.getScope() == TaxScope.ANY || vat.getScope() == TaxScope.NATIONAL)	&& 
				 vat.getCountry().equals(country)) {
				vatTemplates.add(vat);
			}
			if (regionalConstraint.getEntryConnectionPoint() != null || regionalConstraint.getExitConnectionPoint() != null) {
				if (vat.getScope() == TaxScope.INTERNATIONAL && vat.getCountry().equals(country)) {
					vatTemplates.add(vat);
				}
			}
		}
		
		for (VatTemplate vatTemplate: vatTemplates) {
			VATDetail vatDetail = GtmFactory.eINSTANCE.createVATDetail();
			vatDetail.setPercentage(vatTemplate.getPercentage());
			vatDetail.setCountry(vatTemplate.getCountry());
			vatDetail.setTaxId(vatTemplate.getTaxId());
			vatDetail.setScope(vatTemplate.getScope());
			BigDecimal bd = new BigDecimal(curPrice.getAmount()*vatTemplate.getPercentage()/100).setScale(2, RoundingMode.UP);
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
		
		if (series.getPricetype() == LegacyCalculationType.ROUTE_BASED) {
			
			for (LegacyRouteFare fare : tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare()){
			
				if (   fare.getFareTableNumber() == series.getFareTableNumber()
				    && fare.getSeriesNumber() == series.getNumber() 
					&& ( fare.getValidFrom().before(dateRange.getStartDate())
							   || fare.getValidFrom().equals(dateRange.getStartDate()) )
					&& ( fare.getValidUntil().after(dateRange.getEndDate())
							   ||fare.getValidUntil().equals(dateRange.getEndDate()) ) )  {
					if (travelClass == 1) {
						return GtmUtils.getEuroFromCent(fare.getFare1st()); 
					} else {
						return GtmUtils.getEuroFromCent(fare.getFare2nd()); 			
					}
				}
			}
		}  else {
			int price = 0;
			boolean distanceFound = false;
			
			int distance = 0;
			if (travelClass == 1) {
				distance = series.getDistance1();
				//distance = 0 indicates no price in that class!
				if (distance== 0) return null;
			} else {
				distance = series.getDistance2();
				//distance = 0 indicates no price in that class!
				if (distance == 0) return null;
			}
			
			
					
			//get the lowest price where the distance is ok
			for (LegacyDistanceFare fare : tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare()) {
				if (   fare.getFareTableNumber() == series.getFareTableNumber()				
					&& (   fare.getValidFrom().before(dateRange.getStartDate())
						|| fare.getValidFrom().equals(dateRange.getStartDate()) )
					&& ( fare.getValidUntil().after(dateRange.getEndDate())
					   ||fare.getValidUntil().equals(dateRange.getEndDate()) ) )  {
				
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
			if (!distanceFound) return null;
			
			return GtmUtils.getEuroFromCent(price);
		}
		return null;
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

		
		fare.setCarrierConstraint(carrierConstraints.get(series.getCarrierCode()));
		if (fare.getCarrierConstraint() == null) {
			fare.setCarrierConstraint(fareTemplate.getCarrierConstraint());
		}
		
		if (isSeparateContract(series)) {
			if (fareTemplate.getSeparateContractFareConstraintBundle() ==  null) {
				StringBuilder sb = new StringBuilder();
				sb.append("A fare constraint bundle for seperate contracts is missing in fare template: ").append(GtmUtils.getLabelText(fareTemplate));
				GtmUtils.writeConsoleError(sb.toString(), editor);
				return;
			}
			fare.setFareConstraintBundle(fareTemplate.getSeparateContractFareConstraintBundle());
		} else {
			if (fareTemplate.getFareConstraintBundle() == null) {
				StringBuilder sb = new StringBuilder();
				sb.append("A fare constraint bundle is missing in fare template: ").append(GtmUtils.getLabelText(fareTemplate));
				GtmUtils.writeConsoleError(sb.toString(), editor);		
				return;
			}
			fare.setFareConstraintBundle(fareTemplate.getFareConstraintBundle());
		}
		fare.setDataDescription(NationalLanguageSupport.ConverterFromLegacy_44 + Integer.toString(series.getNumber()) +NationalLanguageSupport.ConverterFromLegacy_45 + fareTemplate.getDataDescription());
		
		fare.setPrice(price);
		fare.setRegionalConstraint(regionalConstraint);
		regionalConstraint.getLinkedFares().add(fare);
		
		if (fareTemplate.getSalesAvailability() != null) {
			fare.setSalesAvailability(fareTemplate.getSalesAvailability());
		} else if (fare.getFareConstraintBundle().getSalesAvailability() == null){
			fare.getFareConstraintBundle().setSalesAvailability(findSalesAvailability(tool,dateRange));
		}
		mapConstraintsAndDescriptions(fare, series);
		if (price != null && fare != null) {
			fare.setAfterSalesRule(convertAfterSalesRules(price, fareTemplate, afterSalesRules, priceList));
			fares.add(fare);			
		}
		
	}

	
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
			text.getTranslations().add(e);
		}	
		if (memo.getFrench() != null && memo.getFrench().length() > 0) {
			Translation e = GtmFactory.eINSTANCE.createTranslation();
			e.setLanguage(getFrench());
			e.setTextUTF8(memo.getFrench());
			e.setTextICAO(GtmUtils.utf2ascii(e.getTextUTF8()));
			text.getTranslations().add(e);
		}
		if (memo.getGerman() != null && memo.getGerman().length() > 0) {
			Translation e = GtmFactory.eINSTANCE.createTranslation();
			e.setLanguage(getGerman());
			e.setTextUTF8(memo.getGerman());
			e.setTextICAO(GtmUtils.utf2ascii(e.getTextUTF8()));
			text.getTranslations().add(e);
		}	

		memoTexts.put(Integer.valueOf(memo.getNumber()),text);
		return text;
	}

	private Language getGerman() {
		for (Language l : tool.getCodeLists().getLanguages().getLanguages()) {
			if (l.getCode().equals("de")) {
				return l;
			}
		}
		return null;
	}

	private Language getFrench() {
		for (Language l : tool.getCodeLists().getLanguages().getLanguages()) {
			if (l.getCode().equals("fr")) {
				return l;
			}
		}
		return null;
	}

	private Language getEnglish() {
		for (Language l : tool.getCodeLists().getLanguages().getLanguages()) {
			if (l.getCode().equals("en")) {
				return l;
			}
		}
		return null;
	}

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
		//C2.0 fare.setFulfillmentConstraint(fareTemplate.getFulfillmentConstraint());
		fare.setIndividualContracts(fareTemplate.isIndividualContracts());		
		fare.setPassengerConstraint(fareTemplate.getPassengerConstraint());
		fare.setReductionConstraint(fareTemplate.getReductionConstraint());
		//C2.0 fare.setPersonalDataConstraint(fareTemplate.getPersonalDataConstraint());
		fare.setReservationParameter(fareTemplate.getReservationParameter());
		//C2.0 fare.setSalesAvailability(fareTemplate.getSalesAvailability());
		fare.setServiceClass(fareTemplate.getServiceClass());
		fare.setServiceConstraint(fareTemplate.getServiceConstraint());
		fare.setServiceLevel(fareTemplate.getServiceLevel());
		fare.setText(fareTemplate.getText());
		//C2.0 fare.setTravelValidity(fareTemplate.getTravelValidity());
		fare.setType(fareTemplate.getType());
		fare.setLegacyConversion(fareTemplate.getLegacyConversion());
		
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
     public int convertBorderPoints() {
		
		//add converted border points related to the carrier
		for (LegacyBorderPoint lp : tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints()) {
			
			ConnectionPoint connectionPoint = convertImportedBorderPoint(lp);
			if (connectionPoint != null) {
				borderConnectionPoints.put(lp.getBorderPointCode(), connectionPoint);
			}
		}
		
	
		//add additional connection points from series
		Set<Integer> legacyStationCodes = getSeriesEndStations();

		for (Integer stationCode : legacyStationCodes) {
			findOrCreateConnectionPoint(tool, stationCode, myCountry);
		}
		
		
		if (!borderConnectionPoints.isEmpty()) {
			Command command = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getConnectionPoints(), GtmPackage.Literals.CONNECTION_POINTS__CONNECTION_POINTS, borderConnectionPoints.values());
			if  (command != null && command.canExecute()) {
				domain.getCommandStack().execute(command);
			}
		}
		if (!legacyStationConnectionPoints.isEmpty()) {
			Command command = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getConnectionPoints(), GtmPackage.Literals.CONNECTION_POINTS__CONNECTION_POINTS, legacyStationConnectionPoints.values());
			if  (command != null && command.canExecute()) {
				domain.getCommandStack().execute(command);
			}
		}		

		return borderConnectionPoints.size() + legacyStationConnectionPoints.size();
	}

	/**
	 * Convert imported border point.
	 *
	 * @param lBorder the l border
	 * @return the connection point
	 */
	private ConnectionPoint convertImportedBorderPoint(LegacyBorderPoint lBorder) {
		
		boolean carrierInvolved = false;
		for (LegacyBorderSide side: lBorder.getBorderSides()) {
			if (side.getCarrier().equals(tool.getConversionFromLegacy().getLegacy108().getCarrier())) {
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
		
		
		if (lBorder.getOnBorderStations()!= null && lBorder.getOnBorderStations().getStations() != null && !lBorder.getOnBorderStations().getStations().getStations().isEmpty()) {
			
			ConnectionPoint point = GtmFactory.eINSTANCE.createConnectionPoint();
			point.setLegacyBorderPointCode(lBorder.getBorderPointCode());
			point.setDataSource(DataSource.IMPORTED);
			StationSet stations = EcoreUtil.copy(lBorder.getOnBorderStations().getStations());
			stations.getStations().addAll(lBorder.getOnBorderStations().getStations().getStations());
			point.getConnectedStationSets().add(stations);
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
	public int convertSalesAvailabilities() {
		
		ArrayList<DateRange> validityRanges = new ArrayList<DateRange>();

		for (LegacySeries series: tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			ArrayList<DateRange> seriesRanges = findValidRanges (series);
			
			if (validityRanges.isEmpty()) validityRanges.addAll(seriesRanges);
			
			DateRange.addUniqueRanges(validityRanges, seriesRanges);
			
		}
		
		boolean conversionNeeded = false;
		for (FareTemplate t : tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates()) {
			if (t.getSalesAvailability() == null){
				 conversionNeeded = true;
			}
		}
		
		if (!conversionNeeded) {
			return 0;
		}
		
		CompoundCommand command = new CompoundCommand();
		
		for ( DateRange r : validityRanges) {
			
			SalesAvailabilityConstraint constraint = GtmFactory.eINSTANCE.createSalesAvailabilityConstraint();
			constraint.setDataSource(DataSource.CONVERTED);
			SalesRestriction rest = GtmFactory.eINSTANCE.createSalesRestriction();
			Calendar cal = GtmFactory.eINSTANCE.createCalendar();
			cal.setDataSource(DataSource.CONVERTED);
			cal.setFromDate(r.startDate);
			cal.setUntilDate(r.getEndDate());
			TimeZone tz = TimeZone.getTimeZone(tool.getConversionFromLegacy().getLegacy108().getTimeZone().getName());
			if (tz != null) {
				cal.setUtcOffset(tz.getOffset(new Date().getTime()) / 1000 / 60 );
			}
			
			if (tool.getConversionFromLegacy().getParams().getStartOfSale()!= null) {
				rest.setStartOfSale((StartOfSale) EcoreUtil.copy(tool.getConversionFromLegacy().getParams().getStartOfSale()));
			} 
			
			
			if (tool.getConversionFromLegacy().getParams().getEndOfSale()!= null) {
				rest.setEndOfSale((EndOfSale) EcoreUtil.copy(tool.getConversionFromLegacy().getParams().getEndOfSale()));
			} 
			
			rest.setSalesDates(cal);

			constraint.getRestrictions().add(rest);
						
			command.append(AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getCalendars() , GtmPackage.Literals.CALENDARS__CALENDARS, cal));
			command.append(AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints(),GtmPackage.Literals.SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS , constraint));
			
		}
		
		if (!command.isEmpty()) {
			if (command.canExecute()) {
				domain.getCommandStack().execute(command);
			}
		}
		
		return validityRanges.size();
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
	public int convertFareStationSets() {
		
		fareStationSets.clear();
		
		HashMap<Integer,HashSet<Legacy108Station>> stationList = new HashMap<Integer,HashSet<Legacy108Station>>();

		//create FareStationSets
		FareStationSetDefinitions fareStationSetDefinitions = GtmFactory.eINSTANCE.createFareStationSetDefinitions();

		//create list of fare station sets
		for (Legacy108Station station : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
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
						Station station = getStation(tool, myCountry, legacyStation.getStationCode());
						if (station != null) {
							def.getStations().add(station);
						}
					} catch (ConverterException e) {
						//do nothing, this is a fake station;
					}
					
				} else {
				
					Station station = null;
					try {
						station = getStation(tool, myCountry, legacyStation.getStationCode());
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
		}
		
		int added = fareStationSetDefinitions.getFareStationSetDefinitions().size();
		
		Command cmd = SetCommand.create(domain,tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS, fareStationSetDefinitions);
		if (cmd.canExecute()) {
			domain.getCommandStack().execute(cmd);
			return added;
		} else {
			return 0;
		}

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
	public int convertStationNames() {
		
		StationNames stationNames = GtmFactory.eINSTANCE.createStationNames();
				
		for (Legacy108Station lStation : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
			//add stations from the exporter country
			boolean found = false;
			
			Station station = updateStationNames(tool,lStation);
			if (station != null) {
				stationNames.getStationName().add(station);
				found = true;
			}

			//add station names for used border points
			if (lStation.getBorderPointCode() > 0 ) {
				ConnectionPoint p = borderConnectionPoints.get(lStation.getBorderPointCode());
				
				if (p != null && p.getConnectedStationSets() != null && p.getConnectedStationSets().size() == 1) {
					for   (StationSet set : p.getConnectedStationSets()) {
						if (set.getStations().size() == 1) {
							for (Station s : set.getStations()) {
								if (!stationNames.getStationName().contains(s)) {
									mergeStationNames(tool, lStation, s);
									stationNames.getStationName().add(s);
								}
							}
						}
					}
				}
			}
			
			//add  names for mapped stations
			for (LegacyStationMap map : tool.getConversionFromLegacy().getParams().getLegacyStationMappings().getStationMappings()) {
				
				if (map.getLegacyCode() == lStation.getStationCode()) {
					Station mappedStation = map.getStation();
					if (mappedStation != null && !stationNames.getStationName().contains(mappedStation)) {
						mergeStationNames(tool, lStation, mappedStation);
						stationNames.getStationName().add(mappedStation);
						found = true;
					}
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
		}

		CompoundCommand command = new CompoundCommand();
		command.append(SetCommand.create(domain, tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__STATION_NAMES, stationNames));
		
		executeAndFlush(command,domain);
		
		return stationNames.getStationName().size();
	}
	
	/**
	 * Update station names.
	 *
	 * @param tool the tool
	 * @param lStation the l station
	 * @return the station
	 */
	Station updateStationNames(GTMTool tool, Legacy108Station lStation) {
		
		Station station = null;
		try {
			station = getStation(tool,myCountry,lStation.getStationCode());
			if (station != null) {
				station.setNameCaseASCII(lStation.getName());
				station.setNameCaseUTF8(lStation.getNameUTF8());
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
				station.setLegacyBorderPointCode(lStation.getBorderPointCode());
			}
		} catch (ConverterException e) {
			// only names
		}
		return station;	
	}
	
	/**
	 * Merge station names.
	 *
	 * @param tool the tool
	 * @param lStation the l station
	 * @param station the station
	 * @return the station
	 */
	Station mergeStationNames(GTMTool tool, Legacy108Station lStation, Station station) {
		
		if (station != null) {
			if (station.getNameCaseASCII() == null || station.getNameCaseASCII().length() == 0) {
				station.setNameCaseASCII(lStation.getName());
			}
			if (station.getNameCaseUTF8() == null || station.getNameCaseUTF8().length() == 0) {
				station.setNameCaseUTF8(lStation.getNameUTF8());
			}
			if (station.getShortNameCaseASCII() == null || station.getShortNameCaseASCII().length() == 0) {
				station.setShortNameCaseASCII(lStation.getShortName());
			}
			if (station.getShortNameCaseUTF8() == null || station.getShortNameCaseUTF8().length() == 0) {
				station.setShortNameCaseUTF8(lStation.getShortNameUtf8());					
			}
			if (station.getNameCaseASCII() == null || station.getNameCaseASCII().length() == 0) {
				station.setLegacyBorderPointCode(lStation.getBorderPointCode());
			}
		}
		return station;	
	}
	
	
	/**
	 * Execute and flush.
	 *
	 * @param command the command
	 * @param domain the domain
	 */
	public void executeAndFlush(CompoundCommand command, EditingDomain domain) {
		
		if (command == null || domain == null || command.isEmpty()) {
			return;
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
	

	
}