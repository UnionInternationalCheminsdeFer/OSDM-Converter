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
 * <p>Java-Klasse f�r NameOfClassServiceBookingArrangementRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassServiceBookingArrangementRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassBookingArrangementRefStructureType">
 *     &lt;enumeration value="ServiceBookingArrangement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassServiceBookingArrangementRefStructureType")
@XmlEnum(NameOfClassBookingArrangementRefStructureType.class)
public enum NameOfClassServiceBookingArrangementRefStructureType {

    @XmlEnumValue("ServiceBookingArrangement")
    SERVICE_BOOKING_ARRANGEMENT(NameOfClassBookingArrangementRefStructureType.SERVICE_BOOKING_ARRANGEMENT);
    private final NameOfClassBookingArrangementRefStructureType value;

    NameOfClassServiceBookingArrangementRefStructureType(NameOfClassBookingArrangementRefStructureType v) {
        value = v;
    }

    public NameOfClassBookingArrangementRefStructureType value() {
        return value;
    }

    public static NameOfClassServiceBookingArrangementRefStructureType fromValue(NameOfClassBookingArrangementRefStructureType v) {
        for (NameOfClassServiceBookingArrangementRefStructureType c: NameOfClassServiceBookingArrangementRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
