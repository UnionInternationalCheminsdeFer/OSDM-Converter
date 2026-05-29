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


/**
 * Type for ADDITIONAL DRIVER OPTION.
 * 
 * <p>Java-Klasse f�r AdditionalDriverOption_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AdditionalDriverOption_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}RentalOption_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}AdditionalDriverOptionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalDriverOption_VersionStructure", propOrder = {
    "additionalDriver",
    "driverFeeBasis",
    "numberOFDrivers"
})
@XmlSeeAlso({
    AdditionalDriverOption.class
})
public class AdditionalDriverOptionVersionStructure
    extends RentalOptionVersionStructure
{

    @XmlElement(name = "AdditionalDriver", defaultValue = "none")
    @XmlSchemaType(name = "normalizedString")
    protected AdditionalDriverTypeEnumeration additionalDriver;
    @XmlElement(name = "DriverFeeBasis", defaultValue = "perAddtionalDriver")
    @XmlSchemaType(name = "normalizedString")
    protected DriverTypeFeeBasisEnumeration driverFeeBasis;
    @XmlElement(name = "NumberOFDrivers")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOFDrivers;

    /**
     * Ruft den Wert der additionalDriver-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDriverTypeEnumeration }
     *     
     */
    public AdditionalDriverTypeEnumeration getAdditionalDriver() {
        return additionalDriver;
    }

    /**
     * Legt den Wert der additionalDriver-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDriverTypeEnumeration }
     *     
     */
    public void setAdditionalDriver(AdditionalDriverTypeEnumeration value) {
        this.additionalDriver = value;
    }

    /**
     * Ruft den Wert der driverFeeBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DriverTypeFeeBasisEnumeration }
     *     
     */
    public DriverTypeFeeBasisEnumeration getDriverFeeBasis() {
        return driverFeeBasis;
    }

    /**
     * Legt den Wert der driverFeeBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverTypeFeeBasisEnumeration }
     *     
     */
    public void setDriverFeeBasis(DriverTypeFeeBasisEnumeration value) {
        this.driverFeeBasis = value;
    }

    /**
     * Ruft den Wert der numberOFDrivers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOFDrivers() {
        return numberOFDrivers;
    }

    /**
     * Legt den Wert der numberOFDrivers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOFDrivers(BigInteger value) {
        this.numberOFDrivers = value;
    }

}
