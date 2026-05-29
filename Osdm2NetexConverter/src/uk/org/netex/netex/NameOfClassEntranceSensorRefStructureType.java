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
 * <p>Java-Klasse f�r NameOfClassEntranceSensorRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassEntranceSensorRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSensorEquipmentRefStructureType">
 *     &lt;enumeration value="EntranceSensor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassEntranceSensorRefStructureType")
@XmlEnum(NameOfClassSensorEquipmentRefStructureType.class)
public enum NameOfClassEntranceSensorRefStructureType {

    @XmlEnumValue("EntranceSensor")
    ENTRANCE_SENSOR(NameOfClassSensorEquipmentRefStructureType.ENTRANCE_SENSOR);
    private final NameOfClassSensorEquipmentRefStructureType value;

    NameOfClassEntranceSensorRefStructureType(NameOfClassSensorEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassSensorEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassEntranceSensorRefStructureType fromValue(NameOfClassSensorEquipmentRefStructureType v) {
        for (NameOfClassEntranceSensorRefStructureType c: NameOfClassEntranceSensorRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
