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
 * <p>Java-Klasse f�r FareStructureTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FareStructureTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="networkFlatFare"/>
 *     &lt;enumeration value="lineFlatFare"/>
 *     &lt;enumeration value="zonalFare"/>
 *     &lt;enumeration value="zoneToZoneFare"/>
 *     &lt;enumeration value="zoneSequenceFare"/>
 *     &lt;enumeration value="cappedFlatFare"/>
 *     &lt;enumeration value="cappedPointToPointFare"/>
 *     &lt;enumeration value="cappedZonalFare"/>
 *     &lt;enumeration value="pointToPointFare"/>
 *     &lt;enumeration value="pointToPointDistanceFare"/>
 *     &lt;enumeration value="stageFare"/>
 *     &lt;enumeration value="penaltyFare"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareStructureTypeEnumeration")
@XmlEnum
public enum FareStructureTypeEnumeration {

    @XmlEnumValue("networkFlatFare")
    NETWORK_FLAT_FARE("networkFlatFare"),
    @XmlEnumValue("lineFlatFare")
    LINE_FLAT_FARE("lineFlatFare"),
    @XmlEnumValue("zonalFare")
    ZONAL_FARE("zonalFare"),
    @XmlEnumValue("zoneToZoneFare")
    ZONE_TO_ZONE_FARE("zoneToZoneFare"),
    @XmlEnumValue("zoneSequenceFare")
    ZONE_SEQUENCE_FARE("zoneSequenceFare"),
    @XmlEnumValue("cappedFlatFare")
    CAPPED_FLAT_FARE("cappedFlatFare"),
    @XmlEnumValue("cappedPointToPointFare")
    CAPPED_POINT_TO_POINT_FARE("cappedPointToPointFare"),
    @XmlEnumValue("cappedZonalFare")
    CAPPED_ZONAL_FARE("cappedZonalFare"),
    @XmlEnumValue("pointToPointFare")
    POINT_TO_POINT_FARE("pointToPointFare"),
    @XmlEnumValue("pointToPointDistanceFare")
    POINT_TO_POINT_DISTANCE_FARE("pointToPointDistanceFare"),
    @XmlEnumValue("stageFare")
    STAGE_FARE("stageFare"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("penaltyFare")
    PENALTY_FARE("penaltyFare"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    FareStructureTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareStructureTypeEnumeration fromValue(String v) {
        for (FareStructureTypeEnumeration c: FareStructureTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
