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
 * <p>Java-Klasse f�r NameOfClassOtherOrganisationRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassOtherOrganisationRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassOrganisationRefStructureType">
 *     &lt;enumeration value="GeneralOrganisation"/>
 *     &lt;enumeration value="ManagementAgent"/>
 *     &lt;enumeration value="OtherOrganisation"/>
 *     &lt;enumeration value="ServicedOrganisation"/>
 *     &lt;enumeration value="TravelAgent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassOtherOrganisationRefStructureType")
@XmlEnum(NameOfClassOrganisationRefStructureType.class)
public enum NameOfClassOtherOrganisationRefStructureType {

    @XmlEnumValue("GeneralOrganisation")
    GENERAL_ORGANISATION(NameOfClassOrganisationRefStructureType.GENERAL_ORGANISATION),
    @XmlEnumValue("ManagementAgent")
    MANAGEMENT_AGENT(NameOfClassOrganisationRefStructureType.MANAGEMENT_AGENT),
    @XmlEnumValue("OtherOrganisation")
    OTHER_ORGANISATION(NameOfClassOrganisationRefStructureType.OTHER_ORGANISATION),
    @XmlEnumValue("ServicedOrganisation")
    SERVICED_ORGANISATION(NameOfClassOrganisationRefStructureType.SERVICED_ORGANISATION),
    @XmlEnumValue("TravelAgent")
    TRAVEL_AGENT(NameOfClassOrganisationRefStructureType.TRAVEL_AGENT);
    private final NameOfClassOrganisationRefStructureType value;

    NameOfClassOtherOrganisationRefStructureType(NameOfClassOrganisationRefStructureType v) {
        value = v;
    }

    public NameOfClassOrganisationRefStructureType value() {
        return value;
    }

    public static NameOfClassOtherOrganisationRefStructureType fromValue(NameOfClassOrganisationRefStructureType v) {
        for (NameOfClassOtherOrganisationRefStructureType c: NameOfClassOtherOrganisationRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
