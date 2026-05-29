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
 * <p>Java-Klasse f�r TimingPointStatusEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TimingPointStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="timingPoint"/>
 *     &lt;enumeration value="secondaryTimingPoint"/>
 *     &lt;enumeration value="notTimingPoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimingPointStatusEnumeration")
@XmlEnum
public enum TimingPointStatusEnumeration {

    @XmlEnumValue("timingPoint")
    TIMING_POINT("timingPoint"),
    @XmlEnumValue("secondaryTimingPoint")
    SECONDARY_TIMING_POINT("secondaryTimingPoint"),
    @XmlEnumValue("notTimingPoint")
    NOT_TIMING_POINT("notTimingPoint");
    private final String value;

    TimingPointStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimingPointStatusEnumeration fromValue(String v) {
        for (TimingPointStatusEnumeration c: TimingPointStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
