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
 * <p>Java-Klasse f�r NameOfClassVehicleEquipmentProfileRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleEquipmentProfileRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="RechargingEquipmentProfile"/>
 *     &lt;enumeration value="VehicleEquipmentProfile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleEquipmentProfileRefStructureType")
@XmlEnum
public enum NameOfClassVehicleEquipmentProfileRefStructureType {

    @XmlEnumValue("RechargingEquipmentProfile")
    RECHARGING_EQUIPMENT_PROFILE("RechargingEquipmentProfile"),
    @XmlEnumValue("VehicleEquipmentProfile")
    VEHICLE_EQUIPMENT_PROFILE("VehicleEquipmentProfile");
    private final String value;

    NameOfClassVehicleEquipmentProfileRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassVehicleEquipmentProfileRefStructureType fromValue(String v) {
        for (NameOfClassVehicleEquipmentProfileRefStructureType c: NameOfClassVehicleEquipmentProfileRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
