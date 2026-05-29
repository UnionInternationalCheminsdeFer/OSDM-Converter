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
 * Type for a POINT on a SECTION.
 * 
 * <p>Java-Klasse f�r PointOnSection_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointOnSection_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PointInLinkSequence_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.netex.org.uk/netex}PointRef"/>
 *           &lt;element ref="{http://www.netex.org.uk/netex}Point"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.netex.org.uk/netex}LinkRef" minOccurs="0"/>
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
@XmlType(name = "PointOnSection_VersionedChildStructure", propOrder = {
    "pointRef",
    "point",
    "linkRef",
    "reverse"
})
@XmlSeeAlso({
    PointOnSection.class,
    PointOnLineSectionVersionedChildStructure.class
})
public class PointOnSectionVersionedChildStructure
    extends PointInLinkSequenceVersionedChildStructure
{

    @XmlElementRef(name = "PointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PointRefStructure> pointRef;
    @XmlElementRef(name = "Point", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PointVersionStructure> point;
    @XmlElementRef(name = "LinkRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LinkRefStructure> linkRef;
    @XmlElement(name = "Reverse")
    protected Boolean reverse;

    /**
     * Reference to a POINT.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficControlPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BeaconPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WirePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BorderPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOnLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructurePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends PointRefStructure> getPointRef() {
        return pointRef;
    }

    /**
     * Legt den Wert der pointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficControlPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BeaconPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WirePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BorderPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOnLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructurePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     *     
     */
    public void setPointRef(JAXBElement<? extends PointRefStructure> value) {
        this.pointRef = value;
    }

    /**
     * Ruft den Wert der point-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimingPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BorderPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructurePointVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WireJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckPathJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link BeaconPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficControlPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutePoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPoint }{@code >}
     *     
     */
    public JAXBElement<? extends PointVersionStructure> getPoint() {
        return point;
    }

    /**
     * Legt den Wert der point-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimingPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BorderPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructurePointVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WireJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckPathJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link BeaconPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficControlPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutePoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPoint }{@code >}
     *     
     */
    public void setPoint(JAXBElement<? extends PointVersionStructure> value) {
        this.point = value;
    }

    /**
     * Reference to a LINK.
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
