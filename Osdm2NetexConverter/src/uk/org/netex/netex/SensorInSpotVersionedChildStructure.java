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
 * Type for a SENSOR IN SPOT
 * 
 * <p>Java-Klasse f�r SensorInSpot_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SensorInSpot_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SensorInSpotGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SensorInSpot_VersionedChildStructure", propOrder = {
    "locatableSpotRef",
    "spotSensorRef"
})
@XmlSeeAlso({
    SensorInSpot.class
})
public class SensorInSpotVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElementRef(name = "LocatableSpotRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LocatableSpotRefStructure> locatableSpotRef;
    @XmlElement(name = "SpotSensorRef")
    protected SpotSensorRefStructure spotSensorRef;

    /**
     * Ruft den Wert der locatableSpotRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PassengerVehicleSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocatableSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageSpotRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LocatableSpotRefStructure> getLocatableSpotRef() {
        return locatableSpotRef;
    }

    /**
     * Legt den Wert der locatableSpotRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PassengerVehicleSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocatableSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageSpotRefStructure }{@code >}
     *     
     */
    public void setLocatableSpotRef(JAXBElement<? extends LocatableSpotRefStructure> value) {
        this.locatableSpotRef = value;
    }

    /**
     * Ruft den Wert der spotSensorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpotSensorRefStructure }
     *     
     */
    public SpotSensorRefStructure getSpotSensorRef() {
        return spotSensorRef;
    }

    /**
     * Legt den Wert der spotSensorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotSensorRefStructure }
     *     
     */
    public void setSpotSensorRef(SpotSensorRefStructure value) {
        this.spotSensorRef = value;
    }

}
