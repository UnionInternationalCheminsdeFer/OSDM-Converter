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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of DISTANCE MATRIX ELEMENT PRICEs.
 * 
 * <p>Java-Klasse f�r distanceMatrixElementPrices_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="distanceMatrixElementPrices_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}DistanceMatrixElementPriceRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DistanceMatrixElementPrice"/>
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
@XmlType(name = "distanceMatrixElementPrices_RelStructure", propOrder = {
    "distanceMatrixElementPriceRefOrDistanceMatrixElementPriceOrCellRefDummy"
})
@XmlSeeAlso({
    uk.org.netex.netex.GroupOfDistanceMatrixElementsVersionStructure.Prices.class
})
public class DistanceMatrixElementPricesRelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "DistanceMatrixElementPrice", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CellRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DistanceMatrixElementPriceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> distanceMatrixElementPriceRefOrDistanceMatrixElementPriceOrCellRefDummy;

    /**
     * Gets the value of the distanceMatrixElementPriceRefOrDistanceMatrixElementPriceOrCellRefDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distanceMatrixElementPriceRefOrDistanceMatrixElementPriceOrCellRefDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistanceMatrixElementPriceRefOrDistanceMatrixElementPriceOrCellRefDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DistanceMatrixElementPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link CellRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceMatrixElementPriceRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getDistanceMatrixElementPriceRefOrDistanceMatrixElementPriceOrCellRefDummy() {
        if (distanceMatrixElementPriceRefOrDistanceMatrixElementPriceOrCellRefDummy == null) {
            distanceMatrixElementPriceRefOrDistanceMatrixElementPriceOrCellRefDummy = new ArrayList<JAXBElement<?>>();
        }
        return this.distanceMatrixElementPriceRefOrDistanceMatrixElementPriceOrCellRefDummy;
    }

}
