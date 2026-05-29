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
 * <p>Java-Klasse f�r NameOfClassFacilityRequirementRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFacilityRequirementRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassVehicleRequirementRefStructureType">
 *     &lt;enumeration value="FacilityRequirement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFacilityRequirementRefStructureType")
@XmlEnum(NameOfClassVehicleRequirementRefStructureType.class)
public enum NameOfClassFacilityRequirementRefStructureType {

    @XmlEnumValue("FacilityRequirement")
    FACILITY_REQUIREMENT(NameOfClassVehicleRequirementRefStructureType.FACILITY_REQUIREMENT);
    private final NameOfClassVehicleRequirementRefStructureType value;

    NameOfClassFacilityRequirementRefStructureType(NameOfClassVehicleRequirementRefStructureType v) {
        value = v;
    }

    public NameOfClassVehicleRequirementRefStructureType value() {
        return value;
    }

    public static NameOfClassFacilityRequirementRefStructureType fromValue(NameOfClassVehicleRequirementRefStructureType v) {
        for (NameOfClassFacilityRequirementRefStructureType c: NameOfClassFacilityRequirementRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
