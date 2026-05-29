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
 * Flight of stairs.
 * 
 * <p>Java-Klasse f�r StairFlight_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StairFlight_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}StairGroup"/>
 *         &lt;element name="ContinuousHandrail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StairFlight_VersionedChildStructure", propOrder = {
    "depth",
    "numberOfSteps",
    "stepHeight",
    "stepLength",
    "stepColourContrast",
    "stepCondition",
    "handrailType",
    "handrailHeight",
    "lowerHandrailHeight",
    "tactileWriting",
    "stairRamp",
    "topEnd",
    "bottomEnd",
    "continuousHandrail"
})
@XmlSeeAlso({
    StairFlight.class
})
public class StairFlightVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Depth")
    protected BigDecimal depth;
    @XmlElement(name = "NumberOfSteps")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSteps;
    @XmlElement(name = "StepHeight")
    protected BigDecimal stepHeight;
    @XmlElement(name = "StepLength")
    protected BigDecimal stepLength;
    @XmlElement(name = "StepColourContrast")
    protected Boolean stepColourContrast;
    @XmlElement(name = "StepCondition")
    @XmlSchemaType(name = "NMTOKEN")
    protected StepConditionEnumeration stepCondition;
    @XmlElement(name = "HandrailType")
    @XmlSchemaType(name = "string")
    protected HandrailEnumeration handrailType;
    @XmlElement(name = "HandrailHeight")
    protected BigDecimal handrailHeight;
    @XmlElement(name = "LowerHandrailHeight")
    protected BigDecimal lowerHandrailHeight;
    @XmlElement(name = "TactileWriting")
    protected Boolean tactileWriting;
    @XmlElement(name = "StairRamp", defaultValue = "none")
    @XmlSchemaType(name = "NMTOKEN")
    protected StairRampEnumeration stairRamp;
    @XmlElement(name = "TopEnd")
    protected StairEndStructure topEnd;
    @XmlElement(name = "BottomEnd")
    protected StairEndStructure bottomEnd;
    @XmlElement(name = "ContinuousHandrail")
    protected Boolean continuousHandrail;

    /**
     * Ruft den Wert der depth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepth() {
        return depth;
    }

    /**
     * Legt den Wert der depth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepth(BigDecimal value) {
        this.depth = value;
    }

    /**
     * Ruft den Wert der numberOfSteps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSteps() {
        return numberOfSteps;
    }

    /**
     * Legt den Wert der numberOfSteps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSteps(BigInteger value) {
        this.numberOfSteps = value;
    }

    /**
     * Ruft den Wert der stepHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStepHeight() {
        return stepHeight;
    }

    /**
     * Legt den Wert der stepHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStepHeight(BigDecimal value) {
        this.stepHeight = value;
    }

    /**
     * Ruft den Wert der stepLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStepLength() {
        return stepLength;
    }

    /**
     * Legt den Wert der stepLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStepLength(BigDecimal value) {
        this.stepLength = value;
    }

    /**
     * Ruft den Wert der stepColourContrast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStepColourContrast() {
        return stepColourContrast;
    }

    /**
     * Legt den Wert der stepColourContrast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStepColourContrast(Boolean value) {
        this.stepColourContrast = value;
    }

    /**
     * Ruft den Wert der stepCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StepConditionEnumeration }
     *     
     */
    public StepConditionEnumeration getStepCondition() {
        return stepCondition;
    }

    /**
     * Legt den Wert der stepCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StepConditionEnumeration }
     *     
     */
    public void setStepCondition(StepConditionEnumeration value) {
        this.stepCondition = value;
    }

    /**
     * Ruft den Wert der handrailType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HandrailEnumeration }
     *     
     */
    public HandrailEnumeration getHandrailType() {
        return handrailType;
    }

    /**
     * Legt den Wert der handrailType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HandrailEnumeration }
     *     
     */
    public void setHandrailType(HandrailEnumeration value) {
        this.handrailType = value;
    }

    /**
     * Ruft den Wert der handrailHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHandrailHeight() {
        return handrailHeight;
    }

    /**
     * Legt den Wert der handrailHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHandrailHeight(BigDecimal value) {
        this.handrailHeight = value;
    }

    /**
     * Ruft den Wert der lowerHandrailHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowerHandrailHeight() {
        return lowerHandrailHeight;
    }

    /**
     * Legt den Wert der lowerHandrailHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowerHandrailHeight(BigDecimal value) {
        this.lowerHandrailHeight = value;
    }

    /**
     * Ruft den Wert der tactileWriting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileWriting() {
        return tactileWriting;
    }

    /**
     * Legt den Wert der tactileWriting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileWriting(Boolean value) {
        this.tactileWriting = value;
    }

    /**
     * Ruft den Wert der stairRamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StairRampEnumeration }
     *     
     */
    public StairRampEnumeration getStairRamp() {
        return stairRamp;
    }

    /**
     * Legt den Wert der stairRamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StairRampEnumeration }
     *     
     */
    public void setStairRamp(StairRampEnumeration value) {
        this.stairRamp = value;
    }

    /**
     * Ruft den Wert der topEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StairEndStructure }
     *     
     */
    public StairEndStructure getTopEnd() {
        return topEnd;
    }

    /**
     * Legt den Wert der topEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StairEndStructure }
     *     
     */
    public void setTopEnd(StairEndStructure value) {
        this.topEnd = value;
    }

    /**
     * Ruft den Wert der bottomEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StairEndStructure }
     *     
     */
    public StairEndStructure getBottomEnd() {
        return bottomEnd;
    }

    /**
     * Legt den Wert der bottomEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StairEndStructure }
     *     
     */
    public void setBottomEnd(StairEndStructure value) {
        this.bottomEnd = value;
    }

    /**
     * Ruft den Wert der continuousHandrail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContinuousHandrail() {
        return continuousHandrail;
    }

    /**
     * Legt den Wert der continuousHandrail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinuousHandrail(Boolean value) {
        this.continuousHandrail = value;
    }

}
