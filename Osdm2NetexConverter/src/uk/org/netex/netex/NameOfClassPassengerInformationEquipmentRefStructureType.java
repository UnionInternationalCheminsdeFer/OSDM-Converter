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
 * <p>Java-Klasse f�r NameOfClassPassengerInformationEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPassengerInformationEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassInstalledEquipmentRefStructureType">
 *     &lt;enumeration value="PassengerInformationEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPassengerInformationEquipmentRefStructureType")
@XmlEnum(NameOfClassInstalledEquipmentRefStructureType.class)
public enum NameOfClassPassengerInformationEquipmentRefStructureType {

    @XmlEnumValue("PassengerInformationEquipment")
    PASSENGER_INFORMATION_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.PASSENGER_INFORMATION_EQUIPMENT);
    private final NameOfClassInstalledEquipmentRefStructureType value;

    NameOfClassPassengerInformationEquipmentRefStructureType(NameOfClassInstalledEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassInstalledEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassPassengerInformationEquipmentRefStructureType fromValue(NameOfClassInstalledEquipmentRefStructureType v) {
        for (NameOfClassPassengerInformationEquipmentRefStructureType c: NameOfClassPassengerInformationEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
