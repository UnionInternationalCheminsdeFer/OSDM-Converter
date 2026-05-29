//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for SALES OFFER PACKAGE ELEMENT.
 * 
 * <p>Java-Klasse f�r SalesOfferPackageElement_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SalesOfferPackageElement_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SalesOfferPackageElementGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOfferPackageElement_VersionStructure", propOrder = {
    "requiresValidation",
    "conditionSummary",
    "salesOfferPackageRef",
    "typeOfTravelDocumentRef",
    "fareProductRef",
    "validityParameterAssignments",
    "prices"
})
@XmlSeeAlso({
    SalesOfferPackageElement.class
})
public class SalesOfferPackageElementVersionStructure
    extends PriceableObjectVersionStructure
{

    @XmlElement(name = "RequiresValidation")
    protected Boolean requiresValidation;
    @XmlElement(name = "ConditionSummary")
    protected ConditionSummaryStructure conditionSummary;
    @XmlElement(name = "SalesOfferPackageRef")
    protected SalesOfferPackageRefStructure salesOfferPackageRef;
    @XmlElement(name = "TypeOfTravelDocumentRef")
    protected TypeOfTravelDocumentRefStructure typeOfTravelDocumentRef;
    @XmlElementRef(name = "FareProductRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FareProductRefStructure> fareProductRef;
    protected GenericParameterAssignmentsRelStructure validityParameterAssignments;
    protected SalesOfferPackagePricesRelStructure prices;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

    /**
     * Ruft den Wert der requiresValidation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresValidation() {
        return requiresValidation;
    }

    /**
     * Legt den Wert der requiresValidation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresValidation(Boolean value) {
        this.requiresValidation = value;
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
     * Ruft den Wert der salesOfferPackageRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackageRefStructure }
     *     
     */
    public SalesOfferPackageRefStructure getSalesOfferPackageRef() {
        return salesOfferPackageRef;
    }

    /**
     * Legt den Wert der salesOfferPackageRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackageRefStructure }
     *     
     */
    public void setSalesOfferPackageRef(SalesOfferPackageRefStructure value) {
        this.salesOfferPackageRef = value;
    }

    /**
     * Ruft den Wert der typeOfTravelDocumentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTravelDocumentRefStructure }
     *     
     */
    public TypeOfTravelDocumentRefStructure getTypeOfTravelDocumentRef() {
        return typeOfTravelDocumentRef;
    }

    /**
     * Legt den Wert der typeOfTravelDocumentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTravelDocumentRefStructure }
     *     
     */
    public void setTypeOfTravelDocumentRef(TypeOfTravelDocumentRefStructure value) {
        this.typeOfTravelDocumentRef = value;
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
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackagePricesRelStructure }
     *     
     */
    public SalesOfferPackagePricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackagePricesRelStructure }
     *     
     */
    public void setPrices(SalesOfferPackagePricesRelStructure value) {
        this.prices = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
