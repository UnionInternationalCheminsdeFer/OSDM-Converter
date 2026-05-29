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
 * <p>Java-Klasse f�r NameOfClassTrainElementTypeRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTrainElementTypeRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="TractiveElementType"/>
 *     &lt;enumeration value="TrailingElementType"/>
 *     &lt;enumeration value="TrainElementType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTrainElementTypeRefStructureType")
@XmlEnum
public enum NameOfClassTrainElementTypeRefStructureType {

    @XmlEnumValue("TractiveElementType")
    TRACTIVE_ELEMENT_TYPE("TractiveElementType"),
    @XmlEnumValue("TrailingElementType")
    TRAILING_ELEMENT_TYPE("TrailingElementType"),
    @XmlEnumValue("TrainElementType")
    TRAIN_ELEMENT_TYPE("TrainElementType");
    private final String value;

    NameOfClassTrainElementTypeRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassTrainElementTypeRefStructureType fromValue(String v) {
        for (NameOfClassTrainElementTypeRefStructureType c: NameOfClassTrainElementTypeRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
