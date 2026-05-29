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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for SUITABILITY.
 * 
 * <p>Java-Klasse f�r Suitability_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Suitability_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UserNeed_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;element name="Suitable" type="{http://www.netex.org.uk/netex}SuitableEnumeration"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Suitability_VersionedChildStructure", propOrder = {
    "suitable"
})
@XmlSeeAlso({
    Suitability.class
})
public class SuitabilityVersionedChildStructure
    extends UserNeedVersionedChildStructure
{

    @XmlElement(name = "Suitable", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected SuitableEnumeration suitable;

    /**
     * Ruft den Wert der suitable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SuitableEnumeration }
     *     
     */
    public SuitableEnumeration getSuitable() {
        return suitable;
    }

    /**
     * Legt den Wert der suitable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SuitableEnumeration }
     *     
     */
    public void setSuitable(SuitableEnumeration value) {
        this.suitable = value;
    }

}
