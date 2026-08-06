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
 * <p>Java-Klasse f�r NameOfClassZoneRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassZoneRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassGroupOfPointsRefStructureType">
 *     &lt;enumeration value="AccessSpace"/>
 *     &lt;enumeration value="AccessZone"/>
 *     &lt;enumeration value="AddressablePlace"/>
 *     &lt;enumeration value="AdministrativeZone"/>
 *     &lt;enumeration value="BoardingPosition"/>
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="Deck"/>
 *     &lt;enumeration value="DeckVehicleEntrance"/>
 *     &lt;enumeration value="DeckWindow"/>
 *     &lt;enumeration value="Entrance"/>
 *     &lt;enumeration value="EquipmentPlace"/>
 *     &lt;enumeration value="FareZone"/>
 *     &lt;enumeration value="FlexibleArea"/>
 *     &lt;enumeration value="FlexibleQuay"/>
 *     &lt;enumeration value="FlexibleStopPlace"/>
 *     &lt;enumeration value="Garage"/>
 *     &lt;enumeration value="GeneralZone"/>
 *     &lt;enumeration value="HailAndRideArea"/>
 *     &lt;enumeration value="LuggageSpot"/>
 *     &lt;enumeration value="MobilityServiceConstraintZone"/>
 *     &lt;enumeration value="MonitoredVehicleSharingParkingBay"/>
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
 *     &lt;enumeration value="PointOfInterest"/>
 *     &lt;enumeration value="PointOfInterestEntrance"/>
 *     &lt;enumeration value="PointOfInterestSpace"/>
 *     &lt;enumeration value="PointOfInterestVehicleEntrance"/>
 *     &lt;enumeration value="PostalAddress"/>
 *     &lt;enumeration value="Quay"/>
 *     &lt;enumeration value="RechargingBay"/>
 *     &lt;enumeration value="RechargingStation"/>
 *     &lt;enumeration value="RoadAddress"/>
 *     &lt;enumeration value="RoutingConstraintZone"/>
 *     &lt;enumeration value="ServiceSite"/>
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
@XmlType(name = "NameOfClassZoneRefStructureType")
@XmlEnum(NameOfClassGroupOfPointsRefStructureType.class)
public enum NameOfClassZoneRefStructureType {

