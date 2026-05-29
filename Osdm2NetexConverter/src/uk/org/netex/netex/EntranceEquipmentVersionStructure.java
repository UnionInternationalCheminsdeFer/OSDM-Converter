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
 * Type for an ENTRANCE EQUIPMENT.
 * 
 * <p>Java-Klasse f�r EntranceEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EntranceEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccessEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}EntranceEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntranceEquipment_VersionStructure", propOrder = {
    "door",
    "doorOrientation",
    "doorHandleOutside",
    "doorHandleInside",
    "keptOpen",
    "revolvingDoor",
    "doorType",
    "barrier",
    "numberOfGates",
    "staffing",
    "entranceRequiresStaffing",
    "entranceRequiresTicket",
    "entranceRequiresPassport",
    "dropKerbOutside",
    "acousticSensor",
    "automaticDoor",
    "doorControlElementHeight",
    "glassDoor",
    "airlock",
    "wheelchairPassable",
    "wheelchairUnaided",
    "audioOrVideoIntercom",
    "entranceAttention",
    "doorstepMark",
    "necessaryForceToOpen",
    "suitableForCycles",
    "audioPassthroughIndicator",
    "rampDoorbell",
    "recognizable",
    "turningSpacePosition",
    "wheelchairTurningCircle"
})
@XmlSeeAlso({
    EntranceEquipment.class
})
public class EntranceEquipmentVersionStructure
    extends AccessEquipmentVersionStructure
{

    @XmlElement(name = "Door")
    protected Boolean door;
    @XmlElement(name = "DoorOrientation")
    @XmlSchemaType(name = "string")
    protected CompassBearing8Enumeration doorOrientation;
    @XmlElement(name = "DoorHandleOutside")
    @XmlSchemaType(name = "NMTOKEN")
    protected DoorHandleEnumeration doorHandleOutside;
    @XmlElement(name = "DoorHandleInside")
    @XmlSchemaType(name = "NMTOKEN")
    protected DoorHandleEnumeration doorHandleInside;
    @XmlElement(name = "KeptOpen")
    protected Boolean keptOpen;
    @XmlElement(name = "RevolvingDoor")
    protected Boolean revolvingDoor;
    @XmlElement(name = "DoorType")
    @XmlSchemaType(name = "NMTOKEN")
    protected DoorTypeEnumeration doorType;
    @XmlElement(name = "Barrier")
    protected Boolean barrier;
    @XmlElement(name = "NumberOfGates")
    protected BigInteger numberOfGates;
    @XmlElement(name = "Staffing")
    @XmlSchemaType(name = "normalizedString")
    protected StaffingEnumeration staffing;
    @XmlElement(name = "EntranceRequiresStaffing")
    protected Boolean entranceRequiresStaffing;
    @XmlElement(name = "EntranceRequiresTicket")
    protected Boolean entranceRequiresTicket;
    @XmlElement(name = "EntranceRequiresPassport")
    protected Boolean entranceRequiresPassport;
    @XmlElement(name = "DropKerbOutside")
    protected Boolean dropKerbOutside;
    @XmlElement(name = "AcousticSensor")
    protected Boolean acousticSensor;
    @XmlElement(name = "AutomaticDoor")
    protected Boolean automaticDoor;
    @XmlElement(name = "DoorControlElementHeight")
    protected BigDecimal doorControlElementHeight;
    @XmlElement(name = "GlassDoor")
    protected Boolean glassDoor;
    @XmlElement(name = "Airlock")
    protected Boolean airlock;
    @XmlElement(name = "WheelchairPassable")
    protected Boolean wheelchairPassable;
    @XmlElement(name = "WheelchairUnaided")
    protected Boolean wheelchairUnaided;
    @XmlElement(name = "AudioOrVideoIntercom")
    protected Boolean audioOrVideoIntercom;
    @XmlElement(name = "EntranceAttention")
    @XmlSchemaType(name = "string")
    protected EntranceAttentionEnumeration entranceAttention;
    @XmlElement(name = "DoorstepMark")
    protected Boolean doorstepMark;
    @XmlElement(name = "NecessaryForceToOpen")
    @XmlSchemaType(name = "string")
    protected NecessaryForceEnumeration necessaryForceToOpen;
    @XmlElement(name = "SuitableForCycles")
    protected Boolean suitableForCycles;
    @XmlElement(name = "AudioPassthroughIndicator")
    protected Boolean audioPassthroughIndicator;
    @XmlElement(name = "RampDoorbell")
    protected Boolean rampDoorbell;
    @XmlElement(name = "Recognizable")
    protected Boolean recognizable;
    @XmlElement(name = "TurningSpacePosition")
    @XmlSchemaType(name = "NMTOKEN")
    protected EntranceTurningSpacePositionEnumeration turningSpacePosition;
    @XmlElement(name = "WheelchairTurningCircle")
    protected BigDecimal wheelchairTurningCircle;

    /**
     * Ruft den Wert der door-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoor() {
        return door;
    }

    /**
     * Legt den Wert der door-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoor(Boolean value) {
        this.door = value;
    }

    /**
     * Ruft den Wert der doorOrientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompassBearing8Enumeration }
     *     
     */
    public CompassBearing8Enumeration getDoorOrientation() {
        return doorOrientation;
    }

    /**
     * Legt den Wert der doorOrientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompassBearing8Enumeration }
     *     
     */
    public void setDoorOrientation(CompassBearing8Enumeration value) {
        this.doorOrientation = value;
    }

    /**
     * Ruft den Wert der doorHandleOutside-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DoorHandleEnumeration }
     *     
     */
    public DoorHandleEnumeration getDoorHandleOutside() {
        return doorHandleOutside;
    }

    /**
     * Legt den Wert der doorHandleOutside-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorHandleEnumeration }
     *     
     */
    public void setDoorHandleOutside(DoorHandleEnumeration value) {
        this.doorHandleOutside = value;
    }

    /**
     * Ruft den Wert der doorHandleInside-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DoorHandleEnumeration }
     *     
     */
    public DoorHandleEnumeration getDoorHandleInside() {
        return doorHandleInside;
    }

    /**
     * Legt den Wert der doorHandleInside-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorHandleEnumeration }
     *     
     */
    public void setDoorHandleInside(DoorHandleEnumeration value) {
        this.doorHandleInside = value;
    }

    /**
     * Ruft den Wert der keptOpen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeptOpen() {
        return keptOpen;
    }

    /**
     * Legt den Wert der keptOpen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeptOpen(Boolean value) {
        this.keptOpen = value;
    }

    /**
     * Ruft den Wert der revolvingDoor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevolvingDoor() {
        return revolvingDoor;
    }

    /**
     * Legt den Wert der revolvingDoor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevolvingDoor(Boolean value) {
        this.revolvingDoor = value;
    }

    /**
     * Ruft den Wert der doorType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DoorTypeEnumeration }
     *     
     */
    public DoorTypeEnumeration getDoorType() {
        return doorType;
    }

    /**
     * Legt den Wert der doorType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorTypeEnumeration }
     *     
     */
    public void setDoorType(DoorTypeEnumeration value) {
        this.doorType = value;
    }

    /**
     * Ruft den Wert der barrier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBarrier() {
        return barrier;
    }

    /**
     * Legt den Wert der barrier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBarrier(Boolean value) {
        this.barrier = value;
    }

    /**
     * Ruft den Wert der numberOfGates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfGates() {
        return numberOfGates;
    }

    /**
     * Legt den Wert der numberOfGates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfGates(BigInteger value) {
        this.numberOfGates = value;
    }

    /**
     * Ruft den Wert der staffing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StaffingEnumeration }
     *     
     */
    public StaffingEnumeration getStaffing() {
        return staffing;
    }

    /**
     * Legt den Wert der staffing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffingEnumeration }
     *     
     */
    public void setStaffing(StaffingEnumeration value) {
        this.staffing = value;
    }

    /**
     * Ruft den Wert der entranceRequiresStaffing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntranceRequiresStaffing() {
        return entranceRequiresStaffing;
    }

    /**
     * Legt den Wert der entranceRequiresStaffing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntranceRequiresStaffing(Boolean value) {
        this.entranceRequiresStaffing = value;
    }

    /**
     * Ruft den Wert der entranceRequiresTicket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntranceRequiresTicket() {
        return entranceRequiresTicket;
    }

    /**
     * Legt den Wert der entranceRequiresTicket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntranceRequiresTicket(Boolean value) {
        this.entranceRequiresTicket = value;
    }

    /**
     * Ruft den Wert der entranceRequiresPassport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntranceRequiresPassport() {
        return entranceRequiresPassport;
    }

    /**
     * Legt den Wert der entranceRequiresPassport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntranceRequiresPassport(Boolean value) {
        this.entranceRequiresPassport = value;
    }

    /**
     * Ruft den Wert der dropKerbOutside-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDropKerbOutside() {
        return dropKerbOutside;
    }

    /**
     * Legt den Wert der dropKerbOutside-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropKerbOutside(Boolean value) {
        this.dropKerbOutside = value;
    }

    /**
     * Ruft den Wert der acousticSensor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcousticSensor() {
        return acousticSensor;
    }

    /**
     * Legt den Wert der acousticSensor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcousticSensor(Boolean value) {
        this.acousticSensor = value;
    }

    /**
     * Ruft den Wert der automaticDoor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticDoor() {
        return automaticDoor;
    }

    /**
     * Legt den Wert der automaticDoor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticDoor(Boolean value) {
        this.automaticDoor = value;
    }

    /**
     * Ruft den Wert der doorControlElementHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDoorControlElementHeight() {
        return doorControlElementHeight;
    }

    /**
     * Legt den Wert der doorControlElementHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDoorControlElementHeight(BigDecimal value) {
        this.doorControlElementHeight = value;
    }

    /**
     * Ruft den Wert der glassDoor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlassDoor() {
        return glassDoor;
    }

    /**
     * Legt den Wert der glassDoor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlassDoor(Boolean value) {
        this.glassDoor = value;
    }

    /**
     * Ruft den Wert der airlock-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirlock() {
        return airlock;
    }

    /**
     * Legt den Wert der airlock-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirlock(Boolean value) {
        this.airlock = value;
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
     * Ruft den Wert der wheelchairUnaided-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWheelchairUnaided() {
        return wheelchairUnaided;
    }

    /**
     * Legt den Wert der wheelchairUnaided-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWheelchairUnaided(Boolean value) {
        this.wheelchairUnaided = value;
    }

    /**
     * Ruft den Wert der audioOrVideoIntercom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAudioOrVideoIntercom() {
        return audioOrVideoIntercom;
    }

    /**
     * Legt den Wert der audioOrVideoIntercom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudioOrVideoIntercom(Boolean value) {
        this.audioOrVideoIntercom = value;
    }

    /**
     * Ruft den Wert der entranceAttention-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntranceAttentionEnumeration }
     *     
     */
    public EntranceAttentionEnumeration getEntranceAttention() {
        return entranceAttention;
    }

    /**
     * Legt den Wert der entranceAttention-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntranceAttentionEnumeration }
     *     
     */
    public void setEntranceAttention(EntranceAttentionEnumeration value) {
        this.entranceAttention = value;
    }

    /**
     * Ruft den Wert der doorstepMark-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoorstepMark() {
        return doorstepMark;
    }

    /**
     * Legt den Wert der doorstepMark-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoorstepMark(Boolean value) {
        this.doorstepMark = value;
    }

    /**
     * Ruft den Wert der necessaryForceToOpen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NecessaryForceEnumeration }
     *     
     */
    public NecessaryForceEnumeration getNecessaryForceToOpen() {
        return necessaryForceToOpen;
    }

    /**
     * Legt den Wert der necessaryForceToOpen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NecessaryForceEnumeration }
     *     
     */
    public void setNecessaryForceToOpen(NecessaryForceEnumeration value) {
        this.necessaryForceToOpen = value;
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
     * Ruft den Wert der audioPassthroughIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAudioPassthroughIndicator() {
        return audioPassthroughIndicator;
    }

    /**
     * Legt den Wert der audioPassthroughIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudioPassthroughIndicator(Boolean value) {
        this.audioPassthroughIndicator = value;
    }

    /**
     * Ruft den Wert der rampDoorbell-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRampDoorbell() {
        return rampDoorbell;
    }

    /**
     * Legt den Wert der rampDoorbell-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRampDoorbell(Boolean value) {
        this.rampDoorbell = value;
    }

    /**
     * Ruft den Wert der recognizable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecognizable() {
        return recognizable;
    }

    /**
     * Legt den Wert der recognizable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecognizable(Boolean value) {
        this.recognizable = value;
    }

    /**
     * Ruft den Wert der turningSpacePosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntranceTurningSpacePositionEnumeration }
     *     
     */
    public EntranceTurningSpacePositionEnumeration getTurningSpacePosition() {
        return turningSpacePosition;
    }

    /**
     * Legt den Wert der turningSpacePosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntranceTurningSpacePositionEnumeration }
     *     
     */
    public void setTurningSpacePosition(EntranceTurningSpacePositionEnumeration value) {
        this.turningSpacePosition = value;
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

}
