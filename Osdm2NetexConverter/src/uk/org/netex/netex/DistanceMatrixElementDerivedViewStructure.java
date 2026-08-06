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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for CONNECTING JOURNEY VIEW.
 * 
 * <p>Java-Klasse f�r DistanceMatrixElement_DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DistanceMatrixElement_DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="StartStopPointRef" type="{http://www.netex.org.uk/netex}ScheduledStopPointRefStructure"/>
 *           &lt;element name="StartTariffZoneRef" type="{http://www.netex.org.uk/netex}TariffZoneRefStructure"/>
 *         &lt;/choice>
 *         &lt;element name="StartName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="EndStopPointRef" type="{http://www.netex.org.uk/netex}ScheduledStopPointRefStructure"/>
 *           &lt;element name="EndTariffZoneRef" type="{http://www.netex.org.uk/netex}TariffZoneRefStructure"/>
 *         &lt;/choice>
 *         &lt;element name="EndName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceMatrixElement_DerivedViewStructure", propOrder = {
    "startStopPointRef",
    "startTariffZoneRef",
    "startName",
    "endStopPointRef",
    "endTariffZoneRef",
    "endName"
})
public class DistanceMatrixElementDerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "StartStopPointRef")
    protected ScheduledStopPointRefStructure startStopPointRef;
    @XmlElement(name = "StartTariffZoneRef")
    protected TariffZoneRefStructure startTariffZoneRef;
    @XmlElement(name = "StartName")
    protected MultilingualString startName;
    @XmlElement(name = "EndStopPointRef")
    protected ScheduledStopPointRefStructure endStopPointRef;
    @XmlElement(name = "EndTariffZoneRef")
    protected TariffZoneRefStructure endTariffZoneRef;
    @XmlElement(name = "EndName")
    protected MultilingualString endName;

    /**
     * Ruft den Wert der startStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getStartStopPointRef() {
        return startStopPointRef;
    }

    /**
     * Legt den Wert der startStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setStartStopPointRef(ScheduledStopPointRefStructure value) {
        this.startStopPointRef = value;
    }

    /**
     * Ruft den Wert der startTariffZoneRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public TariffZoneRefStructure getStartTariffZoneRef() {
        return startTariffZoneRef;
    }

    /**
     * Legt den Wert der startTariffZoneRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public void setStartTariffZoneRef(TariffZoneRefStructure value) {
        this.startTariffZoneRef = value;
    }

    /**
     * Ruft den Wert der startName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getStartName() {
        return startName;
    }

    /**
     * Legt den Wert der startName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setStartName(MultilingualString value) {
        this.startName = value;
    }

    /**
     * Ruft den Wert der endStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getEndStopPointRef() {
        return endStopPointRef;
    }

    /**
     * Legt den Wert der endStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setEndStopPointRef(ScheduledStopPointRefStructure value) {
        this.endStopPointRef = value;
    }

    /**
     * Ruft den Wert der endTariffZoneRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public TariffZoneRefStructure getEndTariffZoneRef() {
        return endTariffZoneRef;
    }

    /**
     * Legt den Wert der endTariffZoneRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public void setEndTariffZoneRef(TariffZoneRefStructure value) {
        this.endTariffZoneRef = value;
    }

    /**
     * Ruft den Wert der endName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getEndName() {
        return endName;
    }

    /**
     * Legt den Wert der endName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setEndName(MultilingualString value) {
        this.endName = value;
    }

}
