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
 * Type for TIMETABLED PASSING TIME.
 * 
 * <p>Java-Klasse f�r TimetabledPassingTime_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimetabledPassingTime_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassingTime_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimetabledPassingTimeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimetabledPassingTime_VersionedChildStructure", propOrder = {
    "arrivalTime",
    "arrivalDayOffset",
    "departureTime",
    "departureDayOffset",
    "waitingTime",
    "headway",
    "latestArrivalTime",
    "latestArrivalDayOffset",
    "earliestDepartureTime",
    "earliestDepartureDayOffset",
    "occupancies"
})
@XmlSeeAlso({
    TimetabledPassingTime.class
})
public class TimetabledPassingTimeVersionedChildStructure
    extends PassingTimeVersionedChildStructure
{

    @XmlElement(name = "ArrivalTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar arrivalTime;
    @XmlElement(name = "ArrivalDayOffset", defaultValue = "0")
    protected BigInteger arrivalDayOffset;
    @XmlElement(name = "DepartureTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departureTime;
    @XmlElement(name = "DepartureDayOffset", defaultValue = "0")
    protected BigInteger departureDayOffset;
    @XmlElement(name = "WaitingTime")
    protected Duration waitingTime;
    @XmlElement(name = "Headway")
    protected HeadwayIntervalStructure headway;
    @XmlElement(name = "LatestArrivalTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar latestArrivalTime;
    @XmlElement(name = "LatestArrivalDayOffset", defaultValue = "0")
    protected BigInteger latestArrivalDayOffset;
    @XmlElement(name = "EarliestDepartureTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar earliestDepartureTime;
    @XmlElement(name = "EarliestDepartureDayOffset", defaultValue = "0")
    protected BigInteger earliestDepartureDayOffset;
    protected OccupancyViewRelStructure occupancies;

    /**
     * Ruft den Wert der arrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Legt den Wert der arrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
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
     * Ruft den Wert der departureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Legt den Wert der departureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
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
     * Ruft den Wert der waitingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getWaitingTime() {
        return waitingTime;
    }

    /**
     * Legt den Wert der waitingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setWaitingTime(Duration value) {
        this.waitingTime = value;
    }

    /**
     * Ruft den Wert der headway-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeadwayIntervalStructure }
     *     
     */
    public HeadwayIntervalStructure getHeadway() {
        return headway;
    }

    /**
     * Legt den Wert der headway-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadwayIntervalStructure }
     *     
     */
    public void setHeadway(HeadwayIntervalStructure value) {
        this.headway = value;
    }

    /**
     * Ruft den Wert der latestArrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestArrivalTime() {
        return latestArrivalTime;
    }

    /**
     * Legt den Wert der latestArrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestArrivalTime(XMLGregorianCalendar value) {
        this.latestArrivalTime = value;
    }

    /**
     * Ruft den Wert der latestArrivalDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLatestArrivalDayOffset() {
        return latestArrivalDayOffset;
    }

    /**
     * Legt den Wert der latestArrivalDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLatestArrivalDayOffset(BigInteger value) {
        this.latestArrivalDayOffset = value;
    }

    /**
     * Ruft den Wert der earliestDepartureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestDepartureTime() {
        return earliestDepartureTime;
    }

    /**
     * Legt den Wert der earliestDepartureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestDepartureTime(XMLGregorianCalendar value) {
        this.earliestDepartureTime = value;
    }

    /**
     * Ruft den Wert der earliestDepartureDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEarliestDepartureDayOffset() {
        return earliestDepartureDayOffset;
    }

    /**
     * Legt den Wert der earliestDepartureDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEarliestDepartureDayOffset(BigInteger value) {
        this.earliestDepartureDayOffset = value;
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

}
