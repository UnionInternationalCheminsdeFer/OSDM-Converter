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
 * Type for a JOURNEY PART COUPLE.
 * 
 * <p>Java-Klasse f�r JourneyPartCouple_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JourneyPartCouple_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyPartCoupleGroup"/>
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
@XmlType(name = "JourneyPartCouple_VersionStructure", propOrder = {
    "description",
    "startTime",
    "startTimeDayOffset",
    "endTime",
    "endTimeDayOffset",
    "fromStopPointRef",
    "toStopPointRef",
    "mainPartRef",
    "blockRef",
    "journeyParts",
    "trainNumberRef"
})
@XmlSeeAlso({
    JourneyPartCouple.class
})
public class JourneyPartCoupleVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Description")
    protected MultilingualString description;
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
    @XmlElement(name = "FromStopPointRef", required = true)
    protected ScheduledStopPointRefStructure fromStopPointRef;
    @XmlElement(name = "ToStopPointRef", required = true)
    protected ScheduledStopPointRefStructure toStopPointRef;
    @XmlElement(name = "MainPartRef", required = true)
    protected JourneyPartRefStructure mainPartRef;
    @XmlElementRef(name = "BlockRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends BlockRefStructure> blockRef;
    protected JourneyPartsRelStructure journeyParts;
    @XmlElement(name = "TrainNumberRef")
    protected TrainNumberRefStructure trainNumberRef;
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
     * Ruft den Wert der blockRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrainBlockRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlockRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends BlockRefStructure> getBlockRef() {
        return blockRef;
    }

    /**
     * Legt den Wert der blockRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrainBlockRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlockRefStructure }{@code >}
     *     
     */
    public void setBlockRef(JAXBElement<? extends BlockRefStructure> value) {
        this.blockRef = value;
    }

    /**
     * Ruft den Wert der journeyParts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartsRelStructure }
     *     
     */
    public JourneyPartsRelStructure getJourneyParts() {
        return journeyParts;
    }

    /**
     * Legt den Wert der journeyParts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartsRelStructure }
     *     
     */
    public void setJourneyParts(JourneyPartsRelStructure value) {
        this.journeyParts = value;
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
