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
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Simplified TIMETABLED PASSING TIME.
 * 
 * <p>Java-Klasse f�r TimetabledPassingTime_ViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimetabledPassingTime_ViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassingTime_ViewStructure">
 *       &lt;sequence>
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="ArrivalDayOffset" type="{http://www.netex.org.uk/netex}DayOffsetType" minOccurs="0"/>
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="DepartureDayOffset" type="{http://www.netex.org.uk/netex}DayOffsetType" minOccurs="0"/>
 *         &lt;element name="WaitingTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="Headway" type="{http://www.netex.org.uk/netex}HeadwayIntervalStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimetabledPassingTime_ViewStructure", propOrder = {
    "arrivalTime",
    "arrivalDayOffset",
    "departureTime",
    "departureDayOffset",
    "waitingTime",
    "headway"
})
public class TimetabledPassingTimeViewStructure
    extends PassingTimeViewStructure
{

    @XmlElement(name = "ArrivalTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar arrivalTime;
    @XmlElement(name = "ArrivalDayOffset")
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

}
