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
import javax.xml.datatype.Duration;


/**
 * Type for FREQUENCY OF USE.
 * 
 * <p>Java-Klasse f�r FrequencyOfUse_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FrequencyOfUse_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FrequencyOfUseGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyOfUse_VersionStructure", propOrder = {
    "frequencyOfUseType",
    "minimalFrequency",
    "maximalFrequency",
    "frequencyInterval",
    "timeIntervalRef",
    "discountBasis"
})
@XmlSeeAlso({
    FrequencyOfUse.class
})
public class FrequencyOfUseVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "FrequencyOfUseType")
    @XmlSchemaType(name = "normalizedString")
    protected FrequencyOfUseTypeEnumeration frequencyOfUseType;
    @XmlElement(name = "MinimalFrequency")
    protected BigInteger minimalFrequency;
    @XmlElement(name = "MaximalFrequency")
    protected BigInteger maximalFrequency;
    @XmlElement(name = "FrequencyInterval")
    protected Duration frequencyInterval;
    @XmlElement(name = "TimeIntervalRef")
    protected TimeIntervalRefStructure timeIntervalRef;
    @XmlElement(name = "DiscountBasis")
    @XmlSchemaType(name = "normalizedString")
    protected DiscountBasisEnumeration discountBasis;

    /**
     * Ruft den Wert der frequencyOfUseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyOfUseTypeEnumeration }
     *     
     */
    public FrequencyOfUseTypeEnumeration getFrequencyOfUseType() {
        return frequencyOfUseType;
    }

    /**
     * Legt den Wert der frequencyOfUseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyOfUseTypeEnumeration }
     *     
     */
    public void setFrequencyOfUseType(FrequencyOfUseTypeEnumeration value) {
        this.frequencyOfUseType = value;
    }

    /**
     * Ruft den Wert der minimalFrequency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimalFrequency() {
        return minimalFrequency;
    }

    /**
     * Legt den Wert der minimalFrequency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimalFrequency(BigInteger value) {
        this.minimalFrequency = value;
    }

    /**
     * Ruft den Wert der maximalFrequency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximalFrequency() {
        return maximalFrequency;
    }

    /**
     * Legt den Wert der maximalFrequency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximalFrequency(BigInteger value) {
        this.maximalFrequency = value;
    }

    /**
     * Ruft den Wert der frequencyInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFrequencyInterval() {
        return frequencyInterval;
    }

    /**
     * Legt den Wert der frequencyInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFrequencyInterval(Duration value) {
        this.frequencyInterval = value;
    }

    /**
     * Ruft den Wert der timeIntervalRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public TimeIntervalRefStructure getTimeIntervalRef() {
        return timeIntervalRef;
    }

    /**
     * Legt den Wert der timeIntervalRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public void setTimeIntervalRef(TimeIntervalRefStructure value) {
        this.timeIntervalRef = value;
    }

    /**
     * Ruft den Wert der discountBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DiscountBasisEnumeration }
     *     
     */
    public DiscountBasisEnumeration getDiscountBasis() {
        return discountBasis;
    }

    /**
     * Legt den Wert der discountBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountBasisEnumeration }
     *     
     */
    public void setDiscountBasis(DiscountBasisEnumeration value) {
        this.discountBasis = value;
    }

}
