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
 * <p>Java-Klasse f�r CustomerPurchasePackageStatusEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerPurchasePackageStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="reserved"/>
 *     &lt;enumeration value="ordered"/>
 *     &lt;enumeration value="paidFor"/>
 *     &lt;enumeration value="unused"/>
 *     &lt;enumeration value="activated"/>
 *     &lt;enumeration value="partiallyUsed"/>
 *     &lt;enumeration value="used"/>
 *     &lt;enumeration value="archived"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerPurchasePackageStatusEnumeration")
@XmlEnum
public enum CustomerPurchasePackageStatusEnumeration {


    /**
     * Reserved but not paid for.
     * 
     */
    @XmlEnumValue("reserved")
    RESERVED("reserved"),

    /**
     * Purchased but not paid for.
     * 
     */
    @XmlEnumValue("ordered")
    ORDERED("ordered"),

    /**
     * Paid for.
     * 
     */
    @XmlEnumValue("paidFor")
    PAID_FOR("paidFor"),

    /**
     * Fulfilled but has not yet been used.
     * 
     */
    @XmlEnumValue("unused")
    UNUSED("unused"),

    /**
     * Activated for use.
     * 
     */
    @XmlEnumValue("activated")
    ACTIVATED("activated"),

    /**
     * Partially used.
     * 
     */
    @XmlEnumValue("partiallyUsed")
    PARTIALLY_USED("partiallyUsed"),

    /**
     * Fully used.
     * 
     */
    @XmlEnumValue("used")
    USED("used"),

    /**
     * Archived.
     * 
     */
    @XmlEnumValue("archived")
    ARCHIVED("archived"),

    /**
     * Other status.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CustomerPurchasePackageStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerPurchasePackageStatusEnumeration fromValue(String v) {
        for (CustomerPurchasePackageStatusEnumeration c: CustomerPurchasePackageStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
