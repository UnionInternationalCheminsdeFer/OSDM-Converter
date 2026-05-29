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
 * <p>Java-Klasse f�r NameOfClassTravelDocumentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTravelDocumentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="ServiceAccessCode"/>
 *     &lt;enumeration value="TravelDocument"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTravelDocumentRefStructureType")
@XmlEnum
public enum NameOfClassTravelDocumentRefStructureType {

    @XmlEnumValue("ServiceAccessCode")
    SERVICE_ACCESS_CODE("ServiceAccessCode"),
    @XmlEnumValue("TravelDocument")
    TRAVEL_DOCUMENT("TravelDocument");
    private final String value;

    NameOfClassTravelDocumentRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassTravelDocumentRefStructureType fromValue(String v) {
        for (NameOfClassTravelDocumentRefStructureType c: NameOfClassTravelDocumentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
