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
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Property of Day.
 * 
 * <p>Java-Klasse f�r PropertyOfDayStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PropertyOfDayStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PropertyOfDayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyOfDayStructure", propOrder = {
    "name",
    "description",
    "daysOfWeek",
    "weeksOfMonth",
    "monthOfYear",
    "dayOfMonth",
    "dayOfYear",
    "countryRef",
    "holidayTypes",
    "seasons",
    "tides",
    "dayEvent",
    "crowding"
})
@XmlSeeAlso({
    PropertyOfDay.class
})
public class PropertyOfDayStructure {

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlList
    @XmlElement(name = "DaysOfWeek")
    protected List<DayOfWeekEnumeration> daysOfWeek;
    @XmlList
    @XmlElement(name = "WeeksOfMonth", defaultValue = "EveryWeek")
    protected List<String> weeksOfMonth;
    @XmlElement(name = "MonthOfYear")
    @XmlSchemaType(name = "gMonth")
    protected XMLGregorianCalendar monthOfYear;
    @XmlElement(name = "DayOfMonth")
    @XmlSchemaType(name = "gDay")
    protected XMLGregorianCalendar dayOfMonth;
    @XmlElement(name = "DayOfYear")
    @XmlSchemaType(name = "gMonthDay")
    protected XMLGregorianCalendar dayOfYear;
    @XmlElement(name = "CountryRef")
    protected CountryRefStructure countryRef;
    @XmlList
    @XmlElement(name = "HolidayTypes", defaultValue = "AnyDay")
    protected List<HolidayTypeEnumeration> holidayTypes;
    @XmlList
    @XmlElement(name = "Seasons", defaultValue = "Perennially")
    protected List<SeasonEnumeration> seasons;
    @XmlList
    @XmlElement(name = "Tides", defaultValue = "AllTides")
    protected List<TideEnumeration> tides;
    @XmlElement(name = "DayEvent")
    @XmlSchemaType(name = "string")
    protected DayEventEnumeration dayEvent;
    @XmlElement(name = "Crowding")
    @XmlSchemaType(name = "string")
    protected CrowdingEnumeration crowding;

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
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfWeekEnumeration }
     * 
     * 
     */
    public List<DayOfWeekEnumeration> getDaysOfWeek() {
        if (daysOfWeek == null) {
            daysOfWeek = new ArrayList<DayOfWeekEnumeration>();
        }
        return this.daysOfWeek;
    }

    /**
     * Gets the value of the weeksOfMonth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weeksOfMonth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeeksOfMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWeeksOfMonth() {
        if (weeksOfMonth == null) {
            weeksOfMonth = new ArrayList<String>();
        }
        return this.weeksOfMonth;
    }

    /**
     * Ruft den Wert der monthOfYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMonthOfYear() {
        return monthOfYear;
    }

    /**
     * Legt den Wert der monthOfYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMonthOfYear(XMLGregorianCalendar value) {
        this.monthOfYear = value;
    }

    /**
     * Ruft den Wert der dayOfMonth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Legt den Wert der dayOfMonth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDayOfMonth(XMLGregorianCalendar value) {
        this.dayOfMonth = value;
    }

    /**
     * Ruft den Wert der dayOfYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDayOfYear() {
        return dayOfYear;
    }

    /**
     * Legt den Wert der dayOfYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDayOfYear(XMLGregorianCalendar value) {
        this.dayOfYear = value;
    }

    /**
     * Ruft den Wert der countryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryRefStructure }
     *     
     */
    public CountryRefStructure getCountryRef() {
        return countryRef;
    }

    /**
     * Legt den Wert der countryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRefStructure }
     *     
     */
    public void setCountryRef(CountryRefStructure value) {
        this.countryRef = value;
    }

    /**
     * Gets the value of the holidayTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holidayTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolidayTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HolidayTypeEnumeration }
     * 
     * 
     */
    public List<HolidayTypeEnumeration> getHolidayTypes() {
        if (holidayTypes == null) {
            holidayTypes = new ArrayList<HolidayTypeEnumeration>();
        }
        return this.holidayTypes;
    }

    /**
     * Gets the value of the seasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeasonEnumeration }
     * 
     * 
     */
    public List<SeasonEnumeration> getSeasons() {
        if (seasons == null) {
            seasons = new ArrayList<SeasonEnumeration>();
        }
        return this.seasons;
    }

    /**
     * Gets the value of the tides property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tides property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTides().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TideEnumeration }
     * 
     * 
     */
    public List<TideEnumeration> getTides() {
        if (tides == null) {
            tides = new ArrayList<TideEnumeration>();
        }
        return this.tides;
    }

    /**
     * Ruft den Wert der dayEvent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayEventEnumeration }
     *     
     */
    public DayEventEnumeration getDayEvent() {
        return dayEvent;
    }

    /**
     * Legt den Wert der dayEvent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayEventEnumeration }
     *     
     */
    public void setDayEvent(DayEventEnumeration value) {
        this.dayEvent = value;
    }

    /**
     * Ruft den Wert der crowding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CrowdingEnumeration }
     *     
     */
    public CrowdingEnumeration getCrowding() {
        return crowding;
    }

    /**
     * Legt den Wert der crowding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CrowdingEnumeration }
     *     
     */
    public void setCrowding(CrowdingEnumeration value) {
        this.crowding = value;
    }

}
