package Gtm.converter.tests.dataFactories;

import Gtm.Calendar;
import Gtm.Carrier;
import Gtm.CarrierConstraint;
import Gtm.CharacterSet;
import Gtm.ClassId;
import Gtm.ClassicClassType;
import Gtm.Clusters;
import Gtm.CombinationConstraint;
import Gtm.CombinationModel;
import Gtm.ConversionParams;
import Gtm.Country;
import Gtm.Currency;
import Gtm.CurrencyPrice;
import Gtm.EndOfSale;
import Gtm.FareCombinationModel;
import Gtm.FareConstraintBundle;
import Gtm.FareElement;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Language;
import Gtm.LegacyBorderPoint;
import Gtm.LegacyBorderSide;
import Gtm.LegacyConversionType;
import Gtm.PassengerConstraint;
import Gtm.Price;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.RegulatoryCondition;
import Gtm.Route;
import Gtm.SalesAvailabilityConstraint;
import Gtm.SalesRestriction;
import Gtm.ServiceBrand;
import Gtm.ServiceClass;
import Gtm.ServiceConstraint;
import Gtm.StartOfSale;
import Gtm.Station;
import Gtm.Text;
import Gtm.TimeReferenceType;
import Gtm.TimeUnit;
import Gtm.Translation;
import Gtm.TravelValidityConstraint;
import Gtm.TravelerType;
import Gtm.ViaStation;
import Gtm.converter.tests.utils.TestUtils;

public class OsdmDataFactory {
	
	public static GTMTool createBasicData() {
		
		GTMTool tool = init();
				
	
        //create fares
		createFares(tool,tool.getCodeLists().getCarriers().getCarriers().get(0), tool.getCodeLists().getCountries().getCountries().get(0));
		
		//conversion parameter
		createParams(tool, tool.getCodeLists().getCarriers().getCarriers().get(0), tool.getCodeLists().getCountries().getCountries().get(0));
				
		return tool;
	}
	
	

	private static GTMTool init() {
		
		GTMTool tool = GtmFactory.eINSTANCE.createGTMTool();
		
		tool.setConversionFromLegacy(GtmFactory.eINSTANCE.createConversionFromLegacy());	
		tool.getConversionFromLegacy().setLegacy108(GtmFactory.eINSTANCE.createLegacy108());
		tool.getConversionFromLegacy().setParams(GtmFactory.eINSTANCE.createConversionParams());
		tool.setGeneralTariffModel(GtmFactory.eINSTANCE.createGeneralTariffModel());
		tool.getGeneralTariffModel().setFareStructure(GtmFactory.eINSTANCE.createFareStructure());
		
		//add fare structure
		addFareStructure(tool);

		//codelists
		createCodeLists(tool);
		
		tool.getConversionFromLegacy().getParams().setCountry(TestUtils.findCountry(tool,99));
		
		return tool;
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
		tool.getGeneralTariffModel().getFareStructure().setTexts(GtmFactory.eINSTANCE.createTexts());
		tool.getGeneralTariffModel().getFareStructure().setStationNames(GtmFactory.eINSTANCE.createStationNames());
		
	}

	

	private static void createParams(GTMTool tool,Carrier carrier, Country country) {
		
		ConversionParams params = GtmFactory.eINSTANCE.createConversionParams();
		tool.getConversionFromLegacy().setParams(params);
		
		params.setCountry(country);
		
	}
	
