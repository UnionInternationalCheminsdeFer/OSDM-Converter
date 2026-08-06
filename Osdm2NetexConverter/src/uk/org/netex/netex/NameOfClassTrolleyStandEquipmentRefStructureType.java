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
 * <p>Java-Klasse f�r NameOfClassTrolleyStandEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTrolleyStandEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSiteEquipmentRefStructureType">
 *     &lt;enumeration value="TrolleyStandEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTrolleyStandEquipmentRefStructureType")
@XmlEnum(NameOfClassSiteEquipmentRefStructureType.class)
public enum NameOfClassTrolleyStandEquipmentRefStructureType {

    @XmlEnumValue("TrolleyStandEquipment")
    TROLLEY_STAND_EQUIPMENT(NameOfClassSiteEquipmentRefStructureType.TROLLEY_STAND_EQUIPMENT);
    private final NameOfClassSiteEquipmentRefStructureType value;

    NameOfClassTrolleyStandEquipmentRefStructureType(NameOfClassSiteEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassSiteEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassTrolleyStandEquipmentRefStructureType fromValue(NameOfClassSiteEquipmentRefStructureType v) {
        for (NameOfClassTrolleyStandEquipmentRefStructureType c: NameOfClassTrolleyStandEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
