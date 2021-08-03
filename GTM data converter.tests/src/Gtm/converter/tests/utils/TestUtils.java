package Gtm.converter.tests.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Gtm.Carrier;
import Gtm.FareElement;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Language;
import Gtm.Legacy108FareDescription;
import Gtm.Legacy108Station;
import Gtm.Legacy108Stations;
import Gtm.LegacyCarrier;
import Gtm.RegionalConstraint;
import Gtm.Station;
import Gtm.ViaStation;
import Gtm.LegacySeries;

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
	
	public static boolean isReturnRoute(RegionalConstraint r) {
		
		
		ViaStation via = r.getRegionalValidity().get(0).getViaStation();
		
		ViaStation firstVia = via.getRoute().getStations().get(0);
		ViaStation lastVia = via.getRoute().getStations().get(via.getRoute().getStations().size() -1);

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
	
}
