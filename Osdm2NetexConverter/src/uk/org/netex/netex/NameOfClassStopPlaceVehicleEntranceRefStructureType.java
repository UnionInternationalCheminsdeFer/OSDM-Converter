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
 * <p>Java-Klasse f�r NameOfClassStopPlaceVehicleEntranceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassStopPlaceVehicleEntranceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassEntranceRefStructureType">
 *     &lt;enumeration value="Entrance"/>
 *     &lt;enumeration value="StopPlaceVehicleEntrance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassStopPlaceVehicleEntranceRefStructureType")
@XmlEnum(NameOfClassEntranceRefStructureType.class)
public enum NameOfClassStopPlaceVehicleEntranceRefStructureType {

    @XmlEnumValue("Entrance")
    ENTRANCE(NameOfClassEntranceRefStructureType.ENTRANCE),
    @XmlEnumValue("StopPlaceVehicleEntrance")
    STOP_PLACE_VEHICLE_ENTRANCE(NameOfClassEntranceRefStructureType.STOP_PLACE_VEHICLE_ENTRANCE);
    private final NameOfClassEntranceRefStructureType value;

    NameOfClassStopPlaceVehicleEntranceRefStructureType(NameOfClassEntranceRefStructureType v) {
        value = v;
    }

    public NameOfClassEntranceRefStructureType value() {
        return value;
    }

    public static NameOfClassStopPlaceVehicleEntranceRefStructureType fromValue(NameOfClassEntranceRefStructureType v) {
        for (NameOfClassStopPlaceVehicleEntranceRefStructureType c: NameOfClassStopPlaceVehicleEntranceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
