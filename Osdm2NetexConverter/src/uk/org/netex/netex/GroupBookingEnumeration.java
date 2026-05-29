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
 * <p>Java-Klasse f�r GroupBookingEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupBookingEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="groupsAllowed"/>
 *     &lt;enumeration value="groupsNotAllowed"/>
 *     &lt;enumeration value="groupsAllowedWithReservation"/>
 *     &lt;enumeration value="groupBookingsRestricted"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GroupBookingEnumeration")
@XmlEnum
public enum GroupBookingEnumeration {

    @XmlEnumValue("groupsAllowed")
    GROUPS_ALLOWED("groupsAllowed"),
    @XmlEnumValue("groupsNotAllowed")
    GROUPS_NOT_ALLOWED("groupsNotAllowed"),
    @XmlEnumValue("groupsAllowedWithReservation")
    GROUPS_ALLOWED_WITH_RESERVATION("groupsAllowedWithReservation"),
    @XmlEnumValue("groupBookingsRestricted")
    GROUP_BOOKINGS_RESTRICTED("groupBookingsRestricted"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    GroupBookingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupBookingEnumeration fromValue(String v) {
        for (GroupBookingEnumeration c: GroupBookingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
