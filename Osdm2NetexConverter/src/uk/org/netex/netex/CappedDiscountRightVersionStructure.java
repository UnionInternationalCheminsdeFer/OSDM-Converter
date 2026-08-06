//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for CAPPED DISCOUNT RIGHT.
 * 
 * <p>Java-Klasse f�r CappedDiscountRight_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CappedDiscountRight_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SaleDiscountRight_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CappedDiscountRightGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CappedDiscountRight_VersionStructure", propOrder = {
    "cappingRules"
})
@XmlSeeAlso({
    CappedDiscountRight.class
})
public class CappedDiscountRightVersionStructure
    extends SaleDiscountRightVersionStructure
{

    protected CappingRulesRelStructure cappingRules;

    /**
     * Ruft den Wert der cappingRules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CappingRulesRelStructure }
     *     
     */
    public CappingRulesRelStructure getCappingRules() {
        return cappingRules;
    }

    /**
     * Legt den Wert der cappingRules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CappingRulesRelStructure }
     *     
     */
    public void setCappingRules(CappingRulesRelStructure value) {
        this.cappingRules = value;
    }

}
