//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
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
 * Type for SPECIAL SERVICE.
 * 
 * <p>Java-Klasse f�r SpecialService_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SpecialService_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Journey_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SpecialServiceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialService_VersionStructure", propOrder = {
    "departureTime",
    "departureDayOffset",
    "frequency",
    "journeyDuration",
    "client",
    "dayTypes",
    "journeyPatternRef",
    "vehicleTypeRef",
    "origin",
    "destination",
    "print",
    "dynamic",
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
    SpecialService.class,
    DatedSpecialServiceVersionStructure.class
})
public class SpecialServiceVersionStructure
    extends JourneyVersionStructure
{

    @XmlElement(name = "DepartureTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departureTime;
    @XmlElement(name = "DepartureDayOffset")
    protected BigInteger departureDayOffset;
    @XmlElement(name = "Frequency")
    protected FrequencyStructure frequency;
    @XmlElement(name = "JourneyDuration")
    protected Duration journeyDuration;
    @XmlElement(name = "Client")
    protected MultilingualString client;
    protected DayTypeRefsRelStructure dayTypes;
    @XmlElementRef(name = "JourneyPatternRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyPatternRefStructure> journeyPatternRef;
    @XmlElementRef(name = "VehicleTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleTypeRefStructure> vehicleTypeRef;
    @XmlElement(name = "Origin")
    protected JourneyEndpointStructure origin;
    @XmlElement(name = "Destination")
    protected JourneyEndpointStructure destination;
    @XmlElement(name = "Print", defaultValue = "true")
    protected Boolean print;
    @XmlElement(name = "Dynamic", defaultValue = "always")
    @XmlSchemaType(name = "NMTOKEN")
    protected DynamicAdvertisementEnumeration dynamic;
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
     * Ruft den Wert der departureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Legt den Wert der departureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * Ruft den Wert der departureDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepartureDayOffset() {
        return departureDayOffset;
    }

    /**
     * Legt den Wert der departureDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepartureDayOffset(BigInteger value) {
        this.departureDayOffset = value;
    }

    /**
     * Ruft den Wert der frequency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyStructure }
     *     
     */
    public FrequencyStructure getFrequency() {
        return frequency;
    }

    /**
     * Legt den Wert der frequency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyStructure }
     *     
     */
    public void setFrequency(FrequencyStructure value) {
        this.frequency = value;
    }

    /**
     * Ruft den Wert der journeyDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getJourneyDuration() {
        return journeyDuration;
    }

    /**
     * Legt den Wert der journeyDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setJourneyDuration(Duration value) {
        this.journeyDuration = value;
    }

    /**
     * Ruft den Wert der client-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getClient() {
        return client;
    }

    /**
     * Legt den Wert der client-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setClient(MultilingualString value) {
        this.client = value;
    }

    /**
     * Ruft den Wert der dayTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayTypeRefsRelStructure }
     *     
     */
    public DayTypeRefsRelStructure getDayTypes() {
        return dayTypes;
    }

    /**
     * Legt den Wert der dayTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTypeRefsRelStructure }
     *     
     */
    public void setDayTypes(DayTypeRefsRelStructure value) {
        this.dayTypes = value;
    }

    /**
     * Reference to a JOURNEY PATTERN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicePatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends JourneyPatternRefStructure> getJourneyPatternRef() {
        return journeyPatternRef;
    }

    /**
     * Legt den Wert der journeyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicePatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     *     
     */
    public void setJourneyPatternRef(JAXBElement<? extends JourneyPatternRefStructure> value) {
        this.journeyPatternRef = value;
    }

    /**
     * Ruft den Wert der vehicleTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleTypeRefStructure> getVehicleTypeRef() {
        return vehicleTypeRef;
    }

    /**
     * Legt den Wert der vehicleTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     
     */
    public void setVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        this.vehicleTypeRef = value;
    }

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyEndpointStructure }
     *     
     */
    public JourneyEndpointStructure getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyEndpointStructure }
     *     
     */
    public void setOrigin(JourneyEndpointStructure value) {
        this.origin = value;
    }

    /**
     * Ruft den Wert der destination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyEndpointStructure }
     *     
     */
    public JourneyEndpointStructure getDestination() {
        return destination;
    }

    /**
     * Legt den Wert der destination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyEndpointStructure }
     *     
     */
    public void setDestination(JourneyEndpointStructure value) {
        this.destination = value;
    }

    /**
     * Ruft den Wert der print-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrint() {
        return print;
    }

    /**
     * Legt den Wert der print-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrint(Boolean value) {
        this.print = value;
    }

    /**
     * Ruft den Wert der dynamic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DynamicAdvertisementEnumeration }
     *     
     */
    public DynamicAdvertisementEnumeration getDynamic() {
        return dynamic;
    }

    /**
     * Legt den Wert der dynamic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicAdvertisementEnumeration }
     *     
     */
    public void setDynamic(DynamicAdvertisementEnumeration value) {
        this.dynamic = value;
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
