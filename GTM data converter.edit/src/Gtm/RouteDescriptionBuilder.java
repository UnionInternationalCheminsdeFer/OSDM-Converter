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
	 * @param rc the regional constraint
	 * @return the route description
	 */
	public static String getRouteDescription(RegionalConstraint rc) {
		
		StringBuilder sb = new StringBuilder();
		
		
		if (rc.getEntryConnectionPoint() != null 
			&& rc.getEntryConnectionPoint().getConnectedStationSets() != null 
			&& rc.getEntryConnectionPoint().getConnectedStationSets().size() > 1) {
			String label = GtmUtils.getLabelText(rc.getEntryConnectionPoint());
			if (label != null && label.length() > 0) {
				sb.append(label).append(" ");
			}
			sb.append("--> ");
		}
		
		sb.append(getRouteDescription(rc.getRegionalValidity()));
		
		if (rc.getExitConnectionPoint() != null 
			&& rc.getExitConnectionPoint().getConnectedStationSets() != null 
			&& rc.getExitConnectionPoint().getConnectedStationSets().size() > 1) {
			sb.append("--> ");
			String label = GtmUtils.getLabelText(rc.getExitConnectionPoint());
			if (label != null && label.length() > 0) {
				sb.append(label).append(" ");
			}
			
		}
		
		return sb.toString();
		
	}
	
	
	/**
	 * Gets the route description.
	 *
	 * @param rvl the rvl
	 * @return the route description
	 */
	public static String getRouteDescription(EList<RegionalValidity> rvl) {
		
		String start = getFirstStationCodeName(getMainVia(rvl));
		String via = getViaDescription(rvl);
		String last = getLastStationCodeName(getMainVia(rvl));
		
		StringBuilder sb = new StringBuilder();
		
		if (start != null) {
			sb.append(start);
		}
		if ((via == null || via.length() == 0)
			&& (last == null || last.length() == 0)) {
			return sb.toString();
		}
		
		if (start != null && start.length() > 0) {	
			sb.append(" -- ");
		}
		if (via != null) {
			sb.append(via);
		}
		
		if (last == null || last.length() == 0) {
			return sb.toString();
		}
		sb.append(" -- ");
		sb.append(last);
		
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
	 * @param regionalValidities the regional validity
	 * @return the via description
	 */
	public static String getViaDescription(EList<RegionalValidity> regionalValidities) {
		
		if (regionalValidities == null || regionalValidities.isEmpty()) {
			return "missing route";
		}
		
		StringBuilder label = new StringBuilder();
		label.append("");

		RegionalValidity regionalValidity = regionalValidities.get(0);
		ViaStation via = regionalValidity.getViaStation();
		
		if (regionalValidity.getServiceConstraint() != null && via.getServiceConstraint() == null) {
			label.append(getText(regionalValidity.getServiceConstraint()));
		} else if (via.getServiceConstraint() != null) {
			label.append(getText(via.getServiceConstraint()));
		}
		

		if (via == null ||
			via.getRoute() == null || 
			via.getRoute().getStations() == null ||
			via.getRoute().getStations().isEmpty() ) {
				return label.toString(); //$NON-NLS-1$
		}
		
		Route route = via.getRoute();
		
		if (via.getRoute().getStations().size() < 3) {
			return label.toString();
		}
		
		int first = 1;
		int last = route.getStations().size() - 1;
		
		try {
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
		
		StringBuilder label = new StringBuilder();
		
		if (via.getServiceConstraint() != null) {
			label.append(getText(via.getServiceConstraint()));
		}
		
		if (via.getStation()!= null) {
			if (label.length() > 0) {
				label.append("*");
			}
			label.append(getShortNameCaseASCII(via.getStation()));
		} 
		if (via.getFareStationSet() != null) {
			if (label.length() > 0) {
				label.append("*");
			}
			label.append(via.getFareStationSet().getName());
		}
		
		if (via.getRoute()!= null && via.getRoute().getStations() != null && !via.getRoute().getStations().isEmpty() ) {
			label.append(getRouteDescription(via.getRoute()));
			return label.toString();
		}
			
		if (via.getAlternativeRoutes()!= null && !via.getAlternativeRoutes().isEmpty()) {
			label.append("(");
			for (AlternativeRoute route : via.getAlternativeRoutes() ) {
				if (label.length() > 1) {
					label.append("/"); //$NON-NLS-1$
				}
				label.append(getRouteDescription(route));
			}		
			label.append(")");
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
					
			for (ViaStation via2 :  route.getStations()) {
				if (routeLable.length() < 1 || routeLable.substring(routeLable.length()-1,routeLable.length()).equals("*")) { //$NON-NLS-1$
					routeLable.append(getRouteDescription(via2));
				} else {
					routeLable.append("*").append(getRouteDescription(via2)); //$NON-NLS-1$
				}
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
		if (viaStation.getRoute() == null || 
			viaStation.getRoute().getStations().size() < 2) {
			return "";
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
		if (viaStation.getRoute() == null || 
			viaStation.getRoute().getStations().isEmpty()) {
			return " - ";
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
	
	
	public static String getText(ServiceConstraint sc) {
		
		StringBuilder sb = new StringBuilder();
		
		if (sc.getDescription() != null && sc.getDescription().getShortTextICAO()!= null && sc.getDescription().getShortTextICAO().length() > 0 ) {
			
			sb.append(sc.getDescription().getShortTextICAO());
			return sb.toString();
			
		}
		
		
		
		if (sc.getIncludedServiceBrands() != null && !sc.getIncludedServiceBrands().isEmpty()) {
			
			for (ServiceBrand s : sc.getIncludedServiceBrands()) {
				if (sb.length() > 0) {
					sb.append("/");
				}
				if (s.getLocalLanguageName() != null && s.getLocalLanguageName().length() > 0) {
					sb.append(s.getLocalLanguageName());
				} else if (s.getAbbreviation() != null && s.getAbbreviation().length() > 0) {
					sb.append(s.getAbbreviation());
				} else if (s.getDescription() != null && s.getDescription().length() > 0) {
					sb.append(s.getDescription());
				} 
			}
		}
		
		return sb.toString();
		
	}

}

