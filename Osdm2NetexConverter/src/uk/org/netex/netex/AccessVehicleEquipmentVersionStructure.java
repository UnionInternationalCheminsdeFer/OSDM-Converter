//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for an ACCESS VEHICLE EQUIPMENT.
 * 
 * <p>Java-Klasse f�r AccessVehicleEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AccessVehicleEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ActualVehicleEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}AccessVehicleEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessVehicleEquipment_VersionStructure", propOrder = {
    "lowFloor",
    "highFloor",
    "hoist",
    "hoistOperatingRadius",
    "ramp",
    "bearingCapacity",
    "numberOfSteps",
    "boardingHeight",
    "equipmentLength",
    "equipmentWidth",
    "gapToPlatform",
    "widthOfAccessArea",
    "heightOfAccessArea",
    "automaticDoors",
    "suitableFor",
    "assistanceNeeded",
    "assistedBoardingLocation",
    "guideDogsAllowed"
})
@XmlSeeAlso({
    AccessVehicleEquipment.class
})
public class AccessVehicleEquipmentVersionStructure
    extends ActualVehicleEquipmentVersionStructure
{

    @XmlElement(name = "LowFloor")
    protected Boolean lowFloor;
    @XmlElement(name = "HighFloor")
    protected Boolean highFloor;
    @XmlElement(name = "Hoist")
    protected Boolean hoist;
    @XmlElement(name = "HoistOperatingRadius")
    protected BigDecimal hoistOperatingRadius;
    @XmlElement(name = "Ramp")
    protected Boolean ramp;
    @XmlElement(name = "BearingCapacity")
    protected BigDecimal bearingCapacity;
    @XmlElement(name = "NumberOfSteps")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfSteps;
    @XmlElement(name = "BoardingHeight")
    protected BigDecimal boardingHeight;
    @XmlElement(name = "EquipmentLength")
    protected BigDecimal equipmentLength;
    @XmlElement(name = "EquipmentWidth")
    protected BigDecimal equipmentWidth;
    @XmlElement(name = "GapToPlatform")
    protected BigDecimal gapToPlatform;
    @XmlElement(name = "WidthOfAccessArea")
    protected BigDecimal widthOfAccessArea;
    @XmlElement(name = "HeightOfAccessArea")
    protected BigDecimal heightOfAccessArea;
    @XmlElement(name = "AutomaticDoors")
    protected Boolean automaticDoors;
    @XmlList
    @XmlElement(name = "SuitableFor")
    protected List<MobilityEnumeration> suitableFor;
    @XmlElement(name = "AssistanceNeeded")
    @XmlSchemaType(name = "normalizedString")
    protected AssistanceNeededEnumeration assistanceNeeded;
    @XmlElement(name = "AssistedBoardingLocation")
    @XmlSchemaType(name = "normalizedString")
    protected AssistedBoardingLocationEnumeration assistedBoardingLocation;
    @XmlElement(name = "GuideDogsAllowed", defaultValue = "true")
    protected Boolean guideDogsAllowed;

    /**
     * Ruft den Wert der lowFloor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowFloor() {
        return lowFloor;
    }

    /**
     * Legt den Wert der lowFloor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowFloor(Boolean value) {
        this.lowFloor = value;
    }

    /**
     * Ruft den Wert der highFloor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighFloor() {
        return highFloor;
    }

    /**
     * Legt den Wert der highFloor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighFloor(Boolean value) {
        this.highFloor = value;
    }

    /**
     * Ruft den Wert der hoist-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoist() {
        return hoist;
    }

    /**
     * Legt den Wert der hoist-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHoist(Boolean value) {
        this.hoist = value;
    }

    /**
     * Ruft den Wert der hoistOperatingRadius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHoistOperatingRadius() {
        return hoistOperatingRadius;
    }

    /**
     * Legt den Wert der hoistOperatingRadius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHoistOperatingRadius(BigDecimal value) {
        this.hoistOperatingRadius = value;
    }

    /**
     * Ruft den Wert der ramp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRamp() {
        return ramp;
    }

    /**
     * Legt den Wert der ramp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRamp(Boolean value) {
        this.ramp = value;
    }

    /**
     * Ruft den Wert der bearingCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBearingCapacity() {
        return bearingCapacity;
    }

    /**
     * Legt den Wert der bearingCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBearingCapacity(BigDecimal value) {
        this.bearingCapacity = value;
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
     * Ruft den Wert der boardingHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBoardingHeight() {
        return boardingHeight;
    }

    /**
     * Legt den Wert der boardingHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBoardingHeight(BigDecimal value) {
        this.boardingHeight = value;
    }

    /**
     * Ruft den Wert der equipmentLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquipmentLength() {
        return equipmentLength;
    }

    /**
     * Legt den Wert der equipmentLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquipmentLength(BigDecimal value) {
        this.equipmentLength = value;
    }

    /**
     * Ruft den Wert der equipmentWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquipmentWidth() {
        return equipmentWidth;
    }

    /**
     * Legt den Wert der equipmentWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquipmentWidth(BigDecimal value) {
        this.equipmentWidth = value;
    }

    /**
     * Ruft den Wert der gapToPlatform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGapToPlatform() {
        return gapToPlatform;
    }

    /**
     * Legt den Wert der gapToPlatform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGapToPlatform(BigDecimal value) {
        this.gapToPlatform = value;
    }

    /**
     * Ruft den Wert der widthOfAccessArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidthOfAccessArea() {
        return widthOfAccessArea;
    }

    /**
     * Legt den Wert der widthOfAccessArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidthOfAccessArea(BigDecimal value) {
        this.widthOfAccessArea = value;
    }

    /**
     * Ruft den Wert der heightOfAccessArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightOfAccessArea() {
        return heightOfAccessArea;
    }

    /**
     * Legt den Wert der heightOfAccessArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightOfAccessArea(BigDecimal value) {
        this.heightOfAccessArea = value;
    }

    /**
     * Ruft den Wert der automaticDoors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticDoors() {
        return automaticDoors;
    }

    /**
     * Legt den Wert der automaticDoors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticDoors(Boolean value) {
        this.automaticDoors = value;
    }

    /**
     * Gets the value of the suitableFor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suitableFor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuitableFor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobilityEnumeration }
     * 
     * 
     */
    public List<MobilityEnumeration> getSuitableFor() {
        if (suitableFor == null) {
            suitableFor = new ArrayList<MobilityEnumeration>();
        }
        return this.suitableFor;
    }

    /**
     * Ruft den Wert der assistanceNeeded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssistanceNeededEnumeration }
     *     
     */
    public AssistanceNeededEnumeration getAssistanceNeeded() {
        return assistanceNeeded;
    }

    /**
     * Legt den Wert der assistanceNeeded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistanceNeededEnumeration }
     *     
     */
    public void setAssistanceNeeded(AssistanceNeededEnumeration value) {
        this.assistanceNeeded = value;
    }

    /**
     * Ruft den Wert der assistedBoardingLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssistedBoardingLocationEnumeration }
     *     
     */
    public AssistedBoardingLocationEnumeration getAssistedBoardingLocation() {
        return assistedBoardingLocation;
    }

    /**
     * Legt den Wert der assistedBoardingLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistedBoardingLocationEnumeration }
     *     
     */
    public void setAssistedBoardingLocation(AssistedBoardingLocationEnumeration value) {
        this.assistedBoardingLocation = value;
    }

    /**
     * Ruft den Wert der guideDogsAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuideDogsAllowed() {
        return guideDogsAllowed;
    }

    /**
     * Legt den Wert der guideDogsAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuideDogsAllowed(Boolean value) {
        this.guideDogsAllowed = value;
    }

}
