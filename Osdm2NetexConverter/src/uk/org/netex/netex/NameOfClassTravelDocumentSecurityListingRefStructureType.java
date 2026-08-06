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
 * <p>Java-Klasse f�r NameOfClassTravelDocumentSecurityListingRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTravelDocumentSecurityListingRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSecurityListingRefStructureType">
 *     &lt;enumeration value="TravelDocumentSecurityListing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTravelDocumentSecurityListingRefStructureType")
@XmlEnum(NameOfClassSecurityListingRefStructureType.class)
public enum NameOfClassTravelDocumentSecurityListingRefStructureType {

    @XmlEnumValue("TravelDocumentSecurityListing")
    TRAVEL_DOCUMENT_SECURITY_LISTING(NameOfClassSecurityListingRefStructureType.TRAVEL_DOCUMENT_SECURITY_LISTING);
    private final NameOfClassSecurityListingRefStructureType value;

    NameOfClassTravelDocumentSecurityListingRefStructureType(NameOfClassSecurityListingRefStructureType v) {
        value = v;
    }

    public NameOfClassSecurityListingRefStructureType value() {
        return value;
    }

    public static NameOfClassTravelDocumentSecurityListingRefStructureType fromValue(NameOfClassSecurityListingRefStructureType v) {
        for (NameOfClassTravelDocumentSecurityListingRefStructureType c: NameOfClassTravelDocumentSecurityListingRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
