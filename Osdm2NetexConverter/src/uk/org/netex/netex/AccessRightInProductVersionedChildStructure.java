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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for ACCESS RIGHT IN PRODUCT.
 * 
 * <p>Java-Klasse f�r AccessRightInProduct_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AccessRightInProduct_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FareElementInSequence_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}AccessRightInProductGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessRightInProduct_VersionedChildStructure", propOrder = {
    "validableElementRef",
    "preassignedFareProductRef"
})
@XmlSeeAlso({
    AccessRightInProduct.class
})
public class AccessRightInProductVersionedChildStructure
    extends FareElementInSequenceVersionedChildStructure
{

    @XmlElement(name = "ValidableElementRef")
    protected ValidableElementRefStructure validableElementRef;
    @XmlElementRef(name = "PreassignedFareProductRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PreassignedFareProductRefStructure> preassignedFareProductRef;

    /**
     * Ruft den Wert der validableElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidableElementRefStructure }
     *     
     */
    public ValidableElementRefStructure getValidableElementRef() {
        return validableElementRef;
    }

    /**
     * Legt den Wert der validableElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidableElementRefStructure }
     *     
     */
    public void setValidableElementRef(ValidableElementRefStructure value) {
        this.validableElementRef = value;
    }

    /**
     * Ruft den Wert der preassignedFareProductRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PreassignedFareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SupplementProductRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends PreassignedFareProductRefStructure> getPreassignedFareProductRef() {
        return preassignedFareProductRef;
    }

    /**
     * Legt den Wert der preassignedFareProductRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PreassignedFareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SupplementProductRefStructure }{@code >}
     *     
     */
    public void setPreassignedFareProductRef(JAXBElement<? extends PreassignedFareProductRefStructure> value) {
        this.preassignedFareProductRef = value;
    }

}
