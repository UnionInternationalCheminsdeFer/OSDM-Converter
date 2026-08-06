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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a DECK PLAN ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r DeckPlanAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeckPlanAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeckPlanAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckPlanAssignment_VersionStructure", propOrder = {
    "deckPlanRef",
    "transportTypeRef",
    "trainComponentRef",
    "trainElementTypeRef",
    "journeyRef",
    "journeyPartRef",
    "configurationConditions"
})
@XmlSeeAlso({
    DeckPlanAssignment.class
})
public class DeckPlanAssignmentVersionStructure
    extends AssignmentVersionStructure
{

    @XmlElement(name = "DeckPlanRef", required = true)
    protected DeckPlanRefStructure deckPlanRef;
    @XmlElementRef(name = "TransportTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportTypeRefStructure> transportTypeRef;
    @XmlElement(name = "TrainComponentRef")
    protected TrainComponentRefStructure trainComponentRef;
    @XmlElementRef(name = "TrainElementTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TrainElementTypeRefStructure> trainElementTypeRef;
    @XmlElementRef(name = "JourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyRefStructure> journeyRef;
    @XmlElement(name = "JourneyPartRef")
    protected JourneyPartRefStructure journeyPartRef;
    protected ValidityConditionRefsRelStructure configurationConditions;

    /**
     * Ruft den Wert der deckPlanRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckPlanRefStructure }
     *     
     */
    public DeckPlanRefStructure getDeckPlanRef() {
        return deckPlanRef;
    }

    /**
     * Legt den Wert der deckPlanRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckPlanRefStructure }
     *     
     */
    public void setDeckPlanRef(DeckPlanRefStructure value) {
        this.deckPlanRef = value;
    }

    /**
     * Ruft den Wert der transportTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportTypeRefStructure> getTransportTypeRef() {
        return transportTypeRef;
    }

    /**
     * Legt den Wert der transportTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     
     */
    public void setTransportTypeRef(JAXBElement<? extends TransportTypeRefStructure> value) {
        this.transportTypeRef = value;
    }

    /**
     * Ruft den Wert der trainComponentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainComponentRefStructure }
     *     
     */
    public TrainComponentRefStructure getTrainComponentRef() {
        return trainComponentRef;
    }

    /**
     * Legt den Wert der trainComponentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainComponentRefStructure }
     *     
     */
    public void setTrainComponentRef(TrainComponentRefStructure value) {
        this.trainComponentRef = value;
    }

    /**
     * Ruft den Wert der trainElementTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TractiveElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingElementTypeRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TrainElementTypeRefStructure> getTrainElementTypeRef() {
        return trainElementTypeRef;
    }

    /**
     * Legt den Wert der trainElementTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TractiveElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingElementTypeRefStructure }{@code >}
     *     
     */
    public void setTrainElementTypeRef(JAXBElement<? extends TrainElementTypeRefStructure> value) {
        this.trainElementTypeRef = value;
    }

    /**
     * Ruft den Wert der journeyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends JourneyRefStructure> getJourneyRef() {
        return journeyRef;
    }

    /**
     * Legt den Wert der journeyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public void setJourneyRef(JAXBElement<? extends JourneyRefStructure> value) {
        this.journeyRef = value;
    }

    /**
     * Ruft den Wert der journeyPartRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartRefStructure }
     *     
     */
    public JourneyPartRefStructure getJourneyPartRef() {
        return journeyPartRef;
    }

    /**
     * Legt den Wert der journeyPartRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartRefStructure }
     *     
     */
    public void setJourneyPartRef(JourneyPartRefStructure value) {
        this.journeyPartRef = value;
    }

    /**
     * Ruft den Wert der configurationConditions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditionRefsRelStructure }
     *     
     */
    public ValidityConditionRefsRelStructure getConfigurationConditions() {
        return configurationConditions;
    }

    /**
     * Legt den Wert der configurationConditions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditionRefsRelStructure }
     *     
     */
    public void setConfigurationConditions(ValidityConditionRefsRelStructure value) {
        this.configurationConditions = value;
    }

}
