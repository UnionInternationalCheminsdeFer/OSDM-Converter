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
 * <p>Java-Klasse f�r NameOfClassVehicleMeetingPointAssignmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleMeetingPointAssignmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassAssignmentRefStructureType">
 *     &lt;enumeration value="DynamicVehicleMeetingPointAssignment"/>
 *     &lt;enumeration value="VehicleMeetingPointAssignment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleMeetingPointAssignmentRefStructureType")
@XmlEnum(NameOfClassAssignmentRefStructureType.class)
public enum NameOfClassVehicleMeetingPointAssignmentRefStructureType {

    @XmlEnumValue("DynamicVehicleMeetingPointAssignment")
    DYNAMIC_VEHICLE_MEETING_POINT_ASSIGNMENT(NameOfClassAssignmentRefStructureType.DYNAMIC_VEHICLE_MEETING_POINT_ASSIGNMENT),
    @XmlEnumValue("VehicleMeetingPointAssignment")
    VEHICLE_MEETING_POINT_ASSIGNMENT(NameOfClassAssignmentRefStructureType.VEHICLE_MEETING_POINT_ASSIGNMENT);
    private final NameOfClassAssignmentRefStructureType value;

    NameOfClassVehicleMeetingPointAssignmentRefStructureType(NameOfClassAssignmentRefStructureType v) {
        value = v;
    }

    public NameOfClassAssignmentRefStructureType value() {
        return value;
    }

    public static NameOfClassVehicleMeetingPointAssignmentRefStructureType fromValue(NameOfClassAssignmentRefStructureType v) {
        for (NameOfClassVehicleMeetingPointAssignmentRefStructureType c: NameOfClassVehicleMeetingPointAssignmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
