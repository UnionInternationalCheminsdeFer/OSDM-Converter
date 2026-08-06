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
 * <p>Java-Klasse f�r NameOfClassPassengerSafetyEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPassengerSafetyEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPassengerEquipmentRefStructureType">
 *     &lt;enumeration value="PassengerSafetyEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPassengerSafetyEquipmentRefStructureType")
@XmlEnum(NameOfClassPassengerEquipmentRefStructureType.class)
public enum NameOfClassPassengerSafetyEquipmentRefStructureType {

    @XmlEnumValue("PassengerSafetyEquipment")
    PASSENGER_SAFETY_EQUIPMENT(NameOfClassPassengerEquipmentRefStructureType.PASSENGER_SAFETY_EQUIPMENT);
    private final NameOfClassPassengerEquipmentRefStructureType value;

    NameOfClassPassengerSafetyEquipmentRefStructureType(NameOfClassPassengerEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassPassengerEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassPassengerSafetyEquipmentRefStructureType fromValue(NameOfClassPassengerEquipmentRefStructureType v) {
        for (NameOfClassPassengerSafetyEquipmentRefStructureType c: NameOfClassPassengerSafetyEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
