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
 * <p>Java-Klasse f�r CarServiceFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CarServiceFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="valetParking"/>
 *     &lt;enumeration value="carWash"/>
 *     &lt;enumeration value="valetCarWash"/>
 *     &lt;enumeration value="carValetClean"/>
 *     &lt;enumeration value="oilChange"/>
 *     &lt;enumeration value="engineWarming"/>
 *     &lt;enumeration value="petrol"/>
 *     &lt;enumeration value="batteryCare"/>
 *     &lt;enumeration value="recharging"/>
 *     &lt;enumeration value="tyreCheck"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarServiceFacilityEnumeration")
@XmlEnum
public enum CarServiceFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("valetParking")
    VALET_PARKING("valetParking"),
    @XmlEnumValue("carWash")
    CAR_WASH("carWash"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("valetCarWash")
    VALET_CAR_WASH("valetCarWash"),
    @XmlEnumValue("carValetClean")
    CAR_VALET_CLEAN("carValetClean"),
    @XmlEnumValue("oilChange")
    OIL_CHANGE("oilChange"),
    @XmlEnumValue("engineWarming")
    ENGINE_WARMING("engineWarming"),
    @XmlEnumValue("petrol")
    PETROL("petrol"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("batteryCare")
    BATTERY_CARE("batteryCare"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("recharging")
    RECHARGING("recharging"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("tyreCheck")
    TYRE_CHECK("tyreCheck"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CarServiceFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarServiceFacilityEnumeration fromValue(String v) {
        for (CarServiceFacilityEnumeration c: CarServiceFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
