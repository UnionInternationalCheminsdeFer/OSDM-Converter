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
 * Type for TARIFF.
 * 
 * <p>Java-Klasse f�r Tariff_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Tariff_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TariffGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tariff_VersionStructure", propOrder = {
    "name",
    "alternativeNames",
    "description",
    "noticeAssignments",
    "documentLinks",
    "privateCode",
    "organisationRefDummy",
    "groupOfOperatorsRef",
    "lineRef",
    "groupOfLinesRef",
    "mobilityServiceRef",
    "localServiceRef",
    "typeOfTariffRef",
    "tariffBasis",
    "returnFareTwiceSingle",
    "geographicalUnitRef",
    "geographicalIntervals",
    "geographicalStructureFactors",
    "timeUnitRef",
    "timeIntervals",
    "timeStructureFactors",
    "qualityStructureFactors",
    "fareStructureElements",
    "distanceMatrixElements",
    "groupsOfDistanceMatrixElements",
    "priceUnitRef",
    "priceGroups",
    "fareTables"
})
@XmlSeeAlso({
    Tariff.class
})
public class TariffVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    protected AlternativeNamesRelStructure alternativeNames;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    protected NoticeAssignmentsRelStructure noticeAssignments;
    protected InfoLinksRelStructure documentLinks;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElementRef(name = "OrganisationRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OrganisationRefStructure> organisationRefDummy;
    @XmlElement(name = "GroupOfOperatorsRef")
    protected GroupOfOperatorsRefStructure groupOfOperatorsRef;
    @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LineRefStructure> lineRef;
    @XmlElementRef(name = "GroupOfLinesRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends GroupOfLinesRefStructure> groupOfLinesRef;
    @XmlElementRef(name = "MobilityServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends MobilityServiceRefStructure> mobilityServiceRef;
    @XmlElementRef(name = "LocalServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LocalServiceRefStructure> localServiceRef;
    @XmlElement(name = "TypeOfTariffRef")
    protected TypeOfTariffRefStructure typeOfTariffRef;
    @XmlElement(name = "TariffBasis", defaultValue = "route")
    @XmlSchemaType(name = "normalizedString")
    protected TariffBasisEnumeration tariffBasis;
    @XmlElement(name = "ReturnFareTwiceSingle", defaultValue = "true")
    protected Boolean returnFareTwiceSingle;
    @XmlElement(name = "GeographicalUnitRef")
    protected GeographicalUnitRefStructure geographicalUnitRef;
    protected GeographicalIntervalsRelStructure geographicalIntervals;
    protected GeographicalStructureFactorsRelStructure geographicalStructureFactors;
    @XmlElement(name = "TimeUnitRef")
    protected TimeUnitRefStructure timeUnitRef;
    protected TimeIntervalsRelStructure timeIntervals;
    protected TimeStructureFactorsRelStructure timeStructureFactors;
    protected QualityStructureFactorsRelStructure qualityStructureFactors;
    protected FareStructureElementsRelStructure fareStructureElements;
    protected DistanceMatrixElementsRelStructure distanceMatrixElements;
    protected GroupsOfDistanceMatrixElementsRelStructure groupsOfDistanceMatrixElements;
    @XmlElement(name = "PriceUnitRef")
    protected PriceUnitRefStructure priceUnitRef;
    protected PriceGroupsRelStructure priceGroups;
    protected FareTablesRelStructure fareTables;

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
     * Ruft den Wert der alternativeNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public AlternativeNamesRelStructure getAlternativeNames() {
        return alternativeNames;
    }

    /**
     * Legt den Wert der alternativeNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public void setAlternativeNames(AlternativeNamesRelStructure value) {
        this.alternativeNames = value;
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

    /**
     * Ruft den Wert der documentLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InfoLinksRelStructure }
     *     
     */
    public InfoLinksRelStructure getDocumentLinks() {
        return documentLinks;
    }

    /**
     * Legt den Wert der documentLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoLinksRelStructure }
     *     
     */
    public void setDocumentLinks(InfoLinksRelStructure value) {
        this.documentLinks = value;
    }

    /**
     * DEPRECATED - use privateCodes. -v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der organisationRefDummy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends OrganisationRefStructure> getOrganisationRefDummy() {
        return organisationRefDummy;
    }

    /**
     * Legt den Wert der organisationRefDummy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     *     
     */
    public void setOrganisationRefDummy(JAXBElement<? extends OrganisationRefStructure> value) {
        this.organisationRefDummy = value;
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
     * Ruft den Wert der groupOfLinesRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfLinesRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends GroupOfLinesRefStructure> getGroupOfLinesRef() {
        return groupOfLinesRef;
    }

    /**
     * Legt den Wert der groupOfLinesRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfLinesRefStructure }{@code >}
     *     
     */
    public void setGroupOfLinesRef(JAXBElement<? extends GroupOfLinesRefStructure> value) {
        this.groupOfLinesRef = value;
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
     * Ruft den Wert der localServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeetingPointServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CateringServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LeftLuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HireServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplaintsServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceBookingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LostPropertyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MoneyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommunicationServiceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LocalServiceRefStructure> getLocalServiceRef() {
        return localServiceRef;
    }

    /**
     * Legt den Wert der localServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeetingPointServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CateringServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LeftLuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HireServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplaintsServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceBookingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LostPropertyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MoneyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommunicationServiceRefStructure }{@code >}
     *     
     */
    public void setLocalServiceRef(JAXBElement<? extends LocalServiceRefStructure> value) {
        this.localServiceRef = value;
    }

    /**
     * Ruft den Wert der typeOfTariffRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTariffRefStructure }
     *     
     */
    public TypeOfTariffRefStructure getTypeOfTariffRef() {
        return typeOfTariffRef;
    }

    /**
     * Legt den Wert der typeOfTariffRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTariffRefStructure }
     *     
     */
    public void setTypeOfTariffRef(TypeOfTariffRefStructure value) {
        this.typeOfTariffRef = value;
    }

    /**
     * Ruft den Wert der tariffBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffBasisEnumeration }
     *     
     */
    public TariffBasisEnumeration getTariffBasis() {
        return tariffBasis;
    }

    /**
     * Legt den Wert der tariffBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffBasisEnumeration }
     *     
     */
    public void setTariffBasis(TariffBasisEnumeration value) {
        this.tariffBasis = value;
    }

    /**
     * Ruft den Wert der returnFareTwiceSingle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnFareTwiceSingle() {
        return returnFareTwiceSingle;
    }

    /**
     * Legt den Wert der returnFareTwiceSingle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnFareTwiceSingle(Boolean value) {
        this.returnFareTwiceSingle = value;
    }

    /**
     * Ruft den Wert der geographicalUnitRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalUnitRefStructure }
     *     
     */
    public GeographicalUnitRefStructure getGeographicalUnitRef() {
        return geographicalUnitRef;
    }

    /**
     * Legt den Wert der geographicalUnitRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalUnitRefStructure }
     *     
     */
    public void setGeographicalUnitRef(GeographicalUnitRefStructure value) {
        this.geographicalUnitRef = value;
    }

    /**
     * Ruft den Wert der geographicalIntervals-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalIntervalsRelStructure }
     *     
     */
    public GeographicalIntervalsRelStructure getGeographicalIntervals() {
        return geographicalIntervals;
    }

    /**
     * Legt den Wert der geographicalIntervals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalIntervalsRelStructure }
     *     
     */
    public void setGeographicalIntervals(GeographicalIntervalsRelStructure value) {
        this.geographicalIntervals = value;
    }

    /**
     * Ruft den Wert der geographicalStructureFactors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalStructureFactorsRelStructure }
     *     
     */
    public GeographicalStructureFactorsRelStructure getGeographicalStructureFactors() {
        return geographicalStructureFactors;
    }

    /**
     * Legt den Wert der geographicalStructureFactors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalStructureFactorsRelStructure }
     *     
     */
    public void setGeographicalStructureFactors(GeographicalStructureFactorsRelStructure value) {
        this.geographicalStructureFactors = value;
    }

    /**
     * Ruft den Wert der timeUnitRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitRefStructure }
     *     
     */
    public TimeUnitRefStructure getTimeUnitRef() {
        return timeUnitRef;
    }

    /**
     * Legt den Wert der timeUnitRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitRefStructure }
     *     
     */
    public void setTimeUnitRef(TimeUnitRefStructure value) {
        this.timeUnitRef = value;
    }

    /**
     * Ruft den Wert der timeIntervals-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalsRelStructure }
     *     
     */
    public TimeIntervalsRelStructure getTimeIntervals() {
        return timeIntervals;
    }

    /**
     * Legt den Wert der timeIntervals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalsRelStructure }
     *     
     */
    public void setTimeIntervals(TimeIntervalsRelStructure value) {
        this.timeIntervals = value;
    }

    /**
     * Ruft den Wert der timeStructureFactors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeStructureFactorsRelStructure }
     *     
     */
    public TimeStructureFactorsRelStructure getTimeStructureFactors() {
        return timeStructureFactors;
    }

    /**
     * Legt den Wert der timeStructureFactors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeStructureFactorsRelStructure }
     *     
     */
    public void setTimeStructureFactors(TimeStructureFactorsRelStructure value) {
        this.timeStructureFactors = value;
    }

    /**
     * Ruft den Wert der qualityStructureFactors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QualityStructureFactorsRelStructure }
     *     
     */
    public QualityStructureFactorsRelStructure getQualityStructureFactors() {
        return qualityStructureFactors;
    }

    /**
     * Legt den Wert der qualityStructureFactors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityStructureFactorsRelStructure }
     *     
     */
    public void setQualityStructureFactors(QualityStructureFactorsRelStructure value) {
        this.qualityStructureFactors = value;
    }

    /**
     * Ruft den Wert der fareStructureElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareStructureElementsRelStructure }
     *     
     */
    public FareStructureElementsRelStructure getFareStructureElements() {
        return fareStructureElements;
    }

    /**
     * Legt den Wert der fareStructureElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStructureElementsRelStructure }
     *     
     */
    public void setFareStructureElements(FareStructureElementsRelStructure value) {
        this.fareStructureElements = value;
    }

    /**
     * Ruft den Wert der distanceMatrixElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistanceMatrixElementsRelStructure }
     *     
     */
    public DistanceMatrixElementsRelStructure getDistanceMatrixElements() {
        return distanceMatrixElements;
    }

    /**
     * Legt den Wert der distanceMatrixElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceMatrixElementsRelStructure }
     *     
     */
    public void setDistanceMatrixElements(DistanceMatrixElementsRelStructure value) {
        this.distanceMatrixElements = value;
    }

    /**
     * Ruft den Wert der groupsOfDistanceMatrixElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfDistanceMatrixElementsRelStructure }
     *     
     */
    public GroupsOfDistanceMatrixElementsRelStructure getGroupsOfDistanceMatrixElements() {
        return groupsOfDistanceMatrixElements;
    }

    /**
     * Legt den Wert der groupsOfDistanceMatrixElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfDistanceMatrixElementsRelStructure }
     *     
     */
    public void setGroupsOfDistanceMatrixElements(GroupsOfDistanceMatrixElementsRelStructure value) {
        this.groupsOfDistanceMatrixElements = value;
    }

    /**
     * Ruft den Wert der priceUnitRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceUnitRefStructure }
     *     
     */
    public PriceUnitRefStructure getPriceUnitRef() {
        return priceUnitRef;
    }

    /**
     * Legt den Wert der priceUnitRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceUnitRefStructure }
     *     
     */
    public void setPriceUnitRef(PriceUnitRefStructure value) {
        this.priceUnitRef = value;
    }

    /**
     * Ruft den Wert der priceGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupsRelStructure }
     *     
     */
    public PriceGroupsRelStructure getPriceGroups() {
        return priceGroups;
    }

    /**
     * Legt den Wert der priceGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupsRelStructure }
     *     
     */
    public void setPriceGroups(PriceGroupsRelStructure value) {
        this.priceGroups = value;
    }

    /**
     * Ruft den Wert der fareTables-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareTablesRelStructure }
     *     
     */
    public FareTablesRelStructure getFareTables() {
        return fareTables;
    }

    /**
     * Legt den Wert der fareTables-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTablesRelStructure }
     *     
     */
    public void setFareTables(FareTablesRelStructure value) {
        this.fareTables = value;
    }

}
