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
 * Type for JOURNEY RUN TIME.
 * 
 * <p>Java-Klasse f�r JourneyRunTime_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JourneyRunTime_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}JourneyTiming_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyRunTimeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyRunTime_VersionedChildStructure", propOrder = {
    "timingLinkRef",
    "runTime"
})
@XmlSeeAlso({
    JourneyRunTime.class,
    JourneyPatternRunTimeVersionedChildStructure.class,
    VehicleJourneyRunTimeVersionedChildStructure.class
})
public class JourneyRunTimeVersionedChildStructure
    extends JourneyTimingVersionedChildStructure
{

    @XmlElement(name = "TimingLinkRef")
    protected TimingLinkRefStructure timingLinkRef;
    @XmlElement(name = "RunTime", required = true)
    protected Duration runTime;

    /**
     * Ruft den Wert der timingLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingLinkRefStructure }
     *     
     */
    public TimingLinkRefStructure getTimingLinkRef() {
        return timingLinkRef;
    }

    /**
     * Legt den Wert der timingLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingLinkRefStructure }
     *     
     */
    public void setTimingLinkRef(TimingLinkRefStructure value) {
        this.timingLinkRef = value;
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
