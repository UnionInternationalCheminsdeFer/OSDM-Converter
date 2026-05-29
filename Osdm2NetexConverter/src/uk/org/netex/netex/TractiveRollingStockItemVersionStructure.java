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
 * Type for a TRACTIVE ROLLING STOCK ITEM.
 * 
 * <p>Java-Klasse f�r TractiveRollingStockItem_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TractiveRollingStockItem_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}RollingStockItem_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TractiveRollingStockItemGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TractiveRollingStockItem_VersionStructure", propOrder = {
    "tractiveElementTypeRef"
})
@XmlSeeAlso({
    TractiveRollingStockItem.class
})
public class TractiveRollingStockItemVersionStructure
    extends RollingStockItemVersionStructure
{

    @XmlElement(name = "TractiveElementTypeRef")
    protected TractiveElementTypeRefStructure tractiveElementTypeRef;

    /**
     * Ruft den Wert der tractiveElementTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TractiveElementTypeRefStructure }
     *     
     */
    public TractiveElementTypeRefStructure getTractiveElementTypeRef() {
        return tractiveElementTypeRef;
    }

    /**
     * Legt den Wert der tractiveElementTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TractiveElementTypeRefStructure }
     *     
     */
    public void setTractiveElementTypeRef(TractiveElementTypeRefStructure value) {
        this.tractiveElementTypeRef = value;
    }

}
