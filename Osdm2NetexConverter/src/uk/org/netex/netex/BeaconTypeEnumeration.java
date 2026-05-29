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
 * <p>Java-Klasse f�r BeaconTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BeaconTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="ble"/>
 *     &lt;enumeration value="uwb"/>
 *     &lt;enumeration value="wifi"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BeaconTypeEnumeration")
@XmlEnum
public enum BeaconTypeEnumeration {


    /**
     * bluetooth low energy
     * 
     */
    @XmlEnumValue("ble")
    BLE("ble"),

    /**
     * ultra wide band
     * 
     */
    @XmlEnumValue("uwb")
    UWB("uwb"),

    /**
     * In some cases the beacon is a wifi hot spot.
     * 
     */
    @XmlEnumValue("wifi")
    WIFI("wifi");
    private final String value;

    BeaconTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BeaconTypeEnumeration fromValue(String v) {
        for (BeaconTypeEnumeration c: BeaconTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
