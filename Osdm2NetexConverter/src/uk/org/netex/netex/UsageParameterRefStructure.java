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
 * Type for Reference to a USAGE PARAMETER.
 * 
 * <p>Java-Klasse f�r UsageParameterRefStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UsageParameterRefStructure">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.netex.org.uk/netex>PriceableObjectRefStructure">
 *       &lt;attGroup ref="{http://www.netex.org.uk/netex}ReferenceModificationDetailsGroup"/>
 *       &lt;attribute name="ref" use="required" type="{http://www.netex.org.uk/netex}UsageParameterIdType" />
 *       &lt;attribute name="nameOfRefClass" type="{http://www.netex.org.uk/netex}NameOfClassUsageParameterRefStructureType" />
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
@XmlType(name = "UsageParameterRefStructure")
@XmlSeeAlso({
    EntitlementRequiredRefStructure.class,
    FrequencyOfUseRefStructure.class,
    MinimumStayRefStructure.class,
    UsageValidityPeriodRefStructure.class,
    TransferabilityRefStructure.class,
    CommercialProfileRefStructure.class,
    InterchangingRefStructure.class,
    RoundTripRefStructure.class,
    RentalOptionRefStructure.class,
    EntitlementGivenRefStructure.class,
    SalesOfferPackageEntitlementGivenRefStructure.class,
    StepLimitRefStructure.class,
    LuggageAllowanceRefStructure.class,
    SalesOfferPackageEntitlementRequiredRefStructure.class,
    SuspendingRefStructure.class,
    RoutingRefStructure.class,
    UserProfileRefStructure.class,
    EligibilityChangePolicyRefStructure.class,
    PurchaseWindowRefStructure.class,
    RentalPenaltyPolicyRefStructure.class,
    ResellingRefStructure.class,
    BookingPolicyRefStructure.class,
    PenaltyPolicyRefStructure.class,
    GroupTicketRefStructure.class,
    SubscribingRefStructure.class,
    ChargingPolicyRefStructure.class
})
public class UsageParameterRefStructure
    extends PriceableObjectRefStructure
{


}
