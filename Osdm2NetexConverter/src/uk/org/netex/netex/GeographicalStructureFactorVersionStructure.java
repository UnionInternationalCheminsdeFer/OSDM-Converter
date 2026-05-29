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
 * Type for GEOGRAPHICAL STRUCTURE FACTOR.
 * 
 * <p>Java-Klasse f�r GeographicalStructureFactor_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeographicalStructureFactor_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FareStructureFactor_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GeographicalStructureFactorGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicalStructureFactor_VersionStructure", propOrder = {
    "tariffRef",
    "geographicalIntervalRef",
    "distanceMatrixElementRef",
    "geographicalUnitRef",
    "numberOfUnits",
    "amountFactor"
})
@XmlSeeAlso({
    GeographicalStructureFactor.class
})
public class GeographicalStructureFactorVersionStructure
    extends FareStructureFactorVersionStructure
{

    @XmlElementRef(name = "TariffRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TariffRefStructure> tariffRef;
    @XmlElement(name = "GeographicalIntervalRef")
    protected GeographicalIntervalRefStructure geographicalIntervalRef;
    @XmlElement(name = "DistanceMatrixElementRef")
    protected DistanceMatrixElementRef distanceMatrixElementRef;
    @XmlElement(name = "GeographicalUnitRef")
    protected GeographicalUnitRefStructure geographicalUnitRef;
    @XmlElement(name = "NumberOfUnits")
    protected BigInteger numberOfUnits;
    @XmlElement(name = "AmountFactor")
    protected BigDecimal amountFactor;

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
     * Ruft den Wert der amountFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountFactor() {
        return amountFactor;
    }

    /**
     * Legt den Wert der amountFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountFactor(BigDecimal value) {
        this.amountFactor = value;
    }

}
