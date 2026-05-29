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
 * <p>Java-Klasse f�r NameOfClassServiceAccessCodeRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassServiceAccessCodeRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassTravelDocumentRefStructureType">
 *     &lt;enumeration value="ServiceAccessCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassServiceAccessCodeRefStructureType")
@XmlEnum(NameOfClassTravelDocumentRefStructureType.class)
public enum NameOfClassServiceAccessCodeRefStructureType {

    @XmlEnumValue("ServiceAccessCode")
    SERVICE_ACCESS_CODE(NameOfClassTravelDocumentRefStructureType.SERVICE_ACCESS_CODE);
    private final NameOfClassTravelDocumentRefStructureType value;

    NameOfClassServiceAccessCodeRefStructureType(NameOfClassTravelDocumentRefStructureType v) {
        value = v;
    }

    public NameOfClassTravelDocumentRefStructureType value() {
        return value;
    }

    public static NameOfClassServiceAccessCodeRefStructureType fromValue(NameOfClassTravelDocumentRefStructureType v) {
        for (NameOfClassServiceAccessCodeRefStructureType c: NameOfClassServiceAccessCodeRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
