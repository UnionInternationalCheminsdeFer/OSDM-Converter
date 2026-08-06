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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for containment in frame of TYPE OF VALUEs.
 * 
 * <p>Java-Klasse f�r typesOfValueInFrame_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="typesOfValueInFrame_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}ValueSet"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TypeOfValue"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typesOfValueInFrame_RelStructure", propOrder = {
    "valueSetOrTypeOfValue"
})
public class TypesOfValueInFrameRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "ValueSet", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfValue", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends DataManagedObjectStructure>> valueSetOrTypeOfValue;

    /**
     * Gets the value of the valueSetOrTypeOfValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueSetOrTypeOfValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueSetOrTypeOfValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TypeOfFareContract }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTravelDocument }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLocatableSpot }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfDriverPermit }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfUsageParameter }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfCongestion }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPassengerInformationEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link Branding }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingBayStatus }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareContractEntry }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfMediumAccessDevice }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPricingRule }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTariff }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfDeckEntranceUsage }{@code >}
     * {@link JAXBElement }{@code <}{@link PurposeOfEquipmentProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfZone }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfJourneyPattern }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfParking }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFacility }{@code >}
     * {@link JAXBElement }{@code <}{@link DataSource }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfOrganisationPart }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfValidity }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfCodespaceAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfDeckSpace }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareStructureFactor }{@code >}
     * {@link JAXBElement }{@code <}{@link Direction }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfCustomerAccount }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueSet }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestClassification }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfWheelchair }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfService }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfOrganisation }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfMachineReadability }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareProduct }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfDeckEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfNotice }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLink }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTimeDemandType }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfBatteryChemistry }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFlexibleService }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassOfUse }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfAccessRightAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfRetailDevice }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPaymentMethod }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLine }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareStructureElement }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfSalesOfferPackage }{@code >}
     * {@link JAXBElement }{@code <}{@link TimingAlgorithmType }{@code >}
     * {@link JAXBElement }{@code <}{@link PurposeOfJourneyPartition }{@code >}
     * {@link JAXBElement }{@code <}{@link PurposeOfGrouping }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFeature }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfDeliveryVariant }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfMobilityService }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLinkSequence }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfEntityVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargingMoment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfProof }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfServiceFeature }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfProductCategory }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfActivation }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfConcession }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTransfer }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareTable }{@code >}
     * {@link JAXBElement }{@code <}{@link PriceUnit }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link OpenTransportMode }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerAccountStatus }{@code >}
     * {@link JAXBElement }{@code <}{@link Submode }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPlug }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfRollingStockValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFleet }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfSecurityList }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfVersion }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfModeOfOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfResponsibilityRole }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfValueVersionStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends DataManagedObjectStructure>> getValueSetOrTypeOfValue() {
        if (valueSetOrTypeOfValue == null) {
            valueSetOrTypeOfValue = new ArrayList<JAXBElement<? extends DataManagedObjectStructure>>();
        }
        return this.valueSetOrTypeOfValue;
    }

}
