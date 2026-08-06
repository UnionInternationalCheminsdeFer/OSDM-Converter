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
 * <p>Java-Klasse f�r AccessModeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessModeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="foot"/>
 *     &lt;enumeration value="bicycle"/>
 *     &lt;enumeration value="boat"/>
 *     &lt;enumeration value="car"/>
 *     &lt;enumeration value="taxi"/>
 *     &lt;enumeration value="shuttle"/>
 *     &lt;enumeration value="ski"/>
 *     &lt;enumeration value="skate"/>
 *     &lt;enumeration value="motorcycle"/>
 *     &lt;enumeration value="scooter"/>
 *     &lt;enumeration value="wheelchair"/>
 *     &lt;enumeration value="animalRide"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessModeEnumeration")
@XmlEnum
public enum AccessModeEnumeration {

    @XmlEnumValue("foot")
    FOOT("foot"),
    @XmlEnumValue("bicycle")
    BICYCLE("bicycle"),
    @XmlEnumValue("boat")
    BOAT("boat"),
    @XmlEnumValue("car")
    CAR("car"),

    /**
     * Taxi can now be modeled as VEHICLE MODE as well.
     * 
     */
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),
    @XmlEnumValue("ski")
    SKI("ski"),
    @XmlEnumValue("skate")
    SKATE("skate"),

    /**
     * +v2.0
     * 
     */
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle"),

    /**
     * +v2.0
     * 
     */
    @XmlEnumValue("scooter")
    SCOOTER("scooter"),

    /**
     * +v2.0
     * 
     */
    @XmlEnumValue("wheelchair")
    WHEELCHAIR("wheelchair"),

    /**
     * +v2.0
     * 
     */
    @XmlEnumValue("animalRide")
    ANIMAL_RIDE("animalRide");
    private final String value;

    AccessModeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessModeEnumeration fromValue(String v) {
        for (AccessModeEnumeration c: AccessModeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
