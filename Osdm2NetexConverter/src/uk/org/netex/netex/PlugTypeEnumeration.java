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
 * <p>Java-Klasse f�r PlugTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PlugTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="type1"/>
 *     &lt;enumeration value="type2"/>
 *     &lt;enumeration value="type3"/>
 *     &lt;enumeration value="typeE"/>
 *     &lt;enumeration value="typeF"/>
 *     &lt;enumeration value="typeG"/>
 *     &lt;enumeration value="typeJ"/>
 *     &lt;enumeration value="combinedChargingSystem"/>
 *     &lt;enumeration value="ccsCombo1Plug"/>
 *     &lt;enumeration value="ccsCombo2Plug"/>
 *     &lt;enumeration value="tesla"/>
 *     &lt;enumeration value="nema5-20"/>
 *     &lt;enumeration value="avcon"/>
 *     &lt;enumeration value="CHAdeMO"/>
 *     &lt;enumeration value="shockproof"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlugTypeEnumeration")
@XmlEnum
public enum PlugTypeEnumeration {

    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("type1")
    TYPE_1("type1"),
    @XmlEnumValue("type2")
    TYPE_2("type2"),
    @XmlEnumValue("type3")
    TYPE_3("type3"),
    @XmlEnumValue("typeE")
    TYPE_E("typeE"),
    @XmlEnumValue("typeF")
    TYPE_F("typeF"),
    @XmlEnumValue("typeG")
    TYPE_G("typeG"),
    @XmlEnumValue("typeJ")
    TYPE_J("typeJ"),
    @XmlEnumValue("combinedChargingSystem")
    COMBINED_CHARGING_SYSTEM("combinedChargingSystem"),
    @XmlEnumValue("ccsCombo1Plug")
    CCS_COMBO_1_PLUG("ccsCombo1Plug"),
    @XmlEnumValue("ccsCombo2Plug")
    CCS_COMBO_2_PLUG("ccsCombo2Plug"),
    @XmlEnumValue("tesla")
    TESLA("tesla"),
    @XmlEnumValue("nema5-20")
    NEMA_5_20("nema5-20"),
    @XmlEnumValue("avcon")
    AVCON("avcon"),
    @XmlEnumValue("CHAdeMO")
    CH_ADE_MO("CHAdeMO"),
    @XmlEnumValue("shockproof")
    SHOCKPROOF("shockproof");
    private final String value;

    PlugTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlugTypeEnumeration fromValue(String v) {
        for (PlugTypeEnumeration c: PlugTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
