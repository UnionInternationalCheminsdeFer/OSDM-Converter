//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
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
 * Type for RESELLING.
 * 
 * <p>Java-Klasse f�r Reselling_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Reselling_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ResellingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reselling_VersionStructure", propOrder = {
    "allowed",
    "canChangeClass",
    "unusedTicketsOnly",
    "onlyAtCertainDistributionPoints",
    "resellWhen",
    "exchangableFromAnyTime",
    "exchangableFromDuration",
    "exchangableFromPercentUse",
    "exchangableFromIntervalRef",
    "exchangableUntilAnyTime",
    "exchangableUntilDuration",
    "exchangableUntilPercentUse",
    "exchangableUntilIntervalRef",
    "effectiveFrom",
    "notificationPeriod",
    "hasFee",
    "refundBasis",
    "paymentMethods",
    "typesOfPaymentMethodRef"
})
@XmlSeeAlso({
    Reselling.class,
    ReplacingVersionStructure.class,
    ExchangingVersionStructure.class,
    RefundingVersionStructure.class
})
public class ResellingVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "Allowed")
    @XmlSchemaType(name = "normalizedString")
    protected ResellTypeEnumeration allowed;
    @XmlElement(name = "CanChangeClass")
    protected Boolean canChangeClass;
    @XmlElement(name = "UnusedTicketsOnly")
    protected Boolean unusedTicketsOnly;
    @XmlElement(name = "OnlyAtCertainDistributionPoints")
    protected Boolean onlyAtCertainDistributionPoints;
    @XmlElement(name = "ResellWhen")
    @XmlSchemaType(name = "normalizedString")
    protected ResellWhenEnumeration resellWhen;
    @XmlElement(name = "ExchangableFromAnyTime")
    protected String exchangableFromAnyTime;
    @XmlElement(name = "ExchangableFromDuration")
    protected Duration exchangableFromDuration;
    @XmlElement(name = "ExchangableFromPercentUse")
    protected BigDecimal exchangableFromPercentUse;
    @XmlElement(name = "ExchangableFromIntervalRef")
    protected TimeIntervalRefStructure exchangableFromIntervalRef;
    @XmlElement(name = "ExchangableUntilAnyTime")
    protected String exchangableUntilAnyTime;
    @XmlElement(name = "ExchangableUntilDuration")
    protected Duration exchangableUntilDuration;
    @XmlElement(name = "ExchangableUntilPercentUse")
    protected BigDecimal exchangableUntilPercentUse;
    @XmlElement(name = "ExchangableUntilIntervalRef")
    protected TimeIntervalRefStructure exchangableUntilIntervalRef;
    @XmlElement(name = "EffectiveFrom")
    @XmlSchemaType(name = "normalizedString")
    protected EffectiveFromEnumeration effectiveFrom;
    @XmlElement(name = "NotificationPeriod")
    protected Duration notificationPeriod;
    @XmlElement(name = "HasFee")
    protected Boolean hasFee;
    @XmlElement(name = "RefundBasis")
    @XmlSchemaType(name = "normalizedString")
    protected PerBasisEnumeration refundBasis;
    @XmlList
    @XmlElement(name = "PaymentMethods")
    protected List<PaymentMethodEnumeration> paymentMethods;
    protected TypeOfPaymentMethodRefsRelStructure typesOfPaymentMethodRef;

    /**
     * Ruft den Wert der allowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResellTypeEnumeration }
     *     
     */
    public ResellTypeEnumeration getAllowed() {
        return allowed;
    }

    /**
     * Legt den Wert der allowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResellTypeEnumeration }
     *     
     */
    public void setAllowed(ResellTypeEnumeration value) {
        this.allowed = value;
    }

    /**
     * Ruft den Wert der canChangeClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanChangeClass() {
        return canChangeClass;
    }

    /**
     * Legt den Wert der canChangeClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanChangeClass(Boolean value) {
        this.canChangeClass = value;
    }

    /**
     * Ruft den Wert der unusedTicketsOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnusedTicketsOnly() {
        return unusedTicketsOnly;
    }

    /**
     * Legt den Wert der unusedTicketsOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnusedTicketsOnly(Boolean value) {
        this.unusedTicketsOnly = value;
    }

    /**
     * Ruft den Wert der onlyAtCertainDistributionPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyAtCertainDistributionPoints() {
        return onlyAtCertainDistributionPoints;
    }

    /**
     * Legt den Wert der onlyAtCertainDistributionPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyAtCertainDistributionPoints(Boolean value) {
        this.onlyAtCertainDistributionPoints = value;
    }

    /**
     * Ruft den Wert der resellWhen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResellWhenEnumeration }
     *     
     */
    public ResellWhenEnumeration getResellWhen() {
        return resellWhen;
    }

    /**
     * Legt den Wert der resellWhen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResellWhenEnumeration }
     *     
     */
    public void setResellWhen(ResellWhenEnumeration value) {
        this.resellWhen = value;
    }

    /**
     * Ruft den Wert der exchangableFromAnyTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangableFromAnyTime() {
        return exchangableFromAnyTime;
    }

    /**
     * Legt den Wert der exchangableFromAnyTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangableFromAnyTime(String value) {
        this.exchangableFromAnyTime = value;
    }

    /**
     * Ruft den Wert der exchangableFromDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExchangableFromDuration() {
        return exchangableFromDuration;
    }

    /**
     * Legt den Wert der exchangableFromDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExchangableFromDuration(Duration value) {
        this.exchangableFromDuration = value;
    }

    /**
     * Ruft den Wert der exchangableFromPercentUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangableFromPercentUse() {
        return exchangableFromPercentUse;
    }

    /**
     * Legt den Wert der exchangableFromPercentUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangableFromPercentUse(BigDecimal value) {
        this.exchangableFromPercentUse = value;
    }

    /**
     * Ruft den Wert der exchangableFromIntervalRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public TimeIntervalRefStructure getExchangableFromIntervalRef() {
        return exchangableFromIntervalRef;
    }

    /**
     * Legt den Wert der exchangableFromIntervalRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public void setExchangableFromIntervalRef(TimeIntervalRefStructure value) {
        this.exchangableFromIntervalRef = value;
    }

    /**
     * Ruft den Wert der exchangableUntilAnyTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangableUntilAnyTime() {
        return exchangableUntilAnyTime;
    }

    /**
     * Legt den Wert der exchangableUntilAnyTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangableUntilAnyTime(String value) {
        this.exchangableUntilAnyTime = value;
    }

    /**
     * Ruft den Wert der exchangableUntilDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExchangableUntilDuration() {
        return exchangableUntilDuration;
    }

    /**
     * Legt den Wert der exchangableUntilDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExchangableUntilDuration(Duration value) {
        this.exchangableUntilDuration = value;
    }

    /**
     * Ruft den Wert der exchangableUntilPercentUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangableUntilPercentUse() {
        return exchangableUntilPercentUse;
    }

    /**
     * Legt den Wert der exchangableUntilPercentUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangableUntilPercentUse(BigDecimal value) {
        this.exchangableUntilPercentUse = value;
    }

    /**
     * Ruft den Wert der exchangableUntilIntervalRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public TimeIntervalRefStructure getExchangableUntilIntervalRef() {
        return exchangableUntilIntervalRef;
    }

    /**
     * Legt den Wert der exchangableUntilIntervalRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public void setExchangableUntilIntervalRef(TimeIntervalRefStructure value) {
        this.exchangableUntilIntervalRef = value;
    }

    /**
     * Ruft den Wert der effectiveFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveFromEnumeration }
     *     
     */
    public EffectiveFromEnumeration getEffectiveFrom() {
        return effectiveFrom;
    }

    /**
     * Legt den Wert der effectiveFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveFromEnumeration }
     *     
     */
    public void setEffectiveFrom(EffectiveFromEnumeration value) {
        this.effectiveFrom = value;
    }

    /**
     * Ruft den Wert der notificationPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getNotificationPeriod() {
        return notificationPeriod;
    }

    /**
     * Legt den Wert der notificationPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setNotificationPeriod(Duration value) {
        this.notificationPeriod = value;
    }

    /**
     * Ruft den Wert der hasFee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFee() {
        return hasFee;
    }

    /**
     * Legt den Wert der hasFee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFee(Boolean value) {
        this.hasFee = value;
    }

    /**
     * Ruft den Wert der refundBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PerBasisEnumeration }
     *     
     */
    public PerBasisEnumeration getRefundBasis() {
        return refundBasis;
    }

    /**
     * Legt den Wert der refundBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PerBasisEnumeration }
     *     
     */
    public void setRefundBasis(PerBasisEnumeration value) {
        this.refundBasis = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodEnumeration }
     * 
     * 
     */
    public List<PaymentMethodEnumeration> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<PaymentMethodEnumeration>();
        }
        return this.paymentMethods;
    }

    /**
     * Ruft den Wert der typesOfPaymentMethodRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPaymentMethodRefsRelStructure }
     *     
     */
    public TypeOfPaymentMethodRefsRelStructure getTypesOfPaymentMethodRef() {
        return typesOfPaymentMethodRef;
    }

    /**
     * Legt den Wert der typesOfPaymentMethodRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPaymentMethodRefsRelStructure }
     *     
     */
    public void setTypesOfPaymentMethodRef(TypeOfPaymentMethodRefsRelStructure value) {
        this.typesOfPaymentMethodRef = value;
    }

}
