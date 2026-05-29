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
 * Specifies values to filter by reference value, rather than frame.
 * 
 * <p>Java-Klasse f�r NetworkFilterByValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NetworkFilterByValueStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ObjectFilterByValueStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}NetworkFilterByValueGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkFilterByValueStructure", propOrder = {
    "networkRef",
    "places"
})
public class NetworkFilterByValueStructure
    extends ObjectFilterByValueStructure
{

    @XmlElement(name = "NetworkRef")
    protected NetworkRefStructure networkRef;
    protected NetworkFilterByValueStructure.Places places;

    /**
     * Ruft den Wert der networkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworkRefStructure }
     *     
     */
    public NetworkRefStructure getNetworkRef() {
        return networkRef;
    }

    /**
     * Legt den Wert der networkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkRefStructure }
     *     
     */
    public void setNetworkRef(NetworkRefStructure value) {
        this.networkRef = value;
    }

    /**
     * Ruft den Wert der places-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworkFilterByValueStructure.Places }
     *     
     */
    public NetworkFilterByValueStructure.Places getPlaces() {
        return places;
    }

    /**
     * Legt den Wert der places-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkFilterByValueStructure.Places }
     *     
     */
    public void setPlaces(NetworkFilterByValueStructure.Places value) {
        this.places = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.netex.org.uk/netex}PlaceRef_Dummy" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "placeRefDummy"
    })
    public static class Places {

        @XmlElementRef(name = "PlaceRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
        protected List<JAXBElement<? extends VersionOfObjectRefStructure>> placeRefDummy;

        /**
         * Gets the value of the placeRefDummy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the placeRefDummy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlaceRefDummy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link AccessSpaceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link ParkingAreaRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link PointOfInterestSpaceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link EntranceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link GarageRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link SitePathJunctionRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link StopPlaceSpaceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link EquipmentPositionRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link GenericPathJunctionRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link ParkingEntranceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link ParkingPassengerEntranceRef }{@code >}
         * {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link PointOfInterestEntranceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link VehiclePoolingMeetingPlaceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link VehicleMeetingPlaceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link FlexibleQuayRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link TopographicPlaceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link VehicleEntranceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link GenericPathJunctionRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link PointOfInterestVehicleEntranceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link AddressablePlaceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link StopPlaceVehicleEntranceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link BoardingPositionRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link RoadAddressRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link HailAndRideAreaRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link ParkingEntranceForVehiclesRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link SitePathJunctionRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link AddressRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link VehicleStoppingPlaceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link TaxiParkingAreaRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link VehiclePoolingParkingAreaRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link StopPlaceEntranceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link PostalAddressRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link SiteComponentRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link FlexibleAreaRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link VehicleStoppingPositionRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link FlexibleStopPlaceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link EquipmentPlaceRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link SiteElementRefStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link VehicleSharingParkingAreaRefStructure }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends VersionOfObjectRefStructure>> getPlaceRefDummy() {
            if (placeRefDummy == null) {
                placeRefDummy = new ArrayList<JAXBElement<? extends VersionOfObjectRefStructure>>();
            }
            return this.placeRefDummy;
        }

    }

}
