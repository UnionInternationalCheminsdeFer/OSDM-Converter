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
 * Type for TIME INTERVAL.
 * 
 * <p>Java-Klasse f�r TimeInterval_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeInterval_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FareInterval_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimeIntervalGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInterval_VersionStructure", propOrder = {
    "startTime",
    "endTime",
    "dayOffset",
    "duration",
    "minimumDuration",
    "prices",
    "timeStructureFactors"
})
@XmlSeeAlso({
    TimeInterval.class
})
public class TimeIntervalVersionStructure
    extends FareIntervalVersionStructure
{

    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "DayOffset", defaultValue = "0")
    protected BigInteger dayOffset;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "MinimumDuration")
    protected Duration minimumDuration;
    protected TimeIntervalPricesRelStructure prices;
    protected TimeStructureFactorsRelStructure timeStructureFactors;

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
     * Ruft den Wert der dayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayOffset() {
        return dayOffset;
    }

    /**
     * Legt den Wert der dayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayOffset(BigInteger value) {
        this.dayOffset = value;
    }

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der minimumDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumDuration() {
        return minimumDuration;
    }

    /**
     * Legt den Wert der minimumDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumDuration(Duration value) {
        this.minimumDuration = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalPricesRelStructure }
     *     
     */
    public TimeIntervalPricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalPricesRelStructure }
     *     
     */
    public void setPrices(TimeIntervalPricesRelStructure value) {
        this.prices = value;
    }

    /**
     * Ruft den Wert der timeStructureFactors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeStructureFactorsRelStructure }
     *     
     */
    public TimeStructureFactorsRelStructure getTimeStructureFactors() {
        return timeStructureFactors;
    }

    /**
     * Legt den Wert der timeStructureFactors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeStructureFactorsRelStructure }
     *     
     */
    public void setTimeStructureFactors(TimeStructureFactorsRelStructure value) {
        this.timeStructureFactors = value;
    }

}
