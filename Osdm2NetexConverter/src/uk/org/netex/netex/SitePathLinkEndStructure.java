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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for an OFF SITE PATH LINK END.
 * 
 * <p>Java-Klasse f�r SitePathLinkEndStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SitePathLinkEndStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.netex.org.uk/netex}SiteElementRef"/>
 *           &lt;element name="PlaceRef" type="{http://www.netex.org.uk/netex}PlaceRefStructure"/>
 *         &lt;/choice>
 *         &lt;element name="LevelRef" type="{http://www.netex.org.uk/netex}LevelRefStructure" minOccurs="0"/>
 *         &lt;element name="EntranceRef" type="{http://www.netex.org.uk/netex}EntranceRefStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SitePathLinkEndStructure", propOrder = {
    "siteElementRef",
    "placeRef",
    "levelRef",
    "entranceRef"
})
public class SitePathLinkEndStructure {

    @XmlElementRef(name = "SiteElementRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SiteElementRefStructure> siteElementRef;
    @XmlElement(name = "PlaceRef")
    protected PlaceRefStructure placeRef;
    @XmlElement(name = "LevelRef")
    protected LevelRefStructure levelRef;
    @XmlElement(name = "EntranceRef")
    protected EntranceRefStructure entranceRef;

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

    /**
     * Ruft den Wert der placeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Legt den Wert der placeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setPlaceRef(PlaceRefStructure value) {
        this.placeRef = value;
    }

    /**
     * Ruft den Wert der levelRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LevelRefStructure }
     *     
     */
    public LevelRefStructure getLevelRef() {
        return levelRef;
    }

    /**
     * Legt den Wert der levelRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelRefStructure }
     *     
     */
    public void setLevelRef(LevelRefStructure value) {
        this.levelRef = value;
    }

    /**
     * Ruft den Wert der entranceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntranceRefStructure }
     *     
     */
    public EntranceRefStructure getEntranceRef() {
        return entranceRef;
    }

    /**
     * Legt den Wert der entranceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntranceRefStructure }
     *     
     */
    public void setEntranceRef(EntranceRefStructure value) {
        this.entranceRef = value;
    }

}
