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
 * <p>Java-Klasse f�r ParkingLayoutEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingLayoutEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="covered"/>
 *     &lt;enumeration value="openSpace"/>
 *     &lt;enumeration value="multistorey"/>
 *     &lt;enumeration value="underground"/>
 *     &lt;enumeration value="roadside"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="onPavement"/>
 *     &lt;enumeration value="cycleHire"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingLayoutEnumeration")
@XmlEnum
public enum ParkingLayoutEnumeration {

    @XmlEnumValue("covered")
    COVERED("covered"),
    @XmlEnumValue("openSpace")
    OPEN_SPACE("openSpace"),
    @XmlEnumValue("multistorey")
    MULTISTOREY("multistorey"),
    @XmlEnumValue("underground")
    UNDERGROUND("underground"),
    @XmlEnumValue("roadside")
    ROADSIDE("roadside"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * Car park at ground level. +v1.2.2
     * 
     */
    @XmlEnumValue("onPavement")
    ON_PAVEMENT("onPavement"),

    /**
     * DEPRECATED - use onPavement instead. -v1.2.2
     * 
     */
    @XmlEnumValue("cycleHire")
    CYCLE_HIRE("cycleHire");
    private final String value;

    ParkingLayoutEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingLayoutEnumeration fromValue(String v) {
        for (ParkingLayoutEnumeration c: ParkingLayoutEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
