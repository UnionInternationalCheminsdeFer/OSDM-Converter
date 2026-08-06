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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Beginning or end of a DECK PATH LINK, referencing a DECK COMPONENT or LOCATABLE SPOT. May be linked to a specific DECK LEVEL. +V2.0
 * 
 * <p>Java-Klasse f�r DeckPathLinkEndStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeckPathLinkEndStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DeckRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DeckLevelRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}OnboardSpaceRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DeckPathJunctionRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckPathLinkEndStructure", propOrder = {
    "deckRef",
    "deckLevelRef",
    "onboardSpaceRef",
    "deckPathJunctionRef"
})
public class DeckPathLinkEndStructure {

    @XmlElement(name = "DeckRef")
    protected DeckRefStructure deckRef;
    @XmlElement(name = "DeckLevelRef")
    protected DeckLevelRefStructure deckLevelRef;
    @XmlElementRef(name = "OnboardSpaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OnboardSpaceRefStructure> onboardSpaceRef;
    @XmlElement(name = "DeckPathJunctionRef")
    protected GenericPathJunctionRefStructure deckPathJunctionRef;

    /**
     * Ruft den Wert der deckRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckRefStructure }
     *     
     */
    public DeckRefStructure getDeckRef() {
        return deckRef;
    }

    /**
     * Legt den Wert der deckRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckRefStructure }
     *     
     */
    public void setDeckRef(DeckRefStructure value) {
        this.deckRef = value;
    }

    /**
     * Ruft den Wert der deckLevelRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckLevelRefStructure }
     *     
     */
    public DeckLevelRefStructure getDeckLevelRef() {
        return deckLevelRef;
    }

    /**
     * Legt den Wert der deckLevelRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckLevelRefStructure }
     *     
     */
    public void setDeckLevelRef(DeckLevelRefStructure value) {
        this.deckLevelRef = value;
    }

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
     * Ruft den Wert der deckPathJunctionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenericPathJunctionRefStructure }
     *     
     */
    public GenericPathJunctionRefStructure getDeckPathJunctionRef() {
        return deckPathJunctionRef;
    }

    /**
     * Legt den Wert der deckPathJunctionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPathJunctionRefStructure }
     *     
     */
    public void setDeckPathJunctionRef(GenericPathJunctionRefStructure value) {
        this.deckPathJunctionRef = value;
    }

}
