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
import Gtm.LegacyBorderPoint;
import Gtm.LegacyBorderSide;
import Gtm.LegacyCalculationType;
import Gtm.LegacyConversionType;
import Gtm.LegacyDistanceFare;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeries;
import Gtm.LegacySeriesList;
import Gtm.LegacySeriesType;
import Gtm.LegacyViastation;
import Gtm.PassengerConstraint;
import Gtm.RegulatoryCondition;
import Gtm.RoundingType;
import Gtm.ServiceBrand;
import Gtm.ServiceClass;
import Gtm.Station;
import Gtm.Text;
import Gtm.Translation;
import Gtm.TravelerType;
import Gtm.converter.tests.utils.TestUtils;

public class LegacyDataFactory {
	
	private static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); //$NON-NLS-1$
		
	
	public static GTMTool createBasicData() {
		
		GTMTool tool = init();
				
		//add fare structure
		addFareStructure(tool);
		
		//legacy 108 data
		createRouteFareLegacy(tool);
		
		//conversion parameter
		createParams(tool, tool.getCodeLists().getCarriers().getCarriers().get(0), tool.getCodeLists().getCountries().getCountries().get(0));
				
		return tool;
	}
	
	public static GTMTool createBasicDistanceFareData() {
		
		GTMTool tool = init();
				
		//add fare structure
		addFareStructure(tool);
		
		//legacy 108 data
		createDistanceFareLegacy(tool);
		
		//conversion parameter
		createParams(tool, tool.getCodeLists().getCarriers().getCarriers().get(0), tool.getCodeLists().getCountries().getCountries().get(0));
				
		return tool;
	}
	
	private static void createDistanceFareLegacy(GTMTool tool) {
		initLegacy(tool);
		addLegacyStations(tool);
		addLegacyDistanceSeries(tool);
		addLegacyDistanceFares(tool);		
	}

	private static void addLegacyDistanceSeries(GTMTool tool) {
		
		LegacySeriesList series = tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList();
		series.getSeries().add(createRouteBasedSeries(1,2,1,2));	
		series.getSeries().add(createRouteBasedSeries(2,10,1,3));
		series.getSeries().add(createRouteBasedSeries(3,22,1,4));	
		series.getSeries().add(createRouteBasedSeries(4,24,1,5));	
		series.getSeries().add(createRouteBasedSeries(5,45,1,6));	
		series.getSeries().add(createRouteBasedSeries(6,80,1,7));	
		
	}

	private static void addLegacyDistanceFares(GTMTool tool) {
		
		tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare().add(createDistanceFare(1,5,4));
		tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare().add(createDistanceFare(1,10,8));		
		tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare().add(createDistanceFare(1,15,12));
		tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare().add(createDistanceFare(1,20,16));
		tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare().add(createDistanceFare(1,25,20));
		tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare().add(createDistanceFare(1,30,24));
		tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare().add(createDistanceFare(1,35,28));
		tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare().add(createDistanceFare(1,40,32));
		tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare().add(createDistanceFare(1,45,36));
		tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare().add(createDistanceFare(1,50,40));
		tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare().add(createDistanceFare(1,55,44));
		tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare().add(createDistanceFare(1,60,48));
		tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare().add(createDistanceFare(1,65,52));
		tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare().add(createDistanceFare(1,70,56));

	}

	public static LegacyDistanceFare createDistanceFare(int table, int distance, int value) {
		LegacyDistanceFare f = GtmFactory.eINSTANCE.createLegacyDistanceFare();
		f.setDistance(distance);
		f.setFare1st(value * 2);
		f.setFare2nd(value);
		f.setFareTableNumber(table);
		f.setReturnFare1st(value * 4);
		f.setReturnFare2nd(value * 2);
		f.setValidFrom(TestUtils.getFromDate());
		f.setValidUntil(TestUtils.getUntilDate());
		return f;
	}

	private static GTMTool init() {
		GTMTool tool = GtmFactory.eINSTANCE.createGTMTool();
		
		tool.setConversionFromLegacy(GtmFactory.eINSTANCE.createConversionFromLegacy());	
		tool.getConversionFromLegacy().setLegacy108(GtmFactory.eINSTANCE.createLegacy108());
		tool.getConversionFromLegacy().setParams(GtmFactory.eINSTANCE.createConversionParams());
		tool.setGeneralTariffModel(GtmFactory.eINSTANCE.createGeneralTariffModel());
		tool.getGeneralTariffModel().setFareStructure(GtmFactory.eINSTANCE.createFareStructure());

		//codelists
		createCodeLists(tool);
		
		tool.getConversionFromLegacy().getParams().setCountry(TestUtils.findCountry(tool,99));
		
		return tool;
	}

	private static void createRouteFareLegacy(GTMTool tool) {
		initLegacy(tool);
		addLegacyStations(tool);
		addDistanceBasedLegacySeries(tool);
		addLegacyRouteFares(tool);
	
	}
	
	private static void initLegacy(GTMTool tool) {
		tool.getConversionFromLegacy().getLegacy108().setLegacySeriesList(GtmFactory.eINSTANCE.createLegacySeriesList());
		tool.getConversionFromLegacy().getLegacy108().setLegacyStations(GtmFactory.eINSTANCE.createLegacy108Stations());
		tool.getConversionFromLegacy().getLegacy108().setLegacyDistanceFares(GtmFactory.eINSTANCE.createLegacyDistanceFares());
		tool.getConversionFromLegacy().getLegacy108().setLegacyRouteFares(GtmFactory.eINSTANCE.createLegacyRouteFares());
		tool.getConversionFromLegacy().getLegacy108().setLegacyBorderPoints(GtmFactory.eINSTANCE.createLegacyBorderPoints());
		tool.getConversionFromLegacy().getLegacy108().setLegacyCarriers(GtmFactory.eINSTANCE.createLegacyCarriers());
		tool.getConversionFromLegacy().getLegacy108().setLegacyMemos(GtmFactory.eINSTANCE.createLegacy108Memos());
		tool.getConversionFromLegacy().getLegacy108().setLegacySeparateContractSeries(GtmFactory.eINSTANCE.createLegacySeparateContractSeriesList());
		tool.getConversionFromLegacy().getLegacy108().setLegacyStations(GtmFactory.eINSTANCE.createLegacy108Stations());
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
		addRouteFare(tool, "20190101", "20990101", 100, 50, 1, 1);	
		addRouteFare(tool, "20190101", "20990101", 100, 50, 1, 2);		
		addRouteFare(tool, "20190101", "20990101", 100, 50, 1, 3);		
		addRouteFare(tool, "20190101", "20990101", 100, 50, 1, 4);	
		addRouteFare(tool, "20190101", "20990101", 100, 50, 1, 5);	
		addRouteFare(tool, "20190101", "20990101", 100, 50, 1, 6);	
	}
	
	public static void addRouteFare(GTMTool tool, String validFrom, String validUntil, int fareFirst, int fareSecond, int fareTable, int series) {
		tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare().add(createRouteFare(validFrom, validUntil, fareFirst, fareSecond, fareTable, series));
	};


	public static LegacyRouteFare createRouteFare(String validFrom, String validUntil, int fareFirst, int fareSecond, int fareTable, int series) {
		
		LegacyRouteFare f = GtmFactory.eINSTANCE.createLegacyRouteFare();
		f.setFare1st(fareFirst);
		f.setFare2nd(fareSecond);
		f.setReturnFare1st(fareFirst * 2);
		f.setReturnFare2nd(fareSecond * 2);
		f.setFareTableNumber(fareTable);
		f.setSeriesNumber(series);
		
		try {
			f.setValidFrom(dateFormat.parse(validFrom));
			f.setValidUntil(dateFormat.parse(validUntil));
		} catch (ParseException e) {
			//
		}
		return f;
	}

	private static void addDistanceBasedLegacySeries(GTMTool tool) {
		
		LegacySeriesList series = tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList();
		
		LegacySeries s1 = createDistanceBasedSeries(tool,1,1);	
		s1.getViastations().add(createViaStation(2,1,false));
		s1.getViastations().add(createViaStation(3,1,false));
		s1.getViastations().add(createViaStation(4,1,false));
		s1.getViastations().add(createViaStation(5,1,false));
		s1.getViastations().add(createViaStation(6,1,false));
		series.getSeries().add(s1);

		LegacySeries s2 = createDistanceBasedSeries(tool,1,2);	
		s2.getViastations().add(createViaStation(2,2,false));
		s2.getViastations().add(createViaStation(3,3,false));
		s2.getViastations().add(createViaStation(4,1,false));
		s2.getViastations().add(createViaStation(5,1,false));
		s2.getViastations().add(createViaStation(6,1,false));
		series.getSeries().add(s2);

		LegacySeries s3 = createDistanceBasedSeries(tool,1,3);	
		s3.getViastations().add(createViaStation(2,1,false));
		s3.getViastations().add(createViaStation(3,2,false));
		s3.getViastations().add(createViaStation(4,3,false));
		s3.getViastations().add(createViaStation(5,3,false));
		s3.getViastations().add(createViaStation(6,1,false));
		series.getSeries().add(s3);

		LegacySeries s4 = createDistanceBasedSeries(tool,1,4);	
		s4.getViastations().add(createViaStation(2,1,false));
		s4.getViastations().add(createViaStation(3,2,false));
		s4.getViastations().add(createViaStation(4,2,false));
		s4.getViastations().add(createViaStation(5,3,false));
		s4.getViastations().add(createViaStation(6,1,false));
		series.getSeries().add(s4);

		LegacySeries s5 = createDistanceBasedSeries(tool,1,5);	
		s5.getViastations().add(createViaStation(2,2,false));
		s5.getViastations().add(createViaStation(3,3,false));
		s5.getViastations().add(createViaStation(4,1,false));
		s5.getViastations().add(createViaStation(5,2,false));
		s5.getViastations().add(createViaStation(6,3,false));
		series.getSeries().add(s5);

		LegacySeries s6 = createDistanceBasedSeries(tool,1,6);	
		s6.getViastations().add(createViaStation(2,2,false));
		s6.getViastations().add(createViaStation(3,3,false));
		s6.getViastations().add(createViaStation(4,2,false));
		s6.getViastations().add(createViaStation(5,3,false));
		s6.getViastations().add(createViaStation(6,1,false));
		series.getSeries().add(s6);

		
	}
	
	private static LegacySeries createDistanceBasedSeries(GTMTool tool, int fareTable , int seriesNumber) {
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
	
	public static void addRouteBasedSeries(GTMTool tool, int seriesNumber, int distance, int from, int to) {
		LegacySeries s = GtmFactory.eINSTANCE.createLegacySeries();
		s.setCarrierCode("9999");
		s.setDistance1(distance);
		s.setDistance2(distance);
		s.setFareTableNumber(1);
		s.setFromStation(from);
		s.setToStation(to);
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
		tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().add(s);
	}

	public static LegacySeries createRouteBasedSeries(int seriesNumber, int distance, int from, int to) {
		LegacySeries s = GtmFactory.eINSTANCE.createLegacySeries();
		s.setCarrierCode("9999");
		s.setDistance1(distance);
		s.setDistance2(distance);
		s.setFareTableNumber(1);
		s.setFromStation(from);
		s.setToStation(to);
		s.setNumber(seriesNumber);
		s.setPricetype(LegacyCalculationType.DISTANCE_BASED);
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

	public static LegacyViastation createViaStation(int code, int position, boolean optional) {
		LegacyViastation v1 = GtmFactory.eINSTANCE.createLegacyViastation();
		v1.setCode(code);
		v1.setPosition(position);
		v1.setOptional(optional);		
		return v1;
	}

	

	public static void addLegacyStations(GTMTool tool) {
		addLegacyStation(tool,1,"A-Stadt","A-Stadt","A", 0,100);
		addLegacyStation(tool,2,"B-Stadt","B-Stadt","B", 0,100);
		addLegacyStation(tool,3,"C-Stadt","C-Stadt","C", 0,0);
		addLegacyStation(tool,4,"D-Stadt","D-Stadt","D", 0,0);
		addLegacyStation(tool,5,"E-Stadt","E-Stadt","E", 0,0);
		addLegacyStation(tool,6,"F-Stadt","F-Stadt","F", 0,0);
		addLegacyStation(tool,7,"G-Stadt","G-Stadt","G", 0,900);
		addLegacyStation(tool,100,"A-Area","A-area","A-ar", 0,100);
		addLegacyStation(tool,900,"H-Stadt","H-area","H-ar", 0,900);
		addLegacyStation(tool,8,"H-Main","H-Main","H", 0,900);
			
	}
	
	public static void addLegacyStation(GTMTool tool, int code, String name, String nameUtf8, String shortName, int borderCode,
			int setCode) {
		Legacy108Station s = GtmFactory.eINSTANCE.createLegacy108Station();
		s.setStationCode(code);
		s.setName(name);
		s.setNameUTF8(nameUtf8);
		s.setShortName(shortName);
		s.setBorderPointCode(borderCode);
		s.setFareReferenceStationCode(setCode);
		tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations().add(s);
	}

	public static Legacy108Station createLegacyStation(int code, String name, String nameUtf8, String shortName, int borderCode,
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
		template1.getRegulatoryConditions().add(RegulatoryCondition.CIV);
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
		template2.getRegulatoryConditions().add(RegulatoryCondition.CIV);
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
		tool.getCodeLists().getStations().getStations().add(createStation("Y","20000", liliput));	
			
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
		station.setName(name + "-TOWN");
		station.setNameCaseASCII(name + "-Town");
		station.setNameCaseASCII(name + "-Town");
		station.setNameCaseASCII(name + "-Town");
		station.setNameCaseASCII(name + "-Town");
		return station;
	}
	
	public static Station addStation(GTMTool tool,String name, String code, Country country) {
		Station station = GtmFactory.eINSTANCE.createStation();
		station.setCode(code);
		station.setCountry(country);
		station.setName(name + "-TOWN");
		tool.getCodeLists().getStations().getStations().add(station);
		return station;
	}
		
	public static Legacy108Station addLegacyStation(GTMTool tool, String name,String nameUtf8,String shortName, int code, int borderCode, int setCode) {
		Legacy108Station s = GtmFactory.eINSTANCE.createLegacy108Station();
		s.setStationCode(code);
		s.setName(name);
		s.setNameUTF8(nameUtf8);
		s.setShortName(shortName);
		s.setShortNameUtf8(shortName);
		s.setBorderPointCode(borderCode);
		s.setFareReferenceStationCode(setCode);
		tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations().add(s);
		
		return s;
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
	
	public static FareTemplate cloneTemplate(FareTemplate t1) {
		
		FareTemplate t = GtmFactory.eINSTANCE.createFareTemplate();
		
		t.setBasePriceClass(t1.getBasePriceClass());
		t.setCarrierConstraint(t1.getCarrierConstraint());
		t.setCombinationConstraint(t1.getCombinationConstraint());
		t.setDataDescription(t1.getDataDescription());
		t.setFareConstraintBundle(t1.getFareConstraintBundle());
		t.setFareDetailDescription(t1.getFareDetailDescription());
		t.setFulfillmentConstraint(t1.getFulfillmentConstraint());
		t.setIndividualContracts(t1.isIndividualContracts());
		t.setLegacyAccountingTariffId(t1.getLegacyAccountingTariffId());
		t.setLegacyConversion(t1.getLegacyConversion());
		t.setPassengerConstraint(t1.getPassengerConstraint());
		t.setPersonalDataConstraint(t1.getPersonalDataConstraint());
		t.setPrice(t1.getPrice());
		t.setPriceFactor(t1.getPriceFactor());
		t.setReductionConstraint(t1.getReductionConstraint());
		t.setRoundingMode(t1.getRoundingMode());
		t.setSalesAvailability(t1.getSalesAvailability());
		t.setSeparateContractFareConstraintBundle(t1.getSeparateContractFareConstraintBundle());
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
