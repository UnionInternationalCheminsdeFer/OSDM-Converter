//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for TIMING PATTERN.
 * 
 * <p>Java-Klasse f�r TimingPattern_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimingPattern_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LinkSequence_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimingPatternGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimingPattern_VersionStructure", propOrder = {
    "routeRef",
    "directionType",
    "timeDemandTypeRef",
    "timebandRef",
    "pointsInSequence",
    "points",
    "links"
})
@XmlSeeAlso({
    TimingPattern.class
})
public class TimingPatternVersionStructure
    extends LinkSequenceVersionStructure
{

    @XmlElement(name = "RouteRef")
    protected RouteRefStructure routeRef;
    @XmlElement(name = "DirectionType", defaultValue = "outbound")
    @XmlSchemaType(name = "normalizedString")
    protected DirectionTypeEnumeration directionType;
    @XmlElement(name = "TimeDemandTypeRef")
    protected TimeDemandTypeRefStructure timeDemandTypeRef;
    @XmlElement(name = "TimebandRef")
    protected TimebandRefStructure timebandRef;
    protected TimingPointsInJourneyPatternRelStructure pointsInSequence;
    protected TimingPointsRelStructure points;
    protected TimingLinksRelStructure links;

    /**
     * Ruft den Wert der routeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RouteRefStructure }
     *     
     */
    public RouteRefStructure getRouteRef() {
        return routeRef;
    }

    /**
     * Legt den Wert der routeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteRefStructure }
     *     
     */
    public void setRouteRef(RouteRefStructure value) {
        this.routeRef = value;
    }

    /**
     * Ruft den Wert der directionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionTypeEnumeration }
     *     
     */
    public DirectionTypeEnumeration getDirectionType() {
        return directionType;
    }

    /**
     * Legt den Wert der directionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionTypeEnumeration }
     *     
     */
    public void setDirectionType(DirectionTypeEnumeration value) {
        this.directionType = value;
    }

    /**
     * Ruft den Wert der timeDemandTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeDemandTypeRefStructure }
     *     
     */
    public TimeDemandTypeRefStructure getTimeDemandTypeRef() {
        return timeDemandTypeRef;
    }

    /**
     * Legt den Wert der timeDemandTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDemandTypeRefStructure }
     *     
     */
    public void setTimeDemandTypeRef(TimeDemandTypeRefStructure value) {
        this.timeDemandTypeRef = value;
    }

    /**
     * Ruft den Wert der timebandRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimebandRefStructure }
     *     
     */
    public TimebandRefStructure getTimebandRef() {
        return timebandRef;
    }

    /**
     * Legt den Wert der timebandRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimebandRefStructure }
     *     
     */
    public void setTimebandRef(TimebandRefStructure value) {
        this.timebandRef = value;
    }

    /**
     * Ruft den Wert der pointsInSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingPointsInJourneyPatternRelStructure }
     *     
     */
    public TimingPointsInJourneyPatternRelStructure getPointsInSequence() {
        return pointsInSequence;
    }

    /**
     * Legt den Wert der pointsInSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPointsInJourneyPatternRelStructure }
     *     
     */
    public void setPointsInSequence(TimingPointsInJourneyPatternRelStructure value) {
        this.pointsInSequence = value;
    }

    /**
     * Ruft den Wert der points-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingPointsRelStructure }
     *     
     */
    public TimingPointsRelStructure getPoints() {
        return points;
    }

    /**
     * Legt den Wert der points-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPointsRelStructure }
     *     
     */
    public void setPoints(TimingPointsRelStructure value) {
        this.points = value;
    }

    /**
     * Ruft den Wert der links-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingLinksRelStructure }
     *     
     */
    public TimingLinksRelStructure getLinks() {
        return links;
    }

    /**
     * Legt den Wert der links-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingLinksRelStructure }
     *     
     */
    public void setLinks(TimingLinksRelStructure value) {
        this.links = value;
    }

}
