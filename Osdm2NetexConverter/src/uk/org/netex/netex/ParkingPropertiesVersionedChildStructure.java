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
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for a PARKING PROPERTies.
 * 
 * <p>Java-Klasse f�r ParkingProperties_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParkingProperties_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ParkingPropertiesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingProperties_VersionedChildStructure", propOrder = {
    "name",
    "parkingRef",
    "parkingUserTypes",
    "parkingVehicleTypes",
    "vehicleTypes",
    "parkingStayList",
    "maximumStay",
    "secureParking",
    "bayGeometry",
    "parkingVisibility",
    "monitoredBays",
    "areas",
    "spaces"
})
@XmlSeeAlso({
    ParkingProperties.class
})
public class ParkingPropertiesVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElementRef(name = "ParkingRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ParkingRefStructure> parkingRef;
    @XmlList
    @XmlElement(name = "ParkingUserTypes")
    protected List<ParkingUserEnumeration> parkingUserTypes;
    @XmlList
    @XmlElement(name = "ParkingVehicleTypes")
    protected List<ParkingVehicleEnumeration> parkingVehicleTypes;
    protected TransportTypeRefsRelStructure vehicleTypes;
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
    protected ParkingAreaRefsRelStructure areas;
    protected ParkingCapacitiesRelStructure spaces;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
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
     * Gets the value of the parkingVehicleTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingVehicleTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingVehicleTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingVehicleEnumeration }
     * 
     * 
     */
    public List<ParkingVehicleEnumeration> getParkingVehicleTypes() {
        if (parkingVehicleTypes == null) {
            parkingVehicleTypes = new ArrayList<ParkingVehicleEnumeration>();
        }
        return this.parkingVehicleTypes;
    }

    /**
     * Ruft den Wert der vehicleTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportTypeRefsRelStructure }
     *     
     */
    public TransportTypeRefsRelStructure getVehicleTypes() {
        return vehicleTypes;
    }

    /**
     * Legt den Wert der vehicleTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportTypeRefsRelStructure }
     *     
     */
    public void setVehicleTypes(TransportTypeRefsRelStructure value) {
        this.vehicleTypes = value;
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
     * Ruft den Wert der areas-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAreaRefsRelStructure }
     *     
     */
    public ParkingAreaRefsRelStructure getAreas() {
        return areas;
    }

    /**
     * Legt den Wert der areas-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAreaRefsRelStructure }
     *     
     */
    public void setAreas(ParkingAreaRefsRelStructure value) {
        this.areas = value;
    }

    /**
     * Ruft den Wert der spaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingCapacitiesRelStructure }
     *     
     */
    public ParkingCapacitiesRelStructure getSpaces() {
        return spaces;
    }

    /**
     * Legt den Wert der spaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingCapacitiesRelStructure }
     *     
     */
    public void setSpaces(ParkingCapacitiesRelStructure value) {
        this.spaces = value;
    }

}
