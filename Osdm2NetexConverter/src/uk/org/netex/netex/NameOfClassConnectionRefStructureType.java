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
 * <p>Java-Klasse f�r NameOfClassConnectionRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassConnectionRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassTransferRefStructureType">
 *     &lt;enumeration value="Connection"/>
 *     &lt;enumeration value="DefaultConnection"/>
 *     &lt;enumeration value="SiteConnection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassConnectionRefStructureType")
@XmlEnum(NameOfClassTransferRefStructureType.class)
public enum NameOfClassConnectionRefStructureType {

    @XmlEnumValue("Connection")
    CONNECTION(NameOfClassTransferRefStructureType.CONNECTION),
    @XmlEnumValue("DefaultConnection")
    DEFAULT_CONNECTION(NameOfClassTransferRefStructureType.DEFAULT_CONNECTION),
    @XmlEnumValue("SiteConnection")
    SITE_CONNECTION(NameOfClassTransferRefStructureType.SITE_CONNECTION);
    private final NameOfClassTransferRefStructureType value;

    NameOfClassConnectionRefStructureType(NameOfClassTransferRefStructureType v) {
        value = v;
    }

    public NameOfClassTransferRefStructureType value() {
        return value;
    }

    public static NameOfClassConnectionRefStructureType fromValue(NameOfClassTransferRefStructureType v) {
        for (NameOfClassConnectionRefStructureType c: NameOfClassConnectionRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
