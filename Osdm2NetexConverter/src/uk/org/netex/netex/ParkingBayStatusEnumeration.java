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
 * <p>Java-Klasse f�r ParkingBayStatusEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingBayStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="available"/>
 *     &lt;enumeration value="inUse"/>
 *     &lt;enumeration value="outOfService"/>
 *     &lt;enumeration value="reserved"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingBayStatusEnumeration")
@XmlEnum
public enum ParkingBayStatusEnumeration {

    @XmlEnumValue("available")
    AVAILABLE("available"),
    @XmlEnumValue("inUse")
    IN_USE("inUse"),
    @XmlEnumValue("outOfService")
    OUT_OF_SERVICE("outOfService"),
    @XmlEnumValue("reserved")
    RESERVED("reserved"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ParkingBayStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingBayStatusEnumeration fromValue(String v) {
        for (ParkingBayStatusEnumeration c: ParkingBayStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
