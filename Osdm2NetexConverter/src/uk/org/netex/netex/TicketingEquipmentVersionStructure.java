//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a TICKETING EQUIPMENT.
 * 
 * <p>Java-Klasse f�r TicketingEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TicketingEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassengerEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TicketingEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingEquipment_VersionStructure", propOrder = {
    "vehicleModes",
    "ticketMachines",
    "numberOfMachines",
    "heightOfMachineInterface",
    "ticketingFacilityList",
    "ticketingServiceFacilityList",
    "ticketOffice",
    "ticketCounter",
    "numberOfTills",
    "queueManagement",
    "paymentMethods",
    "ticketTypesAvailable",
    "scopeOfTicketsAvailable",
    "lowCounterAccess",
    "heightOfLowCounter",
    "inductionLoops",
    "tactileInterfaceAvailable",
    "audioInterfaceAvailable",
    "disabledPriority",
    "wheelchairSuitable"
})
@XmlSeeAlso({
    TicketingEquipment.class
})
public class TicketingEquipmentVersionStructure
    extends PassengerEquipmentVersionStructure
{

    @XmlList
    @XmlElement(name = "VehicleModes")
    protected List<AllPublicTransportModesEnumeration> vehicleModes;
    @XmlElement(name = "TicketMachines")
    protected Boolean ticketMachines;
    @XmlElement(name = "NumberOfMachines")
    protected BigInteger numberOfMachines;
    @XmlElement(name = "HeightOfMachineInterface")
    protected BigDecimal heightOfMachineInterface;
    @XmlList
    @XmlElement(name = "TicketingFacilityList")
    protected List<TicketingFacilityEnumeration> ticketingFacilityList;
    @XmlList
    @XmlElement(name = "TicketingServiceFacilityList")
    protected List<TicketingServiceFacilityEnumeration> ticketingServiceFacilityList;
    @XmlElement(name = "TicketOffice")
    protected Boolean ticketOffice;
    @XmlElement(name = "TicketCounter")
    protected Boolean ticketCounter;
    @XmlElement(name = "NumberOfTills")
    protected BigInteger numberOfTills;
    @XmlElement(name = "QueueManagement")
    @XmlSchemaType(name = "normalizedString")
    protected QueueManagementEnumeration queueManagement;
    @XmlList
    @XmlElement(name = "PaymentMethods")
    protected List<PaymentMethodEnumeration> paymentMethods;
    @XmlList
    @XmlElement(name = "TicketTypesAvailable")
    protected List<TicketTypeEnumeration> ticketTypesAvailable;
    @XmlList
    @XmlElement(name = "ScopeOfTicketsAvailable")
    protected List<ScopeOfTicketEnumeration> scopeOfTicketsAvailable;
    @XmlElement(name = "LowCounterAccess")
    protected Boolean lowCounterAccess;
    @XmlElement(name = "HeightOfLowCounter")
    protected BigDecimal heightOfLowCounter;
    @XmlElement(name = "InductionLoops")
    protected Boolean inductionLoops;
    @XmlElement(name = "TactileInterfaceAvailable")
    protected Boolean tactileInterfaceAvailable;
    @XmlElement(name = "AudioInterfaceAvailable")
    protected Boolean audioInterfaceAvailable;
    @XmlElement(name = "DisabledPriority")
    protected Boolean disabledPriority;
    @XmlElement(name = "WheelchairSuitable")
    protected Boolean wheelchairSuitable;

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
     * Ruft den Wert der ticketMachines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketMachines() {
        return ticketMachines;
    }

    /**
     * Legt den Wert der ticketMachines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketMachines(Boolean value) {
        this.ticketMachines = value;
    }

    /**
     * Ruft den Wert der numberOfMachines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMachines() {
        return numberOfMachines;
    }

    /**
     * Legt den Wert der numberOfMachines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMachines(BigInteger value) {
        this.numberOfMachines = value;
    }

    /**
     * Ruft den Wert der heightOfMachineInterface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightOfMachineInterface() {
        return heightOfMachineInterface;
    }

    /**
     * Legt den Wert der heightOfMachineInterface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightOfMachineInterface(BigDecimal value) {
        this.heightOfMachineInterface = value;
    }

    /**
     * Gets the value of the ticketingFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingFacilityEnumeration }
     * 
     * 
     */
    public List<TicketingFacilityEnumeration> getTicketingFacilityList() {
        if (ticketingFacilityList == null) {
            ticketingFacilityList = new ArrayList<TicketingFacilityEnumeration>();
        }
        return this.ticketingFacilityList;
    }

    /**
     * Gets the value of the ticketingServiceFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingServiceFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingServiceFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingServiceFacilityEnumeration }
     * 
     * 
     */
    public List<TicketingServiceFacilityEnumeration> getTicketingServiceFacilityList() {
        if (ticketingServiceFacilityList == null) {
            ticketingServiceFacilityList = new ArrayList<TicketingServiceFacilityEnumeration>();
        }
        return this.ticketingServiceFacilityList;
    }

    /**
     * Ruft den Wert der ticketOffice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketOffice() {
        return ticketOffice;
    }

    /**
     * Legt den Wert der ticketOffice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketOffice(Boolean value) {
        this.ticketOffice = value;
    }

    /**
     * Ruft den Wert der ticketCounter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketCounter() {
        return ticketCounter;
    }

    /**
     * Legt den Wert der ticketCounter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketCounter(Boolean value) {
        this.ticketCounter = value;
    }

    /**
     * Ruft den Wert der numberOfTills-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTills() {
        return numberOfTills;
    }

    /**
     * Legt den Wert der numberOfTills-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTills(BigInteger value) {
        this.numberOfTills = value;
    }

    /**
     * Ruft den Wert der queueManagement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QueueManagementEnumeration }
     *     
     */
    public QueueManagementEnumeration getQueueManagement() {
        return queueManagement;
    }

    /**
     * Legt den Wert der queueManagement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueManagementEnumeration }
     *     
     */
    public void setQueueManagement(QueueManagementEnumeration value) {
        this.queueManagement = value;
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

    /**
     * Gets the value of the ticketTypesAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketTypesAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketTypesAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketTypeEnumeration }
     * 
     * 
     */
    public List<TicketTypeEnumeration> getTicketTypesAvailable() {
        if (ticketTypesAvailable == null) {
            ticketTypesAvailable = new ArrayList<TicketTypeEnumeration>();
        }
        return this.ticketTypesAvailable;
    }

    /**
     * Gets the value of the scopeOfTicketsAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scopeOfTicketsAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScopeOfTicketsAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScopeOfTicketEnumeration }
     * 
     * 
     */
    public List<ScopeOfTicketEnumeration> getScopeOfTicketsAvailable() {
        if (scopeOfTicketsAvailable == null) {
            scopeOfTicketsAvailable = new ArrayList<ScopeOfTicketEnumeration>();
        }
        return this.scopeOfTicketsAvailable;
    }

    /**
     * Ruft den Wert der lowCounterAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowCounterAccess() {
        return lowCounterAccess;
    }

    /**
     * Legt den Wert der lowCounterAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowCounterAccess(Boolean value) {
        this.lowCounterAccess = value;
    }

    /**
     * Ruft den Wert der heightOfLowCounter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightOfLowCounter() {
        return heightOfLowCounter;
    }

    /**
     * Legt den Wert der heightOfLowCounter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightOfLowCounter(BigDecimal value) {
        this.heightOfLowCounter = value;
    }

    /**
     * Ruft den Wert der inductionLoops-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInductionLoops() {
        return inductionLoops;
    }

    /**
     * Legt den Wert der inductionLoops-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInductionLoops(Boolean value) {
        this.inductionLoops = value;
    }

    /**
     * Ruft den Wert der tactileInterfaceAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileInterfaceAvailable() {
        return tactileInterfaceAvailable;
    }

    /**
     * Legt den Wert der tactileInterfaceAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileInterfaceAvailable(Boolean value) {
        this.tactileInterfaceAvailable = value;
    }

    /**
     * Ruft den Wert der audioInterfaceAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAudioInterfaceAvailable() {
        return audioInterfaceAvailable;
    }

    /**
     * Legt den Wert der audioInterfaceAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudioInterfaceAvailable(Boolean value) {
        this.audioInterfaceAvailable = value;
    }

    /**
     * Ruft den Wert der disabledPriority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabledPriority() {
        return disabledPriority;
    }

    /**
     * Legt den Wert der disabledPriority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabledPriority(Boolean value) {
        this.disabledPriority = value;
    }

    /**
     * Ruft den Wert der wheelchairSuitable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWheelchairSuitable() {
        return wheelchairSuitable;
    }

    /**
     * Legt den Wert der wheelchairSuitable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWheelchairSuitable(Boolean value) {
        this.wheelchairSuitable = value;
    }

}
