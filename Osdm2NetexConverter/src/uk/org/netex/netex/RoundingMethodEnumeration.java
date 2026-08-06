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
 * <p>Java-Klasse f�r RoundingMethodEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoundingMethodEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="down"/>
 *     &lt;enumeration value="up"/>
 *     &lt;enumeration value="split"/>
 *     &lt;enumeration value="stepTable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoundingMethodEnumeration")
@XmlEnum
public enum RoundingMethodEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("down")
    DOWN("down"),
    @XmlEnumValue("up")
    UP("up"),
    @XmlEnumValue("split")
    SPLIT("split"),
    @XmlEnumValue("stepTable")
    STEP_TABLE("stepTable");
    private final String value;

    RoundingMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoundingMethodEnumeration fromValue(String v) {
        for (RoundingMethodEnumeration c: RoundingMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
