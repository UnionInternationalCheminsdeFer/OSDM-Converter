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
 * <p>Java-Klasse f�r ExchangableToEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangableToEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="anyProduct"/>
 *     &lt;enumeration value="sameProductSameDay"/>
 *     &lt;enumeration value="sameProductAnyDay"/>
 *     &lt;enumeration value="sameProductLongerJourney"/>
 *     &lt;enumeration value="sameProductShorterJourney"/>
 *     &lt;enumeration value="upgradeToStandardFare"/>
 *     &lt;enumeration value="upgradeToSpecifiedFare"/>
 *     &lt;enumeration value="downgradeToSpecifiedFare"/>
 *     &lt;enumeration value="equivalentProduct"/>
 *     &lt;enumeration value="changeGroupSize"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExchangableToEnumeration")
@XmlEnum
public enum ExchangableToEnumeration {

    @XmlEnumValue("anyProduct")
    ANY_PRODUCT("anyProduct"),
    @XmlEnumValue("sameProductSameDay")
    SAME_PRODUCT_SAME_DAY("sameProductSameDay"),
    @XmlEnumValue("sameProductAnyDay")
    SAME_PRODUCT_ANY_DAY("sameProductAnyDay"),
    @XmlEnumValue("sameProductLongerJourney")
    SAME_PRODUCT_LONGER_JOURNEY("sameProductLongerJourney"),
    @XmlEnumValue("sameProductShorterJourney")
    SAME_PRODUCT_SHORTER_JOURNEY("sameProductShorterJourney"),
    @XmlEnumValue("upgradeToStandardFare")
    UPGRADE_TO_STANDARD_FARE("upgradeToStandardFare"),
    @XmlEnumValue("upgradeToSpecifiedFare")
    UPGRADE_TO_SPECIFIED_FARE("upgradeToSpecifiedFare"),
    @XmlEnumValue("downgradeToSpecifiedFare")
    DOWNGRADE_TO_SPECIFIED_FARE("downgradeToSpecifiedFare"),
    @XmlEnumValue("equivalentProduct")
    EQUIVALENT_PRODUCT("equivalentProduct"),
    @XmlEnumValue("changeGroupSize")
    CHANGE_GROUP_SIZE("changeGroupSize"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ExchangableToEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExchangableToEnumeration fromValue(String v) {
        for (ExchangableToEnumeration c: ExchangableToEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
