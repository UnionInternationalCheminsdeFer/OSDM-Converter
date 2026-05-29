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
 * Type for DEAD RUN CALL part.
 * 
 * <p>Java-Klasse f�r DeadRunCallPartStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeadRunCallPartStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="DayOffset" type="{http://www.netex.org.uk/netex}DayOffsetType" minOccurs="0"/>
 *         &lt;element name="WaitTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeadRunCallPartGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeadRunCallPartStructure", propOrder = {
    "time",
    "dayOffset",
    "waitTime",
    "journeyPartRef",
    "timeDemandTypeRef",
    "dutyPartRef"
})
public class DeadRunCallPartStructure {

    @XmlElement(name = "Time")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "DayOffset")
    protected BigInteger dayOffset;
    @XmlElement(name = "WaitTime")
    protected Duration waitTime;
    @XmlElement(name = "JourneyPartRef")
    protected JourneyPartRefStructure journeyPartRef;
    @XmlElement(name = "TimeDemandTypeRef")
    protected TimeDemandTypeRefStructure timeDemandTypeRef;
    @XmlElement(name = "DutyPartRef")
    protected DutyPartRefStructure dutyPartRef;

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
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
     * Ruft den Wert der waitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getWaitTime() {
        return waitTime;
    }

    /**
     * Legt den Wert der waitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setWaitTime(Duration value) {
        this.waitTime = value;
    }

    /**
     * Ruft den Wert der journeyPartRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartRefStructure }
     *     
     */
    public JourneyPartRefStructure getJourneyPartRef() {
        return journeyPartRef;
    }

    /**
     * Legt den Wert der journeyPartRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartRefStructure }
     *     
     */
    public void setJourneyPartRef(JourneyPartRefStructure value) {
        this.journeyPartRef = value;
    }

    /**
     * Ruft den Wert der timeDemandTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeDemandTypeRefStructure }
     *     
     */
    public TimeDemandTypeRefStructure getTimeDemandTypeRef() {
        return timeDemandTypeRef;
    }

    /**
     * Legt den Wert der timeDemandTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDemandTypeRefStructure }
     *     
     */
    public void setTimeDemandTypeRef(TimeDemandTypeRefStructure value) {
        this.timeDemandTypeRef = value;
    }

    /**
     * Ruft den Wert der dutyPartRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DutyPartRefStructure }
     *     
     */
    public DutyPartRefStructure getDutyPartRef() {
        return dutyPartRef;
    }

    /**
     * Legt den Wert der dutyPartRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyPartRefStructure }
     *     
     */
    public void setDutyPartRef(DutyPartRefStructure value) {
        this.dutyPartRef = value;
    }

}
