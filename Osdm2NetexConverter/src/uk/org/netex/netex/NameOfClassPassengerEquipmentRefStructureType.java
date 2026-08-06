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
 * <p>Java-Klasse f�r NameOfClassPassengerEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPassengerEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassInstalledEquipmentRefStructureType">
 *     &lt;enumeration value="AccessVehicleEquipment"/>
 *     &lt;enumeration value="ActualVehicleEquipment"/>
 *     &lt;enumeration value="HelpPointEquipment"/>
 *     &lt;enumeration value="PassengerBeaconEquipment"/>
 *     &lt;enumeration value="PassengerInformationEquipment"/>
 *     &lt;enumeration value="PassengerSafetyEquipment"/>
 *     &lt;enumeration value="RubbishDisposalEquipment"/>
 *     &lt;enumeration value="SanitaryEquipment"/>
 *     &lt;enumeration value="TicketValidatorEquipment"/>
 *     &lt;enumeration value="TicketingEquipment"/>
 *     &lt;enumeration value="WheelchairVehicleEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPassengerEquipmentRefStructureType")
@XmlEnum(NameOfClassInstalledEquipmentRefStructureType.class)
public enum NameOfClassPassengerEquipmentRefStructureType {

    @XmlEnumValue("AccessVehicleEquipment")
    ACCESS_VEHICLE_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.ACCESS_VEHICLE_EQUIPMENT),
    @XmlEnumValue("ActualVehicleEquipment")
    ACTUAL_VEHICLE_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.ACTUAL_VEHICLE_EQUIPMENT),
    @XmlEnumValue("HelpPointEquipment")
    HELP_POINT_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.HELP_POINT_EQUIPMENT),
    @XmlEnumValue("PassengerBeaconEquipment")
    PASSENGER_BEACON_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.PASSENGER_BEACON_EQUIPMENT),
    @XmlEnumValue("PassengerInformationEquipment")
    PASSENGER_INFORMATION_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.PASSENGER_INFORMATION_EQUIPMENT),
    @XmlEnumValue("PassengerSafetyEquipment")
    PASSENGER_SAFETY_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.PASSENGER_SAFETY_EQUIPMENT),
    @XmlEnumValue("RubbishDisposalEquipment")
    RUBBISH_DISPOSAL_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.RUBBISH_DISPOSAL_EQUIPMENT),
    @XmlEnumValue("SanitaryEquipment")
    SANITARY_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.SANITARY_EQUIPMENT),
    @XmlEnumValue("TicketValidatorEquipment")
    TICKET_VALIDATOR_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.TICKET_VALIDATOR_EQUIPMENT),
    @XmlEnumValue("TicketingEquipment")
    TICKETING_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.TICKETING_EQUIPMENT),
    @XmlEnumValue("WheelchairVehicleEquipment")
    WHEELCHAIR_VEHICLE_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.WHEELCHAIR_VEHICLE_EQUIPMENT);
    private final NameOfClassInstalledEquipmentRefStructureType value;

    NameOfClassPassengerEquipmentRefStructureType(NameOfClassInstalledEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassInstalledEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassPassengerEquipmentRefStructureType fromValue(NameOfClassInstalledEquipmentRefStructureType v) {
        for (NameOfClassPassengerEquipmentRefStructureType c: NameOfClassPassengerEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
