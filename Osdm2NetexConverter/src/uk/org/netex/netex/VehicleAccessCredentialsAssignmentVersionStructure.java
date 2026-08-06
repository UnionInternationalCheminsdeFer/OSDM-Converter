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
 * Type for VEHICLE ACCESS CREDENTIALs ASSIGNMENT restricts id.
 * 
 * <p>Java-Klasse f�r VehicleAccessCredentialsAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleAccessCredentialsAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleAccessCredentialsAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAccessCredentialsAssignment_VersionStructure", propOrder = {
    "commonVehicleServiceRef",
    "vehicleRef",
    "mediumAccessDeviceRef",
    "serviceAccessCodeRef"
})
@XmlSeeAlso({
    VehicleAccessCredentialsAssignment.class
})
public class VehicleAccessCredentialsAssignmentVersionStructure
    extends AssignmentVersionStructure
{

    @XmlElementRef(name = "CommonVehicleServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends CommonVehicleServiceRefStructure> commonVehicleServiceRef;
    @XmlElementRef(name = "VehicleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleRefStructure> vehicleRef;
    @XmlElementRef(name = "MediumAccessDeviceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends MediumAccessDeviceRefStructure> mediumAccessDeviceRef;
    @XmlElement(name = "ServiceAccessCodeRef", required = true)
    protected ServiceAccessCodeRefStructure serviceAccessCodeRef;

    /**
     * Ruft den Wert der commonVehicleServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends CommonVehicleServiceRefStructure> getCommonVehicleServiceRef() {
        return commonVehicleServiceRef;
    }

    /**
     * Legt den Wert der commonVehicleServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     
     */
    public void setCommonVehicleServiceRef(JAXBElement<? extends CommonVehicleServiceRefStructure> value) {
        this.commonVehicleServiceRef = value;
    }

    /**
     * Ruft den Wert der vehicleRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TractiveRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RollingStockItemRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleRefStructure> getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Legt den Wert der vehicleRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TractiveRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RollingStockItemRefStructure }{@code >}
     *     
     */
    public void setVehicleRef(JAXBElement<? extends VehicleRefStructure> value) {
        this.vehicleRef = value;
    }

    /**
     * Ruft den Wert der mediumAccessDeviceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MobileDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SmartcardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmvCardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MediumAccessDeviceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends MediumAccessDeviceRefStructure> getMediumAccessDeviceRef() {
        return mediumAccessDeviceRef;
    }

    /**
     * Legt den Wert der mediumAccessDeviceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MobileDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SmartcardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmvCardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MediumAccessDeviceRefStructure }{@code >}
     *     
     */
    public void setMediumAccessDeviceRef(JAXBElement<? extends MediumAccessDeviceRefStructure> value) {
        this.mediumAccessDeviceRef = value;
    }

    /**
     * Ruft den Wert der serviceAccessCodeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAccessCodeRefStructure }
     *     
     */
    public ServiceAccessCodeRefStructure getServiceAccessCodeRef() {
        return serviceAccessCodeRef;
    }

    /**
     * Legt den Wert der serviceAccessCodeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAccessCodeRefStructure }
     *     
     */
    public void setServiceAccessCodeRef(ServiceAccessCodeRefStructure value) {
        this.serviceAccessCodeRef = value;
    }

}
