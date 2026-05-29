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
 * <p>Java-Klasse f�r RelationToVehicleEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationToVehicleEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="frontLeft"/>
 *     &lt;enumeration value="frontRight"/>
 *     &lt;enumeration value="backRight"/>
 *     &lt;enumeration value="driverLeft"/>
 *     &lt;enumeration value="driverRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelationToVehicleEnumeration")
@XmlEnum
public enum RelationToVehicleEnumeration {

    @XmlEnumValue("frontLeft")
    FRONT_LEFT("frontLeft"),
    @XmlEnumValue("frontRight")
    FRONT_RIGHT("frontRight"),
    @XmlEnumValue("backRight")
    BACK_RIGHT("backRight"),
    @XmlEnumValue("driverLeft")
    DRIVER_LEFT("driverLeft"),
    @XmlEnumValue("driverRight")
    DRIVER_RIGHT("driverRight");
    private final String value;

    RelationToVehicleEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationToVehicleEnumeration fromValue(String v) {
        for (RelationToVehicleEnumeration c: RelationToVehicleEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
