//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for Standard ErrorConditiosn for Service request.
 * 
 * <p>Java-Klasse f�r ServiceDeliveryErrorConditionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeliveryErrorConditionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;group ref="{http://www.siri.org.uk/siri}ServiceRequestErrorGroup"/>
 *         &lt;/choice>
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeliveryErrorConditionStructure", propOrder = {
    "unapprovedKeyAccessError",
    "unknownParticipantError",
    "unknownEndpointError",
    "endpointDeniedAccessError",
    "endpointNotAvailableAccessError",
    "serviceNotAvailableError",
    "capabilityNotSupportedError",
    "accessNotAllowedError",
    "invalidDataReferencesError",
    "beyondDataHorizon",
    "noInfoForTopicError",
    "parametersIgnoredError",
    "unknownExtensionsError",
    "allowedResourceUsageExceededError",
    "otherError",
    "description"
})
public class ServiceDeliveryErrorConditionStructure {

    @XmlElement(name = "UnapprovedKeyAccessError")
    protected UnapprovedKeyAccessStructure unapprovedKeyAccessError;
    @XmlElement(name = "UnknownParticipantError")
    protected UnknownParticipantErrorStructure unknownParticipantError;
    @XmlElement(name = "UnknownEndpointError")
    protected UnknownEndpointErrorStructure unknownEndpointError;
    @XmlElement(name = "EndpointDeniedAccessError")
    protected EndpointDeniedAccessStructure endpointDeniedAccessError;
    @XmlElement(name = "EndpointNotAvailableAccessError")
    protected EndpointNotAvailableAccessStructure endpointNotAvailableAccessError;
    @XmlElement(name = "ServiceNotAvailableError")
    protected ServiceNotAvailableErrorStructure serviceNotAvailableError;
    @XmlElement(name = "CapabilityNotSupportedError")
    protected CapabilityNotSupportedErrorStructure capabilityNotSupportedError;
    @XmlElement(name = "AccessNotAllowedError")
    protected AccessNotAllowedErrorStructure accessNotAllowedError;
    @XmlElement(name = "InvalidDataReferencesError")
    protected InvalidDataReferencesErrorStructure invalidDataReferencesError;
    @XmlElement(name = "BeyondDataHorizon")
    protected BeyondDataHorizonErrorStructure beyondDataHorizon;
    @XmlElement(name = "NoInfoForTopicError")
    protected NoInfoForTopicErrorStructure noInfoForTopicError;
    @XmlElement(name = "ParametersIgnoredError")
    protected ParametersIgnoredErrorStructure parametersIgnoredError;
    @XmlElement(name = "UnknownExtensionsError")
    protected UnknownExtensionsErrorStructure unknownExtensionsError;
    @XmlElement(name = "AllowedResourceUsageExceededError")
    protected AllowedResourceUsageExceededErrorStructure allowedResourceUsageExceededError;
    @XmlElement(name = "OtherError")
    protected OtherErrorStructure otherError;
    @XmlElement(name = "Description")
    protected ErrorDescriptionStructure description;

    /**
     * Ruft den Wert der unapprovedKeyAccessError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnapprovedKeyAccessStructure }
     *     
     */
    public UnapprovedKeyAccessStructure getUnapprovedKeyAccessError() {
        return unapprovedKeyAccessError;
    }

    /**
     * Legt den Wert der unapprovedKeyAccessError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnapprovedKeyAccessStructure }
     *     
     */
    public void setUnapprovedKeyAccessError(UnapprovedKeyAccessStructure value) {
        this.unapprovedKeyAccessError = value;
    }

    /**
     * Error: Recipient for a message to be distributed is unknown. I.e. delegatior is found, but  +SIRI v2.0
     * 
     * @return
     *     possible object is
     *     {@link UnknownParticipantErrorStructure }
     *     
     */
    public UnknownParticipantErrorStructure getUnknownParticipantError() {
        return unknownParticipantError;
    }

    /**
     * Legt den Wert der unknownParticipantError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownParticipantErrorStructure }
     *     
     */
    public void setUnknownParticipantError(UnknownParticipantErrorStructure value) {
        this.unknownParticipantError = value;
    }

    /**
     * Ruft den Wert der unknownEndpointError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnknownEndpointErrorStructure }
     *     
     */
    public UnknownEndpointErrorStructure getUnknownEndpointError() {
        return unknownEndpointError;
    }

    /**
     * Legt den Wert der unknownEndpointError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownEndpointErrorStructure }
     *     
     */
    public void setUnknownEndpointError(UnknownEndpointErrorStructure value) {
        this.unknownEndpointError = value;
    }

    /**
     * Ruft den Wert der endpointDeniedAccessError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EndpointDeniedAccessStructure }
     *     
     */
    public EndpointDeniedAccessStructure getEndpointDeniedAccessError() {
        return endpointDeniedAccessError;
    }

    /**
     * Legt den Wert der endpointDeniedAccessError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointDeniedAccessStructure }
     *     
     */
    public void setEndpointDeniedAccessError(EndpointDeniedAccessStructure value) {
        this.endpointDeniedAccessError = value;
    }

    /**
     * Ruft den Wert der endpointNotAvailableAccessError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EndpointNotAvailableAccessStructure }
     *     
     */
    public EndpointNotAvailableAccessStructure getEndpointNotAvailableAccessError() {
        return endpointNotAvailableAccessError;
    }

