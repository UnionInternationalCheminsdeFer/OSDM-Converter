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
 * <p>Java-Klasse f�r NameOfClassLinkRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassLinkRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="ActivationLink"/>
 *     &lt;enumeration value="DeckPathLink"/>
 *     &lt;enumeration value="OffSitePathLink"/>
 *     &lt;enumeration value="PathLink"/>
 *     &lt;enumeration value="RailwayElement"/>
 *     &lt;enumeration value="RoadElement"/>
 *     &lt;enumeration value="RouteLink"/>
 *     &lt;enumeration value="ServiceLink"/>
 *     &lt;enumeration value="SitePathLink"/>
 *     &lt;enumeration value="TimingLink"/>
 *     &lt;enumeration value="VehicleMeetingLink"/>
 *     &lt;enumeration value="WireElement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassLinkRefStructureType")
@XmlEnum
public enum NameOfClassLinkRefStructureType {

    @XmlEnumValue("ActivationLink")
    ACTIVATION_LINK("ActivationLink"),
    @XmlEnumValue("DeckPathLink")
    DECK_PATH_LINK("DeckPathLink"),
    @XmlEnumValue("OffSitePathLink")
    OFF_SITE_PATH_LINK("OffSitePathLink"),
    @XmlEnumValue("PathLink")
    PATH_LINK("PathLink"),
    @XmlEnumValue("RailwayElement")
    RAILWAY_ELEMENT("RailwayElement"),
    @XmlEnumValue("RoadElement")
    ROAD_ELEMENT("RoadElement"),
    @XmlEnumValue("RouteLink")
    ROUTE_LINK("RouteLink"),
    @XmlEnumValue("ServiceLink")
    SERVICE_LINK("ServiceLink"),
    @XmlEnumValue("SitePathLink")
    SITE_PATH_LINK("SitePathLink"),
    @XmlEnumValue("TimingLink")
    TIMING_LINK("TimingLink"),
    @XmlEnumValue("VehicleMeetingLink")
    VEHICLE_MEETING_LINK("VehicleMeetingLink"),
    @XmlEnumValue("WireElement")
    WIRE_ELEMENT("WireElement");
    private final String value;

    NameOfClassLinkRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassLinkRefStructureType fromValue(String v) {
        for (NameOfClassLinkRefStructureType c: NameOfClassLinkRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
