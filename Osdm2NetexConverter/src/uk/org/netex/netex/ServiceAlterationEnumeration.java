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
 * <p>Java-Klasse f�r ServiceAlterationEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceAlterationEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="extraJourney"/>
 *     &lt;enumeration value="cancellation"/>
 *     &lt;enumeration value="provisional"/>
 *     &lt;enumeration value="planned"/>
 *     &lt;enumeration value="replaced"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceAlterationEnumeration")
@XmlEnum
public enum ServiceAlterationEnumeration {


    /**
     * Additional Service that was not in scheduled timetable.
     * 
     */
    @XmlEnumValue("extraJourney")
    EXTRA_JOURNEY("extraJourney"),

    /**
     * Service in planned timetable that has been cancelled.
     * 
     */
    @XmlEnumValue("cancellation")
    CANCELLATION("cancellation"),

    /**
     * Provisional service that has not yet been firmly scheduled for the timetable. +v2.0
     * 
     */
    @XmlEnumValue("provisional")
    PROVISIONAL("provisional"),

    /**
     * Planned service in the scheduled timetable.
     * 
     */
    @XmlEnumValue("planned")
    PLANNED("planned"),

    /**
     * Planned service that has been replaced with another journey.
     * 
     */
    @XmlEnumValue("replaced")
    REPLACED("replaced");
    private final String value;

    ServiceAlterationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceAlterationEnumeration fromValue(String v) {
        for (ServiceAlterationEnumeration c: ServiceAlterationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
