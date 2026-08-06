//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * DEPRECATED - Use PASSENGER BOARDING POSITION ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r TrainStopAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrainStopAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}StopAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerBoardingPositionAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainStopAssignment_VersionStructure", propOrder = {
    "passengerStopAssignmentRef",
    "trainRef",
    "trainComponentRef",
    "trainComponentView",
    "positionOfTrainElement",
    "boardingPositionRef",
    "isAllowed",
    "entranceToVehicle",
    "deckEntranceAssignments"
})
@XmlSeeAlso({
    TrainStopAssignment.class
})
public class TrainStopAssignmentVersionStructure
    extends StopAssignmentVersionStructure
{

    @XmlElementRef(name = "PassengerStopAssignmentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PassengerStopAssignmentRefStructure> passengerStopAssignmentRef;
    @XmlElementRef(name = "TrainRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TrainRefStructure> trainRef;
    @XmlElement(name = "TrainComponentRef")
    protected TrainComponentRefStructure trainComponentRef;
    @XmlElement(name = "TrainComponentView")
    protected TrainComponentView trainComponentView;
    @XmlElement(name = "PositionOfTrainElement")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger positionOfTrainElement;
    @XmlElement(name = "BoardingPositionRef")
    protected BoardingPositionRefStructure boardingPositionRef;
    @XmlElement(name = "IsAllowed", defaultValue = "true")
    protected Boolean isAllowed;
    @XmlElement(name = "EntranceToVehicle")
    protected MultilingualString entranceToVehicle;
    protected DeckEntranceAssignmentsRelStructure deckEntranceAssignments;

    /**
     * Ruft den Wert der passengerStopAssignmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DynamicStopAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyStopAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerStopAssignmentRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends PassengerStopAssignmentRefStructure> getPassengerStopAssignmentRef() {
        return passengerStopAssignmentRef;
    }

    /**
     * Legt den Wert der passengerStopAssignmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DynamicStopAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyStopAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerStopAssignmentRefStructure }{@code >}
     *     
     */
    public void setPassengerStopAssignmentRef(JAXBElement<? extends PassengerStopAssignmentRefStructure> value) {
        this.passengerStopAssignmentRef = value;
    }

    /**
     * Ruft den Wert der trainRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TrainRefStructure> getTrainRef() {
        return trainRef;
    }

    /**
     * Legt den Wert der trainRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     
     */
    public void setTrainRef(JAXBElement<? extends TrainRefStructure> value) {
        this.trainRef = value;
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
     * Ruft den Wert der trainComponentView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainComponentView }
     *     
     */
    public TrainComponentView getTrainComponentView() {
        return trainComponentView;
    }

    /**
     * Legt den Wert der trainComponentView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainComponentView }
     *     
     */
    public void setTrainComponentView(TrainComponentView value) {
        this.trainComponentView = value;
    }

    /**
     * Ruft den Wert der positionOfTrainElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPositionOfTrainElement() {
        return positionOfTrainElement;
    }

    /**
     * Legt den Wert der positionOfTrainElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPositionOfTrainElement(BigInteger value) {
        this.positionOfTrainElement = value;
    }

    /**
     * Ruft den Wert der boardingPositionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public BoardingPositionRefStructure getBoardingPositionRef() {
        return boardingPositionRef;
    }

    /**
     * Legt den Wert der boardingPositionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public void setBoardingPositionRef(BoardingPositionRefStructure value) {
        this.boardingPositionRef = value;
    }

    /**
     * Ruft den Wert der isAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllowed() {
        return isAllowed;
    }

    /**
     * Legt den Wert der isAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllowed(Boolean value) {
        this.isAllowed = value;
    }

    /**
     * Ruft den Wert der entranceToVehicle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getEntranceToVehicle() {
        return entranceToVehicle;
    }

    /**
     * Legt den Wert der entranceToVehicle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setEntranceToVehicle(MultilingualString value) {
        this.entranceToVehicle = value;
    }

    /**
     * Ruft den Wert der deckEntranceAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckEntranceAssignmentsRelStructure }
     *     
     */
    public DeckEntranceAssignmentsRelStructure getDeckEntranceAssignments() {
        return deckEntranceAssignments;
    }

    /**
     * Legt den Wert der deckEntranceAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckEntranceAssignmentsRelStructure }
     *     
     */
    public void setDeckEntranceAssignments(DeckEntranceAssignmentsRelStructure value) {
        this.deckEntranceAssignments = value;
    }

}
