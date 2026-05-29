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
 * <p>Java-Klasse f�r HireFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HireFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="scooterHire"/>
 *     &lt;enumeration value="vehicleHire"/>
 *     &lt;enumeration value="carHire"/>
 *     &lt;enumeration value="motorCycleHire"/>
 *     &lt;enumeration value="cycleHire"/>
 *     &lt;enumeration value="taxi"/>
 *     &lt;enumeration value="boatHire"/>
 *     &lt;enumeration value="recreationDeviceHire"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HireFacilityEnumeration")
@XmlEnum
public enum HireFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("scooterHire")
    SCOOTER_HIRE("scooterHire"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("vehicleHire")
    VEHICLE_HIRE("vehicleHire"),
    @XmlEnumValue("carHire")
    CAR_HIRE("carHire"),
    @XmlEnumValue("motorCycleHire")
    MOTOR_CYCLE_HIRE("motorCycleHire"),
    @XmlEnumValue("cycleHire")
    CYCLE_HIRE("cycleHire"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("boatHire")
    BOAT_HIRE("boatHire"),
    @XmlEnumValue("recreationDeviceHire")
    RECREATION_DEVICE_HIRE("recreationDeviceHire"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    HireFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HireFacilityEnumeration fromValue(String v) {
        for (HireFacilityEnumeration c: HireFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
