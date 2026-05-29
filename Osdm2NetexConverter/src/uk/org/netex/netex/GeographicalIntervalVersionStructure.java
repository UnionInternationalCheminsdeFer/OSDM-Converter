//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for GEOGRAPHICAL INTERVAL.
 * 
 * <p>Java-Klasse f�r GeographicalInterval_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeographicalInterval_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FareInterval_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GeographicalIntervalGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicalInterval_VersionStructure", propOrder = {
    "startGeographicalValue",
    "endGeographicalValue",
    "numberOfUnits",
    "intervalType",
    "geographicalUnitRef",
    "prices"
})
@XmlSeeAlso({
    GeographicalInterval.class
})
public class GeographicalIntervalVersionStructure
    extends FareIntervalVersionStructure
{

    @XmlElement(name = "StartGeographicalValue")
    protected BigDecimal startGeographicalValue;
    @XmlElement(name = "EndGeographicalValue")
    protected BigDecimal endGeographicalValue;
    @XmlElement(name = "NumberOfUnits")
    protected BigInteger numberOfUnits;
    @XmlElement(name = "IntervalType")
    @XmlSchemaType(name = "normalizedString")
    protected IntervalTypeEnumeration intervalType;
    @XmlElement(name = "GeographicalUnitRef")
    protected GeographicalUnitRefStructure geographicalUnitRef;
    protected GeographicalIntervalPricesRelStructure prices;

    /**
     * Ruft den Wert der startGeographicalValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartGeographicalValue() {
        return startGeographicalValue;
    }

    /**
     * Legt den Wert der startGeographicalValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartGeographicalValue(BigDecimal value) {
        this.startGeographicalValue = value;
    }

    /**
     * Ruft den Wert der endGeographicalValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndGeographicalValue() {
        return endGeographicalValue;
    }

    /**
     * Legt den Wert der endGeographicalValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndGeographicalValue(BigDecimal value) {
        this.endGeographicalValue = value;
    }

    /**
     * Ruft den Wert der numberOfUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Legt den Wert der numberOfUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUnits(BigInteger value) {
        this.numberOfUnits = value;
    }

    /**
     * Ruft den Wert der intervalType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IntervalTypeEnumeration }
     *     
     */
    public IntervalTypeEnumeration getIntervalType() {
        return intervalType;
    }

    /**
     * Legt den Wert der intervalType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalTypeEnumeration }
     *     
     */
    public void setIntervalType(IntervalTypeEnumeration value) {
        this.intervalType = value;
    }

    /**
     * Ruft den Wert der geographicalUnitRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalUnitRefStructure }
     *     
     */
    public GeographicalUnitRefStructure getGeographicalUnitRef() {
        return geographicalUnitRef;
    }

    /**
     * Legt den Wert der geographicalUnitRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalUnitRefStructure }
     *     
     */
    public void setGeographicalUnitRef(GeographicalUnitRefStructure value) {
        this.geographicalUnitRef = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalIntervalPricesRelStructure }
     *     
     */
    public GeographicalIntervalPricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalIntervalPricesRelStructure }
     *     
     */
    public void setPrices(GeographicalIntervalPricesRelStructure value) {
        this.prices = value;
    }

}
