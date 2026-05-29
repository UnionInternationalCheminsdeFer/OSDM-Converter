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
 * <p>Java-Klasse f�r PenaltyPolicyTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PenaltyPolicyTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="noTicket"/>
 *     &lt;enumeration value="noCheckIn"/>
 *     &lt;enumeration value="noCheckOut"/>
 *     &lt;enumeration value="noValidation"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PenaltyPolicyTypeEnumeration")
@XmlEnum
public enum PenaltyPolicyTypeEnumeration {

    @XmlEnumValue("noTicket")
    NO_TICKET("noTicket"),
    @XmlEnumValue("noCheckIn")
    NO_CHECK_IN("noCheckIn"),
    @XmlEnumValue("noCheckOut")
    NO_CHECK_OUT("noCheckOut"),
    @XmlEnumValue("noValidation")
    NO_VALIDATION("noValidation"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PenaltyPolicyTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PenaltyPolicyTypeEnumeration fromValue(String v) {
        for (PenaltyPolicyTypeEnumeration c: PenaltyPolicyTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
