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
 * <p>Java-Klasse f�r NameOfClassEmvCardRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassEmvCardRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassMediumAccessDeviceRefStructureType">
 *     &lt;enumeration value="EmvCard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassEmvCardRefStructureType")
@XmlEnum(NameOfClassMediumAccessDeviceRefStructureType.class)
public enum NameOfClassEmvCardRefStructureType {

    @XmlEnumValue("EmvCard")
    EMV_CARD(NameOfClassMediumAccessDeviceRefStructureType.EMV_CARD);
    private final NameOfClassMediumAccessDeviceRefStructureType value;

    NameOfClassEmvCardRefStructureType(NameOfClassMediumAccessDeviceRefStructureType v) {
        value = v;
    }

    public NameOfClassMediumAccessDeviceRefStructureType value() {
        return value;
    }

    public static NameOfClassEmvCardRefStructureType fromValue(NameOfClassMediumAccessDeviceRefStructureType v) {
        for (NameOfClassEmvCardRefStructureType c: NameOfClassEmvCardRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
