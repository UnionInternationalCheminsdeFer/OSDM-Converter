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
 * Type for a list of PARKING BAYs.
 * 
 * <p>Java-Klasse f�r parkingBays_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="parkingBays_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}ParkingBayRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ParkingBay_Dummy"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parkingBays_RelStructure", propOrder = {
    "parkingBayRefOrParkingBayDummy"
})
public class ParkingBaysRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "ParkingBay_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ParkingBayRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> parkingBayRefOrParkingBayDummy;

    /**
     * Gets the value of the parkingBayRefOrParkingBayDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingBayRefOrParkingBayDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingBayRefOrParkingBayDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingParkingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link RechargingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getParkingBayRefOrParkingBayDummy() {
        if (parkingBayRefOrParkingBayDummy == null) {
            parkingBayRefOrParkingBayDummy = new ArrayList<JAXBElement<?>>();
        }
        return this.parkingBayRefOrParkingBayDummy;
    }

}
