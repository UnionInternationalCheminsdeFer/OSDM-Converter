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
 * <p>Java-Klasse f�r FlexibleOperationTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FlexibleOperationTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="flexibleRoute"/>
 *     &lt;enumeration value="flexibleArea"/>
 *     &lt;enumeration value="demandResponsive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlexibleOperationTypeEnumeration")
@XmlEnum
public enum FlexibleOperationTypeEnumeration {

    @XmlEnumValue("flexibleRoute")
    FLEXIBLE_ROUTE("flexibleRoute"),
    @XmlEnumValue("flexibleArea")
    FLEXIBLE_AREA("flexibleArea"),
    @XmlEnumValue("demandResponsive")
    DEMAND_RESPONSIVE("demandResponsive");
    private final String value;

    FlexibleOperationTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlexibleOperationTypeEnumeration fromValue(String v) {
        for (FlexibleOperationTypeEnumeration c: FlexibleOperationTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
