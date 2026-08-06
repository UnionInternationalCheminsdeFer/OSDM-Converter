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
 * Type for CUSTOMER ELIGIBILITY.
 * 
 * <p>Java-Klasse f�r CustomerEligibility_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CustomerEligibility_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CustomerEligibilityGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerEligibility_VersionedChildStructure", propOrder = {
    "name",
    "customerRef"
})
@XmlSeeAlso({
    CustomerEligibility.class,
    ResidentialQualificationEligibilityVersionedChildStructure.class,
    CommercialProfileEligibilityVersionedChildStructure.class,
    UserProfileEligibilityVersionedChildStructure.class
})
public abstract class CustomerEligibilityVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "CustomerRef")
    protected CustomerRefStructure customerRef;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der customerRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRefStructure }
     *     
     */
    public CustomerRefStructure getCustomerRef() {
        return customerRef;
    }

    /**
     * Legt den Wert der customerRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRefStructure }
     *     
     */
    public void setCustomerRef(CustomerRefStructure value) {
        this.customerRef = value;
    }

}
