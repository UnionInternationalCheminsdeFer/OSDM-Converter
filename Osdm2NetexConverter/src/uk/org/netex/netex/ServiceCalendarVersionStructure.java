//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a SERVICE CALENDAR.
 * 
 * <p>Java-Klasse f�r ServiceCalendar_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceCalendar_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ServiceCalendarGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCalendar_VersionStructure", propOrder = {
    "name",
    "shortName",
    "fromDate",
    "toDate",
    "earliestTime",
    "dayLength",
    "dayTypes",
    "timebands",
    "operatingDays",
    "operatingPeriods",
    "dayTypeAssignments"
})
@XmlSeeAlso({
    ServiceCalendar.class
})
public class ServiceCalendarVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "FromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "EarliestTime", defaultValue = "00:00:00")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar earliestTime;
    @XmlElement(name = "DayLength", defaultValue = "PT24H")
    protected Duration dayLength;
    protected DayTypesRelStructure dayTypes;
    protected TimebandsRelStructure timebands;
    protected OperatingDaysRelStructure operatingDays;
    protected OperatingPeriodsRelStructure operatingPeriods;
    protected DayTypeAssignmentsRelStructure dayTypeAssignments;

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
     * Ruft den Wert der fromDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Legt den Wert der fromDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Ruft den Wert der toDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Legt den Wert der toDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
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

    /**
     * Ruft den Wert der dayTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayTypesRelStructure }
     *     
     */
    public DayTypesRelStructure getDayTypes() {
        return dayTypes;
    }

    /**
     * Legt den Wert der dayTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTypesRelStructure }
     *     
     */
    public void setDayTypes(DayTypesRelStructure value) {
        this.dayTypes = value;
    }

    /**
     * Ruft den Wert der timebands-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimebandsRelStructure }
     *     
     */
    public TimebandsRelStructure getTimebands() {
        return timebands;
    }

    /**
     * Legt den Wert der timebands-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimebandsRelStructure }
     *     
     */
    public void setTimebands(TimebandsRelStructure value) {
        this.timebands = value;
    }

    /**
     * Ruft den Wert der operatingDays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDaysRelStructure }
     *     
     */
    public OperatingDaysRelStructure getOperatingDays() {
        return operatingDays;
    }

    /**
     * Legt den Wert der operatingDays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDaysRelStructure }
     *     
     */
    public void setOperatingDays(OperatingDaysRelStructure value) {
        this.operatingDays = value;
    }

    /**
     * Ruft den Wert der operatingPeriods-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatingPeriodsRelStructure }
     *     
     */
    public OperatingPeriodsRelStructure getOperatingPeriods() {
        return operatingPeriods;
    }

    /**
     * Legt den Wert der operatingPeriods-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingPeriodsRelStructure }
     *     
     */
    public void setOperatingPeriods(OperatingPeriodsRelStructure value) {
        this.operatingPeriods = value;
    }

    /**
     * Ruft den Wert der dayTypeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayTypeAssignmentsRelStructure }
     *     
     */
    public DayTypeAssignmentsRelStructure getDayTypeAssignments() {
        return dayTypeAssignments;
    }

    /**
     * Legt den Wert der dayTypeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTypeAssignmentsRelStructure }
     *     
     */
    public void setDayTypeAssignments(DayTypeAssignmentsRelStructure value) {
        this.dayTypeAssignments = value;
    }

}
