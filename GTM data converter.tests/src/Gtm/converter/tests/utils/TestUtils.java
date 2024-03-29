package Gtm.converter.tests.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.ecore.util.EcoreUtil;
import Gtm.AfterSalesRule;
import Gtm.AfterSalesTemplate;
import Gtm.Calendar;
import Gtm.Carrier;
import Gtm.CarrierConstraint;
import Gtm.CombinationConstraint;
import Gtm.ConnectionPoint;
import Gtm.Country;
import Gtm.FareConstraintBundle;
import Gtm.FareElement;
import Gtm.FareStationSetDefinition;
import Gtm.FareStructure;
import Gtm.FareTemplate;
import Gtm.FulfillmentConstraint;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Language;
import Gtm.Legacy108FareDescription;
import Gtm.Legacy108Station;
import Gtm.Legacy108Stations;
import Gtm.LegacyCarrier;
import Gtm.LegacyRouteFare;
import Gtm.RegionalConstraint;
import Gtm.ReservationParameter;
import Gtm.SalesAvailabilityConstraint;
import Gtm.ServiceConstraint;
import Gtm.ServiceLevel;
import Gtm.Station;
import Gtm.Text;
import Gtm.TotalPassengerCombinationConstraint;
import Gtm.TravelValidityConstraint;
import Gtm.ViaStation;
import Gtm.LegacySeries;
import Gtm.PassengerConstraint;
import Gtm.PersonalDataConstraint;
import Gtm.Price;
import Gtm.ReductionCard;
import Gtm.ReductionConstraint;

public class TestUtils {
	
