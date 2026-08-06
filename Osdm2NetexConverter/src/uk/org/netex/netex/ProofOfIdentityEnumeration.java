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
 * <p>Java-Klasse f�r ProofOfIdentityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ProofOfIdentityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="noneRequired"/>
 *     &lt;enumeration value="creditCard"/>
 *     &lt;enumeration value="passport"/>
 *     &lt;enumeration value="drivingLicence"/>
 *     &lt;enumeration value="birthCertificate"/>
 *     &lt;enumeration value="membershipCard"/>
 *     &lt;enumeration value="identityDocument"/>
 *     &lt;enumeration value="medicalDocument"/>
 *     &lt;enumeration value="studentCard"/>
 *     &lt;enumeration value="letterWIthAddress"/>
 *     &lt;enumeration value="mobileDevice"/>
 *     &lt;enumeration value="emailAccount"/>
 *     &lt;enumeration value="measurement"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProofOfIdentityEnumeration")
@XmlEnum
public enum ProofOfIdentityEnumeration {

    @XmlEnumValue("noneRequired")
    NONE_REQUIRED("noneRequired"),
    @XmlEnumValue("creditCard")
    CREDIT_CARD("creditCard"),
    @XmlEnumValue("passport")
    PASSPORT("passport"),
    @XmlEnumValue("drivingLicence")
    DRIVING_LICENCE("drivingLicence"),
    @XmlEnumValue("birthCertificate")
    BIRTH_CERTIFICATE("birthCertificate"),
    @XmlEnumValue("membershipCard")
    MEMBERSHIP_CARD("membershipCard"),
    @XmlEnumValue("identityDocument")
    IDENTITY_DOCUMENT("identityDocument"),
    @XmlEnumValue("medicalDocument")
    MEDICAL_DOCUMENT("medicalDocument"),
    @XmlEnumValue("studentCard")
    STUDENT_CARD("studentCard"),
    @XmlEnumValue("letterWIthAddress")
    LETTER_W_ITH_ADDRESS("letterWIthAddress"),
    @XmlEnumValue("mobileDevice")
    MOBILE_DEVICE("mobileDevice"),
    @XmlEnumValue("emailAccount")
    EMAIL_ACCOUNT("emailAccount"),
    @XmlEnumValue("measurement")
    MEASUREMENT("measurement"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ProofOfIdentityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProofOfIdentityEnumeration fromValue(String v) {
        for (ProofOfIdentityEnumeration c: ProofOfIdentityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
