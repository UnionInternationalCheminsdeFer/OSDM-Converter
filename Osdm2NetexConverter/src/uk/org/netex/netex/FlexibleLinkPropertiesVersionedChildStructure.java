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


/**
 * Type for FLEXIBLE LINK PROPERTies.
 * 
 * <p>Java-Klasse f�r FlexibleLinkProperties_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlexibleLinkProperties_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FlexibleLinkPropertiesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleLinkProperties_VersionedChildStructure", propOrder = {
    "linkRef",
    "mayBeSkipped",
    "onMainRoute",
    "unscheduledPath",
    "flexibleLinkType"
})
@XmlSeeAlso({
    FlexibleLinkProperties.class
})
public class FlexibleLinkPropertiesVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElementRef(name = "LinkRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LinkRefStructure> linkRef;
    @XmlElement(name = "MayBeSkipped")
    protected Boolean mayBeSkipped;
    @XmlElement(name = "OnMainRoute")
    protected Boolean onMainRoute;
    @XmlElement(name = "UnscheduledPath")
    protected Boolean unscheduledPath;
    @XmlElement(name = "FlexibleLinkType")
    @XmlSchemaType(name = "string")
    protected FlexibleLinkTypeEnumeration flexibleLinkType;

    /**
     * Ruft den Wert der linkRef-Eigenschaft ab.
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
     * Ruft den Wert der mayBeSkipped-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMayBeSkipped() {
        return mayBeSkipped;
    }

    /**
     * Legt den Wert der mayBeSkipped-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMayBeSkipped(Boolean value) {
        this.mayBeSkipped = value;
    }

    /**
     * Ruft den Wert der onMainRoute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnMainRoute() {
        return onMainRoute;
    }

    /**
     * Legt den Wert der onMainRoute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnMainRoute(Boolean value) {
        this.onMainRoute = value;
    }

    /**
     * Ruft den Wert der unscheduledPath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnscheduledPath() {
        return unscheduledPath;
    }

    /**
     * Legt den Wert der unscheduledPath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnscheduledPath(Boolean value) {
        this.unscheduledPath = value;
    }

    /**
     * Ruft den Wert der flexibleLinkType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleLinkTypeEnumeration }
     *     
     */
    public FlexibleLinkTypeEnumeration getFlexibleLinkType() {
        return flexibleLinkType;
    }

    /**
     * Legt den Wert der flexibleLinkType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleLinkTypeEnumeration }
     *     
     */
    public void setFlexibleLinkType(FlexibleLinkTypeEnumeration value) {
        this.flexibleLinkType = value;
    }

}
