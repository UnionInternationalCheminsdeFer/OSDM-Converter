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
 * <p>Java-Klasse f�r LockerTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LockerTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="leftLuggageOffice"/>
 *     &lt;enumeration value="lockers"/>
 *     &lt;enumeration value="oversizeLockers"/>
 *     &lt;enumeration value="bikeRack"/>
 *     &lt;enumeration value="bikeCarriage"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LockerTypeEnumeration")
@XmlEnum
public enum LockerTypeEnumeration {

    @XmlEnumValue("leftLuggageOffice")
    LEFT_LUGGAGE_OFFICE("leftLuggageOffice"),
    @XmlEnumValue("lockers")
    LOCKERS("lockers"),
    @XmlEnumValue("oversizeLockers")
    OVERSIZE_LOCKERS("oversizeLockers"),
    @XmlEnumValue("bikeRack")
    BIKE_RACK("bikeRack"),
    @XmlEnumValue("bikeCarriage")
    BIKE_CARRIAGE("bikeCarriage"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LockerTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LockerTypeEnumeration fromValue(String v) {
        for (LockerTypeEnumeration c: LockerTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
