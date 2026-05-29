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
 * <p>Java-Klasse f�r TactileGuidingStripStatusEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TactileGuidingStripStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="goodAndContrasted"/>
 *     &lt;enumeration value="primitive"/>
 *     &lt;enumeration value="incorrect"/>
 *     &lt;enumeration value="bad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TactileGuidingStripStatusEnumeration")
@XmlEnum
public enum TactileGuidingStripStatusEnumeration {


    /**
     * When the guiding strip has the expected quality level.
     * 
     */
    @XmlEnumValue("goodAndContrasted")
    GOOD_AND_CONTRASTED("goodAndContrasted"),

    /**
     * When there is no guiding strip as such but a decorative element or ledge can be used for this purpose.
     * 
     */
    @XmlEnumValue("primitive")
    PRIMITIVE("primitive"),

    /**
     * When there is a guiding strip but it does not correspond to a path that can actually be used (passes through the middle of an obstacle without going around it for example).
     * 
     */
    @XmlEnumValue("incorrect")
    INCORRECT("incorrect"),

    /**
     * When the guiding strip is degraded and difficult to interpret.
     * 
     */
    @XmlEnumValue("bad")
    BAD("bad");
    private final String value;

    TactileGuidingStripStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TactileGuidingStripStatusEnumeration fromValue(String v) {
        for (TactileGuidingStripStatusEnumeration c: TactileGuidingStripStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
