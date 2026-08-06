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
 * <p>Java-Klasse f�r NameOfClassFareContractEntryRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFareContractEntryRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLogEntryRefStructureType">
 *     &lt;enumeration value="OfferedTravelSpecification"/>
 *     &lt;enumeration value="RequestedTravelSpecification"/>
 *     &lt;enumeration value="SalesTransaction"/>
 *     &lt;enumeration value="TravelSpecification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFareContractEntryRefStructureType")
@XmlEnum(NameOfClassLogEntryRefStructureType.class)
public enum NameOfClassFareContractEntryRefStructureType {

    @XmlEnumValue("OfferedTravelSpecification")
    OFFERED_TRAVEL_SPECIFICATION(NameOfClassLogEntryRefStructureType.OFFERED_TRAVEL_SPECIFICATION),
    @XmlEnumValue("RequestedTravelSpecification")
    REQUESTED_TRAVEL_SPECIFICATION(NameOfClassLogEntryRefStructureType.REQUESTED_TRAVEL_SPECIFICATION),
    @XmlEnumValue("SalesTransaction")
    SALES_TRANSACTION(NameOfClassLogEntryRefStructureType.SALES_TRANSACTION),
    @XmlEnumValue("TravelSpecification")
    TRAVEL_SPECIFICATION(NameOfClassLogEntryRefStructureType.TRAVEL_SPECIFICATION);
    private final NameOfClassLogEntryRefStructureType value;

    NameOfClassFareContractEntryRefStructureType(NameOfClassLogEntryRefStructureType v) {
        value = v;
    }

    public NameOfClassLogEntryRefStructureType value() {
        return value;
    }

    public static NameOfClassFareContractEntryRefStructureType fromValue(NameOfClassLogEntryRefStructureType v) {
        for (NameOfClassFareContractEntryRefStructureType c: NameOfClassFareContractEntryRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
