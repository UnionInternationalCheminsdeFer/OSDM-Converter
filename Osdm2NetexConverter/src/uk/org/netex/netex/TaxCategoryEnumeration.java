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
 * <p>Java-Klasse f�r TaxCategoryEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxCategoryEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="exempt"/>
 *     &lt;enumeration value="general"/>
 *     &lt;enumeration value="transportation"/>
 *     &lt;enumeration value="parking"/>
 *     &lt;enumeration value="food"/>
 *     &lt;enumeration value="alcoholicBeverage"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxCategoryEnumeration")
@XmlEnum
public enum TaxCategoryEnumeration {

    @XmlEnumValue("exempt")
    EXEMPT("exempt"),
    @XmlEnumValue("general")
    GENERAL("general"),
    @XmlEnumValue("transportation")
    TRANSPORTATION("transportation"),
    @XmlEnumValue("parking")
    PARKING("parking"),
    @XmlEnumValue("food")
    FOOD("food"),
    @XmlEnumValue("alcoholicBeverage")
    ALCOHOLIC_BEVERAGE("alcoholicBeverage"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TaxCategoryEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxCategoryEnumeration fromValue(String v) {
        for (TaxCategoryEnumeration c: TaxCategoryEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
