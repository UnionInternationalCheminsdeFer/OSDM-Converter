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
 * <p>Java-Klasse f�r ServicedOrganisationTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ServicedOrganisationTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="school"/>
 *     &lt;enumeration value="college"/>
 *     &lt;enumeration value="university"/>
 *     &lt;enumeration value="militaryBase"/>
 *     &lt;enumeration value="works"/>
 *     &lt;enumeration value="retaiilCentre"/>
 *     &lt;enumeration value="hospital"/>
 *     &lt;enumeration value="governmentOffice"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServicedOrganisationTypeEnumeration")
@XmlEnum
public enum ServicedOrganisationTypeEnumeration {

    @XmlEnumValue("school")
    SCHOOL("school"),
    @XmlEnumValue("college")
    COLLEGE("college"),
    @XmlEnumValue("university")
    UNIVERSITY("university"),
    @XmlEnumValue("militaryBase")
    MILITARY_BASE("militaryBase"),
    @XmlEnumValue("works")
    WORKS("works"),
    @XmlEnumValue("retaiilCentre")
    RETAIIL_CENTRE("retaiilCentre"),
    @XmlEnumValue("hospital")
    HOSPITAL("hospital"),
    @XmlEnumValue("governmentOffice")
    GOVERNMENT_OFFICE("governmentOffice"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ServicedOrganisationTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServicedOrganisationTypeEnumeration fromValue(String v) {
        for (ServicedOrganisationTypeEnumeration c: ServicedOrganisationTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
