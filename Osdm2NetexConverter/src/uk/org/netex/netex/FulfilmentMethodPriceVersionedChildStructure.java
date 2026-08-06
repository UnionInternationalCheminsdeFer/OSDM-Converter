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
 * Type for a FULFILMENT METHOD PRICE.
 * 
 * <p>Java-Klasse f�r FulfilmentMethodPrice_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FulfilmentMethodPrice_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FarePrice_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FulfilmentMethodPriceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfilmentMethodPrice_VersionedChildStructure", propOrder = {
    "fulfilmentMethodRef"
})
@XmlSeeAlso({
    FulfilmentMethodPrice.class
})
public class FulfilmentMethodPriceVersionedChildStructure
    extends FarePriceVersionedChildStructure
{

    @XmlElement(name = "FulfilmentMethodRef")
    protected FulfilmentMethodRefStructure fulfilmentMethodRef;

    /**
     * Ruft den Wert der fulfilmentMethodRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FulfilmentMethodRefStructure }
     *     
     */
    public FulfilmentMethodRefStructure getFulfilmentMethodRef() {
        return fulfilmentMethodRef;
    }

    /**
     * Legt den Wert der fulfilmentMethodRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfilmentMethodRefStructure }
     *     
     */
    public void setFulfilmentMethodRef(FulfilmentMethodRefStructure value) {
        this.fulfilmentMethodRef = value;
    }

}
