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
 * <p>Java-Klasse f�r ZoneUseEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ZoneUseEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="forbiddenZone"/>
 *     &lt;enumeration value="cannotBoardAndAlightInSameZone"/>
 *     &lt;enumeration value="cannotBoardInZone"/>
 *     &lt;enumeration value="cannotAlightInZone"/>
 *     &lt;enumeration value="mustBoardInZone"/>
 *     &lt;enumeration value="mustAlightInZone"/>
 *     &lt;enumeration value="passThroughUseOnly"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ZoneUseEnumeration")
@XmlEnum
public enum ZoneUseEnumeration {


    /**
     * Zone may not be entered. +v1.2.2
     * 
     */
    @XmlEnumValue("forbiddenZone")
    FORBIDDEN_ZONE("forbiddenZone"),

    /**
     * Cannot board and alight within the same zone.
     * 
     */
    @XmlEnumValue("cannotBoardAndAlightInSameZone")
    CANNOT_BOARD_AND_ALIGHT_IN_SAME_ZONE("cannotBoardAndAlightInSameZone"),

    /**
     * May not board in zone. +v1.2.2
     * 
     */
    @XmlEnumValue("cannotBoardInZone")
    CANNOT_BOARD_IN_ZONE("cannotBoardInZone"),

    /**
     * May not alight in zone. +v1.2.2
     * 
     */
    @XmlEnumValue("cannotAlightInZone")
    CANNOT_ALIGHT_IN_ZONE("cannotAlightInZone"),

    /**
     * Must board in Zone. +v1.2.2
     * 
     */
    @XmlEnumValue("mustBoardInZone")
    MUST_BOARD_IN_ZONE("mustBoardInZone"),

    /**
     * Must alight in zone. +v1.2.2
     * 
     */
    @XmlEnumValue("mustAlightInZone")
    MUST_ALIGHT_IN_ZONE("mustAlightInZone"),

    /**
     * May only pass through zone. +v1.2.2
     * 
     */
    @XmlEnumValue("passThroughUseOnly")
    PASS_THROUGH_USE_ONLY("passThroughUseOnly"),

    /**
     * Other rule.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ZoneUseEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZoneUseEnumeration fromValue(String v) {
        for (ZoneUseEnumeration c: ZoneUseEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
