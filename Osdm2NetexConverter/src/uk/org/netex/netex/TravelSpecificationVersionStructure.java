//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for TRAVEL SPECIFICATION.
 * 
 * <p>Java-Klasse f�r TravelSpecification_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TravelSpecification_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FareContractEntry_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TravelSpecificationGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelSpecification_VersionStructure", propOrder = {
    "salesTransactionRef",
    "passengerInformationRequestRef",
    "farePriceRef",
    "cellRefDummy",
    "amount",
    "currency",
    "priceUnitRef",
    "units",
    "ruleStepResults",
    "paymentMethod",
    "typeOfPaymentMethodRef",
    "startOfValidity",
    "endOfValidity",
    "travelSpecificationSummaryView",
    "specificParameterAssignments",
    "noticeAssignments"
})
@XmlSeeAlso({
    TravelSpecification.class,
    OfferedTravelSpecificationVersionStructure.class,
    RequestedTravelSpecificationVersionStructure.class
})
public class TravelSpecificationVersionStructure
    extends FareContractEntryVersionStructure
{

    @XmlElement(name = "SalesTransactionRef")
    protected SalesTransactionRefStructure salesTransactionRef;
    @XmlElementRef(name = "PassengerInformationRequestRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PassengerInformationRequestRefStructure> passengerInformationRequestRef;
    @XmlElementRef(name = "FarePriceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FarePriceRefStructure> farePriceRef;
    @XmlElementRef(name = "CellRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VersionOfObjectRefStructure> cellRefDummy;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "Currency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String currency;
    @XmlElement(name = "PriceUnitRef")
    protected PriceUnitRefStructure priceUnitRef;
    @XmlElement(name = "Units")
    protected BigDecimal units;
    protected PriceRuleStepResultsRelStructure ruleStepResults;
    @XmlElement(name = "PaymentMethod")
    @XmlSchemaType(name = "normalizedString")
    protected PaymentMethodEnumeration paymentMethod;
    @XmlElement(name = "TypeOfPaymentMethodRef")
    protected TypeOfPaymentMethodRef typeOfPaymentMethodRef;
    @XmlElement(name = "StartOfValidity")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startOfValidity;
    @XmlElement(name = "EndOfValidity")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endOfValidity;
    @XmlElement(name = "TravelSpecificationSummaryView")
    protected TravelSpecificationSummaryViewStructure travelSpecificationSummaryView;
    protected SpecificParameterAssignmentsRelStructure specificParameterAssignments;
    protected NoticeAssignmentsRelStructure noticeAssignments;

    /**
     * Ruft den Wert der salesTransactionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesTransactionRefStructure }
     *     
     */
    public SalesTransactionRefStructure getSalesTransactionRef() {
        return salesTransactionRef;
    }

    /**
     * Legt den Wert der salesTransactionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTransactionRefStructure }
     *     
     */
    public void setSalesTransactionRef(SalesTransactionRefStructure value) {
        this.salesTransactionRef = value;
    }

    /**
     * Ruft den Wert der passengerInformationRequestRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TripPlanRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopFinderRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopEventRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerInformationRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleTripFareRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RepeatedTripFareRequestRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends PassengerInformationRequestRefStructure> getPassengerInformationRequestRef() {
        return passengerInformationRequestRef;
    }

    /**
     * Legt den Wert der passengerInformationRequestRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TripPlanRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopFinderRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopEventRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerInformationRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleTripFareRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RepeatedTripFareRequestRefStructure }{@code >}
     *     
     */
    public void setPassengerInformationRequestRef(JAXBElement<? extends PassengerInformationRequestRefStructure> value) {
        this.passengerInformationRequestRef = value;
    }

    /**
     * Ruft den Wert der farePriceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FarePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfilmentMethodPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappingRulePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeriesConstraintPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductPriceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends FarePriceRefStructure> getFarePriceRef() {
        return farePriceRef;
    }

    /**
     * Legt den Wert der farePriceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FarePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfilmentMethodPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappingRulePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeriesConstraintPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductPriceRefStructure }{@code >}
     *     
     */
    public void setFarePriceRef(JAXBElement<? extends FarePriceRefStructure> value) {
        this.farePriceRef = value;
    }

    /**
     * Ruft den Wert der cellRefDummy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CellRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VersionOfObjectRefStructure> getCellRefDummy() {
        return cellRefDummy;
    }

    /**
     * Legt den Wert der cellRefDummy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CellRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     *     
     */
    public void setCellRefDummy(JAXBElement<? extends VersionOfObjectRefStructure> value) {
        this.cellRefDummy = value;
    }

    /**
     * Ruft den Wert der amount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Legt den Wert der amount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Legt den Wert der currency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Ruft den Wert der priceUnitRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceUnitRefStructure }
     *     
     */
    public PriceUnitRefStructure getPriceUnitRef() {
        return priceUnitRef;
    }

    /**
     * Legt den Wert der priceUnitRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceUnitRefStructure }
     *     
     */
    public void setPriceUnitRef(PriceUnitRefStructure value) {
        this.priceUnitRef = value;
    }

    /**
     * Ruft den Wert der units-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnits() {
        return units;
    }

    /**
     * Legt den Wert der units-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnits(BigDecimal value) {
        this.units = value;
    }

    /**
     * Ruft den Wert der ruleStepResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceRuleStepResultsRelStructure }
     *     
     */
    public PriceRuleStepResultsRelStructure getRuleStepResults() {
        return ruleStepResults;
    }

    /**
     * Legt den Wert der ruleStepResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRuleStepResultsRelStructure }
     *     
     */
    public void setRuleStepResults(PriceRuleStepResultsRelStructure value) {
        this.ruleStepResults = value;
    }

    /**
     * Ruft den Wert der paymentMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodEnumeration }
     *     
     */
    public PaymentMethodEnumeration getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Legt den Wert der paymentMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodEnumeration }
     *     
     */
    public void setPaymentMethod(PaymentMethodEnumeration value) {
        this.paymentMethod = value;
    }

    /**
     * Ruft den Wert der typeOfPaymentMethodRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPaymentMethodRef }
     *     
     */
    public TypeOfPaymentMethodRef getTypeOfPaymentMethodRef() {
        return typeOfPaymentMethodRef;
    }

    /**
     * Legt den Wert der typeOfPaymentMethodRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPaymentMethodRef }
     *     
     */
    public void setTypeOfPaymentMethodRef(TypeOfPaymentMethodRef value) {
        this.typeOfPaymentMethodRef = value;
    }

    /**
     * Ruft den Wert der startOfValidity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartOfValidity() {
        return startOfValidity;
    }

    /**
     * Legt den Wert der startOfValidity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartOfValidity(XMLGregorianCalendar value) {
        this.startOfValidity = value;
    }

    /**
     * Ruft den Wert der endOfValidity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndOfValidity() {
        return endOfValidity;
    }

    /**
     * Legt den Wert der endOfValidity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndOfValidity(XMLGregorianCalendar value) {
        this.endOfValidity = value;
    }

    /**
     * Summary of key aspects of TRAVEL SPECIFICATION. +V1.1. This data should all be derivable from the detailed parameter assignments of the v+1.1
     * 
     * @return
     *     possible object is
     *     {@link TravelSpecificationSummaryViewStructure }
     *     
     */
    public TravelSpecificationSummaryViewStructure getTravelSpecificationSummaryView() {
        return travelSpecificationSummaryView;
    }

    /**
     * Legt den Wert der travelSpecificationSummaryView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSpecificationSummaryViewStructure }
     *     
     */
    public void setTravelSpecificationSummaryView(TravelSpecificationSummaryViewStructure value) {
        this.travelSpecificationSummaryView = value;
    }

    /**
     * Ruft den Wert der specificParameterAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpecificParameterAssignmentsRelStructure }
     *     
     */
    public SpecificParameterAssignmentsRelStructure getSpecificParameterAssignments() {
        return specificParameterAssignments;
    }

    /**
     * Legt den Wert der specificParameterAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificParameterAssignmentsRelStructure }
     *     
     */
    public void setSpecificParameterAssignments(SpecificParameterAssignmentsRelStructure value) {
        this.specificParameterAssignments = value;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public NoticeAssignmentsRelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignmentsRelStructure value) {
        this.noticeAssignments = value;
    }

}
