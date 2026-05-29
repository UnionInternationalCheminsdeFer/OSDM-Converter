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
 * <p>Java-Klasse f�r NameOfClassFareProductRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFareProductRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassServiceAccessRightRefStructureType">
 *     &lt;enumeration value="AmountOfPriceUnitProduct"/>
 *     &lt;enumeration value="CappedDiscountRight"/>
 *     &lt;enumeration value="PreassignedFareProduct"/>
 *     &lt;enumeration value="SaleDiscountRight"/>
 *     &lt;enumeration value="SupplementProduct"/>
 *     &lt;enumeration value="ThirdPartyProduct"/>
 *     &lt;enumeration value="UsageDiscountRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFareProductRefStructureType")
@XmlEnum(NameOfClassServiceAccessRightRefStructureType.class)
public enum NameOfClassFareProductRefStructureType {

    @XmlEnumValue("AmountOfPriceUnitProduct")
    AMOUNT_OF_PRICE_UNIT_PRODUCT(NameOfClassServiceAccessRightRefStructureType.AMOUNT_OF_PRICE_UNIT_PRODUCT),
    @XmlEnumValue("CappedDiscountRight")
    CAPPED_DISCOUNT_RIGHT(NameOfClassServiceAccessRightRefStructureType.CAPPED_DISCOUNT_RIGHT),
    @XmlEnumValue("PreassignedFareProduct")
    PREASSIGNED_FARE_PRODUCT(NameOfClassServiceAccessRightRefStructureType.PREASSIGNED_FARE_PRODUCT),
    @XmlEnumValue("SaleDiscountRight")
    SALE_DISCOUNT_RIGHT(NameOfClassServiceAccessRightRefStructureType.SALE_DISCOUNT_RIGHT),
    @XmlEnumValue("SupplementProduct")
    SUPPLEMENT_PRODUCT(NameOfClassServiceAccessRightRefStructureType.SUPPLEMENT_PRODUCT),
    @XmlEnumValue("ThirdPartyProduct")
    THIRD_PARTY_PRODUCT(NameOfClassServiceAccessRightRefStructureType.THIRD_PARTY_PRODUCT),
    @XmlEnumValue("UsageDiscountRight")
    USAGE_DISCOUNT_RIGHT(NameOfClassServiceAccessRightRefStructureType.USAGE_DISCOUNT_RIGHT);
    private final NameOfClassServiceAccessRightRefStructureType value;

    NameOfClassFareProductRefStructureType(NameOfClassServiceAccessRightRefStructureType v) {
        value = v;
    }

    public NameOfClassServiceAccessRightRefStructureType value() {
        return value;
    }

    public static NameOfClassFareProductRefStructureType fromValue(NameOfClassServiceAccessRightRefStructureType v) {
        for (NameOfClassFareProductRefStructureType c: NameOfClassFareProductRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
