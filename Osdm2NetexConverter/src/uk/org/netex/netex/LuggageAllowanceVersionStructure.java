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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for LUGGAGE ALLOWANCE.
 * 
 * <p>Java-Klasse f�r LuggageAllowance_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LuggageAllowance_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LuggageAllowanceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LuggageAllowance_VersionStructure", propOrder = {
    "baggageUseType",
    "baggageType",
    "luggageAllowanceType",
    "maximumNumberItems",
    "maximumBagHeight",
    "maximumBagWidth",
    "maximumBagDepth",
    "maximumBagWeight",
    "totalWeight",
    "luggageChargingBasis"
})
@XmlSeeAlso({
    LuggageAllowance.class
})
public class LuggageAllowanceVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "BaggageUseType")
    @XmlSchemaType(name = "normalizedString")
    protected BaggageUseTypeEnumeration baggageUseType;
    @XmlElement(name = "BaggageType")
    @XmlSchemaType(name = "normalizedString")
    protected BaggageTypeEnumeration baggageType;
    @XmlElement(name = "LuggageAllowanceType")
    @XmlSchemaType(name = "normalizedString")
    protected LuggageAllowanceTypeEnumeration luggageAllowanceType;
    @XmlElement(name = "MaximumNumberItems")
    protected BigInteger maximumNumberItems;
    @XmlElement(name = "MaximumBagHeight")
    protected BigDecimal maximumBagHeight;
    @XmlElement(name = "MaximumBagWidth")
    protected BigDecimal maximumBagWidth;
    @XmlElement(name = "MaximumBagDepth")
    protected BigDecimal maximumBagDepth;
    @XmlElement(name = "MaximumBagWeight")
    protected BigDecimal maximumBagWeight;
    @XmlElement(name = "TotalWeight")
    protected BigDecimal totalWeight;
    @XmlElement(name = "LuggageChargingBasis")
    @XmlSchemaType(name = "normalizedString")
    protected LuggageChargingBasisEnumeration luggageChargingBasis;

    /**
     * Ruft den Wert der baggageUseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BaggageUseTypeEnumeration }
     *     
     */
    public BaggageUseTypeEnumeration getBaggageUseType() {
        return baggageUseType;
    }

    /**
     * Legt den Wert der baggageUseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageUseTypeEnumeration }
     *     
     */
    public void setBaggageUseType(BaggageUseTypeEnumeration value) {
        this.baggageUseType = value;
    }

    /**
     * Ruft den Wert der baggageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BaggageTypeEnumeration }
     *     
     */
    public BaggageTypeEnumeration getBaggageType() {
        return baggageType;
    }

    /**
     * Legt den Wert der baggageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageTypeEnumeration }
     *     
     */
    public void setBaggageType(BaggageTypeEnumeration value) {
        this.baggageType = value;
    }

    /**
     * Ruft den Wert der luggageAllowanceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LuggageAllowanceTypeEnumeration }
     *     
     */
    public LuggageAllowanceTypeEnumeration getLuggageAllowanceType() {
        return luggageAllowanceType;
    }

    /**
     * Legt den Wert der luggageAllowanceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageAllowanceTypeEnumeration }
     *     
     */
    public void setLuggageAllowanceType(LuggageAllowanceTypeEnumeration value) {
        this.luggageAllowanceType = value;
    }

    /**
     * Ruft den Wert der maximumNumberItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberItems() {
        return maximumNumberItems;
    }

    /**
     * Legt den Wert der maximumNumberItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberItems(BigInteger value) {
        this.maximumNumberItems = value;
    }

    /**
     * Ruft den Wert der maximumBagHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagHeight() {
        return maximumBagHeight;
    }

    /**
     * Legt den Wert der maximumBagHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagHeight(BigDecimal value) {
        this.maximumBagHeight = value;
    }

    /**
     * Ruft den Wert der maximumBagWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagWidth() {
        return maximumBagWidth;
    }

    /**
     * Legt den Wert der maximumBagWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagWidth(BigDecimal value) {
        this.maximumBagWidth = value;
    }

    /**
     * Ruft den Wert der maximumBagDepth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagDepth() {
        return maximumBagDepth;
    }

    /**
     * Legt den Wert der maximumBagDepth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagDepth(BigDecimal value) {
        this.maximumBagDepth = value;
    }

    /**
     * Ruft den Wert der maximumBagWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagWeight() {
        return maximumBagWeight;
    }

    /**
     * Legt den Wert der maximumBagWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagWeight(BigDecimal value) {
        this.maximumBagWeight = value;
    }

    /**
     * Ruft den Wert der totalWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    /**
     * Legt den Wert der totalWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalWeight(BigDecimal value) {
        this.totalWeight = value;
    }

    /**
     * Ruft den Wert der luggageChargingBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LuggageChargingBasisEnumeration }
     *     
     */
    public LuggageChargingBasisEnumeration getLuggageChargingBasis() {
        return luggageChargingBasis;
    }

    /**
     * Legt den Wert der luggageChargingBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageChargingBasisEnumeration }
     *     
     */
    public void setLuggageChargingBasis(LuggageChargingBasisEnumeration value) {
        this.luggageChargingBasis = value;
    }

}
