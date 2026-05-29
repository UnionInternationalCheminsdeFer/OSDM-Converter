package osdm2netex;

import java.util.ArrayList;
import java.util.Collections;

import Gtm.ConnectionPoint;
import Gtm.ConnectionPoints;
import uk.org.netex.netex.BorderPointsInFrameRelStructure;

public class Osdm2SeriesConnection {
	
	public static BorderPointsInFrameRelStructure convertBorderPoints(ConnectionPoints connectionPoints) {

		// TODO Auto-generated method stub
		return null;
	}

	public static String getRef(ConnectionPoint entryConnectionPoint) {
		ArrayList<String> scs = new ArrayList<String>();
		for (Gtm.StationSet ss : entryConnectionPoint.getConnectedStationSets()) {
			
			for (Gtm.Station st : ss.getStations()) {
				
				scs.add(st.getCode());
			}
			
		}
		
		Collections.sort(scs);
		
		StringBuilder sb = new StringBuilder();
		for (String s : scs) {
			sb.append(scs).append("-");
		}
		
		return sb.toString();
	}
	


}
