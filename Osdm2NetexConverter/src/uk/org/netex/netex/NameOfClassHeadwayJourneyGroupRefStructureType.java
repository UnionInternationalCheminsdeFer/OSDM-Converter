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
 * <p>Java-Klasse f�r NameOfClassHeadwayJourneyGroupRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassHeadwayJourneyGroupRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassJourneyFrequencyGroupRefStructureType">
 *     &lt;enumeration value="HeadwayJourneyGroup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassHeadwayJourneyGroupRefStructureType")
@XmlEnum(NameOfClassJourneyFrequencyGroupRefStructureType.class)
public enum NameOfClassHeadwayJourneyGroupRefStructureType {

    @XmlEnumValue("HeadwayJourneyGroup")
    HEADWAY_JOURNEY_GROUP(NameOfClassJourneyFrequencyGroupRefStructureType.HEADWAY_JOURNEY_GROUP);
    private final NameOfClassJourneyFrequencyGroupRefStructureType value;

    NameOfClassHeadwayJourneyGroupRefStructureType(NameOfClassJourneyFrequencyGroupRefStructureType v) {
        value = v;
    }

    public NameOfClassJourneyFrequencyGroupRefStructureType value() {
        return value;
    }

    public static NameOfClassHeadwayJourneyGroupRefStructureType fromValue(NameOfClassJourneyFrequencyGroupRefStructureType v) {
        for (NameOfClassHeadwayJourneyGroupRefStructureType c: NameOfClassHeadwayJourneyGroupRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
