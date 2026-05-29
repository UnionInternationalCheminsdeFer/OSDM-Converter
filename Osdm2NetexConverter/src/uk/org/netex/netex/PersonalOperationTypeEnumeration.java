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
 * <p>Java-Klasse f�r PersonalOperationTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonalOperationTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="ownCar"/>
 *     &lt;enumeration value="privateLift"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonalOperationTypeEnumeration")
@XmlEnum
public enum PersonalOperationTypeEnumeration {

    @XmlEnumValue("ownCar")
    OWN_CAR("ownCar"),

    /**
     * +v2.0
     * 
     */
    @XmlEnumValue("privateLift")
    PRIVATE_LIFT("privateLift");
    private final String value;

    PersonalOperationTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonalOperationTypeEnumeration fromValue(String v) {
        for (PersonalOperationTypeEnumeration c: PersonalOperationTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
