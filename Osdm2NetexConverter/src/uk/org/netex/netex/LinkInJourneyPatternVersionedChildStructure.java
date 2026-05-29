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
 * Type for LINK IN JOURNEY PATTERN.
 * 
 * <p>Java-Klasse f�r LinkInJourneyPattern_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LinkInJourneyPattern_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LinkInLinkSequence_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LinkInJourneyPatternGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkInJourneyPattern_VersionedChildStructure", propOrder = {
    "serviceLinkRef",
    "timingLinkRef"
})
@XmlSeeAlso({
    LinkInJourneyPattern.class
})
public class LinkInJourneyPatternVersionedChildStructure
    extends LinkInLinkSequenceVersionedChildStructure
{

    @XmlElement(name = "ServiceLinkRef")
    protected ServiceLinkRefStructure serviceLinkRef;
    @XmlElement(name = "TimingLinkRef")
    protected TimingLinkRefStructure timingLinkRef;

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

}
