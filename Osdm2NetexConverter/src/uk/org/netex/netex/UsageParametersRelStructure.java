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
 * Type for of USAGE PARAMETER.
 * 
 * <p>Java-Klasse f�r usageParameters_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="usageParameters_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}UsageParameterRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}UsageParameter_Dummy"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usageParameters_RelStructure", propOrder = {
    "usageParameterRefOrUsageParameterDummy"
})
public class UsageParametersRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "UsageParameter_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UsageParameterRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> usageParameterRefOrUsageParameterDummy;

    /**
     * Gets the value of the usageParameterRefOrUsageParameterDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageParameterRefOrUsageParameterDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageParameterRefOrUsageParameterDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RentalOption }{@code >}
     * {@link JAXBElement }{@code <}{@link AdditionalDriverOption }{@code >}
     * {@link JAXBElement }{@code <}{@link Reselling }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementRequiredRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoundTripRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MinimumStayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementGiven }{@code >}
     * {@link JAXBElement }{@code <}{@link EligibilityChangePolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AdditionalDriverOptionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementRequiredRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Refunding }{@code >}
     * {@link JAXBElement }{@code <}{@link ReplacingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementRequired }{@code >}
     * {@link JAXBElement }{@code <}{@link RentalOptionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageParameter }{@code >}
     * {@link JAXBElement }{@code <}{@link InterchangingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargingPolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TransferabilityRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StepLimitRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MinimumStay }{@code >}
     * {@link JAXBElement }{@code <}{@link CancellingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Cancelling }{@code >}
     * {@link JAXBElement }{@code <}{@link CommercialProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link RoundTrip }{@code >}
     * {@link JAXBElement }{@code <}{@link ResellingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PurchaseWindow }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ReservingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EligibilityChangePolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupTicket }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageValidityPeriod }{@code >}
     * {@link JAXBElement }{@code <}{@link Interchanging }{@code >}
     * {@link JAXBElement }{@code <}{@link BookingPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link Transferability }{@code >}
     * {@link JAXBElement }{@code <}{@link Exchanging }{@code >}
     * {@link JAXBElement }{@code <}{@link Suspending }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementGivenRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Reserving }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SubscribingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Replacing }{@code >}
     * {@link JAXBElement }{@code <}{@link RentalPenaltyPolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link BookingPolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Routing }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageAllowanceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementGiven }{@code >}
     * {@link JAXBElement }{@code <}{@link Subscribing }{@code >}
     * {@link JAXBElement }{@code <}{@link CompanionProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link SuspendingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UserProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyOfUse }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupTicketRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementGivenRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RefundingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageAllowance }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageValidityPeriodRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolerProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link StepLimit }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementRequired }{@code >}
     * {@link JAXBElement }{@code <}{@link ExchangingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolerProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RentalPenaltyPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link PurchaseWindowRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargingPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyOfUseRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PenaltyPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link PenaltyPolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CommercialProfileRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUsageParameterRefOrUsageParameterDummy() {
        if (usageParameterRefOrUsageParameterDummy == null) {
            usageParameterRefOrUsageParameterDummy = new ArrayList<JAXBElement<?>>();
        }
        return this.usageParameterRefOrUsageParameterDummy;
    }

}
