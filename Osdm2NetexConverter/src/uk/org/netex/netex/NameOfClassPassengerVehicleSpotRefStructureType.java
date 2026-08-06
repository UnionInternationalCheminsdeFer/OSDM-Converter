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
 * <p>Java-Klasse f�r NameOfClassPassengerVehicleSpotRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPassengerVehicleSpotRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLocatableSpotRefStructureType">
 *     &lt;enumeration value="PassengerVehicleSpot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPassengerVehicleSpotRefStructureType")
@XmlEnum(NameOfClassLocatableSpotRefStructureType.class)
public enum NameOfClassPassengerVehicleSpotRefStructureType {

    @XmlEnumValue("PassengerVehicleSpot")
    PASSENGER_VEHICLE_SPOT(NameOfClassLocatableSpotRefStructureType.PASSENGER_VEHICLE_SPOT);
    private final NameOfClassLocatableSpotRefStructureType value;

    NameOfClassPassengerVehicleSpotRefStructureType(NameOfClassLocatableSpotRefStructureType v) {
        value = v;
    }

    public NameOfClassLocatableSpotRefStructureType value() {
        return value;
    }

    public static NameOfClassPassengerVehicleSpotRefStructureType fromValue(NameOfClassLocatableSpotRefStructureType v) {
        for (NameOfClassPassengerVehicleSpotRefStructureType c: NameOfClassPassengerVehicleSpotRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
