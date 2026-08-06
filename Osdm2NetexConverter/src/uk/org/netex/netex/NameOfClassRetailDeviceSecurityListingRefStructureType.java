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
 * <p>Java-Klasse f�r NameOfClassRetailDeviceSecurityListingRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassRetailDeviceSecurityListingRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSecurityListingRefStructureType">
 *     &lt;enumeration value="RetailDeviceSecurityListing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassRetailDeviceSecurityListingRefStructureType")
@XmlEnum(NameOfClassSecurityListingRefStructureType.class)
public enum NameOfClassRetailDeviceSecurityListingRefStructureType {

    @XmlEnumValue("RetailDeviceSecurityListing")
    RETAIL_DEVICE_SECURITY_LISTING(NameOfClassSecurityListingRefStructureType.RETAIL_DEVICE_SECURITY_LISTING);
    private final NameOfClassSecurityListingRefStructureType value;

    NameOfClassRetailDeviceSecurityListingRefStructureType(NameOfClassSecurityListingRefStructureType v) {
        value = v;
    }

    public NameOfClassSecurityListingRefStructureType value() {
        return value;
    }

    public static NameOfClassRetailDeviceSecurityListingRefStructureType fromValue(NameOfClassSecurityListingRefStructureType v) {
        for (NameOfClassRetailDeviceSecurityListingRefStructureType c: NameOfClassRetailDeviceSecurityListingRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
