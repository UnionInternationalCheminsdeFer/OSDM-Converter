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
 * <p>Java-Klasse f�r IntervalTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntervalTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="stop"/>
 *     &lt;enumeration value="tariffZone"/>
 *     &lt;enumeration value="distance"/>
 *     &lt;enumeration value="section"/>
 *     &lt;enumeration value="coupon"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntervalTypeEnumeration")
@XmlEnum
public enum IntervalTypeEnumeration {

    @XmlEnumValue("stop")
    STOP("stop"),
    @XmlEnumValue("tariffZone")
    TARIFF_ZONE("tariffZone"),
    @XmlEnumValue("distance")
    DISTANCE("distance"),
    @XmlEnumValue("section")
    SECTION("section"),
    @XmlEnumValue("coupon")
    COUPON("coupon"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    IntervalTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntervalTypeEnumeration fromValue(String v) {
        for (IntervalTypeEnumeration c: IntervalTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
