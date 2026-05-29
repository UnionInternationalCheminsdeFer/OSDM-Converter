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
 * Type for TURNAROUND TIME LIMIT.
 * 
 * <p>Java-Klasse f�r TurnaroundTimeLimitTime_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TurnaroundTimeLimitTime_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}JourneyTiming_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TurnaroundTimeLimitTimeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TurnaroundTimeLimitTime_VersionedChildStructure", propOrder = {
    "minimumDuration",
    "maximumDuration"
})
@XmlSeeAlso({
    TurnaroundTimeLimitTime.class
})
public class TurnaroundTimeLimitTimeVersionedChildStructure
    extends JourneyTimingVersionedChildStructure
{

    @XmlElement(name = "MinimumDuration")
    protected Duration minimumDuration;
    @XmlElement(name = "MaximumDuration")
    protected Duration maximumDuration;

    /**
     * Ruft den Wert der minimumDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumDuration() {
        return minimumDuration;
    }

    /**
     * Legt den Wert der minimumDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumDuration(Duration value) {
        this.minimumDuration = value;
    }

    /**
     * Ruft den Wert der maximumDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumDuration() {
        return maximumDuration;
    }

    /**
     * Legt den Wert der maximumDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumDuration(Duration value) {
        this.maximumDuration = value;
    }

}
