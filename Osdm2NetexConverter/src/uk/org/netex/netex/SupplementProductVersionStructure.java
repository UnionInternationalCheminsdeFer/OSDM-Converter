//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for PREASSIGNED FARE PRODUCT.
 * 
 * <p>Java-Klasse f�r SupplementProduct_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SupplementProduct_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PreassignedFareProduct_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SupplementProductGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementProduct_VersionStructure", propOrder = {
    "supplementProductType",
    "supplementToFareProductRef",
    "supplementTo"
})
@XmlSeeAlso({
    SupplementProduct.class
})
public class SupplementProductVersionStructure
    extends PreassignedFareProductVersionStructure
{

    @XmlElement(name = "SupplementProductType")
    @XmlSchemaType(name = "normalizedString")
    protected SupplementProductEnumeration supplementProductType;
    @XmlElement(name = "SupplementToFareProductRef")
    protected FareProductRefStructure supplementToFareProductRef;
    protected FareProductRefsRelStructure supplementTo;

    /**
     * Ruft den Wert der supplementProductType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SupplementProductEnumeration }
     *     
     */
    public SupplementProductEnumeration getSupplementProductType() {
        return supplementProductType;
    }

    /**
     * Legt den Wert der supplementProductType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementProductEnumeration }
     *     
     */
    public void setSupplementProductType(SupplementProductEnumeration value) {
        this.supplementProductType = value;
    }

    /**
     * Ruft den Wert der supplementToFareProductRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareProductRefStructure }
     *     
     */
    public FareProductRefStructure getSupplementToFareProductRef() {
        return supplementToFareProductRef;
    }

    /**
     * Legt den Wert der supplementToFareProductRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareProductRefStructure }
     *     
     */
    public void setSupplementToFareProductRef(FareProductRefStructure value) {
        this.supplementToFareProductRef = value;
    }

    /**
     * Ruft den Wert der supplementTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareProductRefsRelStructure }
     *     
     */
    public FareProductRefsRelStructure getSupplementTo() {
        return supplementTo;
    }

    /**
     * Legt den Wert der supplementTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareProductRefsRelStructure }
     *     
     */
    public void setSupplementTo(FareProductRefsRelStructure value) {
        this.supplementTo = value;
    }

}
