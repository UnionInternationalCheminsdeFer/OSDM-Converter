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
 * <p>Java-Klasse f�r CoveredEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CoveredEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="indoors"/>
 *     &lt;enumeration value="outdoors"/>
 *     &lt;enumeration value="covered"/>
 *     &lt;enumeration value="mixed"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="true"/>
 *     &lt;enumeration value="false"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoveredEnumeration")
@XmlEnum
public enum CoveredEnumeration {

    @XmlEnumValue("indoors")
    INDOORS("indoors"),
    @XmlEnumValue("outdoors")
    OUTDOORS("outdoors"),
    @XmlEnumValue("covered")
    COVERED("covered"),
    @XmlEnumValue("mixed")
    MIXED("mixed"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Value to be used, if covered is used as a "boolean". Equals covered. Deprecated. -v2.0
     * 
     */
    @XmlEnumValue("true")
    TRUE("true"),

    /**
     * Value to be used, if covered is used as a "boolean". Equals outdoors. Deprecated. -v2.0
     * 
     */
    @XmlEnumValue("false")
    FALSE("false");
    private final String value;

    CoveredEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoveredEnumeration fromValue(String v) {
        for (CoveredEnumeration c: CoveredEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
