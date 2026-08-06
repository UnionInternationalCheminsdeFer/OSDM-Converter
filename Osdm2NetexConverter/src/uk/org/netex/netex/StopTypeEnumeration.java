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
 * <p>Java-Klasse f�r StopTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StopTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="onstreetBus"/>
 *     &lt;enumeration value="onstreetTram"/>
 *     &lt;enumeration value="airport"/>
 *     &lt;enumeration value="railStation"/>
 *     &lt;enumeration value="metroStation"/>
 *     &lt;enumeration value="busStation"/>
 *     &lt;enumeration value="coachStation"/>
 *     &lt;enumeration value="tramStation"/>
 *     &lt;enumeration value="harbourPort"/>
 *     &lt;enumeration value="ferryPort"/>
 *     &lt;enumeration value="ferryStop"/>
 *     &lt;enumeration value="liftStation"/>
 *     &lt;enumeration value="vehicleRailInterchange"/>
 *     &lt;enumeration value="taxiRank"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StopTypeEnumeration")
@XmlEnum
public enum StopTypeEnumeration {

    @XmlEnumValue("onstreetBus")
    ONSTREET_BUS("onstreetBus"),
    @XmlEnumValue("onstreetTram")
    ONSTREET_TRAM("onstreetTram"),
    @XmlEnumValue("airport")
    AIRPORT("airport"),
    @XmlEnumValue("railStation")
    RAIL_STATION("railStation"),
    @XmlEnumValue("metroStation")
    METRO_STATION("metroStation"),
    @XmlEnumValue("busStation")
    BUS_STATION("busStation"),
    @XmlEnumValue("coachStation")
    COACH_STATION("coachStation"),
    @XmlEnumValue("tramStation")
    TRAM_STATION("tramStation"),
    @XmlEnumValue("harbourPort")
    HARBOUR_PORT("harbourPort"),
    @XmlEnumValue("ferryPort")
    FERRY_PORT("ferryPort"),
    @XmlEnumValue("ferryStop")
    FERRY_STOP("ferryStop"),
    @XmlEnumValue("liftStation")
    LIFT_STATION("liftStation"),
    @XmlEnumValue("vehicleRailInterchange")
    VEHICLE_RAIL_INTERCHANGE("vehicleRailInterchange"),
    @XmlEnumValue("taxiRank")
    TAXI_RANK("taxiRank"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    StopTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopTypeEnumeration fromValue(String v) {
        for (StopTypeEnumeration c: StopTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
