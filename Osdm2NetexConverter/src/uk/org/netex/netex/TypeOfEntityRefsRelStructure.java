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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of references to a TYPE OF VALUE
 * 
 * <p>Java-Klasse f�r typeOfEntityRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="typeOfEntityRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TypeOfEntityRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeOfEntityRefs_RelStructure", propOrder = {
    "typeOfEntityRef"
})
public class TypeOfEntityRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "TypeOfEntityRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends TypeOfValueRefStructure>> typeOfEntityRef;

    /**
     * Gets the value of the typeOfEntityRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeOfEntityRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeOfEntityRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TypeOfCongestionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLinkSequenceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfMobilityServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFacilityRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareContractRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFeatureRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfNoticeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PersonalModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfDeliveryVariantRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ScheduledModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFlexibleServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfRollingStockRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfWheelchairRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfAccessRightAssignmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfValueRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerAccountStatusRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareStructureElementRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPlugRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareStructureFactorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleRentalModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfOrganisationPartRef }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareContractEntryRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTransferRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTimeDemandTypeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTravelDocumentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfRetailDeviceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfProjectionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SpotAllocationMethodRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfSalesOfferPackageRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPricingRuleRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLineRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPlaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTariffRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfMachineReadabilityRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPassengerInformationEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AllDistributionChannelsRefStructureElement }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfValidityRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfServiceFeatureRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AlternativeModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfSecurityListRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfCustomerAccountRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ConventionalModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfZoneRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfJourneyPatternRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfBatteryChemistryRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TypeOfValueRefStructure>> getTypeOfEntityRef() {
        if (typeOfEntityRef == null) {
            typeOfEntityRef = new ArrayList<JAXBElement<? extends TypeOfValueRefStructure>>();
        }
        return this.typeOfEntityRef;
    }

}
