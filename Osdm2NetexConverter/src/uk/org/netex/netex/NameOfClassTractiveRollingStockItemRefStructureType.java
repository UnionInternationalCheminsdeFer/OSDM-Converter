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
 * <p>Java-Klasse f�r NameOfClassTractiveRollingStockItemRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTractiveRollingStockItemRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassRollingStockItemRefStructureType">
 *     &lt;enumeration value="TractiveRollingStockItem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTractiveRollingStockItemRefStructureType")
@XmlEnum(NameOfClassRollingStockItemRefStructureType.class)
public enum NameOfClassTractiveRollingStockItemRefStructureType {

    @XmlEnumValue("TractiveRollingStockItem")
    TRACTIVE_ROLLING_STOCK_ITEM(NameOfClassRollingStockItemRefStructureType.TRACTIVE_ROLLING_STOCK_ITEM);
    private final NameOfClassRollingStockItemRefStructureType value;

    NameOfClassTractiveRollingStockItemRefStructureType(NameOfClassRollingStockItemRefStructureType v) {
        value = v;
    }

    public NameOfClassRollingStockItemRefStructureType value() {
        return value;
    }

    public static NameOfClassTractiveRollingStockItemRefStructureType fromValue(NameOfClassRollingStockItemRefStructureType v) {
        for (NameOfClassTractiveRollingStockItemRefStructureType c: NameOfClassTractiveRollingStockItemRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
