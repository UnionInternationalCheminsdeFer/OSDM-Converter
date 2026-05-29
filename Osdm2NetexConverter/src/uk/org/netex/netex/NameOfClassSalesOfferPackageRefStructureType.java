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
 * <p>Java-Klasse f�r NameOfClassSalesOfferPackageRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassSalesOfferPackageRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPriceableObjectRefStructureType">
 *     &lt;enumeration value="SalesOfferPackage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassSalesOfferPackageRefStructureType")
@XmlEnum(NameOfClassPriceableObjectRefStructureType.class)
public enum NameOfClassSalesOfferPackageRefStructureType {

    @XmlEnumValue("SalesOfferPackage")
    SALES_OFFER_PACKAGE(NameOfClassPriceableObjectRefStructureType.SALES_OFFER_PACKAGE);
    private final NameOfClassPriceableObjectRefStructureType value;

    NameOfClassSalesOfferPackageRefStructureType(NameOfClassPriceableObjectRefStructureType v) {
        value = v;
    }

    public NameOfClassPriceableObjectRefStructureType value() {
        return value;
    }

    public static NameOfClassSalesOfferPackageRefStructureType fromValue(NameOfClassPriceableObjectRefStructureType v) {
        for (NameOfClassSalesOfferPackageRefStructureType c: NameOfClassSalesOfferPackageRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
