//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a SERIES CONSTRAINT PRICE.
 * 
 * <p>Java-Klasse f�r SeriesConstraintPrice_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SeriesConstraintPrice_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FarePrice_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SeriesConstraintPriceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeriesConstraintPrice_VersionedChildStructure", propOrder = {
    "seriesConstraintRef"
})
@XmlSeeAlso({
    SeriesConstraintPrice.class
})
public class SeriesConstraintPriceVersionedChildStructure
    extends FarePriceVersionedChildStructure
{

    @XmlElement(name = "SeriesConstraintRef")
    protected SeriesConstraintRef seriesConstraintRef;

    /**
     * Ruft den Wert der seriesConstraintRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SeriesConstraintRef }
     *     
     */
    public SeriesConstraintRef getSeriesConstraintRef() {
        return seriesConstraintRef;
    }

    /**
     * Legt den Wert der seriesConstraintRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesConstraintRef }
     *     
     */
    public void setSeriesConstraintRef(SeriesConstraintRef value) {
        this.seriesConstraintRef = value;
    }

}
