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
 * <p>Java-Klasse f�r NameOfClassPassingTimeRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPassingTimeRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassJourneyTimingRefStructureType">
 *     &lt;enumeration value="DatedPassingTime"/>
 *     &lt;enumeration value="EstimatedPassingTime"/>
 *     &lt;enumeration value="ObservedPassingTime"/>
 *     &lt;enumeration value="PassengerAtStopTime"/>
 *     &lt;enumeration value="TargetPassingTime"/>
 *     &lt;enumeration value="TimetabledPassingTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPassingTimeRefStructureType")
@XmlEnum(NameOfClassJourneyTimingRefStructureType.class)
public enum NameOfClassPassingTimeRefStructureType {

    @XmlEnumValue("DatedPassingTime")
    DATED_PASSING_TIME(NameOfClassJourneyTimingRefStructureType.DATED_PASSING_TIME),
    @XmlEnumValue("EstimatedPassingTime")
    ESTIMATED_PASSING_TIME(NameOfClassJourneyTimingRefStructureType.ESTIMATED_PASSING_TIME),
    @XmlEnumValue("ObservedPassingTime")
    OBSERVED_PASSING_TIME(NameOfClassJourneyTimingRefStructureType.OBSERVED_PASSING_TIME),
    @XmlEnumValue("PassengerAtStopTime")
    PASSENGER_AT_STOP_TIME(NameOfClassJourneyTimingRefStructureType.PASSENGER_AT_STOP_TIME),
    @XmlEnumValue("TargetPassingTime")
    TARGET_PASSING_TIME(NameOfClassJourneyTimingRefStructureType.TARGET_PASSING_TIME),
    @XmlEnumValue("TimetabledPassingTime")
    TIMETABLED_PASSING_TIME(NameOfClassJourneyTimingRefStructureType.TIMETABLED_PASSING_TIME);
    private final NameOfClassJourneyTimingRefStructureType value;

    NameOfClassPassingTimeRefStructureType(NameOfClassJourneyTimingRefStructureType v) {
        value = v;
    }

    public NameOfClassJourneyTimingRefStructureType value() {
        return value;
    }

    public static NameOfClassPassingTimeRefStructureType fromValue(NameOfClassJourneyTimingRefStructureType v) {
        for (NameOfClassPassingTimeRefStructureType c: NameOfClassPassingTimeRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
