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
 * <p>Java-Klasse f�r NameOfClassTimingPointInJourneyPatternRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTimingPointInJourneyPatternRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPointInJourneyPatternRefStructureType">
 *     &lt;enumeration value="TimingPointInJourneyPattern"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTimingPointInJourneyPatternRefStructureType")
@XmlEnum(NameOfClassPointInJourneyPatternRefStructureType.class)
public enum NameOfClassTimingPointInJourneyPatternRefStructureType {

    @XmlEnumValue("TimingPointInJourneyPattern")
    TIMING_POINT_IN_JOURNEY_PATTERN(NameOfClassPointInJourneyPatternRefStructureType.TIMING_POINT_IN_JOURNEY_PATTERN);
    private final NameOfClassPointInJourneyPatternRefStructureType value;

    NameOfClassTimingPointInJourneyPatternRefStructureType(NameOfClassPointInJourneyPatternRefStructureType v) {
        value = v;
    }

    public NameOfClassPointInJourneyPatternRefStructureType value() {
        return value;
    }

    public static NameOfClassTimingPointInJourneyPatternRefStructureType fromValue(NameOfClassPointInJourneyPatternRefStructureType v) {
        for (NameOfClassTimingPointInJourneyPatternRefStructureType c: NameOfClassTimingPointInJourneyPatternRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
