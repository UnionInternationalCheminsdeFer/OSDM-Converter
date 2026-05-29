//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for a PARKING BAY.
 * 
 * <p>Java-Klasse f�r ParkingBay_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParkingBay_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ParkingComponent_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ParkingBayGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingBay_VersionStructure", propOrder = {
    "parkingAreaRef",
    "parkingUserTypes",
    "parkingVehicleType",
    "transportTypeRef",
    "parkingStayList",
    "maximumStay",
    "secureParking",
    "bayGeometry",
    "parkingVisibility",
    "monitoredBays",
    "length",
    "width",
    "height",
    "weight",
    "rechargingAvailable"
})
@XmlSeeAlso({
    ParkingBay.class,
    RechargingBayVersionStructure.class,
    VehiclePoolingParkingBayVersionStructure.class,
    VehicleSharingParkingBayVersionStructure.class
})
public class ParkingBayVersionStructure
    extends ParkingComponentVersionStructure
{

    @XmlElementRef(name = "ParkingAreaRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ParkingAreaRefStructure> parkingAreaRef;
    @XmlList
    @XmlElement(name = "ParkingUserTypes")
    protected List<ParkingUserEnumeration> parkingUserTypes;
    @XmlElement(name = "ParkingVehicleType")
    @XmlSchemaType(name = "string")
    protected ParkingVehicleEnumeration parkingVehicleType;
    @XmlElementRef(name = "TransportTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportTypeRefStructure> transportTypeRef;
    @XmlList
    @XmlElement(name = "ParkingStayList")
    protected List<ParkingStayEnumeration> parkingStayList;
    @XmlElement(name = "MaximumStay")
    protected Duration maximumStay;
    @XmlElement(name = "SecureParking")
    protected Boolean secureParking;
    @XmlElement(name = "BayGeometry")
    @XmlSchemaType(name = "string")
    protected BayGeometryEnumeration bayGeometry;
    @XmlElement(name = "ParkingVisibility")
    @XmlSchemaType(name = "string")
    protected ParkingVisibilityEnumeration parkingVisibility;
    @XmlElement(name = "MonitoredBays")
    protected Boolean monitoredBays;
    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "Width")
    protected BigDecimal width;
    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElement(name = "Weight")
    protected BigDecimal weight;
    @XmlElement(name = "RechargingAvailable")
    protected Boolean rechargingAvailable;

    /**
     * +v1.2.2
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
     * Gets the value of the parkingUserTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingUserTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingUserTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingUserEnumeration }
     * 
     * 
     */
    public List<ParkingUserEnumeration> getParkingUserTypes() {
        if (parkingUserTypes == null) {
            parkingUserTypes = new ArrayList<ParkingUserEnumeration>();
        }
        return this.parkingUserTypes;
    }

    /**
     * Ruft den Wert der parkingVehicleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingVehicleEnumeration }
     *     
     */
    public ParkingVehicleEnumeration getParkingVehicleType() {
        return parkingVehicleType;
    }

    /**
     * Legt den Wert der parkingVehicleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingVehicleEnumeration }
     *     
     */
    public void setParkingVehicleType(ParkingVehicleEnumeration value) {
        this.parkingVehicleType = value;
    }

    /**
     * +v1.2.2
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

    /**
     * Gets the value of the parkingStayList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingStayList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingStayList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingStayEnumeration }
     * 
     * 
     */
    public List<ParkingStayEnumeration> getParkingStayList() {
        if (parkingStayList == null) {
            parkingStayList = new ArrayList<ParkingStayEnumeration>();
        }
        return this.parkingStayList;
    }

    /**
     * Ruft den Wert der maximumStay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumStay() {
        return maximumStay;
    }

    /**
     * Legt den Wert der maximumStay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumStay(Duration value) {
        this.maximumStay = value;
    }

    /**
     * Ruft den Wert der secureParking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecureParking() {
        return secureParking;
    }

    /**
     * Legt den Wert der secureParking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecureParking(Boolean value) {
        this.secureParking = value;
    }

    /**
     * Ruft den Wert der bayGeometry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BayGeometryEnumeration }
     *     
     */
    public BayGeometryEnumeration getBayGeometry() {
        return bayGeometry;
    }

    /**
     * Legt den Wert der bayGeometry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BayGeometryEnumeration }
     *     
     */
    public void setBayGeometry(BayGeometryEnumeration value) {
        this.bayGeometry = value;
    }

    /**
     * Ruft den Wert der parkingVisibility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingVisibilityEnumeration }
     *     
     */
    public ParkingVisibilityEnumeration getParkingVisibility() {
        return parkingVisibility;
    }

    /**
     * Legt den Wert der parkingVisibility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingVisibilityEnumeration }
     *     
     */
    public void setParkingVisibility(ParkingVisibilityEnumeration value) {
        this.parkingVisibility = value;
    }

    /**
     * Ruft den Wert der monitoredBays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitoredBays() {
        return monitoredBays;
    }

    /**
     * Legt den Wert der monitoredBays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitoredBays(Boolean value) {
        this.monitoredBays = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Ruft den Wert der rechargingAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRechargingAvailable() {
        return rechargingAvailable;
    }

    /**
     * Legt den Wert der rechargingAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRechargingAvailable(Boolean value) {
        this.rechargingAvailable = value;
    }

}
