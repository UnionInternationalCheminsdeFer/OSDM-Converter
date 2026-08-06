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
 * <p>Java-Klasse f�r NameOfClassCustomerPurchasePackageRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassCustomerPurchasePackageRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPriceableObjectRefStructureType">
 *     &lt;enumeration value="CustomerPurchasePackage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassCustomerPurchasePackageRefStructureType")
@XmlEnum(NameOfClassPriceableObjectRefStructureType.class)
public enum NameOfClassCustomerPurchasePackageRefStructureType {

    @XmlEnumValue("CustomerPurchasePackage")
    CUSTOMER_PURCHASE_PACKAGE(NameOfClassPriceableObjectRefStructureType.CUSTOMER_PURCHASE_PACKAGE);
    private final NameOfClassPriceableObjectRefStructureType value;

    NameOfClassCustomerPurchasePackageRefStructureType(NameOfClassPriceableObjectRefStructureType v) {
        value = v;
    }

    public NameOfClassPriceableObjectRefStructureType value() {
        return value;
    }

    public static NameOfClassCustomerPurchasePackageRefStructureType fromValue(NameOfClassPriceableObjectRefStructureType v) {
        for (NameOfClassCustomerPurchasePackageRefStructureType c: NameOfClassCustomerPurchasePackageRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
