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
 * Type for a list of DECK SPACEs.
 * 
 * <p>Java-Klasse f�r deckSpaces_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="deckSpaces_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}DeckSpaceRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DeckSpace_Dummy"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deckSpaces_RelStructure", propOrder = {
    "deckSpaceRefOrDeckSpaceDummy"
})
public class DeckSpacesRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "DeckSpace_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DeckSpaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> deckSpaceRefOrDeckSpaceDummy;

    /**
     * Gets the value of the deckSpaceRefOrDeckSpaceDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deckSpaceRefOrDeckSpaceDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeckSpaceRefOrDeckSpaceDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PassengerSpace }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherDeckSpaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckSpaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherDeckSpace }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerSpaceRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getDeckSpaceRefOrDeckSpaceDummy() {
        if (deckSpaceRefOrDeckSpaceDummy == null) {
            deckSpaceRefOrDeckSpaceDummy = new ArrayList<JAXBElement<?>>();
        }
        return this.deckSpaceRefOrDeckSpaceDummy;
    }

}
