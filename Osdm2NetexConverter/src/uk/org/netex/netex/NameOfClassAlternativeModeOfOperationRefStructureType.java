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
 * <p>Java-Klasse f�r NameOfClassAlternativeModeOfOperationRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassAlternativeModeOfOperationRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassModeOfOperationRefStructureType">
 *     &lt;enumeration value="AlternativeModeOfOperation"/>
 *     &lt;enumeration value="VehiclePooling"/>
 *     &lt;enumeration value="VehicleRental"/>
 *     &lt;enumeration value="VehicleSharing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassAlternativeModeOfOperationRefStructureType")
@XmlEnum(NameOfClassModeOfOperationRefStructureType.class)
public enum NameOfClassAlternativeModeOfOperationRefStructureType {

    @XmlEnumValue("AlternativeModeOfOperation")
    ALTERNATIVE_MODE_OF_OPERATION(NameOfClassModeOfOperationRefStructureType.ALTERNATIVE_MODE_OF_OPERATION),
    @XmlEnumValue("VehiclePooling")
    VEHICLE_POOLING(NameOfClassModeOfOperationRefStructureType.VEHICLE_POOLING),
    @XmlEnumValue("VehicleRental")
    VEHICLE_RENTAL(NameOfClassModeOfOperationRefStructureType.VEHICLE_RENTAL),
    @XmlEnumValue("VehicleSharing")
    VEHICLE_SHARING(NameOfClassModeOfOperationRefStructureType.VEHICLE_SHARING);
    private final NameOfClassModeOfOperationRefStructureType value;

    NameOfClassAlternativeModeOfOperationRefStructureType(NameOfClassModeOfOperationRefStructureType v) {
        value = v;
    }

    public NameOfClassModeOfOperationRefStructureType value() {
        return value;
    }

    public static NameOfClassAlternativeModeOfOperationRefStructureType fromValue(NameOfClassModeOfOperationRefStructureType v) {
        for (NameOfClassAlternativeModeOfOperationRefStructureType c: NameOfClassAlternativeModeOfOperationRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
