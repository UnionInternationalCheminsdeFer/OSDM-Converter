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
 * <p>Java-Klasse f�r NameOfClassRubbishDisposalEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassRubbishDisposalEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPassengerEquipmentRefStructureType">
 *     &lt;enumeration value="RubbishDisposalEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassRubbishDisposalEquipmentRefStructureType")
@XmlEnum(NameOfClassPassengerEquipmentRefStructureType.class)
public enum NameOfClassRubbishDisposalEquipmentRefStructureType {

    @XmlEnumValue("RubbishDisposalEquipment")
    RUBBISH_DISPOSAL_EQUIPMENT(NameOfClassPassengerEquipmentRefStructureType.RUBBISH_DISPOSAL_EQUIPMENT);
    private final NameOfClassPassengerEquipmentRefStructureType value;

    NameOfClassRubbishDisposalEquipmentRefStructureType(NameOfClassPassengerEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassPassengerEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassRubbishDisposalEquipmentRefStructureType fromValue(NameOfClassPassengerEquipmentRefStructureType v) {
        for (NameOfClassRubbishDisposalEquipmentRefStructureType c: NameOfClassRubbishDisposalEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
