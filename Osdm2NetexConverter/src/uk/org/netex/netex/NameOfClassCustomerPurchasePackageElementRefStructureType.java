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
 * <p>Java-Klasse f�r NameOfClassCustomerPurchasePackageElementRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassCustomerPurchasePackageElementRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPriceableObjectRefStructureType">
 *     &lt;enumeration value="CustomerPurchasePackageElement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassCustomerPurchasePackageElementRefStructureType")
@XmlEnum(NameOfClassPriceableObjectRefStructureType.class)
public enum NameOfClassCustomerPurchasePackageElementRefStructureType {

    @XmlEnumValue("CustomerPurchasePackageElement")
    CUSTOMER_PURCHASE_PACKAGE_ELEMENT(NameOfClassPriceableObjectRefStructureType.CUSTOMER_PURCHASE_PACKAGE_ELEMENT);
    private final NameOfClassPriceableObjectRefStructureType value;

    NameOfClassCustomerPurchasePackageElementRefStructureType(NameOfClassPriceableObjectRefStructureType v) {
        value = v;
    }

    public NameOfClassPriceableObjectRefStructureType value() {
        return value;
    }

    public static NameOfClassCustomerPurchasePackageElementRefStructureType fromValue(NameOfClassPriceableObjectRefStructureType v) {
        for (NameOfClassCustomerPurchasePackageElementRefStructureType c: NameOfClassCustomerPurchasePackageElementRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
