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
 * Type for a list of LOCAL SERVICEs.
 * 
 * <p>Java-Klasse f�r localServices_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="localServices_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}LocalServiceRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}LocalService"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localServices_RelStructure", propOrder = {
    "localServiceRefOrLocalService"
})
public class LocalServicesRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "LocalServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LocalService", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> localServiceRefOrLocalService;

    /**
     * Gets the value of the localServiceRefOrLocalService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localServiceRefOrLocalService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalServiceRefOrLocalService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link LuggageService }{@code >}
     * {@link JAXBElement }{@code <}{@link MeetingPointServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AssistanceServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplaintsService }{@code >}
     * {@link JAXBElement }{@code <}{@link CateringServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalServiceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LeftLuggageServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link HireServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AssistanceBookingService }{@code >}
     * {@link JAXBElement }{@code <}{@link AssistanceBookingServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AssistanceService }{@code >}
     * {@link JAXBElement }{@code <}{@link CommunicationService }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MeetingPointService }{@code >}
     * {@link JAXBElement }{@code <}{@link HireService }{@code >}
     * {@link JAXBElement }{@code <}{@link CommunicationServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LeftLuggageService }{@code >}
     * {@link JAXBElement }{@code <}{@link TicketingService }{@code >}
     * {@link JAXBElement }{@code <}{@link MoneyService }{@code >}
     * {@link JAXBElement }{@code <}{@link LostPropertyService }{@code >}
     * {@link JAXBElement }{@code <}{@link RetailService }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplaintsServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TicketingServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RetailServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LostPropertyServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MoneyServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerServiceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CateringService }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalServiceRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getLocalServiceRefOrLocalService() {
        if (localServiceRefOrLocalService == null) {
            localServiceRefOrLocalService = new ArrayList<JAXBElement<?>>();
        }
        return this.localServiceRefOrLocalService;
    }

}
