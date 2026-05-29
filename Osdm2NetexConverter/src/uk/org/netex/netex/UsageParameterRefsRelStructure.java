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
 * Type for a list of USAGE PARAMETERs.
 * 
 * <p>Java-Klasse f�r usageParameterRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="usageParameterRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}UsageParameterRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usageParameterRefs_RelStructure", propOrder = {
    "usageParameterRef"
})
public class UsageParameterRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "UsageParameterRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends UsageParameterRefStructure>> usageParameterRef;

    /**
     * Gets the value of the usageParameterRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageParameterRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageParameterRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RentalPenaltyPolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementRequiredRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link BookingPolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoundTripRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MinimumStayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageAllowanceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EligibilityChangePolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AdditionalDriverOptionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementRequiredRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ReplacingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SuspendingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RentalOptionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InterchangingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargingPolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TransferabilityRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StepLimitRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupTicketRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementGivenRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CancellingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RefundingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageValidityPeriodRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ResellingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ReservingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ExchangingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolerProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PurchaseWindowRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementGivenRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyOfUseRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PenaltyPolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SubscribingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CommercialProfileRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends UsageParameterRefStructure>> getUsageParameterRef() {
        if (usageParameterRef == null) {
            usageParameterRef = new ArrayList<JAXBElement<? extends UsageParameterRefStructure>>();
        }
        return this.usageParameterRef;
    }

}
