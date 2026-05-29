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
 * <p>Java-Klasse f�r StopPlaceWeightEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StopPlaceWeightEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="international"/>
 *     &lt;enumeration value="national"/>
 *     &lt;enumeration value="regional"/>
 *     &lt;enumeration value="local"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StopPlaceWeightEnumeration")
@XmlEnum
public enum StopPlaceWeightEnumeration {

    @XmlEnumValue("international")
    INTERNATIONAL("international"),
    @XmlEnumValue("national")
    NATIONAL("national"),
    @XmlEnumValue("regional")
    REGIONAL("regional"),
    @XmlEnumValue("local")
    LOCAL("local");
    private final String value;

    StopPlaceWeightEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopPlaceWeightEnumeration fromValue(String v) {
        for (StopPlaceWeightEnumeration c: StopPlaceWeightEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
