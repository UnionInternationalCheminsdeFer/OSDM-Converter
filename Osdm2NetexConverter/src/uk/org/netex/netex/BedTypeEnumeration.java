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
 * <p>Java-Klasse f�r BedTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BedTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="singleBed"/>
 *     &lt;enumeration value="doubleBed"/>
 *     &lt;enumeration value="bedForChild"/>
 *     &lt;enumeration value="cot"/>
 *     &lt;enumeration value="bottomBunk"/>
 *     &lt;enumeration value="middleBunk"/>
 *     &lt;enumeration value="topBunk"/>
 *     &lt;enumeration value="hammock"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BedTypeEnumeration")
@XmlEnum
public enum BedTypeEnumeration {

    @XmlEnumValue("singleBed")
    SINGLE_BED("singleBed"),
    @XmlEnumValue("doubleBed")
    DOUBLE_BED("doubleBed"),
    @XmlEnumValue("bedForChild")
    BED_FOR_CHILD("bedForChild"),
    @XmlEnumValue("cot")
    COT("cot"),
    @XmlEnumValue("bottomBunk")
    BOTTOM_BUNK("bottomBunk"),
    @XmlEnumValue("middleBunk")
    MIDDLE_BUNK("middleBunk"),
    @XmlEnumValue("topBunk")
    TOP_BUNK("topBunk"),
    @XmlEnumValue("hammock")
    HAMMOCK("hammock"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    BedTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BedTypeEnumeration fromValue(String v) {
        for (BedTypeEnumeration c: BedTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
