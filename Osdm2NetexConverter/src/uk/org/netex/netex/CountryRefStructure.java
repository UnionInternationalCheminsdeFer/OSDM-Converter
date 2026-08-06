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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Type for a reference to a Country Identifier.
 * 
 * <p>Java-Klasse f�r CountryRefStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CountryRefStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.netex.org.uk/netex>CountryPrincipalityCodeType">
 *       &lt;attribute name="ref" type="{http://www.netex.org.uk/netex}CountryCodeType" />
 *       &lt;attribute name="refPrincipality" type="{http://www.netex.org.uk/netex}CountryPrincipalityCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryRefStructure", propOrder = {
    "value"
})
@XmlSeeAlso({
    CountryRef.class
})
public class CountryRefStructure {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ref")
    protected IanaCountryTldEnumeration ref;
    @XmlAttribute(name = "refPrincipality")
    protected String refPrincipality;

    /**
     * Type for Country Identifier. ISO 3166-2 (3 character ISo code). +v1.1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der ref-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IanaCountryTldEnumeration }
     *     
     */
    public IanaCountryTldEnumeration getRef() {
        return ref;
    }

    /**
     * Legt den Wert der ref-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IanaCountryTldEnumeration }
     *     
     */
    public void setRef(IanaCountryTldEnumeration value) {
        this.ref = value;
    }

    /**
     * Ruft den Wert der refPrincipality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefPrincipality() {
        return refPrincipality;
    }

    /**
     * Legt den Wert der refPrincipality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefPrincipality(String value) {
        this.refPrincipality = value;
    }

}
