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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a CUSTOMER PURCHASE PACKAGE ELEMENT ACCESS. +v1.1
 * 
 * <p>Java-Klasse f�r CustomerPurchasePackageElementAccess_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CustomerPurchasePackageElementAccess_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CustomerPurchasePackageElementAccessGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPurchasePackageElementAccess_VersionedChildStructure", propOrder = {
    "customerPurchasePackageElementRef",
    "validableElementRef",
    "fareStructureElementRef",
    "fareStructureElementInSequenceRef",
    "markedAs",
    "accessNumber",
    "startOfValidity",
    "endOfValidity",
    "validityParameterAssignments"
})
@XmlSeeAlso({
    CustomerPurchasePackageElementAccess.class
})
public class CustomerPurchasePackageElementAccessVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "CustomerPurchasePackageElementRef")
    protected CustomerPurchasePackageElementRefStructure customerPurchasePackageElementRef;
    @XmlElement(name = "ValidableElementRef")
    protected ValidableElementRefStructure validableElementRef;
    @XmlElement(name = "FareStructureElementRef")
    protected FareStructureElementRefStructure fareStructureElementRef;
    @XmlElement(name = "FareStructureElementInSequenceRef")
    protected FareStructureElementInSequenceRefStructure fareStructureElementInSequenceRef;
    @XmlElement(name = "MarkedAs")
    @XmlSchemaType(name = "normalizedString")
    protected MarkedAsEnumeration markedAs;
    @XmlElement(name = "AccessNumber")
    protected BigInteger accessNumber;
    @XmlElement(name = "StartOfValidity")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startOfValidity;
    @XmlElement(name = "EndOfValidity")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endOfValidity;
    protected CustomerPurchaseParameterAssignmentsRelStructure validityParameterAssignments;

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

    /**
     * Ruft den Wert der validableElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidableElementRefStructure }
     *     
     */
    public ValidableElementRefStructure getValidableElementRef() {
        return validableElementRef;
    }

    /**
     * Legt den Wert der validableElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidableElementRefStructure }
     *     
     */
    public void setValidableElementRef(ValidableElementRefStructure value) {
        this.validableElementRef = value;
    }

    /**
     * Ruft den Wert der fareStructureElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareStructureElementRefStructure }
     *     
     */
    public FareStructureElementRefStructure getFareStructureElementRef() {
        return fareStructureElementRef;
    }

    /**
     * Legt den Wert der fareStructureElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStructureElementRefStructure }
     *     
     */
    public void setFareStructureElementRef(FareStructureElementRefStructure value) {
        this.fareStructureElementRef = value;
    }

    /**
     * Ruft den Wert der fareStructureElementInSequenceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareStructureElementInSequenceRefStructure }
     *     
     */
    public FareStructureElementInSequenceRefStructure getFareStructureElementInSequenceRef() {
        return fareStructureElementInSequenceRef;
    }

    /**
     * Legt den Wert der fareStructureElementInSequenceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStructureElementInSequenceRefStructure }
     *     
     */
    public void setFareStructureElementInSequenceRef(FareStructureElementInSequenceRefStructure value) {
        this.fareStructureElementInSequenceRef = value;
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
     * Ruft den Wert der accessNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccessNumber() {
        return accessNumber;
    }

    /**
     * Legt den Wert der accessNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccessNumber(BigInteger value) {
        this.accessNumber = value;
    }

    /**
     * Ruft den Wert der startOfValidity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartOfValidity() {
        return startOfValidity;
    }

    /**
     * Legt den Wert der startOfValidity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartOfValidity(XMLGregorianCalendar value) {
        this.startOfValidity = value;
    }

    /**
     * Ruft den Wert der endOfValidity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndOfValidity() {
        return endOfValidity;
    }

    /**
     * Legt den Wert der endOfValidity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndOfValidity(XMLGregorianCalendar value) {
        this.endOfValidity = value;
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

}
