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
 * <p>Java-Klasse f�r DoorHandleEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DoorHandleEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="lever"/>
 *     &lt;enumeration value="button"/>
 *     &lt;enumeration value="knob"/>
 *     &lt;enumeration value="crashBar"/>
 *     &lt;enumeration value="doorHandle"/>
 *     &lt;enumeration value="grabRail"/>
 *     &lt;enumeration value="windowLever"/>
 *     &lt;enumeration value="vertical"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DoorHandleEnumeration")
@XmlEnum
public enum DoorHandleEnumeration {

    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Lever handle
     * 
     */
    @XmlEnumValue("lever")
    LEVER("lever"),
    @XmlEnumValue("button")
    BUTTON("button"),
    @XmlEnumValue("knob")
    KNOB("knob"),

    /**
     * Panic bar
     * 
     */
    @XmlEnumValue("crashBar")
    CRASH_BAR("crashBar"),

    /**
     * Door handle
     * 
     */
    @XmlEnumValue("doorHandle")
    DOOR_HANDLE("doorHandle"),

    /**
     * Grab rail or grab handle
     * 
     */
    @XmlEnumValue("grabRail")
    GRAB_RAIL("grabRail"),

    /**
     * Window lever
     * 
     */
    @XmlEnumValue("windowLever")
    WINDOW_LEVER("windowLever"),

    /**
     * Marshal's baton, vertical bar
     * 
     */
    @XmlEnumValue("vertical")
    VERTICAL("vertical"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DoorHandleEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoorHandleEnumeration fromValue(String v) {
        for (DoorHandleEnumeration c: DoorHandleEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
