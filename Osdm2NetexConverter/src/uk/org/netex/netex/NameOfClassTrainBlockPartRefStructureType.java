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
 * <p>Java-Klasse f�r NameOfClassTrainBlockPartRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTrainBlockPartRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassBlockPartRefStructureType">
 *     &lt;enumeration value="TrainBlockPart"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTrainBlockPartRefStructureType")
@XmlEnum(NameOfClassBlockPartRefStructureType.class)
public enum NameOfClassTrainBlockPartRefStructureType {

    @XmlEnumValue("TrainBlockPart")
    TRAIN_BLOCK_PART(NameOfClassBlockPartRefStructureType.TRAIN_BLOCK_PART);
    private final NameOfClassBlockPartRefStructureType value;

    NameOfClassTrainBlockPartRefStructureType(NameOfClassBlockPartRefStructureType v) {
        value = v;
    }

    public NameOfClassBlockPartRefStructureType value() {
        return value;
    }

    public static NameOfClassTrainBlockPartRefStructureType fromValue(NameOfClassBlockPartRefStructureType v) {
        for (NameOfClassTrainBlockPartRefStructureType c: NameOfClassTrainBlockPartRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
