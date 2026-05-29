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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a SITE CONNECTION End.
 * 
 * <p>Java-Klasse f�r SiteConnectionEndStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SiteConnectionEndStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransportMode" type="{http://www.netex.org.uk/netex}AllPublicTransportModesEnumeration" minOccurs="0"/>
 *         &lt;element name="StopAreaRef" type="{http://www.netex.org.uk/netex}StopAreaRefStructure" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="ScheduledStopPointRef" type="{http://www.netex.org.uk/netex}ScheduledStopPointRefStructure" minOccurs="0"/>
 *           &lt;element name="VehicleMeetingPointRef" type="{http://www.netex.org.uk/netex}PointRefStructure" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;group ref="{http://www.netex.org.uk/netex}StopPlaceEndGroup"/>
 *           &lt;group ref="{http://www.netex.org.uk/netex}PointOfInterestEndGroup"/>
 *           &lt;group ref="{http://www.netex.org.uk/netex}ParkingEndGroup"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.netex.org.uk/netex}TransportOrganisationRef" minOccurs="0"/>
 *           &lt;element ref="{http://www.netex.org.uk/netex}OperatorView" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Label" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteConnectionEndStructure", propOrder = {
    "transportMode",
    "stopAreaRef",
    "scheduledStopPointRef",
    "vehicleMeetingPointRef",
    "stopPlaceRef",
    "accessSpaceRef",
    "boardingPositionRef",
    "quayRef",
    "stopPlaceEntranceRef",
    "pointOfInterestRef",
    "pointOfInterestSpaceRef",
    "pointOfInterestEntranceRef",
    "parkingRef",
    "parkingAreaRef",
    "parkingEntranceRef",
    "transportOrganisationRef",
    "operatorView",
    "label"
})
public class SiteConnectionEndStructure {

