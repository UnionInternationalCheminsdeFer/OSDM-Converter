//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Abstract Type for an ACTUAL VEHICLE EQUIPMENT.
 * 
 * <p>Java-Klasse f�r ActualVehicleEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ActualVehicleEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassengerEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ActualVehicleEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualVehicleEquipment_VersionStructure", propOrder = {
    "units",
    "vehicleTypeRef",
    "equipmentRef",
    "accessibilityAssessment"
})
@XmlSeeAlso({
    AccessVehicleEquipmentVersionStructure.class,
    WheelchairVehicleEquipmentVersionStructure.class
})
public class ActualVehicleEquipmentVersionStructure
    extends PassengerEquipmentVersionStructure
{

    @XmlElement(name = "Units")
    protected BigInteger units;
    @XmlElementRef(name = "VehicleTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleTypeRefStructure> vehicleTypeRef;
    @XmlElementRef(name = "EquipmentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends EquipmentRefStructure> equipmentRef;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessment accessibilityAssessment;

    /**
     * Ruft den Wert der units-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnits() {
        return units;
    }

    /**
     * Legt den Wert der units-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnits(BigInteger value) {
        this.units = value;
    }

    /**
     * Ruft den Wert der vehicleTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleTypeRefStructure> getVehicleTypeRef() {
        return vehicleTypeRef;
    }

    /**
     * Legt den Wert der vehicleTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     
     */
    public void setVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        this.vehicleTypeRef = value;
    }

    /**
     * Ruft den Wert der equipmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeetingPointServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShelterEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BedEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CycleStorageEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RubbishDisposalEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HelpPointEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SensorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SanitaryEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageSpotEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleChargingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StaircaseEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobilityServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketValidatorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WheelchairVehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaitingRoomEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotSensorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceSensorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LostPropertyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleReleaseEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSafetyEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelatorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoughSurfaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeatingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageLockerEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefuellingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CateringServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LeftLuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HireServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceBookingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeadingSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivatedEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerBeaconEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessVehicleEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WheelchairVehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerInformationEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BatteryEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommunicationServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaitingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplaintsServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeatEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrolleyStandEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MoneyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceEquipmentRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends EquipmentRefStructure> getEquipmentRef() {
        return equipmentRef;
    }

    /**
     * Legt den Wert der equipmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeetingPointServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShelterEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BedEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CycleStorageEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RubbishDisposalEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HelpPointEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SensorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SanitaryEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageSpotEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleChargingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StaircaseEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobilityServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketValidatorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WheelchairVehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaitingRoomEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotSensorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceSensorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LostPropertyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleReleaseEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSafetyEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelatorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoughSurfaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeatingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageLockerEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefuellingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CateringServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LeftLuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HireServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceBookingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeadingSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivatedEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerBeaconEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessVehicleEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WheelchairVehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerInformationEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BatteryEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommunicationServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaitingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplaintsServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeatEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrolleyStandEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MoneyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceEquipmentRefStructure }{@code >}
     *     
     */
    public void setEquipmentRef(JAXBElement<? extends EquipmentRefStructure> value) {
        this.equipmentRef = value;
    }

    /**
     * Ruft den Wert der accessibilityAssessment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public AccessibilityAssessment getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Legt den Wert der accessibilityAssessment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessment value) {
        this.accessibilityAssessment = value;
    }

}
