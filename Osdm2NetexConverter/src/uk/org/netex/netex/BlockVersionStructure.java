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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for BLOCK.
 * 
 * <p>Java-Klasse f�r Block_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Block_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}BlockGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Block_VersionStructure", propOrder = {
    "name",
    "description",
    "privateCode",
    "preparationDuration",
    "startTime",
    "startTimeDayOffset",
    "finishingDuration",
    "endTime",
    "endTimeDayOffset",
    "dayTypes",
    "vehicleServicePartRef",
    "vehicleTypeRef",
    "startPointRef",
    "endPointRef",
    "journeys",
    "coursesOfJourneys",
    "blockParts",
    "reliefOpportunities"
})
@XmlSeeAlso({
    Block.class,
    TrainBlockVersionStructure.class
})
public class BlockVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "PreparationDuration")
    protected Duration preparationDuration;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "StartTimeDayOffset")
    protected BigInteger startTimeDayOffset;
    @XmlElement(name = "FinishingDuration")
    protected Duration finishingDuration;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "EndTimeDayOffset")
    protected BigInteger endTimeDayOffset;
    protected BlockVersionStructure.DayTypes dayTypes;
    @XmlElement(name = "VehicleServicePartRef")
    protected VehicleServicePartRefStructure vehicleServicePartRef;
    @XmlElementRef(name = "VehicleTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleTypeRefStructure> vehicleTypeRef;
    @XmlElement(name = "StartPointRef")
    protected PointRefStructure startPointRef;
    @XmlElement(name = "EndPointRef")
    protected PointRefStructure endPointRef;
    protected JourneyRefsRelStructure journeys;
    protected CoursesOfJourneysRelStructure coursesOfJourneys;
    protected BlockPartsRelStructure blockParts;
    protected ReliefOpportunitiesRelStructure reliefOpportunities;

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
     * DEPRECATED - use privateCodes. -v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der preparationDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreparationDuration() {
        return preparationDuration;
    }

    /**
     * Legt den Wert der preparationDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreparationDuration(Duration value) {
        this.preparationDuration = value;
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
     * Ruft den Wert der finishingDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFinishingDuration() {
        return finishingDuration;
    }

    /**
     * Legt den Wert der finishingDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFinishingDuration(Duration value) {
        this.finishingDuration = value;
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
     * Ruft den Wert der dayTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BlockVersionStructure.DayTypes }
     *     
     */
    public BlockVersionStructure.DayTypes getDayTypes() {
        return dayTypes;
    }

    /**
     * Legt den Wert der dayTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockVersionStructure.DayTypes }
     *     
     */
    public void setDayTypes(BlockVersionStructure.DayTypes value) {
        this.dayTypes = value;
    }

    /**
     * Ruft den Wert der vehicleServicePartRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleServicePartRefStructure }
     *     
     */
    public VehicleServicePartRefStructure getVehicleServicePartRef() {
        return vehicleServicePartRef;
    }

    /**
     * Legt den Wert der vehicleServicePartRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleServicePartRefStructure }
     *     
     */
    public void setVehicleServicePartRef(VehicleServicePartRefStructure value) {
        this.vehicleServicePartRef = value;
    }

    /**
     * Ruft den Wert der vehicleTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleTypeRefStructure> getVehicleTypeRef() {
        return vehicleTypeRef;
    }

    /**
     * Legt den Wert der vehicleTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     
     */
    public void setVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        this.vehicleTypeRef = value;
    }

    /**
     * Ruft den Wert der startPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getStartPointRef() {
        return startPointRef;
    }

    /**
     * Legt den Wert der startPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setStartPointRef(PointRefStructure value) {
        this.startPointRef = value;
    }

    /**
     * Ruft den Wert der endPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getEndPointRef() {
        return endPointRef;
    }

    /**
     * Legt den Wert der endPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setEndPointRef(PointRefStructure value) {
        this.endPointRef = value;
    }

    /**
     * Ruft den Wert der journeys-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRefsRelStructure }
     *     
     */
    public JourneyRefsRelStructure getJourneys() {
        return journeys;
    }

    /**
     * Legt den Wert der journeys-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRefsRelStructure }
     *     
     */
    public void setJourneys(JourneyRefsRelStructure value) {
        this.journeys = value;
    }

    /**
     * Ruft den Wert der coursesOfJourneys-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoursesOfJourneysRelStructure }
     *     
     */
    public CoursesOfJourneysRelStructure getCoursesOfJourneys() {
        return coursesOfJourneys;
    }

    /**
     * Legt den Wert der coursesOfJourneys-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoursesOfJourneysRelStructure }
     *     
     */
    public void setCoursesOfJourneys(CoursesOfJourneysRelStructure value) {
        this.coursesOfJourneys = value;
    }

    /**
     * Ruft den Wert der blockParts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BlockPartsRelStructure }
     *     
     */
    public BlockPartsRelStructure getBlockParts() {
        return blockParts;
    }

    /**
     * Legt den Wert der blockParts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockPartsRelStructure }
     *     
     */
    public void setBlockParts(BlockPartsRelStructure value) {
        this.blockParts = value;
    }

    /**
     * Ruft den Wert der reliefOpportunities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReliefOpportunitiesRelStructure }
     *     
     */
    public ReliefOpportunitiesRelStructure getReliefOpportunities() {
        return reliefOpportunities;
    }

    /**
     * Legt den Wert der reliefOpportunities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReliefOpportunitiesRelStructure }
     *     
     */
    public void setReliefOpportunities(ReliefOpportunitiesRelStructure value) {
        this.reliefOpportunities = value;
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
    public static class DayTypes
        extends DayTypeRefsRelStructure
    {


    }

}