    @XmlElement(name = "TransportMode", defaultValue = "all")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration transportMode;
    @XmlElement(name = "StopAreaRef")
    protected StopAreaRefStructure stopAreaRef;
    @XmlElement(name = "ScheduledStopPointRef")
    protected ScheduledStopPointRefStructure scheduledStopPointRef;
    @XmlElement(name = "VehicleMeetingPointRef")
    protected PointRefStructure vehicleMeetingPointRef;
    @XmlElementRef(name = "StopPlaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends StopPlaceRefStructure> stopPlaceRef;
    @XmlElement(name = "AccessSpaceRef")
    protected AccessSpaceRefStructure accessSpaceRef;
    @XmlElement(name = "BoardingPositionRef")
    protected BoardingPositionRefStructure boardingPositionRef;
    @XmlElementRef(name = "QuayRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends QuayRefStructure> quayRef;
    @XmlElement(name = "StopPlaceEntranceRef")
    protected StopPlaceEntranceRefStructure stopPlaceEntranceRef;
    @XmlElement(name = "PointOfInterestRef")
    protected PointOfInterestRefStructure pointOfInterestRef;
    @XmlElement(name = "PointOfInterestSpaceRef")
    protected PointOfInterestSpaceRefStructure pointOfInterestSpaceRef;
    @XmlElement(name = "PointOfInterestEntranceRef")
    protected PointOfInterestEntranceRefStructure pointOfInterestEntranceRef;
    @XmlElementRef(name = "ParkingRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ParkingRefStructure> parkingRef;
    @XmlElementRef(name = "ParkingAreaRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ParkingAreaRefStructure> parkingAreaRef;
    @XmlElementRef(name = "ParkingEntranceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ParkingEntranceRefStructure> parkingEntranceRef;
    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportOrganisationRefStructure> transportOrganisationRef;
    @XmlElement(name = "OperatorView")
    protected OperatorView operatorView;
    @XmlElement(name = "Label")
    protected MultilingualString label;

    /**
     * Ruft den Wert der transportMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getTransportMode() {
        return transportMode;
    }

    /**
     * Legt den Wert der transportMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setTransportMode(AllPublicTransportModesEnumeration value) {
        this.transportMode = value;
    }

    /**
     * Ruft den Wert der stopAreaRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopAreaRefStructure }
     *     
     */
    public StopAreaRefStructure getStopAreaRef() {
        return stopAreaRef;
    }

    /**
     * Legt den Wert der stopAreaRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAreaRefStructure }
     *     
     */
    public void setStopAreaRef(StopAreaRefStructure value) {
        this.stopAreaRef = value;
    }

    /**
     * Ruft den Wert der scheduledStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getScheduledStopPointRef() {
        return scheduledStopPointRef;
    }

    /**
     * Legt den Wert der scheduledStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setScheduledStopPointRef(ScheduledStopPointRefStructure value) {
        this.scheduledStopPointRef = value;
    }

    /**
     * Ruft den Wert der vehicleMeetingPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getVehicleMeetingPointRef() {
        return vehicleMeetingPointRef;
    }

    /**
     * Legt den Wert der vehicleMeetingPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setVehicleMeetingPointRef(PointRefStructure value) {
        this.vehicleMeetingPointRef = value;
    }

    /**
     * Ruft den Wert der stopPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends StopPlaceRefStructure> getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Legt den Wert der stopPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public void setStopPlaceRef(JAXBElement<? extends StopPlaceRefStructure> value) {
        this.stopPlaceRef = value;
    }

    /**
     * Ruft den Wert der accessSpaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessSpaceRefStructure }
     *     
     */
    public AccessSpaceRefStructure getAccessSpaceRef() {
        return accessSpaceRef;
    }

    /**
     * Legt den Wert der accessSpaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessSpaceRefStructure }
     *     
     */
    public void setAccessSpaceRef(AccessSpaceRefStructure value) {
        this.accessSpaceRef = value;
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
     * Ruft den Wert der stopPlaceEntranceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceEntranceRefStructure }
     *     
     */
    public StopPlaceEntranceRefStructure getStopPlaceEntranceRef() {
        return stopPlaceEntranceRef;
    }

    /**
     * Legt den Wert der stopPlaceEntranceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceEntranceRefStructure }
     *     
     */
    public void setStopPlaceEntranceRef(StopPlaceEntranceRefStructure value) {
        this.stopPlaceEntranceRef = value;
    }

    /**
     * Ruft den Wert der pointOfInterestRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestRefStructure }
     *     
     */
    public PointOfInterestRefStructure getPointOfInterestRef() {
        return pointOfInterestRef;
    }

    /**
     * Legt den Wert der pointOfInterestRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestRefStructure }
     *     
     */
    public void setPointOfInterestRef(PointOfInterestRefStructure value) {
        this.pointOfInterestRef = value;
    }

    /**
     * Ruft den Wert der pointOfInterestSpaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestSpaceRefStructure }
     *     
     */
    public PointOfInterestSpaceRefStructure getPointOfInterestSpaceRef() {
        return pointOfInterestSpaceRef;
    }

    /**
     * Legt den Wert der pointOfInterestSpaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestSpaceRefStructure }
     *     
     */
    public void setPointOfInterestSpaceRef(PointOfInterestSpaceRefStructure value) {
        this.pointOfInterestSpaceRef = value;
    }

    /**
     * Ruft den Wert der pointOfInterestEntranceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestEntranceRefStructure }
     *     
     */
    public PointOfInterestEntranceRefStructure getPointOfInterestEntranceRef() {
        return pointOfInterestEntranceRef;
    }

    /**
     * Legt den Wert der pointOfInterestEntranceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestEntranceRefStructure }
     *     
     */
    public void setPointOfInterestEntranceRef(PointOfInterestEntranceRefStructure value) {
        this.pointOfInterestEntranceRef = value;
    }

    /**
     * Ruft den Wert der parkingRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ParkingRefStructure> getParkingRef() {
        return parkingRef;
    }

    /**
     * Legt den Wert der parkingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     
     */
    public void setParkingRef(JAXBElement<? extends ParkingRefStructure> value) {
        this.parkingRef = value;
    }

    /**
     * Ruft den Wert der parkingAreaRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxiParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingAreaRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ParkingAreaRefStructure> getParkingAreaRef() {
        return parkingAreaRef;
    }

    /**
     * Legt den Wert der parkingAreaRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxiParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingAreaRefStructure }{@code >}
     *     
     */
    public void setParkingAreaRef(JAXBElement<? extends ParkingAreaRefStructure> value) {
        this.parkingAreaRef = value;
    }

    /**
     * Ruft den Wert der parkingEntranceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPassengerEntranceRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceForVehiclesRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ParkingEntranceRefStructure> getParkingEntranceRef() {
        return parkingEntranceRef;
    }

    /**
     * Legt den Wert der parkingEntranceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPassengerEntranceRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceForVehiclesRefStructure }{@code >}
     *     
     */
    public void setParkingEntranceRef(JAXBElement<? extends ParkingEntranceRefStructure> value) {
        this.parkingEntranceRef = value;
    }

    /**
     * Ruft den Wert der transportOrganisationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportOrganisationRefStructure> getTransportOrganisationRef() {
        return transportOrganisationRef;
    }

    /**
     * Legt den Wert der transportOrganisationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public void setTransportOrganisationRef(JAXBElement<? extends TransportOrganisationRefStructure> value) {
        this.transportOrganisationRef = value;
    }

    /**
     * Ruft den Wert der operatorView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorView }
     *     
     */
    public OperatorView getOperatorView() {
        return operatorView;
    }

    /**
     * Legt den Wert der operatorView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorView }
     *     
     */
    public void setOperatorView(OperatorView value) {
        this.operatorView = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
    }

}
