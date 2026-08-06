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
 * <p>Java-Klasse f�r AudioTriggerMethodEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AudioTriggerMethodEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="presenceDetector"/>
 *     &lt;enumeration value="mobileApp"/>
 *     &lt;enumeration value="internetPage"/>
 *     &lt;enumeration value="specificDevice"/>
 *     &lt;enumeration value="pushButton"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudioTriggerMethodEnumeration")
@XmlEnum
public enum AudioTriggerMethodEnumeration {

    @XmlEnumValue("presenceDetector")
    PRESENCE_DETECTOR("presenceDetector"),
    @XmlEnumValue("mobileApp")
    MOBILE_APP("mobileApp"),
    @XmlEnumValue("internetPage")
    INTERNET_PAGE("internetPage"),
    @XmlEnumValue("specificDevice")
    SPECIFIC_DEVICE("specificDevice"),
    @XmlEnumValue("pushButton")
    PUSH_BUTTON("pushButton"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AudioTriggerMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudioTriggerMethodEnumeration fromValue(String v) {
        for (AudioTriggerMethodEnumeration c: AudioTriggerMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
