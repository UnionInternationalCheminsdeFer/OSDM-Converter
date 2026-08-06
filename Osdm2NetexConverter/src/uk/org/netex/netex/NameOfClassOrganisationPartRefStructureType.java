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
 * <p>Java-Klasse f�r NameOfClassOrganisationPartRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassOrganisationPartRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="ControlCentre"/>
 *     &lt;enumeration value="Department"/>
 *     &lt;enumeration value="OperatingDepartment"/>
 *     &lt;enumeration value="OrganisationPart"/>
 *     &lt;enumeration value="OrganisationalUnit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassOrganisationPartRefStructureType")
@XmlEnum
public enum NameOfClassOrganisationPartRefStructureType {

    @XmlEnumValue("ControlCentre")
    CONTROL_CENTRE("ControlCentre"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("OperatingDepartment")
    OPERATING_DEPARTMENT("OperatingDepartment"),
    @XmlEnumValue("OrganisationPart")
    ORGANISATION_PART("OrganisationPart"),
    @XmlEnumValue("OrganisationalUnit")
    ORGANISATIONAL_UNIT("OrganisationalUnit");
    private final String value;

    NameOfClassOrganisationPartRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassOrganisationPartRefStructureType fromValue(String v) {
        for (NameOfClassOrganisationPartRefStructureType c: NameOfClassOrganisationPartRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
