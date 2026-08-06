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
 * <p>Java-Klasse f�r NameOfClassCustomerServiceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassCustomerServiceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLocalServiceRefStructureType">
 *     &lt;enumeration value="ComplaintsService"/>
 *     &lt;enumeration value="CustomerService"/>
 *     &lt;enumeration value="LeftLuggageService"/>
 *     &lt;enumeration value="LostPropertyService"/>
 *     &lt;enumeration value="MeetingPointService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassCustomerServiceRefStructureType")
@XmlEnum(NameOfClassLocalServiceRefStructureType.class)
public enum NameOfClassCustomerServiceRefStructureType {

    @XmlEnumValue("ComplaintsService")
    COMPLAINTS_SERVICE(NameOfClassLocalServiceRefStructureType.COMPLAINTS_SERVICE),
    @XmlEnumValue("CustomerService")
    CUSTOMER_SERVICE(NameOfClassLocalServiceRefStructureType.CUSTOMER_SERVICE),
    @XmlEnumValue("LeftLuggageService")
    LEFT_LUGGAGE_SERVICE(NameOfClassLocalServiceRefStructureType.LEFT_LUGGAGE_SERVICE),
    @XmlEnumValue("LostPropertyService")
    LOST_PROPERTY_SERVICE(NameOfClassLocalServiceRefStructureType.LOST_PROPERTY_SERVICE),
    @XmlEnumValue("MeetingPointService")
    MEETING_POINT_SERVICE(NameOfClassLocalServiceRefStructureType.MEETING_POINT_SERVICE);
    private final NameOfClassLocalServiceRefStructureType value;

    NameOfClassCustomerServiceRefStructureType(NameOfClassLocalServiceRefStructureType v) {
        value = v;
    }

    public NameOfClassLocalServiceRefStructureType value() {
        return value;
    }

    public static NameOfClassCustomerServiceRefStructureType fromValue(NameOfClassLocalServiceRefStructureType v) {
        for (NameOfClassCustomerServiceRefStructureType c: NameOfClassCustomerServiceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
