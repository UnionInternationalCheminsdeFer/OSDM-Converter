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
 * <p>Java-Klasse f�r NameOfClassSaleDiscountRightRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassSaleDiscountRightRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassFareProductRefStructureType">
 *     &lt;enumeration value="CappedDiscountRight"/>
 *     &lt;enumeration value="SaleDiscountRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassSaleDiscountRightRefStructureType")
@XmlEnum(NameOfClassFareProductRefStructureType.class)
public enum NameOfClassSaleDiscountRightRefStructureType {

    @XmlEnumValue("CappedDiscountRight")
    CAPPED_DISCOUNT_RIGHT(NameOfClassFareProductRefStructureType.CAPPED_DISCOUNT_RIGHT),
    @XmlEnumValue("SaleDiscountRight")
    SALE_DISCOUNT_RIGHT(NameOfClassFareProductRefStructureType.SALE_DISCOUNT_RIGHT);
    private final NameOfClassFareProductRefStructureType value;

    NameOfClassSaleDiscountRightRefStructureType(NameOfClassFareProductRefStructureType v) {
        value = v;
    }

    public NameOfClassFareProductRefStructureType value() {
        return value;
    }

    public static NameOfClassSaleDiscountRightRefStructureType fromValue(NameOfClassFareProductRefStructureType v) {
        for (NameOfClassSaleDiscountRightRefStructureType c: NameOfClassSaleDiscountRightRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
