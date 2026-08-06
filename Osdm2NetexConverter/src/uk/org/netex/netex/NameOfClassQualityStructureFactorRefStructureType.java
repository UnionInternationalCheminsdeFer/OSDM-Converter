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
 * <p>Java-Klasse f�r NameOfClassQualityStructureFactorRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassQualityStructureFactorRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassFareStructureFactorRefStructureType">
 *     &lt;enumeration value="FareDemandFactor"/>
 *     &lt;enumeration value="FareQuotaFactor"/>
 *     &lt;enumeration value="QualityStructureFactor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassQualityStructureFactorRefStructureType")
@XmlEnum(NameOfClassFareStructureFactorRefStructureType.class)
public enum NameOfClassQualityStructureFactorRefStructureType {

    @XmlEnumValue("FareDemandFactor")
    FARE_DEMAND_FACTOR(NameOfClassFareStructureFactorRefStructureType.FARE_DEMAND_FACTOR),
    @XmlEnumValue("FareQuotaFactor")
    FARE_QUOTA_FACTOR(NameOfClassFareStructureFactorRefStructureType.FARE_QUOTA_FACTOR),
    @XmlEnumValue("QualityStructureFactor")
    QUALITY_STRUCTURE_FACTOR(NameOfClassFareStructureFactorRefStructureType.QUALITY_STRUCTURE_FACTOR);
    private final NameOfClassFareStructureFactorRefStructureType value;

    NameOfClassQualityStructureFactorRefStructureType(NameOfClassFareStructureFactorRefStructureType v) {
        value = v;
    }

    public NameOfClassFareStructureFactorRefStructureType value() {
        return value;
    }

    public static NameOfClassQualityStructureFactorRefStructureType fromValue(NameOfClassFareStructureFactorRefStructureType v) {
        for (NameOfClassQualityStructureFactorRefStructureType c: NameOfClassQualityStructureFactorRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
