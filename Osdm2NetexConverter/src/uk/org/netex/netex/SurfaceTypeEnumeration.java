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
 * <p>Java-Klasse f�r SurfaceTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SurfaceTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="asphalt"/>
 *     &lt;enumeration value="bricks"/>
 *     &lt;enumeration value="cobbles"/>
 *     &lt;enumeration value="earth"/>
 *     &lt;enumeration value="grass"/>
 *     &lt;enumeration value="looseSurface"/>
 *     &lt;enumeration value="pavingStones"/>
 *     &lt;enumeration value="roughSurface"/>
 *     &lt;enumeration value="smooth"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SurfaceTypeEnumeration")
@XmlEnum
public enum SurfaceTypeEnumeration {

    @XmlEnumValue("asphalt")
    ASPHALT("asphalt"),
    @XmlEnumValue("bricks")
    BRICKS("bricks"),
    @XmlEnumValue("cobbles")
    COBBLES("cobbles"),
    @XmlEnumValue("earth")
    EARTH("earth"),
    @XmlEnumValue("grass")
    GRASS("grass"),
    @XmlEnumValue("looseSurface")
    LOOSE_SURFACE("looseSurface"),
    @XmlEnumValue("pavingStones")
    PAVING_STONES("pavingStones"),
    @XmlEnumValue("roughSurface")
    ROUGH_SURFACE("roughSurface"),
    @XmlEnumValue("smooth")
    SMOOTH("smooth"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SurfaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurfaceTypeEnumeration fromValue(String v) {
        for (SurfaceTypeEnumeration c: SurfaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
