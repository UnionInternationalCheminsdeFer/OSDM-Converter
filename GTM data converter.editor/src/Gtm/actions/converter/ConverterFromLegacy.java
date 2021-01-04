package Gtm.actions.converter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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
import Gtm.FareElement;
import Gtm.FareElements;
import Gtm.FareStationSetDefinition;
import Gtm.FareStationSetDefinitions;
import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Legacy108Station;
import Gtm.LegacyAccountingIdentifier;
import Gtm.LegacyBorderPoint;
import Gtm.LegacyBorderPointMapping;
import Gtm.LegacyBorderSide;
import Gtm.LegacyCalculationType;
import Gtm.LegacyDistanceFare;
import Gtm.LegacyFareDetailMap;
import Gtm.LegacyFareStationSetMappings;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeparateContractSeries;
import Gtm.LegacySeries;
import Gtm.LegacySeriesType;
import Gtm.LegacyStationMap;
import Gtm.LegacyStationToServiceConstraintMapping;
import Gtm.LegacyViastation;
import Gtm.Price;
import Gtm.Prices;
import Gtm.RegionalConstraint;
import Gtm.RegionalConstraints;
import Gtm.RegionalValidity;
import Gtm.RoundingType;
import Gtm.RouteDescriptionBuilder;
import Gtm.SalesAvailabilityConstraint;
import Gtm.SalesRestriction;
import Gtm.ServiceConstraint;
import Gtm.StartOfSale;
import Gtm.Station;
import Gtm.StationFareDetailType;
import Gtm.StationNames;
import Gtm.StationSet;
import Gtm.TaxScope;
import Gtm.VATDetail;
import Gtm.VatTemplate;
import Gtm.ViaStation;
import Gtm.actions.GtmUtils;
import Gtm.nls.NationalLanguageSupport;
//import Gtm.preferences.PreferenceConstants;
//import Gtm.preferences.PreferencesAccess;
import Gtm.presentation.DirtyCommand;
import Gtm.presentation.GtmEditor;

/**
 * The Class ConverterFromLegacy.
 */
public class ConverterFromLegacy {
	
	/** The local stations. */
	private HashMap<Integer,Station> localStations = null;
	
	/** The legacy stations. */
	private HashMap<Integer,Legacy108Station> legacyStations = null;
	
	/** The carriers. */
	private HashMap<String,Carrier> carriers = null;
	
	/** The carrier constraints. */
	private HashMap<String, CarrierConstraint> carrierConstraints = null;
	
	/** The station code to fare station set mapping */
	private HashMap<Integer,FareStationSetDefinition> fareStationSets = null;
	
	/** The my country. */
	private Country myCountry = null;
	
	/** The tool. */
	private GTMTool tool = null;
	
	/** The domain. */
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
		localStations = new HashMap<Integer,Station>();
		carriers = new HashMap<String,Carrier>();
		legacyStations = new HashMap<Integer,Legacy108Station>();
		carrierConstraints = new HashMap<String,CarrierConstraint>();
		fareStationSets  = new HashMap<Integer,FareStationSetDefinition>();
		this.tool = tool;
		this.editor = editor;
		this.domain = domain;

