//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a COUNTRY.
 * 
 * <p>Java-Klasse f�r Country_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Country_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Place_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CountryGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="principality" type="{http://www.netex.org.uk/netex}CountryPrincipalityCodeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Country_VersionStructure", propOrder = {
    "uicCode",
    "alternativeNames"
})
@XmlSeeAlso({
    Country.class
})
public class CountryVersionStructure
    extends PlaceVersionStructure
{

    @XmlElement(name = "UicCode")
    protected PrivateCodeStructure uicCode;
    protected AlternativeNamesRelStructure alternativeNames;
    @XmlAttribute(name = "principality")
    protected String principality;

    /**
     * Ruft den Wert der uicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getUicCode() {
        return uicCode;
    }

    /**
     * Legt den Wert der uicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setUicCode(PrivateCodeStructure value) {
        this.uicCode = value;
    }

    /**
     * Ruft den Wert der alternativeNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public AlternativeNamesRelStructure getAlternativeNames() {
        return alternativeNames;
    }

    /**
     * Legt den Wert der alternativeNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public void setAlternativeNames(AlternativeNamesRelStructure value) {
        this.alternativeNames = value;
    }

    /**
     * Ruft den Wert der principality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipality() {
        return principality;
    }

    /**
     * Legt den Wert der principality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipality(String value) {
        this.principality = value;
    }

}
