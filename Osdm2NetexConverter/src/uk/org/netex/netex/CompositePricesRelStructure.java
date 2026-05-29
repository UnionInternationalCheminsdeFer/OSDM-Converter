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
 * Type for a list of FARE PRICEs.
 * 
 * <p>Java-Klasse f�r compositePrices_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="compositePrices_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}FarePriceRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}PriceGroupRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}FarePrice_Dummy"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}PriceGroup_Dummy"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compositePrices_RelStructure", propOrder = {
    "farePriceRefOrPriceGroupRefOrFarePriceDummy"
})
public class CompositePricesRelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "PriceGroup_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FarePriceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FarePrice_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PriceGroupRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> farePriceRefOrPriceGroupRefOrFarePriceDummy;

    /**
     * Gets the value of the farePriceRefOrPriceGroupRefOrFarePriceDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farePriceRefOrPriceGroupRefOrFarePriceDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFarePriceRefOrPriceGroupRefOrFarePriceDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ParkingPriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FulfilmentMethodPriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GeographicalIntervalPriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidableElementPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link GeographicalIntervalPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerPurchasePackagePrice }{@code >}
     * {@link JAXBElement }{@code <}{@link CappingRulePriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ControllableElementPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link ControllableElementPriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageParameterPriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceMatrixElementPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link PriceGroupRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeUnitPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link FulfilmentMethodPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeIntervalPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackagePriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FarePrice }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeIntervalPriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareStructureElementPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link FareProductPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfEntitiesVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FarePriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VersionedChildStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GeographicalUnitPriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidableElementPriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SeriesConstraintPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageParameterPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link SeriesConstraintPriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link QualityStructureFactorPriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareStructureElementPriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PriceGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeUnitPriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link QualityStructureFactorPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link CappingRulePrice }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackagePrice }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerPurchasePackagePriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GeographicalUnitPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceMatrixElementPriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareProductPriceRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getFarePriceRefOrPriceGroupRefOrFarePriceDummy() {
        if (farePriceRefOrPriceGroupRefOrFarePriceDummy == null) {
            farePriceRefOrPriceGroupRefOrFarePriceDummy = new ArrayList<JAXBElement<?>>();
        }
        return this.farePriceRefOrPriceGroupRefOrFarePriceDummy;
    }

}
