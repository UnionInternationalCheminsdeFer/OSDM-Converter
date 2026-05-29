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
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for FLEXIBLE LINE.
 * 
 * <p>Java-Klasse f�r FlexibleLine_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlexibleLine_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Line_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FlexibleLineGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleLine_VersionStructure", propOrder = {
    "flexibleLineType",
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
    FlexibleLine.class
})
public class FlexibleLineVersionStructure
    extends LineVersionStructure
{

    @XmlElement(name = "FlexibleLineType")
    @XmlSchemaType(name = "string")
    protected FlexibleLineTypeEnumeration flexibleLineType;
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
     * Ruft den Wert der flexibleLineType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleLineTypeEnumeration }
     *     
     */
    public FlexibleLineTypeEnumeration getFlexibleLineType() {
        return flexibleLineType;
    }

    /**
     * Legt den Wert der flexibleLineType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleLineTypeEnumeration }
     *     
     */
    public void setFlexibleLineType(FlexibleLineTypeEnumeration value) {
        this.flexibleLineType = value;
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
