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
 * <p>Java-Klasse f�r BoardingPositionTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BoardingPositionTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="doorFromAirlineGate"/>
 *     &lt;enumeration value="positionOnRailPlatform"/>
 *     &lt;enumeration value="positionOnMetroPlatform"/>
 *     &lt;enumeration value="positionAtCoachStop"/>
 *     &lt;enumeration value="positionAtBusStop"/>
 *     &lt;enumeration value="boatGangway"/>
 *     &lt;enumeration value="ferryGangway"/>
 *     &lt;enumeration value="telecabinPlatform"/>
 *     &lt;enumeration value="setDownPoint"/>
 *     &lt;enumeration value="taxiBay"/>
 *     &lt;enumeration value="vehicleLoadingRamp"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BoardingPositionTypeEnumeration")
@XmlEnum
public enum BoardingPositionTypeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("doorFromAirlineGate")
    DOOR_FROM_AIRLINE_GATE("doorFromAirlineGate"),
    @XmlEnumValue("positionOnRailPlatform")
    POSITION_ON_RAIL_PLATFORM("positionOnRailPlatform"),
    @XmlEnumValue("positionOnMetroPlatform")
    POSITION_ON_METRO_PLATFORM("positionOnMetroPlatform"),
    @XmlEnumValue("positionAtCoachStop")
    POSITION_AT_COACH_STOP("positionAtCoachStop"),
    @XmlEnumValue("positionAtBusStop")
    POSITION_AT_BUS_STOP("positionAtBusStop"),
    @XmlEnumValue("boatGangway")
    BOAT_GANGWAY("boatGangway"),
    @XmlEnumValue("ferryGangway")
    FERRY_GANGWAY("ferryGangway"),

    /**
     * +v1.2
     * 
     */
    @XmlEnumValue("telecabinPlatform")
    TELECABIN_PLATFORM("telecabinPlatform"),
    @XmlEnumValue("setDownPoint")
    SET_DOWN_POINT("setDownPoint"),
    @XmlEnumValue("taxiBay")
    TAXI_BAY("taxiBay"),
    @XmlEnumValue("vehicleLoadingRamp")
    VEHICLE_LOADING_RAMP("vehicleLoadingRamp"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    BoardingPositionTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoardingPositionTypeEnumeration fromValue(String v) {
        for (BoardingPositionTypeEnumeration c: BoardingPositionTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
