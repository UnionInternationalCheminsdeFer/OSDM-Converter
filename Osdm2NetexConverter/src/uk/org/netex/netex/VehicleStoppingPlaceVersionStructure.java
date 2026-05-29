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
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a VEHICLE STOPPING PLACE.
 * 
 * <p>Java-Klasse f�r VehicleStoppingPlace_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleStoppingPlace_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}StopPlaceSpace_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleStoppingPlaceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleStoppingPlace_VersionStructure", propOrder = {
    "infrastructureLinkRef",
    "infrastructurePointRef",
    "vehicleStoppingPositions",
    "quayAlignments"
})
@XmlSeeAlso({
    VehicleStoppingPlace.class
})
public class VehicleStoppingPlaceVersionStructure
    extends StopPlaceSpaceVersionStructure
{

    @XmlElementRef(name = "InfrastructureLinkRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends InfrastructureLinkRefStructure> infrastructureLinkRef;
    @XmlElementRef(name = "InfrastructurePointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends InfrastructurePointRefStructure> infrastructurePointRef;
    protected VehicleStoppingPositionsRelStructure vehicleStoppingPositions;
    protected VehicleQuayAlignmentsRelStructure quayAlignments;

    /**
     * Ruft den Wert der infrastructureLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayLinkRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends InfrastructureLinkRefStructure> getInfrastructureLinkRef() {
        return infrastructureLinkRef;
    }

    /**
     * Legt den Wert der infrastructureLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayLinkRefStructure }{@code >}
     *     
     */
    public void setInfrastructureLinkRef(JAXBElement<? extends InfrastructureLinkRefStructure> value) {
        this.infrastructureLinkRef = value;
    }

    /**
     * Ruft den Wert der infrastructurePointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoadPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructurePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WirePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayPointRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends InfrastructurePointRefStructure> getInfrastructurePointRef() {
        return infrastructurePointRef;
    }

    /**
     * Legt den Wert der infrastructurePointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoadPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructurePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WirePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayPointRefStructure }{@code >}
     *     
     */
    public void setInfrastructurePointRef(JAXBElement<? extends InfrastructurePointRefStructure> value) {
        this.infrastructurePointRef = value;
    }

    /**
     * Ruft den Wert der vehicleStoppingPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleStoppingPositionsRelStructure }
     *     
     */
    public VehicleStoppingPositionsRelStructure getVehicleStoppingPositions() {
        return vehicleStoppingPositions;
    }

    /**
     * Legt den Wert der vehicleStoppingPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleStoppingPositionsRelStructure }
     *     
     */
    public void setVehicleStoppingPositions(VehicleStoppingPositionsRelStructure value) {
        this.vehicleStoppingPositions = value;
    }

    /**
     * Ruft den Wert der quayAlignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleQuayAlignmentsRelStructure }
     *     
     */
    public VehicleQuayAlignmentsRelStructure getQuayAlignments() {
        return quayAlignments;
    }

    /**
     * Legt den Wert der quayAlignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleQuayAlignmentsRelStructure }
     *     
     */
    public void setQuayAlignments(VehicleQuayAlignmentsRelStructure value) {
        this.quayAlignments = value;
    }

}
