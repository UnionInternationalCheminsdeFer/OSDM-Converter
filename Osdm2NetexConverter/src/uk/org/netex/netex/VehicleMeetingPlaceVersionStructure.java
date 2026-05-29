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
 * Type for VEHICLE MEETING PLACE.
 * 
 * <p>Java-Klasse f�r VehicleMeetingPlace_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleMeetingPlace_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AddressablePlace_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleMeetingPlaceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleMeetingPlace_VersionStructure", propOrder = {
    "topographicPlaceRef",
    "siteElementRef"
})
@XmlSeeAlso({
    VehicleMeetingPlace.class,
    VehiclePoolingMeetingPlaceVersionStructure.class
})
public class VehicleMeetingPlaceVersionStructure
    extends AddressablePlaceVersionStructure
{

    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;
    @XmlElementRef(name = "SiteElementRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SiteElementRefStructure> siteElementRef;

    /**
     * Ruft den Wert der topographicPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getTopographicPlaceRef() {
        return topographicPlaceRef;
    }

    /**
     * Legt den Wert der topographicPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
        this.topographicPlaceRef = value;
    }

    /**
     * Ruft den Wert der siteElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoardingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceForVehiclesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPassengerEntranceRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteComponentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends SiteElementRefStructure> getSiteElementRef() {
        return siteElementRef;
    }

    /**
     * Legt den Wert der siteElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoardingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceForVehiclesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPassengerEntranceRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteComponentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public void setSiteElementRef(JAXBElement<? extends SiteElementRefStructure> value) {
        this.siteElementRef = value;
    }

}
