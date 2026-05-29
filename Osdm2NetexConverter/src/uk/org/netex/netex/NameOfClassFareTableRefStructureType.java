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
 * <p>Java-Klasse f�r NameOfClassFareTableRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFareTableRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassGroupOfEntitiesRefStructureType">
 *     &lt;enumeration value="FareTable"/>
 *     &lt;enumeration value="FareTableInContext"/>
 *     &lt;enumeration value="StandardFareTable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFareTableRefStructureType")
@XmlEnum(NameOfClassGroupOfEntitiesRefStructureType.class)
public enum NameOfClassFareTableRefStructureType {

    @XmlEnumValue("FareTable")
    FARE_TABLE(NameOfClassGroupOfEntitiesRefStructureType.FARE_TABLE),
    @XmlEnumValue("FareTableInContext")
    FARE_TABLE_IN_CONTEXT(NameOfClassGroupOfEntitiesRefStructureType.FARE_TABLE_IN_CONTEXT),
    @XmlEnumValue("StandardFareTable")
    STANDARD_FARE_TABLE(NameOfClassGroupOfEntitiesRefStructureType.STANDARD_FARE_TABLE);
    private final NameOfClassGroupOfEntitiesRefStructureType value;

    NameOfClassFareTableRefStructureType(NameOfClassGroupOfEntitiesRefStructureType v) {
        value = v;
    }

    public NameOfClassGroupOfEntitiesRefStructureType value() {
        return value;
    }

    public static NameOfClassFareTableRefStructureType fromValue(NameOfClassGroupOfEntitiesRefStructureType v) {
        for (NameOfClassFareTableRefStructureType c: NameOfClassFareTableRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
