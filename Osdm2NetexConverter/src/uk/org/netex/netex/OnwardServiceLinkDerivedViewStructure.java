//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for information about onwards SERVICE LINK.
 * 
 * <p>Java-Klasse f�r OnwardServiceLink_DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OnwardServiceLink_DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ServiceLinkInJourneyPattern" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ServiceLinkRef" minOccurs="0"/>
 *         &lt;element name="ToPointRef" type="{http://www.netex.org.uk/netex}ScheduledStopPointRefStructure" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://www.netex.org.uk/netex}DistanceType" minOccurs="0"/>
 *         &lt;element name="RunTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnwardServiceLink_DerivedViewStructure", propOrder = {
    "serviceLinkInJourneyPattern",
    "serviceLinkRef",
    "toPointRef",
    "distance",
    "runTime"
})
@XmlSeeAlso({
    OnwardServiceLinkView.class
})
public class OnwardServiceLinkDerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "ServiceLinkInJourneyPattern")
    protected ServiceLinkInJourneyPattern serviceLinkInJourneyPattern;
    @XmlElement(name = "ServiceLinkRef")
    protected ServiceLinkRefStructure serviceLinkRef;
    @XmlElement(name = "ToPointRef")
    protected ScheduledStopPointRefStructure toPointRef;
    @XmlElement(name = "Distance")
    protected BigDecimal distance;
    @XmlElement(name = "RunTime")
    protected Duration runTime;

    /**
     * Ruft den Wert der serviceLinkInJourneyPattern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLinkInJourneyPattern }
     *     
     */
    public ServiceLinkInJourneyPattern getServiceLinkInJourneyPattern() {
        return serviceLinkInJourneyPattern;
    }

    /**
     * Legt den Wert der serviceLinkInJourneyPattern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLinkInJourneyPattern }
     *     
     */
    public void setServiceLinkInJourneyPattern(ServiceLinkInJourneyPattern value) {
        this.serviceLinkInJourneyPattern = value;
    }

    /**
     * Ruft den Wert der serviceLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLinkRefStructure }
     *     
     */
    public ServiceLinkRefStructure getServiceLinkRef() {
        return serviceLinkRef;
    }

    /**
     * Legt den Wert der serviceLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLinkRefStructure }
     *     
     */
    public void setServiceLinkRef(ServiceLinkRefStructure value) {
        this.serviceLinkRef = value;
    }

    /**
     * Ruft den Wert der toPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getToPointRef() {
        return toPointRef;
    }

    /**
     * Legt den Wert der toPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setToPointRef(ScheduledStopPointRefStructure value) {
        this.toPointRef = value;
    }

    /**
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
    }

    /**
     * Ruft den Wert der runTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRunTime() {
        return runTime;
    }

    /**
     * Legt den Wert der runTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRunTime(Duration value) {
        this.runTime = value;
    }

}
