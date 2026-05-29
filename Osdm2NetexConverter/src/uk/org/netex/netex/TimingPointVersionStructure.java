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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for TIMING POINT.
 * 
 * <p>Java-Klasse f�r TimingPoint_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimingPoint_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Point_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimingPointGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimingPoint_VersionStructure", propOrder = {
    "timingPointStatus",
    "allowedForWaitTime"
})
@XmlSeeAlso({
    TimingPoint.class,
    ReliefPointVersionStructure.class,
    ScheduledStopPointVersionStructure.class,
    BorderPointValueStructure.class
})
public class TimingPointVersionStructure
    extends PointVersionStructure
{

    @XmlElement(name = "TimingPointStatus")
    @XmlSchemaType(name = "normalizedString")
    protected TimingPointStatusEnumeration timingPointStatus;
    @XmlElement(name = "AllowedForWaitTime")
    protected Duration allowedForWaitTime;

    /**
     * Ruft den Wert der timingPointStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingPointStatusEnumeration }
     *     
     */
    public TimingPointStatusEnumeration getTimingPointStatus() {
        return timingPointStatus;
    }

    /**
     * Legt den Wert der timingPointStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPointStatusEnumeration }
     *     
     */
    public void setTimingPointStatus(TimingPointStatusEnumeration value) {
        this.timingPointStatus = value;
    }

    /**
     * Ruft den Wert der allowedForWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAllowedForWaitTime() {
        return allowedForWaitTime;
    }

    /**
     * Legt den Wert der allowedForWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAllowedForWaitTime(Duration value) {
        this.allowedForWaitTime = value;
    }

}
