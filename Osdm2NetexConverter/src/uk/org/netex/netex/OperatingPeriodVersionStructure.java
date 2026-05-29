//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for an OPERATING PERIOD.
 * 
 * <p>Java-Klasse f�r OperatingPeriod_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OperatingPeriod_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}OperatingPeriodGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingPeriod_VersionStructure", propOrder = {
    "serviceCalendarRef",
    "name",
    "shortName",
    "fromOperatingDayRef",
    "fromDate",
    "toOperatingDayRef",
    "toDate",
    "holidayType",
    "season"
})
@XmlSeeAlso({
    OperatingPeriod.class,
    UicOperatingPeriodVersionStructure.class
})
public class OperatingPeriodVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "ServiceCalendarRef")
    protected ServiceCalendarRefStructure serviceCalendarRef;
    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "FromOperatingDayRef")
    protected OperatingDayRefStructure fromOperatingDayRef;
    @XmlElement(name = "FromDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToOperatingDayRef")
    protected OperatingDayRefStructure toOperatingDayRef;
    @XmlElement(name = "ToDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "HolidayType", defaultValue = "AnyDay")
    @XmlSchemaType(name = "string")
    protected List<HolidayTypeEnumeration> holidayType;
    @XmlElement(name = "Season", defaultValue = "Perennially")
    @XmlSchemaType(name = "string")
    protected List<SeasonEnumeration> season;

    /**
     * Reference to parent Calendar. If given by context, does not need to be given.
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
     * Ruft den Wert der fromOperatingDayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public OperatingDayRefStructure getFromOperatingDayRef() {
        return fromOperatingDayRef;
    }

    /**
     * Legt den Wert der fromOperatingDayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public void setFromOperatingDayRef(OperatingDayRefStructure value) {
        this.fromOperatingDayRef = value;
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
     * Ruft den Wert der toOperatingDayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public OperatingDayRefStructure getToOperatingDayRef() {
        return toOperatingDayRef;
    }

    /**
     * Legt den Wert der toOperatingDayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public void setToOperatingDayRef(OperatingDayRefStructure value) {
        this.toOperatingDayRef = value;
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
     * Gets the value of the holidayType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holidayType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolidayType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HolidayTypeEnumeration }
     * 
     * 
     */
    public List<HolidayTypeEnumeration> getHolidayType() {
        if (holidayType == null) {
            holidayType = new ArrayList<HolidayTypeEnumeration>();
        }
        return this.holidayType;
    }

    /**
     * Gets the value of the season property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the season property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeasonEnumeration }
     * 
     * 
     */
    public List<SeasonEnumeration> getSeason() {
        if (season == null) {
            season = new ArrayList<SeasonEnumeration>();
        }
        return this.season;
    }

}
