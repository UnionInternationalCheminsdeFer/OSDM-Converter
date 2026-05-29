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
 * Type for DEFAULT INTERCHANGE.
 * 
 * <p>Java-Klasse f�r DefaultInterchange_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DefaultInterchange_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DefaultInterchangeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultInterchange_VersionStructure", propOrder = {
    "fromStopPointRef",
    "toStopPointRef",
    "description",
    "standardWaitTime",
    "maximumWaitTime",
    "maximumAutomaticWaitTime",
    "standardTransferTime",
    "minimumTransferTime",
    "maximumTransferTime"
})
@XmlSeeAlso({
    DefaultInterchange.class
})
public class DefaultInterchangeVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "FromStopPointRef")
    protected ScheduledStopPointRefStructure fromStopPointRef;
    @XmlElement(name = "ToStopPointRef")
    protected ScheduledStopPointRefStructure toStopPointRef;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "StandardWaitTime")
    protected Duration standardWaitTime;
    @XmlElement(name = "MaximumWaitTime")
    protected Duration maximumWaitTime;
    @XmlElement(name = "MaximumAutomaticWaitTime")
    protected Duration maximumAutomaticWaitTime;
    @XmlElement(name = "StandardTransferTime")
    protected Duration standardTransferTime;
    @XmlElement(name = "MinimumTransferTime")
    protected Duration minimumTransferTime;
    @XmlElement(name = "MaximumTransferTime")
    protected Duration maximumTransferTime;

    /**
     * Ruft den Wert der fromStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getFromStopPointRef() {
        return fromStopPointRef;
    }

    /**
     * Legt den Wert der fromStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setFromStopPointRef(ScheduledStopPointRefStructure value) {
        this.fromStopPointRef = value;
    }

    /**
     * Ruft den Wert der toStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getToStopPointRef() {
        return toStopPointRef;
    }

    /**
     * Legt den Wert der toStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setToStopPointRef(ScheduledStopPointRefStructure value) {
        this.toStopPointRef = value;
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

    /**
     * Ruft den Wert der standardWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStandardWaitTime() {
        return standardWaitTime;
    }

    /**
     * Legt den Wert der standardWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStandardWaitTime(Duration value) {
        this.standardWaitTime = value;
    }

    /**
     * Ruft den Wert der maximumWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumWaitTime() {
        return maximumWaitTime;
    }

    /**
     * Legt den Wert der maximumWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumWaitTime(Duration value) {
        this.maximumWaitTime = value;
    }

    /**
     * Ruft den Wert der maximumAutomaticWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumAutomaticWaitTime() {
        return maximumAutomaticWaitTime;
    }

    /**
     * Legt den Wert der maximumAutomaticWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumAutomaticWaitTime(Duration value) {
        this.maximumAutomaticWaitTime = value;
    }

    /**
     * Ruft den Wert der standardTransferTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStandardTransferTime() {
        return standardTransferTime;
    }

    /**
     * Legt den Wert der standardTransferTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStandardTransferTime(Duration value) {
        this.standardTransferTime = value;
    }

    /**
     * Ruft den Wert der minimumTransferTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumTransferTime() {
        return minimumTransferTime;
    }

    /**
     * Legt den Wert der minimumTransferTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumTransferTime(Duration value) {
        this.minimumTransferTime = value;
    }

    /**
     * Ruft den Wert der maximumTransferTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumTransferTime() {
        return maximumTransferTime;
    }

    /**
     * Legt den Wert der maximumTransferTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumTransferTime(Duration value) {
        this.maximumTransferTime = value;
    }

}
