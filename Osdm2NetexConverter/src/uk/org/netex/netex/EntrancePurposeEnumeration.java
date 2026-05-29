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
 * <p>Java-Klasse f�r EntrancePurposeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntrancePurposeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="main"/>
 *     &lt;enumeration value="side"/>
 *     &lt;enumeration value="back"/>
 *     &lt;enumeration value="secondary"/>
 *     &lt;enumeration value="withinStopPlace"/>
 *     &lt;enumeration value="emergencyOnly"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntrancePurposeEnumeration")
@XmlEnum
public enum EntrancePurposeEnumeration {

    @XmlEnumValue("main")
    MAIN("main"),
    @XmlEnumValue("side")
    SIDE("side"),
    @XmlEnumValue("back")
    BACK("back"),

    /**
     * Indirect access, e.g., via a shop or restaurant.
     * 
     */
    @XmlEnumValue("secondary")
    SECONDARY("secondary"),

    /**
     * An ENTRANCE for which IsExternal is false.
     * 
     */
    @XmlEnumValue("withinStopPlace")
    WITHIN_STOP_PLACE("withinStopPlace"),
    @XmlEnumValue("emergencyOnly")
    EMERGENCY_ONLY("emergencyOnly"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EntrancePurposeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntrancePurposeEnumeration fromValue(String v) {
        for (EntrancePurposeEnumeration c: EntrancePurposeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
