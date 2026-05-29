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
 * <p>Java-Klasse f�r MetroSubmodeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MetroSubmodeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="metro"/>
 *     &lt;enumeration value="tube"/>
 *     &lt;enumeration value="urbanRailway"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetroSubmodeEnumeration")
@XmlEnum
public enum MetroSubmodeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("metro")
    METRO("metro"),

    /**
     * DEPRECATED. Use metro
     * 
     */
    @XmlEnumValue("tube")
    TUBE("tube"),

    /**
     * Replaces the Mode urbanRail.
     * 
     */
    @XmlEnumValue("urbanRailway")
    URBAN_RAILWAY("urbanRailway");
    private final String value;

    MetroSubmodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetroSubmodeEnumeration fromValue(String v) {
        for (MetroSubmodeEnumeration c: MetroSubmodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
