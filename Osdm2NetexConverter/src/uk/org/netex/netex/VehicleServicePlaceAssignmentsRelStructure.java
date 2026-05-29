//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of VEHICLE SERVICE PLACE ASSIGNMENTs. +v1.2.2
 * 
 * <p>Java-Klasse f�r vehicleServicePlaceAssignments_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehicleServicePlaceAssignments_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}VehicleSharingPlaceAssignment"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}VehiclePoolingPlaceAssignment"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TaxiServicePlaceAssignment"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleServicePlaceAssignments_RelStructure", propOrder = {
    "vehicleSharingPlaceAssignmentOrVehiclePoolingPlaceAssignmentOrTaxiServicePlaceAssignment"
})
public class VehicleServicePlaceAssignmentsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElements({
        @XmlElement(name = "VehicleSharingPlaceAssignment", type = VehicleSharingPlaceAssignment.class),
        @XmlElement(name = "VehiclePoolingPlaceAssignment", type = VehiclePoolingPlaceAssignment.class),
        @XmlElement(name = "TaxiServicePlaceAssignment", type = TaxiServicePlaceAssignment.class)
    })
    protected List<VehicleServicePlaceAssignmentVersionStructure> vehicleSharingPlaceAssignmentOrVehiclePoolingPlaceAssignmentOrTaxiServicePlaceAssignment;

    /**
     * Gets the value of the vehicleSharingPlaceAssignmentOrVehiclePoolingPlaceAssignmentOrTaxiServicePlaceAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleSharingPlaceAssignmentOrVehiclePoolingPlaceAssignmentOrTaxiServicePlaceAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleSharingPlaceAssignmentOrVehiclePoolingPlaceAssignmentOrTaxiServicePlaceAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleSharingPlaceAssignment }
     * {@link VehiclePoolingPlaceAssignment }
     * {@link TaxiServicePlaceAssignment }
     * 
     * 
     */
    public List<VehicleServicePlaceAssignmentVersionStructure> getVehicleSharingPlaceAssignmentOrVehiclePoolingPlaceAssignmentOrTaxiServicePlaceAssignment() {
        if (vehicleSharingPlaceAssignmentOrVehiclePoolingPlaceAssignmentOrTaxiServicePlaceAssignment == null) {
            vehicleSharingPlaceAssignmentOrVehiclePoolingPlaceAssignmentOrTaxiServicePlaceAssignment = new ArrayList<VehicleServicePlaceAssignmentVersionStructure>();
        }
        return this.vehicleSharingPlaceAssignmentOrVehiclePoolingPlaceAssignmentOrTaxiServicePlaceAssignment;
    }

}
