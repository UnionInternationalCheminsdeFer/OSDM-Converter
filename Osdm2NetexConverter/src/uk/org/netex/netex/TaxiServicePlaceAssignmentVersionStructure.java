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
 * Type for TAXI SERVICE PLACE ASSIGNMENT restricts id.
 * 
 * <p>Java-Klasse f�r TaxiServicePlaceAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TaxiServicePlaceAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleServicePlaceAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TaxiServicePlaceAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxiServicePlaceAssignment_VersionStructure", propOrder = {
    "taxiServiceRef",
    "taxiParkingAreaRef",
    "taxiStandRef",
    "parkingBayRef"
})
@XmlSeeAlso({
    TaxiServicePlaceAssignment.class
})
public class TaxiServicePlaceAssignmentVersionStructure
    extends VehicleServicePlaceAssignmentVersionStructure
{

    @XmlElement(name = "TaxiServiceRef", required = true)
    protected TaxiServiceRefStructure taxiServiceRef;
    @XmlElement(name = "TaxiParkingAreaRef")
    protected TaxiParkingAreaRefStructure taxiParkingAreaRef;
    @XmlElement(name = "TaxiStandRef")
    protected TaxiStandRefStructure taxiStandRef;
    @XmlElementRef(name = "ParkingBayRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ParkingBayRefStructure> parkingBayRef;

    /**
     * Ruft den Wert der taxiServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaxiServiceRefStructure }
     *     
     */
    public TaxiServiceRefStructure getTaxiServiceRef() {
        return taxiServiceRef;
    }

    /**
     * Legt den Wert der taxiServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxiServiceRefStructure }
     *     
     */
    public void setTaxiServiceRef(TaxiServiceRefStructure value) {
        this.taxiServiceRef = value;
    }

    /**
     * Ruft den Wert der taxiParkingAreaRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaxiParkingAreaRefStructure }
     *     
     */
    public TaxiParkingAreaRefStructure getTaxiParkingAreaRef() {
        return taxiParkingAreaRef;
    }

    /**
     * Legt den Wert der taxiParkingAreaRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxiParkingAreaRefStructure }
     *     
     */
    public void setTaxiParkingAreaRef(TaxiParkingAreaRefStructure value) {
        this.taxiParkingAreaRef = value;
    }

    /**
     * Ruft den Wert der taxiStandRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaxiStandRefStructure }
     *     
     */
    public TaxiStandRefStructure getTaxiStandRef() {
        return taxiStandRef;
    }

    /**
     * Legt den Wert der taxiStandRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxiStandRefStructure }
     *     
     */
    public void setTaxiStandRef(TaxiStandRefStructure value) {
        this.taxiStandRef = value;
    }

    /**
     * Ruft den Wert der parkingBayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ParkingBayRefStructure> getParkingBayRef() {
        return parkingBayRef;
    }

    /**
     * Legt den Wert der parkingBayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
     *     
     */
    public void setParkingBayRef(JAXBElement<? extends ParkingBayRefStructure> value) {
        this.parkingBayRef = value;
    }

}
