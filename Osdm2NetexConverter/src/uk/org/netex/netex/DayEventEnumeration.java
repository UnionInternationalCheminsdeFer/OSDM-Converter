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
 * <p>Java-Klasse f�r DayEventEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DayEventEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anyDay"/>
 *     &lt;enumeration value="normalDay"/>
 *     &lt;enumeration value="marketDay"/>
 *     &lt;enumeration value="matchDay"/>
 *     &lt;enumeration value="eventDay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayEventEnumeration")
@XmlEnum
public enum DayEventEnumeration {

    @XmlEnumValue("anyDay")
    ANY_DAY("anyDay"),
    @XmlEnumValue("normalDay")
    NORMAL_DAY("normalDay"),
    @XmlEnumValue("marketDay")
    MARKET_DAY("marketDay"),
    @XmlEnumValue("matchDay")
    MATCH_DAY("matchDay"),
    @XmlEnumValue("eventDay")
    EVENT_DAY("eventDay");
    private final String value;

    DayEventEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayEventEnumeration fromValue(String v) {
        for (DayEventEnumeration c: DayEventEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
