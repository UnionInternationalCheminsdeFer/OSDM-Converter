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
 * <p>Java-Klasse f�r NameOfClassJourneyTimingRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassJourneyTimingRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="DatedPassingTime"/>
 *     &lt;enumeration value="DefaultDeadRunRunTime"/>
 *     &lt;enumeration value="DefaultServiceJourneyRunTime"/>
 *     &lt;enumeration value="EstimatedPassingTime"/>
 *     &lt;enumeration value="Headway"/>
 *     &lt;enumeration value="InterchangeRuleTiming"/>
 *     &lt;enumeration value="JourneyHeadway"/>
 *     &lt;enumeration value="JourneyLayover"/>
 *     &lt;enumeration value="JourneyPatternHeadway"/>
 *     &lt;enumeration value="JourneyPatternLayover"/>
 *     &lt;enumeration value="JourneyPatternRunTime"/>
 *     &lt;enumeration value="JourneyPatternWaitTime"/>
 *     &lt;enumeration value="JourneyRunTime"/>
 *     &lt;enumeration value="JourneyWaitTime"/>
 *     &lt;enumeration value="ObservedPassingTime"/>
 *     &lt;enumeration value="PassengerAtStopTime"/>
 *     &lt;enumeration value="TargetPassingTime"/>
 *     &lt;enumeration value="TimetabledPassingTime"/>
 *     &lt;enumeration value="TurnaroundTimeLimitTime"/>
 *     &lt;enumeration value="VehicleJourneyHeadway"/>
 *     &lt;enumeration value="VehicleJourneyLayover"/>
 *     &lt;enumeration value="VehicleJourneyRunTime"/>
 *     &lt;enumeration value="VehicleJourneyWaitTime"/>
 *     &lt;enumeration value="VehicleTypePreference"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassJourneyTimingRefStructureType")
@XmlEnum
public enum NameOfClassJourneyTimingRefStructureType {

    @XmlEnumValue("DatedPassingTime")
    DATED_PASSING_TIME("DatedPassingTime"),
    @XmlEnumValue("DefaultDeadRunRunTime")
    DEFAULT_DEAD_RUN_RUN_TIME("DefaultDeadRunRunTime"),
    @XmlEnumValue("DefaultServiceJourneyRunTime")
    DEFAULT_SERVICE_JOURNEY_RUN_TIME("DefaultServiceJourneyRunTime"),
    @XmlEnumValue("EstimatedPassingTime")
    ESTIMATED_PASSING_TIME("EstimatedPassingTime"),
    @XmlEnumValue("Headway")
    HEADWAY("Headway"),
    @XmlEnumValue("InterchangeRuleTiming")
    INTERCHANGE_RULE_TIMING("InterchangeRuleTiming"),
    @XmlEnumValue("JourneyHeadway")
    JOURNEY_HEADWAY("JourneyHeadway"),
    @XmlEnumValue("JourneyLayover")
    JOURNEY_LAYOVER("JourneyLayover"),
    @XmlEnumValue("JourneyPatternHeadway")
    JOURNEY_PATTERN_HEADWAY("JourneyPatternHeadway"),
    @XmlEnumValue("JourneyPatternLayover")
    JOURNEY_PATTERN_LAYOVER("JourneyPatternLayover"),
    @XmlEnumValue("JourneyPatternRunTime")
    JOURNEY_PATTERN_RUN_TIME("JourneyPatternRunTime"),
    @XmlEnumValue("JourneyPatternWaitTime")
    JOURNEY_PATTERN_WAIT_TIME("JourneyPatternWaitTime"),
    @XmlEnumValue("JourneyRunTime")
    JOURNEY_RUN_TIME("JourneyRunTime"),
    @XmlEnumValue("JourneyWaitTime")
    JOURNEY_WAIT_TIME("JourneyWaitTime"),
    @XmlEnumValue("ObservedPassingTime")
    OBSERVED_PASSING_TIME("ObservedPassingTime"),
    @XmlEnumValue("PassengerAtStopTime")
    PASSENGER_AT_STOP_TIME("PassengerAtStopTime"),
    @XmlEnumValue("TargetPassingTime")
    TARGET_PASSING_TIME("TargetPassingTime"),
    @XmlEnumValue("TimetabledPassingTime")
    TIMETABLED_PASSING_TIME("TimetabledPassingTime"),
    @XmlEnumValue("TurnaroundTimeLimitTime")
    TURNAROUND_TIME_LIMIT_TIME("TurnaroundTimeLimitTime"),
    @XmlEnumValue("VehicleJourneyHeadway")
    VEHICLE_JOURNEY_HEADWAY("VehicleJourneyHeadway"),
    @XmlEnumValue("VehicleJourneyLayover")
    VEHICLE_JOURNEY_LAYOVER("VehicleJourneyLayover"),
    @XmlEnumValue("VehicleJourneyRunTime")
    VEHICLE_JOURNEY_RUN_TIME("VehicleJourneyRunTime"),
    @XmlEnumValue("VehicleJourneyWaitTime")
    VEHICLE_JOURNEY_WAIT_TIME("VehicleJourneyWaitTime"),
    @XmlEnumValue("VehicleTypePreference")
    VEHICLE_TYPE_PREFERENCE("VehicleTypePreference");
    private final String value;

    NameOfClassJourneyTimingRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassJourneyTimingRefStructureType fromValue(String v) {
        for (NameOfClassJourneyTimingRefStructureType c: NameOfClassJourneyTimingRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
