//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r LiftCallEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LiftCallEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccessEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LiftCallEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiftCallEquipment_VersionStructure", propOrder = {
    "callButtonHeight",
    "raisedButtons",
    "brailleButtons",
    "groundMarkAlignedWithButton",
    "audioAnnouncements",
    "magneticInductionLoop",
    "doorOrientation",
    "monitoringRemoteControl"
})
@XmlSeeAlso({
    LiftCallEquipment.class
})
public class LiftCallEquipmentVersionStructure
    extends AccessEquipmentVersionStructure
{

    @XmlElement(name = "CallButtonHeight")
    protected BigDecimal callButtonHeight;
    @XmlElement(name = "RaisedButtons")
    protected Boolean raisedButtons;
    @XmlElement(name = "BrailleButtons")
    protected Boolean brailleButtons;
    @XmlElement(name = "GroundMarkAlignedWithButton")
    protected Boolean groundMarkAlignedWithButton;
    @XmlElement(name = "AudioAnnouncements")
    protected Boolean audioAnnouncements;
    @XmlElement(name = "MagneticInductionLoop")
    protected Boolean magneticInductionLoop;
    @XmlElement(name = "DoorOrientation")
    @XmlSchemaType(name = "string")
    protected List<CompassBearing8Enumeration> doorOrientation;
    @XmlElement(name = "MonitoringRemoteControl")
    protected Boolean monitoringRemoteControl;

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
     * Gets the value of the doorOrientation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doorOrientation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoorOrientation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompassBearing8Enumeration }
     * 
     * 
     */
    public List<CompassBearing8Enumeration> getDoorOrientation() {
        if (doorOrientation == null) {
            doorOrientation = new ArrayList<CompassBearing8Enumeration>();
        }
        return this.doorOrientation;
    }

    /**
     * Ruft den Wert der monitoringRemoteControl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitoringRemoteControl() {
        return monitoringRemoteControl;
    }

    /**
     * Legt den Wert der monitoringRemoteControl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitoringRemoteControl(Boolean value) {
        this.monitoringRemoteControl = value;
    }

}
