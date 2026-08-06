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
 * <p>Java-Klasse f�r HireServiceEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HireServiceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="scooterHire"/>
 *     &lt;enumeration value="cycleHire"/>
 *     &lt;enumeration value="motorcycleHire"/>
 *     &lt;enumeration value="carHire"/>
 *     &lt;enumeration value="vehicleHire"/>
 *     &lt;enumeration value="boatHire"/>
 *     &lt;enumeration value="recreationalDeviceHire"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HireServiceEnumeration")
@XmlEnum
public enum HireServiceEnumeration {

    @XmlEnumValue("scooterHire")
    SCOOTER_HIRE("scooterHire"),
    @XmlEnumValue("cycleHire")
    CYCLE_HIRE("cycleHire"),
    @XmlEnumValue("motorcycleHire")
    MOTORCYCLE_HIRE("motorcycleHire"),
    @XmlEnumValue("carHire")
    CAR_HIRE("carHire"),
    @XmlEnumValue("vehicleHire")
    VEHICLE_HIRE("vehicleHire"),
    @XmlEnumValue("boatHire")
    BOAT_HIRE("boatHire"),
    @XmlEnumValue("recreationalDeviceHire")
    RECREATIONAL_DEVICE_HIRE("recreationalDeviceHire");
    private final String value;

    HireServiceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HireServiceEnumeration fromValue(String v) {
        for (HireServiceEnumeration c: HireServiceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
