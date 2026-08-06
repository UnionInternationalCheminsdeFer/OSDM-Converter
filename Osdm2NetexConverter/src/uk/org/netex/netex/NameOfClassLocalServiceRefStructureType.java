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
 * <p>Java-Klasse f�r NameOfClassLocalServiceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassLocalServiceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassEquipmentRefStructureType">
 *     &lt;enumeration value="AssistanceBookingService"/>
 *     &lt;enumeration value="AssistanceService"/>
 *     &lt;enumeration value="CateringService"/>
 *     &lt;enumeration value="CommunicationService"/>
 *     &lt;enumeration value="ComplaintsService"/>
 *     &lt;enumeration value="CustomerService"/>
 *     &lt;enumeration value="HireService"/>
 *     &lt;enumeration value="LeftLuggageService"/>
 *     &lt;enumeration value="LostPropertyService"/>
 *     &lt;enumeration value="LuggageService"/>
 *     &lt;enumeration value="MeetingPointService"/>
 *     &lt;enumeration value="MoneyService"/>
 *     &lt;enumeration value="RetailService"/>
 *     &lt;enumeration value="TicketingService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassLocalServiceRefStructureType")
@XmlEnum(NameOfClassEquipmentRefStructureType.class)
public enum NameOfClassLocalServiceRefStructureType {

    @XmlEnumValue("AssistanceBookingService")
    ASSISTANCE_BOOKING_SERVICE(NameOfClassEquipmentRefStructureType.ASSISTANCE_BOOKING_SERVICE),
    @XmlEnumValue("AssistanceService")
    ASSISTANCE_SERVICE(NameOfClassEquipmentRefStructureType.ASSISTANCE_SERVICE),
    @XmlEnumValue("CateringService")
    CATERING_SERVICE(NameOfClassEquipmentRefStructureType.CATERING_SERVICE),
    @XmlEnumValue("CommunicationService")
    COMMUNICATION_SERVICE(NameOfClassEquipmentRefStructureType.COMMUNICATION_SERVICE),
    @XmlEnumValue("ComplaintsService")
    COMPLAINTS_SERVICE(NameOfClassEquipmentRefStructureType.COMPLAINTS_SERVICE),
    @XmlEnumValue("CustomerService")
    CUSTOMER_SERVICE(NameOfClassEquipmentRefStructureType.CUSTOMER_SERVICE),
    @XmlEnumValue("HireService")
    HIRE_SERVICE(NameOfClassEquipmentRefStructureType.HIRE_SERVICE),
    @XmlEnumValue("LeftLuggageService")
    LEFT_LUGGAGE_SERVICE(NameOfClassEquipmentRefStructureType.LEFT_LUGGAGE_SERVICE),
    @XmlEnumValue("LostPropertyService")
    LOST_PROPERTY_SERVICE(NameOfClassEquipmentRefStructureType.LOST_PROPERTY_SERVICE),
    @XmlEnumValue("LuggageService")
    LUGGAGE_SERVICE(NameOfClassEquipmentRefStructureType.LUGGAGE_SERVICE),
    @XmlEnumValue("MeetingPointService")
    MEETING_POINT_SERVICE(NameOfClassEquipmentRefStructureType.MEETING_POINT_SERVICE),
    @XmlEnumValue("MoneyService")
    MONEY_SERVICE(NameOfClassEquipmentRefStructureType.MONEY_SERVICE),
    @XmlEnumValue("RetailService")
    RETAIL_SERVICE(NameOfClassEquipmentRefStructureType.RETAIL_SERVICE),
    @XmlEnumValue("TicketingService")
    TICKETING_SERVICE(NameOfClassEquipmentRefStructureType.TICKETING_SERVICE);
    private final NameOfClassEquipmentRefStructureType value;

    NameOfClassLocalServiceRefStructureType(NameOfClassEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassLocalServiceRefStructureType fromValue(NameOfClassEquipmentRefStructureType v) {
        for (NameOfClassLocalServiceRefStructureType c: NameOfClassLocalServiceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
