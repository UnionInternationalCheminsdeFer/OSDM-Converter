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
import javax.xml.datatype.Duration;


/**
 * Type for SALES OFFER PACKAGE ENTITLEMENT REQUIRED.
 * 
 * <p>Java-Klasse f�r SalesOfferPackageEntitlementRequired_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SalesOfferPackageEntitlementRequired_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SalesOfferPackageEntitlementRequiredGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOfferPackageEntitlementRequired_VersionStructure", propOrder = {
    "salesOfferPackageRef",
    "minimumQualificationPeriod",
    "entitlementConstraint"
})
@XmlSeeAlso({
    SalesOfferPackageEntitlementRequired.class
})
public class SalesOfferPackageEntitlementRequiredVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "SalesOfferPackageRef")
    protected SalesOfferPackageRefStructure salesOfferPackageRef;
    @XmlElement(name = "MinimumQualificationPeriod")
    protected Duration minimumQualificationPeriod;
    @XmlElement(name = "EntitlementConstraint")
    protected EntitlementConstraintStructure entitlementConstraint;

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
     * Ruft den Wert der minimumQualificationPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumQualificationPeriod() {
        return minimumQualificationPeriod;
    }

    /**
     * Legt den Wert der minimumQualificationPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumQualificationPeriod(Duration value) {
        this.minimumQualificationPeriod = value;
    }

    /**
     * Ruft den Wert der entitlementConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementConstraintStructure }
     *     
     */
    public EntitlementConstraintStructure getEntitlementConstraint() {
        return entitlementConstraint;
    }

    /**
     * Legt den Wert der entitlementConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementConstraintStructure }
     *     
     */
    public void setEntitlementConstraint(EntitlementConstraintStructure value) {
        this.entitlementConstraint = value;
    }

}
