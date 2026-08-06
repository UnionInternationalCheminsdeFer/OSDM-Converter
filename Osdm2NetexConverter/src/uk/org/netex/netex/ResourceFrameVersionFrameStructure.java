//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a RESOURCE.
 * 
 * <p>Java-Klasse f�r ResourceFrame_VersionFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResourceFrame_VersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ResourceFrameGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceFrame_VersionFrameStructure", propOrder = {
    "dataSources",
    "responsibilityRoles",
    "responsibilitySets",
    "contracts",
    "typesOfValue",
    "contacts",
    "organisations",
    "groupsOfOperators",
    "operationalContexts",
    "controlCentres",
    "openModes",
    "modesOfOperation",
    "equipments",
    "siteFacilitySets",
    "serviceFacilitySets",
    "vehicleTypes",
    "vehicleModels",
    "vehicleEquipmentProfiles",
    "vehicleModelProfiles",
    "trainElementTypes",
    "vehicles",
    "rollingStockInventories",
    "deckPlans",
    "schematicMaps",
    "groupsOfEntities",
    "zones",
    "blacklists",
    "whitelists",
    "bookingArrangements",
    "serviceBookingArrangements"
})
@XmlSeeAlso({
    ResourceFrame.class
})
public class ResourceFrameVersionFrameStructure
    extends CommonVersionFrameStructure
{

    protected DataSourcesInFrameRelStructure dataSources;
    protected ResponsibilityRolesInFrameRelStructure responsibilityRoles;
    protected ResponsibilitySetsInFrameRelStructure responsibilitySets;
    protected ContractsInFrameRelStructure contracts;
    protected TypesOfValueInFrameRelStructure typesOfValue;
    protected ContactsRelStructure contacts;
    protected OrganisationsInFrameRelStructure organisations;
    protected GroupsOfOperatorsInFrameRelStructure groupsOfOperators;
    protected OperationalContextsInFrameRelStructure operationalContexts;
    protected ControlCentresInFrameRelStructure controlCentres;
    protected OpenModesRelStructure openModes;
    protected ModesOfOperationRelStructure modesOfOperation;
    protected EquipmentsInFrameRelStructure equipments;
    protected SiteFacilitySetsInFrameRelStructure siteFacilitySets;
    protected ServiceFacilitySetsInFrameRelStructure serviceFacilitySets;
    protected VehicleTypesInFrameRelStructure vehicleTypes;
    protected VehicleModelsInFrameRelStructure vehicleModels;
    protected VehicleEquipmentProfilesInFrameRelStructure vehicleEquipmentProfiles;
    protected VehicleModelProfilesInFrameRelStructure vehicleModelProfiles;
    protected TrainElementTypesInFrameRelStructure trainElementTypes;
    protected VehiclesInFrameRelStructure vehicles;
    protected RollingStockInventoriesRelStructure rollingStockInventories;
    protected DeckPlansRelStructure deckPlans;
    protected SchematicMapsInFrameRelStructure schematicMaps;
    protected GroupOfEntitiesInFrameRelStructure groupsOfEntities;
    protected ZonesInFrameRelStructure zones;
    protected BlacklistsInFrameRelStructure blacklists;
    protected WhitelistsInFrameRelStructure whitelists;
    protected BookingArrangementsInFrameRelStructure bookingArrangements;
    protected ServiceBookingArrangementsInFrameRelStructure serviceBookingArrangements;

    /**
     * Ruft den Wert der dataSources-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataSourcesInFrameRelStructure }
     *     
     */
    public DataSourcesInFrameRelStructure getDataSources() {
        return dataSources;
    }

    /**
     * Legt den Wert der dataSources-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourcesInFrameRelStructure }
     *     
     */
    public void setDataSources(DataSourcesInFrameRelStructure value) {
        this.dataSources = value;
    }

    /**
     * Ruft den Wert der responsibilityRoles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilityRolesInFrameRelStructure }
     *     
     */
    public ResponsibilityRolesInFrameRelStructure getResponsibilityRoles() {
        return responsibilityRoles;
    }

    /**
     * Legt den Wert der responsibilityRoles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilityRolesInFrameRelStructure }
     *     
     */
    public void setResponsibilityRoles(ResponsibilityRolesInFrameRelStructure value) {
        this.responsibilityRoles = value;
    }

    /**
     * Ruft den Wert der responsibilitySets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilitySetsInFrameRelStructure }
     *     
     */
    public ResponsibilitySetsInFrameRelStructure getResponsibilitySets() {
        return responsibilitySets;
    }

    /**
     * Legt den Wert der responsibilitySets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilitySetsInFrameRelStructure }
     *     
     */
    public void setResponsibilitySets(ResponsibilitySetsInFrameRelStructure value) {
        this.responsibilitySets = value;
    }

    /**
     * Ruft den Wert der contracts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContractsInFrameRelStructure }
     *     
     */
    public ContractsInFrameRelStructure getContracts() {
        return contracts;
    }

    /**
     * Legt den Wert der contracts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractsInFrameRelStructure }
     *     
     */
    public void setContracts(ContractsInFrameRelStructure value) {
        this.contracts = value;
    }

    /**
     * Ruft den Wert der typesOfValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypesOfValueInFrameRelStructure }
     *     
     */
    public TypesOfValueInFrameRelStructure getTypesOfValue() {
        return typesOfValue;
    }

    /**
     * Legt den Wert der typesOfValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesOfValueInFrameRelStructure }
     *     
     */
    public void setTypesOfValue(TypesOfValueInFrameRelStructure value) {
        this.typesOfValue = value;
    }

    /**
     * Ruft den Wert der contacts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactsRelStructure }
     *     
     */
    public ContactsRelStructure getContacts() {
        return contacts;
    }

    /**
     * Legt den Wert der contacts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactsRelStructure }
     *     
     */
    public void setContacts(ContactsRelStructure value) {
        this.contacts = value;
    }

    /**
     * Ruft den Wert der organisations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationsInFrameRelStructure }
     *     
     */
    public OrganisationsInFrameRelStructure getOrganisations() {
        return organisations;
    }

    /**
     * Legt den Wert der organisations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationsInFrameRelStructure }
     *     
     */
    public void setOrganisations(OrganisationsInFrameRelStructure value) {
        this.organisations = value;
    }

    /**
     * Ruft den Wert der groupsOfOperators-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfOperatorsInFrameRelStructure }
     *     
     */
    public GroupsOfOperatorsInFrameRelStructure getGroupsOfOperators() {
        return groupsOfOperators;
    }

    /**
     * Legt den Wert der groupsOfOperators-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfOperatorsInFrameRelStructure }
     *     
     */
    public void setGroupsOfOperators(GroupsOfOperatorsInFrameRelStructure value) {
        this.groupsOfOperators = value;
    }

    /**
     * Ruft den Wert der operationalContexts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperationalContextsInFrameRelStructure }
     *     
     */
    public OperationalContextsInFrameRelStructure getOperationalContexts() {
        return operationalContexts;
    }

    /**
     * Legt den Wert der operationalContexts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalContextsInFrameRelStructure }
     *     
     */
    public void setOperationalContexts(OperationalContextsInFrameRelStructure value) {
        this.operationalContexts = value;
    }

    /**
     * Ruft den Wert der controlCentres-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ControlCentresInFrameRelStructure }
     *     
     */
    public ControlCentresInFrameRelStructure getControlCentres() {
        return controlCentres;
    }

    /**
     * Legt den Wert der controlCentres-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlCentresInFrameRelStructure }
     *     
     */
    public void setControlCentres(ControlCentresInFrameRelStructure value) {
        this.controlCentres = value;
    }

    /**
     * Ruft den Wert der openModes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OpenModesRelStructure }
     *     
     */
    public OpenModesRelStructure getOpenModes() {
        return openModes;
    }

    /**
     * Legt den Wert der openModes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenModesRelStructure }
     *     
     */
    public void setOpenModes(OpenModesRelStructure value) {
        this.openModes = value;
    }

    /**
     * Ruft den Wert der modesOfOperation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModesOfOperationRelStructure }
     *     
     */
    public ModesOfOperationRelStructure getModesOfOperation() {
        return modesOfOperation;
    }

    /**
     * Legt den Wert der modesOfOperation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModesOfOperationRelStructure }
     *     
     */
    public void setModesOfOperation(ModesOfOperationRelStructure value) {
        this.modesOfOperation = value;
    }

    /**
     * Ruft den Wert der equipments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentsInFrameRelStructure }
     *     
     */
    public EquipmentsInFrameRelStructure getEquipments() {
        return equipments;
    }

    /**
     * Legt den Wert der equipments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentsInFrameRelStructure }
     *     
     */
    public void setEquipments(EquipmentsInFrameRelStructure value) {
        this.equipments = value;
    }

    /**
     * Ruft den Wert der siteFacilitySets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteFacilitySetsInFrameRelStructure }
     *     
     */
    public SiteFacilitySetsInFrameRelStructure getSiteFacilitySets() {
        return siteFacilitySets;
    }

    /**
     * Legt den Wert der siteFacilitySets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteFacilitySetsInFrameRelStructure }
     *     
     */
    public void setSiteFacilitySets(SiteFacilitySetsInFrameRelStructure value) {
        this.siteFacilitySets = value;
    }

    /**
     * Ruft den Wert der serviceFacilitySets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFacilitySetsInFrameRelStructure }
     *     
     */
    public ServiceFacilitySetsInFrameRelStructure getServiceFacilitySets() {
        return serviceFacilitySets;
    }

    /**
     * Legt den Wert der serviceFacilitySets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFacilitySetsInFrameRelStructure }
     *     
     */
    public void setServiceFacilitySets(ServiceFacilitySetsInFrameRelStructure value) {
        this.serviceFacilitySets = value;
    }

    /**
     * Ruft den Wert der vehicleTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypesInFrameRelStructure }
     *     
     */
    public VehicleTypesInFrameRelStructure getVehicleTypes() {
        return vehicleTypes;
    }

    /**
     * Legt den Wert der vehicleTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypesInFrameRelStructure }
     *     
     */
    public void setVehicleTypes(VehicleTypesInFrameRelStructure value) {
        this.vehicleTypes = value;
    }

    /**
     * Ruft den Wert der vehicleModels-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModelsInFrameRelStructure }
     *     
     */
    public VehicleModelsInFrameRelStructure getVehicleModels() {
        return vehicleModels;
    }

    /**
     * Legt den Wert der vehicleModels-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModelsInFrameRelStructure }
     *     
     */
    public void setVehicleModels(VehicleModelsInFrameRelStructure value) {
        this.vehicleModels = value;
    }

    /**
     * Ruft den Wert der vehicleEquipmentProfiles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEquipmentProfilesInFrameRelStructure }
     *     
     */
    public VehicleEquipmentProfilesInFrameRelStructure getVehicleEquipmentProfiles() {
        return vehicleEquipmentProfiles;
    }

    /**
     * Legt den Wert der vehicleEquipmentProfiles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEquipmentProfilesInFrameRelStructure }
     *     
     */
    public void setVehicleEquipmentProfiles(VehicleEquipmentProfilesInFrameRelStructure value) {
        this.vehicleEquipmentProfiles = value;
    }

    /**
     * Ruft den Wert der vehicleModelProfiles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModelProfilesInFrameRelStructure }
     *     
     */
    public VehicleModelProfilesInFrameRelStructure getVehicleModelProfiles() {
        return vehicleModelProfiles;
    }

    /**
     * Legt den Wert der vehicleModelProfiles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModelProfilesInFrameRelStructure }
     *     
     */
    public void setVehicleModelProfiles(VehicleModelProfilesInFrameRelStructure value) {
        this.vehicleModelProfiles = value;
    }

    /**
     * Ruft den Wert der trainElementTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainElementTypesInFrameRelStructure }
     *     
     */
    public TrainElementTypesInFrameRelStructure getTrainElementTypes() {
        return trainElementTypes;
    }

    /**
     * Legt den Wert der trainElementTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElementTypesInFrameRelStructure }
     *     
     */
    public void setTrainElementTypes(TrainElementTypesInFrameRelStructure value) {
        this.trainElementTypes = value;
    }

    /**
     * Ruft den Wert der vehicles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehiclesInFrameRelStructure }
     *     
     */
    public VehiclesInFrameRelStructure getVehicles() {
        return vehicles;
    }

    /**
     * Legt den Wert der vehicles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclesInFrameRelStructure }
     *     
     */
    public void setVehicles(VehiclesInFrameRelStructure value) {
        this.vehicles = value;
    }

    /**
     * Ruft den Wert der rollingStockInventories-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RollingStockInventoriesRelStructure }
     *     
     */
    public RollingStockInventoriesRelStructure getRollingStockInventories() {
        return rollingStockInventories;
    }

    /**
     * Legt den Wert der rollingStockInventories-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RollingStockInventoriesRelStructure }
     *     
     */
    public void setRollingStockInventories(RollingStockInventoriesRelStructure value) {
        this.rollingStockInventories = value;
    }

    /**
     * Ruft den Wert der deckPlans-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckPlansRelStructure }
     *     
     */
    public DeckPlansRelStructure getDeckPlans() {
        return deckPlans;
    }

    /**
     * Legt den Wert der deckPlans-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckPlansRelStructure }
     *     
     */
    public void setDeckPlans(DeckPlansRelStructure value) {
        this.deckPlans = value;
    }

    /**
     * Ruft den Wert der schematicMaps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SchematicMapsInFrameRelStructure }
     *     
     */
    public SchematicMapsInFrameRelStructure getSchematicMaps() {
        return schematicMaps;
    }

    /**
     * Legt den Wert der schematicMaps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SchematicMapsInFrameRelStructure }
     *     
     */
    public void setSchematicMaps(SchematicMapsInFrameRelStructure value) {
        this.schematicMaps = value;
    }

    /**
     * Ruft den Wert der groupsOfEntities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfEntitiesInFrameRelStructure }
     *     
     */
    public GroupOfEntitiesInFrameRelStructure getGroupsOfEntities() {
        return groupsOfEntities;
    }

    /**
     * Legt den Wert der groupsOfEntities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfEntitiesInFrameRelStructure }
     *     
     */
    public void setGroupsOfEntities(GroupOfEntitiesInFrameRelStructure value) {
        this.groupsOfEntities = value;
    }

    /**
     * Ruft den Wert der zones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZonesInFrameRelStructure }
     *     
     */
    public ZonesInFrameRelStructure getZones() {
        return zones;
    }

    /**
     * Legt den Wert der zones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZonesInFrameRelStructure }
     *     
     */
    public void setZones(ZonesInFrameRelStructure value) {
        this.zones = value;
    }

    /**
     * Ruft den Wert der blacklists-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BlacklistsInFrameRelStructure }
     *     
     */
    public BlacklistsInFrameRelStructure getBlacklists() {
        return blacklists;
    }

    /**
     * Legt den Wert der blacklists-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BlacklistsInFrameRelStructure }
     *     
     */
    public void setBlacklists(BlacklistsInFrameRelStructure value) {
        this.blacklists = value;
    }

    /**
     * Ruft den Wert der whitelists-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WhitelistsInFrameRelStructure }
     *     
     */
    public WhitelistsInFrameRelStructure getWhitelists() {
        return whitelists;
    }

    /**
     * Legt den Wert der whitelists-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WhitelistsInFrameRelStructure }
     *     
     */
    public void setWhitelists(WhitelistsInFrameRelStructure value) {
        this.whitelists = value;
    }

    /**
     * Ruft den Wert der bookingArrangements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BookingArrangementsInFrameRelStructure }
     *     
     */
    public BookingArrangementsInFrameRelStructure getBookingArrangements() {
        return bookingArrangements;
    }

    /**
     * Legt den Wert der bookingArrangements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingArrangementsInFrameRelStructure }
     *     
     */
    public void setBookingArrangements(BookingArrangementsInFrameRelStructure value) {
        this.bookingArrangements = value;
    }

    /**
     * Ruft den Wert der serviceBookingArrangements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBookingArrangementsInFrameRelStructure }
     *     
     */
    public ServiceBookingArrangementsInFrameRelStructure getServiceBookingArrangements() {
        return serviceBookingArrangements;
    }

    /**
     * Legt den Wert der serviceBookingArrangements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBookingArrangementsInFrameRelStructure }
     *     
     */
    public void setServiceBookingArrangements(ServiceBookingArrangementsInFrameRelStructure value) {
        this.serviceBookingArrangements = value;
    }

}
