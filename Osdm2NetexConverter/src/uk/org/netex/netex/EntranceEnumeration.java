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
 * <p>Java-Klasse f�r EntranceEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntranceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="opening"/>
 *     &lt;enumeration value="openDoor"/>
 *     &lt;enumeration value="door"/>
 *     &lt;enumeration value="swingDoor"/>
 *     &lt;enumeration value="revolvingDoor"/>
 *     &lt;enumeration value="automaticDoor"/>
 *     &lt;enumeration value="ticketBarrier"/>
 *     &lt;enumeration value="gate"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntranceEnumeration")
@XmlEnum
public enum EntranceEnumeration {

    @XmlEnumValue("opening")
    OPENING("opening"),
    @XmlEnumValue("openDoor")
    OPEN_DOOR("openDoor"),
    @XmlEnumValue("door")
    DOOR("door"),
    @XmlEnumValue("swingDoor")
    SWING_DOOR("swingDoor"),
    @XmlEnumValue("revolvingDoor")
    REVOLVING_DOOR("revolvingDoor"),
    @XmlEnumValue("automaticDoor")
    AUTOMATIC_DOOR("automaticDoor"),
    @XmlEnumValue("ticketBarrier")
    TICKET_BARRIER("ticketBarrier"),
    @XmlEnumValue("gate")
    GATE("gate"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EntranceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntranceEnumeration fromValue(String v) {
        for (EntranceEnumeration c: EntranceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
