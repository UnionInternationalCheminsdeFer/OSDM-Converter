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
 * <p>Java-Klasse f�r FlooringTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FlooringTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="carpet"/>
 *     &lt;enumeration value="concrete"/>
 *     &lt;enumeration value="asphalt"/>
 *     &lt;enumeration value="cork"/>
 *     &lt;enumeration value="fibreglassGrating"/>
 *     &lt;enumeration value="glazedCeramicTiles"/>
 *     &lt;enumeration value="plasticMatting"/>
 *     &lt;enumeration value="ceramicTiles"/>
 *     &lt;enumeration value="rubber"/>
 *     &lt;enumeration value="steelPlate"/>
 *     &lt;enumeration value="vinyl"/>
 *     &lt;enumeration value="wood"/>
 *     &lt;enumeration value="stone"/>
 *     &lt;enumeration value="grass"/>
 *     &lt;enumeration value="earth"/>
 *     &lt;enumeration value="gravel"/>
 *     &lt;enumeration value="uneven"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlooringTypeEnumeration")
@XmlEnum
public enum FlooringTypeEnumeration {

    @XmlEnumValue("carpet")
    CARPET("carpet"),
    @XmlEnumValue("concrete")
    CONCRETE("concrete"),
    @XmlEnumValue("asphalt")
    ASPHALT("asphalt"),
    @XmlEnumValue("cork")
    CORK("cork"),
    @XmlEnumValue("fibreglassGrating")
    FIBREGLASS_GRATING("fibreglassGrating"),
    @XmlEnumValue("glazedCeramicTiles")
    GLAZED_CERAMIC_TILES("glazedCeramicTiles"),
    @XmlEnumValue("plasticMatting")
    PLASTIC_MATTING("plasticMatting"),
    @XmlEnumValue("ceramicTiles")
    CERAMIC_TILES("ceramicTiles"),
    @XmlEnumValue("rubber")
    RUBBER("rubber"),
    @XmlEnumValue("steelPlate")
    STEEL_PLATE("steelPlate"),
    @XmlEnumValue("vinyl")
    VINYL("vinyl"),
    @XmlEnumValue("wood")
    WOOD("wood"),
    @XmlEnumValue("stone")
    STONE("stone"),
    @XmlEnumValue("grass")
    GRASS("grass"),
    @XmlEnumValue("earth")
    EARTH("earth"),
    @XmlEnumValue("gravel")
    GRAVEL("gravel"),
    @XmlEnumValue("uneven")
    UNEVEN("uneven"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    FlooringTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlooringTypeEnumeration fromValue(String v) {
        for (FlooringTypeEnumeration c: FlooringTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
