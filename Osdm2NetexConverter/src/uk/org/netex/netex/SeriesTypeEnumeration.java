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
 * <p>Java-Klasse f�r SeriesTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SeriesTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="stationToStation"/>
 *     &lt;enumeration value="originToBorder"/>
 *     &lt;enumeration value="borderToDestination"/>
 *     &lt;enumeration value="border"/>
 *     &lt;enumeration value="transit"/>
 *     &lt;enumeration value="zoneToZone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeriesTypeEnumeration")
@XmlEnum
public enum SeriesTypeEnumeration {

    @XmlEnumValue("stationToStation")
    STATION_TO_STATION("stationToStation"),
    @XmlEnumValue("originToBorder")
    ORIGIN_TO_BORDER("originToBorder"),
    @XmlEnumValue("borderToDestination")
    BORDER_TO_DESTINATION("borderToDestination"),
    @XmlEnumValue("border")
    BORDER("border"),
    @XmlEnumValue("transit")
    TRANSIT("transit"),
    @XmlEnumValue("zoneToZone")
    ZONE_TO_ZONE("zoneToZone");
    private final String value;

    SeriesTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeriesTypeEnumeration fromValue(String v) {
        for (SeriesTypeEnumeration c: SeriesTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
