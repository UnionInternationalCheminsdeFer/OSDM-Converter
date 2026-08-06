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
 * Type for TYPE OF PRICING RULE.
 * 
 * <p>Java-Klasse f�r TypeOfPricingRule_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TypeOfPricingRule_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TypeOfValue_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}TypeOfPricingRuleGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeOfPricingRule_VersionStructure", propOrder = {
    "taxCategory"
})
@XmlSeeAlso({
    TypeOfPricingRule.class
})
public class TypeOfPricingRuleVersionStructure
    extends TypeOfValueVersionStructure
{

    @XmlElement(name = "TaxCategory")
    @XmlSchemaType(name = "normalizedString")
    protected TaxCategoryEnumeration taxCategory;

    /**
     * Ruft den Wert der taxCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaxCategoryEnumeration }
     *     
     */
    public TaxCategoryEnumeration getTaxCategory() {
        return taxCategory;
    }

    /**
     * Legt den Wert der taxCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCategoryEnumeration }
     *     
     */
    public void setTaxCategory(TaxCategoryEnumeration value) {
        this.taxCategory = value;
    }

}
