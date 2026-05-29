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
 * Type for ACCESS RIGHT PARAMETER ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r AccessRightParameterAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AccessRightParameterAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}AccessRightParameterAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessRightParameterAssignment_VersionStructure", propOrder = {
    "isAllowed",
    "typeOfAccessRightAssignmentRef",
    "chargingBasis",
    "validableElementRef",
    "controllableElementRef",
    "fareProductRef",
    "tariffRef",
    "fareStructureElementRef",
    "fareElementInSequenceRef",
    "distanceMatrixElementRef",
    "dynamicDistanceMatrixElement",
    "distanceMatrixElementInverseRef",
    "distanceMatrixElementView",
    "salesOfferPackageRef",
    "groupOfDistanceMatrixElementsRef",
    "groupOfSalesOfferPackagesRef",
    "limitationGroupingType",
    "limitationSetSelectionType",
    "limitations",
    "validityParameterAssignmentType",
    "validityParameterGroupingType",
    "validityParameterSetSelectionType",
    "temporalValidityParameters",
    "validityParameters"
})
@XmlSeeAlso({
    AccessRightParameterAssignment.class,
    ValidityParameterAssignmentVersionStructure.class
})
public abstract class AccessRightParameterAssignmentVersionStructure
    extends AssignmentVersionStructure
{

    @XmlElement(name = "IsAllowed", defaultValue = "true")
    protected Boolean isAllowed;
    @XmlElement(name = "TypeOfAccessRightAssignmentRef")
    protected TypeOfAccessRightAssignmentRefStructure typeOfAccessRightAssignmentRef;
    @XmlElement(name = "ChargingBasis", defaultValue = "any")
    @XmlSchemaType(name = "normalizedString")
    protected ChargingBasisEnumeration chargingBasis;
    @XmlElement(name = "ValidableElementRef")
    protected ValidableElementRefStructure validableElementRef;
    @XmlElement(name = "ControllableElementRef")
    protected ControllableElementRefStructure controllableElementRef;
    @XmlElementRef(name = "FareProductRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FareProductRefStructure> fareProductRef;
    @XmlElementRef(name = "TariffRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TariffRefStructure> tariffRef;
    @XmlElement(name = "FareStructureElementRef")
    protected FareStructureElementRefStructure fareStructureElementRef;
    @XmlElementRef(name = "FareElementInSequenceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FareElementInSequenceRefStructure> fareElementInSequenceRef;
    @XmlElement(name = "DistanceMatrixElementRef")
    protected DistanceMatrixElementRef distanceMatrixElementRef;
    @XmlElement(name = "DynamicDistanceMatrixElement")
    protected DynamicDistanceMatrixElement dynamicDistanceMatrixElement;
    @XmlElement(name = "DistanceMatrixElementInverseRef")
    protected DistanceMatrixElementInverseRef distanceMatrixElementInverseRef;
    @XmlElement(name = "DistanceMatrixElementView")
    protected DistanceMatrixElementDerivedViewStructure distanceMatrixElementView;
    @XmlElement(name = "SalesOfferPackageRef")
    protected SalesOfferPackageRefStructure salesOfferPackageRef;
    @XmlElement(name = "GroupOfDistanceMatrixElementsRef")
    protected GroupOfDistanceMatrixElementsRefStructureElement groupOfDistanceMatrixElementsRef;
    @XmlElement(name = "GroupOfSalesOfferPackagesRef")
    protected GroupOfSalesOfferPackagesRefStructure groupOfSalesOfferPackagesRef;
    @XmlElement(name = "LimitationGroupingType", defaultValue = "AND")
    @XmlSchemaType(name = "NMTOKEN")
    protected LogicalOperationEnumeration limitationGroupingType;
    @XmlElement(name = "LimitationSetSelectionType")
    @XmlSchemaType(name = "NMTOKEN")
    protected SetOperatorEnumeration limitationSetSelectionType;
    protected UsageParametersRelStructure limitations;
    @XmlElement(name = "ValidityParameterAssignmentType", defaultValue = "EQ")
    @XmlSchemaType(name = "NMTOKEN")
    protected RelativeOperatorEnumeration validityParameterAssignmentType;
    @XmlElement(name = "ValidityParameterGroupingType", defaultValue = "AND")
    @XmlSchemaType(name = "NMTOKEN")
    protected LogicalOperationEnumeration validityParameterGroupingType;
    @XmlElement(name = "ValidityParameterSetSelectionType")
    @XmlSchemaType(name = "NMTOKEN")
    protected SetOperatorEnumeration validityParameterSetSelectionType;
    protected TemporalValidityParametersRelStructure temporalValidityParameters;
    protected ValidityParametersRelStructure validityParameters;

    /**
     * Ruft den Wert der isAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllowed() {
        return isAllowed;
    }

    /**
     * Legt den Wert der isAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllowed(Boolean value) {
        this.isAllowed = value;
    }

    /**
     * Ruft den Wert der typeOfAccessRightAssignmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAccessRightAssignmentRefStructure }
     *     
     */
    public TypeOfAccessRightAssignmentRefStructure getTypeOfAccessRightAssignmentRef() {
        return typeOfAccessRightAssignmentRef;
    }

    /**
     * Legt den Wert der typeOfAccessRightAssignmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAccessRightAssignmentRefStructure }
     *     
     */
    public void setTypeOfAccessRightAssignmentRef(TypeOfAccessRightAssignmentRefStructure value) {
        this.typeOfAccessRightAssignmentRef = value;
    }

    /**
     * Ruft den Wert der chargingBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ChargingBasisEnumeration }
     *     
     */
    public ChargingBasisEnumeration getChargingBasis() {
        return chargingBasis;
    }

    /**
     * Legt den Wert der chargingBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingBasisEnumeration }
     *     
     */
    public void setChargingBasis(ChargingBasisEnumeration value) {
        this.chargingBasis = value;
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
     * Ruft den Wert der controllableElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ControllableElementRefStructure }
     *     
     */
    public ControllableElementRefStructure getControllableElementRef() {
        return controllableElementRef;
    }

    /**
     * Legt den Wert der controllableElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ControllableElementRefStructure }
     *     
     */
    public void setControllableElementRef(ControllableElementRefStructure value) {
        this.controllableElementRef = value;
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
     * Ruft den Wert der tariffRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TariffRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingTariffRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TariffRefStructure> getTariffRef() {
        return tariffRef;
    }

    /**
     * Legt den Wert der tariffRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TariffRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingTariffRefStructure }{@code >}
     *     
     */
    public void setTariffRef(JAXBElement<? extends TariffRefStructure> value) {
        this.tariffRef = value;
    }

    /**
     * Ruft den Wert der fareStructureElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareStructureElementRefStructure }
     *     
     */
    public FareStructureElementRefStructure getFareStructureElementRef() {
        return fareStructureElementRef;
    }

    /**
     * Legt den Wert der fareStructureElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStructureElementRefStructure }
     *     
     */
    public void setFareStructureElementRef(FareStructureElementRefStructure value) {
        this.fareStructureElementRef = value;
    }

    /**
     * Ruft den Wert der fareElementInSequenceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareStructureElementInSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementInSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareElementInSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessRightInProductRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends FareElementInSequenceRefStructure> getFareElementInSequenceRef() {
        return fareElementInSequenceRef;
    }

    /**
     * Legt den Wert der fareElementInSequenceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareStructureElementInSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementInSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareElementInSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessRightInProductRefStructure }{@code >}
     *     
     */
    public void setFareElementInSequenceRef(JAXBElement<? extends FareElementInSequenceRefStructure> value) {
        this.fareElementInSequenceRef = value;
    }

    /**
     * Ruft den Wert der distanceMatrixElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistanceMatrixElementRef }
     *     
     */
    public DistanceMatrixElementRef getDistanceMatrixElementRef() {
        return distanceMatrixElementRef;
    }

    /**
     * Legt den Wert der distanceMatrixElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceMatrixElementRef }
     *     
     */
    public void setDistanceMatrixElementRef(DistanceMatrixElementRef value) {
        this.distanceMatrixElementRef = value;
    }

    /**
     * Ruft den Wert der dynamicDistanceMatrixElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DynamicDistanceMatrixElement }
     *     
     */
    public DynamicDistanceMatrixElement getDynamicDistanceMatrixElement() {
        return dynamicDistanceMatrixElement;
    }

    /**
     * Legt den Wert der dynamicDistanceMatrixElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicDistanceMatrixElement }
     *     
     */
    public void setDynamicDistanceMatrixElement(DynamicDistanceMatrixElement value) {
        this.dynamicDistanceMatrixElement = value;
    }

    /**
     * Ruft den Wert der distanceMatrixElementInverseRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistanceMatrixElementInverseRef }
     *     
     */
    public DistanceMatrixElementInverseRef getDistanceMatrixElementInverseRef() {
        return distanceMatrixElementInverseRef;
    }

    /**
     * Legt den Wert der distanceMatrixElementInverseRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceMatrixElementInverseRef }
     *     
     */
    public void setDistanceMatrixElementInverseRef(DistanceMatrixElementInverseRef value) {
        this.distanceMatrixElementInverseRef = value;
    }

    /**
     * Ruft den Wert der distanceMatrixElementView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistanceMatrixElementDerivedViewStructure }
     *     
     */
    public DistanceMatrixElementDerivedViewStructure getDistanceMatrixElementView() {
        return distanceMatrixElementView;
    }

    /**
     * Legt den Wert der distanceMatrixElementView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceMatrixElementDerivedViewStructure }
     *     
     */
    public void setDistanceMatrixElementView(DistanceMatrixElementDerivedViewStructure value) {
        this.distanceMatrixElementView = value;
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
     * Ruft den Wert der groupOfDistanceMatrixElementsRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfDistanceMatrixElementsRefStructureElement }
     *     
     */
    public GroupOfDistanceMatrixElementsRefStructureElement getGroupOfDistanceMatrixElementsRef() {
        return groupOfDistanceMatrixElementsRef;
    }

    /**
     * Legt den Wert der groupOfDistanceMatrixElementsRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfDistanceMatrixElementsRefStructureElement }
     *     
     */
    public void setGroupOfDistanceMatrixElementsRef(GroupOfDistanceMatrixElementsRefStructureElement value) {
        this.groupOfDistanceMatrixElementsRef = value;
    }

    /**
     * Ruft den Wert der groupOfSalesOfferPackagesRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfSalesOfferPackagesRefStructure }
     *     
     */
    public GroupOfSalesOfferPackagesRefStructure getGroupOfSalesOfferPackagesRef() {
        return groupOfSalesOfferPackagesRef;
    }

    /**
     * Legt den Wert der groupOfSalesOfferPackagesRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfSalesOfferPackagesRefStructure }
     *     
     */
    public void setGroupOfSalesOfferPackagesRef(GroupOfSalesOfferPackagesRefStructure value) {
        this.groupOfSalesOfferPackagesRef = value;
    }

    /**
     * Ruft den Wert der limitationGroupingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperationEnumeration }
     *     
     */
    public LogicalOperationEnumeration getLimitationGroupingType() {
        return limitationGroupingType;
    }

    /**
     * Legt den Wert der limitationGroupingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperationEnumeration }
     *     
     */
    public void setLimitationGroupingType(LogicalOperationEnumeration value) {
        this.limitationGroupingType = value;
    }

    /**
     * Ruft den Wert der limitationSetSelectionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SetOperatorEnumeration }
     *     
     */
    public SetOperatorEnumeration getLimitationSetSelectionType() {
        return limitationSetSelectionType;
    }

    /**
     * Legt den Wert der limitationSetSelectionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOperatorEnumeration }
     *     
     */
    public void setLimitationSetSelectionType(SetOperatorEnumeration value) {
        this.limitationSetSelectionType = value;
    }

    /**
     * Ruft den Wert der limitations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UsageParametersRelStructure }
     *     
     */
    public UsageParametersRelStructure getLimitations() {
        return limitations;
    }

    /**
     * Legt den Wert der limitations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageParametersRelStructure }
     *     
     */
    public void setLimitations(UsageParametersRelStructure value) {
        this.limitations = value;
    }

    /**
     * Ruft den Wert der validityParameterAssignmentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RelativeOperatorEnumeration }
     *     
     */
    public RelativeOperatorEnumeration getValidityParameterAssignmentType() {
        return validityParameterAssignmentType;
    }

    /**
     * Legt den Wert der validityParameterAssignmentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeOperatorEnumeration }
     *     
     */
    public void setValidityParameterAssignmentType(RelativeOperatorEnumeration value) {
        this.validityParameterAssignmentType = value;
    }

    /**
     * Ruft den Wert der validityParameterGroupingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperationEnumeration }
     *     
     */
    public LogicalOperationEnumeration getValidityParameterGroupingType() {
        return validityParameterGroupingType;
    }

    /**
     * Legt den Wert der validityParameterGroupingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperationEnumeration }
     *     
     */
    public void setValidityParameterGroupingType(LogicalOperationEnumeration value) {
        this.validityParameterGroupingType = value;
    }

    /**
     * Ruft den Wert der validityParameterSetSelectionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SetOperatorEnumeration }
     *     
     */
    public SetOperatorEnumeration getValidityParameterSetSelectionType() {
        return validityParameterSetSelectionType;
    }

    /**
     * Legt den Wert der validityParameterSetSelectionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOperatorEnumeration }
     *     
     */
    public void setValidityParameterSetSelectionType(SetOperatorEnumeration value) {
        this.validityParameterSetSelectionType = value;
    }

    /**
     * Ruft den Wert der temporalValidityParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TemporalValidityParametersRelStructure }
     *     
     */
    public TemporalValidityParametersRelStructure getTemporalValidityParameters() {
        return temporalValidityParameters;
    }

    /**
     * Legt den Wert der temporalValidityParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalValidityParametersRelStructure }
     *     
     */
    public void setTemporalValidityParameters(TemporalValidityParametersRelStructure value) {
        this.temporalValidityParameters = value;
    }

    /**
     * Ruft den Wert der validityParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidityParametersRelStructure }
     *     
     */
    public ValidityParametersRelStructure getValidityParameters() {
        return validityParameters;
    }

    /**
     * Legt den Wert der validityParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityParametersRelStructure }
     *     
     */
    public void setValidityParameters(ValidityParametersRelStructure value) {
        this.validityParameters = value;
    }

}
