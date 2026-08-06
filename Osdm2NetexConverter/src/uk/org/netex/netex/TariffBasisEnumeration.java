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
 * <p>Java-Klasse f�r TariffBasisEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TariffBasisEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="flat"/>
 *     &lt;enumeration value="distance"/>
 *     &lt;enumeration value="unitSection"/>
 *     &lt;enumeration value="zone"/>
 *     &lt;enumeration value="zoneToZone"/>
 *     &lt;enumeration value="pointToPoint"/>
 *     &lt;enumeration value="route"/>
 *     &lt;enumeration value="tour"/>
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="discount"/>
 *     &lt;enumeration value="period"/>
 *     &lt;enumeration value="free"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TariffBasisEnumeration")
@XmlEnum
public enum TariffBasisEnumeration {


    /**
     * Tariff is flat, i.e. not based on spatial elements.
     * 
     */
    @XmlEnumValue("flat")
    FLAT("flat"),

    /**
     * Tariff is based on spatial distance.
     * 
     */
    @XmlEnumValue("distance")
    DISTANCE("distance"),
    @XmlEnumValue("unitSection")
    UNIT_SECTION("unitSection"),

    /**
     * Tariff is based on use of specified zones.
     * 
     */
    @XmlEnumValue("zone")
    ZONE("zone"),

    /**
     * Tariff is based on specified zone to zone transitions.
     * 
     */
    @XmlEnumValue("zoneToZone")
    ZONE_TO_ZONE("zoneToZone"),

    /**
     * Tariff is based on specified point to point transitions.
     * 
     */
    @XmlEnumValue("pointToPoint")
    POINT_TO_POINT("pointToPoint"),

    /**
     * Tariff is based on specific routes, eg. for SERIES CONSTRAINTs.
     * 
     */
    @XmlEnumValue("route")
    ROUTE("route"),

    /**
     * Tariff is based on a specific tour.
     * 
     */
    @XmlEnumValue("tour")
    TOUR("tour"),

    /**
     * Tariff is based on size of group.
     * 
     */
    @XmlEnumValue("group")
    GROUP("group"),

    /**
     * Tariff is for discount rates.
     * 
     */
    @XmlEnumValue("discount")
    DISCOUNT("discount"),

    /**
     * Tariff is based on temporal durtaions, e.g minutes or days of travel.
     * 
     */
    @XmlEnumValue("period")
    PERIOD("period"),

    /**
     * Tariff is free to user.
     * 
     */
    @XmlEnumValue("free")
    FREE("free"),

    /**
     * Other Tariff Basis.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TariffBasisEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TariffBasisEnumeration fromValue(String v) {
        for (TariffBasisEnumeration c: TariffBasisEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
