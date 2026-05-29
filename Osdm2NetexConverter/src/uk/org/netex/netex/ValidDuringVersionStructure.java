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
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for a SIMPLE TIMEBAND AVAILABILITY CONDITION.
 * 
 * <p>Java-Klasse f�r ValidDuring_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ValidDuring_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ValidBetween_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ValidDuringGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidDuring_VersionStructure", propOrder = {
    "dayTypeRef",
    "daysOfWeek",
    "days",
    "timebands"
})
@XmlSeeAlso({
    ValidDuring.class,
    SimpleAvailabilityCondition.class
})
public class ValidDuringVersionStructure
    extends ValidBetweenVersionStructure
{

    @XmlElementRef(name = "DayTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends DayTypeRefStructure> dayTypeRef;
    @XmlList
    @XmlElement(name = "DaysOfWeek")
    protected List<DayOfWeekEnumeration> daysOfWeek;
    @XmlElement(name = "Days")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String days;
    protected TimebandsRelStructure timebands;

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
     * Ruft den Wert der days-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDays() {
        return days;
    }

    /**
     * Legt den Wert der days-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDays(String value) {
        this.days = value;
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

}
