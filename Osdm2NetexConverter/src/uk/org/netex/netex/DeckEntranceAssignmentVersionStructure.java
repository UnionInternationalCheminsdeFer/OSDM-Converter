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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a DECK ENTRANCE ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r DeckEntranceAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeckEntranceAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassengerBoardingPositionAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeckEntranceAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckEntranceAssignment_VersionStructure", propOrder = {
    "deckEntranceRef",
    "entranceSetting",
    "startSpot",
    "endSpot"
})
@XmlSeeAlso({
    DeckEntranceAssignment.class
})
public class DeckEntranceAssignmentVersionStructure
    extends PassengerBoardingPositionAssignmentVersionStructure
{

    @XmlElementRef(name = "DeckEntranceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends DeckEntranceRefStructure> deckEntranceRef;
    @XmlElement(name = "EntranceSetting")
    @XmlSchemaType(name = "normalizedString")
    protected EntranceSettingEnumeration entranceSetting;
    @XmlElement(name = "StartSpot")
    protected LocatableSpotRangeRefStructure startSpot;
    @XmlElement(name = "EndSpot")
    protected List<LocatableSpotRangeRefStructure> endSpot;

    /**
     * Ruft den Wert der deckEntranceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeckEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherDeckEntranceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends DeckEntranceRefStructure> getDeckEntranceRef() {
        return deckEntranceRef;
    }

    /**
     * Legt den Wert der deckEntranceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeckEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherDeckEntranceRefStructure }{@code >}
     *     
     */
    public void setDeckEntranceRef(JAXBElement<? extends DeckEntranceRefStructure> value) {
        this.deckEntranceRef = value;
    }

    /**
     * Ruft den Wert der entranceSetting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntranceSettingEnumeration }
     *     
     */
    public EntranceSettingEnumeration getEntranceSetting() {
        return entranceSetting;
    }

    /**
     * Legt den Wert der entranceSetting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntranceSettingEnumeration }
     *     
     */
    public void setEntranceSetting(EntranceSettingEnumeration value) {
        this.entranceSetting = value;
    }

    /**
     * Ruft den Wert der startSpot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocatableSpotRangeRefStructure }
     *     
     */
    public LocatableSpotRangeRefStructure getStartSpot() {
        return startSpot;
    }

    /**
     * Legt den Wert der startSpot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatableSpotRangeRefStructure }
     *     
     */
    public void setStartSpot(LocatableSpotRangeRefStructure value) {
        this.startSpot = value;
    }

    /**
     * Gets the value of the endSpot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endSpot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndSpot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocatableSpotRangeRefStructure }
     * 
     * 
     */
    public List<LocatableSpotRangeRefStructure> getEndSpot() {
        if (endSpot == null) {
            endSpot = new ArrayList<LocatableSpotRangeRefStructure>();
        }
        return this.endSpot;
    }

}
