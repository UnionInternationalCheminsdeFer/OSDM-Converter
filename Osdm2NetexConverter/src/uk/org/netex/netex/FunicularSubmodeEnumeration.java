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
 * <p>Java-Klasse f�r FunicularSubmodeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FunicularSubmodeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="funicular"/>
 *     &lt;enumeration value="streetCableCar"/>
 *     &lt;enumeration value="allFunicularServices"/>
 *     &lt;enumeration value="undefinedFunicular"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FunicularSubmodeEnumeration")
@XmlEnum
public enum FunicularSubmodeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("funicular")
    FUNICULAR("funicular"),
    @XmlEnumValue("streetCableCar")
    STREET_CABLE_CAR("streetCableCar"),
    @XmlEnumValue("allFunicularServices")
    ALL_FUNICULAR_SERVICES("allFunicularServices"),
    @XmlEnumValue("undefinedFunicular")
    UNDEFINED_FUNICULAR("undefinedFunicular");
    private final String value;

    FunicularSubmodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FunicularSubmodeEnumeration fromValue(String v) {
        for (FunicularSubmodeEnumeration c: FunicularSubmodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
