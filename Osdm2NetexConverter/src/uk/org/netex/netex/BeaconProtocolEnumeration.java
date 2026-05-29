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
 * <p>Java-Klasse f�r BeaconProtocolEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BeaconProtocolEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="iBeacon"/>
 *     &lt;enumeration value="Eddystone"/>
 *     &lt;enumeration value="VDV431"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BeaconProtocolEnumeration")
@XmlEnum
public enum BeaconProtocolEnumeration {


    /**
     * Apple beacon protocol
     * 
     */
    @XmlEnumValue("iBeacon")
    I_BEACON("iBeacon"),

    /**
     * Android beacons
     * 
     */
    @XmlEnumValue("Eddystone")
    EDDYSTONE("Eddystone"),

    /**
     * Usage of VDV 431
     * 
     */
    @XmlEnumValue("VDV431")
    VDV_431("VDV431");
    private final String value;

    BeaconProtocolEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BeaconProtocolEnumeration fromValue(String v) {
        for (BeaconProtocolEnumeration c: BeaconProtocolEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
