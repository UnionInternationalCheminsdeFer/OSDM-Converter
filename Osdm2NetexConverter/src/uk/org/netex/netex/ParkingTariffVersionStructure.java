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


/**
 * Type for a PARKING TARIFF.
 * 
 * <p>Java-Klasse f�r ParkingTariff_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParkingTariff_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ParkingTariffGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingTariff_VersionStructure", propOrder = {
    "name",
    "alternativeNames",
    "description",
    "noticeAssignments",
    "documentLinks",
    "organisationRefDummy",
    "groupOfOperatorsRef",
    "timeUnitRef",
    "timeIntervals",
    "timeStructureFactors",
    "qualityStructureFactors",
    "parkingUserType",
    "parkingStayType",
    "parkingVehicleTypes",
    "vehicleTypes",
    "appliesTo",
    "typeOfTariffRef",
    "additionalTax",
    "parkingChargeBands",
    "priceUnitRef",
    "priceGroups",
    "fareTables"
})
@XmlSeeAlso({
    ParkingTariff.class
})
public class ParkingTariffVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    protected AlternativeNamesRelStructure alternativeNames;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    protected NoticeAssignmentsRelStructure noticeAssignments;
    protected InfoLinksRelStructure documentLinks;
    @XmlElementRef(name = "OrganisationRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OrganisationRefStructure> organisationRefDummy;
    @XmlElement(name = "GroupOfOperatorsRef")
    protected GroupOfOperatorsRefStructure groupOfOperatorsRef;
    @XmlElement(name = "TimeUnitRef")
    protected TimeUnitRefStructure timeUnitRef;
    protected TimeIntervalsRelStructure timeIntervals;
    protected TimeStructureFactorsRelStructure timeStructureFactors;
    protected QualityStructureFactorsRelStructure qualityStructureFactors;
    @XmlElement(name = "ParkingUserType")
    @XmlSchemaType(name = "string")
    protected ParkingUserEnumeration parkingUserType;
    @XmlElement(name = "ParkingStayType")
    @XmlSchemaType(name = "string")
    protected ParkingStayEnumeration parkingStayType;
    @XmlList
    @XmlElement(name = "ParkingVehicleTypes")
    protected List<ParkingVehicleEnumeration> parkingVehicleTypes;
    protected TransportTypeRefsRelStructure vehicleTypes;
    protected ParkingRefsRelStructure appliesTo;
    @XmlElement(name = "TypeOfTariffRef")
    protected TypeOfTariffRefStructure typeOfTariffRef;
    @XmlElement(name = "AdditionalTax", defaultValue = "false")
    protected Boolean additionalTax;
    protected ParkingChargeBandsRelStructure parkingChargeBands;
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
     * Ruft den Wert der parkingUserType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingUserEnumeration }
     *     
     */
    public ParkingUserEnumeration getParkingUserType() {
        return parkingUserType;
    }

    /**
     * Legt den Wert der parkingUserType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingUserEnumeration }
     *     
     */
    public void setParkingUserType(ParkingUserEnumeration value) {
        this.parkingUserType = value;
    }

    /**
     * Ruft den Wert der parkingStayType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingStayEnumeration }
     *     
     */
    public ParkingStayEnumeration getParkingStayType() {
        return parkingStayType;
    }

    /**
     * Legt den Wert der parkingStayType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingStayEnumeration }
     *     
     */
    public void setParkingStayType(ParkingStayEnumeration value) {
        this.parkingStayType = value;
    }

    /**
     * Gets the value of the parkingVehicleTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingVehicleTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingVehicleTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingVehicleEnumeration }
     * 
     * 
     */
    public List<ParkingVehicleEnumeration> getParkingVehicleTypes() {
        if (parkingVehicleTypes == null) {
            parkingVehicleTypes = new ArrayList<ParkingVehicleEnumeration>();
        }
        return this.parkingVehicleTypes;
    }

    /**
     * Ruft den Wert der vehicleTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportTypeRefsRelStructure }
     *     
     */
    public TransportTypeRefsRelStructure getVehicleTypes() {
        return vehicleTypes;
    }

    /**
     * Legt den Wert der vehicleTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportTypeRefsRelStructure }
     *     
     */
    public void setVehicleTypes(TransportTypeRefsRelStructure value) {
        this.vehicleTypes = value;
    }

    /**
     * Ruft den Wert der appliesTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingRefsRelStructure }
     *     
     */
    public ParkingRefsRelStructure getAppliesTo() {
        return appliesTo;
    }

    /**
     * Legt den Wert der appliesTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingRefsRelStructure }
     *     
     */
    public void setAppliesTo(ParkingRefsRelStructure value) {
        this.appliesTo = value;
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
     * Ruft den Wert der additionalTax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalTax() {
        return additionalTax;
    }

    /**
     * Legt den Wert der additionalTax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalTax(Boolean value) {
        this.additionalTax = value;
    }

    /**
     * Ruft den Wert der parkingChargeBands-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingChargeBandsRelStructure }
     *     
     */
    public ParkingChargeBandsRelStructure getParkingChargeBands() {
        return parkingChargeBands;
    }

    /**
     * Legt den Wert der parkingChargeBands-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingChargeBandsRelStructure }
     *     
     */
    public void setParkingChargeBands(ParkingChargeBandsRelStructure value) {
        this.parkingChargeBands = value;
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
