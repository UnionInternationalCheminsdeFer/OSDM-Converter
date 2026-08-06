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
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for a HEADWAY INTERVAL.
 * 
 * <p>Java-Klasse f�r FrequencyStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FrequencyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}HeadwayIntervalGroup"/>
 *         &lt;element name="HeadwayDisplay" type="{http://www.netex.org.uk/netex}HeadwayUseEnumeration" minOccurs="0"/>
 *         &lt;element name="FrequencyRegulated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyStructure", propOrder = {
    "scheduledHeadwayInterval",
    "minimumHeadwayInterval",
    "maximumHeadwayInterval",
    "headwayDisplay",
    "frequencyRegulated",
    "description"
})
public class FrequencyStructure {

    @XmlElement(name = "ScheduledHeadwayInterval")
    protected Duration scheduledHeadwayInterval;
    @XmlElement(name = "MinimumHeadwayInterval")
    protected Duration minimumHeadwayInterval;
    @XmlElement(name = "MaximumHeadwayInterval")
    protected Duration maximumHeadwayInterval;
    @XmlElement(name = "HeadwayDisplay", defaultValue = "DisplayInsteadOfPassingTimes")
    @XmlSchemaType(name = "normalizedString")
    protected HeadwayUseEnumeration headwayDisplay;
    @XmlElement(name = "FrequencyRegulated")
    protected Boolean frequencyRegulated;
    @XmlElement(name = "Description")
    protected MultilingualString description;

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

    /**
     * Ruft den Wert der headwayDisplay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeadwayUseEnumeration }
     *     
     */
    public HeadwayUseEnumeration getHeadwayDisplay() {
        return headwayDisplay;
    }

    /**
     * Legt den Wert der headwayDisplay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadwayUseEnumeration }
     *     
     */
    public void setHeadwayDisplay(HeadwayUseEnumeration value) {
        this.headwayDisplay = value;
    }

    /**
     * Ruft den Wert der frequencyRegulated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrequencyRegulated() {
        return frequencyRegulated;
    }

    /**
     * Legt den Wert der frequencyRegulated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrequencyRegulated(Boolean value) {
        this.frequencyRegulated = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

}
