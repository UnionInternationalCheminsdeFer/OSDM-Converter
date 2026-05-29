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
 * <p>Java-Klasse f�r LuggageServiceEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LuggageServiceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="leftLuggage"/>
 *     &lt;enumeration value="porterage"/>
 *     &lt;enumeration value="freeTrolleys"/>
 *     &lt;enumeration value="paidTrolleys"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LuggageServiceEnumeration")
@XmlEnum
public enum LuggageServiceEnumeration {

    @XmlEnumValue("leftLuggage")
    LEFT_LUGGAGE("leftLuggage"),
    @XmlEnumValue("porterage")
    PORTERAGE("porterage"),
    @XmlEnumValue("freeTrolleys")
    FREE_TROLLEYS("freeTrolleys"),
    @XmlEnumValue("paidTrolleys")
    PAID_TROLLEYS("paidTrolleys"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LuggageServiceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuggageServiceEnumeration fromValue(String v) {
        for (LuggageServiceEnumeration c: LuggageServiceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
