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
 * <p>Java-Klasse f�r BaggageUseTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BaggageUseTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="carryOn"/>
 *     &lt;enumeration value="checkIn"/>
 *     &lt;enumeration value="oversizeCheckIn"/>
 *     &lt;enumeration value="baggageCompartment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BaggageUseTypeEnumeration")
@XmlEnum
public enum BaggageUseTypeEnumeration {

    @XmlEnumValue("carryOn")
    CARRY_ON("carryOn"),
    @XmlEnumValue("checkIn")
    CHECK_IN("checkIn"),
    @XmlEnumValue("oversizeCheckIn")
    OVERSIZE_CHECK_IN("oversizeCheckIn"),
    @XmlEnumValue("baggageCompartment")
    BAGGAGE_COMPARTMENT("baggageCompartment");
    private final String value;

    BaggageUseTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BaggageUseTypeEnumeration fromValue(String v) {
        for (BaggageUseTypeEnumeration c: BaggageUseTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
