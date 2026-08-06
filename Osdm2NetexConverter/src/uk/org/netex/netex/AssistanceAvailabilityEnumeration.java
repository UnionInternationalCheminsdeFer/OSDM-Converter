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
 * <p>Java-Klasse f�r AssistanceAvailabilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AssistanceAvailabilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="available"/>
 *     &lt;enumeration value="availableIfBooked"/>
 *     &lt;enumeration value="availableAtCertainTimes"/>
 *     &lt;enumeration value="availableDependentOnJourney"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssistanceAvailabilityEnumeration")
@XmlEnum
public enum AssistanceAvailabilityEnumeration {


    /**
     * Assistance is not available.
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Assistance is nornally available.
     * 
     */
    @XmlEnumValue("available")
    AVAILABLE("available"),

    /**
     * Assistance is available if booked.
     * 
     */
    @XmlEnumValue("availableIfBooked")
    AVAILABLE_IF_BOOKED("availableIfBooked"),

    /**
     * Assistance is available at certain times.
     * 
     */
    @XmlEnumValue("availableAtCertainTimes")
    AVAILABLE_AT_CERTAIN_TIMES("availableAtCertainTimes"),

    /**
     * Assistance is dependent on the journey.
     * 
     */
    @XmlEnumValue("availableDependentOnJourney")
    AVAILABLE_DEPENDENT_ON_JOURNEY("availableDependentOnJourney"),

    /**
     * Not known if assistance is available.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    AssistanceAvailabilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssistanceAvailabilityEnumeration fromValue(String v) {
        for (AssistanceAvailabilityEnumeration c: AssistanceAvailabilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
