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
 * <p>Java-Klasse f�r DistributionChannelTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DistributionChannelTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="atStop"/>
 *     &lt;enumeration value="onBoard"/>
 *     &lt;enumeration value="online"/>
 *     &lt;enumeration value="onlineAccount"/>
 *     &lt;enumeration value="telephone"/>
 *     &lt;enumeration value="electronicPass"/>
 *     &lt;enumeration value="postal"/>
 *     &lt;enumeration value="mobileDevice"/>
 *     &lt;enumeration value="agency"/>
 *     &lt;enumeration value="tourOperator"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DistributionChannelTypeEnumeration")
@XmlEnum
public enum DistributionChannelTypeEnumeration {

    @XmlEnumValue("atStop")
    AT_STOP("atStop"),
    @XmlEnumValue("onBoard")
    ON_BOARD("onBoard"),
    @XmlEnumValue("online")
    ONLINE("online"),
    @XmlEnumValue("onlineAccount")
    ONLINE_ACCOUNT("onlineAccount"),
    @XmlEnumValue("telephone")
    TELEPHONE("telephone"),
    @XmlEnumValue("electronicPass")
    ELECTRONIC_PASS("electronicPass"),
    @XmlEnumValue("postal")
    POSTAL("postal"),
    @XmlEnumValue("mobileDevice")
    MOBILE_DEVICE("mobileDevice"),
    @XmlEnumValue("agency")
    AGENCY("agency"),
    @XmlEnumValue("tourOperator")
    TOUR_OPERATOR("tourOperator"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DistributionChannelTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistributionChannelTypeEnumeration fromValue(String v) {
        for (DistributionChannelTypeEnumeration c: DistributionChannelTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
