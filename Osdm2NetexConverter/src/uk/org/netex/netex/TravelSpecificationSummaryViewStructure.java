//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Summary of key aspects of TRAVEL SPECIFICATION. +V1.1. This data should all be derivable from the detailed specification. v+1.1
 * 
 * <p>Java-Klasse f�r TravelSpecificationSummaryViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TravelSpecificationSummaryViewStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Origin" type="{http://www.netex.org.uk/netex}TravelSpecificationSummaryEndpointStructure" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.netex.org.uk/netex}TravelSpecificationSummaryEndpointStructure" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TravelSpecificationSummaryJourneyGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TravelSpecificationSummaryFareGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TravelSpecificationSummarySeatingGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TravelSpecificationSummaryAlternateModesGroup"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ConditionSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelSpecificationSummaryViewStructure", propOrder = {
    "origin",
    "destination",
    "start",
    "end",
    "duration",
    "journeys",
    "seriesConstraints",
    "transportOrganisationRef",
    "groupOfOperatorsRef",
    "typeOfProductCategoryRef",
    "typeOfFareProductRef",
    "fareClass",
    "classOfUseRef",
    "userProfileRef",
    "groupTicketRef",
    "maximumNumberOfUsers",
    "trainElementRef",
    "trainElementTypeRef",
    "trainComponentLabelAssignmentRef",
    "deckRef",
    "deckSpaceRef",
    "locatableSpotRef",
    "label",
    "description",
    "facilitySetRef",
    "passengerSeatRef",
    "serviceFacilitySet",
    "seatEquipments",
    "mobilityServiceRef",
    "conditionSummary"
})
public class TravelSpecificationSummaryViewStructure {

