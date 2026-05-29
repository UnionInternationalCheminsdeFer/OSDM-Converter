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
 * <p>Java-Klasse f�r TramSubmodeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TramSubmodeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="cityTram"/>
 *     &lt;enumeration value="localTram"/>
 *     &lt;enumeration value="regionalTram"/>
 *     &lt;enumeration value="sightseeingTram"/>
 *     &lt;enumeration value="shuttleTram"/>
 *     &lt;enumeration value="trainTram"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TramSubmodeEnumeration")
@XmlEnum
public enum TramSubmodeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("cityTram")
    CITY_TRAM("cityTram"),
    @XmlEnumValue("localTram")
    LOCAL_TRAM("localTram"),
    @XmlEnumValue("regionalTram")
    REGIONAL_TRAM("regionalTram"),
    @XmlEnumValue("sightseeingTram")
    SIGHTSEEING_TRAM("sightseeingTram"),
    @XmlEnumValue("shuttleTram")
    SHUTTLE_TRAM("shuttleTram"),
    @XmlEnumValue("trainTram")
    TRAIN_TRAM("trainTram");
    private final String value;

    TramSubmodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TramSubmodeEnumeration fromValue(String v) {
        for (TramSubmodeEnumeration c: TramSubmodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
