package Gtm.jsonImportExport;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.*;
import Gtm.converter.StationComparator;
import Gtm.preferences.PreferenceConstants;
import Gtm.preferences.PreferencesAccess;
import Gtm.presentation.GtmEditor;
import Gtm.utils.CodeListInitializer;
import Gtm.utils.GtmUtils;
import gtmV31.AfterSalesConditionDef;
import gtmV31.AfterSalesRuleDef;
import gtmV31.AllowedChange;
import gtmV31.BarCodeTypesDef;
import gtmV31.CalendarDef;
import gtmV31.CarrierConstraintDef;
import gtmV31.CarrierResourceLocationDef;
import gtmV31.ConnectionPointDef;
import gtmV31.ControlSecurityTypeDef;
import gtmV31.CrossBorderConditionDef;
import gtmV31.CurrencyPriceDef;
import gtmV31.FareCombinationConstraintDef;
import gtmV31.FareCombinationModelDef;
import gtmV31.FareConstraintBundle.FareTypeDef;
import gtmV31.FareDataDef;
import gtmV31.FareDef;
import gtmV31.FareDelivery;
import gtmV31.FareDeliveryDetailsDef;
import gtmV31.FareDeliveryDetailsDef.Usage;
import gtmV31.FareReferenceStationSetDef;
import gtmV31.FareResourceLocationDef;
import gtmV31.FulfillmentConstraintDef;
import gtmV31.GeoCoordinate;
import gtmV31.IncludedFreePassenger;
import gtmV31.LegacyAccountingIdentifierDef;
import gtmV31.LegacyReservationParameterDef;
import gtmV31.LineDef;
import gtmV31.LuggageConstraint;
import gtmV31.LuggageDimension;
import gtmV31.LuggageDimension.Dimension;
import gtmV31.OnlineResourceDef;
import gtmV31.PassengerCombinationConstraintDef;
import gtmV31.PassengerConstraintDef;
import gtmV31.PersonalDataConstraintDef;
import gtmV31.PolygonDef;
import gtmV31.PriceDef;
import gtmV31.ReductionCardDef;
import gtmV31.ReductionCardReferenceDef;
import gtmV31.ReductionConstraintDef;
import gtmV31.RegionalConstraintDef;
import gtmV31.RegionalValidityDef;
import gtmV31.RelativeTimeDef;
import gtmV31.RequiredDatum;
import gtmV31.RequiredSi;
import gtmV31.ReservationOptionGroupDef;
import gtmV31.ReservationParameterDef;
import gtmV31.ReturnConstraint;
import gtmV31.SalesAvailabilityConstraintDef;
import gtmV31.ServiceClassDefinitionDef;
import gtmV31.ServiceClassDefinitionDef.ComfortClassDef;
import gtmV31.ServiceClassDefinitionDef.ServiceClassIdDef;
import gtmV31.ServiceClassDefinitionDef.TravelClassDef;
import gtmV31.ServiceConstraintDef;
import gtmV31.ServiceLevelDef;
import gtmV31.StationDef;
import gtmV31.StationNamesDef;
import gtmV31.StationResourceLocationDef;
import gtmV31.TextDef;
import gtmV31.TrainResourceLocationDef;
import gtmV31.TrainValidity.Scope;
import gtmV31.Transfer;
import gtmV31.TranslationDef;
import gtmV31.TravelValidityConstraintDef;
import gtmV31.TripAllocationConstraintDef;
import gtmV31.TripInterruptionConstraintDef;
import gtmV31.ValidityRange.TimeUnitDef;
import gtmV31.ViaStationsDef;
import gtmV31.ZoneDef;
import gtmV31.ZoneDefinitionDef;

public class GTMJsonImporterGeneric {
	
	private HashMap<Long,Station> stations = null;	
	private HashMap<String,Carrier> carriers = null;
	private HashMap<String,Language> languages = null;
	private HashMap<Integer,Country> countries = null;
	private HashMap<String,Country> countriesISO = null;	
	private HashMap<String,Currency> currencies = null;	
	private HashMap<Integer,ServiceBrand> serviceBrands = null;
	private HashMap<String,NutsCode> nutsCodes = null;
	private HashMap<String,RegionalConstraint> regionalConstraints = null;
	private HashMap<String,FareStationSetDefinition> fareStationSets = null;
	private HashMap<String,Price>prices = null;
	private GtmEditor editor = null;
	
	
	private EditingDomain domain = null;
	
	/*
	 *   y   = year   (yy or yyyy)
	 *	M   = month  (MM)
	 *	d   = day in month (dd)
	 *	h   = hour (0-12)  (hh)
	 *	H   = hour (0-23)  (HH)
	 *	m   = minute in hour (mm)
	 *	s   = seconds (ss)
	 *	S   = milliseconds (SSS)
	 *	z   = time zone  text        (e.g. Pacific Standard Time...)
	 *	Z   = time zone, time offset (e.g. -0800)
	 */
	final DateFormat fmtZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"); //$NON-NLS-1$
	final DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"); //$NON-NLS-1$
	final DateFormat pmdf = new SimpleDateFormat("yyyy-MM-dd hh:mm a z"); //$NON-NLS-1$
	GTMTool tool = null;
	
	FareStructure fareStructure = null;

	
	public GTMJsonImporterGeneric(GTMTool tool, EditingDomain domain, GtmEditor editor) {
		this.tool = tool;
		this.editor = editor;
		stations = new HashMap<Long,Station>();
		carriers = new HashMap<String,Carrier>();
		languages = new HashMap<String,Language>();
		countriesISO = new HashMap<String,Country>();
		countries = new HashMap<Integer,Country>();
		currencies = new HashMap<String,Currency>();	
		serviceBrands = new HashMap<Integer,ServiceBrand>();
		nutsCodes = new HashMap<String,NutsCode>();	
		regionalConstraints = new HashMap<String,RegionalConstraint>();
		fareStationSets = new HashMap <String,FareStationSetDefinition>();
		prices = new HashMap<String,Price>();
		this.domain = domain;
		
		stations = GtmUtils.getStationMap(tool);
		for (Carrier carrier : tool.getCodeLists().getCarriers().getCarriers()) {
			carriers.put(carrier.getCode() , carrier);
		}
		for (Language language : tool.getCodeLists().getLanguages().getLanguages()) {
			languages.put(language.getCode() ,language);
		}		
		for (Country country : tool.getCodeLists().getCountries().getCountries()) {
			countries.put(Integer.valueOf(country.getCode()),country);
			countriesISO.put(country.getISOcode(), country);
		}
		if (tool.getCodeLists().getCurrencies() != null) {
			for (Currency currency : tool.getCodeLists().getCurrencies().getCurrencies()) {
				currencies.put(currency.getIsoCode(),currency);
			}
		}
		if (tool.getCodeLists().getServiceBrands() != null) {
			for (ServiceBrand s : tool.getCodeLists().getServiceBrands().getServiceBrands()) {
				serviceBrands.put(Integer.valueOf(s.getCode()),s);
			}
		}
		if (tool.getCodeLists().getNutsCodes() != null) {
			for (NutsCode s : tool.getCodeLists().getNutsCodes().getNutsCodes()) {
				nutsCodes.put(s.getCode(),s);
			}
		}
	}
	

	public GeneralTariffModel  convertFromJson(FareDelivery fareDelivery) {
		
		GeneralTariffModel gtm = GtmFactory.eINSTANCE.createGeneralTariffModel();
		
		gtm.setDelivery(convert(fareDelivery.getFareStructureDelivery().getDelivery()));
		
		gtm.setFareStructure(convert(fareDelivery.getFareStructureDelivery().getFareStructure()));		
		
		return gtm;
	}
	

	private FareStructure convert(FareDataDef fareDataDef) {
		
		fareStructure = GtmFactory.eINSTANCE.createFareStructure();
		
		fareStructure.setCalendars(convertCalendarList(fareDataDef.getCalendars()));
		
		fareStructure.setTexts(convertTextList(fareDataDef.getTexts()));
		
		fareStructure.setPrices(convertPrices(fareDataDef.getPrices()));
		
		if (fareDataDef.getStationNames() != null && fareDataDef.getStationNames().size() > 0) {
			fareStructure.setStationNames(convertStationNames(fareDataDef.getStationNames()));
		}

		fareStructure.setFareStationSetDefinitions(convertFareStationSetDefinitions(fareDataDef.getFareReferenceStationSetDefinitions()));

		fareStructure.setServiceClassDefinitions(convertServiceClassDefinitions(fareDataDef.getServiceClassDefinitions()));
		
		fareStructure.setZoneDefinitions(convertZoneDefinitions(fareDataDef.getZoneDefinitions()));
		
		fareStructure.setAfterSalesRules(convertAfterSalesRulesList(fareDataDef.getAfterSalesConditions()));
		
		if (fareDataDef.getCarrierConstraints() != null && !fareDataDef.getCarrierConstraints().isEmpty()) {
			fareStructure.setCarrierConstraints(convertCarrierConstraintList(fareDataDef.getCarrierConstraints()));
		}
	
		fareStructure.setCombinationConstraints(convertCombinationConstraintList(fareDataDef.getCombinationConstraints()));
		
		fareStructure.setConnectionPoints(convertConnectionPointList(fareDataDef.getConnectionPoints()));
		
		fareStructure.setFareResourceLocations(convertFareResourceList(fareDataDef.getFareResourceLocation()));
		
		fareStructure.setFulfillmentConstraints(convertFulfillmentList(fareDataDef.getFulfillmentConstraints()));
		
		fareStructure.setReductionCards(convertReductionCards(fareDataDef.getReductionCards()));
		
		CodeListInitializer.createGenericReductionCards(fareStructure,tool);
		
		fareStructure.setPassengerConstraints(convertPassengerConstraints(fareDataDef.getPassengerConstraints()));
		populatePassengerConstraints(fareDataDef.getPassengerConstraints());

		
		
		fareStructure.setPersonalDataConstraints(convertPersonalDataConstraints(fareDataDef.getPersonalDataConstraints()));
				
		fareStructure.setReductionConstraints(convertReductionConstraints(fareDataDef.getReductionConstraints()));
			
		fareStructure.setReservationParameters(convertReservationParameters(fareDataDef.getReservationParameters()));
		
		fareStructure.setSalesAvailabilityConstraints(convertSalesAvailabilities(fareDataDef.getSalesAvailabilityConstraint()));
			
		fareStructure.setServiceConstraints(convertServiceConstraints(fareDataDef.getServiceConstraints()));
		
		fareStructure.setServiceLevelDefinitions(convertServiceLevelDefinitions(fareDataDef.getServiceLevelDefinitions()));
		
		fareStructure.setSupportedOnlineServices(convertSupportedOnlineServices(fareDataDef.getSupportedOnlineServices()));
		
		fareStructure.setTravelValidityConstraints(convertTravelValidityConstraints(fareDataDef.getTravelValidityConstraints()));

		fareStructure.setRegionalConstraints(convertRegionalConstraints(fareDataDef.getRegionalConstraints()));
		
		fareStructure.setTotalPassengerCombinationConstraints(convertTotalPassengerConstraints(fareDataDef.getPassengerCombinationConstraints()));
		
		fareStructure.setFareConstraintBundles(convertFareConstraintBundles(fareDataDef.getFareConstraintBundles()));

		fareStructure.setLuggageConstraints(convertLuggageConstraints(fareDataDef.getLuggageConstraints()));
		
		fareStructure.setFareElements(convertFareElementList(fareDataDef.getFares()));			
		
		prices.clear();
		regionalConstraints.clear();
		
		return fareStructure;
	}
	

	private LuggageConstraints convertLuggageConstraints(List<LuggageConstraint> luggageConstraints) {
		if (luggageConstraints == null || luggageConstraints.isEmpty()) {
			return null;
		}
		
		LuggageConstraints gtmLuggageConstraints = GtmFactory.eINSTANCE.createLuggageConstraints();
		
		for (LuggageConstraint l : luggageConstraints) {
			gtmLuggageConstraints.getConstraints().add(convert(l));
		}
		return gtmLuggageConstraints;
	}


