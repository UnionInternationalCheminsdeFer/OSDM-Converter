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
 * <p>Java-Klasse f�r MedicalNeedEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicalNeedEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="allergic"/>
 *     &lt;enumeration value="heartCondition"/>
 *     &lt;enumeration value="otherMedicalNeed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicalNeedEnumeration")
@XmlEnum
public enum MedicalNeedEnumeration {

    @XmlEnumValue("allergic")
    ALLERGIC("allergic"),
    @XmlEnumValue("heartCondition")
    HEART_CONDITION("heartCondition"),
    @XmlEnumValue("otherMedicalNeed")
    OTHER_MEDICAL_NEED("otherMedicalNeed");
    private final String value;

    MedicalNeedEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MedicalNeedEnumeration fromValue(String v) {
        for (MedicalNeedEnumeration c: MedicalNeedEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
