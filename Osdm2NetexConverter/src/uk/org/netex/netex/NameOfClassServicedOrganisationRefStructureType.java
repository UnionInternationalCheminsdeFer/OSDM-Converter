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
 * <p>Java-Klasse f�r NameOfClassServicedOrganisationRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassServicedOrganisationRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassOtherOrganisationRefStructureType">
 *     &lt;enumeration value="ServicedOrganisation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassServicedOrganisationRefStructureType")
@XmlEnum(NameOfClassOtherOrganisationRefStructureType.class)
public enum NameOfClassServicedOrganisationRefStructureType {

    @XmlEnumValue("ServicedOrganisation")
    SERVICED_ORGANISATION(NameOfClassOtherOrganisationRefStructureType.SERVICED_ORGANISATION);
    private final NameOfClassOtherOrganisationRefStructureType value;

    NameOfClassServicedOrganisationRefStructureType(NameOfClassOtherOrganisationRefStructureType v) {
        value = v;
    }

    public NameOfClassOtherOrganisationRefStructureType value() {
        return value;
    }

    public static NameOfClassServicedOrganisationRefStructureType fromValue(NameOfClassOtherOrganisationRefStructureType v) {
        for (NameOfClassServicedOrganisationRefStructureType c: NameOfClassServicedOrganisationRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
