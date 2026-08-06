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
 * <p>Java-Klasse f�r TableTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TableTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="fixedFlat"/>
 *     &lt;enumeration value="foldDownFlat"/>
 *     &lt;enumeration value="seatBackFolding"/>
 *     &lt;enumeration value="armRestFolding"/>
 *     &lt;enumeration value="seatClipon"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TableTypeEnumeration")
@XmlEnum
public enum TableTypeEnumeration {


    /**
     * No table.
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Table is fixed horizontal in front of seat.
     * 
     */
    @XmlEnumValue("fixedFlat")
    FIXED_FLAT("fixedFlat"),

    /**
     * Table folds fown to be horizontal in front of seat.
     * 
     */
    @XmlEnumValue("foldDownFlat")
    FOLD_DOWN_FLAT("foldDownFlat"),

    /**
     * Table folds down from seat back in front.
     * 
     */
    @XmlEnumValue("seatBackFolding")
    SEAT_BACK_FOLDING("seatBackFolding"),

    /**
     * Table folds out from arm rest.
     * 
     */
    @XmlEnumValue("armRestFolding")
    ARM_REST_FOLDING("armRestFolding"),

    /**
     * Table clips on to seat arm rests.
     * 
     */
    @XmlEnumValue("seatClipon")
    SEAT_CLIPON("seatClipon"),

    /**
     * Other type of table.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * Unknown whether there is table.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TableTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TableTypeEnumeration fromValue(String v) {
        for (TableTypeEnumeration c: TableTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
