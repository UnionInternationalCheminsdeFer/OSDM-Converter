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
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a TRAIN ELEMENT TYPE.
 * 
 * <p>Java-Klasse f�r TrainElementType_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrainElementType_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TrainElementTypeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainElementType_VersionStructure", propOrder = {
    "name",
    "description",
    "trainElementType",
    "fareClasses",
    "passengerCapacity",
    "capacities",
    "lowFloor",
    "hasLiftOrRamp",
    "hasHoist",
    "hoistOperatingRadius",
    "boardingHeight",
    "gapToPlatform",
    "length",
    "width",
    "height",
    "weight",
    "firstAxleHeight",
    "monitored",
    "facilities",
    "equipments",
    "deckPlanRef"
})
@XmlSeeAlso({
    TrainElement.class,
    TrailingElementTypeVersionStructure.class,
    TractiveElementTypeVersionStructure.class
})
public class TrainElementTypeVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "TrainElementType")
    @XmlSchemaType(name = "NMTOKEN")
    protected TrainElementTypeTypeEnumeration trainElementType;
    @XmlList
    @XmlElement(name = "FareClasses")
    protected List<FareClassEnumeration> fareClasses;
    @XmlElement(name = "PassengerCapacity")
    protected PassengerCapacityStructure passengerCapacity;
    protected PassengerCapacitiesRelStructure capacities;
    @XmlElement(name = "LowFloor")
    protected Boolean lowFloor;
    @XmlElement(name = "HasLiftOrRamp")
    protected Boolean hasLiftOrRamp;
    @XmlElement(name = "HasHoist")
    protected Boolean hasHoist;
    @XmlElement(name = "HoistOperatingRadius")
    protected BigDecimal hoistOperatingRadius;
    @XmlElement(name = "BoardingHeight")
    protected BigDecimal boardingHeight;
    @XmlElement(name = "GapToPlatform")
    protected BigDecimal gapToPlatform;
    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "Width")
    protected BigDecimal width;
    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElement(name = "Weight")
    protected BigDecimal weight;
    @XmlElement(name = "FirstAxleHeight")
    protected BigDecimal firstAxleHeight;
    @XmlElement(name = "Monitored")
    protected Boolean monitored;
    protected ServiceFacilitySetsRelStructure facilities;
    protected EquipmentsRelStructure equipments;
    @XmlElement(name = "DeckPlanRef")
    protected DeckPlanRefStructure deckPlanRef;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der trainElementType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainElementTypeTypeEnumeration }
     *     
     */
    public TrainElementTypeTypeEnumeration getTrainElementType() {
        return trainElementType;
    }

    /**
     * Legt den Wert der trainElementType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElementTypeTypeEnumeration }
     *     
     */
    public void setTrainElementType(TrainElementTypeTypeEnumeration value) {
        this.trainElementType = value;
    }

    /**
     * Gets the value of the fareClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareClassEnumeration }
     * 
     * 
     */
    public List<FareClassEnumeration> getFareClasses() {
        if (fareClasses == null) {
            fareClasses = new ArrayList<FareClassEnumeration>();
        }
        return this.fareClasses;
    }

    /**
     * Ruft den Wert der passengerCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCapacityStructure }
     *     
     */
    public PassengerCapacityStructure getPassengerCapacity() {
        return passengerCapacity;
    }

    /**
     * Legt den Wert der passengerCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCapacityStructure }
     *     
     */
    public void setPassengerCapacity(PassengerCapacityStructure value) {
        this.passengerCapacity = value;
    }

    /**
     * Ruft den Wert der capacities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCapacitiesRelStructure }
     *     
     */
    public PassengerCapacitiesRelStructure getCapacities() {
        return capacities;
    }

    /**
     * Legt den Wert der capacities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCapacitiesRelStructure }
     *     
     */
    public void setCapacities(PassengerCapacitiesRelStructure value) {
        this.capacities = value;
    }

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
     * Ruft den Wert der hasLiftOrRamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLiftOrRamp() {
        return hasLiftOrRamp;
    }

    /**
     * Legt den Wert der hasLiftOrRamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLiftOrRamp(Boolean value) {
        this.hasLiftOrRamp = value;
    }

    /**
     * Ruft den Wert der hasHoist-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasHoist() {
        return hasHoist;
    }

    /**
     * Legt den Wert der hasHoist-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasHoist(Boolean value) {
        this.hasHoist = value;
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
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Ruft den Wert der firstAxleHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstAxleHeight() {
        return firstAxleHeight;
    }

    /**
     * Legt den Wert der firstAxleHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstAxleHeight(BigDecimal value) {
        this.firstAxleHeight = value;
    }

    /**
     * Ruft den Wert der monitored-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Legt den Wert der monitored-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    /**
     * Ruft den Wert der facilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFacilitySetsRelStructure }
     *     
     */
    public ServiceFacilitySetsRelStructure getFacilities() {
        return facilities;
    }

    /**
     * Legt den Wert der facilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFacilitySetsRelStructure }
     *     
     */
    public void setFacilities(ServiceFacilitySetsRelStructure value) {
        this.facilities = value;
    }

    /**
     * Ruft den Wert der equipments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentsRelStructure }
     *     
     */
    public EquipmentsRelStructure getEquipments() {
        return equipments;
    }

    /**
     * Legt den Wert der equipments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentsRelStructure }
     *     
     */
    public void setEquipments(EquipmentsRelStructure value) {
        this.equipments = value;
    }

    /**
     * Ruft den Wert der deckPlanRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckPlanRefStructure }
     *     
     */
    public DeckPlanRefStructure getDeckPlanRef() {
        return deckPlanRef;
    }

    /**
     * Legt den Wert der deckPlanRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckPlanRefStructure }
     *     
     */
    public void setDeckPlanRef(DeckPlanRefStructure value) {
        this.deckPlanRef = value;
    }

}
