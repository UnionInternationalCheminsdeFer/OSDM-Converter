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
 * <p>Java-Klasse f�r NameOfClassVehicleRequirementRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleRequirementRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="FacilityRequirement"/>
 *     &lt;enumeration value="PassengerCarryingRequirement"/>
 *     &lt;enumeration value="PassengerCarryingRequirementsView"/>
 *     &lt;enumeration value="VehicleManoeuvringRequirement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleRequirementRefStructureType")
@XmlEnum
public enum NameOfClassVehicleRequirementRefStructureType {

    @XmlEnumValue("FacilityRequirement")
    FACILITY_REQUIREMENT("FacilityRequirement"),
    @XmlEnumValue("PassengerCarryingRequirement")
    PASSENGER_CARRYING_REQUIREMENT("PassengerCarryingRequirement"),
    @XmlEnumValue("PassengerCarryingRequirementsView")
    PASSENGER_CARRYING_REQUIREMENTS_VIEW("PassengerCarryingRequirementsView"),
    @XmlEnumValue("VehicleManoeuvringRequirement")
    VEHICLE_MANOEUVRING_REQUIREMENT("VehicleManoeuvringRequirement");
    private final String value;

    NameOfClassVehicleRequirementRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassVehicleRequirementRefStructureType fromValue(String v) {
        for (NameOfClassVehicleRequirementRefStructureType c: NameOfClassVehicleRequirementRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
