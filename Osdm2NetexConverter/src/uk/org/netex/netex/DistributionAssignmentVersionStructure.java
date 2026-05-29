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
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for DISTRIBUTION ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r DistributionAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DistributionAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure_Dummy">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DistributionAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionAssignment_VersionStructure", propOrder = {
    "rest"
})
@XmlSeeAlso({
    DistributionAssignment.class
})
public class DistributionAssignmentVersionStructure
    extends AssignmentVersionStructureDummy
{

    @XmlElementRefs({
        @XmlElementRef(name = "GroupOfDistributionChannelsRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TransitCarrier", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "noticeAssignments", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AllCountriesRef", namespace = "http://www.netex.org.uk/netex", type = AllCountriesRef.class, required = false),
        @XmlElementRef(name = "CountryRef", namespace = "http://www.netex.org.uk/netex", type = CountryRef.class, required = false),
        @XmlElementRef(name = "AllowedInCountry", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InitialCarrier", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AllOrganisationsRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DistributionChannelRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OrganisationRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ResponsibilitySetRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FinalCarrier", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TicketingServiceFacilityList", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfSalesOfferPackagesRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AllDistributionChannelsRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DistributionRights", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RequiresRegistration", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AllowedInChannel", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PaymentMethods", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SalesOfferPackageRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DistributionChannelType", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MandatoryProduct", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TopographicPlaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ServiceAccessRightRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FulfilmentMethodRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RestrictedToChannel", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<Object> rest;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "ResponsibilitySetRef" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 753 von file:/D:/eclipse-wsp3/NeTex/schema/xsd/netex_part_3/part3_fares/netex_salesOfferPackage_version.xsd
     * Zeile 82 von file:/D:/eclipse-wsp3/NeTex/schema/xsd/netex_framework/netex_responsibility/netex_responsibility_version.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung f�r eine
     * der beiden folgenden Deklarationen an, um deren Namen zu �ndern: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfDistributionChannelsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DistributionChannelRefStructureElement }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponsibilitySetRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AmountOfPriceUnitProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link TicketingServiceFacilityEnumeration }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfSalesOfferPackagesRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AllOperatorsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link PaymentMethodEnumeration }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link AllAuthoritiesRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DistributionChannelTypeEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link ThirdPartyProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link SaleDiscountRightRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TopographicPlaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageDiscountRightRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link NoticeAssignmentsRelStructure }{@code >}
     * {@link AllCountriesRef }
     * {@link CountryRef }
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link AllTransportOrganisationsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AllOrganisationsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PreassignedFareProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SupplementProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AllPublicTransportOrganisationsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AllDistributionChannelsRefStructureElement }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link DistributionRightsEnumeration }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CappedDiscountRightRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceAccessRightRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FulfilmentMethodRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * 
     */
    public List<Object> getRest() {
        if (rest == null) {
            rest = new ArrayList<Object>();
        }
        return this.rest;
    }

}
