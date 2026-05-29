//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for an ACCESSIBILITY LIMITATION.
 * 
 * <p>Java-Klasse f�r AccessibilityLimitation_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AccessibilityLimitation_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}MobilityLimitationGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SensoryLimitationGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessibilityLimitation_VersionedChildStructure", propOrder = {
    "wheelchairAccess",
    "stepFreeAccess",
    "stairFreeAccess",
    "escalatorFreeAccess",
    "liftFreeAccess",
    "rampFreeAccess",
    "levelAccessIntoVehicle",
    "audibleSignalsAvailable",
    "visualSignsAvailable",
    "tactileGuidanceAvailable",
    "guideDogAccess"
})
@XmlSeeAlso({
    AccessibilityLimitation.class
})
public class AccessibilityLimitationVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "WheelchairAccess", required = true, defaultValue = "false")
    @XmlSchemaType(name = "string")
    protected LimitationStatusEnumeration wheelchairAccess;
    @XmlElement(name = "StepFreeAccess", defaultValue = "unknown")
    @XmlSchemaType(name = "string")
    protected LimitationStatusEnumeration stepFreeAccess;
    @XmlElement(name = "StairFreeAccess", defaultValue = "unknown")
    @XmlSchemaType(name = "string")
    protected LimitationStatusEnumeration stairFreeAccess;
    @XmlElement(name = "EscalatorFreeAccess", defaultValue = "unknown")
    @XmlSchemaType(name = "string")
    protected LimitationStatusEnumeration escalatorFreeAccess;
    @XmlElement(name = "LiftFreeAccess", defaultValue = "unknown")
    @XmlSchemaType(name = "string")
    protected LimitationStatusEnumeration liftFreeAccess;
    @XmlElement(name = "RampFreeAccess", defaultValue = "unknown")
    @XmlSchemaType(name = "string")
    protected LimitationStatusEnumeration rampFreeAccess;
    @XmlElement(name = "LevelAccessIntoVehicle", defaultValue = "unknown")
    @XmlSchemaType(name = "string")
    protected LimitationStatusEnumeration levelAccessIntoVehicle;
    @XmlElement(name = "AudibleSignalsAvailable", defaultValue = "unknown")
    @XmlSchemaType(name = "string")
    protected LimitationStatusEnumeration audibleSignalsAvailable;
    @XmlElement(name = "VisualSignsAvailable", defaultValue = "unknown")
    @XmlSchemaType(name = "string")
    protected LimitationStatusEnumeration visualSignsAvailable;
    @XmlElement(name = "TactileGuidanceAvailable", defaultValue = "unknown")
    @XmlSchemaType(name = "string")
    protected LimitationStatusEnumeration tactileGuidanceAvailable;
    @XmlElement(name = "GuideDogAccess", defaultValue = "unknown")
    @XmlSchemaType(name = "string")
    protected LimitationStatusEnumeration guideDogAccess;

    /**
     * Ruft den Wert der wheelchairAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public LimitationStatusEnumeration getWheelchairAccess() {
        return wheelchairAccess;
    }

    /**
     * Legt den Wert der wheelchairAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public void setWheelchairAccess(LimitationStatusEnumeration value) {
        this.wheelchairAccess = value;
    }

    /**
     * Ruft den Wert der stepFreeAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public LimitationStatusEnumeration getStepFreeAccess() {
        return stepFreeAccess;
    }

    /**
     * Legt den Wert der stepFreeAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public void setStepFreeAccess(LimitationStatusEnumeration value) {
        this.stepFreeAccess = value;
    }

    /**
     * Ruft den Wert der stairFreeAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public LimitationStatusEnumeration getStairFreeAccess() {
        return stairFreeAccess;
    }

    /**
     * Legt den Wert der stairFreeAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public void setStairFreeAccess(LimitationStatusEnumeration value) {
        this.stairFreeAccess = value;
    }

    /**
     * Ruft den Wert der escalatorFreeAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public LimitationStatusEnumeration getEscalatorFreeAccess() {
        return escalatorFreeAccess;
    }

    /**
     * Legt den Wert der escalatorFreeAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public void setEscalatorFreeAccess(LimitationStatusEnumeration value) {
        this.escalatorFreeAccess = value;
    }

    /**
     * Ruft den Wert der liftFreeAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public LimitationStatusEnumeration getLiftFreeAccess() {
        return liftFreeAccess;
    }

    /**
     * Legt den Wert der liftFreeAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public void setLiftFreeAccess(LimitationStatusEnumeration value) {
        this.liftFreeAccess = value;
    }

    /**
     * Ruft den Wert der rampFreeAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public LimitationStatusEnumeration getRampFreeAccess() {
        return rampFreeAccess;
    }

    /**
     * Legt den Wert der rampFreeAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public void setRampFreeAccess(LimitationStatusEnumeration value) {
        this.rampFreeAccess = value;
    }

    /**
     * Ruft den Wert der levelAccessIntoVehicle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public LimitationStatusEnumeration getLevelAccessIntoVehicle() {
        return levelAccessIntoVehicle;
    }

    /**
     * Legt den Wert der levelAccessIntoVehicle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public void setLevelAccessIntoVehicle(LimitationStatusEnumeration value) {
        this.levelAccessIntoVehicle = value;
    }

    /**
     * Whether a PLACE has audible signals for the visually impaired.
     * 
     * @return
     *     possible object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public LimitationStatusEnumeration getAudibleSignalsAvailable() {
        return audibleSignalsAvailable;
    }

    /**
     * Legt den Wert der audibleSignalsAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public void setAudibleSignalsAvailable(LimitationStatusEnumeration value) {
        this.audibleSignalsAvailable = value;
    }

    /**
     * Whether a PLACE has visual signals for the hearing impaired.
     * 
     * @return
     *     possible object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public LimitationStatusEnumeration getVisualSignsAvailable() {
        return visualSignsAvailable;
    }

    /**
     * Legt den Wert der visualSignsAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public void setVisualSignsAvailable(LimitationStatusEnumeration value) {
        this.visualSignsAvailable = value;
    }

    /**
     * Whether a PLACE has tactile guidance.
     * 
     * @return
     *     possible object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public LimitationStatusEnumeration getTactileGuidanceAvailable() {
        return tactileGuidanceAvailable;
    }

    /**
     * Legt den Wert der tactileGuidanceAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public void setTactileGuidanceAvailable(LimitationStatusEnumeration value) {
        this.tactileGuidanceAvailable = value;
    }

    /**
     * Whether a PLACE allows guide dog access.
     * 
     * @return
     *     possible object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public LimitationStatusEnumeration getGuideDogAccess() {
        return guideDogAccess;
    }

    /**
     * Legt den Wert der guideDogAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public void setGuideDogAccess(LimitationStatusEnumeration value) {
        this.guideDogAccess = value;
    }

}
