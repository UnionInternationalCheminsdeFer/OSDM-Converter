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
 * Items of fixed EQUIPMENT that may be located in places within the STOP PLACE.
 * 
 * <p>Java-Klasse f�r explicitPlaceEquipments_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="explicitPlaceEquipments_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.netex.org.uk/netex}OtherPlaceEquipment" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}AccessEquipmentChoice" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SignEquipmentChoice" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerEquipmentChoice" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TicketingEquipmentChoice" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "explicitPlaceEquipments_RelStructure", propOrder = {
    "otherPlaceEquipmentOrRoughSurfaceOrEntranceEquipment"
})
public class ExplicitPlaceEquipmentsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "OtherPlaceEquipment", type = OtherPlaceEquipment.class),
        @XmlElement(name = "RoughSurface", type = RoughSurface.class),
        @XmlElement(name = "EntranceEquipment", type = EntranceEquipment.class),
        @XmlElement(name = "StaircaseEquipment", type = StaircaseEquipment.class),
        @XmlElement(name = "LiftEquipment", type = LiftEquipment.class),
        @XmlElement(name = "LiftCallEquipment", type = LiftCallEquipment.class),
        @XmlElement(name = "EscalatorEquipment", type = EscalatorEquipment.class),
        @XmlElement(name = "TravelatorEquipment", type = TravelatorEquipment.class),
        @XmlElement(name = "RampEquipment", type = RampEquipment.class),
        @XmlElement(name = "QueueingEquipment", type = QueueingEquipment.class),
        @XmlElement(name = "CrossingEquipment", type = CrossingEquipment.class),
        @XmlElement(name = "PlaceLighting", type = PlaceLighting.class),
        @XmlElement(name = "PlaceSign", type = PlaceSignStructure.class),
        @XmlElement(name = "HeadingSign", type = HeadingSignStructure.class),
        @XmlElement(name = "GeneralSign", type = GeneralSignStructure.class),
        @XmlElement(name = "HelpPointEquipment", type = HelpPointEquipment.class),
        @XmlElement(name = "PassengerSafetyEquipment", type = PassengerSafetyEquipment.class),
        @XmlElement(name = "RubbishDisposalEquipment", type = RubbishDisposalEquipment.class),
        @XmlElement(name = "SanitaryEquipment", type = SanitaryEquipment.class),
        @XmlElement(name = "TicketingEquipment", type = TicketingEquipment.class),
        @XmlElement(name = "TicketValidatorEquipment", type = TicketValidatorEquipment.class)
    })
    protected List<InstalledEquipmentVersionStructure> otherPlaceEquipmentOrRoughSurfaceOrEntranceEquipment;

    /**
     * Gets the value of the otherPlaceEquipmentOrRoughSurfaceOrEntranceEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPlaceEquipmentOrRoughSurfaceOrEntranceEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPlaceEquipmentOrRoughSurfaceOrEntranceEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPlaceEquipment }
     * {@link RoughSurface }
     * {@link EntranceEquipment }
     * {@link StaircaseEquipment }
     * {@link LiftEquipment }
     * {@link LiftCallEquipment }
     * {@link EscalatorEquipment }
     * {@link TravelatorEquipment }
     * {@link RampEquipment }
     * {@link QueueingEquipment }
     * {@link CrossingEquipment }
     * {@link PlaceLighting }
     * {@link PlaceSignStructure }
     * {@link HeadingSignStructure }
     * {@link GeneralSignStructure }
     * {@link HelpPointEquipment }
     * {@link PassengerSafetyEquipment }
     * {@link RubbishDisposalEquipment }
     * {@link SanitaryEquipment }
     * {@link TicketingEquipment }
     * {@link TicketValidatorEquipment }
     * 
     * 
     */
    public List<InstalledEquipmentVersionStructure> getOtherPlaceEquipmentOrRoughSurfaceOrEntranceEquipment() {
        if (otherPlaceEquipmentOrRoughSurfaceOrEntranceEquipment == null) {
            otherPlaceEquipmentOrRoughSurfaceOrEntranceEquipment = new ArrayList<InstalledEquipmentVersionStructure>();
        }
        return this.otherPlaceEquipmentOrRoughSurfaceOrEntranceEquipment;
    }

}
