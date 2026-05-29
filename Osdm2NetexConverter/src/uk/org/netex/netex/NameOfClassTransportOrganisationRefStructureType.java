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
 * <p>Java-Klasse f�r NameOfClassTransportOrganisationRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTransportOrganisationRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassOrganisationRefStructureType">
 *     &lt;enumeration value="Authority"/>
 *     &lt;enumeration value="Operator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTransportOrganisationRefStructureType")
@XmlEnum(NameOfClassOrganisationRefStructureType.class)
public enum NameOfClassTransportOrganisationRefStructureType {

    @XmlEnumValue("Authority")
    AUTHORITY(NameOfClassOrganisationRefStructureType.AUTHORITY),
    @XmlEnumValue("Operator")
    OPERATOR(NameOfClassOrganisationRefStructureType.OPERATOR);
    private final NameOfClassOrganisationRefStructureType value;

    NameOfClassTransportOrganisationRefStructureType(NameOfClassOrganisationRefStructureType v) {
        value = v;
    }

    public NameOfClassOrganisationRefStructureType value() {
        return value;
    }

    public static NameOfClassTransportOrganisationRefStructureType fromValue(NameOfClassOrganisationRefStructureType v) {
        for (NameOfClassTransportOrganisationRefStructureType c: NameOfClassTransportOrganisationRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
