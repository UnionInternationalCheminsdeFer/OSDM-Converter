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
 * Type for VEHICLE TYPE STOP ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r VehicleTypeStopAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleTypeStopAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}StopAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleTypeStopAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleTypeStopAssignment_VersionStructure", propOrder = {
    "vehicleOrientation",
    "vehicleStoppingPositionRef",
    "vehicleJourneyRef",
    "transportTypeRef"
})
@XmlSeeAlso({
    VehicleTypeStopAssignment.class
})
public class VehicleTypeStopAssignmentVersionStructure
    extends StopAssignmentVersionStructure
{

    @XmlElement(name = "VehicleOrientation", defaultValue = "forwards")
    @XmlSchemaType(name = "normalizedString")
    protected VehicleOrientationEnumeration vehicleOrientation;
    @XmlElement(name = "VehicleStoppingPositionRef")
    protected VehicleStoppingPositionRefStructure vehicleStoppingPositionRef;
    @XmlElementRef(name = "VehicleJourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleJourneyRefStructure> vehicleJourneyRef;
    @XmlElementRef(name = "TransportTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends TransportTypeRefStructure> transportTypeRef;

    /**
     * Ruft den Wert der vehicleOrientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleOrientationEnumeration }
     *     
     */
    public VehicleOrientationEnumeration getVehicleOrientation() {
        return vehicleOrientation;
    }

    /**
     * Legt den Wert der vehicleOrientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleOrientationEnumeration }
     *     
     */
    public void setVehicleOrientation(VehicleOrientationEnumeration value) {
        this.vehicleOrientation = value;
    }

    /**
     * Ruft den Wert der vehicleStoppingPositionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleStoppingPositionRefStructure }
     *     
     */
    public VehicleStoppingPositionRefStructure getVehicleStoppingPositionRef() {
        return vehicleStoppingPositionRef;
    }

    /**
     * Legt den Wert der vehicleStoppingPositionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleStoppingPositionRefStructure }
     *     
     */
    public void setVehicleStoppingPositionRef(VehicleStoppingPositionRefStructure value) {
        this.vehicleStoppingPositionRef = value;
    }

    /**
     * Ruft den Wert der vehicleJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleJourneyRefStructure> getVehicleJourneyRef() {
        return vehicleJourneyRef;
    }

    /**
     * Legt den Wert der vehicleJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     
     */
    public void setVehicleJourneyRef(JAXBElement<? extends VehicleJourneyRefStructure> value) {
        this.vehicleJourneyRef = value;
    }

    /**
     * Ruft den Wert der transportTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportTypeRefStructure> getTransportTypeRef() {
        return transportTypeRef;
    }

    /**
     * Legt den Wert der transportTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     
     */
    public void setTransportTypeRef(JAXBElement<? extends TransportTypeRefStructure> value) {
        this.transportTypeRef = value;
    }

}
