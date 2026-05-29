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
 * <p>Java-Klasse f�r LogicalOperationEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LogicalOperationEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="NOT"/>
 *     &lt;enumeration value="XOR"/>
 *     &lt;enumeration value="NAND"/>
 *     &lt;enumeration value="NOR"/>
 *     &lt;enumeration value="XNOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LogicalOperationEnumeration")
@XmlEnum
public enum LogicalOperationEnumeration {


    /**
     * Successive elements are logically ANDed together; comparison must satisfy all specified values.
     * 
     */
    AND,

    /**
     * Successive elements are logically ORed together; comparison must satisfy at least one specified value.
     * 
     */
    OR,

    /**
     * Specified elements must be different from the given value. If the number of specified elements is equal to 1, the function negates it. If the number of specified elements > 1, this operator is equal to the NOR operator
     * 
     */
    NOT,

    /**
     * Successive elements are logically ORed together; comparison must satisfy only one specified value.
     * 
     */
    XOR,

    /**
     * Successive elements are logically ANDed together; comparison must satisfy all specified values. The result is then negated. +v1.2.2
     * 
     */
    NAND,

    /**
     * Successive elements are logically ORed together; comparison must satisfy at least one specified value. The result is then negated. +v1.2.2
     * 
     */
    NOR,

    /**
     * Successive elements are logically ORed together; comparison must satisfy only one specified value. The result is then negated. +v1.2.2
     * 
     */
    XNOR;

    public String value() {
        return name();
    }

    public static LogicalOperationEnumeration fromValue(String v) {
        return valueOf(v);
    }

}
