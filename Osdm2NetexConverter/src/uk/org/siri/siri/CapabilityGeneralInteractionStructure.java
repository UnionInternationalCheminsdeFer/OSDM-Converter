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
 * Type for Common Request Policy capabilities.
 * 
 * <p>Java-Klasse f�r CapabilityGeneralInteractionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CapabilityGeneralInteractionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Interaction">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RequestResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="PublishSubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Delivery">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DirectDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="FetchedDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MultipartDespatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MultipleSubscriberFilter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HasConfirmDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HasHeartbeat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VisitNumberisOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityGeneralInteractionStructure", propOrder = {
    "interaction",
    "delivery",
    "multipartDespatch",
    "multipleSubscriberFilter",
    "hasConfirmDelivery",
    "hasHeartbeat",
    "visitNumberisOrder"
})
public class CapabilityGeneralInteractionStructure {

    @XmlElement(name = "Interaction", required = true)
    protected CapabilityGeneralInteractionStructure.Interaction interaction;
    @XmlElement(name = "Delivery", required = true)
    protected CapabilityGeneralInteractionStructure.Delivery delivery;
    @XmlElement(name = "MultipartDespatch", defaultValue = "true")
    protected boolean multipartDespatch;
    @XmlElement(name = "MultipleSubscriberFilter", defaultValue = "false")
    protected boolean multipleSubscriberFilter;
    @XmlElement(name = "HasConfirmDelivery", defaultValue = "false")
    protected boolean hasConfirmDelivery;
    @XmlElement(name = "HasHeartbeat", defaultValue = "false")
    protected boolean hasHeartbeat;
    @XmlElement(name = "VisitNumberisOrder", defaultValue = "false")
    protected Boolean visitNumberisOrder;

    /**
     * Ruft den Wert der interaction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityGeneralInteractionStructure.Interaction }
     *     
     */
    public CapabilityGeneralInteractionStructure.Interaction getInteraction() {
        return interaction;
    }

    /**
     * Legt den Wert der interaction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityGeneralInteractionStructure.Interaction }
     *     
     */
    public void setInteraction(CapabilityGeneralInteractionStructure.Interaction value) {
        this.interaction = value;
    }

    /**
     * Ruft den Wert der delivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityGeneralInteractionStructure.Delivery }
     *     
     */
    public CapabilityGeneralInteractionStructure.Delivery getDelivery() {
        return delivery;
    }

    /**
     * Legt den Wert der delivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityGeneralInteractionStructure.Delivery }
     *     
     */
    public void setDelivery(CapabilityGeneralInteractionStructure.Delivery value) {
        this.delivery = value;
    }

    /**
     * Ruft den Wert der multipartDespatch-Eigenschaft ab.
     * 
     */
    public boolean isMultipartDespatch() {
        return multipartDespatch;
    }

    /**
     * Legt den Wert der multipartDespatch-Eigenschaft fest.
     * 
     */
    public void setMultipartDespatch(boolean value) {
        this.multipartDespatch = value;
    }

    /**
     * Ruft den Wert der multipleSubscriberFilter-Eigenschaft ab.
     * 
     */
    public boolean isMultipleSubscriberFilter() {
        return multipleSubscriberFilter;
    }

    /**
     * Legt den Wert der multipleSubscriberFilter-Eigenschaft fest.
     * 
     */
    public void setMultipleSubscriberFilter(boolean value) {
        this.multipleSubscriberFilter = value;
    }

    /**
     * Ruft den Wert der hasConfirmDelivery-Eigenschaft ab.
     * 
     */
    public boolean isHasConfirmDelivery() {
        return hasConfirmDelivery;
    }

    /**
     * Legt den Wert der hasConfirmDelivery-Eigenschaft fest.
     * 
     */
    public void setHasConfirmDelivery(boolean value) {
        this.hasConfirmDelivery = value;
    }

    /**
     * Ruft den Wert der hasHeartbeat-Eigenschaft ab.
     * 
     */
    public boolean isHasHeartbeat() {
        return hasHeartbeat;
    }

    /**
     * Legt den Wert der hasHeartbeat-Eigenschaft fest.
     * 
     */
    public void setHasHeartbeat(boolean value) {
        this.hasHeartbeat = value;
    }

    /**
     * Ruft den Wert der visitNumberisOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisitNumberisOrder() {
        return visitNumberisOrder;
    }

    /**
     * Legt den Wert der visitNumberisOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisitNumberisOrder(Boolean value) {
        this.visitNumberisOrder = value;
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
     *         &lt;element name="DirectDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="FetchedDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "directDelivery",
        "fetchedDelivery"
    })
    public static class Delivery {

        @XmlElement(name = "DirectDelivery")
        protected boolean directDelivery;
        @XmlElement(name = "FetchedDelivery")
        protected boolean fetchedDelivery;

        /**
         * Ruft den Wert der directDelivery-Eigenschaft ab.
         * 
         */
        public boolean isDirectDelivery() {
            return directDelivery;
        }

        /**
         * Legt den Wert der directDelivery-Eigenschaft fest.
         * 
         */
        public void setDirectDelivery(boolean value) {
            this.directDelivery = value;
        }

        /**
         * Ruft den Wert der fetchedDelivery-Eigenschaft ab.
         * 
         */
        public boolean isFetchedDelivery() {
            return fetchedDelivery;
        }

        /**
         * Legt den Wert der fetchedDelivery-Eigenschaft fest.
         * 
         */
        public void setFetchedDelivery(boolean value) {
            this.fetchedDelivery = value;
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
     *         &lt;element name="RequestResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="PublishSubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "requestResponse",
        "publishSubscribe"
    })
    public static class Interaction {

        @XmlElement(name = "RequestResponse", defaultValue = "true")
        protected boolean requestResponse;
        @XmlElement(name = "PublishSubscribe", defaultValue = "true")
        protected boolean publishSubscribe;

        /**
         * Ruft den Wert der requestResponse-Eigenschaft ab.
         * 
         */
        public boolean isRequestResponse() {
            return requestResponse;
        }

        /**
         * Legt den Wert der requestResponse-Eigenschaft fest.
         * 
         */
        public void setRequestResponse(boolean value) {
            this.requestResponse = value;
        }

        /**
         * Ruft den Wert der publishSubscribe-Eigenschaft ab.
         * 
         */
        public boolean isPublishSubscribe() {
            return publishSubscribe;
        }

        /**
         * Legt den Wert der publishSubscribe-Eigenschaft fest.
         * 
         */
        public void setPublishSubscribe(boolean value) {
            this.publishSubscribe = value;
        }

    }

}
