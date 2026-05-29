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
 * <p>Java-Klasse f�r EntranceTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntranceTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="door"/>
 *     &lt;enumeration value="doorway"/>
 *     &lt;enumeration value="revolvingDoor"/>
 *     &lt;enumeration value="slidingDoors"/>
 *     &lt;enumeration value="barrier"/>
 *     &lt;enumeration value="ticketBarrier"/>
 *     &lt;enumeration value="idBarrier"/>
 *     &lt;enumeration value="gate"/>
 *     &lt;enumeration value="style"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntranceTypeEnumeration")
@XmlEnum
public enum EntranceTypeEnumeration {

    @XmlEnumValue("door")
    DOOR("door"),
    @XmlEnumValue("doorway")
    DOORWAY("doorway"),
    @XmlEnumValue("revolvingDoor")
    REVOLVING_DOOR("revolvingDoor"),
    @XmlEnumValue("slidingDoors")
    SLIDING_DOORS("slidingDoors"),
    @XmlEnumValue("barrier")
    BARRIER("barrier"),
    @XmlEnumValue("ticketBarrier")
    TICKET_BARRIER("ticketBarrier"),
    @XmlEnumValue("idBarrier")
    ID_BARRIER("idBarrier"),
    @XmlEnumValue("gate")
    GATE("gate"),
    @XmlEnumValue("style")
    STYLE("style"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EntranceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntranceTypeEnumeration fromValue(String v) {
        for (EntranceTypeEnumeration c: EntranceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
