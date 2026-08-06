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
 * <p>Java-Klasse f�r SelfDriveSubmodeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SelfDriveSubmodeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="hireScooter"/>
 *     &lt;enumeration value="hireCycle"/>
 *     &lt;enumeration value="hireMotorbike"/>
 *     &lt;enumeration value="hireCar"/>
 *     &lt;enumeration value="hireVan"/>
 *     &lt;enumeration value="ownScooter"/>
 *     &lt;enumeration value="ownCycle"/>
 *     &lt;enumeration value="ownMotorbike"/>
 *     &lt;enumeration value="ownCar"/>
 *     &lt;enumeration value="ownVan"/>
 *     &lt;enumeration value="allHireVehicles"/>
 *     &lt;enumeration value="allVehicles"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SelfDriveSubmodeEnumeration")
@XmlEnum
public enum SelfDriveSubmodeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),

    /**
     * Rental scooter (small wheeled low platform vehicles - includes push scooters, electric scooters, skateboards, Segways, etc). +v1.2.2
     * 
     */
    @XmlEnumValue("hireScooter")
    HIRE_SCOOTER("hireScooter"),

    /**
     * Rental cycle (bicycle, tandem, tricycle, pedal or electric; use SimpleVehicleType / VehicleCategory to specify exact model. Includes pedal cycles, electric bikes, hybrids, etc). +v1.2.2
     * 
     */
    @XmlEnumValue("hireCycle")
    HIRE_CYCLE("hireCycle"),

    /**
     * Rental motorcycle (moped, velo, motorbike, quadbike, etc ; use SimpleVehicleType / VehicleCategory to specify exact model. +v1.2.2
     * 
     */
    @XmlEnumValue("hireMotorbike")
    HIRE_MOTORBIKE("hireMotorbike"),

    /**
     * Rental car - includes all sizes (small, mini, medium, large, etc.).
     * 
     */
    @XmlEnumValue("hireCar")
    HIRE_CAR("hireCar"),

    /**
     * Rental van - includes all categories of small to large minivan, minibus and transporter.
     * 
     */
    @XmlEnumValue("hireVan")
    HIRE_VAN("hireVan"),

    /**
     * Own scooter (small wheeled low platform vehicles - includes push scooters, electric scooters, skateboards, Segways, etc.). +v1.2.2
     * 
     */
    @XmlEnumValue("ownScooter")
    OWN_SCOOTER("ownScooter"),

    /**
     * Own cycle (bicycle, tandem, tricile, pedal or electric; use SimpleVehicleType / VehicleCategory to specify exact model. Includes push scooters, electric scooters, skateboards, Segways, etc.). +v1.2.2
     * 
     */
    @XmlEnumValue("ownCycle")
    OWN_CYCLE("ownCycle"),

    /**
     * Own motorcycle (moped, velo, motorbike, quadbike, etc.; use SimpleVehicleType / VehicleCategory to specify exact model. +v1.2.2
     * 
     */
    @XmlEnumValue("ownMotorbike")
    OWN_MOTORBIKE("ownMotorbike"),

    /**
     * Own car. Includes all sizes (small, mini, medium, large, etc.). +v1.2.2
     * 
     */
    @XmlEnumValue("ownCar")
    OWN_CAR("ownCar"),

    /**
     * Own van - includes all categories of small to large minivan, minibus and transporter. +v1.2.2
     * 
     */
    @XmlEnumValue("ownVan")
    OWN_VAN("ownVan"),
    @XmlEnumValue("allHireVehicles")
    ALL_HIRE_VEHICLES("allHireVehicles"),

    /**
     * Hire and own vehicles. +v1.2.2
     * 
     */
    @XmlEnumValue("allVehicles")
    ALL_VEHICLES("allVehicles");
    private final String value;

    SelfDriveSubmodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelfDriveSubmodeEnumeration fromValue(String v) {
        for (SelfDriveSubmodeEnumeration c: SelfDriveSubmodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
