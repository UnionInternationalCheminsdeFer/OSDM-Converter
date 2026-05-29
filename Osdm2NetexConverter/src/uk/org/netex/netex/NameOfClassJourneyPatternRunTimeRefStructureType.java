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
 * <p>Java-Klasse f�r NameOfClassJourneyPatternRunTimeRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassJourneyPatternRunTimeRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassJourneyTimingRefStructureType">
 *     &lt;enumeration value="JourneyPatternRunTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassJourneyPatternRunTimeRefStructureType")
@XmlEnum(NameOfClassJourneyTimingRefStructureType.class)
public enum NameOfClassJourneyPatternRunTimeRefStructureType {

    @XmlEnumValue("JourneyPatternRunTime")
    JOURNEY_PATTERN_RUN_TIME(NameOfClassJourneyTimingRefStructureType.JOURNEY_PATTERN_RUN_TIME);
    private final NameOfClassJourneyTimingRefStructureType value;

    NameOfClassJourneyPatternRunTimeRefStructureType(NameOfClassJourneyTimingRefStructureType v) {
        value = v;
    }

    public NameOfClassJourneyTimingRefStructureType value() {
        return value;
    }

    public static NameOfClassJourneyPatternRunTimeRefStructureType fromValue(NameOfClassJourneyTimingRefStructureType v) {
        for (NameOfClassJourneyPatternRunTimeRefStructureType c: NameOfClassJourneyPatternRunTimeRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