	private Gtm.LuggageConstraint convert(LuggageConstraint l) {
		
		Gtm.LuggageConstraint gtmO = GtmFactory.eINSTANCE.createLuggageConstraint();
		
		gtmO.setId(l.getId());
		
		if (l.getLuggageRules() != null && !l.getLuggageRules().isEmpty()) {
			for (String s : l.getLuggageRules()) {
				LuggageRule r = convertLuggageRule(s);
				if (r != null) {
					gtmO.getRules().add(r);
				}
			}
		}
		
		if (l.getRestrictedLuggageItems() != null && !l.getRestrictedLuggageItems().isEmpty()) {
			for (gtmV31.LuggageRestriction ri : l.getRestrictedLuggageItems()) {
				
				LuggageItemsRestriction lir = GtmFactory.eINSTANCE.createLuggageItemsRestriction();
				
				
				if (ri.getRestrictions() != null && !ri.getRestrictions().isEmpty()) {
					
					for (LuggageDimension ld : ri.getRestrictions()) {
						Gtm.LuggageDimension gtmLd = GtmFactory.eINSTANCE.createLuggageDimension();
						gtmLd.setDimension(convertDimension(ld.getDimension()));
						gtmLd.setValue(ld.getValue());
						lir.getDimension().add(gtmLd);
					}
				}
				
				gtmO.getRestrictedItems().add(lir);
			}
			
		}

		
		return gtmO;
	}


	private Gtm.Dimension convertDimension(Dimension dimension) {
		
		if (dimension.equals(Dimension.WEIGHT)) {
			return Gtm.Dimension.WEIGHT;
		} else if (dimension.equals(Dimension.HEIGHT)) {
			return Gtm.Dimension.HEIGHT;
		} if (dimension.equals(Dimension.LENGTH)) {
			return Gtm.Dimension.LENGTH;
		} if (dimension.equals(Dimension.WIDTH)) {
			return Gtm.Dimension.WIDTH;
		} if (dimension.equals(Dimension.VOLUME)) {
			return Gtm.Dimension.VOLUME;
		} if (dimension.equals(Dimension.WIDTH_HEIGHT)) {
			return Gtm.Dimension.WIDTH_HEIGHT;
		} if (dimension.equals(Dimension.WIDTH_HEIGHT_LENGTH)) {
			return Gtm.Dimension.WIDTH_LENGTH_HEIGHT;
		} 
		
		return null;
	}


	private LuggageRule convertLuggageRule(String s) {
		
		if (s == null || s.length() == 0) return null;
		
		if ("Can_CARRY".equals(s)) {
			return LuggageRule.CAN_CARRY;
		}
		return null;
	}


	private FareConstraintBundles convertFareConstraintBundles(List<gtmV31.FareConstraintBundle> fareConstraintBundles) {
		
		FareConstraintBundles bs = GtmFactory.eINSTANCE.createFareConstraintBundles();
		if (fareConstraintBundles == null) return bs;
		for (gtmV31.FareConstraintBundle bJ : fareConstraintBundles) {
			FareConstraintBundle b = convert(bJ);	
			if (b != null) {					
				bs.getFareConstraintBundles().add(b);
			}
		}
		return bs;
	}


	private TotalPassengerCombinationConstraints convertTotalPassengerConstraints(List<PassengerCombinationConstraintDef> list) {
        
		TotalPassengerCombinationConstraints tpcs = GtmFactory.eINSTANCE.createTotalPassengerCombinationConstraints();
		if (list == null) return tpcs;
		for (PassengerCombinationConstraintDef pcJ : list) {
			TotalPassengerCombinationConstraint pc = convert(pcJ);
			if (pc != null) {
				tpcs.getTotalPassengerCombinationConstraint().add(pc);
			}
		}
		return tpcs;
	}


	private StationNames convertStationNames(List<StationNamesDef> jl) {
		
		StationNames stationNames = GtmFactory.eINSTANCE.createStationNames();
			
		HashSet<Station> stationSet = new HashSet<Station>();
		
		if (jl == null || jl.isEmpty()) return stationNames;
				
		//link the stations, names will be added later-on to the merits code table
		for (StationNamesDef jn : jl) {
						
			Station s = null;
			if (jn.getCode() != null && jn.getCode().length() > 0) {
				s = getStation(jn.getCode());
			} else if (jn.getCountry() != null && jn.getLocalCode() != null ) {
				//support old OSDM versions
				s = stations.get(Long.valueOf(jn.getCountry() * 100000 + jn.getLocalCode()));
			}
			if (s != null) {
				
				stationSet.add(s);

			}
						
		}
		
		ArrayList<Station> stations = 	new ArrayList<Station>();
		stations.addAll(stationSet);
		stations.sort(new StationComparator());
		stationNames.getStationName().addAll(stations);
		
		return stationNames;
	}
	
	private ZoneDefinitions convertZoneDefinitions(List<ZoneDefinitionDef> jl) {

		ZoneDefinitions zs = GtmFactory.eINSTANCE.createZoneDefinitions();
		if (jl == null || jl.isEmpty()) return zs;
		for (ZoneDefinitionDef jz : jl ) {
			ZoneDefinition z = convert(jz);
			if (z != null) {
				zs.getZoneDefinition().add(z);		
			}
		}
		return zs;
	}


	private ZoneDefinition convert(ZoneDefinitionDef jz) {
		ZoneDefinition z = GtmFactory.eINSTANCE.createZoneDefinition();
		z.setZoneId(jz.getZoneId());
		z.setProvider(getCarrier(jz.getCarrier()));
		z.setName(jz.getName());
		z.setNameUtf8(jz.getNameUtf8());
		StationSet stationSet = GtmFactory.eINSTANCE.createStationSet();
		stationSet.getStations().addAll(convertStationList(jz.getStationList()));
		z.setStationSet(stationSet);
		z.setPolygone(convert(jz.getPolygon()));
		z.getNutsCodes().addAll(convertNutsCodes(jz.getNutsCodes()));
		return z;
	}


	private Collection<? extends NutsCode> convertNutsCodes(List<String> jl) {

		List<NutsCode> codes = new ArrayList<NutsCode>();
		if (jl == null || jl.isEmpty()) return codes;
		
		for (String jc : jl) {
			NutsCode c = getNutsCode(jc);
			if (c != null)
				codes.add(c);
		}

		return codes;
	}


	private FareStationSetDefinitions convertFareStationSetDefinitions(List<FareReferenceStationSetDef> list) {

		FareStationSetDefinitions o = GtmFactory.eINSTANCE.createFareStationSetDefinitions();
		if (list == null || list.isEmpty()) return o;
		
		for (FareReferenceStationSetDef jz : list) {
			FareStationSetDefinition fssd = convert(jz);
			if (fssd != null) {
				o.getFareStationSetDefinitions().add(fssd);
				fareStationSets.put(fssd.getCode(), fssd);
			}
		}
		
		ECollections.sort(o.getFareStationSetDefinitions(), new FareStationSetComparator());
		
		return o;
	}


	private FareStationSetDefinition convert(FareReferenceStationSetDef jz) {
		FareStationSetDefinition z = GtmFactory.eINSTANCE.createFareStationSetDefinition();
		
		z.setDataSource(DataSource.IMPORTED);
		z.setCode(jz.getCode());
		z.setName(jz.getName());
		z.setNameUtf8(jz.getNameUtf8()); 
		z.setLegacyCode(jz.getLegacyCode());
		z.setCarrier(getCarrier(jz.getFareProvider()));
		if (jz.getStations() != null && !jz.getStations().isEmpty()) {
			z.getStations().addAll(convertStationRefList(jz));
		}
		
		//fixing data errors
		
		if (z.getName() == null || z.getName().isEmpty()) {
			fixFareStationSetName(z);			
		}
		if (z.getNameUtf8() == null || z.getNameUtf8().isEmpty()) {
			fixFareStationSetNameUtf8(z);			
		}
		
		return z;
	}


	private void fixFareStationSetName(FareStationSetDefinition z) {
		if (z.getNameUtf8() != null && !z.getNameUtf8().isEmpty()) {
			z.setName(GtmUtils.utf2ascii(z.getNameUtf8()));
			return;
		}
		
		if (z.getStations() != null && z.getStations().size() == 1) {
			if (z.getStations().get(0).getName() != null && 
					!z.getStations().get(0).getName().isEmpty()) {
				z.setName(z.getStations().get(0).getName());
				GtmUtils.writeConsoleWarning("Name missing in fare station set " + z.getCode() + " replaced by " + z.getName(), editor);
				return;
			}
		}
		
		if (z.getStations() != null && z.getStations().size() > 0) {
			if (z.getStations().get(0).getName() != null && 
					!z.getStations().get(0).getName().isEmpty()) {
				z.setName(z.getStations().get(0).getName());
				GtmUtils.writeConsoleError("Name missing in fare station set " + z.getCode() + " replaced by first station " + z.getName(), editor);
				return;
			}
		}
		
		
		z.setName("xxx");
		GtmUtils.writeConsoleError("Name missing in fare station set " + z.getCode() + " replaced by " + z.getName(), editor);
			
	}

	private void fixFareStationSetNameUtf8(FareStationSetDefinition z) {
		if (z.getName() != null && !z.getName().isEmpty()) {
			z.setNameUtf8(z.getName());
			return;
		}
		
		if (z.getStations() != null && z.getStations().size() == 1) {
			if (z.getStations().get(0).getName() != null && 
					!z.getStations().get(0).getName().isEmpty()) {
				z.setNameUtf8(z.getStations().get(0).getName());
				GtmUtils.writeConsoleWarning("Name missing in fare station set " + z.getCode() + " replaced by " + z.getName(), editor);
				return;
			}
		}
		
		z.setNameUtf8("xxx");
		GtmUtils.writeConsoleError("Name UTF8 missing in fare station set " + z.getCode() + " replaced by " + z.getName(), editor);
			
	}
	
	private Collection<? extends Station> convertStationRefList(FareReferenceStationSetDef jz) {
		
		ArrayList<Station> sl = new ArrayList<Station>();
		if (jz == null) return sl;
		for (StationDef sd: jz.getStations()) {
			Station s = stations.get(Long.parseLong(sd.getCode()));	
			if (s != null) {
				sl.add(s);
			}
		}
		return sl;
	}


	private TravelValidityConstraints convertTravelValidityConstraints(List<TravelValidityConstraintDef> jo) {
		
		TravelValidityConstraints o = GtmFactory.eINSTANCE.createTravelValidityConstraints();
		if (jo == null) return o;
		for (TravelValidityConstraintDef jc : jo) {
			TravelValidityConstraint t = convert(jc);
			if (t != null) {
				o.getTravelValidityConstraints().add(t);
			}
		}
		return o;
	}


	private TravelValidityConstraint convert(TravelValidityConstraintDef jc) {
		TravelValidityConstraint o = GtmFactory.eINSTANCE.createTravelValidityConstraint();
		o.setId(jc.getId());
		o.setRange(convert(jc.getValidityRange()));
		o.setReturnConstraint(convert(jc.getReturnConstraint()));
		o.setTravelDays(jc.getNumberOfTravelDays());
		
		Calendar c = null;
		if (jc.getValidTravelDates() != null) {
			c = findCalendar(jc.getValidTravelDates().getId());
		}
		
		if (c == null) {
			 c = convert(jc.getValidTravelDates());
				if (c != null) {
				c.setName("travel validity: " + jc.getId());
					
				if (fareStructure.getCalendars() == null) {
					Calendars cs = GtmFactory.eINSTANCE.createCalendars();
					Command com = new SetCommand(domain, fareStructure,GtmPackage.Literals.FARE_STRUCTURE__CALENDARS , cs);
					if (com != null && com.canExecute()) {
						domain.getCommandStack().execute(com);
					}
				}
				Command com = new AddCommand(domain, fareStructure.getCalendars().getCalendars(), c);
				if (com != null && com.canExecute()) {
					domain.getCommandStack().execute(com);
				}
			}
		}
		if (c != null) {
			o.setValidDays(c);
		}
		
		if (jc.getValidityType() != null && jc.getValidityType().length() > 0) {
			o.setValidityType(TravelValidityType.get(jc.getValidityType()));
		}
		
		if (jc.getTrainValidity() != null) {
			o.setTrainValidity(convert(jc.getTrainValidity()));
		}
		
		if (jc.getTripInterruptionConstraint() != null) {
			o.setTripInterruptionConstraint(convert(jc.getTripInterruptionConstraint()));
		}
		
		if (jc.getTripAllocationConstraint() != null) {
			o.setTripAllocationConstraint(convert(jc.getTripAllocationConstraint()));
		}
		
		return o;
	}


