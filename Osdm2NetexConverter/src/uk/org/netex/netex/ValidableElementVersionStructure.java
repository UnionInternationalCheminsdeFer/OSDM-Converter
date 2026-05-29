//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for VALIDABLE ELEMENT.
 * 
 * <p>Java-Klasse f�r ValidableElement_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ValidableElement_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ValidableElementGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidableElement_VersionStructure", propOrder = {
    "fareStructureElements",
    "fareElementsInSequence",
    "discountRights",
    "amountOfPriceUnits",
    "thirdPartyProducts",
    "validityParameterAssignments",
    "prices"
})
@XmlSeeAlso({
    ValidableElement.class
})
public class ValidableElementVersionStructure
    extends PriceableObjectVersionStructure
{

    protected FareStructureElementRefsRelStructure fareStructureElements;
    protected FareElementInSequenceRefsRelStructure fareElementsInSequence;
    protected DiscountRightRefsRelStructure discountRights;
    protected AmountOfPriceUnitRefsRelStructure amountOfPriceUnits;
    protected ThirdPartyProductRefsRelStructure thirdPartyProducts;
    protected ValidityParameterAssignmentsRelStructure validityParameterAssignments;
    protected ValidableElementPricesRelStructure prices;

    /**
     * Ruft den Wert der fareStructureElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareStructureElementRefsRelStructure }
     *     
     */
    public FareStructureElementRefsRelStructure getFareStructureElements() {
        return fareStructureElements;
    }

    /**
     * Legt den Wert der fareStructureElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStructureElementRefsRelStructure }
     *     
     */
    public void setFareStructureElements(FareStructureElementRefsRelStructure value) {
        this.fareStructureElements = value;
    }

    /**
     * Ruft den Wert der fareElementsInSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareElementInSequenceRefsRelStructure }
     *     
     */
    public FareElementInSequenceRefsRelStructure getFareElementsInSequence() {
        return fareElementsInSequence;
    }

    /**
     * Legt den Wert der fareElementsInSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareElementInSequenceRefsRelStructure }
     *     
     */
    public void setFareElementsInSequence(FareElementInSequenceRefsRelStructure value) {
        this.fareElementsInSequence = value;
    }

    /**
     * Ruft den Wert der discountRights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DiscountRightRefsRelStructure }
     *     
     */
    public DiscountRightRefsRelStructure getDiscountRights() {
        return discountRights;
    }

    /**
     * Legt den Wert der discountRights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountRightRefsRelStructure }
     *     
     */
    public void setDiscountRights(DiscountRightRefsRelStructure value) {
        this.discountRights = value;
    }

    /**
     * Ruft den Wert der amountOfPriceUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AmountOfPriceUnitRefsRelStructure }
     *     
     */
    public AmountOfPriceUnitRefsRelStructure getAmountOfPriceUnits() {
        return amountOfPriceUnits;
    }

    /**
     * Legt den Wert der amountOfPriceUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOfPriceUnitRefsRelStructure }
     *     
     */
    public void setAmountOfPriceUnits(AmountOfPriceUnitRefsRelStructure value) {
        this.amountOfPriceUnits = value;
    }

    /**
     * Ruft den Wert der thirdPartyProducts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyProductRefsRelStructure }
     *     
     */
    public ThirdPartyProductRefsRelStructure getThirdPartyProducts() {
        return thirdPartyProducts;
    }

    /**
     * Legt den Wert der thirdPartyProducts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyProductRefsRelStructure }
     *     
     */
    public void setThirdPartyProducts(ThirdPartyProductRefsRelStructure value) {
        this.thirdPartyProducts = value;
    }

    /**
     * Ruft den Wert der validityParameterAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidityParameterAssignmentsRelStructure }
     *     
     */
    public ValidityParameterAssignmentsRelStructure getValidityParameterAssignments() {
        return validityParameterAssignments;
    }

    /**
     * Legt den Wert der validityParameterAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityParameterAssignmentsRelStructure }
     *     
     */
    public void setValidityParameterAssignments(ValidityParameterAssignmentsRelStructure value) {
        this.validityParameterAssignments = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidableElementPricesRelStructure }
     *     
     */
    public ValidableElementPricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidableElementPricesRelStructure }
     *     
     */
    public void setPrices(ValidableElementPricesRelStructure value) {
        this.prices = value;
    }

}
