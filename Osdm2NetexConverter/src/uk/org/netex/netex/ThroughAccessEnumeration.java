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
 * <p>Java-Klasse f�r ThroughAccessEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ThroughAccessEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="noThroughAccess"/>
 *     &lt;enumeration value="openEntrance"/>
 *     &lt;enumeration value="door"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThroughAccessEnumeration")
@XmlEnum
public enum ThroughAccessEnumeration {


    /**
     * No through access to next carriage
     * 
     */
    @XmlEnumValue("noThroughAccess")
    NO_THROUGH_ACCESS("noThroughAccess"),

    /**
     * Access to next carriage through open entrance
     * 
     */
    @XmlEnumValue("openEntrance")
    OPEN_ENTRANCE("openEntrance"),

    /**
     * Access to next carriage through door that can be opened.
     * 
     */
    @XmlEnumValue("door")
    DOOR("door"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ThroughAccessEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThroughAccessEnumeration fromValue(String v) {
        for (ThroughAccessEnumeration c: ThroughAccessEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
