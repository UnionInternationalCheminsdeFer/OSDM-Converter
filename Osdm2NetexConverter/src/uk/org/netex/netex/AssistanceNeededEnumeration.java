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
 * <p>Java-Klasse f�r AssistanceNeededEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AssistanceNeededEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="levelAccess"/>
 *     &lt;enumeration value="stepNegotiation"/>
 *     &lt;enumeration value="rampRequired"/>
 *     &lt;enumeration value="hoistRequired"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssistanceNeededEnumeration")
@XmlEnum
public enum AssistanceNeededEnumeration {

    @XmlEnumValue("levelAccess")
    LEVEL_ACCESS("levelAccess"),
    @XmlEnumValue("stepNegotiation")
    STEP_NEGOTIATION("stepNegotiation"),
    @XmlEnumValue("rampRequired")
    RAMP_REQUIRED("rampRequired"),
    @XmlEnumValue("hoistRequired")
    HOIST_REQUIRED("hoistRequired"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    AssistanceNeededEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssistanceNeededEnumeration fromValue(String v) {
        for (AssistanceNeededEnumeration c: AssistanceNeededEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
