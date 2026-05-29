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
 * <p>Java-Klasse f�r NameOfClassCompoundTrainRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassCompoundTrainRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassVehicleTypeRefStructureType">
 *     &lt;enumeration value="CompoundTrain"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassCompoundTrainRefStructureType")
@XmlEnum(NameOfClassVehicleTypeRefStructureType.class)
public enum NameOfClassCompoundTrainRefStructureType {

    @XmlEnumValue("CompoundTrain")
    COMPOUND_TRAIN(NameOfClassVehicleTypeRefStructureType.COMPOUND_TRAIN);
    private final NameOfClassVehicleTypeRefStructureType value;

    NameOfClassCompoundTrainRefStructureType(NameOfClassVehicleTypeRefStructureType v) {
        value = v;
    }

    public NameOfClassVehicleTypeRefStructureType value() {
        return value;
    }

    public static NameOfClassCompoundTrainRefStructureType fromValue(NameOfClassVehicleTypeRefStructureType v) {
        for (NameOfClassCompoundTrainRefStructureType c: NameOfClassCompoundTrainRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
