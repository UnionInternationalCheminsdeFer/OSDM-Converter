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
 * <p>Java-Klasse f�r CycleStorageEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CycleStorageEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="racks"/>
 *     &lt;enumeration value="docks"/>
 *     &lt;enumeration value="bars"/>
 *     &lt;enumeration value="railings"/>
 *     &lt;enumeration value="cycleScheme"/>
 *     &lt;enumeration value="lockers"/>
 *     &lt;enumeration value="freestanding"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CycleStorageEnumeration")
@XmlEnum
public enum CycleStorageEnumeration {

    @XmlEnumValue("racks")
    RACKS("racks"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("docks")
    DOCKS("docks"),
    @XmlEnumValue("bars")
    BARS("bars"),
    @XmlEnumValue("railings")
    RAILINGS("railings"),
    @XmlEnumValue("cycleScheme")
    CYCLE_SCHEME("cycleScheme"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("lockers")
    LOCKERS("lockers"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("freestanding")
    FREESTANDING("freestanding"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CycleStorageEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CycleStorageEnumeration fromValue(String v) {
        for (CycleStorageEnumeration c: CycleStorageEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
