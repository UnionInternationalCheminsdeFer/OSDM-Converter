//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r NameOfClassGroupOfEntitiesRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassGroupOfEntitiesRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="AccessSpace"/>
 *     &lt;enumeration value="AccessZone"/>
 *     &lt;enumeration value="AddressablePlace"/>
 *     &lt;enumeration value="AdministrativeZone"/>
 *     &lt;enumeration value="BoardingPosition"/>
 *     &lt;enumeration value="ComplexFeature"/>
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="CrewBase"/>
 *     &lt;enumeration value="Deck"/>
 *     &lt;enumeration value="DeckVehicleEntrance"/>
 *     &lt;enumeration value="DeckWindow"/>
 *     &lt;enumeration value="Entrance"/>
 *     &lt;enumeration value="EquipmentPlace"/>
 *     &lt;enumeration value="EquipmentPosition"/>
 *     &lt;enumeration value="FareTable"/>
 *     &lt;enumeration value="FareTableInContext"/>
 *     &lt;enumeration value="FareZone"/>
 *     &lt;enumeration value="Fleet"/>
 *     &lt;enumeration value="FlexibleArea"/>
 *     &lt;enumeration value="FlexibleQuay"/>
 *     &lt;enumeration value="FlexibleStopPlace"/>
 *     &lt;enumeration value="Garage"/>
 *     &lt;enumeration value="GeneralGroupOfEntities"/>
 *     &lt;enumeration value="GeneralZone"/>
 *     &lt;enumeration value="GroupOfDistanceMatrixElements"/>
 *     &lt;enumeration value="GroupOfDistributionChannels"/>
 *     &lt;enumeration value="GroupOfLines"/>
 *     &lt;enumeration value="GroupOfLinkSequences"/>
 *     &lt;enumeration value="GroupOfLinks"/>
 *     &lt;enumeration value="GroupOfOperators"/>
 *     &lt;enumeration value="GroupOfPlaces"/>
 *     &lt;enumeration value="GroupOfPoints"/>
 *     &lt;enumeration value="GroupOfSalesOfferPackages"/>
 *     &lt;enumeration value="GroupOfServices"/>
 *     &lt;enumeration value="GroupOfSingleJourneys"/>
 *     &lt;enumeration value="GroupOfSites"/>
 *     &lt;enumeration value="GroupOfStopPlaces"/>
 *     &lt;enumeration value="GroupOfTariffZones"/>
 *     &lt;enumeration value="GroupOfTimebands"/>
 *     &lt;enumeration value="GroupOfTimingLinks"/>
 *     &lt;enumeration value="HailAndRideArea"/>
 *     &lt;enumeration value="HeadwayJourneyGroup"/>
 *     &lt;enumeration value="JourneyPart"/>
 *     &lt;enumeration value="Layer"/>
 *     &lt;enumeration value="LuggageSpot"/>
 *     &lt;enumeration value="MobilityServiceConstraintZone"/>
 *     &lt;enumeration value="MonitoredVehicleSharingParkingBay"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="OtherDeckEntrance"/>
 *     &lt;enumeration value="OtherDeckSpace"/>
 *     &lt;enumeration value="Parking"/>
 *     &lt;enumeration value="ParkingArea"/>
 *     &lt;enumeration value="ParkingBay"/>
 *     &lt;enumeration value="ParkingComponent"/>
 *     &lt;enumeration value="ParkingEntranceForVehicles"/>
 *     &lt;enumeration value="ParkingPassengerEntrance"/>
 *     &lt;enumeration value="PassengerEntrance"/>
 *     &lt;enumeration value="PassengerSpace"/>
 *     &lt;enumeration value="PassengerSpot"/>
 *     &lt;enumeration value="PassengerVehicleSpot"/>
 *     &lt;enumeration value="PathJunction"/>
 *     &lt;enumeration value="Point"/>
 *     &lt;enumeration value="PointOfInterest"/>
 *     &lt;enumeration value="PointOfInterestClassificationHierarchy"/>
 *     &lt;enumeration value="PointOfInterestEntrance"/>
 *     &lt;enumeration value="PointOfInterestSpace"/>
 *     &lt;enumeration value="PointOfInterestVehicleEntrance"/>
 *     &lt;enumeration value="PoolOfVehicles"/>
 *     &lt;enumeration value="PostalAddress"/>
 *     &lt;enumeration value="PriceGroup"/>
 *     &lt;enumeration value="Quay"/>
 *     &lt;enumeration value="RechargingBay"/>
 *     &lt;enumeration value="RechargingStation"/>
 *     &lt;enumeration value="RhythmicalJourneyGroup"/>
 *     &lt;enumeration value="RoadAddress"/>
 *     &lt;enumeration value="RoutingConstraintZone"/>
 *     &lt;enumeration value="ServiceSite"/>
 *     &lt;enumeration value="SimpleFeature"/>
 *     &lt;enumeration value="SitePathJunction"/>
 *     &lt;enumeration value="SpatialFeature"/>
 *     &lt;enumeration value="StandardFareTable"/>
 *     &lt;enumeration value="StopArea"/>
 *     &lt;enumeration value="StopPlace"/>
 *     &lt;enumeration value="StopPlaceEntrance"/>
 *     &lt;enumeration value="StopPlaceVehicleEntrance"/>
 *     &lt;enumeration value="TariffZone"/>
 *     &lt;enumeration value="TaxiParkingArea"/>
 *     &lt;enumeration value="TaxiRank"/>
 *     &lt;enumeration value="TaxiStand"/>
 *     &lt;enumeration value="TopographicPlace"/>
 *     &lt;enumeration value="TransportAdministrativeZone"/>
 *     &lt;enumeration value="VehicleMeetingPlace"/>
 *     &lt;enumeration value="VehiclePoolingMeetingPlace"/>
 *     &lt;enumeration value="VehiclePoolingParkingArea"/>
 *     &lt;enumeration value="VehiclePoolingParkingBay"/>
 *     &lt;enumeration value="VehicleSharingParkingArea"/>
 *     &lt;enumeration value="VehicleSharingParkingBay"/>
 *     &lt;enumeration value="VehicleStoppingPlace"/>
 *     &lt;enumeration value="VehicleStoppingPosition"/>
 *     &lt;enumeration value="VehicleTypeZoneRestriction"/>
 *     &lt;enumeration value="Zone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassGroupOfEntitiesRefStructureType")
@XmlEnum
public enum NameOfClassGroupOfEntitiesRefStructureType {

    @XmlEnumValue("AccessSpace")
    ACCESS_SPACE("AccessSpace"),
    @XmlEnumValue("AccessZone")
    ACCESS_ZONE("AccessZone"),
    @XmlEnumValue("AddressablePlace")
    ADDRESSABLE_PLACE("AddressablePlace"),
    @XmlEnumValue("AdministrativeZone")
    ADMINISTRATIVE_ZONE("AdministrativeZone"),
    @XmlEnumValue("BoardingPosition")
    BOARDING_POSITION("BoardingPosition"),
    @XmlEnumValue("ComplexFeature")
    COMPLEX_FEATURE("ComplexFeature"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("CrewBase")
    CREW_BASE("CrewBase"),
    @XmlEnumValue("Deck")
    DECK("Deck"),
    @XmlEnumValue("DeckVehicleEntrance")
    DECK_VEHICLE_ENTRANCE("DeckVehicleEntrance"),
    @XmlEnumValue("DeckWindow")
    DECK_WINDOW("DeckWindow"),
    @XmlEnumValue("Entrance")
    ENTRANCE("Entrance"),
    @XmlEnumValue("EquipmentPlace")
    EQUIPMENT_PLACE("EquipmentPlace"),
    @XmlEnumValue("EquipmentPosition")
    EQUIPMENT_POSITION("EquipmentPosition"),
    @XmlEnumValue("FareTable")
    FARE_TABLE("FareTable"),
    @XmlEnumValue("FareTableInContext")
    FARE_TABLE_IN_CONTEXT("FareTableInContext"),
    @XmlEnumValue("FareZone")
    FARE_ZONE("FareZone"),
    @XmlEnumValue("Fleet")
    FLEET("Fleet"),
    @XmlEnumValue("FlexibleArea")
    FLEXIBLE_AREA("FlexibleArea"),
    @XmlEnumValue("FlexibleQuay")
    FLEXIBLE_QUAY("FlexibleQuay"),
    @XmlEnumValue("FlexibleStopPlace")
    FLEXIBLE_STOP_PLACE("FlexibleStopPlace"),
    @XmlEnumValue("Garage")
    GARAGE("Garage"),
    @XmlEnumValue("GeneralGroupOfEntities")
    GENERAL_GROUP_OF_ENTITIES("GeneralGroupOfEntities"),
    @XmlEnumValue("GeneralZone")
    GENERAL_ZONE("GeneralZone"),
    @XmlEnumValue("GroupOfDistanceMatrixElements")
    GROUP_OF_DISTANCE_MATRIX_ELEMENTS("GroupOfDistanceMatrixElements"),
    @XmlEnumValue("GroupOfDistributionChannels")
    GROUP_OF_DISTRIBUTION_CHANNELS("GroupOfDistributionChannels"),
    @XmlEnumValue("GroupOfLines")
    GROUP_OF_LINES("GroupOfLines"),
    @XmlEnumValue("GroupOfLinkSequences")
    GROUP_OF_LINK_SEQUENCES("GroupOfLinkSequences"),
    @XmlEnumValue("GroupOfLinks")
    GROUP_OF_LINKS("GroupOfLinks"),
    @XmlEnumValue("GroupOfOperators")
    GROUP_OF_OPERATORS("GroupOfOperators"),
    @XmlEnumValue("GroupOfPlaces")
    GROUP_OF_PLACES("GroupOfPlaces"),
    @XmlEnumValue("GroupOfPoints")
    GROUP_OF_POINTS("GroupOfPoints"),
    @XmlEnumValue("GroupOfSalesOfferPackages")
    GROUP_OF_SALES_OFFER_PACKAGES("GroupOfSalesOfferPackages"),
    @XmlEnumValue("GroupOfServices")
    GROUP_OF_SERVICES("GroupOfServices"),
    @XmlEnumValue("GroupOfSingleJourneys")
    GROUP_OF_SINGLE_JOURNEYS("GroupOfSingleJourneys"),
    @XmlEnumValue("GroupOfSites")
    GROUP_OF_SITES("GroupOfSites"),
    @XmlEnumValue("GroupOfStopPlaces")
    GROUP_OF_STOP_PLACES("GroupOfStopPlaces"),
    @XmlEnumValue("GroupOfTariffZones")
    GROUP_OF_TARIFF_ZONES("GroupOfTariffZones"),
    @XmlEnumValue("GroupOfTimebands")
    GROUP_OF_TIMEBANDS("GroupOfTimebands"),
    @XmlEnumValue("GroupOfTimingLinks")
    GROUP_OF_TIMING_LINKS("GroupOfTimingLinks"),
    @XmlEnumValue("HailAndRideArea")
    HAIL_AND_RIDE_AREA("HailAndRideArea"),
    @XmlEnumValue("HeadwayJourneyGroup")
    HEADWAY_JOURNEY_GROUP("HeadwayJourneyGroup"),
    @XmlEnumValue("JourneyPart")
    JOURNEY_PART("JourneyPart"),
    @XmlEnumValue("Layer")
    LAYER("Layer"),
    @XmlEnumValue("LuggageSpot")
    LUGGAGE_SPOT("LuggageSpot"),
    @XmlEnumValue("MobilityServiceConstraintZone")
    MOBILITY_SERVICE_CONSTRAINT_ZONE("MobilityServiceConstraintZone"),
    @XmlEnumValue("MonitoredVehicleSharingParkingBay")
    MONITORED_VEHICLE_SHARING_PARKING_BAY("MonitoredVehicleSharingParkingBay"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("OtherDeckEntrance")
    OTHER_DECK_ENTRANCE("OtherDeckEntrance"),
    @XmlEnumValue("OtherDeckSpace")
    OTHER_DECK_SPACE("OtherDeckSpace"),
    @XmlEnumValue("Parking")
    PARKING("Parking"),
    @XmlEnumValue("ParkingArea")
    PARKING_AREA("ParkingArea"),
    @XmlEnumValue("ParkingBay")
    PARKING_BAY("ParkingBay"),
    @XmlEnumValue("ParkingComponent")
    PARKING_COMPONENT("ParkingComponent"),
    @XmlEnumValue("ParkingEntranceForVehicles")
    PARKING_ENTRANCE_FOR_VEHICLES("ParkingEntranceForVehicles"),
    @XmlEnumValue("ParkingPassengerEntrance")
    PARKING_PASSENGER_ENTRANCE("ParkingPassengerEntrance"),
    @XmlEnumValue("PassengerEntrance")
    PASSENGER_ENTRANCE("PassengerEntrance"),
    @XmlEnumValue("PassengerSpace")
    PASSENGER_SPACE("PassengerSpace"),
    @XmlEnumValue("PassengerSpot")
    PASSENGER_SPOT("PassengerSpot"),
    @XmlEnumValue("PassengerVehicleSpot")
    PASSENGER_VEHICLE_SPOT("PassengerVehicleSpot"),
    @XmlEnumValue("PathJunction")
    PATH_JUNCTION("PathJunction"),
    @XmlEnumValue("Point")
    POINT("Point"),
    @XmlEnumValue("PointOfInterest")
    POINT_OF_INTEREST("PointOfInterest"),
    @XmlEnumValue("PointOfInterestClassificationHierarchy")
    POINT_OF_INTEREST_CLASSIFICATION_HIERARCHY("PointOfInterestClassificationHierarchy"),
    @XmlEnumValue("PointOfInterestEntrance")
    POINT_OF_INTEREST_ENTRANCE("PointOfInterestEntrance"),
    @XmlEnumValue("PointOfInterestSpace")
    POINT_OF_INTEREST_SPACE("PointOfInterestSpace"),
    @XmlEnumValue("PointOfInterestVehicleEntrance")
    POINT_OF_INTEREST_VEHICLE_ENTRANCE("PointOfInterestVehicleEntrance"),
    @XmlEnumValue("PoolOfVehicles")
    POOL_OF_VEHICLES("PoolOfVehicles"),
    @XmlEnumValue("PostalAddress")
    POSTAL_ADDRESS("PostalAddress"),
    @XmlEnumValue("PriceGroup")
    PRICE_GROUP("PriceGroup"),
    @XmlEnumValue("Quay")
    QUAY("Quay"),
    @XmlEnumValue("RechargingBay")
    RECHARGING_BAY("RechargingBay"),
    @XmlEnumValue("RechargingStation")
    RECHARGING_STATION("RechargingStation"),
    @XmlEnumValue("RhythmicalJourneyGroup")
    RHYTHMICAL_JOURNEY_GROUP("RhythmicalJourneyGroup"),
    @XmlEnumValue("RoadAddress")
    ROAD_ADDRESS("RoadAddress"),
    @XmlEnumValue("RoutingConstraintZone")
    ROUTING_CONSTRAINT_ZONE("RoutingConstraintZone"),
    @XmlEnumValue("ServiceSite")
    SERVICE_SITE("ServiceSite"),
    @XmlEnumValue("SimpleFeature")
    SIMPLE_FEATURE("SimpleFeature"),
    @XmlEnumValue("SitePathJunction")
    SITE_PATH_JUNCTION("SitePathJunction"),
    @XmlEnumValue("SpatialFeature")
    SPATIAL_FEATURE("SpatialFeature"),
    @XmlEnumValue("StandardFareTable")
    STANDARD_FARE_TABLE("StandardFareTable"),
    @XmlEnumValue("StopArea")
    STOP_AREA("StopArea"),
    @XmlEnumValue("StopPlace")
    STOP_PLACE("StopPlace"),
    @XmlEnumValue("StopPlaceEntrance")
    STOP_PLACE_ENTRANCE("StopPlaceEntrance"),
    @XmlEnumValue("StopPlaceVehicleEntrance")
    STOP_PLACE_VEHICLE_ENTRANCE("StopPlaceVehicleEntrance"),
    @XmlEnumValue("TariffZone")
    TARIFF_ZONE("TariffZone"),
    @XmlEnumValue("TaxiParkingArea")
    TAXI_PARKING_AREA("TaxiParkingArea"),
    @XmlEnumValue("TaxiRank")
    TAXI_RANK("TaxiRank"),
    @XmlEnumValue("TaxiStand")
    TAXI_STAND("TaxiStand"),
    @XmlEnumValue("TopographicPlace")
    TOPOGRAPHIC_PLACE("TopographicPlace"),
    @XmlEnumValue("TransportAdministrativeZone")
    TRANSPORT_ADMINISTRATIVE_ZONE("TransportAdministrativeZone"),
    @XmlEnumValue("VehicleMeetingPlace")
    VEHICLE_MEETING_PLACE("VehicleMeetingPlace"),
    @XmlEnumValue("VehiclePoolingMeetingPlace")
    VEHICLE_POOLING_MEETING_PLACE("VehiclePoolingMeetingPlace"),
    @XmlEnumValue("VehiclePoolingParkingArea")
    VEHICLE_POOLING_PARKING_AREA("VehiclePoolingParkingArea"),
    @XmlEnumValue("VehiclePoolingParkingBay")
    VEHICLE_POOLING_PARKING_BAY("VehiclePoolingParkingBay"),
    @XmlEnumValue("VehicleSharingParkingArea")
    VEHICLE_SHARING_PARKING_AREA("VehicleSharingParkingArea"),
    @XmlEnumValue("VehicleSharingParkingBay")
    VEHICLE_SHARING_PARKING_BAY("VehicleSharingParkingBay"),
    @XmlEnumValue("VehicleStoppingPlace")
    VEHICLE_STOPPING_PLACE("VehicleStoppingPlace"),
    @XmlEnumValue("VehicleStoppingPosition")
    VEHICLE_STOPPING_POSITION("VehicleStoppingPosition"),
    @XmlEnumValue("VehicleTypeZoneRestriction")
    VEHICLE_TYPE_ZONE_RESTRICTION("VehicleTypeZoneRestriction"),
    @XmlEnumValue("Zone")
    ZONE("Zone");
    private final String value;

    NameOfClassGroupOfEntitiesRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassGroupOfEntitiesRefStructureType fromValue(String v) {
        for (NameOfClassGroupOfEntitiesRefStructureType c: NameOfClassGroupOfEntitiesRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