	private static void createFares(GTMTool tool,Carrier carrier, Country country) {

		ServiceClass c1 = addServiceClass(tool,"Class 1", ClassicClassType.FIRST, ClassId.B);
		ServiceClass c2 = addServiceClass(tool,"Class 2", ClassicClassType.SECOND, ClassId.D);
		Text t = addText(tool,"Standard","Standard","Standard","Standard");
		
		CarrierConstraint cc = addCarrierConstriant(tool);
		
		ServiceConstraint sc = addServiceConstraint(tool);
			
		PassengerConstraint p = addPassengerConstraint(tool, TravelerType.ADULT);
		
		FareConstraintBundle bundle = addFareConstraintBundle(tool);	
		
		Price price1 = addPrice(tool, (float) 20.10);
		Price price2 = addPrice(tool, (float) 12.10);		
		
		SalesAvailabilityConstraint s = addSalesAvailabilityConstraint(tool);
		bundle.setSalesAvailability(s);
		
		TravelValidityConstraint tv = addTravelValidityConstarint(tool);
		bundle.setTravelValidity(tv);
		
		RegionalConstraint r = addRegionalConstraintWithSubroute(tool,cc,sc);
		
				
		FareElement fare1 = GtmFactory.eINSTANCE.createFareElement();
		fare1.setRegionalConstraint(r);
		fare1.setCombinationConstraint(null);
		fare1.setLegacyAccountingIdentifier(GtmFactory.eINSTANCE.createLegacyAccountingIdentifier());
		fare1.getLegacyAccountingIdentifier().setTariffId(10000);	
		fare1.setFareConstraintBundle(bundle);
		fare1.setText(t);
		fare1.setServiceClass(c1);
		fare1.setPrice(price1);
		fare1.setLegacyConversion(LegacyConversionType.YES);
		fare1.getRegulatoryConditions().add(RegulatoryCondition.CIV);
		fare1.setPassengerConstraint(p);
		tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements().add(fare1);
	

		FareElement fare2 = GtmFactory.eINSTANCE.createFareElement();
		fare2.setPrice(price2);
		fare2.setCombinationConstraint(null);
		fare2.setLegacyAccountingIdentifier(GtmFactory.eINSTANCE.createLegacyAccountingIdentifier());
		fare2.getLegacyAccountingIdentifier().setTariffId(10000);	
		fare2.setFareConstraintBundle(bundle);
		fare2.setText(t);
		fare2.setServiceClass(c2);
		fare2.setPrice(price2);
		fare2.setLegacyConversion(LegacyConversionType.YES);
		fare2.getRegulatoryConditions().add(RegulatoryCondition.CIV);
		fare2.setPassengerConstraint(p);
		tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements().add(fare2);
		
	}

	private static ServiceConstraint addServiceConstraint(GTMTool tool) {
		ServiceConstraint sc = GtmFactory.eINSTANCE.createServiceConstraint();
		
		sc.getIncludedServiceBrands().add(tool.getCodeLists().getServiceBrands().getServiceBrands().get(0));
		sc.setLegacy108Code(55555);
		
		tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints().add(sc);
		return sc;
	}



	private static CarrierConstraint addCarrierConstriant(GTMTool tool) {
		CarrierConstraint cc = GtmFactory.eINSTANCE.createCarrierConstraint();
		
		cc.getIncludedCarriers().add(tool.getCodeLists().getCarriers().getCarriers().get(0));
		
		tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints().getCarrierConstraints().add(cc);        
		return cc;
	}



	private static RegionalConstraint addRegionalConstraintWithSubroute(GTMTool tool, CarrierConstraint cc, ServiceConstraint sc) {
		
		RegionalConstraint rc = GtmFactory.eINSTANCE.createRegionalConstraint(); 
		RegionalValidity rv = GtmFactory.eINSTANCE.createRegionalValidity();
		ViaStation main = GtmFactory.eINSTANCE.createViaStation();
		
		main.setCarrierConstraint(cc);
		
		ViaStation v1 = GtmFactory.eINSTANCE.createViaStation();
		v1.setStation(tool.getCodeLists().getStations().getStations().get(0));
		
		ViaStation v2 = GtmFactory.eINSTANCE.createViaStation();
		v2.setStation(tool.getCodeLists().getStations().getStations().get(1));
				
		ViaStation v3 = GtmFactory.eINSTANCE.createViaStation();
		
		Route subroute = GtmFactory.eINSTANCE.createRoute();
		v3.setRoute(subroute);
		v3.setServiceConstraint(sc);
		
		ViaStation v4 = GtmFactory.eINSTANCE.createViaStation();
		v4.setStation(tool.getCodeLists().getStations().getStations().get(2));
		subroute.getStations().add(v4);
		
		ViaStation v5 = GtmFactory.eINSTANCE.createViaStation();
		v5.setStation(tool.getCodeLists().getStations().getStations().get(5));
		subroute.getStations().add(v5);
		
		Route mainroute = GtmFactory.eINSTANCE.createRoute();
		mainroute.getStations().add(v1);
		mainroute.getStations().add(v2);
		mainroute.getStations().add(v3);
		main.setRoute(mainroute);
		
		rv.setViaStation(main);
		
		
		rc.getRegionalValidity().add(rv);
		
		tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints().add(rc);
		return rc;
	}



