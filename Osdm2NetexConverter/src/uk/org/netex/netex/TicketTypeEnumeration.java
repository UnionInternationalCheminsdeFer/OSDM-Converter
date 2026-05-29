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
 * <p>Java-Klasse f�r TicketTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="standard"/>
 *     &lt;enumeration value="promotion"/>
 *     &lt;enumeration value="concession"/>
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="season"/>
 *     &lt;enumeration value="carnet"/>
 *     &lt;enumeration value="travelCard"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TicketTypeEnumeration")
@XmlEnum
public enum TicketTypeEnumeration {

    @XmlEnumValue("standard")
    STANDARD("standard"),
    @XmlEnumValue("promotion")
    PROMOTION("promotion"),
    @XmlEnumValue("concession")
    CONCESSION("concession"),
    @XmlEnumValue("group")
    GROUP("group"),
    @XmlEnumValue("season")
    SEASON("season"),
    @XmlEnumValue("carnet")
    CARNET("carnet"),
    @XmlEnumValue("travelCard")
    TRAVEL_CARD("travelCard"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    TicketTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketTypeEnumeration fromValue(String v) {
        for (TicketTypeEnumeration c: TicketTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
