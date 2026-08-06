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
 * <p>Java-Klasse f�r NameOfClassRoutePointRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassRoutePointRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPointRefStructureType">
 *     &lt;enumeration value="BorderPoint"/>
 *     &lt;enumeration value="FareScheduledStopPoint"/>
 *     &lt;enumeration value="GaragePoint"/>
 *     &lt;enumeration value="ParkingPoint"/>
 *     &lt;enumeration value="Point"/>
 *     &lt;enumeration value="ReliefPoint"/>
 *     &lt;enumeration value="RoutePoint"/>
 *     &lt;enumeration value="ScheduledStopPoint"/>
 *     &lt;enumeration value="TimingPoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassRoutePointRefStructureType")
@XmlEnum(NameOfClassPointRefStructureType.class)
public enum NameOfClassRoutePointRefStructureType {

    @XmlEnumValue("BorderPoint")
    BORDER_POINT(NameOfClassPointRefStructureType.BORDER_POINT),
    @XmlEnumValue("FareScheduledStopPoint")
    FARE_SCHEDULED_STOP_POINT(NameOfClassPointRefStructureType.FARE_SCHEDULED_STOP_POINT),
    @XmlEnumValue("GaragePoint")
    GARAGE_POINT(NameOfClassPointRefStructureType.GARAGE_POINT),
    @XmlEnumValue("ParkingPoint")
    PARKING_POINT(NameOfClassPointRefStructureType.PARKING_POINT),
    @XmlEnumValue("Point")
    POINT(NameOfClassPointRefStructureType.POINT),
    @XmlEnumValue("ReliefPoint")
    RELIEF_POINT(NameOfClassPointRefStructureType.RELIEF_POINT),
    @XmlEnumValue("RoutePoint")
    ROUTE_POINT(NameOfClassPointRefStructureType.ROUTE_POINT),
    @XmlEnumValue("ScheduledStopPoint")
    SCHEDULED_STOP_POINT(NameOfClassPointRefStructureType.SCHEDULED_STOP_POINT),
    @XmlEnumValue("TimingPoint")
    TIMING_POINT(NameOfClassPointRefStructureType.TIMING_POINT);
    private final NameOfClassPointRefStructureType value;

    NameOfClassRoutePointRefStructureType(NameOfClassPointRefStructureType v) {
        value = v;
    }

    public NameOfClassPointRefStructureType value() {
        return value;
    }

    public static NameOfClassRoutePointRefStructureType fromValue(NameOfClassPointRefStructureType v) {
        for (NameOfClassRoutePointRefStructureType c: NameOfClassRoutePointRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
