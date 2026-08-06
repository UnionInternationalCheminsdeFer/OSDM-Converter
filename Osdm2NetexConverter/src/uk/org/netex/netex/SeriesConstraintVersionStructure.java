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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for SERIES CONSTRAINT.
 * 
 * <p>Java-Klasse f�r SeriesConstraint_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SeriesConstraint_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SeriesConstraintGroup"/>
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
@XmlType(name = "SeriesConstraint_VersionStructure", propOrder = {
    "privateCode",
    "itinerary",
    "symbolMarkingUsualRoute",
    "seriesType",
    "routingType",
    "fareBasis",
    "firstClassDistance",
    "secondClassDistance",
    "discrete",
    "fromConnectionRef",
    "toConnectionRef",
    "farePointsInPattern",
    "zonesInSeries",
    "journeyPatterns",
    "prices",
    "replaces"
})
@XmlSeeAlso({
    SeriesConstraint.class
})
public class SeriesConstraintVersionStructure
    extends PriceableObjectVersionStructure
{

    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "Itinerary")
    protected MultilingualString itinerary;
    @XmlElement(name = "SymbolMarkingUsualRoute")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String symbolMarkingUsualRoute;
    @XmlElement(name = "SeriesType", defaultValue = "stationToStation")
    @XmlSchemaType(name = "normalizedString")
    protected SeriesTypeEnumeration seriesType;
    @XmlElement(name = "RoutingType", defaultValue = "both")
    @XmlSchemaType(name = "normalizedString")
    protected RoutingTypeEnumeration routingType;
    @XmlElement(name = "FareBasis", defaultValue = "route")
    @XmlSchemaType(name = "normalizedString")
    protected FareBasisEnumeration fareBasis;
    @XmlElement(name = "FirstClassDistance")
    protected BigDecimal firstClassDistance;
    @XmlElement(name = "SecondClassDistance")
    protected BigDecimal secondClassDistance;
    @XmlElement(name = "Discrete", defaultValue = "true")
    protected Boolean discrete;
    @XmlElement(name = "FromConnectionRef")
    protected ConnectionRefStructure fromConnectionRef;
    @XmlElement(name = "ToConnectionRef")
    protected ConnectionRefStructure toConnectionRef;
    protected List<FarePointsInPatternRelStructure> farePointsInPattern;
    protected List<ZonesInSeriesRelStructure> zonesInSeries;
    protected JourneyPatternRefsRelStructure journeyPatterns;
    protected List<SeriesConstraintPricesRelStructure> prices;
    protected List<SeriesConstraintRefsRelStructure> replaces;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

    /**
     * DEPRECATED - use privateCodes. -v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der itinerary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getItinerary() {
        return itinerary;
    }

    /**
     * Legt den Wert der itinerary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setItinerary(MultilingualString value) {
        this.itinerary = value;
    }

    /**
     * Ruft den Wert der symbolMarkingUsualRoute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolMarkingUsualRoute() {
        return symbolMarkingUsualRoute;
    }

    /**
     * Legt den Wert der symbolMarkingUsualRoute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolMarkingUsualRoute(String value) {
        this.symbolMarkingUsualRoute = value;
    }

    /**
     * Ruft den Wert der seriesType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SeriesTypeEnumeration }
     *     
     */
    public SeriesTypeEnumeration getSeriesType() {
        return seriesType;
    }

    /**
     * Legt den Wert der seriesType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesTypeEnumeration }
     *     
     */
    public void setSeriesType(SeriesTypeEnumeration value) {
        this.seriesType = value;
    }

    /**
     * Ruft den Wert der routingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutingTypeEnumeration }
     *     
     */
    public RoutingTypeEnumeration getRoutingType() {
        return routingType;
    }

    /**
     * Legt den Wert der routingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingTypeEnumeration }
     *     
     */
    public void setRoutingType(RoutingTypeEnumeration value) {
        this.routingType = value;
    }

    /**
     * Ruft den Wert der fareBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareBasisEnumeration }
     *     
     */
    public FareBasisEnumeration getFareBasis() {
        return fareBasis;
    }

    /**
     * Legt den Wert der fareBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareBasisEnumeration }
     *     
     */
    public void setFareBasis(FareBasisEnumeration value) {
        this.fareBasis = value;
    }

    /**
     * Ruft den Wert der firstClassDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstClassDistance() {
        return firstClassDistance;
    }

    /**
     * Legt den Wert der firstClassDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstClassDistance(BigDecimal value) {
        this.firstClassDistance = value;
    }

    /**
     * Ruft den Wert der secondClassDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecondClassDistance() {
        return secondClassDistance;
    }

    /**
     * Legt den Wert der secondClassDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecondClassDistance(BigDecimal value) {
        this.secondClassDistance = value;
    }

    /**
     * Ruft den Wert der discrete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscrete() {
        return discrete;
    }

    /**
     * Legt den Wert der discrete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscrete(Boolean value) {
        this.discrete = value;
    }

    /**
     * Ruft den Wert der fromConnectionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionRefStructure }
     *     
     */
    public ConnectionRefStructure getFromConnectionRef() {
        return fromConnectionRef;
    }

    /**
     * Legt den Wert der fromConnectionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionRefStructure }
     *     
     */
    public void setFromConnectionRef(ConnectionRefStructure value) {
        this.fromConnectionRef = value;
    }

    /**
     * Ruft den Wert der toConnectionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionRefStructure }
     *     
     */
    public ConnectionRefStructure getToConnectionRef() {
        return toConnectionRef;
    }

    /**
     * Legt den Wert der toConnectionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionRefStructure }
     *     
     */
    public void setToConnectionRef(ConnectionRefStructure value) {
        this.toConnectionRef = value;
    }

    /**
     * Gets the value of the farePointsInPattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farePointsInPattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFarePointsInPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePointsInPatternRelStructure }
     * 
     * 
     */
    public List<FarePointsInPatternRelStructure> getFarePointsInPattern() {
        if (farePointsInPattern == null) {
            farePointsInPattern = new ArrayList<FarePointsInPatternRelStructure>();
        }
        return this.farePointsInPattern;
    }

    /**
     * Gets the value of the zonesInSeries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zonesInSeries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZonesInSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZonesInSeriesRelStructure }
     * 
     * 
     */
    public List<ZonesInSeriesRelStructure> getZonesInSeries() {
        if (zonesInSeries == null) {
            zonesInSeries = new ArrayList<ZonesInSeriesRelStructure>();
        }
        return this.zonesInSeries;
    }

    /**
     * Ruft den Wert der journeyPatterns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternRefsRelStructure }
     *     
     */
    public JourneyPatternRefsRelStructure getJourneyPatterns() {
        return journeyPatterns;
    }

    /**
     * Legt den Wert der journeyPatterns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternRefsRelStructure }
     *     
     */
    public void setJourneyPatterns(JourneyPatternRefsRelStructure value) {
        this.journeyPatterns = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeriesConstraintPricesRelStructure }
     * 
     * 
     */
    public List<SeriesConstraintPricesRelStructure> getPrices() {
        if (prices == null) {
            prices = new ArrayList<SeriesConstraintPricesRelStructure>();
        }
        return this.prices;
    }

    /**
     * Gets the value of the replaces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replaces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeriesConstraintRefsRelStructure }
     * 
     * 
     */
    public List<SeriesConstraintRefsRelStructure> getReplaces() {
        if (replaces == null) {
            replaces = new ArrayList<SeriesConstraintRefsRelStructure>();
        }
        return this.replaces;
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
