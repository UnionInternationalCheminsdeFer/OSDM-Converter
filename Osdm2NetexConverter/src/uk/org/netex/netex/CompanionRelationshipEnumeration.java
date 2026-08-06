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
 * <p>Java-Klasse f�r CompanionRelationshipEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanionRelationshipEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="anyone"/>
 *     &lt;enumeration value="parent"/>
 *     &lt;enumeration value="grandparent"/>
 *     &lt;enumeration value="child"/>
 *     &lt;enumeration value="grandchild"/>
 *     &lt;enumeration value="family"/>
 *     &lt;enumeration value="spouse"/>
 *     &lt;enumeration value="partner"/>
 *     &lt;enumeration value="dependent"/>
 *     &lt;enumeration value="colleague"/>
 *     &lt;enumeration value="pupil"/>
 *     &lt;enumeration value="teacher"/>
 *     &lt;enumeration value="carer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompanionRelationshipEnumeration")
@XmlEnum
public enum CompanionRelationshipEnumeration {

    @XmlEnumValue("anyone")
    ANYONE("anyone"),
    @XmlEnumValue("parent")
    PARENT("parent"),
    @XmlEnumValue("grandparent")
    GRANDPARENT("grandparent"),
    @XmlEnumValue("child")
    CHILD("child"),
    @XmlEnumValue("grandchild")
    GRANDCHILD("grandchild"),
    @XmlEnumValue("family")
    FAMILY("family"),
    @XmlEnumValue("spouse")
    SPOUSE("spouse"),
    @XmlEnumValue("partner")
    PARTNER("partner"),
    @XmlEnumValue("dependent")
    DEPENDENT("dependent"),
    @XmlEnumValue("colleague")
    COLLEAGUE("colleague"),
    @XmlEnumValue("pupil")
    PUPIL("pupil"),
    @XmlEnumValue("teacher")
    TEACHER("teacher"),
    @XmlEnumValue("carer")
    CARER("carer");
    private final String value;

    CompanionRelationshipEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanionRelationshipEnumeration fromValue(String v) {
        for (CompanionRelationshipEnumeration c: CompanionRelationshipEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
