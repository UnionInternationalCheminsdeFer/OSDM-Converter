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
 * Type for a list of PARKING AREAs.
 * 
 * <p>Java-Klasse f�r parkingAreas_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="parkingAreas_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}ParkingAreaRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ParkingArea_Dummy"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parkingAreas_RelStructure", propOrder = {
    "parkingAreaRefOrParkingAreaDummy"
})
public class ParkingAreasRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "ParkingArea_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ParkingAreaRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> parkingAreaRefOrParkingAreaDummy;

    /**
     * Gets the value of the parkingAreaRefOrParkingAreaDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingAreaRefOrParkingAreaDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingAreaRefOrParkingAreaDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SiteComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiParkingAreaRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingParkingAreaRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingArea }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiParkingArea }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingParkingArea }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingAreaRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingParkingArea }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingParkingAreaRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getParkingAreaRefOrParkingAreaDummy() {
        if (parkingAreaRefOrParkingAreaDummy == null) {
            parkingAreaRefOrParkingAreaDummy = new ArrayList<JAXBElement<?>>();
        }
        return this.parkingAreaRefOrParkingAreaDummy;
    }

}
