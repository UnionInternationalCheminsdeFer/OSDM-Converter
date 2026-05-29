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
 * <p>Java-Klasse f�r NameOfClassFareDebitRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFareDebitRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLogEntryRefStructureType">
 *     &lt;enumeration value="BookingDebit"/>
 *     &lt;enumeration value="FareProductSaleDebit"/>
 *     &lt;enumeration value="OffenceDebit"/>
 *     &lt;enumeration value="OtherDebit"/>
 *     &lt;enumeration value="TripDebit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFareDebitRefStructureType")
@XmlEnum(NameOfClassLogEntryRefStructureType.class)
public enum NameOfClassFareDebitRefStructureType {

    @XmlEnumValue("BookingDebit")
    BOOKING_DEBIT(NameOfClassLogEntryRefStructureType.BOOKING_DEBIT),
    @XmlEnumValue("FareProductSaleDebit")
    FARE_PRODUCT_SALE_DEBIT(NameOfClassLogEntryRefStructureType.FARE_PRODUCT_SALE_DEBIT),
    @XmlEnumValue("OffenceDebit")
    OFFENCE_DEBIT(NameOfClassLogEntryRefStructureType.OFFENCE_DEBIT),
    @XmlEnumValue("OtherDebit")
    OTHER_DEBIT(NameOfClassLogEntryRefStructureType.OTHER_DEBIT),
    @XmlEnumValue("TripDebit")
    TRIP_DEBIT(NameOfClassLogEntryRefStructureType.TRIP_DEBIT);
    private final NameOfClassLogEntryRefStructureType value;

    NameOfClassFareDebitRefStructureType(NameOfClassLogEntryRefStructureType v) {
        value = v;
    }

    public NameOfClassLogEntryRefStructureType value() {
        return value;
    }

    public static NameOfClassFareDebitRefStructureType fromValue(NameOfClassLogEntryRefStructureType v) {
        for (NameOfClassFareDebitRefStructureType c: NameOfClassFareDebitRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
