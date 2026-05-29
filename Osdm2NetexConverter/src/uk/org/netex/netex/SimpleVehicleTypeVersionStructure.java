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
 * Type for a PERSONAL TRANSPORT TYPE.
 * 
 * <p>Java-Klasse f�r SimpleVehicleType_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SimpleVehicleType_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TransportType_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SimpleVehicleTypeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleVehicleType_VersionStructure", propOrder = {
    "length",
    "width",
    "height",
    "weight",
    "firstAxleHeight",
    "licenceRequirements",
    "vehicleCategory",
    "numberOfWheels",
    "minimumAge",
    "portable",
    "acceptedDriverPermits"
})
@XmlSeeAlso({
    SimpleVehicleType.class
})
public class SimpleVehicleTypeVersionStructure
    extends TransportTypeVersionStructure
{

    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "Width")
    protected BigDecimal width;
    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElement(name = "Weight")
    protected BigDecimal weight;
    @XmlElement(name = "FirstAxleHeight")
    protected BigDecimal firstAxleHeight;
    @XmlElement(name = "LicenceRequirements")
    @XmlSchemaType(name = "normalizedString")
    protected LicenceRequirementsEnumeration licenceRequirements;
    @XmlElement(name = "VehicleCategory")
    protected String vehicleCategory;
    @XmlElement(name = "NumberOfWheels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfWheels;
    @XmlElement(name = "MinimumAge")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumAge;
    @XmlElement(name = "Portable")
    protected Boolean portable;
    protected AcceptedDriverPermitsRelStructure acceptedDriverPermits;

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Ruft den Wert der firstAxleHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstAxleHeight() {
        return firstAxleHeight;
    }

    /**
     * Legt den Wert der firstAxleHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstAxleHeight(BigDecimal value) {
        this.firstAxleHeight = value;
    }

    /**
     * Ruft den Wert der licenceRequirements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LicenceRequirementsEnumeration }
     *     
     */
    public LicenceRequirementsEnumeration getLicenceRequirements() {
        return licenceRequirements;
    }

    /**
     * Legt den Wert der licenceRequirements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenceRequirementsEnumeration }
     *     
     */
    public void setLicenceRequirements(LicenceRequirementsEnumeration value) {
        this.licenceRequirements = value;
    }

    /**
     * Ruft den Wert der vehicleCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleCategory() {
        return vehicleCategory;
    }

    /**
     * Legt den Wert der vehicleCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleCategory(String value) {
        this.vehicleCategory = value;
    }

    /**
     * Ruft den Wert der numberOfWheels-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfWheels() {
        return numberOfWheels;
    }

    /**
     * Legt den Wert der numberOfWheels-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfWheels(BigInteger value) {
        this.numberOfWheels = value;
    }

    /**
     * Ruft den Wert der minimumAge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumAge() {
        return minimumAge;
    }

    /**
     * Legt den Wert der minimumAge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumAge(BigInteger value) {
        this.minimumAge = value;
    }

    /**
     * Ruft den Wert der portable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPortable() {
        return portable;
    }

    /**
     * Legt den Wert der portable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPortable(Boolean value) {
        this.portable = value;
    }

    /**
     * Ruft den Wert der acceptedDriverPermits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedDriverPermitsRelStructure }
     *     
     */
    public AcceptedDriverPermitsRelStructure getAcceptedDriverPermits() {
        return acceptedDriverPermits;
    }

    /**
     * Legt den Wert der acceptedDriverPermits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedDriverPermitsRelStructure }
     *     
     */
    public void setAcceptedDriverPermits(AcceptedDriverPermitsRelStructure value) {
        this.acceptedDriverPermits = value;
    }

}
