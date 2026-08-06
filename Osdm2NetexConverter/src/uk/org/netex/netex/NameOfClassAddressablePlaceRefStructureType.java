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
 * <p>Java-Klasse f�r NameOfClassAddressablePlaceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassAddressablePlaceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPlaceRefStructureType">
 *     &lt;enumeration value="AccessSpace"/>
 *     &lt;enumeration value="AddressablePlace"/>
 *     &lt;enumeration value="BoardingPosition"/>
 *     &lt;enumeration value="Entrance"/>
 *     &lt;enumeration value="EquipmentPlace"/>
 *     &lt;enumeration value="Garage"/>
 *     &lt;enumeration value="MonitoredVehicleSharingParkingBay"/>
 *     &lt;enumeration value="Parking"/>
 *     &lt;enumeration value="ParkingArea"/>
 *     &lt;enumeration value="ParkingBay"/>
 *     &lt;enumeration value="ParkingComponent"/>
 *     &lt;enumeration value="ParkingEntranceForVehicles"/>
 *     &lt;enumeration value="ParkingPassengerEntrance"/>
 *     &lt;enumeration value="PointOfInterest"/>
 *     &lt;enumeration value="PointOfInterestEntrance"/>
 *     &lt;enumeration value="PointOfInterestSpace"/>
 *     &lt;enumeration value="PointOfInterestVehicleEntrance"/>
 *     &lt;enumeration value="Quay"/>
 *     &lt;enumeration value="RechargingBay"/>
 *     &lt;enumeration value="RechargingStation"/>
 *     &lt;enumeration value="ServiceSite"/>
 *     &lt;enumeration value="StopPlace"/>
 *     &lt;enumeration value="StopPlaceEntrance"/>
 *     &lt;enumeration value="StopPlaceVehicleEntrance"/>
 *     &lt;enumeration value="TaxiParkingArea"/>
 *     &lt;enumeration value="TaxiRank"/>
 *     &lt;enumeration value="TaxiStand"/>
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
@XmlType(name = "NameOfClassAddressablePlaceRefStructureType")
@XmlEnum(NameOfClassPlaceRefStructureType.class)
public enum NameOfClassAddressablePlaceRefStructureType {

