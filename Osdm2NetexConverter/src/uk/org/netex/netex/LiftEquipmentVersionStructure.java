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


/**
 * Type for a LIFT EQUIPMENT.
 * 
 * <p>Java-Klasse f�r LiftEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LiftEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccessEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LiftEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiftEquipment_VersionStructure", propOrder = {
    "depth",
    "maximumLoad",
    "wheelchairPassable",
    "wheelchairTurningCircle",
    "internalWidth",
    "internalHeight",
    "handrailType",
    "handrailHeight",
    "lowerHandrailHeight",
    "tactileWriting",
    "callButtonHeight",
    "directionButtonHeight",
    "raisedButtons",
    "brailleButtons",
    "tactileGroundFloorButton",
    "groundMarkAlignedWithButton",
    "throughLoader",
    "mirrorOnOppositeSide",
    "attendant",
    "automatic",
    "externalFloorSelection",
    "alarmButton",
    "tactileActuators",
    "audioAnnouncements",
    "accousticAnnouncements",
    "reachedFloorAnnouncement",
    "magneticInductionLoop",
    "signageToLift",
    "suitableForCycles",
    "buttonsHeight"
})
@XmlSeeAlso({
    LiftEquipment.class
})
public class LiftEquipmentVersionStructure
    extends AccessEquipmentVersionStructure
{

    @XmlElement(name = "Depth")
    protected BigDecimal depth;
    @XmlElement(name = "MaximumLoad")
    protected BigDecimal maximumLoad;
    @XmlElement(name = "WheelchairPassable")
    protected Boolean wheelchairPassable;
    @XmlElement(name = "WheelchairTurningCircle")
    protected BigDecimal wheelchairTurningCircle;
    @XmlElement(name = "InternalWidth")
    protected BigDecimal internalWidth;
    @XmlElement(name = "InternalHeight")
    protected BigDecimal internalHeight;
    @XmlElement(name = "HandrailType")
    @XmlSchemaType(name = "string")
    protected HandrailEnumeration handrailType;
    @XmlElement(name = "HandrailHeight")
    protected BigDecimal handrailHeight;
    @XmlElement(name = "LowerHandrailHeight")
    protected BigDecimal lowerHandrailHeight;
    @XmlElement(name = "TactileWriting")
    protected Boolean tactileWriting;
    @XmlElement(name = "CallButtonHeight")
    protected BigDecimal callButtonHeight;
    @XmlElement(name = "DirectionButtonHeight")
    protected BigDecimal directionButtonHeight;
    @XmlElement(name = "RaisedButtons")
    protected Boolean raisedButtons;
    @XmlElement(name = "BrailleButtons")
    protected Boolean brailleButtons;
    @XmlElement(name = "TactileGroundFloorButton")
    protected Boolean tactileGroundFloorButton;
    @XmlElement(name = "GroundMarkAlignedWithButton")
    protected Boolean groundMarkAlignedWithButton;
    @XmlElement(name = "ThroughLoader")
    protected Boolean throughLoader;
    @XmlElement(name = "MirrorOnOppositeSide")
    protected Boolean mirrorOnOppositeSide;
    @XmlElement(name = "Attendant")
    protected Boolean attendant;
    @XmlElement(name = "Automatic")
    protected Boolean automatic;
    @XmlElement(name = "ExternalFloorSelection")
    protected Boolean externalFloorSelection;
    @XmlElement(name = "AlarmButton")
    protected Boolean alarmButton;
    @XmlElement(name = "TactileActuators")
    protected Boolean tactileActuators;
    @XmlElement(name = "AudioAnnouncements")
    protected Boolean audioAnnouncements;
    @XmlElement(name = "AccousticAnnouncements")
    protected Boolean accousticAnnouncements;
    @XmlElement(name = "ReachedFloorAnnouncement", defaultValue = "visual")
    @XmlSchemaType(name = "NMTOKEN")
    protected ReachedFloorAnnouncementEnumeration reachedFloorAnnouncement;
    @XmlElement(name = "MagneticInductionLoop")
    protected Boolean magneticInductionLoop;
    @XmlElement(name = "SignageToLift")
    protected Boolean signageToLift;
    @XmlElement(name = "SuitableForCycles")
    protected Boolean suitableForCycles;
    @XmlElement(name = "ButtonsHeight")
    protected BigDecimal buttonsHeight;

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
     * Ruft den Wert der wheelchairPassable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWheelchairPassable() {
        return wheelchairPassable;
    }

    /**
     * Legt den Wert der wheelchairPassable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWheelchairPassable(Boolean value) {
        this.wheelchairPassable = value;
    }

    /**
     * Ruft den Wert der wheelchairTurningCircle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWheelchairTurningCircle() {
        return wheelchairTurningCircle;
    }

    /**
     * Legt den Wert der wheelchairTurningCircle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWheelchairTurningCircle(BigDecimal value) {
        this.wheelchairTurningCircle = value;
    }

    /**
     * Ruft den Wert der internalWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInternalWidth() {
        return internalWidth;
    }

    /**
     * Legt den Wert der internalWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInternalWidth(BigDecimal value) {
        this.internalWidth = value;
    }

    /**
     * Ruft den Wert der internalHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInternalHeight() {
        return internalHeight;
    }

    /**
     * Legt den Wert der internalHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInternalHeight(BigDecimal value) {
        this.internalHeight = value;
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
     * Ruft den Wert der callButtonHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCallButtonHeight() {
        return callButtonHeight;
    }

    /**
     * Legt den Wert der callButtonHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCallButtonHeight(BigDecimal value) {
        this.callButtonHeight = value;
    }

    /**
     * Ruft den Wert der directionButtonHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDirectionButtonHeight() {
        return directionButtonHeight;
    }

    /**
     * Legt den Wert der directionButtonHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDirectionButtonHeight(BigDecimal value) {
        this.directionButtonHeight = value;
    }

    /**
     * Ruft den Wert der raisedButtons-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRaisedButtons() {
        return raisedButtons;
    }

    /**
     * Legt den Wert der raisedButtons-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRaisedButtons(Boolean value) {
        this.raisedButtons = value;
    }

    /**
     * Ruft den Wert der brailleButtons-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrailleButtons() {
        return brailleButtons;
    }

    /**
     * Legt den Wert der brailleButtons-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrailleButtons(Boolean value) {
        this.brailleButtons = value;
    }

    /**
     * Ruft den Wert der tactileGroundFloorButton-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileGroundFloorButton() {
        return tactileGroundFloorButton;
    }

    /**
     * Legt den Wert der tactileGroundFloorButton-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileGroundFloorButton(Boolean value) {
        this.tactileGroundFloorButton = value;
    }

    /**
     * Ruft den Wert der groundMarkAlignedWithButton-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroundMarkAlignedWithButton() {
        return groundMarkAlignedWithButton;
    }

    /**
     * Legt den Wert der groundMarkAlignedWithButton-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroundMarkAlignedWithButton(Boolean value) {
        this.groundMarkAlignedWithButton = value;
    }

    /**
     * Ruft den Wert der throughLoader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThroughLoader() {
        return throughLoader;
    }

    /**
     * Legt den Wert der throughLoader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThroughLoader(Boolean value) {
        this.throughLoader = value;
    }

    /**
     * Ruft den Wert der mirrorOnOppositeSide-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMirrorOnOppositeSide() {
        return mirrorOnOppositeSide;
    }

    /**
     * Legt den Wert der mirrorOnOppositeSide-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMirrorOnOppositeSide(Boolean value) {
        this.mirrorOnOppositeSide = value;
    }

    /**
     * Ruft den Wert der attendant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttendant() {
        return attendant;
    }

    /**
     * Legt den Wert der attendant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttendant(Boolean value) {
        this.attendant = value;
    }

    /**
     * Ruft den Wert der automatic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomatic() {
        return automatic;
    }

    /**
     * Legt den Wert der automatic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomatic(Boolean value) {
        this.automatic = value;
    }

    /**
     * Ruft den Wert der externalFloorSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalFloorSelection() {
        return externalFloorSelection;
    }

    /**
     * Legt den Wert der externalFloorSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalFloorSelection(Boolean value) {
        this.externalFloorSelection = value;
    }

    /**
     * Ruft den Wert der alarmButton-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlarmButton() {
        return alarmButton;
    }

    /**
     * Legt den Wert der alarmButton-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlarmButton(Boolean value) {
        this.alarmButton = value;
    }

    /**
     * Ruft den Wert der tactileActuators-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileActuators() {
        return tactileActuators;
    }

    /**
     * Legt den Wert der tactileActuators-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileActuators(Boolean value) {
        this.tactileActuators = value;
    }

    /**
     * Ruft den Wert der audioAnnouncements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAudioAnnouncements() {
        return audioAnnouncements;
    }

    /**
     * Legt den Wert der audioAnnouncements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudioAnnouncements(Boolean value) {
        this.audioAnnouncements = value;
    }

    /**
     * Ruft den Wert der accousticAnnouncements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccousticAnnouncements() {
        return accousticAnnouncements;
    }

    /**
     * Legt den Wert der accousticAnnouncements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccousticAnnouncements(Boolean value) {
        this.accousticAnnouncements = value;
    }

    /**
     * Ruft den Wert der reachedFloorAnnouncement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReachedFloorAnnouncementEnumeration }
     *     
     */
    public ReachedFloorAnnouncementEnumeration getReachedFloorAnnouncement() {
        return reachedFloorAnnouncement;
    }

    /**
     * Legt den Wert der reachedFloorAnnouncement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReachedFloorAnnouncementEnumeration }
     *     
     */
    public void setReachedFloorAnnouncement(ReachedFloorAnnouncementEnumeration value) {
        this.reachedFloorAnnouncement = value;
    }

    /**
     * Ruft den Wert der magneticInductionLoop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMagneticInductionLoop() {
        return magneticInductionLoop;
    }

    /**
     * Legt den Wert der magneticInductionLoop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMagneticInductionLoop(Boolean value) {
        this.magneticInductionLoop = value;
    }

    /**
     * Ruft den Wert der signageToLift-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignageToLift() {
        return signageToLift;
    }

    /**
     * Legt den Wert der signageToLift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignageToLift(Boolean value) {
        this.signageToLift = value;
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
     * Ruft den Wert der buttonsHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getButtonsHeight() {
        return buttonsHeight;
    }

    /**
     * Legt den Wert der buttonsHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setButtonsHeight(BigDecimal value) {
        this.buttonsHeight = value;
    }

}
