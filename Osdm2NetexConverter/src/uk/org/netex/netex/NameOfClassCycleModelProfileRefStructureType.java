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
 * <p>Java-Klasse f�r NameOfClassCycleModelProfileRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassCycleModelProfileRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassVehicleModelProfileRefStructureType">
 *     &lt;enumeration value="CycleModelProfile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassCycleModelProfileRefStructureType")
@XmlEnum(NameOfClassVehicleModelProfileRefStructureType.class)
public enum NameOfClassCycleModelProfileRefStructureType {

    @XmlEnumValue("CycleModelProfile")
    CYCLE_MODEL_PROFILE(NameOfClassVehicleModelProfileRefStructureType.CYCLE_MODEL_PROFILE);
    private final NameOfClassVehicleModelProfileRefStructureType value;

    NameOfClassCycleModelProfileRefStructureType(NameOfClassVehicleModelProfileRefStructureType v) {
        value = v;
    }

    public NameOfClassVehicleModelProfileRefStructureType value() {
        return value;
    }

    public static NameOfClassCycleModelProfileRefStructureType fromValue(NameOfClassVehicleModelProfileRefStructureType v) {
        for (NameOfClassCycleModelProfileRefStructureType c: NameOfClassCycleModelProfileRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
