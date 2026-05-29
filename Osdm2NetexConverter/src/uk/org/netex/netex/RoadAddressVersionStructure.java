//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

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
 * Type for Road ADDRESS.
 * 
 * <p>Java-Klasse f�r RoadAddress_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoadAddress_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Address_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RoadAddressGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadAddress_VersionStructure", propOrder = {
    "gisFeatureRef",
    "roadNumber",
    "roadName",
    "bearingCompass",
    "bearingDegrees",
    "oddNumberRange",
    "evenNumberRange"
})
@XmlSeeAlso({
    RoadAddress.class
})
public class RoadAddressVersionStructure
    extends AddressVersionStructure
{

    @XmlElement(name = "GisFeatureRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String gisFeatureRef;
    @XmlElement(name = "RoadNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String roadNumber;
    @XmlElement(name = "RoadName")
    protected MultilingualString roadName;
    @XmlElement(name = "BearingCompass")
    @XmlSchemaType(name = "string")
    protected CompassBearing16Enumeration bearingCompass;
    @XmlElement(name = "BearingDegrees")
    protected BigInteger bearingDegrees;
    @XmlElement(name = "OddNumberRange")
    protected RoadNumberRangeStructure oddNumberRange;
    @XmlElement(name = "EvenNumberRange")
    protected RoadNumberRangeStructure evenNumberRange;

    /**
     * Ruft den Wert der gisFeatureRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGisFeatureRef() {
        return gisFeatureRef;
    }

    /**
     * Legt den Wert der gisFeatureRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGisFeatureRef(String value) {
        this.gisFeatureRef = value;
    }

    /**
     * Ruft den Wert der roadNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Legt den Wert der roadNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNumber(String value) {
        this.roadNumber = value;
    }

    /**
     * Ruft den Wert der roadName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRoadName() {
        return roadName;
    }

    /**
     * Legt den Wert der roadName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRoadName(MultilingualString value) {
        this.roadName = value;
    }

    /**
     * Ruft den Wert der bearingCompass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompassBearing16Enumeration }
     *     
     */
    public CompassBearing16Enumeration getBearingCompass() {
        return bearingCompass;
    }

    /**
     * Legt den Wert der bearingCompass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompassBearing16Enumeration }
     *     
     */
    public void setBearingCompass(CompassBearing16Enumeration value) {
        this.bearingCompass = value;
    }

    /**
     * Ruft den Wert der bearingDegrees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBearingDegrees() {
        return bearingDegrees;
    }

    /**
     * Legt den Wert der bearingDegrees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBearingDegrees(BigInteger value) {
        this.bearingDegrees = value;
    }

    /**
     * Ruft den Wert der oddNumberRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoadNumberRangeStructure }
     *     
     */
    public RoadNumberRangeStructure getOddNumberRange() {
        return oddNumberRange;
    }

    /**
     * Legt den Wert der oddNumberRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadNumberRangeStructure }
     *     
     */
    public void setOddNumberRange(RoadNumberRangeStructure value) {
        this.oddNumberRange = value;
    }

    /**
     * Ruft den Wert der evenNumberRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoadNumberRangeStructure }
     *     
     */
    public RoadNumberRangeStructure getEvenNumberRange() {
        return evenNumberRange;
    }

    /**
     * Legt den Wert der evenNumberRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadNumberRangeStructure }
     *     
     */
    public void setEvenNumberRange(RoadNumberRangeStructure value) {
        this.evenNumberRange = value;
    }

}