	private static TravelValidityConstraint addTravelValidityConstarint(GTMTool tool) {
		
		TravelValidityConstraint t = GtmFactory.eINSTANCE.createTravelValidityConstraint();
		Calendar c = GtmFactory.eINSTANCE.createCalendar();
		c.setFromDate(TestUtils.getFromDate());
		c.setUntilDateTime(TestUtils.getUntilDate());
		
		t.setValidDays(c);
		tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars().add(c);
		
		tool.getGeneralTariffModel().getFareStructure().getTravelValidityConstraints().getTravelValidityConstraints().add(t);
		return t;
	}



	private static SalesAvailabilityConstraint addSalesAvailabilityConstraint(GTMTool tool) {
		
		SalesAvailabilityConstraint sa = GtmFactory.eINSTANCE.createSalesAvailabilityConstraint();
		
		SalesRestriction sr = GtmFactory.eINSTANCE.createSalesRestriction();
		sa.getRestrictions().add(sr);
		StartOfSale ss = GtmFactory.eINSTANCE.createStartOfSale();
		ss.setReference(TimeReferenceType.BEFORE_DEPARTURE);
		ss.setUnit(TimeUnit.DAY);
		ss.setValue(1);
		EndOfSale se = 	GtmFactory.eINSTANCE.createEndOfSale();	
		ss.setReference(TimeReferenceType.AFTER_DEPARTURE);
		ss.setUnit(TimeUnit.DAY);
		ss.setValue(0);
		sr.setStartOfSale(ss);
		sr.setEndOfSale(se);

		Calendar c = GtmFactory.eINSTANCE.createCalendar();
		c.setFromDate(TestUtils.getFromDate());
		c.setUntilDateTime(TestUtils.getUntilDate());
		tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars().add(c);	
		sr.setSalesDates(c);
			
		
		tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints().add(sa);

		return sa;
	}



	private static FareConstraintBundle addFareConstraintBundle(GTMTool tool) {
		
		tool.getGeneralTariffModel().getFareStructure().setFareConstraintBundles(GtmFactory.eINSTANCE.createFareConstraintBundles());;
		FareConstraintBundle bundle = GtmFactory.eINSTANCE.createFareConstraintBundle();
		tool.getGeneralTariffModel().getFareStructure().getFareConstraintBundles().getFareConstraintBundles().add(bundle);
		
		tool.getGeneralTariffModel().getFareStructure().setCombinationConstraints(GtmFactory.eINSTANCE.createCombinationConstraints());
		CombinationConstraint combi = GtmFactory.eINSTANCE.createCombinationConstraint();
		tool.getGeneralTariffModel().getFareStructure().getCombinationConstraints().getCombinationConstraints().add(combi);
		FareCombinationModel combiModel = GtmFactory.eINSTANCE.createFareCombinationModel();
		combi.getCombinationModels().add(combiModel);
		combiModel.setModel(CombinationModel.CLUSTERING);
		combiModel.setReferenceCluster(Clusters.FULLFLEX);
		bundle.setCombinationConstraint(combi);
		
		return bundle;
	}



	private static PassengerConstraint addPassengerConstraint(GTMTool tool, TravelerType type) {

		tool.getGeneralTariffModel().getFareStructure().setPassengerConstraints(GtmFactory.eINSTANCE.createPassengerConstraints());;
		PassengerConstraint p = GtmFactory.eINSTANCE.createPassengerConstraint();
		p.setTravelerType(type);
		tool.getGeneralTariffModel().getFareStructure().getPassengerConstraints().getPassengerConstraints().add(p);

		return p;
	}



