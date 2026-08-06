//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for VERSIONED CHILD.
 * 
 * <p>Java-Klasse f�r VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}EntityInVersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VersionedChildGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionedChildStructure", propOrder = {
    "extensions"
})
@XmlSeeAlso({
    LevelInStructureVersionStructure.class,
    GroupConstraintMemberVersionedChildStructure.class,
    GeneralFrameMemberStructure.class,
    VehicleEquipmentProfileMemberVersionStructure.class,
    AccessibilityAssessmentVersionedChildStructure.class,
    VehicleQuayAlignmentVersionStructure.class,
    VehicleTypeZoneRestrictionVersionStructure.class,
    RechargingStepVersionStructure.class,
    JourneyPartPositionVersionedChildStructure.class,
    InterchangeRuleFilterVersionedChildStructure.class,
    CustomerPaymentMeansVersionedChildStructure.class,
    DeckEntranceCoupleVersionedChildStructure.class,
    ResidentialQualificationVersionStructure.class,
    DeadRunCallVersionedChildStructure.class,
    PassengerSpotAllocationVersionedChildStructure.class,
    OnboardStayVersionedChlldStructure.class,
    ZoneInSeriesVersionedChildStructure.class,
    VehiclePositionAlignmentVersionStructure.class,
    CommonCellVersionedChildStructure.class,
    StartTimeAtStopPointVersionedChildStructure.class,
    ParkingCapacityVersionedChildStructure.class,
    SchematicMapMemberVersionedChildStructure.class,
    ParkingPropertiesVersionedChildStructure.class,
    FlexibleLinkPropertiesVersionedChildStructure.class,
    FlexiblePointPropertiesVersionedChildStructure.class,
    DeckEntranceUsageVersionedChildStructure.class,
    CellVersionedChildStructure.class,
    PassingTimeVersionedChildStructure.class,
    StairFlightVersionedChildStructure.class,
    RelatedOrganisationVersionStructure.class,
    AlternativeTextVersionedChildStructure.class,
    CodespaceAssignmentVersionedChildStructure.class,
    SpotRowVersionStructure.class,
    TrainInCompoundTrainVersionedChildStructure.class,
    CustomerEligibilityVersionedChildStructure.class,
    SecurityListingVersionedChildStructure.class,
    PointOnLinkVersionedChildStructure.class,
    ViaVersionedChildStructure.class,
    FareElementInSequenceVersionedChildStructure.class,
    PathInstructionVersionedChildStructure.class,
    TopographicPlaceDescriptorVersionedChildStructure.class,
    LinkInLinkSequenceVersionedChildStructure.class,
    PointOfInterestClassificationHierarchyMemberStructure.class,
    AccommodationVersionedChildStructure.class,
    AbstractGroupMemberVersionedChildStructure.class,
    SpotColumnVersionStructure.class,
    MediumApplicationInstanceVersionedChildStructure.class,
    FarePriceVersionedChildStructure.class,
    JourneyTimingVersionedChildStructure.class,
    PointInLinkSequenceVersionedChildStructure.class,
    UserNeedVersionedChildStructure.class,
    SensorInSpotVersionedChildStructure.class,
    AlternativeNameVersionedChildStructure.class,
    SensorInEntranceVersionedChildStructure.class,
    FareTableColumnVersionedChildStructure.class,
    CallVersionedChildStructure.class,
    FareTableRowVersionedChildStructure.class,
    DeckSpaceCapacityVersionedChildStructure.class,
    AccessSummaryVersionedChildStructure.class,
    AccessibilityLimitationVersionedChildStructure.class,
    ResponsibilityRoleAssignmentVersionedChildStructure.class,
    CustomerPurchasePackageElementAccessVersionedChildStructure.class,
    RoundingStepVersionedChildStructure.class
})
public class VersionedChildStructure
    extends EntityInVersionStructure
{

    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

}
