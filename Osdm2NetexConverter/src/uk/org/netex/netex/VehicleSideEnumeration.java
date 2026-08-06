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
 * <p>Java-Klasse f�r VehicleSideEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleSideEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="leftSide"/>
 *     &lt;enumeration value="rightSide"/>
 *     &lt;enumeration value="frontEnd"/>
 *     &lt;enumeration value="backEnd"/>
 *     &lt;enumeration value="internal"/>
 *     &lt;enumeration value="above"/>
 *     &lt;enumeration value="below"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleSideEnumeration")
@XmlEnum
public enum VehicleSideEnumeration {


    /**
     * Entrance is on left side of VEHICLE.
     * 
     */
    @XmlEnumValue("leftSide")
    LEFT_SIDE("leftSide"),

    /**
     * Entrance is on right side of VEHICLE.
     * 
     */
    @XmlEnumValue("rightSide")
    RIGHT_SIDE("rightSide"),

    /**
     * Entrance is on front end of VEHICLE.
     * 
     */
    @XmlEnumValue("frontEnd")
    FRONT_END("frontEnd"),

    /**
     * Entrance is on back end of VEHICLE.
     * 
     */
    @XmlEnumValue("backEnd")
    BACK_END("backEnd"),

    /**
     * Entrance is interior to VEHICLE.
     * 
     */
    @XmlEnumValue("internal")
    INTERNAL("internal"),

    /**
     * Entrance is above VEHICLE.
     * 
     */
    @XmlEnumValue("above")
    ABOVE("above"),

    /**
     * Entrance is below VEHICLE.
     * 
     */
    @XmlEnumValue("below")
    BELOW("below");
    private final String value;

    VehicleSideEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleSideEnumeration fromValue(String v) {
        for (VehicleSideEnumeration c: VehicleSideEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
