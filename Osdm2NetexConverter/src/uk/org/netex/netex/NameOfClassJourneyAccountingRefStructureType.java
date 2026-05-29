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
 * <p>Java-Klasse f�r NameOfClassJourneyAccountingRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassJourneyAccountingRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassAssignmentRefStructureType">
 *     &lt;enumeration value="JourneyAccounting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassJourneyAccountingRefStructureType")
@XmlEnum(NameOfClassAssignmentRefStructureType.class)
public enum NameOfClassJourneyAccountingRefStructureType {

    @XmlEnumValue("JourneyAccounting")
    JOURNEY_ACCOUNTING(NameOfClassAssignmentRefStructureType.JOURNEY_ACCOUNTING);
    private final NameOfClassAssignmentRefStructureType value;

    NameOfClassJourneyAccountingRefStructureType(NameOfClassAssignmentRefStructureType v) {
        value = v;
    }

    public NameOfClassAssignmentRefStructureType value() {
        return value;
    }

    public static NameOfClassJourneyAccountingRefStructureType fromValue(NameOfClassAssignmentRefStructureType v) {
        for (NameOfClassJourneyAccountingRefStructureType c: NameOfClassJourneyAccountingRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
