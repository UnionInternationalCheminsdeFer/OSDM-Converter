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
 * Type for containment in frame of USAGE PARAMETER.
 * 
 * <p>Java-Klasse f�r usageParametersInFrame_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="usageParametersInFrame_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}frameContainmentStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}UsageParameter_Dummy" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usageParametersInFrame_RelStructure", propOrder = {
    "usageParameterDummy"
})
public class UsageParametersInFrameRelStructure
    extends FrameContainmentStructure
{

    @XmlElementRef(name = "UsageParameter_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends DataManagedObjectStructure>> usageParameterDummy;

    /**
     * Gets the value of the usageParameterDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageParameterDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageParameterDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RentalOption }{@code >}
     * {@link JAXBElement }{@code <}{@link AdditionalDriverOption }{@code >}
     * {@link JAXBElement }{@code <}{@link Reselling }{@code >}
     * {@link JAXBElement }{@code <}{@link Routing }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementGiven }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementGiven }{@code >}
     * {@link JAXBElement }{@code <}{@link Refunding }{@code >}
     * {@link JAXBElement }{@code <}{@link Subscribing }{@code >}
     * {@link JAXBElement }{@code <}{@link CompanionProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link UserProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementRequired }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageParameter }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyOfUse }{@code >}
     * {@link JAXBElement }{@code <}{@link MinimumStay }{@code >}
     * {@link JAXBElement }{@code <}{@link Cancelling }{@code >}
     * {@link JAXBElement }{@code <}{@link CommercialProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link RoundTrip }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageAllowance }{@code >}
     * {@link JAXBElement }{@code <}{@link PurchaseWindow }{@code >}
     * {@link JAXBElement }{@code <}{@link EligibilityChangePolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupTicket }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolerProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageValidityPeriod }{@code >}
     * {@link JAXBElement }{@code <}{@link Interchanging }{@code >}
     * {@link JAXBElement }{@code <}{@link BookingPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link Transferability }{@code >}
     * {@link JAXBElement }{@code <}{@link StepLimit }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementRequired }{@code >}
     * {@link JAXBElement }{@code <}{@link Exchanging }{@code >}
     * {@link JAXBElement }{@code <}{@link Suspending }{@code >}
     * {@link JAXBElement }{@code <}{@link RentalPenaltyPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargingPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Reserving }{@code >}
     * {@link JAXBElement }{@code <}{@link PenaltyPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link Replacing }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends DataManagedObjectStructure>> getUsageParameterDummy() {
        if (usageParameterDummy == null) {
            usageParameterDummy = new ArrayList<JAXBElement<? extends DataManagedObjectStructure>>();
        }
        return this.usageParameterDummy;
    }

}
