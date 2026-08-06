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
import javax.xml.datatype.Duration;


/**
 * Type for a LEFT LUGGAGE SERVICE.
 * 
 * <p>Java-Klasse f�r LeftLuggageService_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LeftLuggageService_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}CustomerService_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LeftLuggageServiceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeftLuggageService_VersionStructure", propOrder = {
    "counterService",
    "selfServiceLockers",
    "feePerBag",
    "lockerFee",
    "maximumBagWidth",
    "maximumBagHeight",
    "maximumBagDepth",
    "maximumBagWeight",
    "maximumDuration"
})
@XmlSeeAlso({
    LeftLuggageService.class
})
public class LeftLuggageServiceVersionStructure
    extends CustomerServiceVersionStructure
{

    @XmlElement(name = "CounterService")
    protected Boolean counterService;
    @XmlElement(name = "SelfServiceLockers")
    protected Boolean selfServiceLockers;
    @XmlElement(name = "FeePerBag")
    protected Boolean feePerBag;
    @XmlElement(name = "LockerFee")
    protected Boolean lockerFee;
    @XmlElement(name = "MaximumBagWidth")
    protected BigDecimal maximumBagWidth;
    @XmlElement(name = "MaximumBagHeight")
    protected BigDecimal maximumBagHeight;
    @XmlElement(name = "MaximumBagDepth")
    protected BigDecimal maximumBagDepth;
    @XmlElement(name = "MaximumBagWeight")
    protected BigDecimal maximumBagWeight;
    @XmlElement(name = "MaximumDuration")
    protected Duration maximumDuration;

    /**
     * Ruft den Wert der counterService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCounterService() {
        return counterService;
    }

    /**
     * Legt den Wert der counterService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCounterService(Boolean value) {
        this.counterService = value;
    }

    /**
     * Ruft den Wert der selfServiceLockers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelfServiceLockers() {
        return selfServiceLockers;
    }

    /**
     * Legt den Wert der selfServiceLockers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfServiceLockers(Boolean value) {
        this.selfServiceLockers = value;
    }

    /**
     * Ruft den Wert der feePerBag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeePerBag() {
        return feePerBag;
    }

    /**
     * Legt den Wert der feePerBag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeePerBag(Boolean value) {
        this.feePerBag = value;
    }

    /**
     * Ruft den Wert der lockerFee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockerFee() {
        return lockerFee;
    }

    /**
     * Legt den Wert der lockerFee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockerFee(Boolean value) {
        this.lockerFee = value;
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
     * Ruft den Wert der maximumDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumDuration() {
        return maximumDuration;
    }

    /**
     * Legt den Wert der maximumDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumDuration(Duration value) {
        this.maximumDuration = value;
    }

}
