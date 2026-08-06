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
 * <p>Java-Klasse f�r NameOfClassWheelchairVehicleEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassWheelchairVehicleEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassVehicleEquipmentRefStructureType">
 *     &lt;enumeration value="WheelchairVehicleEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassWheelchairVehicleEquipmentRefStructureType")
@XmlEnum(NameOfClassVehicleEquipmentRefStructureType.class)
public enum NameOfClassWheelchairVehicleEquipmentRefStructureType {

    @XmlEnumValue("WheelchairVehicleEquipment")
    WHEELCHAIR_VEHICLE_EQUIPMENT(NameOfClassVehicleEquipmentRefStructureType.WHEELCHAIR_VEHICLE_EQUIPMENT);
    private final NameOfClassVehicleEquipmentRefStructureType value;

    NameOfClassWheelchairVehicleEquipmentRefStructureType(NameOfClassVehicleEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassVehicleEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassWheelchairVehicleEquipmentRefStructureType fromValue(NameOfClassVehicleEquipmentRefStructureType v) {
        for (NameOfClassWheelchairVehicleEquipmentRefStructureType c: NameOfClassWheelchairVehicleEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
