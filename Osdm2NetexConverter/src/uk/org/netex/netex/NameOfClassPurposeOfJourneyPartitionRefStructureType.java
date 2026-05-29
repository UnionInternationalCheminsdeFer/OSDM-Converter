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
 * <p>Java-Klasse f�r NameOfClassPurposeOfJourneyPartitionRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPurposeOfJourneyPartitionRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassTypeOfValueRefStructureType">
 *     &lt;enumeration value="PurposeOfJourneyPartition"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPurposeOfJourneyPartitionRefStructureType")
@XmlEnum(NameOfClassTypeOfValueRefStructureType.class)
public enum NameOfClassPurposeOfJourneyPartitionRefStructureType {

    @XmlEnumValue("PurposeOfJourneyPartition")
    PURPOSE_OF_JOURNEY_PARTITION(NameOfClassTypeOfValueRefStructureType.PURPOSE_OF_JOURNEY_PARTITION);
    private final NameOfClassTypeOfValueRefStructureType value;

    NameOfClassPurposeOfJourneyPartitionRefStructureType(NameOfClassTypeOfValueRefStructureType v) {
        value = v;
    }

    public NameOfClassTypeOfValueRefStructureType value() {
        return value;
    }

    public static NameOfClassPurposeOfJourneyPartitionRefStructureType fromValue(NameOfClassTypeOfValueRefStructureType v) {
        for (NameOfClassPurposeOfJourneyPartitionRefStructureType c: NameOfClassPurposeOfJourneyPartitionRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
