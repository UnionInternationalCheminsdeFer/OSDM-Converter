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
 * <p>Java-Klasse f�r NameOfClassDeckComponentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassDeckComponentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassOnboardSpaceRefStructureType">
 *     &lt;enumeration value="DeckVehicleEntrance"/>
 *     &lt;enumeration value="DeckWindow"/>
 *     &lt;enumeration value="OtherDeckEntrance"/>
 *     &lt;enumeration value="OtherDeckSpace"/>
 *     &lt;enumeration value="PassengerEntrance"/>
 *     &lt;enumeration value="PassengerSpace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassDeckComponentRefStructureType")
@XmlEnum(NameOfClassOnboardSpaceRefStructureType.class)
public enum NameOfClassDeckComponentRefStructureType {

    @XmlEnumValue("DeckVehicleEntrance")
    DECK_VEHICLE_ENTRANCE(NameOfClassOnboardSpaceRefStructureType.DECK_VEHICLE_ENTRANCE),
    @XmlEnumValue("DeckWindow")
    DECK_WINDOW(NameOfClassOnboardSpaceRefStructureType.DECK_WINDOW),
    @XmlEnumValue("OtherDeckEntrance")
    OTHER_DECK_ENTRANCE(NameOfClassOnboardSpaceRefStructureType.OTHER_DECK_ENTRANCE),
    @XmlEnumValue("OtherDeckSpace")
    OTHER_DECK_SPACE(NameOfClassOnboardSpaceRefStructureType.OTHER_DECK_SPACE),
    @XmlEnumValue("PassengerEntrance")
    PASSENGER_ENTRANCE(NameOfClassOnboardSpaceRefStructureType.PASSENGER_ENTRANCE),
    @XmlEnumValue("PassengerSpace")
    PASSENGER_SPACE(NameOfClassOnboardSpaceRefStructureType.PASSENGER_SPACE);
    private final NameOfClassOnboardSpaceRefStructureType value;

    NameOfClassDeckComponentRefStructureType(NameOfClassOnboardSpaceRefStructureType v) {
        value = v;
    }

    public NameOfClassOnboardSpaceRefStructureType value() {
        return value;
    }

    public static NameOfClassDeckComponentRefStructureType fromValue(NameOfClassOnboardSpaceRefStructureType v) {
        for (NameOfClassDeckComponentRefStructureType c: NameOfClassDeckComponentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
