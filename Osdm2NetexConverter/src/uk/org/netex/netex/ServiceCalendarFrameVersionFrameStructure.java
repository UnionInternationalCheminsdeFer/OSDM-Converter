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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a SERVICE CALENDAR.
 * 
 * <p>Java-Klasse f�r ServiceCalendarFrame_VersionFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceCalendarFrame_VersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ServiceCalendarFrameGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCalendarFrame_VersionFrameStructure", propOrder = {
    "serviceCalendar",
    "dayTypes",
    "timebands",
    "groupOfTimebands",
    "operatingDays",
    "operatingPeriods",
    "dayTypeAssignments"
})
@XmlSeeAlso({
    ServiceCalendarFrame.class
})
public class ServiceCalendarFrameVersionFrameStructure
    extends CommonVersionFrameStructure
{

    @XmlElement(name = "ServiceCalendar")
    protected ServiceCalendar serviceCalendar;
    protected DayTypesInFrameRelStructure dayTypes;
    protected TimebandsInFrameRelStructure timebands;
    protected GroupOfTimebandsInFrameRelStructure groupOfTimebands;
    protected OperatingDaysInFrameRelStructure operatingDays;
    protected OperatingPeriodsInFrameRelStructure operatingPeriods;
    protected DayTypeAssignmentsInFrameRelStructure dayTypeAssignments;

    /**
     * Ruft den Wert der serviceCalendar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCalendar }
     *     
     */
    public ServiceCalendar getServiceCalendar() {
        return serviceCalendar;
    }

    /**
     * Legt den Wert der serviceCalendar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCalendar }
     *     
     */
    public void setServiceCalendar(ServiceCalendar value) {
        this.serviceCalendar = value;
    }

    /**
     * Ruft den Wert der dayTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayTypesInFrameRelStructure }
     *     
     */
    public DayTypesInFrameRelStructure getDayTypes() {
        return dayTypes;
    }

    /**
     * Legt den Wert der dayTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTypesInFrameRelStructure }
     *     
     */
    public void setDayTypes(DayTypesInFrameRelStructure value) {
        this.dayTypes = value;
    }

    /**
     * Ruft den Wert der timebands-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimebandsInFrameRelStructure }
     *     
     */
    public TimebandsInFrameRelStructure getTimebands() {
        return timebands;
    }

    /**
     * Legt den Wert der timebands-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimebandsInFrameRelStructure }
     *     
     */
    public void setTimebands(TimebandsInFrameRelStructure value) {
        this.timebands = value;
    }

    /**
     * Ruft den Wert der groupOfTimebands-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfTimebandsInFrameRelStructure }
     *     
     */
    public GroupOfTimebandsInFrameRelStructure getGroupOfTimebands() {
        return groupOfTimebands;
    }

    /**
     * Legt den Wert der groupOfTimebands-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfTimebandsInFrameRelStructure }
     *     
     */
    public void setGroupOfTimebands(GroupOfTimebandsInFrameRelStructure value) {
        this.groupOfTimebands = value;
    }

    /**
     * Ruft den Wert der operatingDays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDaysInFrameRelStructure }
     *     
     */
    public OperatingDaysInFrameRelStructure getOperatingDays() {
        return operatingDays;
    }

    /**
     * Legt den Wert der operatingDays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDaysInFrameRelStructure }
     *     
     */
    public void setOperatingDays(OperatingDaysInFrameRelStructure value) {
        this.operatingDays = value;
    }

    /**
     * Ruft den Wert der operatingPeriods-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatingPeriodsInFrameRelStructure }
     *     
     */
    public OperatingPeriodsInFrameRelStructure getOperatingPeriods() {
        return operatingPeriods;
    }

    /**
     * Legt den Wert der operatingPeriods-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingPeriodsInFrameRelStructure }
     *     
     */
    public void setOperatingPeriods(OperatingPeriodsInFrameRelStructure value) {
        this.operatingPeriods = value;
    }

    /**
     * Ruft den Wert der dayTypeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayTypeAssignmentsInFrameRelStructure }
     *     
     */
    public DayTypeAssignmentsInFrameRelStructure getDayTypeAssignments() {
        return dayTypeAssignments;
    }

    /**
     * Legt den Wert der dayTypeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTypeAssignmentsInFrameRelStructure }
     *     
     */
    public void setDayTypeAssignments(DayTypeAssignmentsInFrameRelStructure value) {
        this.dayTypeAssignments = value;
    }

}
