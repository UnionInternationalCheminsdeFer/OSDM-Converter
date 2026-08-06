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
 * <p>Java-Klasse f�r NameOfClassOrganisationRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassOrganisationRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="Authority"/>
 *     &lt;enumeration value="GeneralOrganisation"/>
 *     &lt;enumeration value="ManagementAgent"/>
 *     &lt;enumeration value="OnlineServiceOperator"/>
 *     &lt;enumeration value="Operator"/>
 *     &lt;enumeration value="OtherOrganisation"/>
 *     &lt;enumeration value="RetailConsortium"/>
 *     &lt;enumeration value="ServicedOrganisation"/>
 *     &lt;enumeration value="TravelAgent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassOrganisationRefStructureType")
@XmlEnum
public enum NameOfClassOrganisationRefStructureType {

    @XmlEnumValue("Authority")
    AUTHORITY("Authority"),
    @XmlEnumValue("GeneralOrganisation")
    GENERAL_ORGANISATION("GeneralOrganisation"),
    @XmlEnumValue("ManagementAgent")
    MANAGEMENT_AGENT("ManagementAgent"),
    @XmlEnumValue("OnlineServiceOperator")
    ONLINE_SERVICE_OPERATOR("OnlineServiceOperator"),
    @XmlEnumValue("Operator")
    OPERATOR("Operator"),
    @XmlEnumValue("OtherOrganisation")
    OTHER_ORGANISATION("OtherOrganisation"),
    @XmlEnumValue("RetailConsortium")
    RETAIL_CONSORTIUM("RetailConsortium"),
    @XmlEnumValue("ServicedOrganisation")
    SERVICED_ORGANISATION("ServicedOrganisation"),
    @XmlEnumValue("TravelAgent")
    TRAVEL_AGENT("TravelAgent");
    private final String value;

    NameOfClassOrganisationRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassOrganisationRefStructureType fromValue(String v) {
        for (NameOfClassOrganisationRefStructureType c: NameOfClassOrganisationRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
