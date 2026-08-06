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
 * <p>Java-Klasse f�r FareDemandTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FareDemandTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="peak"/>
 *     &lt;enumeration value="middle"/>
 *     &lt;enumeration value="offPeak"/>
 *     &lt;enumeration value="superOffPeak"/>
 *     &lt;enumeration value="night"/>
 *     &lt;enumeration value="specialEvent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareDemandTypeEnumeration")
@XmlEnum
public enum FareDemandTypeEnumeration {

    @XmlEnumValue("peak")
    PEAK("peak"),
    @XmlEnumValue("middle")
    MIDDLE("middle"),
    @XmlEnumValue("offPeak")
    OFF_PEAK("offPeak"),
    @XmlEnumValue("superOffPeak")
    SUPER_OFF_PEAK("superOffPeak"),
    @XmlEnumValue("night")
    NIGHT("night"),
    @XmlEnumValue("specialEvent")
    SPECIAL_EVENT("specialEvent");
    private final String value;

    FareDemandTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareDemandTypeEnumeration fromValue(String v) {
        for (FareDemandTypeEnumeration c: FareDemandTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
