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
 * <p>Java-Klasse f�r NameOfClassResidentialQualificationEligibilityRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassResidentialQualificationEligibilityRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassCustomerEligibilityRefStructureType">
 *     &lt;enumeration value="ResidentialQualificationEligibility"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassResidentialQualificationEligibilityRefStructureType")
@XmlEnum(NameOfClassCustomerEligibilityRefStructureType.class)
public enum NameOfClassResidentialQualificationEligibilityRefStructureType {

    @XmlEnumValue("ResidentialQualificationEligibility")
    RESIDENTIAL_QUALIFICATION_ELIGIBILITY(NameOfClassCustomerEligibilityRefStructureType.RESIDENTIAL_QUALIFICATION_ELIGIBILITY);
    private final NameOfClassCustomerEligibilityRefStructureType value;

    NameOfClassResidentialQualificationEligibilityRefStructureType(NameOfClassCustomerEligibilityRefStructureType v) {
        value = v;
    }

    public NameOfClassCustomerEligibilityRefStructureType value() {
        return value;
    }

    public static NameOfClassResidentialQualificationEligibilityRefStructureType fromValue(NameOfClassCustomerEligibilityRefStructureType v) {
        for (NameOfClassResidentialQualificationEligibilityRefStructureType c: NameOfClassResidentialQualificationEligibilityRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
