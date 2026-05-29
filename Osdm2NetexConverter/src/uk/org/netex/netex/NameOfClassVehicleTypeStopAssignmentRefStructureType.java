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
 * <p>Java-Klasse f�r NameOfClassVehicleTypeStopAssignmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleTypeStopAssignmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassStopAssignmentRefStructureType">
 *     &lt;enumeration value="VehicleTypeStopAssignment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleTypeStopAssignmentRefStructureType")
@XmlEnum(NameOfClassStopAssignmentRefStructureType.class)
public enum NameOfClassVehicleTypeStopAssignmentRefStructureType {

    @XmlEnumValue("VehicleTypeStopAssignment")
    VEHICLE_TYPE_STOP_ASSIGNMENT(NameOfClassStopAssignmentRefStructureType.VEHICLE_TYPE_STOP_ASSIGNMENT);
    private final NameOfClassStopAssignmentRefStructureType value;

    NameOfClassVehicleTypeStopAssignmentRefStructureType(NameOfClassStopAssignmentRefStructureType v) {
        value = v;
    }

    public NameOfClassStopAssignmentRefStructureType value() {
        return value;
    }

    public static NameOfClassVehicleTypeStopAssignmentRefStructureType fromValue(NameOfClassStopAssignmentRefStructureType v) {
        for (NameOfClassVehicleTypeStopAssignmentRefStructureType c: NameOfClassVehicleTypeStopAssignmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
