//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Estimate.
 * 
 * <p>Java-Klasse f�r EstimatedPassingTime_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EstimatedPassingTime_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DatedPassingTime_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}EstimatedPassingTimeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedPassingTime_VersionedChildStructure", propOrder = {
    "expectedArrivalTime",
    "arrivalDayOffset",
    "expectedDepartureTime",
    "departureDayOffset",
    "expectedWaitingTime",
    "expectedNonstopPassingTime",
    "passingTimeDayOffset",
    "expectedHeadway"
})
@XmlSeeAlso({
    EstimatedPassingTime.class
})
public class EstimatedPassingTimeVersionedChildStructure
    extends DatedPassingTimeVersionedChildStructure
{

    @XmlElement(name = "ExpectedArrivalTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar expectedArrivalTime;
    @XmlElement(name = "ArrivalDayOffset")
    protected BigInteger arrivalDayOffset;
    @XmlElement(name = "ExpectedDepartureTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar expectedDepartureTime;
    @XmlElement(name = "DepartureDayOffset")
    protected BigInteger departureDayOffset;
    @XmlElement(name = "ExpectedWaitingTime")
    protected Duration expectedWaitingTime;
    @XmlElement(name = "ExpectedNonstopPassingTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar expectedNonstopPassingTime;
    @XmlElement(name = "PassingTimeDayOffset")
    protected BigInteger passingTimeDayOffset;
    @XmlElement(name = "ExpectedHeadway")
    protected HeadwayIntervalStructure expectedHeadway;

    /**
     * Ruft den Wert der expectedArrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    /**
     * Legt den Wert der expectedArrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedArrivalTime(XMLGregorianCalendar value) {
        this.expectedArrivalTime = value;
    }

    /**
     * Ruft den Wert der arrivalDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArrivalDayOffset() {
        return arrivalDayOffset;
    }

    /**
     * Legt den Wert der arrivalDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArrivalDayOffset(BigInteger value) {
        this.arrivalDayOffset = value;
    }

    /**
     * Ruft den Wert der expectedDepartureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDepartureTime() {
        return expectedDepartureTime;
    }

    /**
     * Legt den Wert der expectedDepartureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDepartureTime(XMLGregorianCalendar value) {
        this.expectedDepartureTime = value;
    }

    /**
     * Ruft den Wert der departureDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepartureDayOffset() {
        return departureDayOffset;
    }

    /**
     * Legt den Wert der departureDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepartureDayOffset(BigInteger value) {
        this.departureDayOffset = value;
    }

    /**
     * Ruft den Wert der expectedWaitingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpectedWaitingTime() {
        return expectedWaitingTime;
    }

    /**
     * Legt den Wert der expectedWaitingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpectedWaitingTime(Duration value) {
        this.expectedWaitingTime = value;
    }

    /**
     * Ruft den Wert der expectedNonstopPassingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedNonstopPassingTime() {
        return expectedNonstopPassingTime;
    }

    /**
     * Legt den Wert der expectedNonstopPassingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedNonstopPassingTime(XMLGregorianCalendar value) {
        this.expectedNonstopPassingTime = value;
    }

    /**
     * Ruft den Wert der passingTimeDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassingTimeDayOffset() {
        return passingTimeDayOffset;
    }

    /**
     * Legt den Wert der passingTimeDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassingTimeDayOffset(BigInteger value) {
        this.passingTimeDayOffset = value;
    }

    /**
     * Ruft den Wert der expectedHeadway-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeadwayIntervalStructure }
     *     
     */
    public HeadwayIntervalStructure getExpectedHeadway() {
        return expectedHeadway;
    }

    /**
     * Legt den Wert der expectedHeadway-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadwayIntervalStructure }
     *     
     */
    public void setExpectedHeadway(HeadwayIntervalStructure value) {
        this.expectedHeadway = value;
    }

}
