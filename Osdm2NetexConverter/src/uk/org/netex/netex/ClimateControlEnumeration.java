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
 * <p>Java-Klasse f�r ClimateControlEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ClimateControlEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="airConditioning"/>
 *     &lt;enumeration value="heating"/>
 *     &lt;enumeration value="noConditioning"/>
 *     &lt;enumeration value="windowsCanBeOpened"/>
 *     &lt;enumeration value="sealedWindows"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClimateControlEnumeration")
@XmlEnum
public enum ClimateControlEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("airConditioning")
    AIR_CONDITIONING("airConditioning"),
    @XmlEnumValue("heating")
    HEATING("heating"),
    @XmlEnumValue("noConditioning")
    NO_CONDITIONING("noConditioning"),
    @XmlEnumValue("windowsCanBeOpened")
    WINDOWS_CAN_BE_OPENED("windowsCanBeOpened"),
    @XmlEnumValue("sealedWindows")
    SEALED_WINDOWS("sealedWindows"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ClimateControlEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClimateControlEnumeration fromValue(String v) {
        for (ClimateControlEnumeration c: ClimateControlEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
