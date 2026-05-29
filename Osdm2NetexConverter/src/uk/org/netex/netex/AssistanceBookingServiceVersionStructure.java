//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for ASSISTANCE BOOKING SERVICE.
 * 
 * <p>Java-Klasse f�r AssistanceBookingService_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssistanceBookingService_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LocalService_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}AssistanceBookingServiceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssistanceBookingService_VersionStructure", propOrder = {
    "assistanceAvailability",
    "wheelchairBookingRequired",
    "bookingContact",
    "bookingArrangements",
    "vehicleMode",
    "modeOfOperationRef",
    "transportOrganisationRef",
    "lineRef",
    "bookedObjectRef",
    "noticeAssignments"
})
@XmlSeeAlso({
    AssistanceBookingService.class
})
public class AssistanceBookingServiceVersionStructure
    extends LocalServiceVersionStructure
{

    @XmlElement(name = "AssistanceAvailability", defaultValue = "available")
    @XmlSchemaType(name = "string")
    protected AssistanceAvailabilityEnumeration assistanceAvailability;
    @XmlElement(name = "WheelchairBookingRequired")
    protected Boolean wheelchairBookingRequired;
    @XmlElement(name = "BookingContact")
    protected ContactStructure bookingContact;
    protected BookingArrangementsRelStructure bookingArrangements;
    @XmlElement(name = "VehicleMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration vehicleMode;
    @XmlElementRef(name = "ModeOfOperationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ModeOfOperationRefStructure> modeOfOperationRef;
    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportOrganisationRefStructure> transportOrganisationRef;
    @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LineRefStructure> lineRef;
    @XmlElement(name = "BookedObjectRef")
    protected VersionOfObjectRefStructure bookedObjectRef;
    protected NoticeAssignmentsRelStructure noticeAssignments;

    /**
     * Ruft den Wert der assistanceAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssistanceAvailabilityEnumeration }
     *     
     */
    public AssistanceAvailabilityEnumeration getAssistanceAvailability() {
        return assistanceAvailability;
    }

    /**
     * Legt den Wert der assistanceAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistanceAvailabilityEnumeration }
     *     
     */
    public void setAssistanceAvailability(AssistanceAvailabilityEnumeration value) {
        this.assistanceAvailability = value;
    }

    /**
     * Ruft den Wert der wheelchairBookingRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWheelchairBookingRequired() {
        return wheelchairBookingRequired;
    }

    /**
     * Legt den Wert der wheelchairBookingRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWheelchairBookingRequired(Boolean value) {
        this.wheelchairBookingRequired = value;
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
     * Ruft den Wert der vehicleMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getVehicleMode() {
        return vehicleMode;
    }

    /**
     * Legt den Wert der vehicleMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setVehicleMode(AllPublicTransportModesEnumeration value) {
        this.vehicleMode = value;
    }

    /**
     * Ruft den Wert der modeOfOperationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConventionalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledModeOfOperationRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ModeOfOperationRefStructure> getModeOfOperationRef() {
        return modeOfOperationRef;
    }

    /**
     * Legt den Wert der modeOfOperationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConventionalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledModeOfOperationRefStructure }{@code >}
     *     
     */
    public void setModeOfOperationRef(JAXBElement<? extends ModeOfOperationRefStructure> value) {
        this.modeOfOperationRef = value;
    }

    /**
     * Ruft den Wert der transportOrganisationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportOrganisationRefStructure> getTransportOrganisationRef() {
        return transportOrganisationRef;
    }

    /**
     * Legt den Wert der transportOrganisationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public void setTransportOrganisationRef(JAXBElement<? extends TransportOrganisationRefStructure> value) {
        this.transportOrganisationRef = value;
    }

    /**
     * Ruft den Wert der lineRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LineRefStructure> getLineRef() {
        return lineRef;
    }

    /**
     * Legt den Wert der lineRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     
     */
    public void setLineRef(JAXBElement<? extends LineRefStructure> value) {
        this.lineRef = value;
    }

    /**
     * Ruft den Wert der bookedObjectRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public VersionOfObjectRefStructure getBookedObjectRef() {
        return bookedObjectRef;
    }

    /**
     * Legt den Wert der bookedObjectRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public void setBookedObjectRef(VersionOfObjectRefStructure value) {
        this.bookedObjectRef = value;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public NoticeAssignmentsRelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignmentsRelStructure value) {
        this.noticeAssignments = value;
    }

}
