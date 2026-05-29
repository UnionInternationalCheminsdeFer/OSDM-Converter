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
 * Type for an implementation of a frame containment relationship (ENTITY IN FRAME IN VERSION) A one to many relationship from the containing parent (one) to the contained child (many)
 * 
 * <p>Java-Klasse f�r frameContainmentStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="frameContainmentStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}relationshipStructure">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "frameContainmentStructure")
@XmlSeeAlso({
    FareContractsInFrameRelStructure.class,
    ValidityParameterAssignmentsInFrameRelStructure.class,
    SalesOfferPackagesInFrameRelStructure.class,
    FulfilmentMethodsInFrameRelStructure.class,
    SalesOfferPackageElementsInFrameRelStructure.class,
    AccessRightParameterAssignmentsInFrameRelStructure.class,
    TravelDocumentsInFrameRelStructure.class,
    CustomerAccountsInFrameRelStructure.class,
    GroupsOfSalesOfferPackagesInFrameRelStructure.class,
    FareStructureElementsInFrameRelStructure.class,
    FareTablesInFrameRelStructure.class,
    TariffsInFrameRelStructure.class,
    BlacklistsInFrameRelStructure.class,
    PricingRulesRelStructure.class,
    SalesTransactionsInFrameRelStructure.class,
    SalesOfferPackageSubstitutionsInFrameRelStructure.class,
    TravelDocumentsRelStructure.class,
    DistributionChannelsInFrameRelStructure.class,
    RoundingsRelStructure.class,
    CustomerPurchasePackagesInFrameRelStructure.class,
    IndividualTravellersInFrameRelStructure.class,
    RetailDevicesInFrameRelStructure.class,
    RetailConsortiumsInFrameRelStructure.class,
    DistributionAssignmentsInFrameRelStructure.class,
    GroupsOfDistanceMatrixElementsInFrameRelStructure.class,
    FareSeriesInFrameRelStructure.class,
    DistanceMatrixElementsInFrameRelStructure.class,
    UsageParametersInFrameRelStructure.class,
    CustomersInFrameRelStructure.class,
    FarePricesInFrameRelStructure.class,
    MediumAccessDevicesInFrameRelStructure.class,
    GroupsOfDistributionChannelsInFrameRelStructure.class,
    BorderPointsInFrameRelStructure.class,
    FareSectionsInFrameRelStructure.class,
    FareZonesInFrameRelStructure.class,
    ControllableElementsInFrameRelStructure.class,
    TypesOfTravelDocumentInFrameRelStructure.class,
    WhitelistsInFrameRelStructure.class,
    FareProductsInFrameRelStructure.class,
    ValidableElementsInFrameRelStructure.class,
    TravelSpecificationsInFrameRelStructure.class,
    FareScheduledStopPointsInFrameRelStructure.class
})
public class FrameContainmentStructure
    extends RelationshipStructure
{


}
