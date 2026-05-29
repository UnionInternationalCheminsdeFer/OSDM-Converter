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
 * <p>Java-Klasse f�r NameOfClassModeOfOperationRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassModeOfOperationRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassTypeOfValueRefStructureType">
 *     &lt;enumeration value="AlternativeModeOfOperation"/>
 *     &lt;enumeration value="PersonalModeOfOperation"/>
 *     &lt;enumeration value="VehiclePooling"/>
 *     &lt;enumeration value="VehicleRental"/>
 *     &lt;enumeration value="VehicleSharing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassModeOfOperationRefStructureType")
@XmlEnum(NameOfClassTypeOfValueRefStructureType.class)
public enum NameOfClassModeOfOperationRefStructureType {

    @XmlEnumValue("AlternativeModeOfOperation")
    ALTERNATIVE_MODE_OF_OPERATION(NameOfClassTypeOfValueRefStructureType.ALTERNATIVE_MODE_OF_OPERATION),
    @XmlEnumValue("PersonalModeOfOperation")
    PERSONAL_MODE_OF_OPERATION(NameOfClassTypeOfValueRefStructureType.PERSONAL_MODE_OF_OPERATION),
    @XmlEnumValue("VehiclePooling")
    VEHICLE_POOLING(NameOfClassTypeOfValueRefStructureType.VEHICLE_POOLING),
    @XmlEnumValue("VehicleRental")
    VEHICLE_RENTAL(NameOfClassTypeOfValueRefStructureType.VEHICLE_RENTAL),
    @XmlEnumValue("VehicleSharing")
    VEHICLE_SHARING(NameOfClassTypeOfValueRefStructureType.VEHICLE_SHARING);
    private final NameOfClassTypeOfValueRefStructureType value;

    NameOfClassModeOfOperationRefStructureType(NameOfClassTypeOfValueRefStructureType v) {
        value = v;
    }

    public NameOfClassTypeOfValueRefStructureType value() {
        return value;
    }

    public static NameOfClassModeOfOperationRefStructureType fromValue(NameOfClassTypeOfValueRefStructureType v) {
        for (NameOfClassModeOfOperationRefStructureType c: NameOfClassModeOfOperationRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
