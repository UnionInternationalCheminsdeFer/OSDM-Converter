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
 * Type for SALES DISCOUNT RIGHT.
 * 
 * <p>Java-Klasse f�r SaleDiscountRight_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SaleDiscountRight_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FareProduct_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SaleDiscountRightGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleDiscountRight_VersionStructure", propOrder = {
    "productType",
    "generalGroupOfEntitiesRef",
    "generalGroupOfEntities"
})
@XmlSeeAlso({
    SaleDiscountRight.class,
    CappedDiscountRightVersionStructure.class
})
public class SaleDiscountRightVersionStructure
    extends FareProductVersionStructure
{

    @XmlElement(name = "ProductType")
    @XmlSchemaType(name = "normalizedString")
    protected SaleDiscountRightEnumeration productType;
    @XmlElement(name = "GeneralGroupOfEntitiesRef")
    protected GeneralGroupOfEntitiesRefStructure generalGroupOfEntitiesRef;
    @XmlElement(name = "GeneralGroupOfEntities")
    protected GeneralGroupOfEntities generalGroupOfEntities;

    /**
     * Ruft den Wert der productType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SaleDiscountRightEnumeration }
     *     
     */
    public SaleDiscountRightEnumeration getProductType() {
        return productType;
    }

    /**
     * Legt den Wert der productType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleDiscountRightEnumeration }
     *     
     */
    public void setProductType(SaleDiscountRightEnumeration value) {
        this.productType = value;
    }

    /**
     * Ruft den Wert der generalGroupOfEntitiesRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeneralGroupOfEntitiesRefStructure }
     *     
     */
    public GeneralGroupOfEntitiesRefStructure getGeneralGroupOfEntitiesRef() {
        return generalGroupOfEntitiesRef;
    }

    /**
     * Legt den Wert der generalGroupOfEntitiesRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralGroupOfEntitiesRefStructure }
     *     
     */
    public void setGeneralGroupOfEntitiesRef(GeneralGroupOfEntitiesRefStructure value) {
        this.generalGroupOfEntitiesRef = value;
    }

    /**
     * Ruft den Wert der generalGroupOfEntities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeneralGroupOfEntities }
     *     
     */
    public GeneralGroupOfEntities getGeneralGroupOfEntities() {
        return generalGroupOfEntities;
    }

    /**
     * Legt den Wert der generalGroupOfEntities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralGroupOfEntities }
     *     
     */
    public void setGeneralGroupOfEntities(GeneralGroupOfEntities value) {
        this.generalGroupOfEntities = value;
    }

}
