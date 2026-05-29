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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for PASSENGER SPOT ALLOCATION.
 * 
 * <p>Java-Klasse f�r PassengerSpotAllocation_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerSpotAllocation_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerSpotAllocationGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerSpotAllocation_VersionedChildStructure", propOrder = {
    "lastUpdated",
    "deckRef",
    "deckSpaceRef",
    "locatableSpotRef",
    "label",
    "description",
    "facilitySetRef",
    "primaryOrientation",
    "startStopPointRef",
    "endStopPointRef",
    "customerRef",
    "spotAvailabilityStatus",
    "seatAllocationMethod"
})
@XmlSeeAlso({
    PassengerSpotAllocation.class
})
public class PassengerSpotAllocationVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "LastUpdated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;
    @XmlElement(name = "DeckRef")
    protected DeckRefStructure deckRef;
    @XmlElementRef(name = "DeckSpaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends DeckSpaceRefStructure> deckSpaceRef;
    @XmlElementRef(name = "LocatableSpotRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends LocatableSpotRefStructure> locatableSpotRef;
    @XmlElement(name = "Label", required = true)
    protected MultilingualString label;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElementRef(name = "FacilitySetRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FacilitySetRefStructure> facilitySetRef;
    @XmlElement(name = "PrimaryOrientation")
    @XmlSchemaType(name = "normalizedString")
    protected ComponentOrientationEnumeration primaryOrientation;
    @XmlElement(name = "StartStopPointRef")
    protected ScheduledStopPointRefStructure startStopPointRef;
    @XmlElement(name = "EndStopPointRef")
    protected ScheduledStopPointRefStructure endStopPointRef;
    @XmlElement(name = "CustomerRef")
    protected CustomerRefStructure customerRef;
    @XmlElement(name = "SpotAvailabilityStatus", defaultValue = "free")
    @XmlSchemaType(name = "normalizedString")
    protected SpotAvailabilityStatusEnumeration spotAvailabilityStatus;
    @XmlElement(name = "SeatAllocationMethod", defaultValue = "autoAssigned")
    @XmlSchemaType(name = "normalizedString")
    protected SeatAllocationMethodEnumeration seatAllocationMethod;

    /**
     * Ruft den Wert der lastUpdated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Legt den Wert der lastUpdated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

    /**
     * Ruft den Wert der deckRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckRefStructure }
     *     
     */
    public DeckRefStructure getDeckRef() {
        return deckRef;
    }

    /**
     * Legt den Wert der deckRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckRefStructure }
     *     
     */
    public void setDeckRef(DeckRefStructure value) {
        this.deckRef = value;
    }

    /**
     * Ruft den Wert der deckSpaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OtherDeckSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpaceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends DeckSpaceRefStructure> getDeckSpaceRef() {
        return deckSpaceRef;
    }

    /**
     * Legt den Wert der deckSpaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OtherDeckSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpaceRefStructure }{@code >}
     *     
     */
    public void setDeckSpaceRef(JAXBElement<? extends DeckSpaceRefStructure> value) {
        this.deckSpaceRef = value;
    }

    /**
     * Ruft den Wert der locatableSpotRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PassengerVehicleSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocatableSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageSpotRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LocatableSpotRefStructure> getLocatableSpotRef() {
        return locatableSpotRef;
    }

    /**
     * Legt den Wert der locatableSpotRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PassengerVehicleSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocatableSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageSpotRefStructure }{@code >}
     *     
     */
    public void setLocatableSpotRef(JAXBElement<? extends LocatableSpotRefStructure> value) {
        this.locatableSpotRef = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
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
     * Ruft den Wert der facilitySetRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SiteFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RestrictedServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilitySetRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends FacilitySetRefStructure> getFacilitySetRef() {
        return facilitySetRef;
    }

    /**
     * Legt den Wert der facilitySetRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SiteFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RestrictedServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilitySetRefStructure }{@code >}
     *     
     */
    public void setFacilitySetRef(JAXBElement<? extends FacilitySetRefStructure> value) {
        this.facilitySetRef = value;
    }

    /**
     * Ruft den Wert der primaryOrientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ComponentOrientationEnumeration }
     *     
     */
    public ComponentOrientationEnumeration getPrimaryOrientation() {
        return primaryOrientation;
    }

    /**
     * Legt den Wert der primaryOrientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentOrientationEnumeration }
     *     
     */
    public void setPrimaryOrientation(ComponentOrientationEnumeration value) {
        this.primaryOrientation = value;
    }

    /**
     * Ruft den Wert der startStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getStartStopPointRef() {
        return startStopPointRef;
    }

    /**
     * Legt den Wert der startStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setStartStopPointRef(ScheduledStopPointRefStructure value) {
        this.startStopPointRef = value;
    }

    /**
     * Ruft den Wert der endStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getEndStopPointRef() {
        return endStopPointRef;
    }

    /**
     * Legt den Wert der endStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setEndStopPointRef(ScheduledStopPointRefStructure value) {
        this.endStopPointRef = value;
    }

    /**
     * Ruft den Wert der customerRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRefStructure }
     *     
     */
    public CustomerRefStructure getCustomerRef() {
        return customerRef;
    }

    /**
     * Legt den Wert der customerRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRefStructure }
     *     
     */
    public void setCustomerRef(CustomerRefStructure value) {
        this.customerRef = value;
    }

    /**
     * Ruft den Wert der spotAvailabilityStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpotAvailabilityStatusEnumeration }
     *     
     */
    public SpotAvailabilityStatusEnumeration getSpotAvailabilityStatus() {
        return spotAvailabilityStatus;
    }

    /**
     * Legt den Wert der spotAvailabilityStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotAvailabilityStatusEnumeration }
     *     
     */
    public void setSpotAvailabilityStatus(SpotAvailabilityStatusEnumeration value) {
        this.spotAvailabilityStatus = value;
    }

    /**
     * Ruft den Wert der seatAllocationMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SeatAllocationMethodEnumeration }
     *     
     */
    public SeatAllocationMethodEnumeration getSeatAllocationMethod() {
        return seatAllocationMethod;
    }

    /**
     * Legt den Wert der seatAllocationMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAllocationMethodEnumeration }
     *     
     */
    public void setSeatAllocationMethod(SeatAllocationMethodEnumeration value) {
        this.seatAllocationMethod = value;
    }

}
