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
 * Type for PASSING TIME.
 * 
 * <p>Java-Klasse f�r PassingTime_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassingTime_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassingTimeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassingTime_VersionedChildStructure", propOrder = {
    "journeyRef",
    "alightAndReboard",
    "pointInJourneyPatternRef"
})
@XmlSeeAlso({
    PassengerAtStopTimeVersionedChildStructure.class,
    TimetabledPassingTimeVersionedChildStructure.class,
    DatedPassingTimeVersionedChildStructure.class
})
public abstract class PassingTimeVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElementRef(name = "JourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyRefStructure> journeyRef;
    @XmlElement(name = "AlightAndReboard")
    protected Boolean alightAndReboard;
    @XmlElementRef(name = "PointInJourneyPatternRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends PointInJourneyPatternRefStructure> pointInJourneyPatternRef;

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
     * Ruft den Wert der alightAndReboard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlightAndReboard() {
        return alightAndReboard;
    }

    /**
     * Legt den Wert der alightAndReboard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlightAndReboard(Boolean value) {
        this.alightAndReboard = value;
    }

    /**
     * Ruft den Wert der pointInJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopPointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FarePointInPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointInSingleJourneyPathRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends PointInJourneyPatternRefStructure> getPointInJourneyPatternRef() {
        return pointInJourneyPatternRef;
    }

    /**
     * Legt den Wert der pointInJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopPointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FarePointInPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointInSingleJourneyPathRefStructure }{@code >}
     *     
     */
    public void setPointInJourneyPatternRef(JAXBElement<? extends PointInJourneyPatternRefStructure> value) {
        this.pointInJourneyPatternRef = value;
    }

}
