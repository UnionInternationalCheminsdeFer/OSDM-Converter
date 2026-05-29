//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for VEHICLE JOURNEY RUN TIME.
 * 
 * <p>Java-Klasse f�r VehicleJourneyRunTime_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleJourneyRunTime_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}JourneyRunTime_VersionedChildStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}VehicleJourneyRunTimeGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleJourneyRunTime_VersionedChildStructure", propOrder = {
    "vehicleJourneyRef"
})
@XmlSeeAlso({
    VehicleJourneyRunTime.class
})
public class VehicleJourneyRunTimeVersionedChildStructure
    extends JourneyRunTimeVersionedChildStructure
{

    @XmlElementRef(name = "VehicleJourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleJourneyRefStructure> vehicleJourneyRef;

    /**
     * Ruft den Wert der vehicleJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleJourneyRefStructure> getVehicleJourneyRef() {
        return vehicleJourneyRef;
    }

    /**
     * Legt den Wert der vehicleJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     
     */
    public void setVehicleJourneyRef(JAXBElement<? extends VehicleJourneyRefStructure> value) {
        this.vehicleJourneyRef = value;
    }

}
