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
 * Type for TARGET PASSING TIME.
 * 
 * <p>Java-Klasse f�r TargetPassingTime_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TargetPassingTime_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DatedPassingTime_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TargetPassingTimeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetPassingTime_VersionedChildStructure", propOrder = {
    "aimedArrivalTime",
    "arrivalDayOffset",
    "aimedDepartureTime",
    "departureDayOffset",
    "aimedWaitingTime",
    "aimedNonstopPassingTime",
    "passingTimeDayOffset",
    "aimedHeadway"
})
@XmlSeeAlso({
    TargetPassingTime.class
})
public class TargetPassingTimeVersionedChildStructure
    extends DatedPassingTimeVersionedChildStructure
{

    @XmlElement(name = "AimedArrivalTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar aimedArrivalTime;
    @XmlElement(name = "ArrivalDayOffset")
    protected BigInteger arrivalDayOffset;
    @XmlElement(name = "AimedDepartureTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar aimedDepartureTime;
    @XmlElement(name = "DepartureDayOffset")
    protected BigInteger departureDayOffset;
    @XmlElement(name = "AimedWaitingTime")
    protected Duration aimedWaitingTime;
    @XmlElement(name = "AimedNonstopPassingTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar aimedNonstopPassingTime;
    @XmlElement(name = "PassingTimeDayOffset")
    protected BigInteger passingTimeDayOffset;
    @XmlElement(name = "AimedHeadway")
    protected HeadwayIntervalStructure aimedHeadway;

    /**
     * Ruft den Wert der aimedArrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Legt den Wert der aimedArrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAimedArrivalTime(XMLGregorianCalendar value) {
        this.aimedArrivalTime = value;
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
     * Ruft den Wert der aimedDepartureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    /**
     * Legt den Wert der aimedDepartureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAimedDepartureTime(XMLGregorianCalendar value) {
        this.aimedDepartureTime = value;
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
     * Ruft den Wert der aimedWaitingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAimedWaitingTime() {
        return aimedWaitingTime;
    }

    /**
     * Legt den Wert der aimedWaitingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAimedWaitingTime(Duration value) {
        this.aimedWaitingTime = value;
    }

    /**
     * Ruft den Wert der aimedNonstopPassingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAimedNonstopPassingTime() {
        return aimedNonstopPassingTime;
    }

    /**
     * Legt den Wert der aimedNonstopPassingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAimedNonstopPassingTime(XMLGregorianCalendar value) {
        this.aimedNonstopPassingTime = value;
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
     * Ruft den Wert der aimedHeadway-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeadwayIntervalStructure }
     *     
     */
    public HeadwayIntervalStructure getAimedHeadway() {
        return aimedHeadway;
    }

    /**
     * Legt den Wert der aimedHeadway-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadwayIntervalStructure }
     *     
     */
    public void setAimedHeadway(HeadwayIntervalStructure value) {
        this.aimedHeadway = value;
    }

}
