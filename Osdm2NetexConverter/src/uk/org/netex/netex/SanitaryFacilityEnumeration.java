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
 * <p>Java-Klasse f�r SanitaryFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SanitaryFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="toilet"/>
 *     &lt;enumeration value="washbasin"/>
 *     &lt;enumeration value="wheelchairAccessToilet"/>
 *     &lt;enumeration value="shower"/>
 *     &lt;enumeration value="washingAndChangeFacilities"/>
 *     &lt;enumeration value="babyChange"/>
 *     &lt;enumeration value="wheelchairBabyChange"/>
 *     &lt;enumeration value="shoeShiner"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SanitaryFacilityEnumeration")
@XmlEnum
public enum SanitaryFacilityEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("toilet")
    TOILET("toilet"),
    @XmlEnumValue("washbasin")
    WASHBASIN("washbasin"),
    @XmlEnumValue("wheelchairAccessToilet")
    WHEELCHAIR_ACCESS_TOILET("wheelchairAccessToilet"),
    @XmlEnumValue("shower")
    SHOWER("shower"),
    @XmlEnumValue("washingAndChangeFacilities")
    WASHING_AND_CHANGE_FACILITIES("washingAndChangeFacilities"),
    @XmlEnumValue("babyChange")
    BABY_CHANGE("babyChange"),
    @XmlEnumValue("wheelchairBabyChange")
    WHEELCHAIR_BABY_CHANGE("wheelchairBabyChange"),
    @XmlEnumValue("shoeShiner")
    SHOE_SHINER("shoeShiner"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SanitaryFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SanitaryFacilityEnumeration fromValue(String v) {
        for (SanitaryFacilityEnumeration c: SanitaryFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
