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
 * <p>Java-Klasse f�r NameOfClassAccessEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassAccessEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPlaceEquipmentRefStructureType">
 *     &lt;enumeration value="CrossingEquipment"/>
 *     &lt;enumeration value="EntranceEquipment"/>
 *     &lt;enumeration value="EscalatorEquipment"/>
 *     &lt;enumeration value="LiftCallEquipment"/>
 *     &lt;enumeration value="LiftEquipment"/>
 *     &lt;enumeration value="PlaceLighting"/>
 *     &lt;enumeration value="QueueingEquipment"/>
 *     &lt;enumeration value="RampEquipment"/>
 *     &lt;enumeration value="RoughSurface"/>
 *     &lt;enumeration value="StaircaseEquipment"/>
 *     &lt;enumeration value="TravelatorEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassAccessEquipmentRefStructureType")
@XmlEnum(NameOfClassPlaceEquipmentRefStructureType.class)
public enum NameOfClassAccessEquipmentRefStructureType {

    @XmlEnumValue("CrossingEquipment")
    CROSSING_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.CROSSING_EQUIPMENT),
    @XmlEnumValue("EntranceEquipment")
    ENTRANCE_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.ENTRANCE_EQUIPMENT),
    @XmlEnumValue("EscalatorEquipment")
    ESCALATOR_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.ESCALATOR_EQUIPMENT),
    @XmlEnumValue("LiftCallEquipment")
    LIFT_CALL_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.LIFT_CALL_EQUIPMENT),
    @XmlEnumValue("LiftEquipment")
    LIFT_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.LIFT_EQUIPMENT),
    @XmlEnumValue("PlaceLighting")
    PLACE_LIGHTING(NameOfClassPlaceEquipmentRefStructureType.PLACE_LIGHTING),
    @XmlEnumValue("QueueingEquipment")
    QUEUEING_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.QUEUEING_EQUIPMENT),
    @XmlEnumValue("RampEquipment")
    RAMP_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.RAMP_EQUIPMENT),
    @XmlEnumValue("RoughSurface")
    ROUGH_SURFACE(NameOfClassPlaceEquipmentRefStructureType.ROUGH_SURFACE),
    @XmlEnumValue("StaircaseEquipment")
    STAIRCASE_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.STAIRCASE_EQUIPMENT),
    @XmlEnumValue("TravelatorEquipment")
    TRAVELATOR_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.TRAVELATOR_EQUIPMENT);
    private final NameOfClassPlaceEquipmentRefStructureType value;

    NameOfClassAccessEquipmentRefStructureType(NameOfClassPlaceEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassPlaceEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassAccessEquipmentRefStructureType fromValue(NameOfClassPlaceEquipmentRefStructureType v) {
        for (NameOfClassAccessEquipmentRefStructureType c: NameOfClassAccessEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
