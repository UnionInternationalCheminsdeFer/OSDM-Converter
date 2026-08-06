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
 * <p>Java-Klasse f�r SameZoneEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SameZoneEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="any"/>
 *     &lt;enumeration value="same"/>
 *     &lt;enumeration value="sameAsOrigin"/>
 *     &lt;enumeration value="sameAsDestination"/>
 *     &lt;enumeration value="sameAsOriginOrDestination"/>
 *     &lt;enumeration value="within"/>
 *     &lt;enumeration value="containing"/>
 *     &lt;enumeration value="equivalent"/>
 *     &lt;enumeration value="different"/>
 *     &lt;enumeration value="neighbouring"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SameZoneEnumeration")
@XmlEnum
public enum SameZoneEnumeration {

    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("same")
    SAME("same"),
    @XmlEnumValue("sameAsOrigin")
    SAME_AS_ORIGIN("sameAsOrigin"),
    @XmlEnumValue("sameAsDestination")
    SAME_AS_DESTINATION("sameAsDestination"),
    @XmlEnumValue("sameAsOriginOrDestination")
    SAME_AS_ORIGIN_OR_DESTINATION("sameAsOriginOrDestination"),
    @XmlEnumValue("within")
    WITHIN("within"),
    @XmlEnumValue("containing")
    CONTAINING("containing"),
    @XmlEnumValue("equivalent")
    EQUIVALENT("equivalent"),
    @XmlEnumValue("different")
    DIFFERENT("different"),

    /**
     * The Zone mus be connected (neighbour) to at least one already allowed. +v2.0
     * 
     */
    @XmlEnumValue("neighbouring")
    NEIGHBOURING("neighbouring");
    private final String value;

    SameZoneEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SameZoneEnumeration fromValue(String v) {
        for (SameZoneEnumeration c: SameZoneEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
