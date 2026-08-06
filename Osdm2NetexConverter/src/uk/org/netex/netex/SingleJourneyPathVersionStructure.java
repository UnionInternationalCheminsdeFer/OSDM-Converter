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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for SINGLE JOURNEY PATH. +v1.2.2
 * 
 * <p>Java-Klasse f�r SingleJourneyPath_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SingleJourneyPath_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LinkSequence_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SingleJourneyPathGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleJourneyPath_VersionStructure", propOrder = {
    "routeRef",
    "pointsInSequence"
})
@XmlSeeAlso({
    SingleJourneyPath.class
})
public class SingleJourneyPathVersionStructure
    extends LinkSequenceVersionStructure
{

    @XmlElement(name = "RouteRef")
    protected RouteRefStructure routeRef;
    protected VehicleMeetingPointsInSequenceRelStructure pointsInSequence;

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
     * Ruft den Wert der pointsInSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMeetingPointsInSequenceRelStructure }
     *     
     */
    public VehicleMeetingPointsInSequenceRelStructure getPointsInSequence() {
        return pointsInSequence;
    }

    /**
     * Legt den Wert der pointsInSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMeetingPointsInSequenceRelStructure }
     *     
     */
    public void setPointsInSequence(VehicleMeetingPointsInSequenceRelStructure value) {
        this.pointsInSequence = value;
    }

}
