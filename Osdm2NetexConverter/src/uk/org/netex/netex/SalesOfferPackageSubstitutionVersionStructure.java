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
 * Type for SALES OFFER PACKAGE SUBSTITUTION.
 * 
 * <p>Java-Klasse f�r SalesOfferPackageSubstitution_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SalesOfferPackageSubstitution_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SalesOfferPackageSubstitutionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOfferPackageSubstitution_VersionStructure", propOrder = {
    "salesOfferPackageRef",
    "withSalesOfferPackageRef"
})
@XmlSeeAlso({
    SalesOfferPackageSubstitution.class
})
public class SalesOfferPackageSubstitutionVersionStructure
    extends AssignmentVersionStructure
{

    @XmlElement(name = "SalesOfferPackageRef")
    protected SalesOfferPackageRefStructure salesOfferPackageRef;
    @XmlElement(name = "WithSalesOfferPackageRef", required = true)
    protected SalesOfferPackageRefStructure withSalesOfferPackageRef;

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
     * Ruft den Wert der withSalesOfferPackageRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackageRefStructure }
     *     
     */
    public SalesOfferPackageRefStructure getWithSalesOfferPackageRef() {
        return withSalesOfferPackageRef;
    }

    /**
     * Legt den Wert der withSalesOfferPackageRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackageRefStructure }
     *     
     */
    public void setWithSalesOfferPackageRef(SalesOfferPackageRefStructure value) {
        this.withSalesOfferPackageRef = value;
    }

}
