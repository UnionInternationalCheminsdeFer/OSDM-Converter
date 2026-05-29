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
 * <p>Java-Klasse f�r TravelCreditPolicyEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelCreditPolicyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="allowTravel"/>
 *     &lt;enumeration value="blockAllTravel"/>
 *     &lt;enumeration value="blockPayAsYouGoTravel"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TravelCreditPolicyEnumeration")
@XmlEnum
public enum TravelCreditPolicyEnumeration {


    /**
     * Policy if credit threhsold is exceeded is still to allow further travel.
     * 
     */
    @XmlEnumValue("allowTravel")
    ALLOW_TRAVEL("allowTravel"),

    /**
     * Policy if credit threhsold is exceeded is to block all travel bu yuser.
     * 
     */
    @XmlEnumValue("blockAllTravel")
    BLOCK_ALL_TRAVEL("blockAllTravel"),

    /**
     * Policy if credit threhsold is exceeded is to block on demand travel, but still permit period pass travel.
     * 
     */
    @XmlEnumValue("blockPayAsYouGoTravel")
    BLOCK_PAY_AS_YOU_GO_TRAVEL("blockPayAsYouGoTravel"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TravelCreditPolicyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelCreditPolicyEnumeration fromValue(String v) {
        for (TravelCreditPolicyEnumeration c: TravelCreditPolicyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
