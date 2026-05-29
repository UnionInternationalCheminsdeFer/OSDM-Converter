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
 * <p>Java-Klasse f�r BookingChargeTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BookingChargeTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="fullAmount"/>
 *     &lt;enumeration value="blockFullAmountOnCard"/>
 *     &lt;enumeration value="deposit"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BookingChargeTypeEnumeration")
@XmlEnum
public enum BookingChargeTypeEnumeration {


    /**
     * Purchase and payment.
     * 
     */
    @XmlEnumValue("fullAmount")
    FULL_AMOUNT("fullAmount"),

    /**
     * The full amount is blocked on card against customer�s credit limit but not charged.
     * 
     */
    @XmlEnumValue("blockFullAmountOnCard")
    BLOCK_FULL_AMOUNT_ON_CARD("blockFullAmountOnCard"),

    /**
     * Purchase with deferred payment.
     * 
     */
    @XmlEnumValue("deposit")
    DEPOSIT("deposit"),
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Reservation but not necessarily payment.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    BookingChargeTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookingChargeTypeEnumeration fromValue(String v) {
        for (BookingChargeTypeEnumeration c: BookingChargeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
