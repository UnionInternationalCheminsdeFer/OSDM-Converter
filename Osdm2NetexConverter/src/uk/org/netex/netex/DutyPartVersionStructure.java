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
 * Type for a DUTY PART.
 * 
 * <p>Java-Klasse f�r DutyPart_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DutyPart_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccountableElementStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DutyPartGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyPart_VersionStructure", propOrder = {
    "driverAccessDuration",
    "driverReturnDuration",
    "dutyRef",
    "startTime",
    "dayOffset",
    "endTime",
    "endDayOffset",
    "startPointRef",
    "endPointRef"
})
@XmlSeeAlso({
    DutyPart.class
})
public class DutyPartVersionStructure
    extends AccountableElementStructure
{

    @XmlElement(name = "DriverAccessDuration")
    protected Duration driverAccessDuration;
    @XmlElement(name = "DriverReturnDuration")
    protected Duration driverReturnDuration;
    @XmlElement(name = "DutyRef")
    protected DutyRefStructure dutyRef;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "DayOffset", defaultValue = "0")
    protected BigInteger dayOffset;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "EndDayOffset", defaultValue = "0")
    protected BigInteger endDayOffset;
    @XmlElement(name = "StartPointRef")
    protected TimingPointRefStructure startPointRef;
    @XmlElement(name = "EndPointRef")
    protected TimingPointRefStructure endPointRef;

    /**
     * Ruft den Wert der driverAccessDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDriverAccessDuration() {
        return driverAccessDuration;
    }

    /**
     * Legt den Wert der driverAccessDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDriverAccessDuration(Duration value) {
        this.driverAccessDuration = value;
    }

    /**
     * Ruft den Wert der driverReturnDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDriverReturnDuration() {
        return driverReturnDuration;
    }

    /**
     * Legt den Wert der driverReturnDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDriverReturnDuration(Duration value) {
        this.driverReturnDuration = value;
    }

    /**
     * Ruft den Wert der dutyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DutyRefStructure }
     *     
     */
    public DutyRefStructure getDutyRef() {
        return dutyRef;
    }

    /**
     * Legt den Wert der dutyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyRefStructure }
     *     
     */
    public void setDutyRef(DutyRefStructure value) {
        this.dutyRef = value;
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
     * Ruft den Wert der endDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndDayOffset() {
        return endDayOffset;
    }

    /**
     * Legt den Wert der endDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndDayOffset(BigInteger value) {
        this.endDayOffset = value;
    }

    /**
     * Ruft den Wert der startPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingPointRefStructure }
     *     
     */
    public TimingPointRefStructure getStartPointRef() {
        return startPointRef;
    }

    /**
     * Legt den Wert der startPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPointRefStructure }
     *     
     */
    public void setStartPointRef(TimingPointRefStructure value) {
        this.startPointRef = value;
    }

    /**
     * Ruft den Wert der endPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingPointRefStructure }
     *     
     */
    public TimingPointRefStructure getEndPointRef() {
        return endPointRef;
    }

    /**
     * Legt den Wert der endPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPointRefStructure }
     *     
     */
    public void setEndPointRef(TimingPointRefStructure value) {
        this.endPointRef = value;
    }

}
