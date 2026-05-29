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
 * <p>Java-Klasse f�r NameOfClassJourneyPatternRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassJourneyPatternRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLinkSequenceRefStructureType">
 *     &lt;enumeration value="DeadRunJourneyPattern"/>
 *     &lt;enumeration value="JourneyPattern"/>
 *     &lt;enumeration value="ServiceJourneyPattern"/>
 *     &lt;enumeration value="ServicePattern"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassJourneyPatternRefStructureType")
@XmlEnum(NameOfClassLinkSequenceRefStructureType.class)
public enum NameOfClassJourneyPatternRefStructureType {

    @XmlEnumValue("DeadRunJourneyPattern")
    DEAD_RUN_JOURNEY_PATTERN(NameOfClassLinkSequenceRefStructureType.DEAD_RUN_JOURNEY_PATTERN),
    @XmlEnumValue("JourneyPattern")
    JOURNEY_PATTERN(NameOfClassLinkSequenceRefStructureType.JOURNEY_PATTERN),
    @XmlEnumValue("ServiceJourneyPattern")
    SERVICE_JOURNEY_PATTERN(NameOfClassLinkSequenceRefStructureType.SERVICE_JOURNEY_PATTERN),
    @XmlEnumValue("ServicePattern")
    SERVICE_PATTERN(NameOfClassLinkSequenceRefStructureType.SERVICE_PATTERN);
    private final NameOfClassLinkSequenceRefStructureType value;

    NameOfClassJourneyPatternRefStructureType(NameOfClassLinkSequenceRefStructureType v) {
        value = v;
    }

    public NameOfClassLinkSequenceRefStructureType value() {
        return value;
    }

    public static NameOfClassJourneyPatternRefStructureType fromValue(NameOfClassLinkSequenceRefStructureType v) {
        for (NameOfClassJourneyPatternRefStructureType c: NameOfClassJourneyPatternRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
