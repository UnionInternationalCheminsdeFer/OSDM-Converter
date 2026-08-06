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
 * <p>Java-Klasse f�r NameOfClassPlaceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPlaceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassGroupOfEntitiesRefStructureType">
 *     &lt;enumeration value="AccessSpace"/>
 *     &lt;enumeration value="AddressablePlace"/>
 *     &lt;enumeration value="BoardingPosition"/>
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="Entrance"/>
 *     &lt;enumeration value="EquipmentPlace"/>
 *     &lt;enumeration value="EquipmentPosition"/>
 *     &lt;enumeration value="FlexibleArea"/>
 *     &lt;enumeration value="FlexibleQuay"/>
 *     &lt;enumeration value="FlexibleStopPlace"/>
 *     &lt;enumeration value="Garage"/>
 *     &lt;enumeration value="HailAndRideArea"/>
 *     &lt;enumeration value="MonitoredVehicleSharingParkingBay"/>
 *     &lt;enumeration value="Parking"/>
 *     &lt;enumeration value="ParkingArea"/>
 *     &lt;enumeration value="ParkingBay"/>
 *     &lt;enumeration value="ParkingComponent"/>
 *     &lt;enumeration value="ParkingEntranceForVehicles"/>
 *     &lt;enumeration value="ParkingPassengerEntrance"/>
 *     &lt;enumeration value="PathJunction"/>
 *     &lt;enumeration value="Point"/>
 *     &lt;enumeration value="PointOfInterest"/>
 *     &lt;enumeration value="PointOfInterestEntrance"/>
 *     &lt;enumeration value="PointOfInterestSpace"/>
 *     &lt;enumeration value="PointOfInterestVehicleEntrance"/>
 *     &lt;enumeration value="PostalAddress"/>
 *     &lt;enumeration value="Quay"/>
 *     &lt;enumeration value="RechargingBay"/>
 *     &lt;enumeration value="RechargingStation"/>
 *     &lt;enumeration value="RoadAddress"/>
 *     &lt;enumeration value="ServiceSite"/>
 *     &lt;enumeration value="SitePathJunction"/>
 *     &lt;enumeration value="StopPlace"/>
 *     &lt;enumeration value="StopPlaceEntrance"/>
 *     &lt;enumeration value="StopPlaceVehicleEntrance"/>
 *     &lt;enumeration value="TaxiParkingArea"/>
 *     &lt;enumeration value="TaxiRank"/>
 *     &lt;enumeration value="TaxiStand"/>
 *     &lt;enumeration value="TopographicPlace"/>
 *     &lt;enumeration value="VehicleMeetingPlace"/>
 *     &lt;enumeration value="VehiclePoolingMeetingPlace"/>
 *     &lt;enumeration value="VehiclePoolingParkingArea"/>
 *     &lt;enumeration value="VehiclePoolingParkingBay"/>
 *     &lt;enumeration value="VehicleSharingParkingArea"/>
 *     &lt;enumeration value="VehicleSharingParkingBay"/>
 *     &lt;enumeration value="VehicleStoppingPlace"/>
 *     &lt;enumeration value="VehicleStoppingPosition"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPlaceRefStructureType")
@XmlEnum(NameOfClassGroupOfEntitiesRefStructureType.class)
public enum NameOfClassPlaceRefStructureType {

