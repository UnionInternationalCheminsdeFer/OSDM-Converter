//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for INTERCHANGE RULE PARAMETER.
 * 
 * <p>Java-Klasse f�r InterchangeRuleParameterStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InterchangeRuleParameterStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransportMode" type="{http://www.netex.org.uk/netex}AllPublicTransportModesEnumeration" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}OperatorRef" minOccurs="0"/>
 *         &lt;element name="StopAreaRef" type="{http://www.netex.org.uk/netex}StopAreaRefStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}StopPlaceRef" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}InterchangeRuleLineFilterGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}InterchangeRulePointFilterGroup"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TimeDemandTypeRef" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ServiceJourneyRef" type="{http://www.netex.org.uk/netex}ServiceJourneyRefStructure"/>
 *           &lt;element ref="{http://www.netex.org.uk/netex}JourneyDesignator"/>
 *           &lt;element ref="{http://www.netex.org.uk/netex}ServiceDesignator"/>
 *         &lt;/choice>
 *         &lt;element name="MaximumInterchangeWindow" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterchangeRuleParameterStructure", propOrder = {
    "transportMode",
    "operatorRef",
    "stopAreaRef",
    "stopPlaceRef",
    "allLines",
    "linesInDirectionRefs",
    "lineInDirectionRef",
    "scheduledStopPointRef",
    "adjacentStopPointRef",
    "adjacentStopPlaceRef",
    "adjacentPointRef",
    "endStopPointRef",
    "timeDemandTypeRef",
    "serviceJourneyRef",
    "journeyDesignator",
    "serviceDesignator",
    "maximumInterchangeWindow"
})
public class InterchangeRuleParameterStructure {

