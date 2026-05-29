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
 * <p>Java-Klasse f�r LimitationStatusEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LimitationStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="true"/>
 *     &lt;enumeration value="false"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="partial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LimitationStatusEnumeration")
@XmlEnum
public enum LimitationStatusEnumeration {


    /**
     * All of PLACE is accessible for criteria.
     * 
     */
    @XmlEnumValue("true")
    TRUE("true"),

    /**
     * PLACE is not considered to meet accessibility criteria.
     * 
     */
    @XmlEnumValue("false")
    FALSE("false"),

    /**
     * It is not known whether PLACE meets accessibility criteria.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Some areas of PLACE are not considered to meet accessibility criteria.
     * 
     */
    @XmlEnumValue("partial")
    PARTIAL("partial");
    private final String value;

    LimitationStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LimitationStatusEnumeration fromValue(String v) {
        for (LimitationStatusEnumeration c: LimitationStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
