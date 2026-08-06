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
 * <p>Java-Klasse f�r SafetyFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SafetyFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="ccTv"/>
 *     &lt;enumeration value="mobileCoverage"/>
 *     &lt;enumeration value="sosPoints"/>
 *     &lt;enumeration value="staffed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SafetyFacilityEnumeration")
@XmlEnum
public enum SafetyFacilityEnumeration {

    @XmlEnumValue("ccTv")
    CC_TV("ccTv"),
    @XmlEnumValue("mobileCoverage")
    MOBILE_COVERAGE("mobileCoverage"),
    @XmlEnumValue("sosPoints")
    SOS_POINTS("sosPoints"),
    @XmlEnumValue("staffed")
    STAFFED("staffed");
    private final String value;

    SafetyFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SafetyFacilityEnumeration fromValue(String v) {
        for (SafetyFacilityEnumeration c: SafetyFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
