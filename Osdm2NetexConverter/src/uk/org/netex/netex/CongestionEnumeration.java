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
 * <p>Java-Klasse f�r CongestionEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CongestionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noWaiting"/>
 *     &lt;enumeration value="queue"/>
 *     &lt;enumeration value="crowding"/>
 *     &lt;enumeration value="full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CongestionEnumeration")
@XmlEnum
public enum CongestionEnumeration {

    @XmlEnumValue("noWaiting")
    NO_WAITING("noWaiting"),
    @XmlEnumValue("queue")
    QUEUE("queue"),
    @XmlEnumValue("crowding")
    CROWDING("crowding"),
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    CongestionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CongestionEnumeration fromValue(String v) {
        for (CongestionEnumeration c: CongestionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
