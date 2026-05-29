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
 * <p>Java-Klasse f�r ScopingMethodEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ScopingMethodEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="explicitStops"/>
 *     &lt;enumeration value="implicitSpatialProjection"/>
 *     &lt;enumeration value="explicitPeripheryStops"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScopingMethodEnumeration")
@XmlEnum
public enum ScopingMethodEnumeration {


    /**
     * Stops that are members of the zone are explicitly listed.
     * 
     */
    @XmlEnumValue("explicitStops")
    EXPLICIT_STOPS("explicitStops"),

    /**
     * Any stop that is spatially contained within the zone is assumed to be a member.
     * 
     */
    @XmlEnumValue("implicitSpatialProjection")
    IMPLICIT_SPATIAL_PROJECTION("implicitSpatialProjection"),

    /**
     * The extent of the zone is indicated by a set of stops marking the border points on the periphery of the FARE ZONE. Any stop that is spatially contained within the indicated zone is assumed to be a member.
     * 
     */
    @XmlEnumValue("explicitPeripheryStops")
    EXPLICIT_PERIPHERY_STOPS("explicitPeripheryStops"),

    /**
     * Other method
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ScopingMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScopingMethodEnumeration fromValue(String v) {
        for (ScopingMethodEnumeration c: ScopingMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
