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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a Data Object Filter Topic.
 * 
 * <p>Java-Klasse f�r NetworkFrameTopicStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NetworkFrameTopicStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TopicStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TopicTemporalScopeGroup"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TypeOfFrameRef" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TopicFrameScopeGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkFrameTopicStructure", propOrder = {
    "current",
    "changedSince",
    "currentAt",
    "historicBetween",
    "selectionValidityConditions",
    "typeOfFrameRef",
    "versionFrameRef",
    "networkFilterByValue"
})
@XmlSeeAlso({
    NetworkFrameTopic.class
})
public class NetworkFrameTopicStructure
    extends TopicStructure
{

    @XmlElement(name = "Current")
    protected String current;
    @XmlElement(name = "ChangedSince")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedSince;
    @XmlElement(name = "CurrentAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentAt;
    @XmlElement(name = "HistoricBetween")
    protected ClosedTimestampRangeStructure historicBetween;
    protected NetworkFrameTopicStructure.SelectionValidityConditions selectionValidityConditions;
    @XmlElement(name = "TypeOfFrameRef")
    protected TypeOfFrameRefStructure typeOfFrameRef;
    @XmlElementRef(name = "VersionFrameRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends VersionFrameRefStructure>> versionFrameRef;
    @XmlElement(name = "NetworkFilterByValue")
    protected NetworkFilterByValueStructure networkFilterByValue;

    /**
     * Ruft den Wert der current-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrent() {
        return current;
    }

    /**
     * Legt den Wert der current-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrent(String value) {
        this.current = value;
    }

    /**
     * Ruft den Wert der changedSince-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangedSince() {
        return changedSince;
    }

    /**
     * Legt den Wert der changedSince-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangedSince(XMLGregorianCalendar value) {
        this.changedSince = value;
    }

    /**
     * Ruft den Wert der currentAt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentAt() {
        return currentAt;
    }

    /**
     * Legt den Wert der currentAt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentAt(XMLGregorianCalendar value) {
        this.currentAt = value;
    }

    /**
     * Ruft den Wert der historicBetween-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClosedTimestampRangeStructure }
     *     
     */
    public ClosedTimestampRangeStructure getHistoricBetween() {
        return historicBetween;
    }

    /**
     * Legt den Wert der historicBetween-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosedTimestampRangeStructure }
     *     
     */
    public void setHistoricBetween(ClosedTimestampRangeStructure value) {
        this.historicBetween = value;
    }

    /**
     * Ruft den Wert der selectionValidityConditions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworkFrameTopicStructure.SelectionValidityConditions }
     *     
     */
    public NetworkFrameTopicStructure.SelectionValidityConditions getSelectionValidityConditions() {
        return selectionValidityConditions;
    }

    /**
     * Legt den Wert der selectionValidityConditions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkFrameTopicStructure.SelectionValidityConditions }
     *     
     */
    public void setSelectionValidityConditions(NetworkFrameTopicStructure.SelectionValidityConditions value) {
        this.selectionValidityConditions = value;
    }

    /**
     * Ruft den Wert der typeOfFrameRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFrameRefStructure }
     *     
     */
    public TypeOfFrameRefStructure getTypeOfFrameRef() {
        return typeOfFrameRef;
    }

    /**
     * Legt den Wert der typeOfFrameRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFrameRefStructure }
     *     
     */
    public void setTypeOfFrameRef(TypeOfFrameRefStructure value) {
        this.typeOfFrameRef = value;
    }

    /**
     * Gets the value of the versionFrameRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versionFrameRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersionFrameRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TimetableFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceCalendarFrameRef }{@code >}
     * {@link JAXBElement }{@code <}{@link DriverScheduleFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleScheduleFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FarePriceFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MobilityJourneyFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InfrastructureFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesTransactionFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MobilityServiceFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ResourceFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VersionFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteFrameRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends VersionFrameRefStructure>> getVersionFrameRef() {
        if (versionFrameRef == null) {
            versionFrameRef = new ArrayList<JAXBElement<? extends VersionFrameRefStructure>>();
        }
        return this.versionFrameRef;
    }

    /**
     * Ruft den Wert der networkFilterByValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworkFilterByValueStructure }
     *     
     */
    public NetworkFilterByValueStructure getNetworkFilterByValue() {
        return networkFilterByValue;
    }

    /**
     * Legt den Wert der networkFilterByValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkFilterByValueStructure }
     *     
     */
    public void setNetworkFilterByValue(NetworkFilterByValueStructure value) {
        this.networkFilterByValue = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element ref="{http://www.netex.org.uk/netex}ValidityCondition_Dummy"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "validityConditionDummy"
    })
    public static class SelectionValidityConditions {

        @XmlElementRef(name = "ValidityCondition_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
        protected List<JAXBElement<? extends DataManagedObjectStructure>> validityConditionDummy;

        /**
         * Gets the value of the validityConditionDummy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the validityConditionDummy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValidityConditionDummy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link ValidityCondition }{@code >}
         * {@link JAXBElement }{@code <}{@link ValidDuring }{@code >}
         * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
         * {@link JAXBElement }{@code <}{@link AvailabilityCondition }{@code >}
         * {@link JAXBElement }{@code <}{@link ValidityTrigger }{@code >}
         * {@link JAXBElement }{@code <}{@link ValidityRuleParameter }{@code >}
         * {@link JAXBElement }{@code <}{@link SimpleAvailabilityCondition }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends DataManagedObjectStructure>> getValidityConditionDummy() {
            if (validityConditionDummy == null) {
                validityConditionDummy = new ArrayList<JAXBElement<? extends DataManagedObjectStructure>>();
            }
            return this.validityConditionDummy;
        }

    }

}
