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
 * Type for a list of PARKING LOG ENTRYs.
 * 
 * <p>Java-Klasse f�r parkingLogEntries_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="parkingLogEntries_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}ParkingBayConditionRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}RentalAvailabilityRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ParkingLogEntry_Dummy"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parkingLogEntries_RelStructure", propOrder = {
    "parkingBayConditionRefOrRentalAvailabilityRefOrParkingLogEntryDummy"
})
public class ParkingLogEntriesRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "ParkingLogEntry_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ParkingBayConditionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RentalAvailabilityRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> parkingBayConditionRefOrRentalAvailabilityRefOrParkingLogEntryDummy;

    /**
     * Gets the value of the parkingBayConditionRefOrRentalAvailabilityRefOrParkingLogEntryDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingBayConditionRefOrRentalAvailabilityRefOrParkingLogEntryDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingBayConditionRefOrRentalAvailabilityRefOrParkingLogEntryDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ParkingBayCondition }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingBayStatusRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingBayStatusRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RentalAvailability }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getParkingBayConditionRefOrRentalAvailabilityRefOrParkingLogEntryDummy() {
        if (parkingBayConditionRefOrRentalAvailabilityRefOrParkingLogEntryDummy == null) {
            parkingBayConditionRefOrRentalAvailabilityRefOrParkingLogEntryDummy = new ArrayList<JAXBElement<?>>();
        }
        return this.parkingBayConditionRefOrRentalAvailabilityRefOrParkingLogEntryDummy;
    }

}
