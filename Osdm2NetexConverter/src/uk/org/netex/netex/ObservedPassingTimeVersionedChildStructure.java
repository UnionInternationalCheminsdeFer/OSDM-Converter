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
 * Type for OBSERVED PASSING TIME.
 * 
 * <p>Java-Klasse f�r ObservedPassingTime_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ObservedPassingTime_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DatedPassingTime_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ObservedPassingTimeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedPassingTime_VersionedChildStructure", propOrder = {
    "actualArrivalTime",
    "arrivalDayOffset",
    "actualDepartureTime",
    "departureDayOffset",
    "actualWaitingTime",
    "actualNonstopPassingTime",
    "passingTimeDayOffset",
    "actualHeadway"
})
@XmlSeeAlso({
    ObservedPassingTime.class
})
public class ObservedPassingTimeVersionedChildStructure
    extends DatedPassingTimeVersionedChildStructure
{

    @XmlElement(name = "ActualArrivalTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar actualArrivalTime;
    @XmlElement(name = "ArrivalDayOffset")
    protected BigInteger arrivalDayOffset;
    @XmlElement(name = "ActualDepartureTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar actualDepartureTime;
    @XmlElement(name = "DepartureDayOffset")
    protected BigInteger departureDayOffset;
    @XmlElement(name = "ActualWaitingTime")
    protected Duration actualWaitingTime;
    @XmlElement(name = "ActualNonstopPassingTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar actualNonstopPassingTime;
    @XmlElement(name = "PassingTimeDayOffset")
    protected BigInteger passingTimeDayOffset;
    @XmlElement(name = "ActualHeadway")
    protected HeadwayIntervalStructure actualHeadway;

    /**
     * Ruft den Wert der actualArrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualArrivalTime() {
        return actualArrivalTime;
    }

    /**
     * Legt den Wert der actualArrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualArrivalTime(XMLGregorianCalendar value) {
        this.actualArrivalTime = value;
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
     * Ruft den Wert der actualDepartureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDepartureTime() {
        return actualDepartureTime;
    }

    /**
     * Legt den Wert der actualDepartureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDepartureTime(XMLGregorianCalendar value) {
        this.actualDepartureTime = value;
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
     * Ruft den Wert der actualWaitingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getActualWaitingTime() {
        return actualWaitingTime;
    }

    /**
     * Legt den Wert der actualWaitingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setActualWaitingTime(Duration value) {
        this.actualWaitingTime = value;
    }

    /**
     * Ruft den Wert der actualNonstopPassingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualNonstopPassingTime() {
        return actualNonstopPassingTime;
    }

    /**
     * Legt den Wert der actualNonstopPassingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualNonstopPassingTime(XMLGregorianCalendar value) {
        this.actualNonstopPassingTime = value;
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
     * Ruft den Wert der actualHeadway-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeadwayIntervalStructure }
     *     
     */
    public HeadwayIntervalStructure getActualHeadway() {
        return actualHeadway;
    }

    /**
     * Legt den Wert der actualHeadway-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadwayIntervalStructure }
     *     
     */
    public void setActualHeadway(HeadwayIntervalStructure value) {
        this.actualHeadway = value;
    }

}
