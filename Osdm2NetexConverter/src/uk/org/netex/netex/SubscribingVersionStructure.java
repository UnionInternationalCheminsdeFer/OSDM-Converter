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
import javax.xml.datatype.Duration;


/**
 * Type for SUBSCRIBING.
 * 
 * <p>Java-Klasse f�r Subscribing_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Subscribing_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SubscribingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscribing_VersionStructure", propOrder = {
    "subscriptionTermType",
    "minimumSubscriptionPeriod",
    "maximumSubscriptionPeriod",
    "subscriptionRenewalPolicy",
    "possibleInstallmenttIntervals",
    "installmentPaymentMethods",
    "installmentTypesOfPaymentMethod"
})
@XmlSeeAlso({
    Subscribing.class
})
public class SubscribingVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "SubscriptionTermType", defaultValue = "fixed")
    @XmlSchemaType(name = "normalizedString")
    protected SubscriptionTermTypeEnumeration subscriptionTermType;
    @XmlElement(name = "MinimumSubscriptionPeriod")
    protected Duration minimumSubscriptionPeriod;
    @XmlElement(name = "MaximumSubscriptionPeriod")
    protected Duration maximumSubscriptionPeriod;
    @XmlElement(name = "SubscriptionRenewalPolicy", defaultValue = "automatic")
    @XmlSchemaType(name = "normalizedString")
    protected SubscriptionRenewalPolicyEnumeration subscriptionRenewalPolicy;
    protected TimeIntervalRefsRelStructure possibleInstallmenttIntervals;
    @XmlList
    @XmlElement(name = "InstallmentPaymentMethods")
    protected List<PaymentMethodEnumeration> installmentPaymentMethods;
    protected TypeOfPaymentMethodRefsRelStructure installmentTypesOfPaymentMethod;

    /**
     * Ruft den Wert der subscriptionTermType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionTermTypeEnumeration }
     *     
     */
    public SubscriptionTermTypeEnumeration getSubscriptionTermType() {
        return subscriptionTermType;
    }

    /**
     * Legt den Wert der subscriptionTermType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionTermTypeEnumeration }
     *     
     */
    public void setSubscriptionTermType(SubscriptionTermTypeEnumeration value) {
        this.subscriptionTermType = value;
    }

    /**
     * Ruft den Wert der minimumSubscriptionPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumSubscriptionPeriod() {
        return minimumSubscriptionPeriod;
    }

    /**
     * Legt den Wert der minimumSubscriptionPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumSubscriptionPeriod(Duration value) {
        this.minimumSubscriptionPeriod = value;
    }

    /**
     * Ruft den Wert der maximumSubscriptionPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumSubscriptionPeriod() {
        return maximumSubscriptionPeriod;
    }

    /**
     * Legt den Wert der maximumSubscriptionPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumSubscriptionPeriod(Duration value) {
        this.maximumSubscriptionPeriod = value;
    }

    /**
     * Ruft den Wert der subscriptionRenewalPolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionRenewalPolicyEnumeration }
     *     
     */
    public SubscriptionRenewalPolicyEnumeration getSubscriptionRenewalPolicy() {
        return subscriptionRenewalPolicy;
    }

    /**
     * Legt den Wert der subscriptionRenewalPolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionRenewalPolicyEnumeration }
     *     
     */
    public void setSubscriptionRenewalPolicy(SubscriptionRenewalPolicyEnumeration value) {
        this.subscriptionRenewalPolicy = value;
    }

    /**
     * Ruft den Wert der possibleInstallmenttIntervals-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalRefsRelStructure }
     *     
     */
    public TimeIntervalRefsRelStructure getPossibleInstallmenttIntervals() {
        return possibleInstallmenttIntervals;
    }

    /**
     * Legt den Wert der possibleInstallmenttIntervals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalRefsRelStructure }
     *     
     */
    public void setPossibleInstallmenttIntervals(TimeIntervalRefsRelStructure value) {
        this.possibleInstallmenttIntervals = value;
    }

    /**
     * Gets the value of the installmentPaymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installmentPaymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstallmentPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodEnumeration }
     * 
     * 
     */
    public List<PaymentMethodEnumeration> getInstallmentPaymentMethods() {
        if (installmentPaymentMethods == null) {
            installmentPaymentMethods = new ArrayList<PaymentMethodEnumeration>();
        }
        return this.installmentPaymentMethods;
    }

    /**
     * Ruft den Wert der installmentTypesOfPaymentMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPaymentMethodRefsRelStructure }
     *     
     */
    public TypeOfPaymentMethodRefsRelStructure getInstallmentTypesOfPaymentMethod() {
        return installmentTypesOfPaymentMethod;
    }

    /**
     * Legt den Wert der installmentTypesOfPaymentMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPaymentMethodRefsRelStructure }
     *     
     */
    public void setInstallmentTypesOfPaymentMethod(TypeOfPaymentMethodRefsRelStructure value) {
        this.installmentTypesOfPaymentMethod = value;
    }

}
