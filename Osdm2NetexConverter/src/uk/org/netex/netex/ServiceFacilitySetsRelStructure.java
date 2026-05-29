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
 * SERVICE FACILITY SETs associated with entity.
 * 
 * <p>Java-Klasse f�r serviceFacilitySets_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="serviceFacilitySets_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}ServiceFacilitySetRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ServiceFacilitySet"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceFacilitySets_RelStructure", propOrder = {
    "serviceFacilitySetRefOrServiceFacilitySet"
})
public class ServiceFacilitySetsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "ServiceFacilitySetRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ServiceFacilitySet", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> serviceFacilitySetRefOrServiceFacilitySet;

    /**
     * Gets the value of the serviceFacilitySetRefOrServiceFacilitySet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFacilitySetRefOrServiceFacilitySet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFacilitySetRefOrServiceFacilitySet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RestrictedServiceFacilitySetRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceFacilitySet }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getServiceFacilitySetRefOrServiceFacilitySet() {
        if (serviceFacilitySetRefOrServiceFacilitySet == null) {
            serviceFacilitySetRefOrServiceFacilitySet = new ArrayList<JAXBElement<?>>();
        }
        return this.serviceFacilitySetRefOrServiceFacilitySet;
    }

}
