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
 * <p>Java-Klasse f�r NameOfClassTrailingRollingStockItemRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTrailingRollingStockItemRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassRollingStockItemRefStructureType">
 *     &lt;enumeration value="TrailingRollingStockItem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTrailingRollingStockItemRefStructureType")
@XmlEnum(NameOfClassRollingStockItemRefStructureType.class)
public enum NameOfClassTrailingRollingStockItemRefStructureType {

    @XmlEnumValue("TrailingRollingStockItem")
    TRAILING_ROLLING_STOCK_ITEM(NameOfClassRollingStockItemRefStructureType.TRAILING_ROLLING_STOCK_ITEM);
    private final NameOfClassRollingStockItemRefStructureType value;

    NameOfClassTrailingRollingStockItemRefStructureType(NameOfClassRollingStockItemRefStructureType v) {
        value = v;
    }

    public NameOfClassRollingStockItemRefStructureType value() {
        return value;
    }

    public static NameOfClassTrailingRollingStockItemRefStructureType fromValue(NameOfClassRollingStockItemRefStructureType v) {
        for (NameOfClassTrailingRollingStockItemRefStructureType c: NameOfClassTrailingRollingStockItemRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
