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
 * <p>Java-Klasse f�r NameOfClassDeadRunJourneyPatternRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassDeadRunJourneyPatternRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassJourneyPatternRefStructureType">
 *     &lt;enumeration value="DeadRunJourneyPattern"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassDeadRunJourneyPatternRefStructureType")
@XmlEnum(NameOfClassJourneyPatternRefStructureType.class)
public enum NameOfClassDeadRunJourneyPatternRefStructureType {

    @XmlEnumValue("DeadRunJourneyPattern")
    DEAD_RUN_JOURNEY_PATTERN(NameOfClassJourneyPatternRefStructureType.DEAD_RUN_JOURNEY_PATTERN);
    private final NameOfClassJourneyPatternRefStructureType value;

    NameOfClassDeadRunJourneyPatternRefStructureType(NameOfClassJourneyPatternRefStructureType v) {
        value = v;
    }

    public NameOfClassJourneyPatternRefStructureType value() {
        return value;
    }

    public static NameOfClassDeadRunJourneyPatternRefStructureType fromValue(NameOfClassJourneyPatternRefStructureType v) {
        for (NameOfClassDeadRunJourneyPatternRefStructureType c: NameOfClassDeadRunJourneyPatternRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
