//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import uk.org.netex.netex.ExtensionsStructure;


/**
 * <p>Java-Klasse f�r SiriSchema complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SiriSchema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;group ref="{http://www.siri.org.uk/siri}RequestGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ResponseGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="2.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiriSchema", propOrder = {
    "serviceRequest",
    "subscriptionRequest",
    "terminateSubscriptionRequest",
    "dataReadyNotification",
    "dataSupplyRequest",
    "checkStatusRequest",
    "heartbeatNotification",
    "capabilitiesRequest",
    "abstractDiscoveryRequest",
    "subscriptionResponse",
    "terminateSubscriptionResponse",
    "dataReadyAcknowledgement",
    "serviceDelivery",
    "dataReceivedAcknowledgement",
    "checkStatusResponse",
    "capabilitiesResponse",
    "abstractDiscoveryDelivery",
    "extensions"
})
public class SiriSchema {

    @XmlElement(name = "ServiceRequest")
    protected ServiceRequest serviceRequest;
    @XmlElement(name = "SubscriptionRequest")
    protected SubscriptionRequest subscriptionRequest;
    @XmlElement(name = "TerminateSubscriptionRequest")
    protected TerminateSubscriptionRequestStructure terminateSubscriptionRequest;
    @XmlElement(name = "DataReadyNotification")
    protected DataReadyRequestStructure dataReadyNotification;
    @XmlElement(name = "DataSupplyRequest")
    protected DataSupplyRequestStructure dataSupplyRequest;
    @XmlElement(name = "CheckStatusRequest")
    protected CheckStatusRequestStructure checkStatusRequest;
    @XmlElement(name = "HeartbeatNotification")
    protected HeartbeatNotificationStructure heartbeatNotification;
    @XmlElement(name = "CapabilitiesRequest")
    protected CapabilitiesRequestStructure capabilitiesRequest;
    @XmlElement(name = "AbstractDiscoveryRequest")
    protected AbstractDiscoveryRequestStructure abstractDiscoveryRequest;
    @XmlElement(name = "SubscriptionResponse")
    protected SubscriptionResponseStructure subscriptionResponse;
    @XmlElement(name = "TerminateSubscriptionResponse")
    protected TerminateSubscriptionResponseStructure terminateSubscriptionResponse;
    @XmlElement(name = "DataReadyAcknowledgement")
    protected DataReadyResponseStructure dataReadyAcknowledgement;
    @XmlElement(name = "ServiceDelivery")
    protected ServiceDelivery serviceDelivery;
    @XmlElement(name = "DataReceivedAcknowledgement")
    protected DataReceivedResponseStructure dataReceivedAcknowledgement;
    @XmlElement(name = "CheckStatusResponse")
    protected CheckStatusResponseStructure checkStatusResponse;
    @XmlElement(name = "CapabilitiesResponse")
    protected CapabilitiesResponseStructure capabilitiesResponse;
    @XmlElement(name = "AbstractDiscoveryDelivery")
    protected AbstractDiscoveryDeliveryStructure abstractDiscoveryDelivery;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String version;

    /**
     * Ruft den Wert der serviceRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequest }
     *     
     */
    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    /**
     * Legt den Wert der serviceRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequest }
     *     
     */
    public void setServiceRequest(ServiceRequest value) {
        this.serviceRequest = value;
    }

    /**
     * Ruft den Wert der subscriptionRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionRequest }
     *     
     */
    public SubscriptionRequest getSubscriptionRequest() {
        return subscriptionRequest;
    }

    /**
     * Legt den Wert der subscriptionRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionRequest }
     *     
     */
    public void setSubscriptionRequest(SubscriptionRequest value) {
        this.subscriptionRequest = value;
    }

    /**
     * Ruft den Wert der terminateSubscriptionRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSubscriptionRequestStructure }
     *     
     */
    public TerminateSubscriptionRequestStructure getTerminateSubscriptionRequest() {
        return terminateSubscriptionRequest;
    }

    /**
     * Legt den Wert der terminateSubscriptionRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSubscriptionRequestStructure }
     *     
     */
    public void setTerminateSubscriptionRequest(TerminateSubscriptionRequestStructure value) {
        this.terminateSubscriptionRequest = value;
    }

    /**
     * Ruft den Wert der dataReadyNotification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataReadyRequestStructure }
     *     
     */
    public DataReadyRequestStructure getDataReadyNotification() {
        return dataReadyNotification;
    }

    /**
     * Legt den Wert der dataReadyNotification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReadyRequestStructure }
     *     
     */
    public void setDataReadyNotification(DataReadyRequestStructure value) {
        this.dataReadyNotification = value;
    }

    /**
     * Ruft den Wert der dataSupplyRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataSupplyRequestStructure }
     *     
     */
    public DataSupplyRequestStructure getDataSupplyRequest() {
        return dataSupplyRequest;
    }

    /**
     * Legt den Wert der dataSupplyRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSupplyRequestStructure }
     *     
     */
    public void setDataSupplyRequest(DataSupplyRequestStructure value) {
        this.dataSupplyRequest = value;
    }

    /**
     * Ruft den Wert der checkStatusRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusRequestStructure }
     *     
     */
    public CheckStatusRequestStructure getCheckStatusRequest() {
        return checkStatusRequest;
    }

    /**
     * Legt den Wert der checkStatusRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusRequestStructure }
     *     
     */
    public void setCheckStatusRequest(CheckStatusRequestStructure value) {
        this.checkStatusRequest = value;
    }

    /**
     * Ruft den Wert der heartbeatNotification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeartbeatNotificationStructure }
     *     
     */
    public HeartbeatNotificationStructure getHeartbeatNotification() {
        return heartbeatNotification;
    }

    /**
     * Legt den Wert der heartbeatNotification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartbeatNotificationStructure }
     *     
     */
    public void setHeartbeatNotification(HeartbeatNotificationStructure value) {
        this.heartbeatNotification = value;
    }

    /**
     * Ruft den Wert der capabilitiesRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesRequestStructure }
     *     
     */
    public CapabilitiesRequestStructure getCapabilitiesRequest() {
        return capabilitiesRequest;
    }

    /**
     * Legt den Wert der capabilitiesRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesRequestStructure }
     *     
     */
    public void setCapabilitiesRequest(CapabilitiesRequestStructure value) {
        this.capabilitiesRequest = value;
    }

    /**
     * Ruft den Wert der abstractDiscoveryRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractDiscoveryRequestStructure }
     *     
     */
    public AbstractDiscoveryRequestStructure getAbstractDiscoveryRequest() {
        return abstractDiscoveryRequest;
    }

    /**
     * Legt den Wert der abstractDiscoveryRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractDiscoveryRequestStructure }
     *     
     */
    public void setAbstractDiscoveryRequest(AbstractDiscoveryRequestStructure value) {
        this.abstractDiscoveryRequest = value;
    }

    /**
     * Ruft den Wert der subscriptionResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionResponseStructure }
     *     
     */
    public SubscriptionResponseStructure getSubscriptionResponse() {
        return subscriptionResponse;
    }

    /**
     * Legt den Wert der subscriptionResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionResponseStructure }
     *     
     */
    public void setSubscriptionResponse(SubscriptionResponseStructure value) {
        this.subscriptionResponse = value;
    }

    /**
     * Ruft den Wert der terminateSubscriptionResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSubscriptionResponseStructure }
     *     
     */
    public TerminateSubscriptionResponseStructure getTerminateSubscriptionResponse() {
        return terminateSubscriptionResponse;
    }

    /**
     * Legt den Wert der terminateSubscriptionResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSubscriptionResponseStructure }
     *     
     */
    public void setTerminateSubscriptionResponse(TerminateSubscriptionResponseStructure value) {
        this.terminateSubscriptionResponse = value;
    }

    /**
     * Ruft den Wert der dataReadyAcknowledgement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataReadyResponseStructure }
     *     
     */
    public DataReadyResponseStructure getDataReadyAcknowledgement() {
        return dataReadyAcknowledgement;
    }

    /**
     * Legt den Wert der dataReadyAcknowledgement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReadyResponseStructure }
     *     
     */
    public void setDataReadyAcknowledgement(DataReadyResponseStructure value) {
        this.dataReadyAcknowledgement = value;
    }

    /**
     * Ruft den Wert der serviceDelivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDelivery }
     *     
     */
    public ServiceDelivery getServiceDelivery() {
        return serviceDelivery;
    }

    /**
     * Legt den Wert der serviceDelivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDelivery }
     *     
     */
    public void setServiceDelivery(ServiceDelivery value) {
        this.serviceDelivery = value;
    }

    /**
     * Ruft den Wert der dataReceivedAcknowledgement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataReceivedResponseStructure }
     *     
     */
    public DataReceivedResponseStructure getDataReceivedAcknowledgement() {
        return dataReceivedAcknowledgement;
    }

    /**
     * Legt den Wert der dataReceivedAcknowledgement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReceivedResponseStructure }
     *     
     */
    public void setDataReceivedAcknowledgement(DataReceivedResponseStructure value) {
        this.dataReceivedAcknowledgement = value;
    }

    /**
     * Ruft den Wert der checkStatusResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusResponseStructure }
     *     
     */
    public CheckStatusResponseStructure getCheckStatusResponse() {
        return checkStatusResponse;
    }

    /**
     * Legt den Wert der checkStatusResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusResponseStructure }
     *     
     */
    public void setCheckStatusResponse(CheckStatusResponseStructure value) {
        this.checkStatusResponse = value;
    }

    /**
     * Responses with the capabilities of an implementation. Answers a CapabilityRequest.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesResponseStructure }
     *     
     */
    public CapabilitiesResponseStructure getCapabilitiesResponse() {
        return capabilitiesResponse;
    }

    /**
     * Legt den Wert der capabilitiesResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesResponseStructure }
     *     
     */
    public void setCapabilitiesResponse(CapabilitiesResponseStructure value) {
        this.capabilitiesResponse = value;
    }

    /**
     * Ruft den Wert der abstractDiscoveryDelivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractDiscoveryDeliveryStructure }
     *     
     */
    public AbstractDiscoveryDeliveryStructure getAbstractDiscoveryDelivery() {
        return abstractDiscoveryDelivery;
    }

    /**
     * Legt den Wert der abstractDiscoveryDelivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractDiscoveryDeliveryStructure }
     *     
     */
    public void setAbstractDiscoveryDelivery(AbstractDiscoveryDeliveryStructure value) {
        this.abstractDiscoveryDelivery = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
