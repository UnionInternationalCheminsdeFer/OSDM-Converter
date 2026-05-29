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
 * <p>Java-Klasse f�r ComponentOrientationEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ComponentOrientationEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="forwards"/>
 *     &lt;enumeration value="backwards"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="leftwards"/>
 *     &lt;enumeration value="rightwards"/>
 *     &lt;enumeration value="angledLeft"/>
 *     &lt;enumeration value="angledRight"/>
 *     &lt;enumeration value="angledBackLeft"/>
 *     &lt;enumeration value="angledBackRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComponentOrientationEnumeration")
@XmlEnum
public enum ComponentOrientationEnumeration {

    @XmlEnumValue("forwards")
    FORWARDS("forwards"),
    @XmlEnumValue("backwards")
    BACKWARDS("backwards"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("leftwards")
    LEFTWARDS("leftwards"),
    @XmlEnumValue("rightwards")
    RIGHTWARDS("rightwards"),
    @XmlEnumValue("angledLeft")
    ANGLED_LEFT("angledLeft"),
    @XmlEnumValue("angledRight")
    ANGLED_RIGHT("angledRight"),
    @XmlEnumValue("angledBackLeft")
    ANGLED_BACK_LEFT("angledBackLeft"),
    @XmlEnumValue("angledBackRight")
    ANGLED_BACK_RIGHT("angledBackRight");
    private final String value;

    ComponentOrientationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComponentOrientationEnumeration fromValue(String v) {
        for (ComponentOrientationEnumeration c: ComponentOrientationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
