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
 * <p>Java-Klasse f�r PartialRefundBasisEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PartialRefundBasisEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="unusedDays"/>
 *     &lt;enumeration value="unusedWeeks"/>
 *     &lt;enumeration value="unusedMonths"/>
 *     &lt;enumeration value="unusedSemesters"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PartialRefundBasisEnumeration")
@XmlEnum
public enum PartialRefundBasisEnumeration {


    /**
     * Refund is given for any unused days.
     * 
     */
    @XmlEnumValue("unusedDays")
    UNUSED_DAYS("unusedDays"),

    /**
     * Refund is given for any unused weeks
     * 
     */
    @XmlEnumValue("unusedWeeks")
    UNUSED_WEEKS("unusedWeeks"),

    /**
     * Refund is given for any unused months
     * 
     */
    @XmlEnumValue("unusedMonths")
    UNUSED_MONTHS("unusedMonths"),
    @XmlEnumValue("unusedSemesters")
    UNUSED_SEMESTERS("unusedSemesters"),

    /**
     * Other basis.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PartialRefundBasisEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartialRefundBasisEnumeration fromValue(String v) {
        for (PartialRefundBasisEnumeration c: PartialRefundBasisEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
