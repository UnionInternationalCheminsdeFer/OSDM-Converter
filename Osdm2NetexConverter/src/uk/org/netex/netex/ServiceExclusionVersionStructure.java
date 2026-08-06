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
 * Type for SERVICE EXCLUSION.
 * 
 * <p>Java-Klasse f�r ServiceExclusion_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceExclusion_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ServiceExclusionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceExclusion_VersionStructure", propOrder = {
    "excludingJourneyPatternRef",
    "startPointRef",
    "endPointRef",
    "excludedJourneyPatternRefs",
    "lineRef"
})
@XmlSeeAlso({
    ServiceExclusion.class
})
public class ServiceExclusionVersionStructure
    extends AssignmentVersionStructure
{

    @XmlElement(name = "ExcludingJourneyPatternRef")
    protected JourneyPatternRefStructure excludingJourneyPatternRef;
    @XmlElement(name = "StartPointRef")
    protected ScheduledStopPointRefStructure startPointRef;
    @XmlElement(name = "EndPointRef")
    protected ScheduledStopPointRefStructure endPointRef;
    protected JourneyPatternRefsRelStructure excludedJourneyPatternRefs;
    @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LineRefStructure> lineRef;

    /**
     * Ruft den Wert der excludingJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public JourneyPatternRefStructure getExcludingJourneyPatternRef() {
        return excludingJourneyPatternRef;
    }

    /**
     * Legt den Wert der excludingJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public void setExcludingJourneyPatternRef(JourneyPatternRefStructure value) {
        this.excludingJourneyPatternRef = value;
    }

    /**
     * Ruft den Wert der startPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getStartPointRef() {
        return startPointRef;
    }

    /**
     * Legt den Wert der startPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setStartPointRef(ScheduledStopPointRefStructure value) {
        this.startPointRef = value;
    }

    /**
     * Ruft den Wert der endPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getEndPointRef() {
        return endPointRef;
    }

    /**
     * Legt den Wert der endPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setEndPointRef(ScheduledStopPointRefStructure value) {
        this.endPointRef = value;
    }

    /**
     * Ruft den Wert der excludedJourneyPatternRefs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternRefsRelStructure }
     *     
     */
    public JourneyPatternRefsRelStructure getExcludedJourneyPatternRefs() {
        return excludedJourneyPatternRefs;
    }

    /**
     * Legt den Wert der excludedJourneyPatternRefs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternRefsRelStructure }
     *     
     */
    public void setExcludedJourneyPatternRefs(JourneyPatternRefsRelStructure value) {
        this.excludedJourneyPatternRefs = value;
    }

    /**
     * +v2.0
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

}
