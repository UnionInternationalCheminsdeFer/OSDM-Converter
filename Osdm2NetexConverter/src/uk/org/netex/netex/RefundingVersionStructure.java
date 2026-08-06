//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for REFUNDING.
 * 
 * <p>Java-Klasse f�r Refunding_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Refunding_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Reselling_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RefundingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Refunding_VersionStructure", propOrder = {
    "refundType",
    "refundPolicy",
    "partialRefundBasis",
    "paymentMethod"
})
@XmlSeeAlso({
    Refunding.class
})
public class RefundingVersionStructure
    extends ResellingVersionStructure
{

    @XmlElement(name = "RefundType", defaultValue = "unused")
    @XmlSchemaType(name = "normalizedString")
    protected RefundTypeEnumeration refundType;
    @XmlList
    @XmlElement(name = "RefundPolicy")
    protected List<RefundPolicyEnumeration> refundPolicy;
    @XmlElement(name = "PartialRefundBasis")
    @XmlSchemaType(name = "normalizedString")
    protected PartialRefundBasisEnumeration partialRefundBasis;
    @XmlList
    @XmlElement(name = "PaymentMethod")
    protected List<PaymentMethodEnumeration> paymentMethod;

    /**
     * Ruft den Wert der refundType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RefundTypeEnumeration }
     *     
     */
    public RefundTypeEnumeration getRefundType() {
        return refundType;
    }

    /**
     * Legt den Wert der refundType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundTypeEnumeration }
     *     
     */
    public void setRefundType(RefundTypeEnumeration value) {
        this.refundType = value;
    }

    /**
     * Gets the value of the refundPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundPolicyEnumeration }
     * 
     * 
     */
    public List<RefundPolicyEnumeration> getRefundPolicy() {
        if (refundPolicy == null) {
            refundPolicy = new ArrayList<RefundPolicyEnumeration>();
        }
        return this.refundPolicy;
    }

    /**
     * Ruft den Wert der partialRefundBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartialRefundBasisEnumeration }
     *     
     */
    public PartialRefundBasisEnumeration getPartialRefundBasis() {
        return partialRefundBasis;
    }

    /**
     * Legt den Wert der partialRefundBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialRefundBasisEnumeration }
     *     
     */
    public void setPartialRefundBasis(PartialRefundBasisEnumeration value) {
        this.partialRefundBasis = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodEnumeration }
     * 
     * 
     */
    public List<PaymentMethodEnumeration> getPaymentMethod() {
        if (paymentMethod == null) {
            paymentMethod = new ArrayList<PaymentMethodEnumeration>();
        }
        return this.paymentMethod;
    }

}
