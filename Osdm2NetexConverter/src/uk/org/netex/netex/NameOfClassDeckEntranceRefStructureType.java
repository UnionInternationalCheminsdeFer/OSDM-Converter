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
 * <p>Java-Klasse f�r NameOfClassDeckEntranceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassDeckEntranceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassDeckComponentRefStructureType">
 *     &lt;enumeration value="DeckVehicleEntrance"/>
 *     &lt;enumeration value="OtherDeckEntrance"/>
 *     &lt;enumeration value="PassengerEntrance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassDeckEntranceRefStructureType")
@XmlEnum(NameOfClassDeckComponentRefStructureType.class)
public enum NameOfClassDeckEntranceRefStructureType {

    @XmlEnumValue("DeckVehicleEntrance")
    DECK_VEHICLE_ENTRANCE(NameOfClassDeckComponentRefStructureType.DECK_VEHICLE_ENTRANCE),
    @XmlEnumValue("OtherDeckEntrance")
    OTHER_DECK_ENTRANCE(NameOfClassDeckComponentRefStructureType.OTHER_DECK_ENTRANCE),
    @XmlEnumValue("PassengerEntrance")
    PASSENGER_ENTRANCE(NameOfClassDeckComponentRefStructureType.PASSENGER_ENTRANCE);
    private final NameOfClassDeckComponentRefStructureType value;

    NameOfClassDeckEntranceRefStructureType(NameOfClassDeckComponentRefStructureType v) {
        value = v;
    }

    public NameOfClassDeckComponentRefStructureType value() {
        return value;
    }

    public static NameOfClassDeckEntranceRefStructureType fromValue(NameOfClassDeckComponentRefStructureType v) {
        for (NameOfClassDeckEntranceRefStructureType c: NameOfClassDeckEntranceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
