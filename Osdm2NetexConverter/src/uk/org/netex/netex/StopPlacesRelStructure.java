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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of STOP PLACEs.
 * 
 * <p>Java-Klasse f�r stopPlaces_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="stopPlaces_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice>
 *         &lt;element ref="{http://www.netex.org.uk/netex}StopPlaceRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}StopPlace"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stopPlaces_RelStructure", propOrder = {
    "stopPlaceRef",
    "stopPlace"
})
public class StopPlacesRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRef(name = "StopPlaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends StopPlaceRefStructure> stopPlaceRef;
    @XmlElement(name = "StopPlace")
    protected StopPlace stopPlace;

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
     * A STOP PLACE.
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

}
