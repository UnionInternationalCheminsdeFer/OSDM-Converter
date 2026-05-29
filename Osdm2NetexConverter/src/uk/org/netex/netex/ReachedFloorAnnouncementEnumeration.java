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
 * <p>Java-Klasse f�r ReachedFloorAnnouncementEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ReachedFloorAnnouncementEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="visual"/>
 *     &lt;enumeration value="tactile"/>
 *     &lt;enumeration value="audio"/>
 *     &lt;enumeration value="visualAndAudio"/>
 *     &lt;enumeration value="visualAndAudioAndTactile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReachedFloorAnnouncementEnumeration")
@XmlEnum
public enum ReachedFloorAnnouncementEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("visual")
    VISUAL("visual"),
    @XmlEnumValue("tactile")
    TACTILE("tactile"),
    @XmlEnumValue("audio")
    AUDIO("audio"),
    @XmlEnumValue("visualAndAudio")
    VISUAL_AND_AUDIO("visualAndAudio"),
    @XmlEnumValue("visualAndAudioAndTactile")
    VISUAL_AND_AUDIO_AND_TACTILE("visualAndAudioAndTactile");
    private final String value;

    ReachedFloorAnnouncementEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReachedFloorAnnouncementEnumeration fromValue(String v) {
        for (ReachedFloorAnnouncementEnumeration c: ReachedFloorAnnouncementEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
