//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for a DECK PLACE IN SEQUENCE.
 * 
 * <p>Java-Klasse f�r DeckPlaceInSequence_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeckPlaceInSequence_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PointInLinkSequence_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeckPlaceInSequenceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckPlaceInSequence_VersionedChildStructure", propOrder = {
    "onboardSpaceRef",
    "deckPathJunction",
    "branchLevel",
    "onwardLinks"
})
@XmlSeeAlso({
    DeckPlaceInSequence.class
})
public class DeckPlaceInSequenceVersionedChildStructure
    extends PointInLinkSequenceVersionedChildStructure
{

    @XmlElementRef(name = "OnboardSpaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OnboardSpaceRefStructure> onboardSpaceRef;
    @XmlElement(name = "DeckPathJunction")
    protected DeckPathJunction deckPathJunction;
    @XmlElement(name = "BranchLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String branchLevel;
    protected PathLinksInSequenceRelStructure onwardLinks;

    /**
     * Ruft den Wert der onboardSpaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OtherDeckSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckComponentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerVehicleSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnboardSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherDeckEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckWindowRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocatableSpotRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends OnboardSpaceRefStructure> getOnboardSpaceRef() {
        return onboardSpaceRef;
    }

    /**
     * Legt den Wert der onboardSpaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OtherDeckSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckComponentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerVehicleSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnboardSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherDeckEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckWindowRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocatableSpotRefStructure }{@code >}
     *     
     */
    public void setOnboardSpaceRef(JAXBElement<? extends OnboardSpaceRefStructure> value) {
        this.onboardSpaceRef = value;
    }

    /**
     * Ruft den Wert der deckPathJunction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckPathJunction }
     *     
     */
    public DeckPathJunction getDeckPathJunction() {
        return deckPathJunction;
    }

    /**
     * Legt den Wert der deckPathJunction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckPathJunction }
     *     
     */
    public void setDeckPathJunction(DeckPathJunction value) {
        this.deckPathJunction = value;
    }

    /**
     * Ruft den Wert der branchLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchLevel() {
        return branchLevel;
    }

    /**
     * Legt den Wert der branchLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchLevel(String value) {
        this.branchLevel = value;
    }

    /**
     * Ruft den Wert der onwardLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathLinksInSequenceRelStructure }
     *     
     */
    public PathLinksInSequenceRelStructure getOnwardLinks() {
        return onwardLinks;
    }

    /**
     * Legt den Wert der onwardLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathLinksInSequenceRelStructure }
     *     
     */
    public void setOnwardLinks(PathLinksInSequenceRelStructure value) {
        this.onwardLinks = value;
    }

}
