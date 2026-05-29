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
 * <p>Java-Klasse f�r NameOfClassSiteComponentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassSiteComponentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSiteElementRefStructureType">
 *     &lt;enumeration value="AccessSpace"/>
 *     &lt;enumeration value="BoardingPosition"/>
 *     &lt;enumeration value="Entrance"/>
 *     &lt;enumeration value="MonitoredVehicleSharingParkingBay"/>
 *     &lt;enumeration value="ParkingArea"/>
 *     &lt;enumeration value="ParkingBay"/>
 *     &lt;enumeration value="ParkingComponent"/>
 *     &lt;enumeration value="ParkingEntranceForVehicles"/>
 *     &lt;enumeration value="ParkingPassengerEntrance"/>
 *     &lt;enumeration value="PointOfInterestEntrance"/>
 *     &lt;enumeration value="PointOfInterestSpace"/>
 *     &lt;enumeration value="PointOfInterestVehicleEntrance"/>
 *     &lt;enumeration value="Quay"/>
 *     &lt;enumeration value="RechargingBay"/>
 *     &lt;enumeration value="StopPlaceEntrance"/>
 *     &lt;enumeration value="StopPlaceVehicleEntrance"/>
 *     &lt;enumeration value="TaxiParkingArea"/>
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
@XmlType(name = "NameOfClassSiteComponentRefStructureType")
@XmlEnum(NameOfClassSiteElementRefStructureType.class)
public enum NameOfClassSiteComponentRefStructureType {

    @XmlEnumValue("AccessSpace")
    ACCESS_SPACE(NameOfClassSiteElementRefStructureType.ACCESS_SPACE),
    @XmlEnumValue("BoardingPosition")
    BOARDING_POSITION(NameOfClassSiteElementRefStructureType.BOARDING_POSITION),
    @XmlEnumValue("Entrance")
    ENTRANCE(NameOfClassSiteElementRefStructureType.ENTRANCE),
    @XmlEnumValue("MonitoredVehicleSharingParkingBay")
    MONITORED_VEHICLE_SHARING_PARKING_BAY(NameOfClassSiteElementRefStructureType.MONITORED_VEHICLE_SHARING_PARKING_BAY),
    @XmlEnumValue("ParkingArea")
    PARKING_AREA(NameOfClassSiteElementRefStructureType.PARKING_AREA),
    @XmlEnumValue("ParkingBay")
    PARKING_BAY(NameOfClassSiteElementRefStructureType.PARKING_BAY),
    @XmlEnumValue("ParkingComponent")
    PARKING_COMPONENT(NameOfClassSiteElementRefStructureType.PARKING_COMPONENT),
    @XmlEnumValue("ParkingEntranceForVehicles")
    PARKING_ENTRANCE_FOR_VEHICLES(NameOfClassSiteElementRefStructureType.PARKING_ENTRANCE_FOR_VEHICLES),
    @XmlEnumValue("ParkingPassengerEntrance")
    PARKING_PASSENGER_ENTRANCE(NameOfClassSiteElementRefStructureType.PARKING_PASSENGER_ENTRANCE),
    @XmlEnumValue("PointOfInterestEntrance")
    POINT_OF_INTEREST_ENTRANCE(NameOfClassSiteElementRefStructureType.POINT_OF_INTEREST_ENTRANCE),
    @XmlEnumValue("PointOfInterestSpace")
    POINT_OF_INTEREST_SPACE(NameOfClassSiteElementRefStructureType.POINT_OF_INTEREST_SPACE),
    @XmlEnumValue("PointOfInterestVehicleEntrance")
    POINT_OF_INTEREST_VEHICLE_ENTRANCE(NameOfClassSiteElementRefStructureType.POINT_OF_INTEREST_VEHICLE_ENTRANCE),
    @XmlEnumValue("Quay")
    QUAY(NameOfClassSiteElementRefStructureType.QUAY),
    @XmlEnumValue("RechargingBay")
    RECHARGING_BAY(NameOfClassSiteElementRefStructureType.RECHARGING_BAY),
    @XmlEnumValue("StopPlaceEntrance")
    STOP_PLACE_ENTRANCE(NameOfClassSiteElementRefStructureType.STOP_PLACE_ENTRANCE),
    @XmlEnumValue("StopPlaceVehicleEntrance")
    STOP_PLACE_VEHICLE_ENTRANCE(NameOfClassSiteElementRefStructureType.STOP_PLACE_VEHICLE_ENTRANCE),
    @XmlEnumValue("TaxiParkingArea")
    TAXI_PARKING_AREA(NameOfClassSiteElementRefStructureType.TAXI_PARKING_AREA),
    @XmlEnumValue("TaxiStand")
    TAXI_STAND(NameOfClassSiteElementRefStructureType.TAXI_STAND),
    @XmlEnumValue("VehiclePoolingParkingArea")
    VEHICLE_POOLING_PARKING_AREA(NameOfClassSiteElementRefStructureType.VEHICLE_POOLING_PARKING_AREA),
    @XmlEnumValue("VehiclePoolingParkingBay")
    VEHICLE_POOLING_PARKING_BAY(NameOfClassSiteElementRefStructureType.VEHICLE_POOLING_PARKING_BAY),
    @XmlEnumValue("VehicleSharingParkingArea")
    VEHICLE_SHARING_PARKING_AREA(NameOfClassSiteElementRefStructureType.VEHICLE_SHARING_PARKING_AREA),
    @XmlEnumValue("VehicleSharingParkingBay")
    VEHICLE_SHARING_PARKING_BAY(NameOfClassSiteElementRefStructureType.VEHICLE_SHARING_PARKING_BAY),
    @XmlEnumValue("VehicleStoppingPlace")
    VEHICLE_STOPPING_PLACE(NameOfClassSiteElementRefStructureType.VEHICLE_STOPPING_PLACE),
    @XmlEnumValue("VehicleStoppingPosition")
    VEHICLE_STOPPING_POSITION(NameOfClassSiteElementRefStructureType.VEHICLE_STOPPING_POSITION);
    private final NameOfClassSiteElementRefStructureType value;

    NameOfClassSiteComponentRefStructureType(NameOfClassSiteElementRefStructureType v) {
        value = v;
    }

    public NameOfClassSiteElementRefStructureType value() {
        return value;
    }

    public static NameOfClassSiteComponentRefStructureType fromValue(NameOfClassSiteElementRefStructureType v) {
        for (NameOfClassSiteComponentRefStructureType c: NameOfClassSiteComponentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
