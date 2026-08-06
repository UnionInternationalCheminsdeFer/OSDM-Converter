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
 * Type for a SALES OFFER PACKAGE PRICEs.
 * 
 * <p>Java-Klasse f�r SalesOfferPackagePrice_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SalesOfferPackagePrice_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FarePrice_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SalesOfferPackagePriceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOfferPackagePrice_VersionedChildStructure", propOrder = {
    "salesOfferPackageRef",
    "salesOfferPackageElementRef"
})
@XmlSeeAlso({
    SalesOfferPackagePrice.class
})
public class SalesOfferPackagePriceVersionedChildStructure
    extends FarePriceVersionedChildStructure
{

    @XmlElement(name = "SalesOfferPackageRef")
    protected SalesOfferPackageRefStructure salesOfferPackageRef;
    @XmlElement(name = "SalesOfferPackageElementRef")
    protected SalesOfferPackageElementRefStructure salesOfferPackageElementRef;

    /**
     * Ruft den Wert der salesOfferPackageRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackageRefStructure }
     *     
     */
    public SalesOfferPackageRefStructure getSalesOfferPackageRef() {
        return salesOfferPackageRef;
    }

    /**
     * Legt den Wert der salesOfferPackageRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackageRefStructure }
     *     
     */
    public void setSalesOfferPackageRef(SalesOfferPackageRefStructure value) {
        this.salesOfferPackageRef = value;
    }

    /**
     * Ruft den Wert der salesOfferPackageElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackageElementRefStructure }
     *     
     */
    public SalesOfferPackageElementRefStructure getSalesOfferPackageElementRef() {
        return salesOfferPackageElementRef;
    }

    /**
     * Legt den Wert der salesOfferPackageElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackageElementRefStructure }
     *     
     */
    public void setSalesOfferPackageElementRef(SalesOfferPackageElementRefStructure value) {
        this.salesOfferPackageElementRef = value;
    }

}
