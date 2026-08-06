//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.siri.siri;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Configurable context for requests. Intended Primarily as a documentation mechanism.
 * 
 * <p>Java-Klasse f�r ServiceRequestContextStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestContextStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceEndpointAddressGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ClientEndpointAddressGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ReferenceContextGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TemporalContextGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DeliveryContextGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ResourceContextGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}PredictionMethodGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestContextStructure", propOrder = {
    "checkStatusAddress",
    "subscribeAddress",
    "manageSubscriptionAddress",
    "getDataAddress",
    "statusResponseAddress",
    "subscriberAddress",
    "notifyAddress",
    "consumerAddress",
    "dataNameSpaces",
    "language",
    "wgsDecimalDegrees",
    "gmlCoordinateFormat",
    "distanceUnits",
    "velocityUnits",
    "dataHorizon",
    "requestTimeout",
    "deliveryMethod",
    "multipartDespatch",
    "confirmDelivery",
    "maximimumNumberOfSubscriptions",
    "allowedPredictors",
    "predictionFunction"
})
public class ServiceRequestContextStructure {

    @XmlElement(name = "CheckStatusAddress")
    @XmlSchemaType(name = "anyURI")
    protected String checkStatusAddress;
    @XmlElement(name = "SubscribeAddress")
    @XmlSchemaType(name = "anyURI")
    protected String subscribeAddress;
    @XmlElement(name = "ManageSubscriptionAddress")
    @XmlSchemaType(name = "anyURI")
    protected String manageSubscriptionAddress;
    @XmlElement(name = "GetDataAddress")
    @XmlSchemaType(name = "anyURI")
    protected String getDataAddress;
    @XmlElement(name = "StatusResponseAddress")
    @XmlSchemaType(name = "anyURI")
    protected String statusResponseAddress;
    @XmlElement(name = "SubscriberAddress")
    @XmlSchemaType(name = "anyURI")
    protected String subscriberAddress;
    @XmlElement(name = "NotifyAddress")
    @XmlSchemaType(name = "anyURI")
    protected String notifyAddress;
    @XmlElement(name = "ConsumerAddress")
    @XmlSchemaType(name = "anyURI")
    protected String consumerAddress;
    @XmlElement(name = "DataNameSpaces")
    protected DataNameSpacesStructure dataNameSpaces;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "WgsDecimalDegrees")
    protected String wgsDecimalDegrees;
    @XmlElement(name = "GmlCoordinateFormat")
    protected String gmlCoordinateFormat;
    @XmlElement(name = "DistanceUnits")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String distanceUnits;
    @XmlElement(name = "VelocityUnits")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String velocityUnits;
    @XmlElement(name = "DataHorizon")
    protected Duration dataHorizon;
    @XmlElement(name = "RequestTimeout")
    protected Duration requestTimeout;
    @XmlElement(name = "DeliveryMethod", defaultValue = "direct")
    @XmlSchemaType(name = "NMTOKEN")
    protected DeliveryMethodEnumeration deliveryMethod;
    @XmlElement(name = "MultipartDespatch")
    protected Boolean multipartDespatch;
    @XmlElement(name = "ConfirmDelivery", defaultValue = "false")
    protected Boolean confirmDelivery;
    @XmlElement(name = "MaximimumNumberOfSubscriptions")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximimumNumberOfSubscriptions;
    @XmlElement(name = "AllowedPredictors", defaultValue = "anyone")
    @XmlSchemaType(name = "NMTOKEN")
    protected PredictorsEnumeration allowedPredictors;
    @XmlElement(name = "PredictionFunction")
    protected String predictionFunction;

    /**
     * Ruft den Wert der checkStatusAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckStatusAddress() {
        return checkStatusAddress;
    }

    /**
     * Legt den Wert der checkStatusAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckStatusAddress(String value) {
        this.checkStatusAddress = value;
    }

    /**
     * Ruft den Wert der subscribeAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscribeAddress() {
        return subscribeAddress;
    }

    /**
     * Legt den Wert der subscribeAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscribeAddress(String value) {
        this.subscribeAddress = value;
    }

    /**
     * Ruft den Wert der manageSubscriptionAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageSubscriptionAddress() {
        return manageSubscriptionAddress;
    }

    /**
     * Legt den Wert der manageSubscriptionAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageSubscriptionAddress(String value) {
        this.manageSubscriptionAddress = value;
    }

    /**
     * Ruft den Wert der getDataAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDataAddress() {
        return getDataAddress;
    }

    /**
     * Legt den Wert der getDataAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDataAddress(String value) {
        this.getDataAddress = value;
    }

    /**
     * Ruft den Wert der statusResponseAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusResponseAddress() {
        return statusResponseAddress;
    }

    /**
     * Legt den Wert der statusResponseAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusResponseAddress(String value) {
        this.statusResponseAddress = value;
    }

    /**
     * Ruft den Wert der subscriberAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberAddress() {
        return subscriberAddress;
    }

    /**
     * Legt den Wert der subscriberAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberAddress(String value) {
        this.subscriberAddress = value;
    }

    /**
     * Ruft den Wert der notifyAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyAddress() {
        return notifyAddress;
    }

    /**
     * Legt den Wert der notifyAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyAddress(String value) {
        this.notifyAddress = value;
    }

    /**
     * Ruft den Wert der consumerAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerAddress() {
        return consumerAddress;
    }

    /**
     * Legt den Wert der consumerAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerAddress(String value) {
        this.consumerAddress = value;
    }

    /**
     * Ruft den Wert der dataNameSpaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataNameSpacesStructure }
     *     
     */
    public DataNameSpacesStructure getDataNameSpaces() {
        return dataNameSpaces;
    }

    /**
     * Legt den Wert der dataNameSpaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataNameSpacesStructure }
     *     
     */
    public void setDataNameSpaces(DataNameSpacesStructure value) {
        this.dataNameSpaces = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Ruft den Wert der wgsDecimalDegrees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWgsDecimalDegrees() {
        return wgsDecimalDegrees;
    }

    /**
     * Legt den Wert der wgsDecimalDegrees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWgsDecimalDegrees(String value) {
        this.wgsDecimalDegrees = value;
    }

    /**
     * Ruft den Wert der gmlCoordinateFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmlCoordinateFormat() {
        return gmlCoordinateFormat;
    }

    /**
     * Legt den Wert der gmlCoordinateFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmlCoordinateFormat(String value) {
        this.gmlCoordinateFormat = value;
    }

    /**
     * Ruft den Wert der distanceUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnits() {
        return distanceUnits;
    }

    /**
     * Legt den Wert der distanceUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnits(String value) {
        this.distanceUnits = value;
    }

    /**
     * Ruft den Wert der velocityUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocityUnits() {
        return velocityUnits;
    }

    /**
     * Legt den Wert der velocityUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocityUnits(String value) {
        this.velocityUnits = value;
    }

    /**
     * Ruft den Wert der dataHorizon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDataHorizon() {
        return dataHorizon;
    }

    /**
     * Legt den Wert der dataHorizon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDataHorizon(Duration value) {
        this.dataHorizon = value;
    }

    /**
     * Ruft den Wert der requestTimeout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRequestTimeout() {
        return requestTimeout;
    }

    /**
     * Legt den Wert der requestTimeout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRequestTimeout(Duration value) {
        this.requestTimeout = value;
    }

    /**
     * Ruft den Wert der deliveryMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethodEnumeration }
     *     
     */
    public DeliveryMethodEnumeration getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Legt den Wert der deliveryMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethodEnumeration }
     *     
     */
    public void setDeliveryMethod(DeliveryMethodEnumeration value) {
        this.deliveryMethod = value;
    }

    /**
     * Ruft den Wert der multipartDespatch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipartDespatch() {
        return multipartDespatch;
    }

    /**
     * Legt den Wert der multipartDespatch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipartDespatch(Boolean value) {
        this.multipartDespatch = value;
    }

    /**
     * Ruft den Wert der confirmDelivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmDelivery() {
        return confirmDelivery;
    }

    /**
     * Legt den Wert der confirmDelivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmDelivery(Boolean value) {
        this.confirmDelivery = value;
    }

    /**
     * Ruft den Wert der maximimumNumberOfSubscriptions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximimumNumberOfSubscriptions() {
        return maximimumNumberOfSubscriptions;
    }

    /**
     * Legt den Wert der maximimumNumberOfSubscriptions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximimumNumberOfSubscriptions(BigInteger value) {
        this.maximimumNumberOfSubscriptions = value;
    }

    /**
     * Ruft den Wert der allowedPredictors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PredictorsEnumeration }
     *     
     */
    public PredictorsEnumeration getAllowedPredictors() {
        return allowedPredictors;
    }

    /**
     * Legt den Wert der allowedPredictors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictorsEnumeration }
     *     
     */
    public void setAllowedPredictors(PredictorsEnumeration value) {
        this.allowedPredictors = value;
    }

    /**
     * Ruft den Wert der predictionFunction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredictionFunction() {
        return predictionFunction;
    }

    /**
     * Legt den Wert der predictionFunction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredictionFunction(String value) {
        this.predictionFunction = value;
    }

}
