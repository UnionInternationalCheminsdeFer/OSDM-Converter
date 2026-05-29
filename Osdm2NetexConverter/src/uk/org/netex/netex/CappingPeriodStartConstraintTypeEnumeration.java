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
 * <p>Java-Klasse f�r CappingPeriodStartConstraintTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CappingPeriodStartConstraintTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="variable"/>
 *     &lt;enumeration value="fixed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CappingPeriodStartConstraintTypeEnumeration")
@XmlEnum
public enum CappingPeriodStartConstraintTypeEnumeration {


    /**
     * Validty start date can be chosen by user.
     * 
     */
    @XmlEnumValue("variable")
    VARIABLE("variable"),

    /**
     * Validity start dtae is constrained to certain days of week, month or year.
     * 
     */
    @XmlEnumValue("fixed")
    FIXED("fixed");
    private final String value;

    CappingPeriodStartConstraintTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CappingPeriodStartConstraintTypeEnumeration fromValue(String v) {
        for (CappingPeriodStartConstraintTypeEnumeration c: CappingPeriodStartConstraintTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
