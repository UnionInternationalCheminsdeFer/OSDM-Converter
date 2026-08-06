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
 * Type for SERVICE JOURNEY INTERCHANGE VIEW.
 * 
 * <p>Java-Klasse f�r ServiceJourneyInterchange_DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceJourneyInterchange_DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ServiceJourneyInterchangeRef" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}InterchangePropertyGroup"/>
 *         &lt;element name="noticeAssignments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.netex.org.uk/netex}noticeAssignments_RelStructure">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;choice>
 *             &lt;element name="ConnectingJourneyRef" type="{http://www.netex.org.uk/netex}JourneyRefStructure"/>
 *             &lt;element ref="{http://www.netex.org.uk/netex}ConnectingJourneyView"/>
 *           &lt;/choice>
 *           &lt;choice>
 *             &lt;element name="ConnectingServiceJourneyRef" type="{http://www.netex.org.uk/netex}ServiceJourneyRefStructure"/>
 *             &lt;element ref="{http://www.netex.org.uk/netex}ConnectingServiceJourneyView"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *         &lt;element name="ConnectingLineView" type="{http://www.netex.org.uk/netex}Line_DerivedViewStructure" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}InterchangeTimesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceJourneyInterchange_DerivedViewStructure", propOrder = {
    "serviceJourneyInterchangeRef",
    "description",
    "staySeated",
    "crossBorder",
    "planned",
    "guaranteed",
    "advertised",
    "controlled",
    "connectionCertainty",
    "noticeAssignments",
    "connectingJourneyRef",
    "connectingJourneyView",
    "connectingServiceJourneyRef",
    "connectingServiceJourneyView",
    "connectingLineView",
    "standardWaitTime",
    "maximumWaitTime",
    "maximumAutomaticWaitTime",
    "standardTransferTime",
    "minimumTransferTime",
    "maximumTransferTime",
    "controlCentreNotifyThreshold"
})
public class ServiceJourneyInterchangeDerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "ServiceJourneyInterchangeRef")
    protected ServiceJourneyInterchangeRefStructure serviceJourneyInterchangeRef;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "StaySeated", defaultValue = "false")
    protected Boolean staySeated;
    @XmlElement(name = "CrossBorder", defaultValue = "false")
    protected Boolean crossBorder;
    @XmlElement(name = "Planned", defaultValue = "true")
    protected Boolean planned;
    @XmlElement(name = "Guaranteed", defaultValue = "false")
    protected Boolean guaranteed;
    @XmlElement(name = "Advertised", defaultValue = "true")
    protected Boolean advertised;
    @XmlElement(name = "Controlled", defaultValue = "true")
    protected Boolean controlled;
    @XmlElement(name = "ConnectionCertainty")
    @XmlSchemaType(name = "NMTOKEN")
    protected ConnectionCertaintyEnumeration connectionCertainty;
    protected ServiceJourneyInterchangeDerivedViewStructure.NoticeAssignments noticeAssignments;
    @XmlElement(name = "ConnectingJourneyRef")
    protected JourneyRefStructure connectingJourneyRef;
    @XmlElement(name = "ConnectingJourneyView")
    protected ConnectingServiceJourneyDerivedViewStructure connectingJourneyView;
    @XmlElement(name = "ConnectingServiceJourneyRef")
    protected ServiceJourneyRefStructure connectingServiceJourneyRef;
    @XmlElement(name = "ConnectingServiceJourneyView")
    protected ConnectingServiceJourneyDerivedViewStructure connectingServiceJourneyView;
    @XmlElement(name = "ConnectingLineView")
    protected LineDerivedViewStructure connectingLineView;
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
    @XmlElement(name = "ControlCentreNotifyThreshold")
    protected Duration controlCentreNotifyThreshold;

    /**
     * Ruft den Wert der serviceJourneyInterchangeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyInterchangeRefStructure }
     *     
     */
    public ServiceJourneyInterchangeRefStructure getServiceJourneyInterchangeRef() {
        return serviceJourneyInterchangeRef;
    }

    /**
     * Legt den Wert der serviceJourneyInterchangeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyInterchangeRefStructure }
     *     
     */
    public void setServiceJourneyInterchangeRef(ServiceJourneyInterchangeRefStructure value) {
        this.serviceJourneyInterchangeRef = value;
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
     * Ruft den Wert der staySeated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaySeated() {
        return staySeated;
    }

    /**
     * Legt den Wert der staySeated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaySeated(Boolean value) {
        this.staySeated = value;
    }

    /**
     * Ruft den Wert der crossBorder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorder() {
        return crossBorder;
    }

    /**
     * Legt den Wert der crossBorder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorder(Boolean value) {
        this.crossBorder = value;
    }

    /**
     * Ruft den Wert der planned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanned() {
        return planned;
    }

    /**
     * Legt den Wert der planned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanned(Boolean value) {
        this.planned = value;
    }

    /**
     * Ruft den Wert der guaranteed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteed() {
        return guaranteed;
    }

    /**
     * Legt den Wert der guaranteed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteed(Boolean value) {
        this.guaranteed = value;
    }

    /**
     * Ruft den Wert der advertised-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvertised() {
        return advertised;
    }

    /**
     * Legt den Wert der advertised-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvertised(Boolean value) {
        this.advertised = value;
    }

    /**
     * Ruft den Wert der controlled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isControlled() {
        return controlled;
    }

    /**
     * Legt den Wert der controlled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setControlled(Boolean value) {
        this.controlled = value;
    }

    /**
     * Ruft den Wert der connectionCertainty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionCertaintyEnumeration }
     *     
     */
    public ConnectionCertaintyEnumeration getConnectionCertainty() {
        return connectionCertainty;
    }

    /**
     * Legt den Wert der connectionCertainty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionCertaintyEnumeration }
     *     
     */
    public void setConnectionCertainty(ConnectionCertaintyEnumeration value) {
        this.connectionCertainty = value;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyInterchangeDerivedViewStructure.NoticeAssignments }
     *     
     */
    public ServiceJourneyInterchangeDerivedViewStructure.NoticeAssignments getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyInterchangeDerivedViewStructure.NoticeAssignments }
     *     
     */
    public void setNoticeAssignments(ServiceJourneyInterchangeDerivedViewStructure.NoticeAssignments value) {
        this.noticeAssignments = value;
    }

    /**
     * Ruft den Wert der connectingJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRefStructure }
     *     
     */
    public JourneyRefStructure getConnectingJourneyRef() {
        return connectingJourneyRef;
    }

    /**
     * Legt den Wert der connectingJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRefStructure }
     *     
     */
    public void setConnectingJourneyRef(JourneyRefStructure value) {
        this.connectingJourneyRef = value;
    }

    /**
     * Ruft den Wert der connectingJourneyView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingServiceJourneyDerivedViewStructure }
     *     
     */
    public ConnectingServiceJourneyDerivedViewStructure getConnectingJourneyView() {
        return connectingJourneyView;
    }

    /**
     * Legt den Wert der connectingJourneyView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingServiceJourneyDerivedViewStructure }
     *     
     */
    public void setConnectingJourneyView(ConnectingServiceJourneyDerivedViewStructure value) {
        this.connectingJourneyView = value;
    }

    /**
     * Ruft den Wert der connectingServiceJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyRefStructure }
     *     
     */
    public ServiceJourneyRefStructure getConnectingServiceJourneyRef() {
        return connectingServiceJourneyRef;
    }

    /**
     * Legt den Wert der connectingServiceJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyRefStructure }
     *     
     */
    public void setConnectingServiceJourneyRef(ServiceJourneyRefStructure value) {
        this.connectingServiceJourneyRef = value;
    }

    /**
     * Ruft den Wert der connectingServiceJourneyView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingServiceJourneyDerivedViewStructure }
     *     
     */
    public ConnectingServiceJourneyDerivedViewStructure getConnectingServiceJourneyView() {
        return connectingServiceJourneyView;
    }

    /**
     * Legt den Wert der connectingServiceJourneyView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingServiceJourneyDerivedViewStructure }
     *     
     */
    public void setConnectingServiceJourneyView(ConnectingServiceJourneyDerivedViewStructure value) {
        this.connectingServiceJourneyView = value;
    }

    /**
     * Ruft den Wert der connectingLineView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineDerivedViewStructure }
     *     
     */
    public LineDerivedViewStructure getConnectingLineView() {
        return connectingLineView;
    }

    /**
     * Legt den Wert der connectingLineView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineDerivedViewStructure }
     *     
     */
    public void setConnectingLineView(LineDerivedViewStructure value) {
        this.connectingLineView = value;
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

    /**
     * Ruft den Wert der controlCentreNotifyThreshold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getControlCentreNotifyThreshold() {
        return controlCentreNotifyThreshold;
    }

    /**
     * Legt den Wert der controlCentreNotifyThreshold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setControlCentreNotifyThreshold(Duration value) {
        this.controlCentreNotifyThreshold = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}noticeAssignments_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NoticeAssignments
        extends NoticeAssignmentsRelStructure
    {


    }

}
