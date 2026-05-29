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
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of LOCAL SERVICEs.
 * 
 * <p>Java-Klasse f�r placeEquipments_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="placeEquipments_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}InstalledEquipmentRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}InstalledEquipment"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "placeEquipments_RelStructure", propOrder = {
    "installedEquipmentRefOrInstalledEquipment"
})
public class PlaceEquipmentsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "InstalledEquipment", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InstalledEquipmentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> installedEquipmentRefOrInstalledEquipment;

    /**
     * Gets the value of the installedEquipmentRefOrInstalledEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedEquipmentRefOrInstalledEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledEquipmentRefOrInstalledEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link EntranceSensor }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ShelterEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceLighting }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerBeaconEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceSignRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SeatingEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link QueueingEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessEquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CycleStorageEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RubbishDisposalEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LiftEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link HelpPointEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StaircaseEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageSpotEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link SanitaryEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RefuellingEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerSafetyEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link EntranceEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SensorEquipmentDummy }{@code >}
     * {@link JAXBElement }{@code <}{@link ActualVehicleEquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StaircaseEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link BatteryEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link EntranceEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link CrossingEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleChargingEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceSign }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralSign }{@code >}
     * {@link JAXBElement }{@code <}{@link WheelchairVehicleRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link WaitingRoomEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TravelatorEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link SpotSensor }{@code >}
     * {@link JAXBElement }{@code <}{@link WaitingRoomEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link SeatEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerSafetyEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TicketValidatorEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link TravelatorEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoughSurfaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SeatingEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageLockerEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageLockerEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link SensorEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link EscalatorEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SpotEquipmentDummy }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoughSurface }{@code >}
     * {@link JAXBElement }{@code <}{@link HeadingSignRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleReleaseEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerBeaconEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RubbishDisposalEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessVehicleEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralSignRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LiftCallEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessVehicleEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link WheelchairVehicleRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerInformationEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link HeadingSign }{@code >}
     * {@link JAXBElement }{@code <}{@link BedEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerInformationEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteEquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RetailDevice }{@code >}
     * {@link JAXBElement }{@code <}{@link StairEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link HelpPointEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link CycleStorageEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link WaitingEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceEquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SignEquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ShelterEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link WheelchairVehicleEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link InstalledEquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrolleyStandEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerEquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SanitaryEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link TrolleyStandEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link WaitingEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceEquipmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SpotEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link RampEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link TicketingEquipment }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getInstalledEquipmentRefOrInstalledEquipment() {
        if (installedEquipmentRefOrInstalledEquipment == null) {
            installedEquipmentRefOrInstalledEquipment = new ArrayList<JAXBElement<?>>();
        }
        return this.installedEquipmentRefOrInstalledEquipment;
    }

}
