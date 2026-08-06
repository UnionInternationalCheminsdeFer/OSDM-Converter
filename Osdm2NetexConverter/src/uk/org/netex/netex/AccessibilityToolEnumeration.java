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
 * <p>Java-Klasse f�r AccessibilityToolEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessibilityToolEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="wheelchair"/>
 *     &lt;enumeration value="walkingstick"/>
 *     &lt;enumeration value="audioNavigator"/>
 *     &lt;enumeration value="visualNavigator"/>
 *     &lt;enumeration value="passengerCart"/>
 *     &lt;enumeration value="pushchair"/>
 *     &lt;enumeration value="umbrella"/>
 *     &lt;enumeration value="buggy"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessibilityToolEnumeration")
@XmlEnum
public enum AccessibilityToolEnumeration {

    @XmlEnumValue("wheelchair")
    WHEELCHAIR("wheelchair"),
    @XmlEnumValue("walkingstick")
    WALKINGSTICK("walkingstick"),
    @XmlEnumValue("audioNavigator")
    AUDIO_NAVIGATOR("audioNavigator"),
    @XmlEnumValue("visualNavigator")
    VISUAL_NAVIGATOR("visualNavigator"),
    @XmlEnumValue("passengerCart")
    PASSENGER_CART("passengerCart"),
    @XmlEnumValue("pushchair")
    PUSHCHAIR("pushchair"),
    @XmlEnumValue("umbrella")
    UMBRELLA("umbrella"),
    @XmlEnumValue("buggy")
    BUGGY("buggy"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AccessibilityToolEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessibilityToolEnumeration fromValue(String v) {
        for (AccessibilityToolEnumeration c: AccessibilityToolEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
