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
 * <p>Java-Klasse f�r MeetingUsageEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetingUsageEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="pickUp"/>
 *     &lt;enumeration value="setDown"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeetingUsageEnumeration")
@XmlEnum
public enum MeetingUsageEnumeration {

    @XmlEnumValue("pickUp")
    PICK_UP("pickUp"),
    @XmlEnumValue("setDown")
    SET_DOWN("setDown"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    MeetingUsageEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeetingUsageEnumeration fromValue(String v) {
        for (MeetingUsageEnumeration c: MeetingUsageEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
