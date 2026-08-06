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
 * <p>Java-Klasse f�r BeaconDirectionEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BeaconDirectionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unidirectional"/>
 *     &lt;enumeration value="bidirectional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BeaconDirectionEnumeration")
@XmlEnum
public enum BeaconDirectionEnumeration {


    /**
     * Normal unidirectional beacon. Usually a backend is then mandatory.
     * 
     */
    @XmlEnumValue("unidirectional")
    UNIDIRECTIONAL("unidirectional"),

    /**
     * The beacon is able to do bidirectional transmissions.
     * 
     */
    @XmlEnumValue("bidirectional")
    BIDIRECTIONAL("bidirectional");
    private final String value;

    BeaconDirectionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BeaconDirectionEnumeration fromValue(String v) {
        for (BeaconDirectionEnumeration c: BeaconDirectionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
