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
 * <p>Java-Klasse f�r NameOfClassBorderPointRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassBorderPointRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassTimingPointRefStructureType">
 *     &lt;enumeration value="BorderPoint"/>
 *     &lt;enumeration value="Point"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassBorderPointRefStructureType")
@XmlEnum(NameOfClassTimingPointRefStructureType.class)
public enum NameOfClassBorderPointRefStructureType {

    @XmlEnumValue("BorderPoint")
    BORDER_POINT(NameOfClassTimingPointRefStructureType.BORDER_POINT),
    @XmlEnumValue("Point")
    POINT(NameOfClassTimingPointRefStructureType.POINT);
    private final NameOfClassTimingPointRefStructureType value;

    NameOfClassBorderPointRefStructureType(NameOfClassTimingPointRefStructureType v) {
        value = v;
    }

    public NameOfClassTimingPointRefStructureType value() {
        return value;
    }

    public static NameOfClassBorderPointRefStructureType fromValue(NameOfClassTimingPointRefStructureType v) {
        for (NameOfClassBorderPointRefStructureType c: NameOfClassBorderPointRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
