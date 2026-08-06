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
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for Ticketing Service.
 * 
 * <p>Java-Klasse f�r TicketingService_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TicketingService_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LocalService_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TicketingServiceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingService_VersionStructure", propOrder = {
    "vehicleModes",
    "ticketingServiceList",
    "ticketTypeList",
    "ticketCounterService",
    "onlinePurchaseForCollection",
    "onlinePurchaseForETicket",
    "onlinePurchaseForSelfPrintTicket",
    "mobileDeviceTickets",
    "paymentMethods"
})
@XmlSeeAlso({
    TicketingService.class
})
public class TicketingServiceVersionStructure
    extends LocalServiceVersionStructure
{

    @XmlList
    @XmlElement(name = "VehicleModes")
    protected List<AllPublicTransportModesEnumeration> vehicleModes;
    @XmlList
    @XmlElement(name = "TicketingServiceList")
    protected List<TicketingServiceFacilityEnumeration> ticketingServiceList;
    @XmlElementRef(name = "TicketTypeList", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected List<JAXBElement<List<TicketTypeEnumeration>>> ticketTypeList;
    @XmlElement(name = "TicketCounterService")
    protected Boolean ticketCounterService;
    @XmlElement(name = "OnlinePurchaseForCollection")
    protected Boolean onlinePurchaseForCollection;
    @XmlElement(name = "OnlinePurchaseForETicket")
    protected Boolean onlinePurchaseForETicket;
    @XmlElement(name = "OnlinePurchaseForSelfPrintTicket")
    protected Boolean onlinePurchaseForSelfPrintTicket;
    @XmlElement(name = "MobileDeviceTickets")
    protected Boolean mobileDeviceTickets;
    @XmlList
    @XmlElement(name = "PaymentMethods")
    protected List<PaymentMethodEnumeration> paymentMethods;

    /**
     * Gets the value of the vehicleModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllPublicTransportModesEnumeration }
     * 
     * 
     */
    public List<AllPublicTransportModesEnumeration> getVehicleModes() {
        if (vehicleModes == null) {
            vehicleModes = new ArrayList<AllPublicTransportModesEnumeration>();
        }
        return this.vehicleModes;
    }

    /**
     * Gets the value of the ticketingServiceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingServiceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingServiceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingServiceFacilityEnumeration }
     * 
     * 
     */
    public List<TicketingServiceFacilityEnumeration> getTicketingServiceList() {
        if (ticketingServiceList == null) {
            ticketingServiceList = new ArrayList<TicketingServiceFacilityEnumeration>();
        }
        return this.ticketingServiceList;
    }

    /**
     * Gets the value of the ticketTypeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketTypeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketTypeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link TicketTypeEnumeration }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<List<TicketTypeEnumeration>>> getTicketTypeList() {
        if (ticketTypeList == null) {
            ticketTypeList = new ArrayList<JAXBElement<List<TicketTypeEnumeration>>>();
        }
        return this.ticketTypeList;
    }

    /**
     * Ruft den Wert der ticketCounterService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketCounterService() {
        return ticketCounterService;
    }

    /**
     * Legt den Wert der ticketCounterService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketCounterService(Boolean value) {
        this.ticketCounterService = value;
    }

    /**
     * Ruft den Wert der onlinePurchaseForCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlinePurchaseForCollection() {
        return onlinePurchaseForCollection;
    }

    /**
     * Legt den Wert der onlinePurchaseForCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlinePurchaseForCollection(Boolean value) {
        this.onlinePurchaseForCollection = value;
    }

    /**
     * Ruft den Wert der onlinePurchaseForETicket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlinePurchaseForETicket() {
        return onlinePurchaseForETicket;
    }

    /**
     * Legt den Wert der onlinePurchaseForETicket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlinePurchaseForETicket(Boolean value) {
        this.onlinePurchaseForETicket = value;
    }

    /**
     * Ruft den Wert der onlinePurchaseForSelfPrintTicket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlinePurchaseForSelfPrintTicket() {
        return onlinePurchaseForSelfPrintTicket;
    }

    /**
     * Legt den Wert der onlinePurchaseForSelfPrintTicket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlinePurchaseForSelfPrintTicket(Boolean value) {
        this.onlinePurchaseForSelfPrintTicket = value;
    }

    /**
     * Ruft den Wert der mobileDeviceTickets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileDeviceTickets() {
        return mobileDeviceTickets;
    }

    /**
     * Legt den Wert der mobileDeviceTickets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileDeviceTickets(Boolean value) {
        this.mobileDeviceTickets = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodEnumeration }
     * 
     * 
     */
    public List<PaymentMethodEnumeration> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<PaymentMethodEnumeration>();
        }
        return this.paymentMethods;
    }

}
