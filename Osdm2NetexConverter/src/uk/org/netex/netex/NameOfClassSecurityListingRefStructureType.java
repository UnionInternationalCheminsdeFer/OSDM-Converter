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
 * <p>Java-Klasse f�r NameOfClassSecurityListingRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassSecurityListingRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="CustomerAccountSecurityListing"/>
 *     &lt;enumeration value="CustomerSecurityListing"/>
 *     &lt;enumeration value="FareContractSecurityListing"/>
 *     &lt;enumeration value="MediumAccessDeviceSecurityListing"/>
 *     &lt;enumeration value="RetailDeviceSecurityListing"/>
 *     &lt;enumeration value="TravelDocumentSecurityListing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassSecurityListingRefStructureType")
@XmlEnum
public enum NameOfClassSecurityListingRefStructureType {

    @XmlEnumValue("CustomerAccountSecurityListing")
    CUSTOMER_ACCOUNT_SECURITY_LISTING("CustomerAccountSecurityListing"),
    @XmlEnumValue("CustomerSecurityListing")
    CUSTOMER_SECURITY_LISTING("CustomerSecurityListing"),
    @XmlEnumValue("FareContractSecurityListing")
    FARE_CONTRACT_SECURITY_LISTING("FareContractSecurityListing"),
    @XmlEnumValue("MediumAccessDeviceSecurityListing")
    MEDIUM_ACCESS_DEVICE_SECURITY_LISTING("MediumAccessDeviceSecurityListing"),
    @XmlEnumValue("RetailDeviceSecurityListing")
    RETAIL_DEVICE_SECURITY_LISTING("RetailDeviceSecurityListing"),
    @XmlEnumValue("TravelDocumentSecurityListing")
    TRAVEL_DOCUMENT_SECURITY_LISTING("TravelDocumentSecurityListing");
    private final String value;

    NameOfClassSecurityListingRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassSecurityListingRefStructureType fromValue(String v) {
        for (NameOfClassSecurityListingRefStructureType c: NameOfClassSecurityListingRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
