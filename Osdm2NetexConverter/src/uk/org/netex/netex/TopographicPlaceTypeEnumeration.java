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
 * <p>Java-Klasse f�r TopographicPlaceTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TopographicPlaceTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="continent"/>
 *     &lt;enumeration value="interregion"/>
 *     &lt;enumeration value="country"/>
 *     &lt;enumeration value="principality"/>
 *     &lt;enumeration value="state"/>
 *     &lt;enumeration value="province"/>
 *     &lt;enumeration value="region"/>
 *     &lt;enumeration value="county"/>
 *     &lt;enumeration value="area"/>
 *     &lt;enumeration value="conurbation"/>
 *     &lt;enumeration value="city"/>
 *     &lt;enumeration value="municipality"/>
 *     &lt;enumeration value="quarter"/>
 *     &lt;enumeration value="suburb"/>
 *     &lt;enumeration value="town"/>
 *     &lt;enumeration value="urbanCentre"/>
 *     &lt;enumeration value="district"/>
 *     &lt;enumeration value="parish"/>
 *     &lt;enumeration value="village"/>
 *     &lt;enumeration value="hamlet"/>
 *     &lt;enumeration value="placeOfInterest"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="unrecorded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TopographicPlaceTypeEnumeration")
@XmlEnum
public enum TopographicPlaceTypeEnumeration {


    /**
     * +v1.1
     * 
     */
    @XmlEnumValue("continent")
    CONTINENT("continent"),

    /**
     * +v1.1
     * 
     */
    @XmlEnumValue("interregion")
    INTERREGION("interregion"),

    /**
     * +v1.1
     * 
     */
    @XmlEnumValue("country")
    COUNTRY("country"),
    @XmlEnumValue("principality")
    PRINCIPALITY("principality"),
    @XmlEnumValue("state")
    STATE("state"),

    /**
     * Country, province, principality - e.g. E.g. England, Wales.
     * 
     */
    @XmlEnumValue("province")
    PROVINCE("province"),
    @XmlEnumValue("region")
    REGION("region"),
    @XmlEnumValue("county")
    COUNTY("county"),
    @XmlEnumValue("area")
    AREA("area"),
    @XmlEnumValue("conurbation")
    CONURBATION("conurbation"),

    /**
     * Locality is a city.
     * 
     */
    @XmlEnumValue("city")
    CITY("city"),

    /**
     * +v1.1
     * 
     */
    @XmlEnumValue("municipality")
    MUNICIPALITY("municipality"),
    @XmlEnumValue("quarter")
    QUARTER("quarter"),

    /**
     * Locality is an urban sub-area.
     * 
     */
    @XmlEnumValue("suburb")
    SUBURB("suburb"),

    /**
     * Locality is a town.
     * 
     */
    @XmlEnumValue("town")
    TOWN("town"),

    /**
     * Locality is a City Centre or Town Centre ZONE of another town or city locality.
     * 
     */
    @XmlEnumValue("urbanCentre")
    URBAN_CENTRE("urbanCentre"),
    @XmlEnumValue("district")
    DISTRICT("district"),
    @XmlEnumValue("parish")
    PARISH("parish"),

    /**
     * Locality is a village.
     * 
     */
    @XmlEnumValue("village")
    VILLAGE("village"),

    /**
     * Locality is a hamlet.
     * 
     */
    @XmlEnumValue("hamlet")
    HAMLET("hamlet"),

    /**
     * Locality is a place of interest whose name is distinct from another locality.
     * 
     */
    @XmlEnumValue("placeOfInterest")
    PLACE_OF_INTEREST("placeOfInterest"),

    /**
     * Locality is none of the other types.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * Locality type is not yet specified.
     * 
     */
    @XmlEnumValue("unrecorded")
    UNRECORDED("unrecorded");
    private final String value;

    TopographicPlaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TopographicPlaceTypeEnumeration fromValue(String v) {
        for (TopographicPlaceTypeEnumeration c: TopographicPlaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
