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
 * <p>Java-Klasse f�r ResidenceTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ResidenceTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="live"/>
 *     &lt;enumeration value="work"/>
 *     &lt;enumeration value="study"/>
 *     &lt;enumeration value="exchange"/>
 *     &lt;enumeration value="born"/>
 *     &lt;enumeration value="nonResident"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResidenceTypeEnumeration")
@XmlEnum
public enum ResidenceTypeEnumeration {

    @XmlEnumValue("live")
    LIVE("live"),
    @XmlEnumValue("work")
    WORK("work"),
    @XmlEnumValue("study")
    STUDY("study"),
    @XmlEnumValue("exchange")
    EXCHANGE("exchange"),
    @XmlEnumValue("born")
    BORN("born"),
    @XmlEnumValue("nonResident")
    NON_RESIDENT("nonResident");
    private final String value;

    ResidenceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResidenceTypeEnumeration fromValue(String v) {
        for (ResidenceTypeEnumeration c: ResidenceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