    @XmlEnumValue("AccessSpace")
    ACCESS_SPACE(NameOfClassGroupOfEntitiesRefStructureType.ACCESS_SPACE),
    @XmlEnumValue("AddressablePlace")
    ADDRESSABLE_PLACE(NameOfClassGroupOfEntitiesRefStructureType.ADDRESSABLE_PLACE),
    @XmlEnumValue("BoardingPosition")
    BOARDING_POSITION(NameOfClassGroupOfEntitiesRefStructureType.BOARDING_POSITION),
    @XmlEnumValue("Country")
    COUNTRY(NameOfClassGroupOfEntitiesRefStructureType.COUNTRY),
    @XmlEnumValue("Entrance")
    ENTRANCE(NameOfClassGroupOfEntitiesRefStructureType.ENTRANCE),
    @XmlEnumValue("EquipmentPlace")
    EQUIPMENT_PLACE(NameOfClassGroupOfEntitiesRefStructureType.EQUIPMENT_PLACE),
    @XmlEnumValue("EquipmentPosition")
    EQUIPMENT_POSITION(NameOfClassGroupOfEntitiesRefStructureType.EQUIPMENT_POSITION),
    @XmlEnumValue("FlexibleArea")
    FLEXIBLE_AREA(NameOfClassGroupOfEntitiesRefStructureType.FLEXIBLE_AREA),
    @XmlEnumValue("FlexibleQuay")
    FLEXIBLE_QUAY(NameOfClassGroupOfEntitiesRefStructureType.FLEXIBLE_QUAY),
    @XmlEnumValue("FlexibleStopPlace")
    FLEXIBLE_STOP_PLACE(NameOfClassGroupOfEntitiesRefStructureType.FLEXIBLE_STOP_PLACE),
    @XmlEnumValue("Garage")
    GARAGE(NameOfClassGroupOfEntitiesRefStructureType.GARAGE),
    @XmlEnumValue("HailAndRideArea")
    HAIL_AND_RIDE_AREA(NameOfClassGroupOfEntitiesRefStructureType.HAIL_AND_RIDE_AREA),
    @XmlEnumValue("MonitoredVehicleSharingParkingBay")
    MONITORED_VEHICLE_SHARING_PARKING_BAY(NameOfClassGroupOfEntitiesRefStructureType.MONITORED_VEHICLE_SHARING_PARKING_BAY),
    @XmlEnumValue("Parking")
    PARKING(NameOfClassGroupOfEntitiesRefStructureType.PARKING),
    @XmlEnumValue("ParkingArea")
    PARKING_AREA(NameOfClassGroupOfEntitiesRefStructureType.PARKING_AREA),
    @XmlEnumValue("ParkingBay")
    PARKING_BAY(NameOfClassGroupOfEntitiesRefStructureType.PARKING_BAY),
    @XmlEnumValue("ParkingComponent")
    PARKING_COMPONENT(NameOfClassGroupOfEntitiesRefStructureType.PARKING_COMPONENT),
    @XmlEnumValue("ParkingEntranceForVehicles")
    PARKING_ENTRANCE_FOR_VEHICLES(NameOfClassGroupOfEntitiesRefStructureType.PARKING_ENTRANCE_FOR_VEHICLES),
    @XmlEnumValue("ParkingPassengerEntrance")
    PARKING_PASSENGER_ENTRANCE(NameOfClassGroupOfEntitiesRefStructureType.PARKING_PASSENGER_ENTRANCE),
    @XmlEnumValue("PathJunction")
    PATH_JUNCTION(NameOfClassGroupOfEntitiesRefStructureType.PATH_JUNCTION),
    @XmlEnumValue("Point")
    POINT(NameOfClassGroupOfEntitiesRefStructureType.POINT),
    @XmlEnumValue("PointOfInterest")
    POINT_OF_INTEREST(NameOfClassGroupOfEntitiesRefStructureType.POINT_OF_INTEREST),
    @XmlEnumValue("PointOfInterestEntrance")
    POINT_OF_INTEREST_ENTRANCE(NameOfClassGroupOfEntitiesRefStructureType.POINT_OF_INTEREST_ENTRANCE),
    @XmlEnumValue("PointOfInterestSpace")
    POINT_OF_INTEREST_SPACE(NameOfClassGroupOfEntitiesRefStructureType.POINT_OF_INTEREST_SPACE),
    @XmlEnumValue("PointOfInterestVehicleEntrance")
    POINT_OF_INTEREST_VEHICLE_ENTRANCE(NameOfClassGroupOfEntitiesRefStructureType.POINT_OF_INTEREST_VEHICLE_ENTRANCE),
    @XmlEnumValue("PostalAddress")
    POSTAL_ADDRESS(NameOfClassGroupOfEntitiesRefStructureType.POSTAL_ADDRESS),
    @XmlEnumValue("Quay")
    QUAY(NameOfClassGroupOfEntitiesRefStructureType.QUAY),
    @XmlEnumValue("RechargingBay")
    RECHARGING_BAY(NameOfClassGroupOfEntitiesRefStructureType.RECHARGING_BAY),
    @XmlEnumValue("RechargingStation")
    RECHARGING_STATION(NameOfClassGroupOfEntitiesRefStructureType.RECHARGING_STATION),
    @XmlEnumValue("RoadAddress")
    ROAD_ADDRESS(NameOfClassGroupOfEntitiesRefStructureType.ROAD_ADDRESS),
    @XmlEnumValue("ServiceSite")
    SERVICE_SITE(NameOfClassGroupOfEntitiesRefStructureType.SERVICE_SITE),
    @XmlEnumValue("SitePathJunction")
    SITE_PATH_JUNCTION(NameOfClassGroupOfEntitiesRefStructureType.SITE_PATH_JUNCTION),
    @XmlEnumValue("StopPlace")
    STOP_PLACE(NameOfClassGroupOfEntitiesRefStructureType.STOP_PLACE),
    @XmlEnumValue("StopPlaceEntrance")
    STOP_PLACE_ENTRANCE(NameOfClassGroupOfEntitiesRefStructureType.STOP_PLACE_ENTRANCE),
    @XmlEnumValue("StopPlaceVehicleEntrance")
    STOP_PLACE_VEHICLE_ENTRANCE(NameOfClassGroupOfEntitiesRefStructureType.STOP_PLACE_VEHICLE_ENTRANCE),
    @XmlEnumValue("TaxiParkingArea")
    TAXI_PARKING_AREA(NameOfClassGroupOfEntitiesRefStructureType.TAXI_PARKING_AREA),
    @XmlEnumValue("TaxiRank")
    TAXI_RANK(NameOfClassGroupOfEntitiesRefStructureType.TAXI_RANK),
    @XmlEnumValue("TaxiStand")
    TAXI_STAND(NameOfClassGroupOfEntitiesRefStructureType.TAXI_STAND),
    @XmlEnumValue("TopographicPlace")
    TOPOGRAPHIC_PLACE(NameOfClassGroupOfEntitiesRefStructureType.TOPOGRAPHIC_PLACE),
    @XmlEnumValue("VehicleMeetingPlace")
    VEHICLE_MEETING_PLACE(NameOfClassGroupOfEntitiesRefStructureType.VEHICLE_MEETING_PLACE),
    @XmlEnumValue("VehiclePoolingMeetingPlace")
    VEHICLE_POOLING_MEETING_PLACE(NameOfClassGroupOfEntitiesRefStructureType.VEHICLE_POOLING_MEETING_PLACE),
    @XmlEnumValue("VehiclePoolingParkingArea")
    VEHICLE_POOLING_PARKING_AREA(NameOfClassGroupOfEntitiesRefStructureType.VEHICLE_POOLING_PARKING_AREA),
    @XmlEnumValue("VehiclePoolingParkingBay")
    VEHICLE_POOLING_PARKING_BAY(NameOfClassGroupOfEntitiesRefStructureType.VEHICLE_POOLING_PARKING_BAY),
    @XmlEnumValue("VehicleSharingParkingArea")
    VEHICLE_SHARING_PARKING_AREA(NameOfClassGroupOfEntitiesRefStructureType.VEHICLE_SHARING_PARKING_AREA),
    @XmlEnumValue("VehicleSharingParkingBay")
    VEHICLE_SHARING_PARKING_BAY(NameOfClassGroupOfEntitiesRefStructureType.VEHICLE_SHARING_PARKING_BAY),
    @XmlEnumValue("VehicleStoppingPlace")
    VEHICLE_STOPPING_PLACE(NameOfClassGroupOfEntitiesRefStructureType.VEHICLE_STOPPING_PLACE),
    @XmlEnumValue("VehicleStoppingPosition")
    VEHICLE_STOPPING_POSITION(NameOfClassGroupOfEntitiesRefStructureType.VEHICLE_STOPPING_POSITION);
    private final NameOfClassGroupOfEntitiesRefStructureType value;

    NameOfClassPlaceRefStructureType(NameOfClassGroupOfEntitiesRefStructureType v) {
        value = v;
    }

    public NameOfClassGroupOfEntitiesRefStructureType value() {
        return value;
    }

    public static NameOfClassPlaceRefStructureType fromValue(NameOfClassGroupOfEntitiesRefStructureType v) {
        for (NameOfClassPlaceRefStructureType c: NameOfClassPlaceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
