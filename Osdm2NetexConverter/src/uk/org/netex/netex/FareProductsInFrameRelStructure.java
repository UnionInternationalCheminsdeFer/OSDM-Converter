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
 * Type for containment in frame of FARE PRODUCT.
 * 
 * <p>Java-Klasse f�r fareProductsInFrame_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fareProductsInFrame_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}frameContainmentStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}FareProduct_Dummy" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareProductsInFrame_RelStructure", propOrder = {
    "fareProductDummy"
})
public class FareProductsInFrameRelStructure
    extends FrameContainmentStructure
{

    @XmlElementRef(name = "FareProduct_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends DataManagedObjectStructure>> fareProductDummy;

    /**
     * Gets the value of the fareProductDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareProductDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareProductDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SaleDiscountRight }{@code >}
     * {@link JAXBElement }{@code <}{@link PreassignedFareProduct }{@code >}
     * {@link JAXBElement }{@code <}{@link SupplementProduct }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareProduct }{@code >}
     * {@link JAXBElement }{@code <}{@link AmountOfPriceUnitProduct }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageDiscountRight }{@code >}
     * {@link JAXBElement }{@code <}{@link CappedDiscountRight }{@code >}
     * {@link JAXBElement }{@code <}{@link ThirdPartyProduct }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends DataManagedObjectStructure>> getFareProductDummy() {
        if (fareProductDummy == null) {
            fareProductDummy = new ArrayList<JAXBElement<? extends DataManagedObjectStructure>>();
        }
        return this.fareProductDummy;
    }

}
