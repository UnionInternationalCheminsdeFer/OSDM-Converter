//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a DECK PATH JUNCTION
 * 
 * <p>Java-Klasse f�r DeckPathJunction_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeckPathJunction_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GenericPathJunction_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeckPathJunctionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckPathJunction_VersionStructure", propOrder = {
    "publicUse",
    "covered",
    "gated",
    "lighting",
    "allAreasWheelchairAccessible",
    "personCapacity",
    "presentation",
    "facilities",
    "label",
    "onboardSpaceRef"
})
@XmlSeeAlso({
    DeckPathJunction.class
})
public class DeckPathJunctionVersionStructure
    extends GenericPathJunctionVersionStructure
{

    @XmlElement(name = "PublicUse", defaultValue = "all")
    @XmlSchemaType(name = "string")
    protected PublicUseEnumeration publicUse;
    @XmlElement(name = "Covered", defaultValue = "indoors")
    @XmlSchemaType(name = "string")
    protected CoveredEnumeration covered;
    @XmlElement(name = "Gated")
    @XmlSchemaType(name = "string")
    protected GatedEnumeration gated;
    @XmlElement(name = "Lighting", defaultValue = "wellLit")
    @XmlSchemaType(name = "normalizedString")
    protected LightingEnumeration lighting;
    @XmlElement(name = "AllAreasWheelchairAccessible", defaultValue = "true")
    protected Boolean allAreasWheelchairAccessible;
    @XmlElement(name = "PersonCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personCapacity;
    @XmlElement(name = "Presentation")
    protected PresentationStructure presentation;
    protected ServiceFacilitySetsRelStructure facilities;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElementRef(name = "OnboardSpaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends OnboardSpaceRefStructure> onboardSpaceRef;

    /**
     * Ruft den Wert der publicUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicUseEnumeration }
     *     
     */
    public PublicUseEnumeration getPublicUse() {
        return publicUse;
    }

    /**
     * Legt den Wert der publicUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicUseEnumeration }
     *     
     */
    public void setPublicUse(PublicUseEnumeration value) {
        this.publicUse = value;
    }

    /**
     * Ruft den Wert der covered-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoveredEnumeration }
     *     
     */
    public CoveredEnumeration getCovered() {
        return covered;
    }

    /**
     * Legt den Wert der covered-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoveredEnumeration }
     *     
     */
    public void setCovered(CoveredEnumeration value) {
        this.covered = value;
    }

    /**
     * Ruft den Wert der gated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GatedEnumeration }
     *     
     */
    public GatedEnumeration getGated() {
        return gated;
    }

    /**
     * Legt den Wert der gated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GatedEnumeration }
     *     
     */
    public void setGated(GatedEnumeration value) {
        this.gated = value;
    }

    /**
     * Ruft den Wert der lighting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LightingEnumeration }
     *     
     */
    public LightingEnumeration getLighting() {
        return lighting;
    }

    /**
     * Legt den Wert der lighting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LightingEnumeration }
     *     
     */
    public void setLighting(LightingEnumeration value) {
        this.lighting = value;
    }

    /**
     * Ruft den Wert der allAreasWheelchairAccessible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllAreasWheelchairAccessible() {
        return allAreasWheelchairAccessible;
    }

    /**
     * Legt den Wert der allAreasWheelchairAccessible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllAreasWheelchairAccessible(Boolean value) {
        this.allAreasWheelchairAccessible = value;
    }

    /**
     * Ruft den Wert der personCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonCapacity() {
        return personCapacity;
    }

    /**
     * Legt den Wert der personCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonCapacity(BigInteger value) {
        this.personCapacity = value;
    }

    /**
     * Ruft den Wert der presentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PresentationStructure }
     *     
     */
    public PresentationStructure getPresentation() {
        return presentation;
    }

    /**
     * Legt den Wert der presentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationStructure }
     *     
     */
    public void setPresentation(PresentationStructure value) {
        this.presentation = value;
    }

    /**
     * Ruft den Wert der facilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFacilitySetsRelStructure }
     *     
     */
    public ServiceFacilitySetsRelStructure getFacilities() {
        return facilities;
    }

    /**
     * Legt den Wert der facilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFacilitySetsRelStructure }
     *     
     */
    public void setFacilities(ServiceFacilitySetsRelStructure value) {
        this.facilities = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
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

}
