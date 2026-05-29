//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a POINT ON LINK.
 * 
 * <p>Java-Klasse f�r PointOnLink_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointOnLink_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PointOnLinkGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOnLink_VersionedChildStructure", propOrder = {
    "name",
    "linkRef",
    "distanceFromStart",
    "pointRef",
    "point"
})
@XmlSeeAlso({
    PointOnLink.class
})
public class PointOnLinkVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "LinkRef")
    protected LinkRefStructure linkRef;
    @XmlElement(name = "DistanceFromStart")
    protected BigDecimal distanceFromStart;
    @XmlElementRef(name = "PointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PointRefStructure> pointRef;
    @XmlElementRef(name = "Point", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PointVersionStructure> point;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der linkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinkRefStructure }
     *     
     */
    public LinkRefStructure getLinkRef() {
        return linkRef;
    }

    /**
     * Legt den Wert der linkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkRefStructure }
     *     
     */
    public void setLinkRef(LinkRefStructure value) {
        this.linkRef = value;
    }

    /**
     * Ruft den Wert der distanceFromStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistanceFromStart() {
        return distanceFromStart;
    }

    /**
     * Legt den Wert der distanceFromStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistanceFromStart(BigDecimal value) {
        this.distanceFromStart = value;
    }

    /**
     * Ruft den Wert der pointRef-Eigenschaft ab.
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
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
