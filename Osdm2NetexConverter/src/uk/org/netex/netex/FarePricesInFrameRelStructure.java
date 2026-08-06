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
 * Type for containment in frame of FARE Prices.
 * 
 * <p>Java-Klasse f�r farePricesInFrame_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="farePricesInFrame_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}frameContainmentStructure">
 *       &lt;choice maxOccurs="unbounded">
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
@XmlType(name = "farePricesInFrame_RelStructure", propOrder = {
    "priceGroupDummy"
})
public class FarePricesInFrameRelStructure
    extends FrameContainmentStructure
{

    @XmlElementRef(name = "PriceGroup_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends GroupOfEntitiesVersionStructure>> priceGroupDummy;

    /**
     * Gets the value of the priceGroupDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceGroupDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceGroupDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GroupOfEntitiesVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PriceGroup }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends GroupOfEntitiesVersionStructure>> getPriceGroupDummy() {
        if (priceGroupDummy == null) {
            priceGroupDummy = new ArrayList<JAXBElement<? extends GroupOfEntitiesVersionStructure>>();
        }
        return this.priceGroupDummy;
    }

}
