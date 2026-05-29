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
 * <p>Java-Klasse f�r NameOfClassFareContractSecurityListingRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFareContractSecurityListingRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSecurityListingRefStructureType">
 *     &lt;enumeration value="FareContractSecurityListing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFareContractSecurityListingRefStructureType")
@XmlEnum(NameOfClassSecurityListingRefStructureType.class)
public enum NameOfClassFareContractSecurityListingRefStructureType {

    @XmlEnumValue("FareContractSecurityListing")
    FARE_CONTRACT_SECURITY_LISTING(NameOfClassSecurityListingRefStructureType.FARE_CONTRACT_SECURITY_LISTING);
    private final NameOfClassSecurityListingRefStructureType value;

    NameOfClassFareContractSecurityListingRefStructureType(NameOfClassSecurityListingRefStructureType v) {
        value = v;
    }

    public NameOfClassSecurityListingRefStructureType value() {
        return value;
    }

    public static NameOfClassFareContractSecurityListingRefStructureType fromValue(NameOfClassSecurityListingRefStructureType v) {
        for (NameOfClassFareContractSecurityListingRefStructureType c: NameOfClassFareContractSecurityListingRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
