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
 * <p>Java-Klasse f�r NameOfClassPointRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPointRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="ActivationPoint"/>
 *     &lt;enumeration value="BeaconPoint"/>
 *     &lt;enumeration value="BorderPoint"/>
 *     &lt;enumeration value="DeckPathJunction"/>
 *     &lt;enumeration value="FareScheduledStopPoint"/>
 *     &lt;enumeration value="GaragePoint"/>
 *     &lt;enumeration value="ParkingPoint"/>
 *     &lt;enumeration value="PathJunction"/>
 *     &lt;enumeration value="Point"/>
 *     &lt;enumeration value="PointOnLink"/>
 *     &lt;enumeration value="RailwayJunction"/>
 *     &lt;enumeration value="ReliefPoint"/>
 *     &lt;enumeration value="RoadJunction"/>
 *     &lt;enumeration value="RoutePoint"/>
 *     &lt;enumeration value="ScheduledStopPoint"/>
 *     &lt;enumeration value="SitePathJunction"/>
 *     &lt;enumeration value="TimingPoint"/>
 *     &lt;enumeration value="TrafficControlPoint"/>
 *     &lt;enumeration value="VehicleMeetingPoint"/>
 *     &lt;enumeration value="WireJunction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPointRefStructureType")
@XmlEnum
public enum NameOfClassPointRefStructureType {

    @XmlEnumValue("ActivationPoint")
    ACTIVATION_POINT("ActivationPoint"),
    @XmlEnumValue("BeaconPoint")
    BEACON_POINT("BeaconPoint"),
    @XmlEnumValue("BorderPoint")
    BORDER_POINT("BorderPoint"),
    @XmlEnumValue("DeckPathJunction")
    DECK_PATH_JUNCTION("DeckPathJunction"),
    @XmlEnumValue("FareScheduledStopPoint")
    FARE_SCHEDULED_STOP_POINT("FareScheduledStopPoint"),
    @XmlEnumValue("GaragePoint")
    GARAGE_POINT("GaragePoint"),
    @XmlEnumValue("ParkingPoint")
    PARKING_POINT("ParkingPoint"),
    @XmlEnumValue("PathJunction")
    PATH_JUNCTION("PathJunction"),
    @XmlEnumValue("Point")
    POINT("Point"),
    @XmlEnumValue("PointOnLink")
    POINT_ON_LINK("PointOnLink"),
    @XmlEnumValue("RailwayJunction")
    RAILWAY_JUNCTION("RailwayJunction"),
    @XmlEnumValue("ReliefPoint")
    RELIEF_POINT("ReliefPoint"),
    @XmlEnumValue("RoadJunction")
    ROAD_JUNCTION("RoadJunction"),
    @XmlEnumValue("RoutePoint")
    ROUTE_POINT("RoutePoint"),
    @XmlEnumValue("ScheduledStopPoint")
    SCHEDULED_STOP_POINT("ScheduledStopPoint"),
    @XmlEnumValue("SitePathJunction")
    SITE_PATH_JUNCTION("SitePathJunction"),
    @XmlEnumValue("TimingPoint")
    TIMING_POINT("TimingPoint"),
    @XmlEnumValue("TrafficControlPoint")
    TRAFFIC_CONTROL_POINT("TrafficControlPoint"),
    @XmlEnumValue("VehicleMeetingPoint")
    VEHICLE_MEETING_POINT("VehicleMeetingPoint"),
    @XmlEnumValue("WireJunction")
    WIRE_JUNCTION("WireJunction");
    private final String value;

    NameOfClassPointRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassPointRefStructureType fromValue(String v) {
        for (NameOfClassPointRefStructureType c: NameOfClassPointRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
