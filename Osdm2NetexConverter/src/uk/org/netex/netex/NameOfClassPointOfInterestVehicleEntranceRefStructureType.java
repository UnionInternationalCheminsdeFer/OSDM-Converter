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
 * <p>Java-Klasse f�r NameOfClassPointOfInterestVehicleEntranceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPointOfInterestVehicleEntranceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassEntranceRefStructureType">
 *     &lt;enumeration value="Entrance"/>
 *     &lt;enumeration value="PointOfInterestVehicleEntrance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPointOfInterestVehicleEntranceRefStructureType")
@XmlEnum(NameOfClassEntranceRefStructureType.class)
public enum NameOfClassPointOfInterestVehicleEntranceRefStructureType {

    @XmlEnumValue("Entrance")
    ENTRANCE(NameOfClassEntranceRefStructureType.ENTRANCE),
    @XmlEnumValue("PointOfInterestVehicleEntrance")
    POINT_OF_INTEREST_VEHICLE_ENTRANCE(NameOfClassEntranceRefStructureType.POINT_OF_INTEREST_VEHICLE_ENTRANCE);
    private final NameOfClassEntranceRefStructureType value;

    NameOfClassPointOfInterestVehicleEntranceRefStructureType(NameOfClassEntranceRefStructureType v) {
        value = v;
    }

    public NameOfClassEntranceRefStructureType value() {
        return value;
    }

    public static NameOfClassPointOfInterestVehicleEntranceRefStructureType fromValue(NameOfClassEntranceRefStructureType v) {
        for (NameOfClassPointOfInterestVehicleEntranceRefStructureType c: NameOfClassPointOfInterestVehicleEntranceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
