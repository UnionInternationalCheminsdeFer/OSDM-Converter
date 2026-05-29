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
 * <p>Java-Klasse f�r GradientEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GradientEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="verySteep"/>
 *     &lt;enumeration value="steep"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="gentle"/>
 *     &lt;enumeration value="level"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GradientEnumeration")
@XmlEnum
public enum GradientEnumeration {

    @XmlEnumValue("verySteep")
    VERY_STEEP("verySteep"),
    @XmlEnumValue("steep")
    STEEP("steep"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("gentle")
    GENTLE("gentle"),
    @XmlEnumValue("level")
    LEVEL("level");
    private final String value;

    GradientEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GradientEnumeration fromValue(String v) {
        for (GradientEnumeration c: GradientEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
