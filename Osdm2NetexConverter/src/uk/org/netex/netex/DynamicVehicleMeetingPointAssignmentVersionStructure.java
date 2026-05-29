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
 * Type for DYNAMIC VEHICLE MEETING POINT ASSIGNMENT restricts id.
 * 
 * <p>Java-Klasse f�r DynamicVehicleMeetingPointAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DynamicVehicleMeetingPointAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleMeetingPointAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DynamicVehicleMeetingPointAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicVehicleMeetingPointAssignment_VersionStructure", propOrder = {
    "vehicleMeetingPointAssignmentRef"
})
@XmlSeeAlso({
    DynamicVehicleMeetingPointAssignment.class
})
public class DynamicVehicleMeetingPointAssignmentVersionStructure
    extends VehicleMeetingPointAssignmentVersionStructure
{

    @XmlElementRef(name = "VehicleMeetingPointAssignmentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends VehicleMeetingPointAssignmentRefStructure> vehicleMeetingPointAssignmentRef;

    /**
     * Ruft den Wert der vehicleMeetingPointAssignmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DynamicVehicleMeetingPointAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingPointAssignmentRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleMeetingPointAssignmentRefStructure> getVehicleMeetingPointAssignmentRef() {
        return vehicleMeetingPointAssignmentRef;
    }

    /**
     * Legt den Wert der vehicleMeetingPointAssignmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DynamicVehicleMeetingPointAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingPointAssignmentRefStructure }{@code >}
     *     
     */
    public void setVehicleMeetingPointAssignmentRef(JAXBElement<? extends VehicleMeetingPointAssignmentRefStructure> value) {
        this.vehicleMeetingPointAssignmentRef = value;
    }

}
