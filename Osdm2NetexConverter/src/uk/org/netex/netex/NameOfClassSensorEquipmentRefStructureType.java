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
 * <p>Java-Klasse f�r NameOfClassSensorEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassSensorEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassInstalledEquipmentRefStructureType">
 *     &lt;enumeration value="EntranceSensor"/>
 *     &lt;enumeration value="SensorEquipment"/>
 *     &lt;enumeration value="SpotSensor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassSensorEquipmentRefStructureType")
@XmlEnum(NameOfClassInstalledEquipmentRefStructureType.class)
public enum NameOfClassSensorEquipmentRefStructureType {

    @XmlEnumValue("EntranceSensor")
    ENTRANCE_SENSOR(NameOfClassInstalledEquipmentRefStructureType.ENTRANCE_SENSOR),
    @XmlEnumValue("SensorEquipment")
    SENSOR_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.SENSOR_EQUIPMENT),
    @XmlEnumValue("SpotSensor")
    SPOT_SENSOR(NameOfClassInstalledEquipmentRefStructureType.SPOT_SENSOR);
    private final NameOfClassInstalledEquipmentRefStructureType value;

    NameOfClassSensorEquipmentRefStructureType(NameOfClassInstalledEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassInstalledEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassSensorEquipmentRefStructureType fromValue(NameOfClassInstalledEquipmentRefStructureType v) {
        for (NameOfClassSensorEquipmentRefStructureType c: NameOfClassSensorEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
