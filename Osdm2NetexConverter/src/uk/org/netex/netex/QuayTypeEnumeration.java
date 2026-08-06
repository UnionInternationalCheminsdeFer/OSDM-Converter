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
 * <p>Java-Klasse f�r QuayTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="QuayTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="airlineGate"/>
 *     &lt;enumeration value="railPlatform"/>
 *     &lt;enumeration value="railIslandPlatform"/>
 *     &lt;enumeration value="railPlatformSector"/>
 *     &lt;enumeration value="metroPlatform"/>
 *     &lt;enumeration value="metroIslandPlatform"/>
 *     &lt;enumeration value="metroIslandPlatformSector"/>
 *     &lt;enumeration value="coachStop"/>
 *     &lt;enumeration value="busStop"/>
 *     &lt;enumeration value="busPlatform"/>
 *     &lt;enumeration value="busBay"/>
 *     &lt;enumeration value="tramPlatform"/>
 *     &lt;enumeration value="tramStop"/>
 *     &lt;enumeration value="boatQuay"/>
 *     &lt;enumeration value="ferryLanding"/>
 *     &lt;enumeration value="telecabinPlatform"/>
 *     &lt;enumeration value="taxiStand"/>
 *     &lt;enumeration value="setDownPlace"/>
 *     &lt;enumeration value="vehicleLoadingPlace"/>
 *     &lt;enumeration value="handicappedLevelBoardingSector"/>
 *     &lt;enumeration value="multimodal"/>
 *     &lt;enumeration value="busStopWithinRoadwayBoarding"/>
 *     &lt;enumeration value="tramStopWithinRoadwayBoarding"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuayTypeEnumeration")
@XmlEnum
public enum QuayTypeEnumeration {

    @XmlEnumValue("airlineGate")
    AIRLINE_GATE("airlineGate"),
    @XmlEnumValue("railPlatform")
    RAIL_PLATFORM("railPlatform"),
    @XmlEnumValue("railIslandPlatform")
    RAIL_ISLAND_PLATFORM("railIslandPlatform"),
    @XmlEnumValue("railPlatformSector")
    RAIL_PLATFORM_SECTOR("railPlatformSector"),
    @XmlEnumValue("metroPlatform")
    METRO_PLATFORM("metroPlatform"),
    @XmlEnumValue("metroIslandPlatform")
    METRO_ISLAND_PLATFORM("metroIslandPlatform"),
    @XmlEnumValue("metroIslandPlatformSector")
    METRO_ISLAND_PLATFORM_SECTOR("metroIslandPlatformSector"),
    @XmlEnumValue("coachStop")
    COACH_STOP("coachStop"),
    @XmlEnumValue("busStop")
    BUS_STOP("busStop"),
    @XmlEnumValue("busPlatform")
    BUS_PLATFORM("busPlatform"),
    @XmlEnumValue("busBay")
    BUS_BAY("busBay"),
    @XmlEnumValue("tramPlatform")
    TRAM_PLATFORM("tramPlatform"),
    @XmlEnumValue("tramStop")
    TRAM_STOP("tramStop"),
    @XmlEnumValue("boatQuay")
    BOAT_QUAY("boatQuay"),
    @XmlEnumValue("ferryLanding")
    FERRY_LANDING("ferryLanding"),

    /**
     * +v1.2
     * 
     */
    @XmlEnumValue("telecabinPlatform")
    TELECABIN_PLATFORM("telecabinPlatform"),
    @XmlEnumValue("taxiStand")
    TAXI_STAND("taxiStand"),
    @XmlEnumValue("setDownPlace")
    SET_DOWN_PLACE("setDownPlace"),
    @XmlEnumValue("vehicleLoadingPlace")
    VEHICLE_LOADING_PLACE("vehicleLoadingPlace"),
    @XmlEnumValue("handicappedLevelBoardingSector")
    HANDICAPPED_LEVEL_BOARDING_SECTOR("handicappedLevelBoardingSector"),
    @XmlEnumValue("multimodal")
    MULTIMODAL("multimodal"),

    /**
     * Bus stop directly on street. This means people waiting to board will literally be standing on the street. The usual elements of a stop (pole, bank, information) usually are present at the road side. Often there are markings on the floor and sometimes also traffic lights stopping the traffic for boarding and alighting. Often the area to wait is on the side of the road and the BOARDING POSITION could indicate, where to board/alight. However, BOARDING POSITIONs are often not modeled. +v2.0
     * 
     */
    @XmlEnumValue("busStopWithinRoadwayBoarding")
    BUS_STOP_WITHIN_ROADWAY_BOARDING("busStopWithinRoadwayBoarding"),

    /**
     * Tram stop directly on street. This means people waiting to board will literally be standing on the street. The usual elements of a stop (pole, bank, information) usually are present at the road side. Often there are markings on the floor and sometimes also traffic lights stopping the traffic for boarding and alighting. Often the area to wait is on the side of the road and the BOARDING POSITION could indicate, where to board/alight. However, BOARDING POSITIONs are often not modeled. +v2.0
     * 
     */
    @XmlEnumValue("tramStopWithinRoadwayBoarding")
    TRAM_STOP_WITHIN_ROADWAY_BOARDING("tramStopWithinRoadwayBoarding"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    QuayTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuayTypeEnumeration fromValue(String v) {
        for (QuayTypeEnumeration c: QuayTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
