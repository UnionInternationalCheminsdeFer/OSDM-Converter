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
 * <p>Java-Klasse f�r DeckEntranceTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DeckEntranceTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="external"/>
 *     &lt;enumeration value="communicating"/>
 *     &lt;enumeration value="internal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeckEntranceTypeEnumeration")
@XmlEnum
public enum DeckEntranceTypeEnumeration {


    /**
     * Door gives external access to VEHICLE.
     * 
     */
    @XmlEnumValue("external")
    EXTERNAL("external"),
    @XmlEnumValue("communicating")
    COMMUNICATING("communicating"),
    @XmlEnumValue("internal")
    INTERNAL("internal");
    private final String value;

    DeckEntranceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeckEntranceTypeEnumeration fromValue(String v) {
        for (DeckEntranceTypeEnumeration c: DeckEntranceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
