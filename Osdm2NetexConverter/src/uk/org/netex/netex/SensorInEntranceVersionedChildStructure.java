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
 * Type for a SENSOR IN ENTRANCE
 * 
 * <p>Java-Klasse f�r SensorInEntrance_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SensorInEntrance_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SensorInEntranceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SensorInEntrance_VersionedChildStructure", propOrder = {
    "deckEntranceRef",
    "entranceSensorRef"
})
@XmlSeeAlso({
    SensorInEntrance.class
})
public class SensorInEntranceVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElementRef(name = "DeckEntranceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends DeckEntranceRefStructure> deckEntranceRef;
    @XmlElement(name = "EntranceSensorRef")
    protected EntranceSensorRefStructure entranceSensorRef;

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
     * Ruft den Wert der entranceSensorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntranceSensorRefStructure }
     *     
     */
    public EntranceSensorRefStructure getEntranceSensorRef() {
        return entranceSensorRef;
    }

    /**
     * Legt den Wert der entranceSensorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntranceSensorRefStructure }
     *     
     */
    public void setEntranceSensorRef(EntranceSensorRefStructure value) {
        this.entranceSensorRef = value;
    }

}
