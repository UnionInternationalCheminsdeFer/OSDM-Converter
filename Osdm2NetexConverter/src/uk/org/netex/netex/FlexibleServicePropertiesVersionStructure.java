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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for FLEXIBLE SERVICE PROPERTies.
 * 
 * <p>Java-Klasse f�r FlexibleServiceProperties_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlexibleServiceProperties_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FlexibleServicePropertiesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleServiceProperties_VersionStructure", propOrder = {
    "journeyRef",
    "typeOfFlexibleServiceRef",
    "flexibleServiceType",
    "cancellationPossible",
    "changeOfTimePossible",
    "bookingArrangements",
    "bookingContact",
    "bookingMethods",
    "bookingAccess",
    "bookWhen",
    "buyWhen",
    "latestBookingTime",
    "minimumBookingPeriod",
    "maximumBookingPeriod",
    "bookingUrl",
    "bookingNote"
})
@XmlSeeAlso({
    FlexibleServiceProperties.class
})
public class FlexibleServicePropertiesVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElementRef(name = "JourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyRefStructure> journeyRef;
    @XmlElement(name = "TypeOfFlexibleServiceRef")
    protected TypeOfFlexibleServiceRefStructure typeOfFlexibleServiceRef;
    @XmlElement(name = "FlexibleServiceType")
    @XmlSchemaType(name = "string")
    protected FlexibleServiceEnumeration flexibleServiceType;
    @XmlElement(name = "CancellationPossible")
    protected Boolean cancellationPossible;
    @XmlElement(name = "ChangeOfTimePossible")
    protected Boolean changeOfTimePossible;
    protected BookingArrangementsRelStructure bookingArrangements;
    @XmlElement(name = "BookingContact")
    protected ContactStructure bookingContact;
    @XmlList
    @XmlElement(name = "BookingMethods")
    protected List<BookingMethodEnumeration> bookingMethods;
    @XmlElement(name = "BookingAccess")
    @XmlSchemaType(name = "string")
    protected BookingAccessEnumeration bookingAccess;
    @XmlElement(name = "BookWhen")
    @XmlSchemaType(name = "normalizedString")
    protected PurchaseWhenEnumeration bookWhen;
    @XmlList
    @XmlElement(name = "BuyWhen")
    protected List<PurchaseMomentEnumeration> buyWhen;
    @XmlElement(name = "LatestBookingTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar latestBookingTime;
    @XmlElement(name = "MinimumBookingPeriod")
    protected Duration minimumBookingPeriod;
    @XmlElement(name = "MaximumBookingPeriod")
    protected Duration maximumBookingPeriod;
    @XmlElement(name = "BookingUrl")
    protected InfoLinkStructure bookingUrl;
    @XmlElement(name = "BookingNote")
    protected MultilingualString bookingNote;

    /**
     * Ruft den Wert der journeyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends JourneyRefStructure> getJourneyRef() {
        return journeyRef;
    }

    /**
     * Legt den Wert der journeyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public void setJourneyRef(JAXBElement<? extends JourneyRefStructure> value) {
        this.journeyRef = value;
    }

    /**
     * Ruft den Wert der typeOfFlexibleServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFlexibleServiceRefStructure }
     *     
     */
    public TypeOfFlexibleServiceRefStructure getTypeOfFlexibleServiceRef() {
        return typeOfFlexibleServiceRef;
    }

    /**
     * Legt den Wert der typeOfFlexibleServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFlexibleServiceRefStructure }
     *     
     */
    public void setTypeOfFlexibleServiceRef(TypeOfFlexibleServiceRefStructure value) {
        this.typeOfFlexibleServiceRef = value;
    }

    /**
     * Ruft den Wert der flexibleServiceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleServiceEnumeration }
     *     
     */
    public FlexibleServiceEnumeration getFlexibleServiceType() {
        return flexibleServiceType;
    }

    /**
     * Legt den Wert der flexibleServiceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleServiceEnumeration }
     *     
     */
    public void setFlexibleServiceType(FlexibleServiceEnumeration value) {
        this.flexibleServiceType = value;
    }

    /**
     * Ruft den Wert der cancellationPossible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancellationPossible() {
        return cancellationPossible;
    }

    /**
     * Legt den Wert der cancellationPossible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancellationPossible(Boolean value) {
        this.cancellationPossible = value;
    }

    /**
     * Ruft den Wert der changeOfTimePossible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeOfTimePossible() {
        return changeOfTimePossible;
    }

    /**
     * Legt den Wert der changeOfTimePossible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeOfTimePossible(Boolean value) {
        this.changeOfTimePossible = value;
    }

    /**
     * Ruft den Wert der bookingArrangements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BookingArrangementsRelStructure }
     *     
     */
    public BookingArrangementsRelStructure getBookingArrangements() {
        return bookingArrangements;
    }

    /**
     * Legt den Wert der bookingArrangements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingArrangementsRelStructure }
     *     
     */
    public void setBookingArrangements(BookingArrangementsRelStructure value) {
        this.bookingArrangements = value;
    }

    /**
     * Ruft den Wert der bookingContact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactStructure }
     *     
     */
    public ContactStructure getBookingContact() {
        return bookingContact;
    }

    /**
     * Legt den Wert der bookingContact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactStructure }
     *     
     */
    public void setBookingContact(ContactStructure value) {
        this.bookingContact = value;
    }

    /**
     * Gets the value of the bookingMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingMethodEnumeration }
     * 
     * 
     */
    public List<BookingMethodEnumeration> getBookingMethods() {
        if (bookingMethods == null) {
            bookingMethods = new ArrayList<BookingMethodEnumeration>();
        }
        return this.bookingMethods;
    }

    /**
     * Ruft den Wert der bookingAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BookingAccessEnumeration }
     *     
     */
    public BookingAccessEnumeration getBookingAccess() {
        return bookingAccess;
    }

    /**
     * Legt den Wert der bookingAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingAccessEnumeration }
     *     
     */
    public void setBookingAccess(BookingAccessEnumeration value) {
        this.bookingAccess = value;
    }

    /**
     * Ruft den Wert der bookWhen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseWhenEnumeration }
     *     
     */
    public PurchaseWhenEnumeration getBookWhen() {
        return bookWhen;
    }

    /**
     * Legt den Wert der bookWhen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseWhenEnumeration }
     *     
     */
    public void setBookWhen(PurchaseWhenEnumeration value) {
        this.bookWhen = value;
    }

    /**
     * Gets the value of the buyWhen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyWhen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyWhen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseMomentEnumeration }
     * 
     * 
     */
    public List<PurchaseMomentEnumeration> getBuyWhen() {
        if (buyWhen == null) {
            buyWhen = new ArrayList<PurchaseMomentEnumeration>();
        }
        return this.buyWhen;
    }

    /**
     * Ruft den Wert der latestBookingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestBookingTime() {
        return latestBookingTime;
    }

    /**
     * Legt den Wert der latestBookingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestBookingTime(XMLGregorianCalendar value) {
        this.latestBookingTime = value;
    }

    /**
     * Ruft den Wert der minimumBookingPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumBookingPeriod() {
        return minimumBookingPeriod;
    }

    /**
     * Legt den Wert der minimumBookingPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumBookingPeriod(Duration value) {
        this.minimumBookingPeriod = value;
    }

    /**
     * Ruft den Wert der maximumBookingPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumBookingPeriod() {
        return maximumBookingPeriod;
    }

    /**
     * Legt den Wert der maximumBookingPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumBookingPeriod(Duration value) {
        this.maximumBookingPeriod = value;
    }

    /**
     * Ruft den Wert der bookingUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InfoLinkStructure }
     *     
     */
    public InfoLinkStructure getBookingUrl() {
        return bookingUrl;
    }

    /**
     * Legt den Wert der bookingUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoLinkStructure }
     *     
     */
    public void setBookingUrl(InfoLinkStructure value) {
        this.bookingUrl = value;
    }

    /**
     * Ruft den Wert der bookingNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getBookingNote() {
        return bookingNote;
    }

    /**
     * Legt den Wert der bookingNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setBookingNote(MultilingualString value) {
        this.bookingNote = value;
    }

}
