package Gtm.converter.tests.dataFactories;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import Gtm.Carrier;
import Gtm.CharacterSet;
import Gtm.ClassId;
import Gtm.ClassicClassType;
import Gtm.Clusters;
import Gtm.CombinationConstraint;
import Gtm.CombinationModel;
import Gtm.ConversionParams;
import Gtm.Country;
import Gtm.Currency;
import Gtm.FareCombinationModel;
import Gtm.FareConstraintBundle;
import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Language;
import Gtm.Legacy108Station;
import Gtm.Legacy108Stations;
import Gtm.LegacyCalculationType;
import Gtm.LegacyConversionType;
import Gtm.LegacyRouteFare;
import Gtm.LegacyRouteFares;
import Gtm.LegacySeries;
import Gtm.LegacySeriesList;
import Gtm.LegacySeriesType;
import Gtm.LegacyViastation;
import Gtm.PassengerConstraint;
import Gtm.RoundingType;
import Gtm.ServiceClass;
import Gtm.Station;
import Gtm.Text;
import Gtm.TravelerType;

public class LegacyDataFactory {
	
	private static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); //$NON-NLS-1$
	
	public static GTMTool createBasicData() {
		GTMTool tool = GtmFactory.eINSTANCE.createGTMTool();
		
		tool.setConversionFromLegacy(GtmFactory.eINSTANCE.createConversionFromLegacy());	
		tool.getConversionFromLegacy().setLegacy108(GtmFactory.eINSTANCE.createLegacy108());
		tool.getConversionFromLegacy().setParams(GtmFactory.eINSTANCE.createConversionParams());
		tool.setGeneralTariffModel(GtmFactory.eINSTANCE.createGeneralTariffModel());
		tool.getGeneralTariffModel().setFareStructure(GtmFactory.eINSTANCE.createFareStructure());
		
		//codelists
		createCodeLists(tool);
		
		//add fare structure
		addFareStructure(tool);
		
		
		//legacy 108 data
		createLegacy(tool);
		
		//conversion parameter
		createParams(tool, tool.getCodeLists().getCarriers().getCarriers().get(0), tool.getCodeLists().getCountries().getCountries().get(0));
				
		return tool;
	}

	private static void createLegacy(GTMTool tool) {
				
		tool.getConversionFromLegacy().getLegacy108().setLegacySeriesList(GtmFactory.eINSTANCE.createLegacySeriesList());
		tool.getConversionFromLegacy().getLegacy108().setLegacyStations(GtmFactory.eINSTANCE.createLegacy108Stations());
		tool.getConversionFromLegacy().getLegacy108().setLegacyDistanceFares(GtmFactory.eINSTANCE.createLegacyDistanceFares());
		tool.getConversionFromLegacy().getLegacy108().setLegacyRouteFares(GtmFactory.eINSTANCE.createLegacyRouteFares());
		tool.getConversionFromLegacy().getLegacy108().setLegacyBorderPoints(GtmFactory.eINSTANCE.createLegacyBorderPoints());
		tool.getConversionFromLegacy().getLegacy108().setLegacyCarriers(GtmFactory.eINSTANCE.createLegacyCarriers());
		tool.getConversionFromLegacy().getLegacy108().setLegacyMemos(GtmFactory.eINSTANCE.createLegacy108Memos());
		tool.getConversionFromLegacy().getLegacy108().setLegacySeparateContractSeries(GtmFactory.eINSTANCE.createLegacySeparateContractSeriesList());
		tool.getConversionFromLegacy().getLegacy108().setLegacyStations(GtmFactory.eINSTANCE.createLegacy108Stations());
		
		addLegacyStations(tool);
		addLegacySeries(tool);
		addLegacyRouteFares(tool);
	
	}

	private static void addFareStructure(GTMTool tool) {
		tool.getGeneralTariffModel().getFareStructure().setCalendars(GtmFactory.eINSTANCE.createCalendars());
		tool.getGeneralTariffModel().getFareStructure().setRegionalConstraints(GtmFactory.eINSTANCE.createRegionalConstraints());
		tool.getGeneralTariffModel().getFareStructure().setFareElements(GtmFactory.eINSTANCE.createFareElements());
		tool.getGeneralTariffModel().getFareStructure().setCombinationConstraints(GtmFactory.eINSTANCE.createCombinationConstraints());
		tool.getGeneralTariffModel().getFareStructure().setPrices(GtmFactory.eINSTANCE.createPrices());
		tool.getGeneralTariffModel().getFareStructure().setSalesAvailabilityConstraints(GtmFactory.eINSTANCE.createSalesAvailabilityConstraints());
		tool.getGeneralTariffModel().getFareStructure().setTravelValidityConstraints(GtmFactory.eINSTANCE.createTravelValidityConstraints());
		tool.getGeneralTariffModel().getFareStructure().setFareStationSetDefinitions(GtmFactory.eINSTANCE.createFareStationSetDefinitions());	
		tool.getGeneralTariffModel().getFareStructure().setConnectionPoints(GtmFactory.eINSTANCE.createConnectionPoints());	
		tool.getGeneralTariffModel().getFareStructure().setAfterSalesRules(GtmFactory.eINSTANCE.createAfterSalesRules());
		tool.getGeneralTariffModel().getFareStructure().setFulfillmentConstraints(GtmFactory.eINSTANCE.createFulfillmentConstraints());
		tool.getGeneralTariffModel().getFareStructure().setPassengerConstraints(GtmFactory.eINSTANCE.createPassengerConstraints());
		tool.getGeneralTariffModel().getFareStructure().setReductionCards(GtmFactory.eINSTANCE.createReductionCards());
		tool.getGeneralTariffModel().getFareStructure().setReductionConstraints(GtmFactory.eINSTANCE.createReductionConstraints());
		tool.getGeneralTariffModel().getFareStructure().setServiceConstraints(GtmFactory.eINSTANCE.createServiceConstraints());
		tool.getGeneralTariffModel().getFareStructure().setCarrierConstraints(GtmFactory.eINSTANCE.createCarrierConstraints());
		tool.getGeneralTariffModel().getFareStructure().setServiceLevelDefinitions(GtmFactory.eINSTANCE.createServiceLevelDefinitions());
		tool.getGeneralTariffModel().getFareStructure().setTotalPassengerCombinationConstraints(GtmFactory.eINSTANCE.createTotalPassengerCombinationConstraints());	
	}

	private static void addLegacyRouteFares(GTMTool tool) {
		
		LegacyRouteFares fares = tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares();
		
		LegacyRouteFare f1 = createBasicRouteFare(tool,1,1);	
		LegacyRouteFare f2 = createBasicRouteFare(tool,1,2);	
		LegacyRouteFare f3 = createBasicRouteFare(tool,1,3);	
		LegacyRouteFare f4 = createBasicRouteFare(tool,1,4);	
		LegacyRouteFare f5 = createBasicRouteFare(tool,1,5);	
		LegacyRouteFare f6 = createBasicRouteFare(tool,1,6);	
			
		fares.getRouteFare().add(f1);
		fares.getRouteFare().add(f2);
		fares.getRouteFare().add(f3);
		fares.getRouteFare().add(f4);
		fares.getRouteFare().add(f5);
		fares.getRouteFare().add(f6);
	}

	private static LegacyRouteFare createBasicRouteFare(GTMTool tool, int fareTable, int series) {
		
		LegacyRouteFare f = GtmFactory.eINSTANCE.createLegacyRouteFare();
		f.setFare1st(100);
		f.setFare2nd(50);
		f.setFareTableNumber(fareTable);
		f.setSeriesNumber(series);
		
		try {
			f.setValidFrom(dateFormat.parse("20190101"));
			f.setValidUntil(dateFormat.parse("20990101"));
		} catch (ParseException e) {
			//
		}
		return f;
	}

	private static void addLegacySeries(GTMTool tool) {
		
		LegacySeriesList series = tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList();
		
		LegacySeries s1 = createBasicSeries(tool,1,1);	
		s1.getViastations().add(createViaStation(2,1,false));
		s1.getViastations().add(createViaStation(3,1,false));
		s1.getViastations().add(createViaStation(4,1,false));
		s1.getViastations().add(createViaStation(5,1,false));
		s1.getViastations().add(createViaStation(6,1,false));
		series.getSeries().add(s1);

		LegacySeries s2 = createBasicSeries(tool,1,2);	
		s2.getViastations().add(createViaStation(2,2,false));
		s2.getViastations().add(createViaStation(3,3,false));
		s2.getViastations().add(createViaStation(4,1,false));
		s2.getViastations().add(createViaStation(5,1,false));
		s2.getViastations().add(createViaStation(6,1,false));
		series.getSeries().add(s2);

		LegacySeries s3 = createBasicSeries(tool,1,3);	
		s3.getViastations().add(createViaStation(2,1,false));
		s3.getViastations().add(createViaStation(3,2,false));
		s3.getViastations().add(createViaStation(4,3,false));
		s3.getViastations().add(createViaStation(5,3,false));
		s3.getViastations().add(createViaStation(6,1,false));
		series.getSeries().add(s3);

		LegacySeries s4 = createBasicSeries(tool,1,4);	
		s4.getViastations().add(createViaStation(2,1,false));
		s4.getViastations().add(createViaStation(3,2,false));
		s4.getViastations().add(createViaStation(4,2,false));
		s4.getViastations().add(createViaStation(5,3,false));
		s4.getViastations().add(createViaStation(6,1,false));
		series.getSeries().add(s4);

		LegacySeries s5 = createBasicSeries(tool,1,5);	
		s5.getViastations().add(createViaStation(2,2,false));
		s5.getViastations().add(createViaStation(3,3,false));
		s5.getViastations().add(createViaStation(4,1,false));
		s5.getViastations().add(createViaStation(5,2,false));
		s5.getViastations().add(createViaStation(6,3,false));
		series.getSeries().add(s5);

		LegacySeries s6 = createBasicSeries(tool,1,6);	
		s6.getViastations().add(createViaStation(2,2,false));
		s6.getViastations().add(createViaStation(3,3,false));
		s6.getViastations().add(createViaStation(4,2,false));
		s6.getViastations().add(createViaStation(5,3,false));
		s6.getViastations().add(createViaStation(6,1,false));
		series.getSeries().add(s6);

		
	}

	private static LegacyViastation createViaStation(int code, int position, boolean optional) {
		LegacyViastation v1 = GtmFactory.eINSTANCE.createLegacyViastation();
		v1.setCode(code);
		v1.setPosition(position);
		v1.setOptional(optional);		
		return v1;
	}

	private static LegacySeries createBasicSeries(GTMTool tool, int fareTable, int seriesNumber) {
		LegacySeries s = GtmFactory.eINSTANCE.createLegacySeries();
		s.setCarrierCode("9999");
		s.setDistance1(10);
		s.setDistance2(10);
		s.setFareTableNumber(fareTable);
		s.setFromStation(1);
		s.setToStation(7);
		s.setNumber(seriesNumber);
		s.setPricetype(LegacyCalculationType.ROUTE_BASED);
		s.setSupplyingCarrierCode("9999");
		s.setType(LegacySeriesType.STATION_STATION);
			
		
		try {
			s.setValidFrom(dateFormat.parse("20190101"));
			s.setValidUntil(dateFormat.parse("20990101"));
		} catch (ParseException e) {
			//
		}
		return s;
	}

	private static void addLegacyStations(GTMTool tool) {
		
		Legacy108Stations stations = tool.getConversionFromLegacy().getLegacy108().getLegacyStations();
		
		stations.getLegacyStations().add(createLegacyStation(1,"A-Stadt","A-Stadt","A", 0,100));
		stations.getLegacyStations().add(createLegacyStation(2,"B-Stadt","A-Stadt","B", 0,100));
		stations.getLegacyStations().add(createLegacyStation(3,"C-Stadt","A-Stadt","C", 0,0));
		stations.getLegacyStations().add(createLegacyStation(4,"D-Stadt","D-Stadt","D", 0,0));
		stations.getLegacyStations().add(createLegacyStation(5,"E-Stadt","A-Stadt","E", 0,0));
		stations.getLegacyStations().add(createLegacyStation(6,"F-Stadt","A-Stadt","F", 0,0));
		stations.getLegacyStations().add(createLegacyStation(7,"G-Stadt","A-Stadt","G", 0,900));
		stations.getLegacyStations().add(createLegacyStation(100,"A-Area","A-area","A-ar", 0,100));
		stations.getLegacyStations().add(createLegacyStation(900,"H-Stadt","H-area","H-ar", 0,900));
		stations.getLegacyStations().add(createLegacyStation(8,"H-Main","H-Main","H", 0,900));
			
	}

	private static Legacy108Station createLegacyStation(int code, String name, String nameUtf8, String shortName, int borderCode,
			int setCode) {
		Legacy108Station s = GtmFactory.eINSTANCE.createLegacy108Station();
		s.setStationCode(code);
		s.setName(name);
		s.setNameUTF8(nameUtf8);
		s.setShortName(shortName);
		s.setBorderPointCode(borderCode);
		s.setFareReferenceStationCode(setCode);
		
		return s;

	}

	private static void createParams(GTMTool tool,Carrier carrier, Country country) {
		
		ConversionParams params = GtmFactory.eINSTANCE.createConversionParams();
		tool.getConversionFromLegacy().setParams(params);
		
		tool.getConversionFromLegacy().getParams().setLegacyStationMappings(GtmFactory.eINSTANCE.createLegacyStationMappings());
		tool.getConversionFromLegacy().getParams().setLegacyStationToServiceBrandMappings(GtmFactory.eINSTANCE.createLegacyStationToServiceConstraintMappings());
		tool.getConversionFromLegacy().getParams().setLegacyStationToFareDetailMappings(GtmFactory.eINSTANCE.createLegacyFareDetailMaps());

		
		params.setCountry(country);
		tool.getConversionFromLegacy().getLegacy108().setCarrier(carrier);
		

		ServiceClass c1 = addServiceClass(tool,"Class 1", ClassicClassType.FIRST, ClassId.B);
		ServiceClass c2 = addServiceClass(tool,"Class 2", ClassicClassType.SECOND, ClassId.D);
		Text t = addText(tool,"Standard","Standard","Standard","Standard");
		
		tool.getGeneralTariffModel().getFareStructure().setFareConstraintBundles(GtmFactory.eINSTANCE.createFareConstraintBundles());;
		FareConstraintBundle bundle = GtmFactory.eINSTANCE.createFareConstraintBundle();
		tool.getGeneralTariffModel().getFareStructure().getFareConstraintBundles().getFareConstraintBundles().add(bundle);
		
		tool.getGeneralTariffModel().getFareStructure().setPassengerConstraints(GtmFactory.eINSTANCE.createPassengerConstraints());;
		PassengerConstraint p = GtmFactory.eINSTANCE.createPassengerConstraint();
		p.setTravelerType(TravelerType.ADULT);
		tool.getGeneralTariffModel().getFareStructure().getPassengerConstraints().getPassengerConstraints().add(p);

		tool.getGeneralTariffModel().getFareStructure().setCombinationConstraints(GtmFactory.eINSTANCE.createCombinationConstraints());
		CombinationConstraint combi = GtmFactory.eINSTANCE.createCombinationConstraint();
		tool.getGeneralTariffModel().getFareStructure().getCombinationConstraints().getCombinationConstraints().add(combi);
		FareCombinationModel combiModel = GtmFactory.eINSTANCE.createFareCombinationModel();
		combi.getCombinationModels().add(combiModel);
		combiModel.setModel(CombinationModel.CLUSTERING);
		combiModel.setReferenceCluster(Clusters.FULLFLEX);
		bundle.setCombinationConstraint(combi);
		
				
		params.setLegacyFareTemplates(GtmFactory.eINSTANCE.createLegacyFareTemplates());

		FareTemplate template1 = GtmFactory.eINSTANCE.createFareTemplate();
		template1.setCombinationConstraint(null);
		template1.setLegacyAccountingTariffId(10000);	
		template1.setPriceFactor(1.0F);
		template1.setRoundingMode(RoundingType.UP2CENT);
		template1.setFareConstraintBundle(bundle);
		template1.setText(t);
		template1.setServiceClass(c1);
		template1.setLegacyConversion(LegacyConversionType.YES);
		template1.setPassengerConstraint(p);
		params.getLegacyFareTemplates().getFareTemplates().add(template1);

		FareTemplate template2 = GtmFactory.eINSTANCE.createFareTemplate();
		template2.setCombinationConstraint(null);
		template2.setLegacyAccountingTariffId(10000);	
		template2.setPriceFactor(1.0F);
		template2.setRoundingMode(RoundingType.UP2CENT);
		template2.setFareConstraintBundle(bundle);
		template2.setText(t);
		template2.setServiceClass(c2);
		template2.setLegacyConversion(LegacyConversionType.YES);
		template2.setPassengerConstraint(p);
		params.getLegacyFareTemplates().getFareTemplates().add(template2);
		
	}

	private static ServiceClass addServiceClass(GTMTool tool, String name, ClassicClassType cc, ClassId ci) {
		if (tool.getGeneralTariffModel().getFareStructure().getServiceClassDefinitions() == null) {
			tool.getGeneralTariffModel().getFareStructure().setServiceClassDefinitions(GtmFactory.eINSTANCE.createServiceClassDefinitions());
		}
		ServiceClass c = GtmFactory.eINSTANCE.createServiceClass();
		Text t = addText(tool, name, name, name,name);
		c.setText(t);
		c.setClassicClass(cc);
		c.setId(ci);

		return c;
	}

	private static Text addText(GTMTool tool, String t, String t8, String st, String st8) {
		if (tool.getGeneralTariffModel().getFareStructure().getTexts() == null) {
			tool.getGeneralTariffModel().getFareStructure().setTexts(GtmFactory.eINSTANCE.createTexts());
		}
		Text txt = GtmFactory.eINSTANCE.createText();
		txt.setTextICAO(t);
		txt.setTextUTF8(t8);
		txt.setShortTextICAO(st);
		txt.setShortTextUTF8(st8);
		tool.getGeneralTariffModel().getFareStructure().getTexts().getTexts().add(txt);
		return txt;
	}

	public static void createCodeLists(GTMTool tool) {
		
		tool.setCodeLists(GtmFactory.eINSTANCE.createCodeLists());
		
		//currencies
		tool.getCodeLists().setCurrencies(GtmFactory.eINSTANCE.createCurrencies());
		Currency cur = GtmFactory.eINSTANCE.createCurrency();
		cur.setIsoCode("EUR");
		cur.setName("Euro");
		tool.getCodeLists().getCurrencies().getCurrencies().add(cur);
		
		//languages
		tool.getCodeLists().setLanguages(GtmFactory.eINSTANCE.createLanguages());
		tool.getCodeLists().getLanguages().getLanguages().add(createLanguage("en", "English"));
		tool.getCodeLists().getLanguages().getLanguages().add(createLanguage("de", "German"));
		tool.getCodeLists().getLanguages().getLanguages().add(createLanguage("fr", "French"));
		
		//carrier
		tool.getCodeLists().setCarriers(GtmFactory.eINSTANCE.createCarriers());
		tool.getCodeLists().getCarriers().getCarriers().add(createCarrier("9999","Wonderland Railways", "RAIL-W"));
		tool.getCodeLists().getCarriers().getCarriers().add(createCarrier("9998","RAILWAY TWO", "RAIL-2"));
		tool.getCodeLists().getCarriers().getCarriers().add(createCarrier("9997","RAILWAY THREE", "RAIL-3"));
		tool.getCodeLists().getCarriers().getCarriers().add(createCarrier("9995","Atlantis Rail", "RAIL-A"));
			
		//countries
		tool.getCodeLists().setCountries(GtmFactory.eINSTANCE.createCountries());
		Country wonderland = GtmFactory.eINSTANCE.createCountry();
		wonderland.setCode(99);
		wonderland.setISOcode("WL");
		wonderland.setName("Wonderland");
		wonderland.setDefaultCharacterSet(CharacterSet.LATIN1_ISO88591);
		tool.getCodeLists().getCountries().getCountries().add(wonderland);
		Country atlantis = GtmFactory.eINSTANCE.createCountry();
		atlantis.setCode(98);
		atlantis.setISOcode("AT");
		atlantis.setName("Atlantis");
		atlantis.setDefaultCharacterSet(CharacterSet.LATIN1_ISO88591);
		tool.getCodeLists().getCountries().getCountries().add(atlantis);		
		
		//stations
		tool.getCodeLists().setStations(GtmFactory.eINSTANCE.createStations());
		tool.getCodeLists().getStations().getStations().add(createStation("A","00001", wonderland));
		tool.getCodeLists().getStations().getStations().add(createStation("B","00002", wonderland));
		tool.getCodeLists().getStations().getStations().add(createStation("C","00003", wonderland));
		tool.getCodeLists().getStations().getStations().add(createStation("D","00004", wonderland));
		tool.getCodeLists().getStations().getStations().add(createStation("E","00005", wonderland));
		tool.getCodeLists().getStations().getStations().add(createStation("F","00006", wonderland));
		tool.getCodeLists().getStations().getStations().add(createStation("G","00007", wonderland));		
		tool.getCodeLists().getStations().getStations().add(createStation("H","00008", wonderland));
		tool.getCodeLists().getStations().getStations().add(createStation("HM","00900", wonderland));
		tool.getCodeLists().getStations().getStations().add(createStation("Z","10000", atlantis));		
			
	}

	private static Language createLanguage(String code, String name) {
		Language l = GtmFactory.eINSTANCE.createLanguage();
		l.setCode(code);
		l.setName(name);
		return l;
	}

	private static Carrier createCarrier(String code, String name, String shortName) {
		Carrier carrier = GtmFactory.eINSTANCE.createCarrier();
		carrier.setCode(code);
		carrier.setName(name);
		carrier.setShortName(shortName);
		return carrier;
	}

	private static Station createStation(String name, String code, Country country) {
		Station station = GtmFactory.eINSTANCE.createStation();
		station.setCode(code);
		station.setCountry(country);
		station.setName(name + "-TOWN");
		station.setNameCaseASCII(name + "-Town");
		station.setNameCaseASCII(name + "-Town");
		station.setNameCaseASCII(name + "-Town");
		station.setNameCaseASCII(name + "-Town");
		return station;
	}

	public static Legacy108Station createStation(String name,String nameUtf8,String shortName, int code, int borderCode, int setCode) {
		Legacy108Station s = GtmFactory.eINSTANCE.createLegacy108Station();
		s.setStationCode(code);
		s.setName(name);
		s.setNameUTF8(nameUtf8);
		s.setShortName(shortName);
		s.setShortNameUtf8(shortName);
		s.setBorderPointCode(borderCode);
		s.setFareReferenceStationCode(setCode);
		
		return s;
	}

}
