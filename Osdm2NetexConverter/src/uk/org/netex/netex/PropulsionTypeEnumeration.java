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
 * <p>Java-Klasse f�r PropulsionTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PropulsionTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="combustion"/>
 *     &lt;enumeration value="electric"/>
 *     &lt;enumeration value="electricAssist"/>
 *     &lt;enumeration value="hybrid"/>
 *     &lt;enumeration value="human"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropulsionTypeEnumeration")
@XmlEnum
public enum PropulsionTypeEnumeration {

    @XmlEnumValue("combustion")
    COMBUSTION("combustion"),
    @XmlEnumValue("electric")
    ELECTRIC("electric"),
    @XmlEnumValue("electricAssist")
    ELECTRIC_ASSIST("electricAssist"),
    @XmlEnumValue("hybrid")
    HYBRID("hybrid"),
    @XmlEnumValue("human")
    HUMAN("human"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PropulsionTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropulsionTypeEnumeration fromValue(String v) {
        for (PropulsionTypeEnumeration c: PropulsionTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
