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
 * <p>Java-Klasse f�r OccupancyEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OccupancyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="empty"/>
 *     &lt;enumeration value="manySeatsAvailable"/>
 *     &lt;enumeration value="fewSeatsAvailable"/>
 *     &lt;enumeration value="standingRoomOnly"/>
 *     &lt;enumeration value="crushedStandingRoomOnly"/>
 *     &lt;enumeration value="full"/>
 *     &lt;enumeration value="notAcceptingPassengers"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="seatsAvailable"/>
 *     &lt;enumeration value="standingAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OccupancyEnumeration")
@XmlEnum
public enum OccupancyEnumeration {


    /**
     * Unknown. Maps to TPEG Pts45_0.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * The vehicle is considered empty by most measures, and has few or no passengers onboard, but is still accepting passengers. Maps to GTFS-R "EMPTY".
     * 
     */
    @XmlEnumValue("empty")
    EMPTY("empty"),

    /**
     * The vehicle has a large percentage of seats available. What percentage of free seats out of the total seats available is to be considered large enough to fall into this category is determined at the discretion of the producer. Maps to GTFS-R "MANY_SEATS_AVAILABLE" / TPEG Pts45_1, many seats available.
     * 
     */
    @XmlEnumValue("manySeatsAvailable")
    MANY_SEATS_AVAILABLE("manySeatsAvailable"),

    /**
     * The vehicle has a small percentage of seats available. What percentage of free seats out of the total seats available is to be considered small enough to fall into this category is determined at the discretion of the producer. Maps to GTFS-R "FEW_SEATS_AVAILABLE" / TPEG Pts45_2, few seats available.
     * 
     */
    @XmlEnumValue("fewSeatsAvailable")
    FEW_SEATS_AVAILABLE("fewSeatsAvailable"),

    /**
     * The vehicle can currently accommodate only standing passengers. Standing room only (and TPEG Pts45_3, no seats available). Maps to GTFS-R "STANDING_ROOM_ONLY" / TPEG Pts45_4.
     * 
     */
    @XmlEnumValue("standingRoomOnly")
    STANDING_ROOM_ONLY("standingRoomOnly"),

    /**
     * The vehicle can currently accommodate only standing passengers and has limited space for them. Maps to GTFS-R "CRUSHED_STANDING_ROOM_ONLY".
     * 
     */
    @XmlEnumValue("crushedStandingRoomOnly")
    CRUSHED_STANDING_ROOM_ONLY("crushedStandingRoomOnly"),

    /**
     * Depends on the MODE and MODE OF OPERATION. In general the vehicle will be at capacity at departure. Maps to GTFS-R "FULL" / TPEG Pts45_5, full.
     * 
     */
    @XmlEnumValue("full")
    FULL("full"),

    /**
     * The vehicle cannot accept passengers. Maps to GTFS-R "NOT_ACCEPTING_PASSENGERS"
     * 
     */
    @XmlEnumValue("notAcceptingPassengers")
    NOT_ACCEPTING_PASSENGERS("notAcceptingPassengers"),

    /**
     * Undefined occupancy- Maps to TPEG Pts45_255.
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),

    /**
     * (SIRI 2.1) deprecated - use a more specific value
     * 
     */
    @XmlEnumValue("seatsAvailable")
    SEATS_AVAILABLE("seatsAvailable"),

    /**
     * (SIRI 2.1) deprecated - use a more specific value
     * 
     */
    @XmlEnumValue("standingAvailable")
    STANDING_AVAILABLE("standingAvailable");
    private final String value;

    OccupancyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OccupancyEnumeration fromValue(String v) {
        for (OccupancyEnumeration c: OccupancyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
