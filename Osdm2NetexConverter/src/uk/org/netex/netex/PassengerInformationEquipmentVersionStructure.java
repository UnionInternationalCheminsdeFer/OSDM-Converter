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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a PASSENGER INFORMATION EQUIPMENT.
 * 
 * <p>Java-Klasse f�r PassengerInformationEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerInformationEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassengerEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerInformationEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerInformationEquipment_VersionStructure", propOrder = {
    "logicalDisplayRef",
    "stopPlaceRef",
    "siteComponentRef",
    "passengerInformationEquipmentList",
    "typeOfPassengerInformationEquipmentRef",
    "lowCounterAccess",
    "heightOfLowCounter",
    "inductionLoops",
    "tactileInterfaceAvailable",
    "audioInterfaceAvailable",
    "disabledPriority",
    "wheelchairSuitable",
    "passengerInformationFacilityList",
    "accessibilityInfoFacilityList"
})
@XmlSeeAlso({
    PassengerInformationEquipment.class
})
public class PassengerInformationEquipmentVersionStructure
    extends PassengerEquipmentVersionStructure
{

    @XmlElement(name = "LogicalDisplayRef")
    protected LogicalDisplayRefStructure logicalDisplayRef;
    @XmlElementRef(name = "StopPlaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends StopPlaceRefStructure> stopPlaceRef;
    @XmlElementRef(name = "SiteComponentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SiteComponentRefStructure> siteComponentRef;
    @XmlList
    @XmlElement(name = "PassengerInformationEquipmentList")
    protected List<PassengerInformationEquipmentEnumeration> passengerInformationEquipmentList;
    @XmlElement(name = "TypeOfPassengerInformationEquipmentRef")
    protected TypeOfPassengerInformationEquipmentRefStructure typeOfPassengerInformationEquipmentRef;
    @XmlElement(name = "LowCounterAccess")
    protected Boolean lowCounterAccess;
    @XmlElement(name = "HeightOfLowCounter")
    protected BigDecimal heightOfLowCounter;
    @XmlElement(name = "InductionLoops")
    protected Boolean inductionLoops;
    @XmlElement(name = "TactileInterfaceAvailable")
    protected Boolean tactileInterfaceAvailable;
    @XmlElement(name = "AudioInterfaceAvailable")
    protected Boolean audioInterfaceAvailable;
    @XmlElement(name = "DisabledPriority")
    protected Boolean disabledPriority;
    @XmlElement(name = "WheelchairSuitable")
    protected Boolean wheelchairSuitable;
    @XmlList
    @XmlElement(name = "PassengerInformationFacilityList")
    protected List<PassengerInformationFacilityEnumeration> passengerInformationFacilityList;
    @XmlList
    @XmlElement(name = "AccessibilityInfoFacilityList")
    protected List<AccessibilityInfoFacilityEnumeration> accessibilityInfoFacilityList;

    /**
     * Ruft den Wert der logicalDisplayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LogicalDisplayRefStructure }
     *     
     */
    public LogicalDisplayRefStructure getLogicalDisplayRef() {
        return logicalDisplayRef;
    }

    /**
     * Legt den Wert der logicalDisplayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalDisplayRefStructure }
     *     
     */
    public void setLogicalDisplayRef(LogicalDisplayRefStructure value) {
        this.logicalDisplayRef = value;
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
     * Ruft den Wert der siteComponentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoardingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceForVehiclesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPassengerEntranceRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteComponentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceVehicleEntranceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends SiteComponentRefStructure> getSiteComponentRef() {
        return siteComponentRef;
    }

    /**
     * Legt den Wert der siteComponentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoardingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceForVehiclesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPassengerEntranceRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteComponentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceVehicleEntranceRefStructure }{@code >}
     *     
     */
    public void setSiteComponentRef(JAXBElement<? extends SiteComponentRefStructure> value) {
        this.siteComponentRef = value;
    }

    /**
     * Gets the value of the passengerInformationEquipmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInformationEquipmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInformationEquipmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerInformationEquipmentEnumeration }
     * 
     * 
     */
    public List<PassengerInformationEquipmentEnumeration> getPassengerInformationEquipmentList() {
        if (passengerInformationEquipmentList == null) {
            passengerInformationEquipmentList = new ArrayList<PassengerInformationEquipmentEnumeration>();
        }
        return this.passengerInformationEquipmentList;
    }

    /**
     * Ruft den Wert der typeOfPassengerInformationEquipmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPassengerInformationEquipmentRefStructure }
     *     
     */
    public TypeOfPassengerInformationEquipmentRefStructure getTypeOfPassengerInformationEquipmentRef() {
        return typeOfPassengerInformationEquipmentRef;
    }

    /**
     * Legt den Wert der typeOfPassengerInformationEquipmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPassengerInformationEquipmentRefStructure }
     *     
     */
    public void setTypeOfPassengerInformationEquipmentRef(TypeOfPassengerInformationEquipmentRefStructure value) {
        this.typeOfPassengerInformationEquipmentRef = value;
    }

    /**
     * Ruft den Wert der lowCounterAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowCounterAccess() {
        return lowCounterAccess;
    }

    /**
     * Legt den Wert der lowCounterAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowCounterAccess(Boolean value) {
        this.lowCounterAccess = value;
    }

    /**
     * Ruft den Wert der heightOfLowCounter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightOfLowCounter() {
        return heightOfLowCounter;
    }

    /**
     * Legt den Wert der heightOfLowCounter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightOfLowCounter(BigDecimal value) {
        this.heightOfLowCounter = value;
    }

    /**
     * Ruft den Wert der inductionLoops-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInductionLoops() {
        return inductionLoops;
    }

    /**
     * Legt den Wert der inductionLoops-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInductionLoops(Boolean value) {
        this.inductionLoops = value;
    }

    /**
     * Ruft den Wert der tactileInterfaceAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileInterfaceAvailable() {
        return tactileInterfaceAvailable;
    }

    /**
     * Legt den Wert der tactileInterfaceAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileInterfaceAvailable(Boolean value) {
        this.tactileInterfaceAvailable = value;
    }

    /**
     * Ruft den Wert der audioInterfaceAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAudioInterfaceAvailable() {
        return audioInterfaceAvailable;
    }

    /**
     * Legt den Wert der audioInterfaceAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudioInterfaceAvailable(Boolean value) {
        this.audioInterfaceAvailable = value;
    }

    /**
     * Ruft den Wert der disabledPriority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabledPriority() {
        return disabledPriority;
    }

    /**
     * Legt den Wert der disabledPriority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabledPriority(Boolean value) {
        this.disabledPriority = value;
    }

    /**
     * Ruft den Wert der wheelchairSuitable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWheelchairSuitable() {
        return wheelchairSuitable;
    }

    /**
     * Legt den Wert der wheelchairSuitable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWheelchairSuitable(Boolean value) {
        this.wheelchairSuitable = value;
    }

    /**
     * List of predefined Passenger Info EQUIPMENT.Gets the value of the passengerInformationFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInformationFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInformationFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerInformationFacilityEnumeration }
     * 
     * 
     */
    public List<PassengerInformationFacilityEnumeration> getPassengerInformationFacilityList() {
        if (passengerInformationFacilityList == null) {
            passengerInformationFacilityList = new ArrayList<PassengerInformationFacilityEnumeration>();
        }
        return this.passengerInformationFacilityList;
    }

    /**
     * Gets the value of the accessibilityInfoFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessibilityInfoFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibilityInfoFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessibilityInfoFacilityEnumeration }
     * 
     * 
     */
    public List<AccessibilityInfoFacilityEnumeration> getAccessibilityInfoFacilityList() {
        if (accessibilityInfoFacilityList == null) {
            accessibilityInfoFacilityList = new ArrayList<AccessibilityInfoFacilityEnumeration>();
        }
        return this.accessibilityInfoFacilityList;
    }

}
