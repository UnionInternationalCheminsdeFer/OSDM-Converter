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
 * <p>Java-Klasse f�r CateringServiceEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CateringServiceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bar"/>
 *     &lt;enumeration value="beverageVendingMachine"/>
 *     &lt;enumeration value="buffet"/>
 *     &lt;enumeration value="coffeeShop"/>
 *     &lt;enumeration value="firstClassRestaurant"/>
 *     &lt;enumeration value="foodVendingMachine"/>
 *     &lt;enumeration value="hotFoodService"/>
 *     &lt;enumeration value="restaurant"/>
 *     &lt;enumeration value="snacks"/>
 *     &lt;enumeration value="trolleyService"/>
 *     &lt;enumeration value="noBeveragesAvailable"/>
 *     &lt;enumeration value="noFoodServiceAvailable"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CateringServiceEnumeration")
@XmlEnum
public enum CateringServiceEnumeration {

    @XmlEnumValue("bar")
    BAR("bar"),
    @XmlEnumValue("beverageVendingMachine")
    BEVERAGE_VENDING_MACHINE("beverageVendingMachine"),
    @XmlEnumValue("buffet")
    BUFFET("buffet"),
    @XmlEnumValue("coffeeShop")
    COFFEE_SHOP("coffeeShop"),
    @XmlEnumValue("firstClassRestaurant")
    FIRST_CLASS_RESTAURANT("firstClassRestaurant"),
    @XmlEnumValue("foodVendingMachine")
    FOOD_VENDING_MACHINE("foodVendingMachine"),
    @XmlEnumValue("hotFoodService")
    HOT_FOOD_SERVICE("hotFoodService"),
    @XmlEnumValue("restaurant")
    RESTAURANT("restaurant"),
    @XmlEnumValue("snacks")
    SNACKS("snacks"),
    @XmlEnumValue("trolleyService")
    TROLLEY_SERVICE("trolleyService"),
    @XmlEnumValue("noBeveragesAvailable")
    NO_BEVERAGES_AVAILABLE("noBeveragesAvailable"),
    @XmlEnumValue("noFoodServiceAvailable")
    NO_FOOD_SERVICE_AVAILABLE("noFoodServiceAvailable"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CateringServiceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CateringServiceEnumeration fromValue(String v) {
        for (CateringServiceEnumeration c: CateringServiceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
