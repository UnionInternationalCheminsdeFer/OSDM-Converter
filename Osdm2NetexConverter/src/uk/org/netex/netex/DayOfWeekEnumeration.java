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
 * <p>Java-Klasse f�r DayOfWeekEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DayOfWeekEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Monday"/>
 *     &lt;enumeration value="Tuesday"/>
 *     &lt;enumeration value="Wednesday"/>
 *     &lt;enumeration value="Thursday"/>
 *     &lt;enumeration value="Friday"/>
 *     &lt;enumeration value="Saturday"/>
 *     &lt;enumeration value="Sunday"/>
 *     &lt;enumeration value="Everyday"/>
 *     &lt;enumeration value="Weekdays"/>
 *     &lt;enumeration value="Weekend"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayOfWeekEnumeration")
@XmlEnum
public enum DayOfWeekEnumeration {

    @XmlEnumValue("Monday")
    MONDAY("Monday"),
    @XmlEnumValue("Tuesday")
    TUESDAY("Tuesday"),
    @XmlEnumValue("Wednesday")
    WEDNESDAY("Wednesday"),
    @XmlEnumValue("Thursday")
    THURSDAY("Thursday"),
    @XmlEnumValue("Friday")
    FRIDAY("Friday"),
    @XmlEnumValue("Saturday")
    SATURDAY("Saturday"),
    @XmlEnumValue("Sunday")
    SUNDAY("Sunday"),
    @XmlEnumValue("Everyday")
    EVERYDAY("Everyday"),

    /**
     * In western countries means Monday to Friday. A better way to model this is with a Name or Description on a parent element such as AvailabilityCondition. DEPRECATED -v2.0
     * 
     */
    @XmlEnumValue("Weekdays")
    WEEKDAYS("Weekdays"),

    /**
     * In western countries means Saturday and Sunday. A better way to model this is with a Name or Description on a parent element such as AvailabilityCondition. DEPRECATED -v2.0
     * 
     */
    @XmlEnumValue("Weekend")
    WEEKEND("Weekend"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    DayOfWeekEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayOfWeekEnumeration fromValue(String v) {
        for (DayOfWeekEnumeration c: DayOfWeekEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
