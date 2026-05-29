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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for DEAD RUN.
 * 
 * <p>Java-Klasse f�r DeadRun_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeadRun_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleJourney_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeadRunGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeadRun_VersionStructure", propOrder = {
    "operatorRef",
    "lineRef",
    "directionType",
    "groupsOfServices",
    "trainNumbers",
    "origin",
    "destination",
    "deadRunType"
})
@XmlSeeAlso({
    DeadRunWithCallsVersionStructure.class
})
public class DeadRunVersionStructure
    extends VehicleJourneyVersionStructure
{

    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LineRefStructure> lineRef;
    @XmlElement(name = "DirectionType", defaultValue = "outbound")
    @XmlSchemaType(name = "normalizedString")
    protected DirectionTypeEnumeration directionType;
    protected GroupOfServicesRefsRelStructure groupsOfServices;
    protected TrainNumberRefsRelStructure trainNumbers;
    @XmlElement(name = "Origin")
    protected DeadRunEndpointStructure origin;
    @XmlElement(name = "Destination")
    protected DeadRunEndpointStructure destination;
    @XmlElement(name = "DeadRunType")
    @XmlSchemaType(name = "NMTOKEN")
    protected DeadRunTypeEnumeration deadRunType;

    /**
     * Ruft den Wert der operatorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Legt den Wert der operatorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Ruft den Wert der lineRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LineRefStructure> getLineRef() {
        return lineRef;
    }

    /**
     * Legt den Wert der lineRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     
     */
    public void setLineRef(JAXBElement<? extends LineRefStructure> value) {
        this.lineRef = value;
    }

    /**
     * Ruft den Wert der directionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionTypeEnumeration }
     *     
     */
    public DirectionTypeEnumeration getDirectionType() {
        return directionType;
    }

    /**
     * Legt den Wert der directionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionTypeEnumeration }
     *     
     */
    public void setDirectionType(DirectionTypeEnumeration value) {
        this.directionType = value;
    }

    /**
     * Ruft den Wert der groupsOfServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfServicesRefsRelStructure }
     *     
     */
    public GroupOfServicesRefsRelStructure getGroupsOfServices() {
        return groupsOfServices;
    }

    /**
     * Legt den Wert der groupsOfServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfServicesRefsRelStructure }
     *     
     */
    public void setGroupsOfServices(GroupOfServicesRefsRelStructure value) {
        this.groupsOfServices = value;
    }

    /**
     * Ruft den Wert der trainNumbers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainNumberRefsRelStructure }
     *     
     */
    public TrainNumberRefsRelStructure getTrainNumbers() {
        return trainNumbers;
    }

    /**
     * Legt den Wert der trainNumbers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainNumberRefsRelStructure }
     *     
     */
    public void setTrainNumbers(TrainNumberRefsRelStructure value) {
        this.trainNumbers = value;
    }

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeadRunEndpointStructure }
     *     
     */
    public DeadRunEndpointStructure getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadRunEndpointStructure }
     *     
     */
    public void setOrigin(DeadRunEndpointStructure value) {
        this.origin = value;
    }

    /**
     * Ruft den Wert der destination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeadRunEndpointStructure }
     *     
     */
    public DeadRunEndpointStructure getDestination() {
        return destination;
    }

    /**
     * Legt den Wert der destination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadRunEndpointStructure }
     *     
     */
    public void setDestination(DeadRunEndpointStructure value) {
        this.destination = value;
    }

    /**
     * Ruft den Wert der deadRunType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeadRunTypeEnumeration }
     *     
     */
    public DeadRunTypeEnumeration getDeadRunType() {
        return deadRunType;
    }

    /**
     * Legt den Wert der deadRunType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadRunTypeEnumeration }
     *     
     */
    public void setDeadRunType(DeadRunTypeEnumeration value) {
        this.deadRunType = value;
    }

}
