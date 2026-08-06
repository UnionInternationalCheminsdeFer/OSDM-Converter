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
 * <p>Java-Klasse f�r MarkedAsEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MarkedAsEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="unused"/>
 *     &lt;enumeration value="activated"/>
 *     &lt;enumeration value="marked"/>
 *     &lt;enumeration value="used"/>
 *     &lt;enumeration value="expired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarkedAsEnumeration")
@XmlEnum
public enum MarkedAsEnumeration {

    @XmlEnumValue("unused")
    UNUSED("unused"),
    @XmlEnumValue("activated")
    ACTIVATED("activated"),
    @XmlEnumValue("marked")
    MARKED("marked"),
    @XmlEnumValue("used")
    USED("used"),
    @XmlEnumValue("expired")
    EXPIRED("expired");
    private final String value;

    MarkedAsEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarkedAsEnumeration fromValue(String v) {
        for (MarkedAsEnumeration c: MarkedAsEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
