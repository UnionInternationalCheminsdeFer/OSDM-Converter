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
 * <p>Java-Klasse f�r AllModesEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AllModesEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="anyMode"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="air"/>
 *     &lt;enumeration value="bus"/>
 *     &lt;enumeration value="trolleyBus"/>
 *     &lt;enumeration value="tram"/>
 *     &lt;enumeration value="coach"/>
 *     &lt;enumeration value="rail"/>
 *     &lt;enumeration value="intercityRail"/>
 *     &lt;enumeration value="urbanRail"/>
 *     &lt;enumeration value="metro"/>
 *     &lt;enumeration value="water"/>
 *     &lt;enumeration value="ferry"/>
 *     &lt;enumeration value="cableway"/>
 *     &lt;enumeration value="funicular"/>
 *     &lt;enumeration value="lift"/>
 *     &lt;enumeration value="snowAndIce"/>
 *     &lt;enumeration value="taxi"/>
 *     &lt;enumeration value="selfDrive"/>
 *     &lt;enumeration value="foot"/>
 *     &lt;enumeration value="bicycle"/>
 *     &lt;enumeration value="motorcycle"/>
 *     &lt;enumeration value="scooter"/>
 *     &lt;enumeration value="car"/>
 *     &lt;enumeration value="shuttle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllModesEnumeration")
@XmlEnum
public enum AllModesEnumeration {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("anyMode")
    ANY_MODE("anyMode"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("air")
    AIR("air"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("trolleyBus")
    TROLLEY_BUS("trolleyBus"),
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("coach")
    COACH("coach"),
    @XmlEnumValue("rail")
    RAIL("rail"),

    /**
     * DEPRECATED. Use mode rail with RailSubmode longDistance. -v2.0
     * 
     */
    @XmlEnumValue("intercityRail")
    INTERCITY_RAIL("intercityRail"),

    /**
     * DEPRECATED. Use mode metro with MetroSubmode urbanRail (or in some few cases rail with RailSubmode local). -v2.0
     * 
     */
    @XmlEnumValue("urbanRail")
    URBAN_RAIL("urbanRail"),
    @XmlEnumValue("metro")
    METRO("metro"),
    @XmlEnumValue("water")
    WATER("water"),
    @XmlEnumValue("ferry")
    FERRY("ferry"),
    @XmlEnumValue("cableway")
    CABLEWAY("cableway"),
    @XmlEnumValue("funicular")
    FUNICULAR("funicular"),
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("snowAndIce")
    SNOW_AND_ICE("snowAndIce"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),

    /**
     * See pti12_x.
     * 
     */
    @XmlEnumValue("selfDrive")
    SELF_DRIVE("selfDrive"),
    @XmlEnumValue("foot")
    FOOT("foot"),
    @XmlEnumValue("bicycle")
    BICYCLE("bicycle"),
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle"),
    @XmlEnumValue("scooter")
    SCOOTER("scooter"),
    @XmlEnumValue("car")
    CAR("car"),
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle");
    private final String value;

    AllModesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AllModesEnumeration fromValue(String v) {
        for (AllModesEnumeration c: AllModesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
