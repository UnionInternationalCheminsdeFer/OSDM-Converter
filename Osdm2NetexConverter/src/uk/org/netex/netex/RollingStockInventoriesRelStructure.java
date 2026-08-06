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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of ROLLING STOCK INVENTORies..
 * 
 * <p>Java-Klasse f�r rollingStockInventories_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="rollingStockInventories_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}RollingStockInventory"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rollingStockInventories_RelStructure", propOrder = {
    "rollingStockInventory"
})
public class RollingStockInventoriesRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElement(name = "RollingStockInventory", required = true)
    protected RollingStockInventory rollingStockInventory;

    /**
     * A collection of ROLLING STOCK ITEMs of any type used to assemble trains. +v.2.0
     * 
     * @return
     *     possible object is
     *     {@link RollingStockInventory }
     *     
     */
    public RollingStockInventory getRollingStockInventory() {
        return rollingStockInventory;
    }

    /**
     * Legt den Wert der rollingStockInventory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RollingStockInventory }
     *     
     */
    public void setRollingStockInventory(RollingStockInventory value) {
        this.rollingStockInventory = value;
    }

}
