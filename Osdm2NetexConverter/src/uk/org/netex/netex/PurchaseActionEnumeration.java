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
 * <p>Java-Klasse f�r PurchaseActionEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PurchaseActionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="purchase"/>
 *     &lt;enumeration value="orderWithoutPayment"/>
 *     &lt;enumeration value="reserve"/>
 *     &lt;enumeration value="payForPreviousOrder"/>
 *     &lt;enumeration value="subscribe"/>
 *     &lt;enumeration value="payInstallment"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurchaseActionEnumeration")
@XmlEnum
public enum PurchaseActionEnumeration {


    /**
     * Purchase and payment.
     * 
     */
    @XmlEnumValue("purchase")
    PURCHASE("purchase"),

    /**
     * Purchase with deferred payment.
     * 
     */
    @XmlEnumValue("orderWithoutPayment")
    ORDER_WITHOUT_PAYMENT("orderWithoutPayment"),

    /**
     * Reervation but not necessarily payment
     * 
     */
    @XmlEnumValue("reserve")
    RESERVE("reserve"),

    /**
     * Payment for previously ordered service.
     * 
     */
    @XmlEnumValue("payForPreviousOrder")
    PAY_FOR_PREVIOUS_ORDER("payForPreviousOrder"),
    @XmlEnumValue("subscribe")
    SUBSCRIBE("subscribe"),
    @XmlEnumValue("payInstallment")
    PAY_INSTALLMENT("payInstallment"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PurchaseActionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseActionEnumeration fromValue(String v) {
        for (PurchaseActionEnumeration c: PurchaseActionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
