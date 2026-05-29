//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a ROLLING STOCK INVENTORY.
 * 
 * <p>Java-Klasse f�r RollingStockInventory_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RollingStockInventory_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RollingStockInventoryGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RollingStockInventory_VersionStructure", propOrder = {
    "name",
    "transportOrganisationRef",
    "rollingStockItems"
})
@XmlSeeAlso({
    RollingStockInventory.class
})
public class RollingStockInventoryVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportOrganisationRefStructure> transportOrganisationRef;
    protected RollingStockItemsRelStructure rollingStockItems;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der transportOrganisationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportOrganisationRefStructure> getTransportOrganisationRef() {
        return transportOrganisationRef;
    }

    /**
     * Legt den Wert der transportOrganisationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public void setTransportOrganisationRef(JAXBElement<? extends TransportOrganisationRefStructure> value) {
        this.transportOrganisationRef = value;
    }

    /**
     * Ruft den Wert der rollingStockItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RollingStockItemsRelStructure }
     *     
     */
    public RollingStockItemsRelStructure getRollingStockItems() {
        return rollingStockItems;
    }

    /**
     * Legt den Wert der rollingStockItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RollingStockItemsRelStructure }
     *     
     */
    public void setRollingStockItems(RollingStockItemsRelStructure value) {
        this.rollingStockItems = value;
    }

}
