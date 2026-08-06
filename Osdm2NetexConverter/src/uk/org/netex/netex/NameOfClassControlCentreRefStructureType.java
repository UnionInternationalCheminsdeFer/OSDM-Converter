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
 * <p>Java-Klasse f�r NameOfClassControlCentreRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassControlCentreRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassOrganisationPartRefStructureType">
 *     &lt;enumeration value="ControlCentre"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassControlCentreRefStructureType")
@XmlEnum(NameOfClassOrganisationPartRefStructureType.class)
public enum NameOfClassControlCentreRefStructureType {

    @XmlEnumValue("ControlCentre")
    CONTROL_CENTRE(NameOfClassOrganisationPartRefStructureType.CONTROL_CENTRE);
    private final NameOfClassOrganisationPartRefStructureType value;

    NameOfClassControlCentreRefStructureType(NameOfClassOrganisationPartRefStructureType v) {
        value = v;
    }

    public NameOfClassOrganisationPartRefStructureType value() {
        return value;
    }

    public static NameOfClassControlCentreRefStructureType fromValue(NameOfClassOrganisationPartRefStructureType v) {
        for (NameOfClassControlCentreRefStructureType c: NameOfClassControlCentreRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
