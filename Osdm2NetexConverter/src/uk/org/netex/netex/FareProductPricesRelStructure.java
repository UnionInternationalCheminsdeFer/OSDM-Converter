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
 * Type for a list of FARE PRODUCT PRICEs.
 * 
 * <p>Java-Klasse f�r fareProductPrices_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fareProductPrices_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}FareProductPriceRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}CellRef_Dummy"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}FareProductPrice"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareProductPrices_RelStructure", propOrder = {
    "fareProductPriceRefOrCellRefDummyOrFareProductPrice"
})
public class FareProductPricesRelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "FareProductPrice", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CellRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FareProductPriceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> fareProductPriceRefOrCellRefDummyOrFareProductPrice;

    /**
     * Gets the value of the fareProductPriceRefOrCellRefDummyOrFareProductPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareProductPriceRefOrCellRefDummyOrFareProductPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareProductPriceRefOrCellRefDummyOrFareProductPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FareProductPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link CellRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareProductPriceRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getFareProductPriceRefOrCellRefDummyOrFareProductPrice() {
        if (fareProductPriceRefOrCellRefDummyOrFareProductPrice == null) {
            fareProductPriceRefOrCellRefDummyOrFareProductPrice = new ArrayList<JAXBElement<?>>();
        }
        return this.fareProductPriceRefOrCellRefDummyOrFareProductPrice;
    }

}
