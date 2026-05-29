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
 * <p>Java-Klasse f�r StairRampEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StairRampEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="bicycle"/>
 *     &lt;enumeration value="luggage"/>
 *     &lt;enumeration value="stroller"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StairRampEnumeration")
@XmlEnum
public enum StairRampEnumeration {

    @XmlEnumValue("none")
    NONE("none"),

    /**
     * A narrow ramp on the side, designed to push a bicycle.
     * 
     */
    @XmlEnumValue("bicycle")
    BICYCLE("bicycle"),

    /**
     * A ramp on the side, designed to roll a suitcase.
     * 
     */
    @XmlEnumValue("luggage")
    LUGGAGE("luggage"),

    /**
     * A pair of ramps with steps in between, intended for pushing a stroller.
     * 
     */
    @XmlEnumValue("stroller")
    STROLLER("stroller"),

    /**
     * Another type of handrail included in the staircase itself.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    StairRampEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StairRampEnumeration fromValue(String v) {
        for (StairRampEnumeration c: StairRampEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
