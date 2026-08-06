//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for AMOUNT OF PRICE UNIT PRODUCT.
 * 
 * <p>Java-Klasse f�r AmountOfPriceUnitProduct_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AmountOfPriceUnitProduct_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FareProduct_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}AmountOfPriceUnitProductGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountOfPriceUnitProduct_VersionStructure", propOrder = {
    "productType",
    "priceUnitRef",
    "amount"
})
@XmlSeeAlso({
    AmountOfPriceUnitProduct.class
})
public class AmountOfPriceUnitProductVersionStructure
    extends FareProductVersionStructure
{

    @XmlElement(name = "ProductType")
    @XmlSchemaType(name = "normalizedString")
    protected AmountOfPriceUnitEnumeration productType;
    @XmlElement(name = "PriceUnitRef")
    protected PriceUnitRefStructure priceUnitRef;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;

    /**
     * Ruft den Wert der productType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AmountOfPriceUnitEnumeration }
     *     
     */
    public AmountOfPriceUnitEnumeration getProductType() {
        return productType;
    }

    /**
     * Legt den Wert der productType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOfPriceUnitEnumeration }
     *     
     */
    public void setProductType(AmountOfPriceUnitEnumeration value) {
        this.productType = value;
    }

    /**
     * Ruft den Wert der priceUnitRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceUnitRefStructure }
     *     
     */
    public PriceUnitRefStructure getPriceUnitRef() {
        return priceUnitRef;
    }

    /**
     * Legt den Wert der priceUnitRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceUnitRefStructure }
     *     
     */
    public void setPriceUnitRef(PriceUnitRefStructure value) {
        this.priceUnitRef = value;
    }

    /**
     * Ruft den Wert der amount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Legt den Wert der amount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

}
