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
 * <p>Java-Klasse f�r TactileWarningStripEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TactileWarningStripEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="tactileStripAtBeginning"/>
 *     &lt;enumeration value="tactileStripAtEnd"/>
 *     &lt;enumeration value="tactileStripAtBothEnds"/>
 *     &lt;enumeration value="noTactileStrip"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TactileWarningStripEnumeration")
@XmlEnum
public enum TactileWarningStripEnumeration {

    @XmlEnumValue("tactileStripAtBeginning")
    TACTILE_STRIP_AT_BEGINNING("tactileStripAtBeginning"),
    @XmlEnumValue("tactileStripAtEnd")
    TACTILE_STRIP_AT_END("tactileStripAtEnd"),
    @XmlEnumValue("tactileStripAtBothEnds")
    TACTILE_STRIP_AT_BOTH_ENDS("tactileStripAtBothEnds"),
    @XmlEnumValue("noTactileStrip")
    NO_TACTILE_STRIP("noTactileStrip"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TactileWarningStripEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TactileWarningStripEnumeration fromValue(String v) {
        for (TactileWarningStripEnumeration c: TactileWarningStripEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
