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
 * <p>Java-Klasse f�r NameOfClassLuggageSpotEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassLuggageSpotEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSpotEquipmentRefStructureType">
 *     &lt;enumeration value="LuggageSpotEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassLuggageSpotEquipmentRefStructureType")
@XmlEnum(NameOfClassSpotEquipmentRefStructureType.class)
public enum NameOfClassLuggageSpotEquipmentRefStructureType {

    @XmlEnumValue("LuggageSpotEquipment")
    LUGGAGE_SPOT_EQUIPMENT(NameOfClassSpotEquipmentRefStructureType.LUGGAGE_SPOT_EQUIPMENT);
    private final NameOfClassSpotEquipmentRefStructureType value;

    NameOfClassLuggageSpotEquipmentRefStructureType(NameOfClassSpotEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassSpotEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassLuggageSpotEquipmentRefStructureType fromValue(NameOfClassSpotEquipmentRefStructureType v) {
        for (NameOfClassLuggageSpotEquipmentRefStructureType c: NameOfClassLuggageSpotEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
