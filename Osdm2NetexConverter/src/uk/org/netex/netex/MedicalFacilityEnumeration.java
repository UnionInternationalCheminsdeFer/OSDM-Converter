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
 * <p>Java-Klasse f�r MedicalFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicalFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="defibrillator"/>
 *     &lt;enumeration value="alcoholTest"/>
 *     &lt;enumeration value="handSanitiser"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicalFacilityEnumeration")
@XmlEnum
public enum MedicalFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("defibrillator")
    DEFIBRILLATOR("defibrillator"),
    @XmlEnumValue("alcoholTest")
    ALCOHOL_TEST("alcoholTest"),
    @XmlEnumValue("handSanitiser")
    HAND_SANITISER("handSanitiser"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    MedicalFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MedicalFacilityEnumeration fromValue(String v) {
        for (MedicalFacilityEnumeration c: MedicalFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
