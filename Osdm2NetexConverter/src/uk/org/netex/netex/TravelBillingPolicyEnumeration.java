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
 * <p>Java-Klasse f�r TravelBillingPolicyEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelBillingPolicyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="billAsYouGo"/>
 *     &lt;enumeration value="billOnThreshold"/>
 *     &lt;enumeration value="billAtFareDayEnd"/>
 *     &lt;enumeration value="billAtPeriodEnd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TravelBillingPolicyEnumeration")
@XmlEnum
public enum TravelBillingPolicyEnumeration {


    /**
     * Bill for use immediately on incurring travel.
     * 
     */
    @XmlEnumValue("billAsYouGo")
    BILL_AS_YOU_GO("billAsYouGo"),

    /**
     * Only raise bill when threshold is reached
     * 
     */
    @XmlEnumValue("billOnThreshold")
    BILL_ON_THRESHOLD("billOnThreshold"),

    /**
     * Bill at end of evey fare day.
     * 
     */
    @XmlEnumValue("billAtFareDayEnd")
    BILL_AT_FARE_DAY_END("billAtFareDayEnd"),

    /**
     * Bill at end of a specified period.
     * 
     */
    @XmlEnumValue("billAtPeriodEnd")
    BILL_AT_PERIOD_END("billAtPeriodEnd");
    private final String value;

    TravelBillingPolicyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelBillingPolicyEnumeration fromValue(String v) {
        for (TravelBillingPolicyEnumeration c: TravelBillingPolicyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
