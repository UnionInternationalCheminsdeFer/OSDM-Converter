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
 * <p>Java-Klasse f�r NameOfClassStandardFareTableRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassStandardFareTableRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassFareTableRefStructureType">
 *     &lt;enumeration value="StandardFareTable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassStandardFareTableRefStructureType")
@XmlEnum(NameOfClassFareTableRefStructureType.class)
public enum NameOfClassStandardFareTableRefStructureType {

    @XmlEnumValue("StandardFareTable")
    STANDARD_FARE_TABLE(NameOfClassFareTableRefStructureType.STANDARD_FARE_TABLE);
    private final NameOfClassFareTableRefStructureType value;

    NameOfClassStandardFareTableRefStructureType(NameOfClassFareTableRefStructureType v) {
        value = v;
    }

    public NameOfClassFareTableRefStructureType value() {
        return value;
    }

    public static NameOfClassStandardFareTableRefStructureType fromValue(NameOfClassFareTableRefStructureType v) {
        for (NameOfClassStandardFareTableRefStructureType c: NameOfClassStandardFareTableRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
