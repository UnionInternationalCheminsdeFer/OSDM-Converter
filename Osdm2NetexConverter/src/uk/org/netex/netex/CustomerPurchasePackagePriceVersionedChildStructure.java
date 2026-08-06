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
 * Type for a CUSTOMER PURCHASE PACKAGE PRICEs.
 * 
 * <p>Java-Klasse f�r CustomerPurchasePackagePrice_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CustomerPurchasePackagePrice_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FarePrice_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CustomerPurchasePackagePriceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPurchasePackagePrice_VersionedChildStructure", propOrder = {
    "customerPurchasePackageRef",
    "customerPurchasePackageElementRef"
})
@XmlSeeAlso({
    CustomerPurchasePackagePrice.class
})
public class CustomerPurchasePackagePriceVersionedChildStructure
    extends FarePriceVersionedChildStructure
{

    @XmlElement(name = "CustomerPurchasePackageRef")
    protected CustomerPurchasePackageRefStructure customerPurchasePackageRef;
    @XmlElement(name = "CustomerPurchasePackageElementRef")
    protected CustomerPurchasePackageElementRefStructure customerPurchasePackageElementRef;

    /**
     * Ruft den Wert der customerPurchasePackageRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchasePackageRefStructure }
     *     
     */
    public CustomerPurchasePackageRefStructure getCustomerPurchasePackageRef() {
        return customerPurchasePackageRef;
    }

    /**
     * Legt den Wert der customerPurchasePackageRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchasePackageRefStructure }
     *     
     */
    public void setCustomerPurchasePackageRef(CustomerPurchasePackageRefStructure value) {
        this.customerPurchasePackageRef = value;
    }

    /**
     * Ruft den Wert der customerPurchasePackageElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchasePackageElementRefStructure }
     *     
     */
    public CustomerPurchasePackageElementRefStructure getCustomerPurchasePackageElementRef() {
        return customerPurchasePackageElementRef;
    }

    /**
     * Legt den Wert der customerPurchasePackageElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchasePackageElementRefStructure }
     *     
     */
    public void setCustomerPurchasePackageElementRef(CustomerPurchasePackageElementRefStructure value) {
        this.customerPurchasePackageElementRef = value;
    }

}
