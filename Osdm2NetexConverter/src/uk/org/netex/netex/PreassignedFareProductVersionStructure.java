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
 * <p>Java-Klasse f�r PreassignedFareProduct_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PreassignedFareProduct_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FareProduct_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PreassignedFareProductGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreassignedFareProduct_VersionStructure", propOrder = {
    "productType"
})
@XmlSeeAlso({
    PreassignedFareProduct.class,
    SupplementProductVersionStructure.class
})
public class PreassignedFareProductVersionStructure
    extends FareProductVersionStructure
{

    @XmlElement(name = "ProductType")
    @XmlSchemaType(name = "normalizedString")
    protected PreassignedFareProductEnumeration productType;

    /**
     * Ruft den Wert der productType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PreassignedFareProductEnumeration }
     *     
     */
    public PreassignedFareProductEnumeration getProductType() {
        return productType;
    }

    /**
     * Legt den Wert der productType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PreassignedFareProductEnumeration }
     *     
     */
    public void setProductType(PreassignedFareProductEnumeration value) {
        this.productType = value;
    }

}
