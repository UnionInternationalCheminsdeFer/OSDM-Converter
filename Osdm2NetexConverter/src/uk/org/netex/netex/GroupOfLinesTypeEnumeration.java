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
 * <p>Java-Klasse f�r GroupOfLinesTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupOfLinesTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="marketing"/>
 *     &lt;enumeration value="administrative"/>
 *     &lt;enumeration value="scheduling"/>
 *     &lt;enumeration value="control"/>
 *     &lt;enumeration value="tariff"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GroupOfLinesTypeEnumeration")
@XmlEnum
public enum GroupOfLinesTypeEnumeration {


    /**
     * Grouping is primarily for marketing purposes.
     * 
     */
    @XmlEnumValue("marketing")
    MARKETING("marketing"),

    /**
     * Grouping is primarily for administrative purposes..
     * 
     */
    @XmlEnumValue("administrative")
    ADMINISTRATIVE("administrative"),

    /**
     * Grouping is primarily for creating schedules purposes.
     * 
     */
    @XmlEnumValue("scheduling")
    SCHEDULING("scheduling"),

    /**
     * Grouping is primarily for defining tariff scope.
     * 
     */
    @XmlEnumValue("control")
    CONTROL("control"),

    /**
     * Grouping is primarily for defining tariff scope.
     * 
     */
    @XmlEnumValue("tariff")
    TARIFF("tariff"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GroupOfLinesTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupOfLinesTypeEnumeration fromValue(String v) {
        for (GroupOfLinesTypeEnumeration c: GroupOfLinesTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
