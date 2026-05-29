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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of a VEHICLE MEETING POINTS in Sequence
 * 
 * <p>Java-Klasse f�r vehicleMeetingPointsInSequence_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehicleMeetingPointsInSequence_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}VehicleMeetingPointInPath" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleMeetingPointsInSequence_RelStructure", propOrder = {
    "vehicleMeetingPointInPath"
})
public class VehicleMeetingPointsInSequenceRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElement(name = "VehicleMeetingPointInPath", required = true)
    protected List<VehicleMeetingPointInPath> vehicleMeetingPointInPath;

    /**
     * A group of VEHICLE JOURNEYs following the same JOURNEY PATTERN having the same HEADWAY INTERVAL between a specified start and end time (for example, every 10 min). This is especially useful for passenger information.Gets the value of the vehicleMeetingPointInPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleMeetingPointInPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleMeetingPointInPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleMeetingPointInPath }
     * 
     * 
     */
    public List<VehicleMeetingPointInPath> getVehicleMeetingPointInPath() {
        if (vehicleMeetingPointInPath == null) {
            vehicleMeetingPointInPath = new ArrayList<VehicleMeetingPointInPath>();
        }
        return this.vehicleMeetingPointInPath;
    }

}
