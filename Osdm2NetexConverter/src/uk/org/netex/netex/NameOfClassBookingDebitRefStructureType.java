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
 * <p>Java-Klasse f�r NameOfClassBookingDebitRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassBookingDebitRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassFareDebitRefStructureType">
 *     &lt;enumeration value="BookingDebit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassBookingDebitRefStructureType")
@XmlEnum(NameOfClassFareDebitRefStructureType.class)
public enum NameOfClassBookingDebitRefStructureType {

    @XmlEnumValue("BookingDebit")
    BOOKING_DEBIT(NameOfClassFareDebitRefStructureType.BOOKING_DEBIT);
    private final NameOfClassFareDebitRefStructureType value;

    NameOfClassBookingDebitRefStructureType(NameOfClassFareDebitRefStructureType v) {
        value = v;
    }

    public NameOfClassFareDebitRefStructureType value() {
        return value;
    }

    public static NameOfClassBookingDebitRefStructureType fromValue(NameOfClassFareDebitRefStructureType v) {
        for (NameOfClassBookingDebitRefStructureType c: NameOfClassBookingDebitRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
