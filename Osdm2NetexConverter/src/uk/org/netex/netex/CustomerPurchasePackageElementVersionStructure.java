//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for CUSTOMER PURCHASE PACKAGE ELEMENT.
 * 
 * <p>Java-Klasse f�r CustomerPurchasePackageElement_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CustomerPurchasePackageElement_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CustomerPurchasePackageElementGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPurchasePackageElement_VersionStructure", propOrder = {
    "customerPurchasePackageRef",
    "salesOfferPackageElementRef",
    "markedAs",
    "blocked",
    "elementAccesses",
    "validityParameterAssignments",
    "prices",
    "spotAllocations"
})
@XmlSeeAlso({
    CustomerPurchasePackageElement.class
})
public class CustomerPurchasePackageElementVersionStructure
    extends PriceableObjectVersionStructure
{

    @XmlElement(name = "CustomerPurchasePackageRef")
    protected CustomerPurchasePackageRefStructure customerPurchasePackageRef;
    @XmlElement(name = "SalesOfferPackageElementRef")
    protected SalesOfferPackageElementRefStructure salesOfferPackageElementRef;
    @XmlElement(name = "MarkedAs")
    @XmlSchemaType(name = "normalizedString")
    protected MarkedAsEnumeration markedAs;
    @XmlElement(name = "Blocked")
    protected Boolean blocked;
    protected CustomerPurchasePackageElementAccessesRelStructure elementAccesses;
    protected CustomerPurchaseParameterAssignmentsRelStructure validityParameterAssignments;
    protected CustomerPurchasePackagePricesRelStructure prices;
    protected PassengerSpotAllocationRefsRelStructure spotAllocations;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

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
     * Ruft den Wert der salesOfferPackageElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackageElementRefStructure }
     *     
     */
    public SalesOfferPackageElementRefStructure getSalesOfferPackageElementRef() {
        return salesOfferPackageElementRef;
    }

    /**
     * Legt den Wert der salesOfferPackageElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackageElementRefStructure }
     *     
     */
    public void setSalesOfferPackageElementRef(SalesOfferPackageElementRefStructure value) {
        this.salesOfferPackageElementRef = value;
    }

    /**
     * Ruft den Wert der markedAs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarkedAsEnumeration }
     *     
     */
    public MarkedAsEnumeration getMarkedAs() {
        return markedAs;
    }

    /**
     * Legt den Wert der markedAs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkedAsEnumeration }
     *     
     */
    public void setMarkedAs(MarkedAsEnumeration value) {
        this.markedAs = value;
    }

    /**
     * Ruft den Wert der blocked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlocked() {
        return blocked;
    }

    /**
     * Legt den Wert der blocked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlocked(Boolean value) {
        this.blocked = value;
    }

    /**
     * Ruft den Wert der elementAccesses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchasePackageElementAccessesRelStructure }
     *     
     */
    public CustomerPurchasePackageElementAccessesRelStructure getElementAccesses() {
        return elementAccesses;
    }

    /**
     * Legt den Wert der elementAccesses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchasePackageElementAccessesRelStructure }
     *     
     */
    public void setElementAccesses(CustomerPurchasePackageElementAccessesRelStructure value) {
        this.elementAccesses = value;
    }

    /**
     * Ruft den Wert der validityParameterAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchaseParameterAssignmentsRelStructure }
     *     
     */
    public CustomerPurchaseParameterAssignmentsRelStructure getValidityParameterAssignments() {
        return validityParameterAssignments;
    }

    /**
     * Legt den Wert der validityParameterAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchaseParameterAssignmentsRelStructure }
     *     
     */
    public void setValidityParameterAssignments(CustomerPurchaseParameterAssignmentsRelStructure value) {
        this.validityParameterAssignments = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchasePackagePricesRelStructure }
     *     
     */
    public CustomerPurchasePackagePricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchasePackagePricesRelStructure }
     *     
     */
    public void setPrices(CustomerPurchasePackagePricesRelStructure value) {
        this.prices = value;
    }

    /**
     * Ruft den Wert der spotAllocations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerSpotAllocationRefsRelStructure }
     *     
     */
    public PassengerSpotAllocationRefsRelStructure getSpotAllocations() {
        return spotAllocations;
    }

    /**
     * Legt den Wert der spotAllocations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerSpotAllocationRefsRelStructure }
     *     
     */
    public void setSpotAllocations(PassengerSpotAllocationRefsRelStructure value) {
        this.spotAllocations = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
