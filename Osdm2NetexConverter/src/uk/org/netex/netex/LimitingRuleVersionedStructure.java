//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for LIMITING RULE.
 * 
 * <p>Java-Klasse f�r LimitingRule_VersionedStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LimitingRule_VersionedStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DiscountingRule_VersionedStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LimitingRuleGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitingRule_VersionedStructure", propOrder = {
    "minimumPrice",
    "minimumPriceAsPercentage",
    "minimumPriceAsMultiple",
    "maximumPrice",
    "maximumPriceAsPercentage",
    "maximumPriceAsMultiple",
    "minimumLimitPriceAsPercentage",
    "minimumLimitPrice",
    "maximumLimitPriceAsPercentage",
    "maximumLimitPrice"
})
@XmlSeeAlso({
    LimitingRule.class,
    LimitingRuleInContext.class
})
public abstract class LimitingRuleVersionedStructure
    extends DiscountingRuleVersionedStructure
{

    @XmlElement(name = "MinimumPrice")
    protected BigDecimal minimumPrice;
    @XmlElement(name = "MinimumPriceAsPercentage")
    protected BigDecimal minimumPriceAsPercentage;
    @XmlElement(name = "MinimumPriceAsMultiple")
    protected BigInteger minimumPriceAsMultiple;
    @XmlElement(name = "MaximumPrice")
    protected BigDecimal maximumPrice;
    @XmlElement(name = "MaximumPriceAsPercentage")
    protected BigDecimal maximumPriceAsPercentage;
    @XmlElement(name = "MaximumPriceAsMultiple")
    protected BigInteger maximumPriceAsMultiple;
    @XmlElement(name = "MinimumLimitPriceAsPercentage")
    protected BigDecimal minimumLimitPriceAsPercentage;
    @XmlElement(name = "MinimumLimitPrice")
    protected BigDecimal minimumLimitPrice;
    @XmlElement(name = "MaximumLimitPriceAsPercentage")
    protected BigDecimal maximumLimitPriceAsPercentage;
    @XmlElement(name = "MaximumLimitPrice")
    protected BigDecimal maximumLimitPrice;

    /**
     * Ruft den Wert der minimumPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * Legt den Wert der minimumPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPrice(BigDecimal value) {
        this.minimumPrice = value;
    }

    /**
     * Ruft den Wert der minimumPriceAsPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPriceAsPercentage() {
        return minimumPriceAsPercentage;
    }

    /**
     * Legt den Wert der minimumPriceAsPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPriceAsPercentage(BigDecimal value) {
        this.minimumPriceAsPercentage = value;
    }

    /**
     * Ruft den Wert der minimumPriceAsMultiple-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumPriceAsMultiple() {
        return minimumPriceAsMultiple;
    }

    /**
     * Legt den Wert der minimumPriceAsMultiple-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumPriceAsMultiple(BigInteger value) {
        this.minimumPriceAsMultiple = value;
    }

    /**
     * Ruft den Wert der maximumPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPrice() {
        return maximumPrice;
    }

    /**
     * Legt den Wert der maximumPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPrice(BigDecimal value) {
        this.maximumPrice = value;
    }

    /**
     * Ruft den Wert der maximumPriceAsPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPriceAsPercentage() {
        return maximumPriceAsPercentage;
    }

    /**
     * Legt den Wert der maximumPriceAsPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPriceAsPercentage(BigDecimal value) {
        this.maximumPriceAsPercentage = value;
    }

    /**
     * Ruft den Wert der maximumPriceAsMultiple-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumPriceAsMultiple() {
        return maximumPriceAsMultiple;
    }

    /**
     * Legt den Wert der maximumPriceAsMultiple-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumPriceAsMultiple(BigInteger value) {
        this.maximumPriceAsMultiple = value;
    }

    /**
     * Ruft den Wert der minimumLimitPriceAsPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumLimitPriceAsPercentage() {
        return minimumLimitPriceAsPercentage;
    }

    /**
     * Legt den Wert der minimumLimitPriceAsPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumLimitPriceAsPercentage(BigDecimal value) {
        this.minimumLimitPriceAsPercentage = value;
    }

    /**
     * Ruft den Wert der minimumLimitPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumLimitPrice() {
        return minimumLimitPrice;
    }

    /**
     * Legt den Wert der minimumLimitPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumLimitPrice(BigDecimal value) {
        this.minimumLimitPrice = value;
    }

    /**
     * Ruft den Wert der maximumLimitPriceAsPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumLimitPriceAsPercentage() {
        return maximumLimitPriceAsPercentage;
    }

    /**
     * Legt den Wert der maximumLimitPriceAsPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumLimitPriceAsPercentage(BigDecimal value) {
        this.maximumLimitPriceAsPercentage = value;
    }

    /**
     * Ruft den Wert der maximumLimitPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumLimitPrice() {
        return maximumLimitPrice;
    }

    /**
     * Legt den Wert der maximumLimitPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumLimitPrice(BigDecimal value) {
        this.maximumLimitPrice = value;
    }

}
