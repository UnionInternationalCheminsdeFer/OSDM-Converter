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
 * <p>Java-Klasse f�r NameOfClassTimingLinkInJourneyPatternRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTimingLinkInJourneyPatternRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLinkInJourneyPatternRefStructureType">
 *     &lt;enumeration value="TimingLinkInJourneyPattern"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTimingLinkInJourneyPatternRefStructureType")
@XmlEnum(NameOfClassLinkInJourneyPatternRefStructureType.class)
public enum NameOfClassTimingLinkInJourneyPatternRefStructureType {

    @XmlEnumValue("TimingLinkInJourneyPattern")
    TIMING_LINK_IN_JOURNEY_PATTERN(NameOfClassLinkInJourneyPatternRefStructureType.TIMING_LINK_IN_JOURNEY_PATTERN);
    private final NameOfClassLinkInJourneyPatternRefStructureType value;

    NameOfClassTimingLinkInJourneyPatternRefStructureType(NameOfClassLinkInJourneyPatternRefStructureType v) {
        value = v;
    }

    public NameOfClassLinkInJourneyPatternRefStructureType value() {
        return value;
    }

    public static NameOfClassTimingLinkInJourneyPatternRefStructureType fromValue(NameOfClassLinkInJourneyPatternRefStructureType v) {
        for (NameOfClassTimingLinkInJourneyPatternRefStructureType c: NameOfClassTimingLinkInJourneyPatternRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
