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
 * <p>Java-Klasse f�r NameOfClassVehicleJourneyRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleJourneyRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassJourneyRefStructureType">
 *     &lt;enumeration value="DatedVehicleJourney"/>
 *     &lt;enumeration value="DeadRun"/>
 *     &lt;enumeration value="NormalDatedVehicleJourney"/>
 *     &lt;enumeration value="VehicleJourney"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleJourneyRefStructureType")
@XmlEnum(NameOfClassJourneyRefStructureType.class)
public enum NameOfClassVehicleJourneyRefStructureType {

    @XmlEnumValue("DatedVehicleJourney")
    DATED_VEHICLE_JOURNEY(NameOfClassJourneyRefStructureType.DATED_VEHICLE_JOURNEY),
    @XmlEnumValue("DeadRun")
    DEAD_RUN(NameOfClassJourneyRefStructureType.DEAD_RUN),
    @XmlEnumValue("NormalDatedVehicleJourney")
    NORMAL_DATED_VEHICLE_JOURNEY(NameOfClassJourneyRefStructureType.NORMAL_DATED_VEHICLE_JOURNEY),
    @XmlEnumValue("VehicleJourney")
    VEHICLE_JOURNEY(NameOfClassJourneyRefStructureType.VEHICLE_JOURNEY);
    private final NameOfClassJourneyRefStructureType value;

    NameOfClassVehicleJourneyRefStructureType(NameOfClassJourneyRefStructureType v) {
        value = v;
    }

    public NameOfClassJourneyRefStructureType value() {
        return value;
    }

    public static NameOfClassVehicleJourneyRefStructureType fromValue(NameOfClassJourneyRefStructureType v) {
        for (NameOfClassVehicleJourneyRefStructureType c: NameOfClassVehicleJourneyRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