    @XmlElement(name = "Origin")
    protected TravelSpecificationSummaryEndpointStructure origin;
    @XmlElement(name = "Destination")
    protected TravelSpecificationSummaryEndpointStructure destination;
    @XmlElement(name = "Start")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    @XmlElement(name = "End")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    @XmlElement(name = "Duration")
    protected Duration duration;
    protected TravelSpecificationJourneyRefsRelStructure journeys;
    protected SeriesConstraintRefsRelStructure seriesConstraints;
    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportOrganisationRefStructure> transportOrganisationRef;
    @XmlElement(name = "GroupOfOperatorsRef")
    protected GroupOfOperatorsRefStructure groupOfOperatorsRef;
    @XmlElement(name = "TypeOfProductCategoryRef")
    protected TypeOfProductCategoryRefStructure typeOfProductCategoryRef;
    @XmlElement(name = "TypeOfFareProductRef")
    protected TypeOfFareProductRefStructure typeOfFareProductRef;
    @XmlElement(name = "FareClass", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassEnumeration fareClass;
    @XmlElement(name = "ClassOfUseRef")
    protected ClassOfUseRef classOfUseRef;
    @XmlElementRef(name = "UserProfileRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends UserProfileRefStructure> userProfileRef;
    @XmlElement(name = "GroupTicketRef")
    protected GroupTicketRefStructure groupTicketRef;
    @XmlElement(name = "MaximumNumberOfUsers")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfUsers;
    @XmlElement(name = "TrainElementRef")
    protected TrainElementTypeRefStructure trainElementRef;
    @XmlElementRef(name = "TrainElementTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TrainElementTypeRefStructure> trainElementTypeRef;
    @XmlElement(name = "TrainComponentLabelAssignmentRef")
    protected TrainComponentLabelAssignmentRefStructure trainComponentLabelAssignmentRef;
    @XmlElement(name = "DeckRef")
    protected DeckRefStructure deckRef;
    @XmlElementRef(name = "DeckSpaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends DeckSpaceRefStructure> deckSpaceRef;
    @XmlElementRef(name = "LocatableSpotRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LocatableSpotRefStructure> locatableSpotRef;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElementRef(name = "FacilitySetRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FacilitySetRefStructure> facilitySetRef;
    @XmlElement(name = "PassengerSeatRef")
    protected PassengerSeatRefStructure passengerSeatRef;
    @XmlElement(name = "ServiceFacilitySet")
    protected ServiceFacilitySet serviceFacilitySet;
    protected EquipmentsRelStructure seatEquipments;
    @XmlElementRef(name = "MobilityServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends MobilityServiceRefStructure> mobilityServiceRef;
    @XmlElement(name = "ConditionSummary")
    protected ConditionSummaryStructure conditionSummary;

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TravelSpecificationSummaryEndpointStructure }
     *     
     */
    public TravelSpecificationSummaryEndpointStructure getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSpecificationSummaryEndpointStructure }
     *     
     */
    public void setOrigin(TravelSpecificationSummaryEndpointStructure value) {
        this.origin = value;
    }

    /**
     * Ruft den Wert der destination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TravelSpecificationSummaryEndpointStructure }
     *     
     */
    public TravelSpecificationSummaryEndpointStructure getDestination() {
        return destination;
    }

    /**
     * Legt den Wert der destination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSpecificationSummaryEndpointStructure }
     *     
     */
    public void setDestination(TravelSpecificationSummaryEndpointStructure value) {
        this.destination = value;
    }

    /**
     * Ruft den Wert der start-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Legt den Wert der start-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Ruft den Wert der end-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Legt den Wert der end-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der journeys-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TravelSpecificationJourneyRefsRelStructure }
     *     
     */
    public TravelSpecificationJourneyRefsRelStructure getJourneys() {
        return journeys;
    }

    /**
     * Legt den Wert der journeys-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSpecificationJourneyRefsRelStructure }
     *     
     */
    public void setJourneys(TravelSpecificationJourneyRefsRelStructure value) {
        this.journeys = value;
    }

    /**
     * Ruft den Wert der seriesConstraints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SeriesConstraintRefsRelStructure }
     *     
     */
    public SeriesConstraintRefsRelStructure getSeriesConstraints() {
        return seriesConstraints;
    }

    /**
     * Legt den Wert der seriesConstraints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesConstraintRefsRelStructure }
     *     
     */
    public void setSeriesConstraints(SeriesConstraintRefsRelStructure value) {
        this.seriesConstraints = value;
    }

    /**
     * TRANSPORT ORGANISATION for trip. +v1.2.2
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
     * Ruft den Wert der groupOfOperatorsRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfOperatorsRefStructure }
     *     
     */
    public GroupOfOperatorsRefStructure getGroupOfOperatorsRef() {
        return groupOfOperatorsRef;
    }

    /**
     * Legt den Wert der groupOfOperatorsRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfOperatorsRefStructure }
     *     
     */
    public void setGroupOfOperatorsRef(GroupOfOperatorsRefStructure value) {
        this.groupOfOperatorsRef = value;
    }

    /**
     * Ruft den Wert der typeOfProductCategoryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfProductCategoryRefStructure }
     *     
     */
    public TypeOfProductCategoryRefStructure getTypeOfProductCategoryRef() {
        return typeOfProductCategoryRef;
    }

    /**
     * Legt den Wert der typeOfProductCategoryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfProductCategoryRefStructure }
     *     
     */
    public void setTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        this.typeOfProductCategoryRef = value;
    }

    /**
     * Ruft den Wert der typeOfFareProductRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFareProductRefStructure }
     *     
     */
    public TypeOfFareProductRefStructure getTypeOfFareProductRef() {
        return typeOfFareProductRef;
    }

    /**
     * Legt den Wert der typeOfFareProductRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFareProductRefStructure }
     *     
     */
    public void setTypeOfFareProductRef(TypeOfFareProductRefStructure value) {
        this.typeOfFareProductRef = value;
    }

    /**
     * Ruft den Wert der fareClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareClassEnumeration }
     *     
     */
    public FareClassEnumeration getFareClass() {
        return fareClass;
    }

    /**
     * Legt den Wert der fareClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassEnumeration }
     *     
     */
    public void setFareClass(FareClassEnumeration value) {
        this.fareClass = value;
    }

    /**
     * Ruft den Wert der classOfUseRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfUseRef }
     *     
     */
    public ClassOfUseRef getClassOfUseRef() {
        return classOfUseRef;
    }

    /**
     * Legt den Wert der classOfUseRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfUseRef }
     *     
     */
    public void setClassOfUseRef(ClassOfUseRef value) {
        this.classOfUseRef = value;
    }

    /**
     * Ruft den Wert der userProfileRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolerProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends UserProfileRefStructure> getUserProfileRef() {
        return userProfileRef;
    }

    /**
     * Legt den Wert der userProfileRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolerProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     
     */
    public void setUserProfileRef(JAXBElement<? extends UserProfileRefStructure> value) {
        this.userProfileRef = value;
    }

    /**
     * Ruft den Wert der groupTicketRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupTicketRefStructure }
     *     
     */
    public GroupTicketRefStructure getGroupTicketRef() {
        return groupTicketRef;
    }

    /**
     * Legt den Wert der groupTicketRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupTicketRefStructure }
     *     
     */
    public void setGroupTicketRef(GroupTicketRefStructure value) {
        this.groupTicketRef = value;
    }

    /**
     * Ruft den Wert der maximumNumberOfUsers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfUsers() {
        return maximumNumberOfUsers;
    }

    /**
     * Legt den Wert der maximumNumberOfUsers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfUsers(BigInteger value) {
        this.maximumNumberOfUsers = value;
    }

    /**
     * Ruft den Wert der trainElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainElementTypeRefStructure }
     *     
     */
    public TrainElementTypeRefStructure getTrainElementRef() {
        return trainElementRef;
    }

    /**
     * Legt den Wert der trainElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElementTypeRefStructure }
     *     
     */
    public void setTrainElementRef(TrainElementTypeRefStructure value) {
        this.trainElementRef = value;
    }

    /**
     * Ruft den Wert der trainElementTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TractiveElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingElementTypeRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TrainElementTypeRefStructure> getTrainElementTypeRef() {
        return trainElementTypeRef;
    }

    /**
     * Legt den Wert der trainElementTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TractiveElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingElementTypeRefStructure }{@code >}
     *     
     */
    public void setTrainElementTypeRef(JAXBElement<? extends TrainElementTypeRefStructure> value) {
        this.trainElementTypeRef = value;
    }

    /**
     * Ruft den Wert der trainComponentLabelAssignmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainComponentLabelAssignmentRefStructure }
     *     
     */
    public TrainComponentLabelAssignmentRefStructure getTrainComponentLabelAssignmentRef() {
        return trainComponentLabelAssignmentRef;
    }

    /**
     * Legt den Wert der trainComponentLabelAssignmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainComponentLabelAssignmentRefStructure }
     *     
     */
    public void setTrainComponentLabelAssignmentRef(TrainComponentLabelAssignmentRefStructure value) {
        this.trainComponentLabelAssignmentRef = value;
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
     * Ruft den Wert der passengerSeatRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerSeatRefStructure }
     *     
     */
    public PassengerSeatRefStructure getPassengerSeatRef() {
        return passengerSeatRef;
    }

    /**
     * Legt den Wert der passengerSeatRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerSeatRefStructure }
     *     
     */
    public void setPassengerSeatRef(PassengerSeatRefStructure value) {
        this.passengerSeatRef = value;
    }

    /**
     * Ruft den Wert der serviceFacilitySet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFacilitySet }
     *     
     */
    public ServiceFacilitySet getServiceFacilitySet() {
        return serviceFacilitySet;
    }

    /**
     * Legt den Wert der serviceFacilitySet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFacilitySet }
     *     
     */
    public void setServiceFacilitySet(ServiceFacilitySet value) {
        this.serviceFacilitySet = value;
    }

    /**
     * Ruft den Wert der seatEquipments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentsRelStructure }
     *     
     */
    public EquipmentsRelStructure getSeatEquipments() {
        return seatEquipments;
    }

    /**
     * Legt den Wert der seatEquipments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentsRelStructure }
     *     
     */
    public void setSeatEquipments(EquipmentsRelStructure value) {
        this.seatEquipments = value;
    }

    /**
     * Ruft den Wert der mobilityServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MobilityServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends MobilityServiceRefStructure> getMobilityServiceRef() {
        return mobilityServiceRef;
    }

    /**
     * Legt den Wert der mobilityServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MobilityServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     
     */
    public void setMobilityServiceRef(JAXBElement<? extends MobilityServiceRefStructure> value) {
        this.mobilityServiceRef = value;
    }

    /**
     * Ruft den Wert der conditionSummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConditionSummaryStructure }
     *     
     */
    public ConditionSummaryStructure getConditionSummary() {
        return conditionSummary;
    }

    /**
     * Legt den Wert der conditionSummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionSummaryStructure }
     *     
     */
    public void setConditionSummary(ConditionSummaryStructure value) {
        this.conditionSummary = value;
    }

}