    /**
     * Legt den Wert der endpointNotAvailableAccessError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointNotAvailableAccessStructure }
     *     
     */
    public void setEndpointNotAvailableAccessError(EndpointNotAvailableAccessStructure value) {
        this.endpointNotAvailableAccessError = value;
    }

    /**
     * Ruft den Wert der serviceNotAvailableError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceNotAvailableErrorStructure }
     *     
     */
    public ServiceNotAvailableErrorStructure getServiceNotAvailableError() {
        return serviceNotAvailableError;
    }

    /**
     * Legt den Wert der serviceNotAvailableError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceNotAvailableErrorStructure }
     *     
     */
    public void setServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
        this.serviceNotAvailableError = value;
    }

    /**
     * Ruft den Wert der capabilityNotSupportedError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityNotSupportedErrorStructure }
     *     
     */
    public CapabilityNotSupportedErrorStructure getCapabilityNotSupportedError() {
        return capabilityNotSupportedError;
    }

    /**
     * Legt den Wert der capabilityNotSupportedError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityNotSupportedErrorStructure }
     *     
     */
    public void setCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        this.capabilityNotSupportedError = value;
    }

    /**
     * Ruft den Wert der accessNotAllowedError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessNotAllowedErrorStructure }
     *     
     */
    public AccessNotAllowedErrorStructure getAccessNotAllowedError() {
        return accessNotAllowedError;
    }

    /**
     * Legt den Wert der accessNotAllowedError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessNotAllowedErrorStructure }
     *     
     */
    public void setAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        this.accessNotAllowedError = value;
    }

    /**
     * Ruft den Wert der invalidDataReferencesError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InvalidDataReferencesErrorStructure }
     *     
     */
    public InvalidDataReferencesErrorStructure getInvalidDataReferencesError() {
        return invalidDataReferencesError;
    }

    /**
     * Legt den Wert der invalidDataReferencesError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidDataReferencesErrorStructure }
     *     
     */
    public void setInvalidDataReferencesError(InvalidDataReferencesErrorStructure value) {
        this.invalidDataReferencesError = value;
    }

    /**
     * Error: Data period or subscription period is outside of period covered by service.   +SIRI v2.0.
     * 
     * @return
     *     possible object is
     *     {@link BeyondDataHorizonErrorStructure }
     *     
     */
    public BeyondDataHorizonErrorStructure getBeyondDataHorizon() {
        return beyondDataHorizon;
    }

    /**
     * Legt den Wert der beyondDataHorizon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BeyondDataHorizonErrorStructure }
     *     
     */
    public void setBeyondDataHorizon(BeyondDataHorizonErrorStructure value) {
        this.beyondDataHorizon = value;
    }

    /**
     * Ruft den Wert der noInfoForTopicError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoInfoForTopicErrorStructure }
     *     
     */
    public NoInfoForTopicErrorStructure getNoInfoForTopicError() {
        return noInfoForTopicError;
    }

    /**
     * Legt den Wert der noInfoForTopicError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoInfoForTopicErrorStructure }
     *     
     */
    public void setNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        this.noInfoForTopicError = value;
    }

    /**
     * Ruft den Wert der parametersIgnoredError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParametersIgnoredErrorStructure }
     *     
     */
    public ParametersIgnoredErrorStructure getParametersIgnoredError() {
        return parametersIgnoredError;
    }

    /**
     * Legt den Wert der parametersIgnoredError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersIgnoredErrorStructure }
     *     
     */
    public void setParametersIgnoredError(ParametersIgnoredErrorStructure value) {
        this.parametersIgnoredError = value;
    }

    /**
     * Error: Request contained extensions that were not supported by the producer. A response has been provided but some or all extensions have been ignored.  +SIRI v2.0.
     * 
     * @return
     *     possible object is
     *     {@link UnknownExtensionsErrorStructure }
     *     
     */
    public UnknownExtensionsErrorStructure getUnknownExtensionsError() {
        return unknownExtensionsError;
    }

    /**
     * Legt den Wert der unknownExtensionsError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownExtensionsErrorStructure }
     *     
     */
    public void setUnknownExtensionsError(UnknownExtensionsErrorStructure value) {
        this.unknownExtensionsError = value;
    }

    /**
     * Ruft den Wert der allowedResourceUsageExceededError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllowedResourceUsageExceededErrorStructure }
     *     
     */
    public AllowedResourceUsageExceededErrorStructure getAllowedResourceUsageExceededError() {
        return allowedResourceUsageExceededError;
    }

    /**
     * Legt den Wert der allowedResourceUsageExceededError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedResourceUsageExceededErrorStructure }
     *     
     */
    public void setAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        this.allowedResourceUsageExceededError = value;
    }

    /**
     * Ruft den Wert der otherError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OtherErrorStructure }
     *     
     */
    public OtherErrorStructure getOtherError() {
        return otherError;
    }

    /**
     * Legt den Wert der otherError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherErrorStructure }
     *     
     */
    public void setOtherError(OtherErrorStructure value) {
        this.otherError = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ErrorDescriptionStructure }
     *     
     */
    public ErrorDescriptionStructure getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorDescriptionStructure }
     *     
     */
    public void setDescription(ErrorDescriptionStructure value) {
        this.description = value;
    }

}
