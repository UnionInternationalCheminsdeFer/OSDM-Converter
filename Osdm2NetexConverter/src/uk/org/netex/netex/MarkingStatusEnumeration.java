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
 * <p>Java-Klasse f�r MarkingStatusEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MarkingStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="good"/>
 *     &lt;enumeration value="worn"/>
 *     &lt;enumeration value="hazardous"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarkingStatusEnumeration")
@XmlEnum
public enum MarkingStatusEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("good")
    GOOD("good"),
    @XmlEnumValue("worn")
    WORN("worn"),
    @XmlEnumValue("hazardous")
    HAZARDOUS("hazardous"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    MarkingStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarkingStatusEnumeration fromValue(String v) {
        for (MarkingStatusEnumeration c: MarkingStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
