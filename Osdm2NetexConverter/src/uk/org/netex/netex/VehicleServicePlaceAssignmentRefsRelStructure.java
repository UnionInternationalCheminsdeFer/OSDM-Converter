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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of VEHICLE SERVICE PLACE ASSIGNMENTs. +v1.2.2
 * 
 * <p>Java-Klasse f�r vehicleServicePlaceAssignmentRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehicleServicePlaceAssignmentRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}VehicleServicePlaceAssignmentRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleServicePlaceAssignmentRefs_RelStructure", propOrder = {
    "vehicleServicePlaceAssignmentRef"
})
public class VehicleServicePlaceAssignmentRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "VehicleServicePlaceAssignmentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends VehicleServicePlaceAssignmentRefStructure> vehicleServicePlaceAssignmentRef;

    /**
     * Ruft den Wert der vehicleServicePlaceAssignmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxiServicePlaceAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingPlaceAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingPlaceAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleServicePlaceAssignmentRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleServicePlaceAssignmentRefStructure> getVehicleServicePlaceAssignmentRef() {
        return vehicleServicePlaceAssignmentRef;
    }

    /**
     * Legt den Wert der vehicleServicePlaceAssignmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxiServicePlaceAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingPlaceAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingPlaceAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleServicePlaceAssignmentRefStructure }{@code >}
     *     
     */
    public void setVehicleServicePlaceAssignmentRef(JAXBElement<? extends VehicleServicePlaceAssignmentRefStructure> value) {
        this.vehicleServicePlaceAssignmentRef = value;
    }

}
