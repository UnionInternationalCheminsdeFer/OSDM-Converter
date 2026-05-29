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
 * <p>Java-Klasse f�r NameOfClassJourneyRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassJourneyRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLinkSequenceRefStructureType">
 *     &lt;enumeration value="DatedServiceJourney"/>
 *     &lt;enumeration value="DatedSpecialService"/>
 *     &lt;enumeration value="DatedVehicleJourney"/>
 *     &lt;enumeration value="DeadRun"/>
 *     &lt;enumeration value="NormalDatedVehicleJourney"/>
 *     &lt;enumeration value="ServiceJourney"/>
 *     &lt;enumeration value="SingleJourney"/>
 *     &lt;enumeration value="SpecialService"/>
 *     &lt;enumeration value="TemplateServiceJourney"/>
 *     &lt;enumeration value="TemplateVehicleJourney"/>
 *     &lt;enumeration value="VehicleJourney"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassJourneyRefStructureType")
@XmlEnum(NameOfClassLinkSequenceRefStructureType.class)
public enum NameOfClassJourneyRefStructureType {

    @XmlEnumValue("DatedServiceJourney")
    DATED_SERVICE_JOURNEY(NameOfClassLinkSequenceRefStructureType.DATED_SERVICE_JOURNEY),
    @XmlEnumValue("DatedSpecialService")
    DATED_SPECIAL_SERVICE(NameOfClassLinkSequenceRefStructureType.DATED_SPECIAL_SERVICE),
    @XmlEnumValue("DatedVehicleJourney")
    DATED_VEHICLE_JOURNEY(NameOfClassLinkSequenceRefStructureType.DATED_VEHICLE_JOURNEY),
    @XmlEnumValue("DeadRun")
    DEAD_RUN(NameOfClassLinkSequenceRefStructureType.DEAD_RUN),
    @XmlEnumValue("NormalDatedVehicleJourney")
    NORMAL_DATED_VEHICLE_JOURNEY(NameOfClassLinkSequenceRefStructureType.NORMAL_DATED_VEHICLE_JOURNEY),
    @XmlEnumValue("ServiceJourney")
    SERVICE_JOURNEY(NameOfClassLinkSequenceRefStructureType.SERVICE_JOURNEY),
    @XmlEnumValue("SingleJourney")
    SINGLE_JOURNEY(NameOfClassLinkSequenceRefStructureType.SINGLE_JOURNEY),
    @XmlEnumValue("SpecialService")
    SPECIAL_SERVICE(NameOfClassLinkSequenceRefStructureType.SPECIAL_SERVICE),
    @XmlEnumValue("TemplateServiceJourney")
    TEMPLATE_SERVICE_JOURNEY(NameOfClassLinkSequenceRefStructureType.TEMPLATE_SERVICE_JOURNEY),
    @XmlEnumValue("TemplateVehicleJourney")
    TEMPLATE_VEHICLE_JOURNEY(NameOfClassLinkSequenceRefStructureType.TEMPLATE_VEHICLE_JOURNEY),
    @XmlEnumValue("VehicleJourney")
    VEHICLE_JOURNEY(NameOfClassLinkSequenceRefStructureType.VEHICLE_JOURNEY);
    private final NameOfClassLinkSequenceRefStructureType value;

    NameOfClassJourneyRefStructureType(NameOfClassLinkSequenceRefStructureType v) {
        value = v;
    }

    public NameOfClassLinkSequenceRefStructureType value() {
        return value;
    }

    public static NameOfClassJourneyRefStructureType fromValue(NameOfClassLinkSequenceRefStructureType v) {
        for (NameOfClassJourneyRefStructureType c: NameOfClassJourneyRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
