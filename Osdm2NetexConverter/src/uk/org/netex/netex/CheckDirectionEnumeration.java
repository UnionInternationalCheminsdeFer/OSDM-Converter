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
 * <p>Java-Klasse f�r CheckDirectionEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckDirectionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="forwards"/>
 *     &lt;enumeration value="backwards"/>
 *     &lt;enumeration value="bothWays"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckDirectionEnumeration")
@XmlEnum
public enum CheckDirectionEnumeration {

    @XmlEnumValue("forwards")
    FORWARDS("forwards"),
    @XmlEnumValue("backwards")
    BACKWARDS("backwards"),
    @XmlEnumValue("bothWays")
    BOTH_WAYS("bothWays");
    private final String value;

    CheckDirectionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckDirectionEnumeration fromValue(String v) {
        for (CheckDirectionEnumeration c: CheckDirectionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
