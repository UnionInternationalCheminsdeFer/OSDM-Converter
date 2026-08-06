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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for DISCOUNTING RULE.
 * 
 * <p>Java-Klasse f�r DiscountingRule_VersionedStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DiscountingRule_VersionedStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PricingRule_VersionedStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DiscountingRuleGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountingRule_VersionedStructure", propOrder = {
    "discountAsPercentage",
    "discountAsValue",
    "canBeCumulative"
})
@XmlSeeAlso({
    DiscountingRule.class,
    LimitingRuleVersionedStructure.class
})
public abstract class DiscountingRuleVersionedStructure
    extends PricingRuleVersionedStructure
{

    @XmlElement(name = "DiscountAsPercentage")
    protected BigDecimal discountAsPercentage;
    @XmlElement(name = "DiscountAsValue")
    protected BigDecimal discountAsValue;
    @XmlElement(name = "CanBeCumulative", defaultValue = "true")
    protected Boolean canBeCumulative;

    /**
     * Ruft den Wert der discountAsPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAsPercentage() {
        return discountAsPercentage;
    }

    /**
     * Legt den Wert der discountAsPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAsPercentage(BigDecimal value) {
        this.discountAsPercentage = value;
    }

    /**
     * Ruft den Wert der discountAsValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAsValue() {
        return discountAsValue;
    }

    /**
     * Legt den Wert der discountAsValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAsValue(BigDecimal value) {
        this.discountAsValue = value;
    }

    /**
     * Ruft den Wert der canBeCumulative-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBeCumulative() {
        return canBeCumulative;
    }

    /**
     * Legt den Wert der canBeCumulative-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBeCumulative(Boolean value) {
        this.canBeCumulative = value;
    }

}
