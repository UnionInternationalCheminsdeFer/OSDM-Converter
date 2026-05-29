//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a DAY TYPE ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r DayTypeAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DayTypeAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DayTypeAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayTypeAssignment_VersionStructure", propOrder = {
    "serviceCalendarRef",
    "operatingPeriodRef",
    "operatingDayRef",
    "date",
    "dayTypeRef",
    "timebandRef",
    "isAvailable"
})
@XmlSeeAlso({
    DayTypeAssignment.class
})
public class DayTypeAssignmentVersionStructure
    extends AssignmentVersionStructure
{

    @XmlElement(name = "ServiceCalendarRef")
    protected ServiceCalendarRefStructure serviceCalendarRef;
    @XmlElementRef(name = "OperatingPeriodRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<OperatingPeriodRefStructure> operatingPeriodRef;
    @XmlElement(name = "OperatingDayRef")
    protected OperatingDayRefStructure operatingDayRef;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElementRef(name = "DayTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends DayTypeRefStructure> dayTypeRef;
    @XmlElement(name = "TimebandRef")
    protected List<TimebandRefStructure> timebandRef;
    @XmlElement(defaultValue = "true")
    protected Boolean isAvailable;

    /**
     * Reference to parent Calendar. If given by context does not need to be given.
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
     * Ruft den Wert der operatingPeriodRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperatingPeriodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatingPeriodRefStructure }{@code >}
     *     
     */
    public JAXBElement<OperatingPeriodRefStructure> getOperatingPeriodRef() {
        return operatingPeriodRef;
    }

    /**
     * Legt den Wert der operatingPeriodRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperatingPeriodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatingPeriodRefStructure }{@code >}
     *     
     */
    public void setOperatingPeriodRef(JAXBElement<OperatingPeriodRefStructure> value) {
        this.operatingPeriodRef = value;
    }

    /**
     * Ruft den Wert der operatingDayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public OperatingDayRefStructure getOperatingDayRef() {
        return operatingDayRef;
    }

    /**
     * Legt den Wert der operatingDayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public void setOperatingDayRef(OperatingDayRefStructure value) {
        this.operatingDayRef = value;
    }

    /**
     * Ruft den Wert der date-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Ruft den Wert der dayTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareDayTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DayTypeRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends DayTypeRefStructure> getDayTypeRef() {
        return dayTypeRef;
    }

    /**
     * Legt den Wert der dayTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareDayTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DayTypeRefStructure }{@code >}
     *     
     */
    public void setDayTypeRef(JAXBElement<? extends DayTypeRefStructure> value) {
        this.dayTypeRef = value;
    }

    /**
     * Gets the value of the timebandRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timebandRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimebandRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimebandRefStructure }
     * 
     * 
     */
    public List<TimebandRefStructure> getTimebandRef() {
        if (timebandRef == null) {
            timebandRef = new ArrayList<TimebandRefStructure>();
        }
        return this.timebandRef;
    }

    /**
     * Ruft den Wert der isAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * Legt den Wert der isAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvailable(Boolean value) {
        this.isAvailable = value;
    }

}
