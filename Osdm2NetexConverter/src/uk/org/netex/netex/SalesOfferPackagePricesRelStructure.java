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
 * Type for a list of SALES OFFER PACKAGE PRICEs.
 * 
 * <p>Java-Klasse f�r salesOfferPackagePrices_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="salesOfferPackagePrices_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}SalesOfferPackagePriceRef"/>
 *         &lt;element name="SalesOfferPackagePrice" type="{http://www.netex.org.uk/netex}SalesOfferPackagePrice_VersionedChildStructure"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}CellRef_Dummy"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesOfferPackagePrices_RelStructure", propOrder = {
    "salesOfferPackagePriceRefOrSalesOfferPackagePriceOrCellRefDummy"
})
public class SalesOfferPackagePricesRelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "SalesOfferPackagePriceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SalesOfferPackagePrice", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CellRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> salesOfferPackagePriceRefOrSalesOfferPackagePriceOrCellRefDummy;

    /**
     * Gets the value of the salesOfferPackagePriceRefOrSalesOfferPackagePriceOrCellRefDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOfferPackagePriceRefOrSalesOfferPackagePriceOrCellRefDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOfferPackagePriceRefOrSalesOfferPackagePriceOrCellRefDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SalesOfferPackagePriceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackagePriceVersionedChildStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CellRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getSalesOfferPackagePriceRefOrSalesOfferPackagePriceOrCellRefDummy() {
        if (salesOfferPackagePriceRefOrSalesOfferPackagePriceOrCellRefDummy == null) {
            salesOfferPackagePriceRefOrSalesOfferPackagePriceOrCellRefDummy = new ArrayList<JAXBElement<?>>();
        }
        return this.salesOfferPackagePriceRefOrSalesOfferPackagePriceOrCellRefDummy;
    }

}
