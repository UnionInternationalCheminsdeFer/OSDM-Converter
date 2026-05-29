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
 * <p>Java-Klasse f�r NameOfClassDistanceMatrixElementPriceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassDistanceMatrixElementPriceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassFarePriceRefStructureType">
 *     &lt;enumeration value="DistanceMatrixElementPrice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassDistanceMatrixElementPriceRefStructureType")
@XmlEnum(NameOfClassFarePriceRefStructureType.class)
public enum NameOfClassDistanceMatrixElementPriceRefStructureType {

    @XmlEnumValue("DistanceMatrixElementPrice")
    DISTANCE_MATRIX_ELEMENT_PRICE(NameOfClassFarePriceRefStructureType.DISTANCE_MATRIX_ELEMENT_PRICE);
    private final NameOfClassFarePriceRefStructureType value;

    NameOfClassDistanceMatrixElementPriceRefStructureType(NameOfClassFarePriceRefStructureType v) {
        value = v;
    }

    public NameOfClassFarePriceRefStructureType value() {
        return value;
    }

    public static NameOfClassDistanceMatrixElementPriceRefStructureType fromValue(NameOfClassFarePriceRefStructureType v) {
        for (NameOfClassDistanceMatrixElementPriceRefStructureType c: NameOfClassDistanceMatrixElementPriceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
