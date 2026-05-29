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
 * <p>Java-Klasse f�r NameOfClassHelpPointEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassHelpPointEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPassengerEquipmentRefStructureType">
 *     &lt;enumeration value="HelpPointEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassHelpPointEquipmentRefStructureType")
@XmlEnum(NameOfClassPassengerEquipmentRefStructureType.class)
public enum NameOfClassHelpPointEquipmentRefStructureType {

    @XmlEnumValue("HelpPointEquipment")
    HELP_POINT_EQUIPMENT(NameOfClassPassengerEquipmentRefStructureType.HELP_POINT_EQUIPMENT);
    private final NameOfClassPassengerEquipmentRefStructureType value;

    NameOfClassHelpPointEquipmentRefStructureType(NameOfClassPassengerEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassPassengerEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassHelpPointEquipmentRefStructureType fromValue(NameOfClassPassengerEquipmentRefStructureType v) {
        for (NameOfClassHelpPointEquipmentRefStructureType c: NameOfClassHelpPointEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
