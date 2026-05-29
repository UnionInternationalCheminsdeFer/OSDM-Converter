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
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for an Occupancy.
 * 
 * <p>Java-Klasse f�r OccupancyView_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OccupancyView_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}OccupancyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccupancyView_VersionStructure", propOrder = {
    "dayTypeRefs",
    "dayTypes",
    "label",
    "description",
    "trainRef",
    "trainElementTypeRef",
    "trainElementRef",
    "trainElement",
    "operationalOrientation",
    "forwardCoupling",
    "fareClass",
    "passengerCategory",
    "occupancyLevel",
    "occupancyPercentage",
    "alightingCount",
    "boardingCount",
    "onboardCount",
    "specialPlacesOccupied",
    "pushchairsOnboardCount",
    "wheelchairsOnboardCount",
    "pramsOnboardCount",
    "bicycleOnboardCount",
    "totalNumberOfReservedSeats",
    "groupReservation"
})
@XmlSeeAlso({
    OccupancyView.class
})
public class OccupancyViewVersionStructure
    extends DataManagedObjectStructure
{

    protected OccupancyViewVersionStructure.DayTypeRefs dayTypeRefs;
    protected DayTypesRelStructure dayTypes;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElementRef(name = "TrainRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TrainRefStructure> trainRef;
    @XmlElementRef(name = "TrainElementTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TrainElementTypeRefStructure> trainElementTypeRef;
    @XmlElement(name = "TrainElementRef")
    protected TrainElementTypeRefStructure trainElementRef;
    @XmlElement(name = "TrainElement")
    protected TrainElement trainElement;
    @XmlElement(name = "OperationalOrientation", defaultValue = "forwards")
    @XmlSchemaType(name = "normalizedString")
    protected VehicleOrientationEnumeration operationalOrientation;
    @XmlElement(name = "ForwardCoupling")
    protected TrainComponentCouplingStructure forwardCoupling;
    @XmlElement(name = "FareClass")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassEnumeration fareClass;
    @XmlElement(name = "PassengerCategory")
    protected MultilingualString passengerCategory;
    @XmlElement(name = "OccupancyLevel")
    @XmlSchemaType(name = "NMTOKEN")
    protected OccupancyEnumeration occupancyLevel;
    @XmlElement(name = "OccupancyPercentage")
    protected BigDecimal occupancyPercentage;
    @XmlElement(name = "AlightingCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger alightingCount;
    @XmlElement(name = "BoardingCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger boardingCount;
    @XmlElement(name = "OnboardCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger onboardCount;
    @XmlElement(name = "SpecialPlacesOccupied")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger specialPlacesOccupied;
    @XmlElement(name = "PushchairsOnboardCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pushchairsOnboardCount;
    @XmlElement(name = "WheelchairsOnboardCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger wheelchairsOnboardCount;
    @XmlElement(name = "PramsOnboardCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pramsOnboardCount;
    @XmlElement(name = "BicycleOnboardCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger bicycleOnboardCount;
    @XmlElement(name = "TotalNumberOfReservedSeats")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalNumberOfReservedSeats;
    @XmlElement(name = "GroupReservation")
    protected List<GroupReservationStructure> groupReservation;

    /**
     * Ruft den Wert der dayTypeRefs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyViewVersionStructure.DayTypeRefs }
     *     
     */
    public OccupancyViewVersionStructure.DayTypeRefs getDayTypeRefs() {
        return dayTypeRefs;
    }

    /**
     * Legt den Wert der dayTypeRefs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyViewVersionStructure.DayTypeRefs }
     *     
     */
    public void setDayTypeRefs(OccupancyViewVersionStructure.DayTypeRefs value) {
        this.dayTypeRefs = value;
    }

    /**
     * Ruft den Wert der dayTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayTypesRelStructure }
     *     
     */
    public DayTypesRelStructure getDayTypes() {
        return dayTypes;
    }

    /**
     * Legt den Wert der dayTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTypesRelStructure }
     *     
     */
    public void setDayTypes(DayTypesRelStructure value) {
        this.dayTypes = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
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
     * Reference to a TRAIN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TrainRefStructure> getTrainRef() {
        return trainRef;
    }

    /**
     * Legt den Wert der trainRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     
     */
    public void setTrainRef(JAXBElement<? extends TrainRefStructure> value) {
        this.trainRef = value;
    }

    /**
     * Ruft den Wert der trainElementTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TractiveElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingElementTypeRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TrainElementTypeRefStructure> getTrainElementTypeRef() {
        return trainElementTypeRef;
    }

    /**
     * Legt den Wert der trainElementTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TractiveElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingElementTypeRefStructure }{@code >}
     *     
     */
    public void setTrainElementTypeRef(JAXBElement<? extends TrainElementTypeRefStructure> value) {
        this.trainElementTypeRef = value;
    }

    /**
     * Ruft den Wert der trainElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainElementTypeRefStructure }
     *     
     */
    public TrainElementTypeRefStructure getTrainElementRef() {
        return trainElementRef;
    }

    /**
     * Legt den Wert der trainElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElementTypeRefStructure }
     *     
     */
    public void setTrainElementRef(TrainElementTypeRefStructure value) {
        this.trainElementRef = value;
    }

    /**
     * Ruft den Wert der trainElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainElement }
     *     
     */
    public TrainElement getTrainElement() {
        return trainElement;
    }

    /**
     * Legt den Wert der trainElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElement }
     *     
     */
    public void setTrainElement(TrainElement value) {
        this.trainElement = value;
    }

    /**
     * Ruft den Wert der operationalOrientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleOrientationEnumeration }
     *     
     */
    public VehicleOrientationEnumeration getOperationalOrientation() {
        return operationalOrientation;
    }

    /**
     * Legt den Wert der operationalOrientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleOrientationEnumeration }
     *     
     */
    public void setOperationalOrientation(VehicleOrientationEnumeration value) {
        this.operationalOrientation = value;
    }

    /**
     * Ruft den Wert der forwardCoupling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainComponentCouplingStructure }
     *     
     */
    public TrainComponentCouplingStructure getForwardCoupling() {
        return forwardCoupling;
    }

    /**
     * Legt den Wert der forwardCoupling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainComponentCouplingStructure }
     *     
     */
    public void setForwardCoupling(TrainComponentCouplingStructure value) {
        this.forwardCoupling = value;
    }

    /**
     * Ruft den Wert der fareClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareClassEnumeration }
     *     
     */
    public FareClassEnumeration getFareClass() {
        return fareClass;
    }

    /**
     * Legt den Wert der fareClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassEnumeration }
     *     
     */
    public void setFareClass(FareClassEnumeration value) {
        this.fareClass = value;
    }

    /**
     * Ruft den Wert der passengerCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPassengerCategory() {
        return passengerCategory;
    }

    /**
     * Legt den Wert der passengerCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPassengerCategory(MultilingualString value) {
        this.passengerCategory = value;
    }

    /**
     * Ruft den Wert der occupancyLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyEnumeration }
     *     
     */
    public OccupancyEnumeration getOccupancyLevel() {
        return occupancyLevel;
    }

    /**
     * Legt den Wert der occupancyLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyEnumeration }
     *     
     */
    public void setOccupancyLevel(OccupancyEnumeration value) {
        this.occupancyLevel = value;
    }

    /**
     * Ruft den Wert der occupancyPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOccupancyPercentage() {
        return occupancyPercentage;
    }

    /**
     * Legt den Wert der occupancyPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOccupancyPercentage(BigDecimal value) {
        this.occupancyPercentage = value;
    }

    /**
     * Ruft den Wert der alightingCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAlightingCount() {
        return alightingCount;
    }

    /**
     * Legt den Wert der alightingCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAlightingCount(BigInteger value) {
        this.alightingCount = value;
    }

    /**
     * Ruft den Wert der boardingCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBoardingCount() {
        return boardingCount;
    }

    /**
     * Legt den Wert der boardingCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBoardingCount(BigInteger value) {
        this.boardingCount = value;
    }

    /**
     * Ruft den Wert der onboardCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOnboardCount() {
        return onboardCount;
    }

    /**
     * Legt den Wert der onboardCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOnboardCount(BigInteger value) {
        this.onboardCount = value;
    }

    /**
     * Ruft den Wert der specialPlacesOccupied-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecialPlacesOccupied() {
        return specialPlacesOccupied;
    }

    /**
     * Legt den Wert der specialPlacesOccupied-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecialPlacesOccupied(BigInteger value) {
        this.specialPlacesOccupied = value;
    }

    /**
     * Ruft den Wert der pushchairsOnboardCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPushchairsOnboardCount() {
        return pushchairsOnboardCount;
    }

    /**
     * Legt den Wert der pushchairsOnboardCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPushchairsOnboardCount(BigInteger value) {
        this.pushchairsOnboardCount = value;
    }

    /**
     * Ruft den Wert der wheelchairsOnboardCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWheelchairsOnboardCount() {
        return wheelchairsOnboardCount;
    }

    /**
     * Legt den Wert der wheelchairsOnboardCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWheelchairsOnboardCount(BigInteger value) {
        this.wheelchairsOnboardCount = value;
    }

    /**
     * Ruft den Wert der pramsOnboardCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPramsOnboardCount() {
        return pramsOnboardCount;
    }

    /**
     * Legt den Wert der pramsOnboardCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPramsOnboardCount(BigInteger value) {
        this.pramsOnboardCount = value;
    }

    /**
     * Ruft den Wert der bicycleOnboardCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBicycleOnboardCount() {
        return bicycleOnboardCount;
    }

    /**
     * Legt den Wert der bicycleOnboardCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBicycleOnboardCount(BigInteger value) {
        this.bicycleOnboardCount = value;
    }

    /**
     * Ruft den Wert der totalNumberOfReservedSeats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfReservedSeats() {
        return totalNumberOfReservedSeats;
    }

    /**
     * Legt den Wert der totalNumberOfReservedSeats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfReservedSeats(BigInteger value) {
        this.totalNumberOfReservedSeats = value;
    }

    /**
     * Gets the value of the groupReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupReservationStructure }
     * 
     * 
     */
    public List<GroupReservationStructure> getGroupReservation() {
        if (groupReservation == null) {
            groupReservation = new ArrayList<GroupReservationStructure>();
        }
        return this.groupReservation;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}dayTypeRefs_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DayTypeRefs
        extends DayTypeRefsRelStructure
    {


    }

}
