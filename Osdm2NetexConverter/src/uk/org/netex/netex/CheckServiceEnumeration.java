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
 * <p>Java-Klasse f�r CheckServiceEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckServiceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="selfService"/>
 *     &lt;enumeration value="counterService"/>
 *     &lt;enumeration value="anyService"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckServiceEnumeration")
@XmlEnum
public enum CheckServiceEnumeration {

    @XmlEnumValue("selfService")
    SELF_SERVICE("selfService"),
    @XmlEnumValue("counterService")
    COUNTER_SERVICE("counterService"),
    @XmlEnumValue("anyService")
    ANY_SERVICE("anyService"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CheckServiceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckServiceEnumeration fromValue(String v) {
        for (CheckServiceEnumeration c: CheckServiceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
