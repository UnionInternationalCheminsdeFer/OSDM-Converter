//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for DISTANCE MATRIX ELEMENT.
 * 
 * <p>Java-Klasse f�r DistanceMatrixElement_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DistanceMatrixElement_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DistanceMatrixElementGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceMatrixElement_VersionStructure", propOrder = {
    "distance",
    "relativeRanking",
    "isDirect",
    "inverseAllowed",
    "startStopPointRef",
    "startStopPointView",
    "startTariffZoneRef",
    "startTariffZoneView",
    "startMeetingPointRef",
    "fromFareSectionRef",
    "fromFarePointInPatternRef",
    "endStopPointRef",
    "endStopPointView",
    "endTariffZoneRef",
    "endTariffZoneView",
    "endMeetingPointRef",
    "toFareSectionRef",
    "toFarePointInPatternRef",
    "seriesConstraints",
    "structureFactors",
    "tariffs",
    "fareTableRef",
    "prices"
})
@XmlSeeAlso({
    DistanceMatrixElement.class,
    DynamicDistanceMatrixElementVersionStructure.class
})
public class DistanceMatrixElementVersionStructure
    extends PriceableObjectVersionStructure
{

    @XmlElement(name = "Distance")
    protected BigDecimal distance;
    @XmlElement(name = "RelativeRanking")
    protected BigInteger relativeRanking;
    @XmlElement(name = "IsDirect")
    protected Boolean isDirect;
    @XmlElement(name = "InverseAllowed")
    protected Boolean inverseAllowed;
    @XmlElement(name = "StartStopPointRef")
    protected ScheduledStopPointRefStructure startStopPointRef;
    @XmlElement(name = "StartStopPointView")
    protected ScheduledStopPointDerivedViewStructure startStopPointView;
    @XmlElement(name = "StartTariffZoneRef")
    protected TariffZoneRefStructure startTariffZoneRef;
    @XmlElement(name = "StartTariffZoneView")
    protected ZoneDerivedViewStructure startTariffZoneView;
    @XmlElement(name = "StartMeetingPointRef")
    protected PointRefStructure startMeetingPointRef;
    @XmlElement(name = "FromFareSectionRef")
    protected FareSectionRefStructure fromFareSectionRef;
    @XmlElement(name = "FromFarePointInPatternRef")
    protected FarePointInPatternRefStructure fromFarePointInPatternRef;
    @XmlElement(name = "EndStopPointRef")
    protected ScheduledStopPointRefStructure endStopPointRef;
    @XmlElement(name = "EndStopPointView")
    protected ScheduledStopPointDerivedViewStructure endStopPointView;
    @XmlElement(name = "EndTariffZoneRef")
    protected TariffZoneRefStructure endTariffZoneRef;
    @XmlElement(name = "EndTariffZoneView")
    protected ZoneDerivedViewStructure endTariffZoneView;
    @XmlElement(name = "EndMeetingPointRef")
    protected PointRefStructure endMeetingPointRef;
    @XmlElement(name = "ToFareSectionRef")
    protected FareSectionRefStructure toFareSectionRef;
    @XmlElement(name = "ToFarePointInPatternRef")
    protected FarePointInPatternRefStructure toFarePointInPatternRef;
    protected SeriesConstraintsRelStructure seriesConstraints;
    protected GeographicalStructureFactorsRelStructure structureFactors;
    protected TariffRefsRelStructure tariffs;
    @XmlElementRef(name = "FareTableRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FareTableRefStructure> fareTableRef;
    protected DistanceMatrixElementPricesRelStructure prices;

    /**
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
    }

    /**
     * Ruft den Wert der relativeRanking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelativeRanking() {
        return relativeRanking;
    }

    /**
     * Legt den Wert der relativeRanking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelativeRanking(BigInteger value) {
        this.relativeRanking = value;
    }

    /**
     * Ruft den Wert der isDirect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDirect() {
        return isDirect;
    }

    /**
     * Legt den Wert der isDirect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDirect(Boolean value) {
        this.isDirect = value;
    }

    /**
     * Ruft den Wert der inverseAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInverseAllowed() {
        return inverseAllowed;
    }

    /**
     * Legt den Wert der inverseAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInverseAllowed(Boolean value) {
        this.inverseAllowed = value;
    }

    /**
     * Ruft den Wert der startStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getStartStopPointRef() {
        return startStopPointRef;
    }

    /**
     * Legt den Wert der startStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setStartStopPointRef(ScheduledStopPointRefStructure value) {
        this.startStopPointRef = value;
    }

    /**
     * Ruft den Wert der startStopPointView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointDerivedViewStructure }
     *     
     */
    public ScheduledStopPointDerivedViewStructure getStartStopPointView() {
        return startStopPointView;
    }

    /**
     * Legt den Wert der startStopPointView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointDerivedViewStructure }
     *     
     */
    public void setStartStopPointView(ScheduledStopPointDerivedViewStructure value) {
        this.startStopPointView = value;
    }

    /**
     * Ruft den Wert der startTariffZoneRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public TariffZoneRefStructure getStartTariffZoneRef() {
        return startTariffZoneRef;
    }

    /**
     * Legt den Wert der startTariffZoneRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public void setStartTariffZoneRef(TariffZoneRefStructure value) {
        this.startTariffZoneRef = value;
    }

    /**
     * Ruft den Wert der startTariffZoneView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZoneDerivedViewStructure }
     *     
     */
    public ZoneDerivedViewStructure getStartTariffZoneView() {
        return startTariffZoneView;
    }

    /**
     * Legt den Wert der startTariffZoneView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneDerivedViewStructure }
     *     
     */
    public void setStartTariffZoneView(ZoneDerivedViewStructure value) {
        this.startTariffZoneView = value;
    }

    /**
     * Ruft den Wert der startMeetingPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getStartMeetingPointRef() {
        return startMeetingPointRef;
    }

    /**
     * Legt den Wert der startMeetingPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setStartMeetingPointRef(PointRefStructure value) {
        this.startMeetingPointRef = value;
    }

    /**
     * Ruft den Wert der fromFareSectionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareSectionRefStructure }
     *     
     */
    public FareSectionRefStructure getFromFareSectionRef() {
        return fromFareSectionRef;
    }

    /**
     * Legt den Wert der fromFareSectionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareSectionRefStructure }
     *     
     */
    public void setFromFareSectionRef(FareSectionRefStructure value) {
        this.fromFareSectionRef = value;
    }

    /**
     * Ruft den Wert der fromFarePointInPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FarePointInPatternRefStructure }
     *     
     */
    public FarePointInPatternRefStructure getFromFarePointInPatternRef() {
        return fromFarePointInPatternRef;
    }

    /**
     * Legt den Wert der fromFarePointInPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePointInPatternRefStructure }
     *     
     */
    public void setFromFarePointInPatternRef(FarePointInPatternRefStructure value) {
        this.fromFarePointInPatternRef = value;
    }

    /**
     * Ruft den Wert der endStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getEndStopPointRef() {
        return endStopPointRef;
    }

    /**
     * Legt den Wert der endStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setEndStopPointRef(ScheduledStopPointRefStructure value) {
        this.endStopPointRef = value;
    }

    /**
     * Ruft den Wert der endStopPointView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointDerivedViewStructure }
     *     
     */
    public ScheduledStopPointDerivedViewStructure getEndStopPointView() {
        return endStopPointView;
    }

    /**
     * Legt den Wert der endStopPointView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointDerivedViewStructure }
     *     
     */
    public void setEndStopPointView(ScheduledStopPointDerivedViewStructure value) {
        this.endStopPointView = value;
    }

    /**
     * Ruft den Wert der endTariffZoneRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public TariffZoneRefStructure getEndTariffZoneRef() {
        return endTariffZoneRef;
    }

    /**
     * Legt den Wert der endTariffZoneRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public void setEndTariffZoneRef(TariffZoneRefStructure value) {
        this.endTariffZoneRef = value;
    }

    /**
     * Ruft den Wert der endTariffZoneView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZoneDerivedViewStructure }
     *     
     */
    public ZoneDerivedViewStructure getEndTariffZoneView() {
        return endTariffZoneView;
    }

    /**
     * Legt den Wert der endTariffZoneView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneDerivedViewStructure }
     *     
     */
    public void setEndTariffZoneView(ZoneDerivedViewStructure value) {
        this.endTariffZoneView = value;
    }

    /**
     * Ruft den Wert der endMeetingPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getEndMeetingPointRef() {
        return endMeetingPointRef;
    }

    /**
     * Legt den Wert der endMeetingPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setEndMeetingPointRef(PointRefStructure value) {
        this.endMeetingPointRef = value;
    }

    /**
     * Ruft den Wert der toFareSectionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareSectionRefStructure }
     *     
     */
    public FareSectionRefStructure getToFareSectionRef() {
        return toFareSectionRef;
    }

    /**
     * Legt den Wert der toFareSectionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareSectionRefStructure }
     *     
     */
    public void setToFareSectionRef(FareSectionRefStructure value) {
        this.toFareSectionRef = value;
    }

    /**
     * Ruft den Wert der toFarePointInPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FarePointInPatternRefStructure }
     *     
     */
    public FarePointInPatternRefStructure getToFarePointInPatternRef() {
        return toFarePointInPatternRef;
    }

    /**
     * Legt den Wert der toFarePointInPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePointInPatternRefStructure }
     *     
     */
    public void setToFarePointInPatternRef(FarePointInPatternRefStructure value) {
        this.toFarePointInPatternRef = value;
    }

    /**
     * Ruft den Wert der seriesConstraints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SeriesConstraintsRelStructure }
     *     
     */
    public SeriesConstraintsRelStructure getSeriesConstraints() {
        return seriesConstraints;
    }

    /**
     * Legt den Wert der seriesConstraints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesConstraintsRelStructure }
     *     
     */
    public void setSeriesConstraints(SeriesConstraintsRelStructure value) {
        this.seriesConstraints = value;
    }

    /**
     * Ruft den Wert der structureFactors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalStructureFactorsRelStructure }
     *     
     */
    public GeographicalStructureFactorsRelStructure getStructureFactors() {
        return structureFactors;
    }

    /**
     * Legt den Wert der structureFactors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalStructureFactorsRelStructure }
     *     
     */
    public void setStructureFactors(GeographicalStructureFactorsRelStructure value) {
        this.structureFactors = value;
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
     * Ruft den Wert der fareTableRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareTableRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardFareTableRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends FareTableRefStructure> getFareTableRef() {
        return fareTableRef;
    }

    /**
     * Legt den Wert der fareTableRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareTableRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardFareTableRefStructure }{@code >}
     *     
     */
    public void setFareTableRef(JAXBElement<? extends FareTableRefStructure> value) {
        this.fareTableRef = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistanceMatrixElementPricesRelStructure }
     *     
     */
    public DistanceMatrixElementPricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceMatrixElementPricesRelStructure }
     *     
     */
    public void setPrices(DistanceMatrixElementPricesRelStructure value) {
        this.prices = value;
    }

}
