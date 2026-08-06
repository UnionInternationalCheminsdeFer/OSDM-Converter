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
 * <p>Java-Klasse f�r NameOfClassBookingArrangementRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassBookingArrangementRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="BookingArrangement"/>
 *     &lt;enumeration value="ServiceBookingArrangement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassBookingArrangementRefStructureType")
@XmlEnum
public enum NameOfClassBookingArrangementRefStructureType {

    @XmlEnumValue("BookingArrangement")
    BOOKING_ARRANGEMENT("BookingArrangement"),
    @XmlEnumValue("ServiceBookingArrangement")
    SERVICE_BOOKING_ARRANGEMENT("ServiceBookingArrangement");
    private final String value;

    NameOfClassBookingArrangementRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassBookingArrangementRefStructureType fromValue(String v) {
        for (NameOfClassBookingArrangementRefStructureType c: NameOfClassBookingArrangementRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
