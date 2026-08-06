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
 * <p>Java-Klasse f�r NameOfClassDepartmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassDepartmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassOrganisationPartRefStructureType">
 *     &lt;enumeration value="Department"/>
 *     &lt;enumeration value="OperatingDepartment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassDepartmentRefStructureType")
@XmlEnum(NameOfClassOrganisationPartRefStructureType.class)
public enum NameOfClassDepartmentRefStructureType {

    @XmlEnumValue("Department")
    DEPARTMENT(NameOfClassOrganisationPartRefStructureType.DEPARTMENT),
    @XmlEnumValue("OperatingDepartment")
    OPERATING_DEPARTMENT(NameOfClassOrganisationPartRefStructureType.OPERATING_DEPARTMENT);
    private final NameOfClassOrganisationPartRefStructureType value;

    NameOfClassDepartmentRefStructureType(NameOfClassOrganisationPartRefStructureType v) {
        value = v;
    }

    public NameOfClassOrganisationPartRefStructureType value() {
        return value;
    }

    public static NameOfClassDepartmentRefStructureType fromValue(NameOfClassOrganisationPartRefStructureType v) {
        for (NameOfClassDepartmentRefStructureType c: NameOfClassDepartmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
