//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for ENTITLEMENT GIVEN.
 * 
 * <p>Java-Klasse f�r EntitlementGiven_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EntitlementGiven_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}EntitlementGivenGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementGiven_VersionStructure", propOrder = {
    "serviceAccessRightRef",
    "minimumQualificationPeriod",
    "entitlementConstraint",
    "entitlementType"
})
@XmlSeeAlso({
    EntitlementGiven.class
})
public class EntitlementGivenVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElementRef(name = "ServiceAccessRightRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends ServiceAccessRightRefStructure> serviceAccessRightRef;
    @XmlElement(name = "MinimumQualificationPeriod")
    protected Duration minimumQualificationPeriod;
    @XmlElement(name = "EntitlementConstraint")
    protected EntitlementConstraintStructure entitlementConstraint;
    @XmlElement(name = "EntitlementType")
    @XmlSchemaType(name = "normalizedString")
    protected EntitlementTypeEnumeration entitlementType;

    /**
     * Ruft den Wert der serviceAccessRightRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ThirdPartyProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreassignedFareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SaleDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappedDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AmountOfPriceUnitProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SupplementProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceAccessRightRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ServiceAccessRightRefStructure> getServiceAccessRightRef() {
        return serviceAccessRightRef;
    }

    /**
     * Legt den Wert der serviceAccessRightRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ThirdPartyProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreassignedFareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SaleDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappedDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AmountOfPriceUnitProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SupplementProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceAccessRightRefStructure }{@code >}
     *     
     */
    public void setServiceAccessRightRef(JAXBElement<? extends ServiceAccessRightRefStructure> value) {
        this.serviceAccessRightRef = value;
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

    /**
     * Ruft den Wert der entitlementType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementTypeEnumeration }
     *     
     */
    public EntitlementTypeEnumeration getEntitlementType() {
        return entitlementType;
    }

    /**
     * Legt den Wert der entitlementType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementTypeEnumeration }
     *     
     */
    public void setEntitlementType(EntitlementTypeEnumeration value) {
        this.entitlementType = value;
    }

}
