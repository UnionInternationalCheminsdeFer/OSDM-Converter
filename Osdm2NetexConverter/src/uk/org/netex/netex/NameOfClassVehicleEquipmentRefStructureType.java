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
 * <p>Java-Klasse f�r NameOfClassVehicleEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPassengerEquipmentRefStructureType">
 *     &lt;enumeration value="AccessVehicleEquipment"/>
 *     &lt;enumeration value="WheelchairVehicleEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleEquipmentRefStructureType")
@XmlEnum(NameOfClassPassengerEquipmentRefStructureType.class)
public enum NameOfClassVehicleEquipmentRefStructureType {

    @XmlEnumValue("AccessVehicleEquipment")
    ACCESS_VEHICLE_EQUIPMENT(NameOfClassPassengerEquipmentRefStructureType.ACCESS_VEHICLE_EQUIPMENT),
    @XmlEnumValue("WheelchairVehicleEquipment")
    WHEELCHAIR_VEHICLE_EQUIPMENT(NameOfClassPassengerEquipmentRefStructureType.WHEELCHAIR_VEHICLE_EQUIPMENT);
    private final NameOfClassPassengerEquipmentRefStructureType value;

    NameOfClassVehicleEquipmentRefStructureType(NameOfClassPassengerEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassPassengerEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassVehicleEquipmentRefStructureType fromValue(NameOfClassPassengerEquipmentRefStructureType v) {
        for (NameOfClassVehicleEquipmentRefStructureType c: NameOfClassVehicleEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
