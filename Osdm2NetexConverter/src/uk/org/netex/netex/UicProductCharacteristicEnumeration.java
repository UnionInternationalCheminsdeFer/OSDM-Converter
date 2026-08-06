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
 * <p>Java-Klasse f�r UicProductCharacteristicEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UicProductCharacteristicEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="tariffCommunVoyageurs"/>
 *     &lt;enumeration value="allInclusivePrice"/>
 *     &lt;enumeration value="eastWestTariff"/>
 *     &lt;enumeration value="trainWithTcvAndMarketPrice"/>
 *     &lt;enumeration value="noPublishedTariff"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UicProductCharacteristicEnumeration")
@XmlEnum
public enum UicProductCharacteristicEnumeration {

    @XmlEnumValue("tariffCommunVoyageurs")
    TARIFF_COMMUN_VOYAGEURS("tariffCommunVoyageurs"),
    @XmlEnumValue("allInclusivePrice")
    ALL_INCLUSIVE_PRICE("allInclusivePrice"),
    @XmlEnumValue("eastWestTariff")
    EAST_WEST_TARIFF("eastWestTariff"),
    @XmlEnumValue("trainWithTcvAndMarketPrice")
    TRAIN_WITH_TCV_AND_MARKET_PRICE("trainWithTcvAndMarketPrice"),
    @XmlEnumValue("noPublishedTariff")
    NO_PUBLISHED_TARIFF("noPublishedTariff");
    private final String value;

    UicProductCharacteristicEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UicProductCharacteristicEnumeration fromValue(String v) {
        for (UicProductCharacteristicEnumeration c: UicProductCharacteristicEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
