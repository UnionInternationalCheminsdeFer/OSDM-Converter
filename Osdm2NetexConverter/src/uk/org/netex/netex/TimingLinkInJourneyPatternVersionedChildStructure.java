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


/**
 * Type for TIMING LINK IN JOURNEY PATTERN.
 * 
 * <p>Java-Klasse f�r TimingLinkInJourneyPattern_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimingLinkInJourneyPattern_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LinkInLinkSequence_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimingLinkInJourneyPatternGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimingLinkInJourneyPattern_VersionedChildStructure", propOrder = {
    "timingLinkRef",
    "runTimes"
})
@XmlSeeAlso({
    TimingLinkInJourneyPattern.class
})
public class TimingLinkInJourneyPatternVersionedChildStructure
    extends LinkInLinkSequenceVersionedChildStructure
{

    @XmlElement(name = "TimingLinkRef", required = true)
    protected TimingLinkRefStructure timingLinkRef;
    protected JourneyRunTimesRelStructure runTimes;

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
     * Ruft den Wert der runTimes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRunTimesRelStructure }
     *     
     */
    public JourneyRunTimesRelStructure getRunTimes() {
        return runTimes;
    }

    /**
     * Legt den Wert der runTimes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRunTimesRelStructure }
     *     
     */
    public void setRunTimes(JourneyRunTimesRelStructure value) {
        this.runTimes = value;
    }

}
