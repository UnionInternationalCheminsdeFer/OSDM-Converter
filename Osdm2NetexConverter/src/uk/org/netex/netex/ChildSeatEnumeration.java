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
 * <p>Java-Klasse f�r ChildSeatEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ChildSeatEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="baby"/>
 *     &lt;enumeration value="smallChild"/>
 *     &lt;enumeration value="olderChild"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChildSeatEnumeration")
@XmlEnum
public enum ChildSeatEnumeration {

    @XmlEnumValue("baby")
    BABY("baby"),
    @XmlEnumValue("smallChild")
    SMALL_CHILD("smallChild"),
    @XmlEnumValue("olderChild")
    OLDER_CHILD("olderChild"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ChildSeatEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChildSeatEnumeration fromValue(String v) {
        for (ChildSeatEnumeration c: ChildSeatEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
