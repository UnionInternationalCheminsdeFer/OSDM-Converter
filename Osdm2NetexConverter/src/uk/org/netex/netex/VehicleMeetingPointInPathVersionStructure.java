//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for VEHICLE MEETING POINT IN SINGLE JOURNEY PATH .
 * 
 * <p>Java-Klasse f�r VehicleMeetingPointInPath_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleMeetingPointInPath_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PointInJourneyPattern_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleMeetingPointInPathGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleMeetingPointInPath_VersionStructure", propOrder = {
    "onwardVehicleMeetingLinkRef"
})
@XmlSeeAlso({
    VehicleMeetingPointInPath.class
})
public class VehicleMeetingPointInPathVersionStructure
    extends PointInJourneyPatternVersionedChildStructure
{

    @XmlElement(name = "OnwardVehicleMeetingLinkRef")
    protected VehicleMeetingLinkRefStructure onwardVehicleMeetingLinkRef;

    /**
     * Ruft den Wert der onwardVehicleMeetingLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMeetingLinkRefStructure }
     *     
     */
    public VehicleMeetingLinkRefStructure getOnwardVehicleMeetingLinkRef() {
        return onwardVehicleMeetingLinkRef;
    }

    /**
     * Legt den Wert der onwardVehicleMeetingLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMeetingLinkRefStructure }
     *     
     */
    public void setOnwardVehicleMeetingLinkRef(VehicleMeetingLinkRefStructure value) {
        this.onwardVehicleMeetingLinkRef = value;
    }

}
