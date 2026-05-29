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
 * Type for an OPERATING DAY.
 * 
 * <p>Java-Klasse f�r OperatingDay_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OperatingDay_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}OperatingDayGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingDay_VersionStructure", propOrder = {
    "calendarDate",
    "serviceCalendarRef",
    "name",
    "shortName",
    "dayNumber",
    "privateCode",
    "earliestTime",
    "dayLength"
})
@XmlSeeAlso({
    OperatingDay.class
})
public class OperatingDayVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "CalendarDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar calendarDate;
    @XmlElement(name = "ServiceCalendarRef")
    protected ServiceCalendarRefStructure serviceCalendarRef;
    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "DayNumber")
    protected BigInteger dayNumber;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "EarliestTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar earliestTime;
    @XmlElement(name = "DayLength")
    protected Duration dayLength;

    /**
     * Ruft den Wert der calendarDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalendarDate() {
        return calendarDate;
    }

    /**
     * Legt den Wert der calendarDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalendarDate(XMLGregorianCalendar value) {
        this.calendarDate = value;
    }

    /**
     * Reference to parent SERVICE CALENDAR. If given by context, does not need to be given.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCalendarRefStructure }
     *     
     */
    public ServiceCalendarRefStructure getServiceCalendarRef() {
        return serviceCalendarRef;
    }

    /**
     * Legt den Wert der serviceCalendarRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCalendarRefStructure }
     *     
     */
    public void setServiceCalendarRef(ServiceCalendarRefStructure value) {
        this.serviceCalendarRef = value;
    }

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
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
    }

    /**
     * Ruft den Wert der dayNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayNumber() {
        return dayNumber;
    }

    /**
     * Legt den Wert der dayNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayNumber(BigInteger value) {
        this.dayNumber = value;
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
     * Ruft den Wert der earliestTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestTime() {
        return earliestTime;
    }

    /**
     * Legt den Wert der earliestTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestTime(XMLGregorianCalendar value) {
        this.earliestTime = value;
    }

    /**
     * Ruft den Wert der dayLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDayLength() {
        return dayLength;
    }

    /**
     * Legt den Wert der dayLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDayLength(Duration value) {
        this.dayLength = value;
    }

}
