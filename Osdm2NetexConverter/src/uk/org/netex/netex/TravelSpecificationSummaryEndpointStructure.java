//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Origin or destnation elements for TRAVEL SPECIFICATION Summary View.
 * 
 * <p>Java-Klasse f�r TravelSpecificationSummaryEndpointStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TravelSpecificationSummaryEndpointStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TravelSpecificationSummaryEndPointPlaceGroup"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ScheduledStopPointView" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}VehicleMeetingPointRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}QuayRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}BoardingPositionRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TariffZoneRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelSpecificationSummaryEndpointStructure", propOrder = {
    "topographicPlaceView",
    "siteRef",
    "addressRef",
    "scheduledStopPointView",
    "vehicleMeetingPointRef",
    "quayRef",
    "boardingPositionRef",
    "tariffZoneRef"
})
public class TravelSpecificationSummaryEndpointStructure {

    @XmlElement(name = "TopographicPlaceView")
    protected TopographicPlaceView topographicPlaceView;
    @XmlElementRef(name = "SiteRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SiteRefStructure> siteRef;
    @XmlElementRef(name = "AddressRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AddressRefStructure> addressRef;
    @XmlElement(name = "ScheduledStopPointView")
    protected ScheduledStopPointDerivedViewStructure scheduledStopPointView;
    @XmlElement(name = "VehicleMeetingPointRef")
    protected VehicleMeetingPointRefStructure vehicleMeetingPointRef;
    @XmlElementRef(name = "QuayRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends QuayRefStructure> quayRef;
    @XmlElement(name = "BoardingPositionRef")
    protected BoardingPositionRefStructure boardingPositionRef;
    @XmlElement(name = "TariffZoneRef")
    protected List<TariffZoneRef> tariffZoneRef;

    /**
     * Ruft den Wert der topographicPlaceView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceView }
     *     
     */
    public TopographicPlaceView getTopographicPlaceView() {
        return topographicPlaceView;
    }

    /**
     * Legt den Wert der topographicPlaceView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceView }
     *     
     */
    public void setTopographicPlaceView(TopographicPlaceView value) {
        this.topographicPlaceView = value;
    }

    /**
     * +v1.2.2
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends SiteRefStructure> getSiteRef() {
        return siteRef;
    }

    /**
     * Legt den Wert der siteRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public void setSiteRef(JAXBElement<? extends SiteRefStructure> value) {
        this.siteRef = value;
    }

    /**
     * Ruft den Wert der addressRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoadAddressRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PostalAddressRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AddressRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends AddressRefStructure> getAddressRef() {
        return addressRef;
    }

    /**
     * Legt den Wert der addressRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoadAddressRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PostalAddressRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AddressRefStructure }{@code >}
     *     
     */
    public void setAddressRef(JAXBElement<? extends AddressRefStructure> value) {
        this.addressRef = value;
    }

    /**
     * Ruft den Wert der scheduledStopPointView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointDerivedViewStructure }
     *     
     */
    public ScheduledStopPointDerivedViewStructure getScheduledStopPointView() {
        return scheduledStopPointView;
    }

    /**
     * Legt den Wert der scheduledStopPointView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointDerivedViewStructure }
     *     
     */
    public void setScheduledStopPointView(ScheduledStopPointDerivedViewStructure value) {
        this.scheduledStopPointView = value;
    }

    /**
     * +v1.2.2
     * 
     * @return
     *     possible object is
     *     {@link VehicleMeetingPointRefStructure }
     *     
     */
    public VehicleMeetingPointRefStructure getVehicleMeetingPointRef() {
        return vehicleMeetingPointRef;
    }

    /**
     * Legt den Wert der vehicleMeetingPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMeetingPointRefStructure }
     *     
     */
    public void setVehicleMeetingPointRef(VehicleMeetingPointRefStructure value) {
        this.vehicleMeetingPointRef = value;
    }

    /**
     * Ruft den Wert der quayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends QuayRefStructure> getQuayRef() {
        return quayRef;
    }

    /**
     * Legt den Wert der quayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     *     
     */
    public void setQuayRef(JAXBElement<? extends QuayRefStructure> value) {
        this.quayRef = value;
    }

    /**
     * Ruft den Wert der boardingPositionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public BoardingPositionRefStructure getBoardingPositionRef() {
        return boardingPositionRef;
    }

    /**
     * Legt den Wert der boardingPositionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public void setBoardingPositionRef(BoardingPositionRefStructure value) {
        this.boardingPositionRef = value;
    }

    /**
     * Gets the value of the tariffZoneRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffZoneRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffZoneRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffZoneRef }
     * 
     * 
     */
    public List<TariffZoneRef> getTariffZoneRef() {
        if (tariffZoneRef == null) {
            tariffZoneRef = new ArrayList<TariffZoneRef>();
        }
        return this.tariffZoneRef;
    }

}
