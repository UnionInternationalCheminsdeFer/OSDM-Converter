//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a PASSENGER STOP ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r PassengerStopAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerStopAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}StopAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerStopAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerStopAssignment_VersionStructure", propOrder = {
    "stopPlaceRef",
    "stopPlace",
    "quayRef",
    "quay",
    "boardingPositionRef",
    "boardingPosition",
    "passengerBoardingPositionAssignments",
    "trainElements"
})
@XmlSeeAlso({
    PassengerStopAssignment.class,
    VehicleJourneyStopAssignmentVersionStructure.class
})
public class PassengerStopAssignmentVersionStructure
    extends StopAssignmentVersionStructure
{

    @XmlElementRef(name = "StopPlaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends StopPlaceRefStructure> stopPlaceRef;
    @XmlElement(name = "StopPlace")
    protected StopPlace stopPlace;
    @XmlElementRef(name = "QuayRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends QuayRefStructure> quayRef;
    @XmlElement(name = "Quay")
    protected Quay quay;
    @XmlElement(name = "BoardingPositionRef")
    protected BoardingPositionRefStructure boardingPositionRef;
    @XmlElement(name = "BoardingPosition")
    protected BoardingPosition boardingPosition;
    protected List<PassengerStopAssignmentVersionStructure.PassengerBoardingPositionAssignments> passengerBoardingPositionAssignments;
    protected List<TrainStopAssignmentsRelStructure> trainElements;

    /**
     * Ruft den Wert der stopPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends StopPlaceRefStructure> getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Legt den Wert der stopPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public void setStopPlaceRef(JAXBElement<? extends StopPlaceRefStructure> value) {
        this.stopPlaceRef = value;
    }

    /**
     * Ruft den Wert der stopPlace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPlace }
     *     
     */
    public StopPlace getStopPlace() {
        return stopPlace;
    }

    /**
     * Legt den Wert der stopPlace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlace }
     *     
     */
    public void setStopPlace(StopPlace value) {
        this.stopPlace = value;
    }

    /**
     * Ruft den Wert der quayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends QuayRefStructure> getQuayRef() {
        return quayRef;
    }

    /**
     * Legt den Wert der quayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     *     
     */
    public void setQuayRef(JAXBElement<? extends QuayRefStructure> value) {
        this.quayRef = value;
    }

    /**
     * Ruft den Wert der quay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Quay }
     *     
     */
    public Quay getQuay() {
        return quay;
    }

    /**
     * Legt den Wert der quay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Quay }
     *     
     */
    public void setQuay(Quay value) {
        this.quay = value;
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
     * Ruft den Wert der boardingPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPosition }
     *     
     */
    public BoardingPosition getBoardingPosition() {
        return boardingPosition;
    }

    /**
     * Legt den Wert der boardingPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPosition }
     *     
     */
    public void setBoardingPosition(BoardingPosition value) {
        this.boardingPosition = value;
    }

    /**
     * Gets the value of the passengerBoardingPositionAssignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerBoardingPositionAssignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerBoardingPositionAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerStopAssignmentVersionStructure.PassengerBoardingPositionAssignments }
     * 
     * 
     */
    public List<PassengerStopAssignmentVersionStructure.PassengerBoardingPositionAssignments> getPassengerBoardingPositionAssignments() {
        if (passengerBoardingPositionAssignments == null) {
            passengerBoardingPositionAssignments = new ArrayList<PassengerStopAssignmentVersionStructure.PassengerBoardingPositionAssignments>();
        }
        return this.passengerBoardingPositionAssignments;
    }

    /**
     * Gets the value of the trainElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trainElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrainStopAssignmentsRelStructure }
     * 
     * 
     */
    public List<TrainStopAssignmentsRelStructure> getTrainElements() {
        if (trainElements == null) {
            trainElements = new ArrayList<TrainStopAssignmentsRelStructure>();
        }
        return this.trainElements;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}passengerBoardingPositionAssignments_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PassengerBoardingPositionAssignments
        extends PassengerBoardingPositionAssignmentsRelStructure
    {


    }

}
