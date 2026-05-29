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
 * Type for COMMERCIAL PROFILE ELIGIBILITY.
 * 
 * <p>Java-Klasse f�r CommercialProfileEligibility_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CommercialProfileEligibility_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}CustomerEligibility_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CommercialProfileEligibilityGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialProfileEligibility_VersionedChildStructure", propOrder = {
    "commercialProfileRef"
})
@XmlSeeAlso({
    CommercialProfileEligibility.class
})
public class CommercialProfileEligibilityVersionedChildStructure
    extends CustomerEligibilityVersionedChildStructure
{

    @XmlElement(name = "CommercialProfileRef")
    protected CommercialProfileRefStructure commercialProfileRef;

    /**
     * Ruft den Wert der commercialProfileRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommercialProfileRefStructure }
     *     
     */
    public CommercialProfileRefStructure getCommercialProfileRef() {
        return commercialProfileRef;
    }

    /**
     * Legt den Wert der commercialProfileRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialProfileRefStructure }
     *     
     */
    public void setCommercialProfileRef(CommercialProfileRefStructure value) {
        this.commercialProfileRef = value;
    }

}