    @XmlElement(name = "TransportMode", defaultValue = "all")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration transportMode;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "StopAreaRef")
    protected StopAreaRefStructure stopAreaRef;
    @XmlElementRef(name = "StopPlaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends StopPlaceRefStructure> stopPlaceRef;
    @XmlElement(name = "AllLines")
    protected String allLines;
    protected LinesInDirectionRefsRelStructure linesInDirectionRefs;
    @XmlElement(name = "LineInDirectionRef")
    protected List<LineInDirectionRefStructure> lineInDirectionRef;
    @XmlElementRef(name = "ScheduledStopPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ScheduledStopPointRefStructure> scheduledStopPointRef;
    @XmlElement(name = "AdjacentStopPointRef")
    protected ScheduledStopPointRefStructure adjacentStopPointRef;
    @XmlElement(name = "AdjacentStopPlaceRef")
    protected StopPlaceRefStructure adjacentStopPlaceRef;
    @XmlElement(name = "AdjacentPointRef")
    protected PointRefStructure adjacentPointRef;
    @XmlElement(name = "EndStopPointRef")
    protected ScheduledStopPointRefStructure endStopPointRef;
    @XmlElement(name = "TimeDemandTypeRef")
    protected TimeDemandTypeRefStructure timeDemandTypeRef;
    @XmlElement(name = "ServiceJourneyRef")
    protected ServiceJourneyRefStructure serviceJourneyRef;
    @XmlElement(name = "JourneyDesignator")
    protected JourneyDesignatorStructure journeyDesignator;
    @XmlElement(name = "ServiceDesignator")
    protected ServiceDesignatorStructure serviceDesignator;
    @XmlElement(name = "MaximumInterchangeWindow")
    protected Duration maximumInterchangeWindow;

    /**
     * Ruft den Wert der transportMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getTransportMode() {
        return transportMode;
    }

    /**
     * Legt den Wert der transportMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setTransportMode(AllPublicTransportModesEnumeration value) {
        this.transportMode = value;
    }

    /**
     * Ruft den Wert der operatorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Legt den Wert der operatorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Ruft den Wert der stopAreaRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopAreaRefStructure }
     *     
     */
    public StopAreaRefStructure getStopAreaRef() {
        return stopAreaRef;
    }

    /**
     * Legt den Wert der stopAreaRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAreaRefStructure }
     *     
     */
    public void setStopAreaRef(StopAreaRefStructure value) {
        this.stopAreaRef = value;
    }

    /**
     * Ruft den Wert der stopPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends StopPlaceRefStructure> getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Legt den Wert der stopPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public void setStopPlaceRef(JAXBElement<? extends StopPlaceRefStructure> value) {
        this.stopPlaceRef = value;
    }

    /**
     * Ruft den Wert der allLines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllLines() {
        return allLines;
    }

    /**
     * Legt den Wert der allLines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllLines(String value) {
        this.allLines = value;
    }

    /**
     * Ruft den Wert der linesInDirectionRefs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinesInDirectionRefsRelStructure }
     *     
     */
    public LinesInDirectionRefsRelStructure getLinesInDirectionRefs() {
        return linesInDirectionRefs;
    }

    /**
     * Legt den Wert der linesInDirectionRefs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesInDirectionRefsRelStructure }
     *     
     */
    public void setLinesInDirectionRefs(LinesInDirectionRefsRelStructure value) {
        this.linesInDirectionRefs = value;
    }

    /**
     * Gets the value of the lineInDirectionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineInDirectionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineInDirectionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineInDirectionRefStructure }
     * 
     * 
     */
    public List<LineInDirectionRefStructure> getLineInDirectionRef() {
        if (lineInDirectionRef == null) {
            lineInDirectionRef = new ArrayList<LineInDirectionRefStructure>();
        }
        return this.lineInDirectionRef;
    }

    /**
     * Ruft den Wert der scheduledStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ScheduledStopPointRefStructure> getScheduledStopPointRef() {
        return scheduledStopPointRef;
    }

    /**
     * Legt den Wert der scheduledStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     
     */
    public void setScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        this.scheduledStopPointRef = value;
    }

    /**
     * Ruft den Wert der adjacentStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getAdjacentStopPointRef() {
        return adjacentStopPointRef;
    }

    /**
     * Legt den Wert der adjacentStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setAdjacentStopPointRef(ScheduledStopPointRefStructure value) {
        this.adjacentStopPointRef = value;
    }

    /**
     * Ruft den Wert der adjacentStopPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public StopPlaceRefStructure getAdjacentStopPlaceRef() {
        return adjacentStopPlaceRef;
    }

    /**
     * Legt den Wert der adjacentStopPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public void setAdjacentStopPlaceRef(StopPlaceRefStructure value) {
        this.adjacentStopPlaceRef = value;
    }

    /**
     * Ruft den Wert der adjacentPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getAdjacentPointRef() {
        return adjacentPointRef;
    }

    /**
     * Legt den Wert der adjacentPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setAdjacentPointRef(PointRefStructure value) {
        this.adjacentPointRef = value;
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
     * Ruft den Wert der timeDemandTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeDemandTypeRefStructure }
     *     
     */
    public TimeDemandTypeRefStructure getTimeDemandTypeRef() {
        return timeDemandTypeRef;
    }

    /**
     * Legt den Wert der timeDemandTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDemandTypeRefStructure }
     *     
     */
    public void setTimeDemandTypeRef(TimeDemandTypeRefStructure value) {
        this.timeDemandTypeRef = value;
    }

    /**
     * Ruft den Wert der serviceJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyRefStructure }
     *     
     */
    public ServiceJourneyRefStructure getServiceJourneyRef() {
        return serviceJourneyRef;
    }

    /**
     * Legt den Wert der serviceJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyRefStructure }
     *     
     */
    public void setServiceJourneyRef(ServiceJourneyRefStructure value) {
        this.serviceJourneyRef = value;
    }

    /**
     * Ruft den Wert der journeyDesignator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDesignatorStructure }
     *     
     */
    public JourneyDesignatorStructure getJourneyDesignator() {
        return journeyDesignator;
    }

    /**
     * Legt den Wert der journeyDesignator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDesignatorStructure }
     *     
     */
    public void setJourneyDesignator(JourneyDesignatorStructure value) {
        this.journeyDesignator = value;
    }

    /**
     * Ruft den Wert der serviceDesignator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDesignatorStructure }
     *     
     */
    public ServiceDesignatorStructure getServiceDesignator() {
        return serviceDesignator;
    }

    /**
     * Legt den Wert der serviceDesignator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDesignatorStructure }
     *     
     */
    public void setServiceDesignator(ServiceDesignatorStructure value) {
        this.serviceDesignator = value;
    }

    /**
     * Ruft den Wert der maximumInterchangeWindow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumInterchangeWindow() {
        return maximumInterchangeWindow;
    }

    /**
     * Legt den Wert der maximumInterchangeWindow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumInterchangeWindow(Duration value) {
        this.maximumInterchangeWindow = value;
    }

}
