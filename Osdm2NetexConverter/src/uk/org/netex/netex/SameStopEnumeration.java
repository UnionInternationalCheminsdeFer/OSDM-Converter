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
 * <p>Java-Klasse f�r SameStopEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SameStopEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="any"/>
 *     &lt;enumeration value="sameAsOrigin"/>
 *     &lt;enumeration value="sameAsDestination"/>
 *     &lt;enumeration value="sameAsOriginOrDestination"/>
 *     &lt;enumeration value="anyStopOnRoute"/>
 *     &lt;enumeration value="anyStopInZone"/>
 *     &lt;enumeration value="different"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SameStopEnumeration")
@XmlEnum
public enum SameStopEnumeration {

    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("sameAsOrigin")
    SAME_AS_ORIGIN("sameAsOrigin"),
    @XmlEnumValue("sameAsDestination")
    SAME_AS_DESTINATION("sameAsDestination"),
    @XmlEnumValue("sameAsOriginOrDestination")
    SAME_AS_ORIGIN_OR_DESTINATION("sameAsOriginOrDestination"),
    @XmlEnumValue("anyStopOnRoute")
    ANY_STOP_ON_ROUTE("anyStopOnRoute"),
    @XmlEnumValue("anyStopInZone")
    ANY_STOP_IN_ZONE("anyStopInZone"),
    @XmlEnumValue("different")
    DIFFERENT("different");
    private final String value;

    SameStopEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SameStopEnumeration fromValue(String v) {
        for (SameStopEnumeration c: SameStopEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