	private static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); //$NON-NLS-1$
	
	public static void resetLegacy(GTMTool tool) {
		
		tool.getConversionFromLegacy().getLegacy108().setLegacySeriesList(GtmFactory.eINSTANCE.createLegacySeriesList());
		tool.getConversionFromLegacy().getLegacy108().setLegacyStations(GtmFactory.eINSTANCE.createLegacy108Stations());
		tool.getConversionFromLegacy().getLegacy108().setLegacyDistanceFares(GtmFactory.eINSTANCE.createLegacyDistanceFares());
		tool.getConversionFromLegacy().getLegacy108().setLegacyRouteFares(GtmFactory.eINSTANCE.createLegacyRouteFares());
		tool.getConversionFromLegacy().getLegacy108().setLegacyCarriers(GtmFactory.eINSTANCE.createLegacyCarriers());
		tool.getConversionFromLegacy().getLegacy108().setLegacyMemos(GtmFactory.eINSTANCE.createLegacy108Memos());
		tool.getConversionFromLegacy().getLegacy108().setLegacySeparateContractSeries(GtmFactory.eINSTANCE.createLegacySeparateContractSeriesList());
		tool.getConversionFromLegacy().getLegacy108().setLegacyStations(GtmFactory.eINSTANCE.createLegacy108Stations());

		
		for (Station s : tool.getCodeLists().getStations().getStations()) {
			//names are transfered via the staion names list only
			if (!tool.getGeneralTariffModel().getFareStructure().getStationNames().getStationName().contains(s)) {
				s.setLegacyBorderPointCode(0);
				s.setNameCaseASCII(null);
				s.setNameCaseUTF8(null);
				s.setShortNameCaseASCII(null);
				s.setShortNameCaseUTF8(null);				
			}
		}
		
		tool.getConversionFromLegacy().getParams().setLegacyStationMappings(GtmFactory.eINSTANCE.createLegacyStationMappings());
		tool.getConversionFromLegacy().getParams().setLegacyStationToFareDetailMappings(GtmFactory.eINSTANCE.createLegacyFareDetailMaps());
		tool.getConversionFromLegacy().getParams().setLegacyStationToServiceBrandMappings(GtmFactory.eINSTANCE.createLegacyStationToServiceConstraintMappings());
		tool.getConversionFromLegacy().getParams().setVatTemplates(GtmFactory.eINSTANCE.createVatTemplates());
		
	}

	public static Station findStation(GTMTool tool, int country , String code) {
		for (Station s : tool.getCodeLists().getStations().getStations()) {
			if ( s.getCode().equals(code) && s.getCountry().getCode() == country ) {
				return s;
			}
		}
		return null;
	}
	
	public static Legacy108Station findLegacyStation(GTMTool tool, int code) {
		for (Legacy108Station s : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
			if ( s.getStationCode() == code ) {
				return s;
			}
		}
		return null;
	}
	
	public static Carrier findCarrier(GTMTool tool, String code) {
		for (Carrier s : tool.getCodeLists().getCarriers().getCarriers()) {
			if ( s.getCode().equals(code)) {
				return s;
			}
		}
		return null;
	}
	
	
	
	
	public static Date getFromDate() {
		try {
			return dateFormat.parse("20190101");
		} catch (ParseException e) {
			return null;
		}
		
	}

	public static Date getUntilDate() {
		try {
			return dateFormat.parse("20990101");
		} catch (ParseException e) {
			return null;
		}
	}
	
	public static Date getDate(String dateString) {
		try {
			return dateFormat.parse(dateString);
		} catch (ParseException e) {
			return null;
		}
	}
	
	public static String getDateString(Date date) {
		return dateFormat.format(date);
	}
	
	public static boolean isReturnRoute(RegionalConstraint r) {
		
		
		ViaStation via = r.getRegionalValidity().get(0).getViaStation();
		
		ViaStation firstVia = via.getRoute().getStations().get(0);
		ViaStation lastVia = via.getRoute().getStations().get(via.getRoute().getStations().size() - 1);

		if (r.getEntryConnectionPoint().getLegacyBorderPointCode() > 0 && 
			r.getExitConnectionPoint().getLegacyBorderPointCode() == 0) {
			return false;
		}
		if (r.getEntryConnectionPoint().getLegacyBorderPointCode() == 0 && 
			r.getExitConnectionPoint().getLegacyBorderPointCode() > 0) {
			return true;
		}
		
		String firstName = getName(firstVia);
		String lastName = getName(lastVia);
		int comp = firstName.compareTo(lastName);
		boolean returnRoute = false;
		if (comp > 0) {
			returnRoute = true;
		}
		return returnRoute;
	}
	
	private static String getName(ViaStation via) {
		
		if (via.getStation() != null) {
			return via.getStation().getName();
		}
		if (via.getFareStationSet() != null) {
			return via.getFareStationSet().getName();
		}
		return "";
	}
	
	public static int getSeriesId(GTMTool tool, RegionalConstraint r) {
		
		for (FareElement f : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			if (f.getRegionalConstraint().equals(r)) {
				return f.getLegacyAccountingIdentifier().getSeriesId();
			}
		}
		return 0;
	}

	public static Legacy108Station getLegacyStation(Legacy108Stations legacyStations, int code) {
		
		for (Legacy108Station s : legacyStations.getLegacyStations()) {
			if (s.getStationCode() == code) {
				return s;
			}
			
		}
		return null;
	}

	public static LegacySeries getLegacySeries(GTMTool tool, int seriesId) {
		
		for (LegacySeries s :  tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			if (s.getNumber() == seriesId) return s;
		}
		return null;
	}

	public static Language getLanguage(GTMTool tool, String code) {
		for (Language l : tool.getCodeLists().getLanguages().getLanguages()) {
			if (l.getCode().equals(code)) return l;
		}
		return null;
	}

	public static Legacy108FareDescription findFareDescription(GTMTool tool, int fareTableNumber) {
		
		for (Legacy108FareDescription fd : tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions().getLegacyFares()) {
			if (fd.getTableId() == fareTableNumber) return fd;
		}
		return null;
	}

	public static LegacyCarrier findLegacyCarrier(GTMTool tool, String code) {
		
		for (LegacyCarrier c : tool.getConversionFromLegacy().getLegacy108().getLegacyCarriers().getLegacyCarrier()) {
			if (c.getCarrierCode().equals(code)) return c;
		}
		return null;
	}
	


	public static LegacyRouteFare findLegacyRouteFare(GTMTool tool, int fareTableNumber, int seriesNumber) {
		for (LegacyRouteFare f : tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare()) {
			if (f.getFareTableNumber() == fareTableNumber && f.getSeriesNumber() == seriesNumber) return f;
		}
		return null;
	}

	public static LegacyRouteFare findLegacyRouteFare(GTMTool tool,Date date,  int fareTableNumber, int seriesNumber) {
		for (LegacyRouteFare f : tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare()) {
			if (f.getValidFrom().equals(date) && f.getFareTableNumber() == fareTableNumber && f.getSeriesNumber() == seriesNumber) return f;
		}
		return null;
	}
	
	public static FareConstraintBundle clone(FareConstraintBundle bundle1) {
		FareConstraintBundle bundle2 = GtmFactory.eINSTANCE.createFareConstraintBundle();
		bundle2.setCarrierConstraint(bundle1.getCarrierConstraint());
		bundle2.setCombinationConstraint(bundle1.getCombinationConstraint());
		bundle2.setFulfillmentConstraint(bundle1.getFulfillmentConstraint());
		bundle2.setPersonalDataConstraint(bundle1.getPersonalDataConstraint());
		bundle2.setSalesAvailability(bundle1.getSalesAvailability());
		bundle2.setTotalPassengerConstraint(bundle1.getTotalPassengerConstraint());
		bundle2.setTravelValidity(bundle1.getTravelValidity());
		return bundle2;
	}

	public static FareTemplate clone(FareTemplate f) {
		
		FareTemplate t = GtmFactory.eINSTANCE.createFareTemplate();
		if (!f.getAfterSalesTemplate().isEmpty()) {
			for (AfterSalesTemplate at: f.getAfterSalesTemplate()) {
				t.getAfterSalesTemplate().add(EcoreUtil.copy(at));
			}
		}
		t.setBasePriceClass(f.getBasePriceClass());
		t.setCarrierConstraint(f.getCarrierConstraint());
		t.setDataDescription(f.getDataDescription());
		t.setCombinationConstraint(f.getCombinationConstraint());
		t.setFareConstraintBundle(f.getFareConstraintBundle());
		t.setFareDetailDescription(f.getFareDetailDescription());
		t.setFulfillmentConstraint(f.getFulfillmentConstraint());
		t.setLegacyAccountingTariffId(f.getLegacyAccountingTariffId());
		t.setLegacyConversion(f.getLegacyConversion());
		t.setPassengerConstraint(f.getPassengerConstraint());
		t.setPersonalDataConstraint(f.getPersonalDataConstraint());
		t.setPrice(f.getPrice());
		t.setPriceFactor(f.getPriceFactor());
		t.setReductionConstraint(f.getReductionConstraint());
		t.setReservationParameter(f.getReservationParameter());
		t.setRoundingMode(f.getRoundingMode());
		t.setSalesAvailability(f.getSalesAvailability());
		t.setSeparateContractFareConstraintBundle(f.getSeparateContractFareConstraintBundle());
		t.setServiceClass(f.getServiceClass());
		t.setServiceConstraint(f.getServiceConstraint());
		t.setServiceLevel(f.getServiceLevel());
		t.getRegulatoryConditions().addAll(f.getRegulatoryConditions());
		if (f.getCarrierFilter() != null && !t.getCarrierFilter().isEmpty()) {
			t.getCarrierFilter().addAll(t.getCarrierFilter());
		}
		return t;
	}

	public static Country findCountry(GTMTool tool, int code) {
		for (Country c : tool.getCodeLists().getCountries().getCountries()) {
			if (c.getCode() == code) return c;
		}
		return null;
	}

	public static LegacySeries findLegacySeries(GTMTool tool, int code) {
		for (LegacySeries ls : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()){
			if (ls.getNumber() == code) return ls;
		}
		return null;
	}
	
	public static boolean checkDateOnlyEqual(Date date1, Date date2) {
		
		String d1 = dateFormat.format(date1);
		String d2 = dateFormat.format(date2);
		
		return d1.equals(d2);

	}

	public static void setIds(GTMTool tool) {
		
		if (tool == null) return;
		
		
		FareStructure fareStructure = tool.getGeneralTariffModel().getFareStructure();
		
		String baseName = "test";
		baseName = baseName +"_1";		
		String listName = baseName;
				
		listName = baseName + "A_"; //$NON-NLS-1$
		int i = 0;
		for (AfterSalesRule object : fareStructure.getAfterSalesRules().getAfterSalesRules()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}
		
		listName = baseName + "B_"; //$NON-NLS-1$
		i = 0;
		for (Calendar object : fareStructure.getCalendars().getCalendars()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}

		listName = baseName + "C_"; //$NON-NLS-1$
		i = 0;
		for (CarrierConstraint object : fareStructure.getCarrierConstraints().getCarrierConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}
		
		listName = baseName + "D_"; //$NON-NLS-1$
		i = 0;		
		for (CombinationConstraint object : fareStructure.getCombinationConstraints().getCombinationConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}
		
		listName = baseName + "E_"; //$NON-NLS-1$
		i = 0;
		for (ConnectionPoint object : fareStructure.getConnectionPoints().getConnectionPoints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}
		
		for (FulfillmentConstraint object : fareStructure.getFulfillmentConstraints().getFulfillmentConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}
		
		listName = baseName + "G_"; //$NON-NLS-1$
		i = 0;
		for (PassengerConstraint object : fareStructure.getPassengerConstraints().getPassengerConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}		
		
	
		listName = baseName + "I_"; //$NON-NLS-1$
		i = 0;
		for (Price object : fareStructure.getPrices().getPrices()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}		
		
		listName = baseName + "J_"; //$NON-NLS-1$		i = 0;
		for (ReductionCard object : fareStructure.getReductionCards().getReductionCards()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}		
	
		
		listName = baseName + "K_"; //$NON-NLS-1$
		i = 0;
		for (ReductionConstraint object : fareStructure.getReductionConstraints().getReductionConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}		
		
		for (RegionalConstraint object : fareStructure.getRegionalConstraints().getRegionalConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}	
		
		listName = baseName + "M_"; //$NON-NLS-1$
		i = 0;
		for (SalesAvailabilityConstraint object : fareStructure.getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}	
		
		
		listName = baseName + "N_"; //$NON-NLS-1$
		i = 0;
		for (ServiceConstraint object : fareStructure.getServiceConstraints().getServiceConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}	
		
		listName = baseName + "O_"; //$NON-NLS-1$
		i = 0;
		for (ServiceLevel object : fareStructure.getServiceLevelDefinitions().getServiceLevelDefinition()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}	
		
		listName = baseName + "P_"; //$NON-NLS-1$
		i = 0;
		for (Text object : fareStructure.getTexts().getTexts()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}	
		
		listName = baseName + "Q_"; //$NON-NLS-1$
		i = 0;
		for (TravelValidityConstraint object : fareStructure.getTravelValidityConstraints().getTravelValidityConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}		
		
		listName = baseName + "R_"; //$NON-NLS-1$
		i = 0;
		for (FareStationSetDefinition object : fareStructure.getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}						

		listName = baseName + "S_"; //$NON-NLS-1$
		i = 0;
		for (FareConstraintBundle object : fareStructure.getFareConstraintBundles().getFareConstraintBundles()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}
		
		listName = baseName + "T_"; //$NON-NLS-1$
		i = 0;
		for (TotalPassengerCombinationConstraint object : fareStructure.getTotalPassengerCombinationConstraints().getTotalPassengerCombinationConstraint()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				object.setId(listName + "_" + Integer.toString(i));
			}
		}
		

	}
	
}
