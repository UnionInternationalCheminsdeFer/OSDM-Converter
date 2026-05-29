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
 * <p>Java-Klasse f�r NameOfClassEntitlementProductRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassEntitlementProductRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassServiceAccessRightRefStructureType">
 *     &lt;enumeration value="EntitlementProduct"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassEntitlementProductRefStructureType")
@XmlEnum(NameOfClassServiceAccessRightRefStructureType.class)
public enum NameOfClassEntitlementProductRefStructureType {

    @XmlEnumValue("EntitlementProduct")
    ENTITLEMENT_PRODUCT(NameOfClassServiceAccessRightRefStructureType.ENTITLEMENT_PRODUCT);
    private final NameOfClassServiceAccessRightRefStructureType value;

    NameOfClassEntitlementProductRefStructureType(NameOfClassServiceAccessRightRefStructureType v) {
        value = v;
    }

    public NameOfClassServiceAccessRightRefStructureType value() {
        return value;
    }

    public static NameOfClassEntitlementProductRefStructureType fromValue(NameOfClassServiceAccessRightRefStructureType v) {
        for (NameOfClassEntitlementProductRefStructureType c: NameOfClassEntitlementProductRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
