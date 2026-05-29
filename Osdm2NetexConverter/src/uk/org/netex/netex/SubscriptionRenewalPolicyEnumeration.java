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
 * <p>Java-Klasse f�r SubscriptionRenewalPolicyEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionRenewalPolicyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="automatic"/>
 *     &lt;enumeration value="manual"/>
 *     &lt;enumeration value="automaticOnConfirmation"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionRenewalPolicyEnumeration")
@XmlEnum
public enum SubscriptionRenewalPolicyEnumeration {


    /**
     * Renew automatcally at end of term.
     * 
     */
    @XmlEnumValue("automatic")
    AUTOMATIC("automatic"),

    /**
     * Renew on request.
     * 
     */
    @XmlEnumValue("manual")
    MANUAL("manual"),

    /**
     * Confirm and renew automatcally at end of subscription term.
     * 
     */
    @XmlEnumValue("automaticOnConfirmation")
    AUTOMATIC_ON_CONFIRMATION("automaticOnConfirmation"),

    /**
     * No renewal allowed.
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SubscriptionRenewalPolicyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriptionRenewalPolicyEnumeration fromValue(String v) {
        for (SubscriptionRenewalPolicyEnumeration c: SubscriptionRenewalPolicyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
