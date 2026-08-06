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
 * <p>Java-Klasse f�r DistributionRightsEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DistributionRightsEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="sell"/>
 *     &lt;enumeration value="exchange"/>
 *     &lt;enumeration value="refund"/>
 *     &lt;enumeration value="inform"/>
 *     &lt;enumeration value="book"/>
 *     &lt;enumeration value="private"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DistributionRightsEnumeration")
@XmlEnum
public enum DistributionRightsEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("sell")
    SELL("sell"),
    @XmlEnumValue("exchange")
    EXCHANGE("exchange"),
    @XmlEnumValue("refund")
    REFUND("refund"),
    @XmlEnumValue("inform")
    INFORM("inform"),

    /**
     * Distributor may do a booking for the product. +v1.2.2
     * 
     */
    @XmlEnumValue("book")
    BOOK("book"),
    @XmlEnumValue("private")
    PRIVATE("private"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DistributionRightsEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistributionRightsEnumeration fromValue(String v) {
        for (DistributionRightsEnumeration c: DistributionRightsEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
