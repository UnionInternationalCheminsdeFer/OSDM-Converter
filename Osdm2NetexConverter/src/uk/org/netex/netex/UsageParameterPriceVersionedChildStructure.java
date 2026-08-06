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
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a USAGE PARAMETER PRICE.
 * 
 * <p>Java-Klasse f�r UsageParameterPrice_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UsageParameterPrice_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FarePrice_VersionedChildStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}UsageParameterPriceGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageParameterPrice_VersionedChildStructure", propOrder = {
    "usageParameterRef"
})
@XmlSeeAlso({
    UsageParameterPrice.class
})
public class UsageParameterPriceVersionedChildStructure
    extends FarePriceVersionedChildStructure
{

    @XmlElementRef(name = "UsageParameterRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends UsageParameterRefStructure> usageParameterRef;

    /**
     * Ruft den Wert der usageParameterRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RentalPenaltyPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementRequiredRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BookingPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoundTripRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumStayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageAllowanceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EligibilityChangePolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdditionalDriverOptionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementRequiredRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReplacingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SuspendingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RentalOptionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterchangingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargingPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferabilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StepLimitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupTicketRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementGivenRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CancellingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageValidityPeriodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResellingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReservingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolerProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseWindowRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementGivenRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyOfUseRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PenaltyPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubscribingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommercialProfileRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends UsageParameterRefStructure> getUsageParameterRef() {
        return usageParameterRef;
    }

    /**
     * Legt den Wert der usageParameterRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RentalPenaltyPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementRequiredRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BookingPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoundTripRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumStayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageAllowanceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EligibilityChangePolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdditionalDriverOptionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementRequiredRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReplacingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SuspendingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RentalOptionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterchangingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargingPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferabilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StepLimitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupTicketRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementGivenRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CancellingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageValidityPeriodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResellingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReservingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolerProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseWindowRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementGivenRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyOfUseRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PenaltyPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubscribingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommercialProfileRefStructure }{@code >}
     *     
     */
    public void setUsageParameterRef(JAXBElement<? extends UsageParameterRefStructure> value) {
        this.usageParameterRef = value;
    }

}
