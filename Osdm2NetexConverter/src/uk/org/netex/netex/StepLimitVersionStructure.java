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


/**
 * Type for STEP LIMIT.
 * 
 * <p>Java-Klasse f�r StepLimit_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StepLimit_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}StepLimitGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StepLimit_VersionStructure", propOrder = {
    "restricted",
    "adjustmentUnits",
    "minimumNumberOfSteps",
    "maximumNumberOfSteps",
    "maximumNumberOfTrips"
})
@XmlSeeAlso({
    StepLimit.class
})
public class StepLimitVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "Restricted")
    protected Boolean restricted;
    @XmlElement(name = "AdjustmentUnits")
    @XmlSchemaType(name = "normalizedString")
    protected StepLimitUnitEnumeration adjustmentUnits;
    @XmlElement(name = "MinimumNumberOfSteps")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumNumberOfSteps;
    @XmlElement(name = "MaximumNumberOfSteps")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfSteps;
    @XmlElement(name = "MaximumNumberOfTrips")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfTrips;

    /**
     * Ruft den Wert der restricted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestricted() {
        return restricted;
    }

    /**
     * Legt den Wert der restricted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestricted(Boolean value) {
        this.restricted = value;
    }

    /**
     * Ruft den Wert der adjustmentUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StepLimitUnitEnumeration }
     *     
     */
    public StepLimitUnitEnumeration getAdjustmentUnits() {
        return adjustmentUnits;
    }

    /**
     * Legt den Wert der adjustmentUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StepLimitUnitEnumeration }
     *     
     */
    public void setAdjustmentUnits(StepLimitUnitEnumeration value) {
        this.adjustmentUnits = value;
    }

    /**
     * Ruft den Wert der minimumNumberOfSteps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNumberOfSteps() {
        return minimumNumberOfSteps;
    }

    /**
     * Legt den Wert der minimumNumberOfSteps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNumberOfSteps(BigInteger value) {
        this.minimumNumberOfSteps = value;
    }

    /**
     * Ruft den Wert der maximumNumberOfSteps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfSteps() {
        return maximumNumberOfSteps;
    }

    /**
     * Legt den Wert der maximumNumberOfSteps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfSteps(BigInteger value) {
        this.maximumNumberOfSteps = value;
    }

    /**
     * Ruft den Wert der maximumNumberOfTrips-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfTrips() {
        return maximumNumberOfTrips;
    }

    /**
     * Legt den Wert der maximumNumberOfTrips-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfTrips(BigInteger value) {
        this.maximumNumberOfTrips = value;
    }

}
