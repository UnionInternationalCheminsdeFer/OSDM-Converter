//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r RelativeOperatorEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RelativeOperatorEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="EQ"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="LE"/>
 *     &lt;enumeration value="LT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelativeOperatorEnumeration")
@XmlEnum
public enum RelativeOperatorEnumeration {


    /**
     * Parameter value must have same identity, or have value equal to a quantitative value associated with specified item.
     * 
     */
    EQ,

    /**
     * Parameter value must not have same identity, or have value different from a quantitative value associated with specified item.
     * 
     */
    NE,

    /**
     * Parameter value must be greater than or equal to a quantitative value associated with specified item.
     * 
     */
    GE,

    /**
     * Parameter value must be greater than a quantitative value associated with specified item.
     * 
     */
    GT,

    /**
     * Parameter value must be less than or equal to a quantitative value associated with specified item.
     * 
     */
    LE,

    /**
     * Parameter value must be less than a quantitative value associated with specified item.
     * 
     */
    LT;

    public String value() {
        return name();
    }

    public static RelativeOperatorEnumeration fromValue(String v) {
        return valueOf(v);
    }

}
