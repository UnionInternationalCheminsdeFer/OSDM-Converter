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
 * <p>Java-Klasse f�r NameOfClassTimingPointRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTimingPointRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassRoutePointRefStructureType">
 *     &lt;enumeration value="BorderPoint"/>
 *     &lt;enumeration value="FareScheduledStopPoint"/>
 *     &lt;enumeration value="GaragePoint"/>
 *     &lt;enumeration value="ParkingPoint"/>
 *     &lt;enumeration value="Point"/>
 *     &lt;enumeration value="ReliefPoint"/>
 *     &lt;enumeration value="ScheduledStopPoint"/>
 *     &lt;enumeration value="TimingPoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTimingPointRefStructureType")
@XmlEnum(NameOfClassRoutePointRefStructureType.class)
public enum NameOfClassTimingPointRefStructureType {

    @XmlEnumValue("BorderPoint")
    BORDER_POINT(NameOfClassRoutePointRefStructureType.BORDER_POINT),
    @XmlEnumValue("FareScheduledStopPoint")
    FARE_SCHEDULED_STOP_POINT(NameOfClassRoutePointRefStructureType.FARE_SCHEDULED_STOP_POINT),
    @XmlEnumValue("GaragePoint")
    GARAGE_POINT(NameOfClassRoutePointRefStructureType.GARAGE_POINT),
    @XmlEnumValue("ParkingPoint")
    PARKING_POINT(NameOfClassRoutePointRefStructureType.PARKING_POINT),
    @XmlEnumValue("Point")
    POINT(NameOfClassRoutePointRefStructureType.POINT),
    @XmlEnumValue("ReliefPoint")
    RELIEF_POINT(NameOfClassRoutePointRefStructureType.RELIEF_POINT),
    @XmlEnumValue("ScheduledStopPoint")
    SCHEDULED_STOP_POINT(NameOfClassRoutePointRefStructureType.SCHEDULED_STOP_POINT),
    @XmlEnumValue("TimingPoint")
    TIMING_POINT(NameOfClassRoutePointRefStructureType.TIMING_POINT);
    private final NameOfClassRoutePointRefStructureType value;

    NameOfClassTimingPointRefStructureType(NameOfClassRoutePointRefStructureType v) {
        value = v;
    }

    public NameOfClassRoutePointRefStructureType value() {
        return value;
    }

    public static NameOfClassTimingPointRefStructureType fromValue(NameOfClassRoutePointRefStructureType v) {
        for (NameOfClassTimingPointRefStructureType c: NameOfClassTimingPointRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
