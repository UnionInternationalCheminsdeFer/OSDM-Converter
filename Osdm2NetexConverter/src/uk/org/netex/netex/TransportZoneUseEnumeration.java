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
 * <p>Java-Klasse f�r TransportZoneUseEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TransportZoneUseEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allUsesAllowed"/>
 *     &lt;enumeration value="forbiddenZone"/>
 *     &lt;enumeration value="cannotPickUpAndDropOffInSameZone"/>
 *     &lt;enumeration value="cannotPickUpInZone"/>
 *     &lt;enumeration value="cannotDropOffInZone"/>
 *     &lt;enumeration value="mustPickUpInZone"/>
 *     &lt;enumeration value="mustDropOffInZone"/>
 *     &lt;enumeration value="mustPickUpAndDropOffInSameZone"/>
 *     &lt;enumeration value="noPassThrough"/>
 *     &lt;enumeration value="passThroughUseOnly"/>
 *     &lt;enumeration value="mustPickUpAndDropOffAtSameStop"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransportZoneUseEnumeration")
@XmlEnum
public enum TransportZoneUseEnumeration {

    @XmlEnumValue("allUsesAllowed")
    ALL_USES_ALLOWED("allUsesAllowed"),
    @XmlEnumValue("forbiddenZone")
    FORBIDDEN_ZONE("forbiddenZone"),
    @XmlEnumValue("cannotPickUpAndDropOffInSameZone")
    CANNOT_PICK_UP_AND_DROP_OFF_IN_SAME_ZONE("cannotPickUpAndDropOffInSameZone"),
    @XmlEnumValue("cannotPickUpInZone")
    CANNOT_PICK_UP_IN_ZONE("cannotPickUpInZone"),
    @XmlEnumValue("cannotDropOffInZone")
    CANNOT_DROP_OFF_IN_ZONE("cannotDropOffInZone"),
    @XmlEnumValue("mustPickUpInZone")
    MUST_PICK_UP_IN_ZONE("mustPickUpInZone"),
    @XmlEnumValue("mustDropOffInZone")
    MUST_DROP_OFF_IN_ZONE("mustDropOffInZone"),
    @XmlEnumValue("mustPickUpAndDropOffInSameZone")
    MUST_PICK_UP_AND_DROP_OFF_IN_SAME_ZONE("mustPickUpAndDropOffInSameZone"),
    @XmlEnumValue("noPassThrough")
    NO_PASS_THROUGH("noPassThrough"),
    @XmlEnumValue("passThroughUseOnly")
    PASS_THROUGH_USE_ONLY("passThroughUseOnly"),

    /**
     * Zones where vehicles must be returned to the same stop. +v2.0
     * 
     */
    @XmlEnumValue("mustPickUpAndDropOffAtSameStop")
    MUST_PICK_UP_AND_DROP_OFF_AT_SAME_STOP("mustPickUpAndDropOffAtSameStop"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TransportZoneUseEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransportZoneUseEnumeration fromValue(String v) {
        for (TransportZoneUseEnumeration c: TransportZoneUseEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
