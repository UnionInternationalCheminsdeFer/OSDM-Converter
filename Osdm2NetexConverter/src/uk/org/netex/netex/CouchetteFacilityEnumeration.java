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
 * <p>Java-Klasse f�r CouchetteFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CouchetteFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="T2"/>
 *     &lt;enumeration value="T3"/>
 *     &lt;enumeration value="C1"/>
 *     &lt;enumeration value="C2"/>
 *     &lt;enumeration value="C4"/>
 *     &lt;enumeration value="C5"/>
 *     &lt;enumeration value="C6"/>
 *     &lt;enumeration value="wheelchair"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CouchetteFacilityEnumeration")
@XmlEnum
public enum CouchetteFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("T2")
    T_2("T2"),
    @XmlEnumValue("T3")
    T_3("T3"),
    @XmlEnumValue("C1")
    C_1("C1"),
    @XmlEnumValue("C2")
    C_2("C2"),
    @XmlEnumValue("C4")
    C_4("C4"),

    /**
     * pti23_4_1
     * 
     */
    @XmlEnumValue("C5")
    C_5("C5"),
    @XmlEnumValue("C6")
    C_6("C6"),
    @XmlEnumValue("wheelchair")
    WHEELCHAIR("wheelchair"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CouchetteFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CouchetteFacilityEnumeration fromValue(String v) {
        for (CouchetteFacilityEnumeration c: CouchetteFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
