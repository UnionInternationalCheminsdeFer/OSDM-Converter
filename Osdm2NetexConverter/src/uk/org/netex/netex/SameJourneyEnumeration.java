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
 * <p>Java-Klasse f�r SameJourneyEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SameJourneyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="any"/>
 *     &lt;enumeration value="same"/>
 *     &lt;enumeration value="similar"/>
 *     &lt;enumeration value="different"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SameJourneyEnumeration")
@XmlEnum
public enum SameJourneyEnumeration {

    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("same")
    SAME("same"),
    @XmlEnumValue("similar")
    SIMILAR("similar"),
    @XmlEnumValue("different")
    DIFFERENT("different");
    private final String value;

    SameJourneyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SameJourneyEnumeration fromValue(String v) {
        for (SameJourneyEnumeration c: SameJourneyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
