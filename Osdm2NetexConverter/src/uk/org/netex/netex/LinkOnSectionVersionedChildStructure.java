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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a LINK on a SECTION. +v1.1.
 * 
 * <p>Java-Klasse f�r LinkOnSection_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LinkOnSection_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LinkInLinkSequence_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.netex.org.uk/netex}LinkRef"/>
 *           &lt;element ref="{http://www.netex.org.uk/netex}Link"/>
 *         &lt;/choice>
 *         &lt;element name="Reverse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkOnSection_VersionedChildStructure", propOrder = {
    "linkRef",
    "link",
    "reverse"
})
@XmlSeeAlso({
    LinkOnSection.class
})
public class LinkOnSectionVersionedChildStructure
    extends LinkInLinkSequenceVersionedChildStructure
{

    @XmlElementRef(name = "LinkRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LinkRefStructure> linkRef;
    @XmlElementRef(name = "Link", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LinkVersionStructure> link;
    @XmlElement(name = "Reverse")
    protected Boolean reverse;

    /**
     * Reference to a Link.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WireLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckPathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OffSitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingLinkRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LinkRefStructure> getLinkRef() {
        return linkRef;
    }

    /**
     * Legt den Wert der linkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WireLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckPathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OffSitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingLinkRefStructure }{@code >}
     *     
     */
    public void setLinkRef(JAXBElement<? extends LinkRefStructure> value) {
        this.linkRef = value;
    }

    /**
     * Ruft den Wert der link-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OffSitePathLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckPathLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLink }{@code >}
     *     
     */
    public JAXBElement<? extends LinkVersionStructure> getLink() {
        return link;
    }

    /**
     * Legt den Wert der link-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OffSitePathLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckPathLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLink }{@code >}
     *     
     */
    public void setLink(JAXBElement<? extends LinkVersionStructure> value) {
        this.link = value;
    }

    /**
     * Ruft den Wert der reverse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverse() {
        return reverse;
    }

    /**
     * Legt den Wert der reverse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverse(Boolean value) {
        this.reverse = value;
    }

}
