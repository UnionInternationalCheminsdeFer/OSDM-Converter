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
 * Type for a RAMP EQUIPMENT.
 * 
 * <p>Java-Klasse f�r RampEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RampEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccessEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RampEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RampEquipment_VersionStructure", propOrder = {
    "length",
    "maximumLoad",
    "gradient",
    "gradientType",
    "pedestal",
    "handrailType",
    "handrailHeight",
    "lowerHandrailHeight",
    "tactileWriting",
    "tactileGuidanceStrips",
    "visualGuidanceBands",
    "temporary",
    "suitableForCycles",
    "restStopDistance",
    "safetyEdge",
    "turningSpace"
})
@XmlSeeAlso({
    RampEquipment.class
})
public class RampEquipmentVersionStructure
    extends AccessEquipmentVersionStructure
{

    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "MaximumLoad")
    protected BigDecimal maximumLoad;
    @XmlElement(name = "Gradient")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger gradient;
    @XmlElement(name = "GradientType")
    @XmlSchemaType(name = "string")
    protected GradientEnumeration gradientType;
    @XmlElement(name = "Pedestal")
    protected Boolean pedestal;
    @XmlElement(name = "HandrailType")
    @XmlSchemaType(name = "string")
    protected HandrailEnumeration handrailType;
    @XmlElement(name = "HandrailHeight")
    protected BigDecimal handrailHeight;
    @XmlElement(name = "LowerHandrailHeight")
    protected BigDecimal lowerHandrailHeight;
    @XmlElement(name = "TactileWriting")
    protected Boolean tactileWriting;
    @XmlElement(name = "TactileGuidanceStrips")
    protected Boolean tactileGuidanceStrips;
    @XmlElement(name = "VisualGuidanceBands")
    protected Boolean visualGuidanceBands;
    @XmlElement(name = "Temporary")
    protected Boolean temporary;
    @XmlElement(name = "SuitableForCycles")
    protected Boolean suitableForCycles;
    @XmlElement(name = "RestStopDistance")
    protected BigDecimal restStopDistance;
    @XmlElement(name = "SafetyEdge")
    @XmlSchemaType(name = "string")
    protected SafetyEdgeEnumeration safetyEdge;
    @XmlElement(name = "TurningSpace")
    @XmlSchemaType(name = "NMTOKEN")
    protected RampTurningSpacePositionEnumeration turningSpace;

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der maximumLoad-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumLoad() {
        return maximumLoad;
    }

    /**
     * Legt den Wert der maximumLoad-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumLoad(BigDecimal value) {
        this.maximumLoad = value;
    }

    /**
     * Ruft den Wert der gradient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGradient() {
        return gradient;
    }

    /**
     * Legt den Wert der gradient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGradient(BigInteger value) {
        this.gradient = value;
    }

    /**
     * Ruft den Wert der gradientType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GradientEnumeration }
     *     
     */
    public GradientEnumeration getGradientType() {
        return gradientType;
    }

    /**
     * Legt den Wert der gradientType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GradientEnumeration }
     *     
     */
    public void setGradientType(GradientEnumeration value) {
        this.gradientType = value;
    }

    /**
     * Ruft den Wert der pedestal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPedestal() {
        return pedestal;
    }

    /**
     * Legt den Wert der pedestal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPedestal(Boolean value) {
        this.pedestal = value;
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
     * Ruft den Wert der tactileGuidanceStrips-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileGuidanceStrips() {
        return tactileGuidanceStrips;
    }

    /**
     * Legt den Wert der tactileGuidanceStrips-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileGuidanceStrips(Boolean value) {
        this.tactileGuidanceStrips = value;
    }

    /**
     * Ruft den Wert der visualGuidanceBands-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisualGuidanceBands() {
        return visualGuidanceBands;
    }

    /**
     * Legt den Wert der visualGuidanceBands-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisualGuidanceBands(Boolean value) {
        this.visualGuidanceBands = value;
    }

    /**
     * Ruft den Wert der temporary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemporary() {
        return temporary;
    }

    /**
     * Legt den Wert der temporary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemporary(Boolean value) {
        this.temporary = value;
    }

    /**
     * Ruft den Wert der suitableForCycles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuitableForCycles() {
        return suitableForCycles;
    }

    /**
     * Legt den Wert der suitableForCycles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuitableForCycles(Boolean value) {
        this.suitableForCycles = value;
    }

    /**
     * Ruft den Wert der restStopDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRestStopDistance() {
        return restStopDistance;
    }

    /**
     * Legt den Wert der restStopDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRestStopDistance(BigDecimal value) {
        this.restStopDistance = value;
    }

    /**
     * Ruft den Wert der safetyEdge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SafetyEdgeEnumeration }
     *     
     */
    public SafetyEdgeEnumeration getSafetyEdge() {
        return safetyEdge;
    }

    /**
     * Legt den Wert der safetyEdge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SafetyEdgeEnumeration }
     *     
     */
    public void setSafetyEdge(SafetyEdgeEnumeration value) {
        this.safetyEdge = value;
    }

    /**
     * Ruft den Wert der turningSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RampTurningSpacePositionEnumeration }
     *     
     */
    public RampTurningSpacePositionEnumeration getTurningSpace() {
        return turningSpace;
    }

    /**
     * Legt den Wert der turningSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RampTurningSpacePositionEnumeration }
     *     
     */
    public void setTurningSpace(RampTurningSpacePositionEnumeration value) {
        this.turningSpace = value;
    }

}
