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
 * Type for a reference to a TYPE OF VALUE.
 * 
 * <p>Java-Klasse f�r TypeOfValueRefStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TypeOfValueRefStructure">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.netex.org.uk/netex>VersionOfObjectRefStructure">
 *       &lt;attGroup ref="{http://www.netex.org.uk/netex}ReferenceModificationDetailsGroup"/>
 *       &lt;attribute name="ref" use="required" type="{http://www.netex.org.uk/netex}TypeOfValueIdType" />
 *       &lt;attribute name="nameOfRefClass" type="{http://www.netex.org.uk/netex}NameOfClassTypeOfValueRefStructureType" />
 *       &lt;attribute name="modification" type="{http://www.netex.org.uk/netex}ModificationEnumeration" />
 *       &lt;attribute name="versionRef" type="{http://www.netex.org.uk/netex}VersionIdType" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeOfValueRefStructure")
@XmlSeeAlso({
    TypeOfTransferRefStructure.class,
    AcceptedDriverPermitRefStructure.class,
    BrandingRefStructure.class,
    TypeOfMediumAccessDeviceRefStructure.class,
    TypeOfDeckEntranceUsageRefStructure.class,
    TypeOfLocatableSpotRefStructure.class,
    TypeOfServiceRefStructure.class,
    TimingAlgorithmTypeRefStructure.class,
    TypeOfProofRefStructure.class,
    TypeOfWheelchairRefStructure.class,
    TypeOfEquipmentRefStructure.class,
    TypeOfFareStructureFactorRefStructure.class,
    TypeOfTariffRefStructure.class,
    TypeOfPricingRuleRefStructure.class,
    ParkingBayStatusRefStructure.class,
    TypeOfProjectionRefStructure.class,
    TypeOfFareTableRefStructure.class,
    TypeOfActivationRefStructure.class,
    TypeOfAccessRightAssignmentRefStructure.class,
    TypeOfMobilityServiceRefStructure.class,
    TypeOfResponsibilityRoleRefStructure.class,
    ChargingMomentRefStructure.class,
    TypeOfFareContractEntryRefStructure.class,
    PriceUnitRefStructure.class,
    PurposeOfJourneyPartitionRefStructure.class,
    TypeOfZoneRefStructure.class,
    TypeOfDeckSpaceProfileRefStructure.class,
    TypeOfRollingStockRefStructure.class,
    PurposeOfEquipmentProfileRefStructure.class,
    TypeOfSalesOfferPackageRefStructure.class,
    TypeOfOrganisationRefStructure.class,
    TypeOfNoticeRefStructure.class,
    TypeOfDeckEntranceRefStructure.class,
    TypeOfFacilityRefStructure.class,
    TypeOfServiceFeatureRefStructure.class,
    TypeOfProductCategoryRefStructure.class,
    TypeOfFareContractRefStructure.class,
    TypeOfDriverPermitRefStructure.class,
    TypeOfOperationRefStructure.class,
    TypeOfDeliveryVariantRefStructure.class,
    CustomerAccountStatusRefStructure.class,
    TypeOfCongestionRefStructure.class,
    TypeOfPointRefStructure.class,
    TypeOfSecurityListRefStructure.class,
    PointOfInterestClassificationRefStructure.class,
    TypeOfBatteryChemistryRefStructure.class,
    TypeOfFrameRefStructure.class,
    TypeOfPassengerInformationEquipmentRefStructure.class,
    TypeOfJourneyPatternRefStructure.class,
    DirectionRefStructure.class,
    TypeOfCustomerAccountRefStructure.class,
    TypeOfLineRefStructure.class,
    TypeOfModeOfOperationRefStructure.class,
    PricingRuleRefStructure.class,
    TypeOfPlugRefStructure.class,
    AllDistributionChannelsRefStructureElement.class,
    TypeOfPlaceRefStructure.class,
    TypeOfTimeDemandTypeRefStructure.class,
    TypeOfFareProductRefStructure.class,
    TypeOfMachineReadabilityRefStructure.class,
    TypeOfFeatureRefStructure.class,
    TypeOfUsageParameterRefStructure.class,
    TypeOfLinkSequenceRefStructure.class,
    PurposeOfGroupingRefStructure.class,
    TypeOfParkingRefStructure.class,
    ModeOfOperationRefStructure.class,
    SpotAllocationMethodRefStructure.class,
    TypeOfTravelDocumentRefStructure.class,
    DistributionChannelRefStructureElement.class,
    TypeOfValidityRefStructure.class,
    TypeOfFlexibleServiceRefStructure.class,
    TypeOfConcessionRefStructure.class,
    TypeOfCodespaceAssignmentRefStructure.class,
    TypeOfFareStructureElementRefStructure.class,
    TypeOfRetailDeviceRefStructure.class,
    TypeOfFleetRefStructure.class,
    TypeOfLinkRefStructure.class,
    ClassOfUseRefStructure.class,
    TypeOfPaymentMethodRefStructure.class,
    TypeOfOrganisationPartRefStructure.class,
    AllCountriesRefStructure.class
})
public class TypeOfValueRefStructure
    extends VersionOfObjectRefStructure
{


}
