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
 * <p>Java-Klasse f�r RailSubmodeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RailSubmodeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="local"/>
 *     &lt;enumeration value="highSpeedRail"/>
 *     &lt;enumeration value="suburbanRailway"/>
 *     &lt;enumeration value="regionalRail"/>
 *     &lt;enumeration value="interregionalRail"/>
 *     &lt;enumeration value="longDistance"/>
 *     &lt;enumeration value="international"/>
 *     &lt;enumeration value="sleeperRailService"/>
 *     &lt;enumeration value="nightRail"/>
 *     &lt;enumeration value="carTransportRailService"/>
 *     &lt;enumeration value="largeVehicleTransportRailService"/>
 *     &lt;enumeration value="touristRailway"/>
 *     &lt;enumeration value="airportLinkRail"/>
 *     &lt;enumeration value="railShuttle"/>
 *     &lt;enumeration value="replacementRailService"/>
 *     &lt;enumeration value="specialTrain"/>
 *     &lt;enumeration value="crossCountryRail"/>
 *     &lt;enumeration value="rackAndPinionRailway"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RailSubmodeEnumeration")
@XmlEnum
public enum RailSubmodeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("local")
    LOCAL("local"),

    /**
     * See ERA B.4.7009 - Name: Item description code: (8 high speed train).
     * Long distance train formed by a unit capable for high speed running on high speed or normal lines most modern train unit
     * 
     */
    @XmlEnumValue("highSpeedRail")
    HIGH_SPEED_RAIL("highSpeedRail"),

    /**
     * See ERA B.4.7009 - Name: Item description code: . (12 suburban)
     * Regional train organised by the regional government public transport in and around cities, running on its own freeways underground or overground, operational running with signals
     * 
     */
    @XmlEnumValue("suburbanRailway")
    SUBURBAN_RAILWAY("suburbanRailway"),

    /**
     * See ERA B.4.7009 - Name: Item description code. (11 Regional)
     * Regional train organised by the regional government even if formed by a unit capable for high speed running on high speed lines
     * 
     */
    @XmlEnumValue("regionalRail")
    REGIONAL_RAIL("regionalRail"),

    /**
     * See ERA B.4.7009 - Name: Item description code: (10 Interregional)
     * Regional train running in more than one region.
     * 
     */
    @XmlEnumValue("interregionalRail")
    INTERREGIONAL_RAIL("interregionalRail"),

    /**
     * See ERA B.4.7009 - Name: Item description code: (9 Intercity).
     * Long distance train formed by a unit capable for high speed or not running on high speed or normal lines modern train unit high quality service restricted stopping pattern
     * 
     */
    @XmlEnumValue("longDistance")
    LONG_DISTANCE("longDistance"),
    @XmlEnumValue("international")
    INTERNATIONAL("international"),
    @XmlEnumValue("sleeperRailService")
    SLEEPER_RAIL_SERVICE("sleeperRailService"),
    @XmlEnumValue("nightRail")
    NIGHT_RAIL("nightRail"),

    /**
     * See ERA B.4.7009 - Name: Item description code: (14 Motor rail)
     * Service transporting passenger's motor vehicle passengers are admitted either with vehicle only or with or without vehicle
     * Service mode
     * 
     */
    @XmlEnumValue("carTransportRailService")
    CAR_TRANSPORT_RAIL_SERVICE("carTransportRailService"),

    /**
     * carTransportRailService that allows for bigger vehicles than normal cars (e.g. truck, bus). +v2.0
     * 
     */
    @XmlEnumValue("largeVehicleTransportRailService")
    LARGE_VEHICLE_TRANSPORT_RAIL_SERVICE("largeVehicleTransportRailService"),

    /**
     * See ERA B.4.7009 - Name: Item description code: (16 Historic train).
     * 
     */
    @XmlEnumValue("touristRailway")
    TOURIST_RAILWAY("touristRailway"),
    @XmlEnumValue("airportLinkRail")
    AIRPORT_LINK_RAIL("airportLinkRail"),
    @XmlEnumValue("railShuttle")
    RAIL_SHUTTLE("railShuttle"),
    @XmlEnumValue("replacementRailService")
    REPLACEMENT_RAIL_SERVICE("replacementRailService"),
    @XmlEnumValue("specialTrain")
    SPECIAL_TRAIN("specialTrain"),
    @XmlEnumValue("crossCountryRail")
    CROSS_COUNTRY_RAIL("crossCountryRail"),

    /**
     * See ERA B.4.7009 - Name: Item description code: (15 Mountain train)
     * Local train adapted for running in mountain railway lines.
     * 
     */
    @XmlEnumValue("rackAndPinionRailway")
    RACK_AND_PINION_RAILWAY("rackAndPinionRailway");
    private final String value;

    RailSubmodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RailSubmodeEnumeration fromValue(String v) {
        for (RailSubmodeEnumeration c: RailSubmodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
