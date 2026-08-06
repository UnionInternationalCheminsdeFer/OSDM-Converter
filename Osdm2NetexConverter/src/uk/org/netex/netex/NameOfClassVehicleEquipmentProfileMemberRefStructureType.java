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
 * <p>Java-Klasse f�r NameOfClassVehicleEquipmentProfileMemberRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleEquipmentProfileMemberRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="VehicleEquipmentProfileMember"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleEquipmentProfileMemberRefStructureType")
@XmlEnum
public enum NameOfClassVehicleEquipmentProfileMemberRefStructureType {

    @XmlEnumValue("VehicleEquipmentProfileMember")
    VEHICLE_EQUIPMENT_PROFILE_MEMBER("VehicleEquipmentProfileMember");
    private final String value;

    NameOfClassVehicleEquipmentProfileMemberRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassVehicleEquipmentProfileMemberRefStructureType fromValue(String v) {
        for (NameOfClassVehicleEquipmentProfileMemberRefStructureType c: NameOfClassVehicleEquipmentProfileMemberRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
