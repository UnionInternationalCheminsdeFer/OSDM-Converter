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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for FARE STRUCTURE ELEMENT.
 * 
 * <p>Java-Klasse f�r FareStructureElement_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareStructureElement_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FareStructureElementGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nameOfClassOfUnit" type="{http://www.netex.org.uk/netex}NameOfClass" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareStructureElement_VersionStructure", propOrder = {
    "tariffBasis",
    "typeOfFareStructureElementRef",
    "geographicalIntervalRef",
    "geographicalIntervals",
    "geographicalStructureFactors",
    "timeIntervalRef",
    "timeIntervals",
    "timeStructureFactors",
    "qualityStructureFactorRef",
    "qualityStructureFactors",
    "distanceMatrixElementRef",
    "distanceMatrixElements",
    "groupOfDistanceMatrixElementsRef",
    "groupOfDistanceMatrixElements",
    "fareStructureElementsInSequence",
    "validityParameterAssignments",
    "genericParameterAssignment",
    "genericParameterAssignmentInContext",
    "prices"
})
@XmlSeeAlso({
    FareStructureElement.class
})
public class FareStructureElementVersionStructure
    extends PriceableObjectVersionStructure
{

    @XmlElement(name = "TariffBasis")
    @XmlSchemaType(name = "normalizedString")
    protected TariffBasisEnumeration tariffBasis;
    @XmlElement(name = "TypeOfFareStructureElementRef")
    protected TypeOfFareStructureElementRefStructure typeOfFareStructureElementRef;
    @XmlElement(name = "GeographicalIntervalRef")
    protected GeographicalIntervalRefStructure geographicalIntervalRef;
    protected GeographicalIntervalsRelStructure geographicalIntervals;
    protected GeographicalStructureFactorsRelStructure geographicalStructureFactors;
    @XmlElement(name = "TimeIntervalRef")
    protected TimeIntervalRefStructure timeIntervalRef;
    protected TimeIntervalsRelStructure timeIntervals;
    protected TimeStructureFactorsRelStructure timeStructureFactors;
    @XmlElementRef(name = "QualityStructureFactorRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends QualityStructureFactorRefStructure> qualityStructureFactorRef;
    protected QualityStructureFactorsRelStructure qualityStructureFactors;
    @XmlElement(name = "DistanceMatrixElementRef")
    protected DistanceMatrixElementRef distanceMatrixElementRef;
    protected DistanceMatrixElementsRelStructure distanceMatrixElements;
    @XmlElement(name = "GroupOfDistanceMatrixElementsRef")
    protected GroupOfDistanceMatrixElementsRefStructureElement groupOfDistanceMatrixElementsRef;
    @XmlElement(name = "GroupOfDistanceMatrixElements")
    protected GroupOfDistanceMatrixElements groupOfDistanceMatrixElements;
    protected FareStructureElementsInSequenceRelStructure fareStructureElementsInSequence;
    protected GenericParameterAssignmentsRelStructure validityParameterAssignments;
    @XmlElement(name = "GenericParameterAssignment")
    protected GenericParameterAssignment genericParameterAssignment;
    @XmlElement(name = "GenericParameterAssignmentInContext")
    protected GenericParameterAssignmentInContext genericParameterAssignmentInContext;
    protected FareStructureElementPricesRelStructure prices;
    @XmlAttribute(name = "nameOfClassOfUnit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameOfClassOfUnit;

    /**
     * Ruft den Wert der tariffBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffBasisEnumeration }
     *     
     */
    public TariffBasisEnumeration getTariffBasis() {
        return tariffBasis;
    }

    /**
     * Legt den Wert der tariffBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffBasisEnumeration }
     *     
     */
    public void setTariffBasis(TariffBasisEnumeration value) {
        this.tariffBasis = value;
    }

    /**
     * Ruft den Wert der typeOfFareStructureElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFareStructureElementRefStructure }
     *     
     */
    public TypeOfFareStructureElementRefStructure getTypeOfFareStructureElementRef() {
        return typeOfFareStructureElementRef;
    }

    /**
     * Legt den Wert der typeOfFareStructureElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFareStructureElementRefStructure }
     *     
     */
    public void setTypeOfFareStructureElementRef(TypeOfFareStructureElementRefStructure value) {
        this.typeOfFareStructureElementRef = value;
    }

    /**
     * Ruft den Wert der geographicalIntervalRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalIntervalRefStructure }
     *     
     */
    public GeographicalIntervalRefStructure getGeographicalIntervalRef() {
        return geographicalIntervalRef;
    }

    /**
     * Legt den Wert der geographicalIntervalRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalIntervalRefStructure }
     *     
     */
    public void setGeographicalIntervalRef(GeographicalIntervalRefStructure value) {
        this.geographicalIntervalRef = value;
    }

    /**
     * Ruft den Wert der geographicalIntervals-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalIntervalsRelStructure }
     *     
     */
    public GeographicalIntervalsRelStructure getGeographicalIntervals() {
        return geographicalIntervals;
    }

    /**
     * Legt den Wert der geographicalIntervals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalIntervalsRelStructure }
     *     
     */
    public void setGeographicalIntervals(GeographicalIntervalsRelStructure value) {
        this.geographicalIntervals = value;
    }

    /**
     * Ruft den Wert der geographicalStructureFactors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalStructureFactorsRelStructure }
     *     
     */
    public GeographicalStructureFactorsRelStructure getGeographicalStructureFactors() {
        return geographicalStructureFactors;
    }

    /**
     * Legt den Wert der geographicalStructureFactors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalStructureFactorsRelStructure }
     *     
     */
    public void setGeographicalStructureFactors(GeographicalStructureFactorsRelStructure value) {
        this.geographicalStructureFactors = value;
    }

    /**
     * Ruft den Wert der timeIntervalRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public TimeIntervalRefStructure getTimeIntervalRef() {
        return timeIntervalRef;
    }

    /**
     * Legt den Wert der timeIntervalRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public void setTimeIntervalRef(TimeIntervalRefStructure value) {
        this.timeIntervalRef = value;
    }

    /**
     * Ruft den Wert der timeIntervals-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalsRelStructure }
     *     
     */
    public TimeIntervalsRelStructure getTimeIntervals() {
        return timeIntervals;
    }

    /**
     * Legt den Wert der timeIntervals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalsRelStructure }
     *     
     */
    public void setTimeIntervals(TimeIntervalsRelStructure value) {
        this.timeIntervals = value;
    }

    /**
     * Ruft den Wert der timeStructureFactors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeStructureFactorsRelStructure }
     *     
     */
    public TimeStructureFactorsRelStructure getTimeStructureFactors() {
        return timeStructureFactors;
    }

    /**
     * Legt den Wert der timeStructureFactors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeStructureFactorsRelStructure }
     *     
     */
    public void setTimeStructureFactors(TimeStructureFactorsRelStructure value) {
        this.timeStructureFactors = value;
    }

    /**
     * Ruft den Wert der qualityStructureFactorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareDemandFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareQuotaFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends QualityStructureFactorRefStructure> getQualityStructureFactorRef() {
        return qualityStructureFactorRef;
    }

    /**
     * Legt den Wert der qualityStructureFactorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareDemandFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareQuotaFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorRefStructure }{@code >}
     *     
     */
    public void setQualityStructureFactorRef(JAXBElement<? extends QualityStructureFactorRefStructure> value) {
        this.qualityStructureFactorRef = value;
    }

    /**
     * Ruft den Wert der qualityStructureFactors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QualityStructureFactorsRelStructure }
     *     
     */
    public QualityStructureFactorsRelStructure getQualityStructureFactors() {
        return qualityStructureFactors;
    }

    /**
     * Legt den Wert der qualityStructureFactors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityStructureFactorsRelStructure }
     *     
     */
    public void setQualityStructureFactors(QualityStructureFactorsRelStructure value) {
        this.qualityStructureFactors = value;
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
     * Ruft den Wert der distanceMatrixElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistanceMatrixElementsRelStructure }
     *     
     */
    public DistanceMatrixElementsRelStructure getDistanceMatrixElements() {
        return distanceMatrixElements;
    }

    /**
     * Legt den Wert der distanceMatrixElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceMatrixElementsRelStructure }
     *     
     */
    public void setDistanceMatrixElements(DistanceMatrixElementsRelStructure value) {
        this.distanceMatrixElements = value;
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
     * Ruft den Wert der groupOfDistanceMatrixElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfDistanceMatrixElements }
     *     
     */
    public GroupOfDistanceMatrixElements getGroupOfDistanceMatrixElements() {
        return groupOfDistanceMatrixElements;
    }

    /**
     * Legt den Wert der groupOfDistanceMatrixElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfDistanceMatrixElements }
     *     
     */
    public void setGroupOfDistanceMatrixElements(GroupOfDistanceMatrixElements value) {
        this.groupOfDistanceMatrixElements = value;
    }

    /**
     * Ruft den Wert der fareStructureElementsInSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareStructureElementsInSequenceRelStructure }
     *     
     */
    public FareStructureElementsInSequenceRelStructure getFareStructureElementsInSequence() {
        return fareStructureElementsInSequence;
    }

    /**
     * Legt den Wert der fareStructureElementsInSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStructureElementsInSequenceRelStructure }
     *     
     */
    public void setFareStructureElementsInSequence(FareStructureElementsInSequenceRelStructure value) {
        this.fareStructureElementsInSequence = value;
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
     *     {@link FareStructureElementPricesRelStructure }
     *     
     */
    public FareStructureElementPricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStructureElementPricesRelStructure }
     *     
     */
    public void setPrices(FareStructureElementPricesRelStructure value) {
        this.prices = value;
    }

    /**
     * Ruft den Wert der nameOfClassOfUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfClassOfUnit() {
        return nameOfClassOfUnit;
    }

    /**
     * Legt den Wert der nameOfClassOfUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfClassOfUnit(String value) {
        this.nameOfClassOfUnit = value;
    }

}
