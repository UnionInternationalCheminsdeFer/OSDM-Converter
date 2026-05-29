//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for a JOURNEY HEADWAY Interval.
 * 
 * <p>Java-Klasse f�r JourneyHeadway_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JourneyHeadway_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}JourneyTiming_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}HeadwayIntervalGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyHeadway_VersionedChildStructure", propOrder = {
    "scheduledHeadwayInterval",
    "minimumHeadwayInterval",
    "maximumHeadwayInterval"
})
@XmlSeeAlso({
    JourneyHeadway.class,
    JourneyPatternHeadwayVersionedChildStructure.class,
    VehicleJourneyHeadwayVersionedChildStructure.class
})
public class JourneyHeadwayVersionedChildStructure
    extends JourneyTimingVersionedChildStructure
{

    @XmlElement(name = "ScheduledHeadwayInterval")
    protected Duration scheduledHeadwayInterval;
    @XmlElement(name = "MinimumHeadwayInterval")
    protected Duration minimumHeadwayInterval;
    @XmlElement(name = "MaximumHeadwayInterval")
    protected Duration maximumHeadwayInterval;

    /**
     * Ruft den Wert der scheduledHeadwayInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getScheduledHeadwayInterval() {
        return scheduledHeadwayInterval;
    }

    /**
     * Legt den Wert der scheduledHeadwayInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setScheduledHeadwayInterval(Duration value) {
        this.scheduledHeadwayInterval = value;
    }

    /**
     * Ruft den Wert der minimumHeadwayInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumHeadwayInterval() {
        return minimumHeadwayInterval;
    }

    /**
     * Legt den Wert der minimumHeadwayInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumHeadwayInterval(Duration value) {
        this.minimumHeadwayInterval = value;
    }

    /**
     * Ruft den Wert der maximumHeadwayInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumHeadwayInterval() {
        return maximumHeadwayInterval;
    }

    /**
     * Legt den Wert der maximumHeadwayInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumHeadwayInterval(Duration value) {
        this.maximumHeadwayInterval = value;
    }

}