		myCountry = tool.getConversionFromLegacy().getParams().getCountry();
		
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
				legacyStations.put(Integer.valueOf(station.getStationCode()), station);
		}
		
	}
		
	
	
	
	/**
	 * Delete old conversion results.
	 *
	 * @return the int
	 */
	public int deleteOldConversionResults() {
		int deleted = 0;

		CompoundCommand command = new CompoundCommand();
		
		ArrayList<FareElement> fares = new ArrayList<FareElement>();
		for (FareElement fare : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			if (fare.getDataSource() == DataSource.CONVERTED) {
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
		
		command = new CompoundCommand();
		ArrayList<RegionalConstraint> regions = new ArrayList<RegionalConstraint>();
		for (RegionalConstraint region : tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints()) {
			if (region.getDataSource() == DataSource.CONVERTED) {
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
		regions.clear();
		
		
		command = new CompoundCommand();
		ArrayList<Price> prices = new ArrayList<Price>();
		for (Price price : tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices()) {
			if (price.getDataSource() == DataSource.CONVERTED) {
				prices.add(price);
			}
		}	
		if (prices.size() == tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices().size()) {
			Prices priceList = GtmFactory.eINSTANCE.createPrices();
			command.append(SetCommand.create(domain, tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__PRICES, priceList));
		} else {
			command.append(RemoveCommand.create(domain,tool.getGeneralTariffModel().getFareStructure().getPrices(),GtmPackage.Literals.PRICES__PRICES, prices) );
			executeAndFlush(command,domain);
		}
		prices.clear();
		
		
		command = new CompoundCommand();		
		for (ConnectionPoint point : tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints()) {
			if (point.getDataSource() == DataSource.CONVERTED || point.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, point) );
			}
		}			
		
		for (SalesAvailabilityConstraint sa : tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			if (sa.getDataSource() == DataSource.CONVERTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}		
		executeAndFlush(command,domain);
		
		command = new CompoundCommand();		
		for (Calendar sa : tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars()) {
			if (sa.getDataSource() == DataSource.CONVERTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}	
		executeAndFlush(command,domain);
		
		command = new CompoundCommand();		
		for (FareStationSetDefinition sa : tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			if (sa.getDataSource() == DataSource.CONVERTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}
		executeAndFlush(command,domain);

		command = new CompoundCommand();		
		for (AfterSalesRule sa : tool.getGeneralTariffModel().getFareStructure().getAfterSalesRules().getAfterSalesRules()) {
			if (sa.getDataSource() == DataSource.CONVERTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}
		executeAndFlush(command,domain);
		
		if ( tool.getConversionFromLegacy().getParams() != null && 
			 tool.getConversionFromLegacy().getParams().getLegacyStationMappings() != null) {
			command = new CompoundCommand();		
			for (LegacyStationMap m : tool.getConversionFromLegacy().getParams().getLegacyStationMappings().getStationMappings()) {
				if (m.getDataSource() == DataSource.CONVERTED) {
					command.append(DeleteCommand.create(domain,m) );
				}
			}
			executeAndFlush(command,domain);
		}
		

		return deleted;
	}


	/**
	 * Convert to gtm model.
	 *
	 * @param monitor the monitor
	 * @return the int
	 */
	public int convertToGtm(IProgressMonitor monitor) {
		
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		if (country == null) {
			String message = NationalLanguageSupport.ConverterFromLegacy_0;
			writeConsoleError(message);
			return 0;
		}
		
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
				CarrierConstraint constraint = GtmFactory.eINSTANCE.createCarrierConstraint();
				constraint.setDataDescription(NationalLanguageSupport.ConverterFromLegacy_2 + carrier.getName());
				constraint.getIncludedCarriers().add(carrier);
				carrierConstraints.put(carrier.getCode(),constraint);
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

		
		command = new CompoundCommand();
		if (fares!= null && !fares.isEmpty()) {
			Command com3 = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getFareElements(),GtmPackage.Literals.FARE_ELEMENTS__FARE_ELEMENTS , fares);		
			command.append(com3);	
			executeAndFlush(command, domain);
		}
		monitor.worked(1);
		
		return added;
	}


	private static int DIRECTION_ORIGINAL = 1;
	private static int DIRECTION_REVERSED = 2;
	
	/**
	 * Convert series to fares.
	 *
	 * @param series the series
	 * @param fareTemplate the fare template
	 * @param number the number of converted series
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
			writeConsoleError(message);
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


	
	
	private Price createFee(Price price, AfterSalesTemplate feeTemplate, ArrayList<Price> priceList) {
		
		if (price == null || price.getCurrencies()== null || price.getCurrencies().isEmpty()) return null;
		
		float amount = price.getCurrencies().get(0).getAmount();
		amount = amount * feeTemplate.getFeeFactor();

		BigDecimal bd = null;
		if (feeTemplate.getRoundingMode() == RoundingType.DOWN) {
			 bd = new BigDecimal(amount).setScale(2, RoundingMode.DOWN);
			 amount = bd.floatValue();
		} else if (feeTemplate.getRoundingMode() == RoundingType.UP) {
			 bd = new BigDecimal(amount).setScale(2, RoundingMode.UP);
			 amount = bd.floatValue();
		} else if (feeTemplate.getRoundingMode() == RoundingType.HALFDOWN) {
			 bd = new BigDecimal(amount).setScale(2, RoundingMode.HALF_DOWN);
			 amount = bd.floatValue();
		} else if (feeTemplate.getRoundingMode() == RoundingType.HALFEVEN) {
			 bd = new BigDecimal(amount).setScale(2, RoundingMode.HALF_EVEN);
			 amount = bd.floatValue();
		} else if (feeTemplate.getRoundingMode() == RoundingType.HALFUP) {
			 bd = new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP);
			 amount = bd.floatValue();
		} 
		
		
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
					sa.getRestrictions().get(0) != null &&
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
			String message = NationalLanguageSupport.ConverterFromLegacy_6;
			writeConsoleError(message);
			throw new ConverterException(message);
		}
		
		
		//handle departure
		ViaStation viaDeparture = getViaStation(tool, country, series.getToStation(),series.getNumber());

		//handle arrival
		ViaStation viaArrival = getViaStation(tool, country, series.getFromStation(),series.getNumber());	
		
		//set connection points 
		setConnectionPoints(series, viaDeparture.getStation(), viaArrival.getStation(), constraint, true);
		
		
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
						writeConsoleError(message);
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
						String message = NationalLanguageSupport.ConverterFromLegacy_15 + Integer.toString(series.getNumber()) + ") : " + e.getMessage(); //$NON-NLS-2$
						writeConsoleError(message);
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
						String message = NationalLanguageSupport.ConverterFromLegacy_17 + Integer.toString(series.getNumber()) + ") :" + e.getMessage(); //$NON-NLS-2$
						writeConsoleError(message);
						throw e;
					}		
				}
			} else {
				try {
					addToRoute(lastRoute, legacyViaStation, country,series.getNumber());
				} catch (ConverterException e) {
					String message = NationalLanguageSupport.ConverterFromLegacy_19 + Integer.toString(series.getNumber()) + ") : " + e.getMessage(); //$NON-NLS-2$
					writeConsoleError(message);
					throw new ConverterException(message);
				}		
			}
		}
		
		//handle arrival
		viaArrival.setDataDescription(viaArrival.getDescription());
		mainRoute.add(viaArrival);	
		
		constraint.setDataDescription(RouteDescriptionBuilder.getRouteDescription(constraint.getRegionalValidity()));
		
		return constraint;
	}
	
	private ViaStation getViaStation(GTMTool tool, Country country, int code,int seriesNumber) throws ConverterException {

		Station station = null;
		FareStationSetDefinition fareStationSet = null;
		fareStationSet = findFareStation(code);
		if (fareStationSet == null) {
			station = getStation(tool, country, code);
			if (station  == null) {
				station = findBorderPointMappingStation(code);
			} 		
		} 
		if (station == null && fareStationSet == null) {
			if (isMappedStation(code)) {
				return null;
			}
			String message = NationalLanguageSupport.ConverterFromLegacy_7 + Integer.toString(seriesNumber) + NationalLanguageSupport.ConverterFromLegacy_8 + Integer.toString(code);
			writeConsoleError(message);
			throw new ConverterException(message);
		}
		
		ViaStation viaStation = GtmFactory.eINSTANCE.createViaStation();
		viaStation.setStation(station);
		viaStation.setFareStationSet(fareStationSet);
		viaStation.setDataDescription(viaStation.getDescription());
		return viaStation;
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
	 * @param reversed the reversed
	 * @throws ConverterException the converter exception
	 */
	private void setConnectionPoints(LegacySeries series, Station departureStation, Station arrivalStation, RegionalConstraint constraint , boolean reversed) throws ConverterException {

		/*
		 * BORDER_DESTINATION: 
		 * 				original series BORDER-STATION = from station in series
		 */
		
		//handle series from border station
		if (series.getType() == LegacySeriesType.TRANSIT || series.getType() == LegacySeriesType.BORDER_DESTINATION) {
			
			//series border is always the from station
			int borderpointcode = getBorderPointCode(tool, series.getFromStation());
		
		    if (reversed) {
				//set arrival
		    	ConnectionPoint point = findConnectionPoint(tool,borderpointcode,arrivalStation);
		    	if (point == null) {
		    		String message = NationalLanguageSupport.ConverterFromLegacy_11 + Integer.toString(series.getNumber()) + NationalLanguageSupport.ConverterFromLegacy_12;
		    		writeConsoleError(message);
		    		throw new ConverterException(message);
		    	}
		    	constraint.setExitConnectionPoint(point);
		    } else {
				//set departure
		    	ConnectionPoint point = findConnectionPoint(tool,borderpointcode,departureStation);
		    	if (point == null) {
		    		String message = NationalLanguageSupport.ConverterFromLegacy_11 + Integer.toString(series.getNumber()) + NationalLanguageSupport.ConverterFromLegacy_12;
		    		writeConsoleError(message);
		    		throw new ConverterException(message);
		    	}
		    	constraint.setEntryConnectionPoint(point);		    	
		    } 
		}
		
		
		//handle series to station border
		if (series.getType() == LegacySeriesType.TRANSIT) {

			int borderpointcode = getBorderPointCode(tool, series.getToStation());
			
			if (reversed) {
				//set departure
				ConnectionPoint point = findConnectionPoint(tool,borderpointcode,departureStation);
				if (point == null) {
					String message = NationalLanguageSupport.ConverterFromLegacy_21 + Integer.toString(series.getNumber()) + NationalLanguageSupport.ConverterFromLegacy_22;
					writeConsoleError(message);
					throw new ConverterException(message);
				}
				constraint.setEntryConnectionPoint(point);
			} else {
				//set arrival
				ConnectionPoint point = findConnectionPoint(tool,borderpointcode,arrivalStation);
				if (point == null) {
					String message = NationalLanguageSupport.ConverterFromLegacy_21 + Integer.toString(series.getNumber()) + NationalLanguageSupport.ConverterFromLegacy_22;
					writeConsoleError(message);
					throw new ConverterException(message);
				}
				constraint.setExitConnectionPoint(point);				
			}
		}

		
	}




	/**
	 * Find border point mapping station.
	 *
	 * @param code the code
	 * @return the station
	 */
	private Station findBorderPointMappingStation(int code) {
		LegacyBorderPointMapping map = (tool.getConversionFromLegacy().getParams().getLegacyBorderPointMappings().getMappingByBorderPointCode(code));
		if (map != null) {
			return map.getStation();
		}
		return null;
	}




	/**
	 * Find fare station.
	 *
	 * @param code the code
	 * @return the fare station set definition
	 */
	private FareStationSetDefinition findFareStation(int code) {
		if (fareStationSets == null || fareStationSets.isEmpty()) return null;
		return fareStationSets.get(Integer.valueOf(code));
	}




	/**
	 * Gets the border point code.
	 *
	 * @param tool the tool
	 * @param stationcode the station code
	 * @return the border point code
	 */
	private static int getBorderPointCode(GTMTool tool, int stationcode) {
		for (Legacy108Station station : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
			if (station.getStationCode() == stationcode) return station.getBorderPointCode();
		}
		return 0;
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
		
		//set connection points 
		setConnectionPoints(series, viaDeparture.getStation(), viaArrival.getStation(), constraint, false);
		
		
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
						writeConsoleError(message);
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
						String message = "error in series: " + Integer.toString(series.getNumber()) + ") : " + e.getMessage(); //$NON-NLS-2$
						writeConsoleError(message);
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
						writeConsoleError(message);
						throw e;
					}		
				}
			} else {
				//we stay in the same route
				try {
					addToRoute(lastRoute, legacyViaStation, country,series.getNumber());
				} catch (ConverterException e) {
					String message = NationalLanguageSupport.ConverterFromLegacy_35 + Integer.toString(series.getNumber()) + NationalLanguageSupport.ConverterFromLegacy_36 + e.getMessage();
					writeConsoleError(message);
				}		
			}
		}
		
		
		mainRoute.add(viaArrival);				
		
		constraint.setDataDescription(RouteDescriptionBuilder.getRouteDescription(constraint.getRegionalValidity()));
		
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
	private static ConnectionPoint findConnectionPoint(GTMTool tool, int borderpoint, Station station) {
		
		if (tool.getGeneralTariffModel().getFareStructure().getConnectionPoints() == null ||
			tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints() == null ||
			tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints().isEmpty()) {
			return null;
		}
		
		if (borderpoint > 0) {
			for (ConnectionPoint p : tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints()) {
				if (p.getLegacyBorderPointCode() == borderpoint) {
					return p;
				}
			}
		}
		
		if (borderpoint == 0) {
			//find connection point which contains the station
			if (station != null) {
				for (ConnectionPoint p : tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints()) {
					if (p.getLegacyBorderPointCode() == 0) {
						if (p.getConnectedStationSets() != null && 
							!p.getConnectedStationSets().isEmpty() && 
							p.getConnectedStationSets().size() == 1 &&
							p.getConnectedStationSets().get(0) != null &&
							p.getConnectedStationSets().get(0).getStations() != null) {
						
							if (p.getConnectedStationSets().get(0).getStations().contains(station)) {
								return p;
							}
						}
					}	
				}
			}
		}
		return null;
	}
	
	/**
	 * Find connection point.
	 * 
	 * fond or create a connection point for the given station 108.1 code and country
	 *
	 * @param tool the tool
	 * @param stationCode the station code
	 * @param country the country
	 * @param points 
	 * @return 
	 * @return the connection point
	 */
	private void findOrCreateConnectionPoint(GTMTool tool, int stationCode, Country country, List<ConnectionPoint> points) {

		
		//get the real station for the station code
		Station station = null;
		try {
			station = getStation(tool, country, stationCode);
		} catch (ConverterException e) {
			// continue
		}
		
		//get the legacy station for the station code --> get the legacy border point code
		int borderpoint = 0;
		Legacy108Station legacyStation = legacyStations.get(Integer.valueOf(stationCode));
		if (legacyStation != null) {
			borderpoint = legacyStation.getBorderPointCode();
		}
		
		if (borderpoint > 0 && existsConnectionPoint(borderpoint)) return;

		//border point is missing, create it based on the series
		if (borderpoint > 0) {
			
			ConnectionPoint point = null;

			//no data available --> create a border point from the station
			point = GtmFactory.eINSTANCE.createConnectionPoint();
			point.setLegacyBorderPointCode(borderpoint);
			point.setDataSource(DataSource.CONVERTED);

			if (station != null) {
				point.setDescription("created from series data only - might be incomplete");
				StationSet set = GtmFactory.eINSTANCE.createStationSet();
				set.getStations().add(station);
				point.getConnectedStationSets().add(set);
				point.setLegacyBorderPointCode(borderpoint);
				points.add(point);
				Command com = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getConnectionPoints(), GtmPackage.Literals.CONNECTION_POINTS__CONNECTION_POINTS, point);
				if  (com != null && com.canExecute()) {
					domain.getCommandStack().execute(com);
				}
				return;
			} else {
				point.setDescription("created from series data only- station is missing!");
				points.add(point);
				return;
			}
		}
		
		
		//no border point code but we need a connection point
		
		//maybe its already there 
		if (station != null) {
			for (ConnectionPoint p : points) {
				if (p.getLegacyBorderPointCode() == 0) {
					if (p.getConnectedStationSets() != null && 
						!p.getConnectedStationSets().isEmpty() && 
						p.getConnectedStationSets().size() == 1 &&
						p.getConnectedStationSets().get(0) != null &&
						p.getConnectedStationSets().get(0).getStations() != null) {
					
						if (p.getConnectedStationSets().get(0).getStations().contains(station)) {
							return;
						}
					}
				}	
			}
		}
		
		//no border point code available
		if (station != null) {
			//create connectionPoint with a station
			ConnectionPoint point = GtmFactory.eINSTANCE.createConnectionPoint();
			point.setDataSource(DataSource.CONVERTED);
			StationSet stationSet = GtmFactory.eINSTANCE.createStationSet();
			stationSet.getStations().add(station);		
			point.getConnectedStationSets().add(stationSet);
			point.setDescription("created from series endpoint only - border point code missing");
			points.add(point);
			Command com = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getConnectionPoints(), GtmPackage.Literals.CONNECTION_POINTS__CONNECTION_POINTS, point);
			if  (com != null && com.canExecute()) {
				domain.getCommandStack().execute(com);
			}			
			return;
		} else {
			//might be a virtual fare station set 
			FareStationSetDefinition fssd = fareStationSets.get(Integer.valueOf(stationCode));
			if (fssd != null) {
				ConnectionPoint point = GtmFactory.eINSTANCE.createConnectionPoint();
				point.setDataSource(DataSource.CONVERTED);
				StationSet stationSet = GtmFactory.eINSTANCE.createStationSet();
				stationSet.getStations().addAll(fssd.getStations());		
				point.getConnectedStationSets().add(stationSet);
				//indicate non border point
				//point.setLegacyBorderPointCode(fssd.getLegacyCode() + 100000);
				point.setDescription("created from series endpoint only - border point code missing");
				points.add(point);
			} else {
				String message = "Connection Point missing for series station code " + Integer.toString(stationCode);
				writeConsoleError(message);
			}
			return;
		}

	}
	
	/**
	 * Find connection pointvia border point code.
	 *
	 * @param tool the tool
	 * @param borderpointcode the borderpointcode
	 * @return the connection point
	 */
	public static ConnectionPoint findConnectionPointviaBorderPointCode (GTMTool tool, int borderpointcode) {
		LegacyBorderPointMapping map = tool.getConversionFromLegacy().getParams().getLegacyBorderPointMappings().getMappingByBorderPointCode(borderpointcode);
		if (map != null && map.getConnectionPoint() != null) {
			return map.getConnectionPoint();
		}
		
		
		if (tool.getGeneralTariffModel().getFareStructure() == null) return null;
		if (tool.getGeneralTariffModel().getFareStructure() == null) return null;
		if (tool.getGeneralTariffModel().getFareStructure().getConnectionPoints() == null) return null;
		if (tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints().isEmpty()) return null;
		for (ConnectionPoint point : tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints()) {
			if (point.getLegacyBorderPointCode() == borderpointcode) {
				return point;
			}
		}

		return null;
		
	}



	/**
	 * Adds the to route.
	 *
	 * @param lastRoute the last route
	 * @param legacyViaStation the legacy via station
	 * @param country the country
	 * @param seriesNumber 
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
		for (LegacyStationToServiceConstraintMapping map : tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings().getLegacyStationToServiceBrandMappings()) {
			if (map.getCode() == code) return true;
		}
		return false;
	}




	/**
	 * Gets the station.
	 *
	 * @param tool the tool
	 * @param country the country
	 * @param localCode the local code
	 * @return the station
	 * @throws ConverterException the converter exception in case the station is not found and not mapped to something else
	 */
	public Station getStation(GTMTool tool, Country country, int localCode) throws ConverterException {
		
		//mapped station?
		
		Station station = tool.getConversionFromLegacy().getParams().getLegacyStationMappings().findMappedStation(localCode);
		if (station != null) {
			return station;
		}
		ServiceConstraint constraint = tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings().findServiceConstraint(localCode);
		if (constraint != null){
			return null;
		}
			
		//borderpoint?	
		if (tool.getConversionFromLegacy().getParams().getLegacyBorderPointMappings() != null) {
			LegacyBorderPointMapping map = tool.getConversionFromLegacy().getParams().getLegacyBorderPointMappings().getMappingByBorderPointCode(localCode);
			if (map != null) {
				station = map.getStation();
			}
		}
		
		//real station
		station = localStations.get(Integer.valueOf(localCode));

		if (station == null) {
			
			if (isMappedStation(localCode)) {
				return null;
			} else {
				String message = NationalLanguageSupport.ConverterFromLegacy_40 + Integer.toString(localCode) ;
				writeConsoleError(message);
			}
		}
		return station;
	}
	

	/**
	 * Convert series to price.
	 *
	 * @param tool the tool
	 * @param series the series
	 * @param fareTemplate the fare template
	 * @param dateRange the date range
	 * @param regionalConstraint 
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
			if (fareTemplate.getServiceClass().getClassicClass() == ClassicClassType.FIRST) {
				amount = getAdultAmount(tool, series,1,dateRange);
			} else {
				amount = getAdultAmount(tool, series,2,dateRange);	
			}	
			if (amount == null) return null;

			amount = amount * fareTemplate.getPriceFactor();
			
			// 2 digits for EUR
			//double scale = Math.pow(10, 2);
			//double centAmout = amount * scale;
			
			BigDecimal bd = null;
			if (fareTemplate.getRoundingMode() == RoundingType.DOWN) {
				 bd = new BigDecimal(amount).setScale(2, RoundingMode.DOWN);
				 amount = bd.floatValue();
			} else if (fareTemplate.getRoundingMode() == RoundingType.UP) {
				 bd = new BigDecimal(amount).setScale(2, RoundingMode.UP);
				 amount = bd.floatValue();
			} else if (fareTemplate.getRoundingMode() == RoundingType.HALFDOWN) {
				 bd = new BigDecimal(amount).setScale(2, RoundingMode.HALF_DOWN);
				 amount = bd.floatValue();
			} else if (fareTemplate.getRoundingMode() == RoundingType.HALFEVEN) {
				 bd = new BigDecimal(amount).setScale(2, RoundingMode.HALF_EVEN);
				 amount = bd.floatValue();
			} else if (fareTemplate.getRoundingMode() == RoundingType.HALFUP) {
				 bd = new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP);
				 amount = bd.floatValue();
			} 

		    //amount = (float) (Math.round(amount * scale) / scale);
			
		    price = createPrice(amount,regionalConstraint);
		    
			if (price != null) {
				price = findPrice(price, priceList);
			}
			
			return price;
		
		} catch (Exception e) {
			e.printStackTrace();
			String message = NationalLanguageSupport.ConverterFromLegacy_42 + Integer.toString(series.getNumber()) + ")"; //$NON-NLS-2$
			writeConsoleError(message);
			return null;
		}
	}
	
	/**
	 * Creates the price.
	 *
	 * @param amount the amount
	 * @param regionalConstraint 
	 * @param series 
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
			
				if (fare.getSeriesNumber() == series.getNumber() 
						&& ( fare.getValidFrom().before(dateRange.getStartDate())
								|| fare.getValidFrom().equals(dateRange.getStartDate()) )
						&& ( fare.getValidUntil().after(dateRange.getEndDate())
							   ||fare.getValidUntil().equals(dateRange.getEndDate()) ) )  {
					if (travelClass == 1) {
						return ((float) fare.getFare1st())/100; 
					} else {
						return ((float) fare.getFare2nd())/100; 			
					}
				}
			}
		}  else {
			float price = 0;
			
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
				if ( (     fare.getValidFrom().before(dateRange.getStartDate())
						|| fare.getValidFrom().equals(dateRange.getStartDate()) )
					&& ( fare.getValidUntil().after(dateRange.getEndDate())
					   ||fare.getValidUntil().equals(dateRange.getEndDate()) ) )  {
				
					if (travelClass == 1) {
						if (distance > fare.getDistance() && fare.getFare1st() > price) {
							price = fare.getFare1st();
						}
					} else {
						if (distance > fare.getDistance() && fare.getFare2nd() > price) {
							price = fare.getFare2nd();
						}				
					}
				}
			}
			
			return price/100;
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
	 * @param priceList 
	 * @param afterSalesRules 
	 * @param dateRange 
	 * @param regionalConstraint 
	 * @param price 
	 * @param legacyFareCounter 
	 * @return the fare element
	 * @throws ConverterException the converter exception
	 */
	public void convertSeriesToFare(GTMTool tool, LegacySeries series, FareTemplate fareTemplate, int direction, int legacyFareCounter, Price price, RegionalConstraint regionalConstraint, DateRange dateRange, ArrayList<AfterSalesRule> afterSalesRules, ArrayList<Price> priceList, ArrayList<FareElement> fares) throws ConverterException{
		
		FareElement fare = GtmFactory.eINSTANCE.createFareElement();
		template2Fare(fare, fareTemplate);
		
		LegacyAccountingIdentifier accountingIdentifier = GtmFactory.eINSTANCE.createLegacyAccountingIdentifier();
		accountingIdentifier.setAddSeriesId(0);
		if (fareTemplate.getLegacyAccountingIdentifier() != null) {
			accountingIdentifier.setTariffId(fareTemplate.getLegacyAccountingIdentifier().getTariffId());
		} else {
			accountingIdentifier.setTariffId(0);
		}
		
		
		accountingIdentifier.setSeriesId(series.getNumber());
		fare.setLegacyAccountingIdentifier(accountingIdentifier);
		fare.setDataSource(DataSource.CONVERTED);

		
		fare.setCarrierConstraint(carrierConstraints.get(series.getCarrierCode()));
		if (fare.getCarrierConstraint() == null) {
			fare.setCarrierConstraint(fareTemplate.getCarrierConstraint());
		}
		
		if (isSeparateContract(series)) {
			fare.setCombinationConstraint(fareTemplate.getSeparateContractCombinationConstraint());
		} else {
			fare.setCombinationConstraint(fareTemplate.getCombinationConstraint());
		}
		fare.setDataDescription(NationalLanguageSupport.ConverterFromLegacy_44 + Integer.toString(series.getNumber()) +NationalLanguageSupport.ConverterFromLegacy_45 + fareTemplate.getDataDescription());;

		LegacyAccountingIdentifier legacyAccountingIdentifier = GtmFactory.eINSTANCE.createLegacyAccountingIdentifier();
		legacyAccountingIdentifier.setSeriesId(series.getNumber());
		legacyAccountingIdentifier.setAddSeriesId(direction);
		fare.setLegacyAccountingIdentifier(legacyAccountingIdentifier);

		fare.getLegacyAccountingIdentifier().setTariffId(legacyFareCounter++);
		fare.setPrice(price);
		fare.setRegionalConstraint(regionalConstraint);
		regionalConstraint.getLinkedFares().add(fare);
		
		fare.setSalesAvailability(findSalesAvailability(tool,dateRange));
		mapConstraintsAndDescriptions(fare, series);
		if (price != null && fare != null) {
			fare.setAfterSalesRule(convertAfterSalesRules(price, fareTemplate, afterSalesRules, priceList));
			fares.add(fare);			
		}
		
	}

	
	/**
	 * Template 2 fare.
	 *
	 * @param fare the fare
	 * @param fareTemplate the fare template
	 */
	private void template2Fare(FareElement fare,FareTemplate fareTemplate) {
		
		fare.setFareDetailDescription(fareTemplate.getFareDetailDescription());
		fare.setFulfillmentConstraint(fareTemplate.getFulfillmentConstraint());
		fare.setIndividualContracts(fareTemplate.isIndividualContracts());		
		fare.setPassengerConstraint(fareTemplate.getPassengerConstraint());
		fare.setReductionConstraint(fareTemplate.getReductionConstraint());
		fare.setPersonalDataConstraint(fareTemplate.getPersonalDataConstraint());
		fare.setReservationParameter(fareTemplate.getReservationParameter());
		fare.setSalesAvailability(fareTemplate.getSalesAvailability());
		fare.setServiceClass(fareTemplate.getServiceClass());
		fare.setServiceConstraint(fareTemplate.getServiceConstraint());
		fare.setServiceLevel(fareTemplate.getServiceLevel());
		fare.setText(fareTemplate.getText());
		fare.setTravelValidity(fareTemplate.getTravelValidity());
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
		
		List<ConnectionPoint> pointList = new ArrayList<ConnectionPoint>();
		//add converted border points related to the carrier
		convertImportedBorderPoints(pointList);
		/*
		CompoundCommand com = new CompoundCommand();
		for (ConnectionPoint point : pointList) {
			if (!existsConnectionPoint(point)) {
				Command comm = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getConnectionPoints(), GtmPackage.Literals.CONNECTION_POINTS__CONNECTION_POINTS, point);
				com.append(comm);
			}
		}
		if  (com != null && !com.isEmpty() && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		*/
		
		//add additional connection points from series
		HashMap<Integer,LegacyStationMap> stationMapList = new HashMap<Integer,LegacyStationMap>();
		
		for (LegacySeries series : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			List<ConnectionPoint> points = null;
			try {
				points = convertSeriesToConnectionPoints(tool, series);
			} catch (ConverterException e) {
				String message = NationalLanguageSupport.ConverterFromLegacy_46 + Integer.toString(series.getNumber()) + NationalLanguageSupport.ConverterFromLegacy_47;
				writeConsoleError(message);
			}
			if (points != null && !points.isEmpty()) {
				pointList.addAll(points);
			}
		}
		
		// if only one MERITS code is provided
		// if there is not a mapping jet
		
		if (tool.getConversionFromLegacy() == null || 
			tool.getConversionFromLegacy().getLegacy108() == null ||
			tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints() == null ||
			tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints() == null ||
			tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints().isEmpty()) {
			return pointList.size();
		}
		
		for (LegacyBorderPoint point : tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints()) {
			
			for (LegacyBorderSide side : point.getBorderSides()) {

				if (side.getCarrier() == tool.getConversionFromLegacy().getLegacy108().getCarrier()) {
					Integer localCode = side.getLegacyStationCode();
					if (side.getStations() != null && side.getStations().getStations().size() == 1) {
						//create a station map in case only one station is in the connection point
						Station station = side.getStations().getStations().get(0);
						if (!stationMapExists(localCode)) {
							LegacyStationMap map = GtmFactory.eINSTANCE.createLegacyStationMap();
							map.setLegacyCode(localCode);
							map.setStation(station);
							map.setDataSource(DataSource.CONVERTED);
							stationMapList.put(localCode, map);
						}
					} else if (point.getBorderSides().size() == 1) {
						//create a station map in case multiple stations in one connection point --> all stations are the same 
						//select the station with the appropriate country
						for (Station station : side.getStations().getStations()) {
							if (station.getCountry().equals(tool.getConversionFromLegacy().getParams().getCountry())) {
								LegacyStationMap map = GtmFactory.eINSTANCE.createLegacyStationMap();
								map.setLegacyCode(localCode);
								map.setStation(station);
								map.setDataSource(DataSource.CONVERTED);
								stationMapList.put(localCode, map);
							}
						}
					}
				} 
			}
		}
		
		if (!stationMapList.isEmpty()) {
			Command command3 = AddCommand.create(domain, tool.getConversionFromLegacy().getParams().getLegacyStationMappings(), GtmPackage.Literals.LEGACY_STATION_MAPPINGS__STATION_MAPPINGS,stationMapList.values());
			if  (command3 != null && command3.canExecute()) {
				domain.getCommandStack().execute(command3);
			}
		}

		return pointList.size();
	}

	private boolean existsConnectionPoint(int legayBorderPointCode) {
		if (tool.getGeneralTariffModel().getFareStructure().getConnectionPoints() == null ||
				tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints() == null ||
				tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints().isEmpty()) {
				return false;
			}
		
		for (ConnectionPoint p : tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints()) {
			if (p.getLegacyBorderPointCode() == legayBorderPointCode) {
				return true;
			}
		}
		return false;
	}

	private void convertImportedBorderPoints(List<ConnectionPoint> pointList) {
				
		for (LegacyBorderPoint lp : tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints()) {
			
			ConnectionPoint connectionPoint = convertImportedBorderPoint(lp);
			if (connectionPoint != null) {
				connectionPoint.setDataSource(DataSource.IMPORTED);
				pointList.add(connectionPoint);
			}
		}
		
	}


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
			if (stations != null && !stations.getStations().isEmpty()) {
				point.getConnectedStationSets().add(stations);
			}
		
			Command command = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getConnectionPoints(), GtmPackage.Literals.CONNECTION_POINTS__CONNECTION_POINTS, point);
			if  (command != null && command.canExecute()) {
				domain.getCommandStack().execute(command);
			}
			return point;
		}
		if (lBorder.getBorderSides()!= null && lBorder.getBorderSides().size() > 1) {
			ConnectionPoint point = GtmFactory.eINSTANCE.createConnectionPoint();
			point.setLegacyBorderPointCode(lBorder.getBorderPointCode());
			point.setDataSource(DataSource.IMPORTED);
			for (LegacyBorderSide side : lBorder.getBorderSides()) {
				
				StationSet stations = EcoreUtil.copy(side.getStations());
				if (stations != null && !stations.getStations().isEmpty()) {
					point.getConnectedStationSets().add(stations);
				}
			}
			Command command = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getConnectionPoints(), GtmPackage.Literals.CONNECTION_POINTS__CONNECTION_POINTS, point);
			if  (command != null && command.canExecute()) {
				domain.getCommandStack().execute(command);
			}
			return point;			
		}
		return null;
		
	}




	//don't add mapping in case it already exists
	private boolean stationMapExists(Integer localCode) {
		for (LegacyStationMap map : tool.getConversionFromLegacy().getParams().getLegacyStationMappings().getStationMappings() ) {		
			if (map.getLegacyCode() == localCode) return true;
		}
		return false;
	}




	
	/**
	 * Convert series to connection points.
	 * 
	 * Creates a list of all connection points needed for the list of series
	 *
	 * @param tool the tool
	 * @param series the series
	 * @return the list of connection point
	 * @throws ConverterException the converter exception
	 */
	public List<ConnectionPoint> convertSeriesToConnectionPoints(GTMTool tool, LegacySeries series) throws ConverterException{
		 
		List<ConnectionPoint> pointList = new ArrayList<ConnectionPoint>();
			
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		if (country == null) {
			String message = NationalLanguageSupport.ConverterFromLegacy_48;
			writeConsoleError(message);
			throw new ConverterException(message);
		}

		
		//find connection points
		if (series.getType() == LegacySeriesType.TRANSIT) {
			findOrCreateConnectionPoint(tool, series.getToStation(), country, pointList);
		}
		

		if (series.getType() == LegacySeriesType.TRANSIT || series.getType() == LegacySeriesType.BORDER_DESTINATION) {
			findOrCreateConnectionPoint(tool, series.getFromStation(), country, pointList);
		}
		

		return pointList;
	}




	
	/**
	 * Check distance.
	 *
	 * @param station1 the station 1
	 * @param station2 the station 2
	 * @return true, if successful

	private boolean checkDistance(Station station1, Station station2) {
		
		
		Float accuracy = ((float)PreferencesAccess.getIntFromPreferenceStore(PreferenceConstants.P_LINK_STATIONS_BY_GEO_ACCURACY)) / (60 * 60);
		
		if (station1 != station2 && 
			station1.getLatitude() > 0 &&
			station2.getLatitude() > 0 &&
			station1.getLongitude() > 0 &&
			station2.getLongitude() > 0 &&
			Math.abs(station1.getLatitude() - station2.getLatitude()) < accuracy &&
			Math.abs(station1.getLongitude() - station2.getLongitude()) < accuracy) {
				
			return true;
				
		}
		return false;
	}
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
		LegacyFareStationSetMappings fareStationSetMappings = GtmFactory.eINSTANCE.createLegacyFareStationSetMappings();
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
					//this is the station defining the name
					def.setName(legacyStation.getShortName());
					def.setNameUtf8(legacyStation.getNameUTF8());
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
							// something strange happend
							String message = NationalLanguageSupport.ConverterFromLegacy_50 + Integer.toString(legacyStation.getStationCode()) + NationalLanguageSupport.ConverterFromLegacy_51;
							GtmUtils.writeConsoleError(message, editor);
						}
					}
				}
				if (def.getStations().isEmpty()) {
					String message = NationalLanguageSupport.ConverterFromLegacy_55 + Integer.toString(legacyStation.getStationCode()) + " " + def.getName();
					GtmUtils.writeConsoleWarning(message, editor);
				}
			}
			
		}
		
		
		
		Command cmd = SetCommand.create(domain,tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS, fareStationSetDefinitions);
		if (cmd.canExecute()) {
			domain.getCommandStack().execute(cmd);
		} else {
			return 0;
		}
	
		Command cmd2 = SetCommand.create(domain,tool.getConversionFromLegacy().getParams(), GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS, fareStationSetMappings);
		if (cmd.canExecute()) {
			domain.getCommandStack().execute(cmd2);
		    return fareStationSetMappings.getLegacyFareStationSetMap().size();
		} else {
			return 0;
		}		
		

	}
	
	/**
	 * find manually created fare station sets
	 *
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

			Station station;
			try {
				station = getStation(tool,myCountry,lStation.getStationCode());
				if (station != null) {
					station.setNameCaseASCII(lStation.getName());
					station.setNameCaseUTF8(lStation.getNameUTF8());
					station.setShortNameCaseASCII(lStation.getShortName());
					station.setShortNameCaseUTF8(lStation.getShortName());					
					station.setLegacyBorderPointCode(lStation.getBorderPointCode());
					stationNames.getStationName().add(station);
				}
			} catch (ConverterException e) {
				// only names
			}
		}

		CompoundCommand command = new CompoundCommand();
		command.append(SetCommand.create(domain, tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__STATION_NAMES, stationNames));
		
		executeAndFlush(command,domain);
		
		return stationNames.getStationName().size();
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
			writeConsoleError(message);
		}
		
		System.gc();
		
	}
	
	/**
	 * Write console error.
	 *
	 * @param message the message
	 */
	private void writeConsoleError(String message) {
		GtmUtils.writeConsoleError(message, editor);
	}



	
}