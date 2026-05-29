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
 * <p>Java-Klasse f�r OrganisationRoleEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganisationRoleEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="subsidiary"/>
 *     &lt;enumeration value="owner"/>
 *     &lt;enumeration value="collaborator"/>
 *     &lt;enumeration value="contractIssuer"/>
 *     &lt;enumeration value="subcontractor"/>
 *     &lt;enumeration value="regulator"/>
 *     &lt;enumeration value="statutoryResponsibility"/>
 *     &lt;enumeration value="distributor"/>
 *     &lt;enumeration value="supplier"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganisationRoleEnumeration")
@XmlEnum
public enum OrganisationRoleEnumeration {


    /**
     * Related ORGANISATION is a subsidiary of this organisation.
     * 
     */
    @XmlEnumValue("subsidiary")
    SUBSIDIARY("subsidiary"),

    /**
     * Related ORGANISATION owns this organisation.
     * 
     */
    @XmlEnumValue("owner")
    OWNER("owner"),

    /**
     * Related ORGANISATION collaborates with this organisation.
     * 
     */
    @XmlEnumValue("collaborator")
    COLLABORATOR("collaborator"),

    /**
     * Related ORGANISATION contracts to this organisation to supply it.
     * 
     */
    @XmlEnumValue("contractIssuer")
    CONTRACT_ISSUER("contractIssuer"),

    /**
     * Related ORGANISATION services contracts for this organisation..
     * 
     */
    @XmlEnumValue("subcontractor")
    SUBCONTRACTOR("subcontractor"),

    /**
     * Related ORGANISATION regulates this organisation.
     * 
     */
    @XmlEnumValue("regulator")
    REGULATOR("regulator"),

    /**
     * Related ORGANISATION is subject to regulation by this organisation.
     * 
     */
    @XmlEnumValue("statutoryResponsibility")
    STATUTORY_RESPONSIBILITY("statutoryResponsibility"),

    /**
     * Related ORGANISATION distributes products for this organisation.
     * 
     */
    @XmlEnumValue("distributor")
    DISTRIBUTOR("distributor"),

    /**
     * Related ORGANISATION supplies products or services to this organisation.
     * 
     */
    @XmlEnumValue("supplier")
    SUPPLIER("supplier"),

    /**
     * Other role type ORGANISATION.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    OrganisationRoleEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganisationRoleEnumeration fromValue(String v) {
        for (OrganisationRoleEnumeration c: OrganisationRoleEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
