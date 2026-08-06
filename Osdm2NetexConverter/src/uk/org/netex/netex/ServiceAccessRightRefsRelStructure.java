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
 * Type for references to a SERVICE ACCESS RIGHT.
 * 
 * <p>Java-Klasse f�r serviceAccessRightRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="serviceAccessRightRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ServiceAccessRightRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceAccessRightRefs_RelStructure", propOrder = {
    "serviceAccessRightRef"
})
public class ServiceAccessRightRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "ServiceAccessRightRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends ServiceAccessRightRefStructure>> serviceAccessRightRef;

    /**
     * Gets the value of the serviceAccessRightRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceAccessRightRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceAccessRightRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ThirdPartyProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PreassignedFareProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SaleDiscountRightRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageDiscountRightRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CappedDiscountRightRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AmountOfPriceUnitProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SupplementProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceAccessRightRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ServiceAccessRightRefStructure>> getServiceAccessRightRef() {
        if (serviceAccessRightRef == null) {
            serviceAccessRightRef = new ArrayList<JAXBElement<? extends ServiceAccessRightRefStructure>>();
        }
        return this.serviceAccessRightRef;
    }

}
