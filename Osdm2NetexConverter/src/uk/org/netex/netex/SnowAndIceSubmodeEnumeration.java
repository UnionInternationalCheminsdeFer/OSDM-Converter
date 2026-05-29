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
 * <p>Java-Klasse f�r SnowAndIceSubmodeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SnowAndIceSubmodeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="snowMobile"/>
 *     &lt;enumeration value="snowCat"/>
 *     &lt;enumeration value="snowCoach"/>
 *     &lt;enumeration value="terraBus"/>
 *     &lt;enumeration value="windSled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SnowAndIceSubmodeEnumeration")
@XmlEnum
public enum SnowAndIceSubmodeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("snowMobile")
    SNOW_MOBILE("snowMobile"),
    @XmlEnumValue("snowCat")
    SNOW_CAT("snowCat"),
    @XmlEnumValue("snowCoach")
    SNOW_COACH("snowCoach"),
    @XmlEnumValue("terraBus")
    TERRA_BUS("terraBus"),
    @XmlEnumValue("windSled")
    WIND_SLED("windSled");
    private final String value;

    SnowAndIceSubmodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SnowAndIceSubmodeEnumeration fromValue(String v) {
        for (SnowAndIceSubmodeEnumeration c: SnowAndIceSubmodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
