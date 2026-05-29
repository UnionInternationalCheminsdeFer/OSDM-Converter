//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.siri.siri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import uk.org.netex.netex.ExtensionsStructure;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.org.siri.siri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
@XmlType(name = "SiriObjectFactory")
public class ObjectFactory {

    private final static QName _UnknownParticipantError_QNAME = new QName("http://www.siri.org.uk/siri", "UnknownParticipantError");
    private final static QName _AbstractResponse_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractResponse");
    private final static QName _AbstractFunctionalServiceRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceRequest");
    private final static QName _CapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "CapabilitiesResponse");
    private final static QName _RequestorRef_QNAME = new QName("http://www.siri.org.uk/siri", "RequestorRef");
    private final static QName _SubscriptionTerminatedNotification_QNAME = new QName("http://www.siri.org.uk/siri", "SubscriptionTerminatedNotification");
    private final static QName _UnknownEndpointError_QNAME = new QName("http://www.siri.org.uk/siri", "UnknownEndpointError");
    private final static QName _InvalidDataReferencesError_QNAME = new QName("http://www.siri.org.uk/siri", "InvalidDataReferencesError");
    private final static QName _AbstractTrackedRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractTrackedRequest");
    private final static QName _CheckStatusResponse_QNAME = new QName("http://www.siri.org.uk/siri", "CheckStatusResponse");
    private final static QName _ServiceNotAvailableError_QNAME = new QName("http://www.siri.org.uk/siri", "ServiceNotAvailableError");
    private final static QName _ResponseStatus_QNAME = new QName("http://www.siri.org.uk/siri", "ResponseStatus");
    private final static QName _AuthenticatedRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AuthenticatedRequest");
    private final static QName _DataReadyNotification_QNAME = new QName("http://www.siri.org.uk/siri", "DataReadyNotification");
    private final static QName _AbstractFunctionalServiceSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceSubscriptionRequest");
    private final static QName _ParametersIgnoredError_QNAME = new QName("http://www.siri.org.uk/siri", "ParametersIgnoredError");
    private final static QName _AllowedResourceUsageExceededError_QNAME = new QName("http://www.siri.org.uk/siri", "AllowedResourceUsageExceededError");
    private final static QName _ProducerRequest_QNAME = new QName("http://www.siri.org.uk/siri", "ProducerRequest");
    private final static QName _RequestTimestamp_QNAME = new QName("http://www.siri.org.uk/siri", "RequestTimestamp");
    private final static QName _AbstractFunctionalServiceCapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceCapabilitiesResponse");
    private final static QName _DataReadyAcknowledgement_QNAME = new QName("http://www.siri.org.uk/siri", "DataReadyAcknowledgement");
    private final static QName _NoInfoForTopicError_QNAME = new QName("http://www.siri.org.uk/siri", "NoInfoForTopicError");
    private final static QName _Status_QNAME = new QName("http://www.siri.org.uk/siri", "Status");
    private final static QName _TerminateSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "TerminateSubscriptionRequest");
    private final static QName _UnknownExtensionsError_QNAME = new QName("http://www.siri.org.uk/siri", "UnknownExtensionsError");
    private final static QName _BeyondDataHorizon_QNAME = new QName("http://www.siri.org.uk/siri", "BeyondDataHorizon");
    private final static QName _SubscriptionResponse_QNAME = new QName("http://www.siri.org.uk/siri", "SubscriptionResponse");
    private final static QName _AbstractFunctionalServiceDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceDelivery");
    private final static QName _CheckStatusRequest_QNAME = new QName("http://www.siri.org.uk/siri", "CheckStatusRequest");
    private final static QName _CapabilityNotSupportedError_QNAME = new QName("http://www.siri.org.uk/siri", "CapabilityNotSupportedError");
    private final static QName _DataReceivedAcknowledgement_QNAME = new QName("http://www.siri.org.uk/siri", "DataReceivedAcknowledgement");
    private final static QName _ResponseTimestamp_QNAME = new QName("http://www.siri.org.uk/siri", "ResponseTimestamp");
    private final static QName _ServiceDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "ServiceDelivery");
    private final static QName _TerminateSubscriptionResponse_QNAME = new QName("http://www.siri.org.uk/siri", "TerminateSubscriptionResponse");
    private final static QName _UnapprovedKeyAccessError_QNAME = new QName("http://www.siri.org.uk/siri", "UnapprovedKeyAccessError");
    private final static QName _HeartbeatNotification_QNAME = new QName("http://www.siri.org.uk/siri", "HeartbeatNotification");
    private final static QName _AbstractFunctionalServiceCapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceCapabilitiesRequest");
    private final static QName _AbstractRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractRequest");
    private final static QName _AccessNotAllowedError_QNAME = new QName("http://www.siri.org.uk/siri", "AccessNotAllowedError");
    private final static QName _ErrorCode_QNAME = new QName("http://www.siri.org.uk/siri", "ErrorCode");
    private final static QName _IncludeTranslations_QNAME = new QName("http://www.siri.org.uk/siri", "IncludeTranslations");
    private final static QName _ErrorConditionElement_QNAME = new QName("http://www.siri.org.uk/siri", "ErrorConditionElement");
    private final static QName _UnknownSubscriptionError_QNAME = new QName("http://www.siri.org.uk/siri", "UnknownSubscriptionError");
    private final static QName _SrsName_QNAME = new QName("http://www.siri.org.uk/siri", "SrsName");
    private final static QName _OtherError_QNAME = new QName("http://www.siri.org.uk/siri", "OtherError");
    private final static QName _AbstractDiscoveryRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractDiscoveryRequest");
    private final static QName _Extensions_QNAME = new QName("http://www.siri.org.uk/siri", "Extensions");
    private final static QName _EndpointNotAvailableAccessError_QNAME = new QName("http://www.siri.org.uk/siri", "EndpointNotAvailableAccessError");
    private final static QName _ServiceDeliveryErrorConditionElement_QNAME = new QName("http://www.siri.org.uk/siri", "ServiceDeliveryErrorConditionElement");
    private final static QName _EndpointDeniedAccessError_QNAME = new QName("http://www.siri.org.uk/siri", "EndpointDeniedAccessError");
    private final static QName _AbstractServiceRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractServiceRequest");
    private final static QName _DataSupplyRequest_QNAME = new QName("http://www.siri.org.uk/siri", "DataSupplyRequest");
    private final static QName _ErrorCondition_QNAME = new QName("http://www.siri.org.uk/siri", "ErrorCondition");
    private final static QName _CapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "CapabilitiesRequest");
    private final static QName _ProducerResponse_QNAME = new QName("http://www.siri.org.uk/siri", "ProducerResponse");
    private final static QName _UnknownSubscriberError_QNAME = new QName("http://www.siri.org.uk/siri", "UnknownSubscriberError");
    private final static QName _AbstractDiscoveryDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractDiscoveryDelivery");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.org.siri.siri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckStatusResponseBodyStructure }
     * 
     */
    public CheckStatusResponseBodyStructure createCheckStatusResponseBodyStructure() {
        return new CheckStatusResponseBodyStructure();
    }

    /**
     * Create an instance of {@link ServiceDeliveryStructure }
     * 
     */
    public ServiceDeliveryStructure createServiceDeliveryStructure() {
        return new ServiceDeliveryStructure();
    }

    /**
     * Create an instance of {@link TerminationResponseStatusStructure }
     * 
     */
    public TerminationResponseStatusStructure createTerminationResponseStatusStructure() {
        return new TerminationResponseStatusStructure();
    }

    /**
     * Create an instance of {@link CapabilityGeneralInteractionStructure }
     * 
     */
    public CapabilityGeneralInteractionStructure createCapabilityGeneralInteractionStructure() {
        return new CapabilityGeneralInteractionStructure();
    }

    /**
     * Create an instance of {@link DataReadyResponseStructure }
     * 
     */
    public DataReadyResponseStructure createDataReadyResponseStructure() {
        return new DataReadyResponseStructure();
    }

    /**
     * Create an instance of {@link DataReceivedResponseStructure }
     * 
     */
    public DataReceivedResponseStructure createDataReceivedResponseStructure() {
        return new DataReceivedResponseStructure();
    }

    /**
     * Create an instance of {@link AbstractServiceCapabilitiesResponseStructure }
     * 
     */
    public AbstractServiceCapabilitiesResponseStructure createAbstractServiceCapabilitiesResponseStructure() {
        return new AbstractServiceCapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link ServiceCapabilitiesRequestStructure }
     * 
     */
    public ServiceCapabilitiesRequestStructure createServiceCapabilitiesRequestStructure() {
        return new ServiceCapabilitiesRequestStructure();
    }

    /**
     * Create an instance of {@link AllowedResourceUsageExceededErrorStructure }
     * 
     */
    public AllowedResourceUsageExceededErrorStructure createAllowedResourceUsageExceededErrorStructure() {
        return new AllowedResourceUsageExceededErrorStructure();
    }

    /**
     * Create an instance of {@link ErrorCodeStructure }
     * 
     */
    public ErrorCodeStructure createErrorCodeStructure() {
        return new ErrorCodeStructure();
    }

    /**
     * Create an instance of {@link UnknownEndpointErrorStructure }
     * 
     */
    public UnknownEndpointErrorStructure createUnknownEndpointErrorStructure() {
        return new UnknownEndpointErrorStructure();
    }

    /**
     * Create an instance of {@link ServiceNotAvailableErrorStructure }
     * 
     */
    public ServiceNotAvailableErrorStructure createServiceNotAvailableErrorStructure() {
        return new ServiceNotAvailableErrorStructure();
    }

    /**
     * Create an instance of {@link BeyondDataHorizonErrorStructure }
     * 
     */
    public BeyondDataHorizonErrorStructure createBeyondDataHorizonErrorStructure() {
        return new BeyondDataHorizonErrorStructure();
    }

    /**
     * Create an instance of {@link HeartbeatNotificationStructure }
     * 
     */
    public HeartbeatNotificationStructure createHeartbeatNotificationStructure() {
        return new HeartbeatNotificationStructure();
    }

    /**
     * Create an instance of {@link ProducerRequestEndpointStructure }
     * 
     */
    public ProducerRequestEndpointStructure createProducerRequestEndpointStructure() {
        return new ProducerRequestEndpointStructure();
    }

    /**
     * Create an instance of {@link SubscriptionResponseStructure }
     * 
     */
    public SubscriptionResponseStructure createSubscriptionResponseStructure() {
        return new SubscriptionResponseStructure();
    }

    /**
     * Create an instance of {@link UnknownSubscriptionErrorStructure }
     * 
     */
    public UnknownSubscriptionErrorStructure createUnknownSubscriptionErrorStructure() {
        return new UnknownSubscriptionErrorStructure();
    }

    /**
     * Create an instance of {@link CheckStatusRequestStructure }
     * 
     */
    public CheckStatusRequestStructure createCheckStatusRequestStructure() {
        return new CheckStatusRequestStructure();
    }

    /**
     * Create an instance of {@link RequestStructure }
     * 
     */
    public RequestStructure createRequestStructure() {
        return new RequestStructure();
    }

    /**
     * Create an instance of {@link CapabilitiesRequestStructure }
     * 
     */
    public CapabilitiesRequestStructure createCapabilitiesRequestStructure() {
        return new CapabilitiesRequestStructure();
    }

    /**
     * Create an instance of {@link ErrorConditionStructure }
     * 
     */
    public ErrorConditionStructure createErrorConditionStructure() {
        return new ErrorConditionStructure();
    }

    /**
     * Create an instance of {@link InvalidDataReferencesErrorStructure }
     * 
     */
    public InvalidDataReferencesErrorStructure createInvalidDataReferencesErrorStructure() {
        return new InvalidDataReferencesErrorStructure();
    }

    /**
     * Create an instance of {@link ServiceDelivery }
     * 
     */
    public ServiceDelivery createServiceDelivery() {
        return new ServiceDelivery();
    }

    /**
     * Create an instance of {@link ProducerResponseStructure }
     * 
     */
    public ProducerResponseStructure createProducerResponseStructure() {
        return new ProducerResponseStructure();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link ServiceRequestStructure }
     * 
     */
    public ServiceRequestStructure createServiceRequestStructure() {
        return new ServiceRequestStructure();
    }

    /**
     * Create an instance of {@link ServiceRequestContextStructure }
     * 
     */
    public ServiceRequestContextStructure createServiceRequestContextStructure() {
        return new ServiceRequestContextStructure();
    }

    /**
     * Create an instance of {@link ParticipantRefStructure }
     * 
     */
    public ParticipantRefStructure createParticipantRefStructure() {
        return new ParticipantRefStructure();
    }

    /**
     * Create an instance of {@link MessageQualifierStructure }
     * 
     */
    public MessageQualifierStructure createMessageQualifierStructure() {
        return new MessageQualifierStructure();
    }

    /**
     * Create an instance of {@link StatusResponseStructure }
     * 
     */
    public StatusResponseStructure createStatusResponseStructure() {
        return new StatusResponseStructure();
    }

    /**
     * Create an instance of {@link EndpointDeniedAccessStructure }
     * 
     */
    public EndpointDeniedAccessStructure createEndpointDeniedAccessStructure() {
        return new EndpointDeniedAccessStructure();
    }

    /**
     * Create an instance of {@link TerminateSubscriptionRequestStructure }
     * 
     */
    public TerminateSubscriptionRequestStructure createTerminateSubscriptionRequestStructure() {
        return new TerminateSubscriptionRequestStructure();
    }

    /**
     * Create an instance of {@link UnapprovedKeyAccessStructure }
     * 
     */
    public UnapprovedKeyAccessStructure createUnapprovedKeyAccessStructure() {
        return new UnapprovedKeyAccessStructure();
    }

    /**
     * Create an instance of {@link ExtensionsStructure }
     * 
     */
    public ExtensionsStructure createExtensionsStructure() {
        return new ExtensionsStructure();
    }

    /**
     * Create an instance of {@link EndpointNotAvailableAccessStructure }
     * 
     */
    public EndpointNotAvailableAccessStructure createEndpointNotAvailableAccessStructure() {
        return new EndpointNotAvailableAccessStructure();
    }

    /**
     * Create an instance of {@link CheckStatusResponseStructure }
     * 
     */
    public CheckStatusResponseStructure createCheckStatusResponseStructure() {
        return new CheckStatusResponseStructure();
    }

    /**
     * Create an instance of {@link SubscriptionRequest }
     * 
     */
    public SubscriptionRequest createSubscriptionRequest() {
        return new SubscriptionRequest();
    }

    /**
     * Create an instance of {@link SubscriptionRequestStructure }
     * 
     */
    public SubscriptionRequestStructure createSubscriptionRequestStructure() {
        return new SubscriptionRequestStructure();
    }

    /**
     * Create an instance of {@link SubscriptionContextStructure }
     * 
     */
    public SubscriptionContextStructure createSubscriptionContextStructure() {
        return new SubscriptionContextStructure();
    }

    /**
     * Create an instance of {@link TerminateSubscriptionResponseStructure }
     * 
     */
    public TerminateSubscriptionResponseStructure createTerminateSubscriptionResponseStructure() {
        return new TerminateSubscriptionResponseStructure();
    }

    /**
     * Create an instance of {@link CapabilityNotSupportedErrorStructure }
     * 
     */
    public CapabilityNotSupportedErrorStructure createCapabilityNotSupportedErrorStructure() {
        return new CapabilityNotSupportedErrorStructure();
    }

    /**
     * Create an instance of {@link UnknownExtensionsErrorStructure }
     * 
     */
    public UnknownExtensionsErrorStructure createUnknownExtensionsErrorStructure() {
        return new UnknownExtensionsErrorStructure();
    }

    /**
     * Create an instance of {@link SubscriptionTerminatedNotificationStructure }
     * 
     */
    public SubscriptionTerminatedNotificationStructure createSubscriptionTerminatedNotificationStructure() {
        return new SubscriptionTerminatedNotificationStructure();
    }

    /**
     * Create an instance of {@link DataReadyRequestStructure }
     * 
     */
    public DataReadyRequestStructure createDataReadyRequestStructure() {
        return new DataReadyRequestStructure();
    }

    /**
     * Create an instance of {@link ServiceDeliveryErrorConditionStructure }
     * 
     */
    public ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorConditionStructure() {
        return new ServiceDeliveryErrorConditionStructure();
    }

    /**
     * Create an instance of {@link UnknownParticipantErrorStructure }
     * 
     */
    public UnknownParticipantErrorStructure createUnknownParticipantErrorStructure() {
        return new UnknownParticipantErrorStructure();
    }

    /**
     * Create an instance of {@link CapabilitiesResponseStructure }
     * 
     */
    public CapabilitiesResponseStructure createCapabilitiesResponseStructure() {
        return new CapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link NoInfoForTopicErrorStructure }
     * 
     */
    public NoInfoForTopicErrorStructure createNoInfoForTopicErrorStructure() {
        return new NoInfoForTopicErrorStructure();
    }

    /**
     * Create an instance of {@link UnknownSubscriberErrorStructure }
     * 
     */
    public UnknownSubscriberErrorStructure createUnknownSubscriberErrorStructure() {
        return new UnknownSubscriberErrorStructure();
    }

    /**
     * Create an instance of {@link ErrorConditionElementStructure }
     * 
     */
    public ErrorConditionElementStructure createErrorConditionElementStructure() {
        return new ErrorConditionElementStructure();
    }

    /**
     * Create an instance of {@link AccessNotAllowedErrorStructure }
     * 
     */
    public AccessNotAllowedErrorStructure createAccessNotAllowedErrorStructure() {
        return new AccessNotAllowedErrorStructure();
    }

    /**
     * Create an instance of {@link ParametersIgnoredErrorStructure }
     * 
     */
    public ParametersIgnoredErrorStructure createParametersIgnoredErrorStructure() {
        return new ParametersIgnoredErrorStructure();
    }

    /**
     * Create an instance of {@link OtherErrorStructure }
     * 
     */
    public OtherErrorStructure createOtherErrorStructure() {
        return new OtherErrorStructure();
    }

    /**
     * Create an instance of {@link AbstractDiscoveryDeliveryStructure }
     * 
     */
    public AbstractDiscoveryDeliveryStructure createAbstractDiscoveryDeliveryStructure() {
        return new AbstractDiscoveryDeliveryStructure();
    }

    /**
     * Create an instance of {@link DataSupplyRequestStructure }
     * 
     */
    public DataSupplyRequestStructure createDataSupplyRequestStructure() {
        return new DataSupplyRequestStructure();
    }

    /**
     * Create an instance of {@link NaturalLanguagePlaceNameStructure }
     * 
     */
    public NaturalLanguagePlaceNameStructure createNaturalLanguagePlaceNameStructure() {
        return new NaturalLanguagePlaceNameStructure();
    }

    /**
     * Create an instance of {@link CoordinatesStructure }
     * 
     */
    public CoordinatesStructure createCoordinatesStructure() {
        return new CoordinatesStructure();
    }

    /**
     * Create an instance of {@link SubscriptionResponseBodyStructure }
     * 
     */
    public SubscriptionResponseBodyStructure createSubscriptionResponseBodyStructure() {
        return new SubscriptionResponseBodyStructure();
    }

    /**
     * Create an instance of {@link TransportDescriptionStructure }
     * 
     */
    public TransportDescriptionStructure createTransportDescriptionStructure() {
        return new TransportDescriptionStructure();
    }

    /**
     * Create an instance of {@link ServiceDeliveryBodyStructure }
     * 
     */
    public ServiceDeliveryBodyStructure createServiceDeliveryBodyStructure() {
        return new ServiceDeliveryBodyStructure();
    }

    /**
     * Create an instance of {@link AbstractCapabilitiesStructure }
     * 
     */
    public AbstractCapabilitiesStructure createAbstractCapabilitiesStructure() {
        return new AbstractCapabilitiesStructure();
    }

    /**
     * Create an instance of {@link ConsumerResponseEndpointStructure }
     * 
     */
    public ConsumerResponseEndpointStructure createConsumerResponseEndpointStructure() {
        return new ConsumerResponseEndpointStructure();
    }

    /**
     * Create an instance of {@link ConsumerRequestEndpointStructure }
     * 
     */
    public ConsumerRequestEndpointStructure createConsumerRequestEndpointStructure() {
        return new ConsumerRequestEndpointStructure();
    }

    /**
     * Create an instance of {@link ItemRefStructure }
     * 
     */
    public ItemRefStructure createItemRefStructure() {
        return new ItemRefStructure();
    }

    /**
     * Create an instance of {@link SubscriptionQualifierStructure }
     * 
     */
    public SubscriptionQualifierStructure createSubscriptionQualifierStructure() {
        return new SubscriptionQualifierStructure();
    }

    /**
     * Create an instance of {@link CapabilityRequestPolicyStructure }
     * 
     */
    public CapabilityRequestPolicyStructure createCapabilityRequestPolicyStructure() {
        return new CapabilityRequestPolicyStructure();
    }

    /**
     * Create an instance of {@link ProducerResponseEndpointStructure }
     * 
     */
    public ProducerResponseEndpointStructure createProducerResponseEndpointStructure() {
        return new ProducerResponseEndpointStructure();
    }

    /**
     * Create an instance of {@link CapabilityRefStructure }
     * 
     */
    public CapabilityRefStructure createCapabilityRefStructure() {
        return new CapabilityRefStructure();
    }

    /**
     * Create an instance of {@link DataSupplyRequestBodyStructure }
     * 
     */
    public DataSupplyRequestBodyStructure createDataSupplyRequestBodyStructure() {
        return new DataSupplyRequestBodyStructure();
    }

    /**
     * Create an instance of {@link BoundingBoxStructure }
     * 
     */
    public BoundingBoxStructure createBoundingBoxStructure() {
        return new BoundingBoxStructure();
    }

    /**
     * Create an instance of {@link MessageRefStructure }
     * 
     */
    public MessageRefStructure createMessageRefStructure() {
        return new MessageRefStructure();
    }

    /**
     * Create an instance of {@link CapabilitySubscriptionPolicyStructure }
     * 
     */
    public CapabilitySubscriptionPolicyStructure createCapabilitySubscriptionPolicyStructure() {
        return new CapabilitySubscriptionPolicyStructure();
    }

    /**
     * Create an instance of {@link SubscriptionFilterRefStructure }
     * 
     */
    public SubscriptionFilterRefStructure createSubscriptionFilterRefStructure() {
        return new SubscriptionFilterRefStructure();
    }

    /**
     * Create an instance of {@link ErrorDescriptionStructure }
     * 
     */
    public ErrorDescriptionStructure createErrorDescriptionStructure() {
        return new ErrorDescriptionStructure();
    }

    /**
     * Create an instance of {@link LocationStructure }
     * 
     */
    public LocationStructure createLocationStructure() {
        return new LocationStructure();
    }

    /**
     * Create an instance of {@link ResponseEndpointStructure }
     * 
     */
    public ResponseEndpointStructure createResponseEndpointStructure() {
        return new ResponseEndpointStructure();
    }

    /**
     * Create an instance of {@link NaturalLanguageStringStructure }
     * 
     */
    public NaturalLanguageStringStructure createNaturalLanguageStringStructure() {
        return new NaturalLanguageStringStructure();
    }

    /**
     * Create an instance of {@link LineShapeStructure }
     * 
     */
    public LineShapeStructure createLineShapeStructure() {
        return new LineShapeStructure();
    }

    /**
     * Create an instance of {@link DataNameSpacesStructure }
     * 
     */
    public DataNameSpacesStructure createDataNameSpacesStructure() {
        return new DataNameSpacesStructure();
    }

    /**
     * Create an instance of {@link TerminateSubscriptionRequestBodyStructure }
     * 
     */
    public TerminateSubscriptionRequestBodyStructure createTerminateSubscriptionRequestBodyStructure() {
        return new TerminateSubscriptionRequestBodyStructure();
    }

    /**
     * Create an instance of {@link SubscriptionFilterStructure }
     * 
     */
    public SubscriptionFilterStructure createSubscriptionFilterStructure() {
        return new SubscriptionFilterStructure();
    }

    /**
     * Create an instance of {@link SiriSchema }
     * 
     */
    public SiriSchema createSiriSchema() {
        return new SiriSchema();
    }

    /**
     * Create an instance of {@link CheckStatusResponseBodyStructure.ErrorCondition }
     * 
     */
    public CheckStatusResponseBodyStructure.ErrorCondition createCheckStatusResponseBodyStructureErrorCondition() {
        return new CheckStatusResponseBodyStructure.ErrorCondition();
    }

    /**
     * Create an instance of {@link ServiceDeliveryStructure.ErrorCondition }
     * 
     */
    public ServiceDeliveryStructure.ErrorCondition createServiceDeliveryStructureErrorCondition() {
        return new ServiceDeliveryStructure.ErrorCondition();
    }

    /**
     * Create an instance of {@link TerminationResponseStatusStructure.ErrorCondition }
     * 
     */
    public TerminationResponseStatusStructure.ErrorCondition createTerminationResponseStatusStructureErrorCondition() {
        return new TerminationResponseStatusStructure.ErrorCondition();
    }

    /**
     * Create an instance of {@link CapabilityGeneralInteractionStructure.Interaction }
     * 
     */
    public CapabilityGeneralInteractionStructure.Interaction createCapabilityGeneralInteractionStructureInteraction() {
        return new CapabilityGeneralInteractionStructure.Interaction();
    }

    /**
     * Create an instance of {@link CapabilityGeneralInteractionStructure.Delivery }
     * 
     */
    public CapabilityGeneralInteractionStructure.Delivery createCapabilityGeneralInteractionStructureDelivery() {
        return new CapabilityGeneralInteractionStructure.Delivery();
    }

    /**
     * Create an instance of {@link DataReadyResponseStructure.ErrorCondition }
     * 
     */
    public DataReadyResponseStructure.ErrorCondition createDataReadyResponseStructureErrorCondition() {
        return new DataReadyResponseStructure.ErrorCondition();
    }

    /**
     * Create an instance of {@link DataReceivedResponseStructure.ErrorCondition }
     * 
     */
    public DataReceivedResponseStructure.ErrorCondition createDataReceivedResponseStructureErrorCondition() {
        return new DataReceivedResponseStructure.ErrorCondition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownParticipantErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnknownParticipantError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<UnknownParticipantErrorStructure> createUnknownParticipantError(UnknownParticipantErrorStructure value) {
        return new JAXBElement<UnknownParticipantErrorStructure>(_UnknownParticipantError_QNAME, UnknownParticipantErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractResponse")
    public JAXBElement<ResponseStructure> createAbstractResponse(ResponseStructure value) {
        return new JAXBElement<ResponseStructure>(_AbstractResponse_QNAME, ResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractFunctionalServiceRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractServiceRequest")
    public JAXBElement<AbstractFunctionalServiceRequestStructure> createAbstractFunctionalServiceRequest(AbstractFunctionalServiceRequestStructure value) {
        return new JAXBElement<AbstractFunctionalServiceRequestStructure>(_AbstractFunctionalServiceRequest_QNAME, AbstractFunctionalServiceRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilitiesResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CapabilitiesResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ProducerResponse")
    public JAXBElement<CapabilitiesResponseStructure> createCapabilitiesResponse(CapabilitiesResponseStructure value) {
        return new JAXBElement<CapabilitiesResponseStructure>(_CapabilitiesResponse_QNAME, CapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RequestorRef")
    public JAXBElement<ParticipantRefStructure> createRequestorRef(ParticipantRefStructure value) {
        return new JAXBElement<ParticipantRefStructure>(_RequestorRef_QNAME, ParticipantRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionTerminatedNotificationStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SubscriptionTerminatedNotification", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ProducerResponse")
    public JAXBElement<SubscriptionTerminatedNotificationStructure> createSubscriptionTerminatedNotification(SubscriptionTerminatedNotificationStructure value) {
        return new JAXBElement<SubscriptionTerminatedNotificationStructure>(_SubscriptionTerminatedNotification_QNAME, SubscriptionTerminatedNotificationStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownEndpointErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnknownEndpointError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<UnknownEndpointErrorStructure> createUnknownEndpointError(UnknownEndpointErrorStructure value) {
        return new JAXBElement<UnknownEndpointErrorStructure>(_UnknownEndpointError_QNAME, UnknownEndpointErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidDataReferencesErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "InvalidDataReferencesError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<InvalidDataReferencesErrorStructure> createInvalidDataReferencesError(InvalidDataReferencesErrorStructure value) {
        return new JAXBElement<InvalidDataReferencesErrorStructure>(_InvalidDataReferencesError_QNAME, InvalidDataReferencesErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractTrackedRequest")
    public JAXBElement<RequestStructure> createAbstractTrackedRequest(RequestStructure value) {
        return new JAXBElement<RequestStructure>(_AbstractTrackedRequest_QNAME, RequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckStatusResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CheckStatusResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ProducerResponse")
    public JAXBElement<CheckStatusResponseStructure> createCheckStatusResponse(CheckStatusResponseStructure value) {
        return new JAXBElement<CheckStatusResponseStructure>(_CheckStatusResponse_QNAME, CheckStatusResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceNotAvailableErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ServiceNotAvailableError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<ServiceNotAvailableErrorStructure> createServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
        return new JAXBElement<ServiceNotAvailableErrorStructure>(_ServiceNotAvailableError_QNAME, ServiceNotAvailableErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ResponseStatus")
    public JAXBElement<StatusResponseStructure> createResponseStatus(StatusResponseStructure value) {
        return new JAXBElement<StatusResponseStructure>(_ResponseStatus_QNAME, StatusResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticatedRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AuthenticatedRequest")
    public JAXBElement<AuthenticatedRequestStructure> createAuthenticatedRequest(AuthenticatedRequestStructure value) {
        return new JAXBElement<AuthenticatedRequestStructure>(_AuthenticatedRequest_QNAME, AuthenticatedRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataReadyRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DataReadyNotification", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ProducerRequest")
    public JAXBElement<DataReadyRequestStructure> createDataReadyNotification(DataReadyRequestStructure value) {
        return new JAXBElement<DataReadyRequestStructure>(_DataReadyNotification_QNAME, DataReadyRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSubscriptionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceSubscriptionRequest")
    public JAXBElement<AbstractSubscriptionStructure> createAbstractFunctionalServiceSubscriptionRequest(AbstractSubscriptionStructure value) {
        return new JAXBElement<AbstractSubscriptionStructure>(_AbstractFunctionalServiceSubscriptionRequest_QNAME, AbstractSubscriptionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametersIgnoredErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ParametersIgnoredError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<ParametersIgnoredErrorStructure> createParametersIgnoredError(ParametersIgnoredErrorStructure value) {
        return new JAXBElement<ParametersIgnoredErrorStructure>(_ParametersIgnoredError_QNAME, ParametersIgnoredErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowedResourceUsageExceededErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AllowedResourceUsageExceededError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<AllowedResourceUsageExceededErrorStructure> createAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        return new JAXBElement<AllowedResourceUsageExceededErrorStructure>(_AllowedResourceUsageExceededError_QNAME, AllowedResourceUsageExceededErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducerRequestEndpointStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ProducerRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AuthenticatedRequest")
    public JAXBElement<ProducerRequestEndpointStructure> createProducerRequest(ProducerRequestEndpointStructure value) {
        return new JAXBElement<ProducerRequestEndpointStructure>(_ProducerRequest_QNAME, ProducerRequestEndpointStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RequestTimestamp")
    public JAXBElement<XMLGregorianCalendar> createRequestTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RequestTimestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractServiceCapabilitiesResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceCapabilitiesResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<AbstractServiceCapabilitiesResponseStructure> createAbstractFunctionalServiceCapabilitiesResponse(AbstractServiceCapabilitiesResponseStructure value) {
        return new JAXBElement<AbstractServiceCapabilitiesResponseStructure>(_AbstractFunctionalServiceCapabilitiesResponse_QNAME, AbstractServiceCapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataReadyResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DataReadyAcknowledgement", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<DataReadyResponseStructure> createDataReadyAcknowledgement(DataReadyResponseStructure value) {
        return new JAXBElement<DataReadyResponseStructure>(_DataReadyAcknowledgement_QNAME, DataReadyResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoInfoForTopicErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "NoInfoForTopicError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<NoInfoForTopicErrorStructure> createNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        return new JAXBElement<NoInfoForTopicErrorStructure>(_NoInfoForTopicError_QNAME, NoInfoForTopicErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Status", defaultValue = "true")
    public JAXBElement<Boolean> createStatus(Boolean value) {
        return new JAXBElement<Boolean>(_Status_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateSubscriptionRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TerminateSubscriptionRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AuthenticatedRequest")
    public JAXBElement<TerminateSubscriptionRequestStructure> createTerminateSubscriptionRequest(TerminateSubscriptionRequestStructure value) {
        return new JAXBElement<TerminateSubscriptionRequestStructure>(_TerminateSubscriptionRequest_QNAME, TerminateSubscriptionRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownExtensionsErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnknownExtensionsError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<UnknownExtensionsErrorStructure> createUnknownExtensionsError(UnknownExtensionsErrorStructure value) {
        return new JAXBElement<UnknownExtensionsErrorStructure>(_UnknownExtensionsError_QNAME, UnknownExtensionsErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeyondDataHorizonErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "BeyondDataHorizon", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<BeyondDataHorizonErrorStructure> createBeyondDataHorizon(BeyondDataHorizonErrorStructure value) {
        return new JAXBElement<BeyondDataHorizonErrorStructure>(_BeyondDataHorizon_QNAME, BeyondDataHorizonErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SubscriptionResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<SubscriptionResponseStructure> createSubscriptionResponse(SubscriptionResponseStructure value) {
        return new JAXBElement<SubscriptionResponseStructure>(_SubscriptionResponse_QNAME, SubscriptionResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractServiceDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<AbstractServiceDeliveryStructure> createAbstractFunctionalServiceDelivery(AbstractServiceDeliveryStructure value) {
        return new JAXBElement<AbstractServiceDeliveryStructure>(_AbstractFunctionalServiceDelivery_QNAME, AbstractServiceDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckStatusRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CheckStatusRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractTrackedRequest")
    public JAXBElement<CheckStatusRequestStructure> createCheckStatusRequest(CheckStatusRequestStructure value) {
        return new JAXBElement<CheckStatusRequestStructure>(_CheckStatusRequest_QNAME, CheckStatusRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityNotSupportedErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CapabilityNotSupportedError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<CapabilityNotSupportedErrorStructure> createCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        return new JAXBElement<CapabilityNotSupportedErrorStructure>(_CapabilityNotSupportedError_QNAME, CapabilityNotSupportedErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataReceivedResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DataReceivedAcknowledgement", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<DataReceivedResponseStructure> createDataReceivedAcknowledgement(DataReceivedResponseStructure value) {
        return new JAXBElement<DataReceivedResponseStructure>(_DataReceivedAcknowledgement_QNAME, DataReceivedResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ResponseTimestamp")
    public JAXBElement<XMLGregorianCalendar> createResponseTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResponseTimestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDelivery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ServiceDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ProducerResponse")
    public JAXBElement<ServiceDelivery> createServiceDelivery(ServiceDelivery value) {
        return new JAXBElement<ServiceDelivery>(_ServiceDelivery_QNAME, ServiceDelivery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateSubscriptionResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TerminateSubscriptionResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<TerminateSubscriptionResponseStructure> createTerminateSubscriptionResponse(TerminateSubscriptionResponseStructure value) {
        return new JAXBElement<TerminateSubscriptionResponseStructure>(_TerminateSubscriptionResponse_QNAME, TerminateSubscriptionResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnapprovedKeyAccessStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnapprovedKeyAccessError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<UnapprovedKeyAccessStructure> createUnapprovedKeyAccessError(UnapprovedKeyAccessStructure value) {
        return new JAXBElement<UnapprovedKeyAccessStructure>(_UnapprovedKeyAccessError_QNAME, UnapprovedKeyAccessStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeartbeatNotificationStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "HeartbeatNotification", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ProducerRequest")
    public JAXBElement<HeartbeatNotificationStructure> createHeartbeatNotification(HeartbeatNotificationStructure value) {
        return new JAXBElement<HeartbeatNotificationStructure>(_HeartbeatNotification_QNAME, HeartbeatNotificationStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractServiceRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceCapabilitiesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractServiceRequest")
    public JAXBElement<AbstractServiceRequestStructure> createAbstractFunctionalServiceCapabilitiesRequest(AbstractServiceRequestStructure value) {
        return new JAXBElement<AbstractServiceRequestStructure>(_AbstractFunctionalServiceCapabilitiesRequest_QNAME, AbstractServiceRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractRequest")
    public JAXBElement<AbstractRequestStructure> createAbstractRequest(AbstractRequestStructure value) {
        return new JAXBElement<AbstractRequestStructure>(_AbstractRequest_QNAME, AbstractRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessNotAllowedErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AccessNotAllowedError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<AccessNotAllowedErrorStructure> createAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        return new JAXBElement<AccessNotAllowedErrorStructure>(_AccessNotAllowedError_QNAME, AccessNotAllowedErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorCodeStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ErrorCode")
    public JAXBElement<ErrorCodeStructure> createErrorCode(ErrorCodeStructure value) {
        return new JAXBElement<ErrorCodeStructure>(_ErrorCode_QNAME, ErrorCodeStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "IncludeTranslations")
    public JAXBElement<Boolean> createIncludeTranslations(Boolean value) {
        return new JAXBElement<Boolean>(_IncludeTranslations_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorConditionElementStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ErrorConditionElement")
    public JAXBElement<ErrorConditionElementStructure> createErrorConditionElement(ErrorConditionElementStructure value) {
        return new JAXBElement<ErrorConditionElementStructure>(_ErrorConditionElement_QNAME, ErrorConditionElementStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownSubscriptionErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnknownSubscriptionError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<UnknownSubscriptionErrorStructure> createUnknownSubscriptionError(UnknownSubscriptionErrorStructure value) {
        return new JAXBElement<UnknownSubscriptionErrorStructure>(_UnknownSubscriptionError_QNAME, UnknownSubscriptionErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SrsName")
    public JAXBElement<String> createSrsName(String value) {
        return new JAXBElement<String>(_SrsName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "OtherError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<OtherErrorStructure> createOtherError(OtherErrorStructure value) {
        return new JAXBElement<OtherErrorStructure>(_OtherError_QNAME, OtherErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDiscoveryRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractDiscoveryRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AuthenticatedRequest")
    public JAXBElement<AbstractDiscoveryRequestStructure> createAbstractDiscoveryRequest(AbstractDiscoveryRequestStructure value) {
        return new JAXBElement<AbstractDiscoveryRequestStructure>(_AbstractDiscoveryRequest_QNAME, AbstractDiscoveryRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionsStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Extensions")
    public JAXBElement<ExtensionsStructure> createExtensions(ExtensionsStructure value) {
        return new JAXBElement<ExtensionsStructure>(_Extensions_QNAME, ExtensionsStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointNotAvailableAccessStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EndpointNotAvailableAccessError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<EndpointNotAvailableAccessStructure> createEndpointNotAvailableAccessError(EndpointNotAvailableAccessStructure value) {
        return new JAXBElement<EndpointNotAvailableAccessStructure>(_EndpointNotAvailableAccessError_QNAME, EndpointNotAvailableAccessStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDeliveryErrorConditionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ServiceDeliveryErrorConditionElement")
    public JAXBElement<ServiceDeliveryErrorConditionStructure> createServiceDeliveryErrorConditionElement(ServiceDeliveryErrorConditionStructure value) {
        return new JAXBElement<ServiceDeliveryErrorConditionStructure>(_ServiceDeliveryErrorConditionElement_QNAME, ServiceDeliveryErrorConditionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointDeniedAccessStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EndpointDeniedAccessError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<EndpointDeniedAccessStructure> createEndpointDeniedAccessError(EndpointDeniedAccessStructure value) {
        return new JAXBElement<EndpointDeniedAccessStructure>(_EndpointDeniedAccessError_QNAME, EndpointDeniedAccessStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractServiceRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractServiceRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractRequest")
    public JAXBElement<AbstractServiceRequestStructure> createAbstractServiceRequest(AbstractServiceRequestStructure value) {
        return new JAXBElement<AbstractServiceRequestStructure>(_AbstractServiceRequest_QNAME, AbstractServiceRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSupplyRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DataSupplyRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractRequest")
    public JAXBElement<DataSupplyRequestStructure> createDataSupplyRequest(DataSupplyRequestStructure value) {
        return new JAXBElement<DataSupplyRequestStructure>(_DataSupplyRequest_QNAME, DataSupplyRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorConditionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ErrorCondition")
    public JAXBElement<ErrorConditionStructure> createErrorCondition(ErrorConditionStructure value) {
        return new JAXBElement<ErrorConditionStructure>(_ErrorCondition_QNAME, ErrorConditionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilitiesRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CapabilitiesRequest")
    public JAXBElement<CapabilitiesRequestStructure> createCapabilitiesRequest(CapabilitiesRequestStructure value) {
        return new JAXBElement<CapabilitiesRequestStructure>(_CapabilitiesRequest_QNAME, CapabilitiesRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducerResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ProducerResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<ProducerResponseStructure> createProducerResponse(ProducerResponseStructure value) {
        return new JAXBElement<ProducerResponseStructure>(_ProducerResponse_QNAME, ProducerResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownSubscriberErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnknownSubscriberError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<UnknownSubscriberErrorStructure> createUnknownSubscriberError(UnknownSubscriberErrorStructure value) {
        return new JAXBElement<UnknownSubscriberErrorStructure>(_UnknownSubscriberError_QNAME, UnknownSubscriberErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDiscoveryDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractDiscoveryDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<AbstractDiscoveryDeliveryStructure> createAbstractDiscoveryDelivery(AbstractDiscoveryDeliveryStructure value) {
        return new JAXBElement<AbstractDiscoveryDeliveryStructure>(_AbstractDiscoveryDelivery_QNAME, AbstractDiscoveryDeliveryStructure.class, null, value);
    }

}
