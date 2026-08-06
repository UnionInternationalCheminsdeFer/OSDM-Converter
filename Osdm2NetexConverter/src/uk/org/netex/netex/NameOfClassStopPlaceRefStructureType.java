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
 * <p>Java-Klasse f�r NameOfClassStopPlaceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassStopPlaceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSiteRefStructureType">
 *     &lt;enumeration value="StopPlace"/>
 *     &lt;enumeration value="TaxiRank"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassStopPlaceRefStructureType")
@XmlEnum(NameOfClassSiteRefStructureType.class)
public enum NameOfClassStopPlaceRefStructureType {

    @XmlEnumValue("StopPlace")
    STOP_PLACE(NameOfClassSiteRefStructureType.STOP_PLACE),
    @XmlEnumValue("TaxiRank")
    TAXI_RANK(NameOfClassSiteRefStructureType.TAXI_RANK);
    private final NameOfClassSiteRefStructureType value;

    NameOfClassStopPlaceRefStructureType(NameOfClassSiteRefStructureType v) {
        value = v;
    }

    public NameOfClassSiteRefStructureType value() {
        return value;
    }

    public static NameOfClassStopPlaceRefStructureType fromValue(NameOfClassSiteRefStructureType v) {
        for (NameOfClassStopPlaceRefStructureType c: NameOfClassStopPlaceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
