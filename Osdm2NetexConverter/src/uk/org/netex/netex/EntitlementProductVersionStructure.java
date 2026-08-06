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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for ENTITLEMENT PRODUCT.
 * 
 * <p>Java-Klasse f�r EntitlementProduct_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EntitlementProduct_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ServiceAccessRight_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}EntitlementProductGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementProduct_VersionStructure", propOrder = {
    "generalOrganisationRef",
    "prices"
})
@XmlSeeAlso({
    EntitlementProduct.class
})
public class EntitlementProductVersionStructure
    extends ServiceAccessRightVersionStructure
{

    @XmlElement(name = "GeneralOrganisationRef")
    protected GeneralOrganisationRefStructure generalOrganisationRef;
    protected FareProductPricesRelStructure prices;

    /**
     * Ruft den Wert der generalOrganisationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeneralOrganisationRefStructure }
     *     
     */
    public GeneralOrganisationRefStructure getGeneralOrganisationRef() {
        return generalOrganisationRef;
    }

    /**
     * Legt den Wert der generalOrganisationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralOrganisationRefStructure }
     *     
     */
    public void setGeneralOrganisationRef(GeneralOrganisationRefStructure value) {
        this.generalOrganisationRef = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareProductPricesRelStructure }
     *     
     */
    public FareProductPricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareProductPricesRelStructure }
     *     
     */
    public void setPrices(FareProductPricesRelStructure value) {
        this.prices = value;
    }

}
