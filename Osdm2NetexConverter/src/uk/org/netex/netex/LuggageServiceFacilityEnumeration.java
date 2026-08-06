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
 * <p>Java-Klasse f�r LuggageServiceFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LuggageServiceFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="leftLuggage"/>
 *     &lt;enumeration value="porterage"/>
 *     &lt;enumeration value="freeTrolleys"/>
 *     &lt;enumeration value="paidTrolleys"/>
 *     &lt;enumeration value="collectAndDeliverToStation"/>
 *     &lt;enumeration value="baggageCheckInCheckOut"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LuggageServiceFacilityEnumeration")
@XmlEnum
public enum LuggageServiceFacilityEnumeration {

    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("leftLuggage")
    LEFT_LUGGAGE("leftLuggage"),
    @XmlEnumValue("porterage")
    PORTERAGE("porterage"),
    @XmlEnumValue("freeTrolleys")
    FREE_TROLLEYS("freeTrolleys"),
    @XmlEnumValue("paidTrolleys")
    PAID_TROLLEYS("paidTrolleys"),
    @XmlEnumValue("collectAndDeliverToStation")
    COLLECT_AND_DELIVER_TO_STATION("collectAndDeliverToStation"),
    @XmlEnumValue("baggageCheckInCheckOut")
    BAGGAGE_CHECK_IN_CHECK_OUT("baggageCheckInCheckOut");
    private final String value;

    LuggageServiceFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuggageServiceFacilityEnumeration fromValue(String v) {
        for (LuggageServiceFacilityEnumeration c: LuggageServiceFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
