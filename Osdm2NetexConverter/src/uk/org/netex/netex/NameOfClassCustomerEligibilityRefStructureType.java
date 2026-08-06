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
 * <p>Java-Klasse f�r NameOfClassCustomerEligibilityRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassCustomerEligibilityRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="CommercialProfileEligibility"/>
 *     &lt;enumeration value="ResidentialQualificationEligibility"/>
 *     &lt;enumeration value="UserProfileEligibility"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassCustomerEligibilityRefStructureType")
@XmlEnum
public enum NameOfClassCustomerEligibilityRefStructureType {

    @XmlEnumValue("CommercialProfileEligibility")
    COMMERCIAL_PROFILE_ELIGIBILITY("CommercialProfileEligibility"),
    @XmlEnumValue("ResidentialQualificationEligibility")
    RESIDENTIAL_QUALIFICATION_ELIGIBILITY("ResidentialQualificationEligibility"),
    @XmlEnumValue("UserProfileEligibility")
    USER_PROFILE_ELIGIBILITY("UserProfileEligibility");
    private final String value;

    NameOfClassCustomerEligibilityRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassCustomerEligibilityRefStructureType fromValue(String v) {
        for (NameOfClassCustomerEligibilityRefStructureType c: NameOfClassCustomerEligibilityRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
