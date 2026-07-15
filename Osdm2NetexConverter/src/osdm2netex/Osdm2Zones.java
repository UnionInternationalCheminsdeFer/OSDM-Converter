package osdm2netex;

import Gtm.FareStationSetDefinition;
import Gtm.FareStationSetDefinitions;
import Gtm.Station;
import uk.org.netex.netex.FareZone;
import uk.org.netex.netex.FareZonesInFrameRelStructure;
import uk.org.netex.netex.PointRefsRelStructure;
import uk.org.netex.netex.ScheduledStopPointRefStructure;
import uk.org.netex.netex.ObjectFactory;

public class Osdm2Zones {

	
	public static void convertFareStationSets(FareStationSetDefinitions fareStationSetDefinitions,
			FareZonesInFrameRelStructure zones) {
		
		ObjectFactory factory = new ObjectFactory();
		
		for (FareStationSetDefinition stationSet : fareStationSetDefinitions.getFareStationSetDefinitions()) {
			
			if (TestFareSelector.selectStationSets(stationSet,fareStationSetDefinitions )) {
			
				FareZone zone = factory.createFareZone();
				
				zone.setId(IdFactory.getId(stationSet));
				zone.setName(Osdm2MultiLanguageString.getMultiLanguageString(stationSet.getNameUtf8()));
				PointRefsRelStructure stationList = factory.createPointRefsRelStructure();
				
				for (  Station station : stationSet.getStations()) {
					
					String stationUrn = UrnUtils.getStationUri(station);
					ScheduledStopPointRefStructure sp = factory.createScheduledStopPointRefStructure();
					sp.setUri(stationUrn);						
					stationList.getPointRef().add(factory.createScheduledStopPointRef(sp));
				}
				
				zone.setMembers(stationList);
				
				zones.getFareZone().add(zone);
				
			}
		}
		
	}

}
