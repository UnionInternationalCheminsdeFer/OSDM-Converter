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
 * <p>Java-Klasse f�r AccommodationFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AccommodationFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="standing"/>
 *     &lt;enumeration value="seating"/>
 *     &lt;enumeration value="sleeper"/>
 *     &lt;enumeration value="singleSleeper"/>
 *     &lt;enumeration value="doubleSleeper"/>
 *     &lt;enumeration value="specialSleeper"/>
 *     &lt;enumeration value="couchette"/>
 *     &lt;enumeration value="singleCouchette"/>
 *     &lt;enumeration value="doubleCouchette"/>
 *     &lt;enumeration value="specialSeating"/>
 *     &lt;enumeration value="recliningSeats"/>
 *     &lt;enumeration value="babyCompartment"/>
 *     &lt;enumeration value="familyCarriage"/>
 *     &lt;enumeration value="recreationArea"/>
 *     &lt;enumeration value="panoramaCoach"/>
 *     &lt;enumeration value="pullmanCoach"/>
 *     &lt;enumeration value="pushchair"/>
 *     &lt;enumeration value="wheelchair"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccommodationFacilityEnumeration")
@XmlEnum
public enum AccommodationFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("standing")
    STANDING("standing"),
    @XmlEnumValue("seating")
    SEATING("seating"),
    @XmlEnumValue("sleeper")
    SLEEPER("sleeper"),
    @XmlEnumValue("singleSleeper")
    SINGLE_SLEEPER("singleSleeper"),
    @XmlEnumValue("doubleSleeper")
    DOUBLE_SLEEPER("doubleSleeper"),
    @XmlEnumValue("specialSleeper")
    SPECIAL_SLEEPER("specialSleeper"),
    @XmlEnumValue("couchette")
    COUCHETTE("couchette"),
    @XmlEnumValue("singleCouchette")
    SINGLE_COUCHETTE("singleCouchette"),
    @XmlEnumValue("doubleCouchette")
    DOUBLE_COUCHETTE("doubleCouchette"),
    @XmlEnumValue("specialSeating")
    SPECIAL_SEATING("specialSeating"),
    @XmlEnumValue("recliningSeats")
    RECLINING_SEATS("recliningSeats"),
    @XmlEnumValue("babyCompartment")
    BABY_COMPARTMENT("babyCompartment"),
    @XmlEnumValue("familyCarriage")
    FAMILY_CARRIAGE("familyCarriage"),
    @XmlEnumValue("recreationArea")
    RECREATION_AREA("recreationArea"),
    @XmlEnumValue("panoramaCoach")
    PANORAMA_COACH("panoramaCoach"),
    @XmlEnumValue("pullmanCoach")
    PULLMAN_COACH("pullmanCoach"),
    @XmlEnumValue("pushchair")
    PUSHCHAIR("pushchair"),
    @XmlEnumValue("wheelchair")
    WHEELCHAIR("wheelchair");
    private final String value;

    AccommodationFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccommodationFacilityEnumeration fromValue(String v) {
        for (AccommodationFacilityEnumeration c: AccommodationFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
