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
 * <p>Java-Klasse f�r AllPublicTransportModesEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AllPublicTransportModesEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="bus"/>
 *     &lt;enumeration value="trolleyBus"/>
 *     &lt;enumeration value="tram"/>
 *     &lt;enumeration value="coach"/>
 *     &lt;enumeration value="rail"/>
 *     &lt;enumeration value="intercityRail"/>
 *     &lt;enumeration value="urbanRail"/>
 *     &lt;enumeration value="metro"/>
 *     &lt;enumeration value="air"/>
 *     &lt;enumeration value="water"/>
 *     &lt;enumeration value="cableway"/>
 *     &lt;enumeration value="funicular"/>
 *     &lt;enumeration value="snowAndIce"/>
 *     &lt;enumeration value="taxi"/>
 *     &lt;enumeration value="ferry"/>
 *     &lt;enumeration value="lift"/>
 *     &lt;enumeration value="selfDrive"/>
 *     &lt;enumeration value="anyMode"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllPublicTransportModesEnumeration")
@XmlEnum
public enum AllPublicTransportModesEnumeration {


    /**
     * If all modes are meant.
     * 
     */
    @XmlEnumValue("all")
    ALL("all"),

    /**
     * Use only when no other entry applies.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("bus")
    BUS("bus"),

    /**
     * Special type of bus with two overhead wires using spring-loaded trolley poles.
     * 
     */
    @XmlEnumValue("trolleyBus")
    TROLLEY_BUS("trolleyBus"),
    @XmlEnumValue("tram")
    TRAM("tram"),

    /**
     * Bus for longer-distance service. This value specialises from bus through regulation, that the cross multiple metropolitan regions and that all passenger area seating. Also the seating layout is different.
     * 
     */
    @XmlEnumValue("coach")
    COACH("coach"),
    @XmlEnumValue("rail")
    RAIL("rail"),

    /**
     * DEPRECATED. Use mode rail with RailSubmode longDistance.
     * 
     */
    @XmlEnumValue("intercityRail")
    INTERCITY_RAIL("intercityRail"),

    /**
     * DEPRECATED. Use mode metro with MetroSubmode urbanRail (or in some few cases rail with RailSubmode local).
     * 
     */
    @XmlEnumValue("urbanRail")
    URBAN_RAIL("urbanRail"),

    /**
     * Within an urban area. For underground and railway.
     * 
     */
    @XmlEnumValue("metro")
    METRO("metro"),

    /**
     * All air related mode. No special distinction is made.
     * 
     */
    @XmlEnumValue("air")
    AIR("air"),

    /**
     * Most water related modes. The only specialisation is the mode ferry. In Transmodel also ship was used for this mode.
     * 
     */
    @XmlEnumValue("water")
    WATER("water"),

    /**
     * Can be only two cabines or multiple.
     * 
     */
    @XmlEnumValue("cableway")
    CABLEWAY("cableway"),

    /**
     * Cable railway on steep slope using two counterbalanced carriages.
     * 
     */
    @XmlEnumValue("funicular")
    FUNICULAR("funicular"),

    /**
     * A collection for all modes involving snow and ice.
     * 
     */
    @XmlEnumValue("snowAndIce")
    SNOW_AND_ICE("snowAndIce"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),

    /**
     * Ferry can be passenger ferries and/or car ferries. The specialisation from water is the detailed schedule and usually the very rigid pattern with only a few stops on the route.
     * 
     */
    @XmlEnumValue("ferry")
    FERRY("ferry"),

    /**
     * General Mode for elevators and for Modes moved by cable. Especially lifts are not only vertical elevators. If a better specialisation applies (like cableway) use that.
     * 
     */
    @XmlEnumValue("lift")
    LIFT("lift"),

    /**
     * For all alternative modes where a vehicle is driven by the user. See pti12_x.
     * 
     */
    @XmlEnumValue("selfDrive")
    SELF_DRIVE("selfDrive"),

    /**
     * To be avoided.
     * 
     */
    @XmlEnumValue("anyMode")
    ANY_MODE("anyMode"),

    /**
     * Use only when no other entry applies.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AllPublicTransportModesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AllPublicTransportModesEnumeration fromValue(String v) {
        for (AllPublicTransportModesEnumeration c: AllPublicTransportModesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