    @XmlEnumValue("AccessSpace")
    ACCESS_SPACE(NameOfClassPlaceRefStructureType.ACCESS_SPACE),
    @XmlEnumValue("AddressablePlace")
    ADDRESSABLE_PLACE(NameOfClassPlaceRefStructureType.ADDRESSABLE_PLACE),
    @XmlEnumValue("BoardingPosition")
    BOARDING_POSITION(NameOfClassPlaceRefStructureType.BOARDING_POSITION),
    @XmlEnumValue("Entrance")
    ENTRANCE(NameOfClassPlaceRefStructureType.ENTRANCE),
    @XmlEnumValue("EquipmentPlace")
    EQUIPMENT_PLACE(NameOfClassPlaceRefStructureType.EQUIPMENT_PLACE),
    @XmlEnumValue("Garage")
    GARAGE(NameOfClassPlaceRefStructureType.GARAGE),
    @XmlEnumValue("MonitoredVehicleSharingParkingBay")
    MONITORED_VEHICLE_SHARING_PARKING_BAY(NameOfClassPlaceRefStructureType.MONITORED_VEHICLE_SHARING_PARKING_BAY),
    @XmlEnumValue("Parking")
    PARKING(NameOfClassPlaceRefStructureType.PARKING),
    @XmlEnumValue("ParkingArea")
    PARKING_AREA(NameOfClassPlaceRefStructureType.PARKING_AREA),
    @XmlEnumValue("ParkingBay")
    PARKING_BAY(NameOfClassPlaceRefStructureType.PARKING_BAY),
    @XmlEnumValue("ParkingComponent")
    PARKING_COMPONENT(NameOfClassPlaceRefStructureType.PARKING_COMPONENT),
    @XmlEnumValue("ParkingEntranceForVehicles")
    PARKING_ENTRANCE_FOR_VEHICLES(NameOfClassPlaceRefStructureType.PARKING_ENTRANCE_FOR_VEHICLES),
    @XmlEnumValue("ParkingPassengerEntrance")
    PARKING_PASSENGER_ENTRANCE(NameOfClassPlaceRefStructureType.PARKING_PASSENGER_ENTRANCE),
    @XmlEnumValue("PointOfInterest")
    POINT_OF_INTEREST(NameOfClassPlaceRefStructureType.POINT_OF_INTEREST),
    @XmlEnumValue("PointOfInterestEntrance")
    POINT_OF_INTEREST_ENTRANCE(NameOfClassPlaceRefStructureType.POINT_OF_INTEREST_ENTRANCE),
    @XmlEnumValue("PointOfInterestSpace")
    POINT_OF_INTEREST_SPACE(NameOfClassPlaceRefStructureType.POINT_OF_INTEREST_SPACE),
    @XmlEnumValue("PointOfInterestVehicleEntrance")
    POINT_OF_INTEREST_VEHICLE_ENTRANCE(NameOfClassPlaceRefStructureType.POINT_OF_INTEREST_VEHICLE_ENTRANCE),
    @XmlEnumValue("Quay")
    QUAY(NameOfClassPlaceRefStructureType.QUAY),
    @XmlEnumValue("RechargingBay")
    RECHARGING_BAY(NameOfClassPlaceRefStructureType.RECHARGING_BAY),
    @XmlEnumValue("RechargingStation")
    RECHARGING_STATION(NameOfClassPlaceRefStructureType.RECHARGING_STATION),
    @XmlEnumValue("ServiceSite")
    SERVICE_SITE(NameOfClassPlaceRefStructureType.SERVICE_SITE),
    @XmlEnumValue("StopPlace")
    STOP_PLACE(NameOfClassPlaceRefStructureType.STOP_PLACE),
    @XmlEnumValue("StopPlaceEntrance")
    STOP_PLACE_ENTRANCE(NameOfClassPlaceRefStructureType.STOP_PLACE_ENTRANCE),
    @XmlEnumValue("StopPlaceVehicleEntrance")
    STOP_PLACE_VEHICLE_ENTRANCE(NameOfClassPlaceRefStructureType.STOP_PLACE_VEHICLE_ENTRANCE),
    @XmlEnumValue("TaxiParkingArea")
    TAXI_PARKING_AREA(NameOfClassPlaceRefStructureType.TAXI_PARKING_AREA),
    @XmlEnumValue("TaxiRank")
    TAXI_RANK(NameOfClassPlaceRefStructureType.TAXI_RANK),
    @XmlEnumValue("TaxiStand")
    TAXI_STAND(NameOfClassPlaceRefStructureType.TAXI_STAND),
    @XmlEnumValue("VehicleMeetingPlace")
    VEHICLE_MEETING_PLACE(NameOfClassPlaceRefStructureType.VEHICLE_MEETING_PLACE),
    @XmlEnumValue("VehiclePoolingMeetingPlace")
    VEHICLE_POOLING_MEETING_PLACE(NameOfClassPlaceRefStructureType.VEHICLE_POOLING_MEETING_PLACE),
    @XmlEnumValue("VehiclePoolingParkingArea")
    VEHICLE_POOLING_PARKING_AREA(NameOfClassPlaceRefStructureType.VEHICLE_POOLING_PARKING_AREA),
    @XmlEnumValue("VehiclePoolingParkingBay")
    VEHICLE_POOLING_PARKING_BAY(NameOfClassPlaceRefStructureType.VEHICLE_POOLING_PARKING_BAY),
    @XmlEnumValue("VehicleSharingParkingArea")
    VEHICLE_SHARING_PARKING_AREA(NameOfClassPlaceRefStructureType.VEHICLE_SHARING_PARKING_AREA),
    @XmlEnumValue("VehicleSharingParkingBay")
    VEHICLE_SHARING_PARKING_BAY(NameOfClassPlaceRefStructureType.VEHICLE_SHARING_PARKING_BAY),
    @XmlEnumValue("VehicleStoppingPlace")
    VEHICLE_STOPPING_PLACE(NameOfClassPlaceRefStructureType.VEHICLE_STOPPING_PLACE),
    @XmlEnumValue("VehicleStoppingPosition")
    VEHICLE_STOPPING_POSITION(NameOfClassPlaceRefStructureType.VEHICLE_STOPPING_POSITION);
    private final NameOfClassPlaceRefStructureType value;

    NameOfClassAddressablePlaceRefStructureType(NameOfClassPlaceRefStructureType v) {
        value = v;
    }

    public NameOfClassPlaceRefStructureType value() {
        return value;
    }

    public static NameOfClassAddressablePlaceRefStructureType fromValue(NameOfClassPlaceRefStructureType v) {
        for (NameOfClassAddressablePlaceRefStructureType c: NameOfClassAddressablePlaceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
