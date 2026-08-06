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
 * <p>Java-Klasse f�r TrainRestrictionsEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TrainRestrictionsEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="anyTrain"/>
 *     &lt;enumeration value="restricted"/>
 *     &lt;enumeration value="specifiedTrainOnly"/>
 *     &lt;enumeration value="specifiedTrainsOnly"/>
 *     &lt;enumeration value="specifiedTrainAndConnections"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrainRestrictionsEnumeration")
@XmlEnum
public enum TrainRestrictionsEnumeration {

    @XmlEnumValue("anyTrain")
    ANY_TRAIN("anyTrain"),
    @XmlEnumValue("restricted")
    RESTRICTED("restricted"),
    @XmlEnumValue("specifiedTrainOnly")
    SPECIFIED_TRAIN_ONLY("specifiedTrainOnly"),
    @XmlEnumValue("specifiedTrainsOnly")
    SPECIFIED_TRAINS_ONLY("specifiedTrainsOnly"),
    @XmlEnumValue("specifiedTrainAndConnections")
    SPECIFIED_TRAIN_AND_CONNECTIONS("specifiedTrainAndConnections");
    private final String value;

    TrainRestrictionsEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrainRestrictionsEnumeration fromValue(String v) {
        for (TrainRestrictionsEnumeration c: TrainRestrictionsEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
