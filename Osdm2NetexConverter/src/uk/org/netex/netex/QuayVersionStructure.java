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
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for QUAY.
 * 
 * <p>Java-Klasse f�r Quay_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Quay_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}StopPlaceSpace_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}QuayGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quay_VersionStructure", propOrder = {
    "publicCode",
    "plateCode",
    "shortCode",
    "destinations",
    "compassBearing",
    "compassOctant",
    "quayType",
    "platformHeight",
    "edgeToTrackCenterDistance",
    "parentQuayRef",
    "boardingPositions"
})
@XmlSeeAlso({
    Quay.class,
    TaxiStandVersionStructure.class
})
public class QuayVersionStructure
    extends StopPlaceSpaceVersionStructure
{

    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    @XmlElement(name = "PlateCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String plateCode;
    @XmlElement(name = "ShortCode")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger shortCode;
    protected DestinationDisplayViewsRelStructure destinations;
    @XmlElement(name = "CompassBearing")
    protected Float compassBearing;
    @XmlElement(name = "CompassOctant")
    @XmlSchemaType(name = "string")
    protected CompassBearing8Enumeration compassOctant;
    @XmlElement(name = "QuayType")
    @XmlSchemaType(name = "string")
    protected QuayTypeEnumeration quayType;
    @XmlElement(name = "PlatformHeight")
    protected BigDecimal platformHeight;
    @XmlElement(name = "EdgeToTrackCenterDistance")
    protected BigDecimal edgeToTrackCenterDistance;
    @XmlElement(name = "ParentQuayRef")
    protected QuayRefStructure parentQuayRef;
    protected BoardingPositionsRelStructure boardingPositions;

    /**
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicCodeStructure }
     *     
     */
    public PublicCodeStructure getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCodeStructure }
     *     
     */
    public void setPublicCode(PublicCodeStructure value) {
        this.publicCode = value;
    }

    /**
     * Ruft den Wert der plateCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateCode() {
        return plateCode;
    }

    /**
     * Legt den Wert der plateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateCode(String value) {
        this.plateCode = value;
    }

    /**
     * Ruft den Wert der shortCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShortCode() {
        return shortCode;
    }

    /**
     * Legt den Wert der shortCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShortCode(BigInteger value) {
        this.shortCode = value;
    }

    /**
     * Ruft den Wert der destinations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationDisplayViewsRelStructure }
     *     
     */
    public DestinationDisplayViewsRelStructure getDestinations() {
        return destinations;
    }

    /**
     * Legt den Wert der destinations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationDisplayViewsRelStructure }
     *     
     */
    public void setDestinations(DestinationDisplayViewsRelStructure value) {
        this.destinations = value;
    }

    /**
     * Ruft den Wert der compassBearing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCompassBearing() {
        return compassBearing;
    }

    /**
     * Legt den Wert der compassBearing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCompassBearing(Float value) {
        this.compassBearing = value;
    }

    /**
     * Ruft den Wert der compassOctant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompassBearing8Enumeration }
     *     
     */
    public CompassBearing8Enumeration getCompassOctant() {
        return compassOctant;
    }

    /**
     * Legt den Wert der compassOctant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompassBearing8Enumeration }
     *     
     */
    public void setCompassOctant(CompassBearing8Enumeration value) {
        this.compassOctant = value;
    }

    /**
     * Ruft den Wert der quayType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QuayTypeEnumeration }
     *     
     */
    public QuayTypeEnumeration getQuayType() {
        return quayType;
    }

    /**
     * Legt den Wert der quayType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QuayTypeEnumeration }
     *     
     */
    public void setQuayType(QuayTypeEnumeration value) {
        this.quayType = value;
    }

    /**
     * Ruft den Wert der platformHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlatformHeight() {
        return platformHeight;
    }

    /**
     * Legt den Wert der platformHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlatformHeight(BigDecimal value) {
        this.platformHeight = value;
    }

    /**
     * Ruft den Wert der edgeToTrackCenterDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEdgeToTrackCenterDistance() {
        return edgeToTrackCenterDistance;
    }

    /**
     * Legt den Wert der edgeToTrackCenterDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEdgeToTrackCenterDistance(BigDecimal value) {
        this.edgeToTrackCenterDistance = value;
    }

    /**
     * Ruft den Wert der parentQuayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QuayRefStructure }
     *     
     */
    public QuayRefStructure getParentQuayRef() {
        return parentQuayRef;
    }

    /**
     * Legt den Wert der parentQuayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QuayRefStructure }
     *     
     */
    public void setParentQuayRef(QuayRefStructure value) {
        this.parentQuayRef = value;
    }

    /**
     * Ruft den Wert der boardingPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPositionsRelStructure }
     *     
     */
    public BoardingPositionsRelStructure getBoardingPositions() {
        return boardingPositions;
    }

    /**
     * Legt den Wert der boardingPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPositionsRelStructure }
     *     
     */
    public void setBoardingPositions(BoardingPositionsRelStructure value) {
        this.boardingPositions = value;
    }

}
