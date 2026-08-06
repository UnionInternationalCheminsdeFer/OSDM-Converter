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
 * <p>Java-Klasse f�r NameOfClassVersionFrameRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVersionFrameRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="CompositeFrame"/>
 *     &lt;enumeration value="DriverScheduleFrame"/>
 *     &lt;enumeration value="FareFrame"/>
 *     &lt;enumeration value="FarePriceFrame"/>
 *     &lt;enumeration value="GeneralFrame"/>
 *     &lt;enumeration value="InfrastructureFrame"/>
 *     &lt;enumeration value="MobilityJourneyFrame"/>
 *     &lt;enumeration value="MobilityServiceFrame"/>
 *     &lt;enumeration value="ResourceFrame"/>
 *     &lt;enumeration value="SalesTransactionFrame"/>
 *     &lt;enumeration value="ServiceCalendarFrame"/>
 *     &lt;enumeration value="ServiceFrame"/>
 *     &lt;enumeration value="SiteFrame"/>
 *     &lt;enumeration value="TimetableFrame"/>
 *     &lt;enumeration value="VehicleScheduleFrame"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVersionFrameRefStructureType")
@XmlEnum
public enum NameOfClassVersionFrameRefStructureType {

    @XmlEnumValue("CompositeFrame")
    COMPOSITE_FRAME("CompositeFrame"),
    @XmlEnumValue("DriverScheduleFrame")
    DRIVER_SCHEDULE_FRAME("DriverScheduleFrame"),
    @XmlEnumValue("FareFrame")
    FARE_FRAME("FareFrame"),
    @XmlEnumValue("FarePriceFrame")
    FARE_PRICE_FRAME("FarePriceFrame"),
    @XmlEnumValue("GeneralFrame")
    GENERAL_FRAME("GeneralFrame"),
    @XmlEnumValue("InfrastructureFrame")
    INFRASTRUCTURE_FRAME("InfrastructureFrame"),
    @XmlEnumValue("MobilityJourneyFrame")
    MOBILITY_JOURNEY_FRAME("MobilityJourneyFrame"),
    @XmlEnumValue("MobilityServiceFrame")
    MOBILITY_SERVICE_FRAME("MobilityServiceFrame"),
    @XmlEnumValue("ResourceFrame")
    RESOURCE_FRAME("ResourceFrame"),
    @XmlEnumValue("SalesTransactionFrame")
    SALES_TRANSACTION_FRAME("SalesTransactionFrame"),
    @XmlEnumValue("ServiceCalendarFrame")
    SERVICE_CALENDAR_FRAME("ServiceCalendarFrame"),
    @XmlEnumValue("ServiceFrame")
    SERVICE_FRAME("ServiceFrame"),
    @XmlEnumValue("SiteFrame")
    SITE_FRAME("SiteFrame"),
    @XmlEnumValue("TimetableFrame")
    TIMETABLE_FRAME("TimetableFrame"),
    @XmlEnumValue("VehicleScheduleFrame")
    VEHICLE_SCHEDULE_FRAME("VehicleScheduleFrame");
    private final String value;

    NameOfClassVersionFrameRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassVersionFrameRefStructureType fromValue(String v) {
        for (NameOfClassVersionFrameRefStructureType c: NameOfClassVersionFrameRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
