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
 * Type for a FLEXIBLE STOP ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r FlexibleStopAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlexibleStopAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}StopAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FlexibleStopAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleStopAssignment_VersionStructure", propOrder = {
    "flexibleStopPlaceRef",
    "flexibleQuayRef"
})
@XmlSeeAlso({
    FlexibleStopAssignment.class
})
public class FlexibleStopAssignmentVersionStructure
    extends StopAssignmentVersionStructure
{

    @XmlElement(name = "FlexibleStopPlaceRef", required = true)
    protected FlexibleStopPlaceRefStructure flexibleStopPlaceRef;
    @XmlElementRef(name = "FlexibleQuayRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FlexibleQuayRefStructure> flexibleQuayRef;

    /**
     * Ruft den Wert der flexibleStopPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleStopPlaceRefStructure }
     *     
     */
    public FlexibleStopPlaceRefStructure getFlexibleStopPlaceRef() {
        return flexibleStopPlaceRef;
    }

    /**
     * Legt den Wert der flexibleStopPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleStopPlaceRefStructure }
     *     
     */
    public void setFlexibleStopPlaceRef(FlexibleStopPlaceRefStructure value) {
        this.flexibleStopPlaceRef = value;
    }

    /**
     * Ruft den Wert der flexibleQuayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlexibleAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HailAndRideAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleQuayRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends FlexibleQuayRefStructure> getFlexibleQuayRef() {
        return flexibleQuayRef;
    }

    /**
     * Legt den Wert der flexibleQuayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlexibleAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HailAndRideAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleQuayRefStructure }{@code >}
     *     
     */
    public void setFlexibleQuayRef(JAXBElement<? extends FlexibleQuayRefStructure> value) {
        this.flexibleQuayRef = value;
    }

}
