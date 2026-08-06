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
 * <p>Java-Klasse f�r AssistanceFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AssistanceFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="personalAssistance"/>
 *     &lt;enumeration value="boardingAssistance"/>
 *     &lt;enumeration value="wheelchairAssistance"/>
 *     &lt;enumeration value="unaccompaniedMinorAssistance"/>
 *     &lt;enumeration value="wheelchairUse"/>
 *     &lt;enumeration value="conductor"/>
 *     &lt;enumeration value="information"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="any"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssistanceFacilityEnumeration")
@XmlEnum
public enum AssistanceFacilityEnumeration {

    @XmlEnumValue("personalAssistance")
    PERSONAL_ASSISTANCE("personalAssistance"),
    @XmlEnumValue("boardingAssistance")
    BOARDING_ASSISTANCE("boardingAssistance"),
    @XmlEnumValue("wheelchairAssistance")
    WHEELCHAIR_ASSISTANCE("wheelchairAssistance"),
    @XmlEnumValue("unaccompaniedMinorAssistance")
    UNACCOMPANIED_MINOR_ASSISTANCE("unaccompaniedMinorAssistance"),
    @XmlEnumValue("wheelchairUse")
    WHEELCHAIR_USE("wheelchairUse"),
    @XmlEnumValue("conductor")
    CONDUCTOR("conductor"),
    @XmlEnumValue("information")
    INFORMATION("information"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("any")
    ANY("any");
    private final String value;

    AssistanceFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssistanceFacilityEnumeration fromValue(String v) {
        for (AssistanceFacilityEnumeration c: AssistanceFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
