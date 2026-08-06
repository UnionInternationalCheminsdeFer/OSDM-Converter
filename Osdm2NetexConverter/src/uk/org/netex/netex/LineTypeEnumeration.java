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
 * <p>Java-Klasse f�r LineTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LineTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="local"/>
 *     &lt;enumeration value="urban"/>
 *     &lt;enumeration value="longDistance"/>
 *     &lt;enumeration value="express"/>
 *     &lt;enumeration value="seasonal"/>
 *     &lt;enumeration value="replacement"/>
 *     &lt;enumeration value="flexible"/>
 *     &lt;enumeration value="corridorService"/>
 *     &lt;enumeration value="mainRouteWithFlexibleEnds"/>
 *     &lt;enumeration value="flexibleAreasOnly"/>
 *     &lt;enumeration value="hailAndRideSections"/>
 *     &lt;enumeration value="fixedStopAreaWide"/>
 *     &lt;enumeration value="freeAreaAreaWide"/>
 *     &lt;enumeration value="mixedFlexible"/>
 *     &lt;enumeration value="mixedFlexibleAndFixed"/>
 *     &lt;enumeration value="fixed"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineTypeEnumeration")
@XmlEnum
public enum LineTypeEnumeration {

    @XmlEnumValue("local")
    LOCAL("local"),
    @XmlEnumValue("urban")
    URBAN("urban"),
    @XmlEnumValue("longDistance")
    LONG_DISTANCE("longDistance"),
    @XmlEnumValue("express")
    EXPRESS("express"),
    @XmlEnumValue("seasonal")
    SEASONAL("seasonal"),
    @XmlEnumValue("replacement")
    REPLACEMENT("replacement"),
    @XmlEnumValue("flexible")
    FLEXIBLE("flexible"),
    @XmlEnumValue("corridorService")
    CORRIDOR_SERVICE("corridorService"),
    @XmlEnumValue("mainRouteWithFlexibleEnds")
    MAIN_ROUTE_WITH_FLEXIBLE_ENDS("mainRouteWithFlexibleEnds"),
    @XmlEnumValue("flexibleAreasOnly")
    FLEXIBLE_AREAS_ONLY("flexibleAreasOnly"),
    @XmlEnumValue("hailAndRideSections")
    HAIL_AND_RIDE_SECTIONS("hailAndRideSections"),
    @XmlEnumValue("fixedStopAreaWide")
    FIXED_STOP_AREA_WIDE("fixedStopAreaWide"),
    @XmlEnumValue("freeAreaAreaWide")
    FREE_AREA_AREA_WIDE("freeAreaAreaWide"),
    @XmlEnumValue("mixedFlexible")
    MIXED_FLEXIBLE("mixedFlexible"),
    @XmlEnumValue("mixedFlexibleAndFixed")
    MIXED_FLEXIBLE_AND_FIXED("mixedFlexibleAndFixed"),
    @XmlEnumValue("fixed")
    FIXED("fixed"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LineTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineTypeEnumeration fromValue(String v) {
        for (LineTypeEnumeration c: LineTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
