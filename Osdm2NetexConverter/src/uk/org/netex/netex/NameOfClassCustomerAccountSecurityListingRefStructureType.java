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
 * <p>Java-Klasse f�r NameOfClassCustomerAccountSecurityListingRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassCustomerAccountSecurityListingRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSecurityListingRefStructureType">
 *     &lt;enumeration value="CustomerAccountSecurityListing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassCustomerAccountSecurityListingRefStructureType")
@XmlEnum(NameOfClassSecurityListingRefStructureType.class)
public enum NameOfClassCustomerAccountSecurityListingRefStructureType {

    @XmlEnumValue("CustomerAccountSecurityListing")
    CUSTOMER_ACCOUNT_SECURITY_LISTING(NameOfClassSecurityListingRefStructureType.CUSTOMER_ACCOUNT_SECURITY_LISTING);
    private final NameOfClassSecurityListingRefStructureType value;

    NameOfClassCustomerAccountSecurityListingRefStructureType(NameOfClassSecurityListingRefStructureType v) {
        value = v;
    }

    public NameOfClassSecurityListingRefStructureType value() {
        return value;
    }

    public static NameOfClassCustomerAccountSecurityListingRefStructureType fromValue(NameOfClassSecurityListingRefStructureType v) {
        for (NameOfClassCustomerAccountSecurityListingRefStructureType c: NameOfClassCustomerAccountSecurityListingRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
