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
 * <p>Java-Klasse f�r GroupTicketingEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupTicketingEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="allOnOneTicket"/>
 *     &lt;enumeration value="separateTickets"/>
 *     &lt;enumeration value="ticketWithCoupons"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GroupTicketingEnumeration")
@XmlEnum
public enum GroupTicketingEnumeration {

    @XmlEnumValue("allOnOneTicket")
    ALL_ON_ONE_TICKET("allOnOneTicket"),
    @XmlEnumValue("separateTickets")
    SEPARATE_TICKETS("separateTickets"),
    @XmlEnumValue("ticketWithCoupons")
    TICKET_WITH_COUPONS("ticketWithCoupons"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GroupTicketingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupTicketingEnumeration fromValue(String v) {
        for (GroupTicketingEnumeration c: GroupTicketingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
