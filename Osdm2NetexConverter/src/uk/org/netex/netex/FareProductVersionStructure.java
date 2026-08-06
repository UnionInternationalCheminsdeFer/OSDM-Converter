//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for FARE PRODUCT.
 * 
 * <p>Java-Klasse f�r FareProduct_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareProduct_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ServiceAccessRight_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FareProductGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareProduct_VersionStructure", propOrder = {
    "chargingMomentRef",
    "chargingMomentType",
    "typeOfFareProductRef",
    "typesOfFareProduct",
    "organisationRefDummy",
    "conditionSummary",
    "fareProductRef",
    "validityParameterAssignments",
    "genericParameterAssignment",
    "genericParameterAssignmentInContext",
    "validableElements",
    "accessRightsInProduct",
    "tariffs",
    "prices"
})
@XmlSeeAlso({
    FareProduct.class,
    PreassignedFareProductVersionStructure.class,
    ThirdPartyProductVersionStructure.class,
    AmountOfPriceUnitProductVersionStructure.class,
    SaleDiscountRightVersionStructure.class,
    UsageDiscountRightVersionStructure.class
})
public class FareProductVersionStructure
    extends ServiceAccessRightVersionStructure
{

    @XmlElement(name = "ChargingMomentRef")
    protected ChargingMomentRefStructure chargingMomentRef;
    @XmlElement(name = "ChargingMomentType")
    @XmlSchemaType(name = "normalizedString")
    protected ChargingMomentEnumeration chargingMomentType;
    @XmlElement(name = "TypeOfFareProductRef")
    protected TypeOfFareProductRefStructure typeOfFareProductRef;
    protected TypeOfFareProductRefsRelStructure typesOfFareProduct;
    @XmlElementRef(name = "OrganisationRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OrganisationRefStructure> organisationRefDummy;
    @XmlElement(name = "ConditionSummary")
    protected ConditionSummaryStructure conditionSummary;
    @XmlElementRef(name = "FareProductRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FareProductRefStructure> fareProductRef;
    protected GenericParameterAssignmentsRelStructure validityParameterAssignments;
    @XmlElement(name = "GenericParameterAssignment")
    protected GenericParameterAssignment genericParameterAssignment;
    @XmlElement(name = "GenericParameterAssignmentInContext")
    protected GenericParameterAssignmentInContext genericParameterAssignmentInContext;
    protected ValidableElementsRelStructure validableElements;
    protected AccessRightsInProductRelStructure accessRightsInProduct;
    protected TariffRefsRelStructure tariffs;
    protected FareProductPricesRelStructure prices;

    /**
     * Ruft den Wert der chargingMomentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ChargingMomentRefStructure }
     *     
     */
    public ChargingMomentRefStructure getChargingMomentRef() {
        return chargingMomentRef;
    }

    /**
     * Legt den Wert der chargingMomentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingMomentRefStructure }
     *     
     */
    public void setChargingMomentRef(ChargingMomentRefStructure value) {
        this.chargingMomentRef = value;
    }

    /**
     * Ruft den Wert der chargingMomentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ChargingMomentEnumeration }
     *     
     */
    public ChargingMomentEnumeration getChargingMomentType() {
        return chargingMomentType;
    }

    /**
     * Legt den Wert der chargingMomentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingMomentEnumeration }
     *     
     */
    public void setChargingMomentType(ChargingMomentEnumeration value) {
        this.chargingMomentType = value;
    }

    /**
     * Ruft den Wert der typeOfFareProductRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFareProductRefStructure }
     *     
     */
    public TypeOfFareProductRefStructure getTypeOfFareProductRef() {
        return typeOfFareProductRef;
    }

    /**
     * Legt den Wert der typeOfFareProductRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFareProductRefStructure }
     *     
     */
    public void setTypeOfFareProductRef(TypeOfFareProductRefStructure value) {
        this.typeOfFareProductRef = value;
    }

    /**
     * Ruft den Wert der typesOfFareProduct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFareProductRefsRelStructure }
     *     
     */
    public TypeOfFareProductRefsRelStructure getTypesOfFareProduct() {
        return typesOfFareProduct;
    }

    /**
     * Legt den Wert der typesOfFareProduct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFareProductRefsRelStructure }
     *     
     */
    public void setTypesOfFareProduct(TypeOfFareProductRefsRelStructure value) {
        this.typesOfFareProduct = value;
    }

    /**
     * ORGANISATION in charge of the FARE PRODUCT. +v1.2.2
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends OrganisationRefStructure> getOrganisationRefDummy() {
        return organisationRefDummy;
    }

    /**
     * Legt den Wert der organisationRefDummy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     *     
     */
    public void setOrganisationRefDummy(JAXBElement<? extends OrganisationRefStructure> value) {
        this.organisationRefDummy = value;
    }

    /**
     * Ruft den Wert der conditionSummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConditionSummaryStructure }
     *     
     */
    public ConditionSummaryStructure getConditionSummary() {
        return conditionSummary;
    }

    /**
     * Legt den Wert der conditionSummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionSummaryStructure }
     *     
     */
    public void setConditionSummary(ConditionSummaryStructure value) {
        this.conditionSummary = value;
    }

    /**
     * Ruft den Wert der fareProductRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ThirdPartyProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreassignedFareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SaleDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappedDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AmountOfPriceUnitProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SupplementProductRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends FareProductRefStructure> getFareProductRef() {
        return fareProductRef;
    }

    /**
     * Legt den Wert der fareProductRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ThirdPartyProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreassignedFareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SaleDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappedDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AmountOfPriceUnitProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SupplementProductRefStructure }{@code >}
     *     
     */
    public void setFareProductRef(JAXBElement<? extends FareProductRefStructure> value) {
        this.fareProductRef = value;
    }

    /**
     * Ruft den Wert der validityParameterAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenericParameterAssignmentsRelStructure }
     *     
     */
    public GenericParameterAssignmentsRelStructure getValidityParameterAssignments() {
        return validityParameterAssignments;
    }

    /**
     * Legt den Wert der validityParameterAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericParameterAssignmentsRelStructure }
     *     
     */
    public void setValidityParameterAssignments(GenericParameterAssignmentsRelStructure value) {
        this.validityParameterAssignments = value;
    }

    /**
     * Optimisation: A single instance of a A VALIDITY PARAMETER ASSIGNMENT specifying practical parameters during a TRAVEL GenericATION, within a given fare structure (e.g. the origin or destination zone in a zone-counting system).
     * 
     * @return
     *     possible object is
     *     {@link GenericParameterAssignment }
     *     
     */
    public GenericParameterAssignment getGenericParameterAssignment() {
        return genericParameterAssignment;
    }

    /**
     * Legt den Wert der genericParameterAssignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericParameterAssignment }
     *     
     */
    public void setGenericParameterAssignment(GenericParameterAssignment value) {
        this.genericParameterAssignment = value;
    }

    /**
     * Optimisation: Can be used without identity constraint A VALIDITY PARAMETER ASSIGNMENT specifying practical parameters during a TRAVEL GenericATION, within a given fare structure (e.g. the origin or destination zone in a zone-counting system).
     * 
     * @return
     *     possible object is
     *     {@link GenericParameterAssignmentInContext }
     *     
     */
    public GenericParameterAssignmentInContext getGenericParameterAssignmentInContext() {
        return genericParameterAssignmentInContext;
    }

    /**
     * Legt den Wert der genericParameterAssignmentInContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericParameterAssignmentInContext }
     *     
     */
    public void setGenericParameterAssignmentInContext(GenericParameterAssignmentInContext value) {
        this.genericParameterAssignmentInContext = value;
    }

    /**
     * Ruft den Wert der validableElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidableElementsRelStructure }
     *     
     */
    public ValidableElementsRelStructure getValidableElements() {
        return validableElements;
    }

    /**
     * Legt den Wert der validableElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidableElementsRelStructure }
     *     
     */
    public void setValidableElements(ValidableElementsRelStructure value) {
        this.validableElements = value;
    }

    /**
     * Ruft den Wert der accessRightsInProduct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessRightsInProductRelStructure }
     *     
     */
    public AccessRightsInProductRelStructure getAccessRightsInProduct() {
        return accessRightsInProduct;
    }

    /**
     * Legt den Wert der accessRightsInProduct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessRightsInProductRelStructure }
     *     
     */
    public void setAccessRightsInProduct(AccessRightsInProductRelStructure value) {
        this.accessRightsInProduct = value;
    }

    /**
     * Ruft den Wert der tariffs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffRefsRelStructure }
     *     
     */
    public TariffRefsRelStructure getTariffs() {
        return tariffs;
    }

    /**
     * Legt den Wert der tariffs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffRefsRelStructure }
     *     
     */
    public void setTariffs(TariffRefsRelStructure value) {
        this.tariffs = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareProductPricesRelStructure }
     *     
     */
    public FareProductPricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareProductPricesRelStructure }
     *     
     */
    public void setPrices(FareProductPricesRelStructure value) {
        this.prices = value;
    }

}
