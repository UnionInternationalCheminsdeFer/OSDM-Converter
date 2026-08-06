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
 * Type for a DECK ENTRANCE.
 * 
 * <p>Java-Klasse f�r DeckEntrance_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeckEntrance_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DeckComponent_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeckEntranceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckEntrance_VersionStructure", propOrder = {
    "vehicleSide",
    "distanceFromFront",
    "sequenceFromFront",
    "heightFromGround",
    "deckEntranceType",
    "typeOfDeckEntranceUsageRef",
    "isEmergencyExit",
    "hasDoor",
    "isAutomatic",
    "sensorsInEntrance"
})
@XmlSeeAlso({
    DeckEntrance.class,
    PassengerEntranceVersionStructure.class,
    DeckVehicleEntranceVersionStructure.class,
    OtherDeckEntranceVersionStructure.class
})
public abstract class DeckEntranceVersionStructure
    extends DeckComponentVersionStructure
{

    @XmlElement(name = "VehicleSide")
    @XmlSchemaType(name = "string")
    protected VehicleSideEnumeration vehicleSide;
    @XmlElement(name = "DistanceFromFront")
    protected BigDecimal distanceFromFront;
    @XmlElement(name = "SequenceFromFront")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceFromFront;
    @XmlElement(name = "HeightFromGround")
    protected BigDecimal heightFromGround;
    @XmlElement(name = "DeckEntranceType")
    @XmlSchemaType(name = "normalizedString")
    protected DeckEntranceTypeEnumeration deckEntranceType;
    @XmlElement(name = "TypeOfDeckEntranceUsageRef")
    protected TypeOfDeckEntranceUsageRefStructure typeOfDeckEntranceUsageRef;
    @XmlElement(name = "IsEmergencyExit")
    protected Boolean isEmergencyExit;
    @XmlElement(name = "HasDoor")
    protected Boolean hasDoor;
    @XmlElement(name = "IsAutomatic")
    protected Boolean isAutomatic;
    protected SensorsInEntranceRelStructure sensorsInEntrance;

    /**
     * Ruft den Wert der vehicleSide-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSideEnumeration }
     *     
     */
    public VehicleSideEnumeration getVehicleSide() {
        return vehicleSide;
    }

    /**
     * Legt den Wert der vehicleSide-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSideEnumeration }
     *     
     */
    public void setVehicleSide(VehicleSideEnumeration value) {
        this.vehicleSide = value;
    }

    /**
     * Ruft den Wert der distanceFromFront-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistanceFromFront() {
        return distanceFromFront;
    }

    /**
     * Legt den Wert der distanceFromFront-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistanceFromFront(BigDecimal value) {
        this.distanceFromFront = value;
    }

    /**
     * Ruft den Wert der sequenceFromFront-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceFromFront() {
        return sequenceFromFront;
    }

    /**
     * Legt den Wert der sequenceFromFront-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceFromFront(BigInteger value) {
        this.sequenceFromFront = value;
    }

    /**
     * Ruft den Wert der heightFromGround-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightFromGround() {
        return heightFromGround;
    }

    /**
     * Legt den Wert der heightFromGround-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightFromGround(BigDecimal value) {
        this.heightFromGround = value;
    }

    /**
     * Ruft den Wert der deckEntranceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckEntranceTypeEnumeration }
     *     
     */
    public DeckEntranceTypeEnumeration getDeckEntranceType() {
        return deckEntranceType;
    }

    /**
     * Legt den Wert der deckEntranceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckEntranceTypeEnumeration }
     *     
     */
    public void setDeckEntranceType(DeckEntranceTypeEnumeration value) {
        this.deckEntranceType = value;
    }

    /**
     * Ruft den Wert der typeOfDeckEntranceUsageRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDeckEntranceUsageRefStructure }
     *     
     */
    public TypeOfDeckEntranceUsageRefStructure getTypeOfDeckEntranceUsageRef() {
        return typeOfDeckEntranceUsageRef;
    }

    /**
     * Legt den Wert der typeOfDeckEntranceUsageRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDeckEntranceUsageRefStructure }
     *     
     */
    public void setTypeOfDeckEntranceUsageRef(TypeOfDeckEntranceUsageRefStructure value) {
        this.typeOfDeckEntranceUsageRef = value;
    }

    /**
     * Ruft den Wert der isEmergencyExit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEmergencyExit() {
        return isEmergencyExit;
    }

    /**
     * Legt den Wert der isEmergencyExit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEmergencyExit(Boolean value) {
        this.isEmergencyExit = value;
    }

    /**
     * Ruft den Wert der hasDoor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDoor() {
        return hasDoor;
    }

    /**
     * Legt den Wert der hasDoor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDoor(Boolean value) {
        this.hasDoor = value;
    }

    /**
     * Ruft den Wert der isAutomatic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAutomatic() {
        return isAutomatic;
    }

    /**
     * Legt den Wert der isAutomatic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAutomatic(Boolean value) {
        this.isAutomatic = value;
    }

    /**
     * Ruft den Wert der sensorsInEntrance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SensorsInEntranceRelStructure }
     *     
     */
    public SensorsInEntranceRelStructure getSensorsInEntrance() {
        return sensorsInEntrance;
    }

    /**
     * Legt den Wert der sensorsInEntrance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SensorsInEntranceRelStructure }
     *     
     */
    public void setSensorsInEntrance(SensorsInEntranceRelStructure value) {
        this.sensorsInEntrance = value;
    }

}