	private static Price addPrice(GTMTool tool, float f) {
		
		Price price = GtmFactory.eINSTANCE.createPrice();
		CurrencyPrice cp = GtmFactory.eINSTANCE.createCurrencyPrice();
		price.getCurrencies().add(cp);
		cp.setAmount(f);
		cp.setCurrency(tool.getCodeLists().getCurrencies().getCurrencies().get(0));
		tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices().add(price);
		
		return price;
		
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
		tool.getGeneralTariffModel().getFareStructure().getServiceClassDefinitions().getServiceClassDefinitions().add(c);

		return c;
	}

	public static Text addText(GTMTool tool, String t, String t8, String st, String st8) {
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
		tool.getCodeLists().getCarriers().getCarriers().add(createCarrier("9996","RAILWAY FOUR", "RAIL-4"));
		tool.getCodeLists().getCarriers().getCarriers().add(createCarrier("9995","Atlantis Rail", "RAIL-A"));
			
		//service brands
		tool.getCodeLists().setServiceBrands(GtmFactory.eINSTANCE.createServiceBrands());
		tool.getCodeLists().getServiceBrands().getServiceBrands().add(createServiceBrand(1,"ship"));
		tool.getCodeLists().getServiceBrands().getServiceBrands().add(createServiceBrand(2,"bus"));
		tool.getCodeLists().getServiceBrands().getServiceBrands().add(createServiceBrand(3,"rail"));
		
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
		Country liliput = GtmFactory.eINSTANCE.createCountry();
		liliput.setCode(97);
		liliput.setISOcode("LP");
		liliput.setName("Liliput");
		liliput.setDefaultCharacterSet(CharacterSet.LATIN1_ISO88591);
		tool.getCodeLists().getCountries().getCountries().add(liliput);	
		
		//stations
		tool.getCodeLists().setStations(GtmFactory.eINSTANCE.createStations());
		addStation(tool,"A","00001", wonderland);
		addStation(tool,"B","00002", wonderland);
		addStation(tool,"C","00003", wonderland);
		addStation(tool,"D","00004", wonderland);
		addStation(tool,"E","00005", wonderland);
		addStation(tool,"F","00006", wonderland);
		addStation(tool,"G","00007", wonderland);		
		addStation(tool,"H","00008", wonderland);
		addStation(tool,"HM","00900", wonderland);
		addStation(tool,"Z","10000", atlantis);	
		addStation(tool,"Y","20000", liliput);	
			
	}
	

