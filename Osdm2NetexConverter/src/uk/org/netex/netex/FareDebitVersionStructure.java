//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for FARE DEBIT.
 * 
 * <p>Java-Klasse f�r FareDebit_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareDebit_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LogEntry_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FareDebitGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDebit_VersionStructure", propOrder = {
    "amount",
    "currency",
    "priceUnitRef",
    "units",
    "ruleStepResults",
    "paymentMethod",
    "typeOfPaymentMethodRef",
    "cardNumber"
})
@XmlSeeAlso({
    FareDebit.class,
    TripDebitVersionStructure.class,
    OffenceDebitVersionStructure.class,
    FareProductSaleDebitVersionStructure.class,
    BookingDebitVersionStructure.class,
    OtherDebitVersionStructure.class
})
public class FareDebitVersionStructure
    extends LogEntryVersionStructure
{

    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "Currency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String currency;
    @XmlElement(name = "PriceUnitRef")
    protected PriceUnitRefStructure priceUnitRef;
    @XmlElement(name = "Units")
    protected BigDecimal units;
    protected PriceRuleStepResultsRelStructure ruleStepResults;
    @XmlElement(name = "PaymentMethod")
    @XmlSchemaType(name = "normalizedString")
    protected PaymentMethodEnumeration paymentMethod;
    @XmlElement(name = "TypeOfPaymentMethodRef")
    protected TypeOfPaymentMethodRef typeOfPaymentMethodRef;
    @XmlElement(name = "CardNumber")
    protected PrivateCodeStructure cardNumber;

    /**
     * Ruft den Wert der amount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Legt den Wert der amount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Legt den Wert der currency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Ruft den Wert der priceUnitRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceUnitRefStructure }
     *     
     */
    public PriceUnitRefStructure getPriceUnitRef() {
        return priceUnitRef;
    }

    /**
     * Legt den Wert der priceUnitRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceUnitRefStructure }
     *     
     */
    public void setPriceUnitRef(PriceUnitRefStructure value) {
        this.priceUnitRef = value;
    }

    /**
     * Ruft den Wert der units-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnits() {
        return units;
    }

    /**
     * Legt den Wert der units-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnits(BigDecimal value) {
        this.units = value;
    }

    /**
     * Ruft den Wert der ruleStepResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceRuleStepResultsRelStructure }
     *     
     */
    public PriceRuleStepResultsRelStructure getRuleStepResults() {
        return ruleStepResults;
    }

    /**
     * Legt den Wert der ruleStepResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRuleStepResultsRelStructure }
     *     
     */
    public void setRuleStepResults(PriceRuleStepResultsRelStructure value) {
        this.ruleStepResults = value;
    }

    /**
     * Ruft den Wert der paymentMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodEnumeration }
     *     
     */
    public PaymentMethodEnumeration getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Legt den Wert der paymentMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodEnumeration }
     *     
     */
    public void setPaymentMethod(PaymentMethodEnumeration value) {
        this.paymentMethod = value;
    }

    /**
     * Ruft den Wert der typeOfPaymentMethodRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPaymentMethodRef }
     *     
     */
    public TypeOfPaymentMethodRef getTypeOfPaymentMethodRef() {
        return typeOfPaymentMethodRef;
    }

    /**
     * Legt den Wert der typeOfPaymentMethodRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPaymentMethodRef }
     *     
     */
    public void setTypeOfPaymentMethodRef(TypeOfPaymentMethodRef value) {
        this.typeOfPaymentMethodRef = value;
    }

    /**
     * Ruft den Wert der cardNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getCardNumber() {
        return cardNumber;
    }

    /**
     * Legt den Wert der cardNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setCardNumber(PrivateCodeStructure value) {
        this.cardNumber = value;
    }

}
