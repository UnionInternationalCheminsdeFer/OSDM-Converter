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
 * <p>Java-Klasse f�r NameOfClassTransportTypeRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTransportTypeRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="CompoundTrain"/>
 *     &lt;enumeration value="PoweredTrain"/>
 *     &lt;enumeration value="SimpleVehicleType"/>
 *     &lt;enumeration value="Train"/>
 *     &lt;enumeration value="TransportType"/>
 *     &lt;enumeration value="UnpoweredTrain"/>
 *     &lt;enumeration value="VehicleType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTransportTypeRefStructureType")
@XmlEnum
public enum NameOfClassTransportTypeRefStructureType {

    @XmlEnumValue("CompoundTrain")
    COMPOUND_TRAIN("CompoundTrain"),
    @XmlEnumValue("PoweredTrain")
    POWERED_TRAIN("PoweredTrain"),
    @XmlEnumValue("SimpleVehicleType")
    SIMPLE_VEHICLE_TYPE("SimpleVehicleType"),
    @XmlEnumValue("Train")
    TRAIN("Train"),
    @XmlEnumValue("TransportType")
    TRANSPORT_TYPE("TransportType"),
    @XmlEnumValue("UnpoweredTrain")
    UNPOWERED_TRAIN("UnpoweredTrain"),
    @XmlEnumValue("VehicleType")
    VEHICLE_TYPE("VehicleType");
    private final String value;

    NameOfClassTransportTypeRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassTransportTypeRefStructureType fromValue(String v) {
        for (NameOfClassTransportTypeRefStructureType c: NameOfClassTransportTypeRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
