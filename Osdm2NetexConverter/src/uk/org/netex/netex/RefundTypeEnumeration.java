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
 * <p>Java-Klasse f�r RefundTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="unused"/>
 *     &lt;enumeration value="delay"/>
 *     &lt;enumeration value="cancellation"/>
 *     &lt;enumeration value="partialJourney"/>
 *     &lt;enumeration value="earlyTermination"/>
 *     &lt;enumeration value="changeOfGroupSize"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefundTypeEnumeration")
@XmlEnum
public enum RefundTypeEnumeration {


    /**
     * Refund for unused ticket or pass.
     * 
     */
    @XmlEnumValue("unused")
    UNUSED("unused"),

    /**
     * Refund is for delayed journey.
     * 
     */
    @XmlEnumValue("delay")
    DELAY("delay"),

    /**
     * Refund is for cancelled journey.
     * 
     */
    @XmlEnumValue("cancellation")
    CANCELLATION("cancellation"),

    /**
     * Refund is for unusued section of a journey.
     * 
     */
    @XmlEnumValue("partialJourney")
    PARTIAL_JOURNEY("partialJourney"),

    /**
     * Partial refund is for early termination of a period pass or season ticket.
     * 
     */
    @XmlEnumValue("earlyTermination")
    EARLY_TERMINATION("earlyTermination"),

    /**
     * Refund for change of group size.
     * 
     */
    @XmlEnumValue("changeOfGroupSize")
    CHANGE_OF_GROUP_SIZE("changeOfGroupSize"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RefundTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundTypeEnumeration fromValue(String v) {
        for (RefundTypeEnumeration c: RefundTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
