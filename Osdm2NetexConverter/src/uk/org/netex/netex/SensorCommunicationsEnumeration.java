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
 * <p>Java-Klasse f�r SensorCommunicationsEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SensorCommunicationsEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="cable"/>
 *     &lt;enumeration value="wifi"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SensorCommunicationsEnumeration")
@XmlEnum
public enum SensorCommunicationsEnumeration {

    @XmlEnumValue("cable")
    CABLE("cable"),
    @XmlEnumValue("wifi")
    WIFI("wifi"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SensorCommunicationsEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SensorCommunicationsEnumeration fromValue(String v) {
        for (SensorCommunicationsEnumeration c: SensorCommunicationsEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
