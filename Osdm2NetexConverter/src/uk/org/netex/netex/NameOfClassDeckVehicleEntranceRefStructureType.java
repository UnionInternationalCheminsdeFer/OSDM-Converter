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
 * <p>Java-Klasse f�r NameOfClassDeckVehicleEntranceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassDeckVehicleEntranceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassDeckEntranceRefStructureType">
 *     &lt;enumeration value="DeckVehicleEntrance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassDeckVehicleEntranceRefStructureType")
@XmlEnum(NameOfClassDeckEntranceRefStructureType.class)
public enum NameOfClassDeckVehicleEntranceRefStructureType {

    @XmlEnumValue("DeckVehicleEntrance")
    DECK_VEHICLE_ENTRANCE(NameOfClassDeckEntranceRefStructureType.DECK_VEHICLE_ENTRANCE);
    private final NameOfClassDeckEntranceRefStructureType value;

    NameOfClassDeckVehicleEntranceRefStructureType(NameOfClassDeckEntranceRefStructureType v) {
        value = v;
    }

    public NameOfClassDeckEntranceRefStructureType value() {
        return value;
    }

    public static NameOfClassDeckVehicleEntranceRefStructureType fromValue(NameOfClassDeckEntranceRefStructureType v) {
        for (NameOfClassDeckVehicleEntranceRefStructureType c: NameOfClassDeckVehicleEntranceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
