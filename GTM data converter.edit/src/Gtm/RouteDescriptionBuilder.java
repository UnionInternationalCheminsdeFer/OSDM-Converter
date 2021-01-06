package Gtm;

import org.eclipse.emf.common.util.EList;
import Gtm.AlternativeRoute;
import Gtm.RegionalValidity;
import Gtm.Route;
import Gtm.Station;
import Gtm.ViaStation;


// TODO: Auto-generated Javadoc
/**
 * The Class RouteDescriptionBuilder.
 */
public class RouteDescriptionBuilder {
	

	
	
	/**
	 * Gets the route description.
	 *
	 * @param rvl the rvl
	 * @return the route description
	 */
	public static String getRouteDescription(EList<RegionalValidity> rvl) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(getFirstStationCodeName(getMainVia(rvl)));
		
		sb.append("--");
		
		sb.append(getViaDescription(rvl));
		
		sb.append("--");
		
		sb.append(getLastStationCodeName(getMainVia(rvl)));
		
		return sb.toString();
		
	}
	
	
	
	/**
	 * Gets the main via.
	 *
	 * @param rvl the rvl
	 * @return the main via
	 */
	private static ViaStation getMainVia(EList<RegionalValidity> rvl) {
		
		if (rvl == null || rvl.isEmpty()) {
			return null;
		}
		
		ViaStation via = rvl.get(0).getViaStation();

		return via;
	}

	
	/**
	 * Gets the via description.
	 *
	 * @param regionalValidity the regional validity
	 * @return the via description
	 */
	public static String getViaDescription(EList<RegionalValidity> regionalValidity) {
		
		if (regionalValidity.isEmpty()) {
			return "missing route";
		}
		
		ViaStation via = regionalValidity.get(0).getViaStation();
		if (via == null ||
			via.getRoute() == null || 
			via.getRoute().getStations() == null ||
			via.getRoute().getStations().isEmpty() ) {
				return " "; //$NON-NLS-1$
		}
		
		Route route = via.getRoute();
		
		if (via.getRoute().getStations().size() < 3) {
			return "";
		}
		
		int first = 1;
		int last = route.getStations().size() - 1;
		
		try {
			StringBuilder label = new StringBuilder();
			for (int i = first; i < last; i++) {
				if (i > first) {
					label.append("*");
				}
				label.append(getRouteDescription(route.getStations().get(i)));			
			}
			return label.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return " ";
		}

	}

	/**
	 * Gets the route description 
	 *
	 * @param via the via
	 * @return the route description
	 */
	public static String getRouteDescription(ViaStation via) {
		
		if (via.getStation()!= null) {
			return getShortNameCaseASCII(via.getStation());
		} 
		if (via.getFareStationSet() != null) {
			return via.getFareStationSet().getName();
		}
		
		StringBuilder label = new StringBuilder();
		
		if (via.getRoute()!= null && via.getRoute().getStations() != null && !via.getRoute().getStations().isEmpty() ) {
			label.append(getRouteDescription(via.getRoute()));
			return label.toString();
		}
			
		if (via.getAlternativeRoutes()!= null && !via.getAlternativeRoutes().isEmpty()) {
			for (AlternativeRoute route : via.getAlternativeRoutes() ) {
				if (label.length() > 1) {
					label.append("/"); //$NON-NLS-1$
				}
				label.append(getRouteDescription(route));
			}		
		}
			
		return label.toString();

	}
	
	/**
	 * Gets the route description.
	 *
	 * @param route the route
	 * @return the route description
	 */
	public static String getRouteDescription(AlternativeRoute route) {
		
			if (route.getStations()==null || route.getStations().isEmpty()) return "";
			
			StringBuilder  routeLable = new StringBuilder(); //$NON-NLS-1$
			
			if (route.getStations().size() > 1) {
				routeLable.append("("); //$NON-NLS-1$
			}
		
			for (ViaStation via2 :  route.getStations()) {
				if (routeLable.length() < 2 || routeLable.substring(routeLable.length()-1,routeLable.length()).equals("*")) { //$NON-NLS-1$
					routeLable.append(getRouteDescription(via2));
				} else {
					routeLable.append("*").append(getRouteDescription(via2)); //$NON-NLS-1$
				}
			}
			
			if (route.getStations().size() > 1) {
				routeLable.append(")"); //$NON-NLS-1$
			}
			return routeLable.toString();	
	}
	
	/**
	 * Gets the route description.
	 *
	 * @param route the route
	 * @return the route description
	 */
	public static String getRouteDescription(Route route) {
		
		if (route.getStations()==null || route.getStations().isEmpty()) return "";
		
		StringBuilder  routeLable = new StringBuilder(); //$NON-NLS-1$
			
		for (ViaStation via2 :  route.getStations()) {
			if (routeLable.length() == 0 || routeLable.substring(routeLable.length()-1,routeLable.length()).equals("*")) { //$NON-NLS-1$
				routeLable.append(getRouteDescription(via2));
			} else {
				routeLable.append("*").append(getRouteDescription(via2)); //$NON-NLS-1$
			}
		}
		
		return routeLable.toString();	
	}
	
	
	/**
	 * Gets the last station code name.
	 *
	 * @param viaStation the via station
	 * @return the last station code name
	 */
	private static String getLastStationCodeName(ViaStation viaStation) {
		
		if (viaStation == null) {
			return "missing arrival";
		}
		
		ViaStation via = viaStation.getRoute().getStations().get(viaStation.getRoute().getStations().size() - 1);
		if (via.getStation() != null) {
			return getFullName(via.getStation());
		} else if (via.getFareStationSet() != null) {
			return via.getFareStationSet().getName();
		}
		return null;
	}

	/**
	 * Gets the first station code name.
	 *
	 * @param viaStation the via station
	 * @return the first station code name
	 */
	private static String getFirstStationCodeName(ViaStation viaStation) {
		
		if (viaStation == null) {
			return "missing departure";
		}
		
		ViaStation via = viaStation.getRoute().getStations().get(0);
		if (via.getStation() != null) {
			return getFullName(via.getStation());
		} else if (via.getFareStationSet() != null) {
			return via.getFareStationSet().getName();
		}
		return null;
	}
	
	/**
	 * Gets the full name.
	 *
	 * @param station the station
	 * @return the full name
	 */
	public static String getFullName(Station station) {
		

		if (station.getNameCaseASCII() != null && station.getNameCaseASCII().length() > 0) {
			return station.getNameCaseASCII().trim();
		}
		if (station.getName() != null && station.getName().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getName()).trim();
		}		
		if (station.getNameCaseUTF8() != null && station.getNameCaseUTF8().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getNameCaseUTF8()).trim();
		}		
		if (station.getShortNameCaseASCII() != null && station.getShortNameCaseASCII().length() > 0) {
			return station.getShortNameCaseASCII().trim();
		}		
		if (station.getShortNameCaseUTF8() != null && station.getShortNameCaseUTF8().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getShortNameCaseUTF8()).trim();
		}			
		

		return null;
	}
	
	/**
	 * Gets the short name case ASCII.
	 *
	 * @param station the station
	 * @return the short name case ASCII
	 */
	public static String getShortNameCaseASCII(Station station) {
		
		if (station.getShortNameCaseASCII() != null && station.getShortNameCaseASCII().length() > 0) {
			return station.getShortNameCaseASCII().trim();
		}
		if (station.getShortNameCaseUTF8() != null && station.getShortNameCaseUTF8().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getShortNameCaseUTF8()).trim();
		}	
		if (station.getNameCaseASCII() != null && station.getNameCaseASCII().length() > 0) {
			return station.getNameCaseASCII().trim();
		}
		if (station.getName() != null && station.getName().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getName()).trim();
		}			
		if (station.getNameCaseUTF8() != null && station.getNameCaseUTF8().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getNameCaseUTF8()).trim();
		}		

		return null;

	}

}

