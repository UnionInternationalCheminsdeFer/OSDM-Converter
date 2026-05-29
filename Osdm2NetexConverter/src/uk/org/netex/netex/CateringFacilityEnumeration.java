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
 * <p>Java-Klasse f�r CateringFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CateringFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="bar"/>
 *     &lt;enumeration value="bistro"/>
 *     &lt;enumeration value="buffet"/>
 *     &lt;enumeration value="noFoodAvailable"/>
 *     &lt;enumeration value="noBeveragesAvailable"/>
 *     &lt;enumeration value="restaurant"/>
 *     &lt;enumeration value="firstClassRestaurant"/>
 *     &lt;enumeration value="trolley"/>
 *     &lt;enumeration value="coffeeShop"/>
 *     &lt;enumeration value="hotFoodService"/>
 *     &lt;enumeration value="selfService"/>
 *     &lt;enumeration value="snacks"/>
 *     &lt;enumeration value="foodVendingMachine"/>
 *     &lt;enumeration value="beverageVendingMachine"/>
 *     &lt;enumeration value="miniBar"/>
 *     &lt;enumeration value="breakfastInCar"/>
 *     &lt;enumeration value="mealAtSeat"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CateringFacilityEnumeration")
@XmlEnum
public enum CateringFacilityEnumeration {


    /**
     * pti23_18
     * 
     */
    @XmlEnumValue("bar")
    BAR("bar"),

    /**
     * pti23_26
     * 
     */
    @XmlEnumValue("bistro")
    BISTRO("bistro"),
    @XmlEnumValue("buffet")
    BUFFET("buffet"),

    /**
     * pti23_19
     * 
     */
    @XmlEnumValue("noFoodAvailable")
    NO_FOOD_AVAILABLE("noFoodAvailable"),

    /**
     * pti23_20
     * 
     */
    @XmlEnumValue("noBeveragesAvailable")
    NO_BEVERAGES_AVAILABLE("noBeveragesAvailable"),

    /**
     * pti23_1
     * 
     */
    @XmlEnumValue("restaurant")
    RESTAURANT("restaurant"),
    @XmlEnumValue("firstClassRestaurant")
    FIRST_CLASS_RESTAURANT("firstClassRestaurant"),

    /**
     * pti23_23
     * 
     */
    @XmlEnumValue("trolley")
    TROLLEY("trolley"),
    @XmlEnumValue("coffeeShop")
    COFFEE_SHOP("coffeeShop"),
    @XmlEnumValue("hotFoodService")
    HOT_FOOD_SERVICE("hotFoodService"),
    @XmlEnumValue("selfService")
    SELF_SERVICE("selfService"),

    /**
     * pti23_2
     * 
     */
    @XmlEnumValue("snacks")
    SNACKS("snacks"),
    @XmlEnumValue("foodVendingMachine")
    FOOD_VENDING_MACHINE("foodVendingMachine"),
    @XmlEnumValue("beverageVendingMachine")
    BEVERAGE_VENDING_MACHINE("beverageVendingMachine"),

    /**
     * pti23_18_1
     * 
     */
    @XmlEnumValue("miniBar")
    MINI_BAR("miniBar"),
    @XmlEnumValue("breakfastInCar")
    BREAKFAST_IN_CAR("breakfastInCar"),
    @XmlEnumValue("mealAtSeat")
    MEAL_AT_SEAT("mealAtSeat"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    CateringFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CateringFacilityEnumeration fromValue(String v) {
        for (CateringFacilityEnumeration c: CateringFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
