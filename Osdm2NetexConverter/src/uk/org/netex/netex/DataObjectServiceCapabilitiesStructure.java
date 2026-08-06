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
import uk.org.siri.siri.AbstractCapabilitiesStructure;


/**
 * Type for DATA OBJECT Capabilities. This is a stub - needs developing .
 * 
 * <p>Java-Klasse f�r DataObjectServiceCapabilitiesStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataObjectServiceCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractCapabilitiesStructure">
 *       &lt;sequence>
 *         &lt;element name="TopicFiltering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FilterByFrame" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestPolicy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.netex.org.uk/netex}DataObjectCapabilityRequestPolicyStructure">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubscriptionPolicy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HasIncrementalUpdates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResponseFeatures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataObjectServiceCapabilitiesStructure", propOrder = {
    "topicFiltering",
    "requestPolicy",
    "subscriptionPolicy",
    "responseFeatures"
})
public class DataObjectServiceCapabilitiesStructure
    extends AbstractCapabilitiesStructure
{

    @XmlElement(name = "TopicFiltering")
    protected DataObjectServiceCapabilitiesStructure.TopicFiltering topicFiltering;
    @XmlElement(name = "RequestPolicy")
    protected DataObjectServiceCapabilitiesStructure.RequestPolicy requestPolicy;
    @XmlElement(name = "SubscriptionPolicy")
    protected DataObjectServiceCapabilitiesStructure.SubscriptionPolicy subscriptionPolicy;
    @XmlElement(name = "ResponseFeatures")
    protected DataObjectServiceCapabilitiesStructure.ResponseFeatures responseFeatures;

    /**
     * Ruft den Wert der topicFiltering-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public DataObjectServiceCapabilitiesStructure.TopicFiltering getTopicFiltering() {
        return topicFiltering;
    }

    /**
     * Legt den Wert der topicFiltering-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public void setTopicFiltering(DataObjectServiceCapabilitiesStructure.TopicFiltering value) {
        this.topicFiltering = value;
    }

    /**
     * Ruft den Wert der requestPolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public DataObjectServiceCapabilitiesStructure.RequestPolicy getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Legt den Wert der requestPolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public void setRequestPolicy(DataObjectServiceCapabilitiesStructure.RequestPolicy value) {
        this.requestPolicy = value;
    }

    /**
     * Ruft den Wert der subscriptionPolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectServiceCapabilitiesStructure.SubscriptionPolicy }
     *     
     */
    public DataObjectServiceCapabilitiesStructure.SubscriptionPolicy getSubscriptionPolicy() {
        return subscriptionPolicy;
    }

    /**
     * Legt den Wert der subscriptionPolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectServiceCapabilitiesStructure.SubscriptionPolicy }
     *     
     */
    public void setSubscriptionPolicy(DataObjectServiceCapabilitiesStructure.SubscriptionPolicy value) {
        this.subscriptionPolicy = value;
    }

    /**
     * Ruft den Wert der responseFeatures-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectServiceCapabilitiesStructure.ResponseFeatures }
     *     
     */
    public DataObjectServiceCapabilitiesStructure.ResponseFeatures getResponseFeatures() {
        return responseFeatures;
    }

    /**
     * Legt den Wert der responseFeatures-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectServiceCapabilitiesStructure.ResponseFeatures }
     *     
     */
    public void setResponseFeatures(DataObjectServiceCapabilitiesStructure.ResponseFeatures value) {
        this.responseFeatures = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}DataObjectCapabilityRequestPolicyStructure">
     *       &lt;sequence>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RequestPolicy
        extends DataObjectCapabilityRequestPolicyStructure
    {


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
     *       &lt;sequence>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ResponseFeatures {


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
     *       &lt;sequence>
     *         &lt;element name="HasIncrementalUpdates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hasIncrementalUpdates"
    })
    public static class SubscriptionPolicy {

        @XmlElement(name = "HasIncrementalUpdates", defaultValue = "true")
        protected Boolean hasIncrementalUpdates;

        /**
         * Ruft den Wert der hasIncrementalUpdates-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasIncrementalUpdates() {
            return hasIncrementalUpdates;
        }

        /**
         * Legt den Wert der hasIncrementalUpdates-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasIncrementalUpdates(Boolean value) {
            this.hasIncrementalUpdates = value;
        }

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
     *       &lt;sequence>
     *         &lt;element name="FilterByFrame" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "filterByFrame"
    })
    public static class TopicFiltering {

        @XmlElement(name = "FilterByFrame", defaultValue = "true")
        protected Boolean filterByFrame;

        /**
         * Ruft den Wert der filterByFrame-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByFrame() {
            return filterByFrame;
        }

        /**
         * Legt den Wert der filterByFrame-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByFrame(Boolean value) {
            this.filterByFrame = value;
        }

    }

}
