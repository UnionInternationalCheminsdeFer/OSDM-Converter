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
 * <p>Java-Klasse f�r NameOfClassAssistanceBookingServiceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassAssistanceBookingServiceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLocalServiceRefStructureType">
 *     &lt;enumeration value="AssistanceBookingService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassAssistanceBookingServiceRefStructureType")
@XmlEnum(NameOfClassLocalServiceRefStructureType.class)
public enum NameOfClassAssistanceBookingServiceRefStructureType {

    @XmlEnumValue("AssistanceBookingService")
    ASSISTANCE_BOOKING_SERVICE(NameOfClassLocalServiceRefStructureType.ASSISTANCE_BOOKING_SERVICE);
    private final NameOfClassLocalServiceRefStructureType value;

    NameOfClassAssistanceBookingServiceRefStructureType(NameOfClassLocalServiceRefStructureType v) {
        value = v;
    }

    public NameOfClassLocalServiceRefStructureType value() {
        return value;
    }

    public static NameOfClassAssistanceBookingServiceRefStructureType fromValue(NameOfClassLocalServiceRefStructureType v) {
        for (NameOfClassAssistanceBookingServiceRefStructureType c: NameOfClassAssistanceBookingServiceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
