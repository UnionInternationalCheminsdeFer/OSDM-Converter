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
 * <p>Java-Klasse f�r PsychosensoryNeedEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PsychosensoryNeedEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="visualImpairment"/>
 *     &lt;enumeration value="auditoryImpairment"/>
 *     &lt;enumeration value="cognitiveInputImpairment"/>
 *     &lt;enumeration value="averseToLifts"/>
 *     &lt;enumeration value="averseToEscalators"/>
 *     &lt;enumeration value="averseToConfinedSpaces"/>
 *     &lt;enumeration value="averseToCrowds"/>
 *     &lt;enumeration value="otherPsychosensoryNeed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PsychosensoryNeedEnumeration")
@XmlEnum
public enum PsychosensoryNeedEnumeration {

    @XmlEnumValue("visualImpairment")
    VISUAL_IMPAIRMENT("visualImpairment"),
    @XmlEnumValue("auditoryImpairment")
    AUDITORY_IMPAIRMENT("auditoryImpairment"),
    @XmlEnumValue("cognitiveInputImpairment")
    COGNITIVE_INPUT_IMPAIRMENT("cognitiveInputImpairment"),
    @XmlEnumValue("averseToLifts")
    AVERSE_TO_LIFTS("averseToLifts"),
    @XmlEnumValue("averseToEscalators")
    AVERSE_TO_ESCALATORS("averseToEscalators"),
    @XmlEnumValue("averseToConfinedSpaces")
    AVERSE_TO_CONFINED_SPACES("averseToConfinedSpaces"),
    @XmlEnumValue("averseToCrowds")
    AVERSE_TO_CROWDS("averseToCrowds"),
    @XmlEnumValue("otherPsychosensoryNeed")
    OTHER_PSYCHOSENSORY_NEED("otherPsychosensoryNeed");
    private final String value;

    PsychosensoryNeedEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PsychosensoryNeedEnumeration fromValue(String v) {
        for (PsychosensoryNeedEnumeration c: PsychosensoryNeedEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
