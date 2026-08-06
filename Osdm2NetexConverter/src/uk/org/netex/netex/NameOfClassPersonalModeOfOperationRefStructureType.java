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
 * <p>Java-Klasse f�r NameOfClassPersonalModeOfOperationRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPersonalModeOfOperationRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassModeOfOperationRefStructureType">
 *     &lt;enumeration value="PersonalModeOfOperation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPersonalModeOfOperationRefStructureType")
@XmlEnum(NameOfClassModeOfOperationRefStructureType.class)
public enum NameOfClassPersonalModeOfOperationRefStructureType {

    @XmlEnumValue("PersonalModeOfOperation")
    PERSONAL_MODE_OF_OPERATION(NameOfClassModeOfOperationRefStructureType.PERSONAL_MODE_OF_OPERATION);
    private final NameOfClassModeOfOperationRefStructureType value;

    NameOfClassPersonalModeOfOperationRefStructureType(NameOfClassModeOfOperationRefStructureType v) {
        value = v;
    }

    public NameOfClassModeOfOperationRefStructureType value() {
        return value;
    }

    public static NameOfClassPersonalModeOfOperationRefStructureType fromValue(NameOfClassModeOfOperationRefStructureType v) {
        for (NameOfClassPersonalModeOfOperationRefStructureType c: NameOfClassPersonalModeOfOperationRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
