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
 * <p>Java-Klasse f�r SpotAvailabilityStatusEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SpotAvailabilityStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="free"/>
 *     &lt;enumeration value="held"/>
 *     &lt;enumeration value="expiredHeld"/>
 *     &lt;enumeration value="reserved"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpotAvailabilityStatusEnumeration")
@XmlEnum
public enum SpotAvailabilityStatusEnumeration {


    /**
     * Spot is available.
     * 
     */
    @XmlEnumValue("free")
    FREE("free"),

    /**
     * Spot is temporarily held.
     * 
     */
    @XmlEnumValue("held")
    HELD("held"),
    @XmlEnumValue("expiredHeld")
    EXPIRED_HELD("expiredHeld"),

    /**
     * Spot is resreved.
     * 
     */
    @XmlEnumValue("reserved")
    RESERVED("reserved"),

    /**
     * Temporarily disabled.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SpotAvailabilityStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpotAvailabilityStatusEnumeration fromValue(String v) {
        for (SpotAvailabilityStatusEnumeration c: SpotAvailabilityStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
