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
 * <p>Java-Klasse f�r AccessibilityInfoFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessibilityInfoFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="audioInformation"/>
 *     &lt;enumeration value="audioForHearingImpaired"/>
 *     &lt;enumeration value="visualDisplays"/>
 *     &lt;enumeration value="displaysForVisuallyImpaired"/>
 *     &lt;enumeration value="largePrintTimetables"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessibilityInfoFacilityEnumeration")
@XmlEnum
public enum AccessibilityInfoFacilityEnumeration {

    @XmlEnumValue("audioInformation")
    AUDIO_INFORMATION("audioInformation"),
    @XmlEnumValue("audioForHearingImpaired")
    AUDIO_FOR_HEARING_IMPAIRED("audioForHearingImpaired"),
    @XmlEnumValue("visualDisplays")
    VISUAL_DISPLAYS("visualDisplays"),
    @XmlEnumValue("displaysForVisuallyImpaired")
    DISPLAYS_FOR_VISUALLY_IMPAIRED("displaysForVisuallyImpaired"),
    @XmlEnumValue("largePrintTimetables")
    LARGE_PRINT_TIMETABLES("largePrintTimetables"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AccessibilityInfoFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessibilityInfoFacilityEnumeration fromValue(String v) {
        for (AccessibilityInfoFacilityEnumeration c: AccessibilityInfoFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