	private TripAllocationConstraint convert(TripAllocationConstraintDef jo) {

		TripAllocationConstraint o = GtmFactory.eINSTANCE.createTripAllocationConstraint();
		
		o.setAllocationUnit(TripAllocationUnit.get(jo.getAllocationUnit()));
		o.setDurationUnit(jo.getDurationUnit());
		o.setMaxUnits(jo.getMaxUnits());
		if (jo.getRequiredProcesses() != null && !jo.getRequiredProcesses().isEmpty()) {
			for (String s : jo.getRequiredProcesses()) {
				o.getRequiredProcesses().add(TripAllocationProcess.get(s));
			}			
		}
		return o;
	}


	private TripInterruptionConstraint convert(TripInterruptionConstraintDef jo) {
		
		TripInterruptionConstraint o = GtmFactory.eINSTANCE.createTripInterruptionConstraint();
		
		o.setMaxDuration(jo.getMaxDuration());
		o.setMaxInterruptions(jo.getMaxInterruptions());
		o.setTotalMaxDuration(jo.getTotalMaxDuration());
		
		if (jo.getRequiredProcesses() != null && !jo.getRequiredProcesses().isEmpty()) {
			for (String s : jo.getRequiredProcesses()) {
				o.getRequiredProcesses().add(TripInterruptionProcess.get(s));
			}			
		}
		return o;
	}


	private TrainValidity convert(gtmV31.TrainValidity trainValidity) {
		
		if (trainValidity == null) return null;
		
		TrainValidity tv = GtmFactory.eINSTANCE.createTrainValidity();
		
		tv.setCarrierConstraint(findCarrierConstraint(trainValidity.getCarrierConstraintRef()));
		
		tv.setSerrviceConstraint(findServiceConstraint(trainValidity.getServiceConstraintRef()));
		
		tv.setScope(convertScope(trainValidity.getScope()));

		return tv;
	}


	private BoardingOrArrival convertScope(Scope scope) {
		
		if (scope == null) return null;
		
		if (scope.equals(Scope.ARRIVAL)) {
			return BoardingOrArrival.ARRIVAL;
		} else if (scope.equals(Scope.BOARDING)) {
			return BoardingOrArrival.BOARDING;
		}

		return null;
	}


	private ReturnValidityConstraint convert(ReturnConstraint jr) {
		if (jr == null) return  null;
		
		ReturnValidityConstraint o = GtmFactory.eINSTANCE.createReturnValidityConstraint();
		o.setEarliestReturn(jr.getEarliestReturn());
		o.setLatestReturn(jr.getLatestReturn());
		o.getExcludedWeekdays().addAll(convertWeekdays(jr.getExcludedWeekdays()));
		return o;
	}


	private Collection<? extends WeekDay> convertWeekdays(List<Integer> jl) {
		ArrayList<WeekDay> l = new ArrayList<WeekDay>();
		if (jl == null || jl.isEmpty()) return l;
		for (Integer i : jl) {
			WeekDay w = WeekDay.get(i.intValue());
			if (w != null) {
				l.add(w);
			}
		}
		return l;
	}


	private ValidityRange convert(gtmV31.ValidityRange jv) {
		if (jv == null) return null;
		ValidityRange v = GtmFactory.eINSTANCE.createValidityRange();
		if (jv.getHoursAfterMidnight() != null) {
			v.setHoursAfterMidnight(jv.getHoursAfterMidnight()); 
		}
		if (jv.getTimeUnit() != null) {
			v.setUnit(convertTimeUnit(jv.getTimeUnit()));
		}
		v.setValue(jv.getValue());   
		return v;
	}
	
	
	private static Gtm.TimeUnit convertTimeUnit(TimeUnitDef unit) {
		
		if (unit.equals(TimeUnitDef.HOURS)) {
			return  Gtm.TimeUnit.HOUR;
		} else if (unit.equals(TimeUnitDef.MINUTES)) {
			return  Gtm.TimeUnit.MINUTE;
		} else if (unit.equals(TimeUnitDef.DAYS)) {
			return  Gtm.TimeUnit.DAY;
		}
		
		return null;
		
	}
	
	private static Gtm.TimeUnit convertTimeUnit(RelativeTimeDef.TimeUnit unit) {
				
		if (unit.equals(RelativeTimeDef.TimeUnit.HOURS)) {
			return  Gtm.TimeUnit.HOUR;
		} else if (unit.equals(RelativeTimeDef.TimeUnit.MINUTES)) {
			return  Gtm.TimeUnit.MINUTE;
		} else if (unit.equals(RelativeTimeDef.TimeUnit.DAYS)) {
			return  Gtm.TimeUnit.DAY;
		}
		
		return null;
		
	}
	

	private SupportedOnlineServices convertSupportedOnlineServices(List<String> jl) {

		SupportedOnlineServices l = GtmFactory.eINSTANCE.createSupportedOnlineServices();
		if (jl == null || jl.isEmpty()) return l;
		
		for ( String jo : jl) {
			OnlineServiceType o = OnlineServiceType.getByName(jo);
			if (o != null) {
				l.getSupportedOnlineServices().add(o);
			}
		}
		return l;
	}


	private ServiceLevelDefinitions convertServiceLevelDefinitions(List<ServiceLevelDef> list) {

		ServiceLevelDefinitions o = GtmFactory.eINSTANCE.createServiceLevelDefinitions();
		if (list == null || list.isEmpty()) return o;
		
		for (ServiceLevelDef js : list) {
			ServiceLevel s = convert(js);
			if (s != null) {
				o.getServiceLevelDefinition().add(s);
			}
		}
		return o;
	}


	private ServiceLevel convert(ServiceLevelDef js) {
		ServiceLevel s = GtmFactory.eINSTANCE.createServiceLevel();
		s.setId(js.getId());
		s.setText(findText(js.getTextRef()));
		s.setIncludesClassName(!js.getDoesNotIncludeClassName());
		s.setReservationParameter(findReservationParams(js.getReservationParameterId()));
		return s;
	}


	private ServiceConstraints convertServiceConstraints(List<ServiceConstraintDef> jl) {
		ServiceConstraints o = GtmFactory.eINSTANCE.createServiceConstraints();
		if (jl == null) return o;
		for (ServiceConstraintDef sc : jl) {
			ServiceConstraint s = convert(sc);
			if (s != null) {
				o.getServiceConstraints().add(s);
			}
		}
		return o;
	}


	private ServiceConstraint convert(ServiceConstraintDef sc) {
		ServiceConstraint o = GtmFactory.eINSTANCE.createServiceConstraint();
		o.setId(sc.getId());
		if (sc.getLegacyCode() != null) {
			o.setLegacy108Code(sc.getLegacyCode());
		} else {
			o.setLegacy108Code(0);
		}
		if (sc.getExcludedServiceBrands()!= null && !sc.getExcludedServiceBrands().isEmpty()) {
			Collection<? extends ServiceBrand> sl = convertServiceBrandList(sc.getExcludedServiceBrands());
			if (sl != null && !sl.isEmpty()) {
				o.getExcludedServiceBrands().addAll(sl);
			}
		}
		if (sc.getIncludedServiceBrands()!=null && !sc.getIncludedServiceBrands().isEmpty()) {
			Collection<? extends ServiceBrand> sl = convertServiceBrandList(sc.getIncludedServiceBrands());
			if (sl != null && !sl.isEmpty()) {           
				o.getIncludedServiceBrands().addAll(sl);
			}
		}
		if (sc.getTextRef() != null && sc.getTextRef().length() > 0) {
			o.setDescription(findText(sc.getTextRef()));
		}
		
		return o;
	}


	private ServiceClassDefinitions convertServiceClassDefinitions(List<ServiceClassDefinitionDef> jl) {
		ServiceClassDefinitions o = GtmFactory.eINSTANCE.createServiceClassDefinitions();
		if (jl == null || jl.isEmpty()) return o;
		for (ServiceClassDefinitionDef js : jl) {
			ServiceClass s = convert(js);
			if (s != null) {
				o.getServiceClassDefinitions().add(s);
			}
		}
		return o;
	}

	
	private ClassId convertServiceClassId(ServiceClassIdDef id){
		
		if  (id == null) return null;
		
		if (id.equals(ServiceClassIdDef.BEST)) {
			return ClassId.A;
		} else if (id.equals(ServiceClassIdDef.HIGH)) {
			return ClassId.B;
		} else if (id.equals(ServiceClassIdDef.STANDARD)) {
			return ClassId.C;
		} else if (id.equals(ServiceClassIdDef.BASIC)) {
			return ClassId.D;
		} else {
			return ClassId.ANY_CLASS;
		}
				
	}

	private ServiceClass convert(ServiceClassDefinitionDef js) {
		
		ServiceClass s = GtmFactory.eINSTANCE.createServiceClass();
		
		s.setId(convertServiceClassId(js.getId()));
		
		s.setText(findText(js.getTextRef()));
		
		if (js.getTravelClass() != null) {
			s.setClassicClass(convertTravelClass(js.getTravelClass()));
		} else {
		   s.setClassicClass(convertClassicClass(js.getComfortClass()));
		}
		return s;
	}

	private ClassicClassType convertTravelClass(TravelClassDef comfortClass) {
		
		if (comfortClass == TravelClassDef.FIRST) {
			return ClassicClassType.FIRST;
		} else if (comfortClass == TravelClassDef.SECOND) {
			return ClassicClassType.SECOND;
		}else {
			return ClassicClassType.ANY_CLASS;
		}

	}


	private ClassicClassType convertClassicClass(ComfortClassDef comfortClass) {
		
		if (comfortClass == ComfortClassDef.FIRST) {
			return ClassicClassType.FIRST;
		} else if (comfortClass == ComfortClassDef.SECOND) {
			return ClassicClassType.SECOND;
		}else {
			return ClassicClassType.ANY_CLASS;
		}

	}


	private SalesAvailabilityConstraints convertSalesAvailabilities(List<SalesAvailabilityConstraintDef> jl) {

		SalesAvailabilityConstraints o = GtmFactory.eINSTANCE.createSalesAvailabilityConstraints();
		if (jl == null || jl.isEmpty()) return o;
		for (SalesAvailabilityConstraintDef js : jl) {
			SalesAvailabilityConstraint s = convert(js);
			if (s != null) {
				o.getSalesAvailabilityConstraints().add(s);
			}
		}
		return o;
	}


	private SalesAvailabilityConstraint convert(SalesAvailabilityConstraintDef js) {
		SalesAvailabilityConstraint o = GtmFactory.eINSTANCE.createSalesAvailabilityConstraint();
		o.setId(js.getId());
		o.setDataSource(DataSource.IMPORTED);
		Collection<? extends SalesRestriction> s = convertSalesRestrictions(js.getSalesRestrictions());
		if (s != null && !s.isEmpty()) {
			o.getRestrictions().addAll(s);
		}
		return o;
	}


	private Collection<? extends SalesRestriction> convertSalesRestrictions(List<gtmV31.SalesRestriction> jl) {

		ArrayList<SalesRestriction> l = new ArrayList<SalesRestriction>();
		if (jl == null || jl.isEmpty()) return l;
		
		for (gtmV31.SalesRestriction jr : jl) {
			SalesRestriction r = GtmFactory.eINSTANCE.createSalesRestriction();
			r.setEndOfSale(convertEndDate(jr.getEndOfSale()));
			r.setStartOfSale(convertStartDate(jr.getStartOfSale()));
			r.setSalesDates(findCalendar(jr.getSalesDatesRef()));
			l.add(r);
		}

		return l;
	}
	
	
	
