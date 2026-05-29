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
 * <p>Java-Klasse f�r CateringRightsEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CateringRightsEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="mealIncluded"/>
 *     &lt;enumeration value="mealIncludedForFirstClassPassengers"/>
 *     &lt;enumeration value="noMealIncluded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CateringRightsEnumeration")
@XmlEnum
public enum CateringRightsEnumeration {

    @XmlEnumValue("mealIncluded")
    MEAL_INCLUDED("mealIncluded"),
    @XmlEnumValue("mealIncludedForFirstClassPassengers")
    MEAL_INCLUDED_FOR_FIRST_CLASS_PASSENGERS("mealIncludedForFirstClassPassengers"),
    @XmlEnumValue("noMealIncluded")
    NO_MEAL_INCLUDED("noMealIncluded");
    private final String value;

    CateringRightsEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CateringRightsEnumeration fromValue(String v) {
        for (CateringRightsEnumeration c: CateringRightsEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
