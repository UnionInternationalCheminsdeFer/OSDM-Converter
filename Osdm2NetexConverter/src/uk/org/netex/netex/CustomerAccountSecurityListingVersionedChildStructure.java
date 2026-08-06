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
 * Type for CUSTOMER ACCOUNT SECURITY LISTING.
 * 
 * <p>Java-Klasse f�r CustomerAccountSecurityListing_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccountSecurityListing_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SecurityListing_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CustomerAccountSecurityListingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccountSecurityListing_VersionedChildStructure", propOrder = {
    "customerAccountRef"
})
@XmlSeeAlso({
    CustomerAccountSecurityListing.class
})
public class CustomerAccountSecurityListingVersionedChildStructure
    extends SecurityListingVersionedChildStructure
{

    @XmlElement(name = "CustomerAccountRef")
    protected CustomerAccountRefStructure customerAccountRef;

    /**
     * Ruft den Wert der customerAccountRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountRefStructure }
     *     
     */
    public CustomerAccountRefStructure getCustomerAccountRef() {
        return customerAccountRef;
    }

    /**
     * Legt den Wert der customerAccountRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountRefStructure }
     *     
     */
    public void setCustomerAccountRef(CustomerAccountRefStructure value) {
        this.customerAccountRef = value;
    }

}
