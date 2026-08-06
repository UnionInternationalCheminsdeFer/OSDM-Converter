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
 * <p>Java-Klasse f�r RegisterBreakOfJourneyEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RegisterBreakOfJourneyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="markByStaff"/>
 *     &lt;enumeration value="markByValidator"/>
 *     &lt;enumeration value="markByMobileApp"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegisterBreakOfJourneyEnumeration")
@XmlEnum
public enum RegisterBreakOfJourneyEnumeration {


    /**
     * No action needed.
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * JourneyBreak must be marked by operator staff.
     * 
     */
    @XmlEnumValue("markByStaff")
    MARK_BY_STAFF("markByStaff"),

    /**
     * Journey Break must be marked by validator.
     * 
     */
    @XmlEnumValue("markByValidator")
    MARK_BY_VALIDATOR("markByValidator"),

    /**
     * Journey Break must be marked using mobile application.
     * 
     */
    @XmlEnumValue("markByMobileApp")
    MARK_BY_MOBILE_APP("markByMobileApp"),

    /**
     * Journey Break must be marked by othermeans.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RegisterBreakOfJourneyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegisterBreakOfJourneyEnumeration fromValue(String v) {
        for (RegisterBreakOfJourneyEnumeration c: RegisterBreakOfJourneyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
