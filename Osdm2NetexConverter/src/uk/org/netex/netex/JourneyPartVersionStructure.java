//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for JOURNEY PART.
 * 
 * <p>Java-Klasse f�r JourneyPart_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JourneyPart_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyPartGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyPart_VersionStructure", propOrder = {
    "description",
    "parentJourneyRef",
    "dayOffsetRelativeToMainPart",
    "mainPartRef",
    "journeyPartCoupleRef",
    "trainNumberRef",
    "blockPartRef",
    "fromStopPointRef",
    "toStopPointRef",
    "startTime",
    "startTimeDayOffset",
    "endTime",
    "endTimeDayOffset",
    "vehicleOrientation",
    "purposeOfJourneyPartitionRef",
    "facilities",
    "journeyPartPositions",
    "occupancies",
    "typeOfProductCategoryRef"
})
@XmlSeeAlso({
    JourneyPart.class
})
public class JourneyPartVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "ParentJourneyRef")
    protected VehicleJourneyRefStructure parentJourneyRef;
    @XmlElement(name = "DayOffsetRelativeToMainPart")
    protected BigInteger dayOffsetRelativeToMainPart;
    @XmlElement(name = "MainPartRef")
    protected JourneyPartRefStructure mainPartRef;
    @XmlElement(name = "JourneyPartCoupleRef")
    protected JourneyPartCoupleRefStructure journeyPartCoupleRef;
    @XmlElement(name = "TrainNumberRef")
    protected TrainNumberRefStructure trainNumberRef;
    @XmlElementRef(name = "BlockPartRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends BlockPartRefStructure> blockPartRef;
    @XmlElement(name = "FromStopPointRef")
    protected ScheduledStopPointRefStructure fromStopPointRef;
    @XmlElement(name = "ToStopPointRef")
    protected ScheduledStopPointRefStructure toStopPointRef;
    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "StartTimeDayOffset", defaultValue = "0")
    protected BigInteger startTimeDayOffset;
    @XmlElement(name = "EndTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "EndTimeDayOffset", defaultValue = "0")
    protected BigInteger endTimeDayOffset;
    @XmlElement(name = "VehicleOrientation", defaultValue = "true")
    protected Boolean vehicleOrientation;
    @XmlElement(name = "PurposeOfJourneyPartitionRef")
    protected PurposeOfJourneyPartitionRefStructure purposeOfJourneyPartitionRef;
    protected ServiceFacilitySetsRelStructure facilities;
    protected JourneyPartPositionsRelStructure journeyPartPositions;
    protected OccupancyViewRelStructure occupancies;
    @XmlElement(name = "TypeOfProductCategoryRef")
    protected TypeOfProductCategoryRefStructure typeOfProductCategoryRef;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

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
     * Ruft den Wert der parentJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyRefStructure }
     *     
     */
    public VehicleJourneyRefStructure getParentJourneyRef() {
        return parentJourneyRef;
    }

    /**
     * Legt den Wert der parentJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyRefStructure }
     *     
     */
    public void setParentJourneyRef(VehicleJourneyRefStructure value) {
        this.parentJourneyRef = value;
    }

    /**
     * Ruft den Wert der dayOffsetRelativeToMainPart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayOffsetRelativeToMainPart() {
        return dayOffsetRelativeToMainPart;
    }

    /**
     * Legt den Wert der dayOffsetRelativeToMainPart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayOffsetRelativeToMainPart(BigInteger value) {
        this.dayOffsetRelativeToMainPart = value;
    }

    /**
     * Ruft den Wert der mainPartRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartRefStructure }
     *     
     */
    public JourneyPartRefStructure getMainPartRef() {
        return mainPartRef;
    }

    /**
     * Legt den Wert der mainPartRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartRefStructure }
     *     
     */
    public void setMainPartRef(JourneyPartRefStructure value) {
        this.mainPartRef = value;
    }

    /**
     * Ruft den Wert der journeyPartCoupleRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartCoupleRefStructure }
     *     
     */
    public JourneyPartCoupleRefStructure getJourneyPartCoupleRef() {
        return journeyPartCoupleRef;
    }

    /**
     * Legt den Wert der journeyPartCoupleRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartCoupleRefStructure }
     *     
     */
    public void setJourneyPartCoupleRef(JourneyPartCoupleRefStructure value) {
        this.journeyPartCoupleRef = value;
    }

    /**
     * Ruft den Wert der trainNumberRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainNumberRefStructure }
     *     
     */
    public TrainNumberRefStructure getTrainNumberRef() {
        return trainNumberRef;
    }

    /**
     * Legt den Wert der trainNumberRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainNumberRefStructure }
     *     
     */
    public void setTrainNumberRef(TrainNumberRefStructure value) {
        this.trainNumberRef = value;
    }

    /**
     * Ruft den Wert der blockPartRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BlockPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainBlockPartRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends BlockPartRefStructure> getBlockPartRef() {
        return blockPartRef;
    }

    /**
     * Legt den Wert der blockPartRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BlockPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainBlockPartRefStructure }{@code >}
     *     
     */
    public void setBlockPartRef(JAXBElement<? extends BlockPartRefStructure> value) {
        this.blockPartRef = value;
    }

    /**
     * Ruft den Wert der fromStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getFromStopPointRef() {
        return fromStopPointRef;
    }

    /**
     * Legt den Wert der fromStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setFromStopPointRef(ScheduledStopPointRefStructure value) {
        this.fromStopPointRef = value;
    }

    /**
     * Ruft den Wert der toStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getToStopPointRef() {
        return toStopPointRef;
    }

    /**
     * Legt den Wert der toStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setToStopPointRef(ScheduledStopPointRefStructure value) {
        this.toStopPointRef = value;
    }

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der startTimeDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartTimeDayOffset() {
        return startTimeDayOffset;
    }

    /**
     * Legt den Wert der startTimeDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartTimeDayOffset(BigInteger value) {
        this.startTimeDayOffset = value;
    }

    /**
     * Ruft den Wert der endTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Legt den Wert der endTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Ruft den Wert der endTimeDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndTimeDayOffset() {
        return endTimeDayOffset;
    }

    /**
     * Legt den Wert der endTimeDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndTimeDayOffset(BigInteger value) {
        this.endTimeDayOffset = value;
    }

    /**
     * Ruft den Wert der vehicleOrientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleOrientation() {
        return vehicleOrientation;
    }

    /**
     * Legt den Wert der vehicleOrientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleOrientation(Boolean value) {
        this.vehicleOrientation = value;
    }

    /**
     * Ruft den Wert der purposeOfJourneyPartitionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PurposeOfJourneyPartitionRefStructure }
     *     
     */
    public PurposeOfJourneyPartitionRefStructure getPurposeOfJourneyPartitionRef() {
        return purposeOfJourneyPartitionRef;
    }

    /**
     * Legt den Wert der purposeOfJourneyPartitionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeOfJourneyPartitionRefStructure }
     *     
     */
    public void setPurposeOfJourneyPartitionRef(PurposeOfJourneyPartitionRefStructure value) {
        this.purposeOfJourneyPartitionRef = value;
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
     * Ruft den Wert der journeyPartPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartPositionsRelStructure }
     *     
     */
    public JourneyPartPositionsRelStructure getJourneyPartPositions() {
        return journeyPartPositions;
    }

    /**
     * Legt den Wert der journeyPartPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartPositionsRelStructure }
     *     
     */
    public void setJourneyPartPositions(JourneyPartPositionsRelStructure value) {
        this.journeyPartPositions = value;
    }

    /**
     * Ruft den Wert der occupancies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyViewRelStructure }
     *     
     */
    public OccupancyViewRelStructure getOccupancies() {
        return occupancies;
    }

    /**
     * Legt den Wert der occupancies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyViewRelStructure }
     *     
     */
    public void setOccupancies(OccupancyViewRelStructure value) {
        this.occupancies = value;
    }

    /**
     * Ruft den Wert der typeOfProductCategoryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfProductCategoryRefStructure }
     *     
     */
    public TypeOfProductCategoryRefStructure getTypeOfProductCategoryRef() {
        return typeOfProductCategoryRef;
    }

    /**
     * Legt den Wert der typeOfProductCategoryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfProductCategoryRefStructure }
     *     
     */
    public void setTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        this.typeOfProductCategoryRef = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
