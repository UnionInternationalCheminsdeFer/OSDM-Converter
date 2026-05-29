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
 * <p>Java-Klasse f�r NameOfClassVehicleReleaseEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleReleaseEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassInstalledEquipmentRefStructureType">
 *     &lt;enumeration value="VehicleReleaseEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleReleaseEquipmentRefStructureType")
@XmlEnum(NameOfClassInstalledEquipmentRefStructureType.class)
public enum NameOfClassVehicleReleaseEquipmentRefStructureType {

    @XmlEnumValue("VehicleReleaseEquipment")
    VEHICLE_RELEASE_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.VEHICLE_RELEASE_EQUIPMENT);
    private final NameOfClassInstalledEquipmentRefStructureType value;

    NameOfClassVehicleReleaseEquipmentRefStructureType(NameOfClassInstalledEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassInstalledEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassVehicleReleaseEquipmentRefStructureType fromValue(NameOfClassInstalledEquipmentRefStructureType v) {
        for (NameOfClassVehicleReleaseEquipmentRefStructureType c: NameOfClassVehicleReleaseEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