	private Calendar findCalendar(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getCalendars() != null && fareStructure.getCalendars().getCalendars() != null) {
			for (Calendar cal : fareStructure.getCalendars().getCalendars()) {
				if (cal.getId().equals(id)) return cal;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Calendar Constraint Bundle not found: " + id, editor);
		
		return null;
	}


	private StartOfSale convertStartDate(RelativeTimeDef jo) {
		if (jo == null) return null;
		StartOfSale o = GtmFactory.eINSTANCE.createStartOfSale();
		if (jo.getTimeReference()!= null) {
			o.setReference(TimeReferenceType.getByName(jo.getTimeReference().name()));
		}
		if (jo.getTimeUnit() != null) {
			o.setUnit(convertTimeUnit(jo.getTimeUnit()));
		}
		o.setValue(jo.getTimeValue());
		return o;
	}


	private EndOfSale convertEndDate(RelativeTimeDef jo) {
		if (jo == null) return null;
		EndOfSale o = GtmFactory.eINSTANCE.createEndOfSale();
		if (jo.getTimeReference()!= null) {
			o.setReference(TimeReferenceType.getByName(jo.getTimeReference().name()));
		}
		if (jo.getTimeUnit() != null) {
			o.setUnit(convertTimeUnit(jo.getTimeUnit()));
		}
		o.setValue(jo.getTimeValue());
		return o;
	}


	private ReservationParameters convertReservationParameters(List<ReservationParameterDef> jl) {

		ReservationParameters o = GtmFactory.eINSTANCE.createReservationParameters();
		if (jl == null || jl.isEmpty()) return o;
		for (ReservationParameterDef jr : jl) {
			ReservationParameter r = convert(jr);
			if (r != null) {
				o.getReservationParameters().add(r);
			}
		}
		return o;
	}


	private ReservationParameter convert(ReservationParameterDef jr) {
		if (jr == null) return null;
		
		ReservationParameter o = GtmFactory.eINSTANCE.createReservationParameter();
		
		o.setId(jr.getId());
		o.setMandatoryReservation(jr.getReservationRequired());
		o.setOptions(convert(jr.getReservationOptions()));
		o.setParams9181(convert(jr.getReservationParams9181()));
		
		o.getMandatoryReservationForBrands().addAll(convertServiceBrandList(jr.getReservationRequiredForBrand()));
		o.getMandatoryReservationsForMode().addAll(convertToServiceModeList(jr.getReservationRequiredForMode()));

		return o;
	}


	private ArrayList<ServiceMode> convertToServiceModeList(List<String> jl) {
		ArrayList<ServiceMode> l = new ArrayList<ServiceMode>();
		if (jl == null || jl.isEmpty()) return l;
		for (String s : jl) {
			try {
				int value = Integer.parseInt(s);
				ServiceMode m = ServiceMode.get(value);
				if (m != null) {
					l.add(m);
				}
			} catch (Exception e) {
				//
			}
		}
		return l;
	}


	private ReservationParams9181 convert(LegacyReservationParameterDef jr) {
		if (jr == null) return null;
		ReservationParams9181 o = GtmFactory.eINSTANCE.createReservationParams9181();
		o.setBerthType(ReservationBerthType.getByName(jr.getBerthType()));
		if (jr.getCoachTypeCode() != null && !jr.getCoachTypeCode().isEmpty()) {
			try {
				o.setCoachType(Integer.parseInt(jr.getCoachTypeCode()));	
			} catch (Exception e) {
				GtmUtils.writeConsoleError("Wrong Legacy Code for Coach Type in Reservation Parameters for 918-1: " + jr.getCompartmentTypeCode() + " Code will be ignored", editor);
			}
		}
		
		if (jr.getCoachTypeCode() != null && !jr.getCompartmentTypeCode().isEmpty()) {
			try {
				o.setCompartmentType(Integer.parseInt(jr.getCompartmentTypeCode()));
			} catch (Exception e) {
				GtmUtils.writeConsoleError("Wrong Legacy Code for Compartment Type in Reservation Parameters for 918-1: " + jr.getCompartmentTypeCode() + " Code will be ignored", editor);
			}
		}
		
		o.setService(ReservationService.getByName(jr.getServiceCode()));
		o.setServiceLevel(ReservationServiceLevel.getByName(jr.getServiceLevelCode()));
		if (jr.getTariff() != null && !jr.getTariff().isEmpty()) {
			try {
				o.setTariff(Integer.parseInt(jr.getTariff()));
			} catch (Exception e) {
				GtmUtils.writeConsoleError("Wrong Legacy Code for Tariff in Reservation Parameters for 918-1: " + jr.getTariff() + " Code will be ignored", editor);
			}
		}
		o.setTravelClass(ReservationTravelClass.getByName(jr.getTravelClass()));
		return o;
	}


	private ReservationOptions convert(gtmV31.ReservationOptions jr) {
		if (jr == null) return null;
		ReservationOptions o = GtmFactory.eINSTANCE.createReservationOptions();
		o.setGraphicalReservation(GraphicalReservationType.getByName(jr.getGraphicalReservation()));
		o.getPreferences().addAll(convertPreferencesList(jr.getPreferences()));
		o.getServiceBrands().addAll(convertServiceBrandList(jr.getServiceBrands()));
		return o;
	}


	private Collection<? extends ReservationPreferenceGroup> convertPreferencesList(List<ReservationOptionGroupDef> jl) {
		ArrayList <ReservationPreferenceGroup> o = new ArrayList<ReservationPreferenceGroup>();
		if (jl == null || jl.isEmpty()) return o;
		for (ReservationOptionGroupDef jr : jl) {
			ReservationPreferenceGroup rg = GtmFactory.eINSTANCE.createReservationPreferenceGroup();
			rg.getPreference().addAll(convert(jr));
			rg.setGroup(jr.getPreferenceGroup());
		}
		return o;
	}

	
	private Collection<? extends String> convert(ReservationOptionGroupDef jr) {
		if (jr == null) return new ArrayList<String>();
		return jr.getPreferences();
	}


	private RegionalConstraints convertRegionalConstraints(List<RegionalConstraintDef> jl) {

		RegionalConstraints o = GtmFactory.eINSTANCE.createRegionalConstraints();
		if (jl == null || jl.isEmpty()) return o;
		for (RegionalConstraintDef jr : jl) {
			
			RegionalConstraint rc = convert(jr);
			if (rc != null) {
				o.getRegionalConstraints().add(rc);
				regionalConstraints.put(rc.getId(),rc);
			}
		}
		return o;
	}


	private RegionalConstraint convert(RegionalConstraintDef jr) {
		if (jr == null) return null;
		RegionalConstraint o = GtmFactory.eINSTANCE.createRegionalConstraint();
		o.setDataSource(DataSource.IMPORTED);
		o.setId(jr.getId());
		o.setDistance(jr.getDistance());
		o.setEntryConnectionPoint(findConnectionPoint(jr.getEntryConnectionPointId()));
		o.setExitConnectionPoint(findConnectionPoint(jr.getExitConnectionPointId()));
		o.getRegionalValidity().addAll(convertRegionalValidities(jr.getRegionalValidity()));
		return o;
	}


	private Collection<? extends RegionalValidity> convertRegionalValidities(List<RegionalValidityDef> jl) {
		ArrayList<RegionalValidity> l = new ArrayList<RegionalValidity>();
		if (jl == null || jl.isEmpty()) return l;
		
		for (RegionalValidityDef jr : jl) {
			RegionalValidity r = GtmFactory.eINSTANCE.createRegionalValidity();
			r.setLine(convert(jr.getLine()));
			r.setPolygone(convert(jr.getPolygon()));
			r.setViaStation(convert(jr.getViaStations()));
			r.setSeqNb(jr.getSeqNb());
			r.setZone(convert(jr.getZone()));
			r.setLine(convert(jr.getLine()));
			r.setServiceConstraint(findServiceConstraint(jr.getServiceConstraintRef()));
			r.setCarrierConstraint(findCarrierConstraint(jr.getCarrierConstraintRef()));
			
			l.add(r);
		}

		return l;
	}


	private Zone convert(ZoneDef jz) {
		if (jz == null) return null;
		Zone z = GtmFactory.eINSTANCE.createZone();
		
		z.setName(jz.getName());
		
		if (jz.getBinaryZoneId() != null){
			z.setBinaryZoneId(jz.getBinaryZoneId().getBytes());
		}
		z.setCarrier(getCarrier(jz.getCarrier()));
		z.setCity(jz.getCity());
		if (jz.getEntryStation()!= null) {
			z.setEntryStation(getStation(jz.getEntryStation()));
		}
		if (jz.getTerminalStation()!= null) {
			z.setTerminalStation(getStation(jz.getTerminalStation()));
		}		
		z.setNutsCode(getNutsCode(jz.getNutsCode()));
		
		for (Integer id : jz.getZoneIds()) {
			z.getZoneId().add(id.toString());
		}
		return z;
	}


	private ViaStation convert(ViaStationsDef jv) {
		if (jv == null) return null;
		ViaStation v = GtmFactory.eINSTANCE.createViaStation();
		if (jv.getCarrier() != null) {
			v.setCarrier(getCarrier(jv.getCarrier()));
		}
		if (jv.getStation() != null) {
			v.setStation(getStation(jv.getStation()));
		}
		
		if (jv.getFareReferenceStationSet() != null) {
			FareStationSetDefinition fssd = fareStationSets.get(jv.getFareReferenceStationSet().getCode());
			if (fssd != null) {
				v.setFareStationSet(fssd);
			} else {
				return null;
			}
		}
		
		if (jv.getRoute()!= null && !jv.getRoute().isEmpty()) {
			Route r = GtmFactory.eINSTANCE.createRoute();
			for (ViaStationsDef jv2 : jv.getRoute()) {
				ViaStation s = convert(jv2);
				if (s != null) {
					r.getStations().add(s);
				}
			}
			v.setRoute(r);
		}
		
		if (jv.getAlternativeRoute()!= null && !jv.getAlternativeRoute().isEmpty()) {
			
			for (ViaStationsDef jar : jv.getAlternativeRoute()) {
				AlternativeRoute ar = GtmFactory.eINSTANCE.createAlternativeRoute();
				ViaStation arv = convert(jar);
				if (arv != null) {
					ar.getStations().add(arv);
				}
				v.getAlternativeRoutes().add(ar);
			}
		}
		
		v.setServiceConstraint(findServiceConstraint(jv.getServiceConstraintRef()));
		
		v.setCarrierConstraint(findCarrierConstraint(jv.getCarrierConstraintRef()));
		
		v.setRealStop(jv.getStop());
		
		return v;
	}

	private Polygone convert(PolygonDef jp) {
		if (jp == null) return null;
		Polygone p = GtmFactory.eINSTANCE.createPolygone();
		Collection<? extends Edge> edgeList = convertEdgeList(jp.getEdge());
		if (edgeList != null && !edgeList.isEmpty()) {
			p.getEdge().addAll(convertEdgeList(jp.getEdge()));
		} else {
			return null;
		}
		return p;
	}

	private Collection<? extends Edge> convertEdgeList(List<GeoCoordinate> jl) {
		
		ArrayList<Edge> l = new ArrayList<Edge>();
		if (jl == null || jl.isEmpty()) return l;
		for (GeoCoordinate jg : jl) {
			Edge e = GtmFactory.eINSTANCE.createEdge();
            e.setLatitude(jg.getLatitude());
            e.setLongitude(jg.getLongitude());
            e.setAccuracy(jg.getAccuracy());
			
			l.add(e);
		}
		return l;
	}


	private Line convert(LineDef jz) {
		if (jz == null) return null;
		Line l = GtmFactory.eINSTANCE.createLine();
		
		l.setBinaryZoneId(jz.getBinaryLineId().getBytes());
		l.setCarrier(getCarrier(jz.getCarrier()));
		l.setCity(jz.getCity());
		if (jz.getEntryStation()!= null) {
			l.setEntryStation(getStation(jz.getEntryStation()));
		}
		if (jz.getTerminalStation()!= null) {
			l.setTerminalStation(getStation(jz.getTerminalStation()));
		}		
		l.setNutsCode(getNutsCode(jz.getNutsCode()));
		
		l.getLineId().addAll(jz.getLineId());
		
		return l;
	}


	private ReductionConstraints convertReductionConstraints(List<ReductionConstraintDef> jl) {
		ReductionConstraints o = GtmFactory.eINSTANCE.createReductionConstraints();
		if (jl == null) return o;
		for (ReductionConstraintDef jr : jl) {
			ReductionConstraint c = convert(jr);
			if (c != null) {
				o.getReductionConstraints().add(c);
			}
		}
		return o;
	}


	private ReductionConstraint convert(ReductionConstraintDef jr) {
		ReductionConstraint o = GtmFactory.eINSTANCE.createReductionConstraint();
		
		o.setId(jr.getId());
		Collection<? extends RequiredReductionCard> rcs = convertReductionCardList(jr.getRequiredCards());
		if (rcs != null && !rcs.isEmpty()) {
			o.getRequiredReductionCards().addAll(rcs);
		}
		return o;
	}


	private Collection<? extends RequiredReductionCard> convertReductionCardList(List<ReductionCardReferenceDef> jl) {
		ArrayList<RequiredReductionCard> o = new ArrayList<RequiredReductionCard>();
		if (jl == null || jl.isEmpty()) return o;
		
		for ( ReductionCardReferenceDef jr : jl) {
			RequiredReductionCard r = GtmFactory.eINSTANCE.createRequiredReductionCard();
			
			ReductionCard rc = findReductionCard(jr.getCardValue());
			if (rc == null) {
				GtmUtils.writeConsoleError("Reduction card missing: " + jr.getCardName(),null);
			}
			r.setCard(rc);
			r.setName(jr.getCardName());		
			o.add(r);
		}
		return o;
	}


	private ReductionCard findReductionCard(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getReductionCards() != null && fareStructure.getReductionCards().getReductionCards() != null) {
			for (ReductionCard card : fareStructure.getReductionCards().getReductionCards()) {
				if (card.getId().equals(id)) return card;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Reduction Card found: " + id, editor);
		
		return null;
	}


	private ReductionCards convertReductionCards(List<ReductionCardDef> jl) {
		
		ReductionCards l = GtmFactory.eINSTANCE.createReductionCards();
		if (jl == null || jl.isEmpty()) return l;
		for (ReductionCardDef jr : jl) {
			ReductionCard o = GtmFactory.eINSTANCE.createReductionCard();
			o.setId(jr.getId());
			o.setIdRequiredForBooking(jr.getCardIdRequired());
			o.setCardIssuer(getCarrier(jr.getIssuer()));
			o.setName(findText(jr.getNameRef()));
			if (jr.getServiceClasses() != null && !jr.getServiceClasses().isEmpty()) {
				for (ServiceClassIdDef serviceClassId : jr.getServiceClasses()) {
					ClassId scid = convertServiceClassId(serviceClassId);
					if (scid != null) {
						ServiceClass sc = findServiceClass(scid.getName());
						if (sc != null) {
							o.getServiceClasses().add(sc);
						}
					}
				}
			}
			l.getReductionCards().add(o);
		}
		return l;
	}


	private Prices convertPrices(List<PriceDef> jo) {
		Prices o = GtmFactory.eINSTANCE.createPrices();
		if (jo == null || jo.isEmpty()) return o;
		
		for (PriceDef jp : jo) {
			Price p = convert(jp);
			if (p != null) {
				o.getPrices().add(p);
				prices.put(p.getId(),p);
			}
		}
		return o;
	}


	private CurrencyPrice convert(CurrencyPriceDef jcp) {
		if (jcp == null) return null;
		CurrencyPrice o = GtmFactory.eINSTANCE.createCurrencyPrice(); 
		o.setAmount(jcp.getAmount().floatValue() / 100);
		o.setCurrency(getCurrency(jcp.getCurrency()));
		return o;
	}


	private PersonalDataConstraints convertPersonalDataConstraints(List<PersonalDataConstraintDef> jl) {

		PersonalDataConstraints o = GtmFactory.eINSTANCE.createPersonalDataConstraints();
		if (jl == null || jl.isEmpty()) return o;
		for (PersonalDataConstraintDef jp:jl) {
			o.getPersonalDataConstraints().add(convert(jp));
		}
		return o;
	}


	private PersonalDataConstraint convert(PersonalDataConstraintDef jp) {
		if (jp == null) return null;
		PersonalDataConstraint p = GtmFactory.eINSTANCE.createPersonalDataConstraint();
		p.setId(jp.getId());
		p.getRequiredPersonalData().addAll(convertRequiredPersonalDataList(jp.getRequiredData()));
		p.getAllowedChanges().addAll(convertAllowedChangesList(jp.getAllowedChanges()));
		return p;
	}

	private Collection<? extends AllowedPersonalDataChanges> convertAllowedChangesList(List<AllowedChange> jl) {

		ArrayList<AllowedPersonalDataChanges> l = new ArrayList<AllowedPersonalDataChanges>();
		if (jl == null || jl.isEmpty()) return l;
		for (AllowedChange ja : jl) {
			AllowedPersonalDataChanges o = GtmFactory.eINSTANCE.createAllowedPersonalDataChanges();
			o.setTimeLimit(ja.getTimeLimit()); 
			if (ja.getAcceptedReason()!= null) {
				o.setAcceptedReason(PersonalDataChangeReason.getByName(ja.getAcceptedReason().name()));
			}
		}
		return l;
	}


	private Collection<? extends RequiredPersonalData> convertRequiredPersonalDataList(	List<RequiredDatum> jr) {
		ArrayList<RequiredPersonalData> l = new ArrayList<RequiredPersonalData>();
		if (jr == null || jr.isEmpty()) return l;
		for (RequiredDatum jd : jr) {
			RequiredPersonalData o = GtmFactory.eINSTANCE.createRequiredPersonalData();
			o.setDataItem(PersonalDataItemsType.getByName(jd.getDataItem()));
			o.setTicketHolderOnly(jd.getTicketHolderOnly() );
			o.getCrossBorder().addAll(convertCrossBorderList(jd.getCrossBorder()));
			o.getFulfillmentType().addAll(convertFulfillmentTypes(jd.getFulfillmentType()));
			o.getTransfer().addAll(convertTransferTypes(jd.getTransfer()));
		
		}
		return l;
	}


	private Collection<? extends PersonalDataTransferType> convertTransferTypes(List<Transfer> list) {
		ArrayList<PersonalDataTransferType> l = new ArrayList<PersonalDataTransferType>(); 
		if (list == null || list.isEmpty()) return l;
		for (Transfer s : list){
			l.add(PersonalDataTransferType.getByName(s.name()));	
		}
		return null;
	}


	private Collection<? extends CrossBorderCondition> convertCrossBorderList(List<CrossBorderConditionDef> jl) {
		ArrayList<CrossBorderCondition> l = new ArrayList<CrossBorderCondition>(); 
		if (jl == null || jl.isEmpty()) return l;
		for (CrossBorderConditionDef s : jl){
			l.add(convert(s));	
		}
		return null;
	}


	private CrossBorderCondition convert(CrossBorderConditionDef js) {
		if (js == null) return null;
		CrossBorderCondition c = GtmFactory.eINSTANCE.createCrossBorderCondition();
		c.setFromCountry(getCountry(js.getFromCountry()));
		c.setToCountry(getCountry(js.getToCountry()));
		c.getAffectedServiceBrands().addAll(convertServiceBrandList(js.getAffectedServiceBrands()));
		return c;
	}


	private Collection<? extends ServiceBrand> convertServiceBrandList(List<Integer> jl) {
		ArrayList<ServiceBrand> l = new ArrayList<ServiceBrand>();
		if (jl == null || jl.isEmpty()) return l;
		for (Integer i : jl) {
			ServiceBrand sb = getServiceBrand(i);
			if (sb != null) {
				l.add(sb);
			}
		}
		return l;
	}


	private PassengerConstraints convertPassengerConstraints(List<PassengerConstraintDef> jl) {
		PassengerConstraints o = GtmFactory.eINSTANCE.createPassengerConstraints();
		if (jl == null || jl.isEmpty()) return o;
		
		//create empty passenger constraints
		for (PassengerConstraintDef jp : jl ) {
			PassengerConstraint p = GtmFactory.eINSTANCE.createPassengerConstraint();
			p.setId(jp.getId());
			if (p != null) {
				o.getPassengerConstraints().add(p);
			}
		}

		return o;
	}

	private void populatePassengerConstraints(List<PassengerConstraintDef> jl) {
		if (jl == null || jl.isEmpty()) return;			
		
		//populate passenger constraints
		for (PassengerConstraintDef jp : jl ) {
			convert(jp);
		}
	}
	
	
	
	private TotalPassengerCombinationConstraint convert(PassengerCombinationConstraintDef jp) {
		if (jp == null) return null;
		TotalPassengerCombinationConstraint p = GtmFactory.eINSTANCE.createTotalPassengerCombinationConstraint();
		if (jp.getMaxWeightedPassengers() == null) {
			p.setMaxTotalPassengerWeight(jp.getMaxWeightedPassengers());
		} else {
			p.setMaxTotalPassengerWeight(99.0F);
			StringBuffer sb = new StringBuffer();
			sb.append("Max Weighted Passengers is missing in Passenger Constraint: ");
			sb.append(jp.getId());
			sb.append(" assumed value 99.0 to continue");
			GtmUtils.writeConsoleError(sb.toString(), editor);
		}
		if (jp.getMinWeightedPassengers() == null) {
			p.setMinTotalPassengerWeight(jp.getMinWeightedPassengers());
		} else {
			p.setMaxTotalPassengerWeight(0.0F);
			StringBuffer sb = new StringBuffer();
			sb.append("Min Weighted Passengers is missing in Passenger Constraint: ");
			sb.append(jp.getId());
			sb.append(" assumed value 0.0 to continue");
			GtmUtils.writeConsoleError(sb.toString(), editor);
		}
		
	    p.setId(jp.getId());
		return p;
	}

	private PassengerConstraint convert(PassengerConstraintDef jp) {
		if (jp == null) return null;
		PassengerConstraint p = findPassengerConstraint(jp.getId());
		if (p != null) {
			p.getIncludedFreePassengers().addAll(convertIncludedFreePassengers(jp.getIncludedFreePassenger()));
			p.setIsAncilliary(jp.getIsAncillaryItem());
			p.setLowerAgeLimit(jp.getLowerAgeLimit());
			p.setUpperAgeLimit(jp.getUpperAgeLimit());
			p.getExcludedPassengerCombinations().addAll(convertPassengerCombinationList(jp.getCombinationConstraint()));
			if (jp.getPassengerWeight() != null) {			
				p.setPassengerWeight(jp.getPassengerWeight());
			} else {
				p.setPassengerWeight(1.0F);
				StringBuffer sb = new StringBuffer();
				sb.append("Passenger Weight is missing in Passenger Constraint: ");
				sb.append(jp.getId());
				sb.append(" assumed value 1.0 to continue");
				GtmUtils.writeConsoleError(sb.toString(), editor);
			}
			p.setReservationAgeLimit(jp.getAgeLimitForReservation());
			p.setText(findText(jp.getNameRef()));
			p.setTravelerType(TravelerType.getByName(jp.getPassengerType()));
		}
		return p;
	}


	private Collection<? extends PassengerCombinationConstraint> convertPassengerCombinationList(List<gtmV31.CombinationConstraint> jl) {
		ArrayList<PassengerCombinationConstraint> l = new ArrayList<PassengerCombinationConstraint>();
		if (jl == null || jl.isEmpty()) return l;
		for (gtmV31.CombinationConstraint jc : jl) {
			PassengerCombinationConstraint o = GtmFactory.eINSTANCE.createPassengerCombinationConstraint();
			o.setMaxNumber(jc.getMaxNumber());
			o.setPassengerConstraint(findPassengerConstraint(jc.getPassengerConstraintRef()));
			
			l.add(o);
		}

		return l;
	}


	private Collection<? extends IncludedFreePassengerLimit> convertIncludedFreePassengers(List<IncludedFreePassenger> jl) {

		ArrayList<IncludedFreePassengerLimit> l = new ArrayList<IncludedFreePassengerLimit>();
		if (jl == null || jl.isEmpty()) return l;
		for (IncludedFreePassenger jc : jl) {
			IncludedFreePassengerLimit o = GtmFactory.eINSTANCE.createIncludedFreePassengerLimit();
			o.setNumber(jc.getNumber());
			if (jc.getPassengerTypeRef() != null) {
				o.setPassengerType(convertPassengerType(jc.getPassengerTypeRef()));	
			}
			if (jc.getPassengerConstraintRef() != null) {
				o.setPassengerConstraint(findPassengerConstraint(jc.getPassengerConstraintRef()));
			}
			l.add(o);
		}

		return l;
	}


	private TravelerType convertPassengerType(String passengerTypeRef) {
		return TravelerType.get(passengerTypeRef);
	}


	private FulfillmentConstraints convertFulfillmentList(List<FulfillmentConstraintDef> jl) {
		FulfillmentConstraints o = GtmFactory.eINSTANCE.createFulfillmentConstraints();
		if (jl == null || jl.isEmpty()) return o;
		for (FulfillmentConstraintDef jf : jl) {
			o.getFulfillmentConstraints().add(convert(jf));
		}
		return o;
	}


	private FulfillmentConstraint convert(FulfillmentConstraintDef jf) {
		if (jf == null) return null;
		FulfillmentConstraint f = GtmFactory.eINSTANCE.createFulfillmentConstraint();
		f.setId(jf.getId());
		f.setIndividualTicketingPermitted(jf.getIndividualTicketingPermitted());
		f.setSeparateFulFillmentRequired(jf.getSeparateFulfillmentRequired());
		if (jf.getAcceptedBarCodes() != null && !jf.getAcceptedBarCodes().isEmpty()) {
			f.getAcceptedBarcodeTypes().addAll(convertBarCodeTypes(jf.getAcceptedBarCodes()));
		}
		if (jf.getRequiredBarCodes() != null && !jf.getRequiredBarCodes().isEmpty()) {
			f.getRequiredBarcodeTypes().addAll(convertBarCodeTypes(jf.getRequiredBarCodes()));
		}
		f.getAcceptedFulfilmentTypes().addAll(convertFulfillmentTypes(jf.getAcceptedControlSecurityTypes()));
		f.getRequiredControlDataExchange().addAll(convertControlDataExchange(jf.getRequiredSiS()));
		return f;
	}


	private Collection<? extends BarcodeTypes> convertBarCodeTypes(List<BarCodeTypesDef> list) {
		ArrayList<BarcodeTypes> l = new ArrayList<BarcodeTypes> ();
		if (list == null || list.isEmpty()) return l;
		for (BarCodeTypesDef s : list) {
			l.add(BarcodeTypes.getByName(s.name()));
		}
		return l;
	}


	private Collection<? extends ControlDataExchangeTypes> convertControlDataExchange(List<RequiredSi> list) {
		ArrayList<ControlDataExchangeTypes> l = new ArrayList<ControlDataExchangeTypes> ();
		if (list == null || list.isEmpty()) return l;
		for (RequiredSi s : list) {
			l.add(convert(s));
		}
		return l;
	}


	private ControlDataExchangeTypes convert(RequiredSi s) {
		if (s == RequiredSi.PEER_TO_PEER) {
			return ControlDataExchangeTypes.IRS90918_4PEER2PEER;
		}
		if (s == RequiredSi.REGISTRY) {
			return ControlDataExchangeTypes.IRS90918_4REGISTRY;
		}

		return null;
	}


	private Collection<? extends FulfillmentType> convertFulfillmentTypes(List<ControlSecurityTypeDef> list) {
		ArrayList<FulfillmentType> l = new ArrayList<FulfillmentType>();
		if (list == null || list.isEmpty()) return l;
		for (ControlSecurityTypeDef jf : list) {
			l.add(FulfillmentType.getByName(jf.name()));
		}
		return l;
	}


	private FareResourceLocations convertFareResourceList(FareResourceLocationDef j) {
		if (j == null) return null;
		FareResourceLocations o = GtmFactory.eINSTANCE.createFareResourceLocations();
		o.setCarrierResourceLocations(convertCarrierResourceLocations(j.getCarrierLocations()));
		o.setStationResourceLocations(convertStationResourceLocations(j.getStationLocations()));		
		o.setTrainResourceLocations(convertTrainResourceLocations(j.getTrainLocations()));
		return o;
	}


	private StationResourceLocations convertStationResourceLocations(List<StationResourceLocationDef> jl) {
		if (jl == null || jl.isEmpty()) return null;
		StationResourceLocations o = GtmFactory.eINSTANCE.createStationResourceLocations();
		for (StationResourceLocationDef js : jl) {
			StationResourceLocation r = convert(js);
			if (r != null) {
				o.getStationResourceLocations().add(r);
			}
		}
		return o;
	}


	private StationResourceLocation convert(StationResourceLocationDef js) {
		if (js == null) return null;
		StationResourceLocation r = GtmFactory.eINSTANCE.createStationResourceLocation();
		r.getConnectionPoints().addAll(getConnectionPointList(js.getConnectionPointIds()));
		r.getStations().addAll(convertStationList(js.getStations()));
		r.getOnlineResources().addAll(convertOnlineResources(js.getOnlineResource()));
		return r;
	}


	private Collection<? extends ConnectionPoint> getConnectionPointList(List<String> jl) {
		ArrayList<ConnectionPoint> l = new ArrayList<ConnectionPoint>();
		if (jl == null || jl.isEmpty()) return l;
		for (String s : jl) {
			l.add(findConnectionPoint(s));
		}
		return l;
	}


	private TrainResourceLocations convertTrainResourceLocations(List<TrainResourceLocationDef> jl) {
		TrainResourceLocations l = GtmFactory.eINSTANCE.createTrainResourceLocations();
		if (jl == null || jl.isEmpty()) return l;
		for (TrainResourceLocationDef jt : jl) {
			TrainResourceLocation t = convert(jt);
			if (t != null) {
				l.getTrainResourceLocations().add(t);
			}
		}
		return l;
	}


	private TrainResourceLocation convert(TrainResourceLocationDef jt) {
		if (jt == null) return null;
		TrainResourceLocation o = GtmFactory.eINSTANCE.createTrainResourceLocation();
		o.setCarrier(getCarrier(jt.getCarrier()));
		o.setTrainId(jt.getTrainId());
		o.getOnlineResources().addAll(convertOnlineResources(jt.getOnlineResource()));
		return o;
	}


	private Collection<? extends OnlineResource> convertOnlineResources(List<OnlineResourceDef> jl) {

		ArrayList<OnlineResource> l = new ArrayList<OnlineResource>();
		if (jl == null || jl.isEmpty()) return l;
		for (OnlineResourceDef jo: jl ) {
			OnlineResource o = convert(jo);
			if (o != null) {
				l.add(o);
			}
		}
		return l;
	}


	private OnlineResource convert(OnlineResourceDef jo) {
		if (jo == null) return null;
		OnlineResource o = GtmFactory.eINSTANCE.createOnlineResource();
		o.setInterfaceType(InterfaceType.getByName(jo.getInterfaceType()));
		o.setOfferRequestType(OfferRequestType.getByName(jo.getOfferType()));
		o.setSystem(jo.getSystem());
		o.setVersion(jo.getVersion());
		return o;
	}


	private ConnectionPoint findConnectionPoint(String id) {	
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getConnectionPoints() != null && fareStructure.getConnectionPoints().getConnectionPoints() != null) {
			for (ConnectionPoint c :  fareStructure.getConnectionPoints().getConnectionPoints() ) {
				if (c.getId().equals(id)) return c;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Connection Point not found: " + id, editor);

		return null;
	}


	private Collection<? extends Station> convertStationList(List<StationDef> jl) {

		ArrayList<Station> l = new ArrayList<Station>();
		if (jl == null || jl.isEmpty()) return l;
		for (StationDef s : jl) {
			try {
								
				Station station = getStation(s.getCode());
				if (station != null) {
					l.add(station);
				}
			} catch (Exception e) {
				// nothing
			}
		}
		return l;
	}

	public long getNumericStationCode(StationDef s) {
		
		if (s == null || s.getCode() == null || s.getCode().length() == 0) {
			return 0;
		}
		
		long i = 0;
		
		try {
		
			i = Integer.parseInt(s.getCode());
		
		} catch (Exception e) {
			
			//maybe its URN format
			String decoded = URI.decode(s.getCode());
			String[] parts = decoded.split(":");
			
			try {
				i =  Integer.parseInt(parts[parts.length - 1]);
			} catch (Exception e2) {
				return 0;
			}
			
		}
		
		return i;
		
	}
	



	private CarrierResourceLocations convertCarrierResourceLocations(List<CarrierResourceLocationDef> jl) {

		CarrierResourceLocations o = GtmFactory.eINSTANCE.createCarrierResourceLocations();
		if (jl == null || jl.isEmpty()) return o;
		for (CarrierResourceLocationDef jr : jl) {
			CarrierResourceLocation c = convert(jr);
			if (c != null) {
				o.getCarrierResourceLocations().add(c);
			}
		}
		return o;
	}


	private CarrierResourceLocation convert(CarrierResourceLocationDef jr) {
		if (jr == null) return null;
		CarrierResourceLocation o = GtmFactory.eINSTANCE.createCarrierResourceLocation();
		o.setCarrier(getCarrier(jr.getCarrier()));
		o.setServiceBrand(getServiceBrand(jr.getServiceBrandCode()));
	    o.getOnlineResources().addAll(convertOnlineResources(jr.getOnlineResource()));
		return o;
	}


	private FareElements convertFareElementList(List<FareDef> jl) {
		
		
		boolean importConvertablesOnly = PreferencesAccess.getBoolFromPreferenceStore(PreferenceConstants.P_IMPORT_CONVERABLE_ONLY);
		
		if (importConvertablesOnly) {
			GtmUtils.writeConsoleInfo("import convertable fares only",null);
		}

		FareElements o = GtmFactory.eINSTANCE.createFareElements();
		if (jl == null || jl.isEmpty()) return o;

		for (FareDef jf : jl) {
			
			FareElement fare = convert(jf);
			
			if (fare != null) {
				if (!importConvertablesOnly || fare.getLegacyConversion().equals(LegacyConversionType.YES) || fare.getLegacyConversion().equals(LegacyConversionType.ONLY)) {
					o.getFareElements().add(fare);
				}
			}
		}
		return o;
	}

	
	private FareConstraintBundle convert(gtmV31.FareConstraintBundle jf) {
		
		if (jf == null) return null;
		
		FareConstraintBundle f = GtmFactory.eINSTANCE.createFareConstraintBundle();
		
		f.setId(jf.getId());
		f.setCombinationConstraint(findCombinationConstraint(jf.getCombinationConstraintRef()));
		f.setFulfillmentConstraint(findFulfillmentConstraint(jf.getFulfillmentConstraintRef()));
		f.setPersonalDataConstraint(findPersonalDataConstraint(jf.getPersonalDataConstraintRef()));
		f.setSalesAvailability(findSalesAvailability(jf.getSalesAvailabilityConstraintRef()));
		f.setTravelValidity(findTravelValidity(jf.getTravelValidityConstraintRef()));
		
		f.setCarrierConstraint(findCarrierConstraint(jf.getDefaultCarrierConstraintRef()));
		f.setTotalPassengerConstraint(findTotalPassengerConstraint(jf.getPassengerCombinationConstraintRef()));
		f.setDefaultFareType(convert(jf.getDefaultFareType()));
		if (jf.getDefaultRegulatoryConditions() != null && !jf.getDefaultRegulatoryConditions().isEmpty()) {
			f.getDefaultRegulatoryConditions().addAll(convertRegularyConditions(jf.getDefaultRegulatoryConditions()));
		}
		if (jf.getDefaultLuggageConstraintRef() != null && jf.getDefaultLuggageConstraintRef().length() > 0) {
			f.setLuggageConstraint(findLuggageConstraint(jf.getDefaultLuggageConstraintRef()));
		}
		return f;
	}

	private Collection<? extends RegulatoryCondition> convertRegularyConditions(List<String> regulatoryConditions) {
		
		List<RegulatoryCondition> rcl = new ArrayList<RegulatoryCondition>();
		if (regulatoryConditions == null) return rcl;
		
		for (String rcJ : regulatoryConditions) {
			RegulatoryCondition r = RegulatoryCondition.getByName(rcJ);
			rcl.add(r);
		}

		return rcl;
	}





	private FareElement convert(FareDef jf) {
		if (jf == null) return null;
		FareElement f = GtmFactory.eINSTANCE.createFareElement();
		
		
		
		f.setType(convert(jf.getFareType()));
		
		f.setId(jf.getId());
		
		f.setFareConstraintBundle(findFareConstraintBundle(jf.getBundleRef()));
		
		f.setAfterSalesRule(findAfterSaleRule(jf.getAfterSalesRulesRef()));
		f.setCarrierConstraint(findCarrierConstraint(jf.getCarrierConstraintRef()));
		f.setDataSource(DataSource.IMPORTED);

		
		f.setLegacyAccountingIdentifier(convert(jf.getLegacyAccountingIdentifier()));
		f.setPassengerConstraint(findPassengerConstraint(jf.getPassengerConstraintRef()));

		f.setPrice(prices.get(jf.getPriceRef()));
		f.setReductionConstraint(findReductionConstraint(jf.getReductionConstraintRef()));
		
		RegionalConstraint rc = findRegionalConstraint(jf.getRegionalConstraintRef());
		if (rc != null) {
			f.setRegionalConstraint(findRegionalConstraint(jf.getRegionalConstraintRef()));
			rc.getLinkedFares().add(f);
		}
		
		f.setReservationParameter(findReservationParams(jf.getReservationParameterRef()));

		f.setServiceClass(findServiceClass(jf.getServiceClassRef()));
		f.setServiceConstraint(findServiceConstraint(jf.getServiceConstraintRef()));
		f.setServiceLevel(findServiceLevel(jf.getServiceLevelRef()));
		f.setText(findText(jf.getNameRef()));
		f.setFareDetailDescription(findText(jf.getFareDetailDescriptionRef()));
		f.setLegacyConversion(LegacyConversionType.getByName(jf.getLegacyConversion()));
		f.setIndividualContracts(jf.getIndividualContracts());
		
		if (jf.getRegulatoryConditions()!= null && !jf.getRegulatoryConditions().isEmpty()) {
			
			for (String rcj : jf.getRegulatoryConditions() ) {
				RegulatoryCondition r = RegulatoryCondition.getByName(rcj);
				if (r != null) {
					f.getRegulatoryConditions().add(r);
				}
			}
	    }
		
		if (jf.getInvolvedTCOs() != null && !jf.getInvolvedTCOs().isEmpty()) {
			f.getInvolvedTcos().addAll(convertCarrierList(jf.getInvolvedTCOs()));
		}
		
		if (jf.getLuggageConstraintRef() != null && jf.getLuggageConstraintRef().length() > 0) {
			f.setLuggageConstraint(findLuggageConstraint(jf.getLuggageConstraintRef()));
		}
		
		return f;
	}



	private Gtm.LuggageConstraint findLuggageConstraint(String id) {
		if (id == null || id.length() < 1) {
			return null;
		}
		
		if (fareStructure.getLuggageConstraints() != null && fareStructure.getLuggageConstraints().getConstraints() != null) {
			for (Gtm.LuggageConstraint  o : fareStructure.getLuggageConstraints().getConstraints()) {
				if (id.equals(o.getId())) return o;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Luggage Constraint not found: " + id, editor);		
		
		return null;
	}


	private FareType convert(FareTypeDef fareType) {
		
		if (fareType == FareTypeDef.ADMISSION) {
			return FareType.NRT;
		}
		if (fareType == FareTypeDef.RESERVATION) {
			return FareType.RES;
		}		
		if (fareType == FareTypeDef.INTEGRATED_RESERVATION) {
			return FareType.IRT;
		}		
		if (fareType == FareTypeDef.ANCILLARY) {
			return FareType.ANCILLARY;
		}		
		return FareType.NRT;
	}


	private Text findText(String id) {
		if (id == null || id.length() < 1) {
			return null;
		}
		
		if (fareStructure.getTexts() != null && fareStructure.getTexts().getTexts() != null) {
			for (Text  o : fareStructure.getTexts().getTexts()) {
				if (id.equals(o.getId())) return o;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Text not found: " + id, editor);		
		
		return null;
	}

	private TravelValidityConstraint findTravelValidity(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getTravelValidityConstraints() != null && fareStructure.getTravelValidityConstraints().getTravelValidityConstraints() != null) {
			for (TravelValidityConstraint  o : fareStructure.getTravelValidityConstraints().getTravelValidityConstraints()) {
				if (id.equals(o.getId())) return o;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Travel Validity not found: " + id, editor);
		
		return null;
	}
	

	private TotalPassengerCombinationConstraint findTotalPassengerConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getTotalPassengerCombinationConstraints() != null && fareStructure.getTotalPassengerCombinationConstraints().getTotalPassengerCombinationConstraint()!= null) {
			for (TotalPassengerCombinationConstraint  o : fareStructure.getTotalPassengerCombinationConstraints().getTotalPassengerCombinationConstraint()) {
				if (id.equals(o.getId())) return o;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Passenger Combination Constraint not found: " + id, editor);
		
		return null;
	}

	
	private FareConstraintBundle findFareConstraintBundle(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getFareConstraintBundles() != null && fareStructure.getFareConstraintBundles().getFareConstraintBundles() != null) {
			for (FareConstraintBundle  o : fareStructure.getFareConstraintBundles().getFareConstraintBundles()) {
				if (id.equals(o.getId())) return o;
			}		
		}
		
		GtmUtils.writeConsoleError("Referenced Fare Constraint Bundle not found: " + id, editor);
		
		return null;
	}


	private ServiceLevel findServiceLevel(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getServiceLevelDefinitions() != null && fareStructure.getServiceLevelDefinitions().getServiceLevelDefinition() != null) {
			for (ServiceLevel o : fareStructure.getServiceLevelDefinitions().getServiceLevelDefinition()) {
				if (id.equals(o.getId())) return o;
			}
		}

		GtmUtils.writeConsoleError("Referenced Service Level not found: " + id, editor);
		
		return null;
	}


	private ServiceConstraint findServiceConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getServiceConstraints() != null && fareStructure.getServiceConstraints().getServiceConstraints() != null) {
			for (ServiceConstraint o : fareStructure.getServiceConstraints().getServiceConstraints()) {
				if (id.equals(o.getId())) return o;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Service Constraint not found: " + id, editor);
		
		return null;
	}


	private ServiceClass findServiceClass(String id) {
		if (id == null || id.length() < 1) return null;
		
		//check for service class id
		if (fareStructure.getServiceClassDefinitions() != null && fareStructure.getServiceClassDefinitions().getServiceClassDefinitions() != null) {
			for (ServiceClass  o : fareStructure.getServiceClassDefinitions().getServiceClassDefinitions()) {
				if (id.equals(o.getId().getName())) {
					return o;
				}
			}
		}
		
		// failed, check for converted id
		ServiceClassIdDef scd = null;
		try {
			scd = ServiceClassIdDef.fromValue(id);
			ClassId scid = convertServiceClassId(scd);
			if (scid != null) {
				ServiceClass sc = findServiceClass(scid.getName());
				if (sc != null) {
					return sc;
				}
			}
		} catch (Exception e) {
			//handle later
		}
	
		GtmUtils.writeConsoleError("Referenced Service Class Definition not found: " + id, editor);
		
		return null;
	}


	private SalesAvailabilityConstraint findSalesAvailability(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getSalesAvailabilityConstraints() != null && fareStructure.getSalesAvailabilityConstraints().getSalesAvailabilityConstraints() != null) {
			for (SalesAvailabilityConstraint  o : fareStructure.getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
				if (id.equals(o.getId())) return o;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Sales Availability not found: " + id, editor);
		
		return null;
	}


	private ReservationParameter findReservationParams(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getReservationParameters() != null && fareStructure.getReservationParameters().getReservationParameters() != null) {
			for (ReservationParameter  o : fareStructure.getReservationParameters().getReservationParameters()) {
				if (id.equals(o.getId())) return o;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Reservation Parameter not found: " + id, editor);

		return null;
	}


	private RegionalConstraint findRegionalConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		RegionalConstraint r = regionalConstraints.get(id);
		
		if (r == null) {
			GtmUtils.writeConsoleError("Referenced ReservaRegional Validity not found: " + id, editor);
		}
		
		return r;
	}


	private ReductionConstraint findReductionConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getReductionConstraints() != null && fareStructure.getReductionConstraints().getReductionConstraints() != null) {
			for (ReductionConstraint  o : fareStructure.getReductionConstraints().getReductionConstraints()) {
				if (id.equals(o.getId())) return o;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Reduction Constraint not found: " + id, editor);
		
		return null;
	}

	private PersonalDataConstraint findPersonalDataConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getPersonalDataConstraints() != null && fareStructure.getPersonalDataConstraints().getPersonalDataConstraints() != null) {
			for (PersonalDataConstraint  o : fareStructure.getPersonalDataConstraints().getPersonalDataConstraints()) {
				if (id.equals(o.getId())) return o;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Personal Data Constraint not found: " + id, editor);
		
		return null;
	}


	private PassengerConstraint findPassengerConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getPassengerConstraints() != null && fareStructure.getPassengerConstraints().getPassengerConstraints() != null) {
			for (PassengerConstraint  o : fareStructure.getPassengerConstraints().getPassengerConstraints()) {
				if (id.equals(o.getId())) return o;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Passenger Constraint not found: " + id, editor);
		
		return null;
	}


	private LegacyAccountingIdentifier convert(LegacyAccountingIdentifierDef jo) {
		if (jo == null) return null;
		LegacyAccountingIdentifier o = GtmFactory.eINSTANCE.createLegacyAccountingIdentifier();
		o.setAddSeriesId(jo.getAddId());
		o.setSeriesId(jo.getSerialId());
		o.setTariffId(jo.getTariffId());
		return o;
	}


	private FulfillmentConstraint findFulfillmentConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getFulfillmentConstraints() != null && fareStructure.getFulfillmentConstraints().getFulfillmentConstraints() != null) {
			for (FulfillmentConstraint  o : fareStructure.getFulfillmentConstraints().getFulfillmentConstraints()) {
				if (id.equals(o.getId())) return o;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Fulfillment Constraint not found: " + id, editor);
		
		return null;
	}


	private CombinationConstraint findCombinationConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getCombinationConstraints() != null && fareStructure.getCombinationConstraints().getCombinationConstraints() != null) {
			for (CombinationConstraint  o : fareStructure.getCombinationConstraints().getCombinationConstraints()) {
				if (id.equals(o.getId())) return o;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Combination Constraint not found: " + id, editor);

		return null;
	}


	private CarrierConstraint findCarrierConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getCarrierConstraints() != null && fareStructure.getCarrierConstraints().getCarrierConstraints() != null) {
			for (CarrierConstraint  o : fareStructure.getCarrierConstraints().getCarrierConstraints()) {
				if (id.equals(o.getId())) return o;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced Carrier Constraint not found: " + id, editor);
		
		return null;
	}


	private AfterSalesRule findAfterSaleRule(String id) {
		if (id == null || id.length() < 1) return null;
		
		if (fareStructure.getAfterSalesRules() != null && fareStructure.getAfterSalesRules().getAfterSalesRules() != null) {
			for (AfterSalesRule  o : fareStructure.getAfterSalesRules().getAfterSalesRules()) {
				if (id.equals(o.getId())) return o;
			}
		}
		
		GtmUtils.writeConsoleError("Referenced After Sales Rule not found: " + id, editor);

		return null;
	}


	private ConnectionPoints convertConnectionPointList(List<ConnectionPointDef> jl) {
		ConnectionPoints o = GtmFactory.eINSTANCE.createConnectionPoints();
		for (ConnectionPointDef jc : jl) {
			ConnectionPoint c = convert(jc);
			if (c != null) {
				o.getConnectionPoints().add(c);
			}
		}
		return o;
	}


	private ConnectionPoint convert(ConnectionPointDef jc) {
		if (jc == null) return null;
		ConnectionPoint p = GtmFactory.eINSTANCE.createConnectionPoint();
		p.setDataSource(DataSource.IMPORTED);
		p.setId(jc.getId());
		p.setLegacyBorderPointCode(Integer.parseInt(jc.getLegacyBorderPointCode()));
		p.setName(jc.getName());
		p.setNameUtf8(jc.getName());
		if (jc.getStationSets() != null) {
			for (List<StationDef> js:  jc.getStationSets()) {
				StationSet ss = GtmFactory.eINSTANCE.createStationSet();
				ss.getStations().addAll(convertStationList(js));
				p.getConnectedStationSets().add(ss);
			}
		}
		return p;
	}


	private CombinationConstraints convertCombinationConstraintList(List<FareCombinationConstraintDef> jl) {

		CombinationConstraints o = GtmFactory.eINSTANCE.createCombinationConstraints();
		if (jl == null || jl.isEmpty()) return o;
		for (FareCombinationConstraintDef jf:jl) {
			CombinationConstraint f = convert(jf);
			if (f != null) {
				o.getCombinationConstraints().add(f);
			}
		}
		return o;
	}


	private CombinationConstraint convert(FareCombinationConstraintDef jf) {
		if (jf == null) return null;
		CombinationConstraint o = GtmFactory.eINSTANCE.createCombinationConstraint();
		o.setId(jf.getId());
		for  (FareCombinationModelDef jm: jf.getCombinationModels()) {
			FareCombinationModel m = convert(jm);
			if (m != null) {
				o.getCombinationModels().add(m);
			}
		}
		return o;
	}

	private FareCombinationModel convert(FareCombinationModelDef jm) {
		if (jm == null) return null;
		FareCombinationModel o = GtmFactory.eINSTANCE.createFareCombinationModel();
		o.setModel(CombinationModel.getByName(jm.getModel()));
		o.setOnlyWhenCombined(jm.getOnlyWhenCombined());
		o.setReferenceCluster(Clusters.getByName(jm.getReferenceCluster()));
		if (jm.getAllowedDistributors() != null && !jm.getAllowedDistributors().isEmpty()) {
		   o.getAllowedAllocators().addAll(convertCarrierList(jm.getAllowedDistributors()));	
		} else {
		   o.getAllowedAllocators().addAll(convertCarrierList(jm.getAllowedAllocators()));
		}
		o.getAllowedClusters().addAll(convertClusterList(jm.getAllowedClusters()));
		o.getCombinableCarriers().addAll(convertCarrierList(jm.getCombinableCarrier()));
		return o;
	}


	private Collection<? extends Clusters> convertClusterList(List<String> jl) {
		ArrayList<Clusters> l = new ArrayList<Clusters>();
		if (jl == null || jl.isEmpty()) return l;
		for (String s : jl) {
			l.add(Clusters.getByName(s));
		}
		return l;
	}


	private CarrierConstraints convertCarrierConstraintList(List<CarrierConstraintDef> jo) {

		CarrierConstraints o = GtmFactory.eINSTANCE.createCarrierConstraints();
		if (jo == null) return o;
		for (CarrierConstraintDef cc : jo) {
			CarrierConstraint c = convert(cc);
			if (c != null) {
				o.getCarrierConstraints().add(c);
			}
		}
		return o;
	}


	private CarrierConstraint convert(CarrierConstraintDef cc) {
		if (cc == null) return null;
		CarrierConstraint o = GtmFactory.eINSTANCE.createCarrierConstraint();
		o.setId(cc.getId());
		o.setDataSource(DataSource.IMPORTED);
		if (cc.getExcludedCarrier() != null && !cc.getExcludedCarrier().isEmpty()) {
			Collection<? extends Carrier> cl = convertCarrierList(cc.getExcludedCarrier());
			if (cl != null && !cl.isEmpty()) {
				o.getExcludedCarriers().addAll(cl);
			}
		}
		if (cc.getIncludedCarrier() != null && !cc.getIncludedCarrier().isEmpty()) {
			Collection<? extends Carrier> cl = convertCarrierList(cc.getIncludedCarrier());
			if (cl != null && !cl.isEmpty()) {
				o.getIncludedCarriers().addAll(cl);
			}
		}
		return o;
	}


	private Collection<? extends Carrier> convertCarrierList(List<String> jl) {
		ArrayList<Carrier> l = new ArrayList<Carrier>();
		if (jl == null || jl.isEmpty()) return l;
		for (String jc: jl) {
			Carrier c = getCarrier(jc);
			if (c != null) {
				l.add(c);
			}
		}
		return l;
	}


	private Calendars convertCalendarList(List<CalendarDef> jo) {
		Calendars o = GtmFactory.eINSTANCE.createCalendars();
		if (jo == null) return o;
		for (CalendarDef jc:  jo) {
			Calendar c = convert(jc);
			if (c !=null) {
				o.getCalendars().add(c);
			}
		}
		return o;
	}


	private Calendar convert(CalendarDef jc) {
		if (jc == null) return null;
		Calendar o = GtmFactory.eINSTANCE.createCalendar();
		o.setId(jc.getId());
		o.setDataSource(DataSource.IMPORTED);
		o.setFromDateTime(jc.getFromDate());
		o.setUntilDateTime(jc.getUntilDate());	
		if ( jc.getDates() != null && !jc.getDates().isEmpty()) {
			o.getDates().addAll(jc.getDates());
		}
		o.setUtcOffset(jc.getUtcOffset());
		return o;
	}



	private Texts convertTextList(List<TextDef> jl) {
		if (jl == null || jl.isEmpty()) return null;
		Texts o = GtmFactory.eINSTANCE.createTexts();
		for (TextDef jo : jl) {
			Text t = convert(jo);
			if (t != null) {
				o.getTexts().add(t);
			}
		}
		return o;
	}


	private Text convert(TextDef jo) {
		if (jo == null) return null;
		Text o = GtmFactory.eINSTANCE.createText();
		o.setId(jo.getId());
		o.setShortTextICAO(jo.getShortText());
		o.setShortTextUTF8(jo.getShortTextUtf8());
		o.setTextICAO(jo.getText());
		o.setTextUTF8(jo.getTextUtf8());
		
		for (TranslationDef jt :  jo.getTranslations()) {
			Translation t = GtmFactory.eINSTANCE.createTranslation();
			t.setLanguage(getLanguage(jt.getLanguage()));
			t.setShortTextICAO(jt.getShortText());
			t.setShortTextUTF8(jt.getShortTextUtf8());
			t.setTextICAO(jt.getText());
			t.setTextUTF8(jt.getTextUtf8());
			o.getTranslations().add(t);
		}

		return o;
	}


	private AfterSalesRules convertAfterSalesRulesList(List<AfterSalesConditionDef> jl) {

		AfterSalesRules o = GtmFactory.eINSTANCE.createAfterSalesRules();
		if (jl == null || jl.isEmpty()) return o;
		for (AfterSalesConditionDef ja : jl) {
			AfterSalesRule r = GtmFactory.eINSTANCE.createAfterSalesRule();
			r.setId(ja.getId());
			for (AfterSalesRuleDef jr : ja.getAfterSalesRules()) {
				AfterSalesCondition a = convert(jr);
				if (a != null) {
					r.getConditions().add(a);
				}
			}
			o.getAfterSalesRules().add(r);
		}
		return o;
	}


	

	private AfterSalesCondition convert(AfterSalesRuleDef jr) {
		if (jr == null) return null;
		AfterSalesCondition c = GtmFactory.eINSTANCE.createAfterSalesCondition();
		c.setApplicationTime(convert(jr.getApplicationTime()));
		c.setFee(prices.get(jr.getFeeRef()));
		c.setCarrierFee(jr.getIsCarrierFee());
		//old formats use allocatorFee
		if (!jr.getIsCarrierFee() && !jr.getIsAllocatorFee() ) {
			c.setCarrierFee(true);
		};
		c.setIndividualContracts(jr.getIndividualContracts());
		c.setTransactionType(AfterSalesTransactionType.getByName(jr.getTransactionType()));
		return c;
	}


	private Price convert(PriceDef jp) {
		if (jp == null) return null;
		Price p = GtmFactory.eINSTANCE.createPrice();

		p.setId(jp.getId());
		p.setDataSource(DataSource.IMPORTED);
		
		for (CurrencyPriceDef jcp : jp.getPrice()) {
			CurrencyPrice cp = convert(jcp);
			if (cp != null) {
				p.getCurrencies().add(cp);
			}
		}	
		return p;
	}


	private ApplicationTime convert(RelativeTimeDef ja) {
		if (ja == null) return null;
		ApplicationTime a = GtmFactory.eINSTANCE.createApplicationTime();
		if (ja.getTimeReference()!= null) {
			a.setReference(TimeReferenceType.getByName(ja.getTimeReference().name()));
		}
		if (ja.getTimeUnit()!= null) {
			a.setUnit(convertTimeUnit(ja.getTimeUnit()));
		}
		a.setValue(ja.getTimeValue());
		return a;
	}


	private Delivery convert(FareDeliveryDetailsDef jo) {
		if (jo == null) return null;
		Delivery o = GtmFactory.eINSTANCE.createDelivery();
		o.setAcceptedSchemaVersion(getSchemaVersion(jo.getAcceptedVersion()));
		o.setId(jo.getDeliveryId());
		o.setOptional(jo.getOptionalDelivery());
		o.setPreviousDeliveryId(jo.getPreviousDeliveryId());
		o.setProvider(getCarrier(jo.getFareProvider()));
		o.setReplacedDeliveryId(jo.getReplacementDeliveryId());
		o.setSchemaVersion(getSchemaVersion(jo.getVersion()));
		
		if (jo.getUsage() != null) {
			if (jo.getUsage().equals(Usage.PRODUCTION)) {
				o.setUsage(DataType.PRODUCTION_DATA);
			} else if  (jo.getUsage().equals(Usage.TEST_ONLY)) {
				o.setUsage(DataType.TEST_DATA);
			}
		}
		
		return o;
	}
	
	private SchemaVersion getSchemaVersion(String version) {
		if (version == null || version.length() == 0) return null;
		

		if (version.equals(SchemaVersion.V12.getLiteral()) || version.equals(SchemaVersion.V12.getName())) {
			return SchemaVersion.V12;
		}
		if (version.equals(SchemaVersion.V14.getLiteral()) || version.equals(SchemaVersion.V14.getName())) {
			return SchemaVersion.V14;
		}
		if (version.equals(SchemaVersion.V30.getLiteral()) || version.equals(SchemaVersion.V30.getName())) {
			return SchemaVersion.V30;
		}
		if (version.equals(SchemaVersion.V31.getLiteral()) || version.equals(SchemaVersion.V31.getName())) {
			return SchemaVersion.V31;
		}		
		
		GtmUtils.writeConsoleError("Schema Version not supported: " + version, editor);
		
		return null;
		
	}
	

	private Station getStation (StationDef station) {
		try {
			Long icode = getNumericStationCode(station);
			Station s = stations.get(icode);
			
			if (s == null) {
				GtmUtils.writeConsoleError("Station not found: " + station.getCode(), editor);
			}		
			
			return s;
		} catch (Exception e) {
			//non-standard station code
			return null;
		}

	}	
	
	private Station getStation (String s) {
		
		long codeNum = GtmUtils.getStationCode(s);
				
		Station station = stations.get(codeNum);
		
		if (station == null) {
			GtmUtils.writeConsoleError("Station not found: " + Long.toString(codeNum), editor);
		}		
		
		return station;
	}


	private ServiceBrand getServiceBrand (int code) {
		
		if (code == 0) return null;

		ServiceBrand s = serviceBrands.get(code);

		if (s == null) {
			GtmUtils.writeConsoleError("Service Brand not found: " + Integer.valueOf(code).toString(), editor);
		}		

		return s;
	}

	private Carrier getCarrier (String code) {
		
		if (code == null || code.length() == 0) return null;

		Carrier c = carriers.get(code);
		if (c == null) {
			GtmUtils.writeConsoleError("Carrier not found: " + code, editor);
		}			
		
		return c;
	}
	
	private Language getLanguage (String code) {
		
		if (code == null || code.length() == 0) return null;
				
		Language l = languages.get(code);
		
		if (l == null) {
			GtmUtils.writeConsoleError("Language not found: " + code, editor);
		}				
		
		return l;
	}

	private Country getCountry (String code) {
		
		if (code == null || code.length() == 0) return null;
		
		Country c =  countriesISO.get(code);
		
		if (c == null) {
			GtmUtils.writeConsoleError("Country not found: " + code, editor);
		}				

		return c;
	}
	
	private Currency getCurrency (String code) {
		
		if (code == null || code.length() == 0) return null;
		
		Currency c =  currencies.get(code);

		if (c == null) {
			GtmUtils.writeConsoleError("Currency not found: " + code, editor);
		}				
		
		return c;
	}
	private NutsCode getNutsCode (String code) {
		
		if (code == null || code.length() == 0) return null;
		
		NutsCode n = nutsCodes.get(code);
	
		if (n == null) {
			GtmUtils.writeConsoleError("NUTS Code not found: " + code, editor);
		}				
		
		return n;
	}

	public HashMap<Long,Station> getStations() {
		return stations;
	}

}
