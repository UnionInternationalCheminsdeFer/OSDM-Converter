//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for CAPPING RULE.
 * 
 * <p>Java-Klasse f�r CappingRule_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CappingRule_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CappingRuleGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CappingRule_VersionedChildStructure", propOrder = {
    "maximumDistance",
    "cappingPeriod",
    "cappedDiscountRightRef",
    "preassignedFareProductRef",
    "validableElementRef",
    "validityParameterAssignments",
    "genericParameterAssignment",
    "genericParameterAssignmentInContext",
    "prices"
})
@XmlSeeAlso({
    CappingRule.class
})
public class CappingRuleVersionedChildStructure
    extends PriceableObjectVersionStructure
{

    @XmlElement(name = "MaximumDistance")
    protected BigDecimal maximumDistance;
    @XmlElement(name = "CappingPeriod", defaultValue = "day")
    @XmlSchemaType(name = "normalizedString")
    protected CappingPeriodEnumeration cappingPeriod;
    @XmlElement(name = "CappedDiscountRightRef")
    protected List<CappedDiscountRightRefStructure> cappedDiscountRightRef;
    @XmlElementRef(name = "PreassignedFareProductRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends PreassignedFareProductRefStructure>> preassignedFareProductRef;
    @XmlElement(name = "ValidableElementRef")
    protected ValidableElementRefStructure validableElementRef;
    protected GenericParameterAssignmentsRelStructure validityParameterAssignments;
    @XmlElement(name = "GenericParameterAssignment")
    protected GenericParameterAssignment genericParameterAssignment;
    @XmlElement(name = "GenericParameterAssignmentInContext")
    protected GenericParameterAssignmentInContext genericParameterAssignmentInContext;
    protected CappingRulePricesRelStructure prices;

    /**
     * Ruft den Wert der maximumDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumDistance() {
        return maximumDistance;
    }

    /**
     * Legt den Wert der maximumDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumDistance(BigDecimal value) {
        this.maximumDistance = value;
    }

    /**
     * Ruft den Wert der cappingPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CappingPeriodEnumeration }
     *     
     */
    public CappingPeriodEnumeration getCappingPeriod() {
        return cappingPeriod;
    }

    /**
     * Legt den Wert der cappingPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CappingPeriodEnumeration }
     *     
     */
    public void setCappingPeriod(CappingPeriodEnumeration value) {
        this.cappingPeriod = value;
    }

    /**
     * Gets the value of the cappedDiscountRightRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cappedDiscountRightRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCappedDiscountRightRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CappedDiscountRightRefStructure }
     * 
     * 
     */
    public List<CappedDiscountRightRefStructure> getCappedDiscountRightRef() {
        if (cappedDiscountRightRef == null) {
            cappedDiscountRightRef = new ArrayList<CappedDiscountRightRefStructure>();
        }
        return this.cappedDiscountRightRef;
    }

    /**
     * Gets the value of the preassignedFareProductRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preassignedFareProductRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreassignedFareProductRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PreassignedFareProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SupplementProductRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends PreassignedFareProductRefStructure>> getPreassignedFareProductRef() {
        if (preassignedFareProductRef == null) {
            preassignedFareProductRef = new ArrayList<JAXBElement<? extends PreassignedFareProductRefStructure>>();
        }
        return this.preassignedFareProductRef;
    }

    /**
     * Ruft den Wert der validableElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidableElementRefStructure }
     *     
     */
    public ValidableElementRefStructure getValidableElementRef() {
        return validableElementRef;
    }

    /**
     * Legt den Wert der validableElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidableElementRefStructure }
     *     
     */
    public void setValidableElementRef(ValidableElementRefStructure value) {
        this.validableElementRef = value;
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
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CappingRulePricesRelStructure }
     *     
     */
    public CappingRulePricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CappingRulePricesRelStructure }
     *     
     */
    public void setPrices(CappingRulePricesRelStructure value) {
        this.prices = value;
    }

}
