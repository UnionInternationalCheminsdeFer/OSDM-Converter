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
 * <p>Java-Klasse f�r NameOfClassBookingPolicyRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassBookingPolicyRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassUsageParameterRefStructureType">
 *     &lt;enumeration value="Cancelling"/>
 *     &lt;enumeration value="Reserving"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassBookingPolicyRefStructureType")
@XmlEnum(NameOfClassUsageParameterRefStructureType.class)
public enum NameOfClassBookingPolicyRefStructureType {

    @XmlEnumValue("Cancelling")
    CANCELLING(NameOfClassUsageParameterRefStructureType.CANCELLING),
    @XmlEnumValue("Reserving")
    RESERVING(NameOfClassUsageParameterRefStructureType.RESERVING);
    private final NameOfClassUsageParameterRefStructureType value;

    NameOfClassBookingPolicyRefStructureType(NameOfClassUsageParameterRefStructureType v) {
        value = v;
    }

    public NameOfClassUsageParameterRefStructureType value() {
        return value;
    }

    public static NameOfClassBookingPolicyRefStructureType fromValue(NameOfClassUsageParameterRefStructureType v) {
        for (NameOfClassBookingPolicyRefStructureType c: NameOfClassBookingPolicyRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
