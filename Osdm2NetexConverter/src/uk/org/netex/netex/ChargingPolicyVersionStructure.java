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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for CHARGING POLICY.
 * 
 * <p>Java-Klasse f�r ChargingPolicy_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ChargingPolicy_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ChargingPolicyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargingPolicy_VersionStructure", propOrder = {
    "creditPolicy",
    "expireAfterPeriod",
    "paymentGracePeriod",
    "billingPolicy",
    "depositPolicy"
})
@XmlSeeAlso({
    ChargingPolicy.class
})
public class ChargingPolicyVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "CreditPolicy")
    @XmlSchemaType(name = "normalizedString")
    protected TravelCreditPolicyEnumeration creditPolicy;
    @XmlElement(name = "ExpireAfterPeriod")
    protected Duration expireAfterPeriod;
    @XmlElement(name = "PaymentGracePeriod")
    protected Duration paymentGracePeriod;
    @XmlElement(name = "BillingPolicy")
    @XmlSchemaType(name = "normalizedString")
    protected TravelBillingPolicyEnumeration billingPolicy;
    @XmlElement(name = "DepositPolicy", defaultValue = "none")
    @XmlSchemaType(name = "normalizedString")
    protected DepositPolicyEnumeration depositPolicy;

    /**
     * Ruft den Wert der creditPolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TravelCreditPolicyEnumeration }
     *     
     */
    public TravelCreditPolicyEnumeration getCreditPolicy() {
        return creditPolicy;
    }

    /**
     * Legt den Wert der creditPolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelCreditPolicyEnumeration }
     *     
     */
    public void setCreditPolicy(TravelCreditPolicyEnumeration value) {
        this.creditPolicy = value;
    }

    /**
     * Ruft den Wert der expireAfterPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpireAfterPeriod() {
        return expireAfterPeriod;
    }

    /**
     * Legt den Wert der expireAfterPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpireAfterPeriod(Duration value) {
        this.expireAfterPeriod = value;
    }

    /**
     * Ruft den Wert der paymentGracePeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPaymentGracePeriod() {
        return paymentGracePeriod;
    }

    /**
     * Legt den Wert der paymentGracePeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPaymentGracePeriod(Duration value) {
        this.paymentGracePeriod = value;
    }

    /**
     * Ruft den Wert der billingPolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TravelBillingPolicyEnumeration }
     *     
     */
    public TravelBillingPolicyEnumeration getBillingPolicy() {
        return billingPolicy;
    }

    /**
     * Legt den Wert der billingPolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelBillingPolicyEnumeration }
     *     
     */
    public void setBillingPolicy(TravelBillingPolicyEnumeration value) {
        this.billingPolicy = value;
    }

    /**
     * Ruft den Wert der depositPolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DepositPolicyEnumeration }
     *     
     */
    public DepositPolicyEnumeration getDepositPolicy() {
        return depositPolicy;
    }

    /**
     * Legt den Wert der depositPolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositPolicyEnumeration }
     *     
     */
    public void setDepositPolicy(DepositPolicyEnumeration value) {
        this.depositPolicy = value;
    }

}
