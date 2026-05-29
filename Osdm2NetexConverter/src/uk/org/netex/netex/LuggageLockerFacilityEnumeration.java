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
 * <p>Java-Klasse f�r LuggageLockerFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LuggageLockerFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="lockers"/>
 *     &lt;enumeration value="oversizeLockers"/>
 *     &lt;enumeration value="leftLuggageCounter"/>
 *     &lt;enumeration value="bikeRack"/>
 *     &lt;enumeration value="cloakroom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LuggageLockerFacilityEnumeration")
@XmlEnum
public enum LuggageLockerFacilityEnumeration {

    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * pti23_17
     * 
     */
    @XmlEnumValue("lockers")
    LOCKERS("lockers"),
    @XmlEnumValue("oversizeLockers")
    OVERSIZE_LOCKERS("oversizeLockers"),
    @XmlEnumValue("leftLuggageCounter")
    LEFT_LUGGAGE_COUNTER("leftLuggageCounter"),
    @XmlEnumValue("bikeRack")
    BIKE_RACK("bikeRack"),
    @XmlEnumValue("cloakroom")
    CLOAKROOM("cloakroom");
    private final String value;

    LuggageLockerFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuggageLockerFacilityEnumeration fromValue(String v) {
        for (LuggageLockerFacilityEnumeration c: LuggageLockerFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
