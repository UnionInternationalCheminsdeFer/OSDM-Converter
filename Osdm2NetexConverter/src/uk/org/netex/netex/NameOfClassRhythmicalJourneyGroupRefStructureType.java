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
 * <p>Java-Klasse f�r NameOfClassRhythmicalJourneyGroupRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassRhythmicalJourneyGroupRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassJourneyFrequencyGroupRefStructureType">
 *     &lt;enumeration value="RhythmicalJourneyGroup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassRhythmicalJourneyGroupRefStructureType")
@XmlEnum(NameOfClassJourneyFrequencyGroupRefStructureType.class)
public enum NameOfClassRhythmicalJourneyGroupRefStructureType {

    @XmlEnumValue("RhythmicalJourneyGroup")
    RHYTHMICAL_JOURNEY_GROUP(NameOfClassJourneyFrequencyGroupRefStructureType.RHYTHMICAL_JOURNEY_GROUP);
    private final NameOfClassJourneyFrequencyGroupRefStructureType value;

    NameOfClassRhythmicalJourneyGroupRefStructureType(NameOfClassJourneyFrequencyGroupRefStructureType v) {
        value = v;
    }

    public NameOfClassJourneyFrequencyGroupRefStructureType value() {
        return value;
    }

    public static NameOfClassRhythmicalJourneyGroupRefStructureType fromValue(NameOfClassJourneyFrequencyGroupRefStructureType v) {
        for (NameOfClassRhythmicalJourneyGroupRefStructureType c: NameOfClassRhythmicalJourneyGroupRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
