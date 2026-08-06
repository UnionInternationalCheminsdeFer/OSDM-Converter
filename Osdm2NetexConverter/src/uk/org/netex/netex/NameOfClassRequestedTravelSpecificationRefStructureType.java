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
 * <p>Java-Klasse f�r NameOfClassRequestedTravelSpecificationRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassRequestedTravelSpecificationRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassTravelSpecificationRefStructureType">
 *     &lt;enumeration value="RequestedTravelSpecification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassRequestedTravelSpecificationRefStructureType")
@XmlEnum(NameOfClassTravelSpecificationRefStructureType.class)
public enum NameOfClassRequestedTravelSpecificationRefStructureType {

    @XmlEnumValue("RequestedTravelSpecification")
    REQUESTED_TRAVEL_SPECIFICATION(NameOfClassTravelSpecificationRefStructureType.REQUESTED_TRAVEL_SPECIFICATION);
    private final NameOfClassTravelSpecificationRefStructureType value;

    NameOfClassRequestedTravelSpecificationRefStructureType(NameOfClassTravelSpecificationRefStructureType v) {
        value = v;
    }

    public NameOfClassTravelSpecificationRefStructureType value() {
        return value;
    }

    public static NameOfClassRequestedTravelSpecificationRefStructureType fromValue(NameOfClassTravelSpecificationRefStructureType v) {
        for (NameOfClassRequestedTravelSpecificationRefStructureType c: NameOfClassRequestedTravelSpecificationRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
