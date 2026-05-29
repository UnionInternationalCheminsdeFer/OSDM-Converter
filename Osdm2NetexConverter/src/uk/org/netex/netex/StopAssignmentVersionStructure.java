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
 * Type for a STOP ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r StopAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StopAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}StopAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopAssignment_VersionStructure", propOrder = {
    "boardingUse",
    "alightingUse",
    "privateCode",
    "scheduledStopPointRef",
    "scheduledStopPoint",
    "arrivesForwards",
    "departsForwards",
    "arrivesFromLeft",
    "departsToRight"
})
@XmlSeeAlso({
    VehicleTypeStopAssignmentVersionStructure.class,
    NavigationPathAssignmentVersionStructure.class,
    PassengerBoardingPositionAssignmentVersionStructure.class,
    FlexibleStopAssignmentVersionStructure.class,
    TrainStopAssignmentVersionStructure.class,
    PassengerStopAssignmentVersionStructure.class
})
public class StopAssignmentVersionStructure
    extends AssignmentVersionStructure
{

    @XmlElement(name = "BoardingUse", defaultValue = "true")
    protected Boolean boardingUse;
    @XmlElement(name = "AlightingUse", defaultValue = "true")
    protected Boolean alightingUse;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElementRef(name = "ScheduledStopPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ScheduledStopPointRefStructure> scheduledStopPointRef;
    @XmlElement(name = "ScheduledStopPoint")
    protected ScheduledStopPoint scheduledStopPoint;
    @XmlElement(name = "ArrivesForwards", defaultValue = "true")
    protected Boolean arrivesForwards;
    @XmlElement(name = "DepartsForwards", defaultValue = "true")
    protected Boolean departsForwards;
    @XmlElement(name = "ArrivesFromLeft", defaultValue = "true")
    protected Boolean arrivesFromLeft;
    @XmlElement(name = "DepartsToRight", defaultValue = "true")
    protected Boolean departsToRight;

    /**
     * Ruft den Wert der boardingUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoardingUse() {
        return boardingUse;
    }

    /**
     * Legt den Wert der boardingUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoardingUse(Boolean value) {
        this.boardingUse = value;
    }

    /**
     * Ruft den Wert der alightingUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlightingUse() {
        return alightingUse;
    }

    /**
     * Legt den Wert der alightingUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlightingUse(Boolean value) {
        this.alightingUse = value;
    }

    /**
     * DEPRECATED - use privateCodes. -v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der scheduledStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ScheduledStopPointRefStructure> getScheduledStopPointRef() {
        return scheduledStopPointRef;
    }

    /**
     * Legt den Wert der scheduledStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     
     */
    public void setScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        this.scheduledStopPointRef = value;
    }

    /**
     * Ruft den Wert der scheduledStopPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPoint }
     *     
     */
    public ScheduledStopPoint getScheduledStopPoint() {
        return scheduledStopPoint;
    }

    /**
     * Legt den Wert der scheduledStopPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPoint }
     *     
     */
    public void setScheduledStopPoint(ScheduledStopPoint value) {
        this.scheduledStopPoint = value;
    }

    /**
     * Ruft den Wert der arrivesForwards-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArrivesForwards() {
        return arrivesForwards;
    }

    /**
     * Legt den Wert der arrivesForwards-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrivesForwards(Boolean value) {
        this.arrivesForwards = value;
    }

    /**
     * Ruft den Wert der departsForwards-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepartsForwards() {
        return departsForwards;
    }

    /**
     * Legt den Wert der departsForwards-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepartsForwards(Boolean value) {
        this.departsForwards = value;
    }

    /**
     * Ruft den Wert der arrivesFromLeft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArrivesFromLeft() {
        return arrivesFromLeft;
    }

    /**
     * Legt den Wert der arrivesFromLeft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrivesFromLeft(Boolean value) {
        this.arrivesFromLeft = value;
    }

    /**
     * Ruft den Wert der departsToRight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepartsToRight() {
        return departsToRight;
    }

    /**
     * Legt den Wert der departsToRight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepartsToRight(Boolean value) {
        this.departsToRight = value;
    }

}
