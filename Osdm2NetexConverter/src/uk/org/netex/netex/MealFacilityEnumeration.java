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
 * <p>Java-Klasse f�r MealFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MealFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="breakfast"/>
 *     &lt;enumeration value="lunch"/>
 *     &lt;enumeration value="dinner"/>
 *     &lt;enumeration value="snack"/>
 *     &lt;enumeration value="drinks"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MealFacilityEnumeration")
@XmlEnum
public enum MealFacilityEnumeration {

    @XmlEnumValue("breakfast")
    BREAKFAST("breakfast"),
    @XmlEnumValue("lunch")
    LUNCH("lunch"),
    @XmlEnumValue("dinner")
    DINNER("dinner"),
    @XmlEnumValue("snack")
    SNACK("snack"),
    @XmlEnumValue("drinks")
    DRINKS("drinks");
    private final String value;

    MealFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MealFacilityEnumeration fromValue(String v) {
        for (MealFacilityEnumeration c: MealFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
