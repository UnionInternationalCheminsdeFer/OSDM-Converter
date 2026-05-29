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
 * <p>Java-Klasse f�r BlackoutStartEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BlackoutStartEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="mayTravelAnytime"/>
 *     &lt;enumeration value="noTravelWithinPeriod"/>
 *     &lt;enumeration value="noTravelWithinTimeband"/>
 *     &lt;enumeration value="mayCompleteIfStartedBefore"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BlackoutStartEnumeration")
@XmlEnum
public enum BlackoutStartEnumeration {

    @XmlEnumValue("mayTravelAnytime")
    MAY_TRAVEL_ANYTIME("mayTravelAnytime"),
    @XmlEnumValue("noTravelWithinPeriod")
    NO_TRAVEL_WITHIN_PERIOD("noTravelWithinPeriod"),
    @XmlEnumValue("noTravelWithinTimeband")
    NO_TRAVEL_WITHIN_TIMEBAND("noTravelWithinTimeband"),
    @XmlEnumValue("mayCompleteIfStartedBefore")
    MAY_COMPLETE_IF_STARTED_BEFORE("mayCompleteIfStartedBefore");
    private final String value;

    BlackoutStartEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BlackoutStartEnumeration fromValue(String v) {
        for (BlackoutStartEnumeration c: BlackoutStartEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
