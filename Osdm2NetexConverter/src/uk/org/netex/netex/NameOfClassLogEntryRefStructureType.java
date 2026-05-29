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
 * <p>Java-Klasse f�r NameOfClassLogEntryRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassLogEntryRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="BookingDebit"/>
 *     &lt;enumeration value="FareProductSaleDebit"/>
 *     &lt;enumeration value="OffenceDebit"/>
 *     &lt;enumeration value="OfferedTravelSpecification"/>
 *     &lt;enumeration value="OtherDebit"/>
 *     &lt;enumeration value="ParkingBayCondition"/>
 *     &lt;enumeration value="RentalAvailability"/>
 *     &lt;enumeration value="RequestedTravelSpecification"/>
 *     &lt;enumeration value="SalesTransaction"/>
 *     &lt;enumeration value="TravelSpecification"/>
 *     &lt;enumeration value="TripDebit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassLogEntryRefStructureType")
@XmlEnum
public enum NameOfClassLogEntryRefStructureType {

    @XmlEnumValue("BookingDebit")
    BOOKING_DEBIT("BookingDebit"),
    @XmlEnumValue("FareProductSaleDebit")
    FARE_PRODUCT_SALE_DEBIT("FareProductSaleDebit"),
    @XmlEnumValue("OffenceDebit")
    OFFENCE_DEBIT("OffenceDebit"),
    @XmlEnumValue("OfferedTravelSpecification")
    OFFERED_TRAVEL_SPECIFICATION("OfferedTravelSpecification"),
    @XmlEnumValue("OtherDebit")
    OTHER_DEBIT("OtherDebit"),
    @XmlEnumValue("ParkingBayCondition")
    PARKING_BAY_CONDITION("ParkingBayCondition"),
    @XmlEnumValue("RentalAvailability")
    RENTAL_AVAILABILITY("RentalAvailability"),
    @XmlEnumValue("RequestedTravelSpecification")
    REQUESTED_TRAVEL_SPECIFICATION("RequestedTravelSpecification"),
    @XmlEnumValue("SalesTransaction")
    SALES_TRANSACTION("SalesTransaction"),
    @XmlEnumValue("TravelSpecification")
    TRAVEL_SPECIFICATION("TravelSpecification"),
    @XmlEnumValue("TripDebit")
    TRIP_DEBIT("TripDebit");
    private final String value;

    NameOfClassLogEntryRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassLogEntryRefStructureType fromValue(String v) {
        for (NameOfClassLogEntryRefStructureType c: NameOfClassLogEntryRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
