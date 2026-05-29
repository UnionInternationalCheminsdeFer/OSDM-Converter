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
 * <p>Java-Klasse f�r FlexibleRouteTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FlexibleRouteTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="flexibleAreasOnly"/>
 *     &lt;enumeration value="hailAndRideSections"/>
 *     &lt;enumeration value="mixed"/>
 *     &lt;enumeration value="fixed"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlexibleRouteTypeEnumeration")
@XmlEnum
public enum FlexibleRouteTypeEnumeration {

    @XmlEnumValue("flexibleAreasOnly")
    FLEXIBLE_AREAS_ONLY("flexibleAreasOnly"),
    @XmlEnumValue("hailAndRideSections")
    HAIL_AND_RIDE_SECTIONS("hailAndRideSections"),
    @XmlEnumValue("mixed")
    MIXED("mixed"),
    @XmlEnumValue("fixed")
    FIXED("fixed"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    FlexibleRouteTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlexibleRouteTypeEnumeration fromValue(String v) {
        for (FlexibleRouteTypeEnumeration c: FlexibleRouteTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
