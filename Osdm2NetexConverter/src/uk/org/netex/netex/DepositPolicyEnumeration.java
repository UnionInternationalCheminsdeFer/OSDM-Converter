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
 * <p>Java-Klasse f�r DepositPolicyEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DepositPolicyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="depositTaken"/>
 *     &lt;enumeration value="depositBlocked"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DepositPolicyEnumeration")
@XmlEnum
public enum DepositPolicyEnumeration {


    /**
     * No deposit required.
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Deposit charged and later refunded.
     * 
     */
    @XmlEnumValue("depositTaken")
    DEPOSIT_TAKEN("depositTaken"),

    /**
     * Deposit amount blocked on card but not subtracted.
     * 
     */
    @XmlEnumValue("depositBlocked")
    DEPOSIT_BLOCKED("depositBlocked"),

    /**
     * Other policy.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DepositPolicyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DepositPolicyEnumeration fromValue(String v) {
        for (DepositPolicyEnumeration c: DepositPolicyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
