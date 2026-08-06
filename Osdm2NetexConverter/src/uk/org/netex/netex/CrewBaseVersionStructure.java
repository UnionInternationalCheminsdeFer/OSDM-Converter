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
 * Type for CREW BASE.
 * 
 * <p>Java-Klasse f�r CrewBase_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CrewBase_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}CrewBaseGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrewBase_VersionStructure", propOrder = {
    "reliefPointRef",
    "garages"
})
@XmlSeeAlso({
    CrewBase.class
})
public class CrewBaseVersionStructure
    extends GroupOfEntitiesVersionStructure
{

    @XmlElementRef(name = "ReliefPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends ReliefPointRefStructure> reliefPointRef;
    protected GarageRefsRelStructure garages;

    /**
     * Ruft den Wert der reliefPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ReliefPointRefStructure> getReliefPointRef() {
        return reliefPointRef;
    }

    /**
     * Legt den Wert der reliefPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     *     
     */
    public void setReliefPointRef(JAXBElement<? extends ReliefPointRefStructure> value) {
        this.reliefPointRef = value;
    }

    /**
     * Ruft den Wert der garages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GarageRefsRelStructure }
     *     
     */
    public GarageRefsRelStructure getGarages() {
        return garages;
    }

    /**
     * Legt den Wert der garages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GarageRefsRelStructure }
     *     
     */
    public void setGarages(GarageRefsRelStructure value) {
        this.garages = value;
    }

}
