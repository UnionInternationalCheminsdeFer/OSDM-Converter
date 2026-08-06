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
 * <p>Java-Klasse f�r ResellTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ResellTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="partial"/>
 *     &lt;enumeration value="slidingScale"/>
 *     &lt;enumeration value="full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResellTypeEnumeration")
@XmlEnum
public enum ResellTypeEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("partial")
    PARTIAL("partial"),
    @XmlEnumValue("slidingScale")
    SLIDING_SCALE("slidingScale"),
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    ResellTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResellTypeEnumeration fromValue(String v) {
        for (ResellTypeEnumeration c: ResellTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
