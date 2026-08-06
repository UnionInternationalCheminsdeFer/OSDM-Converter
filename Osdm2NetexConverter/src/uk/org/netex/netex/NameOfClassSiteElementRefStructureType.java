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
 * <p>Java-Klasse f�r NameOfClassSiteElementRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassSiteElementRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassAddressablePlaceRefStructureType">
 *     &lt;enumeration value="AccessSpace"/>
 *     &lt;enumeration value="BoardingPosition"/>
 *     &lt;enumeration value="Entrance"/>
 *     &lt;enumeration value="EquipmentPlace"/>
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
@XmlType(name = "NameOfClassSiteElementRefStructureType")
@XmlEnum(NameOfClassAddressablePlaceRefStructureType.class)
public enum NameOfClassSiteElementRefStructureType {

    @XmlEnumValue("AccessSpace")
    ACCESS_SPACE(NameOfClassAddressablePlaceRefStructureType.ACCESS_SPACE),
    @XmlEnumValue("BoardingPosition")
    BOARDING_POSITION(NameOfClassAddressablePlaceRefStructureType.BOARDING_POSITION),
    @XmlEnumValue("Entrance")
    ENTRANCE(NameOfClassAddressablePlaceRefStructureType.ENTRANCE),
    @XmlEnumValue("EquipmentPlace")
    EQUIPMENT_PLACE(NameOfClassAddressablePlaceRefStructureType.EQUIPMENT_PLACE),
    @XmlEnumValue("MonitoredVehicleSharingParkingBay")
    MONITORED_VEHICLE_SHARING_PARKING_BAY(NameOfClassAddressablePlaceRefStructureType.MONITORED_VEHICLE_SHARING_PARKING_BAY),
    @XmlEnumValue("Parking")
    PARKING(NameOfClassAddressablePlaceRefStructureType.PARKING),
    @XmlEnumValue("ParkingArea")
    PARKING_AREA(NameOfClassAddressablePlaceRefStructureType.PARKING_AREA),
    @XmlEnumValue("ParkingBay")
    PARKING_BAY(NameOfClassAddressablePlaceRefStructureType.PARKING_BAY),
    @XmlEnumValue("ParkingComponent")
    PARKING_COMPONENT(NameOfClassAddressablePlaceRefStructureType.PARKING_COMPONENT),
    @XmlEnumValue("ParkingEntranceForVehicles")
    PARKING_ENTRANCE_FOR_VEHICLES(NameOfClassAddressablePlaceRefStructureType.PARKING_ENTRANCE_FOR_VEHICLES),
    @XmlEnumValue("ParkingPassengerEntrance")
    PARKING_PASSENGER_ENTRANCE(NameOfClassAddressablePlaceRefStructureType.PARKING_PASSENGER_ENTRANCE),
    @XmlEnumValue("PointOfInterest")
    POINT_OF_INTEREST(NameOfClassAddressablePlaceRefStructureType.POINT_OF_INTEREST),
    @XmlEnumValue("PointOfInterestEntrance")
    POINT_OF_INTEREST_ENTRANCE(NameOfClassAddressablePlaceRefStructureType.POINT_OF_INTEREST_ENTRANCE),
    @XmlEnumValue("PointOfInterestSpace")
    POINT_OF_INTEREST_SPACE(NameOfClassAddressablePlaceRefStructureType.POINT_OF_INTEREST_SPACE),
    @XmlEnumValue("PointOfInterestVehicleEntrance")
    POINT_OF_INTEREST_VEHICLE_ENTRANCE(NameOfClassAddressablePlaceRefStructureType.POINT_OF_INTEREST_VEHICLE_ENTRANCE),
    @XmlEnumValue("Quay")
    QUAY(NameOfClassAddressablePlaceRefStructureType.QUAY),
    @XmlEnumValue("RechargingBay")
    RECHARGING_BAY(NameOfClassAddressablePlaceRefStructureType.RECHARGING_BAY),
    @XmlEnumValue("RechargingStation")
    RECHARGING_STATION(NameOfClassAddressablePlaceRefStructureType.RECHARGING_STATION),
    @XmlEnumValue("ServiceSite")
    SERVICE_SITE(NameOfClassAddressablePlaceRefStructureType.SERVICE_SITE),
    @XmlEnumValue("StopPlace")
    STOP_PLACE(NameOfClassAddressablePlaceRefStructureType.STOP_PLACE),
    @XmlEnumValue("StopPlaceEntrance")
    STOP_PLACE_ENTRANCE(NameOfClassAddressablePlaceRefStructureType.STOP_PLACE_ENTRANCE),
    @XmlEnumValue("StopPlaceVehicleEntrance")
    STOP_PLACE_VEHICLE_ENTRANCE(NameOfClassAddressablePlaceRefStructureType.STOP_PLACE_VEHICLE_ENTRANCE),
    @XmlEnumValue("TaxiParkingArea")
    TAXI_PARKING_AREA(NameOfClassAddressablePlaceRefStructureType.TAXI_PARKING_AREA),
    @XmlEnumValue("TaxiRank")
    TAXI_RANK(NameOfClassAddressablePlaceRefStructureType.TAXI_RANK),
    @XmlEnumValue("TaxiStand")
    TAXI_STAND(NameOfClassAddressablePlaceRefStructureType.TAXI_STAND),
    @XmlEnumValue("VehiclePoolingParkingArea")
    VEHICLE_POOLING_PARKING_AREA(NameOfClassAddressablePlaceRefStructureType.VEHICLE_POOLING_PARKING_AREA),
    @XmlEnumValue("VehiclePoolingParkingBay")
    VEHICLE_POOLING_PARKING_BAY(NameOfClassAddressablePlaceRefStructureType.VEHICLE_POOLING_PARKING_BAY),
    @XmlEnumValue("VehicleSharingParkingArea")
    VEHICLE_SHARING_PARKING_AREA(NameOfClassAddressablePlaceRefStructureType.VEHICLE_SHARING_PARKING_AREA),
    @XmlEnumValue("VehicleSharingParkingBay")
    VEHICLE_SHARING_PARKING_BAY(NameOfClassAddressablePlaceRefStructureType.VEHICLE_SHARING_PARKING_BAY),
    @XmlEnumValue("VehicleStoppingPlace")
    VEHICLE_STOPPING_PLACE(NameOfClassAddressablePlaceRefStructureType.VEHICLE_STOPPING_PLACE),
    @XmlEnumValue("VehicleStoppingPosition")
    VEHICLE_STOPPING_POSITION(NameOfClassAddressablePlaceRefStructureType.VEHICLE_STOPPING_POSITION);
    private final NameOfClassAddressablePlaceRefStructureType value;

    NameOfClassSiteElementRefStructureType(NameOfClassAddressablePlaceRefStructureType v) {
        value = v;
    }

    public NameOfClassAddressablePlaceRefStructureType value() {
        return value;
    }

    public static NameOfClassSiteElementRefStructureType fromValue(NameOfClassAddressablePlaceRefStructureType v) {
        for (NameOfClassSiteElementRefStructureType c: NameOfClassSiteElementRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
