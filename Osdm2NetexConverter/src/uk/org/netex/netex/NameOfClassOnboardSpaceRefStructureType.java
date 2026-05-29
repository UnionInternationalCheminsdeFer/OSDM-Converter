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
 * <p>Java-Klasse f�r NameOfClassOnboardSpaceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassOnboardSpaceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="DeckVehicleEntrance"/>
 *     &lt;enumeration value="DeckWindow"/>
 *     &lt;enumeration value="LuggageSpot"/>
 *     &lt;enumeration value="OtherDeckEntrance"/>
 *     &lt;enumeration value="OtherDeckSpace"/>
 *     &lt;enumeration value="PassengerEntrance"/>
 *     &lt;enumeration value="PassengerSpace"/>
 *     &lt;enumeration value="PassengerSpot"/>
 *     &lt;enumeration value="PassengerVehicleSpot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassOnboardSpaceRefStructureType")
@XmlEnum
public enum NameOfClassOnboardSpaceRefStructureType {

    @XmlEnumValue("DeckVehicleEntrance")
    DECK_VEHICLE_ENTRANCE("DeckVehicleEntrance"),
    @XmlEnumValue("DeckWindow")
    DECK_WINDOW("DeckWindow"),
    @XmlEnumValue("LuggageSpot")
    LUGGAGE_SPOT("LuggageSpot"),
    @XmlEnumValue("OtherDeckEntrance")
    OTHER_DECK_ENTRANCE("OtherDeckEntrance"),
    @XmlEnumValue("OtherDeckSpace")
    OTHER_DECK_SPACE("OtherDeckSpace"),
    @XmlEnumValue("PassengerEntrance")
    PASSENGER_ENTRANCE("PassengerEntrance"),
    @XmlEnumValue("PassengerSpace")
    PASSENGER_SPACE("PassengerSpace"),
    @XmlEnumValue("PassengerSpot")
    PASSENGER_SPOT("PassengerSpot"),
    @XmlEnumValue("PassengerVehicleSpot")
    PASSENGER_VEHICLE_SPOT("PassengerVehicleSpot");
    private final String value;

    NameOfClassOnboardSpaceRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassOnboardSpaceRefStructureType fromValue(String v) {
        for (NameOfClassOnboardSpaceRefStructureType c: NameOfClassOnboardSpaceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
