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
 * <p>Java-Klasse f�r OnCeasingEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OnCeasingEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="immediateTermination"/>
 *     &lt;enumeration value="useUntilExpiry"/>
 *     &lt;enumeration value="terminateAfterGracePeriod"/>
 *     &lt;enumeration value="automaticallySubstituteProduct"/>
 *     &lt;enumeration value="noAction"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OnCeasingEnumeration")
@XmlEnum
public enum OnCeasingEnumeration {


    /**
     * If user ceases to be eligible, automatically terminate validity of an elibility dependent product.
     * 
     */
    @XmlEnumValue("immediateTermination")
    IMMEDIATE_TERMINATION("immediateTermination"),

    /**
     * If user ceases to be eligible, they may go on using the product until it expires..
     * 
     */
    @XmlEnumValue("useUntilExpiry")
    USE_UNTIL_EXPIRY("useUntilExpiry"),

    /**
     * If user ceases to be eligible, termination take place after the end of a grace period
     * 
     */
    @XmlEnumValue("terminateAfterGracePeriod")
    TERMINATE_AFTER_GRACE_PERIOD("terminateAfterGracePeriod"),
    @XmlEnumValue("automaticallySubstituteProduct")
    AUTOMATICALLY_SUBSTITUTE_PRODUCT("automaticallySubstituteProduct"),

    /**
     * If user ceases to be eligible, automatically substitute them with an appropiate replacement product.
     * 
     */
    @XmlEnumValue("noAction")
    NO_ACTION("noAction"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    OnCeasingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnCeasingEnumeration fromValue(String v) {
        for (OnCeasingEnumeration c: OnCeasingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
