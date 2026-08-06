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
 * <p>Java-Klasse f�r JourneyAccountingEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="JourneyAccountingEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="contract"/>
 *     &lt;enumeration value="subsidy"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JourneyAccountingEnumeration")
@XmlEnum
public enum JourneyAccountingEnumeration {


    /**
     * ERA X01: The connection is guaranteed under any circumstances.
     * 
     */
    @XmlEnumValue("contract")
    CONTRACT("contract"),

    /**
     * ERA X02: The connection is normally guaranteed, although the connection time available is shorter than the location connection time.
     * 
     */
    @XmlEnumValue("subsidy")
    SUBSIDY("subsidy"),

    /**
     * ERA X03: The connection is not guaranteed, although the connection time available is longer than the location connection time.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    JourneyAccountingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JourneyAccountingEnumeration fromValue(String v) {
        for (JourneyAccountingEnumeration c: JourneyAccountingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
