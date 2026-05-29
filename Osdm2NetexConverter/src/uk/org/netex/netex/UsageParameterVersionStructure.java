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
 * Type for USAGE PARAMETER.
 * 
 * <p>Java-Klasse f�r UsageParameter_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UsageParameter_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}UsageParameterGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageParameter_VersionStructure", propOrder = {
    "typeOfUsageParameterRef",
    "prices"
})
@XmlSeeAlso({
    UsageParameter.class,
    FrequencyOfUseVersionStructure.class,
    LuggageAllowanceVersionStructure.class,
    StepLimitVersionStructure.class,
    CommercialProfileVersionStructure.class,
    EntitlementGivenVersionStructure.class,
    PenaltyPolicyVersionStructure.class,
    InterchangingVersionStructure.class,
    GroupTicketVersionStructure.class,
    PurchaseWindowVersionStructure.class,
    MinimumStayVersionStructure.class,
    SalesOfferPackageEntitlementRequiredVersionStructure.class,
    UsageValidityPeriodVersionStructure.class,
    SalesOfferPackageEntitlementGivenVersionStructure.class,
    SubscribingVersionStructure.class,
    UserProfileVersionStructure.class,
    RoutingVersionStructure.class,
    EligibilityChangePolicyVersionStructure.class,
    EntitlementRequiredVersionStructure.class,
    ChargingPolicyVersionStructure.class,
    SuspendingVersionStructure.class,
    RoundTripVersionStructure.class,
    BookingPolicyVersionStructure.class,
    TransferabilityVersionStructure.class,
    ResellingVersionStructure.class,
    RentalPenaltyPolicyVersionStructure.class,
    CancellingVersionStructure.class,
    RentalOptionVersionStructure.class,
    CompanionProfileVersionStructure.class
})
public abstract class UsageParameterVersionStructure
    extends PriceableObjectVersionStructure
{

    @XmlElement(name = "TypeOfUsageParameterRef")
    protected TypeOfUsageParameterRefStructure typeOfUsageParameterRef;
    protected UsageParameterPricesRelStructure prices;

    /**
     * Ruft den Wert der typeOfUsageParameterRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfUsageParameterRefStructure }
     *     
     */
    public TypeOfUsageParameterRefStructure getTypeOfUsageParameterRef() {
        return typeOfUsageParameterRef;
    }

    /**
     * Legt den Wert der typeOfUsageParameterRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfUsageParameterRefStructure }
     *     
     */
    public void setTypeOfUsageParameterRef(TypeOfUsageParameterRefStructure value) {
        this.typeOfUsageParameterRef = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UsageParameterPricesRelStructure }
     *     
     */
    public UsageParameterPricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageParameterPricesRelStructure }
     *     
     */
    public void setPrices(UsageParameterPricesRelStructure value) {
        this.prices = value;
    }

}
