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
 * Type for a list of FLEXIBLE QUAYs.
 * 
 * <p>Java-Klasse f�r flexibleQuays_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="flexibleQuays_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}FlexibleQuayRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}FlexibleQuay"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flexibleQuays_RelStructure", propOrder = {
    "flexibleQuayRefOrFlexibleQuay"
})
public class FlexibleQuaysRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "FlexibleQuayRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FlexibleQuay", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> flexibleQuayRefOrFlexibleQuay;

    /**
     * Gets the value of the flexibleQuayRefOrFlexibleQuay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flexibleQuayRefOrFlexibleQuay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlexibleQuayRefOrFlexibleQuay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link HailAndRideAreaRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleQuayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleAreaRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleQuay }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getFlexibleQuayRefOrFlexibleQuay() {
        if (flexibleQuayRefOrFlexibleQuay == null) {
            flexibleQuayRefOrFlexibleQuay = new ArrayList<JAXBElement<?>>();
        }
        return this.flexibleQuayRefOrFlexibleQuay;
    }

}
