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
 * <p>Java-Klasse f�r NameOfClassTrainBlockRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTrainBlockRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassBlockRefStructureType">
 *     &lt;enumeration value="TrainBlock"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTrainBlockRefStructureType")
@XmlEnum(NameOfClassBlockRefStructureType.class)
public enum NameOfClassTrainBlockRefStructureType {

    @XmlEnumValue("TrainBlock")
    TRAIN_BLOCK(NameOfClassBlockRefStructureType.TRAIN_BLOCK);
    private final NameOfClassBlockRefStructureType value;

    NameOfClassTrainBlockRefStructureType(NameOfClassBlockRefStructureType v) {
        value = v;
    }

    public NameOfClassBlockRefStructureType value() {
        return value;
    }

    public static NameOfClassTrainBlockRefStructureType fromValue(NameOfClassBlockRefStructureType v) {
        for (NameOfClassTrainBlockRefStructureType c: NameOfClassTrainBlockRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
