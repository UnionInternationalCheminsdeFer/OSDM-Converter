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
 * <p>Java-Klasse f�r FlexibleServiceEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FlexibleServiceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dynamicPassingTimes"/>
 *     &lt;enumeration value="fixedHeadwayFrequency"/>
 *     &lt;enumeration value="fixedPassingTimes"/>
 *     &lt;enumeration value="notFlexible"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlexibleServiceEnumeration")
@XmlEnum
public enum FlexibleServiceEnumeration {

    @XmlEnumValue("dynamicPassingTimes")
    DYNAMIC_PASSING_TIMES("dynamicPassingTimes"),
    @XmlEnumValue("fixedHeadwayFrequency")
    FIXED_HEADWAY_FREQUENCY("fixedHeadwayFrequency"),
    @XmlEnumValue("fixedPassingTimes")
    FIXED_PASSING_TIMES("fixedPassingTimes"),
    @XmlEnumValue("notFlexible")
    NOT_FLEXIBLE("notFlexible"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    FlexibleServiceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlexibleServiceEnumeration fromValue(String v) {
        for (FlexibleServiceEnumeration c: FlexibleServiceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
