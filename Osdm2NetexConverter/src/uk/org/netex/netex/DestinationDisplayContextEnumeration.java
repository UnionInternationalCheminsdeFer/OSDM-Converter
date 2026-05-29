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
 * <p>Java-Klasse f�r DestinationDisplayContextEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DestinationDisplayContextEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="any"/>
 *     &lt;enumeration value="continueTo"/>
 *     &lt;enumeration value="endsAt"/>
 *     &lt;enumeration value="transferAt"/>
 *     &lt;enumeration value="via"/>
 *     &lt;enumeration value="inMessage"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DestinationDisplayContextEnumeration")
@XmlEnum
public enum DestinationDisplayContextEnumeration {

    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("continueTo")
    CONTINUE_TO("continueTo"),
    @XmlEnumValue("endsAt")
    ENDS_AT("endsAt"),
    @XmlEnumValue("transferAt")
    TRANSFER_AT("transferAt"),
    @XmlEnumValue("via")
    VIA("via"),
    @XmlEnumValue("inMessage")
    IN_MESSAGE("inMessage"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    DestinationDisplayContextEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DestinationDisplayContextEnumeration fromValue(String v) {
        for (DestinationDisplayContextEnumeration c: DestinationDisplayContextEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
