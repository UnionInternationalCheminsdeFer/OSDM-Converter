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
 * <p>Java-Klasse f�r StopUseEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StopUseEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="access"/>
 *     &lt;enumeration value="interchangeOnly"/>
 *     &lt;enumeration value="passthrough"/>
 *     &lt;enumeration value="noBoardingOrAlighting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StopUseEnumeration")
@XmlEnum
public enum StopUseEnumeration {


    /**
     * Stop may be used to access transport system.
     * 
     */
    @XmlEnumValue("access")
    ACCESS("access"),

    /**
     * Stop may only be used for interchange. Passengers may not enter or exit the station.
     * 
     */
    @XmlEnumValue("interchangeOnly")
    INTERCHANGE_ONLY("interchangeOnly"),

    /**
     * Vehicle passes through without stopping.
     * 
     */
    @XmlEnumValue("passthrough")
    PASSTHROUGH("passthrough"),
    @XmlEnumValue("noBoardingOrAlighting")
    NO_BOARDING_OR_ALIGHTING("noBoardingOrAlighting");
    private final String value;

    StopUseEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopUseEnumeration fromValue(String v) {
        for (StopUseEnumeration c: StopUseEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
