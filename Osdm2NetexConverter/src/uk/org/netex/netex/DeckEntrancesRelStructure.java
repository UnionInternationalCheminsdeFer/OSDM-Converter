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
 * Type for a list of DECK ENTRANCEs.
 * 
 * <p>Java-Klasse f�r deckEntrances_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="deckEntrances_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}DeckEntranceRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DeckEntrance_Dummy"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deckEntrances_RelStructure", propOrder = {
    "deckEntranceRefOrDeckEntranceDummy"
})
public class DeckEntrancesRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "DeckEntranceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DeckEntrance_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> deckEntranceRefOrDeckEntranceDummy;

    /**
     * Gets the value of the deckEntranceRefOrDeckEntranceDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deckEntranceRefOrDeckEntranceDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeckEntranceRefOrDeckEntranceDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OtherDeckEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckVehicleEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherDeckEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckVehicleEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckComponentVersionStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getDeckEntranceRefOrDeckEntranceDummy() {
        if (deckEntranceRefOrDeckEntranceDummy == null) {
            deckEntranceRefOrDeckEntranceDummy = new ArrayList<JAXBElement<?>>();
        }
        return this.deckEntranceRefOrDeckEntranceDummy;
    }

}
