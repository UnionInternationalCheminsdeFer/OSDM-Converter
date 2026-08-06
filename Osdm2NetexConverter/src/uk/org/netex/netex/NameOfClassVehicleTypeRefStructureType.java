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
 * <p>Java-Klasse f�r NameOfClassVehicleTypeRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleTypeRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassTransportTypeRefStructureType">
 *     &lt;enumeration value="CompoundTrain"/>
 *     &lt;enumeration value="PoweredTrain"/>
 *     &lt;enumeration value="Train"/>
 *     &lt;enumeration value="UnpoweredTrain"/>
 *     &lt;enumeration value="VehicleType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleTypeRefStructureType")
@XmlEnum(NameOfClassTransportTypeRefStructureType.class)
public enum NameOfClassVehicleTypeRefStructureType {

    @XmlEnumValue("CompoundTrain")
    COMPOUND_TRAIN(NameOfClassTransportTypeRefStructureType.COMPOUND_TRAIN),
    @XmlEnumValue("PoweredTrain")
    POWERED_TRAIN(NameOfClassTransportTypeRefStructureType.POWERED_TRAIN),
    @XmlEnumValue("Train")
    TRAIN(NameOfClassTransportTypeRefStructureType.TRAIN),
    @XmlEnumValue("UnpoweredTrain")
    UNPOWERED_TRAIN(NameOfClassTransportTypeRefStructureType.UNPOWERED_TRAIN),
    @XmlEnumValue("VehicleType")
    VEHICLE_TYPE(NameOfClassTransportTypeRefStructureType.VEHICLE_TYPE);
    private final NameOfClassTransportTypeRefStructureType value;

    NameOfClassVehicleTypeRefStructureType(NameOfClassTransportTypeRefStructureType v) {
        value = v;
    }

    public NameOfClassTransportTypeRefStructureType value() {
        return value;
    }

    public static NameOfClassVehicleTypeRefStructureType fromValue(NameOfClassTransportTypeRefStructureType v) {
        for (NameOfClassVehicleTypeRefStructureType c: NameOfClassVehicleTypeRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
