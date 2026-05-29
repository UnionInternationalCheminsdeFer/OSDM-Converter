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
 * <p>Java-Klasse f�r NameOfClassEstimatedPassingTimeRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassEstimatedPassingTimeRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPassingTimeRefStructureType">
 *     &lt;enumeration value="DatedPassingTime"/>
 *     &lt;enumeration value="EstimatedPassingTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassEstimatedPassingTimeRefStructureType")
@XmlEnum(NameOfClassPassingTimeRefStructureType.class)
public enum NameOfClassEstimatedPassingTimeRefStructureType {

    @XmlEnumValue("DatedPassingTime")
    DATED_PASSING_TIME(NameOfClassPassingTimeRefStructureType.DATED_PASSING_TIME),
    @XmlEnumValue("EstimatedPassingTime")
    ESTIMATED_PASSING_TIME(NameOfClassPassingTimeRefStructureType.ESTIMATED_PASSING_TIME);
    private final NameOfClassPassingTimeRefStructureType value;

    NameOfClassEstimatedPassingTimeRefStructureType(NameOfClassPassingTimeRefStructureType v) {
        value = v;
    }

    public NameOfClassPassingTimeRefStructureType value() {
        return value;
    }

    public static NameOfClassEstimatedPassingTimeRefStructureType fromValue(NameOfClassPassingTimeRefStructureType v) {
        for (NameOfClassEstimatedPassingTimeRefStructureType c: NameOfClassEstimatedPassingTimeRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
