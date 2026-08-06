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
 * <p>Java-Klasse f�r NameOfClassServiceAccessRightRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassServiceAccessRightRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPriceableObjectRefStructureType">
 *     &lt;enumeration value="AmountOfPriceUnitProduct"/>
 *     &lt;enumeration value="CappedDiscountRight"/>
 *     &lt;enumeration value="EntitlementProduct"/>
 *     &lt;enumeration value="PreassignedFareProduct"/>
 *     &lt;enumeration value="SaleDiscountRight"/>
 *     &lt;enumeration value="ServiceAccessRight"/>
 *     &lt;enumeration value="SupplementProduct"/>
 *     &lt;enumeration value="ThirdPartyProduct"/>
 *     &lt;enumeration value="UsageDiscountRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassServiceAccessRightRefStructureType")
@XmlEnum(NameOfClassPriceableObjectRefStructureType.class)
public enum NameOfClassServiceAccessRightRefStructureType {

    @XmlEnumValue("AmountOfPriceUnitProduct")
    AMOUNT_OF_PRICE_UNIT_PRODUCT(NameOfClassPriceableObjectRefStructureType.AMOUNT_OF_PRICE_UNIT_PRODUCT),
    @XmlEnumValue("CappedDiscountRight")
    CAPPED_DISCOUNT_RIGHT(NameOfClassPriceableObjectRefStructureType.CAPPED_DISCOUNT_RIGHT),
    @XmlEnumValue("EntitlementProduct")
    ENTITLEMENT_PRODUCT(NameOfClassPriceableObjectRefStructureType.ENTITLEMENT_PRODUCT),
    @XmlEnumValue("PreassignedFareProduct")
    PREASSIGNED_FARE_PRODUCT(NameOfClassPriceableObjectRefStructureType.PREASSIGNED_FARE_PRODUCT),
    @XmlEnumValue("SaleDiscountRight")
    SALE_DISCOUNT_RIGHT(NameOfClassPriceableObjectRefStructureType.SALE_DISCOUNT_RIGHT),
    @XmlEnumValue("ServiceAccessRight")
    SERVICE_ACCESS_RIGHT(NameOfClassPriceableObjectRefStructureType.SERVICE_ACCESS_RIGHT),
    @XmlEnumValue("SupplementProduct")
    SUPPLEMENT_PRODUCT(NameOfClassPriceableObjectRefStructureType.SUPPLEMENT_PRODUCT),
    @XmlEnumValue("ThirdPartyProduct")
    THIRD_PARTY_PRODUCT(NameOfClassPriceableObjectRefStructureType.THIRD_PARTY_PRODUCT),
    @XmlEnumValue("UsageDiscountRight")
    USAGE_DISCOUNT_RIGHT(NameOfClassPriceableObjectRefStructureType.USAGE_DISCOUNT_RIGHT);
    private final NameOfClassPriceableObjectRefStructureType value;

    NameOfClassServiceAccessRightRefStructureType(NameOfClassPriceableObjectRefStructureType v) {
        value = v;
    }

    public NameOfClassPriceableObjectRefStructureType value() {
        return value;
    }

    public static NameOfClassServiceAccessRightRefStructureType fromValue(NameOfClassPriceableObjectRefStructureType v) {
        for (NameOfClassServiceAccessRightRefStructureType c: NameOfClassServiceAccessRightRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
