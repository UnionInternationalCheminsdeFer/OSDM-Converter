package osdm2netex;

import java.math.BigDecimal;

import Gtm.GeneralTariffModel;
import uk.org.netex.netex.AlternativeName;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.PublicCodeStructure;
import uk.org.netex.netex.SiteFrame;
import uk.org.netex.netex.StopPlace;
import uk.org.netex.netex.StopPlacesInFrameRelStructure;

public class Osdm2Stations {
	
	public static SiteFrame convertStations (GeneralTariffModel osdm) {
		
		ObjectFactory factory = new ObjectFactory();
		
		SiteFrame siteFrame = factory.createSiteFrame();
		siteFrame.setId(IdFactory.getSiteFrameId(osdm.getDelivery()));
		
		StopPlacesInFrameRelStructure places = factory.createStopPlacesInFrameRelStructure();
		
		for ( Gtm.Station s : osdm.getFareStructure().getStationNames().getStationName()) {
			
			
			if (TestFareSelector.selectStation(s,  osdm.getFareStructure().getStationNames())) {
			
				StopPlace stop = factory.createStopPlace();
				
				stop.setId(UrnUtils.getStationUri(s));
				stop.setName(Osdm2MultiLanguageString.getMultiLanguageString(s.getNameCaseUTF8()));
				stop.setShortName(Osdm2MultiLanguageString.getMultiLanguageString(s.getShortNameCaseUTF8()));
				
				stop.setAlternativeNames(factory.createAlternativeNamesRelStructure());
				AlternativeName an1 = factory.createAlternativeName();
				an1.setName(Osdm2MultiLanguageString.getMultiLanguageString(s.getName()));
				stop.getAlternativeNames().getAlternativeName().add(an1);
				
				PublicCodeStructure pcs = factory.createPublicCodeStructure();
				pcs.setType("UIC");		
				pcs.setValue(UrnUtils.getStationUri(s.getStationCode()));		
				stop.setPublicCode(pcs);
				stop.setCentroid(factory.createSimplePointVersionStructure());
				stop.getCentroid().setLocation(factory.createLocationStructure());
				String lat = Float.toString(s.getLatitude());
				stop.getCentroid().getLocation().setLatitude(new BigDecimal(lat));
				String lon = Float.toString(s.getLongitude());
				stop.getCentroid().getLocation().setLongitude(new BigDecimal(lon));
								
				places.getStopPlace().add(stop);
				
			}
		}
		
		siteFrame.setStopPlaces(places);
		
		return siteFrame;
	}
	
	

}
