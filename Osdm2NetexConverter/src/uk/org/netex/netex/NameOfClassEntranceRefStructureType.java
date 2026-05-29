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
 * <p>Java-Klasse f�r NameOfClassEntranceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassEntranceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSiteComponentRefStructureType">
 *     &lt;enumeration value="Entrance"/>
 *     &lt;enumeration value="ParkingEntranceForVehicles"/>
 *     &lt;enumeration value="ParkingPassengerEntrance"/>
 *     &lt;enumeration value="PointOfInterestEntrance"/>
 *     &lt;enumeration value="PointOfInterestVehicleEntrance"/>
 *     &lt;enumeration value="StopPlaceEntrance"/>
 *     &lt;enumeration value="StopPlaceVehicleEntrance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassEntranceRefStructureType")
@XmlEnum(NameOfClassSiteComponentRefStructureType.class)
public enum NameOfClassEntranceRefStructureType {

    @XmlEnumValue("Entrance")
    ENTRANCE(NameOfClassSiteComponentRefStructureType.ENTRANCE),
    @XmlEnumValue("ParkingEntranceForVehicles")
    PARKING_ENTRANCE_FOR_VEHICLES(NameOfClassSiteComponentRefStructureType.PARKING_ENTRANCE_FOR_VEHICLES),
    @XmlEnumValue("ParkingPassengerEntrance")
    PARKING_PASSENGER_ENTRANCE(NameOfClassSiteComponentRefStructureType.PARKING_PASSENGER_ENTRANCE),
    @XmlEnumValue("PointOfInterestEntrance")
    POINT_OF_INTEREST_ENTRANCE(NameOfClassSiteComponentRefStructureType.POINT_OF_INTEREST_ENTRANCE),
    @XmlEnumValue("PointOfInterestVehicleEntrance")
    POINT_OF_INTEREST_VEHICLE_ENTRANCE(NameOfClassSiteComponentRefStructureType.POINT_OF_INTEREST_VEHICLE_ENTRANCE),
    @XmlEnumValue("StopPlaceEntrance")
    STOP_PLACE_ENTRANCE(NameOfClassSiteComponentRefStructureType.STOP_PLACE_ENTRANCE),
    @XmlEnumValue("StopPlaceVehicleEntrance")
    STOP_PLACE_VEHICLE_ENTRANCE(NameOfClassSiteComponentRefStructureType.STOP_PLACE_VEHICLE_ENTRANCE);
    private final NameOfClassSiteComponentRefStructureType value;

    NameOfClassEntranceRefStructureType(NameOfClassSiteComponentRefStructureType v) {
        value = v;
    }

    public NameOfClassSiteComponentRefStructureType value() {
        return value;
    }

    public static NameOfClassEntranceRefStructureType fromValue(NameOfClassSiteComponentRefStructureType v) {
        for (NameOfClassEntranceRefStructureType c: NameOfClassEntranceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
