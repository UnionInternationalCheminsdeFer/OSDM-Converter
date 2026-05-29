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
 * <p>Java-Klasse f�r VehicleLoadingEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleLoadingEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="loading"/>
 *     &lt;enumeration value="unloading"/>
 *     &lt;enumeration value="additionalLoading"/>
 *     &lt;enumeration value="additionaUnloading"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleLoadingEnumeration")
@XmlEnum
public enum VehicleLoadingEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("loading")
    LOADING("loading"),
    @XmlEnumValue("unloading")
    UNLOADING("unloading"),
    @XmlEnumValue("additionalLoading")
    ADDITIONAL_LOADING("additionalLoading"),
    @XmlEnumValue("additionaUnloading")
    ADDITIONA_UNLOADING("additionaUnloading"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    VehicleLoadingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleLoadingEnumeration fromValue(String v) {
        for (VehicleLoadingEnumeration c: VehicleLoadingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
