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
 * <p>Java-Klasse f�r NameOfClassPassengerCarryingRequirementRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPassengerCarryingRequirementRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassVehicleRequirementRefStructureType">
 *     &lt;enumeration value="PassengerCarryingRequirement"/>
 *     &lt;enumeration value="PassengerCarryingRequirementsView"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPassengerCarryingRequirementRefStructureType")
@XmlEnum(NameOfClassVehicleRequirementRefStructureType.class)
public enum NameOfClassPassengerCarryingRequirementRefStructureType {

    @XmlEnumValue("PassengerCarryingRequirement")
    PASSENGER_CARRYING_REQUIREMENT(NameOfClassVehicleRequirementRefStructureType.PASSENGER_CARRYING_REQUIREMENT),
    @XmlEnumValue("PassengerCarryingRequirementsView")
    PASSENGER_CARRYING_REQUIREMENTS_VIEW(NameOfClassVehicleRequirementRefStructureType.PASSENGER_CARRYING_REQUIREMENTS_VIEW);
    private final NameOfClassVehicleRequirementRefStructureType value;

    NameOfClassPassengerCarryingRequirementRefStructureType(NameOfClassVehicleRequirementRefStructureType v) {
        value = v;
    }

    public NameOfClassVehicleRequirementRefStructureType value() {
        return value;
    }

    public static NameOfClassPassengerCarryingRequirementRefStructureType fromValue(NameOfClassVehicleRequirementRefStructureType v) {
        for (NameOfClassPassengerCarryingRequirementRefStructureType c: NameOfClassPassengerCarryingRequirementRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
