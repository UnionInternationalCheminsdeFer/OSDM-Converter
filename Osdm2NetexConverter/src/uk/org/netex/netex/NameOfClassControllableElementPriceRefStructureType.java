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
 * <p>Java-Klasse f�r NameOfClassControllableElementPriceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassControllableElementPriceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassFarePriceRefStructureType">
 *     &lt;enumeration value="ControllableElementPrice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassControllableElementPriceRefStructureType")
@XmlEnum(NameOfClassFarePriceRefStructureType.class)
public enum NameOfClassControllableElementPriceRefStructureType {

    @XmlEnumValue("ControllableElementPrice")
    CONTROLLABLE_ELEMENT_PRICE(NameOfClassFarePriceRefStructureType.CONTROLLABLE_ELEMENT_PRICE);
    private final NameOfClassFarePriceRefStructureType value;

    NameOfClassControllableElementPriceRefStructureType(NameOfClassFarePriceRefStructureType v) {
        value = v;
    }

    public NameOfClassFarePriceRefStructureType value() {
        return value;
    }

    public static NameOfClassControllableElementPriceRefStructureType fromValue(NameOfClassFarePriceRefStructureType v) {
        for (NameOfClassControllableElementPriceRefStructureType c: NameOfClassControllableElementPriceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
