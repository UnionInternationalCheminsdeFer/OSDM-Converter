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
 * Type for containment of VEHICLE JOURNEY STOP ASSIGNMENTs.
 * 
 * <p>Java-Klasse f�r vehicleJourneyStopAssignments_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehicleJourneyStopAssignments_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}VehicleJourneyStopAssignmentRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}StopAssignment"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleJourneyStopAssignments_RelStructure", propOrder = {
    "vehicleJourneyStopAssignmentRefOrStopAssignment"
})
public class VehicleJourneyStopAssignmentsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "VehicleJourneyStopAssignmentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StopAssignment", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> vehicleJourneyStopAssignmentRefOrStopAssignment;

    /**
     * Gets the value of the vehicleJourneyStopAssignmentRefOrStopAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleJourneyStopAssignmentRefOrStopAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleJourneyStopAssignmentRefOrStopAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link VehicleJourneyStopAssignmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainStopAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerBoardingPositionAssignmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerBoardingPositionAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationPathAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicStopAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleTypeStopAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link StopAssignmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerStopAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleStopAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleJourneyStopAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckEntranceAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicStopAssignmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainComponentStopAssignment }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getVehicleJourneyStopAssignmentRefOrStopAssignment() {
        if (vehicleJourneyStopAssignmentRefOrStopAssignment == null) {
            vehicleJourneyStopAssignmentRefOrStopAssignment = new ArrayList<JAXBElement<?>>();
        }
        return this.vehicleJourneyStopAssignmentRefOrStopAssignment;
    }

}
