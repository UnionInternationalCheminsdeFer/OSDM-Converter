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
 * <p>Java-Klasse f�r DeckNavigationPathTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DeckNavigationPathTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="deckEntranceToDeckSpace"/>
 *     &lt;enumeration value="deckEntranceToSpot"/>
 *     &lt;enumeration value="spotToDeckSpace"/>
 *     &lt;enumeration value="spotToDeckEntrance"/>
 *     &lt;enumeration value="spotToSpot"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeckNavigationPathTypeEnumeration")
@XmlEnum
public enum DeckNavigationPathTypeEnumeration {

    @XmlEnumValue("deckEntranceToDeckSpace")
    DECK_ENTRANCE_TO_DECK_SPACE("deckEntranceToDeckSpace"),
    @XmlEnumValue("deckEntranceToSpot")
    DECK_ENTRANCE_TO_SPOT("deckEntranceToSpot"),
    @XmlEnumValue("spotToDeckSpace")
    SPOT_TO_DECK_SPACE("spotToDeckSpace"),
    @XmlEnumValue("spotToDeckEntrance")
    SPOT_TO_DECK_ENTRANCE("spotToDeckEntrance"),
    @XmlEnumValue("spotToSpot")
    SPOT_TO_SPOT("spotToSpot"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DeckNavigationPathTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeckNavigationPathTypeEnumeration fromValue(String v) {
        for (DeckNavigationPathTypeEnumeration c: DeckNavigationPathTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
