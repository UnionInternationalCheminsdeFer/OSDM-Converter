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
 * <p>Java-Klasse f�r NameOfClassLinkSequenceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassLinkSequenceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="CommonSection"/>
 *     &lt;enumeration value="DatedServiceJourney"/>
 *     &lt;enumeration value="DatedSpecialService"/>
 *     &lt;enumeration value="DatedVehicleJourney"/>
 *     &lt;enumeration value="DeadRun"/>
 *     &lt;enumeration value="DeadRunJourneyPattern"/>
 *     &lt;enumeration value="DeckNavigationPath"/>
 *     &lt;enumeration value="FareSection"/>
 *     &lt;enumeration value="FlexibleRoute"/>
 *     &lt;enumeration value="GeneralSection"/>
 *     &lt;enumeration value="JourneyPattern"/>
 *     &lt;enumeration value="LineSection"/>
 *     &lt;enumeration value="NavigationPath"/>
 *     &lt;enumeration value="NormalDatedVehicleJourney"/>
 *     &lt;enumeration value="Route"/>
 *     &lt;enumeration value="ServiceJourney"/>
 *     &lt;enumeration value="ServiceJourneyPattern"/>
 *     &lt;enumeration value="ServicePattern"/>
 *     &lt;enumeration value="SingleJourney"/>
 *     &lt;enumeration value="SingleJourneyPath"/>
 *     &lt;enumeration value="SiteNavigationPath"/>
 *     &lt;enumeration value="SpecialService"/>
 *     &lt;enumeration value="TemplateServiceJourney"/>
 *     &lt;enumeration value="TemplateVehicleJourney"/>
 *     &lt;enumeration value="TimingPattern"/>
 *     &lt;enumeration value="VehicleJourney"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassLinkSequenceRefStructureType")
@XmlEnum
public enum NameOfClassLinkSequenceRefStructureType {

    @XmlEnumValue("CommonSection")
    COMMON_SECTION("CommonSection"),
    @XmlEnumValue("DatedServiceJourney")
    DATED_SERVICE_JOURNEY("DatedServiceJourney"),
    @XmlEnumValue("DatedSpecialService")
    DATED_SPECIAL_SERVICE("DatedSpecialService"),
    @XmlEnumValue("DatedVehicleJourney")
    DATED_VEHICLE_JOURNEY("DatedVehicleJourney"),
    @XmlEnumValue("DeadRun")
    DEAD_RUN("DeadRun"),
    @XmlEnumValue("DeadRunJourneyPattern")
    DEAD_RUN_JOURNEY_PATTERN("DeadRunJourneyPattern"),
    @XmlEnumValue("DeckNavigationPath")
    DECK_NAVIGATION_PATH("DeckNavigationPath"),
    @XmlEnumValue("FareSection")
    FARE_SECTION("FareSection"),
    @XmlEnumValue("FlexibleRoute")
    FLEXIBLE_ROUTE("FlexibleRoute"),
    @XmlEnumValue("GeneralSection")
    GENERAL_SECTION("GeneralSection"),
    @XmlEnumValue("JourneyPattern")
    JOURNEY_PATTERN("JourneyPattern"),
    @XmlEnumValue("LineSection")
    LINE_SECTION("LineSection"),
    @XmlEnumValue("NavigationPath")
    NAVIGATION_PATH("NavigationPath"),
    @XmlEnumValue("NormalDatedVehicleJourney")
    NORMAL_DATED_VEHICLE_JOURNEY("NormalDatedVehicleJourney"),
    @XmlEnumValue("Route")
    ROUTE("Route"),
    @XmlEnumValue("ServiceJourney")
    SERVICE_JOURNEY("ServiceJourney"),
    @XmlEnumValue("ServiceJourneyPattern")
    SERVICE_JOURNEY_PATTERN("ServiceJourneyPattern"),
    @XmlEnumValue("ServicePattern")
    SERVICE_PATTERN("ServicePattern"),
    @XmlEnumValue("SingleJourney")
    SINGLE_JOURNEY("SingleJourney"),
    @XmlEnumValue("SingleJourneyPath")
    SINGLE_JOURNEY_PATH("SingleJourneyPath"),
    @XmlEnumValue("SiteNavigationPath")
    SITE_NAVIGATION_PATH("SiteNavigationPath"),
    @XmlEnumValue("SpecialService")
    SPECIAL_SERVICE("SpecialService"),
    @XmlEnumValue("TemplateServiceJourney")
    TEMPLATE_SERVICE_JOURNEY("TemplateServiceJourney"),
    @XmlEnumValue("TemplateVehicleJourney")
    TEMPLATE_VEHICLE_JOURNEY("TemplateVehicleJourney"),
    @XmlEnumValue("TimingPattern")
    TIMING_PATTERN("TimingPattern"),
    @XmlEnumValue("VehicleJourney")
    VEHICLE_JOURNEY("VehicleJourney");
    private final String value;

    NameOfClassLinkSequenceRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassLinkSequenceRefStructureType fromValue(String v) {
        for (NameOfClassLinkSequenceRefStructureType c: NameOfClassLinkSequenceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
