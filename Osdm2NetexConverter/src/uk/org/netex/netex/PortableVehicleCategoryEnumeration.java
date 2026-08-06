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
 * <p>Java-Klasse f�r PortableVehicleCategoryEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PortableVehicleCategoryEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="scooter"/>
 *     &lt;enumeration value="eScooter"/>
 *     &lt;enumeration value="cycle"/>
 *     &lt;enumeration value="pedalCycle"/>
 *     &lt;enumeration value="eCycle"/>
 *     &lt;enumeration value="cargoCycle"/>
 *     &lt;enumeration value="tricycle"/>
 *     &lt;enumeration value="tandem"/>
 *     &lt;enumeration value="moped"/>
 *     &lt;enumeration value="motorcycle"/>
 *     &lt;enumeration value="quadbike"/>
 *     &lt;enumeration value="car"/>
 *     &lt;enumeration value="microCar"/>
 *     &lt;enumeration value="miniCar"/>
 *     &lt;enumeration value="smallCar"/>
 *     &lt;enumeration value="mediumCar"/>
 *     &lt;enumeration value="largeCar"/>
 *     &lt;enumeration value="minivan"/>
 *     &lt;enumeration value="transporter"/>
 *     &lt;enumeration value="van"/>
 *     &lt;enumeration value="snowmobile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PortableVehicleCategoryEnumeration")
@XmlEnum
public enum PortableVehicleCategoryEnumeration {

    @XmlEnumValue("scooter")
    SCOOTER("scooter"),
    @XmlEnumValue("eScooter")
    E_SCOOTER("eScooter"),

    /**
     * All bicycles.
     * 
     */
    @XmlEnumValue("cycle")
    CYCLE("cycle"),

    /**
     * Non-motorised (without any kind of pedalling aid) cycle.
     * 
     */
    @XmlEnumValue("pedalCycle")
    PEDAL_CYCLE("pedalCycle"),

    /**
     * Electric cycle.
     * 
     */
    @XmlEnumValue("eCycle")
    E_CYCLE("eCycle"),

    /**
     * Cycle for cargo transportation. +v2.0
     * 
     */
    @XmlEnumValue("cargoCycle")
    CARGO_CYCLE("cargoCycle"),
    @XmlEnumValue("tricycle")
    TRICYCLE("tricycle"),
    @XmlEnumValue("tandem")
    TANDEM("tandem"),
    @XmlEnumValue("moped")
    MOPED("moped"),
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle"),
    @XmlEnumValue("quadbike")
    QUADBIKE("quadbike"),
    @XmlEnumValue("car")
    CAR("car"),
    @XmlEnumValue("microCar")
    MICRO_CAR("microCar"),
    @XmlEnumValue("miniCar")
    MINI_CAR("miniCar"),
    @XmlEnumValue("smallCar")
    SMALL_CAR("smallCar"),
    @XmlEnumValue("mediumCar")
    MEDIUM_CAR("mediumCar"),
    @XmlEnumValue("largeCar")
    LARGE_CAR("largeCar"),
    @XmlEnumValue("minivan")
    MINIVAN("minivan"),
    @XmlEnumValue("transporter")
    TRANSPORTER("transporter"),
    @XmlEnumValue("van")
    VAN("van"),
    @XmlEnumValue("snowmobile")
    SNOWMOBILE("snowmobile");
    private final String value;

    PortableVehicleCategoryEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PortableVehicleCategoryEnumeration fromValue(String v) {
        for (PortableVehicleCategoryEnumeration c: PortableVehicleCategoryEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