    @XmlEnumValue("AccessSpace")
    ACCESS_SPACE(NameOfClassGroupOfPointsRefStructureType.ACCESS_SPACE),
    @XmlEnumValue("AccessZone")
    ACCESS_ZONE(NameOfClassGroupOfPointsRefStructureType.ACCESS_ZONE),
    @XmlEnumValue("AddressablePlace")
    ADDRESSABLE_PLACE(NameOfClassGroupOfPointsRefStructureType.ADDRESSABLE_PLACE),
    @XmlEnumValue("AdministrativeZone")
    ADMINISTRATIVE_ZONE(NameOfClassGroupOfPointsRefStructureType.ADMINISTRATIVE_ZONE),
    @XmlEnumValue("BoardingPosition")
    BOARDING_POSITION(NameOfClassGroupOfPointsRefStructureType.BOARDING_POSITION),
    @XmlEnumValue("Country")
    COUNTRY(NameOfClassGroupOfPointsRefStructureType.COUNTRY),
    @XmlEnumValue("Deck")
    DECK(NameOfClassGroupOfPointsRefStructureType.DECK),
    @XmlEnumValue("DeckVehicleEntrance")
    DECK_VEHICLE_ENTRANCE(NameOfClassGroupOfPointsRefStructureType.DECK_VEHICLE_ENTRANCE),
    @XmlEnumValue("DeckWindow")
    DECK_WINDOW(NameOfClassGroupOfPointsRefStructureType.DECK_WINDOW),
    @XmlEnumValue("Entrance")
    ENTRANCE(NameOfClassGroupOfPointsRefStructureType.ENTRANCE),
    @XmlEnumValue("EquipmentPlace")
    EQUIPMENT_PLACE(NameOfClassGroupOfPointsRefStructureType.EQUIPMENT_PLACE),
    @XmlEnumValue("FareZone")
    FARE_ZONE(NameOfClassGroupOfPointsRefStructureType.FARE_ZONE),
    @XmlEnumValue("FlexibleArea")
    FLEXIBLE_AREA(NameOfClassGroupOfPointsRefStructureType.FLEXIBLE_AREA),
    @XmlEnumValue("FlexibleQuay")
    FLEXIBLE_QUAY(NameOfClassGroupOfPointsRefStructureType.FLEXIBLE_QUAY),
    @XmlEnumValue("FlexibleStopPlace")
    FLEXIBLE_STOP_PLACE(NameOfClassGroupOfPointsRefStructureType.FLEXIBLE_STOP_PLACE),
    @XmlEnumValue("Garage")
    GARAGE(NameOfClassGroupOfPointsRefStructureType.GARAGE),
    @XmlEnumValue("GeneralZone")
    GENERAL_ZONE(NameOfClassGroupOfPointsRefStructureType.GENERAL_ZONE),
    @XmlEnumValue("HailAndRideArea")
    HAIL_AND_RIDE_AREA(NameOfClassGroupOfPointsRefStructureType.HAIL_AND_RIDE_AREA),
    @XmlEnumValue("LuggageSpot")
    LUGGAGE_SPOT(NameOfClassGroupOfPointsRefStructureType.LUGGAGE_SPOT),
    @XmlEnumValue("MobilityServiceConstraintZone")
    MOBILITY_SERVICE_CONSTRAINT_ZONE(NameOfClassGroupOfPointsRefStructureType.MOBILITY_SERVICE_CONSTRAINT_ZONE),
    @XmlEnumValue("MonitoredVehicleSharingParkingBay")
    MONITORED_VEHICLE_SHARING_PARKING_BAY(NameOfClassGroupOfPointsRefStructureType.MONITORED_VEHICLE_SHARING_PARKING_BAY),
    @XmlEnumValue("OtherDeckEntrance")
    OTHER_DECK_ENTRANCE(NameOfClassGroupOfPointsRefStructureType.OTHER_DECK_ENTRANCE),
    @XmlEnumValue("OtherDeckSpace")
    OTHER_DECK_SPACE(NameOfClassGroupOfPointsRefStructureType.OTHER_DECK_SPACE),
    @XmlEnumValue("Parking")
    PARKING(NameOfClassGroupOfPointsRefStructureType.PARKING),
    @XmlEnumValue("ParkingArea")
    PARKING_AREA(NameOfClassGroupOfPointsRefStructureType.PARKING_AREA),
    @XmlEnumValue("ParkingBay")
    PARKING_BAY(NameOfClassGroupOfPointsRefStructureType.PARKING_BAY),
    @XmlEnumValue("ParkingComponent")
    PARKING_COMPONENT(NameOfClassGroupOfPointsRefStructureType.PARKING_COMPONENT),
    @XmlEnumValue("ParkingEntranceForVehicles")
    PARKING_ENTRANCE_FOR_VEHICLES(NameOfClassGroupOfPointsRefStructureType.PARKING_ENTRANCE_FOR_VEHICLES),
    @XmlEnumValue("ParkingPassengerEntrance")
    PARKING_PASSENGER_ENTRANCE(NameOfClassGroupOfPointsRefStructureType.PARKING_PASSENGER_ENTRANCE),
    @XmlEnumValue("PassengerEntrance")
    PASSENGER_ENTRANCE(NameOfClassGroupOfPointsRefStructureType.PASSENGER_ENTRANCE),
    @XmlEnumValue("PassengerSpace")
    PASSENGER_SPACE(NameOfClassGroupOfPointsRefStructureType.PASSENGER_SPACE),
    @XmlEnumValue("PassengerSpot")
    PASSENGER_SPOT(NameOfClassGroupOfPointsRefStructureType.PASSENGER_SPOT),
    @XmlEnumValue("PassengerVehicleSpot")
    PASSENGER_VEHICLE_SPOT(NameOfClassGroupOfPointsRefStructureType.PASSENGER_VEHICLE_SPOT),
    @XmlEnumValue("PointOfInterest")
    POINT_OF_INTEREST(NameOfClassGroupOfPointsRefStructureType.POINT_OF_INTEREST),
    @XmlEnumValue("PointOfInterestEntrance")
    POINT_OF_INTEREST_ENTRANCE(NameOfClassGroupOfPointsRefStructureType.POINT_OF_INTEREST_ENTRANCE),
    @XmlEnumValue("PointOfInterestSpace")
    POINT_OF_INTEREST_SPACE(NameOfClassGroupOfPointsRefStructureType.POINT_OF_INTEREST_SPACE),
    @XmlEnumValue("PointOfInterestVehicleEntrance")
    POINT_OF_INTEREST_VEHICLE_ENTRANCE(NameOfClassGroupOfPointsRefStructureType.POINT_OF_INTEREST_VEHICLE_ENTRANCE),
    @XmlEnumValue("PostalAddress")
    POSTAL_ADDRESS(NameOfClassGroupOfPointsRefStructureType.POSTAL_ADDRESS),
    @XmlEnumValue("Quay")
    QUAY(NameOfClassGroupOfPointsRefStructureType.QUAY),
    @XmlEnumValue("RechargingBay")
    RECHARGING_BAY(NameOfClassGroupOfPointsRefStructureType.RECHARGING_BAY),
    @XmlEnumValue("RechargingStation")
    RECHARGING_STATION(NameOfClassGroupOfPointsRefStructureType.RECHARGING_STATION),
    @XmlEnumValue("RoadAddress")
    ROAD_ADDRESS(NameOfClassGroupOfPointsRefStructureType.ROAD_ADDRESS),
    @XmlEnumValue("RoutingConstraintZone")
    ROUTING_CONSTRAINT_ZONE(NameOfClassGroupOfPointsRefStructureType.ROUTING_CONSTRAINT_ZONE),
    @XmlEnumValue("ServiceSite")
    SERVICE_SITE(NameOfClassGroupOfPointsRefStructureType.SERVICE_SITE),
    @XmlEnumValue("StopArea")
    STOP_AREA(NameOfClassGroupOfPointsRefStructureType.STOP_AREA),
    @XmlEnumValue("StopPlace")
    STOP_PLACE(NameOfClassGroupOfPointsRefStructureType.STOP_PLACE),
    @XmlEnumValue("StopPlaceEntrance")
    STOP_PLACE_ENTRANCE(NameOfClassGroupOfPointsRefStructureType.STOP_PLACE_ENTRANCE),
    @XmlEnumValue("StopPlaceVehicleEntrance")
    STOP_PLACE_VEHICLE_ENTRANCE(NameOfClassGroupOfPointsRefStructureType.STOP_PLACE_VEHICLE_ENTRANCE),
    @XmlEnumValue("TariffZone")
    TARIFF_ZONE(NameOfClassGroupOfPointsRefStructureType.TARIFF_ZONE),
    @XmlEnumValue("TaxiParkingArea")
    TAXI_PARKING_AREA(NameOfClassGroupOfPointsRefStructureType.TAXI_PARKING_AREA),
    @XmlEnumValue("TaxiRank")
    TAXI_RANK(NameOfClassGroupOfPointsRefStructureType.TAXI_RANK),
    @XmlEnumValue("TaxiStand")
    TAXI_STAND(NameOfClassGroupOfPointsRefStructureType.TAXI_STAND),
    @XmlEnumValue("TopographicPlace")
    TOPOGRAPHIC_PLACE(NameOfClassGroupOfPointsRefStructureType.TOPOGRAPHIC_PLACE),
    @XmlEnumValue("TransportAdministrativeZone")
    TRANSPORT_ADMINISTRATIVE_ZONE(NameOfClassGroupOfPointsRefStructureType.TRANSPORT_ADMINISTRATIVE_ZONE),
    @XmlEnumValue("VehicleMeetingPlace")
    VEHICLE_MEETING_PLACE(NameOfClassGroupOfPointsRefStructureType.VEHICLE_MEETING_PLACE),
    @XmlEnumValue("VehiclePoolingMeetingPlace")
    VEHICLE_POOLING_MEETING_PLACE(NameOfClassGroupOfPointsRefStructureType.VEHICLE_POOLING_MEETING_PLACE),
    @XmlEnumValue("VehiclePoolingParkingArea")
    VEHICLE_POOLING_PARKING_AREA(NameOfClassGroupOfPointsRefStructureType.VEHICLE_POOLING_PARKING_AREA),
    @XmlEnumValue("VehiclePoolingParkingBay")
    VEHICLE_POOLING_PARKING_BAY(NameOfClassGroupOfPointsRefStructureType.VEHICLE_POOLING_PARKING_BAY),
    @XmlEnumValue("VehicleSharingParkingArea")
    VEHICLE_SHARING_PARKING_AREA(NameOfClassGroupOfPointsRefStructureType.VEHICLE_SHARING_PARKING_AREA),
    @XmlEnumValue("VehicleSharingParkingBay")
    VEHICLE_SHARING_PARKING_BAY(NameOfClassGroupOfPointsRefStructureType.VEHICLE_SHARING_PARKING_BAY),
    @XmlEnumValue("VehicleStoppingPlace")
    VEHICLE_STOPPING_PLACE(NameOfClassGroupOfPointsRefStructureType.VEHICLE_STOPPING_PLACE),
    @XmlEnumValue("VehicleStoppingPosition")
    VEHICLE_STOPPING_POSITION(NameOfClassGroupOfPointsRefStructureType.VEHICLE_STOPPING_POSITION),
    @XmlEnumValue("VehicleTypeZoneRestriction")
    VEHICLE_TYPE_ZONE_RESTRICTION(NameOfClassGroupOfPointsRefStructureType.VEHICLE_TYPE_ZONE_RESTRICTION),
    @XmlEnumValue("Zone")
    ZONE(NameOfClassGroupOfPointsRefStructureType.ZONE);
    private final NameOfClassGroupOfPointsRefStructureType value;

    NameOfClassZoneRefStructureType(NameOfClassGroupOfPointsRefStructureType v) {
        value = v;
    }

    public NameOfClassGroupOfPointsRefStructureType value() {
        return value;
    }

    public static NameOfClassZoneRefStructureType fromValue(NameOfClassGroupOfPointsRefStructureType v) {
        for (NameOfClassZoneRefStructureType c: NameOfClassZoneRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
