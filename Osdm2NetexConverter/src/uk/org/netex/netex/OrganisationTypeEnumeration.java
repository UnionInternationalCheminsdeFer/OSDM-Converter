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
 * <p>Java-Klasse f�r OrganisationTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganisationTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="authority"/>
 *     &lt;enumeration value="operator"/>
 *     &lt;enumeration value="railOperator"/>
 *     &lt;enumeration value="railFreightOperator"/>
 *     &lt;enumeration value="statutoryBody"/>
 *     &lt;enumeration value="facilityOperator"/>
 *     &lt;enumeration value="travelAgent"/>
 *     &lt;enumeration value="servicedOrganisation"/>
 *     &lt;enumeration value="retailConsortium"/>
 *     &lt;enumeration value="alternativeModeOperator"/>
 *     &lt;enumeration value="onlineProvider"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganisationTypeEnumeration")
@XmlEnum
public enum OrganisationTypeEnumeration {


    /**
     * ORGANISATION is a Transport Authority or Agency.
     * 
     */
    @XmlEnumValue("authority")
    AUTHORITY("authority"),

    /**
     * ORGANISATION is a Public Transport OPERATOR.
     * 
     */
    @XmlEnumValue("operator")
    OPERATOR("operator"),

    /**
     * ORGANISATION is a Rail OPERATOR.
     * 
     */
    @XmlEnumValue("railOperator")
    RAIL_OPERATOR("railOperator"),

    /**
     * ORGANISATION is a rail freight OPERATOR.
     * 
     */
    @XmlEnumValue("railFreightOperator")
    RAIL_FREIGHT_OPERATOR("railFreightOperator"),

    /**
     * ORGANISATION is a statutory body or government department.
     * 
     */
    @XmlEnumValue("statutoryBody")
    STATUTORY_BODY("statutoryBody"),

    /**
     * ORGANISATION operates a facility such as a station.
     * 
     */
    @XmlEnumValue("facilityOperator")
    FACILITY_OPERATOR("facilityOperator"),

    /**
     * ORGANISATION is a Travel Agent.
     * 
     */
    @XmlEnumValue("travelAgent")
    TRAVEL_AGENT("travelAgent"),

    /**
     * ORGANISATION is a business or organisation served by public transport.
     * 
     */
    @XmlEnumValue("servicedOrganisation")
    SERVICED_ORGANISATION("servicedOrganisation"),

    /**
     * ORGANISATION is a trade association representing independent retailers.
     * 
     */
    @XmlEnumValue("retailConsortium")
    RETAIL_CONSORTIUM("retailConsortium"),

    /**
     * ORGANISATION is a transport OPERATOR.
     * 
     */
    @XmlEnumValue("alternativeModeOperator")
    ALTERNATIVE_MODE_OPERATOR("alternativeModeOperator"),

    /**
     * ORGANISATION is a third party online service.
     * 
     */
    @XmlEnumValue("onlineProvider")
    ONLINE_PROVIDER("onlineProvider"),

    /**
     * Other type of ORGANISATION.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    OrganisationTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganisationTypeEnumeration fromValue(String v) {
        for (OrganisationTypeEnumeration c: OrganisationTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
