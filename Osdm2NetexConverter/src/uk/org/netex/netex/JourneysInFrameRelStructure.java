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
 * Type for containment in frame of all JOURNEYs.
 * 
 * <p>Java-Klasse f�r journeysInFrame_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="journeysInFrame_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}VehicleJourney"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DatedVehicleJourney"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}NormalDatedVehicleJourney"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ServiceJourney"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DatedServiceJourney"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DeadRun"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}SpecialService"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TemplateServiceJourney"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "journeysInFrame_RelStructure", propOrder = {
    "vehicleJourneyOrDatedVehicleJourneyOrNormalDatedVehicleJourney"
})
public class JourneysInFrameRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "VehicleJourney", type = VehicleJourney.class),
        @XmlElement(name = "DatedVehicleJourney", type = DatedVehicleJourney.class),
        @XmlElement(name = "NormalDatedVehicleJourney", type = NormalDatedVehicleJourney.class),
        @XmlElement(name = "ServiceJourney", type = ServiceJourney.class),
        @XmlElement(name = "DatedServiceJourney", type = DatedServiceJourney.class),
        @XmlElement(name = "DeadRun", type = DeadRun.class),
        @XmlElement(name = "SpecialService", type = SpecialService.class),
        @XmlElement(name = "TemplateServiceJourney", type = TemplateServiceJourney.class)
    })
    protected List<JourneyVersionStructure> vehicleJourneyOrDatedVehicleJourneyOrNormalDatedVehicleJourney;

    /**
     * Gets the value of the vehicleJourneyOrDatedVehicleJourneyOrNormalDatedVehicleJourney property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleJourneyOrDatedVehicleJourneyOrNormalDatedVehicleJourney property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleJourneyOrDatedVehicleJourneyOrNormalDatedVehicleJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleJourney }
     * {@link DatedVehicleJourney }
     * {@link NormalDatedVehicleJourney }
     * {@link ServiceJourney }
     * {@link DatedServiceJourney }
     * {@link DeadRun }
     * {@link SpecialService }
     * {@link TemplateServiceJourney }
     * 
     * 
     */
    public List<JourneyVersionStructure> getVehicleJourneyOrDatedVehicleJourneyOrNormalDatedVehicleJourney() {
        if (vehicleJourneyOrDatedVehicleJourneyOrNormalDatedVehicleJourney == null) {
            vehicleJourneyOrDatedVehicleJourneyOrNormalDatedVehicleJourney = new ArrayList<JourneyVersionStructure>();
        }
        return this.vehicleJourneyOrDatedVehicleJourneyOrNormalDatedVehicleJourney;
    }

}