	private static ServiceBrand createServiceBrand(int code, String name) {
		ServiceBrand brand = GtmFactory.eINSTANCE.createServiceBrand();
		brand.setCode(code);
		brand.setName(name);
		brand.setAbbreviation(name);
		return brand;
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

	public static Station createStation(String name, String code, Country country) {
		Station station = GtmFactory.eINSTANCE.createStation();
		station.setCode(code);
		station.setCountry(country);
		long local = Long.parseLong(code);
		station.setStationCode(Long.valueOf(local + country.getCode() * 100000));
		station.setName(name + "-TOWN");
		station.setNameCaseASCII(name + "-Town");
		station.setNameCaseUTF8(name + "-Town");
		station.setShortNameCaseASCII(name + "-T");
		station.setShortNameCaseUTF8(name + "-T");
		
		return station;
	}
	
	public static Station addStation(GTMTool tool,String name, String code, Country country) {
		Station station = createStation(name,code,country);
		tool.getCodeLists().getStations().getStations().add(station);
	
		tool.getGeneralTariffModel().getFareStructure().getStationNames().getStationName().add(station);
		return station;
	}
		

	
	public static FareElement cloneFare(FareElement t1) {
		
		FareElement t = GtmFactory.eINSTANCE.createFareElement();
		
		t.setPrice(t1.getPrice());
		t.setCarrierConstraint(t1.getCarrierConstraint());
		t.setCombinationConstraint(t1.getCombinationConstraint());
		t.setDataDescription(t1.getDataDescription());
		t.setFareConstraintBundle(t1.getFareConstraintBundle());
		t.setFareDetailDescription(t1.getFareDetailDescription());
		t.setFulfillmentConstraint(t1.getFulfillmentConstraint());
		t.setIndividualContracts(t1.isIndividualContracts());
		t.setLegacyAccountingIdentifier(t1.getLegacyAccountingIdentifier());
		t.setLegacyConversion(t1.getLegacyConversion());
		t.setPassengerConstraint(t1.getPassengerConstraint());
		t.setPersonalDataConstraint(t1.getPersonalDataConstraint());
		t.setReductionConstraint(t1.getReductionConstraint());
		t.setSalesAvailability(t1.getSalesAvailability());
		t.setServiceClass(t1.getServiceClass());
		t.setServiceConstraint(t1.getServiceConstraint());
		t.setServiceLevel(t1.getServiceLevel());
		t.setText(t1.getText());
		t.setTravelValidity(t1.getTravelValidity());
		t.setType(t1.getType());
		return t;
	}
	
	public static Text addText(GTMTool tool, String value) {
		Text text = GtmFactory.eINSTANCE.createText();
		text.setTextICAO(value);
		text.setShortTextICAO(value);
		text.setTextUTF8(value);
		text.setShortTextUTF8(value);
		Translation tr = GtmFactory.eINSTANCE.createTranslation();
		tr.setLanguage(TestUtils.getLanguage(tool,"en"));
		tr.setTextICAO(value+"en");
		tr.setShortTextICAO(value+"en");
		tr.setTextUTF8(value+"en");
		tr.setShortTextUTF8(value+"en");
		text.getTranslations().add(tr);
		Translation tr2 = GtmFactory.eINSTANCE.createTranslation();
		tr2.setLanguage(TestUtils.getLanguage(tool,"fr"));
		tr2.setTextICAO(value+"fr");
		tr2.setTextUTF8(value+"fr");
		tr2.setShortTextICAO(value+"fr");
		tr2.setShortTextUTF8(value+"fr");
		text.getTranslations().add(tr2);
		Translation tr3 = GtmFactory.eINSTANCE.createTranslation();
		tr3.setLanguage(TestUtils.getLanguage(tool,"de"));
		tr3.setTextICAO(value+"de");
		tr3.setShortTextICAO(value+"de");
		tr3.setTextUTF8(value+"de");
		tr3.setShortTextUTF8(value+"de");
		text.getTranslations().add(tr3);
		tool.getGeneralTariffModel().getFareStructure().getTexts().getTexts().add(text);
		return text;
	}

	public static LegacyBorderPoint addBorderPoint(GTMTool tool, int borderPointCode, String carrierCode1, int counryCode1,int legacyStationCode1, String stationCode1, String carrierCode2, int counryCode2,int legacyStationCode2, String stationCode2) {
		LegacyBorderPoint border = GtmFactory.eINSTANCE.createLegacyBorderPoint();
		tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints().add(border);
		border.setBorderPointCode(borderPointCode);
		LegacyBorderSide side1 = GtmFactory.eINSTANCE.createLegacyBorderSide();
		side1.setStations(GtmFactory.eINSTANCE.createStationSet());
		side1.getStations().getStations().add(TestUtils.findStation(tool, counryCode1,stationCode1)); 
		side1.setCarrier(TestUtils.findCarrier(tool, carrierCode1)); 
		side1.setLegacyStationCode(legacyStationCode1);
		border.getBorderSides().add(side1);
		LegacyBorderSide side2 = GtmFactory.eINSTANCE.createLegacyBorderSide();
		side2.setStations(GtmFactory.eINSTANCE.createStationSet());
		side2.getStations().getStations().add(TestUtils.findStation(tool, counryCode2,stationCode2));
		side2.setCarrier(TestUtils.findCarrier(tool, carrierCode2));
		side2.setLegacyStationCode(legacyStationCode2);
		border.getBorderSides().add(side2);
		return border;
		
	}

}
